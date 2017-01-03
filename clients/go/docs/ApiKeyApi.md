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
> ApiKey APIKeyDisable($apiKeyID)

Disable an API Key.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiKeyID** | **string**| API Key ID (public component). | 

### Return type

[**ApiKey**](APIKey.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **APIKeyEnable**
> ApiKey APIKeyEnable($apiKeyID)

Enable an API Key.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiKeyID** | **string**| API Key ID (public component). | 

### Return type

[**ApiKey**](APIKey.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **APIKeyGet**
> []ApiKey APIKeyGet($reverse)

Get your API Keys.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reverse** | **bool**| If true, will sort results newest first. | [optional] [default to false]

### Return type

[**[]ApiKey**](APIKey.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **APIKeyNew**
> ApiKey APIKeyNew($name, $cidr, $permissions, $enabled, $token)

Create a new API Key.

API Keys can also be created via [this Python script](https://github.com/BitMEX/market-maker/blob/master/generate-api-key.py) See the [API Key Documentation](/app/apiKeys) for more information on capabilities.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **string**| Key name. This name is for reference only. | [optional] 
 **cidr** | **string**| CIDR block to restrict this key to. To restrict to a single address, append \&quot;/32\&quot;, e.g. 207.39.29.22/32. Leave blank or set to 0.0.0.0/0 to allow all IPs. Only one block may be set. &lt;a href&#x3D;\&quot;http://software77.net/cidr-101.html\&quot;&gt;More on CIDR blocks&lt;/a&gt; | [optional] 
 **permissions** | **string**| Key Permissions. All keys can read margin and position data. Additional permissions must be added. Available: [\&quot;order\&quot;, \&quot;withdraw\&quot;]. | [optional] 
 **enabled** | **bool**| Set to true to enable this key on creation. Otherwise, it must be explicitly enabled via /apiKey/enable. | [optional] [default to false]
 **token** | **string**| OTP Token (YubiKey, Google Authenticator) | [optional] 

### Return type

[**ApiKey**](APIKey.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **APIKeyRemove**
> InlineResponse200 APIKeyRemove($apiKeyID)

Remove an API Key.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiKeyID** | **string**| API Key ID (public component). | 

### Return type

[**InlineResponse200**](inline_response_200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

