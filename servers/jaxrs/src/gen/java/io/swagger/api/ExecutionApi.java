package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.ExecutionApiService;
import io.swagger.api.factories.ExecutionApiServiceFactory;

import io.swagger.annotations.ApiParam;

import com.sun.jersey.multipart.FormDataParam;

import io.swagger.model.Execution;
import io.swagger.model.Error;
import java.math.BigDecimal;
import java.util.Date;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataParam;

import javax.ws.rs.core.Response;
import javax.ws.rs.*;

@Path("/execution")
@Consumes({ "application/json", "application/x-www-form-urlencoded" })
@Produces({ "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" })
@io.swagger.annotations.Api(description = "the execution API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-07-04T18:25:32.992-05:00")
public class ExecutionApi  {
   private final ExecutionApiService delegate = ExecutionApiServiceFactory.getExecutionApi();

    @GET
    
    @Consumes({ "application/json", "application/x-www-form-urlencoded" })
    @Produces({ "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" })
    @io.swagger.annotations.ApiOperation(value = "Get all raw executions for your account.", notes = "This returns all raw transactions, which includes order opening and cancelation, and order status\nchanges. It can be quite noisy. More focused information is available at `/execution/tradeHistory`.\n\nYou may also use the `filter` param to target your query. Specify an array as a filter value, such as\n`{\"execType\": [\"Settlement\", \"Trade\"]}` to filter on multiple values.\n\nSee [the FIX Spec](http://www.onixs.biz/fix-dictionary/5.0.SP2/msgType_8_8.html) for explanations of these fields.", response = Execution.class, responseContainer = "List", tags={ "Execution",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Request was successful", response = Execution.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Parameter Error", response = Execution.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized", response = Execution.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found", response = Execution.class, responseContainer = "List") })

    public Response executionGet(@ApiParam(value = "Instrument symbol. Send a bare series (e.g. XBU) to get data for the nearest expiring contract in that series.\n\nYou can also send a timeframe, e.g. `XBU:monthly`. Timeframes are `daily`, `weekly`, `monthly`, `quarterly`, and `biquarterly`.") @QueryParam("symbol") String symbol,
    @ApiParam(value = "Generic table filter. Send JSON key/value pairs, such as `{\"key\": \"value\"}`. You can key on individual fields, and do more advanced querying on timestamps. See the [Timestamp Docs](https://www.bitmex.com/app/restAPI#timestamp-filters) for more details.") @QueryParam("filter") String filter,
    @ApiParam(value = "Array of column names to fetch. If omitted, will return all columns.\n\nNote that this method will always return item keys, even when not specified, so you may receive more columns that you expect.") @QueryParam("columns") String columns,
    @ApiParam(value = "Number of results to fetch.", defaultValue="100") @QueryParam("count") BigDecimal count,
    @ApiParam(value = "Starting point for results.", defaultValue="0") @QueryParam("start") BigDecimal start,
    @ApiParam(value = "If true, will sort results newest first.", defaultValue="false") @QueryParam("reverse") Boolean reverse,
    @ApiParam(value = "Starting date filter for results.") @QueryParam("startTime") Date startTime,
    @ApiParam(value = "Ending date filter for results.") @QueryParam("endTime") Date endTime)
    throws NotFoundException {
        return delegate.executionGet(symbol,filter,columns,count,start,reverse,startTime,endTime);
    }
    @GET
    @Path("/tradeHistory")
    @Consumes({ "application/json", "application/x-www-form-urlencoded" })
    @Produces({ "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" })
    @io.swagger.annotations.ApiOperation(value = "Get all balance-affecting executions. This includes each trade, insurance charge, and settlement.", notes = "", response = Execution.class, responseContainer = "List", tags={ "Execution" })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Request was successful", response = Execution.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Parameter Error", response = Execution.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized", response = Execution.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found", response = Execution.class, responseContainer = "List") })

    public Response executionGetTradeHistory(@ApiParam(value = "Instrument symbol. Send a bare series (e.g. XBU) to get data for the nearest expiring contract in that series.\n\nYou can also send a timeframe, e.g. `XBU:monthly`. Timeframes are `daily`, `weekly`, `monthly`, `quarterly`, and `biquarterly`.") @QueryParam("symbol") String symbol,
    @ApiParam(value = "Generic table filter. Send JSON key/value pairs, such as `{\"key\": \"value\"}`. You can key on individual fields, and do more advanced querying on timestamps. See the [Timestamp Docs](https://www.bitmex.com/app/restAPI#timestamp-filters) for more details.") @QueryParam("filter") String filter,
    @ApiParam(value = "Array of column names to fetch. If omitted, will return all columns.\n\nNote that this method will always return item keys, even when not specified, so you may receive more columns that you expect.") @QueryParam("columns") String columns,
    @ApiParam(value = "Number of results to fetch.", defaultValue="100") @QueryParam("count") BigDecimal count,
    @ApiParam(value = "Starting point for results.", defaultValue="0") @QueryParam("start") BigDecimal start,
    @ApiParam(value = "If true, will sort results newest first.", defaultValue="false") @QueryParam("reverse") Boolean reverse,
    @ApiParam(value = "Starting date filter for results.") @QueryParam("startTime") Date startTime,
    @ApiParam(value = "Ending date filter for results.") @QueryParam("endTime") Date endTime)
    throws NotFoundException {
        return delegate.executionGetTradeHistory(symbol,filter,columns,count,start,reverse,startTime,endTime);
    }
}

