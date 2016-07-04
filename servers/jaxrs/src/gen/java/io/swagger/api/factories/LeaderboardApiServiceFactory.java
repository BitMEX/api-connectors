package io.swagger.api.factories;

import io.swagger.api.LeaderboardApiService;
import io.swagger.api.impl.LeaderboardApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-07-04T18:25:32.992-05:00")
public class LeaderboardApiServiceFactory {

   private final static LeaderboardApiService service = new LeaderboardApiServiceImpl();

   public static LeaderboardApiService getLeaderboardApi()
   {
      return service;
   }
}
