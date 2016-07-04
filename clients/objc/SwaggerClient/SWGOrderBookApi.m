#import "SWGOrderBookApi.h"
#import "SWGQueryParamCollection.h"
#import "SWGOrderBook.h"
#import "SWGError.h"
#import "SWGOrderBookL2.h"


@interface SWGOrderBookApi ()
    @property (readwrite, nonatomic, strong) NSMutableDictionary *defaultHeaders;
@end

@implementation SWGOrderBookApi

static SWGOrderBookApi* singletonAPI = nil;

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

+(SWGOrderBookApi*) apiWithHeader:(NSString*)headerValue key:(NSString*)key {

    if (singletonAPI == nil) {
        singletonAPI = [[SWGOrderBookApi alloc] init];
        [singletonAPI addHeader:headerValue forKey:key];
    }
    return singletonAPI;
}

+(SWGOrderBookApi*) sharedAPI {

    if (singletonAPI == nil) {
        singletonAPI = [[SWGOrderBookApi alloc] init];
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
/// Get current orderbook [deprecated, use /orderBook/L2].
/// 
///  @param symbol Instrument symbol. Send a series (e.g. XBT) to get data for the nearest contract in that series.
///
///  @param depth Orderbook depth.
///
///  @returns NSArray<SWGOrderBook>*
///
-(NSNumber*) orderBookGetWithCompletionBlock: (NSString*) symbol
         depth: (NSNumber*) depth
        
        completionHandler: (void (^)(NSArray<SWGOrderBook>* output, NSError* error))completionBlock { 
        

    
    // verify the required parameter 'symbol' is set
    if (symbol == nil) {
        [NSException raise:@"Invalid parameter" format:@"Missing the required parameter `symbol` when calling `orderBookGet`"];
    }
    

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/orderBook"];

    // remove format in URL if needed
    if ([resourcePath rangeOfString:@".{format}"].location != NSNotFound) {
        [resourcePath replaceCharactersInRange: [resourcePath rangeOfString:@".{format}"] withString:@".json"];
    }

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if(symbol != nil) {
        
        queryParams[@"symbol"] = symbol;
    }
    if(depth != nil) {
        
        queryParams[@"depth"] = depth;
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
                                         responseType: @"NSArray<SWGOrderBook>*"
                                      completionBlock: ^(id data, NSError *error) {
                  
                  completionBlock((NSArray<SWGOrderBook>*)data, error);
              }
          ];
}

///
/// Get current orderbook in vertical format.
/// 
///  @param symbol Instrument symbol. Send a series (e.g. XBT) to get data for the nearest contract in that series.
///
///  @param depth Orderbook depth per side. Send 0 for full depth.
///
///  @returns NSArray<SWGOrderBookL2>*
///
-(NSNumber*) orderBookGetL2WithCompletionBlock: (NSString*) symbol
         depth: (NSNumber*) depth
        
        completionHandler: (void (^)(NSArray<SWGOrderBookL2>* output, NSError* error))completionBlock { 
        

    
    // verify the required parameter 'symbol' is set
    if (symbol == nil) {
        [NSException raise:@"Invalid parameter" format:@"Missing the required parameter `symbol` when calling `orderBookGetL2`"];
    }
    

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/orderBook/L2"];

    // remove format in URL if needed
    if ([resourcePath rangeOfString:@".{format}"].location != NSNotFound) {
        [resourcePath replaceCharactersInRange: [resourcePath rangeOfString:@".{format}"] withString:@".json"];
    }

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if(symbol != nil) {
        
        queryParams[@"symbol"] = symbol;
    }
    if(depth != nil) {
        
        queryParams[@"depth"] = depth;
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
                                         responseType: @"NSArray<SWGOrderBookL2>*"
                                      completionBlock: ^(id data, NSError *error) {
                  
                  completionBlock((NSArray<SWGOrderBookL2>*)data, error);
              }
          ];
}



@end
