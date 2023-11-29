# \UserEventApi

All URIs are relative to *https://www.bitmex.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**UserEventGet**](UserEventApi.md#UserEventGet) | **Get** /userEvent | Get your user events


# **UserEventGet**
> []UserEvent UserEventGet(ctx, optional)
Get your user events

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***UserEventApiUserEventGetOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a UserEventApiUserEventGetOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **count** | **optional.Float64**| Number of results to fetch. | [default to 150]
 **startId** | **optional.Float64**| Cursor for pagination. | 

### Return type

[**[]UserEvent**](UserEvent.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

