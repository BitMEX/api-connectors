package io.swagger.api.factories;

import io.swagger.api.ApiKeyApiService;
import io.swagger.api.impl.ApiKeyApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-07-04T18:25:32.992-05:00")
public class ApiKeyApiServiceFactory {

   private final static ApiKeyApiService service = new ApiKeyApiServiceImpl();

   public static ApiKeyApiService getApiKeyApi()
   {
      return service;
   }
}
