#import "SWGSchemaApi.h"
#import "SWGFile.h"
#import "SWGApiClient.h"
#import "Object.h"




@implementation SWGSchemaApi
static NSString * basePath = @"https://www.bitmex.com/api/v1";

+(SWGSchemaApi*) apiWithHeader:(NSString*)headerValue key:(NSString*)key {
    static SWGSchemaApi* singletonAPI = nil;

    if (singletonAPI == nil) {
        singletonAPI = [[SWGSchemaApi alloc] init];
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


-(NSNumber*) schema_findWithCompletionBlock:(NSString*) model
        completionHandler: (void (^)(NSObject* output, NSError* error))completionBlock{

    NSMutableString* requestUrl = [NSMutableString stringWithFormat:@"%@/schema", basePath];

    // remove format in URL if needed
    if ([requestUrl rangeOfString:@".{format}"].location != NSNotFound)
        [requestUrl replaceCharactersInRange: [requestUrl rangeOfString:@".{format}"] withString:@".json"];

    NSString* requestContentType = @"application/json";
    NSString* responseContentType = @"application/json";

        NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if(model != nil)
        queryParams[@"model"] = model;
    NSMutableDictionary* headerParams = [[NSMutableDictionary alloc] init];
    id bodyDictionary = nil;
        SWGApiClient* client = [SWGApiClient sharedClientFromPool:basePath];

    return [client dictionary:requestUrl 
                              method:@"GET" 
                         queryParams:queryParams 
                                body:bodyDictionary 
                        headerParams:headerParams
                  requestContentType:requestContentType
                 responseContentType:responseContentType
                     completionBlock:^(NSDictionary *data, NSError *error) {
                        if (error) {
                            completionBlock(nil, error);return;
                        }
                        NSObject *result = nil;
                        if (data) {
                            result = [[NSObject alloc]initWithValues: data];
                        }
                        completionBlock(result , nil);}];
    

}



@end
