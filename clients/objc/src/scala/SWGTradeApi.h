#import <Foundation/Foundation.h>
#import "SWGTradeBin.h"
#import "SWGTrade.h"
#import "SWGAny.h"



@interface SWGTradeApi: NSObject

-(void) addHeader:(NSString*)value forKey:(NSString*)key;
-(unsigned long) requestQueueSize;
+(SWGTradeApi*) apiWithHeader:(NSString*)headerValue key:(NSString*)key;
+(void) setBasePath:(NSString*)basePath;
+(NSString*) getBasePath;
/**

 Get previous trades bucketed by seconds.
 
 @param symbol Instrument name.
 @param startTime Start date.
 @param endTime End Date.
 @param count Number of buckets to fetch
 @param useMillisecondTime Return dates in milliseconds (GMT). Useful for charting.
 @param binSize Time interval to bucket by. Available options: ['30s', '5m', '1h', '1d'].
 */
-(NSNumber*) trade_getBucketedWithCompletionBlock :(NSString*) symbol 
        startTime:(SWGDate*) startTime 
        endTime:(SWGDate*) endTime 
        count:(NSNumber*) count 
        useMillisecondTime:(NSNumber*) useMillisecondTime 
        binSize:(NSString*) binSize 
        completionHandler: (void (^)(NSArray* output, NSError* error))completionBlock;

/**

 Get trades within two dates.
 
 @param symbol Instrument name.
 @param starttime Start date.
 @param endtime End Date.
 */
-(NSNumber*) trade_getByDateWithCompletionBlock :(NSString*) symbol 
        starttime:(SWGDate*) starttime 
        endtime:(SWGDate*) endtime 
        completionHandler: (void (^)(NSArray* output, NSError* error))completionBlock;

/**

 Get recent trades.
 
 @param symbol Instrument name.
 @param count Number of trades to fetch
 */
-(NSNumber*) trade_getRecentWithCompletionBlock :(NSString*) symbol 
        count:(NSNumber*) count 
        completionHandler: (void (^)(NSArray* output, NSError* error))completionBlock;

@end
