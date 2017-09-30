# SWGSchemaApi

All URIs are relative to *https://localhost/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**schemaGet**](SWGSchemaApi.md#schemaget) | **GET** /schema | Get model schemata for data objects returned by this API.
[**schemaWebsocketHelp**](SWGSchemaApi.md#schemawebsockethelp) | **GET** /schema/websocketHelp | Returns help text &amp; subject list for websocket usage.


# **schemaGet**
```objc
-(NSURLSessionTask*) schemaGetWithModel: (NSString*) model
        completionHandler: (void (^)(NSObject* output, NSError* error)) handler;
```

Get model schemata for data objects returned by this API.

### Example 
```objc

NSString* model = @"model_example"; // Optional model filter. If omitted, will return all models. (optional)

SWGSchemaApi*apiInstance = [[SWGSchemaApi alloc] init];

// Get model schemata for data objects returned by this API.
[apiInstance schemaGetWithModel:model
          completionHandler: ^(NSObject* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGSchemaApi->schemaGet: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model** | **NSString***| Optional model filter. If omitted, will return all models. | [optional] 

### Return type

**NSObject***

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **schemaWebsocketHelp**
```objc
-(NSURLSessionTask*) schemaWebsocketHelpWithCompletionHandler: 
        (void (^)(NSObject* output, NSError* error)) handler;
```

Returns help text & subject list for websocket usage.

### Example 
```objc


SWGSchemaApi*apiInstance = [[SWGSchemaApi alloc] init];

// Returns help text & subject list for websocket usage.
[apiInstance schemaWebsocketHelpWithCompletionHandler: 
          ^(NSObject* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGSchemaApi->schemaWebsocketHelp: %@", error);
                        }
                    }];
```

### Parameters
This endpoint does not need any parameter.

### Return type

**NSObject***

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

