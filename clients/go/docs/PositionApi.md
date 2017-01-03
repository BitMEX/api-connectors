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
> []Position PositionGet($filter, $columns, $count)

Get your positions.

See <a href=\"http://www.onixs.biz/fix-dictionary/5.0.SP2/msgType_AP_6580.html\">the FIX Spec</a> for explanations of these fields.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **string**| Table filter. For example, send {\&quot;symbol\&quot;: \&quot;XBT24H\&quot;}. | [optional] 
 **columns** | **string**| Which columns to fetch. For example, send [\&quot;columnName\&quot;]. | [optional] 
 **count** | **float32**| Number of rows to fetch. | [optional] 

### Return type

[**[]Position**](Position.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PositionIsolateMargin**
> Position PositionIsolateMargin($symbol, $enabled)

Enable isolated margin or cross margin per-position.

On Speculative (DPE-Enabled) contracts, users can switch isolate margin per-position. This function allows switching margin isolation (aka fixed margin) on and off.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **string**| Position symbol to isolate. | 
 **enabled** | **bool**| True for isolated margin, false for cross margin. | [optional] [default to true]

### Return type

[**Position**](Position.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PositionTransferIsolatedMargin**
> Position PositionTransferIsolatedMargin($symbol, $amount)

Transfer equity in or out of a position.

When margin is isolated on a position, use this function to add or remove margin from the position. Note that you cannot remove margin below the initial margin threshold.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **string**| Symbol of position to isolate. | 
 **amount** | **float32**| Amount to transfer, in Satoshis. May be negative. | 

### Return type

[**Position**](Position.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PositionUpdateLeverage**
> Position PositionUpdateLeverage($symbol, $leverage)

Choose leverage for a position.

On Speculative (DPE-Enabled) contracts, users can choose an isolated leverage. This will automatically enable isolated margin.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **string**| Symbol of position to adjust. | 
 **leverage** | **float64**| Leverage value. Send a number between 0.01 and 100 to enable isolated margin with a fixed leverage. Send 0 to enable cross margin. | 

### Return type

[**Position**](Position.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PositionUpdateRiskLimit**
> Position PositionUpdateRiskLimit($symbol, $riskLimit)

Update your risk limit.

Risk Limits limit the size of positions you can trade at various margin levels. Larger positions require more margin. Please see the Risk Limit documentation for more details.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **string**| Symbol of position to isolate. | 
 **riskLimit** | **float32**| New Risk Limit, in Satoshis. | 

### Return type

[**Position**](Position.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

