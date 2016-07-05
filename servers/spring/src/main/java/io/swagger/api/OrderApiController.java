package io.swagger.api;

import io.swagger.model.Order;
import io.swagger.model.Error;
import java.math.BigDecimal;
import org.joda.time.LocalDate;

import io.swagger.annotations.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-07-05T09:41:19.947-05:00")

@Controller
public class OrderApiController implements OrderApi {

    public ResponseEntity<Order> orderAmend(@ApiParam(value = "Order ID" ) @RequestPart(value="orderID", required=false)  String orderID,
        @ApiParam(value = "Client Order ID. See POST /order." ) @RequestPart(value="clOrdID", required=false)  String clOrdID,
        @ApiParam(value = "Optional order quantity in units of the underlying instrument (i.e. Bitcoin)." ) @RequestPart(value="simpleOrderQty", required=false)  Double simpleOrderQty,
        @ApiParam(value = "Optional order quantity in units of the instrument (i.e. contracts)." ) @RequestPart(value="orderQty", required=false)  BigDecimal orderQty,
        @ApiParam(value = "Optional leaves quantity in units of the underlying instrument (i.e. Bitcoin). Useful for amending partially filled orders." ) @RequestPart(value="simpleLeavesQty", required=false)  Double simpleLeavesQty,
        @ApiParam(value = "Optional leaves quantity in units of the instrument (i.e. contracts). Useful for amending partially filled orders." ) @RequestPart(value="leavesQty", required=false)  BigDecimal leavesQty,
        @ApiParam(value = "Optional limit price for 'Limit', 'StopLimit', and 'LimitIfTouched' orders." ) @RequestPart(value="price", required=false)  Double price,
        @ApiParam(value = "Optional trigger price for 'Stop', 'StopLimit', 'MarketIfTouched', and 'LimitIfTouched' orders. Use a price below the current price for stop-sell orders and buy-if-touched orders." ) @RequestPart(value="stopPx", required=false)  Double stopPx,
        @ApiParam(value = "Optional trailing offset from the current price for 'Stop', 'StopLimit', 'MarketIfTouched', and 'LimitIfTouched' orders; use a negative offset for stop-sell orders and buy-if-touched orders. Optional offset from the peg price for 'Pegged' orders." ) @RequestPart(value="pegOffsetValue", required=false)  Double pegOffsetValue,
        @ApiParam(value = "Optional amend annotation. e.g. 'Adjust skew'." ) @RequestPart(value="text", required=false)  String text) {
        // do some magic!
        return new ResponseEntity<Order>(HttpStatus.OK);
    }

    public ResponseEntity<List<Order>> orderAmendBulk(@ApiParam(value = "An array of orders." ) @RequestPart(value="orders", required=false)  String orders) {
        // do some magic!
        return new ResponseEntity<List<Order>>(HttpStatus.OK);
    }

    public ResponseEntity<List<Order>> orderCancel(@ApiParam(value = "Order ID(s)." ) @RequestPart(value="orderID", required=false)  String orderID,
        @ApiParam(value = "Client Order ID(s). See POST /order." ) @RequestPart(value="clOrdID", required=false)  String clOrdID,
        @ApiParam(value = "Optional cancellation annotation. e.g. 'Spread Exceeded'." ) @RequestPart(value="text", required=false)  String text) {
        // do some magic!
        return new ResponseEntity<List<Order>>(HttpStatus.OK);
    }

    public ResponseEntity<Object> orderCancelAll(@ApiParam(value = "Optional symbol. If provided, only cancels orders for that symbol." ) @RequestPart(value="symbol", required=false)  String symbol,
        @ApiParam(value = "Optional filter for cancellation. Use to only cancel some orders, e.g. `{\"side\": \"Buy\"}`." ) @RequestPart(value="filter", required=false)  String filter,
        @ApiParam(value = "Optional cancellation annotation. e.g. 'Spread Exceeded'" ) @RequestPart(value="text", required=false)  String text) {
        // do some magic!
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    public ResponseEntity<Object> orderCancelAllAfter(@ApiParam(value = "Timeout in ms. Set to 0 to cancel this timer. ", required=true ) @RequestPart(value="timeout", required=true)  Double timeout) {
        // do some magic!
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    public ResponseEntity<Order> orderClosePosition(@ApiParam(value = "Symbol of position to close.", required=true ) @RequestPart(value="symbol", required=true)  String symbol,
        @ApiParam(value = "Optional limit price." ) @RequestPart(value="price", required=false)  Double price) {
        // do some magic!
        return new ResponseEntity<Order>(HttpStatus.OK);
    }

    public ResponseEntity<List<Order>> orderGetOrders(@ApiParam(value = "Instrument symbol. Send a bare series (e.g. XBU) to get data for the nearest expiring contract in that series.  You can also send a timeframe, e.g. `XBU:monthly`. Timeframes are `daily`, `weekly`, `monthly`, `quarterly`, and `biquarterly`.") @RequestParam(value = "symbol", required = false) String symbol,
        @ApiParam(value = "Generic table filter. Send JSON key/value pairs, such as `{\"key\": \"value\"}`. You can key on individual fields, and do more advanced querying on timestamps. See the [Timestamp Docs](https://www.bitmex.com/app/restAPI#timestamp-filters) for more details.") @RequestParam(value = "filter", required = false) String filter,
        @ApiParam(value = "Array of column names to fetch. If omitted, will return all columns.  Note that this method will always return item keys, even when not specified, so you may receive more columns that you expect.") @RequestParam(value = "columns", required = false) String columns,
        @ApiParam(value = "Number of results to fetch.", defaultValue = "100") @RequestParam(value = "count", required = false, defaultValue="100") BigDecimal count,
        @ApiParam(value = "Starting point for results.", defaultValue = "0") @RequestParam(value = "start", required = false, defaultValue="0") BigDecimal start,
        @ApiParam(value = "If true, will sort results newest first.", defaultValue = "false") @RequestParam(value = "reverse", required = false, defaultValue="false") Boolean reverse,
        @ApiParam(value = "Starting date filter for results.") @RequestParam(value = "startTime", required = false) LocalDate startTime,
        @ApiParam(value = "Ending date filter for results.") @RequestParam(value = "endTime", required = false) LocalDate endTime) {
        // do some magic!
        return new ResponseEntity<List<Order>>(HttpStatus.OK);
    }

    public ResponseEntity<Order> orderNew(@ApiParam(value = "Instrument symbol. e.g. 'XBT24H'.", required=true ) @RequestPart(value="symbol", required=true)  String symbol,
        @ApiParam(value = "Order side. Valid options: Buy, Sell. Defaults to 'Buy' unless `orderQty` or `simpleOrderQty` is negative." ) @RequestPart(value="side", required=false)  String side,
        @ApiParam(value = "Order quantity in units of the underlying instrument (i.e. Bitcoin)." ) @RequestPart(value="simpleOrderQty", required=false)  Double simpleOrderQty,
        @ApiParam(value = "Deprecated: use `orderQty`." ) @RequestPart(value="quantity", required=false)  BigDecimal quantity,
        @ApiParam(value = "Order quantity in units of the instrument (i.e. contracts)." ) @RequestPart(value="orderQty", required=false)  BigDecimal orderQty,
        @ApiParam(value = "Optional limit price for 'Limit', 'StopLimit', and 'LimitIfTouched' orders." ) @RequestPart(value="price", required=false)  Double price,
        @ApiParam(value = "Optional quantity to display in the book. Use 0 for a hidden order." ) @RequestPart(value="displayQty", required=false)  BigDecimal displayQty,
        @ApiParam(value = "Deprecated: use `stopPx`." ) @RequestPart(value="stopPrice", required=false)  Double stopPrice,
        @ApiParam(value = "Optional trigger price for 'Stop', 'StopLimit', 'MarketIfTouched', and 'LimitIfTouched' orders. Use a price below the current price for stop-sell orders and buy-if-touched orders. Use `execInst` of 'MarkPrice' or 'LastPrice' to define the current price used for triggering." ) @RequestPart(value="stopPx", required=false)  Double stopPx,
        @ApiParam(value = "Optional Client Order ID. This clOrdID will come back on the order and any related executions." ) @RequestPart(value="clOrdID", required=false)  String clOrdID,
        @ApiParam(value = "Optional Client Order Link ID for contingent orders." ) @RequestPart(value="clOrdLinkID", required=false)  String clOrdLinkID,
        @ApiParam(value = "Optional trailing offset from the current price for 'Stop', 'StopLimit', 'MarketIfTouched', and 'LimitIfTouched' orders; use a negative offset for stop-sell orders and buy-if-touched orders. Optional offset from the peg price for 'Pegged' orders." ) @RequestPart(value="pegOffsetValue", required=false)  Double pegOffsetValue,
        @ApiParam(value = "Optional peg price type. Valid options: LastPeg, MidPricePeg, MarketPeg, PrimaryPeg, TrailingStopPeg, TrailingStopPeg." ) @RequestPart(value="pegPriceType", required=false)  String pegPriceType,
        @ApiParam(value = "Deprecated: use `ordType`." ) @RequestPart(value="type", required=false)  String type,
        @ApiParam(value = "Order type. Valid options: Market, Limit, Stop, StopLimit, MarketIfTouched, LimitIfTouched, MarketWithLeftOverAsLimit, Pegged. Defaults to 'Limit' when `price` is specified. Defaults to 'Stop' when `stopPx` is specified. Defaults to 'StopLimit' when `price` and `stopPx` are specified." , defaultValue="Limit") @RequestPart(value="ordType", required=false)  String ordType,
        @ApiParam(value = "Time in force. Valid options: Day, GoodTillCancel, ImmediateOrCancel, FillOrKill. Defaults to 'GoodTillCancel' for 'Limit', 'StopLimit', 'LimitIfTouched', and 'MarketWithLeftOverAsLimit' orders." ) @RequestPart(value="timeInForce", required=false)  String timeInForce,
        @ApiParam(value = "Optional execution instructions. Valid options: ParticipateDoNotInitiate, AllOrNone, MarkPrice, LastPrice, Close, ReduceOnly. 'AllOrNone' instruction requires `displayQty` to be 0. 'MarkPrice' or 'LastPrice' instruction valid for 'Stop', 'StopLimit', 'MarketIfTouched', and 'LimitIfTouched' orders." ) @RequestPart(value="execInst", required=false)  String execInst,
        @ApiParam(value = "Optional contingency type for use with `clOrdLinkID`. Valid options: OneCancelsTheOther, OneTriggersTheOther, OneUpdatesTheOtherAbsolute, OneUpdatesTheOtherProportional." ) @RequestPart(value="contingencyType", required=false)  String contingencyType,
        @ApiParam(value = "Optional order annotation. e.g. 'Take profit'." ) @RequestPart(value="text", required=false)  String text) {
        // do some magic!
        return new ResponseEntity<Order>(HttpStatus.OK);
    }

    public ResponseEntity<List<Order>> orderNewBulk(@ApiParam(value = "An array of orders." ) @RequestPart(value="orders", required=false)  String orders) {
        // do some magic!
        return new ResponseEntity<List<Order>>(HttpStatus.OK);
    }

}
