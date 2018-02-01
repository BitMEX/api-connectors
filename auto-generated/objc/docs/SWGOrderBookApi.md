# SWGOrderBookApi

All URIs are relative to *https://localhost/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**orderBookGet**](SWGOrderBookApi.md#orderbookget) | **GET** /orderBook | Get current orderbook [deprecated, use /orderBook/L2].
[**orderBookGetL2**](SWGOrderBookApi.md#orderbookgetl2) | **GET** /orderBook/L2 | Get current orderbook in vertical format.


# **orderBookGet**
```objc
-(NSURLSessionTask*) orderBookGetWithSymbol: (NSString*) symbol
    depth: (NSNumber*) depth
        completionHandler: (void (^)(NSArray<SWGOrderBook>* output, NSError* error)) handler;
```

Get current orderbook [deprecated, use /orderBook/L2].

### Example 
```objc

NSString* symbol = @"symbol_example"; // Instrument symbol. Send a series (e.g. XBT) to get data for the nearest contract in that series.
NSNumber* depth = @25; // Orderbook depth. (optional) (default to 25)

SWGOrderBookApi*apiInstance = [[SWGOrderBookApi alloc] init];

// Get current orderbook [deprecated, use /orderBook/L2].
[apiInstance orderBookGetWithSymbol:symbol
              depth:depth
          completionHandler: ^(NSArray<SWGOrderBook>* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGOrderBookApi->orderBookGet: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **NSString***| Instrument symbol. Send a series (e.g. XBT) to get data for the nearest contract in that series. | 
 **depth** | **NSNumber***| Orderbook depth. | [optional] [default to 25]

### Return type

[**NSArray<SWGOrderBook>***](SWGOrderBook.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orderBookGetL2**
```objc
-(NSURLSessionTask*) orderBookGetL2WithSymbol: (NSString*) symbol
    depth: (NSNumber*) depth
        completionHandler: (void (^)(NSArray<SWGOrderBookL2>* output, NSError* error)) handler;
```

Get current orderbook in vertical format.

### Example 
```objc

NSString* symbol = @"symbol_example"; // Instrument symbol. Send a series (e.g. XBT) to get data for the nearest contract in that series.
NSNumber* depth = @25; // Orderbook depth per side. Send 0 for full depth. (optional) (default to 25)

SWGOrderBookApi*apiInstance = [[SWGOrderBookApi alloc] init];

// Get current orderbook in vertical format.
[apiInstance orderBookGetL2WithSymbol:symbol
              depth:depth
          completionHandler: ^(NSArray<SWGOrderBookL2>* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGOrderBookApi->orderBookGetL2: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **NSString***| Instrument symbol. Send a series (e.g. XBT) to get data for the nearest contract in that series. | 
 **depth** | **NSNumber***| Orderbook depth per side. Send 0 for full depth. | [optional] [default to 25]

### Return type

[**NSArray<SWGOrderBookL2>***](SWGOrderBookL2.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

