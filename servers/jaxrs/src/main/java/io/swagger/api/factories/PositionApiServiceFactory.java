package io.swagger.api.factories;

import io.swagger.api.PositionApiService;
import io.swagger.api.impl.PositionApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-07-05T09:41:09.909-05:00")
public class PositionApiServiceFactory {
    private final static PositionApiService service = new PositionApiServiceImpl();

    public static PositionApiService getPositionApi() {
        return service;
    }
}
