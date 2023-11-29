# SwaggerClient::UserAffiliatesApi

All URIs are relative to *https://www.bitmex.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**user_affiliates_get**](UserAffiliatesApi.md#user_affiliates_get) | **GET** /userAffiliates | Get user&#39;s affiliates to a given depth


# **user_affiliates_get**
> Array&lt;XAny&gt; user_affiliates_get(opts)

Get user's affiliates to a given depth

### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure API key authorization: apiExpires
  config.api_key['api-expires'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-expires'] = 'Bearer'

  # Configure API key authorization: apiKey
  config.api_key['api-key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-key'] = 'Bearer'

  # Configure API key authorization: apiSignature
  config.api_key['api-signature'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-signature'] = 'Bearer'
end

api_instance = SwaggerClient::UserAffiliatesApi.new

opts = { 
  depth: 1.2 # Float | the depth of affiliates to return. Eg depth = 2 would return direct affiliates and their affiliates
}

begin
  #Get user's affiliates to a given depth
  result = api_instance.user_affiliates_get(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling UserAffiliatesApi->user_affiliates_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **depth** | **Float**| the depth of affiliates to return. Eg depth &#x3D; 2 would return direct affiliates and their affiliates | [optional] 

### Return type

[**Array&lt;XAny&gt;**](XAny.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript



