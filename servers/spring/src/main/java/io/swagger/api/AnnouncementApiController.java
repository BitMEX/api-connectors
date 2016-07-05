package io.swagger.api;

import io.swagger.model.Announcement;
import io.swagger.model.Error;

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
public class AnnouncementApiController implements AnnouncementApi {

    public ResponseEntity<List<Announcement>> announcementGet(@ApiParam(value = "Array of column names to fetch. If omitted, will return all columns.") @RequestParam(value = "columns", required = false) String columns) {
        // do some magic!
        return new ResponseEntity<List<Announcement>>(HttpStatus.OK);
    }

    public ResponseEntity<List<Announcement>> announcementGetUrgent() {
        // do some magic!
        return new ResponseEntity<List<Announcement>>(HttpStatus.OK);
    }

}
