# SWGChatApi

All URIs are relative to *https://localhost/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**chatGet**](SWGChatApi.md#chatget) | **GET** /chat | Get chat messages.
[**chatGetConnected**](SWGChatApi.md#chatgetconnected) | **GET** /chat/connected | Get connected users.
[**chatNew**](SWGChatApi.md#chatnew) | **POST** /chat | Send a chat message.


# **chatGet**
```objc
-(NSNumber*) chatGetWithCount: (NSNumber*) count
    start: (NSNumber*) start
    reverse: (NSNumber*) reverse
        completionHandler: (void (^)(NSArray<SWGChat>* output, NSError* error)) handler;
```

Get chat messages.

### Example 
```objc

NSNumber* count = @100; // Number of results to fetch. (optional) (default to 100)
NSNumber* start = @0; // Starting point for results. (optional) (default to 0)
NSNumber* reverse = @true; // If true, will sort results newest first. (optional) (default to true)

SWGChatApi*apiInstance = [[SWGChatApi alloc] init];

// Get chat messages.
[apiInstance chatGetWithCount:count
              start:start
              reverse:reverse
          completionHandler: ^(NSArray<SWGChat>* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGChatApi->chatGet: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **count** | **NSNumber***| Number of results to fetch. | [optional] [default to 100]
 **start** | **NSNumber***| Starting point for results. | [optional] [default to 0]
 **reverse** | **NSNumber***| If true, will sort results newest first. | [optional] [default to true]

### Return type

[**NSArray<SWGChat>***](SWGChat.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **chatGetConnected**
```objc
-(NSNumber*) chatGetConnectedWithCompletionHandler: 
        (void (^)(SWGConnectedUsers* output, NSError* error)) handler;
```

Get connected users.

Returns an array with browser users in the first position and API users (bots) in the second position.

### Example 
```objc


SWGChatApi*apiInstance = [[SWGChatApi alloc] init];

// Get connected users.
[apiInstance chatGetConnectedWithCompletionHandler: 
          ^(SWGConnectedUsers* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGChatApi->chatGetConnected: %@", error);
                        }
                    }];
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**SWGConnectedUsers***](SWGConnectedUsers.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **chatNew**
```objc
-(NSNumber*) chatNewWithMessage: (NSString*) message
        completionHandler: (void (^)(SWGChat* output, NSError* error)) handler;
```

Send a chat message.

### Example 
```objc

NSString* message = @"message_example"; // 

SWGChatApi*apiInstance = [[SWGChatApi alloc] init];

// Send a chat message.
[apiInstance chatNewWithMessage:message
          completionHandler: ^(SWGChat* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGChatApi->chatNew: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **message** | **NSString***|  | 

### Return type

[**SWGChat***](SWGChat.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

