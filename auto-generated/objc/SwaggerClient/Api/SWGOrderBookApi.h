#import <Foundation/Foundation.h>
#import "SWGError.h"
#import "SWGOrderBookL2.h"
#import "SWGApi.h"

/**
* BitMEX API
* ## REST API for the BitMEX Trading Platform  _If you are building automated tools, please subscribe to the_ _[BitMEX API RSS Feed](https://blog.bitmex.com/api_announcement/feed/) for changes. The feed will be updated_ _regularly and is the most reliable way to get downtime and update announcements._  [View Changelog](/app/apiChangelog)  ---  #### Getting Started  Base URI: [https://www.bitmex.com/api/v1](/api/v1)  ##### Fetching Data  All REST endpoints are documented below. You can try out any query right from this interface.  Most table queries accept `count`, `start`, and `reverse` params. Set `reverse=true` to get rows newest-first.  Additional documentation regarding filters, timestamps, and authentication is available in [the main API documentation](/app/restAPI).  _All_ table data is available via the [Websocket](/app/wsAPI). We highly recommend using the socket if you want to have the quickest possible data without being subject to ratelimits.  ##### Return Types  By default, all data is returned as JSON. Send `?_format=csv` to get CSV data or `?_format=xml` to get XML data.  ##### Trade Data Queries  _This is only a small subset of what is available, to get you started._  Fill in the parameters and click the `Try it out!` button to try any of these queries.  - [Pricing Data](#!/Quote/Quote_get)  - [Trade Data](#!/Trade/Trade_get)  - [OrderBook Data](#!/OrderBook/OrderBook_getL2)  - [Settlement Data](#!/Settlement/Settlement_get)  - [Exchange Statistics](#!/Stats/Stats_history)  Every function of the BitMEX.com platform is exposed here and documented. Many more functions are available.  ##### Swagger Specification  [⇩ Download Swagger JSON](swagger.json)  ---  ## All API Endpoints  Click to expand a section. 
*
* OpenAPI spec version: 1.2.0
* Contact: support@bitmex.com
*
* NOTE: This class is auto generated by the swagger code generator program.
* https://github.com/swagger-api/swagger-codegen.git
* Do not edit the class manually.
*/



@interface SWGOrderBookApi: NSObject <SWGApi>

extern NSString* kSWGOrderBookApiErrorDomain;
extern NSInteger kSWGOrderBookApiMissingParamErrorCode;

-(instancetype) initWithApiClient:(SWGApiClient *)apiClient NS_DESIGNATED_INITIALIZER;

/// Get current orderbook in vertical format.
/// 
///
/// @param symbol Instrument symbol. Send a series (e.g. XBT) to get data for the nearest contract in that series.
/// @param depth Orderbook depth per side. Send 0 for full depth. (optional) (default to 25)
/// 
///  code:200 message:"Request was successful",
///  code:400 message:"Parameter Error",
///  code:401 message:"Unauthorized",
///  code:403 message:"Access Denied",
///  code:404 message:"Not Found"
///
/// @return NSArray<SWGOrderBookL2>*
-(NSURLSessionTask*) orderBookGetL2WithSymbol: (NSString*) symbol
    depth: (NSNumber*) depth
    completionHandler: (void (^)(NSArray<SWGOrderBookL2>* output, NSError* error)) handler;



@end
