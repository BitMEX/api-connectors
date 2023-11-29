# SWGPorlApi

All URIs are relative to *https://www.bitmex.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**porlGetNonce**](SWGPorlApi.md#porlgetnonce) | **GET** /porl/nonce | Get your Proof of Reserves nonce and data.
[**porlGetSnapshots**](SWGPorlApi.md#porlgetsnapshots) | **GET** /porl/snapshots | Get Proof of Reserves historical snapshots


# **porlGetNonce**
```objc
-(NSURLSessionTask*) porlGetNonceWithCompletionHandler: 
        (void (^)(SWGPorl* output, NSError* error)) handler;
```

Get your Proof of Reserves nonce and data.

## Proof of Reserves Nonce  This endpoint will return the nonce and associated data needed to validate BitMEX reserves data.  <! TODO link to docs, GitHub, etc > 

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



SWGPorlApi*apiInstance = [[SWGPorlApi alloc] init];

// Get your Proof of Reserves nonce and data.
[apiInstance porlGetNonceWithCompletionHandler: 
          ^(SWGPorl* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGPorlApi->porlGetNonce: %@", error);
                        }
                    }];
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**SWGPorl***](SWGPorl.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **porlGetSnapshots**
```objc
-(NSURLSessionTask*) porlGetSnapshotsWithCompletionHandler: 
        (void (^)(NSArray<SWGXAny>* output, NSError* error)) handler;
```

Get Proof of Reserves historical snapshots

### Example 
```objc


SWGPorlApi*apiInstance = [[SWGPorlApi alloc] init];

// Get Proof of Reserves historical snapshots
[apiInstance porlGetSnapshotsWithCompletionHandler: 
          ^(NSArray<SWGXAny>* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGPorlApi->porlGetSnapshots: %@", error);
                        }
                    }];
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**NSArray<SWGXAny>***](SWGXAny.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

