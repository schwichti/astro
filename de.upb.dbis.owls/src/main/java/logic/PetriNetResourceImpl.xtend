package logic

import java.io.File
import java.io.FileWriter
import java.io.IOException
import java.io.InputStream
import java.util.ArrayList
import java.util.HashMap
import java.util.List
import java.util.Map
import javax.xml.namespace.QName
import javax.xml.stream.XMLInputFactory
import org.eclipse.emf.ecore.EObject
import petrinet.PetriNet
import petrinet.PetrinetFactory
import petrinet.Arc
import petrinet.Node

class PetriNetResourceImpl /*extends XMIResourceImpl*/ {
	

	
	private HashMap<String, EObject> registry;
	private List<ResolveJob> resolveJobs;
	private PetrinetFactory factory;
	private PetriNet root;
	//private EFactory factory;
	
	
//	
//	new(org.eclipse.emf.common.util.URI uri) {
//		super(uri)
//		
//	}


	


	
//	public def EList<EObject> getContents(){
//		var result = new BasicEList<EObject>();
//		result.add(root);
//		return result;
//	}

	public def doSave(File file){
		var content = '''<?xml version="1.0" encoding="UTF-8"?>
		<petrinet:PetriNet xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:petrinet="petrinet" xsi:schemaLocation="petrinet PetriNet.ecore">
		  «FOR place : root.places»
		  <places xsi:type="petrinet:Place" id="«place.id»"/>
		  «ENDFOR»
  		  «FOR transition : root.transitions»
  		  <transitions id="«transition.id»"/>
  		  «ENDFOR»
 		  «FOR arc : root.arcs»
 		  <arcs id="«arc.id»" source="«arc.source.id»" target="«arc.target.id»"/>
 		  «ENDFOR»
		</petrinet:PetriNet>
		'''
		var fw = new FileWriter(file, false);
		fw.write(content);
		fw.close;
	}
	
	public def PetriNet doLoad(InputStream inputStream, Map<?, ?> options) throws IOException
	{
		
		factory = PetrinetFactory.eINSTANCE;
		registry = new HashMap<String, EObject>();
		
		
		root = factory.createPetriNet();
		
		
		resolveJobs = new ArrayList<ResolveJob>();
		
		var xmlInputFactory = XMLInputFactory.newInstance();
		
        var xmlEventReader = xmlInputFactory.createXMLEventReader(inputStream);
        while(xmlEventReader.hasNext()){
            var xmlEvent = xmlEventReader.nextEvent();
           if (xmlEvent.isStartElement()){
               var startElement = xmlEvent.asStartElement();
               if(startElement.getName().getLocalPart().equals("place")){
                   var id = startElement.getAttributeByName(new QName("id")).value;
                   var place = factory.createPlace();
                   place.id = id;
                   root.places.add(place);
                   
                   registry.put(id, place);
                   
                   
               }
               else if(startElement.getName().getLocalPart().equals("transition")){
               	
               	   var id = startElement.getAttributeByName(new QName("id")).value;
                   var transition = factory.createTransition();
                   transition.id = id;
                   
                   root.transitions.add(transition);
                   registry.put(id, transition);
                   
               }
               else if(startElement.getName().getLocalPart().equals("arc")){
                   
               	   var id = startElement.getAttributeByName(new QName("id")).value;
                   var arc = factory.createArc();
                   arc.id = id;
                   registry.put(id, arc);              
                   
                   var sourceId = startElement.getAttributeByName(new QName("source")).value;
                   var targetId = startElement.getAttributeByName(new QName("target")).value;
                   
                   resolveJobs.add(new ResolveJob(arc, "source", sourceId));
                   resolveJobs.add(new ResolveJob(arc, "target", targetId));
                   
                   root.arcs.add(arc);     
                   
               }                   

           }
           if(xmlEvent.isEndElement()){
               var endElement = xmlEvent.asEndElement();
               if(endElement.getName().getLocalPart().equals("place")){
               }
           }
        }
        
        for(ResolveJob job:resolveJobs) {
        	
        	var eobject = registry.get(job.value);
        	
        	if(job.owner instanceof Arc && job.EStructuralFeature === "source"){
        		(job.owner as Arc).source = eobject as Node;
        	}
        	
        	else if(job.owner instanceof Arc && job.EStructuralFeature === "target"){
        		(job.owner as Arc).target = eobject as Node;
        	}
        	
        	
        	
        	
        }
        
        //getContents().add(root);
        
        return root;
        
            
	}
	
	
}
