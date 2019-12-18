# GlobalNotificationApi

All URIs are relative to *https://www.bitmex.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**globalNotificationGet**](GlobalNotificationApi.md#globalNotificationGet) | **GET** /globalNotification | Get your current GlobalNotifications.


<a name="globalNotificationGet"></a>
# **globalNotificationGet**
> List&lt;GlobalNotification&gt; globalNotificationGet()

Get your current GlobalNotifications.

This is an upcoming feature and currently does not return data.

### Example
```java
// Import classes:
//import io.swagger.client.api.GlobalNotificationApi;

GlobalNotificationApi apiInstance = new GlobalNotificationApi();
try {
    List<GlobalNotification> result = apiInstance.globalNotificationGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GlobalNotificationApi#globalNotificationGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;GlobalNotification&gt;**](GlobalNotification.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

