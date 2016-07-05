# SwaggerClient::LeaderboardApi

All URIs are relative to *https://localhost/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**leaderboard_get**](LeaderboardApi.md#leaderboard_get) | **GET** /leaderboard | Get current leaderboard.


# **leaderboard_get**
> Array&lt;Leaderboard&gt; leaderboard_get(opts)

Get current leaderboard.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::LeaderboardApi.new

opts = { 
  method: "notional" # String | Ranking type. Options: \"notional\", \"ROE\"
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



