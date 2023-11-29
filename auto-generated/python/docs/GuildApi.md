# swagger_client.GuildApi

All URIs are relative to *https://www.bitmex.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**guild_archive**](GuildApi.md#guild_archive) | **POST** /guild/archive | Archive a guild
[**guild_edit**](GuildApi.md#guild_edit) | **PUT** /guild | Edit guild new guild
[**guild_get**](GuildApi.md#guild_get) | **GET** /guild | Get all guilds
[**guild_join**](GuildApi.md#guild_join) | **POST** /guild/join | Request to Join a private guild or join a public guild
[**guild_kick**](GuildApi.md#guild_kick) | **POST** /guild/kick | Kick member from guild
[**guild_leave**](GuildApi.md#guild_leave) | **POST** /guild/leave | Leave guild or cancel guild join request
[**guild_new**](GuildApi.md#guild_new) | **POST** /guild | Creates a new guild
[**guild_share_trades**](GuildApi.md#guild_share_trades) | **POST** /guild/shareTrades | Toggle share trades for your account, which controls whether your guild members can see your orders and positions in their UI


# **guild_archive**
> object guild_archive()

Archive a guild

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# Configure API key authorization: apiExpires
configuration = swagger_client.Configuration()
configuration.api_key['api-expires'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['api-expires'] = 'Bearer'
# Configure API key authorization: apiKey
configuration = swagger_client.Configuration()
configuration.api_key['api-key'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['api-key'] = 'Bearer'
# Configure API key authorization: apiSignature
configuration = swagger_client.Configuration()
configuration.api_key['api-signature'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['api-signature'] = 'Bearer'

# create an instance of the API class
api_instance = swagger_client.GuildApi(swagger_client.ApiClient(configuration))

try:
    # Archive a guild
    api_response = api_instance.guild_archive()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling GuildApi->guild_archive: %s\n" % e)
```

### Parameters
This endpoint does not need any parameter.

### Return type

**object**

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **guild_edit**
> Guild guild_edit(name, emoji, pot_distribution_percent, pot_distribution_type, pot_trader_id=pot_trader_id, description=description, twitter=twitter, discord=discord, img_url=img_url, is_private=is_private)

Edit guild new guild

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# Configure API key authorization: apiExpires
configuration = swagger_client.Configuration()
configuration.api_key['api-expires'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['api-expires'] = 'Bearer'
# Configure API key authorization: apiKey
configuration = swagger_client.Configuration()
configuration.api_key['api-key'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['api-key'] = 'Bearer'
# Configure API key authorization: apiSignature
configuration = swagger_client.Configuration()
configuration.api_key['api-signature'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['api-signature'] = 'Bearer'

# create an instance of the API class
api_instance = swagger_client.GuildApi(swagger_client.ApiClient(configuration))
name = 'name_example' # str | Name of the guild, must be unique, must be at least 5 characters
emoji = 'emoji_example' # str | Emoji name.
pot_distribution_percent = 1.2 # float | How much of the pot should be distributed to the guild members, must be between 0 and 100
pot_distribution_type = 'pot_distribution_type_example' # str | How the pot should be distributed to the guild members, must be one of the following: ROLL_OVER, TOP_3, TOP_5, TOP_10, VOLUME_PERCENTAGE, TOP_3_BY_ADV,TOP_5_BY_ADV,TOP_10_BY_ADV, RANDOM
pot_trader_id = 1.2 # float | User ID of the guild member with order write permission for the pot (optional)
description = 'description_example' # str | Guild description, can be used to explain the guild to other users. (optional)
twitter = 'twitter_example' # str | Guild twitter handle. (optional)
discord = 'discord_example' # str | Guild discord link. (optional)
img_url = 'img_url_example' # str | URL for the profile image of the guild, is used by clients to add some color to the guild, if no image is provided, a default image is used (optional)
is_private = true # bool | Guild privacy status (optional)

try:
    # Edit guild new guild
    api_response = api_instance.guild_edit(name, emoji, pot_distribution_percent, pot_distribution_type, pot_trader_id=pot_trader_id, description=description, twitter=twitter, discord=discord, img_url=img_url, is_private=is_private)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling GuildApi->guild_edit: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **str**| Name of the guild, must be unique, must be at least 5 characters | 
 **emoji** | **str**| Emoji name. | 
 **pot_distribution_percent** | **float**| How much of the pot should be distributed to the guild members, must be between 0 and 100 | 
 **pot_distribution_type** | **str**| How the pot should be distributed to the guild members, must be one of the following: ROLL_OVER, TOP_3, TOP_5, TOP_10, VOLUME_PERCENTAGE, TOP_3_BY_ADV,TOP_5_BY_ADV,TOP_10_BY_ADV, RANDOM | 
 **pot_trader_id** | **float**| User ID of the guild member with order write permission for the pot | [optional] 
 **description** | **str**| Guild description, can be used to explain the guild to other users. | [optional] 
 **twitter** | **str**| Guild twitter handle. | [optional] 
 **discord** | **str**| Guild discord link. | [optional] 
 **img_url** | **str**| URL for the profile image of the guild, is used by clients to add some color to the guild, if no image is provided, a default image is used | [optional] 
 **is_private** | **bool**| Guild privacy status | [optional] 

### Return type

[**Guild**](Guild.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **guild_get**
> list[XAny] guild_get()

Get all guilds

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.GuildApi()

try:
    # Get all guilds
    api_response = api_instance.guild_get()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling GuildApi->guild_get: %s\n" % e)
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**list[XAny]**](XAny.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **guild_join**
> object guild_join(code)

Request to Join a private guild or join a public guild

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# Configure API key authorization: apiExpires
configuration = swagger_client.Configuration()
configuration.api_key['api-expires'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['api-expires'] = 'Bearer'
# Configure API key authorization: apiKey
configuration = swagger_client.Configuration()
configuration.api_key['api-key'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['api-key'] = 'Bearer'
# Configure API key authorization: apiSignature
configuration = swagger_client.Configuration()
configuration.api_key['api-signature'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['api-signature'] = 'Bearer'

# create an instance of the API class
api_instance = swagger_client.GuildApi(swagger_client.ApiClient(configuration))
code = 'code_example' # str | 

try:
    # Request to Join a private guild or join a public guild
    api_response = api_instance.guild_join(code)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling GuildApi->guild_join: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **str**|  | 

### Return type

**object**

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **guild_kick**
> object guild_kick(member_user_id)

Kick member from guild

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# Configure API key authorization: apiExpires
configuration = swagger_client.Configuration()
configuration.api_key['api-expires'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['api-expires'] = 'Bearer'
# Configure API key authorization: apiKey
configuration = swagger_client.Configuration()
configuration.api_key['api-key'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['api-key'] = 'Bearer'
# Configure API key authorization: apiSignature
configuration = swagger_client.Configuration()
configuration.api_key['api-signature'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['api-signature'] = 'Bearer'

# create an instance of the API class
api_instance = swagger_client.GuildApi(swagger_client.ApiClient(configuration))
member_user_id = 1.2 # float | 

try:
    # Kick member from guild
    api_response = api_instance.guild_kick(member_user_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling GuildApi->guild_kick: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **member_user_id** | **float**|  | 

### Return type

**object**

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **guild_leave**
> object guild_leave()

Leave guild or cancel guild join request

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# Configure API key authorization: apiExpires
configuration = swagger_client.Configuration()
configuration.api_key['api-expires'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['api-expires'] = 'Bearer'
# Configure API key authorization: apiKey
configuration = swagger_client.Configuration()
configuration.api_key['api-key'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['api-key'] = 'Bearer'
# Configure API key authorization: apiSignature
configuration = swagger_client.Configuration()
configuration.api_key['api-signature'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['api-signature'] = 'Bearer'

# create an instance of the API class
api_instance = swagger_client.GuildApi(swagger_client.ApiClient(configuration))

try:
    # Leave guild or cancel guild join request
    api_response = api_instance.guild_leave()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling GuildApi->guild_leave: %s\n" % e)
```

### Parameters
This endpoint does not need any parameter.

### Return type

**object**

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **guild_new**
> Guild guild_new(name, emoji, pot_distribution_percent, pot_distribution_type, description=description, twitter=twitter, discord=discord, img_url=img_url, is_private=is_private)

Creates a new guild

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# Configure API key authorization: apiExpires
configuration = swagger_client.Configuration()
configuration.api_key['api-expires'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['api-expires'] = 'Bearer'
# Configure API key authorization: apiKey
configuration = swagger_client.Configuration()
configuration.api_key['api-key'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['api-key'] = 'Bearer'
# Configure API key authorization: apiSignature
configuration = swagger_client.Configuration()
configuration.api_key['api-signature'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['api-signature'] = 'Bearer'

# create an instance of the API class
api_instance = swagger_client.GuildApi(swagger_client.ApiClient(configuration))
name = 'name_example' # str | Name of the guild, must be unique, must be at least 5 characters
emoji = 'emoji_example' # str | Emoji name.
pot_distribution_percent = 1.2 # float | How much of the pot should be distributed to the guild members, must be between 0 and 100
pot_distribution_type = 'pot_distribution_type_example' # str | How the pot should be distributed to the guild members, must be one of the following: ROLL_OVER, TOP_3, TOP_5, TOP_10, VOLUME_PERCENTAGE, TOP_3_BY_ADV,TOP_5_BY_ADV,TOP_10_BY_ADV, RANDOM
description = 'description_example' # str | Guild description, can be used to explain the guild to other users. (optional)
twitter = 'twitter_example' # str | Guild twitter handle. (optional)
discord = 'discord_example' # str | Guild discord link. (optional)
img_url = 'img_url_example' # str | URL for the profile image of the guild, is used by clients to add some color to the guild, if no image is provided, a default image is used (optional)
is_private = true # bool | Guild privacy status (optional)

try:
    # Creates a new guild
    api_response = api_instance.guild_new(name, emoji, pot_distribution_percent, pot_distribution_type, description=description, twitter=twitter, discord=discord, img_url=img_url, is_private=is_private)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling GuildApi->guild_new: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **str**| Name of the guild, must be unique, must be at least 5 characters | 
 **emoji** | **str**| Emoji name. | 
 **pot_distribution_percent** | **float**| How much of the pot should be distributed to the guild members, must be between 0 and 100 | 
 **pot_distribution_type** | **str**| How the pot should be distributed to the guild members, must be one of the following: ROLL_OVER, TOP_3, TOP_5, TOP_10, VOLUME_PERCENTAGE, TOP_3_BY_ADV,TOP_5_BY_ADV,TOP_10_BY_ADV, RANDOM | 
 **description** | **str**| Guild description, can be used to explain the guild to other users. | [optional] 
 **twitter** | **str**| Guild twitter handle. | [optional] 
 **discord** | **str**| Guild discord link. | [optional] 
 **img_url** | **str**| URL for the profile image of the guild, is used by clients to add some color to the guild, if no image is provided, a default image is used | [optional] 
 **is_private** | **bool**| Guild privacy status | [optional] 

### Return type

[**Guild**](Guild.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **guild_share_trades**
> object guild_share_trades(share_trades)

Toggle share trades for your account, which controls whether your guild members can see your orders and positions in their UI

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# Configure API key authorization: apiExpires
configuration = swagger_client.Configuration()
configuration.api_key['api-expires'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['api-expires'] = 'Bearer'
# Configure API key authorization: apiKey
configuration = swagger_client.Configuration()
configuration.api_key['api-key'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['api-key'] = 'Bearer'
# Configure API key authorization: apiSignature
configuration = swagger_client.Configuration()
configuration.api_key['api-signature'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['api-signature'] = 'Bearer'

# create an instance of the API class
api_instance = swagger_client.GuildApi(swagger_client.ApiClient(configuration))
share_trades = true # bool | 

try:
    # Toggle share trades for your account, which controls whether your guild members can see your orders and positions in their UI
    api_response = api_instance.guild_share_trades(share_trades)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling GuildApi->guild_share_trades: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **share_trades** | **bool**|  | 

### Return type

**object**

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

