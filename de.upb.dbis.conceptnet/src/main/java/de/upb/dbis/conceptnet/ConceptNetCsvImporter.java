package de.upb.dbis.conceptnet;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

import org.apache.jena.ontology.OntModelSpec;
import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.rdf.model.Resource;
import org.apache.jena.vocabulary.RDFS;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import de.upb.dbis.astro.OWLUtil;


public class ConceptNetCsvImporter {

	private static Set<String> relationsWhitelist = new HashSet<String>();
	
	private static Set<String> languageWhitelist = new HashSet<String>();
	
	private static double weightThreshold = 2d;

	private static BufferedReader bufferedReader;
	
	private static HashSet<String> dataSets = new HashSet<String>();

	private static int counter =0;
	
	private static HashMap<String, String> tokenMap;
	
	private static HashSet<String> schemaorg;
	
	private static Pattern pattern = Pattern.compile("[a-zA-Z_]+");
	
	private static String schemaorg_path = null;
	 
	public static void start(File file) {

		
		schemaorg = new HashSet<String>();
		Model model = ModelFactory.createOntologyModel(OntModelSpec.OWL_MEM, null);
		model.read(schemaorg_path);
		
		
		for(Resource c:OWLUtil.listClasses(model)){
			String normalizedlabel =splitCamelCase(OWLUtil.getLiteral(c, RDFS.label)).toLowerCase();
			schemaorg.add(normalizedlabel);
			
			for(Resource p:OWLUtil.listProperties(c)){
				normalizedlabel =splitCamelCase(OWLUtil.getLiteral(p, RDFS.label)).toLowerCase();
				schemaorg.add(normalizedlabel);
			}
		}
		
		
		
		try {

			String sCurrentLine;

			InputStream in = new FileInputStream(file);
			InputStreamReader reader=new InputStreamReader(in,"UTF-8");

			
			bufferedReader = new BufferedReader(reader);

			while ((sCurrentLine = bufferedReader.readLine()) != null) {
				readLine(sCurrentLine);
				counter++;
			}
					

		} catch (IOException e) {
			e.printStackTrace();
		}catch(Exception e){
			e.printStackTrace();
		} finally {
			try {
				if (bufferedReader != null)
					bufferedReader.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}

	
	static{
		
//		relationsWhitelist.add("/r/RelatedTo");
//		relationsWhitelist.add("/r/IsA");
//		relationsWhitelist.add("/r/PartOf");
//		relationsWhitelist.add("/r/MemberOf");
//		relationsWhitelist.add("/r/HasA");
//		relationsWhitelist.add("/r/UsedFor");
//		relationsWhitelist.add("/r/CapableOf");
//		relationsWhitelist.add("/r/AtLocation");
//		relationsWhitelist.add("/r/Causes");
//		relationsWhitelist.add("/r/HasSubevent");
//		relationsWhitelist.add("/r/HasFirstSubevent");
//		relationsWhitelist.add("/r/HasLastSubevent");
//		relationsWhitelist.add("/r/HasPrerequisite");
//		relationsWhitelist.add("/r/HasProperty");
//		relationsWhitelist.add("/r/MotivatedByGoal");
//		relationsWhitelist.add("/r/ObstructedBy");
//		relationsWhitelist.add("/r/Desires");
//		relationsWhitelist.add("/r/CreatedBy");
		relationsWhitelist.add("/r/Synonym");
//		relationsWhitelist.add("/r/DerivedFrom");
//		relationsWhitelist.add("/r/DefinedAs");
//		relationsWhitelist.add("/r/TranslationOf");
		
//		languageWhitelist.add("zh");
//		languageWhitelist.add("cs");
//		languageWhitelist.add("nl");
//		languageWhitelist.add("fr");
//		languageWhitelist.add("de");
//		languageWhitelist.add("pt");
//		languageWhitelist.add("ru");
//		languageWhitelist.add("es");
//		languageWhitelist.add("ar");
//		languageWhitelist.add("it");
		languageWhitelist.add("en");
		
		
	}
	
	public static void main(String[] args) {
		
		if(args.length!=2) {
			
			System.out.println("Usage: <path to conceptnet-assertions-x.x.x.csv> <path to schema.owl>");
		}
		else {
			
			schemaorg_path = args[1];
			File file = new File(args[0]);
			ConceptNetCsvImporter.start(file);	
		}
		
		
	}

	
	public static void readLine(String line) {
					
		//parts = 0 assertion 1 uri, 2 relation (predicate), 3 start (subject), 4 end (object), 5 context (constant value), 6 weight, 7 sources, 8 edge id, 9 dataset
		///a/[/r/Antonym/,/c/ab/агыруа/n/,/c/ab/аҧсуа/]   /r/Antonym      /c/ab/агыруа/n  /c/ab/аҧсуа     {"dataset": "/d/wiktionary/en", "license": "cc:by-sa/4.0", "sources": [{"contributor": "/s/resource/wiktionary/en", "process": "/s/process/wikiparsec/1"}], "weight": 1.0}
		String[] parts = line.split("\t");
		
		String triple = parts[0];
		String predicate = parts[1];
		String subject = parts[2]; //  /c/af/ingaan/v 
		String object = parts[3]; // /c/af/uitgaan
		String json = parts[4]; //json
		
		JsonElement root = new JsonParser().parse(json);
		
		String dataset = root.getAsJsonObject().get("dataset").getAsString();
		String license = root.getAsJsonObject().get("license").getAsString();
		double weight = root.getAsJsonObject().get("weight").getAsDouble();
		JsonArray sources = root.getAsJsonObject().get("sources").getAsJsonArray();
		
		dataSets.add(dataset);
		
		///c/en/destination/n/the_ultimate_goal_for_which_something_is_done
		
		String[] subjectParts = subject.split("/");
		String[] objectParts = object.split("/");
		
		String langSubject = subjectParts[2];
		String langObject = objectParts[2];
		
		String labelSubject = subjectParts[3].trim();
		String labelObject = objectParts[3].trim();
		
		//if(weight>=0 && relationsWhitelist.contains(predicate) && languageWhitelist.contains(langSubject) && languageWhitelist.contains(langObject)){
		if(!ignoreTriple(subject, predicate, object, langSubject, langObject, sources, dataset, weight) && pattern.matcher(labelSubject).matches() && pattern.matcher(labelObject).matches()){
			System.out.println(labelSubject + " =( "+predicate+", "+weight+" )=> " +labelObject);

			if(!schemaorg.contains(labelSubject) && schemaorg.contains(labelObject)){
				//sourcelabel => targetlabel
				//write(labelSubject + ";" +labelObject+";"+predicate+";"+weight+"\n");
				write(labelObject+" => "+labelSubject+"\n");
			}
			else if(schemaorg.contains(labelSubject) && !schemaorg.contains(labelObject)){
				//targetlabel => sourcelabel
				//write(labelObject + ";" +labelSubject+";"+predicate+";"+weight+"\n");
				write(labelSubject+" => "+labelObject+"\n");
			}
			else if(schemaorg.contains(labelSubject) && schemaorg.contains(labelObject)){
				write(labelSubject+" => "+labelObject+"\n");
				write(labelObject+" => "+labelSubject+"\n");
			}
		}

	}
	
    private static String splitCamelCase(String s) {
        return s.replaceAll(
           String.format("%s|%s|%s",
              "(?<=[A-Z])(?=[A-Z][a-z])",
              "(?<=[^A-Z])(?=[A-Z])",
              "(?<=[A-Za-z])(?=[^A-Za-z])"
           ),
           "_"
        );
     }
	
	public static boolean ignoreTriple(String subject, String predicate, String object, String sublang, String objlang, JsonArray sources, String dataset, double weight){
		
		if(!(languageWhitelist.contains(sublang) && languageWhitelist.contains(objlang))){
			return true;
		}
		
		if(weight<weightThreshold){
			return true;
		}
		
		if(!relationsWhitelist.contains(predicate)){
			return true;
		}

		
		return false;
		
	}
	
	public static void write(String line){
		
	    System.out.println(line);
	    try {
			OutputStreamWriter char_output = new OutputStreamWriter(
				     new FileOutputStream("conceptnet.synonym.txt", true),
				     Charset.forName("UTF-8").newEncoder() 
				 );
			
			char_output.write(line);
			char_output.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	}

}
