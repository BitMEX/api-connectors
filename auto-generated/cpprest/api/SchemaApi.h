/**
 * BitMEX API
 * ## REST API for the BitMEX Trading Platform  _If you are building automated tools, please subscribe to the_ _[BitMEX API RSS Feed](https://blog.bitmex.com/api_announcement/feed/) for changes. The feed will be updated_ _regularly and is the most reliable way to get downtime and update announcements._  [View Changelog](/app/apiChangelog)  -  #### Getting Started  Base URI: [https://www.bitmex.com/api/v1](/api/v1)  ##### Fetching Data  All REST endpoints are documented below. You can try out any query right from this interface.  Most table queries accept `count`, `start`, and `reverse` params. Set `reverse=true` to get rows newest-first.  Additional documentation regarding filters, timestamps, and authentication is available in [the main API documentation](/app/restAPI).  _All_ table data is available via the [Websocket](/app/wsAPI). We highly recommend using the socket if you want to have the quickest possible data without being subject to ratelimits.  ##### Return Types  By default, all data is returned as JSON. Send `?_format=csv` to get CSV data or `?_format=xml` to get XML data.  ##### Trade Data Queries  _This is only a small subset of what is available, to get you started._  Fill in the parameters and click the `Try it out!` button to try any of these queries.  - [Pricing Data](#!/Quote/Quote_get)  - [Trade Data](#!/Trade/Trade_get)  - [OrderBook Data](#!/OrderBook/OrderBook_getL2)  - [Settlement Data](#!/Settlement/Settlement_get)  - [Exchange Statistics](#!/Stats/Stats_history)  Every function of the BitMEX.com platform is exposed here and documented. Many more functions are available.  ##### Swagger Specification  [⇩ Download Swagger JSON](swagger.json)  -  ## All API Endpoints  Click to expand a section. 
 *
 * OpenAPI spec version: 1.2.0
 * Contact: support@bitmex.com
 *
 * NOTE: This class is auto generated by the swagger code generator 2.4.38-SNAPSHOT.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

/*
 * SchemaApi.h
 *
 * 
 */

#ifndef IO_SWAGGER_CLIENT_API_SchemaApi_H_
#define IO_SWAGGER_CLIENT_API_SchemaApi_H_


#include "../ApiClient.h"

#include "Error.h"
#include "Object.h"
#include <cpprest/details/basic_types.h>

#include <boost/optional.hpp>

namespace io {
namespace swagger {
namespace client {
namespace api {

using namespace io::swagger::client::model;

class  SchemaApi
{
public:
    SchemaApi( std::shared_ptr<ApiClient> apiClient );
    virtual ~SchemaApi();
    /// <summary>
    /// Get model schemata for data objects returned by this API.
    /// </summary>
    /// <remarks>
    /// 
    /// </remarks>
    /// <param name="model">Optional model filter. If omitted, will return all models. (optional)</param>
    pplx::task<std::shared_ptr<Object>> schema_get(
        boost::optional<utility::string_t> model
    );
    /// <summary>
    /// Returns help text &amp; subject list for websocket usage.
    /// </summary>
    /// <remarks>
    /// 
    /// </remarks>
    pplx::task<std::shared_ptr<Object>> schema_websocketHelp(
    );

protected:
    std::shared_ptr<ApiClient> m_ApiClient;
};

}
}
}
}

#endif /* IO_SWAGGER_CLIENT_API_SchemaApi_H_ */

