#import <Foundation/Foundation.h>
#import "SWGError.h"
#import "SWGTrade.h"
#import "SWGTradeBin.h"



@interface SWGTradeApi: NSObject

-(void) addHeader:(NSString*)value forKey:(NSString*)key;
-(unsigned long) requestQueueSize;
+(SWGTradeApi*) apiWithHeader:(NSString*)headerValue key:(NSString*)key;
+(void) setBasePath:(NSString*)basePath;
+(NSString*) getBasePath;
/**

 Get previous trades bucketed by seconds.
 
 @param symbol Instrument name.
 @param startTime Start date. Expects ISO formatted date strings.
 @param endTime End Date. Expects ISO formatted date strings.
 @param count Number of buckets to fetch.
 @param useMillisecondTime Return dates in milliseconds (GMT). Useful for charting.
 @param binSize Time interval to bucket by. Available options: ['30s', '1m', '5m', '1h', '1d'].
 */
-(NSNumber*) getBucketedWithCompletionBlock :(NSString*) symbol 
        startTime:(SWGDate*) startTime 
        endTime:(SWGDate*) endTime 
        count:(NSNumber*) count 
        useMillisecondTime:(NSNumber*) useMillisecondTime 
        binSize:(NSString*) binSize 
        completionHandler: (void (^)(NSArray* output, NSError* error))completionBlock;

/**

 Get trades between two dates.
 
 @param symbol Instrument name.
 @param startTime Start date.
 @param endTime End Date.
 */
-(NSNumber*) getByDateWithCompletionBlock :(NSString*) symbol 
        startTime:(SWGDate*) startTime 
        endTime:(SWGDate*) endTime 
        completionHandler: (void (^)(NSArray* output, NSError* error))completionBlock;

/**

 Get recent trades.
 
 @param symbol Instrument name.
 @param count Number of trades to fetch
 */
-(NSNumber*) getRecentWithCompletionBlock :(NSString*) symbol 
        count:(NSNumber*) count 
        completionHandler: (void (^)(NSArray* output, NSError* error))completionBlock;

@end
