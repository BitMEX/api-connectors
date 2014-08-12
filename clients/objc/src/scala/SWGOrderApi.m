#import "SWGOrderApi.h"
#import "SWGFile.h"
#import "SWGApiClient.h"
#import "SWGOrder.h"




@implementation SWGOrderApi
static NSString * basePath = @"https://www.bitmex.com/api/v1";

+(SWGOrderApi*) apiWithHeader:(NSString*)headerValue key:(NSString*)key {
    static SWGOrderApi* singletonAPI = nil;

    if (singletonAPI == nil) {
        singletonAPI = [[SWGOrderApi alloc] init];
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


-(NSNumber*) order_newOrderWithCompletionBlock:(NSString*) symbol
        quantity:(NSNumber*) quantity
        price:(NSNumber*) price
        ioc:(NSNumber*) ioc
        completionHandler: (void (^)(SWGOrder* output, NSError* error))completionBlock{

    NSMutableString* requestUrl = [NSMutableString stringWithFormat:@"%@/order/new", basePath];

    // remove format in URL if needed
    if ([requestUrl rangeOfString:@".{format}"].location != NSNotFound)
        [requestUrl replaceCharactersInRange: [requestUrl rangeOfString:@".{format}"] withString:@".json"];

    NSString* requestContentType = @"application/json";
    NSString* responseContentType = @"application/json";

        NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary* headerParams = [[NSMutableDictionary alloc] init];
    id bodyDictionary = nil;
        if(symbol == nil) {
        // error
    }
    if(quantity == nil) {
        // error
    }
    if(price == nil) {
        // error
    }
    SWGApiClient* client = [SWGApiClient sharedClientFromPool:basePath];

    return [client dictionary:requestUrl 
                              method:@"POST" 
                         queryParams:queryParams 
                                body:bodyDictionary 
                        headerParams:headerParams
                  requestContentType:requestContentType
                 responseContentType:responseContentType
                     completionBlock:^(NSDictionary *data, NSError *error) {
                        if (error) {
                            completionBlock(nil, error);return;
                        }
                        SWGOrder *result = nil;
                        if (data) {
                            result = [[SWGOrder alloc]initWithValues: data];
                        }
                        completionBlock(result , nil);}];
    

}

-(NSNumber*) order_cancelOrderWithCompletionBlock:(NSString*) orderID
        completionHandler: (void (^)(SWGOrder* output, NSError* error))completionBlock{

    NSMutableString* requestUrl = [NSMutableString stringWithFormat:@"%@/order/cancel", basePath];

    // remove format in URL if needed
    if ([requestUrl rangeOfString:@".{format}"].location != NSNotFound)
        [requestUrl replaceCharactersInRange: [requestUrl rangeOfString:@".{format}"] withString:@".json"];

    NSString* requestContentType = @"application/json";
    NSString* responseContentType = @"application/json";

        NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary* headerParams = [[NSMutableDictionary alloc] init];
    id bodyDictionary = nil;
        if(orderID == nil) {
        // error
    }
    SWGApiClient* client = [SWGApiClient sharedClientFromPool:basePath];

    return [client dictionary:requestUrl 
                              method:@"POST" 
                         queryParams:queryParams 
                                body:bodyDictionary 
                        headerParams:headerParams
                  requestContentType:requestContentType
                 responseContentType:responseContentType
                     completionBlock:^(NSDictionary *data, NSError *error) {
                        if (error) {
                            completionBlock(nil, error);return;
                        }
                        SWGOrder *result = nil;
                        if (data) {
                            result = [[SWGOrder alloc]initWithValues: data];
                        }
                        completionBlock(result , nil);}];
    

}

-(NSNumber*) order_myOrdersWithCompletionBlock:(NSObject*) filter
        columns:(NSArray*) columns
        count:(NSNumber*) count
        completionHandler: (void (^)(NSArray* output, NSError* error))completionBlock{

    NSMutableString* requestUrl = [NSMutableString stringWithFormat:@"%@/order/myOrders", basePath];

    // remove format in URL if needed
    if ([requestUrl rangeOfString:@".{format}"].location != NSNotFound)
        [requestUrl replaceCharactersInRange: [requestUrl rangeOfString:@".{format}"] withString:@".json"];

    NSString* requestContentType = @"application/json";
    NSString* responseContentType = @"application/json";

        NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if(filter != nil)
        queryParams[@"filter"] = filter;
    if(columns != nil)
        queryParams[@"columns"] = columns;
    if(count != nil)
        queryParams[@"count"] = count;
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
                                SWGOrder* d = [[SWGOrder alloc]initWithValues: dict];
                                [objs addObject:d];
                             }
                             completionBlock(objs, nil);
                         }
                        }];
    

}

-(NSNumber*) order_myOpenOrdersWithCompletionBlock: (void (^)(NSArray* output, NSError* error))completionBlock{

    NSMutableString* requestUrl = [NSMutableString stringWithFormat:@"%@/order/myOpenOrders", basePath];

    // remove format in URL if needed
    if ([requestUrl rangeOfString:@".{format}"].location != NSNotFound)
        [requestUrl replaceCharactersInRange: [requestUrl rangeOfString:@".{format}"] withString:@".json"];

    NSString* requestContentType = @"application/json";
    NSString* responseContentType = @"application/json";

        NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
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
                                SWGOrder* d = [[SWGOrder alloc]initWithValues: dict];
                                [objs addObject:d];
                             }
                             completionBlock(objs, nil);
                         }
                        }];
    

}



@end
