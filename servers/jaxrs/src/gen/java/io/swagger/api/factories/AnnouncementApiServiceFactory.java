package io.swagger.api.factories;

import io.swagger.api.AnnouncementApiService;
import io.swagger.api.impl.AnnouncementApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-07-04T18:25:32.992-05:00")
public class AnnouncementApiServiceFactory {

   private final static AnnouncementApiService service = new AnnouncementApiServiceImpl();

   public static AnnouncementApiService getAnnouncementApi()
   {
      return service;
   }
}
