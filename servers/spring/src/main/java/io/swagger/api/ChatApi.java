package io.swagger.api;

import io.swagger.model.Chat;
import io.swagger.model.Error;
import java.math.BigDecimal;
import io.swagger.model.ConnectedUsers;

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-07-05T09:41:19.947-05:00")

@Api(value = "chat", description = "the chat API")
public interface ChatApi {

    @ApiOperation(value = "Get chat messages.", notes = "", response = Chat.class, responseContainer = "List", tags={ "Chat", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Request was successful", response = Chat.class),
        @ApiResponse(code = 400, message = "Parameter Error", response = Chat.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Chat.class),
        @ApiResponse(code = 404, message = "Not Found", response = Chat.class) })
    @RequestMapping(value = "/chat",
        produces = { "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" }, 
        consumes = { "application/json", "application/x-www-form-urlencoded" },
        method = RequestMethod.GET)
    ResponseEntity<List<Chat>> chatGet(@ApiParam(value = "Number of results to fetch.", defaultValue = "100") @RequestParam(value = "count", required = false, defaultValue="100") BigDecimal count,@ApiParam(value = "Starting point for results.", defaultValue = "0") @RequestParam(value = "start", required = false, defaultValue="0") BigDecimal start,@ApiParam(value = "If true, will sort results newest first.", defaultValue = "true") @RequestParam(value = "reverse", required = false, defaultValue="true") Boolean reverse);


    @ApiOperation(value = "Get connected users.", notes = "Returns an array with browser users in the first position and API users (bots) in the second position.", response = ConnectedUsers.class, tags={ "Chat", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Request was successful", response = ConnectedUsers.class),
        @ApiResponse(code = 400, message = "Parameter Error", response = ConnectedUsers.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = ConnectedUsers.class),
        @ApiResponse(code = 404, message = "Not Found", response = ConnectedUsers.class) })
    @RequestMapping(value = "/chat/connected",
        produces = { "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" }, 
        consumes = { "application/json", "application/x-www-form-urlencoded" },
        method = RequestMethod.GET)
    ResponseEntity<ConnectedUsers> chatGetConnected();


    @ApiOperation(value = "Send a chat message.", notes = "", response = Chat.class, tags={ "Chat", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Request was successful", response = Chat.class),
        @ApiResponse(code = 400, message = "Parameter Error", response = Chat.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Chat.class),
        @ApiResponse(code = 404, message = "Not Found", response = Chat.class) })
    @RequestMapping(value = "/chat",
        produces = { "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" }, 
        consumes = { "application/json", "application/x-www-form-urlencoded" },
        method = RequestMethod.POST)
    ResponseEntity<Chat> chatNew(@ApiParam(value = "", required=true ) @RequestPart(value="message", required=true)  String message);

}
