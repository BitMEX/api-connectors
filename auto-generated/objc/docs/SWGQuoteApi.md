# SWGQuoteApi

All URIs are relative to *https://localhost/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**quoteGet**](SWGQuoteApi.md#quoteget) | **GET** /quote | Get Quotes.
[**quoteGetBucketed**](SWGQuoteApi.md#quotegetbucketed) | **GET** /quote/bucketed | Get previous quotes in time buckets.


# **quoteGet**
```objc
-(NSURLSessionTask*) quoteGetWithSymbol: (NSString*) symbol
    filter: (NSString*) filter
    columns: (NSString*) columns
    count: (NSNumber*) count
    start: (NSNumber*) start
    reverse: (NSNumber*) reverse
    startTime: (NSDate*) startTime
    endTime: (NSDate*) endTime
        completionHandler: (void (^)(NSArray<SWGQuote>* output, NSError* error)) handler;
```

Get Quotes.

### Example 
```objc

NSString* symbol = @"symbol_example"; // Instrument symbol. Send a bare series (e.g. XBU) to get data for the nearest expiring contract in that series.  You can also send a timeframe, e.g. `XBU:monthly`. Timeframes are `daily`, `weekly`, `monthly`, `quarterly`, and `biquarterly`. (optional)
NSString* filter = @"filter_example"; // Generic table filter. Send JSON key/value pairs, such as `{\"key\": \"value\"}`. You can key on individual fields, and do more advanced querying on timestamps. See the [Timestamp Docs](https://www.bitmex.com/app/restAPI#Timestamp-Filters) for more details. (optional)
NSString* columns = @"columns_example"; // Array of column names to fetch. If omitted, will return all columns.  Note that this method will always return item keys, even when not specified, so you may receive more columns that you expect. (optional)
NSNumber* count = @100; // Number of results to fetch. (optional) (default to 100)
NSNumber* start = @0; // Starting point for results. (optional) (default to 0)
NSNumber* reverse = @false; // If true, will sort results newest first. (optional) (default to false)
NSDate* startTime = @"2013-10-20T19:20:30+01:00"; // Starting date filter for results. (optional)
NSDate* endTime = @"2013-10-20T19:20:30+01:00"; // Ending date filter for results. (optional)

SWGQuoteApi*apiInstance = [[SWGQuoteApi alloc] init];

// Get Quotes.
[apiInstance quoteGetWithSymbol:symbol
              filter:filter
              columns:columns
              count:count
              start:start
              reverse:reverse
              startTime:startTime
              endTime:endTime
          completionHandler: ^(NSArray<SWGQuote>* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGQuoteApi->quoteGet: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **NSString***| Instrument symbol. Send a bare series (e.g. XBU) to get data for the nearest expiring contract in that series.  You can also send a timeframe, e.g. &#x60;XBU:monthly&#x60;. Timeframes are &#x60;daily&#x60;, &#x60;weekly&#x60;, &#x60;monthly&#x60;, &#x60;quarterly&#x60;, and &#x60;biquarterly&#x60;. | [optional] 
 **filter** | **NSString***| Generic table filter. Send JSON key/value pairs, such as &#x60;{\&quot;key\&quot;: \&quot;value\&quot;}&#x60;. You can key on individual fields, and do more advanced querying on timestamps. See the [Timestamp Docs](https://www.bitmex.com/app/restAPI#Timestamp-Filters) for more details. | [optional] 
 **columns** | **NSString***| Array of column names to fetch. If omitted, will return all columns.  Note that this method will always return item keys, even when not specified, so you may receive more columns that you expect. | [optional] 
 **count** | **NSNumber***| Number of results to fetch. | [optional] [default to 100]
 **start** | **NSNumber***| Starting point for results. | [optional] [default to 0]
 **reverse** | **NSNumber***| If true, will sort results newest first. | [optional] [default to false]
 **startTime** | **NSDate***| Starting date filter for results. | [optional] 
 **endTime** | **NSDate***| Ending date filter for results. | [optional] 

### Return type

[**NSArray<SWGQuote>***](SWGQuote.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **quoteGetBucketed**
```objc
-(NSURLSessionTask*) quoteGetBucketedWithBinSize: (NSString*) binSize
    partial: (NSNumber*) partial
    symbol: (NSString*) symbol
    filter: (NSString*) filter
    columns: (NSString*) columns
    count: (NSNumber*) count
    start: (NSNumber*) start
    reverse: (NSNumber*) reverse
    startTime: (NSDate*) startTime
    endTime: (NSDate*) endTime
        completionHandler: (void (^)(NSArray<SWGQuote>* output, NSError* error)) handler;
```

Get previous quotes in time buckets.

### Example 
```objc

NSString* binSize = @"1m"; // Time interval to bucket by. Available options: [1m,5m,1h,1d]. (optional) (default to 1m)
NSNumber* partial = @false; // If true, will send in-progress (incomplete) bins for the current time period. (optional) (default to false)
NSString* symbol = @"symbol_example"; // Instrument symbol. Send a bare series (e.g. XBU) to get data for the nearest expiring contract in that series.  You can also send a timeframe, e.g. `XBU:monthly`. Timeframes are `daily`, `weekly`, `monthly`, `quarterly`, and `biquarterly`. (optional)
NSString* filter = @"filter_example"; // Generic table filter. Send JSON key/value pairs, such as `{\"key\": \"value\"}`. You can key on individual fields, and do more advanced querying on timestamps. See the [Timestamp Docs](https://www.bitmex.com/app/restAPI#Timestamp-Filters) for more details. (optional)
NSString* columns = @"columns_example"; // Array of column names to fetch. If omitted, will return all columns.  Note that this method will always return item keys, even when not specified, so you may receive more columns that you expect. (optional)
NSNumber* count = @100; // Number of results to fetch. (optional) (default to 100)
NSNumber* start = @0; // Starting point for results. (optional) (default to 0)
NSNumber* reverse = @false; // If true, will sort results newest first. (optional) (default to false)
NSDate* startTime = @"2013-10-20T19:20:30+01:00"; // Starting date filter for results. (optional)
NSDate* endTime = @"2013-10-20T19:20:30+01:00"; // Ending date filter for results. (optional)

SWGQuoteApi*apiInstance = [[SWGQuoteApi alloc] init];

// Get previous quotes in time buckets.
[apiInstance quoteGetBucketedWithBinSize:binSize
              partial:partial
              symbol:symbol
              filter:filter
              columns:columns
              count:count
              start:start
              reverse:reverse
              startTime:startTime
              endTime:endTime
          completionHandler: ^(NSArray<SWGQuote>* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGQuoteApi->quoteGetBucketed: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **binSize** | **NSString***| Time interval to bucket by. Available options: [1m,5m,1h,1d]. | [optional] [default to 1m]
 **partial** | **NSNumber***| If true, will send in-progress (incomplete) bins for the current time period. | [optional] [default to false]
 **symbol** | **NSString***| Instrument symbol. Send a bare series (e.g. XBU) to get data for the nearest expiring contract in that series.  You can also send a timeframe, e.g. &#x60;XBU:monthly&#x60;. Timeframes are &#x60;daily&#x60;, &#x60;weekly&#x60;, &#x60;monthly&#x60;, &#x60;quarterly&#x60;, and &#x60;biquarterly&#x60;. | [optional] 
 **filter** | **NSString***| Generic table filter. Send JSON key/value pairs, such as &#x60;{\&quot;key\&quot;: \&quot;value\&quot;}&#x60;. You can key on individual fields, and do more advanced querying on timestamps. See the [Timestamp Docs](https://www.bitmex.com/app/restAPI#Timestamp-Filters) for more details. | [optional] 
 **columns** | **NSString***| Array of column names to fetch. If omitted, will return all columns.  Note that this method will always return item keys, even when not specified, so you may receive more columns that you expect. | [optional] 
 **count** | **NSNumber***| Number of results to fetch. | [optional] [default to 100]
 **start** | **NSNumber***| Starting point for results. | [optional] [default to 0]
 **reverse** | **NSNumber***| If true, will sort results newest first. | [optional] [default to false]
 **startTime** | **NSDate***| Starting date filter for results. | [optional] 
 **endTime** | **NSDate***| Ending date filter for results. | [optional] 

### Return type

[**NSArray<SWGQuote>***](SWGQuote.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

