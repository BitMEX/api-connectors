# PositionApi

All URIs are relative to *https://localhost/api/v1*

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

See &lt;a href&#x3D;\&quot;http://www.onixs.biz/fix-dictionary/5.0.SP2/msgType_AP_6580.html\&quot;&gt;the FIX Spec&lt;/a&gt; for explanations of these fields.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PositionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

// Configure API key authorization: apiNonce
ApiKeyAuth apiNonce = (ApiKeyAuth) defaultClient.getAuthentication("apiNonce");
apiNonce.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiNonce.setApiKeyPrefix("Token");

// Configure API key authorization: apiSignature
ApiKeyAuth apiSignature = (ApiKeyAuth) defaultClient.getAuthentication("apiSignature");
apiSignature.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiSignature.setApiKeyPrefix("Token");

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

[apiKey](../README.md#apiKey), [apiNonce](../README.md#apiNonce), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="positionIsolateMargin"></a>
# **positionIsolateMargin**
> Position positionIsolateMargin(symbol, enabled)

Enable isolated margin or cross margin per-position.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PositionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

// Configure API key authorization: apiNonce
ApiKeyAuth apiNonce = (ApiKeyAuth) defaultClient.getAuthentication("apiNonce");
apiNonce.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiNonce.setApiKeyPrefix("Token");

// Configure API key authorization: apiSignature
ApiKeyAuth apiSignature = (ApiKeyAuth) defaultClient.getAuthentication("apiSignature");
apiSignature.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiSignature.setApiKeyPrefix("Token");

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

[apiKey](../README.md#apiKey), [apiNonce](../README.md#apiNonce), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="positionTransferIsolatedMargin"></a>
# **positionTransferIsolatedMargin**
> Position positionTransferIsolatedMargin(symbol, amount)

Transfer equity in or out of a position.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PositionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

// Configure API key authorization: apiNonce
ApiKeyAuth apiNonce = (ApiKeyAuth) defaultClient.getAuthentication("apiNonce");
apiNonce.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiNonce.setApiKeyPrefix("Token");

// Configure API key authorization: apiSignature
ApiKeyAuth apiSignature = (ApiKeyAuth) defaultClient.getAuthentication("apiSignature");
apiSignature.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiSignature.setApiKeyPrefix("Token");

PositionApi apiInstance = new PositionApi();
String symbol = "symbol_example"; // String | Symbol of position to isolate.
BigDecimal amount = new BigDecimal(); // BigDecimal | Amount to transfer, in Satoshis. May be negative.
try {
    Position result = apiInstance.positionTransferIsolatedMargin(symbol, amount);
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

### Return type

[**Position**](Position.md)

### Authorization

[apiKey](../README.md#apiKey), [apiNonce](../README.md#apiNonce), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="positionUpdateLeverage"></a>
# **positionUpdateLeverage**
> Position positionUpdateLeverage(symbol, leverage)

Choose leverage for a position.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PositionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

// Configure API key authorization: apiNonce
ApiKeyAuth apiNonce = (ApiKeyAuth) defaultClient.getAuthentication("apiNonce");
apiNonce.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiNonce.setApiKeyPrefix("Token");

// Configure API key authorization: apiSignature
ApiKeyAuth apiSignature = (ApiKeyAuth) defaultClient.getAuthentication("apiSignature");
apiSignature.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiSignature.setApiKeyPrefix("Token");

PositionApi apiInstance = new PositionApi();
String symbol = "symbol_example"; // String | Symbol of position to adjust.
Double leverage = 3.4D; // Double | Leverage value. Send a number between 0.01 and 100 to enable isolated margin with a fixed leverage. Send 0 to enable cross margin.
try {
    Position result = apiInstance.positionUpdateLeverage(symbol, leverage);
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

### Return type

[**Position**](Position.md)

### Authorization

[apiKey](../README.md#apiKey), [apiNonce](../README.md#apiNonce), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="positionUpdateRiskLimit"></a>
# **positionUpdateRiskLimit**
> Position positionUpdateRiskLimit(symbol, riskLimit)

Update your risk limit.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PositionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

// Configure API key authorization: apiNonce
ApiKeyAuth apiNonce = (ApiKeyAuth) defaultClient.getAuthentication("apiNonce");
apiNonce.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiNonce.setApiKeyPrefix("Token");

// Configure API key authorization: apiSignature
ApiKeyAuth apiSignature = (ApiKeyAuth) defaultClient.getAuthentication("apiSignature");
apiSignature.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiSignature.setApiKeyPrefix("Token");

PositionApi apiInstance = new PositionApi();
String symbol = "symbol_example"; // String | Symbol of position to update risk limit on.
BigDecimal riskLimit = new BigDecimal(); // BigDecimal | New Risk Limit, in Satoshis.
try {
    Position result = apiInstance.positionUpdateRiskLimit(symbol, riskLimit);
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

### Return type

[**Position**](Position.md)

### Authorization

[apiKey](../README.md#apiKey), [apiNonce](../README.md#apiNonce), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

