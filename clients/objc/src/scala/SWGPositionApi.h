#import <Foundation/Foundation.h>
#import "SWGPosition.h"



@interface SWGPositionApi: NSObject

-(void) addHeader:(NSString*)value forKey:(NSString*)key;
-(unsigned long) requestQueueSize;
+(SWGPositionApi*) apiWithHeader:(NSString*)headerValue key:(NSString*)key;
+(void) setBasePath:(NSString*)basePath;
+(NSString*) getBasePath;
/**

 Get your positions.
 
 */
-(NSNumber*) position_findWithCompletionBlock :(void (^)(NSArray* output, NSError* error))completionBlock;

@end
