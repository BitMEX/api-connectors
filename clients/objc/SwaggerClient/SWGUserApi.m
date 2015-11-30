#import "SWGUserApi.h"
#import "SWGQueryParamCollection.h"
#import "SWGUser.h"
#import "SWGAffiliate.h"
#import "SWGTransaction.h"
#import "SWGUserCommission.h"
#import "SWGAccessToken.h"
#import "SWGMargin.h"


@interface SWGUserApi ()
    @property (readwrite, nonatomic, strong) NSMutableDictionary *defaultHeaders;
@end

@implementation SWGUserApi

static SWGUserApi* singletonAPI = nil;

#pragma mark - Initialize methods

- (id) init {
    self = [super init];
    if (self) {
        SWGConfiguration *config = [SWGConfiguration sharedConfig];
        if (config.apiClient == nil) {
            config.apiClient = [[SWGApiClient alloc] init];
        }
        self.apiClient = config.apiClient;
        self.defaultHeaders = [NSMutableDictionary dictionary];
    }
    return self;
}

- (id) initWithApiClient:(SWGApiClient *)apiClient {
    self = [super init];
    if (self) {
        self.apiClient = apiClient;
        self.defaultHeaders = [NSMutableDictionary dictionary];
    }
    return self;
}

#pragma mark -

+(SWGUserApi*) apiWithHeader:(NSString*)headerValue key:(NSString*)key {

    if (singletonAPI == nil) {
        singletonAPI = [[SWGUserApi alloc] init];
        [singletonAPI addHeader:headerValue forKey:key];
    }
    return singletonAPI;
}

+(SWGUserApi*) sharedAPI {

    if (singletonAPI == nil) {
        singletonAPI = [[SWGUserApi alloc] init];
    }
    return singletonAPI;
}

-(void) addHeader:(NSString*)value forKey:(NSString*)key {
    [self.defaultHeaders setValue:value forKey:key];
}

-(void) setHeaderValue:(NSString*) value
           forKey:(NSString*)key {
    [self.defaultHeaders setValue:value forKey:key];
}

-(unsigned long) requestQueueSize {
    return [SWGApiClient requestQueueSize];
}

#pragma mark - Api Methods

///
/// Get your user model.
/// 
///  @returns SWGUser*
///
-(NSNumber*) userGetMeWithCompletionBlock: 
        (void (^)(SWGUser* output, NSError* error))completionBlock { 
        

    

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/user"];

    // remove format in URL if needed
    if ([resourcePath rangeOfString:@".{format}"].location != NSNotFound) {
        [resourcePath replaceCharactersInRange: [resourcePath rangeOfString:@".{format}"] withString:@".json"];
    }

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.defaultHeaders];

    

    // HTTP header `Accept`
    headerParams[@"Accept"] = [SWGApiClient selectHeaderAccept:@[@"application/json", @"application/xml", @"text/xml", @"application/javascript", @"text/javascript"]];
    if ([headerParams[@"Accept"] length] == 0) {
        [headerParams removeObjectForKey:@"Accept"];
    }

    // response content type
    NSString *responseContentType;
    if ([headerParams objectForKey:@"Accept"]) {
        responseContentType = [headerParams[@"Accept"] componentsSeparatedByString:@", "][0];
    }
    else {
        responseContentType = @"";
    }

    // request content type
    NSString *requestContentType = [SWGApiClient selectHeaderContentType:@[@"application/json", @"application/x-www-form-urlencoded"]];

    // Authentication setting
    NSArray *authSettings = @[];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *files = [[NSMutableDictionary alloc] init];
    
    
    

    
    return [self.apiClient requestWithCompletionBlock: resourcePath
                                               method: @"GET"
                                           pathParams: pathParams
                                          queryParams: queryParams
                                           formParams: formParams
                                                files: files
                                                 body: bodyParam
                                         headerParams: headerParams
                                         authSettings: authSettings
                                   requestContentType: requestContentType
                                  responseContentType: responseContentType
                                         responseType: @"SWGUser*"
                                      completionBlock: ^(id data, NSError *error) {
                  
                  completionBlock((SWGUser*)data, error);
              }
          ];
}

///
/// Update your password, name, and other attributes.
/// 
///  @param firstname 
///
///  @param lastname 
///
///  @param oldPassword 
///
///  @param newPassword 
///
///  @param newPasswordConfirm 
///
///  @param country Country of residence.
///
///  @param pgpPubKey PGP Public Key. If specified, automated emails will be sentwith this key.
///
///  @returns SWGUser*
///
-(NSNumber*) userUpdateMeWithCompletionBlock: (NSString*) firstname
         lastname: (NSString*) lastname
         oldPassword: (NSString*) oldPassword
         newPassword: (NSString*) newPassword
         newPasswordConfirm: (NSString*) newPasswordConfirm
         country: (NSString*) country
         pgpPubKey: (NSString*) pgpPubKey
        
        completionHandler: (void (^)(SWGUser* output, NSError* error))completionBlock { 
        

    

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/user"];

    // remove format in URL if needed
    if ([resourcePath rangeOfString:@".{format}"].location != NSNotFound) {
        [resourcePath replaceCharactersInRange: [resourcePath rangeOfString:@".{format}"] withString:@".json"];
    }

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.defaultHeaders];

    

    // HTTP header `Accept`
    headerParams[@"Accept"] = [SWGApiClient selectHeaderAccept:@[@"application/json", @"application/xml", @"text/xml", @"application/javascript", @"text/javascript"]];
    if ([headerParams[@"Accept"] length] == 0) {
        [headerParams removeObjectForKey:@"Accept"];
    }

    // response content type
    NSString *responseContentType;
    if ([headerParams objectForKey:@"Accept"]) {
        responseContentType = [headerParams[@"Accept"] componentsSeparatedByString:@", "][0];
    }
    else {
        responseContentType = @"";
    }

    // request content type
    NSString *requestContentType = [SWGApiClient selectHeaderContentType:@[@"application/json", @"application/x-www-form-urlencoded"]];

    // Authentication setting
    NSArray *authSettings = @[];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *files = [[NSMutableDictionary alloc] init];
    
    
    
    if (firstname) {
        formParams[@"firstname"] = firstname;
    }
    
    
    
    if (lastname) {
        formParams[@"lastname"] = lastname;
    }
    
    
    
    if (oldPassword) {
        formParams[@"oldPassword"] = oldPassword;
    }
    
    
    
    if (newPassword) {
        formParams[@"newPassword"] = newPassword;
    }
    
    
    
    if (newPasswordConfirm) {
        formParams[@"newPasswordConfirm"] = newPasswordConfirm;
    }
    
    
    
    if (country) {
        formParams[@"country"] = country;
    }
    
    
    
    if (pgpPubKey) {
        formParams[@"pgpPubKey"] = pgpPubKey;
    }
    
    
    

    
    return [self.apiClient requestWithCompletionBlock: resourcePath
                                               method: @"PUT"
                                           pathParams: pathParams
                                          queryParams: queryParams
                                           formParams: formParams
                                                files: files
                                                 body: bodyParam
                                         headerParams: headerParams
                                         authSettings: authSettings
                                   requestContentType: requestContentType
                                  responseContentType: responseContentType
                                         responseType: @"SWGUser*"
                                      completionBlock: ^(id data, NSError *error) {
                  
                  completionBlock((SWGUser*)data, error);
              }
          ];
}

///
/// Register a new user.
/// 
///  @param email Your email address.
///
///  @param password Your password.
///
///  @param username Desired username.
///
///  @param firstname First name.
///
///  @param lastname Last name.
///
///  @param acceptsTOS Set to true to indicate acceptance of the Terms of Service (https://www.bitmex.com/app/terms).
///
///  @param referrerID Optional Referrer ID.
///
///  @param country Country of residence.
///
///  @returns SWGUser*
///
-(NSNumber*) userNewUserWithCompletionBlock: (NSString*) email
         password: (NSString*) password
         username: (NSString*) username
         firstname: (NSString*) firstname
         lastname: (NSString*) lastname
         acceptsTOS: (NSString*) acceptsTOS
         referrerID: (NSString*) referrerID
         country: (NSString*) country
        
        completionHandler: (void (^)(SWGUser* output, NSError* error))completionBlock { 
        

    
    // verify the required parameter 'email' is set
    if (email == nil) {
        [NSException raise:@"Invalid parameter" format:@"Missing the required parameter `email` when calling `userNewUser`"];
    }
    
    // verify the required parameter 'password' is set
    if (password == nil) {
        [NSException raise:@"Invalid parameter" format:@"Missing the required parameter `password` when calling `userNewUser`"];
    }
    
    // verify the required parameter 'username' is set
    if (username == nil) {
        [NSException raise:@"Invalid parameter" format:@"Missing the required parameter `username` when calling `userNewUser`"];
    }
    

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/user"];

    // remove format in URL if needed
    if ([resourcePath rangeOfString:@".{format}"].location != NSNotFound) {
        [resourcePath replaceCharactersInRange: [resourcePath rangeOfString:@".{format}"] withString:@".json"];
    }

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.defaultHeaders];

    

    // HTTP header `Accept`
    headerParams[@"Accept"] = [SWGApiClient selectHeaderAccept:@[@"application/json", @"application/xml", @"text/xml", @"application/javascript", @"text/javascript"]];
    if ([headerParams[@"Accept"] length] == 0) {
        [headerParams removeObjectForKey:@"Accept"];
    }

    // response content type
    NSString *responseContentType;
    if ([headerParams objectForKey:@"Accept"]) {
        responseContentType = [headerParams[@"Accept"] componentsSeparatedByString:@", "][0];
    }
    else {
        responseContentType = @"";
    }

    // request content type
    NSString *requestContentType = [SWGApiClient selectHeaderContentType:@[@"application/json", @"application/x-www-form-urlencoded"]];

    // Authentication setting
    NSArray *authSettings = @[];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *files = [[NSMutableDictionary alloc] init];
    
    
    
    if (email) {
        formParams[@"email"] = email;
    }
    
    
    
    if (password) {
        formParams[@"password"] = password;
    }
    
    
    
    if (username) {
        formParams[@"username"] = username;
    }
    
    
    
    if (firstname) {
        formParams[@"firstname"] = firstname;
    }
    
    
    
    if (lastname) {
        formParams[@"lastname"] = lastname;
    }
    
    
    
    if (acceptsTOS) {
        formParams[@"acceptsTOS"] = acceptsTOS;
    }
    
    
    
    if (referrerID) {
        formParams[@"referrerID"] = referrerID;
    }
    
    
    
    if (country) {
        formParams[@"country"] = country;
    }
    
    
    

    
    return [self.apiClient requestWithCompletionBlock: resourcePath
                                               method: @"POST"
                                           pathParams: pathParams
                                          queryParams: queryParams
                                           formParams: formParams
                                                files: files
                                                 body: bodyParam
                                         headerParams: headerParams
                                         authSettings: authSettings
                                   requestContentType: requestContentType
                                  responseContentType: responseContentType
                                         responseType: @"SWGUser*"
                                      completionBlock: ^(id data, NSError *error) {
                  
                  completionBlock((SWGUser*)data, error);
              }
          ];
}

///
/// Get your current affiliate/referral status.
/// 
///  @returns NSArray<SWGAffiliate>*
///
-(NSNumber*) userGetAffiliateStatusWithCompletionBlock: 
        (void (^)(NSArray<SWGAffiliate>* output, NSError* error))completionBlock { 
        

    

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/user/affiliateStatus"];

    // remove format in URL if needed
    if ([resourcePath rangeOfString:@".{format}"].location != NSNotFound) {
        [resourcePath replaceCharactersInRange: [resourcePath rangeOfString:@".{format}"] withString:@".json"];
    }

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.defaultHeaders];

    

    // HTTP header `Accept`
    headerParams[@"Accept"] = [SWGApiClient selectHeaderAccept:@[@"application/json", @"application/xml", @"text/xml", @"application/javascript", @"text/javascript"]];
    if ([headerParams[@"Accept"] length] == 0) {
        [headerParams removeObjectForKey:@"Accept"];
    }

    // response content type
    NSString *responseContentType;
    if ([headerParams objectForKey:@"Accept"]) {
        responseContentType = [headerParams[@"Accept"] componentsSeparatedByString:@", "][0];
    }
    else {
        responseContentType = @"";
    }

    // request content type
    NSString *requestContentType = [SWGApiClient selectHeaderContentType:@[@"application/json", @"application/x-www-form-urlencoded"]];

    // Authentication setting
    NSArray *authSettings = @[];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *files = [[NSMutableDictionary alloc] init];
    
    
    

    
    return [self.apiClient requestWithCompletionBlock: resourcePath
                                               method: @"GET"
                                           pathParams: pathParams
                                          queryParams: queryParams
                                           formParams: formParams
                                                files: files
                                                 body: bodyParam
                                         headerParams: headerParams
                                         authSettings: authSettings
                                   requestContentType: requestContentType
                                  responseContentType: responseContentType
                                         responseType: @"NSArray<SWGAffiliate>*"
                                      completionBlock: ^(id data, NSError *error) {
                  
                  completionBlock((NSArray<SWGAffiliate>*)data, error);
              }
          ];
}

///
/// Cancel a withdrawal.
/// 
///  @param token 
///
///  @returns SWGTransaction*
///
-(NSNumber*) userCancelWithdrawalWithCompletionBlock: (NSString*) token
        
        completionHandler: (void (^)(SWGTransaction* output, NSError* error))completionBlock { 
        

    
    // verify the required parameter 'token' is set
    if (token == nil) {
        [NSException raise:@"Invalid parameter" format:@"Missing the required parameter `token` when calling `userCancelWithdrawal`"];
    }
    

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/user/cancelWithdrawal"];

    // remove format in URL if needed
    if ([resourcePath rangeOfString:@".{format}"].location != NSNotFound) {
        [resourcePath replaceCharactersInRange: [resourcePath rangeOfString:@".{format}"] withString:@".json"];
    }

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.defaultHeaders];

    

    // HTTP header `Accept`
    headerParams[@"Accept"] = [SWGApiClient selectHeaderAccept:@[@"application/json", @"application/xml", @"text/xml", @"application/javascript", @"text/javascript"]];
    if ([headerParams[@"Accept"] length] == 0) {
        [headerParams removeObjectForKey:@"Accept"];
    }

    // response content type
    NSString *responseContentType;
    if ([headerParams objectForKey:@"Accept"]) {
        responseContentType = [headerParams[@"Accept"] componentsSeparatedByString:@", "][0];
    }
    else {
        responseContentType = @"";
    }

    // request content type
    NSString *requestContentType = [SWGApiClient selectHeaderContentType:@[@"application/json", @"application/x-www-form-urlencoded"]];

    // Authentication setting
    NSArray *authSettings = @[];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *files = [[NSMutableDictionary alloc] init];
    
    
    
    if (token) {
        formParams[@"token"] = token;
    }
    
    
    

    
    return [self.apiClient requestWithCompletionBlock: resourcePath
                                               method: @"POST"
                                           pathParams: pathParams
                                          queryParams: queryParams
                                           formParams: formParams
                                                files: files
                                                 body: bodyParam
                                         headerParams: headerParams
                                         authSettings: authSettings
                                   requestContentType: requestContentType
                                  responseContentType: responseContentType
                                         responseType: @"SWGTransaction*"
                                      completionBlock: ^(id data, NSError *error) {
                  
                  completionBlock((SWGTransaction*)data, error);
              }
          ];
}

///
/// Check if a referral code is valid.
/// If the code is valid, responds with the referral code's discount (e.g. `0.1` for 10%). Otherwise, will return a 404.
///  @param referralCode 
///
///  @returns NSNumber*
///
-(NSNumber*) userCheckReferralCodeWithCompletionBlock: (NSString*) referralCode
        
        completionHandler: (void (^)(NSNumber* output, NSError* error))completionBlock { 
        

    

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/user/checkReferralCode"];

    // remove format in URL if needed
    if ([resourcePath rangeOfString:@".{format}"].location != NSNotFound) {
        [resourcePath replaceCharactersInRange: [resourcePath rangeOfString:@".{format}"] withString:@".json"];
    }

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if(referralCode != nil) {
        
        queryParams[@"referralCode"] = referralCode;
    }
    
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.defaultHeaders];

    

    // HTTP header `Accept`
    headerParams[@"Accept"] = [SWGApiClient selectHeaderAccept:@[@"application/json", @"application/xml", @"text/xml", @"application/javascript", @"text/javascript"]];
    if ([headerParams[@"Accept"] length] == 0) {
        [headerParams removeObjectForKey:@"Accept"];
    }

    // response content type
    NSString *responseContentType;
    if ([headerParams objectForKey:@"Accept"]) {
        responseContentType = [headerParams[@"Accept"] componentsSeparatedByString:@", "][0];
    }
    else {
        responseContentType = @"";
    }

    // request content type
    NSString *requestContentType = [SWGApiClient selectHeaderContentType:@[@"application/json", @"application/x-www-form-urlencoded"]];

    // Authentication setting
    NSArray *authSettings = @[];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *files = [[NSMutableDictionary alloc] init];
    
    
    

    
    return [self.apiClient requestWithCompletionBlock: resourcePath
                                               method: @"GET"
                                           pathParams: pathParams
                                          queryParams: queryParams
                                           formParams: formParams
                                                files: files
                                                 body: bodyParam
                                         headerParams: headerParams
                                         authSettings: authSettings
                                   requestContentType: requestContentType
                                  responseContentType: responseContentType
                                         responseType: @"NSNumber*"
                                      completionBlock: ^(id data, NSError *error) {
                  
                  completionBlock((NSNumber*)data, error);
              }
          ];
}

///
/// Get your account's commission status.
/// 
///  @returns NSArray<SWGUserCommission>*
///
-(NSNumber*) userGetCommissionWithCompletionBlock: 
        (void (^)(NSArray<SWGUserCommission>* output, NSError* error))completionBlock { 
        

    

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/user/commission"];

    // remove format in URL if needed
    if ([resourcePath rangeOfString:@".{format}"].location != NSNotFound) {
        [resourcePath replaceCharactersInRange: [resourcePath rangeOfString:@".{format}"] withString:@".json"];
    }

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.defaultHeaders];

    

    // HTTP header `Accept`
    headerParams[@"Accept"] = [SWGApiClient selectHeaderAccept:@[@"application/json", @"application/xml", @"text/xml", @"application/javascript", @"text/javascript"]];
    if ([headerParams[@"Accept"] length] == 0) {
        [headerParams removeObjectForKey:@"Accept"];
    }

    // response content type
    NSString *responseContentType;
    if ([headerParams objectForKey:@"Accept"]) {
        responseContentType = [headerParams[@"Accept"] componentsSeparatedByString:@", "][0];
    }
    else {
        responseContentType = @"";
    }

    // request content type
    NSString *requestContentType = [SWGApiClient selectHeaderContentType:@[@"application/json", @"application/x-www-form-urlencoded"]];

    // Authentication setting
    NSArray *authSettings = @[];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *files = [[NSMutableDictionary alloc] init];
    
    
    

    
    return [self.apiClient requestWithCompletionBlock: resourcePath
                                               method: @"GET"
                                           pathParams: pathParams
                                          queryParams: queryParams
                                           formParams: formParams
                                                files: files
                                                 body: bodyParam
                                         headerParams: headerParams
                                         authSettings: authSettings
                                   requestContentType: requestContentType
                                  responseContentType: responseContentType
                                         responseType: @"NSArray<SWGUserCommission>*"
                                      completionBlock: ^(id data, NSError *error) {
                  
                  completionBlock((NSArray<SWGUserCommission>*)data, error);
              }
          ];
}

///
/// Confirm your email address with a token.
/// 
///  @param token 
///
///  @returns SWGAccessToken*
///
-(NSNumber*) userConfirmEmailWithCompletionBlock: (NSString*) token
        
        completionHandler: (void (^)(SWGAccessToken* output, NSError* error))completionBlock { 
        

    
    // verify the required parameter 'token' is set
    if (token == nil) {
        [NSException raise:@"Invalid parameter" format:@"Missing the required parameter `token` when calling `userConfirmEmail`"];
    }
    

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/user/confirmEmail"];

    // remove format in URL if needed
    if ([resourcePath rangeOfString:@".{format}"].location != NSNotFound) {
        [resourcePath replaceCharactersInRange: [resourcePath rangeOfString:@".{format}"] withString:@".json"];
    }

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.defaultHeaders];

    

    // HTTP header `Accept`
    headerParams[@"Accept"] = [SWGApiClient selectHeaderAccept:@[@"application/json", @"application/xml", @"text/xml", @"application/javascript", @"text/javascript"]];
    if ([headerParams[@"Accept"] length] == 0) {
        [headerParams removeObjectForKey:@"Accept"];
    }

    // response content type
    NSString *responseContentType;
    if ([headerParams objectForKey:@"Accept"]) {
        responseContentType = [headerParams[@"Accept"] componentsSeparatedByString:@", "][0];
    }
    else {
        responseContentType = @"";
    }

    // request content type
    NSString *requestContentType = [SWGApiClient selectHeaderContentType:@[@"application/json", @"application/x-www-form-urlencoded"]];

    // Authentication setting
    NSArray *authSettings = @[];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *files = [[NSMutableDictionary alloc] init];
    
    
    
    if (token) {
        formParams[@"token"] = token;
    }
    
    
    

    
    return [self.apiClient requestWithCompletionBlock: resourcePath
                                               method: @"POST"
                                           pathParams: pathParams
                                          queryParams: queryParams
                                           formParams: formParams
                                                files: files
                                                 body: bodyParam
                                         headerParams: headerParams
                                         authSettings: authSettings
                                   requestContentType: requestContentType
                                  responseContentType: responseContentType
                                         responseType: @"SWGAccessToken*"
                                      completionBlock: ^(id data, NSError *error) {
                  
                  completionBlock((SWGAccessToken*)data, error);
              }
          ];
}

///
/// Confirm two-factor auth for this account. If using a Yubikey, simply send a token to this endpoint.
/// 
///  @param token Token from your selected TFA type.
///
///  @param type Two-factor auth type. Supported types: 'GA' (Google Authenticator), 'Yubikey'
///
///  @returns NSNumber*
///
-(NSNumber*) userConfirmEnableTFAWithCompletionBlock: (NSString*) token
         type: (NSString*) type
        
        completionHandler: (void (^)(NSNumber* output, NSError* error))completionBlock { 
        

    
    // verify the required parameter 'token' is set
    if (token == nil) {
        [NSException raise:@"Invalid parameter" format:@"Missing the required parameter `token` when calling `userConfirmEnableTFA`"];
    }
    

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/user/confirmEnableTFA"];

    // remove format in URL if needed
    if ([resourcePath rangeOfString:@".{format}"].location != NSNotFound) {
        [resourcePath replaceCharactersInRange: [resourcePath rangeOfString:@".{format}"] withString:@".json"];
    }

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.defaultHeaders];

    

    // HTTP header `Accept`
    headerParams[@"Accept"] = [SWGApiClient selectHeaderAccept:@[@"application/json", @"application/xml", @"text/xml", @"application/javascript", @"text/javascript"]];
    if ([headerParams[@"Accept"] length] == 0) {
        [headerParams removeObjectForKey:@"Accept"];
    }

    // response content type
    NSString *responseContentType;
    if ([headerParams objectForKey:@"Accept"]) {
        responseContentType = [headerParams[@"Accept"] componentsSeparatedByString:@", "][0];
    }
    else {
        responseContentType = @"";
    }

    // request content type
    NSString *requestContentType = [SWGApiClient selectHeaderContentType:@[@"application/json", @"application/x-www-form-urlencoded"]];

    // Authentication setting
    NSArray *authSettings = @[];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *files = [[NSMutableDictionary alloc] init];
    
    
    
    if (type) {
        formParams[@"type"] = type;
    }
    
    
    
    if (token) {
        formParams[@"token"] = token;
    }
    
    
    

    
    return [self.apiClient requestWithCompletionBlock: resourcePath
                                               method: @"POST"
                                           pathParams: pathParams
                                          queryParams: queryParams
                                           formParams: formParams
                                                files: files
                                                 body: bodyParam
                                         headerParams: headerParams
                                         authSettings: authSettings
                                   requestContentType: requestContentType
                                  responseContentType: responseContentType
                                         responseType: @"NSNumber*"
                                      completionBlock: ^(id data, NSError *error) {
                  
                  completionBlock((NSNumber*)data, error);
              }
          ];
}

///
/// Confirm a password reset.
/// 
///  @param token 
///
///  @param newPassword 
///
///  @returns NSNumber*
///
-(NSNumber*) userConfirmPasswordResetWithCompletionBlock: (NSString*) token
         newPassword: (NSString*) newPassword
        
        completionHandler: (void (^)(NSNumber* output, NSError* error))completionBlock { 
        

    
    // verify the required parameter 'token' is set
    if (token == nil) {
        [NSException raise:@"Invalid parameter" format:@"Missing the required parameter `token` when calling `userConfirmPasswordReset`"];
    }
    
    // verify the required parameter 'newPassword' is set
    if (newPassword == nil) {
        [NSException raise:@"Invalid parameter" format:@"Missing the required parameter `newPassword` when calling `userConfirmPasswordReset`"];
    }
    

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/user/confirmPasswordReset"];

    // remove format in URL if needed
    if ([resourcePath rangeOfString:@".{format}"].location != NSNotFound) {
        [resourcePath replaceCharactersInRange: [resourcePath rangeOfString:@".{format}"] withString:@".json"];
    }

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.defaultHeaders];

    

    // HTTP header `Accept`
    headerParams[@"Accept"] = [SWGApiClient selectHeaderAccept:@[@"application/json", @"application/xml", @"text/xml", @"application/javascript", @"text/javascript"]];
    if ([headerParams[@"Accept"] length] == 0) {
        [headerParams removeObjectForKey:@"Accept"];
    }

    // response content type
    NSString *responseContentType;
    if ([headerParams objectForKey:@"Accept"]) {
        responseContentType = [headerParams[@"Accept"] componentsSeparatedByString:@", "][0];
    }
    else {
        responseContentType = @"";
    }

    // request content type
    NSString *requestContentType = [SWGApiClient selectHeaderContentType:@[@"application/json", @"application/x-www-form-urlencoded"]];

    // Authentication setting
    NSArray *authSettings = @[];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *files = [[NSMutableDictionary alloc] init];
    
    
    
    if (token) {
        formParams[@"token"] = token;
    }
    
    
    
    if (newPassword) {
        formParams[@"newPassword"] = newPassword;
    }
    
    
    

    
    return [self.apiClient requestWithCompletionBlock: resourcePath
                                               method: @"POST"
                                           pathParams: pathParams
                                          queryParams: queryParams
                                           formParams: formParams
                                                files: files
                                                 body: bodyParam
                                         headerParams: headerParams
                                         authSettings: authSettings
                                   requestContentType: requestContentType
                                  responseContentType: responseContentType
                                         responseType: @"NSNumber*"
                                      completionBlock: ^(id data, NSError *error) {
                  
                  completionBlock((NSNumber*)data, error);
              }
          ];
}

///
/// Confirm a withdrawal.
/// 
///  @param token 
///
///  @returns SWGTransaction*
///
-(NSNumber*) userConfirmWithdrawalWithCompletionBlock: (NSString*) token
        
        completionHandler: (void (^)(SWGTransaction* output, NSError* error))completionBlock { 
        

    
    // verify the required parameter 'token' is set
    if (token == nil) {
        [NSException raise:@"Invalid parameter" format:@"Missing the required parameter `token` when calling `userConfirmWithdrawal`"];
    }
    

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/user/confirmWithdrawal"];

    // remove format in URL if needed
    if ([resourcePath rangeOfString:@".{format}"].location != NSNotFound) {
        [resourcePath replaceCharactersInRange: [resourcePath rangeOfString:@".{format}"] withString:@".json"];
    }

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.defaultHeaders];

    

    // HTTP header `Accept`
    headerParams[@"Accept"] = [SWGApiClient selectHeaderAccept:@[@"application/json", @"application/xml", @"text/xml", @"application/javascript", @"text/javascript"]];
    if ([headerParams[@"Accept"] length] == 0) {
        [headerParams removeObjectForKey:@"Accept"];
    }

    // response content type
    NSString *responseContentType;
    if ([headerParams objectForKey:@"Accept"]) {
        responseContentType = [headerParams[@"Accept"] componentsSeparatedByString:@", "][0];
    }
    else {
        responseContentType = @"";
    }

    // request content type
    NSString *requestContentType = [SWGApiClient selectHeaderContentType:@[@"application/json", @"application/x-www-form-urlencoded"]];

    // Authentication setting
    NSArray *authSettings = @[];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *files = [[NSMutableDictionary alloc] init];
    
    
    
    if (token) {
        formParams[@"token"] = token;
    }
    
    
    

    
    return [self.apiClient requestWithCompletionBlock: resourcePath
                                               method: @"POST"
                                           pathParams: pathParams
                                          queryParams: queryParams
                                           formParams: formParams
                                                files: files
                                                 body: bodyParam
                                         headerParams: headerParams
                                         authSettings: authSettings
                                   requestContentType: requestContentType
                                  responseContentType: responseContentType
                                         responseType: @"SWGTransaction*"
                                      completionBlock: ^(id data, NSError *error) {
                  
                  completionBlock((SWGTransaction*)data, error);
              }
          ];
}

///
/// Get a deposit address.
/// 
///  @param currency 
///
///  @returns NSString*
///
-(NSNumber*) userGetDepositAddressWithCompletionBlock: (NSString*) currency
        
        completionHandler: (void (^)(NSString* output, NSError* error))completionBlock { 
        

    

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/user/depositAddress"];

    // remove format in URL if needed
    if ([resourcePath rangeOfString:@".{format}"].location != NSNotFound) {
        [resourcePath replaceCharactersInRange: [resourcePath rangeOfString:@".{format}"] withString:@".json"];
    }

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if(currency != nil) {
        
        queryParams[@"currency"] = currency;
    }
    
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.defaultHeaders];

    

    // HTTP header `Accept`
    headerParams[@"Accept"] = [SWGApiClient selectHeaderAccept:@[@"application/json", @"application/xml", @"text/xml", @"application/javascript", @"text/javascript"]];
    if ([headerParams[@"Accept"] length] == 0) {
        [headerParams removeObjectForKey:@"Accept"];
    }

    // response content type
    NSString *responseContentType;
    if ([headerParams objectForKey:@"Accept"]) {
        responseContentType = [headerParams[@"Accept"] componentsSeparatedByString:@", "][0];
    }
    else {
        responseContentType = @"";
    }

    // request content type
    NSString *requestContentType = [SWGApiClient selectHeaderContentType:@[@"application/json", @"application/x-www-form-urlencoded"]];

    // Authentication setting
    NSArray *authSettings = @[];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *files = [[NSMutableDictionary alloc] init];
    
    
    

    
    return [self.apiClient requestWithCompletionBlock: resourcePath
                                               method: @"GET"
                                           pathParams: pathParams
                                          queryParams: queryParams
                                           formParams: formParams
                                                files: files
                                                 body: bodyParam
                                         headerParams: headerParams
                                         authSettings: authSettings
                                   requestContentType: requestContentType
                                  responseContentType: responseContentType
                                         responseType: @"NSString*"
                                      completionBlock: ^(id data, NSError *error) {
                  
                  completionBlock((NSString*)data, error);
              }
          ];
}

///
/// Disable two-factor auth for this account.
/// 
///  @param token Token from your selected TFA type.
///
///  @param type Two-factor auth type. Supported types: 'GA' (Google Authenticator)
///
///  @returns NSNumber*
///
-(NSNumber*) userDisableTFAWithCompletionBlock: (NSString*) token
         type: (NSString*) type
        
        completionHandler: (void (^)(NSNumber* output, NSError* error))completionBlock { 
        

    
    // verify the required parameter 'token' is set
    if (token == nil) {
        [NSException raise:@"Invalid parameter" format:@"Missing the required parameter `token` when calling `userDisableTFA`"];
    }
    

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/user/disableTFA"];

    // remove format in URL if needed
    if ([resourcePath rangeOfString:@".{format}"].location != NSNotFound) {
        [resourcePath replaceCharactersInRange: [resourcePath rangeOfString:@".{format}"] withString:@".json"];
    }

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.defaultHeaders];

    

    // HTTP header `Accept`
    headerParams[@"Accept"] = [SWGApiClient selectHeaderAccept:@[@"application/json", @"application/xml", @"text/xml", @"application/javascript", @"text/javascript"]];
    if ([headerParams[@"Accept"] length] == 0) {
        [headerParams removeObjectForKey:@"Accept"];
    }

    // response content type
    NSString *responseContentType;
    if ([headerParams objectForKey:@"Accept"]) {
        responseContentType = [headerParams[@"Accept"] componentsSeparatedByString:@", "][0];
    }
    else {
        responseContentType = @"";
    }

    // request content type
    NSString *requestContentType = [SWGApiClient selectHeaderContentType:@[@"application/json", @"application/x-www-form-urlencoded"]];

    // Authentication setting
    NSArray *authSettings = @[];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *files = [[NSMutableDictionary alloc] init];
    
    
    
    if (type) {
        formParams[@"type"] = type;
    }
    
    
    
    if (token) {
        formParams[@"token"] = token;
    }
    
    
    

    
    return [self.apiClient requestWithCompletionBlock: resourcePath
                                               method: @"POST"
                                           pathParams: pathParams
                                          queryParams: queryParams
                                           formParams: formParams
                                                files: files
                                                 body: bodyParam
                                         headerParams: headerParams
                                         authSettings: authSettings
                                   requestContentType: requestContentType
                                  responseContentType: responseContentType
                                         responseType: @"NSNumber*"
                                      completionBlock: ^(id data, NSError *error) {
                  
                  completionBlock((NSNumber*)data, error);
              }
          ];
}

///
/// Log in to BitMEX.
/// 
///  @param email Your email address.
///
///  @param password Your password.
///
///  @param token OTP Token (YubiKey, Google Authenticator)
///
///  @returns SWGAccessToken*
///
-(NSNumber*) userLoginWithCompletionBlock: (NSString*) email
         password: (NSString*) password
         token: (NSString*) token
        
        completionHandler: (void (^)(SWGAccessToken* output, NSError* error))completionBlock { 
        

    
    // verify the required parameter 'email' is set
    if (email == nil) {
        [NSException raise:@"Invalid parameter" format:@"Missing the required parameter `email` when calling `userLogin`"];
    }
    
    // verify the required parameter 'password' is set
    if (password == nil) {
        [NSException raise:@"Invalid parameter" format:@"Missing the required parameter `password` when calling `userLogin`"];
    }
    

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/user/login"];

    // remove format in URL if needed
    if ([resourcePath rangeOfString:@".{format}"].location != NSNotFound) {
        [resourcePath replaceCharactersInRange: [resourcePath rangeOfString:@".{format}"] withString:@".json"];
    }

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.defaultHeaders];

    

    // HTTP header `Accept`
    headerParams[@"Accept"] = [SWGApiClient selectHeaderAccept:@[@"application/json", @"application/xml", @"text/xml", @"application/javascript", @"text/javascript"]];
    if ([headerParams[@"Accept"] length] == 0) {
        [headerParams removeObjectForKey:@"Accept"];
    }

    // response content type
    NSString *responseContentType;
    if ([headerParams objectForKey:@"Accept"]) {
        responseContentType = [headerParams[@"Accept"] componentsSeparatedByString:@", "][0];
    }
    else {
        responseContentType = @"";
    }

    // request content type
    NSString *requestContentType = [SWGApiClient selectHeaderContentType:@[@"application/json", @"application/x-www-form-urlencoded"]];

    // Authentication setting
    NSArray *authSettings = @[];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *files = [[NSMutableDictionary alloc] init];
    
    
    
    if (email) {
        formParams[@"email"] = email;
    }
    
    
    
    if (password) {
        formParams[@"password"] = password;
    }
    
    
    
    if (token) {
        formParams[@"token"] = token;
    }
    
    
    

    
    return [self.apiClient requestWithCompletionBlock: resourcePath
                                               method: @"POST"
                                           pathParams: pathParams
                                          queryParams: queryParams
                                           formParams: formParams
                                                files: files
                                                 body: bodyParam
                                         headerParams: headerParams
                                         authSettings: authSettings
                                   requestContentType: requestContentType
                                  responseContentType: responseContentType
                                         responseType: @"SWGAccessToken*"
                                      completionBlock: ^(id data, NSError *error) {
                  
                  completionBlock((SWGAccessToken*)data, error);
              }
          ];
}

///
/// Log out of BitMEX.
/// 
///  @returns void
///
-(NSNumber*) userLogoutWithCompletionBlock: 
        
        (void (^)(NSError* error))completionBlock { 

    

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/user/logout"];

    // remove format in URL if needed
    if ([resourcePath rangeOfString:@".{format}"].location != NSNotFound) {
        [resourcePath replaceCharactersInRange: [resourcePath rangeOfString:@".{format}"] withString:@".json"];
    }

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.defaultHeaders];

    

    // HTTP header `Accept`
    headerParams[@"Accept"] = [SWGApiClient selectHeaderAccept:@[@"application/json", @"application/xml", @"text/xml", @"application/javascript", @"text/javascript"]];
    if ([headerParams[@"Accept"] length] == 0) {
        [headerParams removeObjectForKey:@"Accept"];
    }

    // response content type
    NSString *responseContentType;
    if ([headerParams objectForKey:@"Accept"]) {
        responseContentType = [headerParams[@"Accept"] componentsSeparatedByString:@", "][0];
    }
    else {
        responseContentType = @"";
    }

    // request content type
    NSString *requestContentType = [SWGApiClient selectHeaderContentType:@[@"application/json", @"application/x-www-form-urlencoded"]];

    // Authentication setting
    NSArray *authSettings = @[];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *files = [[NSMutableDictionary alloc] init];
    
    
    

    
    return [self.apiClient requestWithCompletionBlock: resourcePath
                                               method: @"POST"
                                           pathParams: pathParams
                                          queryParams: queryParams
                                           formParams: formParams
                                                files: files
                                                 body: bodyParam
                                         headerParams: headerParams
                                         authSettings: authSettings
                                   requestContentType: requestContentType
                                  responseContentType: responseContentType
                                         responseType: nil
                                      completionBlock: ^(id data, NSError *error) {
                  completionBlock(error);
                  
              }
          ];
}

///
/// Log all systems out of BitMEX. This will revoke all of your account's access tokens, logging you out on all devices.
/// 
///  @returns void
///
-(NSNumber*) userLogoutAllWithCompletionBlock: 
        
        (void (^)(NSError* error))completionBlock { 

    

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/user/logoutAll"];

    // remove format in URL if needed
    if ([resourcePath rangeOfString:@".{format}"].location != NSNotFound) {
        [resourcePath replaceCharactersInRange: [resourcePath rangeOfString:@".{format}"] withString:@".json"];
    }

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.defaultHeaders];

    

    // HTTP header `Accept`
    headerParams[@"Accept"] = [SWGApiClient selectHeaderAccept:@[@"application/json", @"application/xml", @"text/xml", @"application/javascript", @"text/javascript"]];
    if ([headerParams[@"Accept"] length] == 0) {
        [headerParams removeObjectForKey:@"Accept"];
    }

    // response content type
    NSString *responseContentType;
    if ([headerParams objectForKey:@"Accept"]) {
        responseContentType = [headerParams[@"Accept"] componentsSeparatedByString:@", "][0];
    }
    else {
        responseContentType = @"";
    }

    // request content type
    NSString *requestContentType = [SWGApiClient selectHeaderContentType:@[@"application/json", @"application/x-www-form-urlencoded"]];

    // Authentication setting
    NSArray *authSettings = @[];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *files = [[NSMutableDictionary alloc] init];
    
    
    

    
    return [self.apiClient requestWithCompletionBlock: resourcePath
                                               method: @"POST"
                                           pathParams: pathParams
                                          queryParams: queryParams
                                           formParams: formParams
                                                files: files
                                                 body: bodyParam
                                         headerParams: headerParams
                                         authSettings: authSettings
                                   requestContentType: requestContentType
                                  responseContentType: responseContentType
                                         responseType: nil
                                      completionBlock: ^(id data, NSError *error) {
                  completionBlock(error);
                  
              }
          ];
}

///
/// Get your account's margin status.
/// 
///  @returns SWGMargin*
///
-(NSNumber*) userGetMarginWithCompletionBlock: 
        (void (^)(SWGMargin* output, NSError* error))completionBlock { 
        

    

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/user/margin"];

    // remove format in URL if needed
    if ([resourcePath rangeOfString:@".{format}"].location != NSNotFound) {
        [resourcePath replaceCharactersInRange: [resourcePath rangeOfString:@".{format}"] withString:@".json"];
    }

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.defaultHeaders];

    

    // HTTP header `Accept`
    headerParams[@"Accept"] = [SWGApiClient selectHeaderAccept:@[@"application/json", @"application/xml", @"text/xml", @"application/javascript", @"text/javascript"]];
    if ([headerParams[@"Accept"] length] == 0) {
        [headerParams removeObjectForKey:@"Accept"];
    }

    // response content type
    NSString *responseContentType;
    if ([headerParams objectForKey:@"Accept"]) {
        responseContentType = [headerParams[@"Accept"] componentsSeparatedByString:@", "][0];
    }
    else {
        responseContentType = @"";
    }

    // request content type
    NSString *requestContentType = [SWGApiClient selectHeaderContentType:@[@"application/json", @"application/x-www-form-urlencoded"]];

    // Authentication setting
    NSArray *authSettings = @[];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *files = [[NSMutableDictionary alloc] init];
    
    
    

    
    return [self.apiClient requestWithCompletionBlock: resourcePath
                                               method: @"GET"
                                           pathParams: pathParams
                                          queryParams: queryParams
                                           formParams: formParams
                                                files: files
                                                 body: bodyParam
                                         headerParams: headerParams
                                         authSettings: authSettings
                                   requestContentType: requestContentType
                                  responseContentType: responseContentType
                                         responseType: @"SWGMargin*"
                                      completionBlock: ^(id data, NSError *error) {
                  
                  completionBlock((SWGMargin*)data, error);
              }
          ];
}

///
/// Save application preferences.
/// 
///  @param prefs 
///
///  @param overwrite If true, will overwrite all existing preferences.
///
///  @returns SWGUser*
///
-(NSNumber*) userSavePreferencesWithCompletionBlock: (NSString*) prefs
         overwrite: (NSNumber*) overwrite
        
        completionHandler: (void (^)(SWGUser* output, NSError* error))completionBlock { 
        

    
    // verify the required parameter 'prefs' is set
    if (prefs == nil) {
        [NSException raise:@"Invalid parameter" format:@"Missing the required parameter `prefs` when calling `userSavePreferences`"];
    }
    

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/user/preferences"];

    // remove format in URL if needed
    if ([resourcePath rangeOfString:@".{format}"].location != NSNotFound) {
        [resourcePath replaceCharactersInRange: [resourcePath rangeOfString:@".{format}"] withString:@".json"];
    }

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.defaultHeaders];

    

    // HTTP header `Accept`
    headerParams[@"Accept"] = [SWGApiClient selectHeaderAccept:@[@"application/json", @"application/xml", @"text/xml", @"application/javascript", @"text/javascript"]];
    if ([headerParams[@"Accept"] length] == 0) {
        [headerParams removeObjectForKey:@"Accept"];
    }

    // response content type
    NSString *responseContentType;
    if ([headerParams objectForKey:@"Accept"]) {
        responseContentType = [headerParams[@"Accept"] componentsSeparatedByString:@", "][0];
    }
    else {
        responseContentType = @"";
    }

    // request content type
    NSString *requestContentType = [SWGApiClient selectHeaderContentType:@[@"application/json", @"application/x-www-form-urlencoded"]];

    // Authentication setting
    NSArray *authSettings = @[];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *files = [[NSMutableDictionary alloc] init];
    
    
    
    if (prefs) {
        formParams[@"prefs"] = prefs;
    }
    
    
    
    if (overwrite) {
        formParams[@"overwrite"] = overwrite;
    }
    
    
    

    
    return [self.apiClient requestWithCompletionBlock: resourcePath
                                               method: @"POST"
                                           pathParams: pathParams
                                          queryParams: queryParams
                                           formParams: formParams
                                                files: files
                                                 body: bodyParam
                                         headerParams: headerParams
                                         authSettings: authSettings
                                   requestContentType: requestContentType
                                  responseContentType: responseContentType
                                         responseType: @"SWGUser*"
                                      completionBlock: ^(id data, NSError *error) {
                  
                  completionBlock((SWGUser*)data, error);
              }
          ];
}

///
/// Get Google Authenticator secret key for setting up two-factor auth. Fails if already enabled. Use /confirmEnableTFA for Yubikeys.
/// 
///  @param type Two-factor auth type. Supported types: 'GA' (Google Authenticator)
///
///  @param token If Yubikey, send one output from the key.
///
///  @returns NSNumber*
///
-(NSNumber*) userRequestEnableTFAWithCompletionBlock: (NSString*) type
         token: (NSString*) token
        
        completionHandler: (void (^)(NSNumber* output, NSError* error))completionBlock { 
        

    

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/user/requestEnableTFA"];

    // remove format in URL if needed
    if ([resourcePath rangeOfString:@".{format}"].location != NSNotFound) {
        [resourcePath replaceCharactersInRange: [resourcePath rangeOfString:@".{format}"] withString:@".json"];
    }

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.defaultHeaders];

    

    // HTTP header `Accept`
    headerParams[@"Accept"] = [SWGApiClient selectHeaderAccept:@[@"application/json", @"application/xml", @"text/xml", @"application/javascript", @"text/javascript"]];
    if ([headerParams[@"Accept"] length] == 0) {
        [headerParams removeObjectForKey:@"Accept"];
    }

    // response content type
    NSString *responseContentType;
    if ([headerParams objectForKey:@"Accept"]) {
        responseContentType = [headerParams[@"Accept"] componentsSeparatedByString:@", "][0];
    }
    else {
        responseContentType = @"";
    }

    // request content type
    NSString *requestContentType = [SWGApiClient selectHeaderContentType:@[@"application/json", @"application/x-www-form-urlencoded"]];

    // Authentication setting
    NSArray *authSettings = @[];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *files = [[NSMutableDictionary alloc] init];
    
    
    
    if (type) {
        formParams[@"type"] = type;
    }
    
    
    
    if (token) {
        formParams[@"token"] = token;
    }
    
    
    

    
    return [self.apiClient requestWithCompletionBlock: resourcePath
                                               method: @"POST"
                                           pathParams: pathParams
                                          queryParams: queryParams
                                           formParams: formParams
                                                files: files
                                                 body: bodyParam
                                         headerParams: headerParams
                                         authSettings: authSettings
                                   requestContentType: requestContentType
                                  responseContentType: responseContentType
                                         responseType: @"NSNumber*"
                                      completionBlock: ^(id data, NSError *error) {
                  
                  completionBlock((NSNumber*)data, error);
              }
          ];
}

///
/// Request a password reset.
/// 
///  @param email 
///
///  @returns NSNumber*
///
-(NSNumber*) userRequestPasswordResetWithCompletionBlock: (NSString*) email
        
        completionHandler: (void (^)(NSNumber* output, NSError* error))completionBlock { 
        

    
    // verify the required parameter 'email' is set
    if (email == nil) {
        [NSException raise:@"Invalid parameter" format:@"Missing the required parameter `email` when calling `userRequestPasswordReset`"];
    }
    

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/user/requestPasswordReset"];

    // remove format in URL if needed
    if ([resourcePath rangeOfString:@".{format}"].location != NSNotFound) {
        [resourcePath replaceCharactersInRange: [resourcePath rangeOfString:@".{format}"] withString:@".json"];
    }

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.defaultHeaders];

    

    // HTTP header `Accept`
    headerParams[@"Accept"] = [SWGApiClient selectHeaderAccept:@[@"application/json", @"application/xml", @"text/xml", @"application/javascript", @"text/javascript"]];
    if ([headerParams[@"Accept"] length] == 0) {
        [headerParams removeObjectForKey:@"Accept"];
    }

    // response content type
    NSString *responseContentType;
    if ([headerParams objectForKey:@"Accept"]) {
        responseContentType = [headerParams[@"Accept"] componentsSeparatedByString:@", "][0];
    }
    else {
        responseContentType = @"";
    }

    // request content type
    NSString *requestContentType = [SWGApiClient selectHeaderContentType:@[@"application/json", @"application/x-www-form-urlencoded"]];

    // Authentication setting
    NSArray *authSettings = @[];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *files = [[NSMutableDictionary alloc] init];
    
    
    
    if (email) {
        formParams[@"email"] = email;
    }
    
    
    

    
    return [self.apiClient requestWithCompletionBlock: resourcePath
                                               method: @"POST"
                                           pathParams: pathParams
                                          queryParams: queryParams
                                           formParams: formParams
                                                files: files
                                                 body: bodyParam
                                         headerParams: headerParams
                                         authSettings: authSettings
                                   requestContentType: requestContentType
                                  responseContentType: responseContentType
                                         responseType: @"NSNumber*"
                                      completionBlock: ^(id data, NSError *error) {
                  
                  completionBlock((NSNumber*)data, error);
              }
          ];
}

///
/// Request a withdrawal to an external wallet.
/// This will send a confirmation email to the email address on record, unless requested via an API Key with the \"withdraw\" permission.
///  @param currency Currency you're withdrawing. Options: \"XBt\"
///
///  @param amount Amount of withdrawal currency.
///
///  @param address Destination Address.
///
///  @param otpToken 2FA token. Required if 2FA is enabled on your account.
///
///  @param fee Network fee for Bitcoin withdrawals. If not specified, a default value will be calculated based on Bitcoin network conditions. You will have a chance to confirm this via email.
///
///  @returns SWGTransaction*
///
-(NSNumber*) userRequestWithdrawalWithCompletionBlock: (NSString*) currency
         amount: (NSNumber*) amount
         address: (NSString*) address
         otpToken: (NSString*) otpToken
         fee: (NSNumber*) fee
        
        completionHandler: (void (^)(SWGTransaction* output, NSError* error))completionBlock { 
        

    
    // verify the required parameter 'currency' is set
    if (currency == nil) {
        [NSException raise:@"Invalid parameter" format:@"Missing the required parameter `currency` when calling `userRequestWithdrawal`"];
    }
    
    // verify the required parameter 'amount' is set
    if (amount == nil) {
        [NSException raise:@"Invalid parameter" format:@"Missing the required parameter `amount` when calling `userRequestWithdrawal`"];
    }
    
    // verify the required parameter 'address' is set
    if (address == nil) {
        [NSException raise:@"Invalid parameter" format:@"Missing the required parameter `address` when calling `userRequestWithdrawal`"];
    }
    

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/user/requestWithdrawal"];

    // remove format in URL if needed
    if ([resourcePath rangeOfString:@".{format}"].location != NSNotFound) {
        [resourcePath replaceCharactersInRange: [resourcePath rangeOfString:@".{format}"] withString:@".json"];
    }

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.defaultHeaders];

    

    // HTTP header `Accept`
    headerParams[@"Accept"] = [SWGApiClient selectHeaderAccept:@[@"application/json", @"application/xml", @"text/xml", @"application/javascript", @"text/javascript"]];
    if ([headerParams[@"Accept"] length] == 0) {
        [headerParams removeObjectForKey:@"Accept"];
    }

    // response content type
    NSString *responseContentType;
    if ([headerParams objectForKey:@"Accept"]) {
        responseContentType = [headerParams[@"Accept"] componentsSeparatedByString:@", "][0];
    }
    else {
        responseContentType = @"";
    }

    // request content type
    NSString *requestContentType = [SWGApiClient selectHeaderContentType:@[@"application/json", @"application/x-www-form-urlencoded"]];

    // Authentication setting
    NSArray *authSettings = @[];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *files = [[NSMutableDictionary alloc] init];
    
    
    
    if (otpToken) {
        formParams[@"otpToken"] = otpToken;
    }
    
    
    
    if (currency) {
        formParams[@"currency"] = currency;
    }
    
    
    
    if (amount) {
        formParams[@"amount"] = amount;
    }
    
    
    
    if (address) {
        formParams[@"address"] = address;
    }
    
    
    
    if (fee) {
        formParams[@"fee"] = fee;
    }
    
    
    

    
    return [self.apiClient requestWithCompletionBlock: resourcePath
                                               method: @"POST"
                                           pathParams: pathParams
                                          queryParams: queryParams
                                           formParams: formParams
                                                files: files
                                                 body: bodyParam
                                         headerParams: headerParams
                                         authSettings: authSettings
                                   requestContentType: requestContentType
                                  responseContentType: responseContentType
                                         responseType: @"SWGTransaction*"
                                      completionBlock: ^(id data, NSError *error) {
                  
                  completionBlock((SWGTransaction*)data, error);
              }
          ];
}

///
/// Re-send verification email.
/// 
///  @param email 
///
///  @returns NSNumber*
///
-(NSNumber*) userSendVerificationEmailWithCompletionBlock: (NSString*) email
        
        completionHandler: (void (^)(NSNumber* output, NSError* error))completionBlock { 
        

    
    // verify the required parameter 'email' is set
    if (email == nil) {
        [NSException raise:@"Invalid parameter" format:@"Missing the required parameter `email` when calling `userSendVerificationEmail`"];
    }
    

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/user/resendVerificationEmail"];

    // remove format in URL if needed
    if ([resourcePath rangeOfString:@".{format}"].location != NSNotFound) {
        [resourcePath replaceCharactersInRange: [resourcePath rangeOfString:@".{format}"] withString:@".json"];
    }

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if(email != nil) {
        
        queryParams[@"email"] = email;
    }
    
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.defaultHeaders];

    

    // HTTP header `Accept`
    headerParams[@"Accept"] = [SWGApiClient selectHeaderAccept:@[@"application/json", @"application/xml", @"text/xml", @"application/javascript", @"text/javascript"]];
    if ([headerParams[@"Accept"] length] == 0) {
        [headerParams removeObjectForKey:@"Accept"];
    }

    // response content type
    NSString *responseContentType;
    if ([headerParams objectForKey:@"Accept"]) {
        responseContentType = [headerParams[@"Accept"] componentsSeparatedByString:@", "][0];
    }
    else {
        responseContentType = @"";
    }

    // request content type
    NSString *requestContentType = [SWGApiClient selectHeaderContentType:@[@"application/json", @"application/x-www-form-urlencoded"]];

    // Authentication setting
    NSArray *authSettings = @[];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *files = [[NSMutableDictionary alloc] init];
    
    
    

    
    return [self.apiClient requestWithCompletionBlock: resourcePath
                                               method: @"GET"
                                           pathParams: pathParams
                                          queryParams: queryParams
                                           formParams: formParams
                                                files: files
                                                 body: bodyParam
                                         headerParams: headerParams
                                         authSettings: authSettings
                                   requestContentType: requestContentType
                                  responseContentType: responseContentType
                                         responseType: @"NSNumber*"
                                      completionBlock: ^(id data, NSError *error) {
                  
                  completionBlock((NSNumber*)data, error);
              }
          ];
}

///
/// Get a history of all of your wallet transactions (deposits and withdrawals).
/// 
///  @returns NSArray<SWGTransaction>*
///
-(NSNumber*) userGetWalletHistoryWithCompletionBlock: 
        (void (^)(NSArray<SWGTransaction>* output, NSError* error))completionBlock { 
        

    

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/user/walletHistory"];

    // remove format in URL if needed
    if ([resourcePath rangeOfString:@".{format}"].location != NSNotFound) {
        [resourcePath replaceCharactersInRange: [resourcePath rangeOfString:@".{format}"] withString:@".json"];
    }

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.defaultHeaders];

    

    // HTTP header `Accept`
    headerParams[@"Accept"] = [SWGApiClient selectHeaderAccept:@[@"application/json", @"application/xml", @"text/xml", @"application/javascript", @"text/javascript"]];
    if ([headerParams[@"Accept"] length] == 0) {
        [headerParams removeObjectForKey:@"Accept"];
    }

    // response content type
    NSString *responseContentType;
    if ([headerParams objectForKey:@"Accept"]) {
        responseContentType = [headerParams[@"Accept"] componentsSeparatedByString:@", "][0];
    }
    else {
        responseContentType = @"";
    }

    // request content type
    NSString *requestContentType = [SWGApiClient selectHeaderContentType:@[@"application/json", @"application/x-www-form-urlencoded"]];

    // Authentication setting
    NSArray *authSettings = @[];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *files = [[NSMutableDictionary alloc] init];
    
    
    

    
    return [self.apiClient requestWithCompletionBlock: resourcePath
                                               method: @"GET"
                                           pathParams: pathParams
                                          queryParams: queryParams
                                           formParams: formParams
                                                files: files
                                                 body: bodyParam
                                         headerParams: headerParams
                                         authSettings: authSettings
                                   requestContentType: requestContentType
                                  responseContentType: responseContentType
                                         responseType: @"NSArray<SWGTransaction>*"
                                      completionBlock: ^(id data, NSError *error) {
                  
                  completionBlock((NSArray<SWGTransaction>*)data, error);
              }
          ];
}



@end
