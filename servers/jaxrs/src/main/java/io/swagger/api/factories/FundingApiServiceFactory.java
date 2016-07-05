package io.swagger.api.factories;

import io.swagger.api.FundingApiService;
import io.swagger.api.impl.FundingApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-07-05T09:41:09.909-05:00")
public class FundingApiServiceFactory {
    private final static FundingApiService service = new FundingApiServiceImpl();

    public static FundingApiService getFundingApi() {
        return service;
    }
}
