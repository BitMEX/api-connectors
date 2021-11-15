# \ChatApi

All URIs are relative to *https://www.bitmex.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ChatGet**](ChatApi.md#ChatGet) | **Get** /chat | Get chat messages.
[**ChatGetChannels**](ChatApi.md#ChatGetChannels) | **Get** /chat/channels | Get available channels.
[**ChatGetConnected**](ChatApi.md#ChatGetConnected) | **Get** /chat/connected | Get connected users.
[**ChatNew**](ChatApi.md#ChatNew) | **Post** /chat | Send a chat message.


# **ChatGet**
> []Chat ChatGet(ctx, optional)
Get chat messages.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***ChatApiChatGetOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a ChatApiChatGetOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **count** | **optional.Float32**| Number of results to fetch. | [default to 100]
 **start** | **optional.Float32**| Starting ID for results. | [default to 0]
 **reverse** | **optional.Bool**| If true, will sort results newest first. | [default to true]
 **channelID** | **optional.Float64**| Channel id. GET /chat/channels for ids. Leave blank for all. | 

### Return type

[**[]Chat**](Chat.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ChatGetChannels**
> []ChatChannel ChatGetChannels(ctx, )
Get available channels.

### Required Parameters
This endpoint does not need any parameter.

### Return type

[**[]ChatChannel**](ChatChannel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ChatGetConnected**
> ConnectedUsers ChatGetConnected(ctx, )
Get connected users.

Returns an array with browser users in the first position and API users (bots) in the second position.

### Required Parameters
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
> Chat ChatNew(ctx, message, optional)
Send a chat message.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **message** | **string**|  | 
 **optional** | ***ChatApiChatNewOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a ChatApiChatNewOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **channelID** | **optional.Float64**| Channel to post to. Default 1 (English). | [default to 1]

### Return type

[**Chat**](Chat.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

