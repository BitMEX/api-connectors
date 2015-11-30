package io.swagger.api.factories;

import io.swagger.api.ApiKeyApiService;
import io.swagger.api.impl.ApiKeyApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2015-11-30T13:35:57.938-06:00")
public class ApiKeyApiServiceFactory {

   private final static ApiKeyApiService service = new ApiKeyApiServiceImpl();

   public static ApiKeyApiService getApiKeyApi()
   {
      return service;
   }
}
