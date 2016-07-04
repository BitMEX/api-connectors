package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import com.sun.jersey.multipart.FormDataParam;

import io.swagger.model.Position;
import io.swagger.model.Error;
import java.math.BigDecimal;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataParam;

import javax.ws.rs.core.Response;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-07-04T18:25:32.992-05:00")
public abstract class PositionApiService {
  
      public abstract Response positionGet(String filter,String columns,BigDecimal count)
      throws NotFoundException;
  
      public abstract Response positionIsolateMargin(String symbol,Boolean enabled)
      throws NotFoundException;
  
      public abstract Response positionUpdateLeverage(String symbol,Double leverage)
      throws NotFoundException;
  
      public abstract Response positionTransferIsolatedMargin(String symbol,BigDecimal amount)
      throws NotFoundException;
  
}
