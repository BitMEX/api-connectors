package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.SettlementApiService;
import io.swagger.api.factories.SettlementApiServiceFactory;

import io.swagger.annotations.ApiParam;

import com.sun.jersey.multipart.FormDataParam;

import io.swagger.model.Settlement;
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

@Path("/settlement")
@Consumes({ "application/json", "application/x-www-form-urlencoded" })
@Produces({ "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" })
@io.swagger.annotations.Api(description = "the settlement API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2015-11-30T13:35:57.938-06:00")
public class SettlementApi  {
   private final SettlementApiService delegate = SettlementApiServiceFactory.getSettlementApi();

    @GET
    
    @Consumes({ "application/json", "application/x-www-form-urlencoded" })
    @Produces({ "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" })
    @io.swagger.annotations.ApiOperation(value = "Get settlement history.", notes = "", response = Settlement.class, responseContainer = "List", tags={ "Settlement" })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Request was successful", response = Settlement.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Parameter Error", response = Settlement.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized", response = Settlement.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found", response = Settlement.class, responseContainer = "List") })

    public Response settlementGet(@ApiParam(value = "Instrument symbol. Send a bare series (e.g. XBU) to get data for the nearest expiring contract in that series.\n\nYou can also send a timeframe, e.g. 'XBU:monthly'. Timeframes are 'daily', 'weekly', 'monthly', 'quarterly', and 'biquarterly'.") @QueryParam("symbol") String symbol,
    @ApiParam(value = "Generic table filter. Send JSON key/value pairs, such as {\"key\": \"value\"}. You can key on individual fields, and do more advanced querying on timestamps. See <a href=\"http://localhost:2001/app/restAPI#timestamp-filters\">http://localhost:2001/app/restAPI#timestamp-filters</a> for more details.") @QueryParam("filter") String filter,
    @ApiParam(value = "Array of column names to fetch. If omitted, will return all columns.\n\nNote that this method will always return item keys, even when not specified, so you may receive more columns that you expect.") @QueryParam("columns") String columns,
    @ApiParam(value = "Number of results to fetch.", defaultValue="100") @QueryParam("count") BigDecimal count,
    @ApiParam(value = "Starting point for results.", defaultValue="0") @QueryParam("start") BigDecimal start,
    @ApiParam(value = "If true, will sort results newest first.", defaultValue="false") @QueryParam("reverse") Boolean reverse,
    @ApiParam(value = "Starting date filter for results.") @QueryParam("startTime") Date startTime,
    @ApiParam(value = "Ending date filter for results.") @QueryParam("endTime") Date endTime)
    throws NotFoundException {
        return delegate.settlementGet(symbol,filter,columns,count,start,reverse,startTime,endTime);
    }
}

