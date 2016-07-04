# ApiKeyApi

All URIs are relative to *https://localhost/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiKeyDisable**](ApiKeyApi.md#apiKeyDisable) | **POST** /apiKey/disable | Disable an API Key.
[**apiKeyEnable**](ApiKeyApi.md#apiKeyEnable) | **POST** /apiKey/enable | Enable an API Key.
[**apiKeyGet**](ApiKeyApi.md#apiKeyGet) | **GET** /apiKey | Get your API Keys.
[**apiKeyNew**](ApiKeyApi.md#apiKeyNew) | **POST** /apiKey | Create a new API Key.
[**apiKeyRemove**](ApiKeyApi.md#apiKeyRemove) | **DELETE** /apiKey | Remove an API Key.


<a name="apiKeyDisable"></a>
# **apiKeyDisable**
> ApiKey apiKeyDisable(apiKeyID)

Disable an API Key.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ApiKeyApi;


ApiKeyApi apiInstance = new ApiKeyApi();
String apiKeyID = "apiKeyID_example"; // String | API Key ID (public component).
try {
    ApiKey result = apiInstance.apiKeyDisable(apiKeyID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiKeyApi#apiKeyDisable");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiKeyID** | **String**| API Key ID (public component). |

### Return type

[**ApiKey**](ApiKey.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="apiKeyEnable"></a>
# **apiKeyEnable**
> ApiKey apiKeyEnable(apiKeyID)

Enable an API Key.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ApiKeyApi;


ApiKeyApi apiInstance = new ApiKeyApi();
String apiKeyID = "apiKeyID_example"; // String | API Key ID (public component).
try {
    ApiKey result = apiInstance.apiKeyEnable(apiKeyID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiKeyApi#apiKeyEnable");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiKeyID** | **String**| API Key ID (public component). |

### Return type

[**ApiKey**](ApiKey.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="apiKeyGet"></a>
# **apiKeyGet**
> List&lt;ApiKey&gt; apiKeyGet(reverse)

Get your API Keys.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ApiKeyApi;


ApiKeyApi apiInstance = new ApiKeyApi();
Boolean reverse = false; // Boolean | If true, will sort results newest first.
try {
    List<ApiKey> result = apiInstance.apiKeyGet(reverse);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiKeyApi#apiKeyGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reverse** | **Boolean**| If true, will sort results newest first. | [optional] [default to false]

### Return type

[**List&lt;ApiKey&gt;**](ApiKey.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="apiKeyNew"></a>
# **apiKeyNew**
> ApiKey apiKeyNew(name, cidr, permissions, enabled, token)

Create a new API Key.

API Keys can also be created via [this Python script](https://github.com/BitMEX/market-maker/blob/master/generate-api-key.py) See the [API Key Documentation](/app/apiKeys) for more information on capabilities.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ApiKeyApi;


ApiKeyApi apiInstance = new ApiKeyApi();
String name = "name_example"; // String | Key name. This name is for reference only.
String cidr = "cidr_example"; // String | CIDR block to restrict this key to. To restrict to a single address, append \"/32\", e.g. 207.39.29.22/32. Leave blank or set to 0.0.0.0/0 to allow all IPs. Only one block may be set. <a href=\"http://software77.net/cidr-101.html\">More on CIDR blocks</a>
String permissions = "permissions_example"; // String | Key Permissions. All keys can read margin and position data. Additional permissions must be added. Available: [\"order\", \"withdraw\"].
Boolean enabled = false; // Boolean | Set to true to enable this key on creation. Otherwise, it must be explicitly enabled via /apiKey/enable.
String token = "token_example"; // String | OTP Token (YubiKey, Google Authenticator)
try {
    ApiKey result = apiInstance.apiKeyNew(name, cidr, permissions, enabled, token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiKeyApi#apiKeyNew");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Key name. This name is for reference only. | [optional]
 **cidr** | **String**| CIDR block to restrict this key to. To restrict to a single address, append \&quot;/32\&quot;, e.g. 207.39.29.22/32. Leave blank or set to 0.0.0.0/0 to allow all IPs. Only one block may be set. &lt;a href&#x3D;\&quot;http://software77.net/cidr-101.html\&quot;&gt;More on CIDR blocks&lt;/a&gt; | [optional]
 **permissions** | **String**| Key Permissions. All keys can read margin and position data. Additional permissions must be added. Available: [\&quot;order\&quot;, \&quot;withdraw\&quot;]. | [optional]
 **enabled** | **Boolean**| Set to true to enable this key on creation. Otherwise, it must be explicitly enabled via /apiKey/enable. | [optional] [default to false]
 **token** | **String**| OTP Token (YubiKey, Google Authenticator) | [optional]

### Return type

[**ApiKey**](ApiKey.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="apiKeyRemove"></a>
# **apiKeyRemove**
> InlineResponse200 apiKeyRemove(apiKeyID)

Remove an API Key.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ApiKeyApi;


ApiKeyApi apiInstance = new ApiKeyApi();
String apiKeyID = "apiKeyID_example"; // String | API Key ID (public component).
try {
    InlineResponse200 result = apiInstance.apiKeyRemove(apiKeyID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiKeyApi#apiKeyRemove");
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

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

