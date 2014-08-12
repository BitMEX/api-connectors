#import <Foundation/Foundation.h>
#import "SWGOrder.h"



@interface SWGOrderApi: NSObject

-(void) addHeader:(NSString*)value forKey:(NSString*)key;
-(unsigned long) requestQueueSize;
+(SWGOrderApi*) apiWithHeader:(NSString*)headerValue key:(NSString*)key;
+(void) setBasePath:(NSString*)basePath;
+(NSString*) getBasePath;
/**

 Create a new order.
 
 @param symbol Instrument name.
 @param quantity Quantity. Use positive numbers to buy, negative to sell.
 @param price Price to buy.
 @param ioc Set to true to place an immediateOrCancel order.
 */
-(NSNumber*) order_newOrderWithCompletionBlock :(NSString*) symbol 
        quantity:(NSNumber*) quantity 
        price:(NSNumber*) price 
        ioc:(NSNumber*) ioc 
        completionHandler: (void (^)(SWGOrder* output, NSError* error))completionBlock;

/**

 Cancel an order.
 
 @param orderID Order ID.
 */
-(NSNumber*) order_cancelOrderWithCompletionBlock :(NSString*) orderID 
        completionHandler: (void (^)(SWGOrder* output, NSError* error))completionBlock;

/**

 Get your recent orders.
 
 @param filter Table filter. Filter e.g. by symbol.
 @param columns Which columns to fetch.
 @param count Number of rows to fetch
 */
-(NSNumber*) order_myOrdersWithCompletionBlock :(NSObject*) filter 
        columns:(NSArray*) columns 
        count:(NSNumber*) count 
        completionHandler: (void (^)(NSArray* output, NSError* error))completionBlock;

/**

 Get your open orders.
 
 */
-(NSNumber*) order_myOpenOrdersWithCompletionBlock :(void (^)(NSArray* output, NSError* error))completionBlock;

@end
