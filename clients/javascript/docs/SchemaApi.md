# BitMexApi.SchemaApi

All URIs are relative to *https://localhost/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**schemaGet**](SchemaApi.md#schemaGet) | **GET** /schema | Get model schemata for data objects returned by this API.
[**schemaWebsocketHelp**](SchemaApi.md#schemaWebsocketHelp) | **GET** /schema/websocketHelp | Returns help text &amp; subject list for websocket usage.


<a name="schemaGet"></a>
# **schemaGet**
> Object schemaGet(opts)

Get model schemata for data objects returned by this API.

### Example
```javascript
import BitMexApi from 'bit_mex_api';

let apiInstance = new BitMexApi.SchemaApi();

let opts = { 
  'model': "model_example" // String | Optional model filter. If omitted, will return all models.
};

apiInstance.schemaGet(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
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
```javascript
import BitMexApi from 'bit_mex_api';

let apiInstance = new BitMexApi.SchemaApi();

apiInstance.schemaWebsocketHelp((error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
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

