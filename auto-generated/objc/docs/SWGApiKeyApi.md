# SWGAPIKeyApi

All URIs are relative to *https://localhost/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**aPIKeyDisable**](SWGAPIKeyApi.md#apikeydisable) | **POST** /apiKey/disable | Disable an API Key.
[**aPIKeyEnable**](SWGAPIKeyApi.md#apikeyenable) | **POST** /apiKey/enable | Enable an API Key.
[**aPIKeyGet**](SWGAPIKeyApi.md#apikeyget) | **GET** /apiKey | Get your API Keys.
[**aPIKeyNew**](SWGAPIKeyApi.md#apikeynew) | **POST** /apiKey | Create a new API Key.
[**aPIKeyRemove**](SWGAPIKeyApi.md#apikeyremove) | **DELETE** /apiKey | Remove an API Key.


# **aPIKeyDisable**
```objc
-(NSURLSessionTask*) aPIKeyDisableWithApiKeyID: (NSString*) apiKeyID
        completionHandler: (void (^)(SWGAPIKey* output, NSError* error)) handler;
```

Disable an API Key.

### Example 
```objc
SWGDefaultConfiguration *apiConfig = [SWGDefaultConfiguration sharedConfig];

// Configure API key authorization: (authentication scheme: apiKey)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"api-key"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"api-key"];

// Configure API key authorization: (authentication scheme: apiNonce)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"api-nonce"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"api-nonce"];

// Configure API key authorization: (authentication scheme: apiSignature)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"api-signature"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"api-signature"];


NSString* apiKeyID = @"apiKeyID_example"; // API Key ID (public component).

SWGAPIKeyApi*apiInstance = [[SWGAPIKeyApi alloc] init];

// Disable an API Key.
[apiInstance aPIKeyDisableWithApiKeyID:apiKeyID
          completionHandler: ^(SWGAPIKey* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGAPIKeyApi->aPIKeyDisable: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiKeyID** | **NSString***| API Key ID (public component). | 

### Return type

[**SWGAPIKey***](SWGAPIKey.md)

### Authorization

[apiKey](../README.md#apiKey), [apiNonce](../README.md#apiNonce), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **aPIKeyEnable**
```objc
-(NSURLSessionTask*) aPIKeyEnableWithApiKeyID: (NSString*) apiKeyID
        completionHandler: (void (^)(SWGAPIKey* output, NSError* error)) handler;
```

Enable an API Key.

### Example 
```objc
SWGDefaultConfiguration *apiConfig = [SWGDefaultConfiguration sharedConfig];

// Configure API key authorization: (authentication scheme: apiKey)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"api-key"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"api-key"];

// Configure API key authorization: (authentication scheme: apiNonce)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"api-nonce"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"api-nonce"];

// Configure API key authorization: (authentication scheme: apiSignature)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"api-signature"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"api-signature"];


NSString* apiKeyID = @"apiKeyID_example"; // API Key ID (public component).

SWGAPIKeyApi*apiInstance = [[SWGAPIKeyApi alloc] init];

// Enable an API Key.
[apiInstance aPIKeyEnableWithApiKeyID:apiKeyID
          completionHandler: ^(SWGAPIKey* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGAPIKeyApi->aPIKeyEnable: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiKeyID** | **NSString***| API Key ID (public component). | 

### Return type

[**SWGAPIKey***](SWGAPIKey.md)

### Authorization

[apiKey](../README.md#apiKey), [apiNonce](../README.md#apiNonce), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **aPIKeyGet**
```objc
-(NSURLSessionTask*) aPIKeyGetWithReverse: (NSNumber*) reverse
        completionHandler: (void (^)(NSArray<SWGAPIKey>* output, NSError* error)) handler;
```

Get your API Keys.

### Example 
```objc
SWGDefaultConfiguration *apiConfig = [SWGDefaultConfiguration sharedConfig];

// Configure API key authorization: (authentication scheme: apiKey)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"api-key"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"api-key"];

// Configure API key authorization: (authentication scheme: apiNonce)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"api-nonce"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"api-nonce"];

// Configure API key authorization: (authentication scheme: apiSignature)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"api-signature"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"api-signature"];


NSNumber* reverse = @false; // If true, will sort results newest first. (optional) (default to false)

SWGAPIKeyApi*apiInstance = [[SWGAPIKeyApi alloc] init];

// Get your API Keys.
[apiInstance aPIKeyGetWithReverse:reverse
          completionHandler: ^(NSArray<SWGAPIKey>* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGAPIKeyApi->aPIKeyGet: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reverse** | **NSNumber***| If true, will sort results newest first. | [optional] [default to false]

### Return type

[**NSArray<SWGAPIKey>***](SWGAPIKey.md)

### Authorization

[apiKey](../README.md#apiKey), [apiNonce](../README.md#apiNonce), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **aPIKeyNew**
```objc
-(NSURLSessionTask*) aPIKeyNewWithName: (NSString*) name
    cidr: (NSString*) cidr
    permissions: (NSString*) permissions
    enabled: (NSNumber*) enabled
    token: (NSString*) token
        completionHandler: (void (^)(SWGAPIKey* output, NSError* error)) handler;
```

Create a new API Key.

API Keys can also be created via [this Python script](https://github.com/BitMEX/market-maker/blob/master/generate-api-key.py) See the [API Key Documentation](/app/apiKeys) for more information on capabilities.

### Example 
```objc
SWGDefaultConfiguration *apiConfig = [SWGDefaultConfiguration sharedConfig];

// Configure API key authorization: (authentication scheme: apiKey)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"api-key"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"api-key"];

// Configure API key authorization: (authentication scheme: apiNonce)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"api-nonce"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"api-nonce"];

// Configure API key authorization: (authentication scheme: apiSignature)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"api-signature"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"api-signature"];


NSString* name = @"name_example"; // Key name. This name is for reference only. (optional)
NSString* cidr = @"cidr_example"; // CIDR block to restrict this key to. To restrict to a single address, append \"/32\", e.g. 207.39.29.22/32. Leave blank or set to 0.0.0.0/0 to allow all IPs. Only one block may be set. <a href=\"http://software77.net/cidr-101.html\">More on CIDR blocks</a> (optional)
NSString* permissions = @"permissions_example"; // Key Permissions. All keys can read margin and position data. Additional permissions must be added. Available: [\"order\", \"orderCancel\", \"withdraw\"]. (optional)
NSNumber* enabled = @false; // Set to true to enable this key on creation. Otherwise, it must be explicitly enabled via /apiKey/enable. (optional) (default to false)
NSString* token = @"token_example"; // OTP Token (YubiKey, Google Authenticator) (optional)

SWGAPIKeyApi*apiInstance = [[SWGAPIKeyApi alloc] init];

// Create a new API Key.
[apiInstance aPIKeyNewWithName:name
              cidr:cidr
              permissions:permissions
              enabled:enabled
              token:token
          completionHandler: ^(SWGAPIKey* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGAPIKeyApi->aPIKeyNew: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **NSString***| Key name. This name is for reference only. | [optional] 
 **cidr** | **NSString***| CIDR block to restrict this key to. To restrict to a single address, append \&quot;/32\&quot;, e.g. 207.39.29.22/32. Leave blank or set to 0.0.0.0/0 to allow all IPs. Only one block may be set. &lt;a href&#x3D;\&quot;http://software77.net/cidr-101.html\&quot;&gt;More on CIDR blocks&lt;/a&gt; | [optional] 
 **permissions** | **NSString***| Key Permissions. All keys can read margin and position data. Additional permissions must be added. Available: [\&quot;order\&quot;, \&quot;orderCancel\&quot;, \&quot;withdraw\&quot;]. | [optional] 
 **enabled** | **NSNumber***| Set to true to enable this key on creation. Otherwise, it must be explicitly enabled via /apiKey/enable. | [optional] [default to false]
 **token** | **NSString***| OTP Token (YubiKey, Google Authenticator) | [optional] 

### Return type

[**SWGAPIKey***](SWGAPIKey.md)

### Authorization

[apiKey](../README.md#apiKey), [apiNonce](../README.md#apiNonce), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **aPIKeyRemove**
```objc
-(NSURLSessionTask*) aPIKeyRemoveWithApiKeyID: (NSString*) apiKeyID
        completionHandler: (void (^)(SWGInlineResponse200* output, NSError* error)) handler;
```

Remove an API Key.

### Example 
```objc
SWGDefaultConfiguration *apiConfig = [SWGDefaultConfiguration sharedConfig];

// Configure API key authorization: (authentication scheme: apiKey)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"api-key"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"api-key"];

// Configure API key authorization: (authentication scheme: apiNonce)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"api-nonce"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"api-nonce"];

// Configure API key authorization: (authentication scheme: apiSignature)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"api-signature"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"api-signature"];


NSString* apiKeyID = @"apiKeyID_example"; // API Key ID (public component).

SWGAPIKeyApi*apiInstance = [[SWGAPIKeyApi alloc] init];

// Remove an API Key.
[apiInstance aPIKeyRemoveWithApiKeyID:apiKeyID
          completionHandler: ^(SWGInlineResponse200* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGAPIKeyApi->aPIKeyRemove: %@", error);
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

[apiKey](../README.md#apiKey), [apiNonce](../README.md#apiNonce), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

