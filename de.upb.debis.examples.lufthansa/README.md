# Preparations

### Install gradle

https://gradle.org/install/

If you are using Eclipse, install the Buildship Gradle integration: https://marketplace.eclipse.org/content/buildship-gradle-integration

### Checkout repository

Import this repository into your Eclipse workspace.
For details see here: https://eclipsesource.com/blogs/tutorials/egit-tutorial/

Note that the project will have compile errors, because some dependencies are missing. Missing dependencies will later be resolved with gradle.

### Create Lufthansa developer account

* Create a Lufthansa developer account at https://developer.lufthansa.com/ and sign in
* Open your account page and create a new application (https://developer.lufthansa.com/apps/myapps)
* Go to the IO Docs (https://developer.lufthansa.com/io-docs) 
 * select your previously application from the drop down field "Existing Client Credentials"
 * hit the button "Get Access Token"
 * copy the access token to the clipboard


### Configure adapter
Open the Java class de.upb.dbis.astro.adapter.Adapter an replace "YOUR ACCESS TOKEN" with the access token from your clipboard

```java
public Adapter() {
    
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure OAuth2 access token for authorization: auth
    OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
    auth.setAccessToken("YOUR ACCESS TOKEN");//FIXME Set access token

    openapi = new OperationsApi();
}
``` 

Open the JUnit test OperationsApiTest and replace "YOUR ACCESS TOKEN" with the access token from your clipboard.

```java
    @Before
    public void setUp() throws Exception {
    	
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure OAuth2 access token for authorization: auth
        OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
        auth.setAccessToken("YOUR ACCESS TOKEN");//FIXME Set access token

        api = new OperationsApi();
    }
```


Make sure that the input parameter fromDateTime is set to a date in the future. Otherwise the Lufthansa API will response with Bad Request.

```java
    @Test
    public void operationsSchedulesFromDateTimeByOriginAndDestinationGetTest() throws ApiException {
    	//...
        String fromDateTime = "2018-03-15";
        String response = api.operationsSchedulesFromDateTimeByOriginAndDestinationGet(origin, destination, fromDateTime, accept, directFlights, limit, offset);
               
    }
```

### Build project
```shell
./gradlew build
```
 
