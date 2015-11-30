package io.swagger.api.factories;

import io.swagger.api.ChatApiService;
import io.swagger.api.impl.ChatApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2015-11-30T13:35:57.938-06:00")
public class ChatApiServiceFactory {

   private final static ChatApiService service = new ChatApiServiceImpl();

   public static ChatApiService getChatApi()
   {
      return service;
   }
}
