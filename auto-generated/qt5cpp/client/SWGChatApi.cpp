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

#include "SWGChatApi.h"
#include "SWGHelpers.h"
#include "SWGModelFactory.h"
#include "SWGQObjectWrapper.h"

#include <QJsonArray>
#include <QJsonDocument>

namespace Swagger {

SWGChatApi::SWGChatApi() {}

SWGChatApi::~SWGChatApi() {}

SWGChatApi::SWGChatApi(QString host, QString basePath) {
    this->host = host;
    this->basePath = basePath;
}

void
SWGChatApi::chat_get(qint32 count, qint32 start, bool reverse, double channel_id) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/chat");


    if (fullPath.indexOf("?") > 0)
      fullPath.append("&");
    else
      fullPath.append("?");
    fullPath.append(QUrl::toPercentEncoding("count"))
        .append("=")
        .append(QUrl::toPercentEncoding(stringValue(count)));

    if (fullPath.indexOf("?") > 0)
      fullPath.append("&");
    else
      fullPath.append("?");
    fullPath.append(QUrl::toPercentEncoding("start"))
        .append("=")
        .append(QUrl::toPercentEncoding(stringValue(start)));

    if (fullPath.indexOf("?") > 0)
      fullPath.append("&");
    else
      fullPath.append("?");
    fullPath.append(QUrl::toPercentEncoding("reverse"))
        .append("=")
        .append(QUrl::toPercentEncoding(stringValue(reverse)));

    if (fullPath.indexOf("?") > 0)
      fullPath.append("&");
    else
      fullPath.append("?");
    fullPath.append(QUrl::toPercentEncoding("channelID"))
        .append("=")
        .append(QUrl::toPercentEncoding(stringValue(channel_id)));


    SWGHttpRequestWorker *worker = new SWGHttpRequestWorker();
    SWGHttpRequestInput input(fullPath, "GET");





    foreach(QString key, this->defaultHeaders.keys()) {
        input.headers.insert(key, this->defaultHeaders.value(key));
    }

    connect(worker,
            &SWGHttpRequestWorker::on_execution_finished,
            this,
            &SWGChatApi::chat_getCallback);

    worker->execute(&input);
}

void
SWGChatApi::chat_getCallback(SWGHttpRequestWorker * worker) {
    QString msg;
    QString error_str = worker->error_str;
    QNetworkReply::NetworkError error_type = worker->error_type;

    if (worker->error_type == QNetworkReply::NoError) {
        msg = QString("Success! %1 bytes").arg(worker->response.length());
    }
    else {
        msg = "Error: " + worker->error_str;
    }

    QList<SWGChat*>* output = new QList<SWGChat*>();
    QString json(worker->response);
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonArray jsonArray = doc.array();
    auto wrapper = new SWGQObjectWrapper<QList<SWGChat*>*> (output);
    wrapper->deleteLater();
    foreach(QJsonValue obj, jsonArray) {
        SWGChat* o = new SWGChat();
        QJsonObject jv = obj.toObject();
        QJsonObject * ptr = (QJsonObject*)&jv;
        o->fromJsonObject(*ptr);
        auto objwrapper = new SWGQObjectWrapper<SWGChat*> (o);
        objwrapper->deleteLater();
        output->append(o);
    }
    worker->deleteLater();

    if (worker->error_type == QNetworkReply::NoError) {
        emit chat_getSignal(output);
    } else {
        emit chat_getSignalE(output, error_type, error_str);
        emit chat_getSignalEFull(worker, error_type, error_str);
    }
}

void
SWGChatApi::chat_getChannels() {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/chat/channels");



    SWGHttpRequestWorker *worker = new SWGHttpRequestWorker();
    SWGHttpRequestInput input(fullPath, "GET");





    foreach(QString key, this->defaultHeaders.keys()) {
        input.headers.insert(key, this->defaultHeaders.value(key));
    }

    connect(worker,
            &SWGHttpRequestWorker::on_execution_finished,
            this,
            &SWGChatApi::chat_getChannelsCallback);

    worker->execute(&input);
}

void
SWGChatApi::chat_getChannelsCallback(SWGHttpRequestWorker * worker) {
    QString msg;
    QString error_str = worker->error_str;
    QNetworkReply::NetworkError error_type = worker->error_type;

    if (worker->error_type == QNetworkReply::NoError) {
        msg = QString("Success! %1 bytes").arg(worker->response.length());
    }
    else {
        msg = "Error: " + worker->error_str;
    }

    QList<SWGChatChannel*>* output = new QList<SWGChatChannel*>();
    QString json(worker->response);
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonArray jsonArray = doc.array();
    auto wrapper = new SWGQObjectWrapper<QList<SWGChatChannel*>*> (output);
    wrapper->deleteLater();
    foreach(QJsonValue obj, jsonArray) {
        SWGChatChannel* o = new SWGChatChannel();
        QJsonObject jv = obj.toObject();
        QJsonObject * ptr = (QJsonObject*)&jv;
        o->fromJsonObject(*ptr);
        auto objwrapper = new SWGQObjectWrapper<SWGChatChannel*> (o);
        objwrapper->deleteLater();
        output->append(o);
    }
    worker->deleteLater();

    if (worker->error_type == QNetworkReply::NoError) {
        emit chat_getChannelsSignal(output);
    } else {
        emit chat_getChannelsSignalE(output, error_type, error_str);
        emit chat_getChannelsSignalEFull(worker, error_type, error_str);
    }
}

void
SWGChatApi::chat_getConnected() {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/chat/connected");



    SWGHttpRequestWorker *worker = new SWGHttpRequestWorker();
    SWGHttpRequestInput input(fullPath, "GET");





    foreach(QString key, this->defaultHeaders.keys()) {
        input.headers.insert(key, this->defaultHeaders.value(key));
    }

    connect(worker,
            &SWGHttpRequestWorker::on_execution_finished,
            this,
            &SWGChatApi::chat_getConnectedCallback);

    worker->execute(&input);
}

void
SWGChatApi::chat_getConnectedCallback(SWGHttpRequestWorker * worker) {
    QString msg;
    QString error_str = worker->error_str;
    QNetworkReply::NetworkError error_type = worker->error_type;

    if (worker->error_type == QNetworkReply::NoError) {
        msg = QString("Success! %1 bytes").arg(worker->response.length());
    }
    else {
        msg = "Error: " + worker->error_str;
    }

    QString json(worker->response);
    SWGConnectedUsers* output = static_cast<SWGConnectedUsers*>(create(json, QString("SWGConnectedUsers")));
    auto wrapper = new SWGQObjectWrapper<SWGConnectedUsers*> (output);
    wrapper->deleteLater();
    worker->deleteLater();

    if (worker->error_type == QNetworkReply::NoError) {
        emit chat_getConnectedSignal(output);
    } else {
        emit chat_getConnectedSignalE(output, error_type, error_str);
        emit chat_getConnectedSignalEFull(worker, error_type, error_str);
    }
}

void
SWGChatApi::chat_getPinnedMessage(double channel_id) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/chat/pinned");


    if (fullPath.indexOf("?") > 0)
      fullPath.append("&");
    else
      fullPath.append("?");
    fullPath.append(QUrl::toPercentEncoding("channelID"))
        .append("=")
        .append(QUrl::toPercentEncoding(stringValue(channel_id)));


    SWGHttpRequestWorker *worker = new SWGHttpRequestWorker();
    SWGHttpRequestInput input(fullPath, "GET");





    foreach(QString key, this->defaultHeaders.keys()) {
        input.headers.insert(key, this->defaultHeaders.value(key));
    }

    connect(worker,
            &SWGHttpRequestWorker::on_execution_finished,
            this,
            &SWGChatApi::chat_getPinnedMessageCallback);

    worker->execute(&input);
}

void
SWGChatApi::chat_getPinnedMessageCallback(SWGHttpRequestWorker * worker) {
    QString msg;
    QString error_str = worker->error_str;
    QNetworkReply::NetworkError error_type = worker->error_type;

    if (worker->error_type == QNetworkReply::NoError) {
        msg = QString("Success! %1 bytes").arg(worker->response.length());
    }
    else {
        msg = "Error: " + worker->error_str;
    }

    QString json(worker->response);
    SWGPinnedMessage* output = static_cast<SWGPinnedMessage*>(create(json, QString("SWGPinnedMessage")));
    auto wrapper = new SWGQObjectWrapper<SWGPinnedMessage*> (output);
    wrapper->deleteLater();
    worker->deleteLater();

    if (worker->error_type == QNetworkReply::NoError) {
        emit chat_getPinnedMessageSignal(output);
    } else {
        emit chat_getPinnedMessageSignalE(output, error_type, error_str);
        emit chat_getPinnedMessageSignalEFull(worker, error_type, error_str);
    }
}

void
SWGChatApi::chat_new(QString* message, double channel_id) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/chat");



    SWGHttpRequestWorker *worker = new SWGHttpRequestWorker();
    SWGHttpRequestInput input(fullPath, "POST");

    if (message != nullptr) {
        input.add_var("message", *message);
    }
    if (channel_id != nullptr) {
        input.add_var("channelID", *channel_id);
    }




    foreach(QString key, this->defaultHeaders.keys()) {
        input.headers.insert(key, this->defaultHeaders.value(key));
    }

    connect(worker,
            &SWGHttpRequestWorker::on_execution_finished,
            this,
            &SWGChatApi::chat_newCallback);

    worker->execute(&input);
}

void
SWGChatApi::chat_newCallback(SWGHttpRequestWorker * worker) {
    QString msg;
    QString error_str = worker->error_str;
    QNetworkReply::NetworkError error_type = worker->error_type;

    if (worker->error_type == QNetworkReply::NoError) {
        msg = QString("Success! %1 bytes").arg(worker->response.length());
    }
    else {
        msg = "Error: " + worker->error_str;
    }

    QString json(worker->response);
    SWGChat* output = static_cast<SWGChat*>(create(json, QString("SWGChat")));
    auto wrapper = new SWGQObjectWrapper<SWGChat*> (output);
    wrapper->deleteLater();
    worker->deleteLater();

    if (worker->error_type == QNetworkReply::NoError) {
        emit chat_newSignal(output);
    } else {
        emit chat_newSignalE(output, error_type, error_str);
        emit chat_newSignalEFull(worker, error_type, error_str);
    }
}


}
