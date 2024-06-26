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

#include "SWGPositionApi.h"
#include "SWGHelpers.h"
#include "SWGModelFactory.h"
#include "SWGQObjectWrapper.h"

#include <QJsonArray>
#include <QJsonDocument>

namespace Swagger {

SWGPositionApi::SWGPositionApi() {}

SWGPositionApi::~SWGPositionApi() {}

SWGPositionApi::SWGPositionApi(QString host, QString basePath) {
    this->host = host;
    this->basePath = basePath;
}

void
SWGPositionApi::position_get(QString* filter, QString* columns, qint32 count) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/position");


    if (fullPath.indexOf("?") > 0)
      fullPath.append("&");
    else
      fullPath.append("?");
    fullPath.append(QUrl::toPercentEncoding("filter"))
        .append("=")
        .append(QUrl::toPercentEncoding(stringValue(filter)));

    if (fullPath.indexOf("?") > 0)
      fullPath.append("&");
    else
      fullPath.append("?");
    fullPath.append(QUrl::toPercentEncoding("columns"))
        .append("=")
        .append(QUrl::toPercentEncoding(stringValue(columns)));

    if (fullPath.indexOf("?") > 0)
      fullPath.append("&");
    else
      fullPath.append("?");
    fullPath.append(QUrl::toPercentEncoding("count"))
        .append("=")
        .append(QUrl::toPercentEncoding(stringValue(count)));


    SWGHttpRequestWorker *worker = new SWGHttpRequestWorker();
    SWGHttpRequestInput input(fullPath, "GET");





    foreach(QString key, this->defaultHeaders.keys()) {
        input.headers.insert(key, this->defaultHeaders.value(key));
    }

    connect(worker,
            &SWGHttpRequestWorker::on_execution_finished,
            this,
            &SWGPositionApi::position_getCallback);

    worker->execute(&input);
}

void
SWGPositionApi::position_getCallback(SWGHttpRequestWorker * worker) {
    QString msg;
    QString error_str = worker->error_str;
    QNetworkReply::NetworkError error_type = worker->error_type;

    if (worker->error_type == QNetworkReply::NoError) {
        msg = QString("Success! %1 bytes").arg(worker->response.length());
    }
    else {
        msg = "Error: " + worker->error_str;
    }

    QList<SWGPosition*>* output = new QList<SWGPosition*>();
    QString json(worker->response);
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonArray jsonArray = doc.array();
    auto wrapper = new SWGQObjectWrapper<QList<SWGPosition*>*> (output);
    wrapper->deleteLater();
    foreach(QJsonValue obj, jsonArray) {
        SWGPosition* o = new SWGPosition();
        QJsonObject jv = obj.toObject();
        QJsonObject * ptr = (QJsonObject*)&jv;
        o->fromJsonObject(*ptr);
        auto objwrapper = new SWGQObjectWrapper<SWGPosition*> (o);
        objwrapper->deleteLater();
        output->append(o);
    }
    worker->deleteLater();

    if (worker->error_type == QNetworkReply::NoError) {
        emit position_getSignal(output);
    } else {
        emit position_getSignalE(output, error_type, error_str);
        emit position_getSignalEFull(worker, error_type, error_str);
    }
}

void
SWGPositionApi::position_isolateMargin(QString* symbol, bool enabled) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/position/isolate");



    SWGHttpRequestWorker *worker = new SWGHttpRequestWorker();
    SWGHttpRequestInput input(fullPath, "POST");

    if (symbol != nullptr) {
        input.add_var("symbol", *symbol);
    }
    if (enabled != nullptr) {
        input.add_var("enabled", *enabled);
    }




    foreach(QString key, this->defaultHeaders.keys()) {
        input.headers.insert(key, this->defaultHeaders.value(key));
    }

    connect(worker,
            &SWGHttpRequestWorker::on_execution_finished,
            this,
            &SWGPositionApi::position_isolateMarginCallback);

    worker->execute(&input);
}

void
SWGPositionApi::position_isolateMarginCallback(SWGHttpRequestWorker * worker) {
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
    SWGPosition* output = static_cast<SWGPosition*>(create(json, QString("SWGPosition")));
    auto wrapper = new SWGQObjectWrapper<SWGPosition*> (output);
    wrapper->deleteLater();
    worker->deleteLater();

    if (worker->error_type == QNetworkReply::NoError) {
        emit position_isolateMarginSignal(output);
    } else {
        emit position_isolateMarginSignalE(output, error_type, error_str);
        emit position_isolateMarginSignalEFull(worker, error_type, error_str);
    }
}

void
SWGPositionApi::position_transferIsolatedMargin(QString* symbol, qint64 amount, double target_account_id) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/position/transferMargin");



    SWGHttpRequestWorker *worker = new SWGHttpRequestWorker();
    SWGHttpRequestInput input(fullPath, "POST");

    if (symbol != nullptr) {
        input.add_var("symbol", *symbol);
    }
    if (amount != nullptr) {
        input.add_var("amount", *amount);
    }
    if (target_account_id != nullptr) {
        input.add_var("targetAccountId", *target_account_id);
    }




    foreach(QString key, this->defaultHeaders.keys()) {
        input.headers.insert(key, this->defaultHeaders.value(key));
    }

    connect(worker,
            &SWGHttpRequestWorker::on_execution_finished,
            this,
            &SWGPositionApi::position_transferIsolatedMarginCallback);

    worker->execute(&input);
}

void
SWGPositionApi::position_transferIsolatedMarginCallback(SWGHttpRequestWorker * worker) {
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
    SWGPosition* output = static_cast<SWGPosition*>(create(json, QString("SWGPosition")));
    auto wrapper = new SWGQObjectWrapper<SWGPosition*> (output);
    wrapper->deleteLater();
    worker->deleteLater();

    if (worker->error_type == QNetworkReply::NoError) {
        emit position_transferIsolatedMarginSignal(output);
    } else {
        emit position_transferIsolatedMarginSignalE(output, error_type, error_str);
        emit position_transferIsolatedMarginSignalEFull(worker, error_type, error_str);
    }
}

void
SWGPositionApi::position_updateLeverage(QString* symbol, double leverage, double target_account_id) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/position/leverage");



    SWGHttpRequestWorker *worker = new SWGHttpRequestWorker();
    SWGHttpRequestInput input(fullPath, "POST");

    if (symbol != nullptr) {
        input.add_var("symbol", *symbol);
    }
    if (leverage != nullptr) {
        input.add_var("leverage", *leverage);
    }
    if (target_account_id != nullptr) {
        input.add_var("targetAccountId", *target_account_id);
    }




    foreach(QString key, this->defaultHeaders.keys()) {
        input.headers.insert(key, this->defaultHeaders.value(key));
    }

    connect(worker,
            &SWGHttpRequestWorker::on_execution_finished,
            this,
            &SWGPositionApi::position_updateLeverageCallback);

    worker->execute(&input);
}

void
SWGPositionApi::position_updateLeverageCallback(SWGHttpRequestWorker * worker) {
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
    SWGPosition* output = static_cast<SWGPosition*>(create(json, QString("SWGPosition")));
    auto wrapper = new SWGQObjectWrapper<SWGPosition*> (output);
    wrapper->deleteLater();
    worker->deleteLater();

    if (worker->error_type == QNetworkReply::NoError) {
        emit position_updateLeverageSignal(output);
    } else {
        emit position_updateLeverageSignalE(output, error_type, error_str);
        emit position_updateLeverageSignalEFull(worker, error_type, error_str);
    }
}

void
SWGPositionApi::position_updateRiskLimit(QString* symbol, qint64 risk_limit, double target_account_id) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/position/riskLimit");



    SWGHttpRequestWorker *worker = new SWGHttpRequestWorker();
    SWGHttpRequestInput input(fullPath, "POST");

    if (symbol != nullptr) {
        input.add_var("symbol", *symbol);
    }
    if (risk_limit != nullptr) {
        input.add_var("riskLimit", *risk_limit);
    }
    if (target_account_id != nullptr) {
        input.add_var("targetAccountId", *target_account_id);
    }




    foreach(QString key, this->defaultHeaders.keys()) {
        input.headers.insert(key, this->defaultHeaders.value(key));
    }

    connect(worker,
            &SWGHttpRequestWorker::on_execution_finished,
            this,
            &SWGPositionApi::position_updateRiskLimitCallback);

    worker->execute(&input);
}

void
SWGPositionApi::position_updateRiskLimitCallback(SWGHttpRequestWorker * worker) {
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
    SWGPosition* output = static_cast<SWGPosition*>(create(json, QString("SWGPosition")));
    auto wrapper = new SWGQObjectWrapper<SWGPosition*> (output);
    wrapper->deleteLater();
    worker->deleteLater();

    if (worker->error_type == QNetworkReply::NoError) {
        emit position_updateRiskLimitSignal(output);
    } else {
        emit position_updateRiskLimitSignalE(output, error_type, error_str);
        emit position_updateRiskLimitSignalEFull(worker, error_type, error_str);
    }
}


}
