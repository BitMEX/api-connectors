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
//import io.swagger.client.api.AddressApi;

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
//import io.swagger.client.api.AddressApi;

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

