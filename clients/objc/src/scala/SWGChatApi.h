#import <Foundation/Foundation.h>
#import "SWGChat.h"



@interface SWGChatApi: NSObject

-(void) addHeader:(NSString*)value forKey:(NSString*)key;
-(unsigned long) requestQueueSize;
+(SWGChatApi*) apiWithHeader:(NSString*)headerValue key:(NSString*)key;
+(void) setBasePath:(NSString*)basePath;
+(NSString*) getBasePath;
/**

 Get chat messages.
 
 @param start Starting point for results.
 @param reverse If true, will sort results newest first.
 @param count Number of results to fetch.
 */
-(NSNumber*) getWithCompletionBlock :(NSNumber*) start 
        reverse:(NSNumber*) reverse 
        count:(NSNumber*) count 
        completionHandler : (void (^)(NSArray* output, NSError* error))completionBlock;

/**

 Send a chat message.
 
 @param message 
 */
-(NSNumber*) sendWithCompletionBlock :(NSString*) message 
        completionHandler : (void (^)(SWGChat* output, NSError* error))completionBlock;

@end
