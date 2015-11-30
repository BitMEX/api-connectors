package io.swagger.api.factories;

import io.swagger.api.StatsApiService;
import io.swagger.api.impl.StatsApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2015-11-30T13:35:57.938-06:00")
public class StatsApiServiceFactory {

   private final static StatsApiService service = new StatsApiServiceImpl();

   public static StatsApiService getStatsApi()
   {
      return service;
   }
}
