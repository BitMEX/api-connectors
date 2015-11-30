#import "SWGOrderApi.h"
#import "SWGQueryParamCollection.h"
#import "SWGError.h"
#import "SWGOrder.h"
#import "SWGInlineResponse200.h"
#import "SWGLiquidationOrder.h"


@interface SWGOrderApi ()
    @property (readwrite, nonatomic, strong) NSMutableDictionary *defaultHeaders;
@end

@implementation SWGOrderApi

static SWGOrderApi* singletonAPI = nil;

#pragma mark - Initialize methods

- (id) init {
    self = [super init];
    if (self) {
        SWGConfiguration *config = [SWGConfiguration sharedConfig];
        if (config.apiClient == nil) {
            config.apiClient = [[SWGApiClient alloc] init];
        }
        self.apiClient = config.apiClient;
        self.defaultHeaders = [NSMutableDictionary dictionary];
    }
    return self;
}

- (id) initWithApiClient:(SWGApiClient *)apiClient {
    self = [super init];
    if (self) {
        self.apiClient = apiClient;
        self.defaultHeaders = [NSMutableDictionary dictionary];
    }
    return self;
}

#pragma mark -

+(SWGOrderApi*) apiWithHeader:(NSString*)headerValue key:(NSString*)key {

    if (singletonAPI == nil) {
        singletonAPI = [[SWGOrderApi alloc] init];
        [singletonAPI addHeader:headerValue forKey:key];
    }
    return singletonAPI;
}

+(SWGOrderApi*) sharedAPI {

    if (singletonAPI == nil) {
        singletonAPI = [[SWGOrderApi alloc] init];
    }
    return singletonAPI;
}

-(void) addHeader:(NSString*)value forKey:(NSString*)key {
    [self.defaultHeaders setValue:value forKey:key];
}

-(void) setHeaderValue:(NSString*) value
           forKey:(NSString*)key {
    [self.defaultHeaders setValue:value forKey:key];
}

-(unsigned long) requestQueueSize {
    return [SWGApiClient requestQueueSize];
}

#pragma mark - Api Methods

///
/// Get your orders.
/// To get open orders only, send {\"open\": true} in the filter param.
///  @param symbol Instrument symbol. Send a bare series (e.g. XBU) to get data for the nearest expiring contract in that series.\n\nYou can also send a timeframe, e.g. 'XBU:monthly'. Timeframes are 'daily', 'weekly', 'monthly', 'quarterly', and 'biquarterly'.
///
///  @param filter Generic table filter. Send JSON key/value pairs, such as {\"key\": \"value\"}. You can key on individual fields, and do more advanced querying on timestamps. See <a href=\"http://localhost:2001/app/restAPI#timestamp-filters\">http://localhost:2001/app/restAPI#timestamp-filters</a> for more details.
///
///  @param columns Array of column names to fetch. If omitted, will return all columns.\n\nNote that this method will always return item keys, even when not specified, so you may receive more columns that you expect.
///
///  @param count Number of results to fetch.
///
///  @param start Starting point for results.
///
///  @param reverse If true, will sort results newest first.
///
///  @param startTime Starting date filter for results.
///
///  @param endTime Ending date filter for results.
///
///  @returns NSArray<SWGOrder>*
///
-(NSNumber*) orderGetOrdersWithCompletionBlock: (NSString*) symbol
         filter: (NSString*) filter
         columns: (NSString*) columns
         count: (NSNumber*) count
         start: (NSNumber*) start
         reverse: (NSNumber*) reverse
         startTime: (NSDate*) startTime
         endTime: (NSDate*) endTime
        
        completionHandler: (void (^)(NSArray<SWGOrder>* output, NSError* error))completionBlock { 
        

    

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/order"];

    // remove format in URL if needed
    if ([resourcePath rangeOfString:@".{format}"].location != NSNotFound) {
        [resourcePath replaceCharactersInRange: [resourcePath rangeOfString:@".{format}"] withString:@".json"];
    }

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if(symbol != nil) {
        
        queryParams[@"symbol"] = symbol;
    }
    if(filter != nil) {
        
        queryParams[@"filter"] = filter;
    }
    if(columns != nil) {
        
        queryParams[@"columns"] = columns;
    }
    if(count != nil) {
        
        queryParams[@"count"] = count;
    }
    if(start != nil) {
        
        queryParams[@"start"] = start;
    }
    if(reverse != nil) {
        
        queryParams[@"reverse"] = reverse;
    }
    if(startTime != nil) {
        
        queryParams[@"startTime"] = startTime;
    }
    if(endTime != nil) {
        
        queryParams[@"endTime"] = endTime;
    }
    
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.defaultHeaders];

    

    // HTTP header `Accept`
    headerParams[@"Accept"] = [SWGApiClient selectHeaderAccept:@[@"application/json", @"application/xml", @"text/xml", @"application/javascript", @"text/javascript"]];
    if ([headerParams[@"Accept"] length] == 0) {
        [headerParams removeObjectForKey:@"Accept"];
    }

    // response content type
    NSString *responseContentType;
    if ([headerParams objectForKey:@"Accept"]) {
        responseContentType = [headerParams[@"Accept"] componentsSeparatedByString:@", "][0];
    }
    else {
        responseContentType = @"";
    }

    // request content type
    NSString *requestContentType = [SWGApiClient selectHeaderContentType:@[@"application/json", @"application/x-www-form-urlencoded"]];

    // Authentication setting
    NSArray *authSettings = @[];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *files = [[NSMutableDictionary alloc] init];
    
    
    

    
    return [self.apiClient requestWithCompletionBlock: resourcePath
                                               method: @"GET"
                                           pathParams: pathParams
                                          queryParams: queryParams
                                           formParams: formParams
                                                files: files
                                                 body: bodyParam
                                         headerParams: headerParams
                                         authSettings: authSettings
                                   requestContentType: requestContentType
                                  responseContentType: responseContentType
                                         responseType: @"NSArray<SWGOrder>*"
                                      completionBlock: ^(id data, NSError *error) {
                  
                  completionBlock((NSArray<SWGOrder>*)data, error);
              }
          ];
}

///
/// Create a new order.
/// This endpoint is used for placing orders. Valid order types are 'Limit' and 'StopLimit'. If none is provided, BitMEX will assume a Limit Order.\n\nA note on API tools: if you want to keep track of order IDs yourself, set a unique clOrdID per order. This ID will come back as a property on the order and any related executions (including on the WebSocket), and can be used to get or cancel the order. Max length is 36 characters.\n\nTo generate a clOrdID, consider setting a prefix, and incrementing a counter or generating a UUID. Some UUIDs are longer than 36 characters, so use a url-safe base64 encoding. For example, the prefix 'bmex_mm_' and the UUID '7fbd6545-bb0c-11e4-a273-6003088a7c04' creates 'bmex_mm_f71lRbsMEeSic2ADCIp8BA'.\n\nSee the BitMEX <a href='https://github.com/BitMEX/market-maker/blob/22c75a2b6db63e20212813e9afdb845db1b09b2a/bitmex.py#L152'>Reference Market Maker</a> for an example of how to use and generate clOrdIDs.
///  @param symbol Instrument symbol.
///
///  @param quantity Quantity. Use positive numbers to buy, negative to sell.
///
///  @param price Order price.
///
///  @param timeInForce Time in force. Valid options: 'IOC' (Immediate-Or-Cancel), 'GTC' (Good-Till-Cancelled).
///
///  @param type Order type. Available: 'Limit', 'StopLimit'
///
///  @param stopPrice If order type is 'StopLimit', this is the trigger/stop price.
///
///  @param clOrdID Optional Client Order ID to give this order. This ID will come back on any execution messages tied to this order.
///
///  @returns SWGOrder*
///
-(NSNumber*) orderNewOrderWithCompletionBlock: (NSString*) symbol
         quantity: (NSNumber*) quantity
         price: (NSNumber*) price
         timeInForce: (NSString*) timeInForce
         type: (NSString*) type
         stopPrice: (NSNumber*) stopPrice
         clOrdID: (NSString*) clOrdID
        
        completionHandler: (void (^)(SWGOrder* output, NSError* error))completionBlock { 
        

    
    // verify the required parameter 'symbol' is set
    if (symbol == nil) {
        [NSException raise:@"Invalid parameter" format:@"Missing the required parameter `symbol` when calling `orderNewOrder`"];
    }
    
    // verify the required parameter 'quantity' is set
    if (quantity == nil) {
        [NSException raise:@"Invalid parameter" format:@"Missing the required parameter `quantity` when calling `orderNewOrder`"];
    }
    
    // verify the required parameter 'price' is set
    if (price == nil) {
        [NSException raise:@"Invalid parameter" format:@"Missing the required parameter `price` when calling `orderNewOrder`"];
    }
    

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/order"];

    // remove format in URL if needed
    if ([resourcePath rangeOfString:@".{format}"].location != NSNotFound) {
        [resourcePath replaceCharactersInRange: [resourcePath rangeOfString:@".{format}"] withString:@".json"];
    }

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.defaultHeaders];

    

    // HTTP header `Accept`
    headerParams[@"Accept"] = [SWGApiClient selectHeaderAccept:@[@"application/json", @"application/xml", @"text/xml", @"application/javascript", @"text/javascript"]];
    if ([headerParams[@"Accept"] length] == 0) {
        [headerParams removeObjectForKey:@"Accept"];
    }

    // response content type
    NSString *responseContentType;
    if ([headerParams objectForKey:@"Accept"]) {
        responseContentType = [headerParams[@"Accept"] componentsSeparatedByString:@", "][0];
    }
    else {
        responseContentType = @"";
    }

    // request content type
    NSString *requestContentType = [SWGApiClient selectHeaderContentType:@[@"application/json", @"application/x-www-form-urlencoded"]];

    // Authentication setting
    NSArray *authSettings = @[];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *files = [[NSMutableDictionary alloc] init];
    
    
    
    if (symbol) {
        formParams[@"symbol"] = symbol;
    }
    
    
    
    if (quantity) {
        formParams[@"quantity"] = quantity;
    }
    
    
    
    if (price) {
        formParams[@"price"] = price;
    }
    
    
    
    if (timeInForce) {
        formParams[@"timeInForce"] = timeInForce;
    }
    
    
    
    if (type) {
        formParams[@"type"] = type;
    }
    
    
    
    if (stopPrice) {
        formParams[@"stopPrice"] = stopPrice;
    }
    
    
    
    if (clOrdID) {
        formParams[@"clOrdID"] = clOrdID;
    }
    
    
    

    
    return [self.apiClient requestWithCompletionBlock: resourcePath
                                               method: @"POST"
                                           pathParams: pathParams
                                          queryParams: queryParams
                                           formParams: formParams
                                                files: files
                                                 body: bodyParam
                                         headerParams: headerParams
                                         authSettings: authSettings
                                   requestContentType: requestContentType
                                  responseContentType: responseContentType
                                         responseType: @"SWGOrder*"
                                      completionBlock: ^(id data, NSError *error) {
                  
                  completionBlock((SWGOrder*)data, error);
              }
          ];
}

///
/// Cancel order(s). Send multiple order IDs to cancel in bulk.
/// Either an orderID or a clOrdID must be provided.
///  @param orderID Order ID(s).
///
///  @param clOrdID Client Order ID(s). See POST /order.
///
///  @param text Optional cancellation annotation. e.g. 'Spread Exceeded'
///
///  @returns NSArray<SWGOrder>*
///
-(NSNumber*) orderCancelOrderWithCompletionBlock: (NSString*) orderID
         clOrdID: (NSString*) clOrdID
         text: (NSString*) text
        
        completionHandler: (void (^)(NSArray<SWGOrder>* output, NSError* error))completionBlock { 
        

    

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/order"];

    // remove format in URL if needed
    if ([resourcePath rangeOfString:@".{format}"].location != NSNotFound) {
        [resourcePath replaceCharactersInRange: [resourcePath rangeOfString:@".{format}"] withString:@".json"];
    }

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.defaultHeaders];

    

    // HTTP header `Accept`
    headerParams[@"Accept"] = [SWGApiClient selectHeaderAccept:@[@"application/json", @"application/xml", @"text/xml", @"application/javascript", @"text/javascript"]];
    if ([headerParams[@"Accept"] length] == 0) {
        [headerParams removeObjectForKey:@"Accept"];
    }

    // response content type
    NSString *responseContentType;
    if ([headerParams objectForKey:@"Accept"]) {
        responseContentType = [headerParams[@"Accept"] componentsSeparatedByString:@", "][0];
    }
    else {
        responseContentType = @"";
    }

    // request content type
    NSString *requestContentType = [SWGApiClient selectHeaderContentType:@[@"application/json", @"application/x-www-form-urlencoded"]];

    // Authentication setting
    NSArray *authSettings = @[];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *files = [[NSMutableDictionary alloc] init];
    
    
    
    if (orderID) {
        formParams[@"orderID"] = orderID;
    }
    
    
    
    if (clOrdID) {
        formParams[@"clOrdID"] = clOrdID;
    }
    
    
    
    if (text) {
        formParams[@"text"] = text;
    }
    
    
    

    
    return [self.apiClient requestWithCompletionBlock: resourcePath
                                               method: @"DELETE"
                                           pathParams: pathParams
                                          queryParams: queryParams
                                           formParams: formParams
                                                files: files
                                                 body: bodyParam
                                         headerParams: headerParams
                                         authSettings: authSettings
                                   requestContentType: requestContentType
                                  responseContentType: responseContentType
                                         responseType: @"NSArray<SWGOrder>*"
                                      completionBlock: ^(id data, NSError *error) {
                  
                  completionBlock((NSArray<SWGOrder>*)data, error);
              }
          ];
}

///
/// Cancels all of your orders.
/// 
///  @param symbol Optional symbol. If provided, only cancels orders for that symbol.
///
///  @param filter Optional filter for cancellation. Use to only cancel some orders, e.g. `{\"side\": \"Buy\"}`.
///
///  @param text Optional cancellation annotation. e.g. 'Spread Exceeded'
///
///  @returns SWGInlineResponse200*
///
-(NSNumber*) orderCancelAllWithCompletionBlock: (NSString*) symbol
         filter: (NSString*) filter
         text: (NSString*) text
        
        completionHandler: (void (^)(SWGInlineResponse200* output, NSError* error))completionBlock { 
        

    

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/order/all"];

    // remove format in URL if needed
    if ([resourcePath rangeOfString:@".{format}"].location != NSNotFound) {
        [resourcePath replaceCharactersInRange: [resourcePath rangeOfString:@".{format}"] withString:@".json"];
    }

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.defaultHeaders];

    

    // HTTP header `Accept`
    headerParams[@"Accept"] = [SWGApiClient selectHeaderAccept:@[@"application/json", @"application/xml", @"text/xml", @"application/javascript", @"text/javascript"]];
    if ([headerParams[@"Accept"] length] == 0) {
        [headerParams removeObjectForKey:@"Accept"];
    }

    // response content type
    NSString *responseContentType;
    if ([headerParams objectForKey:@"Accept"]) {
        responseContentType = [headerParams[@"Accept"] componentsSeparatedByString:@", "][0];
    }
    else {
        responseContentType = @"";
    }

    // request content type
    NSString *requestContentType = [SWGApiClient selectHeaderContentType:@[@"application/json", @"application/x-www-form-urlencoded"]];

    // Authentication setting
    NSArray *authSettings = @[];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *files = [[NSMutableDictionary alloc] init];
    
    
    
    if (symbol) {
        formParams[@"symbol"] = symbol;
    }
    
    
    
    if (filter) {
        formParams[@"filter"] = filter;
    }
    
    
    
    if (text) {
        formParams[@"text"] = text;
    }
    
    
    

    
    return [self.apiClient requestWithCompletionBlock: resourcePath
                                               method: @"DELETE"
                                           pathParams: pathParams
                                          queryParams: queryParams
                                           formParams: formParams
                                                files: files
                                                 body: bodyParam
                                         headerParams: headerParams
                                         authSettings: authSettings
                                   requestContentType: requestContentType
                                  responseContentType: responseContentType
                                         responseType: @"SWGInlineResponse200*"
                                      completionBlock: ^(id data, NSError *error) {
                  
                  completionBlock((SWGInlineResponse200*)data, error);
              }
          ];
}

///
/// Automatically cancel all your orders after a specified timeout.
/// Useful as a dead-man's switch to ensure your orders are canceled in case of an outage. If called repeatedly, the existing offset will be canceled and a new one will be inserted in its place. <br><br>Example usage: call this route at 15s intervals with an offset of 60000 (60s). If this route is not called within 60 seconds, all your orders will be automatically canceled.<br><br>This is also available via <a href=\"https://www.bitmex.com/app/wsAPI#dead-man-s-switch-auto-cancel-\">WebSocket</a>.
///  @param timeout Timeout in ms. Set to 0 to cancel this timer.
///
///  @returns SWGInlineResponse200*
///
-(NSNumber*) orderCancelAllAfterWithCompletionBlock: (NSNumber*) timeout
        
        completionHandler: (void (^)(SWGInlineResponse200* output, NSError* error))completionBlock { 
        

    
    // verify the required parameter 'timeout' is set
    if (timeout == nil) {
        [NSException raise:@"Invalid parameter" format:@"Missing the required parameter `timeout` when calling `orderCancelAllAfter`"];
    }
    

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/order/cancelAllAfter"];

    // remove format in URL if needed
    if ([resourcePath rangeOfString:@".{format}"].location != NSNotFound) {
        [resourcePath replaceCharactersInRange: [resourcePath rangeOfString:@".{format}"] withString:@".json"];
    }

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.defaultHeaders];

    

    // HTTP header `Accept`
    headerParams[@"Accept"] = [SWGApiClient selectHeaderAccept:@[@"application/json", @"application/xml", @"text/xml", @"application/javascript", @"text/javascript"]];
    if ([headerParams[@"Accept"] length] == 0) {
        [headerParams removeObjectForKey:@"Accept"];
    }

    // response content type
    NSString *responseContentType;
    if ([headerParams objectForKey:@"Accept"]) {
        responseContentType = [headerParams[@"Accept"] componentsSeparatedByString:@", "][0];
    }
    else {
        responseContentType = @"";
    }

    // request content type
    NSString *requestContentType = [SWGApiClient selectHeaderContentType:@[@"application/json", @"application/x-www-form-urlencoded"]];

    // Authentication setting
    NSArray *authSettings = @[];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *files = [[NSMutableDictionary alloc] init];
    
    
    
    if (timeout) {
        formParams[@"timeout"] = timeout;
    }
    
    
    

    
    return [self.apiClient requestWithCompletionBlock: resourcePath
                                               method: @"POST"
                                           pathParams: pathParams
                                          queryParams: queryParams
                                           formParams: formParams
                                                files: files
                                                 body: bodyParam
                                         headerParams: headerParams
                                         authSettings: authSettings
                                   requestContentType: requestContentType
                                  responseContentType: responseContentType
                                         responseType: @"SWGInlineResponse200*"
                                      completionBlock: ^(id data, NSError *error) {
                  
                  completionBlock((SWGInlineResponse200*)data, error);
              }
          ];
}

///
/// Close a position with a market order.
/// If no price is specified, a market order will be submitted to close the entirety of your position. Be careful with market orders as you may not be filled at a favorable price.
///  @param symbol Symbol of position to close.
///
///  @param price Optional limit price.
///
///  @returns SWGOrder*
///
-(NSNumber*) orderClosePositionWithCompletionBlock: (NSString*) symbol
         price: (NSNumber*) price
        
        completionHandler: (void (^)(SWGOrder* output, NSError* error))completionBlock { 
        

    
    // verify the required parameter 'symbol' is set
    if (symbol == nil) {
        [NSException raise:@"Invalid parameter" format:@"Missing the required parameter `symbol` when calling `orderClosePosition`"];
    }
    

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/order/closePosition"];

    // remove format in URL if needed
    if ([resourcePath rangeOfString:@".{format}"].location != NSNotFound) {
        [resourcePath replaceCharactersInRange: [resourcePath rangeOfString:@".{format}"] withString:@".json"];
    }

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.defaultHeaders];

    

    // HTTP header `Accept`
    headerParams[@"Accept"] = [SWGApiClient selectHeaderAccept:@[@"application/json", @"application/xml", @"text/xml", @"application/javascript", @"text/javascript"]];
    if ([headerParams[@"Accept"] length] == 0) {
        [headerParams removeObjectForKey:@"Accept"];
    }

    // response content type
    NSString *responseContentType;
    if ([headerParams objectForKey:@"Accept"]) {
        responseContentType = [headerParams[@"Accept"] componentsSeparatedByString:@", "][0];
    }
    else {
        responseContentType = @"";
    }

    // request content type
    NSString *requestContentType = [SWGApiClient selectHeaderContentType:@[@"application/json", @"application/x-www-form-urlencoded"]];

    // Authentication setting
    NSArray *authSettings = @[];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *files = [[NSMutableDictionary alloc] init];
    
    
    
    if (symbol) {
        formParams[@"symbol"] = symbol;
    }
    
    
    
    if (price) {
        formParams[@"price"] = price;
    }
    
    
    

    
    return [self.apiClient requestWithCompletionBlock: resourcePath
                                               method: @"POST"
                                           pathParams: pathParams
                                          queryParams: queryParams
                                           formParams: formParams
                                                files: files
                                                 body: bodyParam
                                         headerParams: headerParams
                                         authSettings: authSettings
                                   requestContentType: requestContentType
                                  responseContentType: responseContentType
                                         responseType: @"SWGOrder*"
                                      completionBlock: ^(id data, NSError *error) {
                  
                  completionBlock((SWGOrder*)data, error);
              }
          ];
}

///
/// Get open liquidation orders.
/// 
///  @param filter Filter. For example, send {\"symbol\": \"XBT24H\"}.
///
///  @returns NSArray<SWGLiquidationOrder>*
///
-(NSNumber*) orderGetCloseOutOrdersWithCompletionBlock: (NSString*) filter
        
        completionHandler: (void (^)(NSArray<SWGLiquidationOrder>* output, NSError* error))completionBlock { 
        

    

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/order/liquidations"];

    // remove format in URL if needed
    if ([resourcePath rangeOfString:@".{format}"].location != NSNotFound) {
        [resourcePath replaceCharactersInRange: [resourcePath rangeOfString:@".{format}"] withString:@".json"];
    }

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if(filter != nil) {
        
        queryParams[@"filter"] = filter;
    }
    
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.defaultHeaders];

    

    // HTTP header `Accept`
    headerParams[@"Accept"] = [SWGApiClient selectHeaderAccept:@[@"application/json", @"application/xml", @"text/xml", @"application/javascript", @"text/javascript"]];
    if ([headerParams[@"Accept"] length] == 0) {
        [headerParams removeObjectForKey:@"Accept"];
    }

    // response content type
    NSString *responseContentType;
    if ([headerParams objectForKey:@"Accept"]) {
        responseContentType = [headerParams[@"Accept"] componentsSeparatedByString:@", "][0];
    }
    else {
        responseContentType = @"";
    }

    // request content type
    NSString *requestContentType = [SWGApiClient selectHeaderContentType:@[@"application/json", @"application/x-www-form-urlencoded"]];

    // Authentication setting
    NSArray *authSettings = @[];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *files = [[NSMutableDictionary alloc] init];
    
    
    

    
    return [self.apiClient requestWithCompletionBlock: resourcePath
                                               method: @"GET"
                                           pathParams: pathParams
                                          queryParams: queryParams
                                           formParams: formParams
                                                files: files
                                                 body: bodyParam
                                         headerParams: headerParams
                                         authSettings: authSettings
                                   requestContentType: requestContentType
                                  responseContentType: responseContentType
                                         responseType: @"NSArray<SWGLiquidationOrder>*"
                                      completionBlock: ^(id data, NSError *error) {
                  
                  completionBlock((NSArray<SWGLiquidationOrder>*)data, error);
              }
          ];
}



@end
