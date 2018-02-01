# SwaggerClient::APIKeyApi

All URIs are relative to *https://localhost/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**a_pi_key_disable**](APIKeyApi.md#a_pi_key_disable) | **POST** /apiKey/disable | Disable an API Key.
[**a_pi_key_enable**](APIKeyApi.md#a_pi_key_enable) | **POST** /apiKey/enable | Enable an API Key.
[**a_pi_key_get**](APIKeyApi.md#a_pi_key_get) | **GET** /apiKey | Get your API Keys.
[**a_pi_key_new**](APIKeyApi.md#a_pi_key_new) | **POST** /apiKey | Create a new API Key.
[**a_pi_key_remove**](APIKeyApi.md#a_pi_key_remove) | **DELETE** /apiKey | Remove an API Key.


# **a_pi_key_disable**
> APIKey a_pi_key_disable(api_key_id)

Disable an API Key.

### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure API key authorization: apiKey
  config.api_key['api-key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-key'] = 'Bearer'

  # Configure API key authorization: apiNonce
  config.api_key['api-nonce'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-nonce'] = 'Bearer'

  # Configure API key authorization: apiSignature
  config.api_key['api-signature'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-signature'] = 'Bearer'
end

api_instance = SwaggerClient::APIKeyApi.new

api_key_id = "api_key_id_example" # String | API Key ID (public component).


begin
  #Disable an API Key.
  result = api_instance.a_pi_key_disable(api_key_id)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling APIKeyApi->a_pi_key_disable: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **api_key_id** | **String**| API Key ID (public component). | 

### Return type

[**APIKey**](APIKey.md)

### Authorization

[apiKey](../README.md#apiKey), [apiNonce](../README.md#apiNonce), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript



# **a_pi_key_enable**
> APIKey a_pi_key_enable(api_key_id)

Enable an API Key.

### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure API key authorization: apiKey
  config.api_key['api-key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-key'] = 'Bearer'

  # Configure API key authorization: apiNonce
  config.api_key['api-nonce'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-nonce'] = 'Bearer'

  # Configure API key authorization: apiSignature
  config.api_key['api-signature'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-signature'] = 'Bearer'
end

api_instance = SwaggerClient::APIKeyApi.new

api_key_id = "api_key_id_example" # String | API Key ID (public component).


begin
  #Enable an API Key.
  result = api_instance.a_pi_key_enable(api_key_id)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling APIKeyApi->a_pi_key_enable: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **api_key_id** | **String**| API Key ID (public component). | 

### Return type

[**APIKey**](APIKey.md)

### Authorization

[apiKey](../README.md#apiKey), [apiNonce](../README.md#apiNonce), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript



# **a_pi_key_get**
> Array&lt;APIKey&gt; a_pi_key_get(opts)

Get your API Keys.

### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure API key authorization: apiKey
  config.api_key['api-key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-key'] = 'Bearer'

  # Configure API key authorization: apiNonce
  config.api_key['api-nonce'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-nonce'] = 'Bearer'

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

[apiKey](../README.md#apiKey), [apiNonce](../README.md#apiNonce), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript



# **a_pi_key_new**
> APIKey a_pi_key_new(opts)

Create a new API Key.

API Keys can also be created via [this Python script](https://github.com/BitMEX/market-maker/blob/master/generate-api-key.py) See the [API Key Documentation](/app/apiKeys) for more information on capabilities.

### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure API key authorization: apiKey
  config.api_key['api-key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-key'] = 'Bearer'

  # Configure API key authorization: apiNonce
  config.api_key['api-nonce'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-nonce'] = 'Bearer'

  # Configure API key authorization: apiSignature
  config.api_key['api-signature'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-signature'] = 'Bearer'
end

api_instance = SwaggerClient::APIKeyApi.new

opts = { 
  name: "name_example", # String | Key name. This name is for reference only.
  cidr: "cidr_example", # String | CIDR block to restrict this key to. To restrict to a single address, append \"/32\", e.g. 207.39.29.22/32. Leave blank or set to 0.0.0.0/0 to allow all IPs. Only one block may be set. <a href=\"http://software77.net/cidr-101.html\">More on CIDR blocks</a>
  permissions: "permissions_example", # String | Key Permissions. All keys can read margin and position data. Additional permissions must be added. Available: [\"order\", \"orderCancel\", \"withdraw\"].
  enabled: false, # BOOLEAN | Set to true to enable this key on creation. Otherwise, it must be explicitly enabled via /apiKey/enable.
  token: "token_example" # String | OTP Token (YubiKey, Google Authenticator)
}

begin
  #Create a new API Key.
  result = api_instance.a_pi_key_new(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling APIKeyApi->a_pi_key_new: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Key name. This name is for reference only. | [optional] 
 **cidr** | **String**| CIDR block to restrict this key to. To restrict to a single address, append \&quot;/32\&quot;, e.g. 207.39.29.22/32. Leave blank or set to 0.0.0.0/0 to allow all IPs. Only one block may be set. &lt;a href&#x3D;\&quot;http://software77.net/cidr-101.html\&quot;&gt;More on CIDR blocks&lt;/a&gt; | [optional] 
 **permissions** | **String**| Key Permissions. All keys can read margin and position data. Additional permissions must be added. Available: [\&quot;order\&quot;, \&quot;orderCancel\&quot;, \&quot;withdraw\&quot;]. | [optional] 
 **enabled** | **BOOLEAN**| Set to true to enable this key on creation. Otherwise, it must be explicitly enabled via /apiKey/enable. | [optional] [default to false]
 **token** | **String**| OTP Token (YubiKey, Google Authenticator) | [optional] 

### Return type

[**APIKey**](APIKey.md)

### Authorization

[apiKey](../README.md#apiKey), [apiNonce](../README.md#apiNonce), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript



# **a_pi_key_remove**
> InlineResponse200 a_pi_key_remove(api_key_id)

Remove an API Key.

### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure API key authorization: apiKey
  config.api_key['api-key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-key'] = 'Bearer'

  # Configure API key authorization: apiNonce
  config.api_key['api-nonce'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-nonce'] = 'Bearer'

  # Configure API key authorization: apiSignature
  config.api_key['api-signature'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-signature'] = 'Bearer'
end

api_instance = SwaggerClient::APIKeyApi.new

api_key_id = "api_key_id_example" # String | API Key ID (public component).


begin
  #Remove an API Key.
  result = api_instance.a_pi_key_remove(api_key_id)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling APIKeyApi->a_pi_key_remove: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **api_key_id** | **String**| API Key ID (public component). | 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[apiKey](../README.md#apiKey), [apiNonce](../README.md#apiNonce), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript



