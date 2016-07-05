package io.swagger.api;

import io.swagger.model.Chat;
import io.swagger.model.Error;
import java.math.BigDecimal;
import io.swagger.model.ConnectedUsers;

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
public class ChatApiController implements ChatApi {

    public ResponseEntity<List<Chat>> chatGet(@ApiParam(value = "Number of results to fetch.", defaultValue = "100") @RequestParam(value = "count", required = false, defaultValue="100") BigDecimal count,
        @ApiParam(value = "Starting point for results.", defaultValue = "0") @RequestParam(value = "start", required = false, defaultValue="0") BigDecimal start,
        @ApiParam(value = "If true, will sort results newest first.", defaultValue = "true") @RequestParam(value = "reverse", required = false, defaultValue="true") Boolean reverse) {
        // do some magic!
        return new ResponseEntity<List<Chat>>(HttpStatus.OK);
    }

    public ResponseEntity<ConnectedUsers> chatGetConnected() {
        // do some magic!
        return new ResponseEntity<ConnectedUsers>(HttpStatus.OK);
    }

    public ResponseEntity<Chat> chatNew(@ApiParam(value = "", required=true ) @RequestPart(value="message", required=true)  String message) {
        // do some magic!
        return new ResponseEntity<Chat>(HttpStatus.OK);
    }

}
