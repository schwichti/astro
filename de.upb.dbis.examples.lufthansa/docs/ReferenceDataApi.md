# ReferenceDataApi

All URIs are relative to *https://api.lufthansa.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**referencesAircraftByAircraftCodeGet**](ReferenceDataApi.md#referencesAircraftByAircraftCodeGet) | **GET** /references/aircraft/{aircraftCode} | Aircraft
[**referencesAirlinesByAirlineCodeGet**](ReferenceDataApi.md#referencesAirlinesByAirlineCodeGet) | **GET** /references/airlines/{airlineCode} | Airlines
[**referencesAirportsByAirportCodeGet**](ReferenceDataApi.md#referencesAirportsByAirportCodeGet) | **GET** /references/airports/{airportCode} | Airports
[**referencesAirportsNearestByLatitudeAndLongitudeGet**](ReferenceDataApi.md#referencesAirportsNearestByLatitudeAndLongitudeGet) | **GET** /references/airports/nearest/{latitude},{longitude} | Nearest Airports
[**referencesCitiesByCityCodeGet**](ReferenceDataApi.md#referencesCitiesByCityCodeGet) | **GET** /references/cities/{cityCode} | Cities
[**referencesCountriesByCountryCodeGet**](ReferenceDataApi.md#referencesCountriesByCountryCodeGet) | **GET** /references/countries/{countryCode} | Countries


<a name="referencesAircraftByAircraftCodeGet"></a>
# **referencesAircraftByAircraftCodeGet**
> String referencesAircraftByAircraftCodeGet(accept, aircraftCode, limit, offset)

Aircraft

List all aircraft types or one specific aircraft type.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ReferenceDataApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

ReferenceDataApi apiInstance = new ReferenceDataApi();
String accept = "accept_example"; // String | http header: application/json or application/xml (Acceptable values are: \"application/json\", \"application/xml\")
String aircraftCode = "aircraftCode_example"; // String | 3-character IATA aircraft code
String limit = "20"; // String | Number of records returned per request. Defaults to 20, maximum is 100 (if a value bigger than 100 is given, 100 will be taken)
String offset = "0"; // String | Number of records skipped. Defaults to 0
try {
    String result = apiInstance.referencesAircraftByAircraftCodeGet(accept, aircraftCode, limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReferenceDataApi#referencesAircraftByAircraftCodeGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accept** | **String**| http header: application/json or application/xml (Acceptable values are: \&quot;application/json\&quot;, \&quot;application/xml\&quot;) |
 **aircraftCode** | **String**| 3-character IATA aircraft code |
 **limit** | **String**| Number of records returned per request. Defaults to 20, maximum is 100 (if a value bigger than 100 is given, 100 will be taken) | [optional] [default to 20]
 **offset** | **String**| Number of records skipped. Defaults to 0 | [optional] [default to 0]

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="referencesAirlinesByAirlineCodeGet"></a>
# **referencesAirlinesByAirlineCodeGet**
> String referencesAirlinesByAirlineCodeGet(accept, airlineCode, limit, offset)

Airlines

List all airlines or one specific airline.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ReferenceDataApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

ReferenceDataApi apiInstance = new ReferenceDataApi();
String accept = "accept_example"; // String | http header: application/json or application/xml (Acceptable values are: \"application/json\", \"application/xml\")
String airlineCode = "airlineCode_example"; // String | 2-character IATA airline/carrier code
String limit = "20"; // String | Number of records returned per request. Defaults to 20, maximum is 100 (if a value bigger than 100 is given, 100 will be taken)
String offset = "0"; // String | Number of records skipped. Defaults to 0
try {
    String result = apiInstance.referencesAirlinesByAirlineCodeGet(accept, airlineCode, limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReferenceDataApi#referencesAirlinesByAirlineCodeGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accept** | **String**| http header: application/json or application/xml (Acceptable values are: \&quot;application/json\&quot;, \&quot;application/xml\&quot;) |
 **airlineCode** | **String**| 2-character IATA airline/carrier code |
 **limit** | **String**| Number of records returned per request. Defaults to 20, maximum is 100 (if a value bigger than 100 is given, 100 will be taken) | [optional] [default to 20]
 **offset** | **String**| Number of records skipped. Defaults to 0 | [optional] [default to 0]

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="referencesAirportsByAirportCodeGet"></a>
# **referencesAirportsByAirportCodeGet**
> String referencesAirportsByAirportCodeGet(accept, airportCode, lang, limit, offset, lhoperated)

Airports

List all airports or one specific airport. All airports response is very large. It is possible to request the response in a specific language.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ReferenceDataApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

ReferenceDataApi apiInstance = new ReferenceDataApi();
String accept = "accept_example"; // String | http header: application/json or application/xml (Acceptable values are: \"application/json\", \"application/xml\")
String airportCode = "airportCode_example"; // String | 3-letter IATA airport code
String lang = "lang_example"; // String | 2-letter ISO 3166-1 language code
String limit = "20"; // String | Number of records returned per request. Defaults to 20, maximum is 100 (if a value bigger than 100 is given, 100 will be taken)
String offset = "0"; // String | Number of records skipped. Defaults to 0
Boolean lhoperated = true; // Boolean | Restrict the results to locations with flights operated by LH (false=0, true=1)
try {
    String result = apiInstance.referencesAirportsByAirportCodeGet(accept, airportCode, lang, limit, offset, lhoperated);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReferenceDataApi#referencesAirportsByAirportCodeGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accept** | **String**| http header: application/json or application/xml (Acceptable values are: \&quot;application/json\&quot;, \&quot;application/xml\&quot;) |
 **airportCode** | **String**| 3-letter IATA airport code |
 **lang** | **String**| 2-letter ISO 3166-1 language code | [optional]
 **limit** | **String**| Number of records returned per request. Defaults to 20, maximum is 100 (if a value bigger than 100 is given, 100 will be taken) | [optional] [default to 20]
 **offset** | **String**| Number of records skipped. Defaults to 0 | [optional] [default to 0]
 **lhoperated** | **Boolean**| Restrict the results to locations with flights operated by LH (false&#x3D;0, true&#x3D;1) | [optional]

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="referencesAirportsNearestByLatitudeAndLongitudeGet"></a>
# **referencesAirportsNearestByLatitudeAndLongitudeGet**
> String referencesAirportsNearestByLatitudeAndLongitudeGet(latitude, longitude, accept, lang)

Nearest Airports

List the 5 closest airports to the given latitude and longitude, irrespective of the radius of the reference point.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ReferenceDataApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

ReferenceDataApi apiInstance = new ReferenceDataApi();
Integer latitude = 56; // Integer | Latitude in decimal format to at most 3 decimal places
Integer longitude = 56; // Integer | Longitude in decimal format to at most 3 decimal places
String accept = "accept_example"; // String | http header: application/json or application/xml (Acceptable values are: \"application/json\", \"application/xml\")
String lang = "lang_example"; // String | 2 letter ISO 3166-1 language code
try {
    String result = apiInstance.referencesAirportsNearestByLatitudeAndLongitudeGet(latitude, longitude, accept, lang);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReferenceDataApi#referencesAirportsNearestByLatitudeAndLongitudeGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **latitude** | **Integer**| Latitude in decimal format to at most 3 decimal places |
 **longitude** | **Integer**| Longitude in decimal format to at most 3 decimal places |
 **accept** | **String**| http header: application/json or application/xml (Acceptable values are: \&quot;application/json\&quot;, \&quot;application/xml\&quot;) |
 **lang** | **String**| 2 letter ISO 3166-1 language code | [optional]

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="referencesCitiesByCityCodeGet"></a>
# **referencesCitiesByCityCodeGet**
> String referencesCitiesByCityCodeGet(accept, cityCode, lang, limit, offset)

Cities

List all cities or one specific city. It is possible to request the response in a specific language.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ReferenceDataApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

ReferenceDataApi apiInstance = new ReferenceDataApi();
String accept = "accept_example"; // String | http header: application/json or application/xml (Acceptable values are: \"application/json\", \"application/xml\")
String cityCode = "cityCode_example"; // String | 3-letter IATA city code
String lang = "lang_example"; // String | 2 letter ISO 3166-1 language code
String limit = "20"; // String | Number of records returned per request. Defaults to 20, maximum is 100 (if a value bigger than 100 is given, 100 will be taken)
String offset = "0"; // String | Number of records skipped. Defaults to 0
try {
    String result = apiInstance.referencesCitiesByCityCodeGet(accept, cityCode, lang, limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReferenceDataApi#referencesCitiesByCityCodeGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accept** | **String**| http header: application/json or application/xml (Acceptable values are: \&quot;application/json\&quot;, \&quot;application/xml\&quot;) |
 **cityCode** | **String**| 3-letter IATA city code |
 **lang** | **String**| 2 letter ISO 3166-1 language code | [optional]
 **limit** | **String**| Number of records returned per request. Defaults to 20, maximum is 100 (if a value bigger than 100 is given, 100 will be taken) | [optional] [default to 20]
 **offset** | **String**| Number of records skipped. Defaults to 0 | [optional] [default to 0]

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="referencesCountriesByCountryCodeGet"></a>
# **referencesCountriesByCountryCodeGet**
> String referencesCountriesByCountryCodeGet(accept, countryCode, lang, limit, offset)

Countries

List all countries or one specific country. It is possible to request the response in a specific language.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ReferenceDataApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

ReferenceDataApi apiInstance = new ReferenceDataApi();
String accept = "accept_example"; // String | http header: application/json or application/xml (Acceptable values are: \"application/json\", \"application/xml\")
String countryCode = "countryCode_example"; // String | 2-letter ISO 3166-1 country code
String lang = "lang_example"; // String | 2 letter ISO 3166-1 language code
String limit = "20"; // String | Number of records returned per request. Defaults to 20, maximum is 100 (if a value bigger than 100 is given, 100 will be taken)
String offset = "0"; // String | Number of records skipped. Defaults to 0
try {
    String result = apiInstance.referencesCountriesByCountryCodeGet(accept, countryCode, lang, limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReferenceDataApi#referencesCountriesByCountryCodeGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accept** | **String**| http header: application/json or application/xml (Acceptable values are: \&quot;application/json\&quot;, \&quot;application/xml\&quot;) |
 **countryCode** | **String**| 2-letter ISO 3166-1 country code |
 **lang** | **String**| 2 letter ISO 3166-1 language code | [optional]
 **limit** | **String**| Number of records returned per request. Defaults to 20, maximum is 100 (if a value bigger than 100 is given, 100 will be taken) | [optional] [default to 20]
 **offset** | **String**| Number of records skipped. Defaults to 0 | [optional] [default to 0]

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

