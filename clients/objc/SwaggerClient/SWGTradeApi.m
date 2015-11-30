#import "SWGTradeApi.h"
#import "SWGQueryParamCollection.h"
#import "SWGError.h"
#import "SWGTrade.h"
#import "SWGTradeBin.h"


@interface SWGTradeApi ()
    @property (readwrite, nonatomic, strong) NSMutableDictionary *defaultHeaders;
@end

@implementation SWGTradeApi

static SWGTradeApi* singletonAPI = nil;

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

+(SWGTradeApi*) apiWithHeader:(NSString*)headerValue key:(NSString*)key {

    if (singletonAPI == nil) {
        singletonAPI = [[SWGTradeApi alloc] init];
        [singletonAPI addHeader:headerValue forKey:key];
    }
    return singletonAPI;
}

+(SWGTradeApi*) sharedAPI {

    if (singletonAPI == nil) {
        singletonAPI = [[SWGTradeApi alloc] init];
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
/// Get Trades.
/// 
///  @param symbol Instrument symbol. Send a bare series (e.g. XBU) to get data for the nearest expiring contract in that series.\n\nYou can also send a timeframe, e.g. 'XBU:monthly'. Timeframes are 'daily', 'weekly', 'monthly', 'quarterly', and 'biquarterly'.
///
///  @param filter Generic table filter. Send JSON key/value pairs, such as {\"key\": \"value\"}. You can key on individual fields, and do more advanced querying on timestamps. See <a href=\"http://localhost:2001/app/restAPI#timestamp-filters\">http://localhost:2001/app/restAPI#timestamp-filters</a> for more details.
///
///  @param columns Array of column names to fetch. If omitted, will return all columns.\n\nNote that this method will always return item keys, even when not specified, so you may receive more columns that you expect.
///
///  @param count Number of results to fetch.
///
///  @param start Starting point for results.
///
///  @param reverse If true, will sort results newest first.
///
///  @param startTime Starting date filter for results.
///
///  @param endTime Ending date filter for results.
///
///  @returns NSArray<SWGTrade>*
///
-(NSNumber*) tradeGetWithCompletionBlock: (NSString*) symbol
         filter: (NSString*) filter
         columns: (NSString*) columns
         count: (NSNumber*) count
         start: (NSNumber*) start
         reverse: (NSNumber*) reverse
         startTime: (NSDate*) startTime
         endTime: (NSDate*) endTime
        
        completionHandler: (void (^)(NSArray<SWGTrade>* output, NSError* error))completionBlock { 
        

    

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/trade"];

    // remove format in URL if needed
    if ([resourcePath rangeOfString:@".{format}"].location != NSNotFound) {
        [resourcePath replaceCharactersInRange: [resourcePath rangeOfString:@".{format}"] withString:@".json"];
    }

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if(symbol != nil) {
        
        queryParams[@"symbol"] = symbol;
    }
    if(filter != nil) {
        
        queryParams[@"filter"] = filter;
    }
    if(columns != nil) {
        
        queryParams[@"columns"] = columns;
    }
    if(count != nil) {
        
        queryParams[@"count"] = count;
    }
    if(start != nil) {
        
        queryParams[@"start"] = start;
    }
    if(reverse != nil) {
        
        queryParams[@"reverse"] = reverse;
    }
    if(startTime != nil) {
        
        queryParams[@"startTime"] = startTime;
    }
    if(endTime != nil) {
        
        queryParams[@"endTime"] = endTime;
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
                                         responseType: @"NSArray<SWGTrade>*"
                                      completionBlock: ^(id data, NSError *error) {
                  
                  completionBlock((NSArray<SWGTrade>*)data, error);
              }
          ];
}

///
/// Get previous trades in time buckets.
/// 
///  @param binSize Time interval to bucket by. Available options: ['1m', '5m', '1h', '1d'].
///
///  @param symbol Instrument symbol. Send a bare series (e.g. XBU) to get data for the nearest expiring contract in that series.\n\nYou can also send a timeframe, e.g. 'XBU:monthly'. Timeframes are 'daily', 'weekly', 'monthly', 'quarterly', and 'biquarterly'.
///
///  @param filter Generic table filter. Send JSON key/value pairs, such as {\"key\": \"value\"}. You can key on individual fields, and do more advanced querying on timestamps. See <a href=\"http://localhost:2001/app/restAPI#timestamp-filters\">http://localhost:2001/app/restAPI#timestamp-filters</a> for more details.
///
///  @param columns Array of column names to fetch. If omitted, will return all columns.\n\nNote that this method will always return item keys, even when not specified, so you may receive more columns that you expect.
///
///  @param count Number of results to fetch.
///
///  @param start Starting point for results.
///
///  @param reverse If true, will sort results newest first.
///
///  @param startTime Starting date filter for results.
///
///  @param endTime Ending date filter for results.
///
///  @returns NSArray<SWGTradeBin>*
///
-(NSNumber*) tradeGetBucketedWithCompletionBlock: (NSString*) binSize
         symbol: (NSString*) symbol
         filter: (NSString*) filter
         columns: (NSString*) columns
         count: (NSNumber*) count
         start: (NSNumber*) start
         reverse: (NSNumber*) reverse
         startTime: (NSDate*) startTime
         endTime: (NSDate*) endTime
        
        completionHandler: (void (^)(NSArray<SWGTradeBin>* output, NSError* error))completionBlock { 
        

    

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/trade/bucketed"];

    // remove format in URL if needed
    if ([resourcePath rangeOfString:@".{format}"].location != NSNotFound) {
        [resourcePath replaceCharactersInRange: [resourcePath rangeOfString:@".{format}"] withString:@".json"];
    }

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if(binSize != nil) {
        
        queryParams[@"binSize"] = binSize;
    }
    if(symbol != nil) {
        
        queryParams[@"symbol"] = symbol;
    }
    if(filter != nil) {
        
        queryParams[@"filter"] = filter;
    }
    if(columns != nil) {
        
        queryParams[@"columns"] = columns;
    }
    if(count != nil) {
        
        queryParams[@"count"] = count;
    }
    if(start != nil) {
        
        queryParams[@"start"] = start;
    }
    if(reverse != nil) {
        
        queryParams[@"reverse"] = reverse;
    }
    if(startTime != nil) {
        
        queryParams[@"startTime"] = startTime;
    }
    if(endTime != nil) {
        
        queryParams[@"endTime"] = endTime;
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
                                         responseType: @"NSArray<SWGTradeBin>*"
                                      completionBlock: ^(id data, NSError *error) {
                  
                  completionBlock((NSArray<SWGTradeBin>*)data, error);
              }
          ];
}

///
/// Get trades between two dates. [Deprecated, use GET /trades]
/// 
///  @param startTime Start date.
///
///  @param symbol Instrument symbol. Send a series (e.g. XBT) to get data for the nearest contract in that series.
///
///  @param endTime End Date.
///
///  @returns NSArray<SWGTrade>*
///
-(NSNumber*) tradeGetByDateWithCompletionBlock: (NSDate*) startTime
         symbol: (NSString*) symbol
         endTime: (NSDate*) endTime
        
        completionHandler: (void (^)(NSArray<SWGTrade>* output, NSError* error))completionBlock { 
        

    
    // verify the required parameter 'startTime' is set
    if (startTime == nil) {
        [NSException raise:@"Invalid parameter" format:@"Missing the required parameter `startTime` when calling `tradeGetByDate`"];
    }
    

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/trade/byDate"];

    // remove format in URL if needed
    if ([resourcePath rangeOfString:@".{format}"].location != NSNotFound) {
        [resourcePath replaceCharactersInRange: [resourcePath rangeOfString:@".{format}"] withString:@".json"];
    }

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if(symbol != nil) {
        
        queryParams[@"symbol"] = symbol;
    }
    if(startTime != nil) {
        
        queryParams[@"startTime"] = startTime;
    }
    if(endTime != nil) {
        
        queryParams[@"endTime"] = endTime;
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
                                         responseType: @"NSArray<SWGTrade>*"
                                      completionBlock: ^(id data, NSError *error) {
                  
                  completionBlock((NSArray<SWGTrade>*)data, error);
              }
          ];
}

///
/// Get recent trades. [Deprecated, use GET /trades]
/// 
///  @param count Number of trades to fetch.
///
///  @param symbol Instrument symbol. Send a series (e.g. XBT) to get data for the nearest contract in that series.
///
///  @returns NSArray<SWGTrade>*
///
-(NSNumber*) tradeGetRecentWithCompletionBlock: (NSNumber*) count
         symbol: (NSString*) symbol
        
        completionHandler: (void (^)(NSArray<SWGTrade>* output, NSError* error))completionBlock { 
        

    
    // verify the required parameter 'count' is set
    if (count == nil) {
        [NSException raise:@"Invalid parameter" format:@"Missing the required parameter `count` when calling `tradeGetRecent`"];
    }
    

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/trade/recent"];

    // remove format in URL if needed
    if ([resourcePath rangeOfString:@".{format}"].location != NSNotFound) {
        [resourcePath replaceCharactersInRange: [resourcePath rangeOfString:@".{format}"] withString:@".json"];
    }

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if(symbol != nil) {
        
        queryParams[@"symbol"] = symbol;
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
                                         responseType: @"NSArray<SWGTrade>*"
                                      completionBlock: ^(id data, NSError *error) {
                  
                  completionBlock((NSArray<SWGTrade>*)data, error);
              }
          ];
}



@end
