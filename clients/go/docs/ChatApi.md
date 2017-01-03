# \ChatApi

All URIs are relative to *https://localhost/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ChatGet**](ChatApi.md#ChatGet) | **Get** /chat | Get chat messages.
[**ChatGetChannels**](ChatApi.md#ChatGetChannels) | **Get** /chat/channels | Get available channels.
[**ChatGetConnected**](ChatApi.md#ChatGetConnected) | **Get** /chat/connected | Get connected users.
[**ChatNew**](ChatApi.md#ChatNew) | **Post** /chat | Send a chat message.


# **ChatGet**
> []Chat ChatGet($count, $start, $reverse, $channelID)

Get chat messages.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **count** | **float32**| Number of results to fetch. | [optional] [default to 100]
 **start** | **float32**| Starting point for results. | [optional] [default to 0]
 **reverse** | **bool**| If true, will sort results newest first. | [optional] [default to true]
 **channelID** | **float64**| Channel id. GET /chat/channels for ids. Leave blank for all. | [optional] 

### Return type

[**[]Chat**](Chat.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ChatGetChannels**
> []ChatChannel ChatGetChannels()

Get available channels.


### Parameters
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
> ConnectedUsers ChatGetConnected()

Get connected users.

Returns an array with browser users in the first position and API users (bots) in the second position.


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
> Chat ChatNew($message, $channelID)

Send a chat message.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **message** | **string**|  | 
 **channelID** | **float64**| Channel to post to. Default 1 (English). | [optional] [default to 1]

### Return type

[**Chat**](Chat.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

