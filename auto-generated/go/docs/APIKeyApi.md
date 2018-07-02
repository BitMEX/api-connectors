# \APIKeyApi

All URIs are relative to *https://localhost/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**APIKeyDisable**](APIKeyApi.md#APIKeyDisable) | **Post** /apiKey/disable | Disable an API Key.
[**APIKeyEnable**](APIKeyApi.md#APIKeyEnable) | **Post** /apiKey/enable | Enable an API Key.
[**APIKeyGet**](APIKeyApi.md#APIKeyGet) | **Get** /apiKey | Get your API Keys.
[**APIKeyNew**](APIKeyApi.md#APIKeyNew) | **Post** /apiKey | Create a new API Key.
[**APIKeyRemove**](APIKeyApi.md#APIKeyRemove) | **Delete** /apiKey | Remove an API Key.


# **APIKeyDisable**
> ApiKey APIKeyDisable(ctx, apiKeyID)
Disable an API Key.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **apiKeyID** | **string**| API Key ID (public component). | 

### Return type

[**ApiKey**](APIKey.md)

### Authorization

[apiKey](../README.md#apiKey), [apiNonce](../README.md#apiNonce), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **APIKeyEnable**
> ApiKey APIKeyEnable(ctx, apiKeyID)
Enable an API Key.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **apiKeyID** | **string**| API Key ID (public component). | 

### Return type

[**ApiKey**](APIKey.md)

### Authorization

[apiKey](../README.md#apiKey), [apiNonce](../README.md#apiNonce), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **APIKeyGet**
> []ApiKey APIKeyGet(ctx, optional)
Get your API Keys.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***APIKeyGetOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a APIKeyGetOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reverse** | **optional.Bool**| If true, will sort results newest first. | [default to false]

### Return type

[**[]ApiKey**](APIKey.md)

### Authorization

[apiKey](../README.md#apiKey), [apiNonce](../README.md#apiNonce), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **APIKeyNew**
> ApiKey APIKeyNew(ctx, optional)
Create a new API Key.

API Keys can only be created via the frontend.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***APIKeyNewOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a APIKeyNewOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **optional.String**| Key name. This name is for reference only. | 
 **cidr** | **optional.String**| CIDR block to restrict this key to. To restrict to a single address, append \&quot;/32\&quot;, e.g. 207.39.29.22/32. Leave blank or set to 0.0.0.0/0 to allow all IPs. Only one block may be set. &lt;a href&#x3D;\&quot;http://software77.net/cidr-101.html\&quot;&gt;More on CIDR blocks&lt;/a&gt; | 
 **permissions** | **optional.String**| Key Permissions. All keys can read margin and position data. Additional permissions must be added. Available: [\&quot;order\&quot;, \&quot;orderCancel\&quot;, \&quot;withdraw\&quot;]. | 
 **enabled** | **optional.Bool**| Set to true to enable this key on creation. Otherwise, it must be explicitly enabled via /apiKey/enable. | [default to false]
 **token** | **optional.String**| OTP Token (YubiKey, Google Authenticator) | 

### Return type

[**ApiKey**](APIKey.md)

### Authorization

[apiKey](../README.md#apiKey), [apiNonce](../README.md#apiNonce), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **APIKeyRemove**
> InlineResponse200 APIKeyRemove(ctx, apiKeyID)
Remove an API Key.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **apiKeyID** | **string**| API Key ID (public component). | 

### Return type

[**InlineResponse200**](inline_response_200.md)

### Authorization

[apiKey](../README.md#apiKey), [apiNonce](../README.md#apiNonce), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

