# SwaggerClient::UserEventApi

All URIs are relative to *https://www.bitmex.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**user_event_get**](UserEventApi.md#user_event_get) | **GET** /userEvent | Get your user events


# **user_event_get**
> Array&lt;UserEvent&gt; user_event_get(opts)

Get your user events

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

api_instance = SwaggerClient::UserEventApi.new

opts = { 
  count: 150, # Float | Number of results to fetch.
  start_id: 1.2 # Float | Cursor for pagination.
}

begin
  #Get your user events
  result = api_instance.user_event_get(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling UserEventApi->user_event_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **count** | **Float**| Number of results to fetch. | [optional] [default to 150]
 **start_id** | **Float**| Cursor for pagination. | [optional] 

### Return type

[**Array&lt;UserEvent&gt;**](UserEvent.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript



