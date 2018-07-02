# LeaderboardApi

All URIs are relative to *https://localhost/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**leaderboardGet**](LeaderboardApi.md#leaderboardGet) | **GET** /leaderboard | Get current leaderboard.
[**leaderboardGetName**](LeaderboardApi.md#leaderboardGetName) | **GET** /leaderboard/name | Get your alias on the leaderboard.


<a name="leaderboardGet"></a>
# **leaderboardGet**
> List&lt;Leaderboard&gt; leaderboardGet(method)

Get current leaderboard.

### Example
```java
// Import classes:
//import io.swagger.client.api.LeaderboardApi;

LeaderboardApi apiInstance = new LeaderboardApi();
String method = "notional"; // String | Ranking type. Options: \"notional\", \"ROE\"
try {
    List<Leaderboard> result = apiInstance.leaderboardGet(method);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LeaderboardApi#leaderboardGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **method** | **String**| Ranking type. Options: \&quot;notional\&quot;, \&quot;ROE\&quot; | [optional] [default to notional]

### Return type

[**List&lt;Leaderboard&gt;**](Leaderboard.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="leaderboardGetName"></a>
# **leaderboardGetName**
> InlineResponse2001 leaderboardGetName()

Get your alias on the leaderboard.

### Example
```java
// Import classes:
//import io.swagger.client.api.LeaderboardApi;

LeaderboardApi apiInstance = new LeaderboardApi();
try {
    InlineResponse2001 result = apiInstance.leaderboardGetName();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LeaderboardApi#leaderboardGetName");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

[apiKey](../README.md#apiKey), [apiNonce](../README.md#apiNonce), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

