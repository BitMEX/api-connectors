# IO.Swagger.Api.ApiKeyApi

All URIs are relative to *https://localhost/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ApiKeyDisable**](ApiKeyApi.md#apikeydisable) | **POST** /apiKey/disable | Disable an API Key.
[**ApiKeyEnable**](ApiKeyApi.md#apikeyenable) | **POST** /apiKey/enable | Enable an API Key.
[**ApiKeyGet**](ApiKeyApi.md#apikeyget) | **GET** /apiKey | Get your API Keys.
[**ApiKeyNew**](ApiKeyApi.md#apikeynew) | **POST** /apiKey | Create a new API Key.
[**ApiKeyRemove**](ApiKeyApi.md#apikeyremove) | **DELETE** /apiKey | Remove an API Key.


# **ApiKeyDisable**
> ApiKey ApiKeyDisable (string apiKeyID)

Disable an API Key.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class ApiKeyDisableExample
    {
        public void main()
        {
            
            var apiInstance = new ApiKeyApi();
            var apiKeyID = apiKeyID_example;  // string | API Key ID (public component).

            try
            {
                // Disable an API Key.
                ApiKey result = apiInstance.ApiKeyDisable(apiKeyID);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ApiKeyApi.ApiKeyDisable: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiKeyID** | **string**| API Key ID (public component). | 

### Return type

[**ApiKey**](ApiKey.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ApiKeyEnable**
> ApiKey ApiKeyEnable (string apiKeyID)

Enable an API Key.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class ApiKeyEnableExample
    {
        public void main()
        {
            
            var apiInstance = new ApiKeyApi();
            var apiKeyID = apiKeyID_example;  // string | API Key ID (public component).

            try
            {
                // Enable an API Key.
                ApiKey result = apiInstance.ApiKeyEnable(apiKeyID);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ApiKeyApi.ApiKeyEnable: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiKeyID** | **string**| API Key ID (public component). | 

### Return type

[**ApiKey**](ApiKey.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ApiKeyGet**
> List<ApiKey> ApiKeyGet (bool? reverse = null)

Get your API Keys.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class ApiKeyGetExample
    {
        public void main()
        {
            
            var apiInstance = new ApiKeyApi();
            var reverse = true;  // bool? | If true, will sort results newest first. (optional)  (default to false)

            try
            {
                // Get your API Keys.
                List&lt;ApiKey&gt; result = apiInstance.ApiKeyGet(reverse);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ApiKeyApi.ApiKeyGet: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reverse** | **bool?**| If true, will sort results newest first. | [optional] [default to false]

### Return type

[**List<ApiKey>**](ApiKey.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ApiKeyNew**
> ApiKey ApiKeyNew (string name = null, string cidr = null, string permissions = null, bool? enabled = null, string token = null)

Create a new API Key.

API Keys can also be created via [this Python script](https://github.com/BitMEX/market-maker/blob/master/generate-api-key.py) See the [API Key Documentation](/app/apiKeys) for more information on capabilities.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class ApiKeyNewExample
    {
        public void main()
        {
            
            var apiInstance = new ApiKeyApi();
            var name = name_example;  // string | Key name. This name is for reference only. (optional) 
            var cidr = cidr_example;  // string | CIDR block to restrict this key to. To restrict to a single address, append \"/32\", e.g. 207.39.29.22/32. Leave blank or set to 0.0.0.0/0 to allow all IPs. Only one block may be set. <a href=\"http://software77.net/cidr-101.html\">More on CIDR blocks</a> (optional) 
            var permissions = permissions_example;  // string | Key Permissions. All keys can read margin and position data. Additional permissions must be added. Available: [\"order\", \"withdraw\"]. (optional) 
            var enabled = true;  // bool? | Set to true to enable this key on creation. Otherwise, it must be explicitly enabled via /apiKey/enable. (optional)  (default to false)
            var token = token_example;  // string | OTP Token (YubiKey, Google Authenticator) (optional) 

            try
            {
                // Create a new API Key.
                ApiKey result = apiInstance.ApiKeyNew(name, cidr, permissions, enabled, token);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ApiKeyApi.ApiKeyNew: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **string**| Key name. This name is for reference only. | [optional] 
 **cidr** | **string**| CIDR block to restrict this key to. To restrict to a single address, append \&quot;/32\&quot;, e.g. 207.39.29.22/32. Leave blank or set to 0.0.0.0/0 to allow all IPs. Only one block may be set. &lt;a href&#x3D;\&quot;http://software77.net/cidr-101.html\&quot;&gt;More on CIDR blocks&lt;/a&gt; | [optional] 
 **permissions** | **string**| Key Permissions. All keys can read margin and position data. Additional permissions must be added. Available: [\&quot;order\&quot;, \&quot;withdraw\&quot;]. | [optional] 
 **enabled** | **bool?**| Set to true to enable this key on creation. Otherwise, it must be explicitly enabled via /apiKey/enable. | [optional] [default to false]
 **token** | **string**| OTP Token (YubiKey, Google Authenticator) | [optional] 

### Return type

[**ApiKey**](ApiKey.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ApiKeyRemove**
> InlineResponse200 ApiKeyRemove (string apiKeyID)

Remove an API Key.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class ApiKeyRemoveExample
    {
        public void main()
        {
            
            var apiInstance = new ApiKeyApi();
            var apiKeyID = apiKeyID_example;  // string | API Key ID (public component).

            try
            {
                // Remove an API Key.
                InlineResponse200 result = apiInstance.ApiKeyRemove(apiKeyID);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ApiKeyApi.ApiKeyRemove: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiKeyID** | **string**| API Key ID (public component). | 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

