# \UserApi

All URIs are relative to *https://localhost/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**UserCancelWithdrawal**](UserApi.md#UserCancelWithdrawal) | **Post** /user/cancelWithdrawal | Cancel a withdrawal.
[**UserCheckReferralCode**](UserApi.md#UserCheckReferralCode) | **Get** /user/checkReferralCode | Check if a referral code is valid.
[**UserConfirm**](UserApi.md#UserConfirm) | **Post** /user/confirmEmail | Confirm your email address with a token.
[**UserConfirmEnableTFA**](UserApi.md#UserConfirmEnableTFA) | **Post** /user/confirmEnableTFA | Confirm two-factor auth for this account. If using a Yubikey, simply send a token to this endpoint.
[**UserConfirmWithdrawal**](UserApi.md#UserConfirmWithdrawal) | **Post** /user/confirmWithdrawal | Confirm a withdrawal.
[**UserDisableTFA**](UserApi.md#UserDisableTFA) | **Post** /user/disableTFA | Disable two-factor auth for this account.
[**UserGet**](UserApi.md#UserGet) | **Get** /user | Get your user model.
[**UserGetAffiliateStatus**](UserApi.md#UserGetAffiliateStatus) | **Get** /user/affiliateStatus | Get your current affiliate/referral status.
[**UserGetCommission**](UserApi.md#UserGetCommission) | **Get** /user/commission | Get your account&#39;s commission status.
[**UserGetDepositAddress**](UserApi.md#UserGetDepositAddress) | **Get** /user/depositAddress | Get a deposit address.
[**UserGetMargin**](UserApi.md#UserGetMargin) | **Get** /user/margin | Get your account&#39;s margin status. Send a currency of \&quot;all\&quot; to receive an array of all supported currencies.
[**UserGetWallet**](UserApi.md#UserGetWallet) | **Get** /user/wallet | Get your current wallet information.
[**UserGetWalletHistory**](UserApi.md#UserGetWalletHistory) | **Get** /user/walletHistory | Get a history of all of your wallet transactions (deposits, withdrawals, PNL).
[**UserGetWalletSummary**](UserApi.md#UserGetWalletSummary) | **Get** /user/walletSummary | Get a summary of all of your wallet transactions (deposits, withdrawals, PNL).
[**UserLogout**](UserApi.md#UserLogout) | **Post** /user/logout | Log out of BitMEX.
[**UserLogoutAll**](UserApi.md#UserLogoutAll) | **Post** /user/logoutAll | Log all systems out of BitMEX. This will revoke all of your account&#39;s access tokens, logging you out on all devices.
[**UserMinWithdrawalFee**](UserApi.md#UserMinWithdrawalFee) | **Get** /user/minWithdrawalFee | Get the minimum withdrawal fee for a currency.
[**UserRequestEnableTFA**](UserApi.md#UserRequestEnableTFA) | **Post** /user/requestEnableTFA | Get secret key for setting up two-factor auth.
[**UserRequestWithdrawal**](UserApi.md#UserRequestWithdrawal) | **Post** /user/requestWithdrawal | Request a withdrawal to an external wallet.
[**UserSavePreferences**](UserApi.md#UserSavePreferences) | **Post** /user/preferences | Save user preferences.
[**UserUpdate**](UserApi.md#UserUpdate) | **Put** /user | Update your password, name, and other attributes.


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

If the code is valid, responds with the referral code's discount (e.g. `0.1` for 10%). Otherwise, will return a 404.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***UserCheckReferralCodeOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a UserCheckReferralCodeOpts struct

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

# **UserConfirmEnableTFA**
> bool UserConfirmEnableTFA(ctx, token, optional)
Confirm two-factor auth for this account. If using a Yubikey, simply send a token to this endpoint.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **token** | **string**| Token from your selected TFA type. | 
 **optional** | ***UserConfirmEnableTFAOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a UserConfirmEnableTFAOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **type_** | **optional.String**| Two-factor auth type. Supported types: &#39;GA&#39; (Google Authenticator), &#39;Yubikey&#39; | 

### Return type

**bool**

### Authorization

[apiKey](../README.md#apiKey), [apiNonce](../README.md#apiNonce), [apiSignature](../README.md#apiSignature)

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

# **UserDisableTFA**
> bool UserDisableTFA(ctx, token, optional)
Disable two-factor auth for this account.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **token** | **string**| Token from your selected TFA type. | 
 **optional** | ***UserDisableTFAOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a UserDisableTFAOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **type_** | **optional.String**| Two-factor auth type. Supported types: &#39;GA&#39; (Google Authenticator) | 

### Return type

**bool**

### Authorization

[apiKey](../README.md#apiKey), [apiNonce](../README.md#apiNonce), [apiSignature](../README.md#apiSignature)

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

[apiKey](../README.md#apiKey), [apiNonce](../README.md#apiNonce), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **UserGetAffiliateStatus**
> Affiliate UserGetAffiliateStatus(ctx, )
Get your current affiliate/referral status.

### Required Parameters
This endpoint does not need any parameter.

### Return type

[**Affiliate**](Affiliate.md)

### Authorization

[apiKey](../README.md#apiKey), [apiNonce](../README.md#apiNonce), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **UserGetCommission**
> []UserCommission UserGetCommission(ctx, )
Get your account's commission status.

### Required Parameters
This endpoint does not need any parameter.

### Return type

[**[]UserCommission**](UserCommission.md)

### Authorization

[apiKey](../README.md#apiKey), [apiNonce](../README.md#apiNonce), [apiSignature](../README.md#apiSignature)

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
 **optional** | ***UserGetDepositAddressOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a UserGetDepositAddressOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currency** | **optional.String**|  | [default to XBt]

### Return type

**string**

### Authorization

[apiKey](../README.md#apiKey), [apiNonce](../README.md#apiNonce), [apiSignature](../README.md#apiSignature)

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
 **optional** | ***UserGetMarginOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a UserGetMarginOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currency** | **optional.String**|  | [default to XBt]

### Return type

[**Margin**](Margin.md)

### Authorization

[apiKey](../README.md#apiKey), [apiNonce](../README.md#apiNonce), [apiSignature](../README.md#apiSignature)

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
 **optional** | ***UserGetWalletOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a UserGetWalletOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currency** | **optional.String**|  | [default to XBt]

### Return type

[**Wallet**](Wallet.md)

### Authorization

[apiKey](../README.md#apiKey), [apiNonce](../README.md#apiNonce), [apiSignature](../README.md#apiSignature)

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
 **optional** | ***UserGetWalletHistoryOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a UserGetWalletHistoryOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currency** | **optional.String**|  | [default to XBt]

### Return type

[**[]Transaction**](Transaction.md)

### Authorization

[apiKey](../README.md#apiKey), [apiNonce](../README.md#apiNonce), [apiSignature](../README.md#apiSignature)

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
 **optional** | ***UserGetWalletSummaryOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a UserGetWalletSummaryOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currency** | **optional.String**|  | [default to XBt]

### Return type

[**[]Transaction**](Transaction.md)

### Authorization

[apiKey](../README.md#apiKey), [apiNonce](../README.md#apiNonce), [apiSignature](../README.md#apiSignature)

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

# **UserLogoutAll**
> float64 UserLogoutAll(ctx, )
Log all systems out of BitMEX. This will revoke all of your account's access tokens, logging you out on all devices.

### Required Parameters
This endpoint does not need any parameter.

### Return type

**float64**

### Authorization

[apiKey](../README.md#apiKey), [apiNonce](../README.md#apiNonce), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **UserMinWithdrawalFee**
> interface{} UserMinWithdrawalFee(ctx, optional)
Get the minimum withdrawal fee for a currency.

This is changed based on network conditions to ensure timely withdrawals. During network congestion, this may be high. The fee is returned in the same currency.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***UserMinWithdrawalFeeOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a UserMinWithdrawalFeeOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currency** | **optional.String**|  | [default to XBt]

### Return type

[**interface{}**](interface{}.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **UserRequestEnableTFA**
> bool UserRequestEnableTFA(ctx, optional)
Get secret key for setting up two-factor auth.

Use /confirmEnableTFA directly for Yubikeys. This fails if TFA is already enabled.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***UserRequestEnableTFAOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a UserRequestEnableTFAOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type_** | **optional.String**| Two-factor auth type. Supported types: &#39;GA&#39; (Google Authenticator) | 

### Return type

**bool**

### Authorization

[apiKey](../README.md#apiKey), [apiNonce](../README.md#apiNonce), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **UserRequestWithdrawal**
> Transaction UserRequestWithdrawal(ctx, currency, amount, address, optional)
Request a withdrawal to an external wallet.

This will send a confirmation email to the email address on record, unless requested via an API Key with the `withdraw` permission.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **currency** | **string**| Currency you&#39;re withdrawing. Options: &#x60;XBt&#x60; | [default to XBt]
  **amount** | **float32**| Amount of withdrawal currency. | 
  **address** | **string**| Destination Address. | 
 **optional** | ***UserRequestWithdrawalOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a UserRequestWithdrawalOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------



 **otpToken** | **optional.String**| 2FA token. Required if 2FA is enabled on your account. | 
 **fee** | **optional.Float64**| Network fee for Bitcoin withdrawals. If not specified, a default value will be calculated based on Bitcoin network conditions. You will have a chance to confirm this via email. | 

### Return type

[**Transaction**](Transaction.md)

### Authorization

[apiKey](../README.md#apiKey), [apiNonce](../README.md#apiNonce), [apiSignature](../README.md#apiSignature)

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
 **optional** | ***UserSavePreferencesOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a UserSavePreferencesOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **overwrite** | **optional.Bool**| If true, will overwrite all existing preferences. | [default to false]

### Return type

[**User**](User.md)

### Authorization

[apiKey](../README.md#apiKey), [apiNonce](../README.md#apiNonce), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **UserUpdate**
> User UserUpdate(ctx, optional)
Update your password, name, and other attributes.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***UserUpdateOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a UserUpdateOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **firstname** | **optional.String**|  | 
 **lastname** | **optional.String**|  | 
 **oldPassword** | **optional.String**|  | 
 **newPassword** | **optional.String**|  | 
 **newPasswordConfirm** | **optional.String**|  | 
 **username** | **optional.String**| Username can only be set once. To reset, email support. | 
 **country** | **optional.String**| Country of residence. | 
 **pgpPubKey** | **optional.String**| PGP Public Key. If specified, automated emails will be sentwith this key. | 

### Return type

[**User**](User.md)

### Authorization

[apiKey](../README.md#apiKey), [apiNonce](../README.md#apiNonce), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

