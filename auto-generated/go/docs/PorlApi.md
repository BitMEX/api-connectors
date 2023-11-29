# \PorlApi

All URIs are relative to *https://www.bitmex.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**PorlGetNonce**](PorlApi.md#PorlGetNonce) | **Get** /porl/nonce | Get your Proof of Reserves nonce and data.
[**PorlGetSnapshots**](PorlApi.md#PorlGetSnapshots) | **Get** /porl/snapshots | Get Proof of Reserves historical snapshots


# **PorlGetNonce**
> Porl PorlGetNonce(ctx, )
Get your Proof of Reserves nonce and data.

## Proof of Reserves Nonce  This endpoint will return the nonce and associated data needed to validate BitMEX reserves data.  <! TODO link to docs, GitHub, etc > 

### Required Parameters
This endpoint does not need any parameter.

### Return type

[**Porl**](Porl.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PorlGetSnapshots**
> []XAny PorlGetSnapshots(ctx, )
Get Proof of Reserves historical snapshots

### Required Parameters
This endpoint does not need any parameter.

### Return type

[**[]XAny**](x-any.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

