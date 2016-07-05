package io.swagger.api.factories;

import io.swagger.api.OrderBookApiService;
import io.swagger.api.impl.OrderBookApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-07-05T09:41:09.909-05:00")
public class OrderBookApiServiceFactory {
    private final static OrderBookApiService service = new OrderBookApiServiceImpl();

    public static OrderBookApiService getOrderBookApi() {
        return service;
    }
}
