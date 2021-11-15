# \UserApi

All URIs are relative to *https://www.bitmex.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**UserCancelWithdrawal**](UserApi.md#UserCancelWithdrawal) | **Post** /user/cancelWithdrawal | Cancel a withdrawal.
[**UserCheckReferralCode**](UserApi.md#UserCheckReferralCode) | **Get** /user/checkReferralCode | Check if a referral code is valid.
[**UserCommunicationToken**](UserApi.md#UserCommunicationToken) | **Post** /user/communicationToken | Register your communication token for mobile clients
[**UserConfirm**](UserApi.md#UserConfirm) | **Post** /user/confirmEmail | Confirm your email address with a token.
[**UserConfirmWithdrawal**](UserApi.md#UserConfirmWithdrawal) | **Post** /user/confirmWithdrawal | Confirm a withdrawal.
[**UserGet**](UserApi.md#UserGet) | **Get** /user | Get your user model.
[**UserGetAffiliateStatus**](UserApi.md#UserGetAffiliateStatus) | **Get** /user/affiliateStatus | Get your current affiliate/referral status.
[**UserGetCommission**](UserApi.md#UserGetCommission) | **Get** /user/commission | Get your account&#39;s commission status.
[**UserGetDepositAddress**](UserApi.md#UserGetDepositAddress) | **Get** /user/depositAddress | Get a deposit address.
[**UserGetExecutionHistory**](UserApi.md#UserGetExecutionHistory) | **Get** /user/executionHistory | Get the execution history by day.
[**UserGetMargin**](UserApi.md#UserGetMargin) | **Get** /user/margin | Get your account&#39;s margin status. Send a currency of \&quot;all\&quot; to receive an array of all supported currencies.
[**UserGetQuoteFillRatio**](UserApi.md#UserGetQuoteFillRatio) | **Get** /user/quoteFillRatio | Get 7 days worth of Quote Fill Ratio statistics.
[**UserGetQuoteValueRatio**](UserApi.md#UserGetQuoteValueRatio) | **Get** /user/quoteValueRatio | Get Quote Value Ratio statistics over the last 3 days
[**UserGetTradingVolume**](UserApi.md#UserGetTradingVolume) | **Get** /user/tradingVolume | Get your 30 days USD average trading volume
[**UserGetWallet**](UserApi.md#UserGetWallet) | **Get** /user/wallet | Get your current wallet information.
[**UserGetWalletHistory**](UserApi.md#UserGetWalletHistory) | **Get** /user/walletHistory | Get a history of all of your wallet transactions (deposits, withdrawals, PNL).
[**UserGetWalletSummary**](UserApi.md#UserGetWalletSummary) | **Get** /user/walletSummary | Get a summary of all of your wallet transactions (deposits, withdrawals, PNL).
[**UserLogout**](UserApi.md#UserLogout) | **Post** /user/logout | Log out of BitMEX.
[**UserMinWithdrawalFee**](UserApi.md#UserMinWithdrawalFee) | **Get** /user/minWithdrawalFee | Get the minimum, maximum, and recommended withdrawal fees for a currency.
[**UserRequestWithdrawal**](UserApi.md#UserRequestWithdrawal) | **Post** /user/requestWithdrawal | Request a withdrawal to an external wallet.
[**UserSavePreferences**](UserApi.md#UserSavePreferences) | **Post** /user/preferences | Save user preferences.


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
> float64 UserCheckReferralCode(ctx, optional)
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

**float64**

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
 **currency** | **optional.String**| Options: &#x60;XBt&#x60;, &#x60;USDt&#x60;, &#x60;all&#x60; | [default to XBt]

### Return type

[**Affiliate**](Affiliate.md)

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
> string UserGetDepositAddress(ctx, optional)
Get a deposit address.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***UserApiUserGetDepositAddressOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a UserApiUserGetDepositAddressOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currency** | **optional.String**| Options: &#x60;XBt&#x60;, &#x60;USDt&#x60; | [default to XBt]

### Return type

**string**

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **UserGetExecutionHistory**
> interface{} UserGetExecutionHistory(ctx, symbol, timestamp)
Get the execution history by day.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **symbol** | **string**|  | [default to XBTUSD]
  **timestamp** | **time.Time**|  | [default to 2017-02-13T12:00:00.000Z]

### Return type

**interface{}**

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
 **currency** | **optional.String**| Options: &#x60;XBt&#x60;, &#x60;USDt&#x60;, &#x60;all&#x60; | [default to XBt]

### Return type

[**Margin**](Margin.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **UserGetQuoteFillRatio**
> QuoteFillRatio UserGetQuoteFillRatio(ctx, )
Get 7 days worth of Quote Fill Ratio statistics.

### Required Parameters
This endpoint does not need any parameter.

### Return type

[**QuoteFillRatio**](QuoteFillRatio.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **UserGetQuoteValueRatio**
> QuoteValueRatio UserGetQuoteValueRatio(ctx, )
Get Quote Value Ratio statistics over the last 3 days

### Required Parameters
This endpoint does not need any parameter.

### Return type

[**QuoteValueRatio**](QuoteValueRatio.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **UserGetTradingVolume**
> TradingVolume UserGetTradingVolume(ctx, )
Get your 30 days USD average trading volume

### Required Parameters
This endpoint does not need any parameter.

### Return type

[**TradingVolume**](TradingVolume.md)

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
 **currency** | **optional.String**| Options: &#x60;XBt&#x60;, &#x60;USDt&#x60;, &#x60;all&#x60; | [default to XBt]

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
 **currency** | **optional.String**| Options: &#x60;XBt&#x60;, &#x60;USDt&#x60;, &#x60;all&#x60; | [default to XBt]
 **count** | **optional.Float64**| Number of results to fetch. | [default to 100]
 **start** | **optional.Float64**| Starting point for results. | [default to 0]

### Return type

[**[]Transaction**](Transaction.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **UserGetWalletSummary**
> []Transaction UserGetWalletSummary(ctx, optional)
Get a summary of all of your wallet transactions (deposits, withdrawals, PNL).

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***UserApiUserGetWalletSummaryOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a UserApiUserGetWalletSummaryOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currency** | **optional.String**| Options: &#x60;XBt&#x60;, &#x60;USDt&#x60;, &#x60;all&#x60; | [default to XBt]

### Return type

[**[]Transaction**](Transaction.md)

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

# **UserMinWithdrawalFee**
> interface{} UserMinWithdrawalFee(ctx, optional)
Get the minimum, maximum, and recommended withdrawal fees for a currency.

This is changed based on network conditions to ensure timely withdrawals. During network congestion, this may be high. The fee is returned in the same currency.  The \"fee\" field is the recommended fee for fast confirmation on the blockchain.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***UserApiUserMinWithdrawalFeeOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a UserApiUserMinWithdrawalFeeOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currency** | **optional.String**| Options: &#x60;XBt&#x60;, &#x60;USDt&#x60; | [default to XBt]
 **amount** | **optional.Float64**|  | 

### Return type

**interface{}**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **UserRequestWithdrawal**
> Transaction UserRequestWithdrawal(ctx, currency, amount, optional)
Request a withdrawal to an external wallet.

This will send a confirmation email to the email address on record.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **currency** | **string**| Currency you&#39;re withdrawing. Options: &#x60;XBt&#x60;, &#x60;USDt&#x60; | [default to XBt]
  **amount** | **float32**| Amount of withdrawal currency. | 
 **optional** | ***UserApiUserRequestWithdrawalOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a UserApiUserRequestWithdrawalOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **otpToken** | **optional.String**| 2FA token. Required for all external withdrawals. | 
 **address** | **optional.String**| Destination Address. One of &#x60;address&#x60;, &#x60;addressId&#x60;, &#x60;targetUserId&#x60; has to be specified. | 
 **addressId** | **optional.Float64**| ID of the Destination Address. One of &#x60;address&#x60;, &#x60;targetUserId&#x60;, &#x60;targetUserId&#x60; has to be specified. | 
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

