# OperationsApi

All URIs are relative to *https://api.lufthansa.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**operationsSchedulesFromDateTimeByOriginAndDestinationGet**](OperationsApi.md#operationsSchedulesFromDateTimeByOriginAndDestinationGet) | **GET** /operations/schedules/{origin}/{destination}/{fromDateTime} | Flight Schedules


<a name="operationsSchedulesFromDateTimeByOriginAndDestinationGet"></a>
# **operationsSchedulesFromDateTimeByOriginAndDestinationGet**
> String operationsSchedulesFromDateTimeByOriginAndDestinationGet(origin, destination, fromDateTime, accept, directFlights, limit, offset)

Flight Schedules

Scheduled flights between given airports on a given date.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.OperationsApi;

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
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **origin** | **String**| Departure airport. 3-letter IATA airport code (e.g. &#39;ZRH&#39;) |
 **destination** | **String**| Destination airport. 3-letter IATA airport code (e.g. &#39;FRA&#39;) |
 **fromDateTime** | **String**| Local departure date and optionally departure time (YYYY-MM-DD or YYYY-MM-DDTHH:mm). When not provided, time is assumed to be 00:01 |
 **accept** | **String**| http header: application/json or application/xml (Acceptable values are: \&quot;application/json\&quot;, \&quot;application/xml\&quot;) |
 **directFlights** | **Boolean**| Show only direct flights (false&#x3D;0, true&#x3D;1). Default is false | [optional]
 **limit** | **String**| Number of records returned per request. Defaults to 20, maximum is 100 (if a value bigger than 100 is given, 100 will be taken) | [optional]
 **offset** | **String**| Number of records skipped. Defaults to 0 | [optional]

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

