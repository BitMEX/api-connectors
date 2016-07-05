package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.InsuranceApiService;
import io.swagger.api.factories.InsuranceApiServiceFactory;

import io.swagger.annotations.ApiParam;

import io.swagger.model.Insurance;
import io.swagger.model.Error;
import java.math.BigDecimal;
import java.util.Date;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/insurance")
@Consumes({ "application/json", "application/x-www-form-urlencoded" })
@Produces({ "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" })
@io.swagger.annotations.Api(description = "the insurance API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-07-05T09:41:09.909-05:00")
public class InsuranceApi  {
   private final InsuranceApiService delegate = InsuranceApiServiceFactory.getInsuranceApi();

    @GET
    
    @Consumes({ "application/json", "application/x-www-form-urlencoded" })
    @Produces({ "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" })
    @io.swagger.annotations.ApiOperation(value = "Get insurance fund history.", notes = "", response = Insurance.class, responseContainer = "List", tags={ "Insurance", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Request was successful", response = Insurance.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Parameter Error", response = Insurance.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized", response = Insurance.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found", response = Insurance.class, responseContainer = "List") })
    public Response insuranceGet(@ApiParam(value = "Instrument symbol. Send a bare series (e.g. XBU) to get data for the nearest expiring contract in that series.  You can also send a timeframe, e.g. `XBU:monthly`. Timeframes are `daily`, `weekly`, `monthly`, `quarterly`, and `biquarterly`.") @QueryParam("symbol") String symbol,@ApiParam(value = "Generic table filter. Send JSON key/value pairs, such as `{\"key\": \"value\"}`. You can key on individual fields, and do more advanced querying on timestamps. See the [Timestamp Docs](https://www.bitmex.com/app/restAPI#timestamp-filters) for more details.") @QueryParam("filter") String filter,@ApiParam(value = "Array of column names to fetch. If omitted, will return all columns.  Note that this method will always return item keys, even when not specified, so you may receive more columns that you expect.") @QueryParam("columns") String columns,@ApiParam(value = "Number of results to fetch.", defaultValue="100") @DefaultValue("100") @QueryParam("count") BigDecimal count,@ApiParam(value = "Starting point for results.", defaultValue="0") @DefaultValue("0") @QueryParam("start") BigDecimal start,@ApiParam(value = "If true, will sort results newest first.", defaultValue="false") @DefaultValue("false") @QueryParam("reverse") Boolean reverse,@ApiParam(value = "Starting date filter for results.") @QueryParam("startTime") Date startTime,@ApiParam(value = "Ending date filter for results.") @QueryParam("endTime") Date endTime,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.insuranceGet(symbol,filter,columns,count,start,reverse,startTime,endTime,securityContext);
    }
}
