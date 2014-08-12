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
 
 @param symbol 
 */
-(NSNumber*) orderBook_getOrderBookWithCompletionBlock :(SWGSymbol*) symbol 
        completionHandler: (void (^)(NSArray* output, NSError* error))completionBlock;

@end
