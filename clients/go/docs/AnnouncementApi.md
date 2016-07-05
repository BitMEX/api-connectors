# \AnnouncementApi

All URIs are relative to *https://localhost/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**AnnouncementGet**](AnnouncementApi.md#AnnouncementGet) | **Get** /announcement | Get site announcements.
[**AnnouncementGetUrgent**](AnnouncementApi.md#AnnouncementGetUrgent) | **Get** /announcement/urgent | Get urgent (banner) announcements.


# **AnnouncementGet**
> []Announcement AnnouncementGet($columns)

Get site announcements.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **columns** | **string**| Array of column names to fetch. If omitted, will return all columns. | [optional] 

### Return type

[**[]Announcement**](Announcement.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **AnnouncementGetUrgent**
> []Announcement AnnouncementGetUrgent()

Get urgent (banner) announcements.


### Parameters
This endpoint does not need any parameter.

### Return type

[**[]Announcement**](Announcement.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

