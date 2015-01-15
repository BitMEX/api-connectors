#import "SWGQuoteApi.h"
#import "SWGFile.h"
#import "SWGApiClient.h"
#import "SWGQuote.h"




@implementation SWGQuoteApi
static NSString * basePath = @"https://www.bitmex.com/api/v1";

+(SWGQuoteApi*) apiWithHeader:(NSString*)headerValue key:(NSString*)key {
    static SWGQuoteApi* singletonAPI = nil;

    if (singletonAPI == nil) {
        singletonAPI = [[SWGQuoteApi alloc] init];
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


-(NSNumber*) getBucketedWithCompletionBlock:(NSString*) symbol
        filter:(NSObject*) filter
        columns:(NSArray*) columns
        start:(NSNumber*) start
        reverse:(NSNumber*) reverse
        startTime:(SWGDate*) startTime
        endTime:(SWGDate*) endTime
        binSize:(NSString*) binSize
        count:(NSNumber*) count
        completionHandler: (void (^)(NSArray* output, NSError* error))completionBlock{

    NSMutableString* requestUrl = [NSMutableString stringWithFormat:@"%@/quote/bucketed", basePath];

    // remove format in URL if needed
    if ([requestUrl rangeOfString:@".{format}"].location != NSNotFound)
        [requestUrl replaceCharactersInRange: [requestUrl rangeOfString:@".{format}"] withString:@".json"];

    NSString* requestContentType = @"application/json";
    NSString* responseContentType = @"application/json";

        NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if(binSize != nil)
        queryParams[@"binSize"] = binSize;
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
                                SWGQuote* d = [[SWGQuote alloc]initWithValues: dict];
                                [objs addObject:d];
                             }
                             completionBlock(objs, nil);
                         }
                        }];
    

}



@end
