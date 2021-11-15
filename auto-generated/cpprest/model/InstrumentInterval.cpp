/**
 * BitMEX API
 * ## REST API for the BitMEX Trading Platform  _If you are building automated tools, please subscribe to the_ _[BitMEX API RSS Feed](https://blog.bitmex.com/api_announcement/feed/) for changes. The feed will be updated_ _regularly and is the most reliable way to get downtime and update announcements._  [View Changelog](/app/apiChangelog)  ---  #### Getting Started  Base URI: [https://www.bitmex.com/api/v1](/api/v1)  ##### Fetching Data  All REST endpoints are documented below. You can try out any query right from this interface.  Most table queries accept `count`, `start`, and `reverse` params. Set `reverse=true` to get rows newest-first.  Additional documentation regarding filters, timestamps, and authentication is available in [the main API documentation](/app/restAPI).  _All_ table data is available via the [Websocket](/app/wsAPI). We highly recommend using the socket if you want to have the quickest possible data without being subject to ratelimits.  ##### Return Types  By default, all data is returned as JSON. Send `?_format=csv` to get CSV data or `?_format=xml` to get XML data.  ##### Trade Data Queries  _This is only a small subset of what is available, to get you started._  Fill in the parameters and click the `Try it out!` button to try any of these queries.  - [Pricing Data](#!/Quote/Quote_get)  - [Trade Data](#!/Trade/Trade_get)  - [OrderBook Data](#!/OrderBook/OrderBook_getL2)  - [Settlement Data](#!/Settlement/Settlement_get)  - [Exchange Statistics](#!/Stats/Stats_history)  Every function of the BitMEX.com platform is exposed here and documented. Many more functions are available.  ##### Swagger Specification  [⇩ Download Swagger JSON](swagger.json)  ---  ## All API Endpoints  Click to expand a section. 
 *
 * OpenAPI spec version: 1.2.0
 * Contact: support@bitmex.com
 *
 * NOTE: This class is auto generated by the swagger code generator 2.4.24-SNAPSHOT.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */



#include "InstrumentInterval.h"

namespace io {
namespace swagger {
namespace client {
namespace model {

InstrumentInterval::InstrumentInterval()
{
}

InstrumentInterval::~InstrumentInterval()
{
}

void InstrumentInterval::validate()
{
    // TODO: implement validation
}

web::json::value InstrumentInterval::toJson() const
{
    web::json::value val = web::json::value::object();

    {
        std::vector<web::json::value> jsonArray;
        for( auto& item : m_Intervals )
        {
            jsonArray.push_back(ModelBase::toJson(item));
        }
        val[utility::conversions::to_string_t("intervals")] = web::json::value::array(jsonArray);
    }
    {
        std::vector<web::json::value> jsonArray;
        for( auto& item : m_Symbols )
        {
            jsonArray.push_back(ModelBase::toJson(item));
        }
        val[utility::conversions::to_string_t("symbols")] = web::json::value::array(jsonArray);
    }

    return val;
}

void InstrumentInterval::fromJson(web::json::value& val)
{
    {
        m_Intervals.clear();
        std::vector<web::json::value> jsonArray;
        for( auto& item : val[utility::conversions::to_string_t("intervals")].as_array() )
        {
            m_Intervals.push_back(ModelBase::stringFromJson(item));
        }
    }
    {
        m_Symbols.clear();
        std::vector<web::json::value> jsonArray;
        for( auto& item : val[utility::conversions::to_string_t("symbols")].as_array() )
        {
            m_Symbols.push_back(ModelBase::stringFromJson(item));
        }
    }
}

void InstrumentInterval::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }

    {
        std::vector<web::json::value> jsonArray;
        for( auto& item : m_Intervals )
        {
            jsonArray.push_back(ModelBase::toJson(item));
        }
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("intervals"), web::json::value::array(jsonArray), utility::conversions::to_string_t("application/json")));
            }
    {
        std::vector<web::json::value> jsonArray;
        for( auto& item : m_Symbols )
        {
            jsonArray.push_back(ModelBase::toJson(item));
        }
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("symbols"), web::json::value::array(jsonArray), utility::conversions::to_string_t("application/json")));
            }
}

void InstrumentInterval::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }

    {
        m_Intervals.clear();

        web::json::value jsonArray = web::json::value::parse(ModelBase::stringFromHttpContent(multipart->getContent(utility::conversions::to_string_t("intervals"))));
        for( auto& item : jsonArray.as_array() )
        {
            m_Intervals.push_back(ModelBase::stringFromJson(item));
        }
    }
    {
        m_Symbols.clear();

        web::json::value jsonArray = web::json::value::parse(ModelBase::stringFromHttpContent(multipart->getContent(utility::conversions::to_string_t("symbols"))));
        for( auto& item : jsonArray.as_array() )
        {
            m_Symbols.push_back(ModelBase::stringFromJson(item));
        }
    }
}

std::vector<utility::string_t>& InstrumentInterval::getIntervals()
{
    return m_Intervals;
}

void InstrumentInterval::setIntervals(std::vector<utility::string_t> value)
{
    m_Intervals = value;
    
}
std::vector<utility::string_t>& InstrumentInterval::getSymbols()
{
    return m_Symbols;
}

void InstrumentInterval::setSymbols(std::vector<utility::string_t> value)
{
    m_Symbols = value;
    
}
}
}
}
}

