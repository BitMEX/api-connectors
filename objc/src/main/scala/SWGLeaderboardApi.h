#import <Foundation/Foundation.h>
#import "SWGLeaderboard.h"



@interface SWGLeaderboardApi: NSObject

-(void) addHeader:(NSString*)value forKey:(NSString*)key;
-(unsigned long) requestQueueSize;
+(SWGLeaderboardApi*) apiWithHeader:(NSString*)headerValue key:(NSString*)key;
+(void) setBasePath:(NSString*)basePath;
+(NSString*) getBasePath;
/**

 Get current leaderboard.
 
 */
-(NSNumber*) leaderboard_getOrderBookWithCompletionBlock :(void (^)(NSArray* output, NSError* error))completionBlock;

@end
