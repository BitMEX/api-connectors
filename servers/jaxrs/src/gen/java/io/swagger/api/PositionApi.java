package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.PositionApiService;
import io.swagger.api.factories.PositionApiServiceFactory;

import io.swagger.annotations.ApiParam;

import io.swagger.model.Position;
import io.swagger.model.Error;
import java.math.BigDecimal;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/position")
@Consumes({ "application/json", "application/x-www-form-urlencoded" })
@Produces({ "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" })
@io.swagger.annotations.Api(description = "the position API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-07-05T09:41:09.909-05:00")
public class PositionApi  {
   private final PositionApiService delegate = PositionApiServiceFactory.getPositionApi();

    @GET
    
    @Consumes({ "application/json", "application/x-www-form-urlencoded" })
    @Produces({ "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" })
    @io.swagger.annotations.ApiOperation(value = "Get your positions.", notes = "See <a href=\"http://www.onixs.biz/fix-dictionary/5.0.SP2/msgType_AP_6580.html\">the FIX Spec</a> for explanations of these fields.", response = Position.class, responseContainer = "List", tags={ "Position", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Request was successful", response = Position.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Parameter Error", response = Position.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized", response = Position.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found", response = Position.class, responseContainer = "List") })
    public Response positionGet(@ApiParam(value = "Table filter. For example, send {\"symbol\": \"XBT24H\"}.") @QueryParam("filter") String filter,@ApiParam(value = "Which columns to fetch. For example, send [\"columnName\"].") @QueryParam("columns") String columns,@ApiParam(value = "Number of rows to fetch.") @QueryParam("count") BigDecimal count,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.positionGet(filter,columns,count,securityContext);
    }
    @POST
    @Path("/isolate")
    @Consumes({ "application/json", "application/x-www-form-urlencoded" })
    @Produces({ "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" })
    @io.swagger.annotations.ApiOperation(value = "Enable isolated margin or cross margin per-position.", notes = "On Speculative (DPE-Enabled) contracts, users can switch isolate margin per-position. This function allows switching margin isolation (aka fixed margin) on and off.", response = Position.class, tags={ "Position", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Request was successful", response = Position.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Parameter Error", response = Position.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized", response = Position.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found", response = Position.class) })
    public Response positionIsolateMargin(@ApiParam(value = "Position symbol to isolate.", required=true)@FormParam("symbol")  String symbol,@ApiParam(value = "True for isolated margin, false for cross margin.", defaultValue="true")@FormParam("enabled")  Boolean enabled,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.positionIsolateMargin(symbol,enabled,securityContext);
    }
    @POST
    @Path("/transferMargin")
    @Consumes({ "application/json", "application/x-www-form-urlencoded" })
    @Produces({ "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" })
    @io.swagger.annotations.ApiOperation(value = "Transfer equity in or out of a position.", notes = "When margin is isolated on a position, use this function to add or remove margin from the position. Note that you cannot remove margin below the initial margin threshold.", response = Position.class, tags={ "Position", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Request was successful", response = Position.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Parameter Error", response = Position.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized", response = Position.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found", response = Position.class) })
    public Response positionTransferIsolatedMargin(@ApiParam(value = "Symbol of position to isolate.", required=true)@FormParam("symbol")  String symbol,@ApiParam(value = "Amount to transfer, in Satoshis. May be negative.", required=true)@FormParam("amount")  BigDecimal amount,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.positionTransferIsolatedMargin(symbol,amount,securityContext);
    }
    @POST
    @Path("/leverage")
    @Consumes({ "application/json", "application/x-www-form-urlencoded" })
    @Produces({ "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" })
    @io.swagger.annotations.ApiOperation(value = "Choose leverage for a position.", notes = "On Speculative (DPE-Enabled) contracts, users can choose an isolated leverage. This will automatically enable isolated margin.", response = Position.class, tags={ "Position", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Request was successful", response = Position.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Parameter Error", response = Position.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized", response = Position.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found", response = Position.class) })
    public Response positionUpdateLeverage(@ApiParam(value = "Symbol of position to adjust.", required=true)@FormParam("symbol")  String symbol,@ApiParam(value = "Leverage value. Send a number between 0.01 and 100 to enable isolated margin with a fixed leverage. Send 0 to enable cross margin.", required=true)@FormParam("leverage")  Double leverage,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.positionUpdateLeverage(symbol,leverage,securityContext);
    }
}
