package io.swagger.api.factories;

import io.swagger.api.StatsApiService;
import io.swagger.api.impl.StatsApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-07-05T09:41:09.909-05:00")
public class StatsApiServiceFactory {
    private final static StatsApiService service = new StatsApiServiceImpl();

    public static StatsApiService getStatsApi() {
        return service;
    }
}
