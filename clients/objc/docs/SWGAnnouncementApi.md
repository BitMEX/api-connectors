# SWGAnnouncementApi

All URIs are relative to *https://localhost/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**announcementGet**](SWGAnnouncementApi.md#announcementget) | **GET** /announcement | Get site announcements.
[**announcementGetUrgent**](SWGAnnouncementApi.md#announcementgeturgent) | **GET** /announcement/urgent | Get urgent (banner) announcements.


# **announcementGet**
```objc
-(NSURLSessionTask*) announcementGetWithColumns: (NSString*) columns
        completionHandler: (void (^)(NSArray<SWGAnnouncement>* output, NSError* error)) handler;
```

Get site announcements.

### Example 
```objc

NSString* columns = @"columns_example"; // Array of column names to fetch. If omitted, will return all columns. (optional)

SWGAnnouncementApi*apiInstance = [[SWGAnnouncementApi alloc] init];

// Get site announcements.
[apiInstance announcementGetWithColumns:columns
          completionHandler: ^(NSArray<SWGAnnouncement>* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGAnnouncementApi->announcementGet: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **columns** | **NSString***| Array of column names to fetch. If omitted, will return all columns. | [optional] 

### Return type

[**NSArray<SWGAnnouncement>***](SWGAnnouncement.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **announcementGetUrgent**
```objc
-(NSURLSessionTask*) announcementGetUrgentWithCompletionHandler: 
        (void (^)(NSArray<SWGAnnouncement>* output, NSError* error)) handler;
```

Get urgent (banner) announcements.

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



SWGAnnouncementApi*apiInstance = [[SWGAnnouncementApi alloc] init];

// Get urgent (banner) announcements.
[apiInstance announcementGetUrgentWithCompletionHandler: 
          ^(NSArray<SWGAnnouncement>* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGAnnouncementApi->announcementGetUrgent: %@", error);
                        }
                    }];
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**NSArray<SWGAnnouncement>***](SWGAnnouncement.md)

### Authorization

[apiKey](../README.md#apiKey), [apiNonce](../README.md#apiNonce), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

