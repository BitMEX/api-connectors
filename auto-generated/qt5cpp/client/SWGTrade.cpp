/**
 * BitMEX API
 * ## REST API for the BitMEX Trading Platform  _If you are building automated tools, please subscribe to the_ _[BitMEX API RSS Feed](https://blog.bitmex.com/api_announcement/feed/) for changes. The feed will be updated_ _regularly and is the most reliable way to get downtime and update announcements._  [View Changelog](/app/apiChangelog)  -  #### Getting Started  Base URI: [https://www.bitmex.com/api/v1](/api/v1)  ##### Fetching Data  All REST endpoints are documented below. You can try out any query right from this interface.  Most table queries accept `count`, `start`, and `reverse` params. Set `reverse=true` to get rows newest-first.  Additional documentation regarding filters, timestamps, and authentication is available in [the main API documentation](/app/restAPI).  _All_ table data is available via the [Websocket](/app/wsAPI). We highly recommend using the socket if you want to have the quickest possible data without being subject to ratelimits.  ##### Return Types  By default, all data is returned as JSON. Send `?_format=csv` to get CSV data or `?_format=xml` to get XML data.  ##### Trade Data Queries  _This is only a small subset of what is available, to get you started._  Fill in the parameters and click the `Try it out!` button to try any of these queries.  - [Pricing Data](#!/Quote/Quote_get)  - [Trade Data](#!/Trade/Trade_get)  - [OrderBook Data](#!/OrderBook/OrderBook_getL2)  - [Settlement Data](#!/Settlement/Settlement_get)  - [Exchange Statistics](#!/Stats/Stats_history)  Every function of the BitMEX.com platform is exposed here and documented. Many more functions are available.  ##### Swagger Specification  [⇩ Download Swagger JSON](swagger.json)  -  ## All API Endpoints  Click to expand a section. 
 *
 * OpenAPI spec version: 1.2.0
 * Contact: support@bitmex.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


#include "SWGTrade.h"

#include "SWGHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace Swagger {

SWGTrade::SWGTrade(QString json) {
    init();
    this->fromJson(json);
}

SWGTrade::SWGTrade() {
    init();
}

SWGTrade::~SWGTrade() {
    this->cleanup();
}

void
SWGTrade::init() {
    timestamp = NULL;
    m_timestamp_isSet = false;
    symbol = new QString("");
    m_symbol_isSet = false;
    side = new QString("");
    m_side_isSet = false;
    size = 0L;
    m_size_isSet = false;
    price = 0.0;
    m_price_isSet = false;
    tick_direction = new QString("");
    m_tick_direction_isSet = false;
    trd_match_id = new QString("");
    m_trd_match_id_isSet = false;
    gross_value = 0L;
    m_gross_value_isSet = false;
    home_notional = 0.0;
    m_home_notional_isSet = false;
    foreign_notional = 0.0;
    m_foreign_notional_isSet = false;
    trd_type = new QString("");
    m_trd_type_isSet = false;
}

void
SWGTrade::cleanup() {
    if(timestamp != nullptr) { 
        delete timestamp;
    }
    if(symbol != nullptr) { 
        delete symbol;
    }
    if(side != nullptr) { 
        delete side;
    }


    if(tick_direction != nullptr) { 
        delete tick_direction;
    }
    if(trd_match_id != nullptr) { 
        delete trd_match_id;
    }



    if(trd_type != nullptr) { 
        delete trd_type;
    }
}

SWGTrade*
SWGTrade::fromJson(QString json) {
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
    return this;
}

void
SWGTrade::fromJsonObject(QJsonObject pJson) {
    ::Swagger::setValue(&timestamp, pJson["timestamp"], "QDateTime", "QDateTime");
    
    ::Swagger::setValue(&symbol, pJson["symbol"], "QString", "QString");
    
    ::Swagger::setValue(&side, pJson["side"], "QString", "QString");
    
    ::Swagger::setValue(&size, pJson["size"], "qint64", "");
    
    ::Swagger::setValue(&price, pJson["price"], "double", "");
    
    ::Swagger::setValue(&tick_direction, pJson["tickDirection"], "QString", "QString");
    
    ::Swagger::setValue(&trd_match_id, pJson["trdMatchID"], "QString", "QString");
    
    ::Swagger::setValue(&gross_value, pJson["grossValue"], "qint64", "");
    
    ::Swagger::setValue(&home_notional, pJson["homeNotional"], "double", "");
    
    ::Swagger::setValue(&foreign_notional, pJson["foreignNotional"], "double", "");
    
    ::Swagger::setValue(&trd_type, pJson["trdType"], "QString", "QString");
    
}

QString
SWGTrade::asJson ()
{
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject
SWGTrade::asJsonObject() {
    QJsonObject obj;
    if(timestamp != nullptr) { 
        toJsonValue(QString("timestamp"), timestamp, obj, QString("QDateTime"));
    }
    if(symbol != nullptr && *symbol != QString("")){
        toJsonValue(QString("symbol"), symbol, obj, QString("QString"));
    }
    if(side != nullptr && *side != QString("")){
        toJsonValue(QString("side"), side, obj, QString("QString"));
    }
    if(m_size_isSet){
        obj.insert("size", QJsonValue(size));
    }
    if(m_price_isSet){
        obj.insert("price", QJsonValue(price));
    }
    if(tick_direction != nullptr && *tick_direction != QString("")){
        toJsonValue(QString("tickDirection"), tick_direction, obj, QString("QString"));
    }
    if(trd_match_id != nullptr && *trd_match_id != QString("")){
        toJsonValue(QString("trdMatchID"), trd_match_id, obj, QString("QString"));
    }
    if(m_gross_value_isSet){
        obj.insert("grossValue", QJsonValue(gross_value));
    }
    if(m_home_notional_isSet){
        obj.insert("homeNotional", QJsonValue(home_notional));
    }
    if(m_foreign_notional_isSet){
        obj.insert("foreignNotional", QJsonValue(foreign_notional));
    }
    if(trd_type != nullptr && *trd_type != QString("")){
        toJsonValue(QString("trdType"), trd_type, obj, QString("QString"));
    }

    return obj;
}

QDateTime*
SWGTrade::getTimestamp() {
    return timestamp;
}
void
SWGTrade::setTimestamp(QDateTime* timestamp) {
    this->timestamp = timestamp;
    this->m_timestamp_isSet = true;
}

QString*
SWGTrade::getSymbol() {
    return symbol;
}
void
SWGTrade::setSymbol(QString* symbol) {
    this->symbol = symbol;
    this->m_symbol_isSet = true;
}

QString*
SWGTrade::getSide() {
    return side;
}
void
SWGTrade::setSide(QString* side) {
    this->side = side;
    this->m_side_isSet = true;
}

qint64
SWGTrade::getSize() {
    return size;
}
void
SWGTrade::setSize(qint64 size) {
    this->size = size;
    this->m_size_isSet = true;
}

double
SWGTrade::getPrice() {
    return price;
}
void
SWGTrade::setPrice(double price) {
    this->price = price;
    this->m_price_isSet = true;
}

QString*
SWGTrade::getTickDirection() {
    return tick_direction;
}
void
SWGTrade::setTickDirection(QString* tick_direction) {
    this->tick_direction = tick_direction;
    this->m_tick_direction_isSet = true;
}

QString*
SWGTrade::getTrdMatchId() {
    return trd_match_id;
}
void
SWGTrade::setTrdMatchId(QString* trd_match_id) {
    this->trd_match_id = trd_match_id;
    this->m_trd_match_id_isSet = true;
}

qint64
SWGTrade::getGrossValue() {
    return gross_value;
}
void
SWGTrade::setGrossValue(qint64 gross_value) {
    this->gross_value = gross_value;
    this->m_gross_value_isSet = true;
}

double
SWGTrade::getHomeNotional() {
    return home_notional;
}
void
SWGTrade::setHomeNotional(double home_notional) {
    this->home_notional = home_notional;
    this->m_home_notional_isSet = true;
}

double
SWGTrade::getForeignNotional() {
    return foreign_notional;
}
void
SWGTrade::setForeignNotional(double foreign_notional) {
    this->foreign_notional = foreign_notional;
    this->m_foreign_notional_isSet = true;
}

QString*
SWGTrade::getTrdType() {
    return trd_type;
}
void
SWGTrade::setTrdType(QString* trd_type) {
    this->trd_type = trd_type;
    this->m_trd_type_isSet = true;
}


bool
SWGTrade::isSet(){
    bool isObjectUpdated = false;
    do{
        
        if(symbol != nullptr && *symbol != QString("")){ isObjectUpdated = true; break;}
        if(side != nullptr && *side != QString("")){ isObjectUpdated = true; break;}
        if(m_size_isSet){ isObjectUpdated = true; break;}
        if(m_price_isSet){ isObjectUpdated = true; break;}
        if(tick_direction != nullptr && *tick_direction != QString("")){ isObjectUpdated = true; break;}
        if(trd_match_id != nullptr && *trd_match_id != QString("")){ isObjectUpdated = true; break;}
        if(m_gross_value_isSet){ isObjectUpdated = true; break;}
        if(m_home_notional_isSet){ isObjectUpdated = true; break;}
        if(m_foreign_notional_isSet){ isObjectUpdated = true; break;}
        if(trd_type != nullptr && *trd_type != QString("")){ isObjectUpdated = true; break;}
    }while(false);
    return isObjectUpdated;
}
}

