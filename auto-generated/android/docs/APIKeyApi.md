# APIKeyApi

All URIs are relative to *https://www.bitmex.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**aPIKeyGet**](APIKeyApi.md#aPIKeyGet) | **GET** /apiKey | Get your API Keys.


<a name="aPIKeyGet"></a>
# **aPIKeyGet**
> List&lt;APIKey&gt; aPIKeyGet(reverse)

Get your API Keys.

### Example
```java
// Import classes:
//import io.swagger.client.api.APIKeyApi;

APIKeyApi apiInstance = new APIKeyApi();
Boolean reverse = false; // Boolean | If true, will sort results newest first.
try {
    List<APIKey> result = apiInstance.aPIKeyGet(reverse);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling APIKeyApi#aPIKeyGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reverse** | **Boolean**| If true, will sort results newest first. | [optional] [default to false]

### Return type

[**List&lt;APIKey&gt;**](APIKey.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

