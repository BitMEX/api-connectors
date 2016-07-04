package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.OrderBookApiService;
import io.swagger.api.factories.OrderBookApiServiceFactory;

import io.swagger.annotations.ApiParam;

import com.sun.jersey.multipart.FormDataParam;

import io.swagger.model.OrderBook;
import io.swagger.model.Error;
import java.math.BigDecimal;
import io.swagger.model.OrderBookL2;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataParam;

import javax.ws.rs.core.Response;
import javax.ws.rs.*;

@Path("/orderBook")
@Consumes({ "application/json", "application/x-www-form-urlencoded" })
@Produces({ "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" })
@io.swagger.annotations.Api(description = "the orderBook API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-07-04T18:25:32.992-05:00")
public class OrderBookApi  {
   private final OrderBookApiService delegate = OrderBookApiServiceFactory.getOrderBookApi();

    @GET
    
    @Consumes({ "application/json", "application/x-www-form-urlencoded" })
    @Produces({ "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" })
    @io.swagger.annotations.ApiOperation(value = "Get current orderbook [deprecated, use /orderBook/L2].", notes = "", response = OrderBook.class, responseContainer = "List", tags={ "OrderBook",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Request was successful", response = OrderBook.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Parameter Error", response = OrderBook.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized", response = OrderBook.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found", response = OrderBook.class, responseContainer = "List") })

    public Response orderBookGet(@ApiParam(value = "Instrument symbol. Send a series (e.g. XBT) to get data for the nearest contract in that series.",required=true) @QueryParam("symbol") String symbol,
    @ApiParam(value = "Orderbook depth.", defaultValue="25") @QueryParam("depth") BigDecimal depth)
    throws NotFoundException {
        return delegate.orderBookGet(symbol,depth);
    }
    @GET
    @Path("/L2")
    @Consumes({ "application/json", "application/x-www-form-urlencoded" })
    @Produces({ "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" })
    @io.swagger.annotations.ApiOperation(value = "Get current orderbook in vertical format.", notes = "", response = OrderBookL2.class, responseContainer = "List", tags={ "OrderBook" })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Request was successful", response = OrderBookL2.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Parameter Error", response = OrderBookL2.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized", response = OrderBookL2.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found", response = OrderBookL2.class, responseContainer = "List") })

    public Response orderBookGetL2(@ApiParam(value = "Instrument symbol. Send a series (e.g. XBT) to get data for the nearest contract in that series.",required=true) @QueryParam("symbol") String symbol,
    @ApiParam(value = "Orderbook depth per side. Send 0 for full depth.", defaultValue="25") @QueryParam("depth") BigDecimal depth)
    throws NotFoundException {
        return delegate.orderBookGetL2(symbol,depth);
    }
}

