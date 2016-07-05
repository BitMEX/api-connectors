package io.swagger.api;

import io.swagger.model.Leaderboard;

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

@Api(value = "leaderboard", description = "the leaderboard API")
public interface LeaderboardApi {

    @ApiOperation(value = "Get current leaderboard.", notes = "", response = Leaderboard.class, responseContainer = "List", tags={ "Leaderboard", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Request was successful", response = Leaderboard.class) })
    @RequestMapping(value = "/leaderboard",
        produces = { "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" }, 
        consumes = { "application/json", "application/x-www-form-urlencoded" },
        method = RequestMethod.GET)
    ResponseEntity<List<Leaderboard>> leaderboardGet(@ApiParam(value = "Ranking type. Options: \"notional\", \"ROE\"", defaultValue = "notional") @RequestParam(value = "method", required = false, defaultValue="notional") String method);

}
