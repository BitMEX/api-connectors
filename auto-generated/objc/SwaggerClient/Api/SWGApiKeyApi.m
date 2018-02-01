#import "SWGAPIKeyApi.h"
#import "SWGQueryParamCollection.h"
#import "SWGApiClient.h"
#import "SWGAPIKey.h"
#import "SWGError.h"
#import "SWGInlineResponse200.h"


@interface SWGAPIKeyApi ()

@property (nonatomic, strong, readwrite) NSMutableDictionary *mutableDefaultHeaders;

@end

@implementation SWGAPIKeyApi

NSString* kSWGAPIKeyApiErrorDomain = @"SWGAPIKeyApiErrorDomain";
NSInteger kSWGAPIKeyApiMissingParamErrorCode = 234513;

@synthesize apiClient = _apiClient;

#pragma mark - Initialize methods

- (instancetype) init {
    return [self initWithApiClient:[SWGApiClient sharedClient]];
}


-(instancetype) initWithApiClient:(SWGApiClient *)apiClient {
    self = [super init];
    if (self) {
        _apiClient = apiClient;
        _mutableDefaultHeaders = [NSMutableDictionary dictionary];
    }
    return self;
}

#pragma mark -

-(NSString*) defaultHeaderForKey:(NSString*)key {
    return self.mutableDefaultHeaders[key];
}

-(void) setDefaultHeaderValue:(NSString*) value forKey:(NSString*)key {
    [self.mutableDefaultHeaders setValue:value forKey:key];
}

-(NSDictionary *)defaultHeaders {
    return self.mutableDefaultHeaders;
}

#pragma mark - Api Methods

///
/// Disable an API Key.
/// 
///  @param apiKeyID API Key ID (public component). 
///
///  @returns SWGAPIKey*
///
-(NSURLSessionTask*) aPIKeyDisableWithApiKeyID: (NSString*) apiKeyID
    completionHandler: (void (^)(SWGAPIKey* output, NSError* error)) handler {
    // verify the required parameter 'apiKeyID' is set
    if (apiKeyID == nil) {
        NSParameterAssert(apiKeyID);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"apiKeyID"] };
            NSError* error = [NSError errorWithDomain:kSWGAPIKeyApiErrorDomain code:kSWGAPIKeyApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/apiKey/disable"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.apiClient.configuration.defaultHeaders];
    [headerParams addEntriesFromDictionary:self.defaultHeaders];
    // HTTP header `Accept`
    NSString *acceptHeader = [self.apiClient.sanitizer selectHeaderAccept:@[@"application/json", @"application/xml", @"text/xml", @"application/javascript", @"text/javascript"]];
    if(acceptHeader.length > 0) {
        headerParams[@"Accept"] = acceptHeader;
    }

    // response content type
    NSString *responseContentType = [[acceptHeader componentsSeparatedByString:@", "] firstObject] ?: @"";

    // request content type
    NSString *requestContentType = [self.apiClient.sanitizer selectHeaderContentType:@[@"application/json", @"application/x-www-form-urlencoded"]];

    // Authentication setting
    NSArray *authSettings = @[@"apiKey", @"apiNonce", @"apiSignature"];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];
    if (apiKeyID) {
        formParams[@"apiKeyID"] = apiKeyID;
    }

    return [self.apiClient requestWithPath: resourcePath
                                    method: @"POST"
                                pathParams: pathParams
                               queryParams: queryParams
                                formParams: formParams
                                     files: localVarFiles
                                      body: bodyParam
                              headerParams: headerParams
                              authSettings: authSettings
                        requestContentType: requestContentType
                       responseContentType: responseContentType
                              responseType: @"SWGAPIKey*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((SWGAPIKey*)data, error);
                                }
                            }];
}

///
/// Enable an API Key.
/// 
///  @param apiKeyID API Key ID (public component). 
///
///  @returns SWGAPIKey*
///
-(NSURLSessionTask*) aPIKeyEnableWithApiKeyID: (NSString*) apiKeyID
    completionHandler: (void (^)(SWGAPIKey* output, NSError* error)) handler {
    // verify the required parameter 'apiKeyID' is set
    if (apiKeyID == nil) {
        NSParameterAssert(apiKeyID);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"apiKeyID"] };
            NSError* error = [NSError errorWithDomain:kSWGAPIKeyApiErrorDomain code:kSWGAPIKeyApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/apiKey/enable"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.apiClient.configuration.defaultHeaders];
    [headerParams addEntriesFromDictionary:self.defaultHeaders];
    // HTTP header `Accept`
    NSString *acceptHeader = [self.apiClient.sanitizer selectHeaderAccept:@[@"application/json", @"application/xml", @"text/xml", @"application/javascript", @"text/javascript"]];
    if(acceptHeader.length > 0) {
        headerParams[@"Accept"] = acceptHeader;
    }

    // response content type
    NSString *responseContentType = [[acceptHeader componentsSeparatedByString:@", "] firstObject] ?: @"";

    // request content type
    NSString *requestContentType = [self.apiClient.sanitizer selectHeaderContentType:@[@"application/json", @"application/x-www-form-urlencoded"]];

    // Authentication setting
    NSArray *authSettings = @[@"apiKey", @"apiNonce", @"apiSignature"];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];
    if (apiKeyID) {
        formParams[@"apiKeyID"] = apiKeyID;
    }

    return [self.apiClient requestWithPath: resourcePath
                                    method: @"POST"
                                pathParams: pathParams
                               queryParams: queryParams
                                formParams: formParams
                                     files: localVarFiles
                                      body: bodyParam
                              headerParams: headerParams
                              authSettings: authSettings
                        requestContentType: requestContentType
                       responseContentType: responseContentType
                              responseType: @"SWGAPIKey*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((SWGAPIKey*)data, error);
                                }
                            }];
}

///
/// Get your API Keys.
/// 
///  @param reverse If true, will sort results newest first. (optional, default to false)
///
///  @returns NSArray<SWGAPIKey>*
///
-(NSURLSessionTask*) aPIKeyGetWithReverse: (NSNumber*) reverse
    completionHandler: (void (^)(NSArray<SWGAPIKey>* output, NSError* error)) handler {
    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/apiKey"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (reverse != nil) {
        queryParams[@"reverse"] = [reverse isEqual:@(YES)] ? @"true" : @"false";
    }
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.apiClient.configuration.defaultHeaders];
    [headerParams addEntriesFromDictionary:self.defaultHeaders];
    // HTTP header `Accept`
    NSString *acceptHeader = [self.apiClient.sanitizer selectHeaderAccept:@[@"application/json", @"application/xml", @"text/xml", @"application/javascript", @"text/javascript"]];
    if(acceptHeader.length > 0) {
        headerParams[@"Accept"] = acceptHeader;
    }

    // response content type
    NSString *responseContentType = [[acceptHeader componentsSeparatedByString:@", "] firstObject] ?: @"";

    // request content type
    NSString *requestContentType = [self.apiClient.sanitizer selectHeaderContentType:@[@"application/json", @"application/x-www-form-urlencoded"]];

    // Authentication setting
    NSArray *authSettings = @[@"apiKey", @"apiNonce", @"apiSignature"];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];

    return [self.apiClient requestWithPath: resourcePath
                                    method: @"GET"
                                pathParams: pathParams
                               queryParams: queryParams
                                formParams: formParams
                                     files: localVarFiles
                                      body: bodyParam
                              headerParams: headerParams
                              authSettings: authSettings
                        requestContentType: requestContentType
                       responseContentType: responseContentType
                              responseType: @"NSArray<SWGAPIKey>*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((NSArray<SWGAPIKey>*)data, error);
                                }
                            }];
}

///
/// Create a new API Key.
/// API Keys can also be created via [this Python script](https://github.com/BitMEX/market-maker/blob/master/generate-api-key.py) See the [API Key Documentation](/app/apiKeys) for more information on capabilities.
///  @param name Key name. This name is for reference only. (optional)
///
///  @param cidr CIDR block to restrict this key to. To restrict to a single address, append \"/32\", e.g. 207.39.29.22/32. Leave blank or set to 0.0.0.0/0 to allow all IPs. Only one block may be set. <a href=\"http://software77.net/cidr-101.html\">More on CIDR blocks</a> (optional)
///
///  @param permissions Key Permissions. All keys can read margin and position data. Additional permissions must be added. Available: [\"order\", \"orderCancel\", \"withdraw\"]. (optional)
///
///  @param enabled Set to true to enable this key on creation. Otherwise, it must be explicitly enabled via /apiKey/enable. (optional, default to false)
///
///  @param token OTP Token (YubiKey, Google Authenticator) (optional)
///
///  @returns SWGAPIKey*
///
-(NSURLSessionTask*) aPIKeyNewWithName: (NSString*) name
    cidr: (NSString*) cidr
    permissions: (NSString*) permissions
    enabled: (NSNumber*) enabled
    token: (NSString*) token
    completionHandler: (void (^)(SWGAPIKey* output, NSError* error)) handler {
    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/apiKey"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.apiClient.configuration.defaultHeaders];
    [headerParams addEntriesFromDictionary:self.defaultHeaders];
    // HTTP header `Accept`
    NSString *acceptHeader = [self.apiClient.sanitizer selectHeaderAccept:@[@"application/json", @"application/xml", @"text/xml", @"application/javascript", @"text/javascript"]];
    if(acceptHeader.length > 0) {
        headerParams[@"Accept"] = acceptHeader;
    }

    // response content type
    NSString *responseContentType = [[acceptHeader componentsSeparatedByString:@", "] firstObject] ?: @"";

    // request content type
    NSString *requestContentType = [self.apiClient.sanitizer selectHeaderContentType:@[@"application/json", @"application/x-www-form-urlencoded"]];

    // Authentication setting
    NSArray *authSettings = @[@"apiKey", @"apiNonce", @"apiSignature"];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];
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

    return [self.apiClient requestWithPath: resourcePath
                                    method: @"POST"
                                pathParams: pathParams
                               queryParams: queryParams
                                formParams: formParams
                                     files: localVarFiles
                                      body: bodyParam
                              headerParams: headerParams
                              authSettings: authSettings
                        requestContentType: requestContentType
                       responseContentType: responseContentType
                              responseType: @"SWGAPIKey*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((SWGAPIKey*)data, error);
                                }
                            }];
}

///
/// Remove an API Key.
/// 
///  @param apiKeyID API Key ID (public component). 
///
///  @returns SWGInlineResponse200*
///
-(NSURLSessionTask*) aPIKeyRemoveWithApiKeyID: (NSString*) apiKeyID
    completionHandler: (void (^)(SWGInlineResponse200* output, NSError* error)) handler {
    // verify the required parameter 'apiKeyID' is set
    if (apiKeyID == nil) {
        NSParameterAssert(apiKeyID);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"apiKeyID"] };
            NSError* error = [NSError errorWithDomain:kSWGAPIKeyApiErrorDomain code:kSWGAPIKeyApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/apiKey"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.apiClient.configuration.defaultHeaders];
    [headerParams addEntriesFromDictionary:self.defaultHeaders];
    // HTTP header `Accept`
    NSString *acceptHeader = [self.apiClient.sanitizer selectHeaderAccept:@[@"application/json", @"application/xml", @"text/xml", @"application/javascript", @"text/javascript"]];
    if(acceptHeader.length > 0) {
        headerParams[@"Accept"] = acceptHeader;
    }

    // response content type
    NSString *responseContentType = [[acceptHeader componentsSeparatedByString:@", "] firstObject] ?: @"";

    // request content type
    NSString *requestContentType = [self.apiClient.sanitizer selectHeaderContentType:@[@"application/json", @"application/x-www-form-urlencoded"]];

    // Authentication setting
    NSArray *authSettings = @[@"apiKey", @"apiNonce", @"apiSignature"];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];
    if (apiKeyID) {
        formParams[@"apiKeyID"] = apiKeyID;
    }

    return [self.apiClient requestWithPath: resourcePath
                                    method: @"DELETE"
                                pathParams: pathParams
                               queryParams: queryParams
                                formParams: formParams
                                     files: localVarFiles
                                      body: bodyParam
                              headerParams: headerParams
                              authSettings: authSettings
                        requestContentType: requestContentType
                       responseContentType: responseContentType
                              responseType: @"SWGInlineResponse200*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((SWGInlineResponse200*)data, error);
                                }
                            }];
}



@end
