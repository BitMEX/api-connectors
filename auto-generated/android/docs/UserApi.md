# UserApi

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
[**userGetCommission**](UserApi.md#userGetCommission) | **GET** /user/commission | Get your account&#39;s commission status.
[**userGetDepositAddress**](UserApi.md#userGetDepositAddress) | **GET** /user/depositAddress | Get a deposit address.
[**userGetExecutionHistory**](UserApi.md#userGetExecutionHistory) | **GET** /user/executionHistory | Get the execution history by day.
[**userGetMargin**](UserApi.md#userGetMargin) | **GET** /user/margin | Get your account&#39;s margin status. Send a currency of \&quot;all\&quot; to receive an array of all supported currencies.
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
```java
// Import classes:
//import io.swagger.client.api.UserApi;

UserApi apiInstance = new UserApi();
String token = "token_example"; // String | 
try {
    Transaction result = apiInstance.userCancelWithdrawal(token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#userCancelWithdrawal");
    e.printStackTrace();
}
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
> Double userCheckReferralCode(referralCode)

Check if a referral code is valid.

If the code is valid, responds with the referral code&#39;s discount (e.g. &#x60;0.1&#x60; for 10%). Otherwise, will return a 404 or 451 if invalid.

### Example
```java
// Import classes:
//import io.swagger.client.api.UserApi;

UserApi apiInstance = new UserApi();
String referralCode = "referralCode_example"; // String | 
try {
    Double result = apiInstance.userCheckReferralCode(referralCode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#userCheckReferralCode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **referralCode** | **String**|  | [optional]

### Return type

**Double**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="userCommunicationToken"></a>
# **userCommunicationToken**
> List&lt;CommunicationToken&gt; userCommunicationToken(token, platformAgent)

Register your communication token for mobile clients

### Example
```java
// Import classes:
//import io.swagger.client.api.UserApi;

UserApi apiInstance = new UserApi();
String token = "token_example"; // String | 
String platformAgent = "platformAgent_example"; // String | 
try {
    List<CommunicationToken> result = apiInstance.userCommunicationToken(token, platformAgent);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#userCommunicationToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**|  |
 **platformAgent** | **String**|  |

### Return type

[**List&lt;CommunicationToken&gt;**](CommunicationToken.md)

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
```java
// Import classes:
//import io.swagger.client.api.UserApi;

UserApi apiInstance = new UserApi();
String token = "token_example"; // String | 
try {
    AccessToken result = apiInstance.userConfirm(token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#userConfirm");
    e.printStackTrace();
}
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
```java
// Import classes:
//import io.swagger.client.api.UserApi;

UserApi apiInstance = new UserApi();
String token = "token_example"; // String | 
try {
    Transaction result = apiInstance.userConfirmWithdrawal(token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#userConfirmWithdrawal");
    e.printStackTrace();
}
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
```java
// Import classes:
//import io.swagger.client.api.UserApi;

UserApi apiInstance = new UserApi();
try {
    User result = apiInstance.userGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#userGet");
    e.printStackTrace();
}
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
> Affiliate userGetAffiliateStatus(currency)

Get your current affiliate/referral status.

### Example
```java
// Import classes:
//import io.swagger.client.api.UserApi;

UserApi apiInstance = new UserApi();
String currency = "XBt"; // String | Options: `XBt`, `USDt`, `all`
try {
    Affiliate result = apiInstance.userGetAffiliateStatus(currency);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#userGetAffiliateStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currency** | **String**| Options: &#x60;XBt&#x60;, &#x60;USDt&#x60;, &#x60;all&#x60; | [optional] [default to XBt]

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

Get your account&#39;s commission status.

### Example
```java
// Import classes:
//import io.swagger.client.api.UserApi;

UserApi apiInstance = new UserApi();
try {
    UserCommissionsBySymbol result = apiInstance.userGetCommission();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#userGetCommission");
    e.printStackTrace();
}
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
> String userGetDepositAddress(currency)

Get a deposit address.

### Example
```java
// Import classes:
//import io.swagger.client.api.UserApi;

UserApi apiInstance = new UserApi();
String currency = "XBt"; // String | Options: `XBt`, `USDt`
try {
    String result = apiInstance.userGetDepositAddress(currency);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#userGetDepositAddress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currency** | **String**| Options: &#x60;XBt&#x60;, &#x60;USDt&#x60; | [optional] [default to XBt]

### Return type

**String**

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
```java
// Import classes:
//import io.swagger.client.api.UserApi;

UserApi apiInstance = new UserApi();
String symbol = "XBTUSD"; // String | 
Date timestamp = new Date(); // Date | 
try {
    Object result = apiInstance.userGetExecutionHistory(symbol, timestamp);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#userGetExecutionHistory");
    e.printStackTrace();
}
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
> Margin userGetMargin(currency)

Get your account&#39;s margin status. Send a currency of \&quot;all\&quot; to receive an array of all supported currencies.

### Example
```java
// Import classes:
//import io.swagger.client.api.UserApi;

UserApi apiInstance = new UserApi();
String currency = "XBt"; // String | Options: `XBt`, `USDt`, `all`
try {
    Margin result = apiInstance.userGetMargin(currency);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#userGetMargin");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currency** | **String**| Options: &#x60;XBt&#x60;, &#x60;USDt&#x60;, &#x60;all&#x60; | [optional] [default to XBt]

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
```java
// Import classes:
//import io.swagger.client.api.UserApi;

UserApi apiInstance = new UserApi();
try {
    QuoteFillRatio result = apiInstance.userGetQuoteFillRatio();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#userGetQuoteFillRatio");
    e.printStackTrace();
}
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
```java
// Import classes:
//import io.swagger.client.api.UserApi;

UserApi apiInstance = new UserApi();
try {
    QuoteValueRatio result = apiInstance.userGetQuoteValueRatio();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#userGetQuoteValueRatio");
    e.printStackTrace();
}
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
```java
// Import classes:
//import io.swagger.client.api.UserApi;

UserApi apiInstance = new UserApi();
try {
    TradingVolume result = apiInstance.userGetTradingVolume();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#userGetTradingVolume");
    e.printStackTrace();
}
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
> Wallet userGetWallet(currency)

Get your current wallet information.

### Example
```java
// Import classes:
//import io.swagger.client.api.UserApi;

UserApi apiInstance = new UserApi();
String currency = "XBt"; // String | Options: `XBt`, `USDt`, `all`
try {
    Wallet result = apiInstance.userGetWallet(currency);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#userGetWallet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currency** | **String**| Options: &#x60;XBt&#x60;, &#x60;USDt&#x60;, &#x60;all&#x60; | [optional] [default to XBt]

### Return type

[**Wallet**](Wallet.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="userGetWalletHistory"></a>
# **userGetWalletHistory**
> List&lt;Transaction&gt; userGetWalletHistory(currency, count, start)

Get a history of all of your wallet transactions (deposits, withdrawals, PNL).

### Example
```java
// Import classes:
//import io.swagger.client.api.UserApi;

UserApi apiInstance = new UserApi();
String currency = "XBt"; // String | Options: `XBt`, `USDt`, `all`
Double count = 3.4D; // Double | Number of results to fetch.
Double start = 3.4D; // Double | Starting point for results.
try {
    List<Transaction> result = apiInstance.userGetWalletHistory(currency, count, start);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#userGetWalletHistory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currency** | **String**| Options: &#x60;XBt&#x60;, &#x60;USDt&#x60;, &#x60;all&#x60; | [optional] [default to XBt]
 **count** | **Double**| Number of results to fetch. | [optional] [default to 100]
 **start** | **Double**| Starting point for results. | [optional] [default to 0]

### Return type

[**List&lt;Transaction&gt;**](Transaction.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="userGetWalletSummary"></a>
# **userGetWalletSummary**
> List&lt;Transaction&gt; userGetWalletSummary(currency)

Get a summary of all of your wallet transactions (deposits, withdrawals, PNL).

### Example
```java
// Import classes:
//import io.swagger.client.api.UserApi;

UserApi apiInstance = new UserApi();
String currency = "XBt"; // String | Options: `XBt`, `USDt`, `all`
try {
    List<Transaction> result = apiInstance.userGetWalletSummary(currency);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#userGetWalletSummary");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currency** | **String**| Options: &#x60;XBt&#x60;, &#x60;USDt&#x60;, &#x60;all&#x60; | [optional] [default to XBt]

### Return type

[**List&lt;Transaction&gt;**](Transaction.md)

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
```java
// Import classes:
//import io.swagger.client.api.UserApi;

UserApi apiInstance = new UserApi();
try {
    apiInstance.userLogout();
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#userLogout");
    e.printStackTrace();
}
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
> Object userMinWithdrawalFee(currency, amount)

Get the minimum, maximum, and recommended withdrawal fees for a currency.

This is changed based on network conditions to ensure timely withdrawals. During network congestion, this may be high. The fee is returned in the same currency.  The \&quot;fee\&quot; field is the recommended fee for fast confirmation on the blockchain.

### Example
```java
// Import classes:
//import io.swagger.client.api.UserApi;

UserApi apiInstance = new UserApi();
String currency = "XBt"; // String | Options: `XBt`, `USDt`
Double amount = 3.4D; // Double | 
try {
    Object result = apiInstance.userMinWithdrawalFee(currency, amount);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#userMinWithdrawalFee");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currency** | **String**| Options: &#x60;XBt&#x60;, &#x60;USDt&#x60; | [optional] [default to XBt]
 **amount** | **Double**|  | [optional]

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="userRequestWithdrawal"></a>
# **userRequestWithdrawal**
> Transaction userRequestWithdrawal(currency, amount, otpToken, address, addressId, targetUserId, fee, text)

Request a withdrawal to an external wallet.

This will send a confirmation email to the email address on record.

### Example
```java
// Import classes:
//import io.swagger.client.api.UserApi;

UserApi apiInstance = new UserApi();
String currency = "XBt"; // String | Currency you're withdrawing. Options: `XBt`, `USDt`
BigDecimal amount = new BigDecimal(); // BigDecimal | Amount of withdrawal currency.
String otpToken = "otpToken_example"; // String | 2FA token. Required for all external withdrawals.
String address = "address_example"; // String | Destination Address. One of `address`, `addressId`, `targetUserId` has to be specified.
Double addressId = 3.4D; // Double | ID of the Destination Address. One of `address`, `targetUserId`, `targetUserId` has to be specified.
Double targetUserId = 3.4D; // Double | ID of the Target User. One of `address`, `addressId`, `targetUserId` has to be specified.
Double fee = 3.4D; // Double | Network fee for Bitcoin withdrawals. If not specified, a default value will be calculated based on Bitcoin network conditions. You will have a chance to confirm this via email.
String text = "text_example"; // String | Optional annotation, e.g. 'Transfer to home wallet'.
try {
    Transaction result = apiInstance.userRequestWithdrawal(currency, amount, otpToken, address, addressId, targetUserId, fee, text);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#userRequestWithdrawal");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currency** | **String**| Currency you&#39;re withdrawing. Options: &#x60;XBt&#x60;, &#x60;USDt&#x60; | [default to XBt]
 **amount** | **BigDecimal**| Amount of withdrawal currency. |
 **otpToken** | **String**| 2FA token. Required for all external withdrawals. | [optional]
 **address** | **String**| Destination Address. One of &#x60;address&#x60;, &#x60;addressId&#x60;, &#x60;targetUserId&#x60; has to be specified. | [optional]
 **addressId** | **Double**| ID of the Destination Address. One of &#x60;address&#x60;, &#x60;targetUserId&#x60;, &#x60;targetUserId&#x60; has to be specified. | [optional]
 **targetUserId** | **Double**| ID of the Target User. One of &#x60;address&#x60;, &#x60;addressId&#x60;, &#x60;targetUserId&#x60; has to be specified. | [optional]
 **fee** | **Double**| Network fee for Bitcoin withdrawals. If not specified, a default value will be calculated based on Bitcoin network conditions. You will have a chance to confirm this via email. | [optional]
 **text** | **String**| Optional annotation, e.g. &#39;Transfer to home wallet&#39;. | [optional]

### Return type

[**Transaction**](Transaction.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="userSavePreferences"></a>
# **userSavePreferences**
> User userSavePreferences(prefs, overwrite)

Save user preferences.

### Example
```java
// Import classes:
//import io.swagger.client.api.UserApi;

UserApi apiInstance = new UserApi();
String prefs = "prefs_example"; // String | 
Boolean overwrite = false; // Boolean | If true, will overwrite all existing preferences.
try {
    User result = apiInstance.userSavePreferences(prefs, overwrite);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#userSavePreferences");
    e.printStackTrace();
}
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

