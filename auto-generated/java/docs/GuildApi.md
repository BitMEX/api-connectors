# GuildApi

All URIs are relative to *https://www.bitmex.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**guildArchive**](GuildApi.md#guildArchive) | **POST** /guild/archive | Archive a guild
[**guildEdit**](GuildApi.md#guildEdit) | **PUT** /guild | Edit guild new guild
[**guildGet**](GuildApi.md#guildGet) | **GET** /guild | Get all guilds
[**guildJoin**](GuildApi.md#guildJoin) | **POST** /guild/join | Request to Join a private guild or join a public guild
[**guildKick**](GuildApi.md#guildKick) | **POST** /guild/kick | Kick member from guild
[**guildLeave**](GuildApi.md#guildLeave) | **POST** /guild/leave | Leave guild or cancel guild join request
[**guildNew**](GuildApi.md#guildNew) | **POST** /guild | Creates a new guild
[**guildShareTrades**](GuildApi.md#guildShareTrades) | **POST** /guild/shareTrades | Toggle share trades for your account, which controls whether your guild members can see your orders and positions in their UI


<a name="guildArchive"></a>
# **guildArchive**
> Object guildArchive()

Archive a guild

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.GuildApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiExpires
ApiKeyAuth apiExpires = (ApiKeyAuth) defaultClient.getAuthentication("apiExpires");
apiExpires.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiExpires.setApiKeyPrefix("Token");

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

// Configure API key authorization: apiSignature
ApiKeyAuth apiSignature = (ApiKeyAuth) defaultClient.getAuthentication("apiSignature");
apiSignature.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiSignature.setApiKeyPrefix("Token");

GuildApi apiInstance = new GuildApi();
try {
    Object result = apiInstance.guildArchive();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GuildApi#guildArchive");
    e.printStackTrace();
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

<a name="guildEdit"></a>
# **guildEdit**
> Guild guildEdit(name, emoji, potDistributionPercent, potDistributionType, potTraderId, description, twitter, discord, imgUrl, isPrivate)

Edit guild new guild

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.GuildApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiExpires
ApiKeyAuth apiExpires = (ApiKeyAuth) defaultClient.getAuthentication("apiExpires");
apiExpires.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiExpires.setApiKeyPrefix("Token");

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

// Configure API key authorization: apiSignature
ApiKeyAuth apiSignature = (ApiKeyAuth) defaultClient.getAuthentication("apiSignature");
apiSignature.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiSignature.setApiKeyPrefix("Token");

GuildApi apiInstance = new GuildApi();
String name = "name_example"; // String | Name of the guild, must be unique, must be at least 5 characters
String emoji = "emoji_example"; // String | Emoji name.
Double potDistributionPercent = 3.4D; // Double | How much of the pot should be distributed to the guild members, must be between 0 and 100
String potDistributionType = "potDistributionType_example"; // String | How the pot should be distributed to the guild members, must be one of the following: ROLL_OVER, TOP_3, TOP_5, TOP_10, VOLUME_PERCENTAGE, TOP_3_BY_ADV,TOP_5_BY_ADV,TOP_10_BY_ADV, RANDOM
Double potTraderId = 3.4D; // Double | User ID of the guild member with order write permission for the pot
String description = "description_example"; // String | Guild description, can be used to explain the guild to other users.
String twitter = "twitter_example"; // String | Guild twitter handle.
String discord = "discord_example"; // String | Guild discord link.
String imgUrl = "imgUrl_example"; // String | URL for the profile image of the guild, is used by clients to add some color to the guild, if no image is provided, a default image is used
Boolean isPrivate = true; // Boolean | Guild privacy status
try {
    Guild result = apiInstance.guildEdit(name, emoji, potDistributionPercent, potDistributionType, potTraderId, description, twitter, discord, imgUrl, isPrivate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GuildApi#guildEdit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Name of the guild, must be unique, must be at least 5 characters |
 **emoji** | **String**| Emoji name. |
 **potDistributionPercent** | **Double**| How much of the pot should be distributed to the guild members, must be between 0 and 100 |
 **potDistributionType** | **String**| How the pot should be distributed to the guild members, must be one of the following: ROLL_OVER, TOP_3, TOP_5, TOP_10, VOLUME_PERCENTAGE, TOP_3_BY_ADV,TOP_5_BY_ADV,TOP_10_BY_ADV, RANDOM |
 **potTraderId** | **Double**| User ID of the guild member with order write permission for the pot | [optional]
 **description** | **String**| Guild description, can be used to explain the guild to other users. | [optional]
 **twitter** | **String**| Guild twitter handle. | [optional]
 **discord** | **String**| Guild discord link. | [optional]
 **imgUrl** | **String**| URL for the profile image of the guild, is used by clients to add some color to the guild, if no image is provided, a default image is used | [optional]
 **isPrivate** | **Boolean**| Guild privacy status | [optional]

### Return type

[**Guild**](Guild.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="guildGet"></a>
# **guildGet**
> List&lt;XAny&gt; guildGet()

Get all guilds

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.GuildApi;


GuildApi apiInstance = new GuildApi();
try {
    List<XAny> result = apiInstance.guildGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GuildApi#guildGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;XAny&gt;**](XAny.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="guildJoin"></a>
# **guildJoin**
> Object guildJoin(code)

Request to Join a private guild or join a public guild

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.GuildApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiExpires
ApiKeyAuth apiExpires = (ApiKeyAuth) defaultClient.getAuthentication("apiExpires");
apiExpires.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiExpires.setApiKeyPrefix("Token");

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

// Configure API key authorization: apiSignature
ApiKeyAuth apiSignature = (ApiKeyAuth) defaultClient.getAuthentication("apiSignature");
apiSignature.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiSignature.setApiKeyPrefix("Token");

GuildApi apiInstance = new GuildApi();
String code = "code_example"; // String | 
try {
    Object result = apiInstance.guildJoin(code);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GuildApi#guildJoin");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **String**|  |

### Return type

**Object**

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="guildKick"></a>
# **guildKick**
> Object guildKick(memberUserId)

Kick member from guild

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.GuildApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiExpires
ApiKeyAuth apiExpires = (ApiKeyAuth) defaultClient.getAuthentication("apiExpires");
apiExpires.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiExpires.setApiKeyPrefix("Token");

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

// Configure API key authorization: apiSignature
ApiKeyAuth apiSignature = (ApiKeyAuth) defaultClient.getAuthentication("apiSignature");
apiSignature.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiSignature.setApiKeyPrefix("Token");

GuildApi apiInstance = new GuildApi();
Double memberUserId = 3.4D; // Double | 
try {
    Object result = apiInstance.guildKick(memberUserId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GuildApi#guildKick");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **memberUserId** | **Double**|  |

### Return type

**Object**

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="guildLeave"></a>
# **guildLeave**
> Object guildLeave()

Leave guild or cancel guild join request

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.GuildApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiExpires
ApiKeyAuth apiExpires = (ApiKeyAuth) defaultClient.getAuthentication("apiExpires");
apiExpires.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiExpires.setApiKeyPrefix("Token");

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

// Configure API key authorization: apiSignature
ApiKeyAuth apiSignature = (ApiKeyAuth) defaultClient.getAuthentication("apiSignature");
apiSignature.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiSignature.setApiKeyPrefix("Token");

GuildApi apiInstance = new GuildApi();
try {
    Object result = apiInstance.guildLeave();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GuildApi#guildLeave");
    e.printStackTrace();
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

<a name="guildNew"></a>
# **guildNew**
> Guild guildNew(name, emoji, potDistributionPercent, potDistributionType, description, twitter, discord, imgUrl, isPrivate)

Creates a new guild

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.GuildApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiExpires
ApiKeyAuth apiExpires = (ApiKeyAuth) defaultClient.getAuthentication("apiExpires");
apiExpires.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiExpires.setApiKeyPrefix("Token");

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

// Configure API key authorization: apiSignature
ApiKeyAuth apiSignature = (ApiKeyAuth) defaultClient.getAuthentication("apiSignature");
apiSignature.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiSignature.setApiKeyPrefix("Token");

GuildApi apiInstance = new GuildApi();
String name = "name_example"; // String | Name of the guild, must be unique, must be at least 5 characters
String emoji = "emoji_example"; // String | Emoji name.
Double potDistributionPercent = 3.4D; // Double | How much of the pot should be distributed to the guild members, must be between 0 and 100
String potDistributionType = "potDistributionType_example"; // String | How the pot should be distributed to the guild members, must be one of the following: ROLL_OVER, TOP_3, TOP_5, TOP_10, VOLUME_PERCENTAGE, TOP_3_BY_ADV,TOP_5_BY_ADV,TOP_10_BY_ADV, RANDOM
String description = "description_example"; // String | Guild description, can be used to explain the guild to other users.
String twitter = "twitter_example"; // String | Guild twitter handle.
String discord = "discord_example"; // String | Guild discord link.
String imgUrl = "imgUrl_example"; // String | URL for the profile image of the guild, is used by clients to add some color to the guild, if no image is provided, a default image is used
Boolean isPrivate = true; // Boolean | Guild privacy status
try {
    Guild result = apiInstance.guildNew(name, emoji, potDistributionPercent, potDistributionType, description, twitter, discord, imgUrl, isPrivate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GuildApi#guildNew");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Name of the guild, must be unique, must be at least 5 characters |
 **emoji** | **String**| Emoji name. |
 **potDistributionPercent** | **Double**| How much of the pot should be distributed to the guild members, must be between 0 and 100 |
 **potDistributionType** | **String**| How the pot should be distributed to the guild members, must be one of the following: ROLL_OVER, TOP_3, TOP_5, TOP_10, VOLUME_PERCENTAGE, TOP_3_BY_ADV,TOP_5_BY_ADV,TOP_10_BY_ADV, RANDOM |
 **description** | **String**| Guild description, can be used to explain the guild to other users. | [optional]
 **twitter** | **String**| Guild twitter handle. | [optional]
 **discord** | **String**| Guild discord link. | [optional]
 **imgUrl** | **String**| URL for the profile image of the guild, is used by clients to add some color to the guild, if no image is provided, a default image is used | [optional]
 **isPrivate** | **Boolean**| Guild privacy status | [optional]

### Return type

[**Guild**](Guild.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="guildShareTrades"></a>
# **guildShareTrades**
> Object guildShareTrades(shareTrades)

Toggle share trades for your account, which controls whether your guild members can see your orders and positions in their UI

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.GuildApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiExpires
ApiKeyAuth apiExpires = (ApiKeyAuth) defaultClient.getAuthentication("apiExpires");
apiExpires.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiExpires.setApiKeyPrefix("Token");

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

// Configure API key authorization: apiSignature
ApiKeyAuth apiSignature = (ApiKeyAuth) defaultClient.getAuthentication("apiSignature");
apiSignature.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiSignature.setApiKeyPrefix("Token");

GuildApi apiInstance = new GuildApi();
Boolean shareTrades = true; // Boolean | 
try {
    Object result = apiInstance.guildShareTrades(shareTrades);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GuildApi#guildShareTrades");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **shareTrades** | **Boolean**|  |

### Return type

**Object**

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

