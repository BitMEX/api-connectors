# APIKeyApi

All URIs are relative to *https://localhost/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**aPIKeyDisable**](APIKeyApi.md#aPIKeyDisable) | **POST** /apiKey/disable | Disable an API Key.
[**aPIKeyEnable**](APIKeyApi.md#aPIKeyEnable) | **POST** /apiKey/enable | Enable an API Key.
[**aPIKeyGet**](APIKeyApi.md#aPIKeyGet) | **GET** /apiKey | Get your API Keys.
[**aPIKeyNew**](APIKeyApi.md#aPIKeyNew) | **POST** /apiKey | Create a new API Key.
[**aPIKeyRemove**](APIKeyApi.md#aPIKeyRemove) | **DELETE** /apiKey | Remove an API Key.


<a name="aPIKeyDisable"></a>
# **aPIKeyDisable**
> APIKey aPIKeyDisable(apiKeyID)

Disable an API Key.

### Example
```java
// Import classes:
//import io.swagger.client.api.APIKeyApi;

APIKeyApi apiInstance = new APIKeyApi();
String apiKeyID = "apiKeyID_example"; // String | API Key ID (public component).
try {
    APIKey result = apiInstance.aPIKeyDisable(apiKeyID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling APIKeyApi#aPIKeyDisable");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiKeyID** | **String**| API Key ID (public component). |

### Return type

[**APIKey**](APIKey.md)

### Authorization

[apiKey](../README.md#apiKey), [apiNonce](../README.md#apiNonce), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="aPIKeyEnable"></a>
# **aPIKeyEnable**
> APIKey aPIKeyEnable(apiKeyID)

Enable an API Key.

### Example
```java
// Import classes:
//import io.swagger.client.api.APIKeyApi;

APIKeyApi apiInstance = new APIKeyApi();
String apiKeyID = "apiKeyID_example"; // String | API Key ID (public component).
try {
    APIKey result = apiInstance.aPIKeyEnable(apiKeyID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling APIKeyApi#aPIKeyEnable");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiKeyID** | **String**| API Key ID (public component). |

### Return type

[**APIKey**](APIKey.md)

### Authorization

[apiKey](../README.md#apiKey), [apiNonce](../README.md#apiNonce), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

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

[apiKey](../README.md#apiKey), [apiNonce](../README.md#apiNonce), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="aPIKeyNew"></a>
# **aPIKeyNew**
> APIKey aPIKeyNew(name, cidr, permissions, enabled, token)

Create a new API Key.

API Keys can also be created via [this Python script](https://github.com/BitMEX/market-maker/blob/master/generate-api-key.py) See the [API Key Documentation](/app/apiKeys) for more information on capabilities.

### Example
```java
// Import classes:
//import io.swagger.client.api.APIKeyApi;

APIKeyApi apiInstance = new APIKeyApi();
String name = "name_example"; // String | Key name. This name is for reference only.
String cidr = "cidr_example"; // String | CIDR block to restrict this key to. To restrict to a single address, append \"/32\", e.g. 207.39.29.22/32. Leave blank or set to 0.0.0.0/0 to allow all IPs. Only one block may be set. <a href=\"http://software77.net/cidr-101.html\">More on CIDR blocks</a>
String permissions = "permissions_example"; // String | Key Permissions. All keys can read margin and position data. Additional permissions must be added. Available: [\"order\", \"orderCancel\", \"withdraw\"].
Boolean enabled = false; // Boolean | Set to true to enable this key on creation. Otherwise, it must be explicitly enabled via /apiKey/enable.
String token = "token_example"; // String | OTP Token (YubiKey, Google Authenticator)
try {
    APIKey result = apiInstance.aPIKeyNew(name, cidr, permissions, enabled, token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling APIKeyApi#aPIKeyNew");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Key name. This name is for reference only. | [optional]
 **cidr** | **String**| CIDR block to restrict this key to. To restrict to a single address, append \&quot;/32\&quot;, e.g. 207.39.29.22/32. Leave blank or set to 0.0.0.0/0 to allow all IPs. Only one block may be set. &lt;a href&#x3D;\&quot;http://software77.net/cidr-101.html\&quot;&gt;More on CIDR blocks&lt;/a&gt; | [optional]
 **permissions** | **String**| Key Permissions. All keys can read margin and position data. Additional permissions must be added. Available: [\&quot;order\&quot;, \&quot;orderCancel\&quot;, \&quot;withdraw\&quot;]. | [optional]
 **enabled** | **Boolean**| Set to true to enable this key on creation. Otherwise, it must be explicitly enabled via /apiKey/enable. | [optional] [default to false]
 **token** | **String**| OTP Token (YubiKey, Google Authenticator) | [optional]

### Return type

[**APIKey**](APIKey.md)

### Authorization

[apiKey](../README.md#apiKey), [apiNonce](../README.md#apiNonce), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="aPIKeyRemove"></a>
# **aPIKeyRemove**
> InlineResponse200 aPIKeyRemove(apiKeyID)

Remove an API Key.

### Example
```java
// Import classes:
//import io.swagger.client.api.APIKeyApi;

APIKeyApi apiInstance = new APIKeyApi();
String apiKeyID = "apiKeyID_example"; // String | API Key ID (public component).
try {
    InlineResponse200 result = apiInstance.aPIKeyRemove(apiKeyID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling APIKeyApi#aPIKeyRemove");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiKeyID** | **String**| API Key ID (public component). |

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[apiKey](../README.md#apiKey), [apiNonce](../README.md#apiNonce), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

