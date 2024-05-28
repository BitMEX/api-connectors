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
 * SWGExecution.h
 *
 * Raw Order and Balance Data
 */

#ifndef SWGExecution_H_
#define SWGExecution_H_

#include <QJsonObject>


#include <QDateTime>
#include <QString>

#include "SWGObject.h"

namespace Swagger {

class SWGExecution: public SWGObject {
public:
    SWGExecution();
    SWGExecution(QString json);
    ~SWGExecution();
    void init();
    void cleanup();

    QString asJson () override;
    QJsonObject asJsonObject() override;
    void fromJsonObject(QJsonObject json) override;
    SWGExecution* fromJson(QString jsonString) override;

    QString* getExecId();
    void setExecId(QString* exec_id);

    QString* getOrderId();
    void setOrderId(QString* order_id);

    QString* getClOrdId();
    void setClOrdId(QString* cl_ord_id);

    QString* getClOrdLinkId();
    void setClOrdLinkId(QString* cl_ord_link_id);

    qint64 getAccount();
    void setAccount(qint64 account);

    QString* getSymbol();
    void setSymbol(QString* symbol);

    QString* getSide();
    void setSide(QString* side);

    qint64 getLastQty();
    void setLastQty(qint64 last_qty);

    double getLastPx();
    void setLastPx(double last_px);

    QString* getLastLiquidityInd();
    void setLastLiquidityInd(QString* last_liquidity_ind);

    qint64 getOrderQty();
    void setOrderQty(qint64 order_qty);

    double getPrice();
    void setPrice(double price);

    qint64 getDisplayQty();
    void setDisplayQty(qint64 display_qty);

    double getStopPx();
    void setStopPx(double stop_px);

    double getPegOffsetValue();
    void setPegOffsetValue(double peg_offset_value);

    QString* getPegPriceType();
    void setPegPriceType(QString* peg_price_type);

    QString* getCurrency();
    void setCurrency(QString* currency);

    QString* getSettlCurrency();
    void setSettlCurrency(QString* settl_currency);

    QString* getExecType();
    void setExecType(QString* exec_type);

    QString* getOrdType();
    void setOrdType(QString* ord_type);

    QString* getTimeInForce();
    void setTimeInForce(QString* time_in_force);

    QString* getExecInst();
    void setExecInst(QString* exec_inst);

    QString* getContingencyType();
    void setContingencyType(QString* contingency_type);

    QString* getOrdStatus();
    void setOrdStatus(QString* ord_status);

    QString* getTriggered();
    void setTriggered(QString* triggered);

    bool isWorkingIndicator();
    void setWorkingIndicator(bool working_indicator);

    QString* getOrdRejReason();
    void setOrdRejReason(QString* ord_rej_reason);

    qint64 getLeavesQty();
    void setLeavesQty(qint64 leaves_qty);

    qint64 getCumQty();
    void setCumQty(qint64 cum_qty);

    double getAvgPx();
    void setAvgPx(double avg_px);

    double getCommission();
    void setCommission(double commission);

    QString* getFeeType();
    void setFeeType(QString* fee_type);

    QString* getTradePublishIndicator();
    void setTradePublishIndicator(QString* trade_publish_indicator);

    QString* getText();
    void setText(QString* text);

    QString* getTrdMatchId();
    void setTrdMatchId(QString* trd_match_id);

    qint64 getExecCost();
    void setExecCost(qint64 exec_cost);

    qint64 getExecComm();
    void setExecComm(qint64 exec_comm);

    double getHomeNotional();
    void setHomeNotional(double home_notional);

    double getForeignNotional();
    void setForeignNotional(double foreign_notional);

    QDateTime* getTransactTime();
    void setTransactTime(QDateTime* transact_time);

    QDateTime* getTimestamp();
    void setTimestamp(QDateTime* timestamp);


    virtual bool isSet() override;

private:
    QString* exec_id;
    bool m_exec_id_isSet;

    QString* order_id;
    bool m_order_id_isSet;

    QString* cl_ord_id;
    bool m_cl_ord_id_isSet;

    QString* cl_ord_link_id;
    bool m_cl_ord_link_id_isSet;

    qint64 account;
    bool m_account_isSet;

    QString* symbol;
    bool m_symbol_isSet;

    QString* side;
    bool m_side_isSet;

    qint64 last_qty;
    bool m_last_qty_isSet;

    double last_px;
    bool m_last_px_isSet;

    QString* last_liquidity_ind;
    bool m_last_liquidity_ind_isSet;

    qint64 order_qty;
    bool m_order_qty_isSet;

    double price;
    bool m_price_isSet;

    qint64 display_qty;
    bool m_display_qty_isSet;

    double stop_px;
    bool m_stop_px_isSet;

    double peg_offset_value;
    bool m_peg_offset_value_isSet;

    QString* peg_price_type;
    bool m_peg_price_type_isSet;

    QString* currency;
    bool m_currency_isSet;

    QString* settl_currency;
    bool m_settl_currency_isSet;

    QString* exec_type;
    bool m_exec_type_isSet;

    QString* ord_type;
    bool m_ord_type_isSet;

    QString* time_in_force;
    bool m_time_in_force_isSet;

    QString* exec_inst;
    bool m_exec_inst_isSet;

    QString* contingency_type;
    bool m_contingency_type_isSet;

    QString* ord_status;
    bool m_ord_status_isSet;

    QString* triggered;
    bool m_triggered_isSet;

    bool working_indicator;
    bool m_working_indicator_isSet;

    QString* ord_rej_reason;
    bool m_ord_rej_reason_isSet;

    qint64 leaves_qty;
    bool m_leaves_qty_isSet;

    qint64 cum_qty;
    bool m_cum_qty_isSet;

    double avg_px;
    bool m_avg_px_isSet;

    double commission;
    bool m_commission_isSet;

    QString* fee_type;
    bool m_fee_type_isSet;

    QString* trade_publish_indicator;
    bool m_trade_publish_indicator_isSet;

    QString* text;
    bool m_text_isSet;

    QString* trd_match_id;
    bool m_trd_match_id_isSet;

    qint64 exec_cost;
    bool m_exec_cost_isSet;

    qint64 exec_comm;
    bool m_exec_comm_isSet;

    double home_notional;
    bool m_home_notional_isSet;

    double foreign_notional;
    bool m_foreign_notional_isSet;

    QDateTime* transact_time;
    bool m_transact_time_isSet;

    QDateTime* timestamp;
    bool m_timestamp_isSet;

};

}

#endif /* SWGExecution_H_ */
