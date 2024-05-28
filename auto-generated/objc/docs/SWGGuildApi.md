# SWGGuildApi

All URIs are relative to *https://www.bitmex.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**guildArchive**](SWGGuildApi.md#guildarchive) | **POST** /guild/archive | Archive a guild
[**guildEdit**](SWGGuildApi.md#guildedit) | **PUT** /guild | Edit guild new guild
[**guildGet**](SWGGuildApi.md#guildget) | **GET** /guild | Get all guilds
[**guildJoin**](SWGGuildApi.md#guildjoin) | **POST** /guild/join | Request to Join a private guild or join a public guild
[**guildKick**](SWGGuildApi.md#guildkick) | **POST** /guild/kick | Kick member from guild
[**guildLeave**](SWGGuildApi.md#guildleave) | **POST** /guild/leave | Leave guild or cancel guild join request
[**guildNew**](SWGGuildApi.md#guildnew) | **POST** /guild | Creates a new guild
[**guildShareTrades**](SWGGuildApi.md#guildsharetrades) | **POST** /guild/shareTrades | Toggle share trades for your account, which controls whether your guild members can see your orders and positions in their UI


# **guildArchive**
```objc
-(NSURLSessionTask*) guildArchiveWithCompletionHandler: 
        (void (^)(NSObject* output, NSError* error)) handler;
```

Archive a guild

### Example 
```objc
SWGDefaultConfiguration *apiConfig = [SWGDefaultConfiguration sharedConfig];

// Configure API key authorization: (authentication scheme: apiExpires)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"api-expires"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"api-expires"];

// Configure API key authorization: (authentication scheme: apiKey)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"api-key"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"api-key"];

// Configure API key authorization: (authentication scheme: apiSignature)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"api-signature"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"api-signature"];



SWGGuildApi*apiInstance = [[SWGGuildApi alloc] init];

// Archive a guild
[apiInstance guildArchiveWithCompletionHandler: 
          ^(NSObject* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGGuildApi->guildArchive: %@", error);
                        }
                    }];
```

### Parameters
This endpoint does not need any parameter.

### Return type

**NSObject***

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **guildEdit**
```objc
-(NSURLSessionTask*) guildEditWithName: (NSString*) name
    emoji: (NSString*) emoji
    potDistributionPercent: (NSNumber*) potDistributionPercent
    potDistributionType: (NSString*) potDistributionType
    potTraderId: (NSNumber*) potTraderId
    _description: (NSString*) _description
    twitter: (NSString*) twitter
    discord: (NSString*) discord
    telegram: (NSString*) telegram
    imgUrl: (NSString*) imgUrl
    isPrivate: (NSNumber*) isPrivate
        completionHandler: (void (^)(SWGGuild* output, NSError* error)) handler;
```

Edit guild new guild

### Example 
```objc
SWGDefaultConfiguration *apiConfig = [SWGDefaultConfiguration sharedConfig];

// Configure API key authorization: (authentication scheme: apiExpires)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"api-expires"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"api-expires"];

// Configure API key authorization: (authentication scheme: apiKey)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"api-key"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"api-key"];

// Configure API key authorization: (authentication scheme: apiSignature)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"api-signature"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"api-signature"];


NSString* name = @"name_example"; // Name of the guild, must be unique, must be at least 5 characters
NSString* emoji = @"emoji_example"; // Emoji name.
NSNumber* potDistributionPercent = @1.2; // How much of the pot should be distributed to the guild members, must be between 0 and 100
NSString* potDistributionType = @"potDistributionType_example"; // How the pot should be distributed to the guild members, must be one of the following: ROLL_OVER, TOP_3, TOP_5, TOP_10, VOLUME_PERCENTAGE, TOP_3_BY_ADV, TOP_5_BY_ADV, TOP_10_BY_ADV, TOP_3_BY_ROI, TOP_5_BY_ROI, TOP_10_BY_ROI, RANDOM
NSNumber* potTraderId = @1.2; // User ID of the guild member with order write permission for the pot (optional)
NSString* _description = @"_description_example"; // Guild description, can be used to explain the guild to other users. (optional)
NSString* twitter = @"twitter_example"; // Guild twitter handle. (optional)
NSString* discord = @"discord_example"; // Guild discord link. (optional)
NSString* telegram = @"telegram_example"; // Guild telegram link. (optional)
NSString* imgUrl = @"imgUrl_example"; // URL for the profile image of the guild, is used by clients to add some color to the guild, if no image is provided, a default image is used (optional)
NSNumber* isPrivate = @true; // Guild privacy status (optional)

SWGGuildApi*apiInstance = [[SWGGuildApi alloc] init];

// Edit guild new guild
[apiInstance guildEditWithName:name
              emoji:emoji
              potDistributionPercent:potDistributionPercent
              potDistributionType:potDistributionType
              potTraderId:potTraderId
              _description:_description
              twitter:twitter
              discord:discord
              telegram:telegram
              imgUrl:imgUrl
              isPrivate:isPrivate
          completionHandler: ^(SWGGuild* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGGuildApi->guildEdit: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **NSString***| Name of the guild, must be unique, must be at least 5 characters | 
 **emoji** | **NSString***| Emoji name. | 
 **potDistributionPercent** | **NSNumber***| How much of the pot should be distributed to the guild members, must be between 0 and 100 | 
 **potDistributionType** | **NSString***| How the pot should be distributed to the guild members, must be one of the following: ROLL_OVER, TOP_3, TOP_5, TOP_10, VOLUME_PERCENTAGE, TOP_3_BY_ADV, TOP_5_BY_ADV, TOP_10_BY_ADV, TOP_3_BY_ROI, TOP_5_BY_ROI, TOP_10_BY_ROI, RANDOM | 
 **potTraderId** | **NSNumber***| User ID of the guild member with order write permission for the pot | [optional] 
 **_description** | **NSString***| Guild description, can be used to explain the guild to other users. | [optional] 
 **twitter** | **NSString***| Guild twitter handle. | [optional] 
 **discord** | **NSString***| Guild discord link. | [optional] 
 **telegram** | **NSString***| Guild telegram link. | [optional] 
 **imgUrl** | **NSString***| URL for the profile image of the guild, is used by clients to add some color to the guild, if no image is provided, a default image is used | [optional] 
 **isPrivate** | **NSNumber***| Guild privacy status | [optional] 

### Return type

[**SWGGuild***](SWGGuild.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **guildGet**
```objc
-(NSURLSessionTask*) guildGetWithCompletionHandler: 
        (void (^)(NSArray<SWGXAny>* output, NSError* error)) handler;
```

Get all guilds

### Example 
```objc


SWGGuildApi*apiInstance = [[SWGGuildApi alloc] init];

// Get all guilds
[apiInstance guildGetWithCompletionHandler: 
          ^(NSArray<SWGXAny>* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGGuildApi->guildGet: %@", error);
                        }
                    }];
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**NSArray<SWGXAny>***](SWGXAny.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **guildJoin**
```objc
-(NSURLSessionTask*) guildJoinWithCode: (NSString*) code
        completionHandler: (void (^)(NSObject* output, NSError* error)) handler;
```

Request to Join a private guild or join a public guild

### Example 
```objc
SWGDefaultConfiguration *apiConfig = [SWGDefaultConfiguration sharedConfig];

// Configure API key authorization: (authentication scheme: apiExpires)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"api-expires"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"api-expires"];

// Configure API key authorization: (authentication scheme: apiKey)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"api-key"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"api-key"];

// Configure API key authorization: (authentication scheme: apiSignature)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"api-signature"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"api-signature"];


NSString* code = @"code_example"; // 

SWGGuildApi*apiInstance = [[SWGGuildApi alloc] init];

// Request to Join a private guild or join a public guild
[apiInstance guildJoinWithCode:code
          completionHandler: ^(NSObject* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGGuildApi->guildJoin: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **NSString***|  | 

### Return type

**NSObject***

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **guildKick**
```objc
-(NSURLSessionTask*) guildKickWithMemberUserId: (NSNumber*) memberUserId
        completionHandler: (void (^)(NSObject* output, NSError* error)) handler;
```

Kick member from guild

### Example 
```objc
SWGDefaultConfiguration *apiConfig = [SWGDefaultConfiguration sharedConfig];

// Configure API key authorization: (authentication scheme: apiExpires)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"api-expires"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"api-expires"];

// Configure API key authorization: (authentication scheme: apiKey)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"api-key"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"api-key"];

// Configure API key authorization: (authentication scheme: apiSignature)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"api-signature"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"api-signature"];


NSNumber* memberUserId = @1.2; // 

SWGGuildApi*apiInstance = [[SWGGuildApi alloc] init];

// Kick member from guild
[apiInstance guildKickWithMemberUserId:memberUserId
          completionHandler: ^(NSObject* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGGuildApi->guildKick: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **memberUserId** | **NSNumber***|  | 

### Return type

**NSObject***

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **guildLeave**
```objc
-(NSURLSessionTask*) guildLeaveWithCompletionHandler: 
        (void (^)(NSObject* output, NSError* error)) handler;
```

Leave guild or cancel guild join request

### Example 
```objc
SWGDefaultConfiguration *apiConfig = [SWGDefaultConfiguration sharedConfig];

// Configure API key authorization: (authentication scheme: apiExpires)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"api-expires"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"api-expires"];

// Configure API key authorization: (authentication scheme: apiKey)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"api-key"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"api-key"];

// Configure API key authorization: (authentication scheme: apiSignature)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"api-signature"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"api-signature"];



SWGGuildApi*apiInstance = [[SWGGuildApi alloc] init];

// Leave guild or cancel guild join request
[apiInstance guildLeaveWithCompletionHandler: 
          ^(NSObject* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGGuildApi->guildLeave: %@", error);
                        }
                    }];
```

### Parameters
This endpoint does not need any parameter.

### Return type

**NSObject***

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **guildNew**
```objc
-(NSURLSessionTask*) guildNewWithName: (NSString*) name
    emoji: (NSString*) emoji
    potDistributionPercent: (NSNumber*) potDistributionPercent
    potDistributionType: (NSString*) potDistributionType
    _description: (NSString*) _description
    twitter: (NSString*) twitter
    discord: (NSString*) discord
    telegram: (NSString*) telegram
    imgUrl: (NSString*) imgUrl
    isPrivate: (NSNumber*) isPrivate
        completionHandler: (void (^)(SWGGuild* output, NSError* error)) handler;
```

Creates a new guild

### Example 
```objc
SWGDefaultConfiguration *apiConfig = [SWGDefaultConfiguration sharedConfig];

// Configure API key authorization: (authentication scheme: apiExpires)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"api-expires"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"api-expires"];

// Configure API key authorization: (authentication scheme: apiKey)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"api-key"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"api-key"];

// Configure API key authorization: (authentication scheme: apiSignature)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"api-signature"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"api-signature"];


NSString* name = @"name_example"; // Name of the guild, must be unique, must be at least 5 characters
NSString* emoji = @"emoji_example"; // Emoji name.
NSNumber* potDistributionPercent = @1.2; // How much of the pot should be distributed to the guild members, must be between 0 and 100
NSString* potDistributionType = @"potDistributionType_example"; // How the pot should be distributed to the guild members, must be one of the following: ROLL_OVER, TOP_3, TOP_5, TOP_10, VOLUME_PERCENTAGE, TOP_3_BY_ADV, TOP_5_BY_ADV, TOP_10_BY_ADV, TOP_3_BY_ROI, TOP_5_BY_ROI, TOP_10_BY_ROI, RANDOM
NSString* _description = @"_description_example"; // Guild description, can be used to explain the guild to other users. (optional)
NSString* twitter = @"twitter_example"; // Guild twitter handle. (optional)
NSString* discord = @"discord_example"; // Guild discord link. (optional)
NSString* telegram = @"telegram_example"; // Guild telegram link. (optional)
NSString* imgUrl = @"imgUrl_example"; // URL for the profile image of the guild, is used by clients to add some color to the guild, if no image is provided, a default image is used (optional)
NSNumber* isPrivate = @true; // Guild privacy status (optional)

SWGGuildApi*apiInstance = [[SWGGuildApi alloc] init];

// Creates a new guild
[apiInstance guildNewWithName:name
              emoji:emoji
              potDistributionPercent:potDistributionPercent
              potDistributionType:potDistributionType
              _description:_description
              twitter:twitter
              discord:discord
              telegram:telegram
              imgUrl:imgUrl
              isPrivate:isPrivate
          completionHandler: ^(SWGGuild* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGGuildApi->guildNew: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **NSString***| Name of the guild, must be unique, must be at least 5 characters | 
 **emoji** | **NSString***| Emoji name. | 
 **potDistributionPercent** | **NSNumber***| How much of the pot should be distributed to the guild members, must be between 0 and 100 | 
 **potDistributionType** | **NSString***| How the pot should be distributed to the guild members, must be one of the following: ROLL_OVER, TOP_3, TOP_5, TOP_10, VOLUME_PERCENTAGE, TOP_3_BY_ADV, TOP_5_BY_ADV, TOP_10_BY_ADV, TOP_3_BY_ROI, TOP_5_BY_ROI, TOP_10_BY_ROI, RANDOM | 
 **_description** | **NSString***| Guild description, can be used to explain the guild to other users. | [optional] 
 **twitter** | **NSString***| Guild twitter handle. | [optional] 
 **discord** | **NSString***| Guild discord link. | [optional] 
 **telegram** | **NSString***| Guild telegram link. | [optional] 
 **imgUrl** | **NSString***| URL for the profile image of the guild, is used by clients to add some color to the guild, if no image is provided, a default image is used | [optional] 
 **isPrivate** | **NSNumber***| Guild privacy status | [optional] 

### Return type

[**SWGGuild***](SWGGuild.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **guildShareTrades**
```objc
-(NSURLSessionTask*) guildShareTradesWithShareTrades: (NSNumber*) shareTrades
        completionHandler: (void (^)(NSObject* output, NSError* error)) handler;
```

Toggle share trades for your account, which controls whether your guild members can see your orders and positions in their UI

### Example 
```objc
SWGDefaultConfiguration *apiConfig = [SWGDefaultConfiguration sharedConfig];

// Configure API key authorization: (authentication scheme: apiExpires)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"api-expires"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"api-expires"];

// Configure API key authorization: (authentication scheme: apiKey)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"api-key"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"api-key"];

// Configure API key authorization: (authentication scheme: apiSignature)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"api-signature"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"api-signature"];


NSNumber* shareTrades = @true; // 

SWGGuildApi*apiInstance = [[SWGGuildApi alloc] init];

// Toggle share trades for your account, which controls whether your guild members can see your orders and positions in their UI
[apiInstance guildShareTradesWithShareTrades:shareTrades
          completionHandler: ^(NSObject* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGGuildApi->guildShareTrades: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **shareTrades** | **NSNumber***|  | 

### Return type

**NSObject***

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

