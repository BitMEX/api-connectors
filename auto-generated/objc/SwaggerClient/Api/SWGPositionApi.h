#import <Foundation/Foundation.h>
#import "SWGError.h"
#import "SWGPosition.h"
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



@interface SWGPositionApi: NSObject <SWGApi>

extern NSString* kSWGPositionApiErrorDomain;
extern NSInteger kSWGPositionApiMissingParamErrorCode;

-(instancetype) initWithApiClient:(SWGApiClient *)apiClient NS_DESIGNATED_INITIALIZER;

/// Get your positions.
/// This endpoint is used for retrieving position information. The fields largely follow the [FIX spec](http://www.onixs.biz/fix-dictionary/5.0.SP2/msgType_AP_6580.html) definitions. Some selected fields are explained in more detail below.  The fields _account_, _symbol_, _currency_ are unique to each position and form its key.  Spot trading symbols returns a subset of the position fields, mainly the open order aggregates.  - **account**: Your unique account ID. - **symbol**: The contract for this position. - **currency**: The margin currency for this position. - **underlying**: Meta data of the _symbol_. - **quoteCurrency**: Meta data of the _symbol_, All prices are in the _quoteCurrency_ - **commission**: The maximum of the maker, taker, and settlement fee. - **initMarginReq**: The initial margin requirement. This will be at least the symbol's default initial maintenance margin, but can be higher if you choose lower leverage. - **maintMarginReq**: The maintenance margin requirement. This will be at least the symbol's default maintenance maintenance margin, but can be higher if you choose a higher risk limit. - **riskLimit**: This is a function of your _maintMarginReq_. - **leverage**: 1 / initMarginReq. - **crossMargin**: True/false depending on whether you set cross margin on this position. - **deleveragePercentile**: Indicates where your position is in the ADL queue. - **rebalancedPnl**: The value of realised PNL that has transferred to your wallet for this position. - **prevRealisedPnl**: The value of realised PNL that has transferred to your wallet for this position since the position was closed. - **currentQty**: The current position amount in contracts. - **currentCost**: The current cost of the position in the settlement currency of the symbol (_currency_). - **currentComm**: The current commission of the position in the settlement currency of the symbol (_currency_). - **realisedCost**: The realised cost of this position calculated with regard to average cost accounting. - **unrealisedCost**: _currentCost_ - _realisedCost_. - **grossOpenPremium**: The amount your bidding above the mark price in the settlement currency of the symbol (_currency_). - **markPrice**: The mark price of the symbol in _quoteCurrency_. - **markValue**: The _currentQty_ at the mark price in the settlement currency of the symbol (_currency_). - **homeNotional**: Value of position in units of _underlying_. - **foreignNotional**: Value of position in units of _quoteCurrency_. - **realisedPnl**: The negative of _realisedCost_. - **unrealisedPnl**: _unrealisedGrossPnl_. - **liquidationPrice**: Once markPrice reaches this price, this position will be liquidated. - **bankruptPrice**: Once markPrice reaches this price, this position will have no equity. 
///
/// @param filter Table filter. For example, send {\&quot;symbol\&quot;: \&quot;XBTUSD\&quot;}. (optional)
/// @param columns Which columns to fetch. For example, send [\&quot;columnName\&quot;]. (optional)
/// @param count Number of rows to fetch. (optional)
/// 
///  code:200 message:"Request was successful",
///  code:400 message:"Parameter Error",
///  code:401 message:"Unauthorized",
///  code:403 message:"Access Denied",
///  code:404 message:"Not Found"
///
/// @return NSArray<SWGPosition>*
-(NSURLSessionTask*) positionGetWithFilter: (NSString*) filter
    columns: (NSString*) columns
    count: (NSNumber*) count
    completionHandler: (void (^)(NSArray<SWGPosition>* output, NSError* error)) handler;


/// Enable isolated margin or cross margin per-position.
/// Users can switch isolate margin per-position. This function allows switching margin isolation (aka fixed margin) on and off.
///
/// @param symbol Position symbol to isolate.
/// @param enabled True for isolated margin, false for cross margin. (optional) (default to true)
/// 
///  code:200 message:"Request was successful",
///  code:400 message:"Parameter Error",
///  code:401 message:"Unauthorized",
///  code:403 message:"Access Denied",
///  code:404 message:"Not Found"
///
/// @return SWGPosition*
-(NSURLSessionTask*) positionIsolateMarginWithSymbol: (NSString*) symbol
    enabled: (NSNumber*) enabled
    completionHandler: (void (^)(SWGPosition* output, NSError* error)) handler;


/// Transfer equity in or out of a position.
/// When margin is isolated on a position, use this function to add or remove margin from the position. Note that you cannot remove margin below the initial margin threshold.
///
/// @param symbol Symbol of position to isolate.
/// @param amount Amount to transfer, in Satoshis. May be negative.
/// @param targetAccountId AccountId for the position that the margin would be transfered to, must be a paired account with main user. (optional)
/// 
///  code:200 message:"Request was successful",
///  code:400 message:"Parameter Error",
///  code:401 message:"Unauthorized",
///  code:403 message:"Access Denied",
///  code:404 message:"Not Found"
///
/// @return SWGPosition*
-(NSURLSessionTask*) positionTransferIsolatedMarginWithSymbol: (NSString*) symbol
    amount: (NSNumber*) amount
    targetAccountId: (NSNumber*) targetAccountId
    completionHandler: (void (^)(SWGPosition* output, NSError* error)) handler;


/// Choose leverage for a position.
/// Users can choose an isolated leverage. This will automatically enable isolated margin.
///
/// @param symbol Symbol of position to adjust.
/// @param leverage Leverage value. Send a number between 0.01 and 100 to enable isolated margin with a fixed leverage. Send 0 to enable cross margin.
/// @param targetAccountId AccountId for the position that the leverage would be changed on, must be a paired account with main user. (optional)
/// 
///  code:200 message:"Request was successful",
///  code:400 message:"Parameter Error",
///  code:401 message:"Unauthorized",
///  code:403 message:"Access Denied",
///  code:404 message:"Not Found"
///
/// @return SWGPosition*
-(NSURLSessionTask*) positionUpdateLeverageWithSymbol: (NSString*) symbol
    leverage: (NSNumber*) leverage
    targetAccountId: (NSNumber*) targetAccountId
    completionHandler: (void (^)(SWGPosition* output, NSError* error)) handler;


/// Update your risk limit.
/// Risk Limits limit the size of positions you can trade at various margin levels. Larger positions require more margin. Please see the Risk Limit documentation for more details.
///
/// @param symbol Symbol of position to update risk limit on.
/// @param riskLimit New Risk Limit, in Satoshis.
/// @param targetAccountId AccountId for the position that the risk limit would be updated on, must be a paired account with main user. (optional)
/// 
///  code:200 message:"Request was successful",
///  code:400 message:"Parameter Error",
///  code:401 message:"Unauthorized",
///  code:403 message:"Access Denied",
///  code:404 message:"Not Found"
///
/// @return SWGPosition*
-(NSURLSessionTask*) positionUpdateRiskLimitWithSymbol: (NSString*) symbol
    riskLimit: (NSNumber*) riskLimit
    targetAccountId: (NSNumber*) targetAccountId
    completionHandler: (void (^)(SWGPosition* output, NSError* error)) handler;



@end
