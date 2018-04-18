
# Syntactic Specification

Lets consider the specification of Lufthansa Open API.
The following excerpt shows specification of operation *ReferencesCountriesByCountryCodeGet*:

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
Every pair path/http operation corresponds to an owls:AtomicProcess.
If the operation has a response with response code 200, the owls:AtomicProcess has at most one owls:Output that summarizes the whole response message.

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

In addition, a domain ontology is generated from the response message.
Every attribute the JSON attribute that has a primitive type, i.e., number, boolean, string, is translated into a owl:DatatypeProperty.
For example, the JSON attribute **
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
Here the declared primitive type is string.
However, it is likely that the actual data type is Boolean.
ASTRO automatically infers the actual data type with regular expression from example values of a JSON attribute contained in a response.
Properties *actualtype* contained in the domain ontology store this inferred data type.

# Alignment

An alignment maps the types of owls:Inputs, owls:Outputs, owl:DatatypeProperties to schema.org triples, containing of a subject, predicate and object.


Type | URL | Subject | Predicate | Object
--- | --- | --- | --- | ---
owls:Input | #countryCode | Country | identifier | Text
owl:DatatypeProperty | #referencescountriesbycountrycodeget_countryresource_countries_country_countrycode | Country | identifier | Text
owls:Output | #Response | Country | - | -

Concerning mappings of owls:Outputs: The predicate and object are always empty as they are not necessary for code generation.


# Code Generation

An adapter wraps an REST API so that it can be used as if it was a Semantic Web Service.
An adapter has a method for every AtomicProcess.
The Inputs and Outputs of an AtomicProcess have types from a global ontology (e.g. schema.org).
Each of the methods consists of three parts:
1. The lowering transformation translates the input types from the global ontology to the types that are declared in the syntactic swagger specification.
2. The underlying REST API is called with the translated inputs.
3. The lifting translation converts the response message of the REST API to an object structure that conforms to the global ontology.


## From Output Mapping

The code generator creates a Java method for every owls:AtomicProcess.
The return type of this Java method corresponds to the type of its owls:Output.

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
public Country ReferencesCountriesByCountryCodeGet(Country country){...}
```

## From DatatypeProperty Mapping

```java
Country country = new Country(); //subject is Country

String identifier = JsonPath.parse(response).read("$.CountryResource.Countries.Country.CountryCode", String.class); //object is Text (String)
country.setIdentifier(identifier); //predicate is identifier
```
