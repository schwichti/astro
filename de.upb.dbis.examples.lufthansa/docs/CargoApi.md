# CargoApi

All URIs are relative to *https://api.lufthansa.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cargoGetRouteFromDateProductCodeByOriginAndDestinationGet**](CargoApi.md#cargoGetRouteFromDateProductCodeByOriginAndDestinationGet) | **GET** /cargo/getRoute/{origin}-{destination}/{fromDate}/{productCode} | Retrieve all flights
[**cargoShipmentTrackingByAWBPrefixAndAWBNumberGet**](CargoApi.md#cargoShipmentTrackingByAWBPrefixAndAWBNumberGet) | **GET** /cargo/shipmentTracking/{aWBPrefix}-{aWBNumber} | Shipment Tracking


<a name="cargoGetRouteFromDateProductCodeByOriginAndDestinationGet"></a>
# **cargoGetRouteFromDateProductCodeByOriginAndDestinationGet**
> String cargoGetRouteFromDateProductCodeByOriginAndDestinationGet(origin, destination, fromDate, productCode, accept)

Retrieve all flights

Retrieve a list of all possible flights (both direct and connecting) between two airports on a given date. Routes are available for today and up to days in the future.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CargoApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

CargoApi apiInstance = new CargoApi();
String origin = "origin_example"; // String | Departure Airport : 3-letter IATA airport code, e.g. FRA.
String destination = "destination_example"; // String | Arrival airport : 3-letter IATA airport code, e.g. HKG.
String fromDate = "fromDate_example"; // String | Departure date in the local time of the departure airport. Based on LAT (Latest Acceptance Time). format : yyyy-MM-dd eg : 2017-07-15
String productCode = "productCode_example"; // String | Product code for requested service and specials : 3-letter eg: YNZ
String accept = "accept_example"; // String | http header: application/json or application/xml (Acceptable values are: \"application/json\", \"application/xml\")
try {
    String result = apiInstance.cargoGetRouteFromDateProductCodeByOriginAndDestinationGet(origin, destination, fromDate, productCode, accept);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CargoApi#cargoGetRouteFromDateProductCodeByOriginAndDestinationGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **origin** | **String**| Departure Airport : 3-letter IATA airport code, e.g. FRA. |
 **destination** | **String**| Arrival airport : 3-letter IATA airport code, e.g. HKG. |
 **fromDate** | **String**| Departure date in the local time of the departure airport. Based on LAT (Latest Acceptance Time). format : yyyy-MM-dd eg : 2017-07-15 |
 **productCode** | **String**| Product code for requested service and specials : 3-letter eg: YNZ | [enum: FAN, FCO, FCP, FDG, FTF, FUN, FWN, YCO, YCP, YDG, YNB, YNZ, YTF, YUN, ZXB, ZXF, ZXR]
 **accept** | **String**| http header: application/json or application/xml (Acceptable values are: \&quot;application/json\&quot;, \&quot;application/xml\&quot;) |

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cargoShipmentTrackingByAWBPrefixAndAWBNumberGet"></a>
# **cargoShipmentTrackingByAWBPrefixAndAWBNumberGet**
> String cargoShipmentTrackingByAWBPrefixAndAWBNumberGet(aWBPrefix, aWBNumber, accept)

Shipment Tracking

With this tracking service you can easily retrieve your shipment or flight status information.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CargoApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

CargoApi apiInstance = new CargoApi();
String aWBPrefix = "aWBPrefix_example"; // String | aWBPrefix : Represents the airline that is the owner of this AWB, i.e. \"020\" = Lufthansa Cargo, format : [0-9]{3} e.g. 020
String aWBNumber = "aWBNumber_example"; // String | aWBNumber : The Air Waybill Number , format : [0-9]{8} e.g. 08002050
String accept = "accept_example"; // String | http header: application/json or application/xml (Acceptable values are: \"application/json\", \"application/xml\")
try {
    String result = apiInstance.cargoShipmentTrackingByAWBPrefixAndAWBNumberGet(aWBPrefix, aWBNumber, accept);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CargoApi#cargoShipmentTrackingByAWBPrefixAndAWBNumberGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aWBPrefix** | **String**| aWBPrefix : Represents the airline that is the owner of this AWB, i.e. \&quot;020\&quot; &#x3D; Lufthansa Cargo, format : [0-9]{3} e.g. 020 |
 **aWBNumber** | **String**| aWBNumber : The Air Waybill Number , format : [0-9]{8} e.g. 08002050 |
 **accept** | **String**| http header: application/json or application/xml (Acceptable values are: \&quot;application/json\&quot;, \&quot;application/xml\&quot;) |

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

