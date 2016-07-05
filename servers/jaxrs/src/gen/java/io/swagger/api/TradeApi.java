package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.TradeApiService;
import io.swagger.api.factories.TradeApiServiceFactory;

import io.swagger.annotations.ApiParam;

import io.swagger.model.Trade;
import io.swagger.model.Error;
import java.math.BigDecimal;
import java.util.Date;
import io.swagger.model.TradeBin;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/trade")
@Consumes({ "application/json", "application/x-www-form-urlencoded" })
@Produces({ "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" })
@io.swagger.annotations.Api(description = "the trade API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-07-05T09:41:09.909-05:00")
public class TradeApi  {
   private final TradeApiService delegate = TradeApiServiceFactory.getTradeApi();

    @GET
    
    @Consumes({ "application/json", "application/x-www-form-urlencoded" })
    @Produces({ "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" })
    @io.swagger.annotations.ApiOperation(value = "Get Trades.", notes = "Please note that indices (symbols starting with `.`) post trades at intervals to the trade feed. These have a `size` of 0 and are used only to indicate a changing price.  See [the FIX Spec](http://www.onixs.biz/fix-dictionary/5.0.SP2/msgType_AE_6569.html) for explanations of these fields.", response = Trade.class, responseContainer = "List", tags={ "Trade", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Request was successful", response = Trade.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Parameter Error", response = Trade.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized", response = Trade.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found", response = Trade.class, responseContainer = "List") })
    public Response tradeGet(@ApiParam(value = "Instrument symbol. Send a bare series (e.g. XBU) to get data for the nearest expiring contract in that series.  You can also send a timeframe, e.g. `XBU:monthly`. Timeframes are `daily`, `weekly`, `monthly`, `quarterly`, and `biquarterly`.") @QueryParam("symbol") String symbol,@ApiParam(value = "Generic table filter. Send JSON key/value pairs, such as `{\"key\": \"value\"}`. You can key on individual fields, and do more advanced querying on timestamps. See the [Timestamp Docs](https://www.bitmex.com/app/restAPI#timestamp-filters) for more details.") @QueryParam("filter") String filter,@ApiParam(value = "Array of column names to fetch. If omitted, will return all columns.  Note that this method will always return item keys, even when not specified, so you may receive more columns that you expect.") @QueryParam("columns") String columns,@ApiParam(value = "Number of results to fetch.", defaultValue="100") @DefaultValue("100") @QueryParam("count") BigDecimal count,@ApiParam(value = "Starting point for results.", defaultValue="0") @DefaultValue("0") @QueryParam("start") BigDecimal start,@ApiParam(value = "If true, will sort results newest first.", defaultValue="false") @DefaultValue("false") @QueryParam("reverse") Boolean reverse,@ApiParam(value = "Starting date filter for results.") @QueryParam("startTime") Date startTime,@ApiParam(value = "Ending date filter for results.") @QueryParam("endTime") Date endTime,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.tradeGet(symbol,filter,columns,count,start,reverse,startTime,endTime,securityContext);
    }
    @GET
    @Path("/bucketed")
    @Consumes({ "application/json", "application/x-www-form-urlencoded" })
    @Produces({ "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" })
    @io.swagger.annotations.ApiOperation(value = "Get previous trades in time buckets.", notes = "", response = TradeBin.class, responseContainer = "List", tags={ "Trade", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Request was successful", response = TradeBin.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Parameter Error", response = TradeBin.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized", response = TradeBin.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found", response = TradeBin.class, responseContainer = "List") })
    public Response tradeGetBucketed(@ApiParam(value = "Time interval to bucket by. Available options: ['1m', '5m', '1h', '1d'].") @QueryParam("binSize") String binSize,@ApiParam(value = "Instrument symbol. Send a bare series (e.g. XBU) to get data for the nearest expiring contract in that series.  You can also send a timeframe, e.g. `XBU:monthly`. Timeframes are `daily`, `weekly`, `monthly`, `quarterly`, and `biquarterly`.") @QueryParam("symbol") String symbol,@ApiParam(value = "Generic table filter. Send JSON key/value pairs, such as `{\"key\": \"value\"}`. You can key on individual fields, and do more advanced querying on timestamps. See the [Timestamp Docs](https://www.bitmex.com/app/restAPI#timestamp-filters) for more details.") @QueryParam("filter") String filter,@ApiParam(value = "Array of column names to fetch. If omitted, will return all columns.  Note that this method will always return item keys, even when not specified, so you may receive more columns that you expect.") @QueryParam("columns") String columns,@ApiParam(value = "Number of results to fetch.", defaultValue="100") @DefaultValue("100") @QueryParam("count") BigDecimal count,@ApiParam(value = "Starting point for results.", defaultValue="0") @DefaultValue("0") @QueryParam("start") BigDecimal start,@ApiParam(value = "If true, will sort results newest first.", defaultValue="false") @DefaultValue("false") @QueryParam("reverse") Boolean reverse,@ApiParam(value = "Starting date filter for results.") @QueryParam("startTime") Date startTime,@ApiParam(value = "Ending date filter for results.") @QueryParam("endTime") Date endTime,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.tradeGetBucketed(binSize,symbol,filter,columns,count,start,reverse,startTime,endTime,securityContext);
    }
}
