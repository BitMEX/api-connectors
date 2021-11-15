#import "SWGOrderApi.h"
#import "SWGQueryParamCollection.h"
#import "SWGApiClient.h"
#import "SWGError.h"
#import "SWGOrder.h"


@interface SWGOrderApi ()

@property (nonatomic, strong, readwrite) NSMutableDictionary *mutableDefaultHeaders;

@end

@implementation SWGOrderApi

NSString* kSWGOrderApiErrorDomain = @"SWGOrderApiErrorDomain";
NSInteger kSWGOrderApiMissingParamErrorCode = 234513;

@synthesize apiClient = _apiClient;

#pragma mark - Initialize methods

- (instancetype) init {
    return [self initWithApiClient:[SWGApiClient sharedClient]];
}


-(instancetype) initWithApiClient:(SWGApiClient *)apiClient {
    self = [super init];
    if (self) {
        _apiClient = apiClient;
        _mutableDefaultHeaders = [NSMutableDictionary dictionary];
    }
    return self;
}

#pragma mark -

-(NSString*) defaultHeaderForKey:(NSString*)key {
    return self.mutableDefaultHeaders[key];
}

-(void) setDefaultHeaderValue:(NSString*) value forKey:(NSString*)key {
    [self.mutableDefaultHeaders setValue:value forKey:key];
}

-(NSDictionary *)defaultHeaders {
    return self.mutableDefaultHeaders;
}

#pragma mark - Api Methods

///
/// Amend the quantity or price of an open order.
/// Send an `orderID` or `origClOrdID` to identify the order you wish to amend.  Both order quantity and price can be amended. Only one `qty` field can be used to amend.  Use the `leavesQty` field to specify how much of the order you wish to remain open. This can be useful if you want to adjust your position's delta by a certain amount, regardless of how much of the order has already filled.  > A `leavesQty` can be used to make a \"Filled\" order live again, if it is received within 60 seconds of the fill.  Like order placement, amending can be done in bulk. Simply send a request to `PUT /api/v1/order/bulk` with a JSON body of the shape: `{\"orders\": [{...}, {...}]}`, each object containing the fields used in this endpoint. 
///  @param orderID Order ID (optional)
///
///  @param origClOrdID Client Order ID. See POST /order. (optional)
///
///  @param clOrdID Optional new Client Order ID, requires `origClOrdID`. (optional)
///
///  @param simpleOrderQty Deprecated: simple orders are not supported after 2018/10/26 (optional)
///
///  @param orderQty Optional order quantity in units of the instrument (i.e. contracts). (optional)
///
///  @param simpleLeavesQty Deprecated: simple orders are not supported after 2018/10/26 (optional)
///
///  @param leavesQty Optional leaves quantity in units of the instrument (i.e. contracts). Useful for amending partially filled orders. (optional)
///
///  @param price Optional limit price for 'Limit', 'StopLimit', and 'LimitIfTouched' orders. (optional)
///
///  @param stopPx Optional trigger price for 'Stop', 'StopLimit', 'MarketIfTouched', and 'LimitIfTouched' orders. Use a price below the current price for stop-sell orders and buy-if-touched orders. (optional)
///
///  @param pegOffsetValue Optional trailing offset from the current price for 'Stop', 'StopLimit', 'MarketIfTouched', and 'LimitIfTouched' orders; use a negative offset for stop-sell orders and buy-if-touched orders. Optional offset from the peg price for 'Pegged' orders. (optional)
///
///  @param text Optional amend annotation. e.g. 'Adjust skew'. (optional)
///
///  @returns SWGOrder*
///
-(NSURLSessionTask*) orderAmendWithOrderID: (NSString*) orderID
    origClOrdID: (NSString*) origClOrdID
    clOrdID: (NSString*) clOrdID
    simpleOrderQty: (NSNumber*) simpleOrderQty
    orderQty: (NSNumber*) orderQty
    simpleLeavesQty: (NSNumber*) simpleLeavesQty
    leavesQty: (NSNumber*) leavesQty
    price: (NSNumber*) price
    stopPx: (NSNumber*) stopPx
    pegOffsetValue: (NSNumber*) pegOffsetValue
    text: (NSString*) text
    completionHandler: (void (^)(SWGOrder* output, NSError* error)) handler {
    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/order"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.apiClient.configuration.defaultHeaders];
    [headerParams addEntriesFromDictionary:self.defaultHeaders];
    // HTTP header `Accept`
    NSString *acceptHeader = [self.apiClient.sanitizer selectHeaderAccept:@[@"application/json", @"application/xml", @"text/xml", @"application/javascript", @"text/javascript"]];
    if(acceptHeader.length > 0) {
        headerParams[@"Accept"] = acceptHeader;
    }

    // response content type
    NSString *responseContentType = [[acceptHeader componentsSeparatedByString:@", "] firstObject] ?: @"";

    // request content type
    NSString *requestContentType = [self.apiClient.sanitizer selectHeaderContentType:@[@"application/json", @"application/x-www-form-urlencoded"]];

    // Authentication setting
    NSArray *authSettings = @[@"apiExpires", @"apiKey", @"apiSignature"];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];
    if (orderID) {
        formParams[@"orderID"] = orderID;
    }
    if (origClOrdID) {
        formParams[@"origClOrdID"] = origClOrdID;
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

    return [self.apiClient requestWithPath: resourcePath
                                    method: @"PUT"
                                pathParams: pathParams
                               queryParams: queryParams
                                formParams: formParams
                                     files: localVarFiles
                                      body: bodyParam
                              headerParams: headerParams
                              authSettings: authSettings
                        requestContentType: requestContentType
                       responseContentType: responseContentType
                              responseType: @"SWGOrder*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((SWGOrder*)data, error);
                                }
                            }];
}

///
/// Cancel order(s). Send multiple order IDs to cancel in bulk.
/// Either an orderID or a clOrdID must be provided.
///  @param orderID Order ID(s). (optional)
///
///  @param clOrdID Client Order ID(s). See POST /order. (optional)
///
///  @param text Optional cancellation annotation. e.g. 'Spread Exceeded'. (optional)
///
///  @returns NSArray<SWGOrder>*
///
-(NSURLSessionTask*) orderCancelWithOrderID: (NSString*) orderID
    clOrdID: (NSString*) clOrdID
    text: (NSString*) text
    completionHandler: (void (^)(NSArray<SWGOrder>* output, NSError* error)) handler {
    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/order"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.apiClient.configuration.defaultHeaders];
    [headerParams addEntriesFromDictionary:self.defaultHeaders];
    // HTTP header `Accept`
    NSString *acceptHeader = [self.apiClient.sanitizer selectHeaderAccept:@[@"application/json", @"application/xml", @"text/xml", @"application/javascript", @"text/javascript"]];
    if(acceptHeader.length > 0) {
        headerParams[@"Accept"] = acceptHeader;
    }

    // response content type
    NSString *responseContentType = [[acceptHeader componentsSeparatedByString:@", "] firstObject] ?: @"";

    // request content type
    NSString *requestContentType = [self.apiClient.sanitizer selectHeaderContentType:@[@"application/json", @"application/x-www-form-urlencoded"]];

    // Authentication setting
    NSArray *authSettings = @[@"apiExpires", @"apiKey", @"apiSignature"];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];
    if (orderID) {
        formParams[@"orderID"] = orderID;
    }
    if (clOrdID) {
        formParams[@"clOrdID"] = clOrdID;
    }
    if (text) {
        formParams[@"text"] = text;
    }

    return [self.apiClient requestWithPath: resourcePath
                                    method: @"DELETE"
                                pathParams: pathParams
                               queryParams: queryParams
                                formParams: formParams
                                     files: localVarFiles
                                      body: bodyParam
                              headerParams: headerParams
                              authSettings: authSettings
                        requestContentType: requestContentType
                       responseContentType: responseContentType
                              responseType: @"NSArray<SWGOrder>*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((NSArray<SWGOrder>*)data, error);
                                }
                            }];
}

///
/// Cancels all of your orders.
/// 
///  @param symbol Optional symbol. If provided, only cancels orders for that symbol. (optional)
///
///  @param filter Optional filter for cancellation. Use to only cancel some orders, e.g. `{\"side\": \"Buy\"}`. (optional)
///
///  @param text Optional cancellation annotation. e.g. 'Spread Exceeded' (optional)
///
///  @returns NSArray<SWGOrder>*
///
-(NSURLSessionTask*) orderCancelAllWithSymbol: (NSString*) symbol
    filter: (NSString*) filter
    text: (NSString*) text
    completionHandler: (void (^)(NSArray<SWGOrder>* output, NSError* error)) handler {
    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/order/all"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.apiClient.configuration.defaultHeaders];
    [headerParams addEntriesFromDictionary:self.defaultHeaders];
    // HTTP header `Accept`
    NSString *acceptHeader = [self.apiClient.sanitizer selectHeaderAccept:@[@"application/json", @"application/xml", @"text/xml", @"application/javascript", @"text/javascript"]];
    if(acceptHeader.length > 0) {
        headerParams[@"Accept"] = acceptHeader;
    }

    // response content type
    NSString *responseContentType = [[acceptHeader componentsSeparatedByString:@", "] firstObject] ?: @"";

    // request content type
    NSString *requestContentType = [self.apiClient.sanitizer selectHeaderContentType:@[@"application/json", @"application/x-www-form-urlencoded"]];

    // Authentication setting
    NSArray *authSettings = @[@"apiExpires", @"apiKey", @"apiSignature"];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];
    if (symbol) {
        formParams[@"symbol"] = symbol;
    }
    if (filter) {
        formParams[@"filter"] = filter;
    }
    if (text) {
        formParams[@"text"] = text;
    }

    return [self.apiClient requestWithPath: resourcePath
                                    method: @"DELETE"
                                pathParams: pathParams
                               queryParams: queryParams
                                formParams: formParams
                                     files: localVarFiles
                                      body: bodyParam
                              headerParams: headerParams
                              authSettings: authSettings
                        requestContentType: requestContentType
                       responseContentType: responseContentType
                              responseType: @"NSArray<SWGOrder>*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((NSArray<SWGOrder>*)data, error);
                                }
                            }];
}

///
/// Automatically cancel all your orders after a specified timeout.
/// Useful as a dead-man's switch to ensure your orders are canceled in case of an outage. If called repeatedly, the existing offset will be canceled and a new one will be inserted in its place.  Example usage: call this route at 15s intervals with an offset of 60000 (60s). If this route is not called within 60 seconds, all your orders will be automatically canceled.  This is also available via [WebSocket](https://www.bitmex.com/app/wsAPI#Dead-Mans-Switch-Auto-Cancel). 
///  @param timeout Timeout in ms. Set to 0 to cancel this timer.  
///
///  @returns NSObject*
///
-(NSURLSessionTask*) orderCancelAllAfterWithTimeout: (NSNumber*) timeout
    completionHandler: (void (^)(NSObject* output, NSError* error)) handler {
    // verify the required parameter 'timeout' is set
    if (timeout == nil) {
        NSParameterAssert(timeout);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"timeout"] };
            NSError* error = [NSError errorWithDomain:kSWGOrderApiErrorDomain code:kSWGOrderApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/order/cancelAllAfter"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.apiClient.configuration.defaultHeaders];
    [headerParams addEntriesFromDictionary:self.defaultHeaders];
    // HTTP header `Accept`
    NSString *acceptHeader = [self.apiClient.sanitizer selectHeaderAccept:@[@"application/json", @"application/xml", @"text/xml", @"application/javascript", @"text/javascript"]];
    if(acceptHeader.length > 0) {
        headerParams[@"Accept"] = acceptHeader;
    }

    // response content type
    NSString *responseContentType = [[acceptHeader componentsSeparatedByString:@", "] firstObject] ?: @"";

    // request content type
    NSString *requestContentType = [self.apiClient.sanitizer selectHeaderContentType:@[@"application/json", @"application/x-www-form-urlencoded"]];

    // Authentication setting
    NSArray *authSettings = @[@"apiExpires", @"apiKey", @"apiSignature"];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];
    if (timeout) {
        formParams[@"timeout"] = timeout;
    }

    return [self.apiClient requestWithPath: resourcePath
                                    method: @"POST"
                                pathParams: pathParams
                               queryParams: queryParams
                                formParams: formParams
                                     files: localVarFiles
                                      body: bodyParam
                              headerParams: headerParams
                              authSettings: authSettings
                        requestContentType: requestContentType
                       responseContentType: responseContentType
                              responseType: @"NSObject*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((NSObject*)data, error);
                                }
                            }];
}

///
/// Close a position. [Deprecated, use POST /order with execInst: 'Close']
/// If no `price` is specified, a market order will be submitted to close the whole of your position. This will also close all other open orders in this symbol.
///  @param symbol Symbol of position to close. 
///
///  @param price Optional limit price. (optional)
///
///  @returns SWGOrder*
///
-(NSURLSessionTask*) orderClosePositionWithSymbol: (NSString*) symbol
    price: (NSNumber*) price
    completionHandler: (void (^)(SWGOrder* output, NSError* error)) handler {
    // verify the required parameter 'symbol' is set
    if (symbol == nil) {
        NSParameterAssert(symbol);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"symbol"] };
            NSError* error = [NSError errorWithDomain:kSWGOrderApiErrorDomain code:kSWGOrderApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/order/closePosition"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.apiClient.configuration.defaultHeaders];
    [headerParams addEntriesFromDictionary:self.defaultHeaders];
    // HTTP header `Accept`
    NSString *acceptHeader = [self.apiClient.sanitizer selectHeaderAccept:@[@"application/json", @"application/xml", @"text/xml", @"application/javascript", @"text/javascript"]];
    if(acceptHeader.length > 0) {
        headerParams[@"Accept"] = acceptHeader;
    }

    // response content type
    NSString *responseContentType = [[acceptHeader componentsSeparatedByString:@", "] firstObject] ?: @"";

    // request content type
    NSString *requestContentType = [self.apiClient.sanitizer selectHeaderContentType:@[@"application/json", @"application/x-www-form-urlencoded"]];

    // Authentication setting
    NSArray *authSettings = @[@"apiExpires", @"apiKey", @"apiSignature"];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];
    if (symbol) {
        formParams[@"symbol"] = symbol;
    }
    if (price) {
        formParams[@"price"] = price;
    }

    return [self.apiClient requestWithPath: resourcePath
                                    method: @"POST"
                                pathParams: pathParams
                               queryParams: queryParams
                                formParams: formParams
                                     files: localVarFiles
                                      body: bodyParam
                              headerParams: headerParams
                              authSettings: authSettings
                        requestContentType: requestContentType
                       responseContentType: responseContentType
                              responseType: @"SWGOrder*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((SWGOrder*)data, error);
                                }
                            }];
}

///
/// Get your orders.
/// To get open orders only, send {\"open\": true} in the filter param.  See <a href=\"http://www.onixs.biz/fix-dictionary/5.0.SP2/msgType_D_68.html\">the FIX Spec</a> for explanations of these fields.
///  @param symbol Instrument symbol. Send a bare series (e.g. XBT) to get data for the nearest expiring contract in that series.  You can also send a timeframe, e.g. `XBT:quarterly`. Timeframes are `nearest`, `daily`, `weekly`, `monthly`, `quarterly`, `biquarterly`, and `perpetual`.  Symbols are case-insensitive. (optional)
///
///  @param filter Generic table filter. Send JSON key/value pairs, such as `{\"key\": \"value\"}`. You can key on individual fields, and do more advanced querying on timestamps. See the [Timestamp Docs](https://www.bitmex.com/app/restAPI#Timestamp-Filters) for more details. (optional)
///
///  @param columns Array of column names to fetch. If omitted, will return all columns.  Note that this method will always return item keys, even when not specified, so you may receive more columns that you expect. (optional)
///
///  @param count Number of results to fetch. Must be a positive integer. (optional, default to 100)
///
///  @param start Starting point for results. (optional, default to 0)
///
///  @param reverse If true, will sort results newest first. (optional, default to false)
///
///  @param startTime Starting date filter for results. (optional)
///
///  @param endTime Ending date filter for results. (optional)
///
///  @returns NSArray<SWGOrder>*
///
-(NSURLSessionTask*) orderGetOrdersWithSymbol: (NSString*) symbol
    filter: (NSString*) filter
    columns: (NSString*) columns
    count: (NSNumber*) count
    start: (NSNumber*) start
    reverse: (NSNumber*) reverse
    startTime: (NSDate*) startTime
    endTime: (NSDate*) endTime
    completionHandler: (void (^)(NSArray<SWGOrder>* output, NSError* error)) handler {
    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/order"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (symbol != nil) {
        queryParams[@"symbol"] = symbol;
    }
    if (filter != nil) {
        queryParams[@"filter"] = filter;
    }
    if (columns != nil) {
        queryParams[@"columns"] = columns;
    }
    if (count != nil) {
        queryParams[@"count"] = count;
    }
    if (start != nil) {
        queryParams[@"start"] = start;
    }
    if (reverse != nil) {
        queryParams[@"reverse"] = [reverse isEqual:@(YES)] ? @"true" : @"false";
    }
    if (startTime != nil) {
        queryParams[@"startTime"] = startTime;
    }
    if (endTime != nil) {
        queryParams[@"endTime"] = endTime;
    }
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.apiClient.configuration.defaultHeaders];
    [headerParams addEntriesFromDictionary:self.defaultHeaders];
    // HTTP header `Accept`
    NSString *acceptHeader = [self.apiClient.sanitizer selectHeaderAccept:@[@"application/json", @"application/xml", @"text/xml", @"application/javascript", @"text/javascript"]];
    if(acceptHeader.length > 0) {
        headerParams[@"Accept"] = acceptHeader;
    }

    // response content type
    NSString *responseContentType = [[acceptHeader componentsSeparatedByString:@", "] firstObject] ?: @"";

    // request content type
    NSString *requestContentType = [self.apiClient.sanitizer selectHeaderContentType:@[@"application/json", @"application/x-www-form-urlencoded"]];

    // Authentication setting
    NSArray *authSettings = @[@"apiExpires", @"apiKey", @"apiSignature"];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];

    return [self.apiClient requestWithPath: resourcePath
                                    method: @"GET"
                                pathParams: pathParams
                               queryParams: queryParams
                                formParams: formParams
                                     files: localVarFiles
                                      body: bodyParam
                              headerParams: headerParams
                              authSettings: authSettings
                        requestContentType: requestContentType
                       responseContentType: responseContentType
                              responseType: @"NSArray<SWGOrder>*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((NSArray<SWGOrder>*)data, error);
                                }
                            }];
}

///
/// Create a new order.
/// ## Placing Orders  This endpoint is used for placing orders. See individual fields below for more details on their use.  #### Order Types  All orders require a `symbol`. All other fields are optional except when otherwise specified.  These are the valid `ordType`s:  - **Limit**: The default order type. Specify an `orderQty` and `price`. - **Market**: A traditional Market order. A Market order will execute until filled or your bankruptcy price is reached, at   which point it will cancel. - **Stop**: A Stop Market order. Specify an `orderQty` and `stopPx`. When the `stopPx` is reached, the order will be entered   into the book.   - On sell orders, the order will trigger if the triggering price is lower than the `stopPx`. On buys, higher.   - Note: Stop orders do not consume margin until triggered. Be sure that the required margin is available in your     account so that it may trigger fully.   - `Close` Stops don't require an `orderQty`. See Execution Instructions below. - **StopLimit**: Like a Stop Market, but enters a Limit order instead of a Market order. Specify an `orderQty`, `stopPx`,   and `price`. - **MarketIfTouched**: Similar to a Stop, but triggers are done in the opposite direction. Useful for Take Profit orders. - **LimitIfTouched**: As above; use for Take Profit Limit orders. - **Pegged**: Pegged orders allow users to submit a limit price relative to the current market price. Specify a   `pegPriceType`, and `pegOffsetValue`.   - Pegged orders **must** have an `execInst` of `Fixed`. This means the limit price is set at the time the order     is accepted and does not change as the reference price changes.   - `PrimaryPeg`: Price is set relative to near touch price.   - `MarketPeg`: Price is set relative to far touch price.   - A `pegPriceType` submitted with no `ordType` is treated as a `Pegged` order.  #### Execution Instructions  The following `execInst`s are supported. If using multiple, separate with a comma (e.g. `LastPrice,Close`).  - **ParticipateDoNotInitiate**: Also known as a Post-Only order. If this order would have executed on placement, it will cancel instead.   This is intended to protect you from the far touch moving towards you while the order is in transit.   It is not intended for speculating on the far touch moving away after submission - we consider such behaviour abusive and monitor for it. - **MarkPrice, LastPrice, IndexPrice**: Used by stop and if-touched orders to determine the triggering price.   Use only one. By default, `MarkPrice` is used. Also used for Pegged orders to define the value of `LastPeg`. - **ReduceOnly**: A `ReduceOnly` order can only reduce your position, not increase it. If you have a `ReduceOnly`   limit order that rests in the order book while the position is reduced by other orders, then its order quantity will   be amended down or canceled. If there are multiple `ReduceOnly` orders the least aggressive will be amended first. - **Close**: `Close` implies `ReduceOnly`. A `Close` order will cancel other active limit orders with the same side   and symbol if the open quantity exceeds the current position. This is useful for stops: by canceling these orders, a   `Close` Stop is ensured to have the margin required to execute, and can only execute up to the full size of your   position. If `orderQty` is not specified, a `Close` order has an `orderQty` equal to your current position's size.   - Note that a `Close` order without an `orderQty` requires a `side`, so that BitMEX knows if it should trigger     above or below the `stopPx`. - **LastWithinMark**: Used by stop orders with `LastPrice` to allow stop triggers only when:   - For Sell Stop Market / Stop Limit Order     - Last Price &lt= Stop Price     - Last Price &gt= Mark Price × (1 - 5%)   - For Buy Stop Market / Stop Limit Order:     - Last Price &gt= Stop Price     - Last Price &lt= Mark Price × (1 + 5%) - **Fixed**: Pegged orders **must** have an `execInst` of `Fixed`. This means the limit price is set at the time   the order is accepted and does not change as the reference price changes.  #### Pegged Orders  Pegged orders allow users to submit a limit price relative to the current market price. The limit price is set once when the order is submitted and does not change with the reference price. This order type is not intended for speculating on the far touch moving away after submission - we consider such behaviour abusive and monitor for it.  Pegged orders have an `ordType` of `Pegged`, and an `execInst` of `Fixed`.  A `pegPriceType` and `pegOffsetValue` must also be submitted:  - `PrimaryPeg` - price is set relative to the **near touch** price - `MarketPeg` - price is set relative to the **far touch** price  #### Trailing Stop Pegged Orders  Use `pegPriceType` of `TrailingStopPeg` to create Trailing Stops.  The price is set at submission and updates once per second if the underlying price (last/mark/index) has moved by more than 0.1%. `stopPx` then moves as the market moves away from the peg, and freezes as the market moves toward it.  Use `pegOffsetValue` to set the `stopPx` of your order. The peg is set to the triggering price specified in the `execInst` (default `MarkPrice`). Use a negative offset for stop-sell and buy-if-touched orders.  Requires `ordType`: `Stop`, `StopLimit`, `MarketIfTouched`, `LimitIfTouched`.  #### Linked Orders  [Linked Orders are deprecated as of 2018/11/10](https://blog.bitmex.com/api_announcement/deprecation-of-contingent-orders/)  #### Trailing Stops  You may use `pegPriceType` of `'TrailingStopPeg'` to create Trailing Stops. The pegged `stopPx` will move as the market moves away from the peg, and freeze as the market moves toward it.  To use, combine with `pegOffsetValue` to set the `stopPx` of your order. The peg is set to the triggering price specified in the `execInst` (default `'MarkPrice'`). Use a negative offset for stop-sell and buy-if-touched orders.  Requires `ordType`: `'Stop', 'StopLimit', 'MarketIfTouched', 'LimitIfTouched'`.  #### Simple Quantities  [Simple Quantities are deprecated as of 2018/10/26](https://blog.bitmex.com/api_announcement/deprecation-of-simpleorderqty-functionality/)  #### Rate Limits  See the [Bulk Order Documentation](#!/Order/Order_newBulk) if you need to place multiple orders at the same time. Bulk orders require fewer risk checks in the trading engine and thus are ratelimited at **1/10** the normal rate.  You can also improve your reactivity to market movements while staying under your ratelimit by using the [Amend](#!/Order/Order_amend) and [Amend Bulk](#!/Order/Order_amendBulk) endpoints. This allows you to stay in the market and avoids the cancel/replace cycle.  #### Tracking Your Orders  If you want to keep track of order IDs yourself, set a unique `clOrdID` per order. This `clOrdID` will come back as a property on the order and any related executions (including on the WebSocket), and can be used to get or cancel the order. Max length is 36 characters.  You can also change the `clOrdID` by amending an order, supplying an `origClOrdID`, and your desired new ID as the `clOrdID` param, like so:  ``` # Amends an order's leavesQty, and updates its clOrdID to \"def-456\" PUT /api/v1/order {\"origClOrdID\": \"abc-123\", \"clOrdID\": \"def-456\", \"leavesQty\": 1000} ``` 
///  @param symbol Instrument symbol. e.g. 'XBTUSD'. 
///
///  @param side Order side. Valid options: Buy, Sell. Defaults to 'Buy' unless `orderQty` is negative. (optional)
///
///  @param simpleOrderQty Deprecated: simple orders are not supported after 2018/10/26 (optional)
///
///  @param orderQty Order quantity in units of the instrument (i.e. contracts). (optional)
///
///  @param price Optional limit price for 'Limit', 'StopLimit', and 'LimitIfTouched' orders. (optional)
///
///  @param displayQty Optional quantity to display in the book. Use 0 for a fully hidden order. (optional)
///
///  @param stopPx Optional trigger price for 'Stop', 'StopLimit', 'MarketIfTouched', and 'LimitIfTouched' orders. Use a price below the current price for stop-sell orders and buy-if-touched orders. Use `execInst` of 'MarkPrice' or 'LastPrice' to define the current price used for triggering. (optional)
///
///  @param clOrdID Optional Client Order ID. This clOrdID will come back on the order and any related executions. (optional)
///
///  @param clOrdLinkID Deprecated: linked orders are not supported after 2018/11/10. (optional)
///
///  @param pegOffsetValue Optional trailing offset from the current price for 'Stop', 'StopLimit', 'MarketIfTouched', and 'LimitIfTouched' orders; use a negative offset for stop-sell orders and buy-if-touched orders. Optional offset from the peg price for 'Pegged' orders. (optional)
///
///  @param pegPriceType Optional peg price type. Valid options: MarketPeg, PrimaryPeg, TrailingStopPeg. (optional)
///
///  @param ordType Order type. Valid options: Market, Limit, Stop, StopLimit, MarketIfTouched, LimitIfTouched, Pegged. Defaults to 'Limit' when `price` is specified. Defaults to 'Stop' when `stopPx` is specified. Defaults to 'StopLimit' when `price` and `stopPx` are specified. (optional, default to Limit)
///
///  @param timeInForce Time in force. Valid options: Day, GoodTillCancel, ImmediateOrCancel, FillOrKill. Defaults to 'GoodTillCancel' for 'Limit', 'StopLimit', and 'LimitIfTouched' orders. (optional)
///
///  @param execInst Optional execution instructions. Valid options: ParticipateDoNotInitiate, AllOrNone, MarkPrice, IndexPrice, LastPrice, Close, ReduceOnly, Fixed, LastWithinMark. 'AllOrNone' instruction requires `displayQty` to be 0. 'MarkPrice', 'IndexPrice' or 'LastPrice' instruction valid for 'Stop', 'StopLimit', 'MarketIfTouched', and 'LimitIfTouched' orders. 'LastWithinMark' instruction valid for 'Stop' and 'StopLimit' with instruction 'LastPrice'. (optional)
///
///  @param contingencyType Deprecated: linked orders are not supported after 2018/11/10. (optional)
///
///  @param text Optional order annotation. e.g. 'Take profit'. (optional)
///
///  @returns SWGOrder*
///
-(NSURLSessionTask*) orderNewWithSymbol: (NSString*) symbol
    side: (NSString*) side
    simpleOrderQty: (NSNumber*) simpleOrderQty
    orderQty: (NSNumber*) orderQty
    price: (NSNumber*) price
    displayQty: (NSNumber*) displayQty
    stopPx: (NSNumber*) stopPx
    clOrdID: (NSString*) clOrdID
    clOrdLinkID: (NSString*) clOrdLinkID
    pegOffsetValue: (NSNumber*) pegOffsetValue
    pegPriceType: (NSString*) pegPriceType
    ordType: (NSString*) ordType
    timeInForce: (NSString*) timeInForce
    execInst: (NSString*) execInst
    contingencyType: (NSString*) contingencyType
    text: (NSString*) text
    completionHandler: (void (^)(SWGOrder* output, NSError* error)) handler {
    // verify the required parameter 'symbol' is set
    if (symbol == nil) {
        NSParameterAssert(symbol);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"symbol"] };
            NSError* error = [NSError errorWithDomain:kSWGOrderApiErrorDomain code:kSWGOrderApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/order"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.apiClient.configuration.defaultHeaders];
    [headerParams addEntriesFromDictionary:self.defaultHeaders];
    // HTTP header `Accept`
    NSString *acceptHeader = [self.apiClient.sanitizer selectHeaderAccept:@[@"application/json", @"application/xml", @"text/xml", @"application/javascript", @"text/javascript"]];
    if(acceptHeader.length > 0) {
        headerParams[@"Accept"] = acceptHeader;
    }

    // response content type
    NSString *responseContentType = [[acceptHeader componentsSeparatedByString:@", "] firstObject] ?: @"";

    // request content type
    NSString *requestContentType = [self.apiClient.sanitizer selectHeaderContentType:@[@"application/json", @"application/x-www-form-urlencoded"]];

    // Authentication setting
    NSArray *authSettings = @[@"apiExpires", @"apiKey", @"apiSignature"];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];
    if (symbol) {
        formParams[@"symbol"] = symbol;
    }
    if (side) {
        formParams[@"side"] = side;
    }
    if (simpleOrderQty) {
        formParams[@"simpleOrderQty"] = simpleOrderQty;
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

    return [self.apiClient requestWithPath: resourcePath
                                    method: @"POST"
                                pathParams: pathParams
                               queryParams: queryParams
                                formParams: formParams
                                     files: localVarFiles
                                      body: bodyParam
                              headerParams: headerParams
                              authSettings: authSettings
                        requestContentType: requestContentType
                       responseContentType: responseContentType
                              responseType: @"SWGOrder*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((SWGOrder*)data, error);
                                }
                            }];
}



@end
