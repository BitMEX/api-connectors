package io.swagger.api.factories;

import io.swagger.api.QuoteApiService;
import io.swagger.api.impl.QuoteApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-07-04T18:25:32.992-05:00")
public class QuoteApiServiceFactory {

   private final static QuoteApiService service = new QuoteApiServiceImpl();

   public static QuoteApiService getQuoteApi()
   {
      return service;
   }
}
