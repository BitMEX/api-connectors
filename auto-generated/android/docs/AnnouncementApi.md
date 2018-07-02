# AnnouncementApi

All URIs are relative to *https://localhost/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**announcementGet**](AnnouncementApi.md#announcementGet) | **GET** /announcement | Get site announcements.
[**announcementGetUrgent**](AnnouncementApi.md#announcementGetUrgent) | **GET** /announcement/urgent | Get urgent (banner) announcements.


<a name="announcementGet"></a>
# **announcementGet**
> List&lt;Announcement&gt; announcementGet(columns)

Get site announcements.

### Example
```java
// Import classes:
//import io.swagger.client.api.AnnouncementApi;

AnnouncementApi apiInstance = new AnnouncementApi();
String columns = "columns_example"; // String | Array of column names to fetch. If omitted, will return all columns.
try {
    List<Announcement> result = apiInstance.announcementGet(columns);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AnnouncementApi#announcementGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **columns** | **String**| Array of column names to fetch. If omitted, will return all columns. | [optional]

### Return type

[**List&lt;Announcement&gt;**](Announcement.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="announcementGetUrgent"></a>
# **announcementGetUrgent**
> List&lt;Announcement&gt; announcementGetUrgent()

Get urgent (banner) announcements.

### Example
```java
// Import classes:
//import io.swagger.client.api.AnnouncementApi;

AnnouncementApi apiInstance = new AnnouncementApi();
try {
    List<Announcement> result = apiInstance.announcementGetUrgent();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AnnouncementApi#announcementGetUrgent");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Announcement&gt;**](Announcement.md)

### Authorization

[apiKey](../README.md#apiKey), [apiNonce](../README.md#apiNonce), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

