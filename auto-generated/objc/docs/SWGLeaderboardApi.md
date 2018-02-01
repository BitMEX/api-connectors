# SWGLeaderboardApi

All URIs are relative to *https://localhost/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**leaderboardGet**](SWGLeaderboardApi.md#leaderboardget) | **GET** /leaderboard | Get current leaderboard.


# **leaderboardGet**
```objc
-(NSURLSessionTask*) leaderboardGetWithMethod: (NSString*) method
        completionHandler: (void (^)(NSArray<SWGLeaderboard>* output, NSError* error)) handler;
```

Get current leaderboard.

### Example 
```objc

NSString* method = @"notional"; // Ranking type. Options: \"notional\", \"ROE\" (optional) (default to notional)

SWGLeaderboardApi*apiInstance = [[SWGLeaderboardApi alloc] init];

// Get current leaderboard.
[apiInstance leaderboardGetWithMethod:method
          completionHandler: ^(NSArray<SWGLeaderboard>* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGLeaderboardApi->leaderboardGet: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **method** | **NSString***| Ranking type. Options: \&quot;notional\&quot;, \&quot;ROE\&quot; | [optional] [default to notional]

### Return type

[**NSArray<SWGLeaderboard>***](SWGLeaderboard.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

