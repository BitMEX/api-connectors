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



#include "Error_error.h"

namespace io {
namespace swagger {
namespace client {
namespace model {

Error_error::Error_error()
{
    m_Message = utility::conversions::to_string_t("");
    m_MessageIsSet = false;
    m_Name = utility::conversions::to_string_t("");
    m_NameIsSet = false;
}

Error_error::~Error_error()
{
}

void Error_error::validate()
{
    // TODO: implement validation
}

web::json::value Error_error::toJson() const
{
    web::json::value val = web::json::value::object();

    if(m_MessageIsSet)
    {
        val[utility::conversions::to_string_t("message")] = ModelBase::toJson(m_Message);
    }
    if(m_NameIsSet)
    {
        val[utility::conversions::to_string_t("name")] = ModelBase::toJson(m_Name);
    }

    return val;
}

void Error_error::fromJson(web::json::value& val)
{
    if(val.has_field(utility::conversions::to_string_t("message")))
    {
        web::json::value& fieldValue = val[utility::conversions::to_string_t("message")];
        if(!fieldValue.is_null())
        {
            setMessage(ModelBase::stringFromJson(fieldValue));
        }
    }
    if(val.has_field(utility::conversions::to_string_t("name")))
    {
        web::json::value& fieldValue = val[utility::conversions::to_string_t("name")];
        if(!fieldValue.is_null())
        {
            setName(ModelBase::stringFromJson(fieldValue));
        }
    }
}

void Error_error::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }

    if(m_MessageIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("message"), m_Message));
        
    }
    if(m_NameIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("name"), m_Name));
        
    }
}

void Error_error::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }

    if(multipart->hasContent(utility::conversions::to_string_t("message")))
    {
        setMessage(ModelBase::stringFromHttpContent(multipart->getContent(utility::conversions::to_string_t("message"))));
    }
    if(multipart->hasContent(utility::conversions::to_string_t("name")))
    {
        setName(ModelBase::stringFromHttpContent(multipart->getContent(utility::conversions::to_string_t("name"))));
    }
}

utility::string_t Error_error::getMessage() const
{
    return m_Message;
}


void Error_error::setMessage(utility::string_t value)
{
    m_Message = value;
    m_MessageIsSet = true;
}
bool Error_error::messageIsSet() const
{
    return m_MessageIsSet;
}

void Error_error::unsetMessage()
{
    m_MessageIsSet = false;
}

utility::string_t Error_error::getName() const
{
    return m_Name;
}


void Error_error::setName(utility::string_t value)
{
    m_Name = value;
    m_NameIsSet = true;
}
bool Error_error::nameIsSet() const
{
    return m_NameIsSet;
}

void Error_error::unsetName()
{
    m_NameIsSet = false;
}

}
}
}
}

