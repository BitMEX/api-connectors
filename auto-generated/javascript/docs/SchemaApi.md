# BitMexApi.SchemaApi

All URIs are relative to *https://www.bitmex.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**schemaGet**](SchemaApi.md#schemaGet) | **GET** /schema | Get model schemata for data objects returned by this API.
[**schemaWebsocketHelp**](SchemaApi.md#schemaWebsocketHelp) | **GET** /schema/websocketHelp | Returns help text & subject list for websocket usage.


<a name="schemaGet"></a>
# **schemaGet**
> Object schemaGet(opts)

Get model schemata for data objects returned by this API.

### Example
```javascript
var BitMexApi = require('bit_mex_api');

var apiInstance = new BitMexApi.SchemaApi();

var opts = { 
  'model': "model_example" // String | Optional model filter. If omitted, will return all models.
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.schemaGet(opts, callback);
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

Returns help text & subject list for websocket usage.

### Example
```javascript
var BitMexApi = require('bit_mex_api');

var apiInstance = new BitMexApi.SchemaApi();

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.schemaWebsocketHelp(callback);
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

