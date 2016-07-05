package io.swagger.api.factories;

import io.swagger.api.SchemaApiService;
import io.swagger.api.impl.SchemaApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-07-05T09:41:09.909-05:00")
public class SchemaApiServiceFactory {
    private final static SchemaApiService service = new SchemaApiServiceImpl();

    public static SchemaApiService getSchemaApi() {
        return service;
    }
}
