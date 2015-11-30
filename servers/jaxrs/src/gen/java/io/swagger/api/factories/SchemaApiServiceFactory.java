package io.swagger.api.factories;

import io.swagger.api.SchemaApiService;
import io.swagger.api.impl.SchemaApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2015-11-30T13:35:57.938-06:00")
public class SchemaApiServiceFactory {

   private final static SchemaApiService service = new SchemaApiServiceImpl();

   public static SchemaApiService getSchemaApi()
   {
      return service;
   }
}
