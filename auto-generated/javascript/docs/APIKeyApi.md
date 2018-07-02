# BitMexApi.APIKeyApi

All URIs are relative to *https://localhost/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**aPIKeyDisable**](APIKeyApi.md#aPIKeyDisable) | **POST** /apiKey/disable | Disable an API Key.
[**aPIKeyEnable**](APIKeyApi.md#aPIKeyEnable) | **POST** /apiKey/enable | Enable an API Key.
[**aPIKeyGet**](APIKeyApi.md#aPIKeyGet) | **GET** /apiKey | Get your API Keys.
[**aPIKeyNew**](APIKeyApi.md#aPIKeyNew) | **POST** /apiKey | Create a new API Key.
[**aPIKeyRemove**](APIKeyApi.md#aPIKeyRemove) | **DELETE** /apiKey | Remove an API Key.


<a name="aPIKeyDisable"></a>
# **aPIKeyDisable**
> APIKey aPIKeyDisable(apiKeyID)

Disable an API Key.

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

var apiInstance = new BitMexApi.APIKeyApi();

var apiKeyID = "apiKeyID_example"; // String | API Key ID (public component).


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.aPIKeyDisable(apiKeyID, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiKeyID** | **String**| API Key ID (public component). | 

### Return type

[**APIKey**](APIKey.md)

### Authorization

[apiKey](../README.md#apiKey), [apiNonce](../README.md#apiNonce), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="aPIKeyEnable"></a>
# **aPIKeyEnable**
> APIKey aPIKeyEnable(apiKeyID)

Enable an API Key.

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

var apiInstance = new BitMexApi.APIKeyApi();

var apiKeyID = "apiKeyID_example"; // String | API Key ID (public component).


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.aPIKeyEnable(apiKeyID, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiKeyID** | **String**| API Key ID (public component). | 

### Return type

[**APIKey**](APIKey.md)

### Authorization

[apiKey](../README.md#apiKey), [apiNonce](../README.md#apiNonce), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="aPIKeyGet"></a>
# **aPIKeyGet**
> [APIKey] aPIKeyGet(opts)

Get your API Keys.

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

var apiInstance = new BitMexApi.APIKeyApi();

var opts = { 
  'reverse': false // Boolean | If true, will sort results newest first.
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.aPIKeyGet(opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reverse** | **Boolean**| If true, will sort results newest first. | [optional] [default to false]

### Return type

[**[APIKey]**](APIKey.md)

### Authorization

[apiKey](../README.md#apiKey), [apiNonce](../README.md#apiNonce), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="aPIKeyNew"></a>
# **aPIKeyNew**
> APIKey aPIKeyNew(opts)

Create a new API Key.

API Keys can only be created via the frontend.

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

var apiInstance = new BitMexApi.APIKeyApi();

var opts = { 
  'name': "name_example", // String | Key name. This name is for reference only.
  'cidr': "cidr_example", // String | CIDR block to restrict this key to. To restrict to a single address, append \"/32\", e.g. 207.39.29.22/32. Leave blank or set to 0.0.0.0/0 to allow all IPs. Only one block may be set. <a href=\"http://software77.net/cidr-101.html\">More on CIDR blocks</a>
  'permissions': "permissions_example", // String | Key Permissions. All keys can read margin and position data. Additional permissions must be added. Available: [\"order\", \"orderCancel\", \"withdraw\"].
  'enabled': false, // Boolean | Set to true to enable this key on creation. Otherwise, it must be explicitly enabled via /apiKey/enable.
  'token': "token_example" // String | OTP Token (YubiKey, Google Authenticator)
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.aPIKeyNew(opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Key name. This name is for reference only. | [optional] 
 **cidr** | **String**| CIDR block to restrict this key to. To restrict to a single address, append \&quot;/32\&quot;, e.g. 207.39.29.22/32. Leave blank or set to 0.0.0.0/0 to allow all IPs. Only one block may be set. &lt;a href&#x3D;\&quot;http://software77.net/cidr-101.html\&quot;&gt;More on CIDR blocks&lt;/a&gt; | [optional] 
 **permissions** | **String**| Key Permissions. All keys can read margin and position data. Additional permissions must be added. Available: [\&quot;order\&quot;, \&quot;orderCancel\&quot;, \&quot;withdraw\&quot;]. | [optional] 
 **enabled** | **Boolean**| Set to true to enable this key on creation. Otherwise, it must be explicitly enabled via /apiKey/enable. | [optional] [default to false]
 **token** | **String**| OTP Token (YubiKey, Google Authenticator) | [optional] 

### Return type

[**APIKey**](APIKey.md)

### Authorization

[apiKey](../README.md#apiKey), [apiNonce](../README.md#apiNonce), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="aPIKeyRemove"></a>
# **aPIKeyRemove**
> InlineResponse200 aPIKeyRemove(apiKeyID)

Remove an API Key.

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

var apiInstance = new BitMexApi.APIKeyApi();

var apiKeyID = "apiKeyID_example"; // String | API Key ID (public component).


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.aPIKeyRemove(apiKeyID, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiKeyID** | **String**| API Key ID (public component). | 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[apiKey](../README.md#apiKey), [apiNonce](../README.md#apiNonce), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

