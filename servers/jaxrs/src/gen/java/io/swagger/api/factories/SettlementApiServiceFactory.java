package io.swagger.api.factories;

import io.swagger.api.SettlementApiService;
import io.swagger.api.impl.SettlementApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2015-11-30T13:35:57.938-06:00")
public class SettlementApiServiceFactory {

   private final static SettlementApiService service = new SettlementApiServiceImpl();

   public static SettlementApiService getSettlementApi()
   {
      return service;
   }
}
