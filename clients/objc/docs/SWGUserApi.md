# SWGUserApi

All URIs are relative to *https://localhost/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**userCancelWithdrawal**](SWGUserApi.md#usercancelwithdrawal) | **POST** /user/cancelWithdrawal | Cancel a withdrawal.
[**userCheckReferralCode**](SWGUserApi.md#usercheckreferralcode) | **GET** /user/checkReferralCode | Check if a referral code is valid.
[**userConfirmEmail**](SWGUserApi.md#userconfirmemail) | **POST** /user/confirmEmail | Confirm your email address with a token.
[**userConfirmEnableTFA**](SWGUserApi.md#userconfirmenabletfa) | **POST** /user/confirmEnableTFA | Confirm two-factor auth for this account. If using a Yubikey, simply send a token to this endpoint.
[**userConfirmPasswordReset**](SWGUserApi.md#userconfirmpasswordreset) | **POST** /user/confirmPasswordReset | Confirm a password reset.
[**userConfirmWithdrawal**](SWGUserApi.md#userconfirmwithdrawal) | **POST** /user/confirmWithdrawal | Confirm a withdrawal.
[**userDisableTFA**](SWGUserApi.md#userdisabletfa) | **POST** /user/disableTFA | Disable two-factor auth for this account.
[**userGet**](SWGUserApi.md#userget) | **GET** /user | Get your user model.
[**userGetAffiliateStatus**](SWGUserApi.md#usergetaffiliatestatus) | **GET** /user/affiliateStatus | Get your current affiliate/referral status.
[**userGetCommission**](SWGUserApi.md#usergetcommission) | **GET** /user/commission | Get your account&#39;s commission status.
[**userGetDepositAddress**](SWGUserApi.md#usergetdepositaddress) | **GET** /user/depositAddress | Get a deposit address.
[**userGetMargin**](SWGUserApi.md#usergetmargin) | **GET** /user/margin | Get your account&#39;s margin status. Send a currency of \&quot;all\&quot; to receive an array of all supported currencies.
[**userGetWalletHistory**](SWGUserApi.md#usergetwallethistory) | **GET** /user/walletHistory | Get a history of all of your wallet transactions (deposits and withdrawals).
[**userLogin**](SWGUserApi.md#userlogin) | **POST** /user/login | Log in to BitMEX.
[**userLogout**](SWGUserApi.md#userlogout) | **POST** /user/logout | Log out of BitMEX.
[**userLogoutAll**](SWGUserApi.md#userlogoutall) | **POST** /user/logoutAll | Log all systems out of BitMEX. This will revoke all of your account&#39;s access tokens, logging you out on all devices.
[**userNew**](SWGUserApi.md#usernew) | **POST** /user | Register a new user.
[**userRequestEnableTFA**](SWGUserApi.md#userrequestenabletfa) | **POST** /user/requestEnableTFA | Get Google Authenticator secret key for setting up two-factor auth. Fails if already enabled. Use /confirmEnableTFA for Yubikeys.
[**userRequestPasswordReset**](SWGUserApi.md#userrequestpasswordreset) | **POST** /user/requestPasswordReset | Request a password reset.
[**userRequestWithdrawal**](SWGUserApi.md#userrequestwithdrawal) | **POST** /user/requestWithdrawal | Request a withdrawal to an external wallet.
[**userSavePreferences**](SWGUserApi.md#usersavepreferences) | **POST** /user/preferences | Save user preferences.
[**userSendVerificationEmail**](SWGUserApi.md#usersendverificationemail) | **POST** /user/resendVerificationEmail | Re-send verification email.
[**userUpdate**](SWGUserApi.md#userupdate) | **PUT** /user | Update your password, name, and other attributes.


# **userCancelWithdrawal**
```objc
-(NSNumber*) userCancelWithdrawalWithToken: (NSString*) token
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
-(NSNumber*) userCheckReferralCodeWithReferralCode: (NSString*) referralCode
        completionHandler: (void (^)(NSNumber* output, NSError* error)) handler;
```

Check if a referral code is valid.

If the code is valid, responds with the referral code's discount (e.g. `0.1` for 10%). Otherwise, will return a 404.

### Example 
```objc

NSString* referralCode = @"referralCode_example"; //  (optional)

SWGUserApi*apiInstance = [[SWGUserApi alloc] init];

// Check if a referral code is valid.
[apiInstance userCheckReferralCodeWithReferralCode:referralCode
          completionHandler: ^(NSNumber* output, NSError* error) {
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

**NSNumber***

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **userConfirmEmail**
```objc
-(NSNumber*) userConfirmEmailWithToken: (NSString*) token
        completionHandler: (void (^)(SWGAccessToken* output, NSError* error)) handler;
```

Confirm your email address with a token.

### Example 
```objc

NSString* token = @"token_example"; // 

SWGUserApi*apiInstance = [[SWGUserApi alloc] init];

// Confirm your email address with a token.
[apiInstance userConfirmEmailWithToken:token
          completionHandler: ^(SWGAccessToken* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGUserApi->userConfirmEmail: %@", error);
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

# **userConfirmEnableTFA**
```objc
-(NSNumber*) userConfirmEnableTFAWithToken: (NSString*) token
    type: (NSString*) type
        completionHandler: (void (^)(NSNumber* output, NSError* error)) handler;
```

Confirm two-factor auth for this account. If using a Yubikey, simply send a token to this endpoint.

### Example 
```objc

NSString* token = @"token_example"; // Token from your selected TFA type.
NSString* type = @"type_example"; // Two-factor auth type. Supported types: 'GA' (Google Authenticator), 'Yubikey' (optional)

SWGUserApi*apiInstance = [[SWGUserApi alloc] init];

// Confirm two-factor auth for this account. If using a Yubikey, simply send a token to this endpoint.
[apiInstance userConfirmEnableTFAWithToken:token
              type:type
          completionHandler: ^(NSNumber* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGUserApi->userConfirmEnableTFA: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **NSString***| Token from your selected TFA type. | 
 **type** | **NSString***| Two-factor auth type. Supported types: &#39;GA&#39; (Google Authenticator), &#39;Yubikey&#39; | [optional] 

### Return type

**NSNumber***

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **userConfirmPasswordReset**
```objc
-(NSNumber*) userConfirmPasswordResetWithToken: (NSString*) token
    varNewPassword: (NSString*) varNewPassword
        completionHandler: (void (^)(NSNumber* output, NSError* error)) handler;
```

Confirm a password reset.

### Example 
```objc

NSString* token = @"token_example"; // 
NSString* varNewPassword = @"varNewPassword_example"; // 

SWGUserApi*apiInstance = [[SWGUserApi alloc] init];

// Confirm a password reset.
[apiInstance userConfirmPasswordResetWithToken:token
              varNewPassword:varNewPassword
          completionHandler: ^(NSNumber* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGUserApi->userConfirmPasswordReset: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **NSString***|  | 
 **varNewPassword** | **NSString***|  | 

### Return type

**NSNumber***

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **userConfirmWithdrawal**
```objc
-(NSNumber*) userConfirmWithdrawalWithToken: (NSString*) token
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

# **userDisableTFA**
```objc
-(NSNumber*) userDisableTFAWithToken: (NSString*) token
    type: (NSString*) type
        completionHandler: (void (^)(NSNumber* output, NSError* error)) handler;
```

Disable two-factor auth for this account.

### Example 
```objc

NSString* token = @"token_example"; // Token from your selected TFA type.
NSString* type = @"type_example"; // Two-factor auth type. Supported types: 'GA' (Google Authenticator) (optional)

SWGUserApi*apiInstance = [[SWGUserApi alloc] init];

// Disable two-factor auth for this account.
[apiInstance userDisableTFAWithToken:token
              type:type
          completionHandler: ^(NSNumber* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGUserApi->userDisableTFA: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **NSString***| Token from your selected TFA type. | 
 **type** | **NSString***| Two-factor auth type. Supported types: &#39;GA&#39; (Google Authenticator) | [optional] 

### Return type

**NSNumber***

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **userGet**
```objc
-(NSNumber*) userGetWithCompletionHandler: 
        (void (^)(SWGUser* output, NSError* error)) handler;
```

Get your user model.

### Example 
```objc


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

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **userGetAffiliateStatus**
```objc
-(NSNumber*) userGetAffiliateStatusWithCompletionHandler: 
        (void (^)(NSArray<SWGAffiliate>* output, NSError* error)) handler;
```

Get your current affiliate/referral status.

### Example 
```objc


SWGUserApi*apiInstance = [[SWGUserApi alloc] init];

// Get your current affiliate/referral status.
[apiInstance userGetAffiliateStatusWithCompletionHandler: 
          ^(NSArray<SWGAffiliate>* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGUserApi->userGetAffiliateStatus: %@", error);
                        }
                    }];
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**NSArray<SWGAffiliate>***](SWGAffiliate.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **userGetCommission**
```objc
-(NSNumber*) userGetCommissionWithCompletionHandler: 
        (void (^)(NSArray<SWGUserCommission>* output, NSError* error)) handler;
```

Get your account's commission status.

### Example 
```objc


SWGUserApi*apiInstance = [[SWGUserApi alloc] init];

// Get your account's commission status.
[apiInstance userGetCommissionWithCompletionHandler: 
          ^(NSArray<SWGUserCommission>* output, NSError* error) {
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

[**NSArray<SWGUserCommission>***](SWGUserCommission.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **userGetDepositAddress**
```objc
-(NSNumber*) userGetDepositAddressWithCurrency: (NSString*) currency
        completionHandler: (void (^)(NSString* output, NSError* error)) handler;
```

Get a deposit address.

### Example 
```objc

NSString* currency = @"XBt"; //  (optional) (default to XBt)

SWGUserApi*apiInstance = [[SWGUserApi alloc] init];

// Get a deposit address.
[apiInstance userGetDepositAddressWithCurrency:currency
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
 **currency** | **NSString***|  | [optional] [default to XBt]

### Return type

**NSString***

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **userGetMargin**
```objc
-(NSNumber*) userGetMarginWithCurrency: (NSString*) currency
        completionHandler: (void (^)(SWGMargin* output, NSError* error)) handler;
```

Get your account's margin status. Send a currency of \"all\" to receive an array of all supported currencies.

### Example 
```objc

NSString* currency = @"XBt"; //  (optional) (default to XBt)

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
 **currency** | **NSString***|  | [optional] [default to XBt]

### Return type

[**SWGMargin***](SWGMargin.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **userGetWalletHistory**
```objc
-(NSNumber*) userGetWalletHistoryWithCurrency: (NSString*) currency
        completionHandler: (void (^)(NSArray<SWGTransaction>* output, NSError* error)) handler;
```

Get a history of all of your wallet transactions (deposits and withdrawals).

### Example 
```objc

NSString* currency = @"XBt"; //  (optional) (default to XBt)

SWGUserApi*apiInstance = [[SWGUserApi alloc] init];

// Get a history of all of your wallet transactions (deposits and withdrawals).
[apiInstance userGetWalletHistoryWithCurrency:currency
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
 **currency** | **NSString***|  | [optional] [default to XBt]

### Return type

[**NSArray<SWGTransaction>***](SWGTransaction.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **userLogin**
```objc
-(NSNumber*) userLoginWithEmail: (NSString*) email
    password: (NSString*) password
    token: (NSString*) token
        completionHandler: (void (^)(SWGAccessToken* output, NSError* error)) handler;
```

Log in to BitMEX.

### Example 
```objc

NSString* email = @"email_example"; // Your email address.
NSString* password = @"password_example"; // Your password.
NSString* token = @"token_example"; // OTP Token (YubiKey, Google Authenticator) (optional)

SWGUserApi*apiInstance = [[SWGUserApi alloc] init];

// Log in to BitMEX.
[apiInstance userLoginWithEmail:email
              password:password
              token:token
          completionHandler: ^(SWGAccessToken* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGUserApi->userLogin: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **email** | **NSString***| Your email address. | 
 **password** | **NSString***| Your password. | 
 **token** | **NSString***| OTP Token (YubiKey, Google Authenticator) | [optional] 

### Return type

[**SWGAccessToken***](SWGAccessToken.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **userLogout**
```objc
-(NSNumber*) userLogoutWithCompletionHandler: 
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

# **userLogoutAll**
```objc
-(NSNumber*) userLogoutAllWithCompletionHandler: 
        (void (^)(NSNumber* output, NSError* error)) handler;
```

Log all systems out of BitMEX. This will revoke all of your account's access tokens, logging you out on all devices.

### Example 
```objc


SWGUserApi*apiInstance = [[SWGUserApi alloc] init];

// Log all systems out of BitMEX. This will revoke all of your account's access tokens, logging you out on all devices.
[apiInstance userLogoutAllWithCompletionHandler: 
          ^(NSNumber* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGUserApi->userLogoutAll: %@", error);
                        }
                    }];
```

### Parameters
This endpoint does not need any parameter.

### Return type

**NSNumber***

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **userNew**
```objc
-(NSNumber*) userNewWithEmail: (NSString*) email
    password: (NSString*) password
    country: (NSString*) country
    username: (NSString*) username
    firstname: (NSString*) firstname
    lastname: (NSString*) lastname
    acceptsTOS: (NSString*) acceptsTOS
    referrerID: (NSString*) referrerID
    tfaType: (NSString*) tfaType
    tfaToken: (NSString*) tfaToken
        completionHandler: (void (^)(SWGUser* output, NSError* error)) handler;
```

Register a new user.

### Example 
```objc

NSString* email = @"email_example"; // Your email address.
NSString* password = @"password_example"; // Your password.
NSString* country = @"country_example"; // Country of residence.
NSString* username = @"username_example"; // Desired username. (optional)
NSString* firstname = @"firstname_example"; // First name. (optional)
NSString* lastname = @"lastname_example"; // Last name. (optional)
NSString* acceptsTOS = @"acceptsTOS_example"; // Set to true to indicate acceptance of the Terms of Service (https://www.bitmex.com/terms). (optional)
NSString* referrerID = @"referrerID_example"; // Optional Referrer ID. (optional)
NSString* tfaType = @"tfaType_example"; // Optional Two-Factor Type. Accepted values: GA, Yubikey, Clef (optional)
NSString* tfaToken = @"tfaToken_example"; // Two-Factor Token. (optional)

SWGUserApi*apiInstance = [[SWGUserApi alloc] init];

// Register a new user.
[apiInstance userNewWithEmail:email
              password:password
              country:country
              username:username
              firstname:firstname
              lastname:lastname
              acceptsTOS:acceptsTOS
              referrerID:referrerID
              tfaType:tfaType
              tfaToken:tfaToken
          completionHandler: ^(SWGUser* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGUserApi->userNew: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **email** | **NSString***| Your email address. | 
 **password** | **NSString***| Your password. | 
 **country** | **NSString***| Country of residence. | 
 **username** | **NSString***| Desired username. | [optional] 
 **firstname** | **NSString***| First name. | [optional] 
 **lastname** | **NSString***| Last name. | [optional] 
 **acceptsTOS** | **NSString***| Set to true to indicate acceptance of the Terms of Service (https://www.bitmex.com/terms). | [optional] 
 **referrerID** | **NSString***| Optional Referrer ID. | [optional] 
 **tfaType** | **NSString***| Optional Two-Factor Type. Accepted values: GA, Yubikey, Clef | [optional] 
 **tfaToken** | **NSString***| Two-Factor Token. | [optional] 

### Return type

[**SWGUser***](SWGUser.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **userRequestEnableTFA**
```objc
-(NSNumber*) userRequestEnableTFAWithType: (NSString*) type
        completionHandler: (void (^)(NSNumber* output, NSError* error)) handler;
```

Get Google Authenticator secret key for setting up two-factor auth. Fails if already enabled. Use /confirmEnableTFA for Yubikeys.

### Example 
```objc

NSString* type = @"type_example"; // Two-factor auth type. Supported types: 'GA' (Google Authenticator) (optional)

SWGUserApi*apiInstance = [[SWGUserApi alloc] init];

// Get Google Authenticator secret key for setting up two-factor auth. Fails if already enabled. Use /confirmEnableTFA for Yubikeys.
[apiInstance userRequestEnableTFAWithType:type
          completionHandler: ^(NSNumber* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGUserApi->userRequestEnableTFA: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **NSString***| Two-factor auth type. Supported types: &#39;GA&#39; (Google Authenticator) | [optional] 

### Return type

**NSNumber***

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **userRequestPasswordReset**
```objc
-(NSNumber*) userRequestPasswordResetWithEmail: (NSString*) email
        completionHandler: (void (^)(NSNumber* output, NSError* error)) handler;
```

Request a password reset.

### Example 
```objc

NSString* email = @"email_example"; // 

SWGUserApi*apiInstance = [[SWGUserApi alloc] init];

// Request a password reset.
[apiInstance userRequestPasswordResetWithEmail:email
          completionHandler: ^(NSNumber* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGUserApi->userRequestPasswordReset: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **email** | **NSString***|  | 

### Return type

**NSNumber***

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **userRequestWithdrawal**
```objc
-(NSNumber*) userRequestWithdrawalWithCurrency: (NSString*) currency
    amount: (NSNumber*) amount
    address: (NSString*) address
    otpToken: (NSString*) otpToken
    fee: (NSNumber*) fee
        completionHandler: (void (^)(SWGTransaction* output, NSError* error)) handler;
```

Request a withdrawal to an external wallet.

This will send a confirmation email to the email address on record, unless requested via an API Key with the `withdraw` permission.

### Example 
```objc

NSString* currency = @"XBt"; // Currency you're withdrawing. Options: `XBt` (default to XBt)
NSNumber* amount = @3.4; // Amount of withdrawal currency.
NSString* address = @"address_example"; // Destination Address.
NSString* otpToken = @"otpToken_example"; // 2FA token. Required if 2FA is enabled on your account. (optional)
NSNumber* fee = @1.2; // Network fee for Bitcoin withdrawals. If not specified, a default value will be calculated based on Bitcoin network conditions. You will have a chance to confirm this via email. (optional)

SWGUserApi*apiInstance = [[SWGUserApi alloc] init];

// Request a withdrawal to an external wallet.
[apiInstance userRequestWithdrawalWithCurrency:currency
              amount:amount
              address:address
              otpToken:otpToken
              fee:fee
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
 **currency** | **NSString***| Currency you&#39;re withdrawing. Options: &#x60;XBt&#x60; | [default to XBt]
 **amount** | **NSNumber***| Amount of withdrawal currency. | 
 **address** | **NSString***| Destination Address. | 
 **otpToken** | **NSString***| 2FA token. Required if 2FA is enabled on your account. | [optional] 
 **fee** | **NSNumber***| Network fee for Bitcoin withdrawals. If not specified, a default value will be calculated based on Bitcoin network conditions. You will have a chance to confirm this via email. | [optional] 

### Return type

[**SWGTransaction***](SWGTransaction.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **userSavePreferences**
```objc
-(NSNumber*) userSavePreferencesWithPrefs: (NSString*) prefs
    overwrite: (NSNumber*) overwrite
        completionHandler: (void (^)(SWGUser* output, NSError* error)) handler;
```

Save user preferences.

### Example 
```objc

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

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **userSendVerificationEmail**
```objc
-(NSNumber*) userSendVerificationEmailWithEmail: (NSString*) email
        completionHandler: (void (^)(NSNumber* output, NSError* error)) handler;
```

Re-send verification email.

### Example 
```objc

NSString* email = @"email_example"; // 

SWGUserApi*apiInstance = [[SWGUserApi alloc] init];

// Re-send verification email.
[apiInstance userSendVerificationEmailWithEmail:email
          completionHandler: ^(NSNumber* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGUserApi->userSendVerificationEmail: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **email** | **NSString***|  | 

### Return type

**NSNumber***

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **userUpdate**
```objc
-(NSNumber*) userUpdateWithFirstname: (NSString*) firstname
    lastname: (NSString*) lastname
    oldPassword: (NSString*) oldPassword
    varNewPassword: (NSString*) varNewPassword
    varNewPasswordConfirm: (NSString*) varNewPasswordConfirm
    username: (NSString*) username
    country: (NSString*) country
    pgpPubKey: (NSString*) pgpPubKey
        completionHandler: (void (^)(SWGUser* output, NSError* error)) handler;
```

Update your password, name, and other attributes.

### Example 
```objc

NSString* firstname = @"firstname_example"; //  (optional)
NSString* lastname = @"lastname_example"; //  (optional)
NSString* oldPassword = @"oldPassword_example"; //  (optional)
NSString* varNewPassword = @"varNewPassword_example"; //  (optional)
NSString* varNewPasswordConfirm = @"varNewPasswordConfirm_example"; //  (optional)
NSString* username = @"username_example"; // Username can only be set once. To reset, email support. (optional)
NSString* country = @"country_example"; // Country of residence. (optional)
NSString* pgpPubKey = @"pgpPubKey_example"; // PGP Public Key. If specified, automated emails will be sentwith this key. (optional)

SWGUserApi*apiInstance = [[SWGUserApi alloc] init];

// Update your password, name, and other attributes.
[apiInstance userUpdateWithFirstname:firstname
              lastname:lastname
              oldPassword:oldPassword
              varNewPassword:varNewPassword
              varNewPasswordConfirm:varNewPasswordConfirm
              username:username
              country:country
              pgpPubKey:pgpPubKey
          completionHandler: ^(SWGUser* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGUserApi->userUpdate: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **firstname** | **NSString***|  | [optional] 
 **lastname** | **NSString***|  | [optional] 
 **oldPassword** | **NSString***|  | [optional] 
 **varNewPassword** | **NSString***|  | [optional] 
 **varNewPasswordConfirm** | **NSString***|  | [optional] 
 **username** | **NSString***| Username can only be set once. To reset, email support. | [optional] 
 **country** | **NSString***| Country of residence. | [optional] 
 **pgpPubKey** | **NSString***| PGP Public Key. If specified, automated emails will be sentwith this key. | [optional] 

### Return type

[**SWGUser***](SWGUser.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

