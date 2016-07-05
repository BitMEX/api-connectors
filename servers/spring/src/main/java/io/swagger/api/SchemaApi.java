package io.swagger.api;

import io.swagger.model.Error;

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

@Api(value = "schema", description = "the schema API")
public interface SchemaApi {

    @ApiOperation(value = "Get model schemata for data objects returned by this API.", notes = "", response = Object.class, tags={ "Schema", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Request was successful", response = Object.class),
        @ApiResponse(code = 400, message = "Parameter Error", response = Object.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Object.class),
        @ApiResponse(code = 404, message = "Not Found", response = Object.class) })
    @RequestMapping(value = "/schema",
        produces = { "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" }, 
        consumes = { "application/json", "application/x-www-form-urlencoded" },
        method = RequestMethod.GET)
    ResponseEntity<Object> schemaGet(@ApiParam(value = "Optional model filter. If omitted, will return all models.") @RequestParam(value = "model", required = false) String model);


    @ApiOperation(value = "Returns help text & subject list for websocket usage.", notes = "", response = Object.class, tags={ "Schema", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Request was successful", response = Object.class),
        @ApiResponse(code = 400, message = "Parameter Error", response = Object.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Object.class),
        @ApiResponse(code = 404, message = "Not Found", response = Object.class) })
    @RequestMapping(value = "/schema/websocketHelp",
        produces = { "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" }, 
        consumes = { "application/json", "application/x-www-form-urlencoded" },
        method = RequestMethod.GET)
    ResponseEntity<Object> schemaWebsocketHelp();

}
