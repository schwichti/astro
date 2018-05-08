
# Syntactic Specification

Lets consider the specification of Lufthansa Open API.
The following excerpt shows the specification of operation *ReferencesCountriesByCountryCodeGet*:

```json
"paths": {
	"/references/countries/{countryCode}": {
		"get": {
			"description": "List all countries or one specific country. It is possible to request the response in a specific language.",
			"summary": "Countries",
			"tags": [
				"Reference Data"
			],
			"operationId": "ReferencesCountriesByCountryCodeGet",
			"produces": [
				"application/json"
			],
			"parameters": [
				{
					"name": "countryCode",
					"in": "path",
					"required": true,
					"default": "DK",
					"type": "string",
					"description": "2-letter ISO 3166-1 country code"
				}
			],
			"responses": {
				"200": {
					"description": "",
					"schema": {
						"type": "object"
					},
					"examples": {
						"application/json": {
							"CountryResource": {
								"Countries": {
									"Country": {
										"CountryCode": "DK"
									}
								}
							}
						}
					}
				}
			}
		}
	}
}
```


# Semantic Specification
The swagger format is translated to OWL-S.
Every path/operation pair (e.g., ReferencesCountriesByCountryCodeGet+GET) corresponds to an owls:AtomicProcess.
If the operation has a response, the corresponding owls:AtomicProcess has exactly one owls:Output for this response message.

Prefix | URL
--- | ---
owls | http://www.daml.org/services/owl-s/1.1/Process.owl
owl | http://www.w3.org/2002/07/owl

```xml
<process:AtomicProcess rdf:ID="ReferencesCountriesByCountryCodeGet">
	<service:describes rdf:resource="#Service"/>
	<process:hasInput rdf:resource="#countryCode"/>
	<process:hasOutput rdf:resource="#Response"/>
</process:AtomicProcess>
```

In addition, a domain ontology (OWL) is generated from the response message.
Every JSON attribute that has a primitive type, i.e., number, boolean, string, is translated into a owl:DatatypeProperty.
For example, the JSON attribute *#references...countrycode* is translated into a owl:DatatypeProperty.

```xml
<owl:DatatypeProperty rdf:about="http://127.0.0.1/ontology/api.lufthansa.com-ReferencesCountriesByCountryCodeGet-get.owl#referencescountriesbycountrycodeget_countryresource_countries_country_countrycode">
	<rdfs:domain rdf:resource="http://127.0.0.1/ontology/api.lufthansa.com-ReferencesCountriesByCountryCodeGet-get.owl#Referencescountriesbycountrycodeget_countryresource_countries_country"/>
	<j.0:actualtype rdf:resource="http://www.w3.org/2001/XMLSchema#string"/>
	<j.0:jsonpath><![CDATA[$.CountryResource.Countries.Country.CountryCode]]></j.0:jsonpath>
	<rdfs:range rdf:resource="http://www.w3.org/2001/XMLSchema#string"/>
	<rdfs:label><![CDATA[CountryCode]]></rdfs:label>
</owl:DatatypeProperty>
```

The property *jsonpath* is a [JSON Path](http://goessner.net/articles/JsonPath/) that precisely locates the attribute in the JSON response message.  
Some APIs encode data as strings while they actually have a different data type.
Lets assume the following JSON response:

```json
{
	"isOneway": "true"
}
```
Here, the declared primitive type is string.
However, it is likely that the actual data type is Boolean.
ASTRO automatically infers the actual data type from example values of a JSON attribute contained in a response by matching against regular expressions.
The property *actualtype* contained in the domain ontology stores this inferred data type per owl:DatatypeProperty.

# Alignment

An alignment maps the types of owls:Inputs, owls:Outputs, owl:DatatypeProperties to schema.org triples, containing of a subject, predicate and object.


Type | URL | Subject | Predicate | Object
--- | --- | --- | --- | ---
owls:Input | #countryCode | Country | identifier | Text
owl:DatatypeProperty | #references...countrycode | Country | identifier | Text
owls:Output | #Response | Country | - | -

Concerning mappings of owls:Outputs: The predicate and object are always empty as they are not necessary for code generation.
The short notation for triples is like so: <Country, identifier, Text>.


# Code Generation

An adapter wraps a REST API so that it can be used as if it was a Semantic Web Service.
An adapter has a method for every owls:AtomicProcess.
The owls:Inputs and owls:Outputs of an owls:AtomicProcess have types from a global ontology. For example, if schema.org is used as a global ontology, the [Java representation of schema.org](https://github.com/schwichti/astro/tree/master/org.schema) needs to be included on the Adapter's classpath.

Each of the methods consists of three parts:
1. The lowering transformation translates the input types from the global ontology to the types that are declared in the syntactic swagger specification.
2. The underlying REST API is called with the translated inputs.
3. The lifting translation converts the response message of the REST API to an object structure that conforms to the global ontology.

## From Output Mapping

The code generator creates a Java method for every owls:AtomicProcess.
The concept id of the owls:AtomicProcess is exactly the same as the operationId from the swagger specification.
The return type of the Java method corresponds to the type of its owls:Output.
The type of owls:Output #Response is mapped to the triple <Country, - , ->.

```java
public Country ReferencesCountriesByCountryCodeGet(/*...*/){
	//...
	Country result = new Country();
	//...
	return result;
}
```

## From Input Mapping

The parameters of the Java method correspond to owls:Inputs:
```java
public Country ReferencesCountriesByCountryCodeGet(Country country){/*...*/}
```

## From DatatypeProperty Mapping

DatatypeProperties are mapped to a triple, comprising a subject, predicate, and object.
The triple's subject, predicate, and object correspond to the variable's owner (Java class), the variable (Java class attribute), and the value's type:

```java
Country country = new Country(); //subject is Country

String identifier = JsonPath.parse(response).read("$.CountryResource.Countries.Country.CountryCode", String.class); //object is Text (String)
country.setIdentifier(identifier); //predicate is identifier
```

## Complete Adapter Logic

```java
public Country ReferencesCountriesByCountryCodeGet(
				Country countryCode /*, ...*/
				) throws ApiException {

	//lowering (OWLS to OpenAPI)
	// from #countryCode -> <Country, identifier, Text>
	String countryCode_ = countryCode.getIdentifier();

	String response = openapi.ReferencesCountriesByCountryCodeGet(countryCode_ /*, ...*/); //call REST API

	//lifting (OpenAPI to OWLS)
	//from #Response -> <Country, -, ->
	Country result = new Country();

	//from #references...countrycode -> <Country, identifier, Text>
	Country country = new Country();
	String identifier = JsonPath.parse(response).read("$.CountryResource.Countries.Country.CountryCode", String.class);
	country.setIdentifier(identifier);

	return result;
}
```
