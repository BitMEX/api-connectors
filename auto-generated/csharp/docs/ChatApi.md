# IO.Swagger.Api.ChatApi

All URIs are relative to *https://localhost/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ChatGet**](ChatApi.md#chatget) | **GET** /chat | Get chat messages.
[**ChatGetChannels**](ChatApi.md#chatgetchannels) | **GET** /chat/channels | Get available channels.
[**ChatGetConnected**](ChatApi.md#chatgetconnected) | **GET** /chat/connected | Get connected users.
[**ChatNew**](ChatApi.md#chatnew) | **POST** /chat | Send a chat message.


<a name="chatget"></a>
# **ChatGet**
> List<Chat> ChatGet (decimal? count = null, decimal? start = null, bool? reverse = null, double? channelID = null)

Get chat messages.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class ChatGetExample
    {
        public void main()
        {
            var apiInstance = new ChatApi();
            var count = 8.14;  // decimal? | Number of results to fetch. (optional)  (default to 100)
            var start = 8.14;  // decimal? | Starting ID for results. (optional)  (default to 0)
            var reverse = true;  // bool? | If true, will sort results newest first. (optional)  (default to true)
            var channelID = 1.2;  // double? | Channel id. GET /chat/channels for ids. Leave blank for all. (optional) 

            try
            {
                // Get chat messages.
                List&lt;Chat&gt; result = apiInstance.ChatGet(count, start, reverse, channelID);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ChatApi.ChatGet: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **count** | **decimal?**| Number of results to fetch. | [optional] [default to 100]
 **start** | **decimal?**| Starting ID for results. | [optional] [default to 0]
 **reverse** | **bool?**| If true, will sort results newest first. | [optional] [default to true]
 **channelID** | **double?**| Channel id. GET /chat/channels for ids. Leave blank for all. | [optional] 

### Return type

[**List<Chat>**](Chat.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="chatgetchannels"></a>
# **ChatGetChannels**
> List<ChatChannel> ChatGetChannels ()

Get available channels.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class ChatGetChannelsExample
    {
        public void main()
        {
            var apiInstance = new ChatApi();

            try
            {
                // Get available channels.
                List&lt;ChatChannel&gt; result = apiInstance.ChatGetChannels();
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ChatApi.ChatGetChannels: " + e.Message );
            }
        }
    }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List<ChatChannel>**](ChatChannel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="chatgetconnected"></a>
# **ChatGetConnected**
> ConnectedUsers ChatGetConnected ()

Get connected users.

Returns an array with browser users in the first position and API users (bots) in the second position.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class ChatGetConnectedExample
    {
        public void main()
        {
            var apiInstance = new ChatApi();

            try
            {
                // Get connected users.
                ConnectedUsers result = apiInstance.ChatGetConnected();
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ChatApi.ChatGetConnected: " + e.Message );
            }
        }
    }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ConnectedUsers**](ConnectedUsers.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="chatnew"></a>
# **ChatNew**
> Chat ChatNew (string message, double? channelID = null)

Send a chat message.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class ChatNewExample
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

            var apiInstance = new ChatApi();
            var message = message_example;  // string | 
            var channelID = 1.2;  // double? | Channel to post to. Default 1 (English). (optional)  (default to 1)

            try
            {
                // Send a chat message.
                Chat result = apiInstance.ChatNew(message, channelID);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ChatApi.ChatNew: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **message** | **string**|  | 
 **channelID** | **double?**| Channel to post to. Default 1 (English). | [optional] [default to 1]

### Return type

[**Chat**](Chat.md)

### Authorization

[apiKey](../README.md#apiKey), [apiNonce](../README.md#apiNonce), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

