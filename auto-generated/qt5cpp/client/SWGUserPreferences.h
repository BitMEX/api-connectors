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

/*
 * SWGUserPreferences.h
 *
 * 
 */

#ifndef SWGUserPreferences_H_
#define SWGUserPreferences_H_

#include <QJsonObject>


#include "SWGObject.h"
#include <QDateTime>
#include <QList>
#include <QString>

#include "SWGObject.h"

namespace Swagger {

class SWGUserPreferences: public SWGObject {
public:
    SWGUserPreferences();
    SWGUserPreferences(QString json);
    ~SWGUserPreferences();
    void init();
    void cleanup();

    QString asJson () override;
    QJsonObject asJsonObject() override;
    void fromJsonObject(QJsonObject json) override;
    SWGUserPreferences* fromJson(QString jsonString) override;

    bool isAlertOnLiquidations();
    void setAlertOnLiquidations(bool alert_on_liquidations);

    bool isAnimationsEnabled();
    void setAnimationsEnabled(bool animations_enabled);

    QDateTime* getAnnouncementsLastSeen();
    void setAnnouncementsLastSeen(QDateTime* announcements_last_seen);

    double getChatChannelId();
    void setChatChannelId(double chat_channel_id);

    QString* getColorTheme();
    void setColorTheme(QString* color_theme);

    QString* getCurrency();
    void setCurrency(QString* currency);

    bool isDebug();
    void setDebug(bool debug);

    QList<QString*>* getDisableEmails();
    void setDisableEmails(QList<QString*>* disable_emails);

    QList<QString*>* getDisablePush();
    void setDisablePush(QList<QString*>* disable_push);

    QList<QString*>* getHideConfirmDialogs();
    void setHideConfirmDialogs(QList<QString*>* hide_confirm_dialogs);

    bool isHideConnectionModal();
    void setHideConnectionModal(bool hide_connection_modal);

    bool isHideFromLeaderboard();
    void setHideFromLeaderboard(bool hide_from_leaderboard);

    bool isHideNameFromLeaderboard();
    void setHideNameFromLeaderboard(bool hide_name_from_leaderboard);

    QList<QString*>* getHideNotifications();
    void setHideNotifications(QList<QString*>* hide_notifications);

    bool isHidePhoneConfirm();
    void setHidePhoneConfirm(bool hide_phone_confirm);

    QString* getLocale();
    void setLocale(QString* locale);

    QList<QString*>* getMsgsSeen();
    void setMsgsSeen(QList<QString*>* msgs_seen);

    SWGObject* getOrderBookBinning();
    void setOrderBookBinning(SWGObject* order_book_binning);

    QString* getOrderBookType();
    void setOrderBookType(QString* order_book_type);

    bool isOrderClearImmediate();
    void setOrderClearImmediate(bool order_clear_immediate);

    bool isOrderControlsPlusMinus();
    void setOrderControlsPlusMinus(bool order_controls_plus_minus);

    bool isShowLocaleNumbers();
    void setShowLocaleNumbers(bool show_locale_numbers);

    QList<QString*>* getSounds();
    void setSounds(QList<QString*>* sounds);

    bool isStrictIpCheck();
    void setStrictIpCheck(bool strict_ip_check);

    bool isStrictTimeout();
    void setStrictTimeout(bool strict_timeout);

    QString* getTickerGroup();
    void setTickerGroup(QString* ticker_group);

    bool isTickerPinned();
    void setTickerPinned(bool ticker_pinned);

    QString* getTradeLayout();
    void setTradeLayout(QString* trade_layout);


    virtual bool isSet() override;

private:
    bool alert_on_liquidations;
    bool m_alert_on_liquidations_isSet;

    bool animations_enabled;
    bool m_animations_enabled_isSet;

    QDateTime* announcements_last_seen;
    bool m_announcements_last_seen_isSet;

    double chat_channel_id;
    bool m_chat_channel_id_isSet;

    QString* color_theme;
    bool m_color_theme_isSet;

    QString* currency;
    bool m_currency_isSet;

    bool debug;
    bool m_debug_isSet;

    QList<QString*>* disable_emails;
    bool m_disable_emails_isSet;

    QList<QString*>* disable_push;
    bool m_disable_push_isSet;

    QList<QString*>* hide_confirm_dialogs;
    bool m_hide_confirm_dialogs_isSet;

    bool hide_connection_modal;
    bool m_hide_connection_modal_isSet;

    bool hide_from_leaderboard;
    bool m_hide_from_leaderboard_isSet;

    bool hide_name_from_leaderboard;
    bool m_hide_name_from_leaderboard_isSet;

    QList<QString*>* hide_notifications;
    bool m_hide_notifications_isSet;

    bool hide_phone_confirm;
    bool m_hide_phone_confirm_isSet;

    QString* locale;
    bool m_locale_isSet;

    QList<QString*>* msgs_seen;
    bool m_msgs_seen_isSet;

    SWGObject* order_book_binning;
    bool m_order_book_binning_isSet;

    QString* order_book_type;
    bool m_order_book_type_isSet;

    bool order_clear_immediate;
    bool m_order_clear_immediate_isSet;

    bool order_controls_plus_minus;
    bool m_order_controls_plus_minus_isSet;

    bool show_locale_numbers;
    bool m_show_locale_numbers_isSet;

    QList<QString*>* sounds;
    bool m_sounds_isSet;

    bool strict_ip_check;
    bool m_strict_ip_check_isSet;

    bool strict_timeout;
    bool m_strict_timeout_isSet;

    QString* ticker_group;
    bool m_ticker_group_isSet;

    bool ticker_pinned;
    bool m_ticker_pinned_isSet;

    QString* trade_layout;
    bool m_trade_layout_isSet;

};

}

#endif /* SWGUserPreferences_H_ */
