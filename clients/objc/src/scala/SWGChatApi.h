#import <Foundation/Foundation.h>
#import "SWGChat.h"



@interface SWGChatApi: NSObject

-(void) addHeader:(NSString*)value forKey:(NSString*)key;
-(unsigned long) requestQueueSize;
+(SWGChatApi*) apiWithHeader:(NSString*)headerValue key:(NSString*)key;
+(void) setBasePath:(NSString*)basePath;
+(NSString*) getBasePath;
/**

 Send a chat message.
 
 @param message 
 */
-(NSNumber*) chat_createWithCompletionBlock :(NSString*) message 
        completionHandler: (void (^)(SWGChat* output, NSError* error))completionBlock;

/**

 Get chat messages.
 
 @param count 
 */
-(NSNumber*) chat_findWithCompletionBlock :(NSNumber*) count 
        completionHandler: (void (^)(NSArray* output, NSError* error))completionBlock;

@end
