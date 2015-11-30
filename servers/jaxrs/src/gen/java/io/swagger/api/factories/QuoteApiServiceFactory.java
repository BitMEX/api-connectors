package io.swagger.api.factories;

import io.swagger.api.QuoteApiService;
import io.swagger.api.impl.QuoteApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2015-11-30T13:35:57.938-06:00")
public class QuoteApiServiceFactory {

   private final static QuoteApiService service = new QuoteApiServiceImpl();

   public static QuoteApiService getQuoteApi()
   {
      return service;
   }
}
