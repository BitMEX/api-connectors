#import <Foundation/Foundation.h>
#import "SWGStatsHistory.h"
#import "SWGStats.h"



@interface SWGStatsApi: NSObject

-(void) addHeader:(NSString*)value forKey:(NSString*)key;
-(unsigned long) requestQueueSize;
+(SWGStatsApi*) apiWithHeader:(NSString*)headerValue key:(NSString*)key;
+(void) setBasePath:(NSString*)basePath;
+(NSString*) getBasePath;
/**

 Get exchange-wide and per-series turnover and volume statistics.
 
 */
-(NSNumber*) findWithCompletionBlock :(void (^)(NSArray* output, NSError* error))completionBlock;

/**

 Get historical exchange-wide and per-series turnover and volume statistics.
 
 */
-(NSNumber*) historyWithCompletionBlock :(void (^)(NSArray* output, NSError* error))completionBlock;

@end
