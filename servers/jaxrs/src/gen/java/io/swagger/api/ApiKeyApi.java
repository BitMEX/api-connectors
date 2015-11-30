package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.ApiKeyApiService;
import io.swagger.api.factories.ApiKeyApiServiceFactory;

import io.swagger.annotations.ApiParam;

import com.sun.jersey.multipart.FormDataParam;

import io.swagger.model.ApiKey;
import io.swagger.model.Error;
import io.swagger.model.InlineResponse200;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataParam;

import javax.ws.rs.core.Response;
import javax.ws.rs.*;

@Path("/apiKey")
@Consumes({ "application/json", "application/x-www-form-urlencoded" })
@Produces({ "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" })
@io.swagger.annotations.Api(description = "the apiKey API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2015-11-30T13:35:57.938-06:00")
public class ApiKeyApi  {
   private final ApiKeyApiService delegate = ApiKeyApiServiceFactory.getApiKeyApi();

    @GET
    
    @Consumes({ "application/json", "application/x-www-form-urlencoded" })
    @Produces({ "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" })
    @io.swagger.annotations.ApiOperation(value = "Get your API Keys.", notes = "", response = ApiKey.class, responseContainer = "List", tags={ "ApiKey",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Request was successful", response = ApiKey.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Parameter Error", response = ApiKey.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized", response = ApiKey.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found", response = ApiKey.class, responseContainer = "List") })

    public Response apiKeyGetKeys(@ApiParam(value = "If true, will sort results newest first.", defaultValue="false") @QueryParam("reverse") Boolean reverse)
    throws NotFoundException {
        return delegate.apiKeyGetKeys(reverse);
    }
    @POST
    
    @Consumes({ "application/json", "application/x-www-form-urlencoded" })
    @Produces({ "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" })
    @io.swagger.annotations.ApiOperation(value = "Create a new API Key.", notes = "API Keys can also be created via <a href=\"https://github.com/BitMEX/market-maker/blob/master/generate-api-key.py\">this Python script</a>. See the <a href=\"/app/apiKeys\">API Key Documentation</a> for more information on capabilities.", response = ApiKey.class, tags={ "ApiKey",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Request was successful", response = ApiKey.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Parameter Error", response = ApiKey.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized", response = ApiKey.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found", response = ApiKey.class) })

    public Response apiKeyCreateKey(@ApiParam(value = "Key name. This name is for reference only.")@FormParam("name")  String name,
    @ApiParam(value = "CIDR block to restrict this key to. To restrict to a single address, append \"/32\", e.g. 207.39.29.22/32. Leave blank or set to 0.0.0.0/0 to allow all IPs. Only one block may be set. <a href=\"http://software77.net/cidr-101.html\">More on CIDR blocks</a>")@FormParam("cidr")  String cidr,
    @ApiParam(value = "Key Permissions. All keys can read margin and position data. Additional permissions must be added. Available: [\"order\", \"withdraw\"].")@FormParam("permissions")  String permissions,
    @ApiParam(value = "Set to true to enable this key on creation. Otherwise, it must be explicitly enabled via /apiKey/enable.", defaultValue="false")@FormParam("enabled")  Boolean enabled,
    @ApiParam(value = "OTP Token (YubiKey, Google Authenticator)")@FormParam("token")  String token)
    throws NotFoundException {
        return delegate.apiKeyCreateKey(name,cidr,permissions,enabled,token);
    }
    @DELETE
    
    @Consumes({ "application/json", "application/x-www-form-urlencoded" })
    @Produces({ "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" })
    @io.swagger.annotations.ApiOperation(value = "Remove an API Key.", notes = "", response = InlineResponse200.class, tags={ "ApiKey",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Request was successful", response = InlineResponse200.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Parameter Error", response = InlineResponse200.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized", response = InlineResponse200.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found", response = InlineResponse200.class) })

    public Response apiKeyRemove(@ApiParam(value = "API Key ID (public component).", required=true)@FormParam("apiKeyID")  String apiKeyID)
    throws NotFoundException {
        return delegate.apiKeyRemove(apiKeyID);
    }
    @POST
    @Path("/disable")
    @Consumes({ "application/json", "application/x-www-form-urlencoded" })
    @Produces({ "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" })
    @io.swagger.annotations.ApiOperation(value = "Disable an API Key.", notes = "", response = ApiKey.class, tags={ "ApiKey",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Request was successful", response = ApiKey.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Parameter Error", response = ApiKey.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized", response = ApiKey.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found", response = ApiKey.class) })

    public Response apiKeyDisable(@ApiParam(value = "API Key ID (public component).", required=true)@FormParam("apiKeyID")  String apiKeyID)
    throws NotFoundException {
        return delegate.apiKeyDisable(apiKeyID);
    }
    @POST
    @Path("/enable")
    @Consumes({ "application/json", "application/x-www-form-urlencoded" })
    @Produces({ "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" })
    @io.swagger.annotations.ApiOperation(value = "Enable an API Key.", notes = "", response = ApiKey.class, tags={ "ApiKey" })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Request was successful", response = ApiKey.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Parameter Error", response = ApiKey.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized", response = ApiKey.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found", response = ApiKey.class) })

    public Response apiKeyEnable(@ApiParam(value = "API Key ID (public component).", required=true)@FormParam("apiKeyID")  String apiKeyID)
    throws NotFoundException {
        return delegate.apiKeyEnable(apiKeyID);
    }
}

