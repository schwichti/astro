package de.upb.debis.astro.ui

import java.sql.SQLException
import java.sql.PreparedStatement
import org.apache.jena.rdf.model.Model
import java.util.ArrayList
import java.util.List
import de.upb.debis.astro.Triple
import de.upb.debis.astro.ReferenceAlignment

class MySQLAlignmentLoader {
	
	
	private static def String addNamespace(String localName){
		if(localName!==null && !localName.equals("x")){
			return "http://schema.org/"+localName;
		}
		return localName;
	}
	
	public static def List<Integer> getMappedOfferIds() throws SQLException{
		var result = new ArrayList<Integer>();
		
		var preparedStatement3 = SQLConnection.getConnection().prepareStatement("SELECT id FROM offer o WHERE EXISTS (SELECT offerid FROM mappings m WHERE o.id=m.offerid)");

		var offers = preparedStatement3.executeQuery();
		while(offers.next){
			
		}
		return result;
	}	
	
	public static def ReferenceAlignment getReferenceAlignment(Model schemaorg) throws SQLException{
		getReferenceAlignment(null, true, true, true, schemaorg);
	}
	
	public static def ReferenceAlignment getReferenceAlignment(String offerid, Model schemaorg) throws SQLException{
		
		getReferenceAlignment(offerid, true, true, true, schemaorg);
	}
	
	public static def ArrayList<String> normalizedOfferNamespaces(){
		var result = new ArrayList<String>();
		
		var preparedStatement = SQLConnection.getConnection().prepareStatement("SELECT namespace FROM offers o WHERE EXISTS (SELECT id FROM mappings m WHERE m.offerid=o.id)");
		var resultset = preparedStatement.executeQuery();
		
		while(resultset.next){
			
			var namespace = resultset.getString("namespace");
			result.add(namespace);
		}
		
		return result;
	}
	
	public static def ReferenceAlignment getReferenceAlignment(String offerid, boolean input, boolean properties, boolean output, Model schemaorg) throws SQLException{
		var referenceAlignment = new ReferenceAlignment();
		
		var types = new ArrayList<String>();
		if(input){
			types.add("0");
		}
		if(properties){
			types.add("1");
		}
		if(output){
			types.add("2");
		}
		
		var types2 = "";
		
		for(var iter= types.iterator(); iter.hasNext;){
			
			var next = iter.next();
			types2+=next;
			if(iter.hasNext){
				types2+=", "
			}
			
		}
		
		var preparedStatement3 = null as PreparedStatement;
		if(offerid!==null){
			preparedStatement3 = SQLConnection.getConnection().prepareStatement('''SELECT * FROM mappings m WHERE m.offerid=? AND m.type IN («types2»)''');
			preparedStatement3.setString(1, offerid);
			//preparedStatement3.setString(2, type);
		}
		else if(offerid===null){
			preparedStatement3 = SQLConnection.getConnection().prepareStatement("SELECT * FROM mappings m WHERE m.offerid=?");
			preparedStatement3.setString(1, offerid);
		}
		else{
			preparedStatement3 = SQLConnection.getConnection().prepareStatement("SELECT * FROM mappings m");
		}
		
		var mappings = preparedStatement3.executeQuery();
		
		
		while(mappings.next()){
			var lefturi = mappings.getString("lefturi");
			
			var subject = mappings.getString("subject");
			var predicate = mappings.getString("predicate");
			var object = mappings.getString("object");
			
			subject = if(subject!==null && !subject.isEmpty() && !subject.equals("x")){ 
				addNamespace(subject)
			} else{
				null
			};
			
			predicate = if(predicate!==null && !predicate.isEmpty() && !predicate.equals("x")){ 
				addNamespace(predicate)
			} else{
				null
			};
			
			object = if(object!==null && !object.isEmpty() && !object.equals("x")){
				addNamespace(object)
			} else{
				null;
			}
			
			if(subject!==null){
				
				var t = new Triple();
				t.subject = schemaorg.getResource(subject);
				t.predicate = schemaorg.getResource(predicate);
				t.object = schemaorg.getResource(object);
				
				referenceAlignment.put(lefturi, t);
			}
			else{
				referenceAlignment.put(lefturi, null);
			}
			
		}
		
		return referenceAlignment;
		
	}
}
