# SWGUserApi

All URIs are relative to *https://www.bitmex.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**userCancelPendingWithdrawal**](SWGUserApi.md#usercancelpendingwithdrawal) | **DELETE** /user/withdrawal | Cancel pending withdrawal
[**userCancelWithdrawal**](SWGUserApi.md#usercancelwithdrawal) | **POST** /user/cancelWithdrawal | Cancel a withdrawal.
[**userCheckReferralCode**](SWGUserApi.md#usercheckreferralcode) | **GET** /user/checkReferralCode | Check if a referral code is valid.
[**userCommunicationToken**](SWGUserApi.md#usercommunicationtoken) | **POST** /user/communicationToken | Register your communication token for mobile clients
[**userConfirm**](SWGUserApi.md#userconfirm) | **POST** /user/confirmEmail | Confirm your email address with a token.
[**userConfirmWithdrawal**](SWGUserApi.md#userconfirmwithdrawal) | **POST** /user/confirmWithdrawal | Confirm a withdrawal.
[**userCreateSubAccount**](SWGUserApi.md#usercreatesubaccount) | **POST** /user/addSubaccount | Creates a new sub-account.
[**userCreateUnstakingRequests**](SWGUserApi.md#usercreateunstakingrequests) | **POST** /user/unstakingRequests | Create unstaking request
[**userDeleteUnstakingRequests**](SWGUserApi.md#userdeleteunstakingrequests) | **DELETE** /user/unstakingRequests | Cancel unstaking request
[**userGet**](SWGUserApi.md#userget) | **GET** /user | Get your user model.
[**userGetAffiliateStatus**](SWGUserApi.md#usergetaffiliatestatus) | **GET** /user/affiliateStatus | Get your current affiliate/referral status.
[**userGetCSA**](SWGUserApi.md#usergetcsa) | **GET** /user/csa | Get your account&#39;s CSA status.
[**userGetCommission**](SWGUserApi.md#usergetcommission) | **GET** /user/commission | Get your account&#39;s commission status.
[**userGetDepositAddress**](SWGUserApi.md#usergetdepositaddress) | **GET** /user/depositAddress | Get a deposit address.
[**userGetDepositAddressInformation**](SWGUserApi.md#usergetdepositaddressinformation) | **GET** /user/depositAddressInformation | Get a deposit address.
[**userGetExecutionHistory**](SWGUserApi.md#usergetexecutionhistory) | **GET** /user/executionHistory | Get the execution history by day.
[**userGetMargin**](SWGUserApi.md#usergetmargin) | **GET** /user/margin | Get your account&#39;s margin status. Send a currency of \&quot;all\&quot; to receive an array of all supported currencies.
[**userGetQuoteFillRatio**](SWGUserApi.md#usergetquotefillratio) | **GET** /user/quoteFillRatio | Get 7 days worth of Quote Fill Ratio statistics.
[**userGetQuoteValueRatio**](SWGUserApi.md#usergetquotevalueratio) | **GET** /user/quoteValueRatio | Get Quote Value Ratio statistics over the last 3 days
[**userGetStaking**](SWGUserApi.md#usergetstaking) | **GET** /user/staking | Get the current user staking amount.
[**userGetStakingInstruments**](SWGUserApi.md#usergetstakinginstruments) | **GET** /user/staking/instruments | List staking instruments
[**userGetStakingTiers**](SWGUserApi.md#usergetstakingtiers) | **GET** /user/staking/tiers | List staking tiers for a given currency
[**userGetTradingVolume**](SWGUserApi.md#usergettradingvolume) | **GET** /user/tradingVolume | Get your 30 days USD average trading volume
[**userGetUnstakingRequests**](SWGUserApi.md#usergetunstakingrequests) | **GET** /user/unstakingRequests | Get the current user unstaking requests
[**userGetWallet**](SWGUserApi.md#usergetwallet) | **GET** /user/wallet | Get your current wallet information.
[**userGetWalletHistory**](SWGUserApi.md#usergetwallethistory) | **GET** /user/walletHistory | Get a history of all of your wallet transactions (deposits, withdrawals, PNL).
[**userGetWalletSummary**](SWGUserApi.md#usergetwalletsummary) | **GET** /user/walletSummary | Get a summary of all of your wallet transactions (deposits, withdrawals, PNL).
[**userGetWalletTransferAccounts**](SWGUserApi.md#usergetwallettransferaccounts) | **GET** /user/getWalletTransferAccounts | Get the list of accounts you can transfer funds between.
[**userLogout**](SWGUserApi.md#userlogout) | **POST** /user/logout | Log out of BitMEX.
[**userRequestWithdrawal**](SWGUserApi.md#userrequestwithdrawal) | **POST** /user/requestWithdrawal | Request a withdrawal to an external wallet.
[**userSavePreferences**](SWGUserApi.md#usersavepreferences) | **POST** /user/preferences | Save user preferences.
[**userUpdateSubAccount**](SWGUserApi.md#userupdatesubaccount) | **POST** /user/updateSubaccount | Updates the sub-account name.
[**userWalletTransfer**](SWGUserApi.md#userwallettransfer) | **POST** /user/walletTransfer | Execute a transfer to a paired account.


# **userCancelPendingWithdrawal**
```objc
-(NSURLSessionTask*) userCancelPendingWithdrawalWithTransactID: (NSString*) transactID
        completionHandler: (void (^)(NSObject* output, NSError* error)) handler;
```

Cancel pending withdrawal

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


NSString* transactID = @"transactID_example"; // 

SWGUserApi*apiInstance = [[SWGUserApi alloc] init];

// Cancel pending withdrawal
[apiInstance userCancelPendingWithdrawalWithTransactID:transactID
          completionHandler: ^(NSObject* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGUserApi->userCancelPendingWithdrawal: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transactID** | **NSString***|  | 

### Return type

**NSObject***

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **userCancelWithdrawal**
```objc
-(NSURLSessionTask*) userCancelWithdrawalWithToken: (NSString*) token
        completionHandler: (void (^)(SWGTransaction* output, NSError* error)) handler;
```

Cancel a withdrawal.

### Example 
```objc

NSString* token = @"token_example"; // 

SWGUserApi*apiInstance = [[SWGUserApi alloc] init];

// Cancel a withdrawal.
[apiInstance userCancelWithdrawalWithToken:token
          completionHandler: ^(SWGTransaction* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGUserApi->userCancelWithdrawal: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **NSString***|  | 

### Return type

[**SWGTransaction***](SWGTransaction.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **userCheckReferralCode**
```objc
-(NSURLSessionTask*) userCheckReferralCodeWithReferralCode: (NSString*) referralCode
        completionHandler: (void (^)(NSObject* output, NSError* error)) handler;
```

Check if a referral code is valid.

If the code is valid, responds with the referral code's discount (e.g. `0.1` for 10%). Otherwise, will return a 404 or 451 if invalid.

### Example 
```objc

NSString* referralCode = @"referralCode_example"; //  (optional)

SWGUserApi*apiInstance = [[SWGUserApi alloc] init];

// Check if a referral code is valid.
[apiInstance userCheckReferralCodeWithReferralCode:referralCode
          completionHandler: ^(NSObject* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGUserApi->userCheckReferralCode: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **referralCode** | **NSString***|  | [optional] 

### Return type

**NSObject***

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **userCommunicationToken**
```objc
-(NSURLSessionTask*) userCommunicationTokenWithToken: (NSString*) token
    platformAgent: (NSString*) platformAgent
        completionHandler: (void (^)(NSArray<SWGCommunicationToken>* output, NSError* error)) handler;
```

Register your communication token for mobile clients

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


NSString* token = @"token_example"; // 
NSString* platformAgent = @"platformAgent_example"; // 

SWGUserApi*apiInstance = [[SWGUserApi alloc] init];

// Register your communication token for mobile clients
[apiInstance userCommunicationTokenWithToken:token
              platformAgent:platformAgent
          completionHandler: ^(NSArray<SWGCommunicationToken>* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGUserApi->userCommunicationToken: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **NSString***|  | 
 **platformAgent** | **NSString***|  | 

### Return type

[**NSArray<SWGCommunicationToken>***](SWGCommunicationToken.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **userConfirm**
```objc
-(NSURLSessionTask*) userConfirmWithToken: (NSString*) token
        completionHandler: (void (^)(SWGAccessToken* output, NSError* error)) handler;
```

Confirm your email address with a token.

### Example 
```objc

NSString* token = @"token_example"; // 

SWGUserApi*apiInstance = [[SWGUserApi alloc] init];

// Confirm your email address with a token.
[apiInstance userConfirmWithToken:token
          completionHandler: ^(SWGAccessToken* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGUserApi->userConfirm: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **NSString***|  | 

### Return type

[**SWGAccessToken***](SWGAccessToken.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **userConfirmWithdrawal**
```objc
-(NSURLSessionTask*) userConfirmWithdrawalWithToken: (NSString*) token
        completionHandler: (void (^)(SWGTransaction* output, NSError* error)) handler;
```

Confirm a withdrawal.

### Example 
```objc

NSString* token = @"token_example"; // 

SWGUserApi*apiInstance = [[SWGUserApi alloc] init];

// Confirm a withdrawal.
[apiInstance userConfirmWithdrawalWithToken:token
          completionHandler: ^(SWGTransaction* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGUserApi->userConfirmWithdrawal: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **NSString***|  | 

### Return type

[**SWGTransaction***](SWGTransaction.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **userCreateSubAccount**
```objc
-(NSURLSessionTask*) userCreateSubAccountWithAccountName: (NSString*) accountName
        completionHandler: (void (^)(NSObject* output, NSError* error)) handler;
```

Creates a new sub-account.

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


NSString* accountName = @"accountName_example"; // 

SWGUserApi*apiInstance = [[SWGUserApi alloc] init];

// Creates a new sub-account.
[apiInstance userCreateSubAccountWithAccountName:accountName
          completionHandler: ^(NSObject* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGUserApi->userCreateSubAccount: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountName** | **NSString***|  | 

### Return type

**NSObject***

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **userCreateUnstakingRequests**
```objc
-(NSURLSessionTask*) userCreateUnstakingRequestsWithSymbol: (NSString*) symbol
    amount: (NSNumber*) amount
        completionHandler: (void (^)(NSObject* output, NSError* error)) handler;
```

Create unstaking request

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


NSString* symbol = @"symbol_example"; // 
NSNumber* amount = @1.2; // 

SWGUserApi*apiInstance = [[SWGUserApi alloc] init];

// Create unstaking request
[apiInstance userCreateUnstakingRequestsWithSymbol:symbol
              amount:amount
          completionHandler: ^(NSObject* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGUserApi->userCreateUnstakingRequests: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **NSString***|  | 
 **amount** | **NSNumber***|  | 

### Return type

**NSObject***

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **userDeleteUnstakingRequests**
```objc
-(NSURLSessionTask*) userDeleteUnstakingRequestsWithRedemptionID: (NSString*) redemptionID
        completionHandler: (void (^)(NSObject* output, NSError* error)) handler;
```

Cancel unstaking request

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


NSString* redemptionID = @"redemptionID_example"; // 

SWGUserApi*apiInstance = [[SWGUserApi alloc] init];

// Cancel unstaking request
[apiInstance userDeleteUnstakingRequestsWithRedemptionID:redemptionID
          completionHandler: ^(NSObject* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGUserApi->userDeleteUnstakingRequests: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **redemptionID** | **NSString***|  | 

### Return type

**NSObject***

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **userGet**
```objc
-(NSURLSessionTask*) userGetWithCompletionHandler: 
        (void (^)(SWGUser* output, NSError* error)) handler;
```

Get your user model.

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



SWGUserApi*apiInstance = [[SWGUserApi alloc] init];

// Get your user model.
[apiInstance userGetWithCompletionHandler: 
          ^(SWGUser* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGUserApi->userGet: %@", error);
                        }
                    }];
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**SWGUser***](SWGUser.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **userGetAffiliateStatus**
```objc
-(NSURLSessionTask*) userGetAffiliateStatusWithCurrency: (NSString*) currency
        completionHandler: (void (^)(SWGAffiliate* output, NSError* error)) handler;
```

Get your current affiliate/referral status.

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


NSString* currency = @"XBt"; // Any currency. For all currencies, see <a href=\"#!/Wallet/Wallet_getAssetsConfig\">asset config endpoint</a>. For all currencies specify \"all\" (optional) (default to XBt)

SWGUserApi*apiInstance = [[SWGUserApi alloc] init];

// Get your current affiliate/referral status.
[apiInstance userGetAffiliateStatusWithCurrency:currency
          completionHandler: ^(SWGAffiliate* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGUserApi->userGetAffiliateStatus: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currency** | **NSString***| Any currency. For all currencies, see &lt;a href&#x3D;\&quot;#!/Wallet/Wallet_getAssetsConfig\&quot;&gt;asset config endpoint&lt;/a&gt;. For all currencies specify \&quot;all\&quot; | [optional] [default to XBt]

### Return type

[**SWGAffiliate***](SWGAffiliate.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **userGetCSA**
```objc
-(NSURLSessionTask*) userGetCSAWithCompletionHandler: 
        (void (^)(SWGCollateralSupportAgreement* output, NSError* error)) handler;
```

Get your account's CSA status.

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



SWGUserApi*apiInstance = [[SWGUserApi alloc] init];

// Get your account's CSA status.
[apiInstance userGetCSAWithCompletionHandler: 
          ^(SWGCollateralSupportAgreement* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGUserApi->userGetCSA: %@", error);
                        }
                    }];
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**SWGCollateralSupportAgreement***](SWGCollateralSupportAgreement.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **userGetCommission**
```objc
-(NSURLSessionTask*) userGetCommissionWithCompletionHandler: 
        (void (^)(SWGUserCommissionsBySymbol* output, NSError* error)) handler;
```

Get your account's commission status.

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



SWGUserApi*apiInstance = [[SWGUserApi alloc] init];

// Get your account's commission status.
[apiInstance userGetCommissionWithCompletionHandler: 
          ^(SWGUserCommissionsBySymbol* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGUserApi->userGetCommission: %@", error);
                        }
                    }];
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**SWGUserCommissionsBySymbol***](SWGUserCommissionsBySymbol.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **userGetDepositAddress**
```objc
-(NSURLSessionTask*) userGetDepositAddressWithCurrency: (NSString*) currency
    network: (NSString*) network
        completionHandler: (void (^)(NSString* output, NSError* error)) handler;
```

Get a deposit address.

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


NSString* currency = @"currency_example"; // Any currency. For all currencies, see <a href=\"#!/Wallet/Wallet_getAssetsConfig\">asset config endpoint</a>
NSString* network = @"network_example"; // The `network` parameter is used to indicate which blockchain you would like to deposit from. The acceptable value in the `network` parameter for each currency can be found from `networks.asset` from `GET /wallet/assets`.

SWGUserApi*apiInstance = [[SWGUserApi alloc] init];

// Get a deposit address.
[apiInstance userGetDepositAddressWithCurrency:currency
              network:network
          completionHandler: ^(NSString* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGUserApi->userGetDepositAddress: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currency** | **NSString***| Any currency. For all currencies, see &lt;a href&#x3D;\&quot;#!/Wallet/Wallet_getAssetsConfig\&quot;&gt;asset config endpoint&lt;/a&gt; | 
 **network** | **NSString***| The &#x60;network&#x60; parameter is used to indicate which blockchain you would like to deposit from. The acceptable value in the &#x60;network&#x60; parameter for each currency can be found from &#x60;networks.asset&#x60; from &#x60;GET /wallet/assets&#x60;. | 

### Return type

**NSString***

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **userGetDepositAddressInformation**
```objc
-(NSURLSessionTask*) userGetDepositAddressInformationWithCurrency: (NSString*) currency
    network: (NSString*) network
        completionHandler: (void (^)(SWGDepositAddress* output, NSError* error)) handler;
```

Get a deposit address.

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


NSString* currency = @"currency_example"; // Any currency. For all currencies, see <a href=\"#!/Wallet/Wallet_getAssetsConfig\">asset config endpoint</a>
NSString* network = @"network_example"; // The `network` parameter is used to indicate which blockchain you would like to deposit from. The acceptable value in the `network` parameter for each currency can be found from `networks.asset` from `GET /wallet/assets`.

SWGUserApi*apiInstance = [[SWGUserApi alloc] init];

// Get a deposit address.
[apiInstance userGetDepositAddressInformationWithCurrency:currency
              network:network
          completionHandler: ^(SWGDepositAddress* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGUserApi->userGetDepositAddressInformation: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currency** | **NSString***| Any currency. For all currencies, see &lt;a href&#x3D;\&quot;#!/Wallet/Wallet_getAssetsConfig\&quot;&gt;asset config endpoint&lt;/a&gt; | 
 **network** | **NSString***| The &#x60;network&#x60; parameter is used to indicate which blockchain you would like to deposit from. The acceptable value in the &#x60;network&#x60; parameter for each currency can be found from &#x60;networks.asset&#x60; from &#x60;GET /wallet/assets&#x60;. | 

### Return type

[**SWGDepositAddress***](SWGDepositAddress.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **userGetExecutionHistory**
```objc
-(NSURLSessionTask*) userGetExecutionHistoryWithSymbol: (NSString*) symbol
    timestamp: (NSDate*) timestamp
        completionHandler: (void (^)(NSArray<SWGExecution>* output, NSError* error)) handler;
```

Get the execution history by day.

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


NSString* symbol = @"XBTUSD"; //  (default to XBTUSD)
NSDate* timestamp = @"2017-02-13T12:00:00.000Z"; //  (default to 2017-02-13T12:00:00.000Z)

SWGUserApi*apiInstance = [[SWGUserApi alloc] init];

// Get the execution history by day.
[apiInstance userGetExecutionHistoryWithSymbol:symbol
              timestamp:timestamp
          completionHandler: ^(NSArray<SWGExecution>* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGUserApi->userGetExecutionHistory: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **NSString***|  | [default to XBTUSD]
 **timestamp** | **NSDate***|  | [default to 2017-02-13T12:00:00.000Z]

### Return type

[**NSArray<SWGExecution>***](SWGExecution.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **userGetMargin**
```objc
-(NSURLSessionTask*) userGetMarginWithCurrency: (NSString*) currency
        completionHandler: (void (^)(SWGMargin* output, NSError* error)) handler;
```

Get your account's margin status. Send a currency of \"all\" to receive an array of all supported currencies.

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


NSString* currency = @"XBt"; // Any currency. For all currencies, see <a href=\"#!/Wallet/Wallet_getAssetsConfig\">asset config endpoint</a>. For all currencies specify \"all\" (optional) (default to XBt)

SWGUserApi*apiInstance = [[SWGUserApi alloc] init];

// Get your account's margin status. Send a currency of \"all\" to receive an array of all supported currencies.
[apiInstance userGetMarginWithCurrency:currency
          completionHandler: ^(SWGMargin* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGUserApi->userGetMargin: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currency** | **NSString***| Any currency. For all currencies, see &lt;a href&#x3D;\&quot;#!/Wallet/Wallet_getAssetsConfig\&quot;&gt;asset config endpoint&lt;/a&gt;. For all currencies specify \&quot;all\&quot; | [optional] [default to XBt]

### Return type

[**SWGMargin***](SWGMargin.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **userGetQuoteFillRatio**
```objc
-(NSURLSessionTask*) userGetQuoteFillRatioWithTargetAccountId: (NSNumber*) targetAccountId
        completionHandler: (void (^)(SWGQuoteFillRatio* output, NSError* error)) handler;
```

Get 7 days worth of Quote Fill Ratio statistics.

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


NSNumber* targetAccountId = @1.2; // AccountId to get quote fill ratio for, must be a paired account with main user. Can be wildcard * to get all accounts linked to the authenticated user (optional)

SWGUserApi*apiInstance = [[SWGUserApi alloc] init];

// Get 7 days worth of Quote Fill Ratio statistics.
[apiInstance userGetQuoteFillRatioWithTargetAccountId:targetAccountId
          completionHandler: ^(SWGQuoteFillRatio* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGUserApi->userGetQuoteFillRatio: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **targetAccountId** | **NSNumber***| AccountId to get quote fill ratio for, must be a paired account with main user. Can be wildcard * to get all accounts linked to the authenticated user | [optional] 

### Return type

[**SWGQuoteFillRatio***](SWGQuoteFillRatio.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **userGetQuoteValueRatio**
```objc
-(NSURLSessionTask*) userGetQuoteValueRatioWithTargetAccountId: (NSNumber*) targetAccountId
        completionHandler: (void (^)(SWGQuoteValueRatio* output, NSError* error)) handler;
```

Get Quote Value Ratio statistics over the last 3 days

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


NSNumber* targetAccountId = @1.2; // AccountId to get quote value ratio for, must be a paired account with main user. Can be wildcard * to get all accounts linked to the authenticated user (optional)

SWGUserApi*apiInstance = [[SWGUserApi alloc] init];

// Get Quote Value Ratio statistics over the last 3 days
[apiInstance userGetQuoteValueRatioWithTargetAccountId:targetAccountId
          completionHandler: ^(SWGQuoteValueRatio* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGUserApi->userGetQuoteValueRatio: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **targetAccountId** | **NSNumber***| AccountId to get quote value ratio for, must be a paired account with main user. Can be wildcard * to get all accounts linked to the authenticated user | [optional] 

### Return type

[**SWGQuoteValueRatio***](SWGQuoteValueRatio.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **userGetStaking**
```objc
-(NSURLSessionTask*) userGetStakingWithCurrency: (NSString*) currency
        completionHandler: (void (^)(NSArray<SWGStakingRecord>* output, NSError* error)) handler;
```

Get the current user staking amount.

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


NSString* currency = @"currency_example"; //  (optional)

SWGUserApi*apiInstance = [[SWGUserApi alloc] init];

// Get the current user staking amount.
[apiInstance userGetStakingWithCurrency:currency
          completionHandler: ^(NSArray<SWGStakingRecord>* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGUserApi->userGetStaking: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currency** | **NSString***|  | [optional] 

### Return type

[**NSArray<SWGStakingRecord>***](SWGStakingRecord.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **userGetStakingInstruments**
```objc
-(NSURLSessionTask*) userGetStakingInstrumentsWithSymbol: (NSString*) symbol
    currency: (NSString*) currency
        completionHandler: (void (^)(NSArray<SWGXAny>* output, NSError* error)) handler;
```

List staking instruments

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


NSString* symbol = @"symbol_example"; //  (optional)
NSString* currency = @"currency_example"; //  (optional)

SWGUserApi*apiInstance = [[SWGUserApi alloc] init];

// List staking instruments
[apiInstance userGetStakingInstrumentsWithSymbol:symbol
              currency:currency
          completionHandler: ^(NSArray<SWGXAny>* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGUserApi->userGetStakingInstruments: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **NSString***|  | [optional] 
 **currency** | **NSString***|  | [optional] 

### Return type

[**NSArray<SWGXAny>***](SWGXAny.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **userGetStakingTiers**
```objc
-(NSURLSessionTask*) userGetStakingTiersWithCurrency: (NSString*) currency
        completionHandler: (void (^)(NSArray<SWGXAny>* output, NSError* error)) handler;
```

List staking tiers for a given currency

### Example 
```objc

NSString* currency = @"currency_example"; // 

SWGUserApi*apiInstance = [[SWGUserApi alloc] init];

// List staking tiers for a given currency
[apiInstance userGetStakingTiersWithCurrency:currency
          completionHandler: ^(NSArray<SWGXAny>* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGUserApi->userGetStakingTiers: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currency** | **NSString***|  | 

### Return type

[**NSArray<SWGXAny>***](SWGXAny.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **userGetTradingVolume**
```objc
-(NSURLSessionTask*) userGetTradingVolumeWithCompletionHandler: 
        (void (^)(NSArray<SWGTradingVolume>* output, NSError* error)) handler;
```

Get your 30 days USD average trading volume

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



SWGUserApi*apiInstance = [[SWGUserApi alloc] init];

// Get your 30 days USD average trading volume
[apiInstance userGetTradingVolumeWithCompletionHandler: 
          ^(NSArray<SWGTradingVolume>* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGUserApi->userGetTradingVolume: %@", error);
                        }
                    }];
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**NSArray<SWGTradingVolume>***](SWGTradingVolume.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **userGetUnstakingRequests**
```objc
-(NSURLSessionTask*) userGetUnstakingRequestsWithStatus: (NSString*) status
        completionHandler: (void (^)(NSArray<SWGStakingRecord>* output, NSError* error)) handler;
```

Get the current user unstaking requests

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


NSString* status = @"status_example"; // 

SWGUserApi*apiInstance = [[SWGUserApi alloc] init];

// Get the current user unstaking requests
[apiInstance userGetUnstakingRequestsWithStatus:status
          completionHandler: ^(NSArray<SWGStakingRecord>* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGUserApi->userGetUnstakingRequests: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **status** | **NSString***|  | 

### Return type

[**NSArray<SWGStakingRecord>***](SWGStakingRecord.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **userGetWallet**
```objc
-(NSURLSessionTask*) userGetWalletWithCurrency: (NSString*) currency
        completionHandler: (void (^)(SWGWallet* output, NSError* error)) handler;
```

Get your current wallet information.

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


NSString* currency = @"XBt"; // Any currency. For all currencies, see <a href=\"#!/Wallet/Wallet_getAssetsConfig\">asset config endpoint</a>. For all currencies specify \"all\" (optional) (default to XBt)

SWGUserApi*apiInstance = [[SWGUserApi alloc] init];

// Get your current wallet information.
[apiInstance userGetWalletWithCurrency:currency
          completionHandler: ^(SWGWallet* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGUserApi->userGetWallet: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currency** | **NSString***| Any currency. For all currencies, see &lt;a href&#x3D;\&quot;#!/Wallet/Wallet_getAssetsConfig\&quot;&gt;asset config endpoint&lt;/a&gt;. For all currencies specify \&quot;all\&quot; | [optional] [default to XBt]

### Return type

[**SWGWallet***](SWGWallet.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **userGetWalletHistory**
```objc
-(NSURLSessionTask*) userGetWalletHistoryWithCurrency: (NSString*) currency
    count: (NSNumber*) count
    start: (NSNumber*) start
    targetAccountId: (NSNumber*) targetAccountId
    reverse: (NSNumber*) reverse
        completionHandler: (void (^)(NSArray<SWGTransaction>* output, NSError* error)) handler;
```

Get a history of all of your wallet transactions (deposits, withdrawals, PNL).

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


NSString* currency = @"XBt"; // Any currency. For all currencies, see <a href=\"#!/Wallet/Wallet_getAssetsConfig\">asset config endpoint</a>. For all currencies specify \"all\" (optional) (default to XBt)
NSNumber* count = @10000; // Number of results to fetch. Fetch results from start to start + count. Max: 10,000 rows. (optional) (default to 10000)
NSNumber* start = @0; // Starting point for results, integer. Default 0. (optional) (default to 0)
NSNumber* targetAccountId = @1.2; // AccountId to view the history of, must be a paired account with the authorised user requesting the history. (optional)
NSNumber* reverse = @true; // Start from the latest transaction record. Default true. (optional) (default to true)

SWGUserApi*apiInstance = [[SWGUserApi alloc] init];

// Get a history of all of your wallet transactions (deposits, withdrawals, PNL).
[apiInstance userGetWalletHistoryWithCurrency:currency
              count:count
              start:start
              targetAccountId:targetAccountId
              reverse:reverse
          completionHandler: ^(NSArray<SWGTransaction>* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGUserApi->userGetWalletHistory: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currency** | **NSString***| Any currency. For all currencies, see &lt;a href&#x3D;\&quot;#!/Wallet/Wallet_getAssetsConfig\&quot;&gt;asset config endpoint&lt;/a&gt;. For all currencies specify \&quot;all\&quot; | [optional] [default to XBt]
 **count** | **NSNumber***| Number of results to fetch. Fetch results from start to start + count. Max: 10,000 rows. | [optional] [default to 10000]
 **start** | **NSNumber***| Starting point for results, integer. Default 0. | [optional] [default to 0]
 **targetAccountId** | **NSNumber***| AccountId to view the history of, must be a paired account with the authorised user requesting the history. | [optional] 
 **reverse** | **NSNumber***| Start from the latest transaction record. Default true. | [optional] [default to true]

### Return type

[**NSArray<SWGTransaction>***](SWGTransaction.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **userGetWalletSummary**
```objc
-(NSURLSessionTask*) userGetWalletSummaryWithCurrency: (NSString*) currency
    startTime: (NSDate*) startTime
    endTime: (NSDate*) endTime
        completionHandler: (void (^)(NSArray<SWGWalletSummaryRecord>* output, NSError* error)) handler;
```

Get a summary of all of your wallet transactions (deposits, withdrawals, PNL).

Provides an aggregated view of transactions, by transaction type, over a specific time period.

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


NSString* currency = @"XBt"; // Any currency. For all currencies, see <a href=\"#!/Wallet/Wallet_getAssetsConfig\">asset config endpoint</a>. For all currencies specify \"all\" (optional) (default to XBt)
NSDate* startTime = @"2013-10-20T19:20:30+01:00"; // Start time for the summary (optional)
NSDate* endTime = @"2013-10-20T19:20:30+01:00"; // End time for the summary (optional)

SWGUserApi*apiInstance = [[SWGUserApi alloc] init];

// Get a summary of all of your wallet transactions (deposits, withdrawals, PNL).
[apiInstance userGetWalletSummaryWithCurrency:currency
              startTime:startTime
              endTime:endTime
          completionHandler: ^(NSArray<SWGWalletSummaryRecord>* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGUserApi->userGetWalletSummary: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currency** | **NSString***| Any currency. For all currencies, see &lt;a href&#x3D;\&quot;#!/Wallet/Wallet_getAssetsConfig\&quot;&gt;asset config endpoint&lt;/a&gt;. For all currencies specify \&quot;all\&quot; | [optional] [default to XBt]
 **startTime** | **NSDate***| Start time for the summary | [optional] 
 **endTime** | **NSDate***| End time for the summary | [optional] 

### Return type

[**NSArray<SWGWalletSummaryRecord>***](SWGWalletSummaryRecord.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **userGetWalletTransferAccounts**
```objc
-(NSURLSessionTask*) userGetWalletTransferAccountsWithCompletionHandler: 
        (void (^)(NSArray<SWGXAny>* output, NSError* error)) handler;
```

Get the list of accounts you can transfer funds between.

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



SWGUserApi*apiInstance = [[SWGUserApi alloc] init];

// Get the list of accounts you can transfer funds between.
[apiInstance userGetWalletTransferAccountsWithCompletionHandler: 
          ^(NSArray<SWGXAny>* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGUserApi->userGetWalletTransferAccounts: %@", error);
                        }
                    }];
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**NSArray<SWGXAny>***](SWGXAny.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **userLogout**
```objc
-(NSURLSessionTask*) userLogoutWithCompletionHandler: 
        (void (^)(NSError* error)) handler;
```

Log out of BitMEX.

### Example 
```objc


SWGUserApi*apiInstance = [[SWGUserApi alloc] init];

// Log out of BitMEX.
[apiInstance userLogoutWithCompletionHandler: 
          ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling SWGUserApi->userLogout: %@", error);
                        }
                    }];
```

### Parameters
This endpoint does not need any parameter.

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **userRequestWithdrawal**
```objc
-(NSURLSessionTask*) userRequestWithdrawalWithCurrency: (NSString*) currency
    network: (NSString*) network
    amount: (NSNumber*) amount
    otpToken: (NSString*) otpToken
    address: (NSString*) address
    memo: (NSString*) memo
    addressId: (NSNumber*) addressId
    targetUserId: (NSNumber*) targetUserId
    fee: (NSNumber*) fee
    text: (NSString*) text
        completionHandler: (void (^)(SWGTransaction* output, NSError* error)) handler;
```

Request a withdrawal to an external wallet.

This will send a confirmation email to the email address on record.

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


NSString* currency = @"XBt"; // Currency you're withdrawing. Any currency. For all currencies, see <a href=\"#!/Wallet/Wallet_getAssetsConfig\">asset config endpoint</a> (default to XBt)
NSString* network = @"network_example"; // The `network` parameter is used to indicate which blockchain you would like to withdraw from. The acceptable value in the `network` parameter for each currency can be found from `networks.asset` from `GET /wallet/assets`.
NSNumber* amount = @789; // Amount of withdrawal currency.
NSString* otpToken = @"otpToken_example"; // 2FA token. Required for all external withdrawals unless the address has skip2FA in addressbook. (optional)
NSString* address = @"address_example"; // Destination Address. One of `address`, `addressId`, `targetUserId` has to be specified. (optional)
NSString* memo = @"memo_example"; // Destination Memo. If `address`, is specified, Destination Memo can also be specified (optional)
NSNumber* addressId = @1.2; // ID of the Destination Address. One of `address`, `addressId`, `targetUserId` has to be specified. (optional)
NSNumber* targetUserId = @1.2; // ID of the Target User. One of `address`, `addressId`, `targetUserId` has to be specified. (optional)
NSNumber* fee = @1.2; // Network fee for Bitcoin withdrawals. If not specified, a default value will be calculated based on Bitcoin network conditions. You will have a chance to confirm this via email. (optional)
NSString* text = @"text_example"; // Optional annotation, e.g. 'Transfer to home wallet'. (optional)

SWGUserApi*apiInstance = [[SWGUserApi alloc] init];

// Request a withdrawal to an external wallet.
[apiInstance userRequestWithdrawalWithCurrency:currency
              network:network
              amount:amount
              otpToken:otpToken
              address:address
              memo:memo
              addressId:addressId
              targetUserId:targetUserId
              fee:fee
              text:text
          completionHandler: ^(SWGTransaction* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGUserApi->userRequestWithdrawal: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currency** | **NSString***| Currency you&#39;re withdrawing. Any currency. For all currencies, see &lt;a href&#x3D;\&quot;#!/Wallet/Wallet_getAssetsConfig\&quot;&gt;asset config endpoint&lt;/a&gt; | [default to XBt]
 **network** | **NSString***| The &#x60;network&#x60; parameter is used to indicate which blockchain you would like to withdraw from. The acceptable value in the &#x60;network&#x60; parameter for each currency can be found from &#x60;networks.asset&#x60; from &#x60;GET /wallet/assets&#x60;. | 
 **amount** | **NSNumber***| Amount of withdrawal currency. | 
 **otpToken** | **NSString***| 2FA token. Required for all external withdrawals unless the address has skip2FA in addressbook. | [optional] 
 **address** | **NSString***| Destination Address. One of &#x60;address&#x60;, &#x60;addressId&#x60;, &#x60;targetUserId&#x60; has to be specified. | [optional] 
 **memo** | **NSString***| Destination Memo. If &#x60;address&#x60;, is specified, Destination Memo can also be specified | [optional] 
 **addressId** | **NSNumber***| ID of the Destination Address. One of &#x60;address&#x60;, &#x60;addressId&#x60;, &#x60;targetUserId&#x60; has to be specified. | [optional] 
 **targetUserId** | **NSNumber***| ID of the Target User. One of &#x60;address&#x60;, &#x60;addressId&#x60;, &#x60;targetUserId&#x60; has to be specified. | [optional] 
 **fee** | **NSNumber***| Network fee for Bitcoin withdrawals. If not specified, a default value will be calculated based on Bitcoin network conditions. You will have a chance to confirm this via email. | [optional] 
 **text** | **NSString***| Optional annotation, e.g. &#39;Transfer to home wallet&#39;. | [optional] 

### Return type

[**SWGTransaction***](SWGTransaction.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **userSavePreferences**
```objc
-(NSURLSessionTask*) userSavePreferencesWithPrefs: (NSString*) prefs
    overwrite: (NSNumber*) overwrite
        completionHandler: (void (^)(SWGUser* output, NSError* error)) handler;
```

Save user preferences.

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


NSString* prefs = @"prefs_example"; // 
NSNumber* overwrite = @false; // If true, will overwrite all existing preferences. (optional) (default to false)

SWGUserApi*apiInstance = [[SWGUserApi alloc] init];

// Save user preferences.
[apiInstance userSavePreferencesWithPrefs:prefs
              overwrite:overwrite
          completionHandler: ^(SWGUser* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGUserApi->userSavePreferences: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **prefs** | **NSString***|  | 
 **overwrite** | **NSNumber***| If true, will overwrite all existing preferences. | [optional] [default to false]

### Return type

[**SWGUser***](SWGUser.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **userUpdateSubAccount**
```objc
-(NSURLSessionTask*) userUpdateSubAccountWithTargetAccountId: (NSNumber*) targetAccountId
    accountName: (NSString*) accountName
        completionHandler: (void (^)(NSObject* output, NSError* error)) handler;
```

Updates the sub-account name.

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


NSNumber* targetAccountId = @1.2; // 
NSString* accountName = @"accountName_example"; // 

SWGUserApi*apiInstance = [[SWGUserApi alloc] init];

// Updates the sub-account name.
[apiInstance userUpdateSubAccountWithTargetAccountId:targetAccountId
              accountName:accountName
          completionHandler: ^(NSObject* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGUserApi->userUpdateSubAccount: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **targetAccountId** | **NSNumber***|  | 
 **accountName** | **NSString***|  | 

### Return type

**NSObject***

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **userWalletTransfer**
```objc
-(NSURLSessionTask*) userWalletTransferWithCurrency: (NSString*) currency
    amount: (NSNumber*) amount
    targetAccountId: (NSNumber*) targetAccountId
    fromAccountId: (NSNumber*) fromAccountId
        completionHandler: (void (^)(SWGTransaction* output, NSError* error)) handler;
```

Execute a transfer to a paired account.

This will send a confirmation email to the email address on record.

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


NSString* currency = @"currency_example"; // Currency you're transfering. Any currency. For all currencies, see <a href=\"#!/Wallet/Wallet_getAssetsConfig\">asset config endpoint</a>
NSNumber* amount = @789; // Amount of transfer.
NSNumber* targetAccountId = @1.2; // AccountId to send the transfer to, must be a paired account with the user sending the transfer.
NSNumber* fromAccountId = @1.2; // AccountID to send the transfer from. Must be paired account with the authenticated user. (optional)

SWGUserApi*apiInstance = [[SWGUserApi alloc] init];

// Execute a transfer to a paired account.
[apiInstance userWalletTransferWithCurrency:currency
              amount:amount
              targetAccountId:targetAccountId
              fromAccountId:fromAccountId
          completionHandler: ^(SWGTransaction* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGUserApi->userWalletTransfer: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currency** | **NSString***| Currency you&#39;re transfering. Any currency. For all currencies, see &lt;a href&#x3D;\&quot;#!/Wallet/Wallet_getAssetsConfig\&quot;&gt;asset config endpoint&lt;/a&gt; | 
 **amount** | **NSNumber***| Amount of transfer. | 
 **targetAccountId** | **NSNumber***| AccountId to send the transfer to, must be a paired account with the user sending the transfer. | 
 **fromAccountId** | **NSNumber***| AccountID to send the transfer from. Must be paired account with the authenticated user. | [optional] 

### Return type

[**SWGTransaction***](SWGTransaction.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

