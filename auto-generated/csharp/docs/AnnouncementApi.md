# IO.Swagger.Api.AnnouncementApi

All URIs are relative to *https://localhost/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**AnnouncementGet**](AnnouncementApi.md#announcementget) | **GET** /announcement | Get site announcements.
[**AnnouncementGetUrgent**](AnnouncementApi.md#announcementgeturgent) | **GET** /announcement/urgent | Get urgent (banner) announcements.


<a name="announcementget"></a>
# **AnnouncementGet**
> List<Announcement> AnnouncementGet (string columns = null)

Get site announcements.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class AnnouncementGetExample
    {
        public void main()
        {
            var apiInstance = new AnnouncementApi();
            var columns = columns_example;  // string | Array of column names to fetch. If omitted, will return all columns. (optional) 

            try
            {
                // Get site announcements.
                List&lt;Announcement&gt; result = apiInstance.AnnouncementGet(columns);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AnnouncementApi.AnnouncementGet: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **columns** | **string**| Array of column names to fetch. If omitted, will return all columns. | [optional] 

### Return type

[**List<Announcement>**](Announcement.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="announcementgeturgent"></a>
# **AnnouncementGetUrgent**
> List<Announcement> AnnouncementGetUrgent ()

Get urgent (banner) announcements.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class AnnouncementGetUrgentExample
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

            var apiInstance = new AnnouncementApi();

            try
            {
                // Get urgent (banner) announcements.
                List&lt;Announcement&gt; result = apiInstance.AnnouncementGetUrgent();
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AnnouncementApi.AnnouncementGetUrgent: " + e.Message );
            }
        }
    }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List<Announcement>**](Announcement.md)

### Authorization

[apiKey](../README.md#apiKey), [apiNonce](../README.md#apiNonce), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

