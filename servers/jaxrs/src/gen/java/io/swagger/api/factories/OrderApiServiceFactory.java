package io.swagger.api.factories;

import io.swagger.api.OrderApiService;
import io.swagger.api.impl.OrderApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2015-11-30T13:35:57.938-06:00")
public class OrderApiServiceFactory {

   private final static OrderApiService service = new OrderApiServiceImpl();

   public static OrderApiService getOrderApi()
   {
      return service;
   }
}
