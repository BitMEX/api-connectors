# BitMexApi.PorlApi

All URIs are relative to *https://www.bitmex.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**porlGetNonce**](PorlApi.md#porlGetNonce) | **GET** /porl/nonce | Get your Proof of Reserves nonce and data.
[**porlGetSnapshots**](PorlApi.md#porlGetSnapshots) | **GET** /porl/snapshots | Get Proof of Reserves historical snapshots


<a name="porlGetNonce"></a>
# **porlGetNonce**
> Porl porlGetNonce()

Get your Proof of Reserves nonce and data.

## Proof of Reserves Nonce  This endpoint will return the nonce and associated data needed to validate BitMEX reserves data.  <! TODO link to docs, GitHub, etc > 

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

var apiInstance = new BitMexApi.PorlApi();

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.porlGetNonce(callback);
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Porl**](Porl.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="porlGetSnapshots"></a>
# **porlGetSnapshots**
> [XAny] porlGetSnapshots()

Get Proof of Reserves historical snapshots

### Example
```javascript
var BitMexApi = require('bit_mex_api');

var apiInstance = new BitMexApi.PorlApi();

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.porlGetSnapshots(callback);
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**[XAny]**](XAny.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

