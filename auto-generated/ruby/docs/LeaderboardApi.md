# SwaggerClient::LeaderboardApi

All URIs are relative to *https://www.bitmex.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**leaderboard_get**](LeaderboardApi.md#leaderboard_get) | **GET** /leaderboard | Get current leaderboard.
[**leaderboard_get_name**](LeaderboardApi.md#leaderboard_get_name) | **GET** /leaderboard/name | Get your alias on the leaderboard.


# **leaderboard_get**
> Array&lt;Leaderboard&gt; leaderboard_get(opts)

Get current leaderboard.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::LeaderboardApi.new

opts = { 
  method: 'notional' # String | Ranking type. Options: \"notional\", \"ROE\"
}

begin
  #Get current leaderboard.
  result = api_instance.leaderboard_get(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling LeaderboardApi->leaderboard_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **method** | **String**| Ranking type. Options: \&quot;notional\&quot;, \&quot;ROE\&quot; | [optional] [default to notional]

### Return type

[**Array&lt;Leaderboard&gt;**](Leaderboard.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript



# **leaderboard_get_name**
> InlineResponse200 leaderboard_get_name

Get your alias on the leaderboard.

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

api_instance = SwaggerClient::LeaderboardApi.new

begin
  #Get your alias on the leaderboard.
  result = api_instance.leaderboard_get_name
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling LeaderboardApi->leaderboard_get_name: #{e}"
end
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript



