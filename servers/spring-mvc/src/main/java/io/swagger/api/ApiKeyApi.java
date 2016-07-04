package io.swagger.api;

import io.swagger.model.*;

import io.swagger.model.ApiKey;
import io.swagger.model.Error;
import io.swagger.model.InlineResponse200;

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
@RequestMapping(value = "/apiKey", produces = {APPLICATION_JSON_VALUE})
@Api(value = "/apiKey", description = "the apiKey API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringMVCServerCodegen", date = "2016-07-04T18:25:39.823-05:00")
public class ApiKeyApi {
  

  @ApiOperation(value = "Get your API Keys.", notes = "", response = ApiKey.class, responseContainer = "List")
  @ApiResponses(value = { 
    @ApiResponse(code = 200, message = "Request was successful"),
    @ApiResponse(code = 400, message = "Parameter Error"),
    @ApiResponse(code = 401, message = "Unauthorized"),
    @ApiResponse(code = 404, message = "Not Found") })
  @RequestMapping(value = "", 
    produces = { "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" }, 
    consumes = { "application/json", "application/x-www-form-urlencoded" },
    method = RequestMethod.GET)
  public ResponseEntity<List<ApiKey>> apiKeyGet(@ApiParam(value = "If true, will sort results newest first.", defaultValue = "false") @RequestParam(value = "reverse", required = false, defaultValue="false") Boolean reverse


)
      throws NotFoundException {
      // do some magic!
      return new ResponseEntity<List<ApiKey>>(HttpStatus.OK);
  }

  

  @ApiOperation(value = "Create a new API Key.", notes = "API Keys can also be created via [this Python script](https://github.com/BitMEX/market-maker/blob/master/generate-api-key.py) See the [API Key Documentation](/app/apiKeys) for more information on capabilities.", response = ApiKey.class)
  @ApiResponses(value = { 
    @ApiResponse(code = 200, message = "Request was successful"),
    @ApiResponse(code = 400, message = "Parameter Error"),
    @ApiResponse(code = 401, message = "Unauthorized"),
    @ApiResponse(code = 404, message = "Not Found") })
  @RequestMapping(value = "", 
    produces = { "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" }, 
    consumes = { "application/json", "application/x-www-form-urlencoded" },
    method = RequestMethod.POST)
  public ResponseEntity<ApiKey> apiKeyNew(


@ApiParam(value = "Key name. This name is for reference only." ) @RequestPart(value="name", required=false)  String name
,
    


@ApiParam(value = "CIDR block to restrict this key to. To restrict to a single address, append \"/32\", e.g. 207.39.29.22/32. Leave blank or set to 0.0.0.0/0 to allow all IPs. Only one block may be set. <a href=\"http://software77.net/cidr-101.html\">More on CIDR blocks</a>" ) @RequestPart(value="cidr", required=false)  String cidr
,
    


@ApiParam(value = "Key Permissions. All keys can read margin and position data. Additional permissions must be added. Available: [\"order\", \"withdraw\"]." ) @RequestPart(value="permissions", required=false)  String permissions
,
    


@ApiParam(value = "Set to true to enable this key on creation. Otherwise, it must be explicitly enabled via /apiKey/enable." , defaultValue="false") @RequestPart(value="enabled", required=false)  Boolean enabled
,
    


@ApiParam(value = "OTP Token (YubiKey, Google Authenticator)" ) @RequestPart(value="token", required=false)  String token
)
      throws NotFoundException {
      // do some magic!
      return new ResponseEntity<ApiKey>(HttpStatus.OK);
  }

  

  @ApiOperation(value = "Remove an API Key.", notes = "", response = InlineResponse200.class)
  @ApiResponses(value = { 
    @ApiResponse(code = 200, message = "Request was successful"),
    @ApiResponse(code = 400, message = "Parameter Error"),
    @ApiResponse(code = 401, message = "Unauthorized"),
    @ApiResponse(code = 404, message = "Not Found") })
  @RequestMapping(value = "", 
    produces = { "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" }, 
    consumes = { "application/json", "application/x-www-form-urlencoded" },
    method = RequestMethod.DELETE)
  public ResponseEntity<InlineResponse200> apiKeyRemove(


@ApiParam(value = "API Key ID (public component).", required=true ) @RequestPart(value="apiKeyID", required=true)  String apiKeyID
)
      throws NotFoundException {
      // do some magic!
      return new ResponseEntity<InlineResponse200>(HttpStatus.OK);
  }

  

  @ApiOperation(value = "Disable an API Key.", notes = "", response = ApiKey.class)
  @ApiResponses(value = { 
    @ApiResponse(code = 200, message = "Request was successful"),
    @ApiResponse(code = 400, message = "Parameter Error"),
    @ApiResponse(code = 401, message = "Unauthorized"),
    @ApiResponse(code = 404, message = "Not Found") })
  @RequestMapping(value = "/disable", 
    produces = { "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" }, 
    consumes = { "application/json", "application/x-www-form-urlencoded" },
    method = RequestMethod.POST)
  public ResponseEntity<ApiKey> apiKeyDisable(


@ApiParam(value = "API Key ID (public component).", required=true ) @RequestPart(value="apiKeyID", required=true)  String apiKeyID
)
      throws NotFoundException {
      // do some magic!
      return new ResponseEntity<ApiKey>(HttpStatus.OK);
  }

  

  @ApiOperation(value = "Enable an API Key.", notes = "", response = ApiKey.class)
  @ApiResponses(value = { 
    @ApiResponse(code = 200, message = "Request was successful"),
    @ApiResponse(code = 400, message = "Parameter Error"),
    @ApiResponse(code = 401, message = "Unauthorized"),
    @ApiResponse(code = 404, message = "Not Found") })
  @RequestMapping(value = "/enable", 
    produces = { "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" }, 
    consumes = { "application/json", "application/x-www-form-urlencoded" },
    method = RequestMethod.POST)
  public ResponseEntity<ApiKey> apiKeyEnable(


@ApiParam(value = "API Key ID (public component).", required=true ) @RequestPart(value="apiKeyID", required=true)  String apiKeyID
)
      throws NotFoundException {
      // do some magic!
      return new ResponseEntity<ApiKey>(HttpStatus.OK);
  }

  
}
