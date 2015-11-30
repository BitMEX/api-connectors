package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

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

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2015-11-30T13:35:57.938-06:00")
public abstract class ApiKeyApiService {
  
      public abstract Response apiKeyGetKeys(Boolean reverse)
      throws NotFoundException;
  
      public abstract Response apiKeyCreateKey(String name,String cidr,String permissions,Boolean enabled,String token)
      throws NotFoundException;
  
      public abstract Response apiKeyRemove(String apiKeyID)
      throws NotFoundException;
  
      public abstract Response apiKeyDisable(String apiKeyID)
      throws NotFoundException;
  
      public abstract Response apiKeyEnable(String apiKeyID)
      throws NotFoundException;
  
}
