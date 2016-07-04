package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.ChatApiService;
import io.swagger.api.factories.ChatApiServiceFactory;

import io.swagger.annotations.ApiParam;

import com.sun.jersey.multipart.FormDataParam;

import io.swagger.model.Chat;
import io.swagger.model.Error;
import java.math.BigDecimal;
import io.swagger.model.ConnectedUsers;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataParam;

import javax.ws.rs.core.Response;
import javax.ws.rs.*;

@Path("/chat")
@Consumes({ "application/json", "application/x-www-form-urlencoded" })
@Produces({ "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" })
@io.swagger.annotations.Api(description = "the chat API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-07-04T18:25:32.992-05:00")
public class ChatApi  {
   private final ChatApiService delegate = ChatApiServiceFactory.getChatApi();

    @GET
    
    @Consumes({ "application/json", "application/x-www-form-urlencoded" })
    @Produces({ "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" })
    @io.swagger.annotations.ApiOperation(value = "Get chat messages.", notes = "", response = Chat.class, responseContainer = "List", tags={ "Chat",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Request was successful", response = Chat.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Parameter Error", response = Chat.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized", response = Chat.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found", response = Chat.class, responseContainer = "List") })

    public Response chatGet(@ApiParam(value = "Number of results to fetch.", defaultValue="100") @QueryParam("count") BigDecimal count,
    @ApiParam(value = "Starting point for results.", defaultValue="0") @QueryParam("start") BigDecimal start,
    @ApiParam(value = "If true, will sort results newest first.", defaultValue="true") @QueryParam("reverse") Boolean reverse)
    throws NotFoundException {
        return delegate.chatGet(count,start,reverse);
    }
    @POST
    
    @Consumes({ "application/json", "application/x-www-form-urlencoded" })
    @Produces({ "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" })
    @io.swagger.annotations.ApiOperation(value = "Send a chat message.", notes = "", response = Chat.class, tags={ "Chat",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Request was successful", response = Chat.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Parameter Error", response = Chat.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized", response = Chat.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found", response = Chat.class) })

    public Response chatNew(@ApiParam(value = "", required=true)@FormParam("message")  String message)
    throws NotFoundException {
        return delegate.chatNew(message);
    }
    @GET
    @Path("/connected")
    @Consumes({ "application/json", "application/x-www-form-urlencoded" })
    @Produces({ "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" })
    @io.swagger.annotations.ApiOperation(value = "Get connected users.", notes = "Returns an array with browser users in the first position and API users (bots) in the second position.", response = ConnectedUsers.class, tags={ "Chat" })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Request was successful", response = ConnectedUsers.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Parameter Error", response = ConnectedUsers.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized", response = ConnectedUsers.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found", response = ConnectedUsers.class) })

    public Response chatGetConnected()
    throws NotFoundException {
        return delegate.chatGetConnected();
    }
}

