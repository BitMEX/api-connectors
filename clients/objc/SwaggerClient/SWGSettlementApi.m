#import "SWGSettlementApi.h"
#import "SWGQueryParamCollection.h"
#import "SWGSettlement.h"
#import "SWGError.h"


@interface SWGSettlementApi ()
    @property (readwrite, nonatomic, strong) NSMutableDictionary *defaultHeaders;
@end

@implementation SWGSettlementApi

static SWGSettlementApi* singletonAPI = nil;

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

+(SWGSettlementApi*) apiWithHeader:(NSString*)headerValue key:(NSString*)key {

    if (singletonAPI == nil) {
        singletonAPI = [[SWGSettlementApi alloc] init];
        [singletonAPI addHeader:headerValue forKey:key];
    }
    return singletonAPI;
}

+(SWGSettlementApi*) sharedAPI {

    if (singletonAPI == nil) {
        singletonAPI = [[SWGSettlementApi alloc] init];
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
/// Get settlement history.
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
///  @returns NSArray<SWGSettlement>*
///
-(NSNumber*) settlementGetWithCompletionBlock: (NSString*) symbol
         filter: (NSString*) filter
         columns: (NSString*) columns
         count: (NSNumber*) count
         start: (NSNumber*) start
         reverse: (NSNumber*) reverse
         startTime: (NSDate*) startTime
         endTime: (NSDate*) endTime
        
        completionHandler: (void (^)(NSArray<SWGSettlement>* output, NSError* error))completionBlock { 
        

    

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/settlement"];

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
                                         responseType: @"NSArray<SWGSettlement>*"
                                      completionBlock: ^(id data, NSError *error) {
                  
                  completionBlock((NSArray<SWGSettlement>*)data, error);
              }
          ];
}



@end
