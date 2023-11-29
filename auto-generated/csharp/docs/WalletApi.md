# IO.Swagger.Api.WalletApi

All URIs are relative to *https://www.bitmex.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**WalletGetAssetsConfig**](WalletApi.md#walletgetassetsconfig) | **GET** /wallet/assets | Get Assets Config
[**WalletGetNetworksConfig**](WalletApi.md#walletgetnetworksconfig) | **GET** /wallet/networks | Get Networks Config


<a name="walletgetassetsconfig"></a>
# **WalletGetAssetsConfig**
> List<AssetsConfig> WalletGetAssetsConfig ()

Get Assets Config

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class WalletGetAssetsConfigExample
    {
        public void main()
        {
            var apiInstance = new WalletApi();

            try
            {
                // Get Assets Config
                List&lt;AssetsConfig&gt; result = apiInstance.WalletGetAssetsConfig();
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling WalletApi.WalletGetAssetsConfig: " + e.Message );
            }
        }
    }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List<AssetsConfig>**](AssetsConfig.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="walletgetnetworksconfig"></a>
# **WalletGetNetworksConfig**
> List<NetworksConfig> WalletGetNetworksConfig ()

Get Networks Config

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class WalletGetNetworksConfigExample
    {
        public void main()
        {
            var apiInstance = new WalletApi();

            try
            {
                // Get Networks Config
                List&lt;NetworksConfig&gt; result = apiInstance.WalletGetNetworksConfig();
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling WalletApi.WalletGetNetworksConfig: " + e.Message );
            }
        }
    }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List<NetworksConfig>**](NetworksConfig.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

