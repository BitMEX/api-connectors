package io.swagger.api.factories;

import io.swagger.api.AnnouncementApiService;
import io.swagger.api.impl.AnnouncementApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2015-11-30T13:35:57.938-06:00")
public class AnnouncementApiServiceFactory {

   private final static AnnouncementApiService service = new AnnouncementApiServiceImpl();

   public static AnnouncementApiService getAnnouncementApi()
   {
      return service;
   }
}
