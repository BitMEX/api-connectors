package io.swagger.api;

import io.swagger.model.Announcement;
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

@Api(value = "announcement", description = "the announcement API")
public interface AnnouncementApi {

    @ApiOperation(value = "Get site announcements.", notes = "", response = Announcement.class, responseContainer = "List", tags={ "Announcement", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Request was successful", response = Announcement.class),
        @ApiResponse(code = 400, message = "Parameter Error", response = Announcement.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Announcement.class),
        @ApiResponse(code = 404, message = "Not Found", response = Announcement.class) })
    @RequestMapping(value = "/announcement",
        produces = { "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" }, 
        consumes = { "application/json", "application/x-www-form-urlencoded" },
        method = RequestMethod.GET)
    ResponseEntity<List<Announcement>> announcementGet(@ApiParam(value = "Array of column names to fetch. If omitted, will return all columns.") @RequestParam(value = "columns", required = false) String columns);


    @ApiOperation(value = "Get urgent (banner) announcements.", notes = "", response = Announcement.class, responseContainer = "List", tags={ "Announcement", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Request was successful", response = Announcement.class),
        @ApiResponse(code = 400, message = "Parameter Error", response = Announcement.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Announcement.class),
        @ApiResponse(code = 404, message = "Not Found", response = Announcement.class) })
    @RequestMapping(value = "/announcement/urgent",
        produces = { "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" }, 
        consumes = { "application/json", "application/x-www-form-urlencoded" },
        method = RequestMethod.GET)
    ResponseEntity<List<Announcement>> announcementGetUrgent();

}
