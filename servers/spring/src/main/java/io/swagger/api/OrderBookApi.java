package io.swagger.api;

import io.swagger.model.OrderBook;
import io.swagger.model.Error;
import java.math.BigDecimal;
import io.swagger.model.OrderBookL2;

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-07-05T09:41:19.947-05:00")

@Api(value = "orderBook", description = "the orderBook API")
public interface OrderBookApi {

    @ApiOperation(value = "Get current orderbook [deprecated, use /orderBook/L2].", notes = "", response = OrderBook.class, responseContainer = "List", tags={ "OrderBook", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Request was successful", response = OrderBook.class),
        @ApiResponse(code = 400, message = "Parameter Error", response = OrderBook.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = OrderBook.class),
        @ApiResponse(code = 404, message = "Not Found", response = OrderBook.class) })
    @RequestMapping(value = "/orderBook",
        produces = { "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" }, 
        consumes = { "application/json", "application/x-www-form-urlencoded" },
        method = RequestMethod.GET)
    ResponseEntity<List<OrderBook>> orderBookGet(@ApiParam(value = "Instrument symbol. Send a series (e.g. XBT) to get data for the nearest contract in that series.", required = true) @RequestParam(value = "symbol", required = true) String symbol,@ApiParam(value = "Orderbook depth.", defaultValue = "25") @RequestParam(value = "depth", required = false, defaultValue="25") BigDecimal depth);


    @ApiOperation(value = "Get current orderbook in vertical format.", notes = "", response = OrderBookL2.class, responseContainer = "List", tags={ "OrderBook", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Request was successful", response = OrderBookL2.class),
        @ApiResponse(code = 400, message = "Parameter Error", response = OrderBookL2.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = OrderBookL2.class),
        @ApiResponse(code = 404, message = "Not Found", response = OrderBookL2.class) })
    @RequestMapping(value = "/orderBook/L2",
        produces = { "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" }, 
        consumes = { "application/json", "application/x-www-form-urlencoded" },
        method = RequestMethod.GET)
    ResponseEntity<List<OrderBookL2>> orderBookGetL2(@ApiParam(value = "Instrument symbol. Send a series (e.g. XBT) to get data for the nearest contract in that series.", required = true) @RequestParam(value = "symbol", required = true) String symbol,@ApiParam(value = "Orderbook depth per side. Send 0 for full depth.", defaultValue = "25") @RequestParam(value = "depth", required = false, defaultValue="25") BigDecimal depth);

}
