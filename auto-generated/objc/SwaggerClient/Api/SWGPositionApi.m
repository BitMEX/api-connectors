#import "SWGPositionApi.h"
#import "SWGQueryParamCollection.h"
#import "SWGApiClient.h"
#import "SWGError.h"
#import "SWGPosition.h"


@interface SWGPositionApi ()

@property (nonatomic, strong, readwrite) NSMutableDictionary *mutableDefaultHeaders;

@end

@implementation SWGPositionApi

NSString* kSWGPositionApiErrorDomain = @"SWGPositionApiErrorDomain";
NSInteger kSWGPositionApiMissingParamErrorCode = 234513;

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
/// Get your positions.
/// See <a href=\"http://www.onixs.biz/fix-dictionary/5.0.SP2/msgType_AP_6580.html\">the FIX Spec</a> for explanations of these fields.
///  @param filter Table filter. For example, send {\"symbol\": \"XBTUSD\"}. (optional)
///
///  @param columns Which columns to fetch. For example, send [\"columnName\"]. (optional)
///
///  @param count Number of rows to fetch. (optional)
///
///  @returns NSArray<SWGPosition>*
///
-(NSURLSessionTask*) positionGetWithFilter: (NSString*) filter
    columns: (NSString*) columns
    count: (NSNumber*) count
    completionHandler: (void (^)(NSArray<SWGPosition>* output, NSError* error)) handler {
    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/position"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (filter != nil) {
        queryParams[@"filter"] = filter;
    }
    if (columns != nil) {
        queryParams[@"columns"] = columns;
    }
    if (count != nil) {
        queryParams[@"count"] = count;
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
                              responseType: @"NSArray<SWGPosition>*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((NSArray<SWGPosition>*)data, error);
                                }
                            }];
}

///
/// Enable isolated margin or cross margin per-position.
/// Users can switch isolate margin per-position. This function allows switching margin isolation (aka fixed margin) on and off.
///  @param symbol Position symbol to isolate. 
///
///  @param enabled True for isolated margin, false for cross margin. (optional, default to true)
///
///  @returns SWGPosition*
///
-(NSURLSessionTask*) positionIsolateMarginWithSymbol: (NSString*) symbol
    enabled: (NSNumber*) enabled
    completionHandler: (void (^)(SWGPosition* output, NSError* error)) handler {
    // verify the required parameter 'symbol' is set
    if (symbol == nil) {
        NSParameterAssert(symbol);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"symbol"] };
            NSError* error = [NSError errorWithDomain:kSWGPositionApiErrorDomain code:kSWGPositionApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/position/isolate"];

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
    if (symbol) {
        formParams[@"symbol"] = symbol;
    }
    if (enabled) {
        formParams[@"enabled"] = enabled;
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
                              responseType: @"SWGPosition*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((SWGPosition*)data, error);
                                }
                            }];
}

///
/// Transfer equity in or out of a position.
/// When margin is isolated on a position, use this function to add or remove margin from the position. Note that you cannot remove margin below the initial margin threshold.
///  @param symbol Symbol of position to isolate. 
///
///  @param amount Amount to transfer, in Satoshis. May be negative. 
///
///  @returns SWGPosition*
///
-(NSURLSessionTask*) positionTransferIsolatedMarginWithSymbol: (NSString*) symbol
    amount: (NSNumber*) amount
    completionHandler: (void (^)(SWGPosition* output, NSError* error)) handler {
    // verify the required parameter 'symbol' is set
    if (symbol == nil) {
        NSParameterAssert(symbol);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"symbol"] };
            NSError* error = [NSError errorWithDomain:kSWGPositionApiErrorDomain code:kSWGPositionApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'amount' is set
    if (amount == nil) {
        NSParameterAssert(amount);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"amount"] };
            NSError* error = [NSError errorWithDomain:kSWGPositionApiErrorDomain code:kSWGPositionApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/position/transferMargin"];

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
    if (symbol) {
        formParams[@"symbol"] = symbol;
    }
    if (amount) {
        formParams[@"amount"] = amount;
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
                              responseType: @"SWGPosition*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((SWGPosition*)data, error);
                                }
                            }];
}

///
/// Choose leverage for a position.
/// Users can choose an isolated leverage. This will automatically enable isolated margin.
///  @param symbol Symbol of position to adjust. 
///
///  @param leverage Leverage value. Send a number between 0.01 and 100 to enable isolated margin with a fixed leverage. Send 0 to enable cross margin. 
///
///  @returns SWGPosition*
///
-(NSURLSessionTask*) positionUpdateLeverageWithSymbol: (NSString*) symbol
    leverage: (NSNumber*) leverage
    completionHandler: (void (^)(SWGPosition* output, NSError* error)) handler {
    // verify the required parameter 'symbol' is set
    if (symbol == nil) {
        NSParameterAssert(symbol);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"symbol"] };
            NSError* error = [NSError errorWithDomain:kSWGPositionApiErrorDomain code:kSWGPositionApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'leverage' is set
    if (leverage == nil) {
        NSParameterAssert(leverage);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"leverage"] };
            NSError* error = [NSError errorWithDomain:kSWGPositionApiErrorDomain code:kSWGPositionApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/position/leverage"];

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
    if (symbol) {
        formParams[@"symbol"] = symbol;
    }
    if (leverage) {
        formParams[@"leverage"] = leverage;
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
                              responseType: @"SWGPosition*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((SWGPosition*)data, error);
                                }
                            }];
}

///
/// Update your risk limit.
/// Risk Limits limit the size of positions you can trade at various margin levels. Larger positions require more margin. Please see the Risk Limit documentation for more details.
///  @param symbol Symbol of position to isolate. 
///
///  @param riskLimit New Risk Limit, in Satoshis. 
///
///  @returns SWGPosition*
///
-(NSURLSessionTask*) positionUpdateRiskLimitWithSymbol: (NSString*) symbol
    riskLimit: (NSNumber*) riskLimit
    completionHandler: (void (^)(SWGPosition* output, NSError* error)) handler {
    // verify the required parameter 'symbol' is set
    if (symbol == nil) {
        NSParameterAssert(symbol);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"symbol"] };
            NSError* error = [NSError errorWithDomain:kSWGPositionApiErrorDomain code:kSWGPositionApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'riskLimit' is set
    if (riskLimit == nil) {
        NSParameterAssert(riskLimit);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"riskLimit"] };
            NSError* error = [NSError errorWithDomain:kSWGPositionApiErrorDomain code:kSWGPositionApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/position/riskLimit"];

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
    if (symbol) {
        formParams[@"symbol"] = symbol;
    }
    if (riskLimit) {
        formParams[@"riskLimit"] = riskLimit;
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
                              responseType: @"SWGPosition*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((SWGPosition*)data, error);
                                }
                            }];
}



@end
