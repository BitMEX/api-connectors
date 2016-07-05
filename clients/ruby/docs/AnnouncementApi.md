# SwaggerClient::AnnouncementApi

All URIs are relative to *https://localhost/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**announcement_get**](AnnouncementApi.md#announcement_get) | **GET** /announcement | Get site announcements.
[**announcement_get_urgent**](AnnouncementApi.md#announcement_get_urgent) | **GET** /announcement/urgent | Get urgent (banner) announcements.


# **announcement_get**
> Array&lt;Announcement&gt; announcement_get(opts)

Get site announcements.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::AnnouncementApi.new

opts = { 
  columns: "columns_example" # String | Array of column names to fetch. If omitted, will return all columns.
}

begin
  #Get site announcements.
  result = api_instance.announcement_get(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling AnnouncementApi->announcement_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **columns** | **String**| Array of column names to fetch. If omitted, will return all columns. | [optional] 

### Return type

[**Array&lt;Announcement&gt;**](Announcement.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript



# **announcement_get_urgent**
> Array&lt;Announcement&gt; announcement_get_urgent

Get urgent (banner) announcements.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::AnnouncementApi.new

begin
  #Get urgent (banner) announcements.
  result = api_instance.announcement_get_urgent
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling AnnouncementApi->announcement_get_urgent: #{e}"
end
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Array&lt;Announcement&gt;**](Announcement.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript



