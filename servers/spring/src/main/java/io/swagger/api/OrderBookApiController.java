package io.swagger.api;

import io.swagger.model.OrderBook;
import io.swagger.model.Error;
import java.math.BigDecimal;
import io.swagger.model.OrderBookL2;

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
public class OrderBookApiController implements OrderBookApi {

    public ResponseEntity<List<OrderBook>> orderBookGet(@ApiParam(value = "Instrument symbol. Send a series (e.g. XBT) to get data for the nearest contract in that series.", required = true) @RequestParam(value = "symbol", required = true) String symbol,
        @ApiParam(value = "Orderbook depth.", defaultValue = "25") @RequestParam(value = "depth", required = false, defaultValue="25") BigDecimal depth) {
        // do some magic!
        return new ResponseEntity<List<OrderBook>>(HttpStatus.OK);
    }

    public ResponseEntity<List<OrderBookL2>> orderBookGetL2(@ApiParam(value = "Instrument symbol. Send a series (e.g. XBT) to get data for the nearest contract in that series.", required = true) @RequestParam(value = "symbol", required = true) String symbol,
        @ApiParam(value = "Orderbook depth per side. Send 0 for full depth.", defaultValue = "25") @RequestParam(value = "depth", required = false, defaultValue="25") BigDecimal depth) {
        // do some magic!
        return new ResponseEntity<List<OrderBookL2>>(HttpStatus.OK);
    }

}
