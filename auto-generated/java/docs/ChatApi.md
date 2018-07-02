# ChatApi

All URIs are relative to *https://localhost/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**chatGet**](ChatApi.md#chatGet) | **GET** /chat | Get chat messages.
[**chatGetChannels**](ChatApi.md#chatGetChannels) | **GET** /chat/channels | Get available channels.
[**chatGetConnected**](ChatApi.md#chatGetConnected) | **GET** /chat/connected | Get connected users.
[**chatNew**](ChatApi.md#chatNew) | **POST** /chat | Send a chat message.


<a name="chatGet"></a>
# **chatGet**
> List&lt;Chat&gt; chatGet(count, start, reverse, channelID)

Get chat messages.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ChatApi;


ChatApi apiInstance = new ChatApi();
BigDecimal count = new BigDecimal(); // BigDecimal | Number of results to fetch.
BigDecimal start = new BigDecimal(); // BigDecimal | Starting ID for results.
Boolean reverse = true; // Boolean | If true, will sort results newest first.
Double channelID = 3.4D; // Double | Channel id. GET /chat/channels for ids. Leave blank for all.
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
 **count** | **BigDecimal**| Number of results to fetch. | [optional] [default to 100]
 **start** | **BigDecimal**| Starting ID for results. | [optional] [default to 0]
 **reverse** | **Boolean**| If true, will sort results newest first. | [optional] [default to true]
 **channelID** | **Double**| Channel id. GET /chat/channels for ids. Leave blank for all. | [optional]

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
//import io.swagger.client.ApiException;
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
//import io.swagger.client.ApiException;
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
> Chat chatNew(message, channelID)

Send a chat message.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ChatApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

// Configure API key authorization: apiNonce
ApiKeyAuth apiNonce = (ApiKeyAuth) defaultClient.getAuthentication("apiNonce");
apiNonce.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiNonce.setApiKeyPrefix("Token");

// Configure API key authorization: apiSignature
ApiKeyAuth apiSignature = (ApiKeyAuth) defaultClient.getAuthentication("apiSignature");
apiSignature.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiSignature.setApiKeyPrefix("Token");

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

[apiKey](../README.md#apiKey), [apiNonce](../README.md#apiNonce), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

