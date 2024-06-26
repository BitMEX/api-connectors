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

#ifndef _SWG_SWGPositionApi_H_
#define _SWG_SWGPositionApi_H_

#include "SWGHttpRequest.h"

#include <QString>
#include "SWGError.h"
#include "SWGPosition.h"

#include <QObject>

namespace Swagger {

class SWGPositionApi: public QObject {
    Q_OBJECT

public:
    SWGPositionApi();
    SWGPositionApi(QString host, QString basePath);
    ~SWGPositionApi();

    QString host;
    QString basePath;
    QMap<QString, QString> defaultHeaders;

    void position_get(QString* filter, QString* columns, qint32 count);
    void position_isolateMargin(QString* symbol, bool enabled);
    void position_transferIsolatedMargin(QString* symbol, qint64 amount, double target_account_id);
    void position_updateLeverage(QString* symbol, double leverage, double target_account_id);
    void position_updateRiskLimit(QString* symbol, qint64 risk_limit, double target_account_id);
    
private:
    void position_getCallback (SWGHttpRequestWorker * worker);
    void position_isolateMarginCallback (SWGHttpRequestWorker * worker);
    void position_transferIsolatedMarginCallback (SWGHttpRequestWorker * worker);
    void position_updateLeverageCallback (SWGHttpRequestWorker * worker);
    void position_updateRiskLimitCallback (SWGHttpRequestWorker * worker);
    
signals:
    void position_getSignal(QList<SWGPosition*>* summary);
    void position_isolateMarginSignal(SWGPosition* summary);
    void position_transferIsolatedMarginSignal(SWGPosition* summary);
    void position_updateLeverageSignal(SWGPosition* summary);
    void position_updateRiskLimitSignal(SWGPosition* summary);
    
    void position_getSignalE(QList<SWGPosition*>* summary, QNetworkReply::NetworkError error_type, QString& error_str);
    void position_isolateMarginSignalE(SWGPosition* summary, QNetworkReply::NetworkError error_type, QString& error_str);
    void position_transferIsolatedMarginSignalE(SWGPosition* summary, QNetworkReply::NetworkError error_type, QString& error_str);
    void position_updateLeverageSignalE(SWGPosition* summary, QNetworkReply::NetworkError error_type, QString& error_str);
    void position_updateRiskLimitSignalE(SWGPosition* summary, QNetworkReply::NetworkError error_type, QString& error_str);
    
    void position_getSignalEFull(SWGHttpRequestWorker* worker, QNetworkReply::NetworkError error_type, QString& error_str);
    void position_isolateMarginSignalEFull(SWGHttpRequestWorker* worker, QNetworkReply::NetworkError error_type, QString& error_str);
    void position_transferIsolatedMarginSignalEFull(SWGHttpRequestWorker* worker, QNetworkReply::NetworkError error_type, QString& error_str);
    void position_updateLeverageSignalEFull(SWGHttpRequestWorker* worker, QNetworkReply::NetworkError error_type, QString& error_str);
    void position_updateRiskLimitSignalEFull(SWGHttpRequestWorker* worker, QNetworkReply::NetworkError error_type, QString& error_str);
    
};

}
#endif
