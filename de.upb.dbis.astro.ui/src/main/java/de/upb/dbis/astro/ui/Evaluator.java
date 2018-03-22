package de.upb.dbis.astro.ui;


import java.io.File;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedHashMap;

import org.apache.jena.ontology.DatatypeProperty;
import org.apache.jena.ontology.OntModel;
import org.apache.jena.ontology.OntModelSpec;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.rdf.model.Resource;
import org.apache.jena.vocabulary.RDFS;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.TreeItem;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.swt.widgets.Button;

import de.upb.dbis.astro.ReferenceAlignment;
import de.upb.dbis.astro.alignment.mysql.MySQLAlignmentLoader;
import de.upb.dbis.astro.alignment.mysql.SQLConnection;
import de.upb.dbis.astro.Alignment;
import de.upb.dbis.astro.NameProvider;
import de.upb.dbis.astro.OWLS;
import de.upb.dbis.astro.OWLS_EXT;
import de.upb.dbis.astro.OWLUtil;
import de.upb.dbis.astro.Triple;
import de.upb.dbis.astro.ui.HTMLRenderer;
import de.upb.dbis.astro.QueryDelegator;


public class Evaluator {

	protected Shell shell;
	
	/**
	 * Shows retrieved schema.org triples.
	 */
	private Table search_results;

	
	/**
	 * Browser service offers (*.owls)
	 */
	private Tree serviceBrowser;
	
	/**
	 * Shows properties of the selected concept.
	 */
	private Browser browser;
	
	/**
	 * Domain ontology (.owl) of selected service offer.
	 */
	private OntModel domain;
	
	/**
	 * Current service offer (.owls)
	 */
	private OntModel offer;
	
	/**
	 * Global ontology used for normalization of service offer.
	 */
	private OntModel schemaorg;
	
	/**
	 * 
	 */
	private LinkedHashMap<String, String> descriptions;
	
	/**
	 * Actual alignment produced by ASTRO.
	 */
	private Alignment actualAlignment;
	
	/**
	 * Reference alignment if available.
	 */
	private ReferenceAlignment referenceAlignment;
	
	private String schemaorgFile;
	private String workingDirectory;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			
			Evaluator window = new Evaluator();
			if(args.length==2) {
				
				//dir.exists();
				//dir.canRead();
				//dir.isDirectory();
				//TODO validation
				window.workingDirectory = args[0];
				window.schemaorgFile = args[1];
				
				window.open();
			}
			else {
				System.out.println("Usage: <workingDirectory> <path_to_schemaorg>");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setSize(665, 353);
		shell.setText("ASTRO");
		shell.setLayout(new GridLayout(1, false));
		
		TabFolder tabFolder = new TabFolder(shell, SWT.NONE);
		tabFolder.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		tabFolder.setBounds(0, 0, 121, 43);
		
		TabItem tbtmNewItem = new TabItem(tabFolder, SWT.NONE);
		tbtmNewItem.setText("Mappings");
		
		Composite composite = new Composite(tabFolder, SWT.NONE);
		tbtmNewItem.setControl(composite);
		composite.setLayout(new GridLayout(3, false));
		
		serviceBrowser = new Tree(composite, SWT.BORDER);
		GridData gd_serviceBrowser = new GridData(SWT.FILL, SWT.FILL, false, true, 1, 1);
		gd_serviceBrowser.widthHint = 200;
		serviceBrowser.setLayoutData(gd_serviceBrowser);
		
		serviceBrowser.addListener(SWT.Selection, new Listener() {

			@Override
			public void handleEvent(Event event) {
				TreeItem[] selection = serviceBrowser.getSelection();
				
				if(selection.length>0){
					
					TreeItem selectedItem = selection[0];
					
					if(selectedItem.getData("filename")!=null){
						String filename = selection[0].getData("filename").toString();
						String id = selection[0].getData("id").toString();
						
						String absolutePath = workingDirectory+"/htdocs/services/"+filename;
						File serviceFile = new File(workingDirectory+"/htdocs/services/"+filename);
						File ontologyFile = new File(absolutePath.replace("services","ontology").replace(".owls",".owl"));
						
						
						loadSpecification(id, serviceFile, ontologyFile);						
					}
					else if(selectedItem.getData("input")!=null){
						Resource r = offer.getResource(selectedItem.getData("input").toString());
						loadRankedList(r);
					}
					else if(selectedItem.getData("property")!=null){
						Resource r = domain.getResource(selectedItem.getData("property").toString());
						loadRankedList(r);
					}
				}
			}
	      });
		
		TreeItem trtmNewTreeitem = new TreeItem(serviceBrowser, SWT.NONE);
		trtmNewTreeitem.setText("New TreeItem");
		
		browser = new Browser(composite, SWT.NONE);
		browser.setText("<html><body>Please select an offer to start.</body></html>");
		GridData gd_browser = new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1);
		gd_browser.widthHint = 200;
		browser.setLayoutData(gd_browser);
		
		search_results = new Table(composite, SWT.BORDER | SWT.FULL_SELECTION);
		search_results.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		search_results.setHeaderVisible(true);
		search_results.setLinesVisible(true);
		
		TableColumn tblclmnNewColumn = new TableColumn(search_results, SWT.NONE);
		tblclmnNewColumn.setWidth(100);
		tblclmnNewColumn.setText("Subject");
		
		TableColumn tblclmnNewColumn_1 = new TableColumn(search_results, SWT.NONE);
		tblclmnNewColumn_1.setWidth(100);
		tblclmnNewColumn_1.setText("Predicate");
		
		TableColumn tblclmnNewColumn_2 = new TableColumn(search_results, SWT.NONE);
		tblclmnNewColumn_2.setWidth(100);
		tblclmnNewColumn_2.setText("Object");
		
		TableColumn tblclmnNewColumn_3 = new TableColumn(search_results, SWT.NONE);
		tblclmnNewColumn_3.setWidth(100);
		tblclmnNewColumn_3.setText("Score");
		new Label(composite, SWT.NONE);
		new Label(composite, SWT.NONE);
		
		Button btnSave = new Button(composite, SWT.NONE);
		btnSave.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		btnSave.setBounds(0, 0, 75, 25);
		btnSave.setText("Save");
		
		init();

	}
	
	private void init(){
		
		serviceBrowser.clearAll(true);
		
		schemaorg = ModelFactory.createOntologyModel(OntModelSpec.OWL_MEM, null);
		schemaorg.read(schemaorgFile);
		
		getOffers();
	}
	
	
	private void loadSpecification(String offerid, File serviceFile, File ontologyFile){
		descriptions = new LinkedHashMap<String, String>();
		
		offer = ModelFactory.createOntologyModel(OntModelSpec.OWL_MEM, null);
		offer.read(serviceFile.getAbsolutePath());
		
		domain = ModelFactory.createOntologyModel(OntModelSpec.OWL_MEM, null);
		domain.read(ontologyFile.getAbsolutePath());
		
		
		QueryDelegator matcher2 = new QueryDelegator();
		matcher2.init();
		matcher2.init(schemaorg);
		matcher2.init(offer, domain);
		
		//actualAlignment = matcher.match(offer, domain, schemaorg);
		actualAlignment = matcher2.align();
		
		try {
			referenceAlignment = MySQLAlignmentLoader.getReferenceAlignment(offerid, true, true, false, schemaorg);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		TreeItem[] selection = serviceBrowser.getSelection();
		TreeItem selectedItem=null;
		if(selection.length>0){
			
			selectedItem = selection[0];
			
		}

		if(selectedItem!=null && selectedItem.getItemCount()==0){
			TreeItem inputs = new TreeItem(selectedItem, SWT.NONE);
			inputs.setText("inputs");

			for(Resource p:OWLUtil.listInstances(offer, OWLS.INPUT)){
				TreeItem propertyItem = new TreeItem(inputs, SWT.NONE);
				propertyItem.setText(NameProvider.getLabel(p));
				propertyItem.setData("input", p.getURI());
			}

			
			TreeItem properties = new TreeItem(selectedItem, SWT.NONE);
			properties.setText("properties");
			
			for(DatatypeProperty p:OWLUtil.listDatatypeProperties(domain)){
				TreeItem propertyItem = new TreeItem(properties, SWT.NONE);
				propertyItem.setText(NameProvider.getLabel(p));
				propertyItem.setData("property", p.getURI());
			}
		}
		
	}
	
	
	private void loadRankedList(Resource r){
		
		descriptions.clear();
		search_results.removeAll();
		
		descriptions.put("Property Label:", NameProvider.getLabel(r));
		descriptions.put("Property Type:", OWLUtil.getLiteral(domain, r, RDFS.range));
		descriptions.put("Inferred Property Type:", OWLUtil.getLiteral(domain, r, OWLS_EXT.ACTUAL_TYPE));
		descriptions.put("JSON Path:", OWLUtil.getLiteral(domain, r, OWLS_EXT.JSONPATH));
		
		//descriptions.put("Service Name:", "namespace");//TODO
		descriptions.put("Service Description:", OWLUtil.getLiteral(offer, OWLS_EXT.SERVICE_DESCRIPTION));
		descriptions.put("Operation Name:", OWLUtil.getLiteral(offer, OWLS.SERVICE_NAME));
		descriptions.put("Operation Description:", OWLUtil.getLiteral(offer, OWLS.TEXT_DESCRIPTION));
		
		browser.setText(HTMLRenderer.render(descriptions).toString());
		
		Color green = new Color (Display.getCurrent(), 198, 239, 206);
		Color blue = new Color (Display.getCurrent(), 173, 197, 231);

		if(referenceAlignment.containsKey(r.getURI())&& referenceAlignment.get(r.getURI())!=null){
			
			Triple t = referenceAlignment.get(r.getURI());
			TableItem item = new TableItem(search_results, SWT.NULL);
			item.setText(0, NameProvider.getLabel(t.subject));
			item.setText(1, NameProvider.getLabel(t.predicate));
			item.setText(2, NameProvider.getLabel(t.object));
			item.setText(3, "?");
			item.setBackground(blue);
		}
		
		if(actualAlignment.containsKey(r.getURI())){
			
			for(double score: actualAlignment.get(r.getURI()).descendingKeySet()){
				
				for(Triple t: actualAlignment.get(r.getURI()).get(score).keySet()){
					
					TableItem item = new TableItem(search_results, SWT.NULL);
					item.setText(0, NameProvider.getLabel(t.subject));
					item.setText(1, NameProvider.getLabel(t.predicate));
					item.setText(2, NameProvider.getLabel(t.object));
					item.setText(3, score+"");
					
					if(referenceAlignment.containsKey(r.getURI()) && t.equals(referenceAlignment.get(r.getURI()))){
						item.setBackground(green);
					}
					
				}
				
			}
			
		}
		
	}
	
	private void getOffers(){
        java.sql.Statement statement;
		try {
			statement = SQLConnection.getConnection().createStatement();
			ResultSet resultSet = statement.executeQuery("SELECT id, namespace FROM offers");
			
			
			if(!resultSet.next()){
				File offerDirectory = new File(workingDirectory + "htdocs/services");
				
				PreparedStatement preparedStatement = SQLConnection.INSTANCE.prepareStatement("INSERT INTO offers (namespace) VALUES (?)");
				
				int i=0;
				int max = offerDirectory.listFiles().length;
				for(File offer : offerDirectory.listFiles()){
					
					if(offer.isFile() && offer.getName().endsWith(".owls")){
						String namespace = "http://127.0.0.1/services/"+offer.getName();
						
						
						
						preparedStatement.setString(1, namespace);
						
						preparedStatement.addBatch();
					}
					
					i++;
					if (i % 800 == 0 || i == max) {
						preparedStatement.executeBatch(); 
		            }
					
				}
			}

			//resultSet = statement.executeQuery("SELECT id, namespace FROM offers ORDER BY namespace");
			//resultSet = statement.executeQuery("SELECT id, namespace FROM offers ORDER BY RAND()");
			resultSet = statement.executeQuery("SELECT id, namespace FROM offers o WHERE EXISTS (SELECT lefturi FROM mappings m WHERE o.id=m.offerid) ORDER BY o.namespace");
			
			while(resultSet.next()){
				
				int id = resultSet.getInt("id");
				String namespace = resultSet.getString("namespace");
				String filename = namespace.replace("http://127.0.0.1/services/", "");
				
				TreeItem treeItem = new TreeItem(serviceBrowser, SWT.NONE);
				//treeItem.setData("offerid", id);
				treeItem.setData("filename", filename);
				treeItem.setData("id", id);
				treeItem.setText(filename);
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	

}
