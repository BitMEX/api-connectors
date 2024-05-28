#import "SWGGuildApi.h"
#import "SWGQueryParamCollection.h"
#import "SWGApiClient.h"
#import "SWGError.h"
#import "SWGGuild.h"
#import "SWGXAny.h"


@interface SWGGuildApi ()

@property (nonatomic, strong, readwrite) NSMutableDictionary *mutableDefaultHeaders;

@end

@implementation SWGGuildApi

NSString* kSWGGuildApiErrorDomain = @"SWGGuildApiErrorDomain";
NSInteger kSWGGuildApiMissingParamErrorCode = 234513;

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
/// Archive a guild
/// 
///  @returns NSObject*
///
-(NSURLSessionTask*) guildArchiveWithCompletionHandler: 
    (void (^)(NSObject* output, NSError* error)) handler {
    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/guild/archive"];

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
    NSArray *authSettings = @[@"apiExpires", @"apiKey", @"apiSignature"];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];

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
                              responseType: @"NSObject*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((NSObject*)data, error);
                                }
                            }];
}

///
/// Edit guild new guild
/// 
///  @param name Name of the guild, must be unique, must be at least 5 characters 
///
///  @param emoji Emoji name. 
///
///  @param potDistributionPercent How much of the pot should be distributed to the guild members, must be between 0 and 100 
///
///  @param potDistributionType How the pot should be distributed to the guild members, must be one of the following: ROLL_OVER, TOP_3, TOP_5, TOP_10, VOLUME_PERCENTAGE, TOP_3_BY_ADV, TOP_5_BY_ADV, TOP_10_BY_ADV, TOP_3_BY_ROI, TOP_5_BY_ROI, TOP_10_BY_ROI, RANDOM 
///
///  @param potTraderId User ID of the guild member with order write permission for the pot (optional)
///
///  @param _description Guild description, can be used to explain the guild to other users. (optional)
///
///  @param twitter Guild twitter handle. (optional)
///
///  @param discord Guild discord link. (optional)
///
///  @param telegram Guild telegram link. (optional)
///
///  @param imgUrl URL for the profile image of the guild, is used by clients to add some color to the guild, if no image is provided, a default image is used (optional)
///
///  @param isPrivate Guild privacy status (optional)
///
///  @returns SWGGuild*
///
-(NSURLSessionTask*) guildEditWithName: (NSString*) name
    emoji: (NSString*) emoji
    potDistributionPercent: (NSNumber*) potDistributionPercent
    potDistributionType: (NSString*) potDistributionType
    potTraderId: (NSNumber*) potTraderId
    _description: (NSString*) _description
    twitter: (NSString*) twitter
    discord: (NSString*) discord
    telegram: (NSString*) telegram
    imgUrl: (NSString*) imgUrl
    isPrivate: (NSNumber*) isPrivate
    completionHandler: (void (^)(SWGGuild* output, NSError* error)) handler {
    // verify the required parameter 'name' is set
    if (name == nil) {
        NSParameterAssert(name);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"name"] };
            NSError* error = [NSError errorWithDomain:kSWGGuildApiErrorDomain code:kSWGGuildApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'emoji' is set
    if (emoji == nil) {
        NSParameterAssert(emoji);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"emoji"] };
            NSError* error = [NSError errorWithDomain:kSWGGuildApiErrorDomain code:kSWGGuildApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'potDistributionPercent' is set
    if (potDistributionPercent == nil) {
        NSParameterAssert(potDistributionPercent);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"potDistributionPercent"] };
            NSError* error = [NSError errorWithDomain:kSWGGuildApiErrorDomain code:kSWGGuildApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'potDistributionType' is set
    if (potDistributionType == nil) {
        NSParameterAssert(potDistributionType);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"potDistributionType"] };
            NSError* error = [NSError errorWithDomain:kSWGGuildApiErrorDomain code:kSWGGuildApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/guild"];

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
    NSArray *authSettings = @[@"apiExpires", @"apiKey", @"apiSignature"];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];
    if (name) {
        formParams[@"name"] = name;
    }
    if (emoji) {
        formParams[@"emoji"] = emoji;
    }
    if (potDistributionPercent) {
        formParams[@"potDistributionPercent"] = potDistributionPercent;
    }
    if (potDistributionType) {
        formParams[@"potDistributionType"] = potDistributionType;
    }
    if (potTraderId) {
        formParams[@"potTraderId"] = potTraderId;
    }
    if (_description) {
        formParams[@"description"] = _description;
    }
    if (twitter) {
        formParams[@"twitter"] = twitter;
    }
    if (discord) {
        formParams[@"discord"] = discord;
    }
    if (telegram) {
        formParams[@"telegram"] = telegram;
    }
    if (imgUrl) {
        formParams[@"imgUrl"] = imgUrl;
    }
    if (isPrivate) {
        formParams[@"isPrivate"] = isPrivate;
    }

    return [self.apiClient requestWithPath: resourcePath
                                    method: @"PUT"
                                pathParams: pathParams
                               queryParams: queryParams
                                formParams: formParams
                                     files: localVarFiles
                                      body: bodyParam
                              headerParams: headerParams
                              authSettings: authSettings
                        requestContentType: requestContentType
                       responseContentType: responseContentType
                              responseType: @"SWGGuild*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((SWGGuild*)data, error);
                                }
                            }];
}

///
/// Get all guilds
/// 
///  @returns NSArray<SWGXAny>*
///
-(NSURLSessionTask*) guildGetWithCompletionHandler: 
    (void (^)(NSArray<SWGXAny>* output, NSError* error)) handler {
    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/guild"];

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
    NSArray *authSettings = @[];

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
                              responseType: @"NSArray<SWGXAny>*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((NSArray<SWGXAny>*)data, error);
                                }
                            }];
}

///
/// Request to Join a private guild or join a public guild
/// 
///  @param code  
///
///  @returns NSObject*
///
-(NSURLSessionTask*) guildJoinWithCode: (NSString*) code
    completionHandler: (void (^)(NSObject* output, NSError* error)) handler {
    // verify the required parameter 'code' is set
    if (code == nil) {
        NSParameterAssert(code);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"code"] };
            NSError* error = [NSError errorWithDomain:kSWGGuildApiErrorDomain code:kSWGGuildApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/guild/join"];

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
    NSArray *authSettings = @[@"apiExpires", @"apiKey", @"apiSignature"];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];
    if (code) {
        formParams[@"code"] = code;
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
                              responseType: @"NSObject*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((NSObject*)data, error);
                                }
                            }];
}

///
/// Kick member from guild
/// 
///  @param memberUserId  
///
///  @returns NSObject*
///
-(NSURLSessionTask*) guildKickWithMemberUserId: (NSNumber*) memberUserId
    completionHandler: (void (^)(NSObject* output, NSError* error)) handler {
    // verify the required parameter 'memberUserId' is set
    if (memberUserId == nil) {
        NSParameterAssert(memberUserId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"memberUserId"] };
            NSError* error = [NSError errorWithDomain:kSWGGuildApiErrorDomain code:kSWGGuildApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/guild/kick"];

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
    NSArray *authSettings = @[@"apiExpires", @"apiKey", @"apiSignature"];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];
    if (memberUserId) {
        formParams[@"memberUserId"] = memberUserId;
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
                              responseType: @"NSObject*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((NSObject*)data, error);
                                }
                            }];
}

///
/// Leave guild or cancel guild join request
/// 
///  @returns NSObject*
///
-(NSURLSessionTask*) guildLeaveWithCompletionHandler: 
    (void (^)(NSObject* output, NSError* error)) handler {
    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/guild/leave"];

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
    NSArray *authSettings = @[@"apiExpires", @"apiKey", @"apiSignature"];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];

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
                              responseType: @"NSObject*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((NSObject*)data, error);
                                }
                            }];
}

///
/// Creates a new guild
/// 
///  @param name Name of the guild, must be unique, must be at least 5 characters 
///
///  @param emoji Emoji name. 
///
///  @param potDistributionPercent How much of the pot should be distributed to the guild members, must be between 0 and 100 
///
///  @param potDistributionType How the pot should be distributed to the guild members, must be one of the following: ROLL_OVER, TOP_3, TOP_5, TOP_10, VOLUME_PERCENTAGE, TOP_3_BY_ADV, TOP_5_BY_ADV, TOP_10_BY_ADV, TOP_3_BY_ROI, TOP_5_BY_ROI, TOP_10_BY_ROI, RANDOM 
///
///  @param _description Guild description, can be used to explain the guild to other users. (optional)
///
///  @param twitter Guild twitter handle. (optional)
///
///  @param discord Guild discord link. (optional)
///
///  @param telegram Guild telegram link. (optional)
///
///  @param imgUrl URL for the profile image of the guild, is used by clients to add some color to the guild, if no image is provided, a default image is used (optional)
///
///  @param isPrivate Guild privacy status (optional)
///
///  @returns SWGGuild*
///
-(NSURLSessionTask*) guildNewWithName: (NSString*) name
    emoji: (NSString*) emoji
    potDistributionPercent: (NSNumber*) potDistributionPercent
    potDistributionType: (NSString*) potDistributionType
    _description: (NSString*) _description
    twitter: (NSString*) twitter
    discord: (NSString*) discord
    telegram: (NSString*) telegram
    imgUrl: (NSString*) imgUrl
    isPrivate: (NSNumber*) isPrivate
    completionHandler: (void (^)(SWGGuild* output, NSError* error)) handler {
    // verify the required parameter 'name' is set
    if (name == nil) {
        NSParameterAssert(name);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"name"] };
            NSError* error = [NSError errorWithDomain:kSWGGuildApiErrorDomain code:kSWGGuildApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'emoji' is set
    if (emoji == nil) {
        NSParameterAssert(emoji);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"emoji"] };
            NSError* error = [NSError errorWithDomain:kSWGGuildApiErrorDomain code:kSWGGuildApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'potDistributionPercent' is set
    if (potDistributionPercent == nil) {
        NSParameterAssert(potDistributionPercent);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"potDistributionPercent"] };
            NSError* error = [NSError errorWithDomain:kSWGGuildApiErrorDomain code:kSWGGuildApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'potDistributionType' is set
    if (potDistributionType == nil) {
        NSParameterAssert(potDistributionType);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"potDistributionType"] };
            NSError* error = [NSError errorWithDomain:kSWGGuildApiErrorDomain code:kSWGGuildApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/guild"];

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
    NSArray *authSettings = @[@"apiExpires", @"apiKey", @"apiSignature"];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];
    if (name) {
        formParams[@"name"] = name;
    }
    if (emoji) {
        formParams[@"emoji"] = emoji;
    }
    if (potDistributionPercent) {
        formParams[@"potDistributionPercent"] = potDistributionPercent;
    }
    if (potDistributionType) {
        formParams[@"potDistributionType"] = potDistributionType;
    }
    if (_description) {
        formParams[@"description"] = _description;
    }
    if (twitter) {
        formParams[@"twitter"] = twitter;
    }
    if (discord) {
        formParams[@"discord"] = discord;
    }
    if (telegram) {
        formParams[@"telegram"] = telegram;
    }
    if (imgUrl) {
        formParams[@"imgUrl"] = imgUrl;
    }
    if (isPrivate) {
        formParams[@"isPrivate"] = isPrivate;
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
                              responseType: @"SWGGuild*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((SWGGuild*)data, error);
                                }
                            }];
}

///
/// Toggle share trades for your account, which controls whether your guild members can see your orders and positions in their UI
/// 
///  @param shareTrades  
///
///  @returns NSObject*
///
-(NSURLSessionTask*) guildShareTradesWithShareTrades: (NSNumber*) shareTrades
    completionHandler: (void (^)(NSObject* output, NSError* error)) handler {
    // verify the required parameter 'shareTrades' is set
    if (shareTrades == nil) {
        NSParameterAssert(shareTrades);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"shareTrades"] };
            NSError* error = [NSError errorWithDomain:kSWGGuildApiErrorDomain code:kSWGGuildApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/guild/shareTrades"];

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
    NSArray *authSettings = @[@"apiExpires", @"apiKey", @"apiSignature"];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];
    if (shareTrades) {
        formParams[@"shareTrades"] = shareTrades;
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
                              responseType: @"NSObject*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((NSObject*)data, error);
                                }
                            }];
}



@end
