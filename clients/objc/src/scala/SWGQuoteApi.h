#import <Foundation/Foundation.h>
#import "SWGQuote.h"



@interface SWGQuoteApi: NSObject

-(void) addHeader:(NSString*)value forKey:(NSString*)key;
-(unsigned long) requestQueueSize;
+(SWGQuoteApi*) apiWithHeader:(NSString*)headerValue key:(NSString*)key;
+(void) setBasePath:(NSString*)basePath;
+(NSString*) getBasePath;
/**

 Get previous quotes in time buckets.
 
 @param symbol Instrument symbol. Send a series (e.g. XBT) to get data for the nearest contract in that series.
 @param filter Generic table filter. Send JSON key/value pairs, such as {&quot;key&quot;: &quot;value&quot;}.
 @param columns Array of column names to fetch. If omitted, will return all columns. Note that this method will always return item keys, even when not specified, so you may receive more columns that you expect.
 @param start Starting point for results.
 @param reverse If true, will sort results newest first.
 @param startTime Starting date filter for results.
 @param endTime Ending date filter for results.
 @param binSize Time interval to bucket by. Available options: ['30s', '1m', '5m', '1h', '1d'].
 @param count Number of results to fetch.
 */
-(NSNumber*) getBucketedWithCompletionBlock :(NSString*) symbol 
        filter:(NSObject*) filter 
        columns:(NSArray*) columns 
        start:(NSNumber*) start 
        reverse:(NSNumber*) reverse 
        startTime:(SWGDate*) startTime 
        endTime:(SWGDate*) endTime 
        binSize:(NSString*) binSize 
        count:(NSNumber*) count 
        completionHandler : (void (^)(NSArray* output, NSError* error))completionBlock;

@end
