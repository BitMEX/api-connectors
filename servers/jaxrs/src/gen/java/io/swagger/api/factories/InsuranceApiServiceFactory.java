package io.swagger.api.factories;

import io.swagger.api.InsuranceApiService;
import io.swagger.api.impl.InsuranceApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-07-04T18:25:32.992-05:00")
public class InsuranceApiServiceFactory {

   private final static InsuranceApiService service = new InsuranceApiServiceImpl();

   public static InsuranceApiService getInsuranceApi()
   {
      return service;
   }
}
