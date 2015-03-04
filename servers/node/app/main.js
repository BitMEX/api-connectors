var express = require("express")
 , url = require("url")
 , cors = require("cors")
 , swagger = require("swagger-node-express")
 , db = false

var app = express();
app.use(express.bodyParser());

var corsOptions = {
  credentials: true,
  origin: function(origin,callback) {
    if(origin===undefined) {
      callback(null,false);
    } else {
      callback(null,true);
    }
  }
};

app.use(cors(corsOptions));

swagger.setAppHandler(app);  
swagger.configureSwaggerPaths("", "api-docs", "")

var models = require("./models.js");

var SchemaApi = require("./apis/SchemaApi.js");
var OrderBookApi = require("./apis/OrderBookApi.js");
var ExecutionApi = require("./apis/ExecutionApi.js");
var PositionApi = require("./apis/PositionApi.js");
var InstrumentApi = require("./apis/InstrumentApi.js");
var ChatApi = require("./apis/ChatApi.js");
var ApiKeyApi = require("./apis/ApiKeyApi.js");
var StatsApi = require("./apis/StatsApi.js");
var TradeApi = require("./apis/TradeApi.js");
var QuoteApi = require("./apis/QuoteApi.js");
var OrderApi = require("./apis/OrderApi.js");
var UserApi = require("./apis/UserApi.js");
swagger.addModels(models)
  .addGET(SchemaApi.find)
.addGET(SchemaApi.websocketHelp)
.addGET(OrderBookApi.getOrderBook)
.addGET(ExecutionApi.get)
.addGET(ExecutionApi.getTradeHistory)
.addGET(PositionApi.find)
.addGET(InstrumentApi.get)
.addGET(InstrumentApi.getActive)
.addGET(ChatApi.get)
.addPOST(ChatApi.send)
.addPOST(ApiKeyApi.createKey)
.addGET(ApiKeyApi.getKeys)
.addDELETE(ApiKeyApi.remove)
.addPOST(ApiKeyApi.disable)
.addPOST(ApiKeyApi.enable)
.addGET(StatsApi.find)
.addGET(StatsApi.history)
.addGET(TradeApi.get)
.addGET(TradeApi.getBucketed)
.addGET(TradeApi.getByDate)
.addGET(TradeApi.getRecent)
.addGET(QuoteApi.getBucketed)
.addGET(OrderApi.getOrders)
.addPOST(OrderApi.newOrder)
.addDELETE(OrderApi.cancelOrder)
.addDELETE(OrderApi.cancelAll)
.addPOST(OrderApi.cancelAllAfter)
.addGET(UserApi.getDepositAddress)
.addGET(UserApi.getWalletHistory)
.addPOST(UserApi.requestWithdrawal)
.addPOST(UserApi.cancelWithdrawal)
.addPOST(UserApi.confirmWithdrawal)
.addPOST(UserApi.requestEnableTFA)
.addPOST(UserApi.confirmEnableTFA)
.addGET(UserApi.sendVerificationEmail)
.addPOST(UserApi.confirmEmail)
.addPOST(UserApi.requestPasswordReset)
.addPOST(UserApi.confirmPasswordReset)
.addGET(UserApi.getAffiliateStatus)
.addGET(UserApi.checkReferralCode)
.addPOST(UserApi.newUser)
.addGET(UserApi.getMe)
.addPUT(UserApi.updateMe)
.addPOST(UserApi.login)
.addPOST(UserApi.logout)
.addPOST(UserApi.logoutAll)
.addPOST(UserApi.savePreferences)
.addGET(UserApi.getCommission)
.addGET(UserApi.getMargin)
;
  // configures the app
swagger.configure("http://localhost:8002", "0.1");

//  start the server
app.listen(8002);

