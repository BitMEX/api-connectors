# IO.Swagger.Api.AddressApi

All URIs are relative to *https://www.bitmex.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**AddressGet**](AddressApi.md#addressget) | **GET** /address | Get your addresses.
[**AddressNew**](AddressApi.md#addressnew) | **POST** /address | Creates a new saved address.


<a name="addressget"></a>
# **AddressGet**
> List<Address> AddressGet ()

Get your addresses.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class AddressGetExample
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

            var apiInstance = new AddressApi();

            try
            {
                // Get your addresses.
                List&lt;Address&gt; result = apiInstance.AddressGet();
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AddressApi.AddressGet: " + e.Message );
            }
        }
    }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List<Address>**](Address.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="addressnew"></a>
# **AddressNew**
> Address AddressNew (string currency, string network, string address, string name, string note = null, bool? skipConfirm = null, bool? skip2FA = null)

Creates a new saved address.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class AddressNewExample
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

            var apiInstance = new AddressApi();
            var currency = currency_example;  // string | Currency of the address. Options: `XBt`, `USDt`
            var network = network_example;  // string | Selected network.
            var address = address_example;  // string | Destination Address.
            var name = name_example;  // string | Name of the entry, eg. 'Hardware wallet'.
            var note = note_example;  // string | Optional annotation. (optional) 
            var skipConfirm = true;  // bool? | Skip e-mail confirmations for transfers to this address. Will require an email confirmation after creation. (optional)  (default to false)
            var skip2FA = true;  // bool? | Skip 2FA confirmations for transfers to this address. Will require an email confirmation after creation. (optional)  (default to false)

            try
            {
                // Creates a new saved address.
                Address result = apiInstance.AddressNew(currency, network, address, name, note, skipConfirm, skip2FA);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AddressApi.AddressNew: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currency** | **string**| Currency of the address. Options: &#x60;XBt&#x60;, &#x60;USDt&#x60; | 
 **network** | **string**| Selected network. | 
 **address** | **string**| Destination Address. | 
 **name** | **string**| Name of the entry, eg. &#39;Hardware wallet&#39;. | 
 **note** | **string**| Optional annotation. | [optional] 
 **skipConfirm** | **bool?**| Skip e-mail confirmations for transfers to this address. Will require an email confirmation after creation. | [optional] [default to false]
 **skip2FA** | **bool?**| Skip 2FA confirmations for transfers to this address. Will require an email confirmation after creation. | [optional] [default to false]

### Return type

[**Address**](Address.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

