# UserApi

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
[**userGetCSA**](UserApi.md#userGetCSA) | **GET** /user/csa | Get your account&#39;s CSA status.
[**userGetCommission**](UserApi.md#userGetCommission) | **GET** /user/commission | Get your account&#39;s commission status.
[**userGetDepositAddress**](UserApi.md#userGetDepositAddress) | **GET** /user/depositAddress | Get a deposit address.
[**userGetDepositAddressInformation**](UserApi.md#userGetDepositAddressInformation) | **GET** /user/depositAddressInformation | Get a deposit address.
[**userGetExecutionHistory**](UserApi.md#userGetExecutionHistory) | **GET** /user/executionHistory | Get the execution history by day.
[**userGetMargin**](UserApi.md#userGetMargin) | **GET** /user/margin | Get your account&#39;s margin status. Send a currency of \&quot;all\&quot; to receive an array of all supported currencies.
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
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiExpires
ApiKeyAuth apiExpires = (ApiKeyAuth) defaultClient.getAuthentication("apiExpires");
apiExpires.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiExpires.setApiKeyPrefix("Token");

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

// Configure API key authorization: apiSignature
ApiKeyAuth apiSignature = (ApiKeyAuth) defaultClient.getAuthentication("apiSignature");
apiSignature.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiSignature.setApiKeyPrefix("Token");

UserApi apiInstance = new UserApi();
String transactID = "transactID_example"; // String | 
try {
    Object result = apiInstance.userCancelPendingWithdrawal(transactID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#userCancelPendingWithdrawal");
    e.printStackTrace();
}
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
```java
// Import classes:
//import io.swagger.client.ApiException;
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
> Object userCheckReferralCode(referralCode)

Check if a referral code is valid.

If the code is valid, responds with the referral code&#39;s discount (e.g. &#x60;0.1&#x60; for 10%). Otherwise, will return a 404 or 451 if invalid.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserApi;


UserApi apiInstance = new UserApi();
String referralCode = "referralCode_example"; // String | 
try {
    Object result = apiInstance.userCheckReferralCode(referralCode);
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

**Object**

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
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiExpires
ApiKeyAuth apiExpires = (ApiKeyAuth) defaultClient.getAuthentication("apiExpires");
apiExpires.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiExpires.setApiKeyPrefix("Token");

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

// Configure API key authorization: apiSignature
ApiKeyAuth apiSignature = (ApiKeyAuth) defaultClient.getAuthentication("apiSignature");
apiSignature.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiSignature.setApiKeyPrefix("Token");

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
//import io.swagger.client.ApiException;
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
//import io.swagger.client.ApiException;
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

<a name="userCreateSubAccount"></a>
# **userCreateSubAccount**
> Object userCreateSubAccount(accountName)

Creates a new sub-account.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiExpires
ApiKeyAuth apiExpires = (ApiKeyAuth) defaultClient.getAuthentication("apiExpires");
apiExpires.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiExpires.setApiKeyPrefix("Token");

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

// Configure API key authorization: apiSignature
ApiKeyAuth apiSignature = (ApiKeyAuth) defaultClient.getAuthentication("apiSignature");
apiSignature.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiSignature.setApiKeyPrefix("Token");

UserApi apiInstance = new UserApi();
String accountName = "accountName_example"; // String | 
try {
    Object result = apiInstance.userCreateSubAccount(accountName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#userCreateSubAccount");
    e.printStackTrace();
}
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
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiExpires
ApiKeyAuth apiExpires = (ApiKeyAuth) defaultClient.getAuthentication("apiExpires");
apiExpires.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiExpires.setApiKeyPrefix("Token");

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

// Configure API key authorization: apiSignature
ApiKeyAuth apiSignature = (ApiKeyAuth) defaultClient.getAuthentication("apiSignature");
apiSignature.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiSignature.setApiKeyPrefix("Token");

UserApi apiInstance = new UserApi();
String symbol = "symbol_example"; // String | 
Double amount = 3.4D; // Double | 
try {
    Object result = apiInstance.userCreateUnstakingRequests(symbol, amount);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#userCreateUnstakingRequests");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **String**|  |
 **amount** | **Double**|  |

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
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiExpires
ApiKeyAuth apiExpires = (ApiKeyAuth) defaultClient.getAuthentication("apiExpires");
apiExpires.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiExpires.setApiKeyPrefix("Token");

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

// Configure API key authorization: apiSignature
ApiKeyAuth apiSignature = (ApiKeyAuth) defaultClient.getAuthentication("apiSignature");
apiSignature.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiSignature.setApiKeyPrefix("Token");

UserApi apiInstance = new UserApi();
String redemptionID = "redemptionID_example"; // String | 
try {
    Object result = apiInstance.userDeleteUnstakingRequests(redemptionID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#userDeleteUnstakingRequests");
    e.printStackTrace();
}
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
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiExpires
ApiKeyAuth apiExpires = (ApiKeyAuth) defaultClient.getAuthentication("apiExpires");
apiExpires.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiExpires.setApiKeyPrefix("Token");

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

// Configure API key authorization: apiSignature
ApiKeyAuth apiSignature = (ApiKeyAuth) defaultClient.getAuthentication("apiSignature");
apiSignature.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiSignature.setApiKeyPrefix("Token");

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
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiExpires
ApiKeyAuth apiExpires = (ApiKeyAuth) defaultClient.getAuthentication("apiExpires");
apiExpires.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiExpires.setApiKeyPrefix("Token");

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

// Configure API key authorization: apiSignature
ApiKeyAuth apiSignature = (ApiKeyAuth) defaultClient.getAuthentication("apiSignature");
apiSignature.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiSignature.setApiKeyPrefix("Token");

UserApi apiInstance = new UserApi();
String currency = "XBt"; // String | Any currency. For all currencies, see <a href=\"#!/Wallet/Wallet_getAssetsConfig\">asset config endpoint</a>. For all currencies specify \"all\"
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
 **currency** | **String**| Any currency. For all currencies, see &lt;a href&#x3D;\&quot;#!/Wallet/Wallet_getAssetsConfig\&quot;&gt;asset config endpoint&lt;/a&gt;. For all currencies specify \&quot;all\&quot; | [optional] [default to XBt]

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

Get your account&#39;s CSA status.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiExpires
ApiKeyAuth apiExpires = (ApiKeyAuth) defaultClient.getAuthentication("apiExpires");
apiExpires.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiExpires.setApiKeyPrefix("Token");

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

// Configure API key authorization: apiSignature
ApiKeyAuth apiSignature = (ApiKeyAuth) defaultClient.getAuthentication("apiSignature");
apiSignature.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiSignature.setApiKeyPrefix("Token");

UserApi apiInstance = new UserApi();
try {
    CollateralSupportAgreement result = apiInstance.userGetCSA();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#userGetCSA");
    e.printStackTrace();
}
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

Get your account&#39;s commission status.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiExpires
ApiKeyAuth apiExpires = (ApiKeyAuth) defaultClient.getAuthentication("apiExpires");
apiExpires.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiExpires.setApiKeyPrefix("Token");

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

// Configure API key authorization: apiSignature
ApiKeyAuth apiSignature = (ApiKeyAuth) defaultClient.getAuthentication("apiSignature");
apiSignature.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiSignature.setApiKeyPrefix("Token");

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
> String userGetDepositAddress(currency, network)

Get a deposit address.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiExpires
ApiKeyAuth apiExpires = (ApiKeyAuth) defaultClient.getAuthentication("apiExpires");
apiExpires.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiExpires.setApiKeyPrefix("Token");

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

// Configure API key authorization: apiSignature
ApiKeyAuth apiSignature = (ApiKeyAuth) defaultClient.getAuthentication("apiSignature");
apiSignature.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiSignature.setApiKeyPrefix("Token");

UserApi apiInstance = new UserApi();
String currency = "currency_example"; // String | Any currency. For all currencies, see <a href=\"#!/Wallet/Wallet_getAssetsConfig\">asset config endpoint</a>
String network = "network_example"; // String | The `network` parameter is used to indicate which blockchain you would like to deposit from. The acceptable value in the `network` parameter for each currency can be found from `networks.asset` from `GET /wallet/assets`.
try {
    String result = apiInstance.userGetDepositAddress(currency, network);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#userGetDepositAddress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currency** | **String**| Any currency. For all currencies, see &lt;a href&#x3D;\&quot;#!/Wallet/Wallet_getAssetsConfig\&quot;&gt;asset config endpoint&lt;/a&gt; |
 **network** | **String**| The &#x60;network&#x60; parameter is used to indicate which blockchain you would like to deposit from. The acceptable value in the &#x60;network&#x60; parameter for each currency can be found from &#x60;networks.asset&#x60; from &#x60;GET /wallet/assets&#x60;. |

### Return type

**String**

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
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiExpires
ApiKeyAuth apiExpires = (ApiKeyAuth) defaultClient.getAuthentication("apiExpires");
apiExpires.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiExpires.setApiKeyPrefix("Token");

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

// Configure API key authorization: apiSignature
ApiKeyAuth apiSignature = (ApiKeyAuth) defaultClient.getAuthentication("apiSignature");
apiSignature.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiSignature.setApiKeyPrefix("Token");

UserApi apiInstance = new UserApi();
String currency = "currency_example"; // String | Any currency. For all currencies, see <a href=\"#!/Wallet/Wallet_getAssetsConfig\">asset config endpoint</a>
String network = "network_example"; // String | The `network` parameter is used to indicate which blockchain you would like to deposit from. The acceptable value in the `network` parameter for each currency can be found from `networks.asset` from `GET /wallet/assets`.
try {
    DepositAddress result = apiInstance.userGetDepositAddressInformation(currency, network);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#userGetDepositAddressInformation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currency** | **String**| Any currency. For all currencies, see &lt;a href&#x3D;\&quot;#!/Wallet/Wallet_getAssetsConfig\&quot;&gt;asset config endpoint&lt;/a&gt; |
 **network** | **String**| The &#x60;network&#x60; parameter is used to indicate which blockchain you would like to deposit from. The acceptable value in the &#x60;network&#x60; parameter for each currency can be found from &#x60;networks.asset&#x60; from &#x60;GET /wallet/assets&#x60;. |

### Return type

[**DepositAddress**](DepositAddress.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="userGetExecutionHistory"></a>
# **userGetExecutionHistory**
> List&lt;Execution&gt; userGetExecutionHistory(symbol, timestamp)

Get the execution history by day.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiExpires
ApiKeyAuth apiExpires = (ApiKeyAuth) defaultClient.getAuthentication("apiExpires");
apiExpires.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiExpires.setApiKeyPrefix("Token");

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

// Configure API key authorization: apiSignature
ApiKeyAuth apiSignature = (ApiKeyAuth) defaultClient.getAuthentication("apiSignature");
apiSignature.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiSignature.setApiKeyPrefix("Token");

UserApi apiInstance = new UserApi();
String symbol = "XBTUSD"; // String | 
OffsetDateTime timestamp = OffsetDateTime.now(); // OffsetDateTime | 
try {
    List<Execution> result = apiInstance.userGetExecutionHistory(symbol, timestamp);
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
 **timestamp** | **OffsetDateTime**|  | [default to 2017-02-13T12:00:00.000Z]

### Return type

[**List&lt;Execution&gt;**](Execution.md)

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
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiExpires
ApiKeyAuth apiExpires = (ApiKeyAuth) defaultClient.getAuthentication("apiExpires");
apiExpires.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiExpires.setApiKeyPrefix("Token");

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

// Configure API key authorization: apiSignature
ApiKeyAuth apiSignature = (ApiKeyAuth) defaultClient.getAuthentication("apiSignature");
apiSignature.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiSignature.setApiKeyPrefix("Token");

UserApi apiInstance = new UserApi();
String currency = "XBt"; // String | Any currency. For all currencies, see <a href=\"#!/Wallet/Wallet_getAssetsConfig\">asset config endpoint</a>. For all currencies specify \"all\"
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
 **currency** | **String**| Any currency. For all currencies, see &lt;a href&#x3D;\&quot;#!/Wallet/Wallet_getAssetsConfig\&quot;&gt;asset config endpoint&lt;/a&gt;. For all currencies specify \&quot;all\&quot; | [optional] [default to XBt]

### Return type

[**Margin**](Margin.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="userGetQuoteFillRatio"></a>
# **userGetQuoteFillRatio**
> QuoteFillRatio userGetQuoteFillRatio(targetAccountId)

Get 7 days worth of Quote Fill Ratio statistics.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiExpires
ApiKeyAuth apiExpires = (ApiKeyAuth) defaultClient.getAuthentication("apiExpires");
apiExpires.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiExpires.setApiKeyPrefix("Token");

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

// Configure API key authorization: apiSignature
ApiKeyAuth apiSignature = (ApiKeyAuth) defaultClient.getAuthentication("apiSignature");
apiSignature.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiSignature.setApiKeyPrefix("Token");

UserApi apiInstance = new UserApi();
Double targetAccountId = 3.4D; // Double | AccountId to get quote fill ratio for, must be a paired account with main user. Can be wildcard * to get all accounts linked to the authenticated user
try {
    QuoteFillRatio result = apiInstance.userGetQuoteFillRatio(targetAccountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#userGetQuoteFillRatio");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **targetAccountId** | **Double**| AccountId to get quote fill ratio for, must be a paired account with main user. Can be wildcard * to get all accounts linked to the authenticated user | [optional]

### Return type

[**QuoteFillRatio**](QuoteFillRatio.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="userGetQuoteValueRatio"></a>
# **userGetQuoteValueRatio**
> QuoteValueRatio userGetQuoteValueRatio(targetAccountId)

Get Quote Value Ratio statistics over the last 3 days

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiExpires
ApiKeyAuth apiExpires = (ApiKeyAuth) defaultClient.getAuthentication("apiExpires");
apiExpires.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiExpires.setApiKeyPrefix("Token");

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

// Configure API key authorization: apiSignature
ApiKeyAuth apiSignature = (ApiKeyAuth) defaultClient.getAuthentication("apiSignature");
apiSignature.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiSignature.setApiKeyPrefix("Token");

UserApi apiInstance = new UserApi();
Double targetAccountId = 3.4D; // Double | AccountId to get quote value ratio for, must be a paired account with main user. Can be wildcard * to get all accounts linked to the authenticated user
try {
    QuoteValueRatio result = apiInstance.userGetQuoteValueRatio(targetAccountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#userGetQuoteValueRatio");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **targetAccountId** | **Double**| AccountId to get quote value ratio for, must be a paired account with main user. Can be wildcard * to get all accounts linked to the authenticated user | [optional]

### Return type

[**QuoteValueRatio**](QuoteValueRatio.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="userGetStaking"></a>
# **userGetStaking**
> List&lt;StakingRecord&gt; userGetStaking(currency)

Get the current user staking amount.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiExpires
ApiKeyAuth apiExpires = (ApiKeyAuth) defaultClient.getAuthentication("apiExpires");
apiExpires.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiExpires.setApiKeyPrefix("Token");

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

// Configure API key authorization: apiSignature
ApiKeyAuth apiSignature = (ApiKeyAuth) defaultClient.getAuthentication("apiSignature");
apiSignature.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiSignature.setApiKeyPrefix("Token");

UserApi apiInstance = new UserApi();
String currency = "currency_example"; // String | 
try {
    List<StakingRecord> result = apiInstance.userGetStaking(currency);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#userGetStaking");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currency** | **String**|  | [optional]

### Return type

[**List&lt;StakingRecord&gt;**](StakingRecord.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="userGetStakingInstruments"></a>
# **userGetStakingInstruments**
> List&lt;XAny&gt; userGetStakingInstruments(symbol, currency)

List staking instruments

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiExpires
ApiKeyAuth apiExpires = (ApiKeyAuth) defaultClient.getAuthentication("apiExpires");
apiExpires.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiExpires.setApiKeyPrefix("Token");

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

// Configure API key authorization: apiSignature
ApiKeyAuth apiSignature = (ApiKeyAuth) defaultClient.getAuthentication("apiSignature");
apiSignature.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiSignature.setApiKeyPrefix("Token");

UserApi apiInstance = new UserApi();
String symbol = "symbol_example"; // String | 
String currency = "currency_example"; // String | 
try {
    List<XAny> result = apiInstance.userGetStakingInstruments(symbol, currency);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#userGetStakingInstruments");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **String**|  | [optional]
 **currency** | **String**|  | [optional]

### Return type

[**List&lt;XAny&gt;**](XAny.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="userGetStakingTiers"></a>
# **userGetStakingTiers**
> List&lt;XAny&gt; userGetStakingTiers(currency)

List staking tiers for a given currency

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserApi;


UserApi apiInstance = new UserApi();
String currency = "currency_example"; // String | 
try {
    List<XAny> result = apiInstance.userGetStakingTiers(currency);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#userGetStakingTiers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currency** | **String**|  |

### Return type

[**List&lt;XAny&gt;**](XAny.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="userGetTradingVolume"></a>
# **userGetTradingVolume**
> List&lt;TradingVolume&gt; userGetTradingVolume()

Get your 30 days USD average trading volume

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiExpires
ApiKeyAuth apiExpires = (ApiKeyAuth) defaultClient.getAuthentication("apiExpires");
apiExpires.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiExpires.setApiKeyPrefix("Token");

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

// Configure API key authorization: apiSignature
ApiKeyAuth apiSignature = (ApiKeyAuth) defaultClient.getAuthentication("apiSignature");
apiSignature.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiSignature.setApiKeyPrefix("Token");

UserApi apiInstance = new UserApi();
try {
    List<TradingVolume> result = apiInstance.userGetTradingVolume();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#userGetTradingVolume");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;TradingVolume&gt;**](TradingVolume.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="userGetUnstakingRequests"></a>
# **userGetUnstakingRequests**
> List&lt;StakingRecord&gt; userGetUnstakingRequests(status)

Get the current user unstaking requests

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiExpires
ApiKeyAuth apiExpires = (ApiKeyAuth) defaultClient.getAuthentication("apiExpires");
apiExpires.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiExpires.setApiKeyPrefix("Token");

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

// Configure API key authorization: apiSignature
ApiKeyAuth apiSignature = (ApiKeyAuth) defaultClient.getAuthentication("apiSignature");
apiSignature.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiSignature.setApiKeyPrefix("Token");

UserApi apiInstance = new UserApi();
String status = "status_example"; // String | 
try {
    List<StakingRecord> result = apiInstance.userGetUnstakingRequests(status);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#userGetUnstakingRequests");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **status** | **String**|  |

### Return type

[**List&lt;StakingRecord&gt;**](StakingRecord.md)

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
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiExpires
ApiKeyAuth apiExpires = (ApiKeyAuth) defaultClient.getAuthentication("apiExpires");
apiExpires.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiExpires.setApiKeyPrefix("Token");

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

// Configure API key authorization: apiSignature
ApiKeyAuth apiSignature = (ApiKeyAuth) defaultClient.getAuthentication("apiSignature");
apiSignature.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiSignature.setApiKeyPrefix("Token");

UserApi apiInstance = new UserApi();
String currency = "XBt"; // String | Any currency. For all currencies, see <a href=\"#!/Wallet/Wallet_getAssetsConfig\">asset config endpoint</a>. For all currencies specify \"all\"
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
 **currency** | **String**| Any currency. For all currencies, see &lt;a href&#x3D;\&quot;#!/Wallet/Wallet_getAssetsConfig\&quot;&gt;asset config endpoint&lt;/a&gt;. For all currencies specify \&quot;all\&quot; | [optional] [default to XBt]

### Return type

[**Wallet**](Wallet.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="userGetWalletHistory"></a>
# **userGetWalletHistory**
> List&lt;Transaction&gt; userGetWalletHistory(currency, count, start, targetAccountId, reverse)

Get a history of all of your wallet transactions (deposits, withdrawals, PNL).

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiExpires
ApiKeyAuth apiExpires = (ApiKeyAuth) defaultClient.getAuthentication("apiExpires");
apiExpires.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiExpires.setApiKeyPrefix("Token");

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

// Configure API key authorization: apiSignature
ApiKeyAuth apiSignature = (ApiKeyAuth) defaultClient.getAuthentication("apiSignature");
apiSignature.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiSignature.setApiKeyPrefix("Token");

UserApi apiInstance = new UserApi();
String currency = "XBt"; // String | Any currency. For all currencies, see <a href=\"#!/Wallet/Wallet_getAssetsConfig\">asset config endpoint</a>. For all currencies specify \"all\"
Double count = 3.4D; // Double | Number of results to fetch. Fetch results from start to start + count. Max: 10,000 rows.
Double start = 3.4D; // Double | Starting point for results, integer. Default 0.
Double targetAccountId = 3.4D; // Double | AccountId to view the history of, must be a paired account with the authorised user requesting the history.
Boolean reverse = true; // Boolean | Start from the latest transaction record. Default true.
try {
    List<Transaction> result = apiInstance.userGetWalletHistory(currency, count, start, targetAccountId, reverse);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#userGetWalletHistory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currency** | **String**| Any currency. For all currencies, see &lt;a href&#x3D;\&quot;#!/Wallet/Wallet_getAssetsConfig\&quot;&gt;asset config endpoint&lt;/a&gt;. For all currencies specify \&quot;all\&quot; | [optional] [default to XBt]
 **count** | **Double**| Number of results to fetch. Fetch results from start to start + count. Max: 10,000 rows. | [optional] [default to 10000]
 **start** | **Double**| Starting point for results, integer. Default 0. | [optional] [default to 0]
 **targetAccountId** | **Double**| AccountId to view the history of, must be a paired account with the authorised user requesting the history. | [optional]
 **reverse** | **Boolean**| Start from the latest transaction record. Default true. | [optional] [default to true]

### Return type

[**List&lt;Transaction&gt;**](Transaction.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="userGetWalletSummary"></a>
# **userGetWalletSummary**
> List&lt;WalletSummaryRecord&gt; userGetWalletSummary(currency, startTime, endTime)

Get a summary of all of your wallet transactions (deposits, withdrawals, PNL).

Provides an aggregated view of transactions, by transaction type, over a specific time period.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiExpires
ApiKeyAuth apiExpires = (ApiKeyAuth) defaultClient.getAuthentication("apiExpires");
apiExpires.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiExpires.setApiKeyPrefix("Token");

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

// Configure API key authorization: apiSignature
ApiKeyAuth apiSignature = (ApiKeyAuth) defaultClient.getAuthentication("apiSignature");
apiSignature.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiSignature.setApiKeyPrefix("Token");

UserApi apiInstance = new UserApi();
String currency = "XBt"; // String | Any currency. For all currencies, see <a href=\"#!/Wallet/Wallet_getAssetsConfig\">asset config endpoint</a>. For all currencies specify \"all\"
OffsetDateTime startTime = OffsetDateTime.now(); // OffsetDateTime | Start time for the summary
OffsetDateTime endTime = OffsetDateTime.now(); // OffsetDateTime | End time for the summary
try {
    List<WalletSummaryRecord> result = apiInstance.userGetWalletSummary(currency, startTime, endTime);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#userGetWalletSummary");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currency** | **String**| Any currency. For all currencies, see &lt;a href&#x3D;\&quot;#!/Wallet/Wallet_getAssetsConfig\&quot;&gt;asset config endpoint&lt;/a&gt;. For all currencies specify \&quot;all\&quot; | [optional] [default to XBt]
 **startTime** | **OffsetDateTime**| Start time for the summary | [optional]
 **endTime** | **OffsetDateTime**| End time for the summary | [optional]

### Return type

[**List&lt;WalletSummaryRecord&gt;**](WalletSummaryRecord.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="userGetWalletTransferAccounts"></a>
# **userGetWalletTransferAccounts**
> List&lt;XAny&gt; userGetWalletTransferAccounts()

Get the list of accounts you can transfer funds between.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiExpires
ApiKeyAuth apiExpires = (ApiKeyAuth) defaultClient.getAuthentication("apiExpires");
apiExpires.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiExpires.setApiKeyPrefix("Token");

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

// Configure API key authorization: apiSignature
ApiKeyAuth apiSignature = (ApiKeyAuth) defaultClient.getAuthentication("apiSignature");
apiSignature.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiSignature.setApiKeyPrefix("Token");

UserApi apiInstance = new UserApi();
try {
    List<XAny> result = apiInstance.userGetWalletTransferAccounts();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#userGetWalletTransferAccounts");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;XAny&gt;**](XAny.md)

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
//import io.swagger.client.ApiException;
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

<a name="userRequestWithdrawal"></a>
# **userRequestWithdrawal**
> Transaction userRequestWithdrawal(currency, network, amount, otpToken, address, memo, addressId, targetUserId, fee, text)

Request a withdrawal to an external wallet.

This will send a confirmation email to the email address on record.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiExpires
ApiKeyAuth apiExpires = (ApiKeyAuth) defaultClient.getAuthentication("apiExpires");
apiExpires.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiExpires.setApiKeyPrefix("Token");

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

// Configure API key authorization: apiSignature
ApiKeyAuth apiSignature = (ApiKeyAuth) defaultClient.getAuthentication("apiSignature");
apiSignature.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiSignature.setApiKeyPrefix("Token");

UserApi apiInstance = new UserApi();
String currency = "XBt"; // String | Currency you're withdrawing. Any currency. For all currencies, see <a href=\"#!/Wallet/Wallet_getAssetsConfig\">asset config endpoint</a>
String network = "network_example"; // String | The `network` parameter is used to indicate which blockchain you would like to withdraw from. The acceptable value in the `network` parameter for each currency can be found from `networks.asset` from `GET /wallet/assets`.
Long amount = 789L; // Long | Amount of withdrawal currency.
String otpToken = "otpToken_example"; // String | 2FA token. Required for all external withdrawals unless the address has skip2FA in addressbook.
String address = "address_example"; // String | Destination Address. One of `address`, `addressId`, `targetUserId` has to be specified.
String memo = "memo_example"; // String | Destination Memo. If `address`, is specified, Destination Memo can also be specified
Double addressId = 3.4D; // Double | ID of the Destination Address. One of `address`, `addressId`, `targetUserId` has to be specified.
Double targetUserId = 3.4D; // Double | ID of the Target User. One of `address`, `addressId`, `targetUserId` has to be specified.
Double fee = 3.4D; // Double | Network fee for Bitcoin withdrawals. If not specified, a default value will be calculated based on Bitcoin network conditions. You will have a chance to confirm this via email.
String text = "text_example"; // String | Optional annotation, e.g. 'Transfer to home wallet'.
try {
    Transaction result = apiInstance.userRequestWithdrawal(currency, network, amount, otpToken, address, memo, addressId, targetUserId, fee, text);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#userRequestWithdrawal");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currency** | **String**| Currency you&#39;re withdrawing. Any currency. For all currencies, see &lt;a href&#x3D;\&quot;#!/Wallet/Wallet_getAssetsConfig\&quot;&gt;asset config endpoint&lt;/a&gt; | [default to XBt]
 **network** | **String**| The &#x60;network&#x60; parameter is used to indicate which blockchain you would like to withdraw from. The acceptable value in the &#x60;network&#x60; parameter for each currency can be found from &#x60;networks.asset&#x60; from &#x60;GET /wallet/assets&#x60;. |
 **amount** | **Long**| Amount of withdrawal currency. |
 **otpToken** | **String**| 2FA token. Required for all external withdrawals unless the address has skip2FA in addressbook. | [optional]
 **address** | **String**| Destination Address. One of &#x60;address&#x60;, &#x60;addressId&#x60;, &#x60;targetUserId&#x60; has to be specified. | [optional]
 **memo** | **String**| Destination Memo. If &#x60;address&#x60;, is specified, Destination Memo can also be specified | [optional]
 **addressId** | **Double**| ID of the Destination Address. One of &#x60;address&#x60;, &#x60;addressId&#x60;, &#x60;targetUserId&#x60; has to be specified. | [optional]
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
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiExpires
ApiKeyAuth apiExpires = (ApiKeyAuth) defaultClient.getAuthentication("apiExpires");
apiExpires.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiExpires.setApiKeyPrefix("Token");

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

// Configure API key authorization: apiSignature
ApiKeyAuth apiSignature = (ApiKeyAuth) defaultClient.getAuthentication("apiSignature");
apiSignature.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiSignature.setApiKeyPrefix("Token");

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

<a name="userUpdateSubAccount"></a>
# **userUpdateSubAccount**
> Object userUpdateSubAccount(targetAccountId, accountName)

Updates the sub-account name.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiExpires
ApiKeyAuth apiExpires = (ApiKeyAuth) defaultClient.getAuthentication("apiExpires");
apiExpires.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiExpires.setApiKeyPrefix("Token");

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

// Configure API key authorization: apiSignature
ApiKeyAuth apiSignature = (ApiKeyAuth) defaultClient.getAuthentication("apiSignature");
apiSignature.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiSignature.setApiKeyPrefix("Token");

UserApi apiInstance = new UserApi();
Double targetAccountId = 3.4D; // Double | 
String accountName = "accountName_example"; // String | 
try {
    Object result = apiInstance.userUpdateSubAccount(targetAccountId, accountName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#userUpdateSubAccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **targetAccountId** | **Double**|  |
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
> Transaction userWalletTransfer(currency, amount, targetAccountId, fromAccountId)

Execute a transfer to a paired account.

This will send a confirmation email to the email address on record.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiExpires
ApiKeyAuth apiExpires = (ApiKeyAuth) defaultClient.getAuthentication("apiExpires");
apiExpires.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiExpires.setApiKeyPrefix("Token");

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

// Configure API key authorization: apiSignature
ApiKeyAuth apiSignature = (ApiKeyAuth) defaultClient.getAuthentication("apiSignature");
apiSignature.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiSignature.setApiKeyPrefix("Token");

UserApi apiInstance = new UserApi();
String currency = "currency_example"; // String | Currency you're transfering. Any currency. For all currencies, see <a href=\"#!/Wallet/Wallet_getAssetsConfig\">asset config endpoint</a>
Long amount = 789L; // Long | Amount of transfer.
Double targetAccountId = 3.4D; // Double | AccountId to send the transfer to, must be a paired account with the user sending the transfer.
Double fromAccountId = 3.4D; // Double | AccountID to send the transfer from. Must be paired account with the authenticated user.
try {
    Transaction result = apiInstance.userWalletTransfer(currency, amount, targetAccountId, fromAccountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#userWalletTransfer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currency** | **String**| Currency you&#39;re transfering. Any currency. For all currencies, see &lt;a href&#x3D;\&quot;#!/Wallet/Wallet_getAssetsConfig\&quot;&gt;asset config endpoint&lt;/a&gt; |
 **amount** | **Long**| Amount of transfer. |
 **targetAccountId** | **Double**| AccountId to send the transfer to, must be a paired account with the user sending the transfer. |
 **fromAccountId** | **Double**| AccountID to send the transfer from. Must be paired account with the authenticated user. | [optional]

### Return type

[**Transaction**](Transaction.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

