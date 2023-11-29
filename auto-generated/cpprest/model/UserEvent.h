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
 * UserEvent.h
 *
 * User Events for Auditing
 */

#ifndef IO_SWAGGER_CLIENT_MODEL_UserEvent_H_
#define IO_SWAGGER_CLIENT_MODEL_UserEvent_H_


#include "../ModelBase.h"

#include <cpprest/details/basic_types.h>
#include "Object.h"

namespace io {
namespace swagger {
namespace client {
namespace model {

/// <summary>
/// User Events for Auditing
/// </summary>
class  UserEvent
    : public ModelBase
{
public:
    UserEvent();
    virtual ~UserEvent();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    void fromJson(web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    void fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// UserEvent members

    /// <summary>
    /// 
    /// </summary>
    double getId() const;
    bool idIsSet() const;
    void unsetId();
    void setId(double value);
    /// <summary>
    /// 
    /// </summary>
    utility::string_t getType() const;
        void setType(utility::string_t value);
    /// <summary>
    /// 
    /// </summary>
    utility::string_t getStatus() const;
        void setStatus(utility::string_t value);
    /// <summary>
    /// 
    /// </summary>
    double getUserId() const;
        void setUserId(double value);
    /// <summary>
    /// 
    /// </summary>
    double getCreatedById() const;
        void setCreatedById(double value);
    /// <summary>
    /// 
    /// </summary>
    utility::string_t getIp() const;
    bool ipIsSet() const;
    void unsetIp();
    void setIp(utility::string_t value);
    /// <summary>
    /// 
    /// </summary>
    utility::string_t getGeoipCountry() const;
    bool geoipCountryIsSet() const;
    void unsetGeoipCountry();
    void setGeoipCountry(utility::string_t value);
    /// <summary>
    /// 
    /// </summary>
    utility::string_t getGeoipRegion() const;
    bool geoipRegionIsSet() const;
    void unsetGeoipRegion();
    void setGeoipRegion(utility::string_t value);
    /// <summary>
    /// 
    /// </summary>
    utility::string_t getGeoipSubRegion() const;
    bool geoipSubRegionIsSet() const;
    void unsetGeoipSubRegion();
    void setGeoipSubRegion(utility::string_t value);
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<Object> getEventMeta() const;
    bool eventMetaIsSet() const;
    void unsetEventMeta();
    void setEventMeta(std::shared_ptr<Object> value);
    /// <summary>
    /// 
    /// </summary>
    utility::datetime getCreated() const;
        void setCreated(utility::datetime value);

protected:
    double m_Id;
    bool m_IdIsSet;
    utility::string_t m_Type;
        utility::string_t m_Status;
        double m_UserId;
        double m_CreatedById;
        utility::string_t m_Ip;
    bool m_IpIsSet;
    utility::string_t m_GeoipCountry;
    bool m_GeoipCountryIsSet;
    utility::string_t m_GeoipRegion;
    bool m_GeoipRegionIsSet;
    utility::string_t m_GeoipSubRegion;
    bool m_GeoipSubRegionIsSet;
    std::shared_ptr<Object> m_EventMeta;
    bool m_EventMetaIsSet;
    utility::datetime m_Created;
    };

}
}
}
}

#endif /* IO_SWAGGER_CLIENT_MODEL_UserEvent_H_ */
