# \AnnouncementApi

All URIs are relative to *https://www.bitmex.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**AnnouncementGet**](AnnouncementApi.md#AnnouncementGet) | **Get** /announcement | Get site announcements.
[**AnnouncementGetUrgent**](AnnouncementApi.md#AnnouncementGetUrgent) | **Get** /announcement/urgent | Get urgent (banner) announcements.


# **AnnouncementGet**
> []Announcement AnnouncementGet(ctx, optional)
Get site announcements.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***AnnouncementApiAnnouncementGetOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a AnnouncementApiAnnouncementGetOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **columns** | **optional.String**| Array of column names to fetch. If omitted, will return all columns. | 

### Return type

[**[]Announcement**](Announcement.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **AnnouncementGetUrgent**
> []Announcement AnnouncementGetUrgent(ctx, )
Get urgent (banner) announcements.

### Required Parameters
This endpoint does not need any parameter.

### Return type

[**[]Announcement**](Announcement.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

