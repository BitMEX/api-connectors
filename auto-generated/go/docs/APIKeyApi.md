# \APIKeyApi

All URIs are relative to *https://www.bitmex.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**APIKeyGet**](APIKeyApi.md#APIKeyGet) | **Get** /apiKey | Get your API Keys.


# **APIKeyGet**
> []ApiKey APIKeyGet(ctx, optional)
Get your API Keys.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***APIKeyApiAPIKeyGetOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a APIKeyApiAPIKeyGetOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reverse** | **optional.Bool**| If true, will sort results newest first. | [default to false]

### Return type

[**[]ApiKey**](APIKey.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

