# SwaggerClient::GuildApi

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
> Object guild_archive

Archive a guild

### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure API key authorization: apiExpires
  config.api_key['api-expires'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-expires'] = 'Bearer'

  # Configure API key authorization: apiKey
  config.api_key['api-key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-key'] = 'Bearer'

  # Configure API key authorization: apiSignature
  config.api_key['api-signature'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-signature'] = 'Bearer'
end

api_instance = SwaggerClient::GuildApi.new

begin
  #Archive a guild
  result = api_instance.guild_archive
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling GuildApi->guild_archive: #{e}"
end
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



# **guild_edit**
> Guild guild_edit(name, emoji, pot_distribution_percent, pot_distribution_type, opts)

Edit guild new guild

### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure API key authorization: apiExpires
  config.api_key['api-expires'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-expires'] = 'Bearer'

  # Configure API key authorization: apiKey
  config.api_key['api-key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-key'] = 'Bearer'

  # Configure API key authorization: apiSignature
  config.api_key['api-signature'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-signature'] = 'Bearer'
end

api_instance = SwaggerClient::GuildApi.new

name = 'name_example' # String | Name of the guild, must be unique, must be at least 5 characters

emoji = 'emoji_example' # String | Emoji name.

pot_distribution_percent = 1.2 # Float | How much of the pot should be distributed to the guild members, must be between 0 and 100

pot_distribution_type = 'pot_distribution_type_example' # String | How the pot should be distributed to the guild members, must be one of the following: ROLL_OVER, TOP_3, TOP_5, TOP_10, VOLUME_PERCENTAGE, TOP_3_BY_ADV, TOP_5_BY_ADV, TOP_10_BY_ADV, TOP_3_BY_ROI, TOP_5_BY_ROI, TOP_10_BY_ROI, RANDOM

opts = { 
  pot_trader_id: 1.2, # Float | User ID of the guild member with order write permission for the pot
  description: 'description_example', # String | Guild description, can be used to explain the guild to other users.
  twitter: 'twitter_example', # String | Guild twitter handle.
  discord: 'discord_example', # String | Guild discord link.
  telegram: 'telegram_example', # String | Guild telegram link.
  img_url: 'img_url_example', # String | URL for the profile image of the guild, is used by clients to add some color to the guild, if no image is provided, a default image is used
  is_private: true # BOOLEAN | Guild privacy status
}

begin
  #Edit guild new guild
  result = api_instance.guild_edit(name, emoji, pot_distribution_percent, pot_distribution_type, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling GuildApi->guild_edit: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Name of the guild, must be unique, must be at least 5 characters | 
 **emoji** | **String**| Emoji name. | 
 **pot_distribution_percent** | **Float**| How much of the pot should be distributed to the guild members, must be between 0 and 100 | 
 **pot_distribution_type** | **String**| How the pot should be distributed to the guild members, must be one of the following: ROLL_OVER, TOP_3, TOP_5, TOP_10, VOLUME_PERCENTAGE, TOP_3_BY_ADV, TOP_5_BY_ADV, TOP_10_BY_ADV, TOP_3_BY_ROI, TOP_5_BY_ROI, TOP_10_BY_ROI, RANDOM | 
 **pot_trader_id** | **Float**| User ID of the guild member with order write permission for the pot | [optional] 
 **description** | **String**| Guild description, can be used to explain the guild to other users. | [optional] 
 **twitter** | **String**| Guild twitter handle. | [optional] 
 **discord** | **String**| Guild discord link. | [optional] 
 **telegram** | **String**| Guild telegram link. | [optional] 
 **img_url** | **String**| URL for the profile image of the guild, is used by clients to add some color to the guild, if no image is provided, a default image is used | [optional] 
 **is_private** | **BOOLEAN**| Guild privacy status | [optional] 

### Return type

[**Guild**](Guild.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript



# **guild_get**
> Array&lt;XAny&gt; guild_get

Get all guilds

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::GuildApi.new

begin
  #Get all guilds
  result = api_instance.guild_get
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling GuildApi->guild_get: #{e}"
end
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Array&lt;XAny&gt;**](XAny.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript



# **guild_join**
> Object guild_join(code)

Request to Join a private guild or join a public guild

### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure API key authorization: apiExpires
  config.api_key['api-expires'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-expires'] = 'Bearer'

  # Configure API key authorization: apiKey
  config.api_key['api-key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-key'] = 'Bearer'

  # Configure API key authorization: apiSignature
  config.api_key['api-signature'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-signature'] = 'Bearer'
end

api_instance = SwaggerClient::GuildApi.new

code = 'code_example' # String | 


begin
  #Request to Join a private guild or join a public guild
  result = api_instance.guild_join(code)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling GuildApi->guild_join: #{e}"
end
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



# **guild_kick**
> Object guild_kick(member_user_id)

Kick member from guild

### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure API key authorization: apiExpires
  config.api_key['api-expires'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-expires'] = 'Bearer'

  # Configure API key authorization: apiKey
  config.api_key['api-key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-key'] = 'Bearer'

  # Configure API key authorization: apiSignature
  config.api_key['api-signature'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-signature'] = 'Bearer'
end

api_instance = SwaggerClient::GuildApi.new

member_user_id = 1.2 # Float | 


begin
  #Kick member from guild
  result = api_instance.guild_kick(member_user_id)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling GuildApi->guild_kick: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **member_user_id** | **Float**|  | 

### Return type

**Object**

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript



# **guild_leave**
> Object guild_leave

Leave guild or cancel guild join request

### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure API key authorization: apiExpires
  config.api_key['api-expires'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-expires'] = 'Bearer'

  # Configure API key authorization: apiKey
  config.api_key['api-key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-key'] = 'Bearer'

  # Configure API key authorization: apiSignature
  config.api_key['api-signature'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-signature'] = 'Bearer'
end

api_instance = SwaggerClient::GuildApi.new

begin
  #Leave guild or cancel guild join request
  result = api_instance.guild_leave
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling GuildApi->guild_leave: #{e}"
end
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



# **guild_new**
> Guild guild_new(name, emoji, pot_distribution_percent, pot_distribution_type, opts)

Creates a new guild

### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure API key authorization: apiExpires
  config.api_key['api-expires'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-expires'] = 'Bearer'

  # Configure API key authorization: apiKey
  config.api_key['api-key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-key'] = 'Bearer'

  # Configure API key authorization: apiSignature
  config.api_key['api-signature'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-signature'] = 'Bearer'
end

api_instance = SwaggerClient::GuildApi.new

name = 'name_example' # String | Name of the guild, must be unique, must be at least 5 characters

emoji = 'emoji_example' # String | Emoji name.

pot_distribution_percent = 1.2 # Float | How much of the pot should be distributed to the guild members, must be between 0 and 100

pot_distribution_type = 'pot_distribution_type_example' # String | How the pot should be distributed to the guild members, must be one of the following: ROLL_OVER, TOP_3, TOP_5, TOP_10, VOLUME_PERCENTAGE, TOP_3_BY_ADV, TOP_5_BY_ADV, TOP_10_BY_ADV, TOP_3_BY_ROI, TOP_5_BY_ROI, TOP_10_BY_ROI, RANDOM

opts = { 
  description: 'description_example', # String | Guild description, can be used to explain the guild to other users.
  twitter: 'twitter_example', # String | Guild twitter handle.
  discord: 'discord_example', # String | Guild discord link.
  telegram: 'telegram_example', # String | Guild telegram link.
  img_url: 'img_url_example', # String | URL for the profile image of the guild, is used by clients to add some color to the guild, if no image is provided, a default image is used
  is_private: true # BOOLEAN | Guild privacy status
}

begin
  #Creates a new guild
  result = api_instance.guild_new(name, emoji, pot_distribution_percent, pot_distribution_type, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling GuildApi->guild_new: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Name of the guild, must be unique, must be at least 5 characters | 
 **emoji** | **String**| Emoji name. | 
 **pot_distribution_percent** | **Float**| How much of the pot should be distributed to the guild members, must be between 0 and 100 | 
 **pot_distribution_type** | **String**| How the pot should be distributed to the guild members, must be one of the following: ROLL_OVER, TOP_3, TOP_5, TOP_10, VOLUME_PERCENTAGE, TOP_3_BY_ADV, TOP_5_BY_ADV, TOP_10_BY_ADV, TOP_3_BY_ROI, TOP_5_BY_ROI, TOP_10_BY_ROI, RANDOM | 
 **description** | **String**| Guild description, can be used to explain the guild to other users. | [optional] 
 **twitter** | **String**| Guild twitter handle. | [optional] 
 **discord** | **String**| Guild discord link. | [optional] 
 **telegram** | **String**| Guild telegram link. | [optional] 
 **img_url** | **String**| URL for the profile image of the guild, is used by clients to add some color to the guild, if no image is provided, a default image is used | [optional] 
 **is_private** | **BOOLEAN**| Guild privacy status | [optional] 

### Return type

[**Guild**](Guild.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript



# **guild_share_trades**
> Object guild_share_trades(share_trades)

Toggle share trades for your account, which controls whether your guild members can see your orders and positions in their UI

### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure API key authorization: apiExpires
  config.api_key['api-expires'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-expires'] = 'Bearer'

  # Configure API key authorization: apiKey
  config.api_key['api-key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-key'] = 'Bearer'

  # Configure API key authorization: apiSignature
  config.api_key['api-signature'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-signature'] = 'Bearer'
end

api_instance = SwaggerClient::GuildApi.new

share_trades = true # BOOLEAN | 


begin
  #Toggle share trades for your account, which controls whether your guild members can see your orders and positions in their UI
  result = api_instance.guild_share_trades(share_trades)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling GuildApi->guild_share_trades: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **share_trades** | **BOOLEAN**|  | 

### Return type

**Object**

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript



