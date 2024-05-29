# UserAffiliatesApi

All URIs are relative to *https://www.bitmex.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**userAffiliatesGet**](UserAffiliatesApi.md#userAffiliatesGet) | **GET** /userAffiliates | Get user&#39;s affiliates to a given depth


<a name="userAffiliatesGet"></a>
# **userAffiliatesGet**
> List&lt;XAny&gt; userAffiliatesGet(depth, targetAccountId, selectUserId)

Get user&#39;s affiliates to a given depth

### Example
```java
// Import classes:
//import io.swagger.client.api.UserAffiliatesApi;

UserAffiliatesApi apiInstance = new UserAffiliatesApi();
Double depth = 3.4D; // Double | the depth of affiliates to return. Eg depth = 2 would return direct affiliates and their affiliates
Double targetAccountId = 3.4D; // Double | AccountId of Sub-Affiliate Account
Double selectUserId = 3.4D; // Double | User id of result array to keep
try {
    List<XAny> result = apiInstance.userAffiliatesGet(depth, targetAccountId, selectUserId);
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
 **targetAccountId** | **Double**| AccountId of Sub-Affiliate Account | [optional]
 **selectUserId** | **Double**| User id of result array to keep | [optional]

### Return type

[**List&lt;XAny&gt;**](XAny.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

