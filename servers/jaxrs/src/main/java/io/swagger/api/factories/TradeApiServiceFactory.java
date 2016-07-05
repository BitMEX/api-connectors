package io.swagger.api.factories;

import io.swagger.api.TradeApiService;
import io.swagger.api.impl.TradeApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-07-05T09:41:09.909-05:00")
public class TradeApiServiceFactory {
    private final static TradeApiService service = new TradeApiServiceImpl();

    public static TradeApiService getTradeApi() {
        return service;
    }
}
