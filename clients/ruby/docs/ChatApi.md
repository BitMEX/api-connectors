# SwaggerClient::ChatApi

All URIs are relative to *https://localhost/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**chat_get**](ChatApi.md#chat_get) | **GET** /chat | Get chat messages.
[**chat_get_connected**](ChatApi.md#chat_get_connected) | **GET** /chat/connected | Get connected users.
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
  count: 100, # Float | Number of results to fetch.
  start: 0, # Float | Starting point for results.
  reverse: true # BOOLEAN | If true, will sort results newest first.
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
 **count** | **Float**| Number of results to fetch. | [optional] [default to 100]
 **start** | **Float**| Starting point for results. | [optional] [default to 0]
 **reverse** | **BOOLEAN**| If true, will sort results newest first. | [optional] [default to true]

### Return type

[**Array&lt;Chat&gt;**](Chat.md)

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



# **chat_new**
> Chat chat_new(message)

Send a chat message.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::ChatApi.new

message = "message_example" # String | 


begin
  #Send a chat message.
  result = api_instance.chat_new(message)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ChatApi->chat_new: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **message** | **String**|  | 

### Return type

[**Chat**](Chat.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript



