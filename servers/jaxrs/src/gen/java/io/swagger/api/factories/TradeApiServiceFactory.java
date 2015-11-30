package io.swagger.api.factories;

import io.swagger.api.TradeApiService;
import io.swagger.api.impl.TradeApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2015-11-30T13:35:57.938-06:00")
public class TradeApiServiceFactory {

   private final static TradeApiService service = new TradeApiServiceImpl();

   public static TradeApiService getTradeApi()
   {
      return service;
   }
}
