#import <Foundation/Foundation.h>
#import "Object.h"
#import "SWGOrder.h"



@interface SWGOrderApi: NSObject

-(void) addHeader:(NSString*)value forKey:(NSString*)key;
-(unsigned long) requestQueueSize;
+(SWGOrderApi*) apiWithHeader:(NSString*)headerValue key:(NSString*)key;
+(void) setBasePath:(NSString*)basePath;
+(NSString*) getBasePath;
/**

 Get your orders.
 To get open orders only, send {"open": true} in the filter param.
 @param symbol Instrument symbol. Send a series (e.g. XBT) to get data for the nearest contract in that series.
 @param filter Generic table filter. Send JSON key/value pairs, such as {&quot;key&quot;: &quot;value&quot;}.
 @param columns Array of column names to fetch. If omitted, will return all columns. Note that this method will always return item keys, even when not specified, so you may receive more columns that you expect.
 @param start Starting point for results.
 @param reverse If true, will sort results newest first.
 @param startTime Starting date filter for results.
 @param endTime Ending date filter for results.
 @param count Number of results to fetch.
 */
-(NSNumber*) getOrdersWithCompletionBlock :(NSString*) symbol 
        filter:(NSObject*) filter 
        columns:(NSArray*) columns 
        start:(NSNumber*) start 
        reverse:(NSNumber*) reverse 
        startTime:(SWGDate*) startTime 
        endTime:(SWGDate*) endTime 
        count:(NSNumber*) count 
        completionHandler: (void (^)(NSArray* output, NSError* error))completionBlock;

/**

 Create a new order.
 If you want to keep track of order IDs yourself, set a unique clOrdID per order. This ID will come back as a property on the order and any related executions executions (including on the WebSocket), and can be used to cancel the order.
 @param symbol Instrument symbol.
 @param quantity Quantity. Use positive numbers to buy, negative to sell.
 @param price Price to buy.
 @param ioc Set to true to place an immediateOrCancel order.
 @param clOrdID Optional Client Order ID to give this order. This ID will come back on any execution messages tied to this order.
 */
-(NSNumber*) newOrderWithCompletionBlock :(NSString*) symbol 
        quantity:(NSNumber*) quantity 
        price:(NSNumber*) price 
        ioc:(NSNumber*) ioc 
        clOrdID:(NSString*) clOrdID 
        completionHandler: (void (^)(SWGOrder* output, NSError* error))completionBlock;

/**

 Cancel order(s). Send multiple order IDs to cancel in bulk.
 Either an orderID or a clOrdID must be provided.
 @param orderID Order ID(s).
 @param clOrdID Client Order ID(s). See POST /order.
 @param text Optional cancellation annotation. e.g. 'Spread Exceeded'
 */
-(NSNumber*) cancelOrderWithCompletionBlock :(NSString*) orderID 
        clOrdID:(NSString*) clOrdID 
        text:(NSString*) text 
        completionHandler: (void (^)(NSArray* output, NSError* error))completionBlock;

/**

 Automatically cancel all your orders after a specified timeout.
 Useful as a dead-man's switch to ensure your orders are canceled in case of an outage. If called repeatedly, the existing offset will be canceled and a new one will be inserted in its place. <br><br>Example usage: call this route at 15s intervals with an offset of 60000 (60s). If this route is not called within 60 seconds, all your orders will be automatically canceled.<br><br>This is also available via <a href="https://www.bitmex.com/app/wsAPI#dead-man-s-switch-auto-cancel-">WebSocket</a>.
 @param timeout Timeout in ms. Set to 0 to cancel this timer. 
 */
-(NSNumber*) cancelAllAfterWithCompletionBlock :(NSNumber*) timeout 
        completionHandler: (void (^)(NSObject* output, NSError* error))completionBlock;

@end
