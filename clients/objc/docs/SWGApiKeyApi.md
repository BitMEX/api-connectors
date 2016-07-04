# SWGApiKeyApi

All URIs are relative to *https://localhost/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiKeyDisable**](SWGApiKeyApi.md#apikeydisable) | **POST** /apiKey/disable | Disable an API Key.
[**apiKeyEnable**](SWGApiKeyApi.md#apikeyenable) | **POST** /apiKey/enable | Enable an API Key.
[**apiKeyGet**](SWGApiKeyApi.md#apikeyget) | **GET** /apiKey | Get your API Keys.
[**apiKeyNew**](SWGApiKeyApi.md#apikeynew) | **POST** /apiKey | Create a new API Key.
[**apiKeyRemove**](SWGApiKeyApi.md#apikeyremove) | **DELETE** /apiKey | Remove an API Key.


# **apiKeyDisable**
```objc
-(NSNumber*) apiKeyDisableWithApiKeyID: (NSString*) apiKeyID
        completionHandler: (void (^)(SWGApiKey* output, NSError* error)) handler;
```

Disable an API Key.

### Example 
```objc

NSString* apiKeyID = @"apiKeyID_example"; // API Key ID (public component).

SWGApiKeyApi*apiInstance = [[SWGApiKeyApi alloc] init];

// Disable an API Key.
[apiInstance apiKeyDisableWithApiKeyID:apiKeyID
          completionHandler: ^(SWGApiKey* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGApiKeyApi->apiKeyDisable: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiKeyID** | **NSString***| API Key ID (public component). | 

### Return type

[**SWGApiKey***](SWGApiKey.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **apiKeyEnable**
```objc
-(NSNumber*) apiKeyEnableWithApiKeyID: (NSString*) apiKeyID
        completionHandler: (void (^)(SWGApiKey* output, NSError* error)) handler;
```

Enable an API Key.

### Example 
```objc

NSString* apiKeyID = @"apiKeyID_example"; // API Key ID (public component).

SWGApiKeyApi*apiInstance = [[SWGApiKeyApi alloc] init];

// Enable an API Key.
[apiInstance apiKeyEnableWithApiKeyID:apiKeyID
          completionHandler: ^(SWGApiKey* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGApiKeyApi->apiKeyEnable: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiKeyID** | **NSString***| API Key ID (public component). | 

### Return type

[**SWGApiKey***](SWGApiKey.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **apiKeyGet**
```objc
-(NSNumber*) apiKeyGetWithReverse: (NSNumber*) reverse
        completionHandler: (void (^)(NSArray<SWGApiKey>* output, NSError* error)) handler;
```

Get your API Keys.

### Example 
```objc

NSNumber* reverse = @false; // If true, will sort results newest first. (optional) (default to false)

SWGApiKeyApi*apiInstance = [[SWGApiKeyApi alloc] init];

// Get your API Keys.
[apiInstance apiKeyGetWithReverse:reverse
          completionHandler: ^(NSArray<SWGApiKey>* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGApiKeyApi->apiKeyGet: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reverse** | **NSNumber***| If true, will sort results newest first. | [optional] [default to false]

### Return type

[**NSArray<SWGApiKey>***](SWGApiKey.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **apiKeyNew**
```objc
-(NSNumber*) apiKeyNewWithName: (NSString*) name
    cidr: (NSString*) cidr
    permissions: (NSString*) permissions
    enabled: (NSNumber*) enabled
    token: (NSString*) token
        completionHandler: (void (^)(SWGApiKey* output, NSError* error)) handler;
```

Create a new API Key.

API Keys can also be created via [this Python script](https://github.com/BitMEX/market-maker/blob/master/generate-api-key.py) See the [API Key Documentation](/app/apiKeys) for more information on capabilities.

### Example 
```objc

NSString* name = @"name_example"; // Key name. This name is for reference only. (optional)
NSString* cidr = @"cidr_example"; // CIDR block to restrict this key to. To restrict to a single address, append \"/32\", e.g. 207.39.29.22/32. Leave blank or set to 0.0.0.0/0 to allow all IPs. Only one block may be set. <a href=\"http://software77.net/cidr-101.html\">More on CIDR blocks</a> (optional)
NSString* permissions = @"permissions_example"; // Key Permissions. All keys can read margin and position data. Additional permissions must be added. Available: [\"order\", \"withdraw\"]. (optional)
NSNumber* enabled = @false; // Set to true to enable this key on creation. Otherwise, it must be explicitly enabled via /apiKey/enable. (optional) (default to false)
NSString* token = @"token_example"; // OTP Token (YubiKey, Google Authenticator) (optional)

SWGApiKeyApi*apiInstance = [[SWGApiKeyApi alloc] init];

// Create a new API Key.
[apiInstance apiKeyNewWithName:name
              cidr:cidr
              permissions:permissions
              enabled:enabled
              token:token
          completionHandler: ^(SWGApiKey* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGApiKeyApi->apiKeyNew: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **NSString***| Key name. This name is for reference only. | [optional] 
 **cidr** | **NSString***| CIDR block to restrict this key to. To restrict to a single address, append \&quot;/32\&quot;, e.g. 207.39.29.22/32. Leave blank or set to 0.0.0.0/0 to allow all IPs. Only one block may be set. &lt;a href&#x3D;\&quot;http://software77.net/cidr-101.html\&quot;&gt;More on CIDR blocks&lt;/a&gt; | [optional] 
 **permissions** | **NSString***| Key Permissions. All keys can read margin and position data. Additional permissions must be added. Available: [\&quot;order\&quot;, \&quot;withdraw\&quot;]. | [optional] 
 **enabled** | **NSNumber***| Set to true to enable this key on creation. Otherwise, it must be explicitly enabled via /apiKey/enable. | [optional] [default to false]
 **token** | **NSString***| OTP Token (YubiKey, Google Authenticator) | [optional] 

### Return type

[**SWGApiKey***](SWGApiKey.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **apiKeyRemove**
```objc
-(NSNumber*) apiKeyRemoveWithApiKeyID: (NSString*) apiKeyID
        completionHandler: (void (^)(SWGInlineResponse200* output, NSError* error)) handler;
```

Remove an API Key.

### Example 
```objc

NSString* apiKeyID = @"apiKeyID_example"; // API Key ID (public component).

SWGApiKeyApi*apiInstance = [[SWGApiKeyApi alloc] init];

// Remove an API Key.
[apiInstance apiKeyRemoveWithApiKeyID:apiKeyID
          completionHandler: ^(SWGInlineResponse200* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGApiKeyApi->apiKeyRemove: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiKeyID** | **NSString***| API Key ID (public component). | 

### Return type

[**SWGInlineResponse200***](SWGInlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

