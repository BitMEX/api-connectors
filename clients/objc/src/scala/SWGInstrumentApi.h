#import <Foundation/Foundation.h>
#import "SWGInstrument.h"



@interface SWGInstrumentApi: NSObject

-(void) addHeader:(NSString*)value forKey:(NSString*)key;
-(unsigned long) requestQueueSize;
+(SWGInstrumentApi*) apiWithHeader:(NSString*)headerValue key:(NSString*)key;
+(void) setBasePath:(NSString*)basePath;
+(NSString*) getBasePath;
/**

 Get instruments.
 
 @param filter Table filter. For example, send {&quot;symbol&quot;: &quot;XBTF15&quot;}.
 */
-(NSNumber*) getWithCompletionBlock :(NSObject*) filter 
        completionHandler: (void (^)(NSArray* output, NSError* error))completionBlock;

/**

 Get all active instruments and instruments that have expired in <24hrs.
 
 */
-(NSNumber*) getActiveWithCompletionBlock :(void (^)(NSArray* output, NSError* error))completionBlock;

@end
