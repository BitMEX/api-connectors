# BitMexApi.UserEventApi

All URIs are relative to *https://www.bitmex.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**userEventGet**](UserEventApi.md#userEventGet) | **GET** /userEvent | Get your user events


<a name="userEventGet"></a>
# **userEventGet**
> [UserEvent] userEventGet(opts)

Get your user events

### Example
```javascript
var BitMexApi = require('bit_mex_api');
var defaultClient = BitMexApi.ApiClient.instance;

// Configure API key authorization: apiExpires
var apiExpires = defaultClient.authentications['apiExpires'];
apiExpires.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiExpires.apiKeyPrefix = 'Token';

// Configure API key authorization: apiKey
var apiKey = defaultClient.authentications['apiKey'];
apiKey.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.apiKeyPrefix = 'Token';

// Configure API key authorization: apiSignature
var apiSignature = defaultClient.authentications['apiSignature'];
apiSignature.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiSignature.apiKeyPrefix = 'Token';

var apiInstance = new BitMexApi.UserEventApi();

var opts = { 
  'count': 100, // Number | Number of results to fetch.
  'startId': 1.2 // Number | Cursor for pagination.
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.userEventGet(opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **count** | **Number**| Number of results to fetch. | [optional] [default to 100]
 **startId** | **Number**| Cursor for pagination. | [optional] 

### Return type

[**[UserEvent]**](UserEvent.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

