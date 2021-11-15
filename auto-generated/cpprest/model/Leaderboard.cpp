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



#include "Leaderboard.h"

namespace io {
namespace swagger {
namespace client {
namespace model {

Leaderboard::Leaderboard()
{
    m_Name = utility::conversions::to_string_t("");
    m_IsRealName = false;
    m_IsRealNameIsSet = false;
    m_Profit = 0.0;
    m_ProfitIsSet = false;
}

Leaderboard::~Leaderboard()
{
}

void Leaderboard::validate()
{
    // TODO: implement validation
}

web::json::value Leaderboard::toJson() const
{
    web::json::value val = web::json::value::object();

    val[utility::conversions::to_string_t("name")] = ModelBase::toJson(m_Name);
    if(m_IsRealNameIsSet)
    {
        val[utility::conversions::to_string_t("isRealName")] = ModelBase::toJson(m_IsRealName);
    }
    if(m_ProfitIsSet)
    {
        val[utility::conversions::to_string_t("profit")] = ModelBase::toJson(m_Profit);
    }

    return val;
}

void Leaderboard::fromJson(web::json::value& val)
{
    setName(ModelBase::stringFromJson(val[utility::conversions::to_string_t("name")]));
    if(val.has_field(utility::conversions::to_string_t("isRealName")))
    {
        web::json::value& fieldValue = val[utility::conversions::to_string_t("isRealName")];
        if(!fieldValue.is_null())
        {
            setIsRealName(ModelBase::boolFromJson(fieldValue));
        }
    }
    if(val.has_field(utility::conversions::to_string_t("profit")))
    {
        web::json::value& fieldValue = val[utility::conversions::to_string_t("profit")];
        if(!fieldValue.is_null())
        {
            setProfit(ModelBase::doubleFromJson(fieldValue));
        }
    }
}

void Leaderboard::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }

    multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("name"), m_Name));
    if(m_IsRealNameIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("isRealName"), m_IsRealName));
    }
    if(m_ProfitIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("profit"), m_Profit));
    }
}

void Leaderboard::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }

    setName(ModelBase::stringFromHttpContent(multipart->getContent(utility::conversions::to_string_t("name"))));
    if(multipart->hasContent(utility::conversions::to_string_t("isRealName")))
    {
        setIsRealName(ModelBase::boolFromHttpContent(multipart->getContent(utility::conversions::to_string_t("isRealName"))));
    }
    if(multipart->hasContent(utility::conversions::to_string_t("profit")))
    {
        setProfit(ModelBase::doubleFromHttpContent(multipart->getContent(utility::conversions::to_string_t("profit"))));
    }
}

utility::string_t Leaderboard::getName() const
{
    return m_Name;
}


void Leaderboard::setName(utility::string_t value)
{
    m_Name = value;
    
}
bool Leaderboard::isIsRealName() const
{
    return m_IsRealName;
}


void Leaderboard::setIsRealName(bool value)
{
    m_IsRealName = value;
    m_IsRealNameIsSet = true;
}
bool Leaderboard::isRealNameIsSet() const
{
    return m_IsRealNameIsSet;
}

void Leaderboard::unsetIsRealName()
{
    m_IsRealNameIsSet = false;
}

double Leaderboard::getProfit() const
{
    return m_Profit;
}


void Leaderboard::setProfit(double value)
{
    m_Profit = value;
    m_ProfitIsSet = true;
}
bool Leaderboard::profitIsSet() const
{
    return m_ProfitIsSet;
}

void Leaderboard::unsetProfit()
{
    m_ProfitIsSet = false;
}

}
}
}
}

