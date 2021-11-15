# \LeaderboardApi

All URIs are relative to *https://www.bitmex.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**LeaderboardGet**](LeaderboardApi.md#LeaderboardGet) | **Get** /leaderboard | Get current leaderboard.
[**LeaderboardGetName**](LeaderboardApi.md#LeaderboardGetName) | **Get** /leaderboard/name | Get your alias on the leaderboard.


# **LeaderboardGet**
> []Leaderboard LeaderboardGet(ctx, optional)
Get current leaderboard.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***LeaderboardApiLeaderboardGetOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a LeaderboardApiLeaderboardGetOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **method** | **optional.String**| Ranking type. Options: \&quot;notional\&quot;, \&quot;ROE\&quot; | [default to notional]

### Return type

[**[]Leaderboard**](Leaderboard.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **LeaderboardGetName**
> InlineResponse200 LeaderboardGetName(ctx, )
Get your alias on the leaderboard.

### Required Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse200**](inline_response_200.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

