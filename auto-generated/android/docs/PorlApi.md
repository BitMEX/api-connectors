# PorlApi

All URIs are relative to *https://www.bitmex.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**porlGetNonce**](PorlApi.md#porlGetNonce) | **GET** /porl/nonce | Get your Proof of Reserves nonce and data.
[**porlGetSnapshots**](PorlApi.md#porlGetSnapshots) | **GET** /porl/snapshots | Get Proof of Reserves historical snapshots


<a name="porlGetNonce"></a>
# **porlGetNonce**
> Porl porlGetNonce()

Get your Proof of Reserves nonce and data.

## Proof of Reserves Nonce  This endpoint will return the nonce and associated data needed to validate BitMEX reserves data.  &lt;! TODO link to docs, GitHub, etc &gt; 

### Example
```java
// Import classes:
//import io.swagger.client.api.PorlApi;

PorlApi apiInstance = new PorlApi();
try {
    Porl result = apiInstance.porlGetNonce();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PorlApi#porlGetNonce");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Porl**](Porl.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="porlGetSnapshots"></a>
# **porlGetSnapshots**
> List&lt;XAny&gt; porlGetSnapshots()

Get Proof of Reserves historical snapshots

### Example
```java
// Import classes:
//import io.swagger.client.api.PorlApi;

PorlApi apiInstance = new PorlApi();
try {
    List<XAny> result = apiInstance.porlGetSnapshots();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PorlApi#porlGetSnapshots");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;XAny&gt;**](XAny.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

