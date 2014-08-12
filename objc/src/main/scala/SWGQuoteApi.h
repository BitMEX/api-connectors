#import <Foundation/Foundation.h>
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
 @param startTime Start date.
 @param endTime End Date.
 @param count Number of buckets to fetch
 @param binSize Time interval to bucket by. Available options: ['30s', '5m', '1h', '1d'].
 */
-(NSNumber*) quote_getBucketedWithCompletionBlock :(NSString*) symbol 
        startTime:(SWGDate*) startTime 
        endTime:(SWGDate*) endTime 
        count:(NSNumber*) count 
        binSize:(NSString*) binSize 
        completionHandler: (void (^)(NSArray* output, NSError* error))completionBlock;

@end
