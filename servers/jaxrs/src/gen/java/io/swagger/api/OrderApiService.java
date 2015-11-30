package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import com.sun.jersey.multipart.FormDataParam;

import io.swagger.model.Order;
import io.swagger.model.Error;
import java.math.BigDecimal;
import java.util.Date;
import io.swagger.model.InlineResponse200;
import io.swagger.model.LiquidationOrder;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataParam;

import javax.ws.rs.core.Response;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2015-11-30T13:35:57.938-06:00")
public abstract class OrderApiService {
  
      public abstract Response orderGetOrders(String symbol,String filter,String columns,BigDecimal count,BigDecimal start,Boolean reverse,Date startTime,Date endTime)
      throws NotFoundException;
  
      public abstract Response orderNewOrder(String symbol,BigDecimal quantity,Double price,String timeInForce,String type,Double stopPrice,String clOrdID)
      throws NotFoundException;
  
      public abstract Response orderCancelOrder(String orderID,String clOrdID,String text)
      throws NotFoundException;
  
      public abstract Response orderCancelAll(String symbol,String filter,String text)
      throws NotFoundException;
  
      public abstract Response orderCancelAllAfter(Double timeout)
      throws NotFoundException;
  
      public abstract Response orderClosePosition(String symbol,Double price)
      throws NotFoundException;
  
      public abstract Response orderGetCloseOutOrders(String filter)
      throws NotFoundException;
  
}
