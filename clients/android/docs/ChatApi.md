# ChatApi

All URIs are relative to *https://localhost/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**chatGet**](ChatApi.md#chatGet) | **GET** /chat | Get chat messages.
[**chatGetConnected**](ChatApi.md#chatGetConnected) | **GET** /chat/connected | Get connected users.
[**chatNew**](ChatApi.md#chatNew) | **POST** /chat | Send a chat message.


<a name="chatGet"></a>
# **chatGet**
> List&lt;Chat&gt; chatGet(count, start, reverse)

Get chat messages.

### Example
```java
// Import classes:
//import io.swagger.client.api.ChatApi;

ChatApi apiInstance = new ChatApi();
BigDecimal count = new BigDecimal(); // BigDecimal | Number of results to fetch.
BigDecimal start = new BigDecimal(); // BigDecimal | Starting point for results.
Boolean reverse = true; // Boolean | If true, will sort results newest first.
try {
    List<Chat> result = apiInstance.chatGet(count, start, reverse);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChatApi#chatGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **count** | **BigDecimal**| Number of results to fetch. | [optional] [default to 100]
 **start** | **BigDecimal**| Starting point for results. | [optional] [default to 0]
 **reverse** | **Boolean**| If true, will sort results newest first. | [optional] [default to true]

### Return type

[**List&lt;Chat&gt;**](Chat.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="chatGetConnected"></a>
# **chatGetConnected**
> ConnectedUsers chatGetConnected()

Get connected users.

Returns an array with browser users in the first position and API users (bots) in the second position.

### Example
```java
// Import classes:
//import io.swagger.client.api.ChatApi;

ChatApi apiInstance = new ChatApi();
try {
    ConnectedUsers result = apiInstance.chatGetConnected();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChatApi#chatGetConnected");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ConnectedUsers**](ConnectedUsers.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="chatNew"></a>
# **chatNew**
> Chat chatNew(message)

Send a chat message.

### Example
```java
// Import classes:
//import io.swagger.client.api.ChatApi;

ChatApi apiInstance = new ChatApi();
String message = "message_example"; // String | 
try {
    Chat result = apiInstance.chatNew(message);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChatApi#chatNew");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **message** | **String**|  |

### Return type

[**Chat**](Chat.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

