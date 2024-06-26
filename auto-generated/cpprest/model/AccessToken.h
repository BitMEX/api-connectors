/**
 * BitMEX API
 * ## REST API for the BitMEX Trading Platform  _If you are building automated tools, please subscribe to the_ _[BitMEX API RSS Feed](https://blog.bitmex.com/api_announcement/feed/) for changes. The feed will be updated_ _regularly and is the most reliable way to get downtime and update announcements._  [View Changelog](/app/apiChangelog)  -  #### Getting Started  Base URI: [https://www.bitmex.com/api/v1](/api/v1)  ##### Fetching Data  All REST endpoints are documented below. You can try out any query right from this interface.  Most table queries accept `count`, `start`, and `reverse` params. Set `reverse=true` to get rows newest-first.  Additional documentation regarding filters, timestamps, and authentication is available in [the main API documentation](/app/restAPI).  _All_ table data is available via the [Websocket](/app/wsAPI). We highly recommend using the socket if you want to have the quickest possible data without being subject to ratelimits.  ##### Return Types  By default, all data is returned as JSON. Send `?_format=csv` to get CSV data or `?_format=xml` to get XML data.  ##### Trade Data Queries  _This is only a small subset of what is available, to get you started._  Fill in the parameters and click the `Try it out!` button to try any of these queries.  - [Pricing Data](#!/Quote/Quote_get)  - [Trade Data](#!/Trade/Trade_get)  - [OrderBook Data](#!/OrderBook/OrderBook_getL2)  - [Settlement Data](#!/Settlement/Settlement_get)  - [Exchange Statistics](#!/Stats/Stats_history)  Every function of the BitMEX.com platform is exposed here and documented. Many more functions are available.  ##### Swagger Specification  [⇩ Download Swagger JSON](swagger.json)  -  ## All API Endpoints  Click to expand a section. 
 *
 * OpenAPI spec version: 1.2.0
 * Contact: support@bitmex.com
 *
 * NOTE: This class is auto generated by the swagger code generator 2.4.42-SNAPSHOT.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

/*
 * AccessToken.h
 *
 * 
 */

#ifndef IO_SWAGGER_CLIENT_MODEL_AccessToken_H_
#define IO_SWAGGER_CLIENT_MODEL_AccessToken_H_


#include "../ModelBase.h"

#include <cpprest/details/basic_types.h>
#include "Object.h"

namespace io {
namespace swagger {
namespace client {
namespace model {

/// <summary>
/// 
/// </summary>
class  AccessToken
    : public ModelBase
{
public:
    AccessToken();
    virtual ~AccessToken();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    void fromJson(web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    void fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// AccessToken members

    /// <summary>
    /// 
    /// </summary>
    utility::datetime getUpdated() const;
        void setUpdated(utility::datetime value);
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<Object> getAuthorizedAccounts() const;
    bool authorizedAccountsIsSet() const;
    void unsetAuthorizedAccounts();
    void setAuthorizedAccounts(std::shared_ptr<Object> value);
    /// <summary>
    /// 
    /// </summary>
    utility::string_t getId() const;
        void setId(utility::string_t value);
    /// <summary>
    /// time to live in seconds (2 weeks by default)
    /// </summary>
    double getTtl() const;
    bool ttlIsSet() const;
    void unsetTtl();
    void setTtl(double value);
    /// <summary>
    /// 
    /// </summary>
    utility::datetime getCreated() const;
    bool createdIsSet() const;
    void unsetCreated();
    void setCreated(utility::datetime value);
    /// <summary>
    /// 
    /// </summary>
    double getUserId() const;
    bool userIdIsSet() const;
    void unsetUserId();
    void setUserId(double value);

protected:
    utility::datetime m_Updated;
        std::shared_ptr<Object> m_AuthorizedAccounts;
    bool m_AuthorizedAccountsIsSet;
    utility::string_t m_Id;
        double m_Ttl;
    bool m_TtlIsSet;
    utility::datetime m_Created;
    bool m_CreatedIsSet;
    double m_UserId;
    bool m_UserIdIsSet;
};

}
}
}
}

#endif /* IO_SWAGGER_CLIENT_MODEL_AccessToken_H_ */
