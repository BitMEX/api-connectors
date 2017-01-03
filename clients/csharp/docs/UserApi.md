# IO.Swagger.Api.UserApi

All URIs are relative to *https://localhost/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**UserCancelWithdrawal**](UserApi.md#usercancelwithdrawal) | **POST** /user/cancelWithdrawal | Cancel a withdrawal.
[**UserCheckReferralCode**](UserApi.md#usercheckreferralcode) | **GET** /user/checkReferralCode | Check if a referral code is valid.
[**UserConfirmEmail**](UserApi.md#userconfirmemail) | **POST** /user/confirmEmail | Confirm your email address with a token.
[**UserConfirmEnableTFA**](UserApi.md#userconfirmenabletfa) | **POST** /user/confirmEnableTFA | Confirm two-factor auth for this account. If using a Yubikey, simply send a token to this endpoint.
[**UserConfirmWithdrawal**](UserApi.md#userconfirmwithdrawal) | **POST** /user/confirmWithdrawal | Confirm a withdrawal.
[**UserDisableTFA**](UserApi.md#userdisabletfa) | **POST** /user/disableTFA | Disable two-factor auth for this account.
[**UserGet**](UserApi.md#userget) | **GET** /user | Get your user model.
[**UserGetAffiliateStatus**](UserApi.md#usergetaffiliatestatus) | **GET** /user/affiliateStatus | Get your current affiliate/referral status.
[**UserGetCommission**](UserApi.md#usergetcommission) | **GET** /user/commission | Get your account&#39;s commission status.
[**UserGetDepositAddress**](UserApi.md#usergetdepositaddress) | **GET** /user/depositAddress | Get a deposit address.
[**UserGetMargin**](UserApi.md#usergetmargin) | **GET** /user/margin | Get your account&#39;s margin status. Send a currency of \&quot;all\&quot; to receive an array of all supported currencies.
[**UserGetWallet**](UserApi.md#usergetwallet) | **GET** /user/wallet | Get your current wallet information.
[**UserGetWalletHistory**](UserApi.md#usergetwallethistory) | **GET** /user/walletHistory | Get a history of all of your wallet transactions (deposits, withdrawals, PNL).
[**UserGetWalletSummary**](UserApi.md#usergetwalletsummary) | **GET** /user/walletSummary | Get a summary of all of your wallet transactions (deposits, withdrawals, PNL).
[**UserLogout**](UserApi.md#userlogout) | **POST** /user/logout | Log out of BitMEX.
[**UserLogoutAll**](UserApi.md#userlogoutall) | **POST** /user/logoutAll | Log all systems out of BitMEX. This will revoke all of your account&#39;s access tokens, logging you out on all devices.
[**UserRequestEnableTFA**](UserApi.md#userrequestenabletfa) | **POST** /user/requestEnableTFA | Get Google Authenticator secret key for setting up two-factor auth. Fails if already enabled. Use /confirmEnableTFA for Yubikeys.
[**UserRequestWithdrawal**](UserApi.md#userrequestwithdrawal) | **POST** /user/requestWithdrawal | Request a withdrawal to an external wallet.
[**UserSavePreferences**](UserApi.md#usersavepreferences) | **POST** /user/preferences | Save user preferences.
[**UserUpdate**](UserApi.md#userupdate) | **PUT** /user | Update your password, name, and other attributes.


# **UserCancelWithdrawal**
> Transaction UserCancelWithdrawal (string token)

Cancel a withdrawal.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class UserCancelWithdrawalExample
    {
        public void main()
        {
            
            var apiInstance = new UserApi();
            var token = token_example;  // string | 

            try
            {
                // Cancel a withdrawal.
                Transaction result = apiInstance.UserCancelWithdrawal(token);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling UserApi.UserCancelWithdrawal: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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
> double? UserCheckReferralCode (string referralCode = null)

Check if a referral code is valid.

If the code is valid, responds with the referral code's discount (e.g. `0.1` for 10%). Otherwise, will return a 404.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class UserCheckReferralCodeExample
    {
        public void main()
        {
            
            var apiInstance = new UserApi();
            var referralCode = referralCode_example;  // string |  (optional) 

            try
            {
                // Check if a referral code is valid.
                double? result = apiInstance.UserCheckReferralCode(referralCode);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling UserApi.UserCheckReferralCode: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **referralCode** | **string**|  | [optional] 

### Return type

**double?**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **UserConfirmEmail**
> AccessToken UserConfirmEmail (string token)

Confirm your email address with a token.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class UserConfirmEmailExample
    {
        public void main()
        {
            
            var apiInstance = new UserApi();
            var token = token_example;  // string | 

            try
            {
                // Confirm your email address with a token.
                AccessToken result = apiInstance.UserConfirmEmail(token);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling UserApi.UserConfirmEmail: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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
> bool? UserConfirmEnableTFA (string token, string type = null)

Confirm two-factor auth for this account. If using a Yubikey, simply send a token to this endpoint.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class UserConfirmEnableTFAExample
    {
        public void main()
        {
            
            var apiInstance = new UserApi();
            var token = token_example;  // string | Token from your selected TFA type.
            var type = type_example;  // string | Two-factor auth type. Supported types: 'GA' (Google Authenticator), 'Yubikey' (optional) 

            try
            {
                // Confirm two-factor auth for this account. If using a Yubikey, simply send a token to this endpoint.
                bool? result = apiInstance.UserConfirmEnableTFA(token, type);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling UserApi.UserConfirmEnableTFA: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string**| Token from your selected TFA type. | 
 **type** | **string**| Two-factor auth type. Supported types: &#39;GA&#39; (Google Authenticator), &#39;Yubikey&#39; | [optional] 

### Return type

**bool?**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **UserConfirmWithdrawal**
> Transaction UserConfirmWithdrawal (string token)

Confirm a withdrawal.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class UserConfirmWithdrawalExample
    {
        public void main()
        {
            
            var apiInstance = new UserApi();
            var token = token_example;  // string | 

            try
            {
                // Confirm a withdrawal.
                Transaction result = apiInstance.UserConfirmWithdrawal(token);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling UserApi.UserConfirmWithdrawal: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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
> bool? UserDisableTFA (string token, string type = null)

Disable two-factor auth for this account.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class UserDisableTFAExample
    {
        public void main()
        {
            
            var apiInstance = new UserApi();
            var token = token_example;  // string | Token from your selected TFA type.
            var type = type_example;  // string | Two-factor auth type. Supported types: 'GA' (Google Authenticator) (optional) 

            try
            {
                // Disable two-factor auth for this account.
                bool? result = apiInstance.UserDisableTFA(token, type);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling UserApi.UserDisableTFA: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string**| Token from your selected TFA type. | 
 **type** | **string**| Two-factor auth type. Supported types: &#39;GA&#39; (Google Authenticator) | [optional] 

### Return type

**bool?**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **UserGet**
> User UserGet ()

Get your user model.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class UserGetExample
    {
        public void main()
        {
            
            var apiInstance = new UserApi();

            try
            {
                // Get your user model.
                User result = apiInstance.UserGet();
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling UserApi.UserGet: " + e.Message );
            }
        }
    }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**User**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **UserGetAffiliateStatus**
> List<Affiliate> UserGetAffiliateStatus ()

Get your current affiliate/referral status.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class UserGetAffiliateStatusExample
    {
        public void main()
        {
            
            var apiInstance = new UserApi();

            try
            {
                // Get your current affiliate/referral status.
                List&lt;Affiliate&gt; result = apiInstance.UserGetAffiliateStatus();
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling UserApi.UserGetAffiliateStatus: " + e.Message );
            }
        }
    }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List<Affiliate>**](Affiliate.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **UserGetCommission**
> List<UserCommission> UserGetCommission ()

Get your account's commission status.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class UserGetCommissionExample
    {
        public void main()
        {
            
            var apiInstance = new UserApi();

            try
            {
                // Get your account's commission status.
                List&lt;UserCommission&gt; result = apiInstance.UserGetCommission();
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling UserApi.UserGetCommission: " + e.Message );
            }
        }
    }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List<UserCommission>**](UserCommission.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **UserGetDepositAddress**
> string UserGetDepositAddress (string currency = null)

Get a deposit address.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class UserGetDepositAddressExample
    {
        public void main()
        {
            
            var apiInstance = new UserApi();
            var currency = currency_example;  // string |  (optional)  (default to XBt)

            try
            {
                // Get a deposit address.
                string result = apiInstance.UserGetDepositAddress(currency);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling UserApi.UserGetDepositAddress: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currency** | **string**|  | [optional] [default to XBt]

### Return type

**string**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **UserGetMargin**
> Margin UserGetMargin (string currency = null)

Get your account's margin status. Send a currency of \"all\" to receive an array of all supported currencies.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class UserGetMarginExample
    {
        public void main()
        {
            
            var apiInstance = new UserApi();
            var currency = currency_example;  // string |  (optional)  (default to XBt)

            try
            {
                // Get your account's margin status. Send a currency of \"all\" to receive an array of all supported currencies.
                Margin result = apiInstance.UserGetMargin(currency);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling UserApi.UserGetMargin: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currency** | **string**|  | [optional] [default to XBt]

### Return type

[**Margin**](Margin.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **UserGetWallet**
> Wallet UserGetWallet (string currency = null)

Get your current wallet information.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class UserGetWalletExample
    {
        public void main()
        {
            
            var apiInstance = new UserApi();
            var currency = currency_example;  // string |  (optional)  (default to XBt)

            try
            {
                // Get your current wallet information.
                Wallet result = apiInstance.UserGetWallet(currency);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling UserApi.UserGetWallet: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currency** | **string**|  | [optional] [default to XBt]

### Return type

[**Wallet**](Wallet.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **UserGetWalletHistory**
> List<Transaction> UserGetWalletHistory (string currency = null)

Get a history of all of your wallet transactions (deposits, withdrawals, PNL).

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class UserGetWalletHistoryExample
    {
        public void main()
        {
            
            var apiInstance = new UserApi();
            var currency = currency_example;  // string |  (optional)  (default to XBt)

            try
            {
                // Get a history of all of your wallet transactions (deposits, withdrawals, PNL).
                List&lt;Transaction&gt; result = apiInstance.UserGetWalletHistory(currency);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling UserApi.UserGetWalletHistory: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currency** | **string**|  | [optional] [default to XBt]

### Return type

[**List<Transaction>**](Transaction.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **UserGetWalletSummary**
> List<Transaction> UserGetWalletSummary (string currency = null)

Get a summary of all of your wallet transactions (deposits, withdrawals, PNL).

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class UserGetWalletSummaryExample
    {
        public void main()
        {
            
            var apiInstance = new UserApi();
            var currency = currency_example;  // string |  (optional)  (default to XBt)

            try
            {
                // Get a summary of all of your wallet transactions (deposits, withdrawals, PNL).
                List&lt;Transaction&gt; result = apiInstance.UserGetWalletSummary(currency);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling UserApi.UserGetWalletSummary: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currency** | **string**|  | [optional] [default to XBt]

### Return type

[**List<Transaction>**](Transaction.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **UserLogout**
> void UserLogout ()

Log out of BitMEX.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class UserLogoutExample
    {
        public void main()
        {
            
            var apiInstance = new UserApi();

            try
            {
                // Log out of BitMEX.
                apiInstance.UserLogout();
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling UserApi.UserLogout: " + e.Message );
            }
        }
    }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **UserLogoutAll**
> double? UserLogoutAll ()

Log all systems out of BitMEX. This will revoke all of your account's access tokens, logging you out on all devices.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class UserLogoutAllExample
    {
        public void main()
        {
            
            var apiInstance = new UserApi();

            try
            {
                // Log all systems out of BitMEX. This will revoke all of your account's access tokens, logging you out on all devices.
                double? result = apiInstance.UserLogoutAll();
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling UserApi.UserLogoutAll: " + e.Message );
            }
        }
    }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**double?**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **UserRequestEnableTFA**
> bool? UserRequestEnableTFA (string type = null)

Get Google Authenticator secret key for setting up two-factor auth. Fails if already enabled. Use /confirmEnableTFA for Yubikeys.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class UserRequestEnableTFAExample
    {
        public void main()
        {
            
            var apiInstance = new UserApi();
            var type = type_example;  // string | Two-factor auth type. Supported types: 'GA' (Google Authenticator) (optional) 

            try
            {
                // Get Google Authenticator secret key for setting up two-factor auth. Fails if already enabled. Use /confirmEnableTFA for Yubikeys.
                bool? result = apiInstance.UserRequestEnableTFA(type);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling UserApi.UserRequestEnableTFA: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **string**| Two-factor auth type. Supported types: &#39;GA&#39; (Google Authenticator) | [optional] 

### Return type

**bool?**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **UserRequestWithdrawal**
> Transaction UserRequestWithdrawal (string currency, decimal? amount, string address, string otpToken = null, double? fee = null)

Request a withdrawal to an external wallet.

This will send a confirmation email to the email address on record, unless requested via an API Key with the `withdraw` permission.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class UserRequestWithdrawalExample
    {
        public void main()
        {
            
            var apiInstance = new UserApi();
            var currency = currency_example;  // string | Currency you're withdrawing. Options: `XBt` (default to XBt)
            var amount = 3.4;  // decimal? | Amount of withdrawal currency.
            var address = address_example;  // string | Destination Address.
            var otpToken = otpToken_example;  // string | 2FA token. Required if 2FA is enabled on your account. (optional) 
            var fee = 1.2;  // double? | Network fee for Bitcoin withdrawals. If not specified, a default value will be calculated based on Bitcoin network conditions. You will have a chance to confirm this via email. (optional) 

            try
            {
                // Request a withdrawal to an external wallet.
                Transaction result = apiInstance.UserRequestWithdrawal(currency, amount, address, otpToken, fee);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling UserApi.UserRequestWithdrawal: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currency** | **string**| Currency you&#39;re withdrawing. Options: &#x60;XBt&#x60; | [default to XBt]
 **amount** | **decimal?**| Amount of withdrawal currency. | 
 **address** | **string**| Destination Address. | 
 **otpToken** | **string**| 2FA token. Required if 2FA is enabled on your account. | [optional] 
 **fee** | **double?**| Network fee for Bitcoin withdrawals. If not specified, a default value will be calculated based on Bitcoin network conditions. You will have a chance to confirm this via email. | [optional] 

### Return type

[**Transaction**](Transaction.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **UserSavePreferences**
> User UserSavePreferences (string prefs, bool? overwrite = null)

Save user preferences.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class UserSavePreferencesExample
    {
        public void main()
        {
            
            var apiInstance = new UserApi();
            var prefs = prefs_example;  // string | 
            var overwrite = true;  // bool? | If true, will overwrite all existing preferences. (optional)  (default to false)

            try
            {
                // Save user preferences.
                User result = apiInstance.UserSavePreferences(prefs, overwrite);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling UserApi.UserSavePreferences: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **prefs** | **string**|  | 
 **overwrite** | **bool?**| If true, will overwrite all existing preferences. | [optional] [default to false]

### Return type

[**User**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **UserUpdate**
> User UserUpdate (string firstname = null, string lastname = null, string oldPassword = null, string newPassword = null, string newPasswordConfirm = null, string username = null, string country = null, string pgpPubKey = null)

Update your password, name, and other attributes.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class UserUpdateExample
    {
        public void main()
        {
            
            var apiInstance = new UserApi();
            var firstname = firstname_example;  // string |  (optional) 
            var lastname = lastname_example;  // string |  (optional) 
            var oldPassword = oldPassword_example;  // string |  (optional) 
            var newPassword = newPassword_example;  // string |  (optional) 
            var newPasswordConfirm = newPasswordConfirm_example;  // string |  (optional) 
            var username = username_example;  // string | Username can only be set once. To reset, email support. (optional) 
            var country = country_example;  // string | Country of residence. (optional) 
            var pgpPubKey = pgpPubKey_example;  // string | PGP Public Key. If specified, automated emails will be sentwith this key. (optional) 

            try
            {
                // Update your password, name, and other attributes.
                User result = apiInstance.UserUpdate(firstname, lastname, oldPassword, newPassword, newPasswordConfirm, username, country, pgpPubKey);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling UserApi.UserUpdate: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **firstname** | **string**|  | [optional] 
 **lastname** | **string**|  | [optional] 
 **oldPassword** | **string**|  | [optional] 
 **newPassword** | **string**|  | [optional] 
 **newPasswordConfirm** | **string**|  | [optional] 
 **username** | **string**| Username can only be set once. To reset, email support. | [optional] 
 **country** | **string**| Country of residence. | [optional] 
 **pgpPubKey** | **string**| PGP Public Key. If specified, automated emails will be sentwith this key. | [optional] 

### Return type

[**User**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

