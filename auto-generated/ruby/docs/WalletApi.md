# SwaggerClient::WalletApi

All URIs are relative to *https://www.bitmex.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**wallet_get_assets_config**](WalletApi.md#wallet_get_assets_config) | **GET** /wallet/assets | Get Assets Config
[**wallet_get_networks_config**](WalletApi.md#wallet_get_networks_config) | **GET** /wallet/networks | Get Networks Config


# **wallet_get_assets_config**
> Array&lt;AssetsConfig&gt; wallet_get_assets_config

Get Assets Config

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::WalletApi.new

begin
  #Get Assets Config
  result = api_instance.wallet_get_assets_config
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling WalletApi->wallet_get_assets_config: #{e}"
end
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Array&lt;AssetsConfig&gt;**](AssetsConfig.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript



# **wallet_get_networks_config**
> Array&lt;NetworksConfig&gt; wallet_get_networks_config

Get Networks Config

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::WalletApi.new

begin
  #Get Networks Config
  result = api_instance.wallet_get_networks_config
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling WalletApi->wallet_get_networks_config: #{e}"
end
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Array&lt;NetworksConfig&gt;**](NetworksConfig.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript



