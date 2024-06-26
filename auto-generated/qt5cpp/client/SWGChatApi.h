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

#ifndef _SWG_SWGChatApi_H_
#define _SWG_SWGChatApi_H_

#include "SWGHttpRequest.h"

#include <QString>
#include "SWGChat.h"
#include "SWGChatChannel.h"
#include "SWGConnectedUsers.h"
#include "SWGError.h"
#include "SWGPinnedMessage.h"

#include <QObject>

namespace Swagger {

class SWGChatApi: public QObject {
    Q_OBJECT

public:
    SWGChatApi();
    SWGChatApi(QString host, QString basePath);
    ~SWGChatApi();

    QString host;
    QString basePath;
    QMap<QString, QString> defaultHeaders;

    void chat_get(qint32 count, qint32 start, bool reverse, double channel_id);
    void chat_getChannels();
    void chat_getConnected();
    void chat_getPinnedMessage(double channel_id);
    void chat_new(QString* message, double channel_id);
    
private:
    void chat_getCallback (SWGHttpRequestWorker * worker);
    void chat_getChannelsCallback (SWGHttpRequestWorker * worker);
    void chat_getConnectedCallback (SWGHttpRequestWorker * worker);
    void chat_getPinnedMessageCallback (SWGHttpRequestWorker * worker);
    void chat_newCallback (SWGHttpRequestWorker * worker);
    
signals:
    void chat_getSignal(QList<SWGChat*>* summary);
    void chat_getChannelsSignal(QList<SWGChatChannel*>* summary);
    void chat_getConnectedSignal(SWGConnectedUsers* summary);
    void chat_getPinnedMessageSignal(SWGPinnedMessage* summary);
    void chat_newSignal(SWGChat* summary);
    
    void chat_getSignalE(QList<SWGChat*>* summary, QNetworkReply::NetworkError error_type, QString& error_str);
    void chat_getChannelsSignalE(QList<SWGChatChannel*>* summary, QNetworkReply::NetworkError error_type, QString& error_str);
    void chat_getConnectedSignalE(SWGConnectedUsers* summary, QNetworkReply::NetworkError error_type, QString& error_str);
    void chat_getPinnedMessageSignalE(SWGPinnedMessage* summary, QNetworkReply::NetworkError error_type, QString& error_str);
    void chat_newSignalE(SWGChat* summary, QNetworkReply::NetworkError error_type, QString& error_str);
    
    void chat_getSignalEFull(SWGHttpRequestWorker* worker, QNetworkReply::NetworkError error_type, QString& error_str);
    void chat_getChannelsSignalEFull(SWGHttpRequestWorker* worker, QNetworkReply::NetworkError error_type, QString& error_str);
    void chat_getConnectedSignalEFull(SWGHttpRequestWorker* worker, QNetworkReply::NetworkError error_type, QString& error_str);
    void chat_getPinnedMessageSignalEFull(SWGHttpRequestWorker* worker, QNetworkReply::NetworkError error_type, QString& error_str);
    void chat_newSignalEFull(SWGHttpRequestWorker* worker, QNetworkReply::NetworkError error_type, QString& error_str);
    
};

}
#endif
