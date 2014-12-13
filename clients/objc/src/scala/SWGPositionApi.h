#import <Foundation/Foundation.h>
#import "SWGError.h"
#import "SWGPosition.h"



@interface SWGPositionApi: NSObject

-(void) addHeader:(NSString*)value forKey:(NSString*)key;
-(unsigned long) requestQueueSize;
+(SWGPositionApi*) apiWithHeader:(NSString*)headerValue key:(NSString*)key;
+(void) setBasePath:(NSString*)basePath;
+(NSString*) getBasePath;
/**

 Get your positions.
 
 @param filter Filter. For example, send {&quot;symbol&quot;: &quot;XBTF15&quot;, &quot;open&quot;: true}.
 @param columns Which columns to fetch. For example, send [&quot;columnName&quot;].
 @param count Number of rows to fetch.
 */
-(NSNumber*) findWithCompletionBlock :(NSObject*) filter 
        columns:(NSArray*) columns 
        count:(NSNumber*) count 
        completionHandler: (void (^)(NSArray* output, NSError* error))completionBlock;

@end
