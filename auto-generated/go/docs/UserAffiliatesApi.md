# \UserAffiliatesApi

All URIs are relative to *https://www.bitmex.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**UserAffiliatesGet**](UserAffiliatesApi.md#UserAffiliatesGet) | **Get** /userAffiliates | Get user&#39;s affiliates to a given depth


# **UserAffiliatesGet**
> []XAny UserAffiliatesGet(ctx, optional)
Get user's affiliates to a given depth

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***UserAffiliatesApiUserAffiliatesGetOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a UserAffiliatesApiUserAffiliatesGetOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **depth** | **optional.Float64**| the depth of affiliates to return. Eg depth &#x3D; 2 would return direct affiliates and their affiliates | 
 **targetAccountId** | **optional.Float64**| AccountId of Sub-Affiliate Account | 
 **selectUserId** | **optional.Float64**| User id of result array to keep | 

### Return type

[**[]XAny**](x-any.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

