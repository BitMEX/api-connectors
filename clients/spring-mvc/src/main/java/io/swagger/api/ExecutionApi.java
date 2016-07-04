package io.swagger.api;

import io.swagger.model.*;

import io.swagger.model.Execution;
import io.swagger.model.Error;
import java.math.BigDecimal;
import java.util.Date;

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
@RequestMapping(value = "/execution", produces = {APPLICATION_JSON_VALUE})
@Api(value = "/execution", description = "the execution API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringMVCServerCodegen", date = "2016-07-04T18:25:23.952-05:00")
public class ExecutionApi {
  

  @ApiOperation(value = "Get all raw executions for your account.", notes = "This returns all raw transactions, which includes order opening and cancelation, and order status\nchanges. It can be quite noisy. More focused information is available at `/execution/tradeHistory`.\n\nYou may also use the `filter` param to target your query. Specify an array as a filter value, such as\n`{\"execType\": [\"Settlement\", \"Trade\"]}` to filter on multiple values.\n\nSee [the FIX Spec](http://www.onixs.biz/fix-dictionary/5.0.SP2/msgType_8_8.html) for explanations of these fields.", response = Execution.class, responseContainer = "List")
  @ApiResponses(value = { 
    @ApiResponse(code = 200, message = "Request was successful"),
    @ApiResponse(code = 400, message = "Parameter Error"),
    @ApiResponse(code = 401, message = "Unauthorized"),
    @ApiResponse(code = 404, message = "Not Found") })
  @RequestMapping(value = "", 
    produces = { "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" }, 
    consumes = { "application/json", "application/x-www-form-urlencoded" },
    method = RequestMethod.GET)
  public ResponseEntity<List<Execution>> executionGet(@ApiParam(value = "Instrument symbol. Send a bare series (e.g. XBU) to get data for the nearest expiring contract in that series.\n\nYou can also send a timeframe, e.g. `XBU:monthly`. Timeframes are `daily`, `weekly`, `monthly`, `quarterly`, and `biquarterly`.") @RequestParam(value = "symbol", required = false) String symbol


,
    @ApiParam(value = "Generic table filter. Send JSON key/value pairs, such as `{\"key\": \"value\"}`. You can key on individual fields, and do more advanced querying on timestamps. See the [Timestamp Docs](https://www.bitmex.com/app/restAPI#timestamp-filters) for more details.") @RequestParam(value = "filter", required = false) String filter


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
      return new ResponseEntity<List<Execution>>(HttpStatus.OK);
  }

  

  @ApiOperation(value = "Get all balance-affecting executions. This includes each trade, insurance charge, and settlement.", notes = "", response = Execution.class, responseContainer = "List")
  @ApiResponses(value = { 
    @ApiResponse(code = 200, message = "Request was successful"),
    @ApiResponse(code = 400, message = "Parameter Error"),
    @ApiResponse(code = 401, message = "Unauthorized"),
    @ApiResponse(code = 404, message = "Not Found") })
  @RequestMapping(value = "/tradeHistory", 
    produces = { "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" }, 
    consumes = { "application/json", "application/x-www-form-urlencoded" },
    method = RequestMethod.GET)
  public ResponseEntity<List<Execution>> executionGetTradeHistory(@ApiParam(value = "Instrument symbol. Send a bare series (e.g. XBU) to get data for the nearest expiring contract in that series.\n\nYou can also send a timeframe, e.g. `XBU:monthly`. Timeframes are `daily`, `weekly`, `monthly`, `quarterly`, and `biquarterly`.") @RequestParam(value = "symbol", required = false) String symbol


,
    @ApiParam(value = "Generic table filter. Send JSON key/value pairs, such as `{\"key\": \"value\"}`. You can key on individual fields, and do more advanced querying on timestamps. See the [Timestamp Docs](https://www.bitmex.com/app/restAPI#timestamp-filters) for more details.") @RequestParam(value = "filter", required = false) String filter


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
      return new ResponseEntity<List<Execution>>(HttpStatus.OK);
  }

  
}
