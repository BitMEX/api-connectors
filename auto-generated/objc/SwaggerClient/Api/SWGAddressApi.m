#import "SWGAddressApi.h"
#import "SWGQueryParamCollection.h"
#import "SWGApiClient.h"
#import "SWGAddress.h"
#import "SWGError.h"


@interface SWGAddressApi ()

@property (nonatomic, strong, readwrite) NSMutableDictionary *mutableDefaultHeaders;

@end

@implementation SWGAddressApi

NSString* kSWGAddressApiErrorDomain = @"SWGAddressApiErrorDomain";
NSInteger kSWGAddressApiMissingParamErrorCode = 234513;

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
/// Get your addresses.
/// 
///  @returns NSArray<SWGAddress>*
///
-(NSURLSessionTask*) addressGetWithCompletionHandler: 
    (void (^)(NSArray<SWGAddress>* output, NSError* error)) handler {
    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/address"];

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
                              responseType: @"NSArray<SWGAddress>*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((NSArray<SWGAddress>*)data, error);
                                }
                            }];
}

///
/// Creates a new saved address.
/// 
///  @param currency Currency of the address. Options: `XBt`, `USDt` 
///
///  @param network Selected network. 
///
///  @param address Destination Address. 
///
///  @param name Name of the entry, eg. 'Hardware wallet'. 
///
///  @param note Optional annotation. (optional)
///
///  @param skipConfirm Skip e-mail confirmations for transfers to this address. Will require an email confirmation after creation. (optional, default to false)
///
///  @param skip2FA Skip 2FA confirmations for transfers to this address. Will require an email confirmation after creation. (optional, default to false)
///
///  @returns SWGAddress*
///
-(NSURLSessionTask*) addressNewWithCurrency: (NSString*) currency
    network: (NSString*) network
    address: (NSString*) address
    name: (NSString*) name
    note: (NSString*) note
    skipConfirm: (NSNumber*) skipConfirm
    skip2FA: (NSNumber*) skip2FA
    completionHandler: (void (^)(SWGAddress* output, NSError* error)) handler {
    // verify the required parameter 'currency' is set
    if (currency == nil) {
        NSParameterAssert(currency);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"currency"] };
            NSError* error = [NSError errorWithDomain:kSWGAddressApiErrorDomain code:kSWGAddressApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'network' is set
    if (network == nil) {
        NSParameterAssert(network);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"network"] };
            NSError* error = [NSError errorWithDomain:kSWGAddressApiErrorDomain code:kSWGAddressApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'address' is set
    if (address == nil) {
        NSParameterAssert(address);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"address"] };
            NSError* error = [NSError errorWithDomain:kSWGAddressApiErrorDomain code:kSWGAddressApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'name' is set
    if (name == nil) {
        NSParameterAssert(name);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"name"] };
            NSError* error = [NSError errorWithDomain:kSWGAddressApiErrorDomain code:kSWGAddressApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/address"];

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
    if (currency) {
        formParams[@"currency"] = currency;
    }
    if (network) {
        formParams[@"network"] = network;
    }
    if (address) {
        formParams[@"address"] = address;
    }
    if (name) {
        formParams[@"name"] = name;
    }
    if (note) {
        formParams[@"note"] = note;
    }
    if (skipConfirm) {
        formParams[@"skipConfirm"] = skipConfirm;
    }
    if (skip2FA) {
        formParams[@"skip2FA"] = skip2FA;
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
                              responseType: @"SWGAddress*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((SWGAddress*)data, error);
                                }
                            }];
}



@end
