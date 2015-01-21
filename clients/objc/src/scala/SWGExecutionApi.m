#import "SWGExecutionApi.h"
#import "SWGFile.h"
#import "SWGApiClient.h"
#import "SWGExecution.h"




@implementation SWGExecutionApi
static NSString * basePath = @"https://www.bitmex.com/api/v1";

+(SWGExecutionApi*) apiWithHeader:(NSString*)headerValue key:(NSString*)key {
    static SWGExecutionApi* singletonAPI = nil;

    if (singletonAPI == nil) {
        singletonAPI = [[SWGExecutionApi alloc] init];
        [singletonAPI addHeader:headerValue forKey:key];
    }
    return singletonAPI;
}

+(void) setBasePath:(NSString*)path {
    basePath = path;
}

+(NSString*) getBasePath {
    return basePath;
}

-(SWGApiClient*) apiClient {
    return [SWGApiClient sharedClientFromPool:basePath];
}

-(void) addHeader:(NSString*)value forKey:(NSString*)key {
    [[self apiClient] setHeaderValue:value forKey:key];
}

-(id) init {
    self = [super init];
    [self apiClient];
    return self;
}

-(void) setHeaderValue:(NSString*) value
           forKey:(NSString*)key {
    [[self apiClient] setHeaderValue:value forKey:key];
}

-(unsigned long) requestQueueSize {
    return [SWGApiClient requestQueueSize];
}


-(NSNumber*) getWithCompletionBlock:(NSString*) symbol
        filter:(NSObject*) filter
        columns:(NSArray*) columns
        start:(NSNumber*) start
        reverse:(NSNumber*) reverse
        startTime:(SWGDate*) startTime
        endTime:(SWGDate*) endTime
        count:(NSNumber*) count
        completionHandler : (void (^)(NSArray* output, NSError* error))completionBlock{

    NSMutableString* requestUrl = [NSMutableString stringWithFormat:@"%@/execution", basePath];

    // remove format in URL if needed
    if ([requestUrl rangeOfString:@".{format}"].location != NSNotFound)
        [requestUrl replaceCharactersInRange: [requestUrl rangeOfString:@".{format}"] withString:@".json"];

    NSString* requestContentType = @"application/json";
    NSString* responseContentType = @"application/json";

        NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if(symbol != nil)
        queryParams[@"symbol"] = symbol;
    if(filter != nil)
        queryParams[@"filter"] = filter;
    if(columns != nil)
        queryParams[@"columns"] = columns;
    if(count != nil)
        queryParams[@"count"] = count;
    if(start != nil)
        queryParams[@"start"] = start;
    if(reverse != nil)
        queryParams[@"reverse"] = reverse;
    if(startTime != nil)
        queryParams[@"startTime"] = startTime;
    if(endTime != nil)
        queryParams[@"endTime"] = endTime;
    NSMutableDictionary* headerParams = [[NSMutableDictionary alloc] init];
    id bodyDictionary = nil;
        SWGApiClient* client = [SWGApiClient sharedClientFromPool:basePath];

    return [client dictionary: requestUrl 
                               method: @"GET" 
                          queryParams: queryParams 
                                 body: bodyDictionary 
                         headerParams: headerParams
                   requestContentType: requestContentType
                  responseContentType: responseContentType
                      completionBlock: ^(NSDictionary *data, NSError *error) {
                         if (error) {
                             completionBlock(nil, error);return;
                         }
                         
                         if([data isKindOfClass:[NSArray class]]){
                             NSMutableArray * objs = [[NSMutableArray alloc] initWithCapacity:[data count]];
                             for (NSDictionary* dict in (NSArray*)data) {
                                SWGExecution* d = [[SWGExecution alloc]initWithValues: dict];
                                [objs addObject:d];
                             }
                             completionBlock(objs, nil);
                         }
                        }];
    

}

-(NSNumber*) getTradeHistoryWithCompletionBlock:(NSString*) symbol
        filter:(NSObject*) filter
        columns:(NSArray*) columns
        start:(NSNumber*) start
        reverse:(NSNumber*) reverse
        startTime:(SWGDate*) startTime
        endTime:(SWGDate*) endTime
        count:(NSNumber*) count
        completionHandler : (void (^)(NSArray* output, NSError* error))completionBlock{

    NSMutableString* requestUrl = [NSMutableString stringWithFormat:@"%@/execution/tradeHistory", basePath];

    // remove format in URL if needed
    if ([requestUrl rangeOfString:@".{format}"].location != NSNotFound)
        [requestUrl replaceCharactersInRange: [requestUrl rangeOfString:@".{format}"] withString:@".json"];

    NSString* requestContentType = @"application/json";
    NSString* responseContentType = @"application/json";

        NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if(symbol != nil)
        queryParams[@"symbol"] = symbol;
    if(filter != nil)
        queryParams[@"filter"] = filter;
    if(columns != nil)
        queryParams[@"columns"] = columns;
    if(count != nil)
        queryParams[@"count"] = count;
    if(start != nil)
        queryParams[@"start"] = start;
    if(reverse != nil)
        queryParams[@"reverse"] = reverse;
    if(startTime != nil)
        queryParams[@"startTime"] = startTime;
    if(endTime != nil)
        queryParams[@"endTime"] = endTime;
    NSMutableDictionary* headerParams = [[NSMutableDictionary alloc] init];
    id bodyDictionary = nil;
        SWGApiClient* client = [SWGApiClient sharedClientFromPool:basePath];

    return [client dictionary: requestUrl 
                               method: @"GET" 
                          queryParams: queryParams 
                                 body: bodyDictionary 
                         headerParams: headerParams
                   requestContentType: requestContentType
                  responseContentType: responseContentType
                      completionBlock: ^(NSDictionary *data, NSError *error) {
                         if (error) {
                             completionBlock(nil, error);return;
                         }
                         
                         if([data isKindOfClass:[NSArray class]]){
                             NSMutableArray * objs = [[NSMutableArray alloc] initWithCapacity:[data count]];
                             for (NSDictionary* dict in (NSArray*)data) {
                                SWGExecution* d = [[SWGExecution alloc]initWithValues: dict];
                                [objs addObject:d];
                             }
                             completionBlock(objs, nil);
                         }
                        }];
    

}



@end
