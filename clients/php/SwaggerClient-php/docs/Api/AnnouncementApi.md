# Swagger\Client\AnnouncementApi

All URIs are relative to *https://localhost/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**announcementGet**](AnnouncementApi.md#announcementGet) | **GET** /announcement | Get site announcements.
[**announcementGetUrgent**](AnnouncementApi.md#announcementGetUrgent) | **GET** /announcement/urgent | Get urgent (banner) announcements.


# **announcementGet**
> \Swagger\Client\Model\Announcement[] announcementGet($columns)

Get site announcements.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\AnnouncementApi();
$columns = "columns_example"; // string | Array of column names to fetch. If omitted, will return all columns.

try {
    $result = $api_instance->announcementGet($columns);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AnnouncementApi->announcementGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **columns** | **string**| Array of column names to fetch. If omitted, will return all columns. | [optional]

### Return type

[**\Swagger\Client\Model\Announcement[]**](../Model/Announcement.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **announcementGetUrgent**
> \Swagger\Client\Model\Announcement[] announcementGetUrgent()

Get urgent (banner) announcements.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\AnnouncementApi();

try {
    $result = $api_instance->announcementGetUrgent();
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AnnouncementApi->announcementGetUrgent: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**\Swagger\Client\Model\Announcement[]**](../Model/Announcement.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

