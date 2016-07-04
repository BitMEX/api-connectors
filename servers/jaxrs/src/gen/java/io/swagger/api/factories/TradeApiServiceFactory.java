package io.swagger.api.factories;

import io.swagger.api.TradeApiService;
import io.swagger.api.impl.TradeApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-07-04T18:25:32.992-05:00")
public class TradeApiServiceFactory {

   private final static TradeApiService service = new TradeApiServiceImpl();

   public static TradeApiService getTradeApi()
   {
      return service;
   }
}
