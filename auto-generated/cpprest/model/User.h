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
 * User.h
 *
 * Account Operations
 */

#ifndef IO_SWAGGER_CLIENT_MODEL_User_H_
#define IO_SWAGGER_CLIENT_MODEL_User_H_


#include "../ModelBase.h"

#include "UserPreferences.h"
#include <cpprest/details/basic_types.h>

namespace io {
namespace swagger {
namespace client {
namespace model {

/// <summary>
/// Account Operations
/// </summary>
class  User
    : public ModelBase
{
public:
    User();
    virtual ~User();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    void fromJson(web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    void fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// User members

    /// <summary>
    /// 
    /// </summary>
    int32_t getId() const;
    bool idIsSet() const;
    void unsetId();
    void setId(int32_t value);
    /// <summary>
    /// 
    /// </summary>
    utility::string_t getFirstname() const;
    bool firstnameIsSet() const;
    void unsetFirstname();
    void setFirstname(utility::string_t value);
    /// <summary>
    /// 
    /// </summary>
    utility::string_t getLastname() const;
    bool lastnameIsSet() const;
    void unsetLastname();
    void setLastname(utility::string_t value);
    /// <summary>
    /// 
    /// </summary>
    utility::string_t getUsername() const;
        void setUsername(utility::string_t value);
    /// <summary>
    /// 
    /// </summary>
    utility::string_t getAccountName() const;
    bool accountNameIsSet() const;
    void unsetAccountName();
    void setAccountName(utility::string_t value);
    /// <summary>
    /// 
    /// </summary>
    bool isIsUser() const;
        void setIsUser(bool value);
    /// <summary>
    /// 
    /// </summary>
    utility::string_t getEmail() const;
    bool emailIsSet() const;
    void unsetEmail();
    void setEmail(utility::string_t value);
    /// <summary>
    /// 
    /// </summary>
    utility::string_t getDateOfBirth() const;
    bool dateOfBirthIsSet() const;
    void unsetDateOfBirth();
    void setDateOfBirth(utility::string_t value);
    /// <summary>
    /// 
    /// </summary>
    utility::string_t getPhone() const;
    bool phoneIsSet() const;
    void unsetPhone();
    void setPhone(utility::string_t value);
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
    utility::datetime getLastUpdated() const;
    bool lastUpdatedIsSet() const;
    void unsetLastUpdated();
    void setLastUpdated(utility::datetime value);
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<UserPreferences> getPreferences() const;
    bool preferencesIsSet() const;
    void unsetPreferences();
    void setPreferences(std::shared_ptr<UserPreferences> value);
    /// <summary>
    /// 
    /// </summary>
    utility::string_t getTFAEnabled() const;
    bool tFAEnabledIsSet() const;
    void unsetTFAEnabled();
    void setTFAEnabled(utility::string_t value);
    /// <summary>
    /// 
    /// </summary>
    utility::string_t getAffiliateID() const;
    bool affiliateIDIsSet() const;
    void unsetAffiliateID();
    void setAffiliateID(utility::string_t value);
    /// <summary>
    /// 
    /// </summary>
    utility::string_t getCountry() const;
    bool countryIsSet() const;
    void unsetCountry();
    void setCountry(utility::string_t value);
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
    utility::datetime getFirstTradeTimestamp() const;
    bool firstTradeTimestampIsSet() const;
    void unsetFirstTradeTimestamp();
    void setFirstTradeTimestamp(utility::datetime value);
    /// <summary>
    /// 
    /// </summary>
    utility::datetime getFirstDepositTimestamp() const;
    bool firstDepositTimestampIsSet() const;
    void unsetFirstDepositTimestamp();
    void setFirstDepositTimestamp(utility::datetime value);
    /// <summary>
    /// 
    /// </summary>
    utility::string_t getTyp() const;
    bool typIsSet() const;
    void unsetTyp();
    void setTyp(utility::string_t value);

protected:
    int32_t m_Id;
    bool m_IdIsSet;
    utility::string_t m_Firstname;
    bool m_FirstnameIsSet;
    utility::string_t m_Lastname;
    bool m_LastnameIsSet;
    utility::string_t m_Username;
        utility::string_t m_AccountName;
    bool m_AccountNameIsSet;
    bool m_IsUser;
        utility::string_t m_Email;
    bool m_EmailIsSet;
    utility::string_t m_DateOfBirth;
    bool m_DateOfBirthIsSet;
    utility::string_t m_Phone;
    bool m_PhoneIsSet;
    utility::datetime m_Created;
    bool m_CreatedIsSet;
    utility::datetime m_LastUpdated;
    bool m_LastUpdatedIsSet;
    std::shared_ptr<UserPreferences> m_Preferences;
    bool m_PreferencesIsSet;
    utility::string_t m_TFAEnabled;
    bool m_TFAEnabledIsSet;
    utility::string_t m_AffiliateID;
    bool m_AffiliateIDIsSet;
    utility::string_t m_Country;
    bool m_CountryIsSet;
    utility::string_t m_GeoipCountry;
    bool m_GeoipCountryIsSet;
    utility::string_t m_GeoipRegion;
    bool m_GeoipRegionIsSet;
    utility::datetime m_FirstTradeTimestamp;
    bool m_FirstTradeTimestampIsSet;
    utility::datetime m_FirstDepositTimestamp;
    bool m_FirstDepositTimestampIsSet;
    utility::string_t m_Typ;
    bool m_TypIsSet;
};

}
}
}
}

#endif /* IO_SWAGGER_CLIENT_MODEL_User_H_ */
