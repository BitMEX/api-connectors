# IO.Swagger.Api.GuildApi

All URIs are relative to *https://www.bitmex.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GuildArchive**](GuildApi.md#guildarchive) | **POST** /guild/archive | Archive a guild
[**GuildEdit**](GuildApi.md#guildedit) | **PUT** /guild | Edit guild new guild
[**GuildGet**](GuildApi.md#guildget) | **GET** /guild | Get all guilds
[**GuildJoin**](GuildApi.md#guildjoin) | **POST** /guild/join | Request to Join a private guild or join a public guild
[**GuildKick**](GuildApi.md#guildkick) | **POST** /guild/kick | Kick member from guild
[**GuildLeave**](GuildApi.md#guildleave) | **POST** /guild/leave | Leave guild or cancel guild join request
[**GuildNew**](GuildApi.md#guildnew) | **POST** /guild | Creates a new guild
[**GuildShareTrades**](GuildApi.md#guildsharetrades) | **POST** /guild/shareTrades | Toggle share trades for your account, which controls whether your guild members can see your orders and positions in their UI


<a name="guildarchive"></a>
# **GuildArchive**
> Object GuildArchive ()

Archive a guild

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class GuildArchiveExample
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

            var apiInstance = new GuildApi();

            try
            {
                // Archive a guild
                Object result = apiInstance.GuildArchive();
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling GuildApi.GuildArchive: " + e.Message );
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

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="guildedit"></a>
# **GuildEdit**
> Guild GuildEdit (string name, string emoji, double? potDistributionPercent, string potDistributionType, double? potTraderId = null, string description = null, string twitter = null, string discord = null, string telegram = null, string imgUrl = null, bool? isPrivate = null)

Edit guild new guild

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class GuildEditExample
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

            var apiInstance = new GuildApi();
            var name = name_example;  // string | Name of the guild, must be unique, must be at least 5 characters
            var emoji = emoji_example;  // string | Emoji name.
            var potDistributionPercent = 1.2;  // double? | How much of the pot should be distributed to the guild members, must be between 0 and 100
            var potDistributionType = potDistributionType_example;  // string | How the pot should be distributed to the guild members, must be one of the following: ROLL_OVER, TOP_3, TOP_5, TOP_10, VOLUME_PERCENTAGE, TOP_3_BY_ADV, TOP_5_BY_ADV, TOP_10_BY_ADV, TOP_3_BY_ROI, TOP_5_BY_ROI, TOP_10_BY_ROI, RANDOM
            var potTraderId = 1.2;  // double? | User ID of the guild member with order write permission for the pot (optional) 
            var description = description_example;  // string | Guild description, can be used to explain the guild to other users. (optional) 
            var twitter = twitter_example;  // string | Guild twitter handle. (optional) 
            var discord = discord_example;  // string | Guild discord link. (optional) 
            var telegram = telegram_example;  // string | Guild telegram link. (optional) 
            var imgUrl = imgUrl_example;  // string | URL for the profile image of the guild, is used by clients to add some color to the guild, if no image is provided, a default image is used (optional) 
            var isPrivate = true;  // bool? | Guild privacy status (optional) 

            try
            {
                // Edit guild new guild
                Guild result = apiInstance.GuildEdit(name, emoji, potDistributionPercent, potDistributionType, potTraderId, description, twitter, discord, telegram, imgUrl, isPrivate);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling GuildApi.GuildEdit: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **string**| Name of the guild, must be unique, must be at least 5 characters | 
 **emoji** | **string**| Emoji name. | 
 **potDistributionPercent** | **double?**| How much of the pot should be distributed to the guild members, must be between 0 and 100 | 
 **potDistributionType** | **string**| How the pot should be distributed to the guild members, must be one of the following: ROLL_OVER, TOP_3, TOP_5, TOP_10, VOLUME_PERCENTAGE, TOP_3_BY_ADV, TOP_5_BY_ADV, TOP_10_BY_ADV, TOP_3_BY_ROI, TOP_5_BY_ROI, TOP_10_BY_ROI, RANDOM | 
 **potTraderId** | **double?**| User ID of the guild member with order write permission for the pot | [optional] 
 **description** | **string**| Guild description, can be used to explain the guild to other users. | [optional] 
 **twitter** | **string**| Guild twitter handle. | [optional] 
 **discord** | **string**| Guild discord link. | [optional] 
 **telegram** | **string**| Guild telegram link. | [optional] 
 **imgUrl** | **string**| URL for the profile image of the guild, is used by clients to add some color to the guild, if no image is provided, a default image is used | [optional] 
 **isPrivate** | **bool?**| Guild privacy status | [optional] 

### Return type

[**Guild**](Guild.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="guildget"></a>
# **GuildGet**
> List<XAny> GuildGet ()

Get all guilds

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class GuildGetExample
    {
        public void main()
        {
            var apiInstance = new GuildApi();

            try
            {
                // Get all guilds
                List&lt;XAny&gt; result = apiInstance.GuildGet();
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling GuildApi.GuildGet: " + e.Message );
            }
        }
    }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List<XAny>**](XAny.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="guildjoin"></a>
# **GuildJoin**
> Object GuildJoin (string code)

Request to Join a private guild or join a public guild

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class GuildJoinExample
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

            var apiInstance = new GuildApi();
            var code = code_example;  // string | 

            try
            {
                // Request to Join a private guild or join a public guild
                Object result = apiInstance.GuildJoin(code);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling GuildApi.GuildJoin: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **string**|  | 

### Return type

**Object**

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="guildkick"></a>
# **GuildKick**
> Object GuildKick (double? memberUserId)

Kick member from guild

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class GuildKickExample
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

            var apiInstance = new GuildApi();
            var memberUserId = 1.2;  // double? | 

            try
            {
                // Kick member from guild
                Object result = apiInstance.GuildKick(memberUserId);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling GuildApi.GuildKick: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **memberUserId** | **double?**|  | 

### Return type

**Object**

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="guildleave"></a>
# **GuildLeave**
> Object GuildLeave ()

Leave guild or cancel guild join request

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class GuildLeaveExample
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

            var apiInstance = new GuildApi();

            try
            {
                // Leave guild or cancel guild join request
                Object result = apiInstance.GuildLeave();
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling GuildApi.GuildLeave: " + e.Message );
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

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="guildnew"></a>
# **GuildNew**
> Guild GuildNew (string name, string emoji, double? potDistributionPercent, string potDistributionType, string description = null, string twitter = null, string discord = null, string telegram = null, string imgUrl = null, bool? isPrivate = null)

Creates a new guild

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class GuildNewExample
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

            var apiInstance = new GuildApi();
            var name = name_example;  // string | Name of the guild, must be unique, must be at least 5 characters
            var emoji = emoji_example;  // string | Emoji name.
            var potDistributionPercent = 1.2;  // double? | How much of the pot should be distributed to the guild members, must be between 0 and 100
            var potDistributionType = potDistributionType_example;  // string | How the pot should be distributed to the guild members, must be one of the following: ROLL_OVER, TOP_3, TOP_5, TOP_10, VOLUME_PERCENTAGE, TOP_3_BY_ADV, TOP_5_BY_ADV, TOP_10_BY_ADV, TOP_3_BY_ROI, TOP_5_BY_ROI, TOP_10_BY_ROI, RANDOM
            var description = description_example;  // string | Guild description, can be used to explain the guild to other users. (optional) 
            var twitter = twitter_example;  // string | Guild twitter handle. (optional) 
            var discord = discord_example;  // string | Guild discord link. (optional) 
            var telegram = telegram_example;  // string | Guild telegram link. (optional) 
            var imgUrl = imgUrl_example;  // string | URL for the profile image of the guild, is used by clients to add some color to the guild, if no image is provided, a default image is used (optional) 
            var isPrivate = true;  // bool? | Guild privacy status (optional) 

            try
            {
                // Creates a new guild
                Guild result = apiInstance.GuildNew(name, emoji, potDistributionPercent, potDistributionType, description, twitter, discord, telegram, imgUrl, isPrivate);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling GuildApi.GuildNew: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **string**| Name of the guild, must be unique, must be at least 5 characters | 
 **emoji** | **string**| Emoji name. | 
 **potDistributionPercent** | **double?**| How much of the pot should be distributed to the guild members, must be between 0 and 100 | 
 **potDistributionType** | **string**| How the pot should be distributed to the guild members, must be one of the following: ROLL_OVER, TOP_3, TOP_5, TOP_10, VOLUME_PERCENTAGE, TOP_3_BY_ADV, TOP_5_BY_ADV, TOP_10_BY_ADV, TOP_3_BY_ROI, TOP_5_BY_ROI, TOP_10_BY_ROI, RANDOM | 
 **description** | **string**| Guild description, can be used to explain the guild to other users. | [optional] 
 **twitter** | **string**| Guild twitter handle. | [optional] 
 **discord** | **string**| Guild discord link. | [optional] 
 **telegram** | **string**| Guild telegram link. | [optional] 
 **imgUrl** | **string**| URL for the profile image of the guild, is used by clients to add some color to the guild, if no image is provided, a default image is used | [optional] 
 **isPrivate** | **bool?**| Guild privacy status | [optional] 

### Return type

[**Guild**](Guild.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="guildsharetrades"></a>
# **GuildShareTrades**
> Object GuildShareTrades (bool? shareTrades)

Toggle share trades for your account, which controls whether your guild members can see your orders and positions in their UI

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class GuildShareTradesExample
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

            var apiInstance = new GuildApi();
            var shareTrades = true;  // bool? | 

            try
            {
                // Toggle share trades for your account, which controls whether your guild members can see your orders and positions in their UI
                Object result = apiInstance.GuildShareTrades(shareTrades);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling GuildApi.GuildShareTrades: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **shareTrades** | **bool?**|  | 

### Return type

**Object**

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

