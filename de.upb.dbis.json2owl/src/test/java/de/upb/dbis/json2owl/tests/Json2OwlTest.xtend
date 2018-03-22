package de.upb.dbis.json2owl.tests

import static org.junit.Assert.*
import java.io.ByteArrayInputStream
import java.io.InputStream
import java.util.List
import org.apache.jena.ontology.DatatypeProperty
import org.apache.jena.rdf.model.Model
import org.apache.jena.rdf.model.ModelFactory
import org.apache.jena.rdf.model.Resource
import org.apache.jena.rdf.model.Statement
import org.apache.jena.vocabulary.OWL
import org.apache.jena.vocabulary.RDF
import org.apache.jena.vocabulary.RDFS
import org.junit.Before
import org.junit.Test
import de.upb.dbis.json2owl.Json2Owl

class Json2OwlTest {
	def private Model getModel(String json) {
		var Json2Owl json2owl = new Json2Owl()
		var String owl = json2owl.run("http://127.0.0.1/ontology/test.owl", "operationId", json, "host", "get")
		var InputStream is = new ByteArrayInputStream(owl.getBytes())
		var Model model = ModelFactory::createDefaultModel()
		model.read(is, null)
		return model
	}

	@Test def void test_empty() {
		var String json = "{}"
		var Model model = getModel(json)
		var List<Statement> classes = model.listStatements(null, RDF::type, OWL::Class).toList()
		var List<Statement> objectproperties = model.listStatements(null, RDF::type, OWL::ObjectProperty).toList()
		var List<Statement> datatypeproperties = model.listStatements(null, RDF::type, OWL::DatatypeProperty).toList()
		assertTrue("has one class (default root)", classes.size() === 1)
		assertTrue("has no objectproperty", objectproperties.size() === 0)
		assertTrue("has no datatypeproperties", datatypeproperties.size() === 0)
		assertEquals("local name is OperationId", "OperationId", classes.get(0).getSubject().getLocalName())
	}

	@Test def void test_object_object() {
		var String json = "{\"x\":{}}"
		var Model model = getModel(json)
		var List<Statement> classes = model.listStatements(null, RDF::type, OWL::Class).toList()
		var List<Statement> objectproperties = model.listStatements(null, RDF::type, OWL::ObjectProperty).toList()
		var List<Statement> datatypeproperties = model.listStatements(null, RDF::type, OWL::DatatypeProperty).toList()
		assertTrue("has two classes (default root, X)", classes.size() === 2)
		assertTrue("has one objectproperty (root to X)", objectproperties.size() === 1)
		assertTrue("has no datatypeproperties", datatypeproperties.size() === 0)
	}

	@Test def void test_object_array() {
		var String json = "{\"x\":[]}"
		var Model model = getModel(json)
		var List<Statement> classes = model.listStatements(null, RDF::type, OWL::Class).toList()
		var List<Statement> objectproperties = model.listStatements(null, RDF::type, OWL::ObjectProperty).toList()
		var List<Statement> datatypeproperties = model.listStatements(null, RDF::type, OWL::DatatypeProperty).toList()
		assertTrue("has two classes (default root, X)", classes.size() === 2)
		assertTrue("has two objectproperties (root to array, array to item)", objectproperties.size() === 2)
		assertTrue("has no datatypeproperties", datatypeproperties.size() === 0)
	}

	@Test def void test_object_primitive() {
		var String json = "{\"x\":1}"
		var Model model = getModel(json)
		var List<Statement> classes = model.listStatements(null, RDF::type, OWL::Class).toList()
		var List<Statement> objectproperties = model.listStatements(null, RDF::type, OWL::ObjectProperty).toList()
		var List<Statement> datatypeproperties = model.listStatements(null, RDF::type, OWL::DatatypeProperty).toList()
		assertTrue("has one class (default root)", classes.size() === 1)
		assertTrue("has no objectproperty", objectproperties.size() === 0)
		assertTrue("has one datatypeproperty", datatypeproperties.size() === 1)
	}

	@Test def void test_object_null() {
		var String json = "{\"x\":null}"
		var Model model = getModel(json)
		var List<Statement> classes = model.listStatements(null, RDF::type, OWL::Class).toList()
		var List<Statement> objectproperties = model.listStatements(null, RDF::type, OWL::ObjectProperty).toList()
		var List<Statement> datatypeproperties = model.listStatements(null, RDF::type, OWL::DatatypeProperty).toList()
		assertTrue("has one class (default root)", classes.size() === 1)
		assertTrue("has one objectproperty", objectproperties.size() === 1)
		assertTrue("has no datatypeproperty", datatypeproperties.size() === 0)
	}

	@Test def void test_array_object() {
		var String json = "[{}]"
		var Model model = getModel(json)
		var List<Statement> classes = model.listStatements(null, RDF::type, OWL::Class).toList()
		var List<Statement> objectproperties = model.listStatements(null, RDF::type, OWL::ObjectProperty).toList()
		var List<Statement> datatypeproperties = model.listStatements(null, RDF::type, OWL::DatatypeProperty).toList()
		assertTrue("has one class (default root, array item)", classes.size() === 2)
		assertTrue("has one objectproperty", objectproperties.size() === 1)
		assertTrue("has no datatypeproperty", datatypeproperties.size() === 0)
	}

	@Test def void test_array_array() {
		var String json = "[[]]"
		var Model model = getModel(json)
		var List<Statement> classes = model.listStatements(null, RDF::type, OWL::Class).toList()
		var List<Statement> objectproperties = model.listStatements(null, RDF::type, OWL::ObjectProperty).toList()
		var List<Statement> datatypeproperties = model.listStatements(null, RDF::type, OWL::DatatypeProperty).toList()
		assertTrue("has one class (default root, array item)", classes.size() === 2)
		assertTrue("has two objectproperty", objectproperties.size() === 2)
		assertTrue("has no datatypeproperty", datatypeproperties.size() === 0)
	}

	@Test def void test_array_primitive() {
		var String json = "[1]"
		var Model model = getModel(json)
		var List<Statement> classes = model.listStatements(null, RDF::type, OWL::Class).toList()
		var List<Statement> objectproperties = model.listStatements(null, RDF::type, OWL::ObjectProperty).toList()
		var List<Statement> datatypeproperties = model.listStatements(null, RDF::type, OWL::DatatypeProperty).toList()
		assertTrue("has one class (default root, array item)", classes.size() === 1)
		assertTrue("has one objectproperty", objectproperties.size() === 0)
		assertTrue("has no datatypeproperty", datatypeproperties.size() === 1)
	}

	@Test def void test_array_null() {
		var String json = "[null]"
		var Model model = getModel(json)
		var List<Statement> classes = model.listStatements(null, RDF::type, OWL::Class).toList()
		var List<Statement> objectproperties = model.listStatements(null, RDF::type, OWL::ObjectProperty).toList()
		var List<Statement> datatypeproperties = model.listStatements(null, RDF::type, OWL::DatatypeProperty).toList()
		assertTrue("has one class (default root)", classes.size() === 1)
		assertTrue("has one objectproperty", objectproperties.size() === 1)
		assertTrue("has no datatypeproperty", datatypeproperties.size() === 0)
	}

	@Test def void test_array_item() {
		var String json = "{\"airports\":[\"FRA\",\"PAD\"]}"
		var Model model = getModel(json)
		var List<Statement> classes = model.listStatements(null, RDF::type, OWL::Class).toList()
		var List<Statement> objectproperties = model.listStatements(null, RDF::type, OWL::ObjectProperty).toList()
		var List<Statement> datatypeproperties = model.listStatements(null, RDF::type, OWL::DatatypeProperty).toList()
		assertTrue("has one class (default root, array item)", classes.size() === 2)
		assertTrue("has one objectproperty", objectproperties.size() === 1)
		assertTrue("has no datatypeproperty", datatypeproperties.size() === 1)
		var Resource p = datatypeproperties.iterator().next().getSubject()
		var String label = p.getProperty(RDFS::label).getObject().asLiteral().getString()
		assertTrue("label is airports", label.equals("airports"))
	}

	@Test def void test_8coupons() {
		var String json = '''
			[
			  {
			    "affiliate": "yes",
			    "name": "Face Painting & Body Art by Marci",
			    "address": "PO Box 753",
			    "address2": "",
			    "storeID": "2627709",
			    "chainID": null,
			    "totalDealsInThisStore": "1",
			    "homepage": "",
			    "phone": "831.630.3497",
			    "state": "CA",
			    "city": "Hollister",
			    "ZIP": "95024",
			    "URL": "http://www.8coupons.com/apiout/showdeal/deal/7932513/2004978/aff",
			    "storeURL": "http://www.8coupons.com/discounts/face-painting-body-art-by-marci-hollister-95024",
			    "dealSource": "yelp.com",
			    "user": "yelp",
			    "userID": "733207",
			    "ID": "7932513",
			    "dealTitle": "$190 for $225 Certificate",
			    "disclaimer": "",
			    "dealinfo": "A voucher redeemable for $225 at Face Painting & Body Art by Marci. Print out your voucher, or redeem on your phone with the  Yelp app .",
			    "expirationDate": "2013-01-12",
			    "postDate": "2013-01-09 20:43:01",
			    "showImage": "http://s3-media3.ak.yelpcdn.com/dphoto/ZBYaUnqyxy5xpJB8FZ-MWw/l.jpg",
			    "showLogo": "http://www.8coupons.com/partners/logo/small/yelp.png",
			    "up": null,
			    "down": null,
			    "DealTypeID": "1",
			    "categoryID": "2",
			    "subcategoryID": "0",
			    "lat": "36.85",
			    "lon": "-121.4",
			    "distance": null,
			    "dealOriginalPrice": "120",
			    "dealPrice": "100",
			    "dealSavings": "20",
			    "dealDiscountPercent": "17"
			  }
			]
		'''
		var Model model = getModel(json)
		var List<Statement> classes = model.listStatements(null, RDF::type, OWL::Class).toList()
		var List<Statement> objectproperties = model.listStatements(null, RDF::type, OWL::ObjectProperty).toList()
		var List<Statement> datatypeproperties = model.listStatements(null, RDF::type, OWL::DatatypeProperty).toList()
		
		System.out.println("Classes:");
		for(Statement s : classes){
			
			
			for(Statement s2 : s.subject.listProperties(RDFS.label).toList){
				
				System.out.println('''	«s.subject» («s2.object»)''');
			}
		}
		
		System.out.println("ObjectProperties:");
		for(Statement s : objectproperties){
			for(Statement s2 : s.subject.listProperties(RDFS.label).toList){
				
				System.out.println('''	«s.subject» («s2.object»)''');
			}
		}
		
		System.out.println("DatatypeProperties:");
		for(Statement s : datatypeproperties){
			for(Statement s2 : s.subject.listProperties(RDFS.label).toList){
				
				System.out.println('''	«s.subject» («s2.object»)''');
			}
		}
		
		assertTrue("has one class (default root, array item)", classes.size() === 2)
		assertTrue("has one objectproperty", objectproperties.size() === 4+1)
		assertTrue("has no datatypeproperty", datatypeproperties.size() === 33)
	}
	

}
