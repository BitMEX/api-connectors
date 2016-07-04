package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.LeaderboardApiService;
import io.swagger.api.factories.LeaderboardApiServiceFactory;

import io.swagger.annotations.ApiParam;

import com.sun.jersey.multipart.FormDataParam;

import io.swagger.model.Leaderboard;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataParam;

import javax.ws.rs.core.Response;
import javax.ws.rs.*;

@Path("/leaderboard")
@Consumes({ "application/json", "application/x-www-form-urlencoded" })
@Produces({ "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" })
@io.swagger.annotations.Api(description = "the leaderboard API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-07-04T18:25:32.992-05:00")
public class LeaderboardApi  {
   private final LeaderboardApiService delegate = LeaderboardApiServiceFactory.getLeaderboardApi();

    @GET
    
    @Consumes({ "application/json", "application/x-www-form-urlencoded" })
    @Produces({ "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" })
    @io.swagger.annotations.ApiOperation(value = "Get current leaderboard.", notes = "", response = Leaderboard.class, responseContainer = "List", tags={ "Leaderboard" })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Request was successful", response = Leaderboard.class, responseContainer = "List") })

    public Response leaderboardGet(@ApiParam(value = "Ranking type. Options: \"notional\", \"ROE\"", defaultValue="notional") @QueryParam("method") String method)
    throws NotFoundException {
        return delegate.leaderboardGet(method);
    }
}

