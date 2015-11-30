package io.swagger.api.factories;

import io.swagger.api.PositionApiService;
import io.swagger.api.impl.PositionApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2015-11-30T13:35:57.938-06:00")
public class PositionApiServiceFactory {

   private final static PositionApiService service = new PositionApiServiceImpl();

   public static PositionApiService getPositionApi()
   {
      return service;
   }
}
