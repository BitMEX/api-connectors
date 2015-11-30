package io.swagger.api.factories;

import io.swagger.api.OrderBookApiService;
import io.swagger.api.impl.OrderBookApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2015-11-30T13:35:57.938-06:00")
public class OrderBookApiServiceFactory {

   private final static OrderBookApiService service = new OrderBookApiServiceImpl();

   public static OrderBookApiService getOrderBookApi()
   {
      return service;
   }
}
