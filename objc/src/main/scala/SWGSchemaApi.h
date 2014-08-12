#import <Foundation/Foundation.h>
#import "Object.h"



@interface SWGSchemaApi: NSObject

-(void) addHeader:(NSString*)value forKey:(NSString*)key;
-(unsigned long) requestQueueSize;
+(SWGSchemaApi*) apiWithHeader:(NSString*)headerValue key:(NSString*)key;
+(void) setBasePath:(NSString*)basePath;
+(NSString*) getBasePath;
/**

 Get model schemata for data objects returned by this API.
 
 @param model Optional model filter. If omitted, will return all models.
 */
-(NSNumber*) schema_findWithCompletionBlock :(NSString*) model 
        completionHandler: (void (^)(NSObject* output, NSError* error))completionBlock;

@end
