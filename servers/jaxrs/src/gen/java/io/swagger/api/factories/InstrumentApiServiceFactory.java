package io.swagger.api.factories;

import io.swagger.api.InstrumentApiService;
import io.swagger.api.impl.InstrumentApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-07-04T18:25:32.992-05:00")
public class InstrumentApiServiceFactory {

   private final static InstrumentApiService service = new InstrumentApiServiceImpl();

   public static InstrumentApiService getInstrumentApi()
   {
      return service;
   }
}
