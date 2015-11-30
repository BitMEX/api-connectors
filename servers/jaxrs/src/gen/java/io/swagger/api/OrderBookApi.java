package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.OrderBookApiService;
import io.swagger.api.factories.OrderBookApiServiceFactory;

import io.swagger.annotations.ApiParam;

import com.sun.jersey.multipart.FormDataParam;

import io.swagger.model.OrderBook;
import io.swagger.model.Error;
import java.math.BigDecimal;

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
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2015-11-30T13:35:57.938-06:00")
public class OrderBookApi  {
   private final OrderBookApiService delegate = OrderBookApiServiceFactory.getOrderBookApi();

    @GET
    
    @Consumes({ "application/json", "application/x-www-form-urlencoded" })
    @Produces({ "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" })
    @io.swagger.annotations.ApiOperation(value = "Get current orderbook.", notes = "", response = OrderBook.class, responseContainer = "List", tags={ "OrderBook" })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Request was successful", response = OrderBook.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Parameter Error", response = OrderBook.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized", response = OrderBook.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found", response = OrderBook.class, responseContainer = "List") })

    public Response orderBookGetOrderBook(@ApiParam(value = "Instrument symbol. Send a series (e.g. XBT) to get data for the nearest contract in that series.",required=true) @QueryParam("symbol") String symbol,
    @ApiParam(value = "Orderbook depth.") @QueryParam("depth") BigDecimal depth)
    throws NotFoundException {
        return delegate.orderBookGetOrderBook(symbol,depth);
    }
}

