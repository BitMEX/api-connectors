# SWGAnnouncementApi

All URIs are relative to *https://localhost/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**announcementGet**](SWGAnnouncementApi.md#announcementget) | **GET** /announcement | Get site announcements.
[**announcementGetUrgent**](SWGAnnouncementApi.md#announcementgeturgent) | **GET** /announcement/urgent | Get urgent (banner) announcements.


# **announcementGet**
```objc
-(NSNumber*) announcementGetWithColumns: (NSString*) columns
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
-(NSNumber*) announcementGetUrgentWithCompletionHandler: 
        (void (^)(NSArray<SWGAnnouncement>* output, NSError* error)) handler;
```

Get urgent (banner) announcements.

### Example 
```objc


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

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

