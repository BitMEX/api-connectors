package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.StatsApiService;
import io.swagger.api.factories.StatsApiServiceFactory;

import io.swagger.annotations.ApiParam;

import io.swagger.model.Stats;
import io.swagger.model.Error;
import io.swagger.model.StatsHistory;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/stats")
@Consumes({ "application/json", "application/x-www-form-urlencoded" })
@Produces({ "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" })
@io.swagger.annotations.Api(description = "the stats API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-07-05T09:41:09.909-05:00")
public class StatsApi  {
   private final StatsApiService delegate = StatsApiServiceFactory.getStatsApi();

    @GET
    
    @Consumes({ "application/json", "application/x-www-form-urlencoded" })
    @Produces({ "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" })
    @io.swagger.annotations.ApiOperation(value = "Get exchange-wide and per-series turnover and volume statistics.", notes = "", response = Stats.class, responseContainer = "List", tags={ "Stats", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Request was successful", response = Stats.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Parameter Error", response = Stats.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized", response = Stats.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found", response = Stats.class, responseContainer = "List") })
    public Response statsGet(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.statsGet(securityContext);
    }
    @GET
    @Path("/history")
    @Consumes({ "application/json", "application/x-www-form-urlencoded" })
    @Produces({ "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" })
    @io.swagger.annotations.ApiOperation(value = "Get historical exchange-wide and per-series turnover and volume statistics.", notes = "", response = StatsHistory.class, responseContainer = "List", tags={ "Stats", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Request was successful", response = StatsHistory.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Parameter Error", response = StatsHistory.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized", response = StatsHistory.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found", response = StatsHistory.class, responseContainer = "List") })
    public Response statsHistory(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.statsHistory(securityContext);
    }
}
