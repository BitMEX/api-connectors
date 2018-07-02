# SWGLeaderboardApi

All URIs are relative to *https://localhost/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**leaderboardGet**](SWGLeaderboardApi.md#leaderboardget) | **GET** /leaderboard | Get current leaderboard.
[**leaderboardGetName**](SWGLeaderboardApi.md#leaderboardgetname) | **GET** /leaderboard/name | Get your alias on the leaderboard.


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

# **leaderboardGetName**
```objc
-(NSURLSessionTask*) leaderboardGetNameWithCompletionHandler: 
        (void (^)(SWGInlineResponse2001* output, NSError* error)) handler;
```

Get your alias on the leaderboard.

### Example 
```objc
SWGDefaultConfiguration *apiConfig = [SWGDefaultConfiguration sharedConfig];

// Configure API key authorization: (authentication scheme: apiKey)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"api-key"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"api-key"];

// Configure API key authorization: (authentication scheme: apiNonce)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"api-nonce"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"api-nonce"];

// Configure API key authorization: (authentication scheme: apiSignature)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"api-signature"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"api-signature"];



SWGLeaderboardApi*apiInstance = [[SWGLeaderboardApi alloc] init];

// Get your alias on the leaderboard.
[apiInstance leaderboardGetNameWithCompletionHandler: 
          ^(SWGInlineResponse2001* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGLeaderboardApi->leaderboardGetName: %@", error);
                        }
                    }];
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**SWGInlineResponse2001***](SWGInlineResponse2001.md)

### Authorization

[apiKey](../README.md#apiKey), [apiNonce](../README.md#apiNonce), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

