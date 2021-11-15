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


#include "SWGUserPreferences.h"

#include "SWGHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace Swagger {

SWGUserPreferences::SWGUserPreferences(QString json) {
    init();
    this->fromJson(json);
}

SWGUserPreferences::SWGUserPreferences() {
    init();
}

SWGUserPreferences::~SWGUserPreferences() {
    this->cleanup();
}

void
SWGUserPreferences::init() {
    alert_on_liquidations = false;
    m_alert_on_liquidations_isSet = false;
    animations_enabled = false;
    m_animations_enabled_isSet = false;
    announcements_last_seen = NULL;
    m_announcements_last_seen_isSet = false;
    chat_channel_id = 0.0;
    m_chat_channel_id_isSet = false;
    color_theme = new QString("");
    m_color_theme_isSet = false;
    currency = new QString("");
    m_currency_isSet = false;
    debug = false;
    m_debug_isSet = false;
    disable_emails = new QList<QString*>();
    m_disable_emails_isSet = false;
    disable_push = new QList<QString*>();
    m_disable_push_isSet = false;
    hide_confirm_dialogs = new QList<QString*>();
    m_hide_confirm_dialogs_isSet = false;
    hide_connection_modal = false;
    m_hide_connection_modal_isSet = false;
    hide_from_leaderboard = false;
    m_hide_from_leaderboard_isSet = false;
    hide_name_from_leaderboard = false;
    m_hide_name_from_leaderboard_isSet = false;
    hide_notifications = new QList<QString*>();
    m_hide_notifications_isSet = false;
    hide_phone_confirm = false;
    m_hide_phone_confirm_isSet = false;
    locale = new QString("");
    m_locale_isSet = false;
    msgs_seen = new QList<QString*>();
    m_msgs_seen_isSet = false;
    order_book_binning = NULL;
    m_order_book_binning_isSet = false;
    order_book_type = new QString("");
    m_order_book_type_isSet = false;
    order_clear_immediate = false;
    m_order_clear_immediate_isSet = false;
    order_controls_plus_minus = false;
    m_order_controls_plus_minus_isSet = false;
    show_locale_numbers = false;
    m_show_locale_numbers_isSet = false;
    sounds = new QList<QString*>();
    m_sounds_isSet = false;
    strict_ip_check = false;
    m_strict_ip_check_isSet = false;
    strict_timeout = false;
    m_strict_timeout_isSet = false;
    ticker_group = new QString("");
    m_ticker_group_isSet = false;
    ticker_pinned = false;
    m_ticker_pinned_isSet = false;
    trade_layout = new QString("");
    m_trade_layout_isSet = false;
}

void
SWGUserPreferences::cleanup() {


    if(announcements_last_seen != nullptr) { 
        delete announcements_last_seen;
    }

    if(color_theme != nullptr) { 
        delete color_theme;
    }
    if(currency != nullptr) { 
        delete currency;
    }

    if(disable_emails != nullptr) { 
        auto arr = disable_emails;
        for(auto o: *arr) { 
            delete o;
        }
        delete disable_emails;
    }
    if(disable_push != nullptr) { 
        auto arr = disable_push;
        for(auto o: *arr) { 
            delete o;
        }
        delete disable_push;
    }
    if(hide_confirm_dialogs != nullptr) { 
        auto arr = hide_confirm_dialogs;
        for(auto o: *arr) { 
            delete o;
        }
        delete hide_confirm_dialogs;
    }



    if(hide_notifications != nullptr) { 
        auto arr = hide_notifications;
        for(auto o: *arr) { 
            delete o;
        }
        delete hide_notifications;
    }

    if(locale != nullptr) { 
        delete locale;
    }
    if(msgs_seen != nullptr) { 
        auto arr = msgs_seen;
        for(auto o: *arr) { 
            delete o;
        }
        delete msgs_seen;
    }
    if(order_book_binning != nullptr) { 
        delete order_book_binning;
    }
    if(order_book_type != nullptr) { 
        delete order_book_type;
    }



    if(sounds != nullptr) { 
        auto arr = sounds;
        for(auto o: *arr) { 
            delete o;
        }
        delete sounds;
    }


    if(ticker_group != nullptr) { 
        delete ticker_group;
    }

    if(trade_layout != nullptr) { 
        delete trade_layout;
    }
}

SWGUserPreferences*
SWGUserPreferences::fromJson(QString json) {
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
    return this;
}

void
SWGUserPreferences::fromJsonObject(QJsonObject pJson) {
    ::Swagger::setValue(&alert_on_liquidations, pJson["alertOnLiquidations"], "bool", "");
    
    ::Swagger::setValue(&animations_enabled, pJson["animationsEnabled"], "bool", "");
    
    ::Swagger::setValue(&announcements_last_seen, pJson["announcementsLastSeen"], "QDateTime", "QDateTime");
    
    ::Swagger::setValue(&chat_channel_id, pJson["chatChannelID"], "double", "");
    
    ::Swagger::setValue(&color_theme, pJson["colorTheme"], "QString", "QString");
    
    ::Swagger::setValue(&currency, pJson["currency"], "QString", "QString");
    
    ::Swagger::setValue(&debug, pJson["debug"], "bool", "");
    
    
    ::Swagger::setValue(&disable_emails, pJson["disableEmails"], "QList", "QString");
    
    ::Swagger::setValue(&disable_push, pJson["disablePush"], "QList", "QString");
    
    ::Swagger::setValue(&hide_confirm_dialogs, pJson["hideConfirmDialogs"], "QList", "QString");
    ::Swagger::setValue(&hide_connection_modal, pJson["hideConnectionModal"], "bool", "");
    
    ::Swagger::setValue(&hide_from_leaderboard, pJson["hideFromLeaderboard"], "bool", "");
    
    ::Swagger::setValue(&hide_name_from_leaderboard, pJson["hideNameFromLeaderboard"], "bool", "");
    
    
    ::Swagger::setValue(&hide_notifications, pJson["hideNotifications"], "QList", "QString");
    ::Swagger::setValue(&hide_phone_confirm, pJson["hidePhoneConfirm"], "bool", "");
    
    ::Swagger::setValue(&locale, pJson["locale"], "QString", "QString");
    
    
    ::Swagger::setValue(&msgs_seen, pJson["msgsSeen"], "QList", "QString");
    ::Swagger::setValue(&order_book_binning, pJson["orderBookBinning"], "SWGObject", "SWGObject");
    
    ::Swagger::setValue(&order_book_type, pJson["orderBookType"], "QString", "QString");
    
    ::Swagger::setValue(&order_clear_immediate, pJson["orderClearImmediate"], "bool", "");
    
    ::Swagger::setValue(&order_controls_plus_minus, pJson["orderControlsPlusMinus"], "bool", "");
    
    ::Swagger::setValue(&show_locale_numbers, pJson["showLocaleNumbers"], "bool", "");
    
    
    ::Swagger::setValue(&sounds, pJson["sounds"], "QList", "QString");
    ::Swagger::setValue(&strict_ip_check, pJson["strictIPCheck"], "bool", "");
    
    ::Swagger::setValue(&strict_timeout, pJson["strictTimeout"], "bool", "");
    
    ::Swagger::setValue(&ticker_group, pJson["tickerGroup"], "QString", "QString");
    
    ::Swagger::setValue(&ticker_pinned, pJson["tickerPinned"], "bool", "");
    
    ::Swagger::setValue(&trade_layout, pJson["tradeLayout"], "QString", "QString");
    
}

QString
SWGUserPreferences::asJson ()
{
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject
SWGUserPreferences::asJsonObject() {
    QJsonObject obj;
    if(m_alert_on_liquidations_isSet){
        obj.insert("alertOnLiquidations", QJsonValue(alert_on_liquidations));
    }
    if(m_animations_enabled_isSet){
        obj.insert("animationsEnabled", QJsonValue(animations_enabled));
    }
    if(announcements_last_seen != nullptr) { 
        toJsonValue(QString("announcementsLastSeen"), announcements_last_seen, obj, QString("QDateTime"));
    }
    if(m_chat_channel_id_isSet){
        obj.insert("chatChannelID", QJsonValue(chat_channel_id));
    }
    if(color_theme != nullptr && *color_theme != QString("")){
        toJsonValue(QString("colorTheme"), color_theme, obj, QString("QString"));
    }
    if(currency != nullptr && *currency != QString("")){
        toJsonValue(QString("currency"), currency, obj, QString("QString"));
    }
    if(m_debug_isSet){
        obj.insert("debug", QJsonValue(debug));
    }
    if(disable_emails->size() > 0){
        toJsonArray((QList<void*>*)disable_emails, obj, "disableEmails", "QString");
    }
    if(disable_push->size() > 0){
        toJsonArray((QList<void*>*)disable_push, obj, "disablePush", "QString");
    }
    if(hide_confirm_dialogs->size() > 0){
        toJsonArray((QList<void*>*)hide_confirm_dialogs, obj, "hideConfirmDialogs", "QString");
    }
    if(m_hide_connection_modal_isSet){
        obj.insert("hideConnectionModal", QJsonValue(hide_connection_modal));
    }
    if(m_hide_from_leaderboard_isSet){
        obj.insert("hideFromLeaderboard", QJsonValue(hide_from_leaderboard));
    }
    if(m_hide_name_from_leaderboard_isSet){
        obj.insert("hideNameFromLeaderboard", QJsonValue(hide_name_from_leaderboard));
    }
    if(hide_notifications->size() > 0){
        toJsonArray((QList<void*>*)hide_notifications, obj, "hideNotifications", "QString");
    }
    if(m_hide_phone_confirm_isSet){
        obj.insert("hidePhoneConfirm", QJsonValue(hide_phone_confirm));
    }
    if(locale != nullptr && *locale != QString("")){
        toJsonValue(QString("locale"), locale, obj, QString("QString"));
    }
    if(msgs_seen->size() > 0){
        toJsonArray((QList<void*>*)msgs_seen, obj, "msgsSeen", "QString");
    }
    if((order_book_binning != nullptr) && (order_book_binning->isSet())){
        toJsonValue(QString("orderBookBinning"), order_book_binning, obj, QString("SWGObject"));
    }
    if(order_book_type != nullptr && *order_book_type != QString("")){
        toJsonValue(QString("orderBookType"), order_book_type, obj, QString("QString"));
    }
    if(m_order_clear_immediate_isSet){
        obj.insert("orderClearImmediate", QJsonValue(order_clear_immediate));
    }
    if(m_order_controls_plus_minus_isSet){
        obj.insert("orderControlsPlusMinus", QJsonValue(order_controls_plus_minus));
    }
    if(m_show_locale_numbers_isSet){
        obj.insert("showLocaleNumbers", QJsonValue(show_locale_numbers));
    }
    if(sounds->size() > 0){
        toJsonArray((QList<void*>*)sounds, obj, "sounds", "QString");
    }
    if(m_strict_ip_check_isSet){
        obj.insert("strictIPCheck", QJsonValue(strict_ip_check));
    }
    if(m_strict_timeout_isSet){
        obj.insert("strictTimeout", QJsonValue(strict_timeout));
    }
    if(ticker_group != nullptr && *ticker_group != QString("")){
        toJsonValue(QString("tickerGroup"), ticker_group, obj, QString("QString"));
    }
    if(m_ticker_pinned_isSet){
        obj.insert("tickerPinned", QJsonValue(ticker_pinned));
    }
    if(trade_layout != nullptr && *trade_layout != QString("")){
        toJsonValue(QString("tradeLayout"), trade_layout, obj, QString("QString"));
    }

    return obj;
}

bool
SWGUserPreferences::isAlertOnLiquidations() {
    return alert_on_liquidations;
}
void
SWGUserPreferences::setAlertOnLiquidations(bool alert_on_liquidations) {
    this->alert_on_liquidations = alert_on_liquidations;
    this->m_alert_on_liquidations_isSet = true;
}

bool
SWGUserPreferences::isAnimationsEnabled() {
    return animations_enabled;
}
void
SWGUserPreferences::setAnimationsEnabled(bool animations_enabled) {
    this->animations_enabled = animations_enabled;
    this->m_animations_enabled_isSet = true;
}

QDateTime*
SWGUserPreferences::getAnnouncementsLastSeen() {
    return announcements_last_seen;
}
void
SWGUserPreferences::setAnnouncementsLastSeen(QDateTime* announcements_last_seen) {
    this->announcements_last_seen = announcements_last_seen;
    this->m_announcements_last_seen_isSet = true;
}

double
SWGUserPreferences::getChatChannelId() {
    return chat_channel_id;
}
void
SWGUserPreferences::setChatChannelId(double chat_channel_id) {
    this->chat_channel_id = chat_channel_id;
    this->m_chat_channel_id_isSet = true;
}

QString*
SWGUserPreferences::getColorTheme() {
    return color_theme;
}
void
SWGUserPreferences::setColorTheme(QString* color_theme) {
    this->color_theme = color_theme;
    this->m_color_theme_isSet = true;
}

QString*
SWGUserPreferences::getCurrency() {
    return currency;
}
void
SWGUserPreferences::setCurrency(QString* currency) {
    this->currency = currency;
    this->m_currency_isSet = true;
}

bool
SWGUserPreferences::isDebug() {
    return debug;
}
void
SWGUserPreferences::setDebug(bool debug) {
    this->debug = debug;
    this->m_debug_isSet = true;
}

QList<QString*>*
SWGUserPreferences::getDisableEmails() {
    return disable_emails;
}
void
SWGUserPreferences::setDisableEmails(QList<QString*>* disable_emails) {
    this->disable_emails = disable_emails;
    this->m_disable_emails_isSet = true;
}

QList<QString*>*
SWGUserPreferences::getDisablePush() {
    return disable_push;
}
void
SWGUserPreferences::setDisablePush(QList<QString*>* disable_push) {
    this->disable_push = disable_push;
    this->m_disable_push_isSet = true;
}

QList<QString*>*
SWGUserPreferences::getHideConfirmDialogs() {
    return hide_confirm_dialogs;
}
void
SWGUserPreferences::setHideConfirmDialogs(QList<QString*>* hide_confirm_dialogs) {
    this->hide_confirm_dialogs = hide_confirm_dialogs;
    this->m_hide_confirm_dialogs_isSet = true;
}

bool
SWGUserPreferences::isHideConnectionModal() {
    return hide_connection_modal;
}
void
SWGUserPreferences::setHideConnectionModal(bool hide_connection_modal) {
    this->hide_connection_modal = hide_connection_modal;
    this->m_hide_connection_modal_isSet = true;
}

bool
SWGUserPreferences::isHideFromLeaderboard() {
    return hide_from_leaderboard;
}
void
SWGUserPreferences::setHideFromLeaderboard(bool hide_from_leaderboard) {
    this->hide_from_leaderboard = hide_from_leaderboard;
    this->m_hide_from_leaderboard_isSet = true;
}

bool
SWGUserPreferences::isHideNameFromLeaderboard() {
    return hide_name_from_leaderboard;
}
void
SWGUserPreferences::setHideNameFromLeaderboard(bool hide_name_from_leaderboard) {
    this->hide_name_from_leaderboard = hide_name_from_leaderboard;
    this->m_hide_name_from_leaderboard_isSet = true;
}

QList<QString*>*
SWGUserPreferences::getHideNotifications() {
    return hide_notifications;
}
void
SWGUserPreferences::setHideNotifications(QList<QString*>* hide_notifications) {
    this->hide_notifications = hide_notifications;
    this->m_hide_notifications_isSet = true;
}

bool
SWGUserPreferences::isHidePhoneConfirm() {
    return hide_phone_confirm;
}
void
SWGUserPreferences::setHidePhoneConfirm(bool hide_phone_confirm) {
    this->hide_phone_confirm = hide_phone_confirm;
    this->m_hide_phone_confirm_isSet = true;
}

QString*
SWGUserPreferences::getLocale() {
    return locale;
}
void
SWGUserPreferences::setLocale(QString* locale) {
    this->locale = locale;
    this->m_locale_isSet = true;
}

QList<QString*>*
SWGUserPreferences::getMsgsSeen() {
    return msgs_seen;
}
void
SWGUserPreferences::setMsgsSeen(QList<QString*>* msgs_seen) {
    this->msgs_seen = msgs_seen;
    this->m_msgs_seen_isSet = true;
}

SWGObject*
SWGUserPreferences::getOrderBookBinning() {
    return order_book_binning;
}
void
SWGUserPreferences::setOrderBookBinning(SWGObject* order_book_binning) {
    this->order_book_binning = order_book_binning;
    this->m_order_book_binning_isSet = true;
}

QString*
SWGUserPreferences::getOrderBookType() {
    return order_book_type;
}
void
SWGUserPreferences::setOrderBookType(QString* order_book_type) {
    this->order_book_type = order_book_type;
    this->m_order_book_type_isSet = true;
}

bool
SWGUserPreferences::isOrderClearImmediate() {
    return order_clear_immediate;
}
void
SWGUserPreferences::setOrderClearImmediate(bool order_clear_immediate) {
    this->order_clear_immediate = order_clear_immediate;
    this->m_order_clear_immediate_isSet = true;
}

bool
SWGUserPreferences::isOrderControlsPlusMinus() {
    return order_controls_plus_minus;
}
void
SWGUserPreferences::setOrderControlsPlusMinus(bool order_controls_plus_minus) {
    this->order_controls_plus_minus = order_controls_plus_minus;
    this->m_order_controls_plus_minus_isSet = true;
}

bool
SWGUserPreferences::isShowLocaleNumbers() {
    return show_locale_numbers;
}
void
SWGUserPreferences::setShowLocaleNumbers(bool show_locale_numbers) {
    this->show_locale_numbers = show_locale_numbers;
    this->m_show_locale_numbers_isSet = true;
}

QList<QString*>*
SWGUserPreferences::getSounds() {
    return sounds;
}
void
SWGUserPreferences::setSounds(QList<QString*>* sounds) {
    this->sounds = sounds;
    this->m_sounds_isSet = true;
}

bool
SWGUserPreferences::isStrictIpCheck() {
    return strict_ip_check;
}
void
SWGUserPreferences::setStrictIpCheck(bool strict_ip_check) {
    this->strict_ip_check = strict_ip_check;
    this->m_strict_ip_check_isSet = true;
}

bool
SWGUserPreferences::isStrictTimeout() {
    return strict_timeout;
}
void
SWGUserPreferences::setStrictTimeout(bool strict_timeout) {
    this->strict_timeout = strict_timeout;
    this->m_strict_timeout_isSet = true;
}

QString*
SWGUserPreferences::getTickerGroup() {
    return ticker_group;
}
void
SWGUserPreferences::setTickerGroup(QString* ticker_group) {
    this->ticker_group = ticker_group;
    this->m_ticker_group_isSet = true;
}

bool
SWGUserPreferences::isTickerPinned() {
    return ticker_pinned;
}
void
SWGUserPreferences::setTickerPinned(bool ticker_pinned) {
    this->ticker_pinned = ticker_pinned;
    this->m_ticker_pinned_isSet = true;
}

QString*
SWGUserPreferences::getTradeLayout() {
    return trade_layout;
}
void
SWGUserPreferences::setTradeLayout(QString* trade_layout) {
    this->trade_layout = trade_layout;
    this->m_trade_layout_isSet = true;
}


bool
SWGUserPreferences::isSet(){
    bool isObjectUpdated = false;
    do{
        if(m_alert_on_liquidations_isSet){ isObjectUpdated = true; break;}
        if(m_animations_enabled_isSet){ isObjectUpdated = true; break;}
        
        if(m_chat_channel_id_isSet){ isObjectUpdated = true; break;}
        if(color_theme != nullptr && *color_theme != QString("")){ isObjectUpdated = true; break;}
        if(currency != nullptr && *currency != QString("")){ isObjectUpdated = true; break;}
        if(m_debug_isSet){ isObjectUpdated = true; break;}
        if(disable_emails->size() > 0){ isObjectUpdated = true; break;}
        if(disable_push->size() > 0){ isObjectUpdated = true; break;}
        if(hide_confirm_dialogs->size() > 0){ isObjectUpdated = true; break;}
        if(m_hide_connection_modal_isSet){ isObjectUpdated = true; break;}
        if(m_hide_from_leaderboard_isSet){ isObjectUpdated = true; break;}
        if(m_hide_name_from_leaderboard_isSet){ isObjectUpdated = true; break;}
        if(hide_notifications->size() > 0){ isObjectUpdated = true; break;}
        if(m_hide_phone_confirm_isSet){ isObjectUpdated = true; break;}
        if(locale != nullptr && *locale != QString("")){ isObjectUpdated = true; break;}
        if(msgs_seen->size() > 0){ isObjectUpdated = true; break;}
        if(order_book_binning != nullptr && order_book_binning->isSet()){ isObjectUpdated = true; break;}
        if(order_book_type != nullptr && *order_book_type != QString("")){ isObjectUpdated = true; break;}
        if(m_order_clear_immediate_isSet){ isObjectUpdated = true; break;}
        if(m_order_controls_plus_minus_isSet){ isObjectUpdated = true; break;}
        if(m_show_locale_numbers_isSet){ isObjectUpdated = true; break;}
        if(sounds->size() > 0){ isObjectUpdated = true; break;}
        if(m_strict_ip_check_isSet){ isObjectUpdated = true; break;}
        if(m_strict_timeout_isSet){ isObjectUpdated = true; break;}
        if(ticker_group != nullptr && *ticker_group != QString("")){ isObjectUpdated = true; break;}
        if(m_ticker_pinned_isSet){ isObjectUpdated = true; break;}
        if(trade_layout != nullptr && *trade_layout != QString("")){ isObjectUpdated = true; break;}
    }while(false);
    return isObjectUpdated;
}
}

