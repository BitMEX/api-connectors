#import <Foundation/Foundation.h>
#import "SWGError.h"
#import "SWGExecution.h"



@interface SWGExecutionApi: NSObject

-(void) addHeader:(NSString*)value forKey:(NSString*)key;
-(unsigned long) requestQueueSize;
+(SWGExecutionApi*) apiWithHeader:(NSString*)headerValue key:(NSString*)key;
+(void) setBasePath:(NSString*)basePath;
+(NSString*) getBasePath;
/**

 Get your executions. This includes each trade and insurance charge.
 
 @param filter Table filter. For example, send {&quot;symbol&quot;: &quot;XBTF15&quot;}.
 @param count Number of executions to fetch
 */
-(NSNumber*) getMyExecutionsWithCompletionBlock :(NSObject*) filter 
        count:(NSNumber*) count 
        completionHandler: (void (^)(NSArray* output, NSError* error))completionBlock;

@end
