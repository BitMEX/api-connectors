#import <Foundation/Foundation.h>
#import "SWGError.h"
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
-(NSNumber*) findWithCompletionBlock :(NSString*) model 
        completionHandler: (void (^)(NSObject* output, NSError* error))completionBlock;

/**

 Returns help text & subject list for websocket usage.
 
 */
-(NSNumber*) websocketHelpWithCompletionBlock :(void (^)(NSObject* output, NSError* error))completionBlock;

@end
