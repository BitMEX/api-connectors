# ChatApi

All URIs are relative to *https://www.bitmex.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**chatGet**](ChatApi.md#chatGet) | **GET** /chat | Get chat messages.
[**chatGetChannels**](ChatApi.md#chatGetChannels) | **GET** /chat/channels | Get available channels.
[**chatGetConnected**](ChatApi.md#chatGetConnected) | **GET** /chat/connected | Get connected users.
[**chatGetPinnedMessage**](ChatApi.md#chatGetPinnedMessage) | **GET** /chat/pinned | Get pinned message for a channel.
[**chatNew**](ChatApi.md#chatNew) | **POST** /chat | Send a chat message.


<a name="chatGet"></a>
# **chatGet**
> List&lt;Chat&gt; chatGet(count, start, reverse, channelID)

Get chat messages.

### Example
```java
// Import classes:
//import io.swagger.client.api.ChatApi;

ChatApi apiInstance = new ChatApi();
Integer count = 100; // Integer | Number of results to fetch.
Integer start = 0; // Integer | Starting ID for results.
Boolean reverse = true; // Boolean | If true, will sort results newest first.
Double channelID = 3.4D; // Double | Channel id. GET /chat/channels for ids. Global English by default
try {
    List<Chat> result = apiInstance.chatGet(count, start, reverse, channelID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChatApi#chatGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **count** | **Integer**| Number of results to fetch. | [optional] [default to 100]
 **start** | **Integer**| Starting ID for results. | [optional] [default to 0]
 **reverse** | **Boolean**| If true, will sort results newest first. | [optional] [default to true]
 **channelID** | **Double**| Channel id. GET /chat/channels for ids. Global English by default | [optional] [default to 1]

### Return type

[**List&lt;Chat&gt;**](Chat.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="chatGetChannels"></a>
# **chatGetChannels**
> List&lt;ChatChannel&gt; chatGetChannels()

Get available channels.

### Example
```java
// Import classes:
//import io.swagger.client.api.ChatApi;

ChatApi apiInstance = new ChatApi();
try {
    List<ChatChannel> result = apiInstance.chatGetChannels();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChatApi#chatGetChannels");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;ChatChannel&gt;**](ChatChannel.md)

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

<a name="chatGetPinnedMessage"></a>
# **chatGetPinnedMessage**
> PinnedMessage chatGetPinnedMessage(channelID)

Get pinned message for a channel.

### Example
```java
// Import classes:
//import io.swagger.client.api.ChatApi;

ChatApi apiInstance = new ChatApi();
Double channelID = 3.4D; // Double | 
try {
    PinnedMessage result = apiInstance.chatGetPinnedMessage(channelID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChatApi#chatGetPinnedMessage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channelID** | **Double**|  |

### Return type

[**PinnedMessage**](PinnedMessage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="chatNew"></a>
# **chatNew**
> Chat chatNew(message, channelID)

Send a chat message.

### Example
```java
// Import classes:
//import io.swagger.client.api.ChatApi;

ChatApi apiInstance = new ChatApi();
String message = "message_example"; // String | 
Double channelID = 3.4D; // Double | Channel to post to. Default 1 (English).
try {
    Chat result = apiInstance.chatNew(message, channelID);
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
 **channelID** | **Double**| Channel to post to. Default 1 (English). | [optional] [default to 1]

### Return type

[**Chat**](Chat.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

