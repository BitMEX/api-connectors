# SWGChatApi

All URIs are relative to *https://localhost/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**chatGet**](SWGChatApi.md#chatget) | **GET** /chat | Get chat messages.
[**chatGetChannels**](SWGChatApi.md#chatgetchannels) | **GET** /chat/channels | Get available channels.
[**chatGetConnected**](SWGChatApi.md#chatgetconnected) | **GET** /chat/connected | Get connected users.
[**chatNew**](SWGChatApi.md#chatnew) | **POST** /chat | Send a chat message.


# **chatGet**
```objc
-(NSURLSessionTask*) chatGetWithCount: (NSNumber*) count
    start: (NSNumber*) start
    reverse: (NSNumber*) reverse
    channelID: (NSNumber*) channelID
        completionHandler: (void (^)(NSArray<SWGChat>* output, NSError* error)) handler;
```

Get chat messages.

### Example 
```objc

NSNumber* count = @100; // Number of results to fetch. (optional) (default to 100)
NSNumber* start = @0; // Starting ID for results. (optional) (default to 0)
NSNumber* reverse = @true; // If true, will sort results newest first. (optional) (default to true)
NSNumber* channelID = @1.2; // Channel id. GET /chat/channels for ids. Leave blank for all. (optional)

SWGChatApi*apiInstance = [[SWGChatApi alloc] init];

// Get chat messages.
[apiInstance chatGetWithCount:count
              start:start
              reverse:reverse
              channelID:channelID
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
 **start** | **NSNumber***| Starting ID for results. | [optional] [default to 0]
 **reverse** | **NSNumber***| If true, will sort results newest first. | [optional] [default to true]
 **channelID** | **NSNumber***| Channel id. GET /chat/channels for ids. Leave blank for all. | [optional] 

### Return type

[**NSArray<SWGChat>***](SWGChat.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **chatGetChannels**
```objc
-(NSURLSessionTask*) chatGetChannelsWithCompletionHandler: 
        (void (^)(NSArray<SWGChatChannel>* output, NSError* error)) handler;
```

Get available channels.

### Example 
```objc


SWGChatApi*apiInstance = [[SWGChatApi alloc] init];

// Get available channels.
[apiInstance chatGetChannelsWithCompletionHandler: 
          ^(NSArray<SWGChatChannel>* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGChatApi->chatGetChannels: %@", error);
                        }
                    }];
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**NSArray<SWGChatChannel>***](SWGChatChannel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **chatGetConnected**
```objc
-(NSURLSessionTask*) chatGetConnectedWithCompletionHandler: 
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
-(NSURLSessionTask*) chatNewWithMessage: (NSString*) message
    channelID: (NSNumber*) channelID
        completionHandler: (void (^)(SWGChat* output, NSError* error)) handler;
```

Send a chat message.

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


NSString* message = @"message_example"; // 
NSNumber* channelID = @1; // Channel to post to. Default 1 (English). (optional) (default to 1)

SWGChatApi*apiInstance = [[SWGChatApi alloc] init];

// Send a chat message.
[apiInstance chatNewWithMessage:message
              channelID:channelID
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
 **channelID** | **NSNumber***| Channel to post to. Default 1 (English). | [optional] [default to 1]

### Return type

[**SWGChat***](SWGChat.md)

### Authorization

[apiKey](../README.md#apiKey), [apiNonce](../README.md#apiNonce), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

