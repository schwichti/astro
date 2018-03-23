import java.io.FileWriter
import java.util.HashSet
import java.util.UUID
import org.apache.jena.ontology.DatatypeProperty
import org.apache.jena.ontology.ObjectProperty
import org.apache.jena.ontology.OntClass
import org.apache.jena.ontology.OntModelSpec
import org.apache.jena.ontology.OntResource
import org.apache.jena.rdf.model.ModelFactory
import org.apache.jena.rdf.model.RDFNode
import org.apache.jena.rdf.model.Statement
import org.apache.jena.shared.JenaException
import org.apache.jena.vocabulary.RDFS
import org.apache.jena.vocabulary.OWL
import java.util.Set
import org.apache.jena.rdf.model.Resource

class VOWL {
	
	private Set<String> nodes = new HashSet<String>();
	
	public static def main(String[] args){
		
		
		if(args.size!=2){
			
			System.out.println(
			'''
			Error: Invalid arguments.
			Usage: <source_ontology_file> <target_graphml_file>''');
			System.exit(-1);
		}
		else{
			
			var source_ontology_file = args.get(0);
			var target_graphml_file = args.get(1);
			
			new VOWL().visualize(source_ontology_file, 
				target_graphml_file
			);
		}
		

	}
	
	
	protected def String getLabel(Resource r){
		
		
		if(r!=null && !r.anon){
			
			
			
			if(r.^as(OntResource)!==null && r.^as(OntResource).getLabel(null)!==null && !r.^as(OntResource).getLabel(null).equals("")){
				//TODO listStatements r, rdf:label, null
				 return r.^as(OntResource).getLabel(null);
			}
			else if(r.localName!==null){
				return r.localName;
			}
			else{
				return r.URI.substring(10)+"...";
			}
			
		}
	}
	
	protected def String addNode(Resource r){
		
		nodes.add(r.URI);
		
		return 
		'''
			<node id="«r.URI»">
			     <data key="d6">
			       <y:ShapeNode>
			         <y:Geometry height="70.0" width="70.0" x="164.29609940879118" y="170.0"/>
			         <y:Fill color="#AACCFF" transparent="false"/>
			         <y:BorderStyle color="#000000" raised="false" type="line" width="2.0"/>
			         <y:NodeLabel alignment="center" autoSizePolicy="content" fontFamily="Dialog" fontSize="12" fontStyle="plain" hasBackgroundColor="false" hasLineColor="false" height="18.701171875" horizontalTextPosition="center" iconTextGap="4" modelName="custom" textColor="#000000" verticalTextPosition="bottom" visible="true" width="42.009765625" x="13.9951171875" y="25.6494140625">«getLabel(r)»<y:LabelModel>
			             <y:SmartNodeLabelModel distance="4.0"/>
			           </y:LabelModel>
			           <y:ModelParameter>
			             <y:SmartNodeLabelModelParameter labelRatioX="0.0" labelRatioY="0.0" nodeRatioX="0.0" nodeRatioY="0.0" offsetX="0.0" offsetY="0.0" upX="0.0" upY="-1.0"/>
			           </y:ModelParameter>
			         </y:NodeLabel>
			         <y:Shape type="ellipse"/>
			       </y:ShapeNode>
			     </data>
			   </node>
		'''
	}
	
	
	public def void visualize(String ontologyfile, String graphmlfile){
		
		var usesThing = false;
		
		var ontoModel = ModelFactory.createOntologyModel(OntModelSpec.OWL_MEM, null);
	    
	    var classes = new HashSet<OntClass>();
	    var datatypeProperties = new HashSet<DatatypeProperty>();
	    var objectProperties = new HashSet<ObjectProperty>();
	    
	    nodes = new HashSet<String>();
	    
	    try 
	    {
//	        var in = FileManager.get().open(ontologyfile);
	        try 
	        {
//	            ontoModel.read(in, null);
	            ontoModel.read(ontologyfile);
	            classes = new HashSet<OntClass>(ontoModel.listClasses.toSet);
	            datatypeProperties = new HashSet<DatatypeProperty>(ontoModel.listDatatypeProperties.toSet);
	            objectProperties = new HashSet<ObjectProperty>(ontoModel.listObjectProperties.toSet);
				
	        } 
	        catch (Exception e) 
	        {
	            e.printStackTrace();
	        }
	    } 
	    catch (JenaException je) 
	    {
	        System.err.println("ERROR" + je.getMessage());
	        je.printStackTrace();
	        System.exit(0);
	    }
		
		
		var result = 
		'''
			<?xml version="1.0" encoding="UTF-8" standalone="no"?>
			<graphml xmlns="http://graphml.graphdrawing.org/xmlns" xmlns:java="http://www.yworks.com/xml/yfiles-common/1.0/java" xmlns:sys="http://www.yworks.com/xml/yfiles-common/markup/primitives/2.0" xmlns:x="http://www.yworks.com/xml/yfiles-common/markup/2.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:y="http://www.yworks.com/xml/graphml" xmlns:yed="http://www.yworks.com/xml/yed/3" xsi:schemaLocation="http://graphml.graphdrawing.org/xmlns http://www.yworks.com/xml/schema/graphml/1.1/ygraphml.xsd">
			  <!--Created for yEd 3.16.2.1-->
			  <key attr.name="Beschreibung" attr.type="string" for="graph" id="d0"/>
			  <key for="port" id="d1" yfiles.type="portgraphics"/>
			  <key for="port" id="d2" yfiles.type="portgeometry"/>
			  <key for="port" id="d3" yfiles.type="portuserdata"/>
			  <key attr.name="url" attr.type="string" for="node" id="d4"/>
			  <key attr.name="description" attr.type="string" for="node" id="d5"/>
			  <key for="node" id="d6" yfiles.type="nodegraphics"/>
			  <key for="graphml" id="d7" yfiles.type="resources"/>
			  <key attr.name="url" attr.type="string" for="edge" id="d8"/>
			  <key attr.name="description" attr.type="string" for="edge" id="d9"/>
			  <key for="edge" id="d10" yfiles.type="edgegraphics"/>
			  <graph edgedefault="directed" id="G">
			    <data key="d0"/>
			    «FOR Statement subclassStmt : ontoModel.listStatements(null, RDFS.subClassOf, null as RDFNode).toSet»
			    	«IF !subclassStmt.subject.anon && subclassStmt.subject.resource && !subclassStmt.object.anon && subclassStmt.object.resource»
			  		«IF !nodes.contains(subclassStmt.subject.URI)»
			  			«addNode(subclassStmt.subject)»
			  		«ENDIF»
			  		«IF !nodes.contains(subclassStmt.object.asResource.URI)»
			  			«addNode(subclassStmt.object.asResource)»
			  		«ENDIF»
			  		<edge id="«UUID.randomUUID().toString()»" source="«subclassStmt.subject.URI»" target="«subclassStmt.object.asResource.URI»">
			  			<data key="d9"/>
			  			<data key="d10">
			  				<y:PolyLineEdge>
			  				<y:Path sx="0.0" sy="0.0" tx="0.0" ty="0.0"/>
			  				<y:LineStyle color="#000000" type="dotted" width="1.0"/>
			  				<y:Arrows source="none" target="standard"/>
			  				<y:EdgeLabel alignment="center" configuration="AutoFlippingLabel" distance="2.0" fontFamily="Dialog" fontSize="12" fontStyle="plain" hasBackgroundColor="false" hasLineColor="false" height="18.701171875" horizontalTextPosition="center" iconTextGap="4" modelName="centered" modelPosition="center" preferredPlacement="anywhere" ratio="0.5" textColor="#000000" verticalTextPosition="bottom" visible="true" width="52.69140625" x="-4.95830144833667" y="56.844635009765625">Subclass<y:PreferredPlacementDescriptor angle="0.0" angleOffsetOnRightSide="0" angleReference="absolute" angleRotationOnRightSide="co" distance="-1.0" frozen="true" placement="anywhere" side="anywhere" sideReference="relative_to_edge_flow"/>
			  				</y:EdgeLabel>
			  				<y:BendStyle smoothed="false"/>
			  				</y:PolyLineEdge>
			  			</data>
			  		</edge>
			  		«ENDIF»
			  	«ENDFOR»
			  	«FOR ObjectProperty p: objectProperties»
			  		«var domains = ontoModel.listStatements(p, RDFS.domain, null as RDFNode).toSet.map[Statement s| s.object].toSet»
			  		<!--«if(domains.empty) {domains.add(OWL.Thing); usesThing=true }»-->
			  		«var ranges = ontoModel.listStatements(p, RDFS.range, null as RDFNode).toSet.map[Statement s| s.object].toSet»
			  		<!--«if(ranges.empty) {ranges.add(OWL.Thing); usesThing=true }»-->
			  		  	«FOR RDFNode domain : domains»
			  		  		«FOR RDFNode range : ranges»
			  		  			«IF !domain.anon && domain.resource && !range.anon && range.resource»
			  		  				«IF !nodes.contains(domain.asResource.URI)»
			  		  					«addNode(domain.asResource)»
			  		  				«ENDIF»
			  		  				«IF !nodes.contains(range.asResource.URI)»
			  		  					«addNode(range.asResource)»
			  		  				«ENDIF»
			  		  				<edge id="«UUID.randomUUID().toString()»" source="«domain.asResource.URI»" target="«range.asResource.URI»">
			  		  				  <data key="d9"/>
			  		  				  <data key="d10">
			  		  				    <y:PolyLineEdge>
			  		  				      <y:Path sx="0.0" sy="0.0" tx="0.0" ty="0.0"/>
			  		  				      <y:LineStyle color="#000000" type="line" width="1.0"/>
			  		  				      <y:Arrows source="none" target="standard"/>
			  		  				      <y:EdgeLabel alignment="center" backgroundColor="#AACCFF" configuration="AutoFlippingLabel" distance="2.0" fontFamily="Dialog" fontSize="12" fontStyle="plain" hasLineColor="false" height="18.701171875" horizontalTextPosition="center" iconTextGap="4" modelName="centered" modelPosition="center" preferredPlacement="anywhere" ratio="0.5" textColor="#000000" verticalTextPosition="bottom" visible="true" width="81.373046875" x="-88.66797246884448" y="57.68815612792969">«getLabel(p)»<y:PreferredPlacementDescriptor angle="0.0" angleOffsetOnRightSide="0" angleReference="absolute" angleRotationOnRightSide="co" distance="-1.0" frozen="true" placement="anywhere" side="anywhere" sideReference="relative_to_edge_flow"/>
			  		  				      </y:EdgeLabel>
			  		  				      <y:BendStyle smoothed="false"/>
			  		  				    </y:PolyLineEdge>
			  		  				  </data>
			  		  				</edge>
			  		  			«ENDIF»
			  		  		«ENDFOR»
			  		  	«ENDFOR»
			  	«ENDFOR»
			  	«FOR DatatypeProperty p: datatypeProperties»
			  		«var domains = ontoModel.listStatements(p, RDFS.domain, null as RDFNode).toSet.map[Statement s| s.object].toSet»
			  		<!--«if(domains.empty) {domains.add(OWL.Thing); usesThing=true }»-->
			  		«var ranges = ontoModel.listStatements(p, RDFS.range, null as RDFNode).toSet.map[Statement s| s.object].toSet»
			  		<!--«if(ranges.empty) {ranges.add(OWL.Thing); usesThing=true }»-->
			  		  	«FOR RDFNode domain : domains»
			  		  		«FOR RDFNode range : ranges»
			  		  			«IF !domain.anon && domain.resource && !range.anon && range.resource»
			  		  				«IF !nodes.contains(domain.asResource.URI)»
			  		  					«addNode(domain.asResource)»
			  		  				«ENDIF»
			  					«var typeNodeId = UUID.randomUUID().toString()»
			  					«IF !range.asResource.URI.equals(OWL.Thing.URI)»
			  						<node id="«typeNodeId»">
			  						  <data key="d5"/>
			  						  <data key="d6">
			  						    <y:ShapeNode>
			  						      <y:Geometry height="30.0" width="60.79609940879118" x="426.0" y="93.0"/>
			  						      <y:Fill color="#FFCC33" transparent="false"/>
			  						      <y:BorderStyle color="#000000" raised="false" type="line" width="2.0"/>
			  						      <y:NodeLabel alignment="center" autoSizePolicy="content" fontFamily="Dialog" fontSize="12" fontStyle="plain" hasBackgroundColor="false" hasLineColor="false" height="18.701171875" horizontalTextPosition="center" iconTextGap="4" modelName="custom" textColor="#000000" verticalTextPosition="bottom" visible="true" width="51.35546875" x="4.720315329395589" y="5.6494140625">«range.asResource.localName»<y:LabelModel>
			  						          <y:SmartNodeLabelModel distance="4.0"/>
			  						        </y:LabelModel>
			  						        <y:ModelParameter>
			  						          <y:SmartNodeLabelModelParameter labelRatioX="0.0" labelRatioY="0.0" nodeRatioX="0.0" nodeRatioY="0.0" offsetX="0.0" offsetY="0.0" upX="0.0" upY="-1.0"/>
			  						        </y:ModelParameter>
			  						      </y:NodeLabel>
			  						      <y:Shape type="rectangle"/>
			  						    </y:ShapeNode>
			  						  </data>
			  						</node>
			  					«ELSE»
			  						<node id="«typeNodeId»">
			  						  <data key="d6">
			  						    <y:ShapeNode>
			  						      <y:Geometry height="30.0" width="49.0" x="445.7960994087912" y="197.0"/>
			  						      <y:Fill color="#FFCC33" transparent="false"/>
			  						      <y:BorderStyle color="#000000" raised="false" type="dashed" width="2.0"/>
			  						      <y:NodeLabel alignment="center" autoSizePolicy="content" fontFamily="Dialog" fontSize="12" fontStyle="plain" hasBackgroundColor="false" hasLineColor="false" height="18.701171875" horizontalTextPosition="center" iconTextGap="4" modelName="custom" textColor="#000000" verticalTextPosition="bottom" visible="true" width="36.68359375" x="6.158203125" y="5.6494140625">Literal<y:LabelModel>
			  						          <y:SmartNodeLabelModel distance="4.0"/>
			  						        </y:LabelModel>
			  						        <y:ModelParameter>
			  						          <y:SmartNodeLabelModelParameter labelRatioX="0.0" labelRatioY="0.0" nodeRatioX="0.0" nodeRatioY="0.0" offsetX="0.0" offsetY="0.0" upX="0.0" upY="-1.0"/>
			  						        </y:ModelParameter>
			  						      </y:NodeLabel>
			  						      <y:Shape type="rectangle"/>
			  						    </y:ShapeNode>
			  						  </data>
			  						</node>
			  					«ENDIF»
			  					<edge id="«UUID.randomUUID().toString()»" source="«domain.asResource.URI»" target="«typeNodeId»">
			  					  <data key="d10">
			  					    <y:GenericEdge configuration="com.yworks.bpmn.Connection">
			  					      <y:Path sx="0.0" sy="0.0" tx="0.0" ty="0.0"/>
			  					      <y:LineStyle color="#000000" type="line" width="1.0"/>
			  					      <y:Arrows source="none" target="delta"/>
			  					      <y:EdgeLabel alignment="center" backgroundColor="#99CC66" configuration="AutoFlippingLabel" distance="2.0" fontFamily="Dialog" fontSize="12" fontStyle="plain" hasLineColor="false" height="18.701171875" horizontalTextPosition="center" iconTextGap="4" modelName="centered" modelPosition="center" preferredPlacement="anywhere" ratio="0.5" textColor="#000000" verticalTextPosition="bottom" visible="true" width="95.388671875" x="58.06733964316618" y="-6.618739898794274">«getLabel(p)»<y:PreferredPlacementDescriptor angle="0.0" angleOffsetOnRightSide="0" angleReference="absolute" angleRotationOnRightSide="co" distance="-1.0" frozen="true" placement="anywhere" side="anywhere" sideReference="relative_to_edge_flow"/>
			  					      </y:EdgeLabel>
			  					      <y:StyleProperties>
			  					        <y:Property class="com.yworks.yfiles.bpmn.view.BPMNTypeEnum" name="com.yworks.bpmn.type" value="CONNECTION_TYPE_SEQUENCE_FLOW"/>
			  					      </y:StyleProperties>
			  					    </y:GenericEdge>
			  					  </data>
			  					</edge>
			  				«ENDIF»
			  			«ENDFOR»
			  		«ENDFOR»
			  	«ENDFOR»
			  	«IF usesThing»
			  		<node id="http://www.w3.org/2002/07/owl#Thing">
			  		  <data key="d5"/>
			  		  <data key="d6">
			  		    <y:ShapeNode>
			  		      <y:Geometry height="44.0" width="44.0" x="351.0" y="508.0"/>
			  		      <y:Fill color="#FFFFFF" transparent="false"/>
			  		      <y:BorderStyle color="#000000" raised="false" type="dashed" width="1.0"/>
			  		      <y:NodeLabel alignment="center" autoSizePolicy="content" fontFamily="Dialog" fontSize="12" fontStyle="plain" hasBackgroundColor="false" hasLineColor="false" height="18.701171875" horizontalTextPosition="center" iconTextGap="4" modelName="custom" textColor="#000000" verticalTextPosition="bottom" visible="true" width="34.017578125" x="4.9912109375" y="12.6494140625">Thing<y:LabelModel>
			  		          <y:SmartNodeLabelModel distance="4.0"/>
			  		        </y:LabelModel>
			  		        <y:ModelParameter>
			  		          <y:SmartNodeLabelModelParameter labelRatioX="0.0" labelRatioY="0.0" nodeRatioX="0.0" nodeRatioY="0.0" offsetX="0.0" offsetY="0.0" upX="0.0" upY="-1.0"/>
			  		        </y:ModelParameter>
			  		      </y:NodeLabel>
			  		      <y:Shape type="ellipse"/>
			  		    </y:ShapeNode>
			  		  </data>
			  		</node>
			  	«ENDIF»
			  	</graph>
			  	<data key="d7">
			  	  <y:Resources/>
			  	</data>
				</graphml>
			'''
		
		var fw = new FileWriter(graphmlfile);
		fw.write(result);
		fw.close();

		
	}
	
}
