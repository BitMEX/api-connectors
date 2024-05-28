# \UserApi

All URIs are relative to *https://www.bitmex.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**UserCancelPendingWithdrawal**](UserApi.md#UserCancelPendingWithdrawal) | **Delete** /user/withdrawal | Cancel pending withdrawal
[**UserCancelWithdrawal**](UserApi.md#UserCancelWithdrawal) | **Post** /user/cancelWithdrawal | Cancel a withdrawal.
[**UserCheckReferralCode**](UserApi.md#UserCheckReferralCode) | **Get** /user/checkReferralCode | Check if a referral code is valid.
[**UserCommunicationToken**](UserApi.md#UserCommunicationToken) | **Post** /user/communicationToken | Register your communication token for mobile clients
[**UserConfirm**](UserApi.md#UserConfirm) | **Post** /user/confirmEmail | Confirm your email address with a token.
[**UserConfirmWithdrawal**](UserApi.md#UserConfirmWithdrawal) | **Post** /user/confirmWithdrawal | Confirm a withdrawal.
[**UserCreateSubAccount**](UserApi.md#UserCreateSubAccount) | **Post** /user/addSubaccount | Creates a new sub-account.
[**UserCreateUnstakingRequests**](UserApi.md#UserCreateUnstakingRequests) | **Post** /user/unstakingRequests | Create unstaking request
[**UserDeleteUnstakingRequests**](UserApi.md#UserDeleteUnstakingRequests) | **Delete** /user/unstakingRequests | Cancel unstaking request
[**UserGet**](UserApi.md#UserGet) | **Get** /user | Get your user model.
[**UserGetAffiliateStatus**](UserApi.md#UserGetAffiliateStatus) | **Get** /user/affiliateStatus | Get your current affiliate/referral status.
[**UserGetCSA**](UserApi.md#UserGetCSA) | **Get** /user/csa | Get your account&#39;s CSA status.
[**UserGetCommission**](UserApi.md#UserGetCommission) | **Get** /user/commission | Get your account&#39;s commission status.
[**UserGetDepositAddress**](UserApi.md#UserGetDepositAddress) | **Get** /user/depositAddress | Get a deposit address.
[**UserGetDepositAddressInformation**](UserApi.md#UserGetDepositAddressInformation) | **Get** /user/depositAddressInformation | Get a deposit address.
[**UserGetExecutionHistory**](UserApi.md#UserGetExecutionHistory) | **Get** /user/executionHistory | Get the execution history by day.
[**UserGetMargin**](UserApi.md#UserGetMargin) | **Get** /user/margin | Get your account&#39;s margin status. Send a currency of \&quot;all\&quot; to receive an array of all supported currencies.
[**UserGetQuoteFillRatio**](UserApi.md#UserGetQuoteFillRatio) | **Get** /user/quoteFillRatio | Get 7 days worth of Quote Fill Ratio statistics.
[**UserGetQuoteValueRatio**](UserApi.md#UserGetQuoteValueRatio) | **Get** /user/quoteValueRatio | Get Quote Value Ratio statistics over the last 3 days
[**UserGetStaking**](UserApi.md#UserGetStaking) | **Get** /user/staking | Get the current user staking amount.
[**UserGetStakingInstruments**](UserApi.md#UserGetStakingInstruments) | **Get** /user/staking/instruments | List staking instruments
[**UserGetStakingTiers**](UserApi.md#UserGetStakingTiers) | **Get** /user/staking/tiers | List staking tiers for a given currency
[**UserGetTradingVolume**](UserApi.md#UserGetTradingVolume) | **Get** /user/tradingVolume | Get your 30 days USD average trading volume
[**UserGetUnstakingRequests**](UserApi.md#UserGetUnstakingRequests) | **Get** /user/unstakingRequests | Get the current user unstaking requests
[**UserGetWallet**](UserApi.md#UserGetWallet) | **Get** /user/wallet | Get your current wallet information.
[**UserGetWalletHistory**](UserApi.md#UserGetWalletHistory) | **Get** /user/walletHistory | Get a history of all of your wallet transactions (deposits, withdrawals, PNL).
[**UserGetWalletSummary**](UserApi.md#UserGetWalletSummary) | **Get** /user/walletSummary | Get a summary of all of your wallet transactions (deposits, withdrawals, PNL).
[**UserGetWalletTransferAccounts**](UserApi.md#UserGetWalletTransferAccounts) | **Get** /user/getWalletTransferAccounts | Get the list of accounts you can transfer funds between.
[**UserLogout**](UserApi.md#UserLogout) | **Post** /user/logout | Log out of BitMEX.
[**UserRequestWithdrawal**](UserApi.md#UserRequestWithdrawal) | **Post** /user/requestWithdrawal | Request a withdrawal to an external wallet.
[**UserSavePreferences**](UserApi.md#UserSavePreferences) | **Post** /user/preferences | Save user preferences.
[**UserUpdateSubAccount**](UserApi.md#UserUpdateSubAccount) | **Post** /user/updateSubaccount | Updates the sub-account name.
[**UserWalletTransfer**](UserApi.md#UserWalletTransfer) | **Post** /user/walletTransfer | Execute a transfer to a paired account.


# **UserCancelPendingWithdrawal**
> interface{} UserCancelPendingWithdrawal(ctx, transactID)
Cancel pending withdrawal

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **transactID** | **string**|  | 

### Return type

**interface{}**

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **UserCancelWithdrawal**
> Transaction UserCancelWithdrawal(ctx, token)
Cancel a withdrawal.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **token** | **string**|  | 

### Return type

[**Transaction**](Transaction.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **UserCheckReferralCode**
> interface{} UserCheckReferralCode(ctx, optional)
Check if a referral code is valid.

If the code is valid, responds with the referral code's discount (e.g. `0.1` for 10%). Otherwise, will return a 404 or 451 if invalid.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***UserApiUserCheckReferralCodeOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a UserApiUserCheckReferralCodeOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **referralCode** | **optional.String**|  | 

### Return type

**interface{}**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **UserCommunicationToken**
> []CommunicationToken UserCommunicationToken(ctx, token, platformAgent)
Register your communication token for mobile clients

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **token** | **string**|  | 
  **platformAgent** | **string**|  | 

### Return type

[**[]CommunicationToken**](CommunicationToken.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **UserConfirm**
> AccessToken UserConfirm(ctx, token)
Confirm your email address with a token.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **token** | **string**|  | 

### Return type

[**AccessToken**](AccessToken.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **UserConfirmWithdrawal**
> Transaction UserConfirmWithdrawal(ctx, token)
Confirm a withdrawal.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **token** | **string**|  | 

### Return type

[**Transaction**](Transaction.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **UserCreateSubAccount**
> interface{} UserCreateSubAccount(ctx, accountName)
Creates a new sub-account.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **accountName** | **string**|  | 

### Return type

**interface{}**

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **UserCreateUnstakingRequests**
> interface{} UserCreateUnstakingRequests(ctx, symbol, amount)
Create unstaking request

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **symbol** | **string**|  | 
  **amount** | **float64**|  | 

### Return type

**interface{}**

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **UserDeleteUnstakingRequests**
> interface{} UserDeleteUnstakingRequests(ctx, redemptionID)
Cancel unstaking request

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **redemptionID** | **string**|  | 

### Return type

**interface{}**

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **UserGet**
> User UserGet(ctx, )
Get your user model.

### Required Parameters
This endpoint does not need any parameter.

### Return type

[**User**](User.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **UserGetAffiliateStatus**
> Affiliate UserGetAffiliateStatus(ctx, optional)
Get your current affiliate/referral status.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***UserApiUserGetAffiliateStatusOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a UserApiUserGetAffiliateStatusOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currency** | **optional.String**| Any currency. For all currencies, see &lt;a href&#x3D;\&quot;#!/Wallet/Wallet_getAssetsConfig\&quot;&gt;asset config endpoint&lt;/a&gt;. For all currencies specify \&quot;all\&quot; | [default to XBt]

### Return type

[**Affiliate**](Affiliate.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **UserGetCSA**
> CollateralSupportAgreement UserGetCSA(ctx, )
Get your account's CSA status.

### Required Parameters
This endpoint does not need any parameter.

### Return type

[**CollateralSupportAgreement**](CollateralSupportAgreement.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **UserGetCommission**
> UserCommissionsBySymbol UserGetCommission(ctx, )
Get your account's commission status.

### Required Parameters
This endpoint does not need any parameter.

### Return type

[**UserCommissionsBySymbol**](UserCommissionsBySymbol.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **UserGetDepositAddress**
> string UserGetDepositAddress(ctx, currency, network)
Get a deposit address.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **currency** | **string**| Any currency. For all currencies, see &lt;a href&#x3D;\&quot;#!/Wallet/Wallet_getAssetsConfig\&quot;&gt;asset config endpoint&lt;/a&gt; | 
  **network** | **string**| The &#x60;network&#x60; parameter is used to indicate which blockchain you would like to deposit from. The acceptable value in the &#x60;network&#x60; parameter for each currency can be found from &#x60;networks.asset&#x60; from &#x60;GET /wallet/assets&#x60;. | 

### Return type

**string**

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **UserGetDepositAddressInformation**
> DepositAddress UserGetDepositAddressInformation(ctx, currency, network)
Get a deposit address.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **currency** | **string**| Any currency. For all currencies, see &lt;a href&#x3D;\&quot;#!/Wallet/Wallet_getAssetsConfig\&quot;&gt;asset config endpoint&lt;/a&gt; | 
  **network** | **string**| The &#x60;network&#x60; parameter is used to indicate which blockchain you would like to deposit from. The acceptable value in the &#x60;network&#x60; parameter for each currency can be found from &#x60;networks.asset&#x60; from &#x60;GET /wallet/assets&#x60;. | 

### Return type

[**DepositAddress**](DepositAddress.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **UserGetExecutionHistory**
> []Execution UserGetExecutionHistory(ctx, symbol, timestamp)
Get the execution history by day.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **symbol** | **string**|  | [default to XBTUSD]
  **timestamp** | **time.Time**|  | [default to 2017-02-13T12:00:00.000Z]

### Return type

[**[]Execution**](Execution.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **UserGetMargin**
> Margin UserGetMargin(ctx, optional)
Get your account's margin status. Send a currency of \"all\" to receive an array of all supported currencies.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***UserApiUserGetMarginOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a UserApiUserGetMarginOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currency** | **optional.String**| Any currency. For all currencies, see &lt;a href&#x3D;\&quot;#!/Wallet/Wallet_getAssetsConfig\&quot;&gt;asset config endpoint&lt;/a&gt;. For all currencies specify \&quot;all\&quot; | [default to XBt]

### Return type

[**Margin**](Margin.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **UserGetQuoteFillRatio**
> QuoteFillRatio UserGetQuoteFillRatio(ctx, optional)
Get 7 days worth of Quote Fill Ratio statistics.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***UserApiUserGetQuoteFillRatioOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a UserApiUserGetQuoteFillRatioOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **targetAccountId** | **optional.Float64**| AccountId to get quote fill ratio for, must be a paired account with main user. Can be wildcard * to get all accounts linked to the authenticated user | 

### Return type

[**QuoteFillRatio**](QuoteFillRatio.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **UserGetQuoteValueRatio**
> QuoteValueRatio UserGetQuoteValueRatio(ctx, optional)
Get Quote Value Ratio statistics over the last 3 days

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***UserApiUserGetQuoteValueRatioOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a UserApiUserGetQuoteValueRatioOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **targetAccountId** | **optional.Float64**| AccountId to get quote value ratio for, must be a paired account with main user. Can be wildcard * to get all accounts linked to the authenticated user | 

### Return type

[**QuoteValueRatio**](QuoteValueRatio.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **UserGetStaking**
> []StakingRecord UserGetStaking(ctx, optional)
Get the current user staking amount.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***UserApiUserGetStakingOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a UserApiUserGetStakingOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currency** | **optional.String**|  | 

### Return type

[**[]StakingRecord**](StakingRecord.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **UserGetStakingInstruments**
> []XAny UserGetStakingInstruments(ctx, optional)
List staking instruments

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***UserApiUserGetStakingInstrumentsOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a UserApiUserGetStakingInstrumentsOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **optional.String**|  | 
 **currency** | **optional.String**|  | 

### Return type

[**[]XAny**](x-any.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **UserGetStakingTiers**
> []XAny UserGetStakingTiers(ctx, currency)
List staking tiers for a given currency

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **currency** | **string**|  | 

### Return type

[**[]XAny**](x-any.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **UserGetTradingVolume**
> []TradingVolume UserGetTradingVolume(ctx, )
Get your 30 days USD average trading volume

### Required Parameters
This endpoint does not need any parameter.

### Return type

[**[]TradingVolume**](TradingVolume.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **UserGetUnstakingRequests**
> []StakingRecord UserGetUnstakingRequests(ctx, status)
Get the current user unstaking requests

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **status** | **string**|  | 

### Return type

[**[]StakingRecord**](StakingRecord.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **UserGetWallet**
> Wallet UserGetWallet(ctx, optional)
Get your current wallet information.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***UserApiUserGetWalletOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a UserApiUserGetWalletOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currency** | **optional.String**| Any currency. For all currencies, see &lt;a href&#x3D;\&quot;#!/Wallet/Wallet_getAssetsConfig\&quot;&gt;asset config endpoint&lt;/a&gt;. For all currencies specify \&quot;all\&quot; | [default to XBt]

### Return type

[**Wallet**](Wallet.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **UserGetWalletHistory**
> []Transaction UserGetWalletHistory(ctx, optional)
Get a history of all of your wallet transactions (deposits, withdrawals, PNL).

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***UserApiUserGetWalletHistoryOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a UserApiUserGetWalletHistoryOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currency** | **optional.String**| Any currency. For all currencies, see &lt;a href&#x3D;\&quot;#!/Wallet/Wallet_getAssetsConfig\&quot;&gt;asset config endpoint&lt;/a&gt;. For all currencies specify \&quot;all\&quot; | [default to XBt]
 **count** | **optional.Float64**| Number of results to fetch. Fetch results from start to start + count. Max: 10,000 rows. | [default to 10000]
 **start** | **optional.Float64**| Starting point for results, integer. Default 0. | [default to 0]
 **targetAccountId** | **optional.Float64**| AccountId to view the history of, must be a paired account with the authorised user requesting the history. | 
 **reverse** | **optional.Bool**| Start from the latest transaction record. Default true. | [default to true]

### Return type

[**[]Transaction**](Transaction.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **UserGetWalletSummary**
> []WalletSummaryRecord UserGetWalletSummary(ctx, optional)
Get a summary of all of your wallet transactions (deposits, withdrawals, PNL).

Provides an aggregated view of transactions, by transaction type, over a specific time period.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***UserApiUserGetWalletSummaryOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a UserApiUserGetWalletSummaryOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currency** | **optional.String**| Any currency. For all currencies, see &lt;a href&#x3D;\&quot;#!/Wallet/Wallet_getAssetsConfig\&quot;&gt;asset config endpoint&lt;/a&gt;. For all currencies specify \&quot;all\&quot; | [default to XBt]
 **startTime** | **optional.Time**| Start time for the summary | 
 **endTime** | **optional.Time**| End time for the summary | 

### Return type

[**[]WalletSummaryRecord**](WalletSummaryRecord.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **UserGetWalletTransferAccounts**
> []XAny UserGetWalletTransferAccounts(ctx, )
Get the list of accounts you can transfer funds between.

### Required Parameters
This endpoint does not need any parameter.

### Return type

[**[]XAny**](x-any.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **UserLogout**
> UserLogout(ctx, )
Log out of BitMEX.

### Required Parameters
This endpoint does not need any parameter.

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **UserRequestWithdrawal**
> Transaction UserRequestWithdrawal(ctx, currency, network, amount, optional)
Request a withdrawal to an external wallet.

This will send a confirmation email to the email address on record.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **currency** | **string**| Currency you&#39;re withdrawing. Any currency. For all currencies, see &lt;a href&#x3D;\&quot;#!/Wallet/Wallet_getAssetsConfig\&quot;&gt;asset config endpoint&lt;/a&gt; | [default to XBt]
  **network** | **string**| The &#x60;network&#x60; parameter is used to indicate which blockchain you would like to withdraw from. The acceptable value in the &#x60;network&#x60; parameter for each currency can be found from &#x60;networks.asset&#x60; from &#x60;GET /wallet/assets&#x60;. | 
  **amount** | **int64**| Amount of withdrawal currency. | 
 **optional** | ***UserApiUserRequestWithdrawalOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a UserApiUserRequestWithdrawalOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------



 **otpToken** | **optional.String**| 2FA token. Required for all external withdrawals unless the address has skip2FA in addressbook. | 
 **address** | **optional.String**| Destination Address. One of &#x60;address&#x60;, &#x60;addressId&#x60;, &#x60;targetUserId&#x60; has to be specified. | 
 **memo** | **optional.String**| Destination Memo. If &#x60;address&#x60;, is specified, Destination Memo can also be specified | 
 **addressId** | **optional.Float64**| ID of the Destination Address. One of &#x60;address&#x60;, &#x60;addressId&#x60;, &#x60;targetUserId&#x60; has to be specified. | 
 **targetUserId** | **optional.Float64**| ID of the Target User. One of &#x60;address&#x60;, &#x60;addressId&#x60;, &#x60;targetUserId&#x60; has to be specified. | 
 **fee** | **optional.Float64**| Network fee for Bitcoin withdrawals. If not specified, a default value will be calculated based on Bitcoin network conditions. You will have a chance to confirm this via email. | 
 **text** | **optional.String**| Optional annotation, e.g. &#39;Transfer to home wallet&#39;. | 

### Return type

[**Transaction**](Transaction.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **UserSavePreferences**
> User UserSavePreferences(ctx, prefs, optional)
Save user preferences.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **prefs** | **string**|  | 
 **optional** | ***UserApiUserSavePreferencesOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a UserApiUserSavePreferencesOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **overwrite** | **optional.Bool**| If true, will overwrite all existing preferences. | [default to false]

### Return type

[**User**](User.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **UserUpdateSubAccount**
> interface{} UserUpdateSubAccount(ctx, targetAccountId, accountName)
Updates the sub-account name.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **targetAccountId** | **float64**|  | 
  **accountName** | **string**|  | 

### Return type

**interface{}**

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **UserWalletTransfer**
> Transaction UserWalletTransfer(ctx, currency, amount, targetAccountId, optional)
Execute a transfer to a paired account.

This will send a confirmation email to the email address on record.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **currency** | **string**| Currency you&#39;re transfering. Any currency. For all currencies, see &lt;a href&#x3D;\&quot;#!/Wallet/Wallet_getAssetsConfig\&quot;&gt;asset config endpoint&lt;/a&gt; | 
  **amount** | **int64**| Amount of transfer. | 
  **targetAccountId** | **float64**| AccountId to send the transfer to, must be a paired account with the user sending the transfer. | 
 **optional** | ***UserApiUserWalletTransferOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a UserApiUserWalletTransferOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------



 **fromAccountId** | **optional.Float64**| AccountID to send the transfer from. Must be paired account with the authenticated user. | 

### Return type

[**Transaction**](Transaction.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

