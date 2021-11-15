# SWGInstrumentApi

All URIs are relative to *https://www.bitmex.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**instrumentGet**](SWGInstrumentApi.md#instrumentget) | **GET** /instrument | Get instruments.
[**instrumentGetActive**](SWGInstrumentApi.md#instrumentgetactive) | **GET** /instrument/active | Get all active instruments and instruments that have expired in &lt;24hrs.
[**instrumentGetActiveAndIndices**](SWGInstrumentApi.md#instrumentgetactiveandindices) | **GET** /instrument/activeAndIndices | Helper method. Gets all active instruments and all indices. This is a join of the result of /indices and /active.
[**instrumentGetActiveIntervals**](SWGInstrumentApi.md#instrumentgetactiveintervals) | **GET** /instrument/activeIntervals | Return all active contract series and interval pairs.
[**instrumentGetCompositeIndex**](SWGInstrumentApi.md#instrumentgetcompositeindex) | **GET** /instrument/compositeIndex | Show constituent parts of an index.
[**instrumentGetIndices**](SWGInstrumentApi.md#instrumentgetindices) | **GET** /instrument/indices | Get all price indices.


# **instrumentGet**
```objc
-(NSURLSessionTask*) instrumentGetWithSymbol: (NSString*) symbol
    filter: (NSString*) filter
    columns: (NSString*) columns
    count: (NSNumber*) count
    start: (NSNumber*) start
    reverse: (NSNumber*) reverse
    startTime: (NSDate*) startTime
    endTime: (NSDate*) endTime
        completionHandler: (void (^)(NSArray<SWGInstrument>* output, NSError* error)) handler;
```

Get instruments.

This returns all instruments and indices, including those that have settled or are unlisted. Use this endpoint if you want to query for individual instruments or use a complex filter. Use `/instrument/active` to return active instruments, or use a filter like `{\"state\": \"Open\"}`.

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

SWGInstrumentApi*apiInstance = [[SWGInstrumentApi alloc] init];

// Get instruments.
[apiInstance instrumentGetWithSymbol:symbol
              filter:filter
              columns:columns
              count:count
              start:start
              reverse:reverse
              startTime:startTime
              endTime:endTime
          completionHandler: ^(NSArray<SWGInstrument>* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGInstrumentApi->instrumentGet: %@", error);
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

[**NSArray<SWGInstrument>***](SWGInstrument.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **instrumentGetActive**
```objc
-(NSURLSessionTask*) instrumentGetActiveWithCompletionHandler: 
        (void (^)(NSArray<SWGInstrument>* output, NSError* error)) handler;
```

Get all active instruments and instruments that have expired in <24hrs.

### Example 
```objc


SWGInstrumentApi*apiInstance = [[SWGInstrumentApi alloc] init];

// Get all active instruments and instruments that have expired in <24hrs.
[apiInstance instrumentGetActiveWithCompletionHandler: 
          ^(NSArray<SWGInstrument>* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGInstrumentApi->instrumentGetActive: %@", error);
                        }
                    }];
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**NSArray<SWGInstrument>***](SWGInstrument.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **instrumentGetActiveAndIndices**
```objc
-(NSURLSessionTask*) instrumentGetActiveAndIndicesWithCompletionHandler: 
        (void (^)(NSArray<SWGInstrument>* output, NSError* error)) handler;
```

Helper method. Gets all active instruments and all indices. This is a join of the result of /indices and /active.

### Example 
```objc


SWGInstrumentApi*apiInstance = [[SWGInstrumentApi alloc] init];

// Helper method. Gets all active instruments and all indices. This is a join of the result of /indices and /active.
[apiInstance instrumentGetActiveAndIndicesWithCompletionHandler: 
          ^(NSArray<SWGInstrument>* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGInstrumentApi->instrumentGetActiveAndIndices: %@", error);
                        }
                    }];
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**NSArray<SWGInstrument>***](SWGInstrument.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **instrumentGetActiveIntervals**
```objc
-(NSURLSessionTask*) instrumentGetActiveIntervalsWithCompletionHandler: 
        (void (^)(SWGInstrumentInterval* output, NSError* error)) handler;
```

Return all active contract series and interval pairs.

This endpoint is useful for determining which pairs are live. It returns two arrays of   strings. The first is intervals, such as `[\"XBT:perpetual\", \"XBT:quarterly\", \"XBT:biquarterly\", \"ETH:quarterly\", ...]`. These identifiers are usable in any query's `symbol` param. The second array is the current resolution of these intervals. Results are mapped at the same index.

### Example 
```objc


SWGInstrumentApi*apiInstance = [[SWGInstrumentApi alloc] init];

// Return all active contract series and interval pairs.
[apiInstance instrumentGetActiveIntervalsWithCompletionHandler: 
          ^(SWGInstrumentInterval* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGInstrumentApi->instrumentGetActiveIntervals: %@", error);
                        }
                    }];
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**SWGInstrumentInterval***](SWGInstrumentInterval.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **instrumentGetCompositeIndex**
```objc
-(NSURLSessionTask*) instrumentGetCompositeIndexWithSymbol: (NSString*) symbol
    filter: (NSString*) filter
    columns: (NSString*) columns
    count: (NSNumber*) count
    start: (NSNumber*) start
    reverse: (NSNumber*) reverse
    startTime: (NSDate*) startTime
    endTime: (NSDate*) endTime
        completionHandler: (void (^)(NSArray<SWGIndexComposite>* output, NSError* error)) handler;
```

Show constituent parts of an index.

Composite indices are built from multiple external price sources.  Use this endpoint to get the underlying prices of an index. For example, send a `symbol` of `.BXBT` to get the ticks and weights of the constituent exchanges that build the \".BXBT\" index.  A tick with reference `\"BMI\"` and weight `null` is the composite index tick. 

### Example 
```objc

NSString* symbol = @".BXBT"; // The composite index symbol. (optional) (default to .BXBT)
NSString* filter = @"filter_example"; // Generic table filter. Send JSON key/value pairs, such as `{\"key\": \"value\"}`. (optional)
NSString* columns = @"columns_example"; // Array of column names to fetch. If omitted, will return all columns.  Note that this method will always return item keys, even when not specified, so you may receive more columns that you expect. (optional)
NSNumber* count = @100; // Number of results to fetch. Must be a positive integer. (optional) (default to 100)
NSNumber* start = @0; // Starting point for results. (optional) (default to 0)
NSNumber* reverse = @false; // If true, will sort results newest first. (optional) (default to false)
NSDate* startTime = @"2013-10-20T19:20:30+01:00"; // Starting date filter for results. (optional)
NSDate* endTime = @"2013-10-20T19:20:30+01:00"; // Ending date filter for results. (optional)

SWGInstrumentApi*apiInstance = [[SWGInstrumentApi alloc] init];

// Show constituent parts of an index.
[apiInstance instrumentGetCompositeIndexWithSymbol:symbol
              filter:filter
              columns:columns
              count:count
              start:start
              reverse:reverse
              startTime:startTime
              endTime:endTime
          completionHandler: ^(NSArray<SWGIndexComposite>* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGInstrumentApi->instrumentGetCompositeIndex: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **NSString***| The composite index symbol. | [optional] [default to .BXBT]
 **filter** | **NSString***| Generic table filter. Send JSON key/value pairs, such as &#x60;{\&quot;key\&quot;: \&quot;value\&quot;}&#x60;. | [optional] 
 **columns** | **NSString***| Array of column names to fetch. If omitted, will return all columns.  Note that this method will always return item keys, even when not specified, so you may receive more columns that you expect. | [optional] 
 **count** | **NSNumber***| Number of results to fetch. Must be a positive integer. | [optional] [default to 100]
 **start** | **NSNumber***| Starting point for results. | [optional] [default to 0]
 **reverse** | **NSNumber***| If true, will sort results newest first. | [optional] [default to false]
 **startTime** | **NSDate***| Starting date filter for results. | [optional] 
 **endTime** | **NSDate***| Ending date filter for results. | [optional] 

### Return type

[**NSArray<SWGIndexComposite>***](SWGIndexComposite.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **instrumentGetIndices**
```objc
-(NSURLSessionTask*) instrumentGetIndicesWithCompletionHandler: 
        (void (^)(NSArray<SWGInstrument>* output, NSError* error)) handler;
```

Get all price indices.

### Example 
```objc


SWGInstrumentApi*apiInstance = [[SWGInstrumentApi alloc] init];

// Get all price indices.
[apiInstance instrumentGetIndicesWithCompletionHandler: 
          ^(NSArray<SWGInstrument>* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGInstrumentApi->instrumentGetIndices: %@", error);
                        }
                    }];
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**NSArray<SWGInstrument>***](SWGInstrument.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

