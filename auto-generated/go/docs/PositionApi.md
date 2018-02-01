# \PositionApi

All URIs are relative to *https://localhost/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**PositionGet**](PositionApi.md#PositionGet) | **Get** /position | Get your positions.
[**PositionIsolateMargin**](PositionApi.md#PositionIsolateMargin) | **Post** /position/isolate | Enable isolated margin or cross margin per-position.
[**PositionTransferIsolatedMargin**](PositionApi.md#PositionTransferIsolatedMargin) | **Post** /position/transferMargin | Transfer equity in or out of a position.
[**PositionUpdateLeverage**](PositionApi.md#PositionUpdateLeverage) | **Post** /position/leverage | Choose leverage for a position.
[**PositionUpdateRiskLimit**](PositionApi.md#PositionUpdateRiskLimit) | **Post** /position/riskLimit | Update your risk limit.


# **PositionGet**
> []Position PositionGet(ctx, ctx, ctx, optional)
Get your positions.

See <a href=\"http://www.onixs.biz/fix-dictionary/5.0.SP2/msgType_AP_6580.html\">the FIX Spec</a> for explanations of these fields.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **string**| Table filter. For example, send {\&quot;symbol\&quot;: \&quot;XBTUSD\&quot;}. | 
 **columns** | **string**| Which columns to fetch. For example, send [\&quot;columnName\&quot;]. | 
 **count** | **float32**| Number of rows to fetch. | 

### Return type

[**[]Position**](Position.md)

### Authorization

[apiKey](../README.md#apiKey), [apiNonce](../README.md#apiNonce), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PositionIsolateMargin**
> Position PositionIsolateMargin(ctx, ctx, ctx, symbol, optional)
Enable isolated margin or cross margin per-position.

Users can switch isolate margin per-position. This function allows switching margin isolation (aka fixed margin) on and off.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **symbol** | **string**| Position symbol to isolate. | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **string**| Position symbol to isolate. | 
 **enabled** | **bool**| True for isolated margin, false for cross margin. | [default to true]

### Return type

[**Position**](Position.md)

### Authorization

[apiKey](../README.md#apiKey), [apiNonce](../README.md#apiNonce), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PositionTransferIsolatedMargin**
> Position PositionTransferIsolatedMargin(ctx, ctx, ctx, symbol, amount)
Transfer equity in or out of a position.

When margin is isolated on a position, use this function to add or remove margin from the position. Note that you cannot remove margin below the initial margin threshold.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **symbol** | **string**| Symbol of position to isolate. | 
  **amount** | **float32**| Amount to transfer, in Satoshis. May be negative. | 

### Return type

[**Position**](Position.md)

### Authorization

[apiKey](../README.md#apiKey), [apiNonce](../README.md#apiNonce), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PositionUpdateLeverage**
> Position PositionUpdateLeverage(ctx, ctx, ctx, symbol, leverage)
Choose leverage for a position.

Users can choose an isolated leverage. This will automatically enable isolated margin.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **symbol** | **string**| Symbol of position to adjust. | 
  **leverage** | **float64**| Leverage value. Send a number between 0.01 and 100 to enable isolated margin with a fixed leverage. Send 0 to enable cross margin. | 

### Return type

[**Position**](Position.md)

### Authorization

[apiKey](../README.md#apiKey), [apiNonce](../README.md#apiNonce), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PositionUpdateRiskLimit**
> Position PositionUpdateRiskLimit(ctx, ctx, ctx, symbol, riskLimit)
Update your risk limit.

Risk Limits limit the size of positions you can trade at various margin levels. Larger positions require more margin. Please see the Risk Limit documentation for more details.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **symbol** | **string**| Symbol of position to isolate. | 
  **riskLimit** | **float32**| New Risk Limit, in Satoshis. | 

### Return type

[**Position**](Position.md)

### Authorization

[apiKey](../README.md#apiKey), [apiNonce](../README.md#apiNonce), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

