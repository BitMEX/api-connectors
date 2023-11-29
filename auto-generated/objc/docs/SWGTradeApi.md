# SWGTradeApi

All URIs are relative to *https://www.bitmex.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**tradeGet**](SWGTradeApi.md#tradeget) | **GET** /trade | Get Trades.
[**tradeGetBucketed**](SWGTradeApi.md#tradegetbucketed) | **GET** /trade/bucketed | Get previous trades in time buckets.


# **tradeGet**
```objc
-(NSURLSessionTask*) tradeGetWithSymbol: (NSString*) symbol
    filter: (NSString*) filter
    columns: (NSString*) columns
    count: (NSNumber*) count
    start: (NSNumber*) start
    reverse: (NSNumber*) reverse
    startTime: (NSDate*) startTime
    endTime: (NSDate*) endTime
        completionHandler: (void (^)(NSArray<SWGTrade>* output, NSError* error)) handler;
```

Get Trades.

Please note that indices (symbols starting with `.`) post trades at intervals to the trade feed. These have a `size` of 0 and are used only to indicate a changing price.  See [the FIX Spec](http://www.onixs.biz/fix-dictionary/5.0.SP2/msgType_AE_6569.html) for explanations of these fields.

### Example 
```objc

NSString* symbol = @"symbol_example"; // Instrument symbol. Send a bare series (e.g. XBT) to get data for the nearest expiring contract in that series.  You can also send a timeframe, e.g. `XBT:quarterly`. Timeframes are `nearest`, `daily`, `weekly`, `monthly`, `quarterly`, `biquarterly`, and `perpetual`.  Symbols are case-insensitive. (optional)
NSString* filter = @"filter_example"; // Generic table filter. Send JSON key/value pairs, such as `{\"key\": \"value\"}`. You can key on individual fields, and do more advanced querying on timestamps. See the [Timestamp Docs](https://www.bitmex.com/app/restAPI#Timestamp-Filters) for more details. (optional)
NSString* columns = @"columns_example"; // Array of column names to fetch. If omitted, will return all columns.  Note that this method will always return item keys, even when not specified, so you may receive more columns that you expect. (optional)
NSNumber* count = @100; // Number of results to fetch. Must be a positive integer. (optional) (default to 100)
NSNumber* start = @0; // Starting point for results. (optional) (default to 0)
NSNumber* reverse = @false; // If true, will sort results newest first. (optional) (default to false)
NSDate* startTime = @"2013-10-20T19:20:30+01:00"; // Starting date filter for results. (optional)
NSDate* endTime = @"2013-10-20T19:20:30+01:00"; // Ending date filter for results. (optional)

SWGTradeApi*apiInstance = [[SWGTradeApi alloc] init];

// Get Trades.
[apiInstance tradeGetWithSymbol:symbol
              filter:filter
              columns:columns
              count:count
              start:start
              reverse:reverse
              startTime:startTime
              endTime:endTime
          completionHandler: ^(NSArray<SWGTrade>* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGTradeApi->tradeGet: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **NSString***| Instrument symbol. Send a bare series (e.g. XBT) to get data for the nearest expiring contract in that series.  You can also send a timeframe, e.g. &#x60;XBT:quarterly&#x60;. Timeframes are &#x60;nearest&#x60;, &#x60;daily&#x60;, &#x60;weekly&#x60;, &#x60;monthly&#x60;, &#x60;quarterly&#x60;, &#x60;biquarterly&#x60;, and &#x60;perpetual&#x60;.  Symbols are case-insensitive. | [optional] 
 **filter** | **NSString***| Generic table filter. Send JSON key/value pairs, such as &#x60;{\&quot;key\&quot;: \&quot;value\&quot;}&#x60;. You can key on individual fields, and do more advanced querying on timestamps. See the [Timestamp Docs](https://www.bitmex.com/app/restAPI#Timestamp-Filters) for more details. | [optional] 
 **columns** | **NSString***| Array of column names to fetch. If omitted, will return all columns.  Note that this method will always return item keys, even when not specified, so you may receive more columns that you expect. | [optional] 
 **count** | **NSNumber***| Number of results to fetch. Must be a positive integer. | [optional] [default to 100]
 **start** | **NSNumber***| Starting point for results. | [optional] [default to 0]
 **reverse** | **NSNumber***| If true, will sort results newest first. | [optional] [default to false]
 **startTime** | **NSDate***| Starting date filter for results. | [optional] 
 **endTime** | **NSDate***| Ending date filter for results. | [optional] 

### Return type

[**NSArray<SWGTrade>***](SWGTrade.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **tradeGetBucketed**
```objc
-(NSURLSessionTask*) tradeGetBucketedWithBinSize: (NSString*) binSize
    partial: (NSNumber*) partial
    symbol: (NSString*) symbol
    filter: (NSString*) filter
    columns: (NSString*) columns
    count: (NSNumber*) count
    start: (NSNumber*) start
    reverse: (NSNumber*) reverse
    startTime: (NSDate*) startTime
    endTime: (NSDate*) endTime
        completionHandler: (void (^)(NSArray<SWGTradeBin>* output, NSError* error)) handler;
```

Get previous trades in time buckets.

Timestamps returned by our bucketed endpoints are the **end** of the period, indicating when the bucket was written to disk. Some other common systems use the timestamp as the beginning of the period. Please be aware of this when using this endpoint.  Also note the `open` price is equal to the `close` price of the previous timeframe bucket.

### Example 
```objc

NSString* binSize = @"1m"; // Time interval to bucket by. Available options: [1m,5m,1h,1d]. (optional) (default to 1m)
NSNumber* partial = @false; // If true, will send in-progress (incomplete) bins for the current time period. (optional) (default to false)
NSString* symbol = @"symbol_example"; // Instrument symbol. Send a bare series (e.g. XBT) to get data for the nearest expiring contract in that series.  You can also send a timeframe, e.g. `XBT:quarterly`. Timeframes are `nearest`, `daily`, `weekly`, `monthly`, `quarterly`, `biquarterly`, and `perpetual`.  Symbols are case-insensitive. (optional)
NSString* filter = @"filter_example"; // Generic table filter. Send JSON key/value pairs, such as `{\"key\": \"value\"}`. You can key on individual fields, and do more advanced querying on timestamps. See the [Timestamp Docs](https://www.bitmex.com/app/restAPI#Timestamp-Filters) for more details. (optional)
NSString* columns = @"columns_example"; // Array of column names to fetch. If omitted, will return all columns.  Note that this method will always return item keys, even when not specified, so you may receive more columns that you expect. (optional)
NSNumber* count = @100; // Number of results to fetch. Must be a positive integer. (optional) (default to 100)
NSNumber* start = @0; // Starting point for results. (optional) (default to 0)
NSNumber* reverse = @false; // If true, will sort results newest first. (optional) (default to false)
NSDate* startTime = @"2013-10-20T19:20:30+01:00"; // Starting date filter for results. (optional)
NSDate* endTime = @"2013-10-20T19:20:30+01:00"; // Ending date filter for results. (optional)

SWGTradeApi*apiInstance = [[SWGTradeApi alloc] init];

// Get previous trades in time buckets.
[apiInstance tradeGetBucketedWithBinSize:binSize
              partial:partial
              symbol:symbol
              filter:filter
              columns:columns
              count:count
              start:start
              reverse:reverse
              startTime:startTime
              endTime:endTime
          completionHandler: ^(NSArray<SWGTradeBin>* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGTradeApi->tradeGetBucketed: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **binSize** | **NSString***| Time interval to bucket by. Available options: [1m,5m,1h,1d]. | [optional] [default to 1m]
 **partial** | **NSNumber***| If true, will send in-progress (incomplete) bins for the current time period. | [optional] [default to false]
 **symbol** | **NSString***| Instrument symbol. Send a bare series (e.g. XBT) to get data for the nearest expiring contract in that series.  You can also send a timeframe, e.g. &#x60;XBT:quarterly&#x60;. Timeframes are &#x60;nearest&#x60;, &#x60;daily&#x60;, &#x60;weekly&#x60;, &#x60;monthly&#x60;, &#x60;quarterly&#x60;, &#x60;biquarterly&#x60;, and &#x60;perpetual&#x60;.  Symbols are case-insensitive. | [optional] 
 **filter** | **NSString***| Generic table filter. Send JSON key/value pairs, such as &#x60;{\&quot;key\&quot;: \&quot;value\&quot;}&#x60;. You can key on individual fields, and do more advanced querying on timestamps. See the [Timestamp Docs](https://www.bitmex.com/app/restAPI#Timestamp-Filters) for more details. | [optional] 
 **columns** | **NSString***| Array of column names to fetch. If omitted, will return all columns.  Note that this method will always return item keys, even when not specified, so you may receive more columns that you expect. | [optional] 
 **count** | **NSNumber***| Number of results to fetch. Must be a positive integer. | [optional] [default to 100]
 **start** | **NSNumber***| Starting point for results. | [optional] [default to 0]
 **reverse** | **NSNumber***| If true, will sort results newest first. | [optional] [default to false]
 **startTime** | **NSDate***| Starting date filter for results. | [optional] 
 **endTime** | **NSDate***| Ending date filter for results. | [optional] 

### Return type

[**NSArray<SWGTradeBin>***](SWGTradeBin.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

