package io.swagger.api.factories;

import io.swagger.api.LiquidationApiService;
import io.swagger.api.impl.LiquidationApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-07-04T18:25:32.992-05:00")
public class LiquidationApiServiceFactory {

   private final static LiquidationApiService service = new LiquidationApiServiceImpl();

   public static LiquidationApiService getLiquidationApi()
   {
      return service;
   }
}
