package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import com.sun.jersey.multipart.FormDataParam;

import io.swagger.model.Order;
import io.swagger.model.Error;
import java.math.BigDecimal;
import java.util.Date;
import io.swagger.model.InlineResponse2001;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataParam;

import javax.ws.rs.core.Response;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-07-04T18:25:32.992-05:00")
public abstract class OrderApiService {
  
      public abstract Response orderGetOrders(String symbol,String filter,String columns,BigDecimal count,BigDecimal start,Boolean reverse,Date startTime,Date endTime)
      throws NotFoundException;
  
      public abstract Response orderAmend(String orderID,String clOrdID,Double simpleOrderQty,BigDecimal orderQty,Double simpleLeavesQty,BigDecimal leavesQty,Double price,Double stopPx,Double pegOffsetValue,String text)
      throws NotFoundException;
  
      public abstract Response orderNew(String symbol,String side,Double simpleOrderQty,BigDecimal quantity,BigDecimal orderQty,Double price,BigDecimal displayQty,Double stopPrice,Double stopPx,String clOrdID,String clOrdLinkID,Double pegOffsetValue,String pegPriceType,String type,String ordType,String timeInForce,String execInst,String contingencyType,String text)
      throws NotFoundException;
  
      public abstract Response orderCancel(String orderID,String clOrdID,String text)
      throws NotFoundException;
  
      public abstract Response orderCancelAll(String symbol,String filter,String text)
      throws NotFoundException;
  
      public abstract Response orderAmendBulk(String orders)
      throws NotFoundException;
  
      public abstract Response orderNewBulk(String orders)
      throws NotFoundException;
  
      public abstract Response orderCancelAllAfter(Double timeout)
      throws NotFoundException;
  
      public abstract Response orderClosePosition(String symbol,Double price)
      throws NotFoundException;
  
}
