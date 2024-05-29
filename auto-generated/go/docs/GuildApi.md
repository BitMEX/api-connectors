# \GuildApi

All URIs are relative to *https://www.bitmex.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GuildArchive**](GuildApi.md#GuildArchive) | **Post** /guild/archive | Archive a guild
[**GuildEdit**](GuildApi.md#GuildEdit) | **Put** /guild | Edit guild new guild
[**GuildGet**](GuildApi.md#GuildGet) | **Get** /guild | Get all guilds
[**GuildJoin**](GuildApi.md#GuildJoin) | **Post** /guild/join | Request to Join a private guild or join a public guild
[**GuildKick**](GuildApi.md#GuildKick) | **Post** /guild/kick | Kick member from guild
[**GuildLeave**](GuildApi.md#GuildLeave) | **Post** /guild/leave | Leave guild or cancel guild join request
[**GuildNew**](GuildApi.md#GuildNew) | **Post** /guild | Creates a new guild
[**GuildShareTrades**](GuildApi.md#GuildShareTrades) | **Post** /guild/shareTrades | Toggle share trades for your account, which controls whether your guild members can see your orders and positions in their UI


# **GuildArchive**
> interface{} GuildArchive(ctx, )
Archive a guild

### Required Parameters
This endpoint does not need any parameter.

### Return type

**interface{}**

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GuildEdit**
> Guild GuildEdit(ctx, name, emoji, potDistributionPercent, potDistributionType, optional)
Edit guild new guild

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **name** | **string**| Name of the guild, must be unique, must be at least 5 characters | 
  **emoji** | **string**| Emoji name. | 
  **potDistributionPercent** | **float64**| How much of the pot should be distributed to the guild members, must be between 0 and 100 | 
  **potDistributionType** | **string**| How the pot should be distributed to the guild members, must be one of the following: ROLL_OVER, TOP_3, TOP_5, TOP_10, VOLUME_PERCENTAGE, TOP_3_BY_ADV, TOP_5_BY_ADV, TOP_10_BY_ADV, TOP_3_BY_ROI, TOP_5_BY_ROI, TOP_10_BY_ROI, RANDOM | 
 **optional** | ***GuildApiGuildEditOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a GuildApiGuildEditOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------




 **potTraderId** | **optional.Float64**| User ID of the guild member with order write permission for the pot | 
 **description** | **optional.String**| Guild description, can be used to explain the guild to other users. | 
 **twitter** | **optional.String**| Guild twitter handle. | 
 **discord** | **optional.String**| Guild discord link. | 
 **telegram** | **optional.String**| Guild telegram link. | 
 **imgUrl** | **optional.String**| URL for the profile image of the guild, is used by clients to add some color to the guild, if no image is provided, a default image is used | 
 **isPrivate** | **optional.Bool**| Guild privacy status | 

### Return type

[**Guild**](Guild.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GuildGet**
> []XAny GuildGet(ctx, )
Get all guilds

### Required Parameters
This endpoint does not need any parameter.

### Return type

[**[]XAny**](x-any.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GuildJoin**
> interface{} GuildJoin(ctx, code)
Request to Join a private guild or join a public guild

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **code** | **string**|  | 

### Return type

**interface{}**

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GuildKick**
> interface{} GuildKick(ctx, memberUserId)
Kick member from guild

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **memberUserId** | **float64**|  | 

### Return type

**interface{}**

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GuildLeave**
> interface{} GuildLeave(ctx, )
Leave guild or cancel guild join request

### Required Parameters
This endpoint does not need any parameter.

### Return type

**interface{}**

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GuildNew**
> Guild GuildNew(ctx, name, emoji, potDistributionPercent, potDistributionType, optional)
Creates a new guild

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **name** | **string**| Name of the guild, must be unique, must be at least 5 characters | 
  **emoji** | **string**| Emoji name. | 
  **potDistributionPercent** | **float64**| How much of the pot should be distributed to the guild members, must be between 0 and 100 | 
  **potDistributionType** | **string**| How the pot should be distributed to the guild members, must be one of the following: ROLL_OVER, TOP_3, TOP_5, TOP_10, VOLUME_PERCENTAGE, TOP_3_BY_ADV, TOP_5_BY_ADV, TOP_10_BY_ADV, TOP_3_BY_ROI, TOP_5_BY_ROI, TOP_10_BY_ROI, RANDOM | 
 **optional** | ***GuildApiGuildNewOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a GuildApiGuildNewOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------




 **description** | **optional.String**| Guild description, can be used to explain the guild to other users. | 
 **twitter** | **optional.String**| Guild twitter handle. | 
 **discord** | **optional.String**| Guild discord link. | 
 **telegram** | **optional.String**| Guild telegram link. | 
 **imgUrl** | **optional.String**| URL for the profile image of the guild, is used by clients to add some color to the guild, if no image is provided, a default image is used | 
 **isPrivate** | **optional.Bool**| Guild privacy status | 

### Return type

[**Guild**](Guild.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GuildShareTrades**
> interface{} GuildShareTrades(ctx, shareTrades)
Toggle share trades for your account, which controls whether your guild members can see your orders and positions in their UI

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **shareTrades** | **bool**|  | 

### Return type

**interface{}**

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

