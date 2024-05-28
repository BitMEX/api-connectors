# IO.Swagger.Api.PositionApi

All URIs are relative to *https://www.bitmex.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**PositionGet**](PositionApi.md#positionget) | **GET** /position | Get your positions.
[**PositionIsolateMargin**](PositionApi.md#positionisolatemargin) | **POST** /position/isolate | Enable isolated margin or cross margin per-position.
[**PositionTransferIsolatedMargin**](PositionApi.md#positiontransferisolatedmargin) | **POST** /position/transferMargin | Transfer equity in or out of a position.
[**PositionUpdateLeverage**](PositionApi.md#positionupdateleverage) | **POST** /position/leverage | Choose leverage for a position.
[**PositionUpdateRiskLimit**](PositionApi.md#positionupdaterisklimit) | **POST** /position/riskLimit | Update your risk limit.


<a name="positionget"></a>
# **PositionGet**
> List<Position> PositionGet (string filter = null, string columns = null, decimal? count = null)

Get your positions.

This endpoint is used for retrieving position information. The fields largely follow the [FIX spec](http://www.onixs.biz/fix-dictionary/5.0.SP2/msgType_AP_6580.html) definitions. Some selected fields are explained in more detail below.  The fields _account_, _symbol_, _currency_ are unique to each position and form its key.  Spot trading symbols returns a subset of the position fields, mainly the open order aggregates.  - **account**: Your unique account ID. - **symbol**: The contract for this position. - **currency**: The margin currency for this position. - **underlying**: Meta data of the _symbol_. - **quoteCurrency**: Meta data of the _symbol_, All prices are in the _quoteCurrency_ - **commission**: The maximum of the maker, taker, and settlement fee. - **initMarginReq**: The initial margin requirement. This will be at least the symbol's default initial maintenance margin, but can be higher if you choose lower leverage. - **maintMarginReq**: The maintenance margin requirement. This will be at least the symbol's default maintenance maintenance margin, but can be higher if you choose a higher risk limit. - **riskLimit**: This is a function of your _maintMarginReq_. - **leverage**: 1 / initMarginReq. - **crossMargin**: True/false depending on whether you set cross margin on this position. - **deleveragePercentile**: Indicates where your position is in the ADL queue. - **rebalancedPnl**: The value of realised PNL that has transferred to your wallet for this position. - **prevRealisedPnl**: The value of realised PNL that has transferred to your wallet for this position since the position was closed. - **currentQty**: The current position amount in contracts. - **currentCost**: The current cost of the position in the settlement currency of the symbol (_currency_). - **currentComm**: The current commission of the position in the settlement currency of the symbol (_currency_). - **realisedCost**: The realised cost of this position calculated with regard to average cost accounting. - **unrealisedCost**: _currentCost_ - _realisedCost_. - **grossOpenPremium**: The amount your bidding above the mark price in the settlement currency of the symbol (_currency_). - **markPrice**: The mark price of the symbol in _quoteCurrency_. - **markValue**: The _currentQty_ at the mark price in the settlement currency of the symbol (_currency_). - **homeNotional**: Value of position in units of _underlying_. - **foreignNotional**: Value of position in units of _quoteCurrency_. - **realisedPnl**: The negative of _realisedCost_. - **unrealisedPnl**: _unrealisedGrossPnl_. - **liquidationPrice**: Once markPrice reaches this price, this position will be liquidated. - **bankruptPrice**: Once markPrice reaches this price, this position will have no equity. 

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class PositionGetExample
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

            var apiInstance = new PositionApi();
            var filter = filter_example;  // string | Table filter. For example, send {\"symbol\": \"XBTUSD\"}. (optional) 
            var columns = columns_example;  // string | Which columns to fetch. For example, send [\"columnName\"]. (optional) 
            var count = 8.14;  // decimal? | Number of rows to fetch. (optional) 

            try
            {
                // Get your positions.
                List&lt;Position&gt; result = apiInstance.PositionGet(filter, columns, count);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling PositionApi.PositionGet: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **string**| Table filter. For example, send {\&quot;symbol\&quot;: \&quot;XBTUSD\&quot;}. | [optional] 
 **columns** | **string**| Which columns to fetch. For example, send [\&quot;columnName\&quot;]. | [optional] 
 **count** | **decimal?**| Number of rows to fetch. | [optional] 

### Return type

[**List<Position>**](Position.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="positionisolatemargin"></a>
# **PositionIsolateMargin**
> Position PositionIsolateMargin (string symbol, bool? enabled = null)

Enable isolated margin or cross margin per-position.

Users can switch isolate margin per-position. This function allows switching margin isolation (aka fixed margin) on and off.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class PositionIsolateMarginExample
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

            var apiInstance = new PositionApi();
            var symbol = symbol_example;  // string | Position symbol to isolate.
            var enabled = true;  // bool? | True for isolated margin, false for cross margin. (optional)  (default to true)

            try
            {
                // Enable isolated margin or cross margin per-position.
                Position result = apiInstance.PositionIsolateMargin(symbol, enabled);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling PositionApi.PositionIsolateMargin: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **string**| Position symbol to isolate. | 
 **enabled** | **bool?**| True for isolated margin, false for cross margin. | [optional] [default to true]

### Return type

[**Position**](Position.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="positiontransferisolatedmargin"></a>
# **PositionTransferIsolatedMargin**
> Position PositionTransferIsolatedMargin (string symbol, decimal? amount, double? targetAccountId = null)

Transfer equity in or out of a position.

When margin is isolated on a position, use this function to add or remove margin from the position. Note that you cannot remove margin below the initial margin threshold.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class PositionTransferIsolatedMarginExample
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

            var apiInstance = new PositionApi();
            var symbol = symbol_example;  // string | Symbol of position to isolate.
            var amount = 8.14;  // decimal? | Amount to transfer, in Satoshis. May be negative.
            var targetAccountId = 1.2;  // double? | AccountId for the position that the margin would be transfered to, must be a paired account with main user. (optional) 

            try
            {
                // Transfer equity in or out of a position.
                Position result = apiInstance.PositionTransferIsolatedMargin(symbol, amount, targetAccountId);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling PositionApi.PositionTransferIsolatedMargin: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **string**| Symbol of position to isolate. | 
 **amount** | **decimal?**| Amount to transfer, in Satoshis. May be negative. | 
 **targetAccountId** | **double?**| AccountId for the position that the margin would be transfered to, must be a paired account with main user. | [optional] 

### Return type

[**Position**](Position.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="positionupdateleverage"></a>
# **PositionUpdateLeverage**
> Position PositionUpdateLeverage (string symbol, double? leverage, double? targetAccountId = null)

Choose leverage for a position.

Users can choose an isolated leverage. This will automatically enable isolated margin.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class PositionUpdateLeverageExample
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

            var apiInstance = new PositionApi();
            var symbol = symbol_example;  // string | Symbol of position to adjust.
            var leverage = 1.2;  // double? | Leverage value. Send a number between 0.01 and 100 to enable isolated margin with a fixed leverage. Send 0 to enable cross margin.
            var targetAccountId = 1.2;  // double? | AccountId for the position that the leverage would be changed on, must be a paired account with main user. (optional) 

            try
            {
                // Choose leverage for a position.
                Position result = apiInstance.PositionUpdateLeverage(symbol, leverage, targetAccountId);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling PositionApi.PositionUpdateLeverage: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **string**| Symbol of position to adjust. | 
 **leverage** | **double?**| Leverage value. Send a number between 0.01 and 100 to enable isolated margin with a fixed leverage. Send 0 to enable cross margin. | 
 **targetAccountId** | **double?**| AccountId for the position that the leverage would be changed on, must be a paired account with main user. | [optional] 

### Return type

[**Position**](Position.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="positionupdaterisklimit"></a>
# **PositionUpdateRiskLimit**
> Position PositionUpdateRiskLimit (string symbol, decimal? riskLimit, double? targetAccountId = null)

Update your risk limit.

Risk Limits limit the size of positions you can trade at various margin levels. Larger positions require more margin. Please see the Risk Limit documentation for more details.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class PositionUpdateRiskLimitExample
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

            var apiInstance = new PositionApi();
            var symbol = symbol_example;  // string | Symbol of position to update risk limit on.
            var riskLimit = 8.14;  // decimal? | New Risk Limit, in Satoshis.
            var targetAccountId = 1.2;  // double? | AccountId for the position that the risk limit would be updated on, must be a paired account with main user. (optional) 

            try
            {
                // Update your risk limit.
                Position result = apiInstance.PositionUpdateRiskLimit(symbol, riskLimit, targetAccountId);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling PositionApi.PositionUpdateRiskLimit: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **string**| Symbol of position to update risk limit on. | 
 **riskLimit** | **decimal?**| New Risk Limit, in Satoshis. | 
 **targetAccountId** | **double?**| AccountId for the position that the risk limit would be updated on, must be a paired account with main user. | [optional] 

### Return type

[**Position**](Position.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

