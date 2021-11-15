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

#ifndef _SWG_SWGInstrumentApi_H_
#define _SWG_SWGInstrumentApi_H_

#include "SWGHttpRequest.h"

#include <QDateTime>
#include <QString>
#include "SWGError.h"
#include "SWGIndexComposite.h"
#include "SWGInstrument.h"
#include "SWGInstrumentInterval.h"
#include "SWGNumber.h"

#include <QObject>

namespace Swagger {

class SWGInstrumentApi: public QObject {
    Q_OBJECT

public:
    SWGInstrumentApi();
    SWGInstrumentApi(QString host, QString basePath);
    ~SWGInstrumentApi();

    QString host;
    QString basePath;
    QMap<QString, QString> defaultHeaders;

    void instrument_get(QString* symbol, QString* filter, QString* columns, SWGNumber* count, SWGNumber* start, bool reverse, QDateTime* start_time, QDateTime* end_time);
    void instrument_getActive();
    void instrument_getActiveAndIndices();
    void instrument_getActiveIntervals();
    void instrument_getCompositeIndex(QString* symbol, QString* filter, QString* columns, SWGNumber* count, SWGNumber* start, bool reverse, QDateTime* start_time, QDateTime* end_time);
    void instrument_getIndices();
    
private:
    void instrument_getCallback (SWGHttpRequestWorker * worker);
    void instrument_getActiveCallback (SWGHttpRequestWorker * worker);
    void instrument_getActiveAndIndicesCallback (SWGHttpRequestWorker * worker);
    void instrument_getActiveIntervalsCallback (SWGHttpRequestWorker * worker);
    void instrument_getCompositeIndexCallback (SWGHttpRequestWorker * worker);
    void instrument_getIndicesCallback (SWGHttpRequestWorker * worker);
    
signals:
    void instrument_getSignal(QList<SWGInstrument*>* summary);
    void instrument_getActiveSignal(QList<SWGInstrument*>* summary);
    void instrument_getActiveAndIndicesSignal(QList<SWGInstrument*>* summary);
    void instrument_getActiveIntervalsSignal(SWGInstrumentInterval* summary);
    void instrument_getCompositeIndexSignal(QList<SWGIndexComposite*>* summary);
    void instrument_getIndicesSignal(QList<SWGInstrument*>* summary);
    
    void instrument_getSignalE(QList<SWGInstrument*>* summary, QNetworkReply::NetworkError error_type, QString& error_str);
    void instrument_getActiveSignalE(QList<SWGInstrument*>* summary, QNetworkReply::NetworkError error_type, QString& error_str);
    void instrument_getActiveAndIndicesSignalE(QList<SWGInstrument*>* summary, QNetworkReply::NetworkError error_type, QString& error_str);
    void instrument_getActiveIntervalsSignalE(SWGInstrumentInterval* summary, QNetworkReply::NetworkError error_type, QString& error_str);
    void instrument_getCompositeIndexSignalE(QList<SWGIndexComposite*>* summary, QNetworkReply::NetworkError error_type, QString& error_str);
    void instrument_getIndicesSignalE(QList<SWGInstrument*>* summary, QNetworkReply::NetworkError error_type, QString& error_str);
    
    void instrument_getSignalEFull(SWGHttpRequestWorker* worker, QNetworkReply::NetworkError error_type, QString& error_str);
    void instrument_getActiveSignalEFull(SWGHttpRequestWorker* worker, QNetworkReply::NetworkError error_type, QString& error_str);
    void instrument_getActiveAndIndicesSignalEFull(SWGHttpRequestWorker* worker, QNetworkReply::NetworkError error_type, QString& error_str);
    void instrument_getActiveIntervalsSignalEFull(SWGHttpRequestWorker* worker, QNetworkReply::NetworkError error_type, QString& error_str);
    void instrument_getCompositeIndexSignalEFull(SWGHttpRequestWorker* worker, QNetworkReply::NetworkError error_type, QString& error_str);
    void instrument_getIndicesSignalEFull(SWGHttpRequestWorker* worker, QNetworkReply::NetworkError error_type, QString& error_str);
    
};

}
#endif
