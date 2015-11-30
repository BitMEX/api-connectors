package io.swagger.api;

import io.swagger.model.*;

import io.swagger.model.Order;
import io.swagger.model.Error;
import java.math.BigDecimal;
import java.util.Date;
import io.swagger.model.InlineResponse200;
import io.swagger.model.LiquidationOrder;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.Authorization;
import io.swagger.annotations.AuthorizationScope;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

import static org.springframework.http.MediaType.*;

@Controller
@RequestMapping(value = "/order", produces = {APPLICATION_JSON_VALUE})
@Api(value = "/order", description = "the order API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringMVCServerCodegen", date = "2015-11-30T13:36:04.774-06:00")
public class OrderApi {
  

  @ApiOperation(value = "Get your orders.", notes = "To get open orders only, send {\"open\": true} in the filter param.", response = Order.class, responseContainer = "List")
  @ApiResponses(value = { 
    @ApiResponse(code = 200, message = "Request was successful"),
    @ApiResponse(code = 400, message = "Parameter Error"),
    @ApiResponse(code = 401, message = "Unauthorized"),
    @ApiResponse(code = 404, message = "Not Found") })
  @RequestMapping(value = "", 
    produces = { "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" }, 
    consumes = { "application/json", "application/x-www-form-urlencoded" },
    method = RequestMethod.GET)
  public ResponseEntity<List<Order>> orderGetOrders(@ApiParam(value = "Instrument symbol. Send a bare series (e.g. XBU) to get data for the nearest expiring contract in that series.\n\nYou can also send a timeframe, e.g. 'XBU:monthly'. Timeframes are 'daily', 'weekly', 'monthly', 'quarterly', and 'biquarterly'.") @RequestParam(value = "symbol", required = false) String symbol


,
    @ApiParam(value = "Generic table filter. Send JSON key/value pairs, such as {\"key\": \"value\"}. You can key on individual fields, and do more advanced querying on timestamps. See <a href=\"http://localhost:2001/app/restAPI#timestamp-filters\">http://localhost:2001/app/restAPI#timestamp-filters</a> for more details.") @RequestParam(value = "filter", required = false) String filter


,
    @ApiParam(value = "Array of column names to fetch. If omitted, will return all columns.\n\nNote that this method will always return item keys, even when not specified, so you may receive more columns that you expect.") @RequestParam(value = "columns", required = false) String columns


,
    @ApiParam(value = "Number of results to fetch.", defaultValue = "100") @RequestParam(value = "count", required = false, defaultValue="100") BigDecimal count


,
    @ApiParam(value = "Starting point for results.", defaultValue = "0") @RequestParam(value = "start", required = false, defaultValue="0") BigDecimal start


,
    @ApiParam(value = "If true, will sort results newest first.", defaultValue = "false") @RequestParam(value = "reverse", required = false, defaultValue="false") Boolean reverse


,
    @ApiParam(value = "Starting date filter for results.") @RequestParam(value = "startTime", required = false) Date startTime


,
    @ApiParam(value = "Ending date filter for results.") @RequestParam(value = "endTime", required = false) Date endTime


)
      throws NotFoundException {
      // do some magic!
      return new ResponseEntity<List<Order>>(HttpStatus.OK);
  }

  

  @ApiOperation(value = "Create a new order.", notes = "This endpoint is used for placing orders. Valid order types are 'Limit' and 'StopLimit'. If none is provided, BitMEX will assume a Limit Order.\n\nA note on API tools: if you want to keep track of order IDs yourself, set a unique clOrdID per order. This ID will come back as a property on the order and any related executions (including on the WebSocket), and can be used to get or cancel the order. Max length is 36 characters.\n\nTo generate a clOrdID, consider setting a prefix, and incrementing a counter or generating a UUID. Some UUIDs are longer than 36 characters, so use a url-safe base64 encoding. For example, the prefix 'bmex_mm_' and the UUID '7fbd6545-bb0c-11e4-a273-6003088a7c04' creates 'bmex_mm_f71lRbsMEeSic2ADCIp8BA'.\n\nSee the BitMEX <a href='https://github.com/BitMEX/market-maker/blob/22c75a2b6db63e20212813e9afdb845db1b09b2a/bitmex.py#L152'>Reference Market Maker</a> for an example of how to use and generate clOrdIDs.", response = Order.class)
  @ApiResponses(value = { 
    @ApiResponse(code = 200, message = "Request was successful"),
    @ApiResponse(code = 400, message = "Parameter Error"),
    @ApiResponse(code = 401, message = "Unauthorized"),
    @ApiResponse(code = 404, message = "Not Found") })
  @RequestMapping(value = "", 
    produces = { "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" }, 
    consumes = { "application/json", "application/x-www-form-urlencoded" },
    method = RequestMethod.POST)
  public ResponseEntity<Order> orderNewOrder(


@ApiParam(value = "Instrument symbol.", required=true ) @RequestPart(value="symbol", required=true)  String symbol
,
    


@ApiParam(value = "Quantity. Use positive numbers to buy, negative to sell.", required=true ) @RequestPart(value="quantity", required=true)  BigDecimal quantity
,
    


@ApiParam(value = "Order price.", required=true ) @RequestPart(value="price", required=true)  Double price
,
    


@ApiParam(value = "Time in force. Valid options: 'IOC' (Immediate-Or-Cancel), 'GTC' (Good-Till-Cancelled)." , defaultValue="GTC") @RequestPart(value="timeInForce", required=false)  String timeInForce
,
    


@ApiParam(value = "Order type. Available: 'Limit', 'StopLimit'" , defaultValue="Limit") @RequestPart(value="type", required=false)  String type
,
    


@ApiParam(value = "If order type is 'StopLimit', this is the trigger/stop price." ) @RequestPart(value="stopPrice", required=false)  Double stopPrice
,
    


@ApiParam(value = "Optional Client Order ID to give this order. This ID will come back on any execution messages tied to this order." ) @RequestPart(value="clOrdID", required=false)  String clOrdID
)
      throws NotFoundException {
      // do some magic!
      return new ResponseEntity<Order>(HttpStatus.OK);
  }

  

  @ApiOperation(value = "Cancel order(s). Send multiple order IDs to cancel in bulk.", notes = "Either an orderID or a clOrdID must be provided.", response = Order.class, responseContainer = "List")
  @ApiResponses(value = { 
    @ApiResponse(code = 200, message = "Request was successful"),
    @ApiResponse(code = 400, message = "Parameter Error"),
    @ApiResponse(code = 401, message = "Unauthorized"),
    @ApiResponse(code = 404, message = "Not Found") })
  @RequestMapping(value = "", 
    produces = { "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" }, 
    consumes = { "application/json", "application/x-www-form-urlencoded" },
    method = RequestMethod.DELETE)
  public ResponseEntity<List<Order>> orderCancelOrder(


@ApiParam(value = "Order ID(s)." ) @RequestPart(value="orderID", required=false)  String orderID
,
    


@ApiParam(value = "Client Order ID(s). See POST /order." ) @RequestPart(value="clOrdID", required=false)  String clOrdID
,
    


@ApiParam(value = "Optional cancellation annotation. e.g. 'Spread Exceeded'" ) @RequestPart(value="text", required=false)  String text
)
      throws NotFoundException {
      // do some magic!
      return new ResponseEntity<List<Order>>(HttpStatus.OK);
  }

  

  @ApiOperation(value = "Cancels all of your orders.", notes = "", response = InlineResponse200.class)
  @ApiResponses(value = { 
    @ApiResponse(code = 200, message = "Request was successful"),
    @ApiResponse(code = 400, message = "Parameter Error"),
    @ApiResponse(code = 401, message = "Unauthorized"),
    @ApiResponse(code = 404, message = "Not Found") })
  @RequestMapping(value = "/all", 
    produces = { "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" }, 
    consumes = { "application/json", "application/x-www-form-urlencoded" },
    method = RequestMethod.DELETE)
  public ResponseEntity<InlineResponse200> orderCancelAll(


@ApiParam(value = "Optional symbol. If provided, only cancels orders for that symbol." ) @RequestPart(value="symbol", required=false)  String symbol
,
    


@ApiParam(value = "Optional filter for cancellation. Use to only cancel some orders, e.g. `{\"side\": \"Buy\"}`." ) @RequestPart(value="filter", required=false)  String filter
,
    


@ApiParam(value = "Optional cancellation annotation. e.g. 'Spread Exceeded'" ) @RequestPart(value="text", required=false)  String text
)
      throws NotFoundException {
      // do some magic!
      return new ResponseEntity<InlineResponse200>(HttpStatus.OK);
  }

  

  @ApiOperation(value = "Automatically cancel all your orders after a specified timeout.", notes = "Useful as a dead-man's switch to ensure your orders are canceled in case of an outage. If called repeatedly, the existing offset will be canceled and a new one will be inserted in its place. <br><br>Example usage: call this route at 15s intervals with an offset of 60000 (60s). If this route is not called within 60 seconds, all your orders will be automatically canceled.<br><br>This is also available via <a href=\"https://www.bitmex.com/app/wsAPI#dead-man-s-switch-auto-cancel-\">WebSocket</a>.", response = InlineResponse200.class)
  @ApiResponses(value = { 
    @ApiResponse(code = 200, message = "Request was successful"),
    @ApiResponse(code = 400, message = "Parameter Error"),
    @ApiResponse(code = 401, message = "Unauthorized"),
    @ApiResponse(code = 404, message = "Not Found") })
  @RequestMapping(value = "/cancelAllAfter", 
    produces = { "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" }, 
    consumes = { "application/json", "application/x-www-form-urlencoded" },
    method = RequestMethod.POST)
  public ResponseEntity<InlineResponse200> orderCancelAllAfter(


@ApiParam(value = "Timeout in ms. Set to 0 to cancel this timer.", required=true ) @RequestPart(value="timeout", required=true)  Double timeout
)
      throws NotFoundException {
      // do some magic!
      return new ResponseEntity<InlineResponse200>(HttpStatus.OK);
  }

  

  @ApiOperation(value = "Close a position with a market order.", notes = "If no price is specified, a market order will be submitted to close the entirety of your position. Be careful with market orders as you may not be filled at a favorable price.", response = Order.class)
  @ApiResponses(value = { 
    @ApiResponse(code = 200, message = "Request was successful"),
    @ApiResponse(code = 400, message = "Parameter Error"),
    @ApiResponse(code = 401, message = "Unauthorized"),
    @ApiResponse(code = 404, message = "Not Found") })
  @RequestMapping(value = "/closePosition", 
    produces = { "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" }, 
    consumes = { "application/json", "application/x-www-form-urlencoded" },
    method = RequestMethod.POST)
  public ResponseEntity<Order> orderClosePosition(


@ApiParam(value = "Symbol of position to close.", required=true ) @RequestPart(value="symbol", required=true)  String symbol
,
    


@ApiParam(value = "Optional limit price." ) @RequestPart(value="price", required=false)  Double price
)
      throws NotFoundException {
      // do some magic!
      return new ResponseEntity<Order>(HttpStatus.OK);
  }

  

  @ApiOperation(value = "Get open liquidation orders.", notes = "", response = LiquidationOrder.class, responseContainer = "List")
  @ApiResponses(value = { 
    @ApiResponse(code = 200, message = "Request was successful"),
    @ApiResponse(code = 400, message = "Parameter Error"),
    @ApiResponse(code = 401, message = "Unauthorized"),
    @ApiResponse(code = 404, message = "Not Found") })
  @RequestMapping(value = "/liquidations", 
    produces = { "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" }, 
    consumes = { "application/json", "application/x-www-form-urlencoded" },
    method = RequestMethod.GET)
  public ResponseEntity<List<LiquidationOrder>> orderGetCloseOutOrders(@ApiParam(value = "Filter. For example, send {\"symbol\": \"XBT24H\"}.") @RequestParam(value = "filter", required = false) String filter


)
      throws NotFoundException {
      // do some magic!
      return new ResponseEntity<List<LiquidationOrder>>(HttpStatus.OK);
  }

  
}
