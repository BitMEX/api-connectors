#import "SWGApiKeyApi.h"
#import "SWGQueryParamCollection.h"
#import "SWGError.h"
#import "SWGApiKey.h"
#import "SWGInlineResponse200.h"


@interface SWGApiKeyApi ()
    @property (readwrite, nonatomic, strong) NSMutableDictionary *defaultHeaders;
@end

@implementation SWGApiKeyApi

static SWGApiKeyApi* singletonAPI = nil;

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

+(SWGApiKeyApi*) apiWithHeader:(NSString*)headerValue key:(NSString*)key {

    if (singletonAPI == nil) {
        singletonAPI = [[SWGApiKeyApi alloc] init];
        [singletonAPI addHeader:headerValue forKey:key];
    }
    return singletonAPI;
}

+(SWGApiKeyApi*) sharedAPI {

    if (singletonAPI == nil) {
        singletonAPI = [[SWGApiKeyApi alloc] init];
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
/// Get your API Keys.
/// 
///  @param reverse If true, will sort results newest first.
///
///  @returns NSArray<SWGApiKey>*
///
-(NSNumber*) apiKeyGetKeysWithCompletionBlock: (NSNumber*) reverse
        
        completionHandler: (void (^)(NSArray<SWGApiKey>* output, NSError* error))completionBlock { 
        

    

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/apiKey"];

    // remove format in URL if needed
    if ([resourcePath rangeOfString:@".{format}"].location != NSNotFound) {
        [resourcePath replaceCharactersInRange: [resourcePath rangeOfString:@".{format}"] withString:@".json"];
    }

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if(reverse != nil) {
        
        queryParams[@"reverse"] = reverse;
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
                                         responseType: @"NSArray<SWGApiKey>*"
                                      completionBlock: ^(id data, NSError *error) {
                  
                  completionBlock((NSArray<SWGApiKey>*)data, error);
              }
          ];
}

///
/// Create a new API Key.
/// API Keys can also be created via <a href=\"https://github.com/BitMEX/market-maker/blob/master/generate-api-key.py\">this Python script</a>. See the <a href=\"/app/apiKeys\">API Key Documentation</a> for more information on capabilities.
///  @param name Key name. This name is for reference only.
///
///  @param cidr CIDR block to restrict this key to. To restrict to a single address, append \"/32\", e.g. 207.39.29.22/32. Leave blank or set to 0.0.0.0/0 to allow all IPs. Only one block may be set. <a href=\"http://software77.net/cidr-101.html\">More on CIDR blocks</a>
///
///  @param permissions Key Permissions. All keys can read margin and position data. Additional permissions must be added. Available: [\"order\", \"withdraw\"].
///
///  @param enabled Set to true to enable this key on creation. Otherwise, it must be explicitly enabled via /apiKey/enable.
///
///  @param token OTP Token (YubiKey, Google Authenticator)
///
///  @returns SWGApiKey*
///
-(NSNumber*) apiKeyCreateKeyWithCompletionBlock: (NSString*) name
         cidr: (NSString*) cidr
         permissions: (NSString*) permissions
         enabled: (NSNumber*) enabled
         token: (NSString*) token
        
        completionHandler: (void (^)(SWGApiKey* output, NSError* error))completionBlock { 
        

    

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/apiKey"];

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
    
    
    
    if (name) {
        formParams[@"name"] = name;
    }
    
    
    
    if (cidr) {
        formParams[@"cidr"] = cidr;
    }
    
    
    
    if (permissions) {
        formParams[@"permissions"] = permissions;
    }
    
    
    
    if (enabled) {
        formParams[@"enabled"] = enabled;
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
                                         responseType: @"SWGApiKey*"
                                      completionBlock: ^(id data, NSError *error) {
                  
                  completionBlock((SWGApiKey*)data, error);
              }
          ];
}

///
/// Remove an API Key.
/// 
///  @param apiKeyID API Key ID (public component).
///
///  @returns SWGInlineResponse200*
///
-(NSNumber*) apiKeyRemoveWithCompletionBlock: (NSString*) apiKeyID
        
        completionHandler: (void (^)(SWGInlineResponse200* output, NSError* error))completionBlock { 
        

    
    // verify the required parameter 'apiKeyID' is set
    if (apiKeyID == nil) {
        [NSException raise:@"Invalid parameter" format:@"Missing the required parameter `apiKeyID` when calling `apiKeyRemove`"];
    }
    

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/apiKey"];

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
    
    
    
    if (apiKeyID) {
        formParams[@"apiKeyID"] = apiKeyID;
    }
    
    
    

    
    return [self.apiClient requestWithCompletionBlock: resourcePath
                                               method: @"DELETE"
                                           pathParams: pathParams
                                          queryParams: queryParams
                                           formParams: formParams
                                                files: files
                                                 body: bodyParam
                                         headerParams: headerParams
                                         authSettings: authSettings
                                   requestContentType: requestContentType
                                  responseContentType: responseContentType
                                         responseType: @"SWGInlineResponse200*"
                                      completionBlock: ^(id data, NSError *error) {
                  
                  completionBlock((SWGInlineResponse200*)data, error);
              }
          ];
}

///
/// Disable an API Key.
/// 
///  @param apiKeyID API Key ID (public component).
///
///  @returns SWGApiKey*
///
-(NSNumber*) apiKeyDisableWithCompletionBlock: (NSString*) apiKeyID
        
        completionHandler: (void (^)(SWGApiKey* output, NSError* error))completionBlock { 
        

    
    // verify the required parameter 'apiKeyID' is set
    if (apiKeyID == nil) {
        [NSException raise:@"Invalid parameter" format:@"Missing the required parameter `apiKeyID` when calling `apiKeyDisable`"];
    }
    

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/apiKey/disable"];

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
    
    
    
    if (apiKeyID) {
        formParams[@"apiKeyID"] = apiKeyID;
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
                                         responseType: @"SWGApiKey*"
                                      completionBlock: ^(id data, NSError *error) {
                  
                  completionBlock((SWGApiKey*)data, error);
              }
          ];
}

///
/// Enable an API Key.
/// 
///  @param apiKeyID API Key ID (public component).
///
///  @returns SWGApiKey*
///
-(NSNumber*) apiKeyEnableWithCompletionBlock: (NSString*) apiKeyID
        
        completionHandler: (void (^)(SWGApiKey* output, NSError* error))completionBlock { 
        

    
    // verify the required parameter 'apiKeyID' is set
    if (apiKeyID == nil) {
        [NSException raise:@"Invalid parameter" format:@"Missing the required parameter `apiKeyID` when calling `apiKeyEnable`"];
    }
    

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/apiKey/enable"];

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
    
    
    
    if (apiKeyID) {
        formParams[@"apiKeyID"] = apiKeyID;
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
                                         responseType: @"SWGApiKey*"
                                      completionBlock: ^(id data, NSError *error) {
                  
                  completionBlock((SWGApiKey*)data, error);
              }
          ];
}



@end
