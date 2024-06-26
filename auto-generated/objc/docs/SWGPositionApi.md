# SWGPositionApi

All URIs are relative to *https://www.bitmex.com/api/v1*

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

This endpoint is used for retrieving position information. The fields largely follow the [FIX spec](http://www.onixs.biz/fix-dictionary/5.0.SP2/msgType_AP_6580.html) definitions. Some selected fields are explained in more detail below.  The fields _account_, _symbol_, _currency_ are unique to each position and form its key.  Spot trading symbols returns a subset of the position fields, mainly the open order aggregates.  - **account**: Your unique account ID. - **symbol**: The contract for this position. - **currency**: The margin currency for this position. - **underlying**: Meta data of the _symbol_. - **quoteCurrency**: Meta data of the _symbol_, All prices are in the _quoteCurrency_ - **commission**: The maximum of the maker, taker, and settlement fee. - **initMarginReq**: The initial margin requirement. This will be at least the symbol's default initial maintenance margin, but can be higher if you choose lower leverage. - **maintMarginReq**: The maintenance margin requirement. This will be at least the symbol's default maintenance maintenance margin, but can be higher if you choose a higher risk limit. - **riskLimit**: This is a function of your _maintMarginReq_. - **leverage**: 1 / initMarginReq. - **crossMargin**: True/false depending on whether you set cross margin on this position. - **deleveragePercentile**: Indicates where your position is in the ADL queue. - **rebalancedPnl**: The value of realised PNL that has transferred to your wallet for this position. - **prevRealisedPnl**: The value of realised PNL that has transferred to your wallet for this position since the position was closed. - **currentQty**: The current position amount in contracts. - **currentCost**: The current cost of the position in the settlement currency of the symbol (_currency_). - **currentComm**: The current commission of the position in the settlement currency of the symbol (_currency_). - **realisedCost**: The realised cost of this position calculated with regard to average cost accounting. - **unrealisedCost**: _currentCost_ - _realisedCost_. - **grossOpenPremium**: The amount your bidding above the mark price in the settlement currency of the symbol (_currency_). - **markPrice**: The mark price of the symbol in _quoteCurrency_. - **markValue**: The _currentQty_ at the mark price in the settlement currency of the symbol (_currency_). - **homeNotional**: Value of position in units of _underlying_. - **foreignNotional**: Value of position in units of _quoteCurrency_. - **realisedPnl**: The negative of _realisedCost_. - **unrealisedPnl**: _unrealisedGrossPnl_. - **liquidationPrice**: Once markPrice reaches this price, this position will be liquidated. - **bankruptPrice**: Once markPrice reaches this price, this position will have no equity. 

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


NSString* filter = @"filter_example"; // Table filter. For example, send {\"symbol\": \"XBTUSD\"}. (optional)
NSString* columns = @"columns_example"; // Which columns to fetch. For example, send [\"columnName\"]. (optional)
NSNumber* count = @56; // Number of rows to fetch. (optional)

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

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

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

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **positionTransferIsolatedMargin**
```objc
-(NSURLSessionTask*) positionTransferIsolatedMarginWithSymbol: (NSString*) symbol
    amount: (NSNumber*) amount
    targetAccountId: (NSNumber*) targetAccountId
        completionHandler: (void (^)(SWGPosition* output, NSError* error)) handler;
```

Transfer equity in or out of a position.

When margin is isolated on a position, use this function to add or remove margin from the position. Note that you cannot remove margin below the initial margin threshold.

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


NSString* symbol = @"symbol_example"; // Symbol of position to isolate.
NSNumber* amount = @789; // Amount to transfer, in Satoshis. May be negative.
NSNumber* targetAccountId = @1.2; // AccountId for the position that the margin would be transfered to, must be a paired account with main user. (optional)

SWGPositionApi*apiInstance = [[SWGPositionApi alloc] init];

// Transfer equity in or out of a position.
[apiInstance positionTransferIsolatedMarginWithSymbol:symbol
              amount:amount
              targetAccountId:targetAccountId
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
 **targetAccountId** | **NSNumber***| AccountId for the position that the margin would be transfered to, must be a paired account with main user. | [optional] 

### Return type

[**SWGPosition***](SWGPosition.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **positionUpdateLeverage**
```objc
-(NSURLSessionTask*) positionUpdateLeverageWithSymbol: (NSString*) symbol
    leverage: (NSNumber*) leverage
    targetAccountId: (NSNumber*) targetAccountId
        completionHandler: (void (^)(SWGPosition* output, NSError* error)) handler;
```

Choose leverage for a position.

Users can choose an isolated leverage. This will automatically enable isolated margin.

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


NSString* symbol = @"symbol_example"; // Symbol of position to adjust.
NSNumber* leverage = @1.2; // Leverage value. Send a number between 0.01 and 100 to enable isolated margin with a fixed leverage. Send 0 to enable cross margin.
NSNumber* targetAccountId = @1.2; // AccountId for the position that the leverage would be changed on, must be a paired account with main user. (optional)

SWGPositionApi*apiInstance = [[SWGPositionApi alloc] init];

// Choose leverage for a position.
[apiInstance positionUpdateLeverageWithSymbol:symbol
              leverage:leverage
              targetAccountId:targetAccountId
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
 **targetAccountId** | **NSNumber***| AccountId for the position that the leverage would be changed on, must be a paired account with main user. | [optional] 

### Return type

[**SWGPosition***](SWGPosition.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **positionUpdateRiskLimit**
```objc
-(NSURLSessionTask*) positionUpdateRiskLimitWithSymbol: (NSString*) symbol
    riskLimit: (NSNumber*) riskLimit
    targetAccountId: (NSNumber*) targetAccountId
        completionHandler: (void (^)(SWGPosition* output, NSError* error)) handler;
```

Update your risk limit.

Risk Limits limit the size of positions you can trade at various margin levels. Larger positions require more margin. Please see the Risk Limit documentation for more details.

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


NSString* symbol = @"symbol_example"; // Symbol of position to update risk limit on.
NSNumber* riskLimit = @789; // New Risk Limit, in Satoshis.
NSNumber* targetAccountId = @1.2; // AccountId for the position that the risk limit would be updated on, must be a paired account with main user. (optional)

SWGPositionApi*apiInstance = [[SWGPositionApi alloc] init];

// Update your risk limit.
[apiInstance positionUpdateRiskLimitWithSymbol:symbol
              riskLimit:riskLimit
              targetAccountId:targetAccountId
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
 **symbol** | **NSString***| Symbol of position to update risk limit on. | 
 **riskLimit** | **NSNumber***| New Risk Limit, in Satoshis. | 
 **targetAccountId** | **NSNumber***| AccountId for the position that the risk limit would be updated on, must be a paired account with main user. | [optional] 

### Return type

[**SWGPosition***](SWGPosition.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

