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
var PositionApi = require("./apis/PositionApi.js");
var InstrumentApi = require("./apis/InstrumentApi.js");
var ChatApi = require("./apis/ChatApi.js");
var TradeApi = require("./apis/TradeApi.js");
var QuoteApi = require("./apis/QuoteApi.js");
var LeaderboardApi = require("./apis/LeaderboardApi.js");
var OrderApi = require("./apis/OrderApi.js");
var UserApi = require("./apis/UserApi.js");
swagger.addModels(models)
  .addGET(SchemaApi.schema_find)
.addGET(OrderBookApi.orderBook_getOrderBook)
.addGET(PositionApi.position_find)
.addGET(InstrumentApi.instrument_find)
.addPOST(ChatApi.chat_create)
.addGET(ChatApi.chat_find)
.addGET(TradeApi.trade_getBucketed)
.addGET(TradeApi.trade_getByDate)
.addGET(TradeApi.trade_getRecent)
.addGET(QuoteApi.quote_getBucketed)
.addGET(LeaderboardApi.leaderboard_getOrderBook)
.addPOST(OrderApi.order_newOrder)
.addPOST(OrderApi.order_cancelOrder)
.addGET(OrderApi.order_myOrders)
.addGET(OrderApi.order_myOpenOrders)
.addPOST(UserApi.user_login)
.addPOST(UserApi.user_logout)
.addPOST(UserApi.user_create)
.addGET(UserApi.user_getMe)
.addPUT(UserApi.user_updateMe)
.addPOST(UserApi.user_savePreferences)
.addPOST(UserApi.user_verifyPhone)
.addPOST(UserApi.user_confirmPhone)
;
  // configures the app
swagger.configure("http://localhost:8002", "0.1");

//  start the server
app.listen(8002);

