package io.swagger.api.factories;

import io.swagger.api.LeaderboardApiService;
import io.swagger.api.impl.LeaderboardApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-07-05T09:41:09.909-05:00")
public class LeaderboardApiServiceFactory {
    private final static LeaderboardApiService service = new LeaderboardApiServiceImpl();

    public static LeaderboardApiService getLeaderboardApi() {
        return service;
    }
}
