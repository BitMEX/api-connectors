# SwaggerClient::AddressApi

All URIs are relative to *https://www.bitmex.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**address_get**](AddressApi.md#address_get) | **GET** /address | Get your addresses.
[**address_new**](AddressApi.md#address_new) | **POST** /address | Creates a new saved address.


# **address_get**
> Array&lt;Address&gt; address_get

Get your addresses.

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

api_instance = SwaggerClient::AddressApi.new

begin
  #Get your addresses.
  result = api_instance.address_get
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling AddressApi->address_get: #{e}"
end
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Array&lt;Address&gt;**](Address.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript



# **address_new**
> Address address_new(currency, network, address, name, opts)

Creates a new saved address.

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

api_instance = SwaggerClient::AddressApi.new

currency = 'currency_example' # String | Currency of the address. Options: `XBt`, `USDt`

network = 'network_example' # String | Selected network.

address = 'address_example' # String | Destination Address.

name = 'name_example' # String | Name of the entry, eg. 'Hardware wallet'.

opts = { 
  note: 'note_example', # String | Optional annotation.
  skip_confirm: false, # BOOLEAN | Skip e-mail confirmations for transfers to this address. Will require an email confirmation after creation.
  skip2_fa: false, # BOOLEAN | Skip 2FA confirmations for transfers to this address. Will require an email confirmation after creation.
  memo: 'memo_example' # String | Destination Memo.
}

begin
  #Creates a new saved address.
  result = api_instance.address_new(currency, network, address, name, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling AddressApi->address_new: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currency** | **String**| Currency of the address. Options: &#x60;XBt&#x60;, &#x60;USDt&#x60; | 
 **network** | **String**| Selected network. | 
 **address** | **String**| Destination Address. | 
 **name** | **String**| Name of the entry, eg. &#39;Hardware wallet&#39;. | 
 **note** | **String**| Optional annotation. | [optional] 
 **skip_confirm** | **BOOLEAN**| Skip e-mail confirmations for transfers to this address. Will require an email confirmation after creation. | [optional] [default to false]
 **skip2_fa** | **BOOLEAN**| Skip 2FA confirmations for transfers to this address. Will require an email confirmation after creation. | [optional] [default to false]
 **memo** | **String**| Destination Memo. | [optional] 

### Return type

[**Address**](Address.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript



