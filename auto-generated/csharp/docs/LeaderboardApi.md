# IO.Swagger.Api.LeaderboardApi

All URIs are relative to *https://localhost/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**LeaderboardGet**](LeaderboardApi.md#leaderboardget) | **GET** /leaderboard | Get current leaderboard.
[**LeaderboardGetName**](LeaderboardApi.md#leaderboardgetname) | **GET** /leaderboard/name | Get your alias on the leaderboard.


<a name="leaderboardget"></a>
# **LeaderboardGet**
> List<Leaderboard> LeaderboardGet (string method = null)

Get current leaderboard.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class LeaderboardGetExample
    {
        public void main()
        {
            var apiInstance = new LeaderboardApi();
            var method = method_example;  // string | Ranking type. Options: \"notional\", \"ROE\" (optional)  (default to notional)

            try
            {
                // Get current leaderboard.
                List&lt;Leaderboard&gt; result = apiInstance.LeaderboardGet(method);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling LeaderboardApi.LeaderboardGet: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **method** | **string**| Ranking type. Options: \&quot;notional\&quot;, \&quot;ROE\&quot; | [optional] [default to notional]

### Return type

[**List<Leaderboard>**](Leaderboard.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="leaderboardgetname"></a>
# **LeaderboardGetName**
> InlineResponse2001 LeaderboardGetName ()

Get your alias on the leaderboard.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class LeaderboardGetNameExample
    {
        public void main()
        {
            // Configure API key authorization: apiKey
            Configuration.Default.AddApiKey("api-key", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.AddApiKeyPrefix("api-key", "Bearer");
            // Configure API key authorization: apiNonce
            Configuration.Default.AddApiKey("api-nonce", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.AddApiKeyPrefix("api-nonce", "Bearer");
            // Configure API key authorization: apiSignature
            Configuration.Default.AddApiKey("api-signature", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.AddApiKeyPrefix("api-signature", "Bearer");

            var apiInstance = new LeaderboardApi();

            try
            {
                // Get your alias on the leaderboard.
                InlineResponse2001 result = apiInstance.LeaderboardGetName();
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling LeaderboardApi.LeaderboardGetName: " + e.Message );
            }
        }
    }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

[apiKey](../README.md#apiKey), [apiNonce](../README.md#apiNonce), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

