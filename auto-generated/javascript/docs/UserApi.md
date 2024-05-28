# BitMexApi.UserApi

All URIs are relative to *https://www.bitmex.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**userCancelPendingWithdrawal**](UserApi.md#userCancelPendingWithdrawal) | **DELETE** /user/withdrawal | Cancel pending withdrawal
[**userCancelWithdrawal**](UserApi.md#userCancelWithdrawal) | **POST** /user/cancelWithdrawal | Cancel a withdrawal.
[**userCheckReferralCode**](UserApi.md#userCheckReferralCode) | **GET** /user/checkReferralCode | Check if a referral code is valid.
[**userCommunicationToken**](UserApi.md#userCommunicationToken) | **POST** /user/communicationToken | Register your communication token for mobile clients
[**userConfirm**](UserApi.md#userConfirm) | **POST** /user/confirmEmail | Confirm your email address with a token.
[**userConfirmWithdrawal**](UserApi.md#userConfirmWithdrawal) | **POST** /user/confirmWithdrawal | Confirm a withdrawal.
[**userCreateSubAccount**](UserApi.md#userCreateSubAccount) | **POST** /user/addSubaccount | Creates a new sub-account.
[**userCreateUnstakingRequests**](UserApi.md#userCreateUnstakingRequests) | **POST** /user/unstakingRequests | Create unstaking request
[**userDeleteUnstakingRequests**](UserApi.md#userDeleteUnstakingRequests) | **DELETE** /user/unstakingRequests | Cancel unstaking request
[**userGet**](UserApi.md#userGet) | **GET** /user | Get your user model.
[**userGetAffiliateStatus**](UserApi.md#userGetAffiliateStatus) | **GET** /user/affiliateStatus | Get your current affiliate/referral status.
[**userGetCSA**](UserApi.md#userGetCSA) | **GET** /user/csa | Get your account's CSA status.
[**userGetCommission**](UserApi.md#userGetCommission) | **GET** /user/commission | Get your account's commission status.
[**userGetDepositAddress**](UserApi.md#userGetDepositAddress) | **GET** /user/depositAddress | Get a deposit address.
[**userGetDepositAddressInformation**](UserApi.md#userGetDepositAddressInformation) | **GET** /user/depositAddressInformation | Get a deposit address.
[**userGetExecutionHistory**](UserApi.md#userGetExecutionHistory) | **GET** /user/executionHistory | Get the execution history by day.
[**userGetMargin**](UserApi.md#userGetMargin) | **GET** /user/margin | Get your account's margin status. Send a currency of \"all\" to receive an array of all supported currencies.
[**userGetQuoteFillRatio**](UserApi.md#userGetQuoteFillRatio) | **GET** /user/quoteFillRatio | Get 7 days worth of Quote Fill Ratio statistics.
[**userGetQuoteValueRatio**](UserApi.md#userGetQuoteValueRatio) | **GET** /user/quoteValueRatio | Get Quote Value Ratio statistics over the last 3 days
[**userGetStaking**](UserApi.md#userGetStaking) | **GET** /user/staking | Get the current user staking amount.
[**userGetStakingInstruments**](UserApi.md#userGetStakingInstruments) | **GET** /user/staking/instruments | List staking instruments
[**userGetStakingTiers**](UserApi.md#userGetStakingTiers) | **GET** /user/staking/tiers | List staking tiers for a given currency
[**userGetTradingVolume**](UserApi.md#userGetTradingVolume) | **GET** /user/tradingVolume | Get your 30 days USD average trading volume
[**userGetUnstakingRequests**](UserApi.md#userGetUnstakingRequests) | **GET** /user/unstakingRequests | Get the current user unstaking requests
[**userGetWallet**](UserApi.md#userGetWallet) | **GET** /user/wallet | Get your current wallet information.
[**userGetWalletHistory**](UserApi.md#userGetWalletHistory) | **GET** /user/walletHistory | Get a history of all of your wallet transactions (deposits, withdrawals, PNL).
[**userGetWalletSummary**](UserApi.md#userGetWalletSummary) | **GET** /user/walletSummary | Get a summary of all of your wallet transactions (deposits, withdrawals, PNL).
[**userGetWalletTransferAccounts**](UserApi.md#userGetWalletTransferAccounts) | **GET** /user/getWalletTransferAccounts | Get the list of accounts you can transfer funds between.
[**userLogout**](UserApi.md#userLogout) | **POST** /user/logout | Log out of BitMEX.
[**userRequestWithdrawal**](UserApi.md#userRequestWithdrawal) | **POST** /user/requestWithdrawal | Request a withdrawal to an external wallet.
[**userSavePreferences**](UserApi.md#userSavePreferences) | **POST** /user/preferences | Save user preferences.
[**userUpdateSubAccount**](UserApi.md#userUpdateSubAccount) | **POST** /user/updateSubaccount | Updates the sub-account name.
[**userWalletTransfer**](UserApi.md#userWalletTransfer) | **POST** /user/walletTransfer | Execute a transfer to a paired account.


<a name="userCancelPendingWithdrawal"></a>
# **userCancelPendingWithdrawal**
> Object userCancelPendingWithdrawal(transactID)

Cancel pending withdrawal

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

var transactID = "transactID_example"; // String | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.userCancelPendingWithdrawal(transactID, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transactID** | **String**|  | 

### Return type

**Object**

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

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
> Object userCheckReferralCode(opts)

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

**Object**

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

<a name="userCreateSubAccount"></a>
# **userCreateSubAccount**
> Object userCreateSubAccount(accountName)

Creates a new sub-account.

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

var accountName = "accountName_example"; // String | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.userCreateSubAccount(accountName, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountName** | **String**|  | 

### Return type

**Object**

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="userCreateUnstakingRequests"></a>
# **userCreateUnstakingRequests**
> Object userCreateUnstakingRequests(symbol, amount)

Create unstaking request

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

var symbol = "symbol_example"; // String | 

var amount = 1.2; // Number | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.userCreateUnstakingRequests(symbol, amount, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **String**|  | 
 **amount** | **Number**|  | 

### Return type

**Object**

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="userDeleteUnstakingRequests"></a>
# **userDeleteUnstakingRequests**
> Object userDeleteUnstakingRequests(redemptionID)

Cancel unstaking request

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

var redemptionID = "redemptionID_example"; // String | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.userDeleteUnstakingRequests(redemptionID, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **redemptionID** | **String**|  | 

### Return type

**Object**

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

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
  'currency': "XBt" // String | Any currency. For all currencies, see <a href=\"#!/Wallet/Wallet_getAssetsConfig\">asset config endpoint</a>. For all currencies specify \"all\"
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
 **currency** | **String**| Any currency. For all currencies, see <a href=\"#!/Wallet/Wallet_getAssetsConfig\">asset config endpoint</a>. For all currencies specify \"all\" | [optional] [default to XBt]

### Return type

[**Affiliate**](Affiliate.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="userGetCSA"></a>
# **userGetCSA**
> CollateralSupportAgreement userGetCSA()

Get your account's CSA status.

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
apiInstance.userGetCSA(callback);
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**CollateralSupportAgreement**](CollateralSupportAgreement.md)

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
> 'String' userGetDepositAddress(currency, network)

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

var currency = "currency_example"; // String | Any currency. For all currencies, see <a href=\"#!/Wallet/Wallet_getAssetsConfig\">asset config endpoint</a>

var network = "network_example"; // String | The `network` parameter is used to indicate which blockchain you would like to deposit from. The acceptable value in the `network` parameter for each currency can be found from `networks.asset` from `GET /wallet/assets`.


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.userGetDepositAddress(currency, network, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currency** | **String**| Any currency. For all currencies, see <a href=\"#!/Wallet/Wallet_getAssetsConfig\">asset config endpoint</a> | 
 **network** | **String**| The `network` parameter is used to indicate which blockchain you would like to deposit from. The acceptable value in the `network` parameter for each currency can be found from `networks.asset` from `GET /wallet/assets`. | 

### Return type

**'String'**

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="userGetDepositAddressInformation"></a>
# **userGetDepositAddressInformation**
> DepositAddress userGetDepositAddressInformation(currency, network)

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

var currency = "currency_example"; // String | Any currency. For all currencies, see <a href=\"#!/Wallet/Wallet_getAssetsConfig\">asset config endpoint</a>

var network = "network_example"; // String | The `network` parameter is used to indicate which blockchain you would like to deposit from. The acceptable value in the `network` parameter for each currency can be found from `networks.asset` from `GET /wallet/assets`.


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.userGetDepositAddressInformation(currency, network, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currency** | **String**| Any currency. For all currencies, see <a href=\"#!/Wallet/Wallet_getAssetsConfig\">asset config endpoint</a> | 
 **network** | **String**| The `network` parameter is used to indicate which blockchain you would like to deposit from. The acceptable value in the `network` parameter for each currency can be found from `networks.asset` from `GET /wallet/assets`. | 

### Return type

[**DepositAddress**](DepositAddress.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="userGetExecutionHistory"></a>
# **userGetExecutionHistory**
> [Execution] userGetExecutionHistory(symbol, timestamp)

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

[**[Execution]**](Execution.md)

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
  'currency': "XBt" // String | Any currency. For all currencies, see <a href=\"#!/Wallet/Wallet_getAssetsConfig\">asset config endpoint</a>. For all currencies specify \"all\"
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
 **currency** | **String**| Any currency. For all currencies, see <a href=\"#!/Wallet/Wallet_getAssetsConfig\">asset config endpoint</a>. For all currencies specify \"all\" | [optional] [default to XBt]

### Return type

[**Margin**](Margin.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="userGetQuoteFillRatio"></a>
# **userGetQuoteFillRatio**
> QuoteFillRatio userGetQuoteFillRatio(opts)

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

var opts = { 
  'targetAccountId': 1.2 // Number | AccountId to get quote fill ratio for, must be a paired account with main user. Can be wildcard * to get all accounts linked to the authenticated user
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.userGetQuoteFillRatio(opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **targetAccountId** | **Number**| AccountId to get quote fill ratio for, must be a paired account with main user. Can be wildcard * to get all accounts linked to the authenticated user | [optional] 

### Return type

[**QuoteFillRatio**](QuoteFillRatio.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="userGetQuoteValueRatio"></a>
# **userGetQuoteValueRatio**
> QuoteValueRatio userGetQuoteValueRatio(opts)

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

var opts = { 
  'targetAccountId': 1.2 // Number | AccountId to get quote value ratio for, must be a paired account with main user. Can be wildcard * to get all accounts linked to the authenticated user
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.userGetQuoteValueRatio(opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **targetAccountId** | **Number**| AccountId to get quote value ratio for, must be a paired account with main user. Can be wildcard * to get all accounts linked to the authenticated user | [optional] 

### Return type

[**QuoteValueRatio**](QuoteValueRatio.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="userGetStaking"></a>
# **userGetStaking**
> [StakingRecord] userGetStaking(opts)

Get the current user staking amount.

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
  'currency': "currency_example" // String | 
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.userGetStaking(opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currency** | **String**|  | [optional] 

### Return type

[**[StakingRecord]**](StakingRecord.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="userGetStakingInstruments"></a>
# **userGetStakingInstruments**
> [XAny] userGetStakingInstruments(opts)

List staking instruments

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
  'symbol': "symbol_example", // String | 
  'currency': "currency_example" // String | 
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.userGetStakingInstruments(opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **String**|  | [optional] 
 **currency** | **String**|  | [optional] 

### Return type

[**[XAny]**](XAny.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="userGetStakingTiers"></a>
# **userGetStakingTiers**
> [XAny] userGetStakingTiers(currency)

List staking tiers for a given currency

### Example
```javascript
var BitMexApi = require('bit_mex_api');

var apiInstance = new BitMexApi.UserApi();

var currency = "currency_example"; // String | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.userGetStakingTiers(currency, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currency** | **String**|  | 

### Return type

[**[XAny]**](XAny.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="userGetTradingVolume"></a>
# **userGetTradingVolume**
> [TradingVolume] userGetTradingVolume()

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

[**[TradingVolume]**](TradingVolume.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="userGetUnstakingRequests"></a>
# **userGetUnstakingRequests**
> [StakingRecord] userGetUnstakingRequests(status)

Get the current user unstaking requests

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

var status = "status_example"; // String | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.userGetUnstakingRequests(status, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **status** | **String**|  | 

### Return type

[**[StakingRecord]**](StakingRecord.md)

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
  'currency': "XBt" // String | Any currency. For all currencies, see <a href=\"#!/Wallet/Wallet_getAssetsConfig\">asset config endpoint</a>. For all currencies specify \"all\"
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
 **currency** | **String**| Any currency. For all currencies, see <a href=\"#!/Wallet/Wallet_getAssetsConfig\">asset config endpoint</a>. For all currencies specify \"all\" | [optional] [default to XBt]

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
  'currency': "XBt", // String | Any currency. For all currencies, see <a href=\"#!/Wallet/Wallet_getAssetsConfig\">asset config endpoint</a>. For all currencies specify \"all\"
  'count': 10000, // Number | Number of results to fetch. Fetch results from start to start + count. Max: 10,000 rows.
  'start': 0, // Number | Starting point for results, integer. Default 0.
  'targetAccountId': 1.2, // Number | AccountId to view the history of, must be a paired account with the authorised user requesting the history.
  'reverse': true // Boolean | Start from the latest transaction record. Default true.
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
 **currency** | **String**| Any currency. For all currencies, see <a href=\"#!/Wallet/Wallet_getAssetsConfig\">asset config endpoint</a>. For all currencies specify \"all\" | [optional] [default to XBt]
 **count** | **Number**| Number of results to fetch. Fetch results from start to start + count. Max: 10,000 rows. | [optional] [default to 10000]
 **start** | **Number**| Starting point for results, integer. Default 0. | [optional] [default to 0]
 **targetAccountId** | **Number**| AccountId to view the history of, must be a paired account with the authorised user requesting the history. | [optional] 
 **reverse** | **Boolean**| Start from the latest transaction record. Default true. | [optional] [default to true]

### Return type

[**[Transaction]**](Transaction.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="userGetWalletSummary"></a>
# **userGetWalletSummary**
> [WalletSummaryRecord] userGetWalletSummary(opts)

Get a summary of all of your wallet transactions (deposits, withdrawals, PNL).

Provides an aggregated view of transactions, by transaction type, over a specific time period.

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
  'currency': "XBt", // String | Any currency. For all currencies, see <a href=\"#!/Wallet/Wallet_getAssetsConfig\">asset config endpoint</a>. For all currencies specify \"all\"
  'startTime': new Date("2013-10-20T19:20:30+01:00"), // Date | Start time for the summary
  'endTime': new Date("2013-10-20T19:20:30+01:00") // Date | End time for the summary
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
 **currency** | **String**| Any currency. For all currencies, see <a href=\"#!/Wallet/Wallet_getAssetsConfig\">asset config endpoint</a>. For all currencies specify \"all\" | [optional] [default to XBt]
 **startTime** | **Date**| Start time for the summary | [optional] 
 **endTime** | **Date**| End time for the summary | [optional] 

### Return type

[**[WalletSummaryRecord]**](WalletSummaryRecord.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="userGetWalletTransferAccounts"></a>
# **userGetWalletTransferAccounts**
> [XAny] userGetWalletTransferAccounts()

Get the list of accounts you can transfer funds between.

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
apiInstance.userGetWalletTransferAccounts(callback);
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**[XAny]**](XAny.md)

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

<a name="userRequestWithdrawal"></a>
# **userRequestWithdrawal**
> Transaction userRequestWithdrawal(currency, network, amount, opts)

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

var currency = "XBt"; // String | Currency you're withdrawing. Any currency. For all currencies, see <a href=\"#!/Wallet/Wallet_getAssetsConfig\">asset config endpoint</a>

var network = "network_example"; // String | The `network` parameter is used to indicate which blockchain you would like to withdraw from. The acceptable value in the `network` parameter for each currency can be found from `networks.asset` from `GET /wallet/assets`.

var amount = 8.14; // Number | Amount of withdrawal currency.

var opts = { 
  'otpToken': "otpToken_example", // String | 2FA token. Required for all external withdrawals unless the address has skip2FA in addressbook.
  'address': "address_example", // String | Destination Address. One of `address`, `addressId`, `targetUserId` has to be specified.
  'memo': "memo_example", // String | Destination Memo. If `address`, is specified, Destination Memo can also be specified
  'addressId': 1.2, // Number | ID of the Destination Address. One of `address`, `addressId`, `targetUserId` has to be specified.
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
apiInstance.userRequestWithdrawal(currency, network, amount, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currency** | **String**| Currency you're withdrawing. Any currency. For all currencies, see <a href=\"#!/Wallet/Wallet_getAssetsConfig\">asset config endpoint</a> | [default to XBt]
 **network** | **String**| The `network` parameter is used to indicate which blockchain you would like to withdraw from. The acceptable value in the `network` parameter for each currency can be found from `networks.asset` from `GET /wallet/assets`. | 
 **amount** | **Number**| Amount of withdrawal currency. | 
 **otpToken** | **String**| 2FA token. Required for all external withdrawals unless the address has skip2FA in addressbook. | [optional] 
 **address** | **String**| Destination Address. One of `address`, `addressId`, `targetUserId` has to be specified. | [optional] 
 **memo** | **String**| Destination Memo. If `address`, is specified, Destination Memo can also be specified | [optional] 
 **addressId** | **Number**| ID of the Destination Address. One of `address`, `addressId`, `targetUserId` has to be specified. | [optional] 
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

<a name="userUpdateSubAccount"></a>
# **userUpdateSubAccount**
> Object userUpdateSubAccount(targetAccountId, accountName)

Updates the sub-account name.

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

var targetAccountId = 1.2; // Number | 

var accountName = "accountName_example"; // String | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.userUpdateSubAccount(targetAccountId, accountName, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **targetAccountId** | **Number**|  | 
 **accountName** | **String**|  | 

### Return type

**Object**

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="userWalletTransfer"></a>
# **userWalletTransfer**
> Transaction userWalletTransfer(currency, amount, targetAccountId, opts)

Execute a transfer to a paired account.

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

var currency = "currency_example"; // String | Currency you're transfering. Any currency. For all currencies, see <a href=\"#!/Wallet/Wallet_getAssetsConfig\">asset config endpoint</a>

var amount = 8.14; // Number | Amount of transfer.

var targetAccountId = 1.2; // Number | AccountId to send the transfer to, must be a paired account with the user sending the transfer.

var opts = { 
  'fromAccountId': 1.2 // Number | AccountID to send the transfer from. Must be paired account with the authenticated user.
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.userWalletTransfer(currency, amount, targetAccountId, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currency** | **String**| Currency you're transfering. Any currency. For all currencies, see <a href=\"#!/Wallet/Wallet_getAssetsConfig\">asset config endpoint</a> | 
 **amount** | **Number**| Amount of transfer. | 
 **targetAccountId** | **Number**| AccountId to send the transfer to, must be a paired account with the user sending the transfer. | 
 **fromAccountId** | **Number**| AccountID to send the transfer from. Must be paired account with the authenticated user. | [optional] 

### Return type

[**Transaction**](Transaction.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

