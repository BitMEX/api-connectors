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



#include "User.h"

namespace io {
namespace swagger {
namespace client {
namespace model {

User::User()
{
    m_Id = 0;
    m_IdIsSet = false;
    m_Firstname = utility::conversions::to_string_t("");
    m_FirstnameIsSet = false;
    m_Lastname = utility::conversions::to_string_t("");
    m_LastnameIsSet = false;
    m_Username = utility::conversions::to_string_t("");
    m_AccountName = utility::conversions::to_string_t("");
    m_AccountNameIsSet = false;
    m_IsUser = false;
    m_Email = utility::conversions::to_string_t("");
    m_EmailIsSet = false;
    m_DateOfBirth = utility::conversions::to_string_t("");
    m_DateOfBirthIsSet = false;
    m_Phone = utility::conversions::to_string_t("");
    m_PhoneIsSet = false;
    m_Created = utility::datetime();
    m_CreatedIsSet = false;
    m_LastUpdated = utility::datetime();
    m_LastUpdatedIsSet = false;
    m_PreferencesIsSet = false;
    m_TFAEnabled = utility::conversions::to_string_t("");
    m_TFAEnabledIsSet = false;
    m_AffiliateID = utility::conversions::to_string_t("");
    m_AffiliateIDIsSet = false;
    m_Country = utility::conversions::to_string_t("");
    m_CountryIsSet = false;
    m_GeoipCountry = utility::conversions::to_string_t("");
    m_GeoipCountryIsSet = false;
    m_GeoipRegion = utility::conversions::to_string_t("");
    m_GeoipRegionIsSet = false;
    m_FirstTradeTimestamp = utility::datetime();
    m_FirstTradeTimestampIsSet = false;
    m_FirstDepositTimestamp = utility::datetime();
    m_FirstDepositTimestampIsSet = false;
    m_Typ = utility::conversions::to_string_t("");
    m_TypIsSet = false;
}

User::~User()
{
}

void User::validate()
{
    // TODO: implement validation
}

web::json::value User::toJson() const
{
    web::json::value val = web::json::value::object();

    if(m_IdIsSet)
    {
        val[utility::conversions::to_string_t("id")] = ModelBase::toJson(m_Id);
    }
    if(m_FirstnameIsSet)
    {
        val[utility::conversions::to_string_t("firstname")] = ModelBase::toJson(m_Firstname);
    }
    if(m_LastnameIsSet)
    {
        val[utility::conversions::to_string_t("lastname")] = ModelBase::toJson(m_Lastname);
    }
    val[utility::conversions::to_string_t("username")] = ModelBase::toJson(m_Username);
    if(m_AccountNameIsSet)
    {
        val[utility::conversions::to_string_t("accountName")] = ModelBase::toJson(m_AccountName);
    }
    val[utility::conversions::to_string_t("isUser")] = ModelBase::toJson(m_IsUser);
    if(m_EmailIsSet)
    {
        val[utility::conversions::to_string_t("email")] = ModelBase::toJson(m_Email);
    }
    if(m_DateOfBirthIsSet)
    {
        val[utility::conversions::to_string_t("dateOfBirth")] = ModelBase::toJson(m_DateOfBirth);
    }
    if(m_PhoneIsSet)
    {
        val[utility::conversions::to_string_t("phone")] = ModelBase::toJson(m_Phone);
    }
    if(m_CreatedIsSet)
    {
        val[utility::conversions::to_string_t("created")] = ModelBase::toJson(m_Created);
    }
    if(m_LastUpdatedIsSet)
    {
        val[utility::conversions::to_string_t("lastUpdated")] = ModelBase::toJson(m_LastUpdated);
    }
    if(m_PreferencesIsSet)
    {
        val[utility::conversions::to_string_t("preferences")] = ModelBase::toJson(m_Preferences);
    }
    if(m_TFAEnabledIsSet)
    {
        val[utility::conversions::to_string_t("TFAEnabled")] = ModelBase::toJson(m_TFAEnabled);
    }
    if(m_AffiliateIDIsSet)
    {
        val[utility::conversions::to_string_t("affiliateID")] = ModelBase::toJson(m_AffiliateID);
    }
    if(m_CountryIsSet)
    {
        val[utility::conversions::to_string_t("country")] = ModelBase::toJson(m_Country);
    }
    if(m_GeoipCountryIsSet)
    {
        val[utility::conversions::to_string_t("geoipCountry")] = ModelBase::toJson(m_GeoipCountry);
    }
    if(m_GeoipRegionIsSet)
    {
        val[utility::conversions::to_string_t("geoipRegion")] = ModelBase::toJson(m_GeoipRegion);
    }
    if(m_FirstTradeTimestampIsSet)
    {
        val[utility::conversions::to_string_t("firstTradeTimestamp")] = ModelBase::toJson(m_FirstTradeTimestamp);
    }
    if(m_FirstDepositTimestampIsSet)
    {
        val[utility::conversions::to_string_t("firstDepositTimestamp")] = ModelBase::toJson(m_FirstDepositTimestamp);
    }
    if(m_TypIsSet)
    {
        val[utility::conversions::to_string_t("typ")] = ModelBase::toJson(m_Typ);
    }

    return val;
}

void User::fromJson(web::json::value& val)
{
    if(val.has_field(utility::conversions::to_string_t("id")))
    {
        web::json::value& fieldValue = val[utility::conversions::to_string_t("id")];
        if(!fieldValue.is_null())
        {
            setId(ModelBase::int32_tFromJson(fieldValue));
        }
    }
    if(val.has_field(utility::conversions::to_string_t("firstname")))
    {
        web::json::value& fieldValue = val[utility::conversions::to_string_t("firstname")];
        if(!fieldValue.is_null())
        {
            setFirstname(ModelBase::stringFromJson(fieldValue));
        }
    }
    if(val.has_field(utility::conversions::to_string_t("lastname")))
    {
        web::json::value& fieldValue = val[utility::conversions::to_string_t("lastname")];
        if(!fieldValue.is_null())
        {
            setLastname(ModelBase::stringFromJson(fieldValue));
        }
    }
    setUsername(ModelBase::stringFromJson(val[utility::conversions::to_string_t("username")]));
    if(val.has_field(utility::conversions::to_string_t("accountName")))
    {
        web::json::value& fieldValue = val[utility::conversions::to_string_t("accountName")];
        if(!fieldValue.is_null())
        {
            setAccountName(ModelBase::stringFromJson(fieldValue));
        }
    }
    setIsUser(ModelBase::boolFromJson(val[utility::conversions::to_string_t("isUser")]));
    if(val.has_field(utility::conversions::to_string_t("email")))
    {
        web::json::value& fieldValue = val[utility::conversions::to_string_t("email")];
        if(!fieldValue.is_null())
        {
            setEmail(ModelBase::stringFromJson(fieldValue));
        }
    }
    if(val.has_field(utility::conversions::to_string_t("dateOfBirth")))
    {
        web::json::value& fieldValue = val[utility::conversions::to_string_t("dateOfBirth")];
        if(!fieldValue.is_null())
        {
            setDateOfBirth(ModelBase::stringFromJson(fieldValue));
        }
    }
    if(val.has_field(utility::conversions::to_string_t("phone")))
    {
        web::json::value& fieldValue = val[utility::conversions::to_string_t("phone")];
        if(!fieldValue.is_null())
        {
            setPhone(ModelBase::stringFromJson(fieldValue));
        }
    }
    if(val.has_field(utility::conversions::to_string_t("created")))
    {
        web::json::value& fieldValue = val[utility::conversions::to_string_t("created")];
        if(!fieldValue.is_null())
        {
            setCreated(ModelBase::dateFromJson(fieldValue));
        }
    }
    if(val.has_field(utility::conversions::to_string_t("lastUpdated")))
    {
        web::json::value& fieldValue = val[utility::conversions::to_string_t("lastUpdated")];
        if(!fieldValue.is_null())
        {
            setLastUpdated(ModelBase::dateFromJson(fieldValue));
        }
    }
    if(val.has_field(utility::conversions::to_string_t("preferences")))
    {
        web::json::value& fieldValue = val[utility::conversions::to_string_t("preferences")];
        if(!fieldValue.is_null())
        {
            std::shared_ptr<UserPreferences> newItem(new UserPreferences());
            newItem->fromJson(fieldValue);
            setPreferences( newItem );
        }
    }
    if(val.has_field(utility::conversions::to_string_t("TFAEnabled")))
    {
        web::json::value& fieldValue = val[utility::conversions::to_string_t("TFAEnabled")];
        if(!fieldValue.is_null())
        {
            setTFAEnabled(ModelBase::stringFromJson(fieldValue));
        }
    }
    if(val.has_field(utility::conversions::to_string_t("affiliateID")))
    {
        web::json::value& fieldValue = val[utility::conversions::to_string_t("affiliateID")];
        if(!fieldValue.is_null())
        {
            setAffiliateID(ModelBase::stringFromJson(fieldValue));
        }
    }
    if(val.has_field(utility::conversions::to_string_t("country")))
    {
        web::json::value& fieldValue = val[utility::conversions::to_string_t("country")];
        if(!fieldValue.is_null())
        {
            setCountry(ModelBase::stringFromJson(fieldValue));
        }
    }
    if(val.has_field(utility::conversions::to_string_t("geoipCountry")))
    {
        web::json::value& fieldValue = val[utility::conversions::to_string_t("geoipCountry")];
        if(!fieldValue.is_null())
        {
            setGeoipCountry(ModelBase::stringFromJson(fieldValue));
        }
    }
    if(val.has_field(utility::conversions::to_string_t("geoipRegion")))
    {
        web::json::value& fieldValue = val[utility::conversions::to_string_t("geoipRegion")];
        if(!fieldValue.is_null())
        {
            setGeoipRegion(ModelBase::stringFromJson(fieldValue));
        }
    }
    if(val.has_field(utility::conversions::to_string_t("firstTradeTimestamp")))
    {
        web::json::value& fieldValue = val[utility::conversions::to_string_t("firstTradeTimestamp")];
        if(!fieldValue.is_null())
        {
            setFirstTradeTimestamp(ModelBase::dateFromJson(fieldValue));
        }
    }
    if(val.has_field(utility::conversions::to_string_t("firstDepositTimestamp")))
    {
        web::json::value& fieldValue = val[utility::conversions::to_string_t("firstDepositTimestamp")];
        if(!fieldValue.is_null())
        {
            setFirstDepositTimestamp(ModelBase::dateFromJson(fieldValue));
        }
    }
    if(val.has_field(utility::conversions::to_string_t("typ")))
    {
        web::json::value& fieldValue = val[utility::conversions::to_string_t("typ")];
        if(!fieldValue.is_null())
        {
            setTyp(ModelBase::stringFromJson(fieldValue));
        }
    }
}

void User::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }

    if(m_IdIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("id"), m_Id));
    }
    if(m_FirstnameIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("firstname"), m_Firstname));
        
    }
    if(m_LastnameIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("lastname"), m_Lastname));
        
    }
    multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("username"), m_Username));
    if(m_AccountNameIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("accountName"), m_AccountName));
        
    }
    multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("isUser"), m_IsUser));
    if(m_EmailIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("email"), m_Email));
        
    }
    if(m_DateOfBirthIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("dateOfBirth"), m_DateOfBirth));
        
    }
    if(m_PhoneIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("phone"), m_Phone));
        
    }
    if(m_CreatedIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("created"), m_Created));
        
    }
    if(m_LastUpdatedIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("lastUpdated"), m_LastUpdated));
        
    }
    if(m_PreferencesIsSet)
    {
        if (m_Preferences.get())
        {
            m_Preferences->toMultipart(multipart, utility::conversions::to_string_t("preferences."));
        }
        
    }
    if(m_TFAEnabledIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("TFAEnabled"), m_TFAEnabled));
        
    }
    if(m_AffiliateIDIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("affiliateID"), m_AffiliateID));
        
    }
    if(m_CountryIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("country"), m_Country));
        
    }
    if(m_GeoipCountryIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("geoipCountry"), m_GeoipCountry));
        
    }
    if(m_GeoipRegionIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("geoipRegion"), m_GeoipRegion));
        
    }
    if(m_FirstTradeTimestampIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("firstTradeTimestamp"), m_FirstTradeTimestamp));
        
    }
    if(m_FirstDepositTimestampIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("firstDepositTimestamp"), m_FirstDepositTimestamp));
        
    }
    if(m_TypIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("typ"), m_Typ));
        
    }
}

void User::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }

    if(multipart->hasContent(utility::conversions::to_string_t("id")))
    {
        setId(ModelBase::int32_tFromHttpContent(multipart->getContent(utility::conversions::to_string_t("id"))));
    }
    if(multipart->hasContent(utility::conversions::to_string_t("firstname")))
    {
        setFirstname(ModelBase::stringFromHttpContent(multipart->getContent(utility::conversions::to_string_t("firstname"))));
    }
    if(multipart->hasContent(utility::conversions::to_string_t("lastname")))
    {
        setLastname(ModelBase::stringFromHttpContent(multipart->getContent(utility::conversions::to_string_t("lastname"))));
    }
    setUsername(ModelBase::stringFromHttpContent(multipart->getContent(utility::conversions::to_string_t("username"))));
    if(multipart->hasContent(utility::conversions::to_string_t("accountName")))
    {
        setAccountName(ModelBase::stringFromHttpContent(multipart->getContent(utility::conversions::to_string_t("accountName"))));
    }
    setIsUser(ModelBase::boolFromHttpContent(multipart->getContent(utility::conversions::to_string_t("isUser"))));
    if(multipart->hasContent(utility::conversions::to_string_t("email")))
    {
        setEmail(ModelBase::stringFromHttpContent(multipart->getContent(utility::conversions::to_string_t("email"))));
    }
    if(multipart->hasContent(utility::conversions::to_string_t("dateOfBirth")))
    {
        setDateOfBirth(ModelBase::stringFromHttpContent(multipart->getContent(utility::conversions::to_string_t("dateOfBirth"))));
    }
    if(multipart->hasContent(utility::conversions::to_string_t("phone")))
    {
        setPhone(ModelBase::stringFromHttpContent(multipart->getContent(utility::conversions::to_string_t("phone"))));
    }
    if(multipart->hasContent(utility::conversions::to_string_t("created")))
    {
        setCreated(ModelBase::dateFromHttpContent(multipart->getContent(utility::conversions::to_string_t("created"))));
    }
    if(multipart->hasContent(utility::conversions::to_string_t("lastUpdated")))
    {
        setLastUpdated(ModelBase::dateFromHttpContent(multipart->getContent(utility::conversions::to_string_t("lastUpdated"))));
    }
    if(multipart->hasContent(utility::conversions::to_string_t("preferences")))
    {
        if(multipart->hasContent(utility::conversions::to_string_t("preferences")))
        {
            std::shared_ptr<UserPreferences> newItem(new UserPreferences());
            newItem->fromMultiPart(multipart, utility::conversions::to_string_t("preferences."));
            setPreferences( newItem );
        }
    }
    if(multipart->hasContent(utility::conversions::to_string_t("TFAEnabled")))
    {
        setTFAEnabled(ModelBase::stringFromHttpContent(multipart->getContent(utility::conversions::to_string_t("TFAEnabled"))));
    }
    if(multipart->hasContent(utility::conversions::to_string_t("affiliateID")))
    {
        setAffiliateID(ModelBase::stringFromHttpContent(multipart->getContent(utility::conversions::to_string_t("affiliateID"))));
    }
    if(multipart->hasContent(utility::conversions::to_string_t("country")))
    {
        setCountry(ModelBase::stringFromHttpContent(multipart->getContent(utility::conversions::to_string_t("country"))));
    }
    if(multipart->hasContent(utility::conversions::to_string_t("geoipCountry")))
    {
        setGeoipCountry(ModelBase::stringFromHttpContent(multipart->getContent(utility::conversions::to_string_t("geoipCountry"))));
    }
    if(multipart->hasContent(utility::conversions::to_string_t("geoipRegion")))
    {
        setGeoipRegion(ModelBase::stringFromHttpContent(multipart->getContent(utility::conversions::to_string_t("geoipRegion"))));
    }
    if(multipart->hasContent(utility::conversions::to_string_t("firstTradeTimestamp")))
    {
        setFirstTradeTimestamp(ModelBase::dateFromHttpContent(multipart->getContent(utility::conversions::to_string_t("firstTradeTimestamp"))));
    }
    if(multipart->hasContent(utility::conversions::to_string_t("firstDepositTimestamp")))
    {
        setFirstDepositTimestamp(ModelBase::dateFromHttpContent(multipart->getContent(utility::conversions::to_string_t("firstDepositTimestamp"))));
    }
    if(multipart->hasContent(utility::conversions::to_string_t("typ")))
    {
        setTyp(ModelBase::stringFromHttpContent(multipart->getContent(utility::conversions::to_string_t("typ"))));
    }
}

int32_t User::getId() const
{
    return m_Id;
}


void User::setId(int32_t value)
{
    m_Id = value;
    m_IdIsSet = true;
}
bool User::idIsSet() const
{
    return m_IdIsSet;
}

void User::unsetId()
{
    m_IdIsSet = false;
}

utility::string_t User::getFirstname() const
{
    return m_Firstname;
}


void User::setFirstname(utility::string_t value)
{
    m_Firstname = value;
    m_FirstnameIsSet = true;
}
bool User::firstnameIsSet() const
{
    return m_FirstnameIsSet;
}

void User::unsetFirstname()
{
    m_FirstnameIsSet = false;
}

utility::string_t User::getLastname() const
{
    return m_Lastname;
}


void User::setLastname(utility::string_t value)
{
    m_Lastname = value;
    m_LastnameIsSet = true;
}
bool User::lastnameIsSet() const
{
    return m_LastnameIsSet;
}

void User::unsetLastname()
{
    m_LastnameIsSet = false;
}

utility::string_t User::getUsername() const
{
    return m_Username;
}


void User::setUsername(utility::string_t value)
{
    m_Username = value;
    
}
utility::string_t User::getAccountName() const
{
    return m_AccountName;
}


void User::setAccountName(utility::string_t value)
{
    m_AccountName = value;
    m_AccountNameIsSet = true;
}
bool User::accountNameIsSet() const
{
    return m_AccountNameIsSet;
}

void User::unsetAccountName()
{
    m_AccountNameIsSet = false;
}

bool User::isIsUser() const
{
    return m_IsUser;
}


void User::setIsUser(bool value)
{
    m_IsUser = value;
    
}
utility::string_t User::getEmail() const
{
    return m_Email;
}


void User::setEmail(utility::string_t value)
{
    m_Email = value;
    m_EmailIsSet = true;
}
bool User::emailIsSet() const
{
    return m_EmailIsSet;
}

void User::unsetEmail()
{
    m_EmailIsSet = false;
}

utility::string_t User::getDateOfBirth() const
{
    return m_DateOfBirth;
}


void User::setDateOfBirth(utility::string_t value)
{
    m_DateOfBirth = value;
    m_DateOfBirthIsSet = true;
}
bool User::dateOfBirthIsSet() const
{
    return m_DateOfBirthIsSet;
}

void User::unsetDateOfBirth()
{
    m_DateOfBirthIsSet = false;
}

utility::string_t User::getPhone() const
{
    return m_Phone;
}


void User::setPhone(utility::string_t value)
{
    m_Phone = value;
    m_PhoneIsSet = true;
}
bool User::phoneIsSet() const
{
    return m_PhoneIsSet;
}

void User::unsetPhone()
{
    m_PhoneIsSet = false;
}

utility::datetime User::getCreated() const
{
    return m_Created;
}


void User::setCreated(utility::datetime value)
{
    m_Created = value;
    m_CreatedIsSet = true;
}
bool User::createdIsSet() const
{
    return m_CreatedIsSet;
}

void User::unsetCreated()
{
    m_CreatedIsSet = false;
}

utility::datetime User::getLastUpdated() const
{
    return m_LastUpdated;
}


void User::setLastUpdated(utility::datetime value)
{
    m_LastUpdated = value;
    m_LastUpdatedIsSet = true;
}
bool User::lastUpdatedIsSet() const
{
    return m_LastUpdatedIsSet;
}

void User::unsetLastUpdated()
{
    m_LastUpdatedIsSet = false;
}

std::shared_ptr<UserPreferences> User::getPreferences() const
{
    return m_Preferences;
}


void User::setPreferences(std::shared_ptr<UserPreferences> value)
{
    m_Preferences = value;
    m_PreferencesIsSet = true;
}
bool User::preferencesIsSet() const
{
    return m_PreferencesIsSet;
}

void User::unsetPreferences()
{
    m_PreferencesIsSet = false;
}

utility::string_t User::getTFAEnabled() const
{
    return m_TFAEnabled;
}


void User::setTFAEnabled(utility::string_t value)
{
    m_TFAEnabled = value;
    m_TFAEnabledIsSet = true;
}
bool User::tFAEnabledIsSet() const
{
    return m_TFAEnabledIsSet;
}

void User::unsetTFAEnabled()
{
    m_TFAEnabledIsSet = false;
}

utility::string_t User::getAffiliateID() const
{
    return m_AffiliateID;
}


void User::setAffiliateID(utility::string_t value)
{
    m_AffiliateID = value;
    m_AffiliateIDIsSet = true;
}
bool User::affiliateIDIsSet() const
{
    return m_AffiliateIDIsSet;
}

void User::unsetAffiliateID()
{
    m_AffiliateIDIsSet = false;
}

utility::string_t User::getCountry() const
{
    return m_Country;
}


void User::setCountry(utility::string_t value)
{
    m_Country = value;
    m_CountryIsSet = true;
}
bool User::countryIsSet() const
{
    return m_CountryIsSet;
}

void User::unsetCountry()
{
    m_CountryIsSet = false;
}

utility::string_t User::getGeoipCountry() const
{
    return m_GeoipCountry;
}


void User::setGeoipCountry(utility::string_t value)
{
    m_GeoipCountry = value;
    m_GeoipCountryIsSet = true;
}
bool User::geoipCountryIsSet() const
{
    return m_GeoipCountryIsSet;
}

void User::unsetGeoipCountry()
{
    m_GeoipCountryIsSet = false;
}

utility::string_t User::getGeoipRegion() const
{
    return m_GeoipRegion;
}


void User::setGeoipRegion(utility::string_t value)
{
    m_GeoipRegion = value;
    m_GeoipRegionIsSet = true;
}
bool User::geoipRegionIsSet() const
{
    return m_GeoipRegionIsSet;
}

void User::unsetGeoipRegion()
{
    m_GeoipRegionIsSet = false;
}

utility::datetime User::getFirstTradeTimestamp() const
{
    return m_FirstTradeTimestamp;
}


void User::setFirstTradeTimestamp(utility::datetime value)
{
    m_FirstTradeTimestamp = value;
    m_FirstTradeTimestampIsSet = true;
}
bool User::firstTradeTimestampIsSet() const
{
    return m_FirstTradeTimestampIsSet;
}

void User::unsetFirstTradeTimestamp()
{
    m_FirstTradeTimestampIsSet = false;
}

utility::datetime User::getFirstDepositTimestamp() const
{
    return m_FirstDepositTimestamp;
}


void User::setFirstDepositTimestamp(utility::datetime value)
{
    m_FirstDepositTimestamp = value;
    m_FirstDepositTimestampIsSet = true;
}
bool User::firstDepositTimestampIsSet() const
{
    return m_FirstDepositTimestampIsSet;
}

void User::unsetFirstDepositTimestamp()
{
    m_FirstDepositTimestampIsSet = false;
}

utility::string_t User::getTyp() const
{
    return m_Typ;
}


void User::setTyp(utility::string_t value)
{
    m_Typ = value;
    m_TypIsSet = true;
}
bool User::typIsSet() const
{
    return m_TypIsSet;
}

void User::unsetTyp()
{
    m_TypIsSet = false;
}

}
}
}
}

