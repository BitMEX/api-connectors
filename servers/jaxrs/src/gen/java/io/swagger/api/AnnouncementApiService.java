package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import com.sun.jersey.multipart.FormDataParam;

import io.swagger.model.Announcement;
import io.swagger.model.Error;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataParam;

import javax.ws.rs.core.Response;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-07-04T18:25:32.992-05:00")
public abstract class AnnouncementApiService {
  
      public abstract Response announcementGet(String columns)
      throws NotFoundException;
  
      public abstract Response announcementGetUrgent()
      throws NotFoundException;
  
}
