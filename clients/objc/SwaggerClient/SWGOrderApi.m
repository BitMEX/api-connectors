#import "SWGOrderApi.h"
#import "SWGQueryParamCollection.h"
#import "SWGError.h"
#import "SWGOrder.h"
#import "SWGInlineResponse2001.h"


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
/// To get open orders only, send {\"open\": true} in the filter param.\n\nSee <a href=\"http://www.onixs.biz/fix-dictionary/5.0.SP2/msgType_D_68.html\">the FIX Spec</a> for explanations of these fields.
///  @param symbol Instrument symbol. Send a bare series (e.g. XBU) to get data for the nearest expiring contract in that series.\n\nYou can also send a timeframe, e.g. `XBU:monthly`. Timeframes are `daily`, `weekly`, `monthly`, `quarterly`, and `biquarterly`.
///
///  @param filter Generic table filter. Send JSON key/value pairs, such as `{\"key\": \"value\"}`. You can key on individual fields, and do more advanced querying on timestamps. See the [Timestamp Docs](https://www.bitmex.com/app/restAPI#timestamp-filters) for more details.
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
/// Amend the quantity or price of an open order.
/// <p>Send an <code>orderID</code> or <code>clOrdID</code> to identify the order you wish to amend.</p>\n<p>Both order quantity and price can be amended. Only one <code>qty</code> field can be used to amend.</p>\n<p>Use the <code>leavesQty</code> field to specify how much of the order you wish to remain open. This can be useful\nif you want to adjust your position&#39;s delta by a certain amount, regardless of how much of the order has\nalready filled.</p>\n<p>Use the <code>simpleOrderQty</code> and <code>simpleLeavesQty</code> fields to specify order size in Bitcoin, rather than contracts.\nThese fields will round up to the nearest contract.</p>\n<p>Like order placement, amending can be done in bulk. Simply send a request to <code>PUT /api/v1/order/bulk</code> with\na JSON body of the shape: <code>{&quot;orders&quot;: [{...}, {...}]}</code>, each object containing the fields used in this endpoint.</p>
///  @param orderID Order ID
///
///  @param clOrdID Client Order ID. See POST /order.
///
///  @param simpleOrderQty Optional order quantity in units of the underlying instrument (i.e. Bitcoin).
///
///  @param orderQty Optional order quantity in units of the instrument (i.e. contracts).
///
///  @param simpleLeavesQty Optional leaves quantity in units of the underlying instrument (i.e. Bitcoin). Useful for amending partially filled orders.
///
///  @param leavesQty Optional leaves quantity in units of the instrument (i.e. contracts). Useful for amending partially filled orders.
///
///  @param price Optional limit price for 'Limit', 'StopLimit', and 'LimitIfTouched' orders.
///
///  @param stopPx Optional trigger price for 'Stop', 'StopLimit', 'MarketIfTouched', and 'LimitIfTouched' orders. Use a price below the current price for stop-sell orders and buy-if-touched orders.
///
///  @param pegOffsetValue Optional trailing offset from the current price for 'Stop', 'StopLimit', 'MarketIfTouched', and 'LimitIfTouched' orders; use a negative offset for stop-sell orders and buy-if-touched orders. Optional offset from the peg price for 'Pegged' orders.
///
///  @param text Optional amend annotation. e.g. 'Adjust skew'.
///
///  @returns SWGOrder*
///
-(NSNumber*) orderAmendWithCompletionBlock: (NSString*) orderID
         clOrdID: (NSString*) clOrdID
         simpleOrderQty: (NSNumber*) simpleOrderQty
         orderQty: (NSNumber*) orderQty
         simpleLeavesQty: (NSNumber*) simpleLeavesQty
         leavesQty: (NSNumber*) leavesQty
         price: (NSNumber*) price
         stopPx: (NSNumber*) stopPx
         pegOffsetValue: (NSNumber*) pegOffsetValue
         text: (NSString*) text
        
        completionHandler: (void (^)(SWGOrder* output, NSError* error))completionBlock { 
        

    

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
    
    
    
    if (simpleOrderQty) {
        formParams[@"simpleOrderQty"] = simpleOrderQty;
    }
    
    
    
    if (orderQty) {
        formParams[@"orderQty"] = orderQty;
    }
    
    
    
    if (simpleLeavesQty) {
        formParams[@"simpleLeavesQty"] = simpleLeavesQty;
    }
    
    
    
    if (leavesQty) {
        formParams[@"leavesQty"] = leavesQty;
    }
    
    
    
    if (price) {
        formParams[@"price"] = price;
    }
    
    
    
    if (stopPx) {
        formParams[@"stopPx"] = stopPx;
    }
    
    
    
    if (pegOffsetValue) {
        formParams[@"pegOffsetValue"] = pegOffsetValue;
    }
    
    
    
    if (text) {
        formParams[@"text"] = text;
    }
    
    
    

    
    return [self.apiClient requestWithCompletionBlock: resourcePath
                                               method: @"PUT"
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
/// Create a new order.
/// This endpoint is used for placing orders. Valid order types are Market, Limit, Stop, StopLimit, MarketIfTouched, LimitIfTouched, MarketWithLeftOverAsLimit, and Pegged.\n\nIf no order type is provided, BitMEX will assume 'Limit'.\nBe very careful with 'Market' and 'Stop' orders as you may be filled at an unfavourable price.\n\nYou can submit bulk orders by POSTing an array of orders to `/api/v1/order/bulk`. Send a JSON payload\nwith the shape: `{\"orders\": [{...}, {...}]}`, with each inner object containing the same fields that would be\nsent to this endpoint.\n\nA note on API tools: if you want to keep track of order IDs yourself, set a unique clOrdID per order.\nThis clOrdID will come back as a property on the order and any related executions (including on the WebSocket),\nand can be used to get or cancel the order. Max length is 36 characters.\n\nTo generate a clOrdID, consider setting a prefix, and incrementing a counter or generating a UUID.\nSome UUIDs are longer than 36 characters, so use a url-safe base64 encoding. For example, the prefix `'bmex_mm_'`\nand the UUID `'7fbd6545-bb0c-11e4-a273-6003088a7c04'` creates `'bmex_mm_f71lRbsMEeSic2ADCIp8BA'`.\n\nSee the [BitMEX Reference Market Maker](https://github.com/BitMEX/market-maker/blob/22c75a2b6db63e20212813e9afdb845db1b09b2a/bitmex.py#L152)\nfor an example of how to use and generate clOrdIDs.
///  @param symbol Instrument symbol. e.g. 'XBT24H'.
///
///  @param side Order side. Valid options: Buy, Sell. Defaults to 'Buy' unless `orderQty` or `simpleOrderQty` is negative.
///
///  @param simpleOrderQty Order quantity in units of the underlying instrument (i.e. Bitcoin).
///
///  @param quantity Deprecated: use `orderQty`.
///
///  @param orderQty Order quantity in units of the instrument (i.e. contracts).
///
///  @param price Optional limit price for 'Limit', 'StopLimit', and 'LimitIfTouched' orders.
///
///  @param displayQty Optional quantity to display in the book. Use 0 for a hidden order.
///
///  @param stopPrice Deprecated: use `stopPx`.
///
///  @param stopPx Optional trigger price for 'Stop', 'StopLimit', 'MarketIfTouched', and 'LimitIfTouched' orders. Use a price below the current price for stop-sell orders and buy-if-touched orders. Use `execInst` of 'MarkPrice' or 'LastPrice' to define the current price used for triggering.
///
///  @param clOrdID Optional Client Order ID. This clOrdID will come back on the order and any related executions.
///
///  @param clOrdLinkID Optional Client Order Link ID for contingent orders.
///
///  @param pegOffsetValue Optional trailing offset from the current price for 'Stop', 'StopLimit', 'MarketIfTouched', and 'LimitIfTouched' orders; use a negative offset for stop-sell orders and buy-if-touched orders. Optional offset from the peg price for 'Pegged' orders.
///
///  @param pegPriceType Optional peg price type. Valid options: LastPeg, MidPricePeg, MarketPeg, PrimaryPeg, TrailingStopPeg, TrailingStopPeg.
///
///  @param type Deprecated: use `ordType`.
///
///  @param ordType Order type. Valid options: Market, Limit, Stop, StopLimit, MarketIfTouched, LimitIfTouched, MarketWithLeftOverAsLimit, Pegged. Defaults to 'Limit' when `price` is specified. Defaults to 'Stop' when `stopPx` is specified. Defaults to 'StopLimit' when `price` and `stopPx` are specified.
///
///  @param timeInForce Time in force. Valid options: Day, GoodTillCancel, ImmediateOrCancel, FillOrKill. Defaults to 'GoodTillCancel' for 'Limit', 'StopLimit', 'LimitIfTouched', and 'MarketWithLeftOverAsLimit' orders.
///
///  @param execInst Optional execution instructions. Valid options: ParticipateDoNotInitiate, AllOrNone, MarkPrice, LastPrice, Close, ReduceOnly. 'AllOrNone' instruction requires `displayQty` to be 0. 'MarkPrice' or 'LastPrice' instruction valid for 'Stop', 'StopLimit', 'MarketIfTouched', and 'LimitIfTouched' orders.
///
///  @param contingencyType Optional contingency type for use with `clOrdLinkID`. Valid options: OneCancelsTheOther, OneTriggersTheOther, OneUpdatesTheOtherAbsolute, OneUpdatesTheOtherProportional.
///
///  @param text Optional order annotation. e.g. 'Take profit'.
///
///  @returns SWGOrder*
///
-(NSNumber*) orderNewWithCompletionBlock: (NSString*) symbol
         side: (NSString*) side
         simpleOrderQty: (NSNumber*) simpleOrderQty
         quantity: (NSNumber*) quantity
         orderQty: (NSNumber*) orderQty
         price: (NSNumber*) price
         displayQty: (NSNumber*) displayQty
         stopPrice: (NSNumber*) stopPrice
         stopPx: (NSNumber*) stopPx
         clOrdID: (NSString*) clOrdID
         clOrdLinkID: (NSString*) clOrdLinkID
         pegOffsetValue: (NSNumber*) pegOffsetValue
         pegPriceType: (NSString*) pegPriceType
         type: (NSString*) type
         ordType: (NSString*) ordType
         timeInForce: (NSString*) timeInForce
         execInst: (NSString*) execInst
         contingencyType: (NSString*) contingencyType
         text: (NSString*) text
        
        completionHandler: (void (^)(SWGOrder* output, NSError* error))completionBlock { 
        

    
    // verify the required parameter 'symbol' is set
    if (symbol == nil) {
        [NSException raise:@"Invalid parameter" format:@"Missing the required parameter `symbol` when calling `orderNew`"];
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
    
    
    
    if (side) {
        formParams[@"side"] = side;
    }
    
    
    
    if (simpleOrderQty) {
        formParams[@"simpleOrderQty"] = simpleOrderQty;
    }
    
    
    
    if (quantity) {
        formParams[@"quantity"] = quantity;
    }
    
    
    
    if (orderQty) {
        formParams[@"orderQty"] = orderQty;
    }
    
    
    
    if (price) {
        formParams[@"price"] = price;
    }
    
    
    
    if (displayQty) {
        formParams[@"displayQty"] = displayQty;
    }
    
    
    
    if (stopPrice) {
        formParams[@"stopPrice"] = stopPrice;
    }
    
    
    
    if (stopPx) {
        formParams[@"stopPx"] = stopPx;
    }
    
    
    
    if (clOrdID) {
        formParams[@"clOrdID"] = clOrdID;
    }
    
    
    
    if (clOrdLinkID) {
        formParams[@"clOrdLinkID"] = clOrdLinkID;
    }
    
    
    
    if (pegOffsetValue) {
        formParams[@"pegOffsetValue"] = pegOffsetValue;
    }
    
    
    
    if (pegPriceType) {
        formParams[@"pegPriceType"] = pegPriceType;
    }
    
    
    
    if (type) {
        formParams[@"type"] = type;
    }
    
    
    
    if (ordType) {
        formParams[@"ordType"] = ordType;
    }
    
    
    
    if (timeInForce) {
        formParams[@"timeInForce"] = timeInForce;
    }
    
    
    
    if (execInst) {
        formParams[@"execInst"] = execInst;
    }
    
    
    
    if (contingencyType) {
        formParams[@"contingencyType"] = contingencyType;
    }
    
    
    
    if (text) {
        formParams[@"text"] = text;
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
///  @param text Optional cancellation annotation. e.g. 'Spread Exceeded'.
///
///  @returns NSArray<SWGOrder>*
///
-(NSNumber*) orderCancelWithCompletionBlock: (NSString*) orderID
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
///  @returns SWGInlineResponse2001*
///
-(NSNumber*) orderCancelAllWithCompletionBlock: (NSString*) symbol
         filter: (NSString*) filter
         text: (NSString*) text
        
        completionHandler: (void (^)(SWGInlineResponse2001* output, NSError* error))completionBlock { 
        

    

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
                                         responseType: @"SWGInlineResponse2001*"
                                      completionBlock: ^(id data, NSError *error) {
                  
                  completionBlock((SWGInlineResponse2001*)data, error);
              }
          ];
}

///
/// Amend multiple orders.
/// Similar to POST /amend, but with multiple orders. `application/json` only. Ratelimited at 50%.
///  @param orders An array of orders.
///
///  @returns NSArray<SWGOrder>*
///
-(NSNumber*) orderAmendBulkWithCompletionBlock: (NSString*) orders
        
        completionHandler: (void (^)(NSArray<SWGOrder>* output, NSError* error))completionBlock { 
        

    

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/order/bulk"];

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
    
    
    
    if (orders) {
        formParams[@"orders"] = orders;
    }
    
    
    

    
    return [self.apiClient requestWithCompletionBlock: resourcePath
                                               method: @"PUT"
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
/// Create multiple new orders.
/// This endpoint is used for placing bulk orders. Valid order types are Market, Limit, Stop, StopLimit, MarketIfTouched, LimitIfTouched, MarketWithLeftOverAsLimit, and Pegged.\n\nEach individual order object in the array should have the same properties as an individual POST /order call.\n\nThis endpoint is much faster for getting many orders into the book at once. Because it reduces load on BitMEX\nsystems, this endpoint is ratelimited at `ceil(0.5 * orders)`. Submitting 10 orders via a bulk order call\nwill only count as 5 requests.\n\nFor now, only `application/json` is supported on this endpoint.
///  @param orders An array of orders.
///
///  @returns NSArray<SWGOrder>*
///
-(NSNumber*) orderNewBulkWithCompletionBlock: (NSString*) orders
        
        completionHandler: (void (^)(NSArray<SWGOrder>* output, NSError* error))completionBlock { 
        

    

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/order/bulk"];

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
    
    
    
    if (orders) {
        formParams[@"orders"] = orders;
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
                                         responseType: @"NSArray<SWGOrder>*"
                                      completionBlock: ^(id data, NSError *error) {
                  
                  completionBlock((NSArray<SWGOrder>*)data, error);
              }
          ];
}

///
/// Automatically cancel all your orders after a specified timeout.
/// Useful as a dead-man's switch to ensure your orders are canceled in case of an outage.\nIf called repeatedly, the existing offset will be canceled and a new one will be inserted in its place.\n\nExample usage: call this route at 15s intervals with an offset of 60000 (60s).\nIf this route is not called within 60 seconds, all your orders will be automatically canceled.\n\nThis is also available via [WebSocket](https://www.bitmex.com/app/wsAPI#dead-man-s-switch-auto-cancel-).
///  @param timeout Timeout in ms. Set to 0 to cancel this timer.
///
///  @returns SWGInlineResponse2001*
///
-(NSNumber*) orderCancelAllAfterWithCompletionBlock: (NSNumber*) timeout
        
        completionHandler: (void (^)(SWGInlineResponse2001* output, NSError* error))completionBlock { 
        

    
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
                                         responseType: @"SWGInlineResponse2001*"
                                      completionBlock: ^(id data, NSError *error) {
                  
                  completionBlock((SWGInlineResponse2001*)data, error);
              }
          ];
}

///
/// Close a position. [Deprecated, use POST /order with execInst: 'Close']
/// If no `price` is specified, a market order will be submitted to close the whole of your position. + This will also close all other open orders in this symbol.
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



@end
