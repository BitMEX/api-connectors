# BitMexApi.PositionApi

All URIs are relative to *https://localhost/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**positionGet**](PositionApi.md#positionGet) | **GET** /position | Get your positions.
[**positionIsolateMargin**](PositionApi.md#positionIsolateMargin) | **POST** /position/isolate | Enable isolated margin or cross margin per-position.
[**positionTransferIsolatedMargin**](PositionApi.md#positionTransferIsolatedMargin) | **POST** /position/transferMargin | Transfer equity in or out of a position.
[**positionUpdateLeverage**](PositionApi.md#positionUpdateLeverage) | **POST** /position/leverage | Choose leverage for a position.
[**positionUpdateRiskLimit**](PositionApi.md#positionUpdateRiskLimit) | **POST** /position/riskLimit | Update your risk limit.


<a name="positionGet"></a>
# **positionGet**
> [Position] positionGet(opts)

Get your positions.

See &lt;a href&#x3D;\&quot;http://www.onixs.biz/fix-dictionary/5.0.SP2/msgType_AP_6580.html\&quot;&gt;the FIX Spec&lt;/a&gt; for explanations of these fields.

### Example
```javascript
var BitMexApi = require('bit_mex_api');

var apiInstance = new BitMexApi.PositionApi();

var opts = { 
  'filter': "filter_example", // String | Table filter. For example, send {\"symbol\": \"XBT24H\"}.
  'columns': "columns_example", // String | Which columns to fetch. For example, send [\"columnName\"].
  'count': 3.4 // Number | Number of rows to fetch.
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.positionGet(opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **String**| Table filter. For example, send {\&quot;symbol\&quot;: \&quot;XBT24H\&quot;}. | [optional] 
 **columns** | **String**| Which columns to fetch. For example, send [\&quot;columnName\&quot;]. | [optional] 
 **count** | **Number**| Number of rows to fetch. | [optional] 

### Return type

[**[Position]**](Position.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="positionIsolateMargin"></a>
# **positionIsolateMargin**
> Position positionIsolateMargin(symbol, opts)

Enable isolated margin or cross margin per-position.

On Speculative (DPE-Enabled) contracts, users can switch isolate margin per-position. This function allows switching margin isolation (aka fixed margin) on and off.

### Example
```javascript
var BitMexApi = require('bit_mex_api');

var apiInstance = new BitMexApi.PositionApi();

var symbol = "symbol_example"; // String | Position symbol to isolate.

var opts = { 
  'enabled': true // Boolean | True for isolated margin, false for cross margin.
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.positionIsolateMargin(symbol, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **String**| Position symbol to isolate. | 
 **enabled** | **Boolean**| True for isolated margin, false for cross margin. | [optional] [default to true]

### Return type

[**Position**](Position.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="positionTransferIsolatedMargin"></a>
# **positionTransferIsolatedMargin**
> Position positionTransferIsolatedMargin(symbol, amount)

Transfer equity in or out of a position.

When margin is isolated on a position, use this function to add or remove margin from the position. Note that you cannot remove margin below the initial margin threshold.

### Example
```javascript
var BitMexApi = require('bit_mex_api');

var apiInstance = new BitMexApi.PositionApi();

var symbol = "symbol_example"; // String | Symbol of position to isolate.

var amount = 3.4; // Number | Amount to transfer, in Satoshis. May be negative.


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.positionTransferIsolatedMargin(symbol, amount, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **String**| Symbol of position to isolate. | 
 **amount** | **Number**| Amount to transfer, in Satoshis. May be negative. | 

### Return type

[**Position**](Position.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="positionUpdateLeverage"></a>
# **positionUpdateLeverage**
> Position positionUpdateLeverage(symbol, leverage)

Choose leverage for a position.

On Speculative (DPE-Enabled) contracts, users can choose an isolated leverage. This will automatically enable isolated margin.

### Example
```javascript
var BitMexApi = require('bit_mex_api');

var apiInstance = new BitMexApi.PositionApi();

var symbol = "symbol_example"; // String | Symbol of position to adjust.

var leverage = 1.2; // Number | Leverage value. Send a number between 0.01 and 100 to enable isolated margin with a fixed leverage. Send 0 to enable cross margin.


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.positionUpdateLeverage(symbol, leverage, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **String**| Symbol of position to adjust. | 
 **leverage** | **Number**| Leverage value. Send a number between 0.01 and 100 to enable isolated margin with a fixed leverage. Send 0 to enable cross margin. | 

### Return type

[**Position**](Position.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="positionUpdateRiskLimit"></a>
# **positionUpdateRiskLimit**
> Position positionUpdateRiskLimit(symbol, riskLimit)

Update your risk limit.

Risk Limits limit the size of positions you can trade at various margin levels. Larger positions require more margin. Please see the Risk Limit documentation for more details.

### Example
```javascript
var BitMexApi = require('bit_mex_api');

var apiInstance = new BitMexApi.PositionApi();

var symbol = "symbol_example"; // String | Symbol of position to isolate.

var riskLimit = 3.4; // Number | New Risk Limit, in Satoshis.


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.positionUpdateRiskLimit(symbol, riskLimit, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **String**| Symbol of position to isolate. | 
 **riskLimit** | **Number**| New Risk Limit, in Satoshis. | 

### Return type

[**Position**](Position.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

