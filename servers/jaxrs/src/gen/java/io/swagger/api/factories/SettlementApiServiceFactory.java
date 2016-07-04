package io.swagger.api.factories;

import io.swagger.api.SettlementApiService;
import io.swagger.api.impl.SettlementApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-07-04T18:25:32.992-05:00")
public class SettlementApiServiceFactory {

   private final static SettlementApiService service = new SettlementApiServiceImpl();

   public static SettlementApiService getSettlementApi()
   {
      return service;
   }
}
