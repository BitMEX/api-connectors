# SwaggerClient::ChatApi

All URIs are relative to *https://www.bitmex.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**chat_get**](ChatApi.md#chat_get) | **GET** /chat | Get chat messages.
[**chat_get_channels**](ChatApi.md#chat_get_channels) | **GET** /chat/channels | Get available channels.
[**chat_get_connected**](ChatApi.md#chat_get_connected) | **GET** /chat/connected | Get connected users.
[**chat_get_pinned_message**](ChatApi.md#chat_get_pinned_message) | **GET** /chat/pinned | Get pinned message for a channel.
[**chat_new**](ChatApi.md#chat_new) | **POST** /chat | Send a chat message.


# **chat_get**
> Array&lt;Chat&gt; chat_get(opts)

Get chat messages.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::ChatApi.new

opts = { 
  count: 100, # Integer | Number of results to fetch.
  start: 0, # Integer | Starting ID for results.
  reverse: true, # BOOLEAN | If true, will sort results newest first.
  channel_id: 1 # Float | Channel id. GET /chat/channels for ids. Global English by default
}

begin
  #Get chat messages.
  result = api_instance.chat_get(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ChatApi->chat_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **count** | **Integer**| Number of results to fetch. | [optional] [default to 100]
 **start** | **Integer**| Starting ID for results. | [optional] [default to 0]
 **reverse** | **BOOLEAN**| If true, will sort results newest first. | [optional] [default to true]
 **channel_id** | **Float**| Channel id. GET /chat/channels for ids. Global English by default | [optional] [default to 1]

### Return type

[**Array&lt;Chat&gt;**](Chat.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript



# **chat_get_channels**
> Array&lt;ChatChannel&gt; chat_get_channels

Get available channels.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::ChatApi.new

begin
  #Get available channels.
  result = api_instance.chat_get_channels
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ChatApi->chat_get_channels: #{e}"
end
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Array&lt;ChatChannel&gt;**](ChatChannel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript



# **chat_get_connected**
> ConnectedUsers chat_get_connected

Get connected users.

Returns an array with browser users in the first position and API users (bots) in the second position.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::ChatApi.new

begin
  #Get connected users.
  result = api_instance.chat_get_connected
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ChatApi->chat_get_connected: #{e}"
end
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ConnectedUsers**](ConnectedUsers.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript



# **chat_get_pinned_message**
> PinnedMessage chat_get_pinned_message(channel_id)

Get pinned message for a channel.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::ChatApi.new

channel_id = 1.2 # Float | 


begin
  #Get pinned message for a channel.
  result = api_instance.chat_get_pinned_message(channel_id)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ChatApi->chat_get_pinned_message: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channel_id** | **Float**|  | 

### Return type

[**PinnedMessage**](PinnedMessage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript



# **chat_new**
> Chat chat_new(message, opts)

Send a chat message.

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

api_instance = SwaggerClient::ChatApi.new

message = 'message_example' # String | 

opts = { 
  channel_id: 1 # Float | Channel to post to. Default 1 (English).
}

begin
  #Send a chat message.
  result = api_instance.chat_new(message, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ChatApi->chat_new: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **message** | **String**|  | 
 **channel_id** | **Float**| Channel to post to. Default 1 (English). | [optional] [default to 1]

### Return type

[**Chat**](Chat.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript



