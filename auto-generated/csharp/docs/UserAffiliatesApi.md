# IO.Swagger.Api.UserAffiliatesApi

All URIs are relative to *https://www.bitmex.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**UserAffiliatesGet**](UserAffiliatesApi.md#useraffiliatesget) | **GET** /userAffiliates | Get user&#39;s affiliates to a given depth


<a name="useraffiliatesget"></a>
# **UserAffiliatesGet**
> List<XAny> UserAffiliatesGet (double? depth = null, double? targetAccountId = null, double? selectUserId = null)

Get user's affiliates to a given depth

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class UserAffiliatesGetExample
    {
        public void main()
        {
            // Configure API key authorization: apiExpires
            Configuration.Default.AddApiKey("api-expires", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.AddApiKeyPrefix("api-expires", "Bearer");
            // Configure API key authorization: apiKey
            Configuration.Default.AddApiKey("api-key", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.AddApiKeyPrefix("api-key", "Bearer");
            // Configure API key authorization: apiSignature
            Configuration.Default.AddApiKey("api-signature", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.AddApiKeyPrefix("api-signature", "Bearer");

            var apiInstance = new UserAffiliatesApi();
            var depth = 1.2;  // double? | the depth of affiliates to return. Eg depth = 2 would return direct affiliates and their affiliates (optional) 
            var targetAccountId = 1.2;  // double? | AccountId of Sub-Affiliate Account (optional) 
            var selectUserId = 1.2;  // double? | User id of result array to keep (optional) 

            try
            {
                // Get user's affiliates to a given depth
                List&lt;XAny&gt; result = apiInstance.UserAffiliatesGet(depth, targetAccountId, selectUserId);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling UserAffiliatesApi.UserAffiliatesGet: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **depth** | **double?**| the depth of affiliates to return. Eg depth &#x3D; 2 would return direct affiliates and their affiliates | [optional] 
 **targetAccountId** | **double?**| AccountId of Sub-Affiliate Account | [optional] 
 **selectUserId** | **double?**| User id of result array to keep | [optional] 

### Return type

[**List<XAny>**](XAny.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

