# IO.Swagger.Api.ChatApi

All URIs are relative to *https://localhost/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ChatGet**](ChatApi.md#chatget) | **GET** /chat | Get chat messages.
[**ChatGetConnected**](ChatApi.md#chatgetconnected) | **GET** /chat/connected | Get connected users.
[**ChatNew**](ChatApi.md#chatnew) | **POST** /chat | Send a chat message.


# **ChatGet**
> List<Chat> ChatGet (decimal? count = null, decimal? start = null, bool? reverse = null)

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
            var count = 3.4;  // decimal? | Number of results to fetch. (optional)  (default to 100)
            var start = 3.4;  // decimal? | Starting point for results. (optional)  (default to 0)
            var reverse = true;  // bool? | If true, will sort results newest first. (optional)  (default to true)

            try
            {
                // Get chat messages.
                List&lt;Chat&gt; result = apiInstance.ChatGet(count, start, reverse);
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
 **start** | **decimal?**| Starting point for results. | [optional] [default to 0]
 **reverse** | **bool?**| If true, will sort results newest first. | [optional] [default to true]

### Return type

[**List<Chat>**](Chat.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

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

# **ChatNew**
> Chat ChatNew (string message)

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
            
            var apiInstance = new ChatApi();
            var message = message_example;  // string | 

            try
            {
                // Send a chat message.
                Chat result = apiInstance.ChatNew(message);
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

### Return type

[**Chat**](Chat.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

