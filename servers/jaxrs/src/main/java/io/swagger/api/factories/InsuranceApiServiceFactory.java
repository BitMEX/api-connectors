package io.swagger.api.factories;

import io.swagger.api.InsuranceApiService;
import io.swagger.api.impl.InsuranceApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-07-05T09:41:09.909-05:00")
public class InsuranceApiServiceFactory {
    private final static InsuranceApiService service = new InsuranceApiServiceImpl();

    public static InsuranceApiService getInsuranceApi() {
        return service;
    }
}
