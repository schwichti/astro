# swagger-java-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>io.swagger</groupId>
    <artifactId>swagger-java-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/swagger-java-client-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.OperationsApi;

import java.io.File;
import java.util.*;

public class OperationsApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure OAuth2 access token for authorization: auth
        OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
        auth.setAccessToken("YOUR ACCESS TOKEN");

        OperationsApi apiInstance = new OperationsApi();
        String origin = "origin_example"; // String | Departure airport. 3-letter IATA airport code (e.g. 'ZRH')
        String destination = "destination_example"; // String | Destination airport. 3-letter IATA airport code (e.g. 'FRA')
        String fromDateTime = "fromDateTime_example"; // String | Local departure date and optionally departure time (YYYY-MM-DD or YYYY-MM-DDTHH:mm). When not provided, time is assumed to be 00:01
        String accept = "accept_example"; // String | http header: application/json or application/xml (Acceptable values are: \"application/json\", \"application/xml\")
        Boolean directFlights = true; // Boolean | Show only direct flights (false=0, true=1). Default is false
        String limit = "limit_example"; // String | Number of records returned per request. Defaults to 20, maximum is 100 (if a value bigger than 100 is given, 100 will be taken)
        String offset = "offset_example"; // String | Number of records skipped. Defaults to 0
        try {
            String result = apiInstance.operationsSchedulesFromDateTimeByOriginAndDestinationGet(origin, destination, fromDateTime, accept, directFlights, limit, offset);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OperationsApi#operationsSchedulesFromDateTimeByOriginAndDestinationGet");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.lufthansa.com/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*OperationsApi* | [**operationsSchedulesFromDateTimeByOriginAndDestinationGet**](docs/OperationsApi.md#operationsSchedulesFromDateTimeByOriginAndDestinationGet) | **GET** /operations/schedules/{origin}/{destination}/{fromDateTime} | Flight Schedules


## Documentation for Models



## Documentation for Authorization

Authentication schemes defined for the API:
### auth

- **Type**: OAuth
- **Flow**: accessCode
- **Authorizatoin URL**: https://api.lufthansa.com/v1/oauth/token
- **Scopes**: 
  - read:LH Open API: read access


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issue.

## Author



