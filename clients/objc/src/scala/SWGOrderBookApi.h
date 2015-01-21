#import <Foundation/Foundation.h>
#import "SWGOrderBook.h"



@interface SWGOrderBookApi: NSObject

-(void) addHeader:(NSString*)value forKey:(NSString*)key;
-(unsigned long) requestQueueSize;
+(SWGOrderBookApi*) apiWithHeader:(NSString*)headerValue key:(NSString*)key;
+(void) setBasePath:(NSString*)basePath;
+(NSString*) getBasePath;
/**

 Get current orderbook.
 
 @param symbol Instrument symbol. Send a series (e.g. XBT) to get data for the nearest contract in that series.
 @param depth Orderbook depth.
 */
-(NSNumber*) getOrderBookWithCompletionBlock :(NSString*) symbol 
        depth:(NSNumber*) depth 
        completionHandler : (void (^)(NSArray* output, NSError* error))completionBlock;

@end
