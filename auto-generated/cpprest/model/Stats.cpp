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



#include "Stats.h"

namespace io {
namespace swagger {
namespace client {
namespace model {

Stats::Stats()
{
    m_RootSymbol = utility::conversions::to_string_t("");
    m_Currency = utility::conversions::to_string_t("");
    m_CurrencyIsSet = false;
    m_Volume24h = 0.0;
    m_Volume24hIsSet = false;
    m_Turnover24h = 0.0;
    m_Turnover24hIsSet = false;
    m_OpenInterest = 0.0;
    m_OpenInterestIsSet = false;
    m_OpenValue = 0.0;
    m_OpenValueIsSet = false;
}

Stats::~Stats()
{
}

void Stats::validate()
{
    // TODO: implement validation
}

web::json::value Stats::toJson() const
{
    web::json::value val = web::json::value::object();

    val[utility::conversions::to_string_t("rootSymbol")] = ModelBase::toJson(m_RootSymbol);
    if(m_CurrencyIsSet)
    {
        val[utility::conversions::to_string_t("currency")] = ModelBase::toJson(m_Currency);
    }
    if(m_Volume24hIsSet)
    {
        val[utility::conversions::to_string_t("volume24h")] = ModelBase::toJson(m_Volume24h);
    }
    if(m_Turnover24hIsSet)
    {
        val[utility::conversions::to_string_t("turnover24h")] = ModelBase::toJson(m_Turnover24h);
    }
    if(m_OpenInterestIsSet)
    {
        val[utility::conversions::to_string_t("openInterest")] = ModelBase::toJson(m_OpenInterest);
    }
    if(m_OpenValueIsSet)
    {
        val[utility::conversions::to_string_t("openValue")] = ModelBase::toJson(m_OpenValue);
    }

    return val;
}

void Stats::fromJson(web::json::value& val)
{
    setRootSymbol(ModelBase::stringFromJson(val[utility::conversions::to_string_t("rootSymbol")]));
    if(val.has_field(utility::conversions::to_string_t("currency")))
    {
        web::json::value& fieldValue = val[utility::conversions::to_string_t("currency")];
        if(!fieldValue.is_null())
        {
            setCurrency(ModelBase::stringFromJson(fieldValue));
        }
    }
    if(val.has_field(utility::conversions::to_string_t("volume24h")))
    {
        web::json::value& fieldValue = val[utility::conversions::to_string_t("volume24h")];
        if(!fieldValue.is_null())
        {
            setVolume24h(ModelBase::doubleFromJson(fieldValue));
        }
    }
    if(val.has_field(utility::conversions::to_string_t("turnover24h")))
    {
        web::json::value& fieldValue = val[utility::conversions::to_string_t("turnover24h")];
        if(!fieldValue.is_null())
        {
            setTurnover24h(ModelBase::doubleFromJson(fieldValue));
        }
    }
    if(val.has_field(utility::conversions::to_string_t("openInterest")))
    {
        web::json::value& fieldValue = val[utility::conversions::to_string_t("openInterest")];
        if(!fieldValue.is_null())
        {
            setOpenInterest(ModelBase::doubleFromJson(fieldValue));
        }
    }
    if(val.has_field(utility::conversions::to_string_t("openValue")))
    {
        web::json::value& fieldValue = val[utility::conversions::to_string_t("openValue")];
        if(!fieldValue.is_null())
        {
            setOpenValue(ModelBase::doubleFromJson(fieldValue));
        }
    }
}

void Stats::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }

    multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("rootSymbol"), m_RootSymbol));
    if(m_CurrencyIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("currency"), m_Currency));
        
    }
    if(m_Volume24hIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("volume24h"), m_Volume24h));
    }
    if(m_Turnover24hIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("turnover24h"), m_Turnover24h));
    }
    if(m_OpenInterestIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("openInterest"), m_OpenInterest));
    }
    if(m_OpenValueIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("openValue"), m_OpenValue));
    }
}

void Stats::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }

    setRootSymbol(ModelBase::stringFromHttpContent(multipart->getContent(utility::conversions::to_string_t("rootSymbol"))));
    if(multipart->hasContent(utility::conversions::to_string_t("currency")))
    {
        setCurrency(ModelBase::stringFromHttpContent(multipart->getContent(utility::conversions::to_string_t("currency"))));
    }
    if(multipart->hasContent(utility::conversions::to_string_t("volume24h")))
    {
        setVolume24h(ModelBase::doubleFromHttpContent(multipart->getContent(utility::conversions::to_string_t("volume24h"))));
    }
    if(multipart->hasContent(utility::conversions::to_string_t("turnover24h")))
    {
        setTurnover24h(ModelBase::doubleFromHttpContent(multipart->getContent(utility::conversions::to_string_t("turnover24h"))));
    }
    if(multipart->hasContent(utility::conversions::to_string_t("openInterest")))
    {
        setOpenInterest(ModelBase::doubleFromHttpContent(multipart->getContent(utility::conversions::to_string_t("openInterest"))));
    }
    if(multipart->hasContent(utility::conversions::to_string_t("openValue")))
    {
        setOpenValue(ModelBase::doubleFromHttpContent(multipart->getContent(utility::conversions::to_string_t("openValue"))));
    }
}

utility::string_t Stats::getRootSymbol() const
{
    return m_RootSymbol;
}


void Stats::setRootSymbol(utility::string_t value)
{
    m_RootSymbol = value;
    
}
utility::string_t Stats::getCurrency() const
{
    return m_Currency;
}


void Stats::setCurrency(utility::string_t value)
{
    m_Currency = value;
    m_CurrencyIsSet = true;
}
bool Stats::currencyIsSet() const
{
    return m_CurrencyIsSet;
}

void Stats::unsetCurrency()
{
    m_CurrencyIsSet = false;
}

double Stats::getVolume24h() const
{
    return m_Volume24h;
}


void Stats::setVolume24h(double value)
{
    m_Volume24h = value;
    m_Volume24hIsSet = true;
}
bool Stats::volume24hIsSet() const
{
    return m_Volume24hIsSet;
}

void Stats::unsetVolume24h()
{
    m_Volume24hIsSet = false;
}

double Stats::getTurnover24h() const
{
    return m_Turnover24h;
}


void Stats::setTurnover24h(double value)
{
    m_Turnover24h = value;
    m_Turnover24hIsSet = true;
}
bool Stats::turnover24hIsSet() const
{
    return m_Turnover24hIsSet;
}

void Stats::unsetTurnover24h()
{
    m_Turnover24hIsSet = false;
}

double Stats::getOpenInterest() const
{
    return m_OpenInterest;
}


void Stats::setOpenInterest(double value)
{
    m_OpenInterest = value;
    m_OpenInterestIsSet = true;
}
bool Stats::openInterestIsSet() const
{
    return m_OpenInterestIsSet;
}

void Stats::unsetOpenInterest()
{
    m_OpenInterestIsSet = false;
}

double Stats::getOpenValue() const
{
    return m_OpenValue;
}


void Stats::setOpenValue(double value)
{
    m_OpenValue = value;
    m_OpenValueIsSet = true;
}
bool Stats::openValueIsSet() const
{
    return m_OpenValueIsSet;
}

void Stats::unsetOpenValue()
{
    m_OpenValueIsSet = false;
}

}
}
}
}

