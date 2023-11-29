# SWGWalletApi

All URIs are relative to *https://www.bitmex.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**walletGetAssetsConfig**](SWGWalletApi.md#walletgetassetsconfig) | **GET** /wallet/assets | Get Assets Config
[**walletGetNetworksConfig**](SWGWalletApi.md#walletgetnetworksconfig) | **GET** /wallet/networks | Get Networks Config


# **walletGetAssetsConfig**
```objc
-(NSURLSessionTask*) walletGetAssetsConfigWithCompletionHandler: 
        (void (^)(NSArray<SWGAssetsConfig>* output, NSError* error)) handler;
```

Get Assets Config

### Example 
```objc


SWGWalletApi*apiInstance = [[SWGWalletApi alloc] init];

// Get Assets Config
[apiInstance walletGetAssetsConfigWithCompletionHandler: 
          ^(NSArray<SWGAssetsConfig>* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGWalletApi->walletGetAssetsConfig: %@", error);
                        }
                    }];
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**NSArray<SWGAssetsConfig>***](SWGAssetsConfig.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **walletGetNetworksConfig**
```objc
-(NSURLSessionTask*) walletGetNetworksConfigWithCompletionHandler: 
        (void (^)(NSArray<SWGNetworksConfig>* output, NSError* error)) handler;
```

Get Networks Config

### Example 
```objc


SWGWalletApi*apiInstance = [[SWGWalletApi alloc] init];

// Get Networks Config
[apiInstance walletGetNetworksConfigWithCompletionHandler: 
          ^(NSArray<SWGNetworksConfig>* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGWalletApi->walletGetNetworksConfig: %@", error);
                        }
                    }];
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**NSArray<SWGNetworksConfig>***](SWGNetworksConfig.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

