# PositionApi

All URIs are relative to *https://www.bitmex.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**positionGet**](PositionApi.md#positionGet) | **GET** /position | Get your positions.
[**positionIsolateMargin**](PositionApi.md#positionIsolateMargin) | **POST** /position/isolate | Enable isolated margin or cross margin per-position.
[**positionTransferIsolatedMargin**](PositionApi.md#positionTransferIsolatedMargin) | **POST** /position/transferMargin | Transfer equity in or out of a position.
[**positionUpdateLeverage**](PositionApi.md#positionUpdateLeverage) | **POST** /position/leverage | Choose leverage for a position.
[**positionUpdateRiskLimit**](PositionApi.md#positionUpdateRiskLimit) | **POST** /position/riskLimit | Update your risk limit.


<a name="positionGet"></a>
# **positionGet**
> List&lt;Position&gt; positionGet(filter, columns, count)

Get your positions.

This endpoint is used for retrieving position information. The fields largely follow the [FIX spec](http://www.onixs.biz/fix-dictionary/5.0.SP2/msgType_AP_6580.html) definitions. Some selected fields are explained in more detail below.  The fields _account_, _symbol_, _currency_ are unique to each position and form its key.  Spot trading symbols returns a subset of the position fields, mainly the open order aggregates.  - **account**: Your unique account ID. - **symbol**: The contract for this position. - **currency**: The margin currency for this position. - **underlying**: Meta data of the _symbol_. - **quoteCurrency**: Meta data of the _symbol_, All prices are in the _quoteCurrency_ - **commission**: The maximum of the maker, taker, and settlement fee. - **initMarginReq**: The initial margin requirement. This will be at least the symbol&#39;s default initial maintenance margin, but can be higher if you choose lower leverage. - **maintMarginReq**: The maintenance margin requirement. This will be at least the symbol&#39;s default maintenance maintenance margin, but can be higher if you choose a higher risk limit. - **riskLimit**: This is a function of your _maintMarginReq_. - **leverage**: 1 / initMarginReq. - **crossMargin**: True/false depending on whether you set cross margin on this position. - **deleveragePercentile**: Indicates where your position is in the ADL queue. - **rebalancedPnl**: The value of realised PNL that has transferred to your wallet for this position. - **prevRealisedPnl**: The value of realised PNL that has transferred to your wallet for this position since the position was closed. - **currentQty**: The current position amount in contracts. - **currentCost**: The current cost of the position in the settlement currency of the symbol (_currency_). - **currentComm**: The current commission of the position in the settlement currency of the symbol (_currency_). - **realisedCost**: The realised cost of this position calculated with regard to average cost accounting. - **unrealisedCost**: _currentCost_ - _realisedCost_. - **grossOpenPremium**: The amount your bidding above the mark price in the settlement currency of the symbol (_currency_). - **markPrice**: The mark price of the symbol in _quoteCurrency_. - **markValue**: The _currentQty_ at the mark price in the settlement currency of the symbol (_currency_). - **homeNotional**: Value of position in units of _underlying_. - **foreignNotional**: Value of position in units of _quoteCurrency_. - **realisedPnl**: The negative of _realisedCost_. - **unrealisedPnl**: _unrealisedGrossPnl_. - **liquidationPrice**: Once markPrice reaches this price, this position will be liquidated. - **bankruptPrice**: Once markPrice reaches this price, this position will have no equity. 

### Example
```java
// Import classes:
//import io.swagger.client.api.PositionApi;

PositionApi apiInstance = new PositionApi();
String filter = "filter_example"; // String | Table filter. For example, send {\"symbol\": \"XBTUSD\"}.
String columns = "columns_example"; // String | Which columns to fetch. For example, send [\"columnName\"].
BigDecimal count = new BigDecimal(); // BigDecimal | Number of rows to fetch.
try {
    List<Position> result = apiInstance.positionGet(filter, columns, count);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PositionApi#positionGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **String**| Table filter. For example, send {\&quot;symbol\&quot;: \&quot;XBTUSD\&quot;}. | [optional]
 **columns** | **String**| Which columns to fetch. For example, send [\&quot;columnName\&quot;]. | [optional]
 **count** | **BigDecimal**| Number of rows to fetch. | [optional]

### Return type

[**List&lt;Position&gt;**](Position.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="positionIsolateMargin"></a>
# **positionIsolateMargin**
> Position positionIsolateMargin(symbol, enabled)

Enable isolated margin or cross margin per-position.

Users can switch isolate margin per-position. This function allows switching margin isolation (aka fixed margin) on and off.

### Example
```java
// Import classes:
//import io.swagger.client.api.PositionApi;

PositionApi apiInstance = new PositionApi();
String symbol = "symbol_example"; // String | Position symbol to isolate.
Boolean enabled = true; // Boolean | True for isolated margin, false for cross margin.
try {
    Position result = apiInstance.positionIsolateMargin(symbol, enabled);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PositionApi#positionIsolateMargin");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **String**| Position symbol to isolate. |
 **enabled** | **Boolean**| True for isolated margin, false for cross margin. | [optional] [default to true]

### Return type

[**Position**](Position.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="positionTransferIsolatedMargin"></a>
# **positionTransferIsolatedMargin**
> Position positionTransferIsolatedMargin(symbol, amount, targetAccountId)

Transfer equity in or out of a position.

When margin is isolated on a position, use this function to add or remove margin from the position. Note that you cannot remove margin below the initial margin threshold.

### Example
```java
// Import classes:
//import io.swagger.client.api.PositionApi;

PositionApi apiInstance = new PositionApi();
String symbol = "symbol_example"; // String | Symbol of position to isolate.
BigDecimal amount = new BigDecimal(); // BigDecimal | Amount to transfer, in Satoshis. May be negative.
Double targetAccountId = 3.4D; // Double | AccountId for the position that the margin would be transfered to, must be a paired account with main user.
try {
    Position result = apiInstance.positionTransferIsolatedMargin(symbol, amount, targetAccountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PositionApi#positionTransferIsolatedMargin");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **String**| Symbol of position to isolate. |
 **amount** | **BigDecimal**| Amount to transfer, in Satoshis. May be negative. |
 **targetAccountId** | **Double**| AccountId for the position that the margin would be transfered to, must be a paired account with main user. | [optional]

### Return type

[**Position**](Position.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="positionUpdateLeverage"></a>
# **positionUpdateLeverage**
> Position positionUpdateLeverage(symbol, leverage, targetAccountId)

Choose leverage for a position.

Users can choose an isolated leverage. This will automatically enable isolated margin.

### Example
```java
// Import classes:
//import io.swagger.client.api.PositionApi;

PositionApi apiInstance = new PositionApi();
String symbol = "symbol_example"; // String | Symbol of position to adjust.
Double leverage = 3.4D; // Double | Leverage value. Send a number between 0.01 and 100 to enable isolated margin with a fixed leverage. Send 0 to enable cross margin.
Double targetAccountId = 3.4D; // Double | AccountId for the position that the leverage would be changed on, must be a paired account with main user.
try {
    Position result = apiInstance.positionUpdateLeverage(symbol, leverage, targetAccountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PositionApi#positionUpdateLeverage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **String**| Symbol of position to adjust. |
 **leverage** | **Double**| Leverage value. Send a number between 0.01 and 100 to enable isolated margin with a fixed leverage. Send 0 to enable cross margin. |
 **targetAccountId** | **Double**| AccountId for the position that the leverage would be changed on, must be a paired account with main user. | [optional]

### Return type

[**Position**](Position.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="positionUpdateRiskLimit"></a>
# **positionUpdateRiskLimit**
> Position positionUpdateRiskLimit(symbol, riskLimit, targetAccountId)

Update your risk limit.

Risk Limits limit the size of positions you can trade at various margin levels. Larger positions require more margin. Please see the Risk Limit documentation for more details.

### Example
```java
// Import classes:
//import io.swagger.client.api.PositionApi;

PositionApi apiInstance = new PositionApi();
String symbol = "symbol_example"; // String | Symbol of position to update risk limit on.
BigDecimal riskLimit = new BigDecimal(); // BigDecimal | New Risk Limit, in Satoshis.
Double targetAccountId = 3.4D; // Double | AccountId for the position that the risk limit would be updated on, must be a paired account with main user.
try {
    Position result = apiInstance.positionUpdateRiskLimit(symbol, riskLimit, targetAccountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PositionApi#positionUpdateRiskLimit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **String**| Symbol of position to update risk limit on. |
 **riskLimit** | **BigDecimal**| New Risk Limit, in Satoshis. |
 **targetAccountId** | **Double**| AccountId for the position that the risk limit would be updated on, must be a paired account with main user. | [optional]

### Return type

[**Position**](Position.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

