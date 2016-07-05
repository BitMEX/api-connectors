package io.swagger.api;

import io.swagger.model.Position;
import io.swagger.model.Error;
import java.math.BigDecimal;

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
public class PositionApiController implements PositionApi {

    public ResponseEntity<List<Position>> positionGet(@ApiParam(value = "Table filter. For example, send {\"symbol\": \"XBT24H\"}.") @RequestParam(value = "filter", required = false) String filter,
        @ApiParam(value = "Which columns to fetch. For example, send [\"columnName\"].") @RequestParam(value = "columns", required = false) String columns,
        @ApiParam(value = "Number of rows to fetch.") @RequestParam(value = "count", required = false) BigDecimal count) {
        // do some magic!
        return new ResponseEntity<List<Position>>(HttpStatus.OK);
    }

    public ResponseEntity<Position> positionIsolateMargin(@ApiParam(value = "Position symbol to isolate.", required=true ) @RequestPart(value="symbol", required=true)  String symbol,
        @ApiParam(value = "True for isolated margin, false for cross margin." , defaultValue="true") @RequestPart(value="enabled", required=false)  Boolean enabled) {
        // do some magic!
        return new ResponseEntity<Position>(HttpStatus.OK);
    }

    public ResponseEntity<Position> positionTransferIsolatedMargin(@ApiParam(value = "Symbol of position to isolate.", required=true ) @RequestPart(value="symbol", required=true)  String symbol,
        @ApiParam(value = "Amount to transfer, in Satoshis. May be negative.", required=true ) @RequestPart(value="amount", required=true)  BigDecimal amount) {
        // do some magic!
        return new ResponseEntity<Position>(HttpStatus.OK);
    }

    public ResponseEntity<Position> positionUpdateLeverage(@ApiParam(value = "Symbol of position to adjust.", required=true ) @RequestPart(value="symbol", required=true)  String symbol,
        @ApiParam(value = "Leverage value. Send a number between 0.01 and 100 to enable isolated margin with a fixed leverage. Send 0 to enable cross margin.", required=true ) @RequestPart(value="leverage", required=true)  Double leverage) {
        // do some magic!
        return new ResponseEntity<Position>(HttpStatus.OK);
    }

}
