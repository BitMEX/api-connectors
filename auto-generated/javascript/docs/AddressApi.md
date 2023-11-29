# BitMexApi.AddressApi

All URIs are relative to *https://www.bitmex.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addressGet**](AddressApi.md#addressGet) | **GET** /address | Get your addresses.
[**addressNew**](AddressApi.md#addressNew) | **POST** /address | Creates a new saved address.


<a name="addressGet"></a>
# **addressGet**
> [Address] addressGet()

Get your addresses.

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

var apiInstance = new BitMexApi.AddressApi();

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.addressGet(callback);
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**[Address]**](Address.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="addressNew"></a>
# **addressNew**
> Address addressNew(currency, network, address, name, opts)

Creates a new saved address.

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

var apiInstance = new BitMexApi.AddressApi();

var currency = "currency_example"; // String | Currency of the address. Options: `XBt`, `USDt`

var network = "network_example"; // String | Selected network.

var address = "address_example"; // String | Destination Address.

var name = "name_example"; // String | Name of the entry, eg. 'Hardware wallet'.

var opts = { 
  'note': "note_example", // String | Optional annotation.
  'skipConfirm': false, // Boolean | Skip e-mail confirmations for transfers to this address. Will require an email confirmation after creation.
  'skip2FA': false // Boolean | Skip 2FA confirmations for transfers to this address. Will require an email confirmation after creation.
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.addressNew(currency, network, address, name, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currency** | **String**| Currency of the address. Options: `XBt`, `USDt` | 
 **network** | **String**| Selected network. | 
 **address** | **String**| Destination Address. | 
 **name** | **String**| Name of the entry, eg. 'Hardware wallet'. | 
 **note** | **String**| Optional annotation. | [optional] 
 **skipConfirm** | **Boolean**| Skip e-mail confirmations for transfers to this address. Will require an email confirmation after creation. | [optional] [default to false]
 **skip2FA** | **Boolean**| Skip 2FA confirmations for transfers to this address. Will require an email confirmation after creation. | [optional] [default to false]

### Return type

[**Address**](Address.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

