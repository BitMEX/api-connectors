package io.swagger.api.factories;

import io.swagger.api.OrderApiService;
import io.swagger.api.impl.OrderApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-07-04T18:25:32.992-05:00")
public class OrderApiServiceFactory {

   private final static OrderApiService service = new OrderApiServiceImpl();

   public static OrderApiService getOrderApi()
   {
      return service;
   }
}
