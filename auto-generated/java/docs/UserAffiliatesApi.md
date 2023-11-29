# UserAffiliatesApi

All URIs are relative to *https://www.bitmex.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**userAffiliatesGet**](UserAffiliatesApi.md#userAffiliatesGet) | **GET** /userAffiliates | Get user&#39;s affiliates to a given depth


<a name="userAffiliatesGet"></a>
# **userAffiliatesGet**
> List&lt;XAny&gt; userAffiliatesGet(depth)

Get user&#39;s affiliates to a given depth

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UserAffiliatesApi;

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

UserAffiliatesApi apiInstance = new UserAffiliatesApi();
Double depth = 3.4D; // Double | the depth of affiliates to return. Eg depth = 2 would return direct affiliates and their affiliates
try {
    List<XAny> result = apiInstance.userAffiliatesGet(depth);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserAffiliatesApi#userAffiliatesGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **depth** | **Double**| the depth of affiliates to return. Eg depth &#x3D; 2 would return direct affiliates and their affiliates | [optional]

### Return type

[**List&lt;XAny&gt;**](XAny.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

