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
 * SWGCollateralSupportAgreement.h
 *
 * 
 */

#ifndef SWGCollateralSupportAgreement_H_
#define SWGCollateralSupportAgreement_H_

#include <QJsonObject>


#include "SWGNumber.h"
#include <QString>

#include "SWGObject.h"

namespace Swagger {

class SWGCollateralSupportAgreement: public SWGObject {
public:
    SWGCollateralSupportAgreement();
    SWGCollateralSupportAgreement(QString json);
    ~SWGCollateralSupportAgreement();
    void init();
    void cleanup();

    QString asJson () override;
    QJsonObject asJsonObject() override;
    void fromJsonObject(QJsonObject json) override;
    SWGCollateralSupportAgreement* fromJson(QString jsonString) override;

    QString* getCsaId();
    void setCsaId(QString* csa_id);

    SWGNumber* getAccount();
    void setAccount(SWGNumber* account);

    QString* getCurrency();
    void setCurrency(QString* currency);

    SWGNumber* getAmount();
    void setAmount(SWGNumber* amount);

    SWGNumber* getMinAmount();
    void setMinAmount(SWGNumber* min_amount);

    SWGNumber* getThreshold();
    void setThreshold(SWGNumber* threshold);

    SWGNumber* getMmRatioMarginCall();
    void setMmRatioMarginCall(SWGNumber* mm_ratio_margin_call);

    SWGNumber* getMmRatioLiquidation();
    void setMmRatioLiquidation(SWGNumber* mm_ratio_liquidation);

    QString* getStartTime();
    void setStartTime(QString* start_time);

    QString* getMaturityTime();
    void setMaturityTime(QString* maturity_time);

    QString* getMaturityInstruction();
    void setMaturityInstruction(QString* maturity_instruction);

    QString* getCsaStatus();
    void setCsaStatus(QString* csa_status);

    QString* getRequester();
    void setRequester(QString* requester);

    QString* getClientDetails();
    void setClientDetails(QString* client_details);

    QString* getText();
    void setText(QString* text);

    QString* getTimestamp();
    void setTimestamp(QString* timestamp);


    virtual bool isSet() override;

private:
    QString* csa_id;
    bool m_csa_id_isSet;

    SWGNumber* account;
    bool m_account_isSet;

    QString* currency;
    bool m_currency_isSet;

    SWGNumber* amount;
    bool m_amount_isSet;

    SWGNumber* min_amount;
    bool m_min_amount_isSet;

    SWGNumber* threshold;
    bool m_threshold_isSet;

    SWGNumber* mm_ratio_margin_call;
    bool m_mm_ratio_margin_call_isSet;

    SWGNumber* mm_ratio_liquidation;
    bool m_mm_ratio_liquidation_isSet;

    QString* start_time;
    bool m_start_time_isSet;

    QString* maturity_time;
    bool m_maturity_time_isSet;

    QString* maturity_instruction;
    bool m_maturity_instruction_isSet;

    QString* csa_status;
    bool m_csa_status_isSet;

    QString* requester;
    bool m_requester_isSet;

    QString* client_details;
    bool m_client_details_isSet;

    QString* text;
    bool m_text_isSet;

    QString* timestamp;
    bool m_timestamp_isSet;

};

}

#endif /* SWGCollateralSupportAgreement_H_ */
