#import "SWGInstrumentApi.h"
#import "SWGQueryParamCollection.h"
#import "SWGError.h"
#import "SWGInstrument.h"
#import "SWGInstrumentInterval.h"


@interface SWGInstrumentApi ()
    @property (readwrite, nonatomic, strong) NSMutableDictionary *defaultHeaders;
@end

@implementation SWGInstrumentApi

static SWGInstrumentApi* singletonAPI = nil;

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

+(SWGInstrumentApi*) apiWithHeader:(NSString*)headerValue key:(NSString*)key {

    if (singletonAPI == nil) {
        singletonAPI = [[SWGInstrumentApi alloc] init];
        [singletonAPI addHeader:headerValue forKey:key];
    }
    return singletonAPI;
}

+(SWGInstrumentApi*) sharedAPI {

    if (singletonAPI == nil) {
        singletonAPI = [[SWGInstrumentApi alloc] init];
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
/// Get instruments.
/// This returns all instruments and indices, including those that have settled or are unlisted. Use this endpoint if you want to query for individual instruments or use a complex filter. Use the endpoint /instrument/active to return active instruments, or use a filter like {\"state\": \"Open\"}.
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
///  @returns NSArray<SWGInstrument>*
///
-(NSNumber*) instrumentGetWithCompletionBlock: (NSString*) symbol
         filter: (NSString*) filter
         columns: (NSString*) columns
         count: (NSNumber*) count
         start: (NSNumber*) start
         reverse: (NSNumber*) reverse
         startTime: (NSDate*) startTime
         endTime: (NSDate*) endTime
        
        completionHandler: (void (^)(NSArray<SWGInstrument>* output, NSError* error))completionBlock { 
        

    

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/instrument"];

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
                                         responseType: @"NSArray<SWGInstrument>*"
                                      completionBlock: ^(id data, NSError *error) {
                  
                  completionBlock((NSArray<SWGInstrument>*)data, error);
              }
          ];
}

///
/// Get all active instruments and instruments that have expired in <24hrs.
/// 
///  @returns NSArray<SWGInstrument>*
///
-(NSNumber*) instrumentGetActiveWithCompletionBlock: 
        (void (^)(NSArray<SWGInstrument>* output, NSError* error))completionBlock { 
        

    

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/instrument/active"];

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
                                         responseType: @"NSArray<SWGInstrument>*"
                                      completionBlock: ^(id data, NSError *error) {
                  
                  completionBlock((NSArray<SWGInstrument>*)data, error);
              }
          ];
}

///
/// Helper method. Gets all active instruments and all indices. This is a join of the result of /indices and /active.
/// 
///  @returns NSArray<SWGInstrument>*
///
-(NSNumber*) instrumentGetActiveAndIndicesWithCompletionBlock: 
        (void (^)(NSArray<SWGInstrument>* output, NSError* error))completionBlock { 
        

    

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/instrument/activeAndIndices"];

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
                                         responseType: @"NSArray<SWGInstrument>*"
                                      completionBlock: ^(id data, NSError *error) {
                  
                  completionBlock((NSArray<SWGInstrument>*)data, error);
              }
          ];
}

///
/// Return all active contract series and interval pairs.
/// This endpoint is useful for determining which pairs are live. It returns two arrays of   strings. The first is intervals, such as `[\"BVOL:daily\", \"BVOL:weekly\", \"XBU:daily\", \"XBU:monthly\", ...]`. These identifiers are usable in any query's \"symbol\" param. The second array is the current resolution of these intervals. Results are mapped at the same index.
///  @returns SWGInstrumentInterval*
///
-(NSNumber*) instrumentGetActiveIntervalsWithCompletionBlock: 
        (void (^)(SWGInstrumentInterval* output, NSError* error))completionBlock { 
        

    

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/instrument/activeIntervals"];

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
                                         responseType: @"SWGInstrumentInterval*"
                                      completionBlock: ^(id data, NSError *error) {
                  
                  completionBlock((SWGInstrumentInterval*)data, error);
              }
          ];
}

///
/// Get all price indices.
/// 
///  @returns NSArray<SWGInstrument>*
///
-(NSNumber*) instrumentGetIndicesWithCompletionBlock: 
        (void (^)(NSArray<SWGInstrument>* output, NSError* error))completionBlock { 
        

    

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/instrument/indices"];

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
                                         responseType: @"NSArray<SWGInstrument>*"
                                      completionBlock: ^(id data, NSError *error) {
                  
                  completionBlock((NSArray<SWGInstrument>*)data, error);
              }
          ];
}



@end
