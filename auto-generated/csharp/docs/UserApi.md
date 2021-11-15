# IO.Swagger.Api.UserApi

All URIs are relative to *https://www.bitmex.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**UserCancelWithdrawal**](UserApi.md#usercancelwithdrawal) | **POST** /user/cancelWithdrawal | Cancel a withdrawal.
[**UserCheckReferralCode**](UserApi.md#usercheckreferralcode) | **GET** /user/checkReferralCode | Check if a referral code is valid.
[**UserCommunicationToken**](UserApi.md#usercommunicationtoken) | **POST** /user/communicationToken | Register your communication token for mobile clients
[**UserConfirm**](UserApi.md#userconfirm) | **POST** /user/confirmEmail | Confirm your email address with a token.
[**UserConfirmWithdrawal**](UserApi.md#userconfirmwithdrawal) | **POST** /user/confirmWithdrawal | Confirm a withdrawal.
[**UserGet**](UserApi.md#userget) | **GET** /user | Get your user model.
[**UserGetAffiliateStatus**](UserApi.md#usergetaffiliatestatus) | **GET** /user/affiliateStatus | Get your current affiliate/referral status.
[**UserGetCommission**](UserApi.md#usergetcommission) | **GET** /user/commission | Get your account&#39;s commission status.
[**UserGetDepositAddress**](UserApi.md#usergetdepositaddress) | **GET** /user/depositAddress | Get a deposit address.
[**UserGetExecutionHistory**](UserApi.md#usergetexecutionhistory) | **GET** /user/executionHistory | Get the execution history by day.
[**UserGetMargin**](UserApi.md#usergetmargin) | **GET** /user/margin | Get your account&#39;s margin status. Send a currency of \&quot;all\&quot; to receive an array of all supported currencies.
[**UserGetQuoteFillRatio**](UserApi.md#usergetquotefillratio) | **GET** /user/quoteFillRatio | Get 7 days worth of Quote Fill Ratio statistics.
[**UserGetQuoteValueRatio**](UserApi.md#usergetquotevalueratio) | **GET** /user/quoteValueRatio | Get Quote Value Ratio statistics over the last 3 days
[**UserGetTradingVolume**](UserApi.md#usergettradingvolume) | **GET** /user/tradingVolume | Get your 30 days USD average trading volume
[**UserGetWallet**](UserApi.md#usergetwallet) | **GET** /user/wallet | Get your current wallet information.
[**UserGetWalletHistory**](UserApi.md#usergetwallethistory) | **GET** /user/walletHistory | Get a history of all of your wallet transactions (deposits, withdrawals, PNL).
[**UserGetWalletSummary**](UserApi.md#usergetwalletsummary) | **GET** /user/walletSummary | Get a summary of all of your wallet transactions (deposits, withdrawals, PNL).
[**UserLogout**](UserApi.md#userlogout) | **POST** /user/logout | Log out of BitMEX.
[**UserMinWithdrawalFee**](UserApi.md#userminwithdrawalfee) | **GET** /user/minWithdrawalFee | Get the minimum, maximum, and recommended withdrawal fees for a currency.
[**UserRequestWithdrawal**](UserApi.md#userrequestwithdrawal) | **POST** /user/requestWithdrawal | Request a withdrawal to an external wallet.
[**UserSavePreferences**](UserApi.md#usersavepreferences) | **POST** /user/preferences | Save user preferences.


<a name="usercancelwithdrawal"></a>
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

<a name="usercheckreferralcode"></a>
# **UserCheckReferralCode**
> double? UserCheckReferralCode (string referralCode = null)

Check if a referral code is valid.

If the code is valid, responds with the referral code's discount (e.g. `0.1` for 10%). Otherwise, will return a 404 or 451 if invalid.

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

<a name="usercommunicationtoken"></a>
# **UserCommunicationToken**
> List<CommunicationToken> UserCommunicationToken (string token, string platformAgent)

Register your communication token for mobile clients

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class UserCommunicationTokenExample
    {
        public void main()
        {
            // Configure API key authorization: apiExpires
            Configuration.Default.AddApiKey("api-expires", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.AddApiKeyPrefix("api-expires", "Bearer");
            // Configure API key authorization: apiKey
            Configuration.Default.AddApiKey("api-key", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.AddApiKeyPrefix("api-key", "Bearer");
            // Configure API key authorization: apiSignature
            Configuration.Default.AddApiKey("api-signature", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.AddApiKeyPrefix("api-signature", "Bearer");

            var apiInstance = new UserApi();
            var token = token_example;  // string | 
            var platformAgent = platformAgent_example;  // string | 

            try
            {
                // Register your communication token for mobile clients
                List&lt;CommunicationToken&gt; result = apiInstance.UserCommunicationToken(token, platformAgent);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling UserApi.UserCommunicationToken: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string**|  | 
 **platformAgent** | **string**|  | 

### Return type

[**List<CommunicationToken>**](CommunicationToken.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="userconfirm"></a>
# **UserConfirm**
> AccessToken UserConfirm (string token)

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
    public class UserConfirmExample
    {
        public void main()
        {
            var apiInstance = new UserApi();
            var token = token_example;  // string | 

            try
            {
                // Confirm your email address with a token.
                AccessToken result = apiInstance.UserConfirm(token);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling UserApi.UserConfirm: " + e.Message );
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

<a name="userconfirmwithdrawal"></a>
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

<a name="userget"></a>
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
            // Configure API key authorization: apiExpires
            Configuration.Default.AddApiKey("api-expires", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.AddApiKeyPrefix("api-expires", "Bearer");
            // Configure API key authorization: apiKey
            Configuration.Default.AddApiKey("api-key", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.AddApiKeyPrefix("api-key", "Bearer");
            // Configure API key authorization: apiSignature
            Configuration.Default.AddApiKey("api-signature", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.AddApiKeyPrefix("api-signature", "Bearer");

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

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="usergetaffiliatestatus"></a>
# **UserGetAffiliateStatus**
> Affiliate UserGetAffiliateStatus (string currency = null)

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
            // Configure API key authorization: apiExpires
            Configuration.Default.AddApiKey("api-expires", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.AddApiKeyPrefix("api-expires", "Bearer");
            // Configure API key authorization: apiKey
            Configuration.Default.AddApiKey("api-key", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.AddApiKeyPrefix("api-key", "Bearer");
            // Configure API key authorization: apiSignature
            Configuration.Default.AddApiKey("api-signature", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.AddApiKeyPrefix("api-signature", "Bearer");

            var apiInstance = new UserApi();
            var currency = currency_example;  // string | Options: `XBt`, `USDt`, `all` (optional)  (default to XBt)

            try
            {
                // Get your current affiliate/referral status.
                Affiliate result = apiInstance.UserGetAffiliateStatus(currency);
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currency** | **string**| Options: &#x60;XBt&#x60;, &#x60;USDt&#x60;, &#x60;all&#x60; | [optional] [default to XBt]

### Return type

[**Affiliate**](Affiliate.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="usergetcommission"></a>
# **UserGetCommission**
> UserCommissionsBySymbol UserGetCommission ()

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
            // Configure API key authorization: apiExpires
            Configuration.Default.AddApiKey("api-expires", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.AddApiKeyPrefix("api-expires", "Bearer");
            // Configure API key authorization: apiKey
            Configuration.Default.AddApiKey("api-key", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.AddApiKeyPrefix("api-key", "Bearer");
            // Configure API key authorization: apiSignature
            Configuration.Default.AddApiKey("api-signature", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.AddApiKeyPrefix("api-signature", "Bearer");

            var apiInstance = new UserApi();

            try
            {
                // Get your account's commission status.
                UserCommissionsBySymbol result = apiInstance.UserGetCommission();
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

[**UserCommissionsBySymbol**](UserCommissionsBySymbol.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="usergetdepositaddress"></a>
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
            // Configure API key authorization: apiExpires
            Configuration.Default.AddApiKey("api-expires", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.AddApiKeyPrefix("api-expires", "Bearer");
            // Configure API key authorization: apiKey
            Configuration.Default.AddApiKey("api-key", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.AddApiKeyPrefix("api-key", "Bearer");
            // Configure API key authorization: apiSignature
            Configuration.Default.AddApiKey("api-signature", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.AddApiKeyPrefix("api-signature", "Bearer");

            var apiInstance = new UserApi();
            var currency = currency_example;  // string | Options: `XBt`, `USDt` (optional)  (default to XBt)

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
 **currency** | **string**| Options: &#x60;XBt&#x60;, &#x60;USDt&#x60; | [optional] [default to XBt]

### Return type

**string**

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="usergetexecutionhistory"></a>
# **UserGetExecutionHistory**
> Object UserGetExecutionHistory (string symbol, DateTime? timestamp)

Get the execution history by day.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class UserGetExecutionHistoryExample
    {
        public void main()
        {
            // Configure API key authorization: apiExpires
            Configuration.Default.AddApiKey("api-expires", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.AddApiKeyPrefix("api-expires", "Bearer");
            // Configure API key authorization: apiKey
            Configuration.Default.AddApiKey("api-key", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.AddApiKeyPrefix("api-key", "Bearer");
            // Configure API key authorization: apiSignature
            Configuration.Default.AddApiKey("api-signature", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.AddApiKeyPrefix("api-signature", "Bearer");

            var apiInstance = new UserApi();
            var symbol = symbol_example;  // string |  (default to XBTUSD)
            var timestamp = 2013-10-20T19:20:30+01:00;  // DateTime? |  (default to 2017-02-13T12:00:00.000Z)

            try
            {
                // Get the execution history by day.
                Object result = apiInstance.UserGetExecutionHistory(symbol, timestamp);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling UserApi.UserGetExecutionHistory: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **string**|  | [default to XBTUSD]
 **timestamp** | **DateTime?**|  | [default to 2017-02-13T12:00:00.000Z]

### Return type

**Object**

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="usergetmargin"></a>
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
            // Configure API key authorization: apiExpires
            Configuration.Default.AddApiKey("api-expires", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.AddApiKeyPrefix("api-expires", "Bearer");
            // Configure API key authorization: apiKey
            Configuration.Default.AddApiKey("api-key", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.AddApiKeyPrefix("api-key", "Bearer");
            // Configure API key authorization: apiSignature
            Configuration.Default.AddApiKey("api-signature", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.AddApiKeyPrefix("api-signature", "Bearer");

            var apiInstance = new UserApi();
            var currency = currency_example;  // string | Options: `XBt`, `USDt`, `all` (optional)  (default to XBt)

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
 **currency** | **string**| Options: &#x60;XBt&#x60;, &#x60;USDt&#x60;, &#x60;all&#x60; | [optional] [default to XBt]

### Return type

[**Margin**](Margin.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="usergetquotefillratio"></a>
# **UserGetQuoteFillRatio**
> QuoteFillRatio UserGetQuoteFillRatio ()

Get 7 days worth of Quote Fill Ratio statistics.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class UserGetQuoteFillRatioExample
    {
        public void main()
        {
            // Configure API key authorization: apiExpires
            Configuration.Default.AddApiKey("api-expires", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.AddApiKeyPrefix("api-expires", "Bearer");
            // Configure API key authorization: apiKey
            Configuration.Default.AddApiKey("api-key", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.AddApiKeyPrefix("api-key", "Bearer");
            // Configure API key authorization: apiSignature
            Configuration.Default.AddApiKey("api-signature", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.AddApiKeyPrefix("api-signature", "Bearer");

            var apiInstance = new UserApi();

            try
            {
                // Get 7 days worth of Quote Fill Ratio statistics.
                QuoteFillRatio result = apiInstance.UserGetQuoteFillRatio();
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling UserApi.UserGetQuoteFillRatio: " + e.Message );
            }
        }
    }
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="usergetquotevalueratio"></a>
# **UserGetQuoteValueRatio**
> QuoteValueRatio UserGetQuoteValueRatio ()

Get Quote Value Ratio statistics over the last 3 days

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class UserGetQuoteValueRatioExample
    {
        public void main()
        {
            // Configure API key authorization: apiExpires
            Configuration.Default.AddApiKey("api-expires", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.AddApiKeyPrefix("api-expires", "Bearer");
            // Configure API key authorization: apiKey
            Configuration.Default.AddApiKey("api-key", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.AddApiKeyPrefix("api-key", "Bearer");
            // Configure API key authorization: apiSignature
            Configuration.Default.AddApiKey("api-signature", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.AddApiKeyPrefix("api-signature", "Bearer");

            var apiInstance = new UserApi();

            try
            {
                // Get Quote Value Ratio statistics over the last 3 days
                QuoteValueRatio result = apiInstance.UserGetQuoteValueRatio();
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling UserApi.UserGetQuoteValueRatio: " + e.Message );
            }
        }
    }
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="usergettradingvolume"></a>
# **UserGetTradingVolume**
> TradingVolume UserGetTradingVolume ()

Get your 30 days USD average trading volume

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class UserGetTradingVolumeExample
    {
        public void main()
        {
            // Configure API key authorization: apiExpires
            Configuration.Default.AddApiKey("api-expires", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.AddApiKeyPrefix("api-expires", "Bearer");
            // Configure API key authorization: apiKey
            Configuration.Default.AddApiKey("api-key", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.AddApiKeyPrefix("api-key", "Bearer");
            // Configure API key authorization: apiSignature
            Configuration.Default.AddApiKey("api-signature", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.AddApiKeyPrefix("api-signature", "Bearer");

            var apiInstance = new UserApi();

            try
            {
                // Get your 30 days USD average trading volume
                TradingVolume result = apiInstance.UserGetTradingVolume();
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling UserApi.UserGetTradingVolume: " + e.Message );
            }
        }
    }
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="usergetwallet"></a>
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
            // Configure API key authorization: apiExpires
            Configuration.Default.AddApiKey("api-expires", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.AddApiKeyPrefix("api-expires", "Bearer");
            // Configure API key authorization: apiKey
            Configuration.Default.AddApiKey("api-key", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.AddApiKeyPrefix("api-key", "Bearer");
            // Configure API key authorization: apiSignature
            Configuration.Default.AddApiKey("api-signature", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.AddApiKeyPrefix("api-signature", "Bearer");

            var apiInstance = new UserApi();
            var currency = currency_example;  // string | Options: `XBt`, `USDt`, `all` (optional)  (default to XBt)

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
 **currency** | **string**| Options: &#x60;XBt&#x60;, &#x60;USDt&#x60;, &#x60;all&#x60; | [optional] [default to XBt]

### Return type

[**Wallet**](Wallet.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="usergetwallethistory"></a>
# **UserGetWalletHistory**
> List<Transaction> UserGetWalletHistory (string currency = null, double? count = null, double? start = null)

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
            // Configure API key authorization: apiExpires
            Configuration.Default.AddApiKey("api-expires", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.AddApiKeyPrefix("api-expires", "Bearer");
            // Configure API key authorization: apiKey
            Configuration.Default.AddApiKey("api-key", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.AddApiKeyPrefix("api-key", "Bearer");
            // Configure API key authorization: apiSignature
            Configuration.Default.AddApiKey("api-signature", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.AddApiKeyPrefix("api-signature", "Bearer");

            var apiInstance = new UserApi();
            var currency = currency_example;  // string | Options: `XBt`, `USDt`, `all` (optional)  (default to XBt)
            var count = 1.2;  // double? | Number of results to fetch. (optional)  (default to 100)
            var start = 1.2;  // double? | Starting point for results. (optional)  (default to 0)

            try
            {
                // Get a history of all of your wallet transactions (deposits, withdrawals, PNL).
                List&lt;Transaction&gt; result = apiInstance.UserGetWalletHistory(currency, count, start);
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
 **currency** | **string**| Options: &#x60;XBt&#x60;, &#x60;USDt&#x60;, &#x60;all&#x60; | [optional] [default to XBt]
 **count** | **double?**| Number of results to fetch. | [optional] [default to 100]
 **start** | **double?**| Starting point for results. | [optional] [default to 0]

### Return type

[**List<Transaction>**](Transaction.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="usergetwalletsummary"></a>
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
            // Configure API key authorization: apiExpires
            Configuration.Default.AddApiKey("api-expires", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.AddApiKeyPrefix("api-expires", "Bearer");
            // Configure API key authorization: apiKey
            Configuration.Default.AddApiKey("api-key", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.AddApiKeyPrefix("api-key", "Bearer");
            // Configure API key authorization: apiSignature
            Configuration.Default.AddApiKey("api-signature", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.AddApiKeyPrefix("api-signature", "Bearer");

            var apiInstance = new UserApi();
            var currency = currency_example;  // string | Options: `XBt`, `USDt`, `all` (optional)  (default to XBt)

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
 **currency** | **string**| Options: &#x60;XBt&#x60;, &#x60;USDt&#x60;, &#x60;all&#x60; | [optional] [default to XBt]

### Return type

[**List<Transaction>**](Transaction.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="userlogout"></a>
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

<a name="userminwithdrawalfee"></a>
# **UserMinWithdrawalFee**
> Object UserMinWithdrawalFee (string currency = null, double? amount = null)

Get the minimum, maximum, and recommended withdrawal fees for a currency.

This is changed based on network conditions to ensure timely withdrawals. During network congestion, this may be high. The fee is returned in the same currency.  The \"fee\" field is the recommended fee for fast confirmation on the blockchain.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class UserMinWithdrawalFeeExample
    {
        public void main()
        {
            var apiInstance = new UserApi();
            var currency = currency_example;  // string | Options: `XBt`, `USDt` (optional)  (default to XBt)
            var amount = 1.2;  // double? |  (optional) 

            try
            {
                // Get the minimum, maximum, and recommended withdrawal fees for a currency.
                Object result = apiInstance.UserMinWithdrawalFee(currency, amount);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling UserApi.UserMinWithdrawalFee: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currency** | **string**| Options: &#x60;XBt&#x60;, &#x60;USDt&#x60; | [optional] [default to XBt]
 **amount** | **double?**|  | [optional] 

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="userrequestwithdrawal"></a>
# **UserRequestWithdrawal**
> Transaction UserRequestWithdrawal (string currency, decimal? amount, string otpToken = null, string address = null, double? addressId = null, double? targetUserId = null, double? fee = null, string text = null)

Request a withdrawal to an external wallet.

This will send a confirmation email to the email address on record.

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
            // Configure API key authorization: apiExpires
            Configuration.Default.AddApiKey("api-expires", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.AddApiKeyPrefix("api-expires", "Bearer");
            // Configure API key authorization: apiKey
            Configuration.Default.AddApiKey("api-key", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.AddApiKeyPrefix("api-key", "Bearer");
            // Configure API key authorization: apiSignature
            Configuration.Default.AddApiKey("api-signature", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.AddApiKeyPrefix("api-signature", "Bearer");

            var apiInstance = new UserApi();
            var currency = currency_example;  // string | Currency you're withdrawing. Options: `XBt`, `USDt` (default to XBt)
            var amount = 8.14;  // decimal? | Amount of withdrawal currency.
            var otpToken = otpToken_example;  // string | 2FA token. Required for all external withdrawals. (optional) 
            var address = address_example;  // string | Destination Address. One of `address`, `addressId`, `targetUserId` has to be specified. (optional) 
            var addressId = 1.2;  // double? | ID of the Destination Address. One of `address`, `targetUserId`, `targetUserId` has to be specified. (optional) 
            var targetUserId = 1.2;  // double? | ID of the Target User. One of `address`, `addressId`, `targetUserId` has to be specified. (optional) 
            var fee = 1.2;  // double? | Network fee for Bitcoin withdrawals. If not specified, a default value will be calculated based on Bitcoin network conditions. You will have a chance to confirm this via email. (optional) 
            var text = text_example;  // string | Optional annotation, e.g. 'Transfer to home wallet'. (optional) 

            try
            {
                // Request a withdrawal to an external wallet.
                Transaction result = apiInstance.UserRequestWithdrawal(currency, amount, otpToken, address, addressId, targetUserId, fee, text);
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
 **currency** | **string**| Currency you&#39;re withdrawing. Options: &#x60;XBt&#x60;, &#x60;USDt&#x60; | [default to XBt]
 **amount** | **decimal?**| Amount of withdrawal currency. | 
 **otpToken** | **string**| 2FA token. Required for all external withdrawals. | [optional] 
 **address** | **string**| Destination Address. One of &#x60;address&#x60;, &#x60;addressId&#x60;, &#x60;targetUserId&#x60; has to be specified. | [optional] 
 **addressId** | **double?**| ID of the Destination Address. One of &#x60;address&#x60;, &#x60;targetUserId&#x60;, &#x60;targetUserId&#x60; has to be specified. | [optional] 
 **targetUserId** | **double?**| ID of the Target User. One of &#x60;address&#x60;, &#x60;addressId&#x60;, &#x60;targetUserId&#x60; has to be specified. | [optional] 
 **fee** | **double?**| Network fee for Bitcoin withdrawals. If not specified, a default value will be calculated based on Bitcoin network conditions. You will have a chance to confirm this via email. | [optional] 
 **text** | **string**| Optional annotation, e.g. &#39;Transfer to home wallet&#39;. | [optional] 

### Return type

[**Transaction**](Transaction.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="usersavepreferences"></a>
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
            // Configure API key authorization: apiExpires
            Configuration.Default.AddApiKey("api-expires", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.AddApiKeyPrefix("api-expires", "Bearer");
            // Configure API key authorization: apiKey
            Configuration.Default.AddApiKey("api-key", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.AddApiKeyPrefix("api-key", "Bearer");
            // Configure API key authorization: apiSignature
            Configuration.Default.AddApiKey("api-signature", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.AddApiKeyPrefix("api-signature", "Bearer");

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

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

