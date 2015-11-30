package io.swagger.api.factories;

import io.swagger.api.ExecutionApiService;
import io.swagger.api.impl.ExecutionApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2015-11-30T13:35:57.938-06:00")
public class ExecutionApiServiceFactory {

   private final static ExecutionApiService service = new ExecutionApiServiceImpl();

   public static ExecutionApiService getExecutionApi()
   {
      return service;
   }
}
