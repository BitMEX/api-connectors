package io.swagger.api;

import io.swagger.model.Stats;
import io.swagger.model.Error;
import io.swagger.model.StatsHistory;

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

@Api(value = "stats", description = "the stats API")
public interface StatsApi {

    @ApiOperation(value = "Get exchange-wide and per-series turnover and volume statistics.", notes = "", response = Stats.class, responseContainer = "List", tags={ "Stats", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Request was successful", response = Stats.class),
        @ApiResponse(code = 400, message = "Parameter Error", response = Stats.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Stats.class),
        @ApiResponse(code = 404, message = "Not Found", response = Stats.class) })
    @RequestMapping(value = "/stats",
        produces = { "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" }, 
        consumes = { "application/json", "application/x-www-form-urlencoded" },
        method = RequestMethod.GET)
    ResponseEntity<List<Stats>> statsGet();


    @ApiOperation(value = "Get historical exchange-wide and per-series turnover and volume statistics.", notes = "", response = StatsHistory.class, responseContainer = "List", tags={ "Stats", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Request was successful", response = StatsHistory.class),
        @ApiResponse(code = 400, message = "Parameter Error", response = StatsHistory.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = StatsHistory.class),
        @ApiResponse(code = 404, message = "Not Found", response = StatsHistory.class) })
    @RequestMapping(value = "/stats/history",
        produces = { "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" }, 
        consumes = { "application/json", "application/x-www-form-urlencoded" },
        method = RequestMethod.GET)
    ResponseEntity<List<StatsHistory>> statsHistory();

}
