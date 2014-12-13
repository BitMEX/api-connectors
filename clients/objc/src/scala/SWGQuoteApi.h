#import <Foundation/Foundation.h>
#import "SWGError.h"
#import "SWGQuote.h"



@interface SWGQuoteApi: NSObject

-(void) addHeader:(NSString*)value forKey:(NSString*)key;
-(unsigned long) requestQueueSize;
+(SWGQuoteApi*) apiWithHeader:(NSString*)headerValue key:(NSString*)key;
+(void) setBasePath:(NSString*)basePath;
+(NSString*) getBasePath;
/**

 Get previous quotes bucketed by seconds.
 
 @param symbol Instrument name.
 @param startTime Start date. Expects ISO formatted date strings.
 @param endTime End Date. Expects ISO formatted date strings.
 @param count Number of buckets to fetch.
 @param binSize Time interval to bucket by. Available options: ['1m', '5m', '1h', '1d'].
 */
-(NSNumber*) getBucketedWithCompletionBlock :(NSString*) symbol 
        startTime:(SWGDate*) startTime 
        endTime:(SWGDate*) endTime 
        count:(NSNumber*) count 
        binSize:(NSString*) binSize 
        completionHandler: (void (^)(NSArray* output, NSError* error))completionBlock;

@end
