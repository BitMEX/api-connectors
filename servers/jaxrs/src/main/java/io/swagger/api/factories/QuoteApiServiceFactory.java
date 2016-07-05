package io.swagger.api.factories;

import io.swagger.api.QuoteApiService;
import io.swagger.api.impl.QuoteApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-07-05T09:41:09.909-05:00")
public class QuoteApiServiceFactory {
    private final static QuoteApiService service = new QuoteApiServiceImpl();

    public static QuoteApiService getQuoteApi() {
        return service;
    }
}
