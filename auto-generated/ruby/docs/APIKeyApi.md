# SwaggerClient::APIKeyApi

All URIs are relative to *https://www.bitmex.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**a_pi_key_get**](APIKeyApi.md#a_pi_key_get) | **GET** /apiKey | Get your API Keys.


# **a_pi_key_get**
> Array&lt;APIKey&gt; a_pi_key_get(opts)

Get your API Keys.

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

api_instance = SwaggerClient::APIKeyApi.new

opts = { 
  reverse: false # BOOLEAN | If true, will sort results newest first.
}

begin
  #Get your API Keys.
  result = api_instance.a_pi_key_get(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling APIKeyApi->a_pi_key_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reverse** | **BOOLEAN**| If true, will sort results newest first. | [optional] [default to false]

### Return type

[**Array&lt;APIKey&gt;**](APIKey.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript



