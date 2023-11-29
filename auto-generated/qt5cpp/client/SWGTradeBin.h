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

/*
 * SWGTradeBin.h
 *
 * 
 */

#ifndef SWGTradeBin_H_
#define SWGTradeBin_H_

#include <QJsonObject>


#include "SWGNumber.h"
#include <QDateTime>
#include <QString>

#include "SWGObject.h"

namespace Swagger {

class SWGTradeBin: public SWGObject {
public:
    SWGTradeBin();
    SWGTradeBin(QString json);
    ~SWGTradeBin();
    void init();
    void cleanup();

    QString asJson () override;
    QJsonObject asJsonObject() override;
    void fromJsonObject(QJsonObject json) override;
    SWGTradeBin* fromJson(QString jsonString) override;

    QDateTime* getTimestamp();
    void setTimestamp(QDateTime* timestamp);

    QString* getSymbol();
    void setSymbol(QString* symbol);

    double getOpen();
    void setOpen(double open);

    double getHigh();
    void setHigh(double high);

    double getLow();
    void setLow(double low);

    double getClose();
    void setClose(double close);

    SWGNumber* getTrades();
    void setTrades(SWGNumber* trades);

    SWGNumber* getVolume();
    void setVolume(SWGNumber* volume);

    double getVwap();
    void setVwap(double vwap);

    SWGNumber* getLastSize();
    void setLastSize(SWGNumber* last_size);

    SWGNumber* getTurnover();
    void setTurnover(SWGNumber* turnover);

    double getHomeNotional();
    void setHomeNotional(double home_notional);

    double getForeignNotional();
    void setForeignNotional(double foreign_notional);


    virtual bool isSet() override;

private:
    QDateTime* timestamp;
    bool m_timestamp_isSet;

    QString* symbol;
    bool m_symbol_isSet;

    double open;
    bool m_open_isSet;

    double high;
    bool m_high_isSet;

    double low;
    bool m_low_isSet;

    double close;
    bool m_close_isSet;

    SWGNumber* trades;
    bool m_trades_isSet;

    SWGNumber* volume;
    bool m_volume_isSet;

    double vwap;
    bool m_vwap_isSet;

    SWGNumber* last_size;
    bool m_last_size_isSet;

    SWGNumber* turnover;
    bool m_turnover_isSet;

    double home_notional;
    bool m_home_notional_isSet;

    double foreign_notional;
    bool m_foreign_notional_isSet;

};

}

#endif /* SWGTradeBin_H_ */
