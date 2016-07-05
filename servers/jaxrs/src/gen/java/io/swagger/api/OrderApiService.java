package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import io.swagger.model.Order;
import io.swagger.model.Error;
import java.math.BigDecimal;
import java.util.Date;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-07-05T09:41:09.909-05:00")
public abstract class OrderApiService {
    public abstract Response orderAmend(String orderID,String clOrdID,Double simpleOrderQty,BigDecimal orderQty,Double simpleLeavesQty,BigDecimal leavesQty,Double price,Double stopPx,Double pegOffsetValue,String text,SecurityContext securityContext) throws NotFoundException;
    public abstract Response orderAmendBulk(String orders,SecurityContext securityContext) throws NotFoundException;
    public abstract Response orderCancel(String orderID,String clOrdID,String text,SecurityContext securityContext) throws NotFoundException;
    public abstract Response orderCancelAll(String symbol,String filter,String text,SecurityContext securityContext) throws NotFoundException;
    public abstract Response orderCancelAllAfter(Double timeout,SecurityContext securityContext) throws NotFoundException;
    public abstract Response orderClosePosition(String symbol,Double price,SecurityContext securityContext) throws NotFoundException;
    public abstract Response orderGetOrders(String symbol,String filter,String columns,BigDecimal count,BigDecimal start,Boolean reverse,Date startTime,Date endTime,SecurityContext securityContext) throws NotFoundException;
    public abstract Response orderNew(String symbol,String side,Double simpleOrderQty,BigDecimal quantity,BigDecimal orderQty,Double price,BigDecimal displayQty,Double stopPrice,Double stopPx,String clOrdID,String clOrdLinkID,Double pegOffsetValue,String pegPriceType,String type,String ordType,String timeInForce,String execInst,String contingencyType,String text,SecurityContext securityContext) throws NotFoundException;
    public abstract Response orderNewBulk(String orders,SecurityContext securityContext) throws NotFoundException;
}
