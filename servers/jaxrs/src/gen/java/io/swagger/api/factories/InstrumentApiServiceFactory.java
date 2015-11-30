package io.swagger.api.factories;

import io.swagger.api.InstrumentApiService;
import io.swagger.api.impl.InstrumentApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2015-11-30T13:35:57.938-06:00")
public class InstrumentApiServiceFactory {

   private final static InstrumentApiService service = new InstrumentApiServiceImpl();

   public static InstrumentApiService getInstrumentApi()
   {
      return service;
   }
}
