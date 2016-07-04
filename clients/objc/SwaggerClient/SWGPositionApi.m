#import "SWGPositionApi.h"
#import "SWGQueryParamCollection.h"
#import "SWGError.h"
#import "SWGPosition.h"


@interface SWGPositionApi ()
    @property (readwrite, nonatomic, strong) NSMutableDictionary *defaultHeaders;
@end

@implementation SWGPositionApi

static SWGPositionApi* singletonAPI = nil;

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

+(SWGPositionApi*) apiWithHeader:(NSString*)headerValue key:(NSString*)key {

    if (singletonAPI == nil) {
        singletonAPI = [[SWGPositionApi alloc] init];
        [singletonAPI addHeader:headerValue forKey:key];
    }
    return singletonAPI;
}

+(SWGPositionApi*) sharedAPI {

    if (singletonAPI == nil) {
        singletonAPI = [[SWGPositionApi alloc] init];
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
/// Get your positions.
/// See <a href=\"http://www.onixs.biz/fix-dictionary/5.0.SP2/msgType_AP_6580.html\">the FIX Spec</a> for explanations of these fields.
///  @param filter Table filter. For example, send {\"symbol\": \"XBT24H\"}.
///
///  @param columns Which columns to fetch. For example, send [\"columnName\"].
///
///  @param count Number of rows to fetch.
///
///  @returns NSArray<SWGPosition>*
///
-(NSNumber*) positionGetWithCompletionBlock: (NSString*) filter
         columns: (NSString*) columns
         count: (NSNumber*) count
        
        completionHandler: (void (^)(NSArray<SWGPosition>* output, NSError* error))completionBlock { 
        

    

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/position"];

    // remove format in URL if needed
    if ([resourcePath rangeOfString:@".{format}"].location != NSNotFound) {
        [resourcePath replaceCharactersInRange: [resourcePath rangeOfString:@".{format}"] withString:@".json"];
    }

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if(filter != nil) {
        
        queryParams[@"filter"] = filter;
    }
    if(columns != nil) {
        
        queryParams[@"columns"] = columns;
    }
    if(count != nil) {
        
        queryParams[@"count"] = count;
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
                                         responseType: @"NSArray<SWGPosition>*"
                                      completionBlock: ^(id data, NSError *error) {
                  
                  completionBlock((NSArray<SWGPosition>*)data, error);
              }
          ];
}

///
/// Enable isolated margin or cross margin per-position.
/// On Speculative (DPE-Enabled) contracts, users can switch isolate margin per-position. This function allows switching margin isolation (aka fixed margin) on and off.
///  @param symbol Position symbol to isolate.
///
///  @param enabled True for isolated margin, false for cross margin.
///
///  @returns SWGPosition*
///
-(NSNumber*) positionIsolateMarginWithCompletionBlock: (NSString*) symbol
         enabled: (NSNumber*) enabled
        
        completionHandler: (void (^)(SWGPosition* output, NSError* error))completionBlock { 
        

    
    // verify the required parameter 'symbol' is set
    if (symbol == nil) {
        [NSException raise:@"Invalid parameter" format:@"Missing the required parameter `symbol` when calling `positionIsolateMargin`"];
    }
    

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/position/isolate"];

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
    
    
    
    if (symbol) {
        formParams[@"symbol"] = symbol;
    }
    
    
    
    if (enabled) {
        formParams[@"enabled"] = enabled;
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
                                         responseType: @"SWGPosition*"
                                      completionBlock: ^(id data, NSError *error) {
                  
                  completionBlock((SWGPosition*)data, error);
              }
          ];
}

///
/// Choose leverage for a position.
/// On Speculative (DPE-Enabled) contracts, users can choose an isolated leverage. This will automatically enable isolated margin.
///  @param symbol Symbol of position to adjust.
///
///  @param leverage Leverage value. Send a number between 0.01 and 100 to enable isolated margin with a fixed leverage. Send 0 to enable cross margin.
///
///  @returns SWGPosition*
///
-(NSNumber*) positionUpdateLeverageWithCompletionBlock: (NSString*) symbol
         leverage: (NSNumber*) leverage
        
        completionHandler: (void (^)(SWGPosition* output, NSError* error))completionBlock { 
        

    
    // verify the required parameter 'symbol' is set
    if (symbol == nil) {
        [NSException raise:@"Invalid parameter" format:@"Missing the required parameter `symbol` when calling `positionUpdateLeverage`"];
    }
    
    // verify the required parameter 'leverage' is set
    if (leverage == nil) {
        [NSException raise:@"Invalid parameter" format:@"Missing the required parameter `leverage` when calling `positionUpdateLeverage`"];
    }
    

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/position/leverage"];

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
    
    
    
    if (symbol) {
        formParams[@"symbol"] = symbol;
    }
    
    
    
    if (leverage) {
        formParams[@"leverage"] = leverage;
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
                                         responseType: @"SWGPosition*"
                                      completionBlock: ^(id data, NSError *error) {
                  
                  completionBlock((SWGPosition*)data, error);
              }
          ];
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
-(NSNumber*) positionTransferIsolatedMarginWithCompletionBlock: (NSString*) symbol
         amount: (NSNumber*) amount
        
        completionHandler: (void (^)(SWGPosition* output, NSError* error))completionBlock { 
        

    
    // verify the required parameter 'symbol' is set
    if (symbol == nil) {
        [NSException raise:@"Invalid parameter" format:@"Missing the required parameter `symbol` when calling `positionTransferIsolatedMargin`"];
    }
    
    // verify the required parameter 'amount' is set
    if (amount == nil) {
        [NSException raise:@"Invalid parameter" format:@"Missing the required parameter `amount` when calling `positionTransferIsolatedMargin`"];
    }
    

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/position/transferMargin"];

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
    
    
    
    if (symbol) {
        formParams[@"symbol"] = symbol;
    }
    
    
    
    if (amount) {
        formParams[@"amount"] = amount;
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
                                         responseType: @"SWGPosition*"
                                      completionBlock: ^(id data, NSError *error) {
                  
                  completionBlock((SWGPosition*)data, error);
              }
          ];
}



@end
