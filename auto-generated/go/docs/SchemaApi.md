# \SchemaApi

All URIs are relative to *https://www.bitmex.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**SchemaGet**](SchemaApi.md#SchemaGet) | **Get** /schema | Get model schemata for data objects returned by this API.
[**SchemaWebsocketHelp**](SchemaApi.md#SchemaWebsocketHelp) | **Get** /schema/websocketHelp | Returns help text &amp; subject list for websocket usage.


# **SchemaGet**
> interface{} SchemaGet(ctx, optional)
Get model schemata for data objects returned by this API.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***SchemaApiSchemaGetOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a SchemaApiSchemaGetOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model** | **optional.String**| Optional model filter. If omitted, will return all models. | 

### Return type

**interface{}**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **SchemaWebsocketHelp**
> interface{} SchemaWebsocketHelp(ctx, )
Returns help text & subject list for websocket usage.

### Required Parameters
This endpoint does not need any parameter.

### Return type

**interface{}**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

