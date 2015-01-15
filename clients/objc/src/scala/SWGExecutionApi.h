#import <Foundation/Foundation.h>
#import "SWGExecution.h"



@interface SWGExecutionApi: NSObject

-(void) addHeader:(NSString*)value forKey:(NSString*)key;
-(unsigned long) requestQueueSize;
+(SWGExecutionApi*) apiWithHeader:(NSString*)headerValue key:(NSString*)key;
+(void) setBasePath:(NSString*)basePath;
+(NSString*) getBasePath;
/**

 Get all raw executions for your account.
 This returns all raw transactions, which includes order opening and cancelation, and order status changes. It can be quite noisy. More focused information is available at /execution/tradeHistory. You may also use the `filter` param to target your query. Specify an array as a filter value, such as {"execType": ["Settlement", "Trade"]} to filter on multiple values.
 @param symbol Instrument symbol. Send a series (e.g. XBT) to get data for the nearest contract in that series.
 @param filter Generic table filter. Send JSON key/value pairs, such as {&quot;key&quot;: &quot;value&quot;}.
 @param columns Array of column names to fetch. If omitted, will return all columns. Note that this method will always return item keys, even when not specified, so you may receive more columns that you expect.
 @param start Starting point for results.
 @param reverse If true, will sort results newest first.
 @param startTime Starting date filter for results.
 @param endTime Ending date filter for results.
 @param count Number of results to fetch.
 */
-(NSNumber*) getWithCompletionBlock :(NSString*) symbol 
        filter:(NSObject*) filter 
        columns:(NSArray*) columns 
        start:(NSNumber*) start 
        reverse:(NSNumber*) reverse 
        startTime:(SWGDate*) startTime 
        endTime:(SWGDate*) endTime 
        count:(NSNumber*) count 
        completionHandler: (void (^)(NSArray* output, NSError* error))completionBlock;

/**

 Get all balance-affecting executions. This includes each trade, insurance charge, and settlement.
 
 @param symbol Instrument symbol. Send a series (e.g. XBT) to get data for the nearest contract in that series.
 @param filter Generic table filter. Send JSON key/value pairs, such as {&quot;key&quot;: &quot;value&quot;}.
 @param columns Array of column names to fetch. If omitted, will return all columns. Note that this method will always return item keys, even when not specified, so you may receive more columns that you expect.
 @param start Starting point for results.
 @param reverse If true, will sort results newest first.
 @param startTime Starting date filter for results.
 @param endTime Ending date filter for results.
 @param count Number of results to fetch.
 */
-(NSNumber*) getTradeHistoryWithCompletionBlock :(NSString*) symbol 
        filter:(NSObject*) filter 
        columns:(NSArray*) columns 
        start:(NSNumber*) start 
        reverse:(NSNumber*) reverse 
        startTime:(SWGDate*) startTime 
        endTime:(SWGDate*) endTime 
        count:(NSNumber*) count 
        completionHandler: (void (^)(NSArray* output, NSError* error))completionBlock;

@end
