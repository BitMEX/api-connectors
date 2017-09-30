# NotificationApi

All URIs are relative to *https://localhost/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**notificationGet**](NotificationApi.md#notificationGet) | **GET** /notification | Get your current notifications.


<a name="notificationGet"></a>
# **notificationGet**
> List&lt;Notification&gt; notificationGet()

Get your current notifications.

This is an upcoming feature and currently does not return data.

### Example
```java
// Import classes:
//import io.swagger.client.api.NotificationApi;

NotificationApi apiInstance = new NotificationApi();
try {
    List<Notification> result = apiInstance.notificationGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NotificationApi#notificationGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Notification&gt;**](Notification.md)

### Authorization

[apiKey](../README.md#apiKey), [apiNonce](../README.md#apiNonce), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

