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


#include "SWGAddress.h"

#include "SWGHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace Swagger {

SWGAddress::SWGAddress(QString json) {
    init();
    this->fromJson(json);
}

SWGAddress::SWGAddress() {
    init();
}

SWGAddress::~SWGAddress() {
    this->cleanup();
}

void
SWGAddress::init() {
    id = 0;
    m_id_isSet = false;
    currency = new QString("");
    m_currency_isSet = false;
    created = NULL;
    m_created_isSet = false;
    user_id = 0.0;
    m_user_id_isSet = false;
    address = new QString("");
    m_address_isSet = false;
    name = new QString("");
    m_name_isSet = false;
    note = new QString("");
    m_note_isSet = false;
    skip_confirm = false;
    m_skip_confirm_isSet = false;
    skip_confirm_verified = false;
    m_skip_confirm_verified_isSet = false;
    skip2_fa = false;
    m_skip2_fa_isSet = false;
    skip2_fa_verified = false;
    m_skip2_fa_verified_isSet = false;
    network = new QString("");
    m_network_isSet = false;
    memo = new QString("");
    m_memo_isSet = false;
}

void
SWGAddress::cleanup() {

    if(currency != nullptr) { 
        delete currency;
    }
    if(created != nullptr) { 
        delete created;
    }

    if(address != nullptr) { 
        delete address;
    }
    if(name != nullptr) { 
        delete name;
    }
    if(note != nullptr) { 
        delete note;
    }




    if(network != nullptr) { 
        delete network;
    }
    if(memo != nullptr) { 
        delete memo;
    }
}

SWGAddress*
SWGAddress::fromJson(QString json) {
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
    return this;
}

void
SWGAddress::fromJsonObject(QJsonObject pJson) {
    ::Swagger::setValue(&id, pJson["id"], "qint32", "");
    
    ::Swagger::setValue(&currency, pJson["currency"], "QString", "QString");
    
    ::Swagger::setValue(&created, pJson["created"], "QDateTime", "QDateTime");
    
    ::Swagger::setValue(&user_id, pJson["userId"], "double", "");
    
    ::Swagger::setValue(&address, pJson["address"], "QString", "QString");
    
    ::Swagger::setValue(&name, pJson["name"], "QString", "QString");
    
    ::Swagger::setValue(&note, pJson["note"], "QString", "QString");
    
    ::Swagger::setValue(&skip_confirm, pJson["skipConfirm"], "bool", "");
    
    ::Swagger::setValue(&skip_confirm_verified, pJson["skipConfirmVerified"], "bool", "");
    
    ::Swagger::setValue(&skip2_fa, pJson["skip2FA"], "bool", "");
    
    ::Swagger::setValue(&skip2_fa_verified, pJson["skip2FAVerified"], "bool", "");
    
    ::Swagger::setValue(&network, pJson["network"], "QString", "QString");
    
    ::Swagger::setValue(&memo, pJson["memo"], "QString", "QString");
    
}

QString
SWGAddress::asJson ()
{
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject
SWGAddress::asJsonObject() {
    QJsonObject obj;
    if(m_id_isSet){
        obj.insert("id", QJsonValue(id));
    }
    if(currency != nullptr && *currency != QString("")){
        toJsonValue(QString("currency"), currency, obj, QString("QString"));
    }
    if(created != nullptr) { 
        toJsonValue(QString("created"), created, obj, QString("QDateTime"));
    }
    if(m_user_id_isSet){
        obj.insert("userId", QJsonValue(user_id));
    }
    if(address != nullptr && *address != QString("")){
        toJsonValue(QString("address"), address, obj, QString("QString"));
    }
    if(name != nullptr && *name != QString("")){
        toJsonValue(QString("name"), name, obj, QString("QString"));
    }
    if(note != nullptr && *note != QString("")){
        toJsonValue(QString("note"), note, obj, QString("QString"));
    }
    if(m_skip_confirm_isSet){
        obj.insert("skipConfirm", QJsonValue(skip_confirm));
    }
    if(m_skip_confirm_verified_isSet){
        obj.insert("skipConfirmVerified", QJsonValue(skip_confirm_verified));
    }
    if(m_skip2_fa_isSet){
        obj.insert("skip2FA", QJsonValue(skip2_fa));
    }
    if(m_skip2_fa_verified_isSet){
        obj.insert("skip2FAVerified", QJsonValue(skip2_fa_verified));
    }
    if(network != nullptr && *network != QString("")){
        toJsonValue(QString("network"), network, obj, QString("QString"));
    }
    if(memo != nullptr && *memo != QString("")){
        toJsonValue(QString("memo"), memo, obj, QString("QString"));
    }

    return obj;
}

qint32
SWGAddress::getId() {
    return id;
}
void
SWGAddress::setId(qint32 id) {
    this->id = id;
    this->m_id_isSet = true;
}

QString*
SWGAddress::getCurrency() {
    return currency;
}
void
SWGAddress::setCurrency(QString* currency) {
    this->currency = currency;
    this->m_currency_isSet = true;
}

QDateTime*
SWGAddress::getCreated() {
    return created;
}
void
SWGAddress::setCreated(QDateTime* created) {
    this->created = created;
    this->m_created_isSet = true;
}

double
SWGAddress::getUserId() {
    return user_id;
}
void
SWGAddress::setUserId(double user_id) {
    this->user_id = user_id;
    this->m_user_id_isSet = true;
}

QString*
SWGAddress::getAddress() {
    return address;
}
void
SWGAddress::setAddress(QString* address) {
    this->address = address;
    this->m_address_isSet = true;
}

QString*
SWGAddress::getName() {
    return name;
}
void
SWGAddress::setName(QString* name) {
    this->name = name;
    this->m_name_isSet = true;
}

QString*
SWGAddress::getNote() {
    return note;
}
void
SWGAddress::setNote(QString* note) {
    this->note = note;
    this->m_note_isSet = true;
}

bool
SWGAddress::isSkipConfirm() {
    return skip_confirm;
}
void
SWGAddress::setSkipConfirm(bool skip_confirm) {
    this->skip_confirm = skip_confirm;
    this->m_skip_confirm_isSet = true;
}

bool
SWGAddress::isSkipConfirmVerified() {
    return skip_confirm_verified;
}
void
SWGAddress::setSkipConfirmVerified(bool skip_confirm_verified) {
    this->skip_confirm_verified = skip_confirm_verified;
    this->m_skip_confirm_verified_isSet = true;
}

bool
SWGAddress::isSkip2Fa() {
    return skip2_fa;
}
void
SWGAddress::setSkip2Fa(bool skip2_fa) {
    this->skip2_fa = skip2_fa;
    this->m_skip2_fa_isSet = true;
}

bool
SWGAddress::isSkip2FaVerified() {
    return skip2_fa_verified;
}
void
SWGAddress::setSkip2FaVerified(bool skip2_fa_verified) {
    this->skip2_fa_verified = skip2_fa_verified;
    this->m_skip2_fa_verified_isSet = true;
}

QString*
SWGAddress::getNetwork() {
    return network;
}
void
SWGAddress::setNetwork(QString* network) {
    this->network = network;
    this->m_network_isSet = true;
}

QString*
SWGAddress::getMemo() {
    return memo;
}
void
SWGAddress::setMemo(QString* memo) {
    this->memo = memo;
    this->m_memo_isSet = true;
}


bool
SWGAddress::isSet(){
    bool isObjectUpdated = false;
    do{
        if(m_id_isSet){ isObjectUpdated = true; break;}
        if(currency != nullptr && *currency != QString("")){ isObjectUpdated = true; break;}
        
        if(m_user_id_isSet){ isObjectUpdated = true; break;}
        if(address != nullptr && *address != QString("")){ isObjectUpdated = true; break;}
        if(name != nullptr && *name != QString("")){ isObjectUpdated = true; break;}
        if(note != nullptr && *note != QString("")){ isObjectUpdated = true; break;}
        if(m_skip_confirm_isSet){ isObjectUpdated = true; break;}
        if(m_skip_confirm_verified_isSet){ isObjectUpdated = true; break;}
        if(m_skip2_fa_isSet){ isObjectUpdated = true; break;}
        if(m_skip2_fa_verified_isSet){ isObjectUpdated = true; break;}
        if(network != nullptr && *network != QString("")){ isObjectUpdated = true; break;}
        if(memo != nullptr && *memo != QString("")){ isObjectUpdated = true; break;}
    }while(false);
    return isObjectUpdated;
}
}

