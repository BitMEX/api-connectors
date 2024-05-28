# \AddressApi

All URIs are relative to *https://www.bitmex.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**AddressGet**](AddressApi.md#AddressGet) | **Get** /address | Get your addresses.
[**AddressNew**](AddressApi.md#AddressNew) | **Post** /address | Creates a new saved address.


# **AddressGet**
> []Address AddressGet(ctx, )
Get your addresses.

### Required Parameters
This endpoint does not need any parameter.

### Return type

[**[]Address**](Address.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **AddressNew**
> Address AddressNew(ctx, currency, network, address, name, optional)
Creates a new saved address.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **currency** | **string**| Currency of the address. Options: &#x60;XBt&#x60;, &#x60;USDt&#x60; | 
  **network** | **string**| Selected network. | 
  **address** | **string**| Destination Address. | 
  **name** | **string**| Name of the entry, eg. &#39;Hardware wallet&#39;. | 
 **optional** | ***AddressApiAddressNewOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a AddressApiAddressNewOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------




 **note** | **optional.String**| Optional annotation. | 
 **skipConfirm** | **optional.Bool**| Skip e-mail confirmations for transfers to this address. Will require an email confirmation after creation. | [default to false]
 **skip2FA** | **optional.Bool**| Skip 2FA confirmations for transfers to this address. Will require an email confirmation after creation. | [default to false]
 **memo** | **optional.String**| Destination Memo. | 

### Return type

[**Address**](Address.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

