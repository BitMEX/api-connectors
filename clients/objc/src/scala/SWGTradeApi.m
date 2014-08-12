#import "SWGTradeApi.h"
#import "SWGFile.h"
#import "SWGApiClient.h"
#import "SWGTradeBin.h"
#import "SWGTrade.h"
#import "SWGAny.h"




@implementation SWGTradeApi
static NSString * basePath = @"https://www.bitmex.com/api/v1";

+(SWGTradeApi*) apiWithHeader:(NSString*)headerValue key:(NSString*)key {
    static SWGTradeApi* singletonAPI = nil;

    if (singletonAPI == nil) {
        singletonAPI = [[SWGTradeApi alloc] init];
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


-(NSNumber*) trade_getBucketedWithCompletionBlock:(NSString*) symbol
        startTime:(SWGDate*) startTime
        endTime:(SWGDate*) endTime
        count:(NSNumber*) count
        useMillisecondTime:(NSNumber*) useMillisecondTime
        binSize:(NSString*) binSize
        completionHandler: (void (^)(NSArray* output, NSError* error))completionBlock{

    NSMutableString* requestUrl = [NSMutableString stringWithFormat:@"%@/trade/getBucketed", basePath];

    // remove format in URL if needed
    if ([requestUrl rangeOfString:@".{format}"].location != NSNotFound)
        [requestUrl replaceCharactersInRange: [requestUrl rangeOfString:@".{format}"] withString:@".json"];

    NSString* requestContentType = @"application/json";
    NSString* responseContentType = @"application/json";

        NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if(symbol != nil)
        queryParams[@"symbol"] = symbol;
    if(binSize != nil)
        queryParams[@"binSize"] = binSize;
    if(startTime != nil)
        queryParams[@"startTime"] = startTime;
    if(endTime != nil)
        queryParams[@"endTime"] = endTime;
    if(count != nil)
        queryParams[@"count"] = count;
    if(useMillisecondTime != nil)
        queryParams[@"useMillisecondTime"] = useMillisecondTime;
    NSMutableDictionary* headerParams = [[NSMutableDictionary alloc] init];
    id bodyDictionary = nil;
        if(symbol == nil) {
        // error
    }
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
                                SWGTradeBin* d = [[SWGTradeBin alloc]initWithValues: dict];
                                [objs addObject:d];
                             }
                             completionBlock(objs, nil);
                         }
                        }];
    

}

-(NSNumber*) trade_getByDateWithCompletionBlock:(NSString*) symbol
        starttime:(SWGDate*) starttime
        endtime:(SWGDate*) endtime
        completionHandler: (void (^)(NSArray* output, NSError* error))completionBlock{

    NSMutableString* requestUrl = [NSMutableString stringWithFormat:@"%@/trade/getByDate", basePath];

    // remove format in URL if needed
    if ([requestUrl rangeOfString:@".{format}"].location != NSNotFound)
        [requestUrl replaceCharactersInRange: [requestUrl rangeOfString:@".{format}"] withString:@".json"];

    NSString* requestContentType = @"application/json";
    NSString* responseContentType = @"application/json";

        NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if(symbol != nil)
        queryParams[@"symbol"] = symbol;
    if(starttime != nil)
        queryParams[@"starttime"] = starttime;
    if(endtime != nil)
        queryParams[@"endtime"] = endtime;
    NSMutableDictionary* headerParams = [[NSMutableDictionary alloc] init];
    id bodyDictionary = nil;
        if(symbol == nil) {
        // error
    }
    if(starttime == nil) {
        // error
    }
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
                                SWGTrade* d = [[SWGTrade alloc]initWithValues: dict];
                                [objs addObject:d];
                             }
                             completionBlock(objs, nil);
                         }
                        }];
    

}

-(NSNumber*) trade_getRecentWithCompletionBlock:(NSString*) symbol
        count:(NSNumber*) count
        completionHandler: (void (^)(NSArray* output, NSError* error))completionBlock{

    NSMutableString* requestUrl = [NSMutableString stringWithFormat:@"%@/trade/getRecent", basePath];

    // remove format in URL if needed
    if ([requestUrl rangeOfString:@".{format}"].location != NSNotFound)
        [requestUrl replaceCharactersInRange: [requestUrl rangeOfString:@".{format}"] withString:@".json"];

    NSString* requestContentType = @"application/json";
    NSString* responseContentType = @"application/json";

        NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if(symbol != nil)
        queryParams[@"symbol"] = symbol;
    if(count != nil)
        queryParams[@"count"] = count;
    NSMutableDictionary* headerParams = [[NSMutableDictionary alloc] init];
    id bodyDictionary = nil;
        if(symbol == nil) {
        // error
    }
    if(count == nil) {
        // error
    }
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
                                SWGAny* d = [[SWGAny alloc]initWithValues: dict];
                                [objs addObject:d];
                             }
                             completionBlock(objs, nil);
                         }
                        }];
    

}



@end
