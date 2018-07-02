# BitMexApi.ChatApi

All URIs are relative to *https://localhost/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**chatGet**](ChatApi.md#chatGet) | **GET** /chat | Get chat messages.
[**chatGetChannels**](ChatApi.md#chatGetChannels) | **GET** /chat/channels | Get available channels.
[**chatGetConnected**](ChatApi.md#chatGetConnected) | **GET** /chat/connected | Get connected users.
[**chatNew**](ChatApi.md#chatNew) | **POST** /chat | Send a chat message.


<a name="chatGet"></a>
# **chatGet**
> [Chat] chatGet(opts)

Get chat messages.

### Example
```javascript
var BitMexApi = require('bit_mex_api');

var apiInstance = new BitMexApi.ChatApi();

var opts = { 
  'count': 100, // Number | Number of results to fetch.
  'start': 0, // Number | Starting ID for results.
  'reverse': true, // Boolean | If true, will sort results newest first.
  'channelID': 1.2 // Number | Channel id. GET /chat/channels for ids. Leave blank for all.
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.chatGet(opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **count** | **Number**| Number of results to fetch. | [optional] [default to 100]
 **start** | **Number**| Starting ID for results. | [optional] [default to 0]
 **reverse** | **Boolean**| If true, will sort results newest first. | [optional] [default to true]
 **channelID** | **Number**| Channel id. GET /chat/channels for ids. Leave blank for all. | [optional] 

### Return type

[**[Chat]**](Chat.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="chatGetChannels"></a>
# **chatGetChannels**
> [ChatChannel] chatGetChannels()

Get available channels.

### Example
```javascript
var BitMexApi = require('bit_mex_api');

var apiInstance = new BitMexApi.ChatApi();

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.chatGetChannels(callback);
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**[ChatChannel]**](ChatChannel.md)

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
```javascript
var BitMexApi = require('bit_mex_api');

var apiInstance = new BitMexApi.ChatApi();

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.chatGetConnected(callback);
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
> Chat chatNew(message, opts)

Send a chat message.

### Example
```javascript
var BitMexApi = require('bit_mex_api');
var defaultClient = BitMexApi.ApiClient.instance;

// Configure API key authorization: apiKey
var apiKey = defaultClient.authentications['apiKey'];
apiKey.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.apiKeyPrefix = 'Token';

// Configure API key authorization: apiNonce
var apiNonce = defaultClient.authentications['apiNonce'];
apiNonce.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiNonce.apiKeyPrefix = 'Token';

// Configure API key authorization: apiSignature
var apiSignature = defaultClient.authentications['apiSignature'];
apiSignature.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiSignature.apiKeyPrefix = 'Token';

var apiInstance = new BitMexApi.ChatApi();

var message = "message_example"; // String | 

var opts = { 
  'channelID': 1 // Number | Channel to post to. Default 1 (English).
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.chatNew(message, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **message** | **String**|  | 
 **channelID** | **Number**| Channel to post to. Default 1 (English). | [optional] [default to 1]

### Return type

[**Chat**](Chat.md)

### Authorization

[apiKey](../README.md#apiKey), [apiNonce](../README.md#apiNonce), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

