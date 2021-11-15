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


#include "SWGStats.h"

#include "SWGHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace Swagger {

SWGStats::SWGStats(QString json) {
    init();
    this->fromJson(json);
}

SWGStats::SWGStats() {
    init();
}

SWGStats::~SWGStats() {
    this->cleanup();
}

void
SWGStats::init() {
    root_symbol = new QString("");
    m_root_symbol_isSet = false;
    currency = new QString("");
    m_currency_isSet = false;
    volume24h = 0.0;
    m_volume24h_isSet = false;
    turnover24h = 0.0;
    m_turnover24h_isSet = false;
    open_interest = 0.0;
    m_open_interest_isSet = false;
    open_value = 0.0;
    m_open_value_isSet = false;
}

void
SWGStats::cleanup() {
    if(root_symbol != nullptr) { 
        delete root_symbol;
    }
    if(currency != nullptr) { 
        delete currency;
    }
    if(volume24h != nullptr) { 
        delete volume24h;
    }
    if(turnover24h != nullptr) { 
        delete turnover24h;
    }
    if(open_interest != nullptr) { 
        delete open_interest;
    }
    if(open_value != nullptr) { 
        delete open_value;
    }
}

SWGStats*
SWGStats::fromJson(QString json) {
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
    return this;
}

void
SWGStats::fromJsonObject(QJsonObject pJson) {
    ::Swagger::setValue(&root_symbol, pJson["rootSymbol"], "QString", "QString");
    
    ::Swagger::setValue(&currency, pJson["currency"], "QString", "QString");
    
    ::Swagger::setValue(&volume24h, pJson["volume24h"], "SWGNumber", "SWGNumber");
    
    ::Swagger::setValue(&turnover24h, pJson["turnover24h"], "SWGNumber", "SWGNumber");
    
    ::Swagger::setValue(&open_interest, pJson["openInterest"], "SWGNumber", "SWGNumber");
    
    ::Swagger::setValue(&open_value, pJson["openValue"], "SWGNumber", "SWGNumber");
    
}

QString
SWGStats::asJson ()
{
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject
SWGStats::asJsonObject() {
    QJsonObject obj;
    if(root_symbol != nullptr && *root_symbol != QString("")){
        toJsonValue(QString("rootSymbol"), root_symbol, obj, QString("QString"));
    }
    if(currency != nullptr && *currency != QString("")){
        toJsonValue(QString("currency"), currency, obj, QString("QString"));
    }
    if((volume24h != nullptr) && (volume24h->isSet())){
        toJsonValue(QString("volume24h"), volume24h, obj, QString("SWGNumber"));
    }
    if((turnover24h != nullptr) && (turnover24h->isSet())){
        toJsonValue(QString("turnover24h"), turnover24h, obj, QString("SWGNumber"));
    }
    if((open_interest != nullptr) && (open_interest->isSet())){
        toJsonValue(QString("openInterest"), open_interest, obj, QString("SWGNumber"));
    }
    if((open_value != nullptr) && (open_value->isSet())){
        toJsonValue(QString("openValue"), open_value, obj, QString("SWGNumber"));
    }

    return obj;
}

QString*
SWGStats::getRootSymbol() {
    return root_symbol;
}
void
SWGStats::setRootSymbol(QString* root_symbol) {
    this->root_symbol = root_symbol;
    this->m_root_symbol_isSet = true;
}

QString*
SWGStats::getCurrency() {
    return currency;
}
void
SWGStats::setCurrency(QString* currency) {
    this->currency = currency;
    this->m_currency_isSet = true;
}

SWGNumber*
SWGStats::getVolume24h() {
    return volume24h;
}
void
SWGStats::setVolume24h(SWGNumber* volume24h) {
    this->volume24h = volume24h;
    this->m_volume24h_isSet = true;
}

SWGNumber*
SWGStats::getTurnover24h() {
    return turnover24h;
}
void
SWGStats::setTurnover24h(SWGNumber* turnover24h) {
    this->turnover24h = turnover24h;
    this->m_turnover24h_isSet = true;
}

SWGNumber*
SWGStats::getOpenInterest() {
    return open_interest;
}
void
SWGStats::setOpenInterest(SWGNumber* open_interest) {
    this->open_interest = open_interest;
    this->m_open_interest_isSet = true;
}

SWGNumber*
SWGStats::getOpenValue() {
    return open_value;
}
void
SWGStats::setOpenValue(SWGNumber* open_value) {
    this->open_value = open_value;
    this->m_open_value_isSet = true;
}


bool
SWGStats::isSet(){
    bool isObjectUpdated = false;
    do{
        if(root_symbol != nullptr && *root_symbol != QString("")){ isObjectUpdated = true; break;}
        if(currency != nullptr && *currency != QString("")){ isObjectUpdated = true; break;}
        if(volume24h != nullptr && volume24h->isSet()){ isObjectUpdated = true; break;}
        if(turnover24h != nullptr && turnover24h->isSet()){ isObjectUpdated = true; break;}
        if(open_interest != nullptr && open_interest->isSet()){ isObjectUpdated = true; break;}
        if(open_value != nullptr && open_value->isSet()){ isObjectUpdated = true; break;}
    }while(false);
    return isObjectUpdated;
}
}

