package io.swagger.api.factories;

import io.swagger.api.ExecutionApiService;
import io.swagger.api.impl.ExecutionApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-07-05T09:41:09.909-05:00")
public class ExecutionApiServiceFactory {
    private final static ExecutionApiService service = new ExecutionApiServiceImpl();

    public static ExecutionApiService getExecutionApi() {
        return service;
    }
}
