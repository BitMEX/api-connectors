package io.swagger.api;

import io.swagger.model.*;

import io.swagger.model.Leaderboard;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.Authorization;
import io.swagger.annotations.AuthorizationScope;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

import static org.springframework.http.MediaType.*;

@Controller
@RequestMapping(value = "/leaderboard", produces = {APPLICATION_JSON_VALUE})
@Api(value = "/leaderboard", description = "the leaderboard API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringMVCServerCodegen", date = "2016-07-04T18:25:23.952-05:00")
public class LeaderboardApi {
  

  @ApiOperation(value = "Get current leaderboard.", notes = "", response = Leaderboard.class, responseContainer = "List")
  @ApiResponses(value = { 
    @ApiResponse(code = 200, message = "Request was successful") })
  @RequestMapping(value = "", 
    produces = { "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" }, 
    consumes = { "application/json", "application/x-www-form-urlencoded" },
    method = RequestMethod.GET)
  public ResponseEntity<List<Leaderboard>> leaderboardGet(@ApiParam(value = "Ranking type. Options: \"notional\", \"ROE\"", defaultValue = "notional") @RequestParam(value = "method", required = false, defaultValue="notional") String method


)
      throws NotFoundException {
      // do some magic!
      return new ResponseEntity<List<Leaderboard>>(HttpStatus.OK);
  }

  
}
