# SWGAddressApi

All URIs are relative to *https://www.bitmex.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addressGet**](SWGAddressApi.md#addressget) | **GET** /address | Get your addresses.
[**addressNew**](SWGAddressApi.md#addressnew) | **POST** /address | Creates a new saved address.


# **addressGet**
```objc
-(NSURLSessionTask*) addressGetWithCompletionHandler: 
        (void (^)(NSArray<SWGAddress>* output, NSError* error)) handler;
```

Get your addresses.

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



SWGAddressApi*apiInstance = [[SWGAddressApi alloc] init];

// Get your addresses.
[apiInstance addressGetWithCompletionHandler: 
          ^(NSArray<SWGAddress>* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGAddressApi->addressGet: %@", error);
                        }
                    }];
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**NSArray<SWGAddress>***](SWGAddress.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **addressNew**
```objc
-(NSURLSessionTask*) addressNewWithCurrency: (NSString*) currency
    network: (NSString*) network
    address: (NSString*) address
    name: (NSString*) name
    note: (NSString*) note
    skipConfirm: (NSNumber*) skipConfirm
    skip2FA: (NSNumber*) skip2FA
    memo: (NSString*) memo
        completionHandler: (void (^)(SWGAddress* output, NSError* error)) handler;
```

Creates a new saved address.

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


NSString* currency = @"currency_example"; // Currency of the address. Options: `XBt`, `USDt`
NSString* network = @"network_example"; // Selected network.
NSString* address = @"address_example"; // Destination Address.
NSString* name = @"name_example"; // Name of the entry, eg. 'Hardware wallet'.
NSString* note = @"note_example"; // Optional annotation. (optional)
NSNumber* skipConfirm = @false; // Skip e-mail confirmations for transfers to this address. Will require an email confirmation after creation. (optional) (default to false)
NSNumber* skip2FA = @false; // Skip 2FA confirmations for transfers to this address. Will require an email confirmation after creation. (optional) (default to false)
NSString* memo = @"memo_example"; // Destination Memo. (optional)

SWGAddressApi*apiInstance = [[SWGAddressApi alloc] init];

// Creates a new saved address.
[apiInstance addressNewWithCurrency:currency
              network:network
              address:address
              name:name
              note:note
              skipConfirm:skipConfirm
              skip2FA:skip2FA
              memo:memo
          completionHandler: ^(SWGAddress* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGAddressApi->addressNew: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currency** | **NSString***| Currency of the address. Options: &#x60;XBt&#x60;, &#x60;USDt&#x60; | 
 **network** | **NSString***| Selected network. | 
 **address** | **NSString***| Destination Address. | 
 **name** | **NSString***| Name of the entry, eg. &#39;Hardware wallet&#39;. | 
 **note** | **NSString***| Optional annotation. | [optional] 
 **skipConfirm** | **NSNumber***| Skip e-mail confirmations for transfers to this address. Will require an email confirmation after creation. | [optional] [default to false]
 **skip2FA** | **NSNumber***| Skip 2FA confirmations for transfers to this address. Will require an email confirmation after creation. | [optional] [default to false]
 **memo** | **NSString***| Destination Memo. | [optional] 

### Return type

[**SWGAddress***](SWGAddress.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

