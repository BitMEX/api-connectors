package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.PositionApiService;
import io.swagger.api.factories.PositionApiServiceFactory;

import io.swagger.annotations.ApiParam;

import com.sun.jersey.multipart.FormDataParam;

import io.swagger.model.Position;
import io.swagger.model.Error;
import java.math.BigDecimal;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataParam;

import javax.ws.rs.core.Response;
import javax.ws.rs.*;

@Path("/position")
@Consumes({ "application/json", "application/x-www-form-urlencoded" })
@Produces({ "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" })
@io.swagger.annotations.Api(description = "the position API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2015-11-30T13:35:57.938-06:00")
public class PositionApi  {
   private final PositionApiService delegate = PositionApiServiceFactory.getPositionApi();

    @GET
    
    @Consumes({ "application/json", "application/x-www-form-urlencoded" })
    @Produces({ "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" })
    @io.swagger.annotations.ApiOperation(value = "Get your positions.", notes = "", response = Position.class, responseContainer = "List", tags={ "Position",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Request was successful", response = Position.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Parameter Error", response = Position.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized", response = Position.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found", response = Position.class, responseContainer = "List") })

    public Response positionFind(@ApiParam(value = "Table filter. For example, send {\"symbol\": \"XBT24H\"}.") @QueryParam("filter") String filter,
    @ApiParam(value = "Which columns to fetch. For example, send [\"columnName\"].") @QueryParam("columns") String columns,
    @ApiParam(value = "Number of rows to fetch.") @QueryParam("count") BigDecimal count)
    throws NotFoundException {
        return delegate.positionFind(filter,columns,count);
    }
    @POST
    @Path("/isolate")
    @Consumes({ "application/json", "application/x-www-form-urlencoded" })
    @Produces({ "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" })
    @io.swagger.annotations.ApiOperation(value = "Toggle isolated (fixed) margin per-position.", notes = "On Speculative (DPE-Enabled) contracts, users can switch isolate margin per-position. This function allows switching margin isolation (aka fixed margin) on and off. A position must be open to isolate it.", response = Position.class, tags={ "Position",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Request was successful", response = Position.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Parameter Error", response = Position.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized", response = Position.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found", response = Position.class) })

    public Response positionIsolateMargin(@ApiParam(value = "Position symbol to isolate.", required=true)@FormParam("symbol")  String symbol,
    @ApiParam(value = "If true, will enable isolated margin.", defaultValue="true")@FormParam("enabled")  Boolean enabled)
    throws NotFoundException {
        return delegate.positionIsolateMargin(symbol,enabled);
    }
    @POST
    @Path("/transferMargin")
    @Consumes({ "application/json", "application/x-www-form-urlencoded" })
    @Produces({ "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" })
    @io.swagger.annotations.ApiOperation(value = "Transfer equity in or out of a position.", notes = "When margin is isolated on a position, use this function to add or remove margin from the position. Note that you cannot remove margin below the initial margin threshold.", response = Position.class, tags={ "Position" })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Request was successful", response = Position.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Parameter Error", response = Position.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized", response = Position.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found", response = Position.class) })

    public Response positionTransferIsolatedMargin(@ApiParam(value = "Position symbol to isolate.", required=true)@FormParam("symbol")  String symbol,
    @ApiParam(value = "Amount to transfer, in satoshis. May be negative.", required=true)@FormParam("amount")  BigDecimal amount)
    throws NotFoundException {
        return delegate.positionTransferIsolatedMargin(symbol,amount);
    }
}

