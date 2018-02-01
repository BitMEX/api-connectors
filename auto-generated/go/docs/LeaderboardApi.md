# \LeaderboardApi

All URIs are relative to *https://localhost/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**LeaderboardGet**](LeaderboardApi.md#LeaderboardGet) | **Get** /leaderboard | Get current leaderboard.


# **LeaderboardGet**
> []Leaderboard LeaderboardGet(optional)
Get current leaderboard.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **method** | **string**| Ranking type. Options: \&quot;notional\&quot;, \&quot;ROE\&quot; | [default to notional]

### Return type

[**[]Leaderboard**](Leaderboard.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

