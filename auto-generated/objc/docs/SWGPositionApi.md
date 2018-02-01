# SWGPositionApi

All URIs are relative to *https://localhost/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**positionGet**](SWGPositionApi.md#positionget) | **GET** /position | Get your positions.
[**positionIsolateMargin**](SWGPositionApi.md#positionisolatemargin) | **POST** /position/isolate | Enable isolated margin or cross margin per-position.
[**positionTransferIsolatedMargin**](SWGPositionApi.md#positiontransferisolatedmargin) | **POST** /position/transferMargin | Transfer equity in or out of a position.
[**positionUpdateLeverage**](SWGPositionApi.md#positionupdateleverage) | **POST** /position/leverage | Choose leverage for a position.
[**positionUpdateRiskLimit**](SWGPositionApi.md#positionupdaterisklimit) | **POST** /position/riskLimit | Update your risk limit.


# **positionGet**
```objc
-(NSURLSessionTask*) positionGetWithFilter: (NSString*) filter
    columns: (NSString*) columns
    count: (NSNumber*) count
        completionHandler: (void (^)(NSArray<SWGPosition>* output, NSError* error)) handler;
```

Get your positions.

See <a href=\"http://www.onixs.biz/fix-dictionary/5.0.SP2/msgType_AP_6580.html\">the FIX Spec</a> for explanations of these fields.

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


NSString* filter = @"filter_example"; // Table filter. For example, send {\"symbol\": \"XBTUSD\"}. (optional)
NSString* columns = @"columns_example"; // Which columns to fetch. For example, send [\"columnName\"]. (optional)
NSNumber* count = @3.4; // Number of rows to fetch. (optional)

SWGPositionApi*apiInstance = [[SWGPositionApi alloc] init];

// Get your positions.
[apiInstance positionGetWithFilter:filter
              columns:columns
              count:count
          completionHandler: ^(NSArray<SWGPosition>* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGPositionApi->positionGet: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **NSString***| Table filter. For example, send {\&quot;symbol\&quot;: \&quot;XBTUSD\&quot;}. | [optional] 
 **columns** | **NSString***| Which columns to fetch. For example, send [\&quot;columnName\&quot;]. | [optional] 
 **count** | **NSNumber***| Number of rows to fetch. | [optional] 

### Return type

[**NSArray<SWGPosition>***](SWGPosition.md)

### Authorization

[apiKey](../README.md#apiKey), [apiNonce](../README.md#apiNonce), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **positionIsolateMargin**
```objc
-(NSURLSessionTask*) positionIsolateMarginWithSymbol: (NSString*) symbol
    enabled: (NSNumber*) enabled
        completionHandler: (void (^)(SWGPosition* output, NSError* error)) handler;
```

Enable isolated margin or cross margin per-position.

Users can switch isolate margin per-position. This function allows switching margin isolation (aka fixed margin) on and off.

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


NSString* symbol = @"symbol_example"; // Position symbol to isolate.
NSNumber* enabled = @true; // True for isolated margin, false for cross margin. (optional) (default to true)

SWGPositionApi*apiInstance = [[SWGPositionApi alloc] init];

// Enable isolated margin or cross margin per-position.
[apiInstance positionIsolateMarginWithSymbol:symbol
              enabled:enabled
          completionHandler: ^(SWGPosition* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGPositionApi->positionIsolateMargin: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **NSString***| Position symbol to isolate. | 
 **enabled** | **NSNumber***| True for isolated margin, false for cross margin. | [optional] [default to true]

### Return type

[**SWGPosition***](SWGPosition.md)

### Authorization

[apiKey](../README.md#apiKey), [apiNonce](../README.md#apiNonce), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **positionTransferIsolatedMargin**
```objc
-(NSURLSessionTask*) positionTransferIsolatedMarginWithSymbol: (NSString*) symbol
    amount: (NSNumber*) amount
        completionHandler: (void (^)(SWGPosition* output, NSError* error)) handler;
```

Transfer equity in or out of a position.

When margin is isolated on a position, use this function to add or remove margin from the position. Note that you cannot remove margin below the initial margin threshold.

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


NSString* symbol = @"symbol_example"; // Symbol of position to isolate.
NSNumber* amount = @3.4; // Amount to transfer, in Satoshis. May be negative.

SWGPositionApi*apiInstance = [[SWGPositionApi alloc] init];

// Transfer equity in or out of a position.
[apiInstance positionTransferIsolatedMarginWithSymbol:symbol
              amount:amount
          completionHandler: ^(SWGPosition* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGPositionApi->positionTransferIsolatedMargin: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **NSString***| Symbol of position to isolate. | 
 **amount** | **NSNumber***| Amount to transfer, in Satoshis. May be negative. | 

### Return type

[**SWGPosition***](SWGPosition.md)

### Authorization

[apiKey](../README.md#apiKey), [apiNonce](../README.md#apiNonce), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **positionUpdateLeverage**
```objc
-(NSURLSessionTask*) positionUpdateLeverageWithSymbol: (NSString*) symbol
    leverage: (NSNumber*) leverage
        completionHandler: (void (^)(SWGPosition* output, NSError* error)) handler;
```

Choose leverage for a position.

Users can choose an isolated leverage. This will automatically enable isolated margin.

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


NSString* symbol = @"symbol_example"; // Symbol of position to adjust.
NSNumber* leverage = @1.2; // Leverage value. Send a number between 0.01 and 100 to enable isolated margin with a fixed leverage. Send 0 to enable cross margin.

SWGPositionApi*apiInstance = [[SWGPositionApi alloc] init];

// Choose leverage for a position.
[apiInstance positionUpdateLeverageWithSymbol:symbol
              leverage:leverage
          completionHandler: ^(SWGPosition* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGPositionApi->positionUpdateLeverage: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **NSString***| Symbol of position to adjust. | 
 **leverage** | **NSNumber***| Leverage value. Send a number between 0.01 and 100 to enable isolated margin with a fixed leverage. Send 0 to enable cross margin. | 

### Return type

[**SWGPosition***](SWGPosition.md)

### Authorization

[apiKey](../README.md#apiKey), [apiNonce](../README.md#apiNonce), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **positionUpdateRiskLimit**
```objc
-(NSURLSessionTask*) positionUpdateRiskLimitWithSymbol: (NSString*) symbol
    riskLimit: (NSNumber*) riskLimit
        completionHandler: (void (^)(SWGPosition* output, NSError* error)) handler;
```

Update your risk limit.

Risk Limits limit the size of positions you can trade at various margin levels. Larger positions require more margin. Please see the Risk Limit documentation for more details.

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


NSString* symbol = @"symbol_example"; // Symbol of position to isolate.
NSNumber* riskLimit = @3.4; // New Risk Limit, in Satoshis.

SWGPositionApi*apiInstance = [[SWGPositionApi alloc] init];

// Update your risk limit.
[apiInstance positionUpdateRiskLimitWithSymbol:symbol
              riskLimit:riskLimit
          completionHandler: ^(SWGPosition* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGPositionApi->positionUpdateRiskLimit: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **NSString***| Symbol of position to isolate. | 
 **riskLimit** | **NSNumber***| New Risk Limit, in Satoshis. | 

### Return type

[**SWGPosition***](SWGPosition.md)

### Authorization

[apiKey](../README.md#apiKey), [apiNonce](../README.md#apiNonce), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

