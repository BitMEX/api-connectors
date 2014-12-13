#import <Foundation/Foundation.h>
#import "SWGError.h"
#import "Object.h"
#import "SWGOrder.h"



@interface SWGOrderApi: NSObject

-(void) addHeader:(NSString*)value forKey:(NSString*)key;
-(unsigned long) requestQueueSize;
+(SWGOrderApi*) apiWithHeader:(NSString*)headerValue key:(NSString*)key;
+(void) setBasePath:(NSString*)basePath;
+(NSString*) getBasePath;
/**

 Create a new order. [Deprecated]
 
 @param symbol Instrument name.
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

 Create a new order.
 If you want to keep track of order IDs yourself, set a unique clOrdID per order. This ID will come back as a property on the order and any related executions executions (including on the WebSocket), and can be used to cancel the order.
 @param symbol Instrument name.
 @param quantity Quantity. Use positive numbers to buy, negative to sell.
 @param price Price to buy.
 @param ioc Set to true to place an immediateOrCancel order.
 @param clOrdID Optional Client Order ID to give this order. This ID will come back on any execution messages tied to this order.
 */
-(NSNumber*) newOrder_SWGOrderApi_0WithCompletionBlock :(NSString*) symbol 
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

 Get your orders.
 
 @param filter Filter. For example, send {&quot;symbol&quot;: &quot;XBTF15&quot;, &quot;open&quot;: true}.
 @param columns Which columns to fetch. For example, send [&quot;columnName&quot;].
 @param count Number of rows to fetch.
 */
-(NSNumber*) getOrdersWithCompletionBlock :(NSObject*) filter 
        columns:(NSArray*) columns 
        count:(NSNumber*) count 
        completionHandler: (void (^)(NSArray* output, NSError* error))completionBlock;

/**

 Cancel order(s). Send multiple order IDs to cancel in bulk. [Deprecated]
 
 @param orderID Order ID(s).
 @param clOrdID Client Order ID(s). See POST /order.
 @param text Optional cancellation annotation. e.g. 'Spread Exceeded'
 */
-(NSNumber*) cancelOrder_SWGOrderApi_0WithCompletionBlock :(NSString*) orderID 
        clOrdID:(NSString*) clOrdID 
        text:(NSString*) text 
        completionHandler: (void (^)(NSArray* output, NSError* error))completionBlock;

/**

 Get your orders. [Deprecated, use GET /order]
 
 @param filter Filter. For example, send {&quot;symbol&quot;: &quot;XBTF15&quot;, &quot;open&quot;: true}.
 @param columns Which columns to fetch. For example, send [&quot;columnName&quot;].
 @param count Number of rows to fetch.
 */
-(NSNumber*) getOrders_SWGOrderApi_0WithCompletionBlock :(NSObject*) filter 
        columns:(NSArray*) columns 
        count:(NSNumber*) count 
        completionHandler: (void (^)(NSArray* output, NSError* error))completionBlock;

/**

 Get your open orders.
 
 @param filter Filter. For example, send {&quot;symbol&quot;: &quot;XBTF15&quot;, &quot;open&quot;: true}.
 @param columns Which columns to fetch. For example, send [&quot;columnName&quot;].
 @param count Number of rows to fetch.
 */
-(NSNumber*) getOrders_SWGOrderApi_1WithCompletionBlock :(NSObject*) filter 
        columns:(NSArray*) columns 
        count:(NSNumber*) count 
        completionHandler: (void (^)(NSArray* output, NSError* error))completionBlock;

/**

 Automatically cancel all your orders after a specified timeout.
 Useful as a dead-man's switch to ensure your orders are canceled in case of an outage. If called repeatedly, the existing offset will be canceled and a new one will be inserted in its place. <br><br>Example usage: call this route at 15s intervals with an offset of 60000 (60s). If this route is not called within 60 seconds, all your orders will be automatically canceled.<br><br>This is also available via <a href="https://www.bitmex.com/app/wsAPI#dead-man-s-switch-auto-cancel-">WebSocket</a>.
 @param timeout Timeout in ms. Set to 0 to cancel this timer. 
 */
-(NSNumber*) cancelAllAfterWithCompletionBlock :(NSNumber*) timeout 
        completionHandler: (void (^)(NSObject* output, NSError* error))completionBlock;

@end
