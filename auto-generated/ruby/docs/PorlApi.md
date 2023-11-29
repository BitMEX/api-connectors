# SwaggerClient::PorlApi

All URIs are relative to *https://www.bitmex.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**porl_get_nonce**](PorlApi.md#porl_get_nonce) | **GET** /porl/nonce | Get your Proof of Reserves nonce and data.
[**porl_get_snapshots**](PorlApi.md#porl_get_snapshots) | **GET** /porl/snapshots | Get Proof of Reserves historical snapshots


# **porl_get_nonce**
> Porl porl_get_nonce

Get your Proof of Reserves nonce and data.

## Proof of Reserves Nonce  This endpoint will return the nonce and associated data needed to validate BitMEX reserves data.  <! TODO link to docs, GitHub, etc > 

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

api_instance = SwaggerClient::PorlApi.new

begin
  #Get your Proof of Reserves nonce and data.
  result = api_instance.porl_get_nonce
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling PorlApi->porl_get_nonce: #{e}"
end
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Porl**](Porl.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript



# **porl_get_snapshots**
> Array&lt;XAny&gt; porl_get_snapshots

Get Proof of Reserves historical snapshots

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::PorlApi.new

begin
  #Get Proof of Reserves historical snapshots
  result = api_instance.porl_get_snapshots
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling PorlApi->porl_get_snapshots: #{e}"
end
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Array&lt;XAny&gt;**](XAny.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript



