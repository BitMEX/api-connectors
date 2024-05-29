# SWGUserAffiliatesApi

All URIs are relative to *https://www.bitmex.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**userAffiliatesGet**](SWGUserAffiliatesApi.md#useraffiliatesget) | **GET** /userAffiliates | Get user&#39;s affiliates to a given depth


# **userAffiliatesGet**
```objc
-(NSURLSessionTask*) userAffiliatesGetWithDepth: (NSNumber*) depth
    targetAccountId: (NSNumber*) targetAccountId
    selectUserId: (NSNumber*) selectUserId
        completionHandler: (void (^)(NSArray<SWGXAny>* output, NSError* error)) handler;
```

Get user's affiliates to a given depth

### Example 
```objc
SWGDefaultConfiguration *apiConfig = [SWGDefaultConfiguration sharedConfig];

// Configure API key authorization: (authentication scheme: apiExpires)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"api-expires"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"api-expires"];

// Configure API key authorization: (authentication scheme: apiKey)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"api-key"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"api-key"];

// Configure API key authorization: (authentication scheme: apiSignature)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"api-signature"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"api-signature"];


NSNumber* depth = @1.2; // the depth of affiliates to return. Eg depth = 2 would return direct affiliates and their affiliates (optional)
NSNumber* targetAccountId = @1.2; // AccountId of Sub-Affiliate Account (optional)
NSNumber* selectUserId = @1.2; // User id of result array to keep (optional)

SWGUserAffiliatesApi*apiInstance = [[SWGUserAffiliatesApi alloc] init];

// Get user's affiliates to a given depth
[apiInstance userAffiliatesGetWithDepth:depth
              targetAccountId:targetAccountId
              selectUserId:selectUserId
          completionHandler: ^(NSArray<SWGXAny>* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGUserAffiliatesApi->userAffiliatesGet: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **depth** | **NSNumber***| the depth of affiliates to return. Eg depth &#x3D; 2 would return direct affiliates and their affiliates | [optional] 
 **targetAccountId** | **NSNumber***| AccountId of Sub-Affiliate Account | [optional] 
 **selectUserId** | **NSNumber***| User id of result array to keep | [optional] 

### Return type

[**NSArray<SWGXAny>***](SWGXAny.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

