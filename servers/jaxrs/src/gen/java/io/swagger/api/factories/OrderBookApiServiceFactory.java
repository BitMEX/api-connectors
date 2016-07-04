package io.swagger.api.factories;

import io.swagger.api.OrderBookApiService;
import io.swagger.api.impl.OrderBookApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-07-04T18:25:32.992-05:00")
public class OrderBookApiServiceFactory {

   private final static OrderBookApiService service = new OrderBookApiServiceImpl();

   public static OrderBookApiService getOrderBookApi()
   {
      return service;
   }
}
