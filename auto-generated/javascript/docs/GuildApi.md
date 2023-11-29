# BitMexApi.GuildApi

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
```javascript
var BitMexApi = require('bit_mex_api');
var defaultClient = BitMexApi.ApiClient.instance;

// Configure API key authorization: apiExpires
var apiExpires = defaultClient.authentications['apiExpires'];
apiExpires.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiExpires.apiKeyPrefix = 'Token';

// Configure API key authorization: apiKey
var apiKey = defaultClient.authentications['apiKey'];
apiKey.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.apiKeyPrefix = 'Token';

// Configure API key authorization: apiSignature
var apiSignature = defaultClient.authentications['apiSignature'];
apiSignature.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiSignature.apiKeyPrefix = 'Token';

var apiInstance = new BitMexApi.GuildApi();

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.guildArchive(callback);
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
> Guild guildEdit(name, emoji, potDistributionPercent, potDistributionType, opts)

Edit guild new guild

### Example
```javascript
var BitMexApi = require('bit_mex_api');
var defaultClient = BitMexApi.ApiClient.instance;

// Configure API key authorization: apiExpires
var apiExpires = defaultClient.authentications['apiExpires'];
apiExpires.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiExpires.apiKeyPrefix = 'Token';

// Configure API key authorization: apiKey
var apiKey = defaultClient.authentications['apiKey'];
apiKey.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.apiKeyPrefix = 'Token';

// Configure API key authorization: apiSignature
var apiSignature = defaultClient.authentications['apiSignature'];
apiSignature.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiSignature.apiKeyPrefix = 'Token';

var apiInstance = new BitMexApi.GuildApi();

var name = "name_example"; // String | Name of the guild, must be unique, must be at least 5 characters

var emoji = "emoji_example"; // String | Emoji name.

var potDistributionPercent = 1.2; // Number | How much of the pot should be distributed to the guild members, must be between 0 and 100

var potDistributionType = "potDistributionType_example"; // String | How the pot should be distributed to the guild members, must be one of the following: ROLL_OVER, TOP_3, TOP_5, TOP_10, VOLUME_PERCENTAGE, TOP_3_BY_ADV,TOP_5_BY_ADV,TOP_10_BY_ADV, RANDOM

var opts = { 
  'potTraderId': 1.2, // Number | User ID of the guild member with order write permission for the pot
  'description': "description_example", // String | Guild description, can be used to explain the guild to other users.
  'twitter': "twitter_example", // String | Guild twitter handle.
  'discord': "discord_example", // String | Guild discord link.
  'imgUrl': "imgUrl_example", // String | URL for the profile image of the guild, is used by clients to add some color to the guild, if no image is provided, a default image is used
  'isPrivate': true // Boolean | Guild privacy status
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.guildEdit(name, emoji, potDistributionPercent, potDistributionType, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Name of the guild, must be unique, must be at least 5 characters | 
 **emoji** | **String**| Emoji name. | 
 **potDistributionPercent** | **Number**| How much of the pot should be distributed to the guild members, must be between 0 and 100 | 
 **potDistributionType** | **String**| How the pot should be distributed to the guild members, must be one of the following: ROLL_OVER, TOP_3, TOP_5, TOP_10, VOLUME_PERCENTAGE, TOP_3_BY_ADV,TOP_5_BY_ADV,TOP_10_BY_ADV, RANDOM | 
 **potTraderId** | **Number**| User ID of the guild member with order write permission for the pot | [optional] 
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
> [XAny] guildGet()

Get all guilds

### Example
```javascript
var BitMexApi = require('bit_mex_api');

var apiInstance = new BitMexApi.GuildApi();

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.guildGet(callback);
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**[XAny]**](XAny.md)

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
```javascript
var BitMexApi = require('bit_mex_api');
var defaultClient = BitMexApi.ApiClient.instance;

// Configure API key authorization: apiExpires
var apiExpires = defaultClient.authentications['apiExpires'];
apiExpires.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiExpires.apiKeyPrefix = 'Token';

// Configure API key authorization: apiKey
var apiKey = defaultClient.authentications['apiKey'];
apiKey.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.apiKeyPrefix = 'Token';

// Configure API key authorization: apiSignature
var apiSignature = defaultClient.authentications['apiSignature'];
apiSignature.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiSignature.apiKeyPrefix = 'Token';

var apiInstance = new BitMexApi.GuildApi();

var code = "code_example"; // String | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.guildJoin(code, callback);
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
```javascript
var BitMexApi = require('bit_mex_api');
var defaultClient = BitMexApi.ApiClient.instance;

// Configure API key authorization: apiExpires
var apiExpires = defaultClient.authentications['apiExpires'];
apiExpires.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiExpires.apiKeyPrefix = 'Token';

// Configure API key authorization: apiKey
var apiKey = defaultClient.authentications['apiKey'];
apiKey.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.apiKeyPrefix = 'Token';

// Configure API key authorization: apiSignature
var apiSignature = defaultClient.authentications['apiSignature'];
apiSignature.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiSignature.apiKeyPrefix = 'Token';

var apiInstance = new BitMexApi.GuildApi();

var memberUserId = 1.2; // Number | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.guildKick(memberUserId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **memberUserId** | **Number**|  | 

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
```javascript
var BitMexApi = require('bit_mex_api');
var defaultClient = BitMexApi.ApiClient.instance;

// Configure API key authorization: apiExpires
var apiExpires = defaultClient.authentications['apiExpires'];
apiExpires.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiExpires.apiKeyPrefix = 'Token';

// Configure API key authorization: apiKey
var apiKey = defaultClient.authentications['apiKey'];
apiKey.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.apiKeyPrefix = 'Token';

// Configure API key authorization: apiSignature
var apiSignature = defaultClient.authentications['apiSignature'];
apiSignature.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiSignature.apiKeyPrefix = 'Token';

var apiInstance = new BitMexApi.GuildApi();

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.guildLeave(callback);
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
> Guild guildNew(name, emoji, potDistributionPercent, potDistributionType, opts)

Creates a new guild

### Example
```javascript
var BitMexApi = require('bit_mex_api');
var defaultClient = BitMexApi.ApiClient.instance;

// Configure API key authorization: apiExpires
var apiExpires = defaultClient.authentications['apiExpires'];
apiExpires.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiExpires.apiKeyPrefix = 'Token';

// Configure API key authorization: apiKey
var apiKey = defaultClient.authentications['apiKey'];
apiKey.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.apiKeyPrefix = 'Token';

// Configure API key authorization: apiSignature
var apiSignature = defaultClient.authentications['apiSignature'];
apiSignature.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiSignature.apiKeyPrefix = 'Token';

var apiInstance = new BitMexApi.GuildApi();

var name = "name_example"; // String | Name of the guild, must be unique, must be at least 5 characters

var emoji = "emoji_example"; // String | Emoji name.

var potDistributionPercent = 1.2; // Number | How much of the pot should be distributed to the guild members, must be between 0 and 100

var potDistributionType = "potDistributionType_example"; // String | How the pot should be distributed to the guild members, must be one of the following: ROLL_OVER, TOP_3, TOP_5, TOP_10, VOLUME_PERCENTAGE, TOP_3_BY_ADV,TOP_5_BY_ADV,TOP_10_BY_ADV, RANDOM

var opts = { 
  'description': "description_example", // String | Guild description, can be used to explain the guild to other users.
  'twitter': "twitter_example", // String | Guild twitter handle.
  'discord': "discord_example", // String | Guild discord link.
  'imgUrl': "imgUrl_example", // String | URL for the profile image of the guild, is used by clients to add some color to the guild, if no image is provided, a default image is used
  'isPrivate': true // Boolean | Guild privacy status
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.guildNew(name, emoji, potDistributionPercent, potDistributionType, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Name of the guild, must be unique, must be at least 5 characters | 
 **emoji** | **String**| Emoji name. | 
 **potDistributionPercent** | **Number**| How much of the pot should be distributed to the guild members, must be between 0 and 100 | 
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
```javascript
var BitMexApi = require('bit_mex_api');
var defaultClient = BitMexApi.ApiClient.instance;

// Configure API key authorization: apiExpires
var apiExpires = defaultClient.authentications['apiExpires'];
apiExpires.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiExpires.apiKeyPrefix = 'Token';

// Configure API key authorization: apiKey
var apiKey = defaultClient.authentications['apiKey'];
apiKey.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.apiKeyPrefix = 'Token';

// Configure API key authorization: apiSignature
var apiSignature = defaultClient.authentications['apiSignature'];
apiSignature.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiSignature.apiKeyPrefix = 'Token';

var apiInstance = new BitMexApi.GuildApi();

var shareTrades = true; // Boolean | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.guildShareTrades(shareTrades, callback);
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

