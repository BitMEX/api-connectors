#import <Foundation/Foundation.h>
#import "SWGError.h"
#import "SWGIndexComposite.h"
#import "SWGInstrument.h"
#import "SWGInstrumentInterval.h"
#import "SWGStatsUSDBySymbol.h"
#import "SWGApi.h"

/**
* BitMEX API
* ## REST API for the BitMEX Trading Platform  _If you are building automated tools, please subscribe to the_ _[BitMEX API RSS Feed](https://blog.bitmex.com/api_announcement/feed/) for changes. The feed will be updated_ _regularly and is the most reliable way to get downtime and update announcements._  [View Changelog](/app/apiChangelog)  -  #### Getting Started  Base URI: [https://www.bitmex.com/api/v1](/api/v1)  ##### Fetching Data  All REST endpoints are documented below. You can try out any query right from this interface.  Most table queries accept `count`, `start`, and `reverse` params. Set `reverse=true` to get rows newest-first.  Additional documentation regarding filters, timestamps, and authentication is available in [the main API documentation](/app/restAPI).  _All_ table data is available via the [Websocket](/app/wsAPI). We highly recommend using the socket if you want to have the quickest possible data without being subject to ratelimits.  ##### Return Types  By default, all data is returned as JSON. Send `?_format=csv` to get CSV data or `?_format=xml` to get XML data.  ##### Trade Data Queries  _This is only a small subset of what is available, to get you started._  Fill in the parameters and click the `Try it out!` button to try any of these queries.  - [Pricing Data](#!/Quote/Quote_get)  - [Trade Data](#!/Trade/Trade_get)  - [OrderBook Data](#!/OrderBook/OrderBook_getL2)  - [Settlement Data](#!/Settlement/Settlement_get)  - [Exchange Statistics](#!/Stats/Stats_history)  Every function of the BitMEX.com platform is exposed here and documented. Many more functions are available.  ##### Swagger Specification  [⇩ Download Swagger JSON](swagger.json)  -  ## All API Endpoints  Click to expand a section. 
*
* OpenAPI spec version: 1.2.0
* Contact: support@bitmex.com
*
* NOTE: This class is auto generated by the swagger code generator program.
* https://github.com/swagger-api/swagger-codegen.git
* Do not edit the class manually.
*/



@interface SWGInstrumentApi: NSObject <SWGApi>

extern NSString* kSWGInstrumentApiErrorDomain;
extern NSInteger kSWGInstrumentApiMissingParamErrorCode;

-(instancetype) initWithApiClient:(SWGApiClient *)apiClient NS_DESIGNATED_INITIALIZER;

/// Get instruments.
/// This returns all instruments and indices, including those that have settled or are unlisted. Use this endpoint if you want to query for individual instruments or use a complex filter. Use `/instrument/active` to return active instruments, or use a filter like `{\"state\": \"Open\"}`.  The instrument type is specified by the `typ` param.  - Perpetual Contracts - `FFWCSX` - Perpetual Contracts (FX underliers) - `FFWCSF` - Spot - `IFXXXP` - Futures - `FFCCSX` - BitMEX Basket Index - `MRBXXX` - BitMEX Crypto Index - `MRCXXX` - BitMEX FX Index - `MRFXXX` - BitMEX Lending/Premium Index - `MRRXXX` - BitMEX Volatility Index - `MRIXXX` 
///
/// @param symbol Instrument symbol. Send a bare series (e.g. XBT) to get data for the nearest expiring contract in that series.  You can also send a timeframe, e.g. &#x60;XBT:quarterly&#x60;. Timeframes are &#x60;nearest&#x60;, &#x60;daily&#x60;, &#x60;weekly&#x60;, &#x60;monthly&#x60;, &#x60;quarterly&#x60;, &#x60;biquarterly&#x60;, and &#x60;perpetual&#x60;.  Symbols are case-insensitive. (optional)
/// @param filter Generic table filter. Send JSON key/value pairs, such as &#x60;{\&quot;key\&quot;: \&quot;value\&quot;}&#x60;. You can key on individual fields, and do more advanced querying on timestamps. See the [Timestamp Docs](https://www.bitmex.com/app/restAPI#Timestamp-Filters) for more details. (optional)
/// @param columns Array of column names to fetch. If omitted, will return all columns.  Note that this method will always return item keys, even when not specified, so you may receive more columns that you expect. (optional)
/// @param count Number of results to fetch. Must be a positive integer. (optional) (default to 100)
/// @param start Starting point for results. (optional) (default to 0)
/// @param reverse If true, will sort results newest first. (optional) (default to false)
/// @param startTime Starting date filter for results. (optional)
/// @param endTime Ending date filter for results. (optional)
/// 
///  code:200 message:"Request was successful",
///  code:400 message:"Parameter Error",
///  code:401 message:"Unauthorized",
///  code:403 message:"Access Denied",
///  code:404 message:"Not Found"
///
/// @return NSArray<SWGInstrument>*
-(NSURLSessionTask*) instrumentGetWithSymbol: (NSString*) symbol
    filter: (NSString*) filter
    columns: (NSString*) columns
    count: (NSNumber*) count
    start: (NSNumber*) start
    reverse: (NSNumber*) reverse
    startTime: (NSDate*) startTime
    endTime: (NSDate*) endTime
    completionHandler: (void (^)(NSArray<SWGInstrument>* output, NSError* error)) handler;


/// Get all active instruments and instruments that have expired in <24hrs.
/// 
///
/// 
///  code:200 message:"Request was successful",
///  code:400 message:"Parameter Error",
///  code:401 message:"Unauthorized",
///  code:403 message:"Access Denied",
///  code:404 message:"Not Found"
///
/// @return NSArray<SWGInstrument>*
-(NSURLSessionTask*) instrumentGetActiveWithCompletionHandler: 
    (void (^)(NSArray<SWGInstrument>* output, NSError* error)) handler;


/// Helper method. Gets all active instruments and all indices. This is a join of the result of /indices and /active.
/// 
///
/// 
///  code:200 message:"Request was successful",
///  code:400 message:"Parameter Error",
///  code:401 message:"Unauthorized",
///  code:403 message:"Access Denied",
///  code:404 message:"Not Found"
///
/// @return NSArray<SWGInstrument>*
-(NSURLSessionTask*) instrumentGetActiveAndIndicesWithCompletionHandler: 
    (void (^)(NSArray<SWGInstrument>* output, NSError* error)) handler;


/// Return all active contract series and interval pairs.
/// This endpoint is useful for determining which pairs are live. It returns two arrays of   strings. The first is intervals, such as `[\"XBT:perpetual\", \"XBT:quarterly\", \"XBT:biquarterly\", \"ETH:quarterly\", ...]`. These identifiers are usable in any query's `symbol` param. The second array is the current resolution of these intervals. Results are mapped at the same index.
///
/// 
///  code:200 message:"Request was successful",
///  code:400 message:"Parameter Error",
///  code:401 message:"Unauthorized",
///  code:403 message:"Access Denied",
///  code:404 message:"Not Found"
///
/// @return SWGInstrumentInterval*
-(NSURLSessionTask*) instrumentGetActiveIntervalsWithCompletionHandler: 
    (void (^)(SWGInstrumentInterval* output, NSError* error)) handler;


/// Show constituent parts of an index.
/// Composite indices are built from multiple external price sources.  Use this endpoint to get the underlying prices of an index. For example, send a `symbol` of `.BXBT` to get the ticks and weights of the constituent exchanges that build the \".BXBT\" index.  A tick with reference `\"BMI\"` and weight `null` is the composite index tick. 
///
/// @param symbol The composite index symbol. (optional) (default to .BXBT)
/// @param filter Generic table filter. Send JSON key/value pairs, such as &#x60;{\&quot;key\&quot;: \&quot;value\&quot;}&#x60;. (optional)
/// @param columns Array of column names to fetch. If omitted, will return all columns.  Note that this method will always return item keys, even when not specified, so you may receive more columns that you expect. (optional)
/// @param count Number of results to fetch. Must be a positive integer. (optional) (default to 100)
/// @param start Starting point for results. (optional) (default to 0)
/// @param reverse If true, will sort results newest first. (optional) (default to false)
/// @param startTime Starting date filter for results. (optional)
/// @param endTime Ending date filter for results. (optional)
/// 
///  code:200 message:"Request was successful",
///  code:400 message:"Parameter Error",
///  code:401 message:"Unauthorized",
///  code:403 message:"Access Denied",
///  code:404 message:"Not Found"
///
/// @return NSArray<SWGIndexComposite>*
-(NSURLSessionTask*) instrumentGetCompositeIndexWithSymbol: (NSString*) symbol
    filter: (NSString*) filter
    columns: (NSString*) columns
    count: (NSNumber*) count
    start: (NSNumber*) start
    reverse: (NSNumber*) reverse
    startTime: (NSDate*) startTime
    endTime: (NSDate*) endTime
    completionHandler: (void (^)(NSArray<SWGIndexComposite>* output, NSError* error)) handler;


/// Get all price indices.
/// 
///
/// 
///  code:200 message:"Request was successful",
///  code:400 message:"Parameter Error",
///  code:401 message:"Unauthorized",
///  code:403 message:"Access Denied",
///  code:404 message:"Not Found"
///
/// @return NSArray<SWGInstrument>*
-(NSURLSessionTask*) instrumentGetIndicesWithCompletionHandler: 
    (void (^)(NSArray<SWGInstrument>* output, NSError* error)) handler;


/// Get a summary of exchange statistics in USD.
/// 
///
/// @param symbol Filter by symbol. (optional)
/// @param columns Array of column names to fetch. (optional)
/// 
///  code:200 message:"Request was successful",
///  code:400 message:"Parameter Error",
///  code:401 message:"Unauthorized",
///  code:403 message:"Access Denied",
///  code:404 message:"Not Found"
///
/// @return NSArray<SWGStatsUSDBySymbol>*
-(NSURLSessionTask*) instrumentGetUsdVolumeWithSymbol: (NSString*) symbol
    columns: (NSString*) columns
    completionHandler: (void (^)(NSArray<SWGStatsUSDBySymbol>* output, NSError* error)) handler;



@end
