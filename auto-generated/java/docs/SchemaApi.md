# SchemaApi

All URIs are relative to *https://localhost/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**schemaGet**](SchemaApi.md#schemaGet) | **GET** /schema | Get model schemata for data objects returned by this API.
[**schemaWebsocketHelp**](SchemaApi.md#schemaWebsocketHelp) | **GET** /schema/websocketHelp | Returns help text &amp; subject list for websocket usage.


<a name="schemaGet"></a>
# **schemaGet**
> Object schemaGet(model)

Get model schemata for data objects returned by this API.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SchemaApi;


SchemaApi apiInstance = new SchemaApi();
String model = "model_example"; // String | Optional model filter. If omitted, will return all models.
try {
    Object result = apiInstance.schemaGet(model);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SchemaApi#schemaGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model** | **String**| Optional model filter. If omitted, will return all models. | [optional]

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="schemaWebsocketHelp"></a>
# **schemaWebsocketHelp**
> Object schemaWebsocketHelp()

Returns help text &amp; subject list for websocket usage.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SchemaApi;


SchemaApi apiInstance = new SchemaApi();
try {
    Object result = apiInstance.schemaWebsocketHelp();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SchemaApi#schemaWebsocketHelp");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

