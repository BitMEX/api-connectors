# IO.Swagger.Api.SchemaApi

All URIs are relative to *https://localhost/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**SchemaGet**](SchemaApi.md#schemaget) | **GET** /schema | Get model schemata for data objects returned by this API.
[**SchemaWebsocketHelp**](SchemaApi.md#schemawebsockethelp) | **GET** /schema/websocketHelp | Returns help text &amp; subject list for websocket usage.


<a name="schemaget"></a>
# **SchemaGet**
> Object SchemaGet (string model = null)

Get model schemata for data objects returned by this API.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class SchemaGetExample
    {
        public void main()
        {
            var apiInstance = new SchemaApi();
            var model = model_example;  // string | Optional model filter. If omitted, will return all models. (optional) 

            try
            {
                // Get model schemata for data objects returned by this API.
                Object result = apiInstance.SchemaGet(model);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling SchemaApi.SchemaGet: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model** | **string**| Optional model filter. If omitted, will return all models. | [optional] 

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="schemawebsockethelp"></a>
# **SchemaWebsocketHelp**
> Object SchemaWebsocketHelp ()

Returns help text & subject list for websocket usage.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class SchemaWebsocketHelpExample
    {
        public void main()
        {
            var apiInstance = new SchemaApi();

            try
            {
                // Returns help text & subject list for websocket usage.
                Object result = apiInstance.SchemaWebsocketHelp();
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling SchemaApi.SchemaWebsocketHelp: " + e.Message );
            }
        }
    }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

