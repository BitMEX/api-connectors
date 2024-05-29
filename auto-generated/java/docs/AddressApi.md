# AddressApi

All URIs are relative to *https://www.bitmex.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addressGet**](AddressApi.md#addressGet) | **GET** /address | Get your addresses.
[**addressNew**](AddressApi.md#addressNew) | **POST** /address | Creates a new saved address.


<a name="addressGet"></a>
# **addressGet**
> List&lt;Address&gt; addressGet()

Get your addresses.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AddressApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiExpires
ApiKeyAuth apiExpires = (ApiKeyAuth) defaultClient.getAuthentication("apiExpires");
apiExpires.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiExpires.setApiKeyPrefix("Token");

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

// Configure API key authorization: apiSignature
ApiKeyAuth apiSignature = (ApiKeyAuth) defaultClient.getAuthentication("apiSignature");
apiSignature.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiSignature.setApiKeyPrefix("Token");

AddressApi apiInstance = new AddressApi();
try {
    List<Address> result = apiInstance.addressGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AddressApi#addressGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Address&gt;**](Address.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="addressNew"></a>
# **addressNew**
> Address addressNew(currency, network, address, name, note, skipConfirm, skip2FA, memo)

Creates a new saved address.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AddressApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiExpires
ApiKeyAuth apiExpires = (ApiKeyAuth) defaultClient.getAuthentication("apiExpires");
apiExpires.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiExpires.setApiKeyPrefix("Token");

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

// Configure API key authorization: apiSignature
ApiKeyAuth apiSignature = (ApiKeyAuth) defaultClient.getAuthentication("apiSignature");
apiSignature.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiSignature.setApiKeyPrefix("Token");

AddressApi apiInstance = new AddressApi();
String currency = "currency_example"; // String | Currency of the address. Options: `XBt`, `USDt`
String network = "network_example"; // String | Selected network.
String address = "address_example"; // String | Destination Address.
String name = "name_example"; // String | Name of the entry, eg. 'Hardware wallet'.
String note = "note_example"; // String | Optional annotation.
Boolean skipConfirm = false; // Boolean | Skip e-mail confirmations for transfers to this address. Will require an email confirmation after creation.
Boolean skip2FA = false; // Boolean | Skip 2FA confirmations for transfers to this address. Will require an email confirmation after creation.
String memo = "memo_example"; // String | Destination Memo.
try {
    Address result = apiInstance.addressNew(currency, network, address, name, note, skipConfirm, skip2FA, memo);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AddressApi#addressNew");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currency** | **String**| Currency of the address. Options: &#x60;XBt&#x60;, &#x60;USDt&#x60; |
 **network** | **String**| Selected network. |
 **address** | **String**| Destination Address. |
 **name** | **String**| Name of the entry, eg. &#39;Hardware wallet&#39;. |
 **note** | **String**| Optional annotation. | [optional]
 **skipConfirm** | **Boolean**| Skip e-mail confirmations for transfers to this address. Will require an email confirmation after creation. | [optional] [default to false]
 **skip2FA** | **Boolean**| Skip 2FA confirmations for transfers to this address. Will require an email confirmation after creation. | [optional] [default to false]
 **memo** | **String**| Destination Memo. | [optional]

### Return type

[**Address**](Address.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

