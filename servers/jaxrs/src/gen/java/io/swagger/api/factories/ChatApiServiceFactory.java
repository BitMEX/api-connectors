package io.swagger.api.factories;

import io.swagger.api.ChatApiService;
import io.swagger.api.impl.ChatApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-07-04T18:25:32.992-05:00")
public class ChatApiServiceFactory {

   private final static ChatApiService service = new ChatApiServiceImpl();

   public static ChatApiService getChatApi()
   {
      return service;
   }
}
