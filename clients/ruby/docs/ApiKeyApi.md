# SwaggerClient::ApiKeyApi

All URIs are relative to *https://localhost/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**api_key_disable**](ApiKeyApi.md#api_key_disable) | **POST** /apiKey/disable | Disable an API Key.
[**api_key_enable**](ApiKeyApi.md#api_key_enable) | **POST** /apiKey/enable | Enable an API Key.
[**api_key_get**](ApiKeyApi.md#api_key_get) | **GET** /apiKey | Get your API Keys.
[**api_key_new**](ApiKeyApi.md#api_key_new) | **POST** /apiKey | Create a new API Key.
[**api_key_remove**](ApiKeyApi.md#api_key_remove) | **DELETE** /apiKey | Remove an API Key.


# **api_key_disable**
> ApiKey api_key_disable(api_key_id)

Disable an API Key.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::ApiKeyApi.new

api_key_id = "api_key_id_example" # String | API Key ID (public component).


begin
  #Disable an API Key.
  result = api_instance.api_key_disable(api_key_id)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ApiKeyApi->api_key_disable: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **api_key_id** | **String**| API Key ID (public component). | 

### Return type

[**ApiKey**](ApiKey.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript



# **api_key_enable**
> ApiKey api_key_enable(api_key_id)

Enable an API Key.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::ApiKeyApi.new

api_key_id = "api_key_id_example" # String | API Key ID (public component).


begin
  #Enable an API Key.
  result = api_instance.api_key_enable(api_key_id)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ApiKeyApi->api_key_enable: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **api_key_id** | **String**| API Key ID (public component). | 

### Return type

[**ApiKey**](ApiKey.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript



# **api_key_get**
> Array&lt;ApiKey&gt; api_key_get(opts)

Get your API Keys.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::ApiKeyApi.new

opts = { 
  reverse: false # BOOLEAN | If true, will sort results newest first.
}

begin
  #Get your API Keys.
  result = api_instance.api_key_get(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ApiKeyApi->api_key_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reverse** | **BOOLEAN**| If true, will sort results newest first. | [optional] [default to false]

### Return type

[**Array&lt;ApiKey&gt;**](ApiKey.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript



# **api_key_new**
> ApiKey api_key_new(opts)

Create a new API Key.

API Keys can also be created via [this Python script](https://github.com/BitMEX/market-maker/blob/master/generate-api-key.py) See the [API Key Documentation](/app/apiKeys) for more information on capabilities.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::ApiKeyApi.new

opts = { 
  name: "name_example", # String | Key name. This name is for reference only.
  cidr: "cidr_example", # String | CIDR block to restrict this key to. To restrict to a single address, append \"/32\", e.g. 207.39.29.22/32. Leave blank or set to 0.0.0.0/0 to allow all IPs. Only one block may be set. <a href=\"http://software77.net/cidr-101.html\">More on CIDR blocks</a>
  permissions: "permissions_example", # String | Key Permissions. All keys can read margin and position data. Additional permissions must be added. Available: [\"order\", \"withdraw\"].
  enabled: false, # BOOLEAN | Set to true to enable this key on creation. Otherwise, it must be explicitly enabled via /apiKey/enable.
  token: "token_example" # String | OTP Token (YubiKey, Google Authenticator)
}

begin
  #Create a new API Key.
  result = api_instance.api_key_new(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ApiKeyApi->api_key_new: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Key name. This name is for reference only. | [optional] 
 **cidr** | **String**| CIDR block to restrict this key to. To restrict to a single address, append \&quot;/32\&quot;, e.g. 207.39.29.22/32. Leave blank or set to 0.0.0.0/0 to allow all IPs. Only one block may be set. &lt;a href&#x3D;\&quot;http://software77.net/cidr-101.html\&quot;&gt;More on CIDR blocks&lt;/a&gt; | [optional] 
 **permissions** | **String**| Key Permissions. All keys can read margin and position data. Additional permissions must be added. Available: [\&quot;order\&quot;, \&quot;withdraw\&quot;]. | [optional] 
 **enabled** | **BOOLEAN**| Set to true to enable this key on creation. Otherwise, it must be explicitly enabled via /apiKey/enable. | [optional] [default to false]
 **token** | **String**| OTP Token (YubiKey, Google Authenticator) | [optional] 

### Return type

[**ApiKey**](ApiKey.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript



# **api_key_remove**
> InlineResponse200 api_key_remove(api_key_id)

Remove an API Key.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::ApiKeyApi.new

api_key_id = "api_key_id_example" # String | API Key ID (public component).


begin
  #Remove an API Key.
  result = api_instance.api_key_remove(api_key_id)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ApiKeyApi->api_key_remove: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **api_key_id** | **String**| API Key ID (public component). | 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript



