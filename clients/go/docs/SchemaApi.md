# \SchemaApi

All URIs are relative to *https://localhost/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**SchemaGet**](SchemaApi.md#SchemaGet) | **Get** /schema | Get model schemata for data objects returned by this API.
[**SchemaWebsocketHelp**](SchemaApi.md#SchemaWebsocketHelp) | **Get** /schema/websocketHelp | Returns help text &amp; subject list for websocket usage.


# **SchemaGet**
> Object SchemaGet($model)

Get model schemata for data objects returned by this API.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model** | **string**| Optional model filter. If omitted, will return all models. | [optional] 

### Return type

[**Object**](object.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **SchemaWebsocketHelp**
> Object SchemaWebsocketHelp()

Returns help text & subject list for websocket usage.


### Parameters
This endpoint does not need any parameter.

### Return type

[**Object**](object.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

