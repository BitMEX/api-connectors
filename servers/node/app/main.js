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
var TradeApi = require("./apis/TradeApi.js");
var QuoteApi = require("./apis/QuoteApi.js");
var OrderApi = require("./apis/OrderApi.js");
var UserApi = require("./apis/UserApi.js");
swagger.addModels(models)
  .addGET(SchemaApi.find)
.addGET(SchemaApi.websocketHelp)
.addGET(OrderBookApi.getOrderBook)
.addGET(ExecutionApi.getMyExecutions)
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
.addGET(TradeApi.getBucketed)
.addGET(TradeApi.getByDate)
.addGET(TradeApi.getRecent)
.addGET(QuoteApi.getBucketed)
.addPOST(OrderApi.newOrder)
.addPOST(OrderApi.newOrder_OrderApi_0)
.addDELETE(OrderApi.cancelOrder)
.addGET(OrderApi.getOrders)
.addPOST(OrderApi.cancelOrder_OrderApi_0)
.addGET(OrderApi.getOrders_OrderApi_0)
.addGET(OrderApi.getOrders_OrderApi_1)
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
.addPOST(UserApi.newUser)
.addGET(UserApi.getMe)
.addPUT(UserApi.updateMe)
.addPOST(UserApi.login)
.addPOST(UserApi.logout)
.addPOST(UserApi.savePreferences)
.addGET(UserApi.getCommission)
;
  // configures the app
swagger.configure("http://localhost:8002", "0.1");

//  start the server
app.listen(8002);

