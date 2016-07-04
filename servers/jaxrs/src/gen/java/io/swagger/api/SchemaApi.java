package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.SchemaApiService;
import io.swagger.api.factories.SchemaApiServiceFactory;

import io.swagger.annotations.ApiParam;

import com.sun.jersey.multipart.FormDataParam;

import io.swagger.model.InlineResponse2001;
import io.swagger.model.Error;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataParam;

import javax.ws.rs.core.Response;
import javax.ws.rs.*;

@Path("/schema")
@Consumes({ "application/json", "application/x-www-form-urlencoded" })
@Produces({ "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" })
@io.swagger.annotations.Api(description = "the schema API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-07-04T18:25:32.992-05:00")
public class SchemaApi  {
   private final SchemaApiService delegate = SchemaApiServiceFactory.getSchemaApi();

    @GET
    
    @Consumes({ "application/json", "application/x-www-form-urlencoded" })
    @Produces({ "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" })
    @io.swagger.annotations.ApiOperation(value = "Get model schemata for data objects returned by this API.", notes = "", response = InlineResponse2001.class, tags={ "Schema",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Request was successful", response = InlineResponse2001.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Parameter Error", response = InlineResponse2001.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized", response = InlineResponse2001.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found", response = InlineResponse2001.class) })

    public Response schemaGet(@ApiParam(value = "Optional model filter. If omitted, will return all models.") @QueryParam("model") String model)
    throws NotFoundException {
        return delegate.schemaGet(model);
    }
    @GET
    @Path("/websocketHelp")
    @Consumes({ "application/json", "application/x-www-form-urlencoded" })
    @Produces({ "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" })
    @io.swagger.annotations.ApiOperation(value = "Returns help text & subject list for websocket usage.", notes = "", response = InlineResponse2001.class, tags={ "Schema" })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Request was successful", response = InlineResponse2001.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Parameter Error", response = InlineResponse2001.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized", response = InlineResponse2001.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found", response = InlineResponse2001.class) })

    public Response schemaWebsocketHelp()
    throws NotFoundException {
        return delegate.schemaWebsocketHelp();
    }
}

