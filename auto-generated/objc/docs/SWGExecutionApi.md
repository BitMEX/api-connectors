# SWGExecutionApi

All URIs are relative to *https://localhost/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**executionGet**](SWGExecutionApi.md#executionget) | **GET** /execution | Get all raw executions for your account.
[**executionGetTradeHistory**](SWGExecutionApi.md#executiongettradehistory) | **GET** /execution/tradeHistory | Get all balance-affecting executions. This includes each trade, insurance charge, and settlement.


# **executionGet**
```objc
-(NSURLSessionTask*) executionGetWithSymbol: (NSString*) symbol
    filter: (NSString*) filter
    columns: (NSString*) columns
    count: (NSNumber*) count
    start: (NSNumber*) start
    reverse: (NSNumber*) reverse
    startTime: (NSDate*) startTime
    endTime: (NSDate*) endTime
        completionHandler: (void (^)(NSArray<SWGExecution>* output, NSError* error)) handler;
```

Get all raw executions for your account.

This returns all raw transactions, which includes order opening and cancelation, and order status changes. It can be quite noisy. More focused information is available at `/execution/tradeHistory`.  You may also use the `filter` param to target your query. Specify an array as a filter value, such as `{\"execType\": [\"Settlement\", \"Trade\"]}` to filter on multiple values.  See [the FIX Spec](http://www.onixs.biz/fix-dictionary/5.0.SP2/msgType_8_8.html) for explanations of these fields. 

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


NSString* symbol = @"symbol_example"; // Instrument symbol. Send a bare series (e.g. XBU) to get data for the nearest expiring contract in that series.  You can also send a timeframe, e.g. `XBU:monthly`. Timeframes are `daily`, `weekly`, `monthly`, `quarterly`, and `biquarterly`. (optional)
NSString* filter = @"filter_example"; // Generic table filter. Send JSON key/value pairs, such as `{\"key\": \"value\"}`. You can key on individual fields, and do more advanced querying on timestamps. See the [Timestamp Docs](https://www.bitmex.com/app/restAPI#timestamp-filters) for more details. (optional)
NSString* columns = @"columns_example"; // Array of column names to fetch. If omitted, will return all columns.  Note that this method will always return item keys, even when not specified, so you may receive more columns that you expect. (optional)
NSNumber* count = @100; // Number of results to fetch. (optional) (default to 100)
NSNumber* start = @0; // Starting point for results. (optional) (default to 0)
NSNumber* reverse = @false; // If true, will sort results newest first. (optional) (default to false)
NSDate* startTime = @"2013-10-20T19:20:30+01:00"; // Starting date filter for results. (optional)
NSDate* endTime = @"2013-10-20T19:20:30+01:00"; // Ending date filter for results. (optional)

SWGExecutionApi*apiInstance = [[SWGExecutionApi alloc] init];

// Get all raw executions for your account.
[apiInstance executionGetWithSymbol:symbol
              filter:filter
              columns:columns
              count:count
              start:start
              reverse:reverse
              startTime:startTime
              endTime:endTime
          completionHandler: ^(NSArray<SWGExecution>* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGExecutionApi->executionGet: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **NSString***| Instrument symbol. Send a bare series (e.g. XBU) to get data for the nearest expiring contract in that series.  You can also send a timeframe, e.g. &#x60;XBU:monthly&#x60;. Timeframes are &#x60;daily&#x60;, &#x60;weekly&#x60;, &#x60;monthly&#x60;, &#x60;quarterly&#x60;, and &#x60;biquarterly&#x60;. | [optional] 
 **filter** | **NSString***| Generic table filter. Send JSON key/value pairs, such as &#x60;{\&quot;key\&quot;: \&quot;value\&quot;}&#x60;. You can key on individual fields, and do more advanced querying on timestamps. See the [Timestamp Docs](https://www.bitmex.com/app/restAPI#timestamp-filters) for more details. | [optional] 
 **columns** | **NSString***| Array of column names to fetch. If omitted, will return all columns.  Note that this method will always return item keys, even when not specified, so you may receive more columns that you expect. | [optional] 
 **count** | **NSNumber***| Number of results to fetch. | [optional] [default to 100]
 **start** | **NSNumber***| Starting point for results. | [optional] [default to 0]
 **reverse** | **NSNumber***| If true, will sort results newest first. | [optional] [default to false]
 **startTime** | **NSDate***| Starting date filter for results. | [optional] 
 **endTime** | **NSDate***| Ending date filter for results. | [optional] 

### Return type

[**NSArray<SWGExecution>***](SWGExecution.md)

### Authorization

[apiKey](../README.md#apiKey), [apiNonce](../README.md#apiNonce), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **executionGetTradeHistory**
```objc
-(NSURLSessionTask*) executionGetTradeHistoryWithSymbol: (NSString*) symbol
    filter: (NSString*) filter
    columns: (NSString*) columns
    count: (NSNumber*) count
    start: (NSNumber*) start
    reverse: (NSNumber*) reverse
    startTime: (NSDate*) startTime
    endTime: (NSDate*) endTime
        completionHandler: (void (^)(NSArray<SWGExecution>* output, NSError* error)) handler;
```

Get all balance-affecting executions. This includes each trade, insurance charge, and settlement.

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


NSString* symbol = @"symbol_example"; // Instrument symbol. Send a bare series (e.g. XBU) to get data for the nearest expiring contract in that series.  You can also send a timeframe, e.g. `XBU:monthly`. Timeframes are `daily`, `weekly`, `monthly`, `quarterly`, and `biquarterly`. (optional)
NSString* filter = @"filter_example"; // Generic table filter. Send JSON key/value pairs, such as `{\"key\": \"value\"}`. You can key on individual fields, and do more advanced querying on timestamps. See the [Timestamp Docs](https://www.bitmex.com/app/restAPI#timestamp-filters) for more details. (optional)
NSString* columns = @"columns_example"; // Array of column names to fetch. If omitted, will return all columns.  Note that this method will always return item keys, even when not specified, so you may receive more columns that you expect. (optional)
NSNumber* count = @100; // Number of results to fetch. (optional) (default to 100)
NSNumber* start = @0; // Starting point for results. (optional) (default to 0)
NSNumber* reverse = @false; // If true, will sort results newest first. (optional) (default to false)
NSDate* startTime = @"2013-10-20T19:20:30+01:00"; // Starting date filter for results. (optional)
NSDate* endTime = @"2013-10-20T19:20:30+01:00"; // Ending date filter for results. (optional)

SWGExecutionApi*apiInstance = [[SWGExecutionApi alloc] init];

// Get all balance-affecting executions. This includes each trade, insurance charge, and settlement.
[apiInstance executionGetTradeHistoryWithSymbol:symbol
              filter:filter
              columns:columns
              count:count
              start:start
              reverse:reverse
              startTime:startTime
              endTime:endTime
          completionHandler: ^(NSArray<SWGExecution>* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGExecutionApi->executionGetTradeHistory: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **NSString***| Instrument symbol. Send a bare series (e.g. XBU) to get data for the nearest expiring contract in that series.  You can also send a timeframe, e.g. &#x60;XBU:monthly&#x60;. Timeframes are &#x60;daily&#x60;, &#x60;weekly&#x60;, &#x60;monthly&#x60;, &#x60;quarterly&#x60;, and &#x60;biquarterly&#x60;. | [optional] 
 **filter** | **NSString***| Generic table filter. Send JSON key/value pairs, such as &#x60;{\&quot;key\&quot;: \&quot;value\&quot;}&#x60;. You can key on individual fields, and do more advanced querying on timestamps. See the [Timestamp Docs](https://www.bitmex.com/app/restAPI#timestamp-filters) for more details. | [optional] 
 **columns** | **NSString***| Array of column names to fetch. If omitted, will return all columns.  Note that this method will always return item keys, even when not specified, so you may receive more columns that you expect. | [optional] 
 **count** | **NSNumber***| Number of results to fetch. | [optional] [default to 100]
 **start** | **NSNumber***| Starting point for results. | [optional] [default to 0]
 **reverse** | **NSNumber***| If true, will sort results newest first. | [optional] [default to false]
 **startTime** | **NSDate***| Starting date filter for results. | [optional] 
 **endTime** | **NSDate***| Ending date filter for results. | [optional] 

### Return type

[**NSArray<SWGExecution>***](SWGExecution.md)

### Authorization

[apiKey](../README.md#apiKey), [apiNonce](../README.md#apiNonce), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

