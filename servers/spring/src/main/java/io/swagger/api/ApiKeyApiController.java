package io.swagger.api;

import io.swagger.model.ApiKey;
import io.swagger.model.Error;
import io.swagger.model.InlineResponse200;

import io.swagger.annotations.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-07-05T09:41:19.947-05:00")

@Controller
public class ApiKeyApiController implements ApiKeyApi {

    public ResponseEntity<ApiKey> apiKeyDisable(@ApiParam(value = "API Key ID (public component).", required=true ) @RequestPart(value="apiKeyID", required=true)  String apiKeyID) {
        // do some magic!
        return new ResponseEntity<ApiKey>(HttpStatus.OK);
    }

    public ResponseEntity<ApiKey> apiKeyEnable(@ApiParam(value = "API Key ID (public component).", required=true ) @RequestPart(value="apiKeyID", required=true)  String apiKeyID) {
        // do some magic!
        return new ResponseEntity<ApiKey>(HttpStatus.OK);
    }

    public ResponseEntity<List<ApiKey>> apiKeyGet(@ApiParam(value = "If true, will sort results newest first.", defaultValue = "false") @RequestParam(value = "reverse", required = false, defaultValue="false") Boolean reverse) {
        // do some magic!
        return new ResponseEntity<List<ApiKey>>(HttpStatus.OK);
    }

    public ResponseEntity<ApiKey> apiKeyNew(@ApiParam(value = "Key name. This name is for reference only." ) @RequestPart(value="name", required=false)  String name,
        @ApiParam(value = "CIDR block to restrict this key to. To restrict to a single address, append \"/32\", e.g. 207.39.29.22/32. Leave blank or set to 0.0.0.0/0 to allow all IPs. Only one block may be set. <a href=\"http://software77.net/cidr-101.html\">More on CIDR blocks</a>" ) @RequestPart(value="cidr", required=false)  String cidr,
        @ApiParam(value = "Key Permissions. All keys can read margin and position data. Additional permissions must be added. Available: [\"order\", \"withdraw\"]." ) @RequestPart(value="permissions", required=false)  String permissions,
        @ApiParam(value = "Set to true to enable this key on creation. Otherwise, it must be explicitly enabled via /apiKey/enable." , defaultValue="false") @RequestPart(value="enabled", required=false)  Boolean enabled,
        @ApiParam(value = "OTP Token (YubiKey, Google Authenticator)" ) @RequestPart(value="token", required=false)  String token) {
        // do some magic!
        return new ResponseEntity<ApiKey>(HttpStatus.OK);
    }

    public ResponseEntity<InlineResponse200> apiKeyRemove(@ApiParam(value = "API Key ID (public component).", required=true ) @RequestPart(value="apiKeyID", required=true)  String apiKeyID) {
        // do some magic!
        return new ResponseEntity<InlineResponse200>(HttpStatus.OK);
    }

}
