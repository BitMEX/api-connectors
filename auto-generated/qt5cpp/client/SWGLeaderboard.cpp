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


#include "SWGLeaderboard.h"

#include "SWGHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace Swagger {

SWGLeaderboard::SWGLeaderboard(QString json) {
    init();
    this->fromJson(json);
}

SWGLeaderboard::SWGLeaderboard() {
    init();
}

SWGLeaderboard::~SWGLeaderboard() {
    this->cleanup();
}

void
SWGLeaderboard::init() {
    name = new QString("");
    m_name_isSet = false;
    is_real_name = false;
    m_is_real_name_isSet = false;
    profit = 0.0;
    m_profit_isSet = false;
}

void
SWGLeaderboard::cleanup() {
    if(name != nullptr) { 
        delete name;
    }


}

SWGLeaderboard*
SWGLeaderboard::fromJson(QString json) {
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
    return this;
}

void
SWGLeaderboard::fromJsonObject(QJsonObject pJson) {
    ::Swagger::setValue(&name, pJson["name"], "QString", "QString");
    
    ::Swagger::setValue(&is_real_name, pJson["isRealName"], "bool", "");
    
    ::Swagger::setValue(&profit, pJson["profit"], "double", "");
    
}

QString
SWGLeaderboard::asJson ()
{
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject
SWGLeaderboard::asJsonObject() {
    QJsonObject obj;
    if(name != nullptr && *name != QString("")){
        toJsonValue(QString("name"), name, obj, QString("QString"));
    }
    if(m_is_real_name_isSet){
        obj.insert("isRealName", QJsonValue(is_real_name));
    }
    if(m_profit_isSet){
        obj.insert("profit", QJsonValue(profit));
    }

    return obj;
}

QString*
SWGLeaderboard::getName() {
    return name;
}
void
SWGLeaderboard::setName(QString* name) {
    this->name = name;
    this->m_name_isSet = true;
}

bool
SWGLeaderboard::isIsRealName() {
    return is_real_name;
}
void
SWGLeaderboard::setIsRealName(bool is_real_name) {
    this->is_real_name = is_real_name;
    this->m_is_real_name_isSet = true;
}

double
SWGLeaderboard::getProfit() {
    return profit;
}
void
SWGLeaderboard::setProfit(double profit) {
    this->profit = profit;
    this->m_profit_isSet = true;
}


bool
SWGLeaderboard::isSet(){
    bool isObjectUpdated = false;
    do{
        if(name != nullptr && *name != QString("")){ isObjectUpdated = true; break;}
        if(m_is_real_name_isSet){ isObjectUpdated = true; break;}
        if(m_profit_isSet){ isObjectUpdated = true; break;}
    }while(false);
    return isObjectUpdated;
}
}

