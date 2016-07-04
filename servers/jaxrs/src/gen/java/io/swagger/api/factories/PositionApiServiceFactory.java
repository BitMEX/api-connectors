package io.swagger.api.factories;

import io.swagger.api.PositionApiService;
import io.swagger.api.impl.PositionApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-07-04T18:25:32.992-05:00")
public class PositionApiServiceFactory {

   private final static PositionApiService service = new PositionApiServiceImpl();

   public static PositionApiService getPositionApi()
   {
      return service;
   }
}
