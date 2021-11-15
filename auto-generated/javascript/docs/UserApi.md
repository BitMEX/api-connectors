# BitMexApi.UserApi

All URIs are relative to *https://www.bitmex.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**userCancelWithdrawal**](UserApi.md#userCancelWithdrawal) | **POST** /user/cancelWithdrawal | Cancel a withdrawal.
[**userCheckReferralCode**](UserApi.md#userCheckReferralCode) | **GET** /user/checkReferralCode | Check if a referral code is valid.
[**userCommunicationToken**](UserApi.md#userCommunicationToken) | **POST** /user/communicationToken | Register your communication token for mobile clients
[**userConfirm**](UserApi.md#userConfirm) | **POST** /user/confirmEmail | Confirm your email address with a token.
[**userConfirmWithdrawal**](UserApi.md#userConfirmWithdrawal) | **POST** /user/confirmWithdrawal | Confirm a withdrawal.
[**userGet**](UserApi.md#userGet) | **GET** /user | Get your user model.
[**userGetAffiliateStatus**](UserApi.md#userGetAffiliateStatus) | **GET** /user/affiliateStatus | Get your current affiliate/referral status.
[**userGetCommission**](UserApi.md#userGetCommission) | **GET** /user/commission | Get your account's commission status.
[**userGetDepositAddress**](UserApi.md#userGetDepositAddress) | **GET** /user/depositAddress | Get a deposit address.
[**userGetExecutionHistory**](UserApi.md#userGetExecutionHistory) | **GET** /user/executionHistory | Get the execution history by day.
[**userGetMargin**](UserApi.md#userGetMargin) | **GET** /user/margin | Get your account's margin status. Send a currency of \"all\" to receive an array of all supported currencies.
[**userGetQuoteFillRatio**](UserApi.md#userGetQuoteFillRatio) | **GET** /user/quoteFillRatio | Get 7 days worth of Quote Fill Ratio statistics.
[**userGetQuoteValueRatio**](UserApi.md#userGetQuoteValueRatio) | **GET** /user/quoteValueRatio | Get Quote Value Ratio statistics over the last 3 days
[**userGetTradingVolume**](UserApi.md#userGetTradingVolume) | **GET** /user/tradingVolume | Get your 30 days USD average trading volume
[**userGetWallet**](UserApi.md#userGetWallet) | **GET** /user/wallet | Get your current wallet information.
[**userGetWalletHistory**](UserApi.md#userGetWalletHistory) | **GET** /user/walletHistory | Get a history of all of your wallet transactions (deposits, withdrawals, PNL).
[**userGetWalletSummary**](UserApi.md#userGetWalletSummary) | **GET** /user/walletSummary | Get a summary of all of your wallet transactions (deposits, withdrawals, PNL).
[**userLogout**](UserApi.md#userLogout) | **POST** /user/logout | Log out of BitMEX.
[**userMinWithdrawalFee**](UserApi.md#userMinWithdrawalFee) | **GET** /user/minWithdrawalFee | Get the minimum, maximum, and recommended withdrawal fees for a currency.
[**userRequestWithdrawal**](UserApi.md#userRequestWithdrawal) | **POST** /user/requestWithdrawal | Request a withdrawal to an external wallet.
[**userSavePreferences**](UserApi.md#userSavePreferences) | **POST** /user/preferences | Save user preferences.


<a name="userCancelWithdrawal"></a>
# **userCancelWithdrawal**
> Transaction userCancelWithdrawal(token)

Cancel a withdrawal.

### Example
```javascript
var BitMexApi = require('bit_mex_api');

var apiInstance = new BitMexApi.UserApi();

var token = "token_example"; // String | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.userCancelWithdrawal(token, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**|  | 

### Return type

[**Transaction**](Transaction.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="userCheckReferralCode"></a>
# **userCheckReferralCode**
> 'Number' userCheckReferralCode(opts)

Check if a referral code is valid.

If the code is valid, responds with the referral code's discount (e.g. `0.1` for 10%). Otherwise, will return a 404 or 451 if invalid.

### Example
```javascript
var BitMexApi = require('bit_mex_api');

var apiInstance = new BitMexApi.UserApi();

var opts = { 
  'referralCode': "referralCode_example" // String | 
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.userCheckReferralCode(opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **referralCode** | **String**|  | [optional] 

### Return type

**'Number'**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="userCommunicationToken"></a>
# **userCommunicationToken**
> [CommunicationToken] userCommunicationToken(token, platformAgent)

Register your communication token for mobile clients

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

var apiInstance = new BitMexApi.UserApi();

var token = "token_example"; // String | 

var platformAgent = "platformAgent_example"; // String | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.userCommunicationToken(token, platformAgent, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**|  | 
 **platformAgent** | **String**|  | 

### Return type

[**[CommunicationToken]**](CommunicationToken.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="userConfirm"></a>
# **userConfirm**
> AccessToken userConfirm(token)

Confirm your email address with a token.

### Example
```javascript
var BitMexApi = require('bit_mex_api');

var apiInstance = new BitMexApi.UserApi();

var token = "token_example"; // String | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.userConfirm(token, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**|  | 

### Return type

[**AccessToken**](AccessToken.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="userConfirmWithdrawal"></a>
# **userConfirmWithdrawal**
> Transaction userConfirmWithdrawal(token)

Confirm a withdrawal.

### Example
```javascript
var BitMexApi = require('bit_mex_api');

var apiInstance = new BitMexApi.UserApi();

var token = "token_example"; // String | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.userConfirmWithdrawal(token, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**|  | 

### Return type

[**Transaction**](Transaction.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="userGet"></a>
# **userGet**
> User userGet()

Get your user model.

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

var apiInstance = new BitMexApi.UserApi();

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.userGet(callback);
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**User**](User.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="userGetAffiliateStatus"></a>
# **userGetAffiliateStatus**
> Affiliate userGetAffiliateStatus(opts)

Get your current affiliate/referral status.

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

var apiInstance = new BitMexApi.UserApi();

var opts = { 
  'currency': "XBt" // String | Options: `XBt`, `USDt`, `all`
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.userGetAffiliateStatus(opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currency** | **String**| Options: `XBt`, `USDt`, `all` | [optional] [default to XBt]

### Return type

[**Affiliate**](Affiliate.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="userGetCommission"></a>
# **userGetCommission**
> UserCommissionsBySymbol userGetCommission()

Get your account's commission status.

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

var apiInstance = new BitMexApi.UserApi();

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.userGetCommission(callback);
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**UserCommissionsBySymbol**](UserCommissionsBySymbol.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="userGetDepositAddress"></a>
# **userGetDepositAddress**
> 'String' userGetDepositAddress(opts)

Get a deposit address.

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

var apiInstance = new BitMexApi.UserApi();

var opts = { 
  'currency': "XBt" // String | Options: `XBt`, `USDt`
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.userGetDepositAddress(opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currency** | **String**| Options: `XBt`, `USDt` | [optional] [default to XBt]

### Return type

**'String'**

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="userGetExecutionHistory"></a>
# **userGetExecutionHistory**
> Object userGetExecutionHistory(symbol, timestamp)

Get the execution history by day.

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

var apiInstance = new BitMexApi.UserApi();

var symbol = "XBTUSD"; // String | 

var timestamp = new Date("2017-02-13T12:00:00.000Z"); // Date | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.userGetExecutionHistory(symbol, timestamp, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **String**|  | [default to XBTUSD]
 **timestamp** | **Date**|  | [default to 2017-02-13T12:00:00.000Z]

### Return type

**Object**

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="userGetMargin"></a>
# **userGetMargin**
> Margin userGetMargin(opts)

Get your account's margin status. Send a currency of \"all\" to receive an array of all supported currencies.

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

var apiInstance = new BitMexApi.UserApi();

var opts = { 
  'currency': "XBt" // String | Options: `XBt`, `USDt`, `all`
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.userGetMargin(opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currency** | **String**| Options: `XBt`, `USDt`, `all` | [optional] [default to XBt]

### Return type

[**Margin**](Margin.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="userGetQuoteFillRatio"></a>
# **userGetQuoteFillRatio**
> QuoteFillRatio userGetQuoteFillRatio()

Get 7 days worth of Quote Fill Ratio statistics.

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

var apiInstance = new BitMexApi.UserApi();

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.userGetQuoteFillRatio(callback);
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**QuoteFillRatio**](QuoteFillRatio.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="userGetQuoteValueRatio"></a>
# **userGetQuoteValueRatio**
> QuoteValueRatio userGetQuoteValueRatio()

Get Quote Value Ratio statistics over the last 3 days

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

var apiInstance = new BitMexApi.UserApi();

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.userGetQuoteValueRatio(callback);
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**QuoteValueRatio**](QuoteValueRatio.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="userGetTradingVolume"></a>
# **userGetTradingVolume**
> TradingVolume userGetTradingVolume()

Get your 30 days USD average trading volume

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

var apiInstance = new BitMexApi.UserApi();

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.userGetTradingVolume(callback);
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**TradingVolume**](TradingVolume.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="userGetWallet"></a>
# **userGetWallet**
> Wallet userGetWallet(opts)

Get your current wallet information.

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

var apiInstance = new BitMexApi.UserApi();

var opts = { 
  'currency': "XBt" // String | Options: `XBt`, `USDt`, `all`
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.userGetWallet(opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currency** | **String**| Options: `XBt`, `USDt`, `all` | [optional] [default to XBt]

### Return type

[**Wallet**](Wallet.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="userGetWalletHistory"></a>
# **userGetWalletHistory**
> [Transaction] userGetWalletHistory(opts)

Get a history of all of your wallet transactions (deposits, withdrawals, PNL).

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

var apiInstance = new BitMexApi.UserApi();

var opts = { 
  'currency': "XBt", // String | Options: `XBt`, `USDt`, `all`
  'count': 100, // Number | Number of results to fetch.
  'start': 0 // Number | Starting point for results.
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.userGetWalletHistory(opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currency** | **String**| Options: `XBt`, `USDt`, `all` | [optional] [default to XBt]
 **count** | **Number**| Number of results to fetch. | [optional] [default to 100]
 **start** | **Number**| Starting point for results. | [optional] [default to 0]

### Return type

[**[Transaction]**](Transaction.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="userGetWalletSummary"></a>
# **userGetWalletSummary**
> [Transaction] userGetWalletSummary(opts)

Get a summary of all of your wallet transactions (deposits, withdrawals, PNL).

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

var apiInstance = new BitMexApi.UserApi();

var opts = { 
  'currency': "XBt" // String | Options: `XBt`, `USDt`, `all`
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.userGetWalletSummary(opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currency** | **String**| Options: `XBt`, `USDt`, `all` | [optional] [default to XBt]

### Return type

[**[Transaction]**](Transaction.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="userLogout"></a>
# **userLogout**
> userLogout()

Log out of BitMEX.

### Example
```javascript
var BitMexApi = require('bit_mex_api');

var apiInstance = new BitMexApi.UserApi();

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.userLogout(callback);
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="userMinWithdrawalFee"></a>
# **userMinWithdrawalFee**
> Object userMinWithdrawalFee(opts)

Get the minimum, maximum, and recommended withdrawal fees for a currency.

This is changed based on network conditions to ensure timely withdrawals. During network congestion, this may be high. The fee is returned in the same currency.  The \"fee\" field is the recommended fee for fast confirmation on the blockchain.

### Example
```javascript
var BitMexApi = require('bit_mex_api');

var apiInstance = new BitMexApi.UserApi();

var opts = { 
  'currency': "XBt", // String | Options: `XBt`, `USDt`
  'amount': 1.2 // Number | 
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.userMinWithdrawalFee(opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currency** | **String**| Options: `XBt`, `USDt` | [optional] [default to XBt]
 **amount** | **Number**|  | [optional] 

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="userRequestWithdrawal"></a>
# **userRequestWithdrawal**
> Transaction userRequestWithdrawal(currency, amount, opts)

Request a withdrawal to an external wallet.

This will send a confirmation email to the email address on record.

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

var apiInstance = new BitMexApi.UserApi();

var currency = "XBt"; // String | Currency you're withdrawing. Options: `XBt`, `USDt`

var amount = 8.14; // Number | Amount of withdrawal currency.

var opts = { 
  'otpToken': "otpToken_example", // String | 2FA token. Required for all external withdrawals.
  'address': "address_example", // String | Destination Address. One of `address`, `addressId`, `targetUserId` has to be specified.
  'addressId': 1.2, // Number | ID of the Destination Address. One of `address`, `targetUserId`, `targetUserId` has to be specified.
  'targetUserId': 1.2, // Number | ID of the Target User. One of `address`, `addressId`, `targetUserId` has to be specified.
  'fee': 1.2, // Number | Network fee for Bitcoin withdrawals. If not specified, a default value will be calculated based on Bitcoin network conditions. You will have a chance to confirm this via email.
  'text': "text_example" // String | Optional annotation, e.g. 'Transfer to home wallet'.
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.userRequestWithdrawal(currency, amount, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currency** | **String**| Currency you're withdrawing. Options: `XBt`, `USDt` | [default to XBt]
 **amount** | **Number**| Amount of withdrawal currency. | 
 **otpToken** | **String**| 2FA token. Required for all external withdrawals. | [optional] 
 **address** | **String**| Destination Address. One of `address`, `addressId`, `targetUserId` has to be specified. | [optional] 
 **addressId** | **Number**| ID of the Destination Address. One of `address`, `targetUserId`, `targetUserId` has to be specified. | [optional] 
 **targetUserId** | **Number**| ID of the Target User. One of `address`, `addressId`, `targetUserId` has to be specified. | [optional] 
 **fee** | **Number**| Network fee for Bitcoin withdrawals. If not specified, a default value will be calculated based on Bitcoin network conditions. You will have a chance to confirm this via email. | [optional] 
 **text** | **String**| Optional annotation, e.g. 'Transfer to home wallet'. | [optional] 

### Return type

[**Transaction**](Transaction.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="userSavePreferences"></a>
# **userSavePreferences**
> User userSavePreferences(prefs, opts)

Save user preferences.

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

var apiInstance = new BitMexApi.UserApi();

var prefs = "prefs_example"; // String | 

var opts = { 
  'overwrite': false // Boolean | If true, will overwrite all existing preferences.
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.userSavePreferences(prefs, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **prefs** | **String**|  | 
 **overwrite** | **Boolean**| If true, will overwrite all existing preferences. | [optional] [default to false]

### Return type

[**User**](User.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

