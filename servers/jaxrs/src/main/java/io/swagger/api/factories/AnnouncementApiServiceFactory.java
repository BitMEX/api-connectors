package io.swagger.api.factories;

import io.swagger.api.AnnouncementApiService;
import io.swagger.api.impl.AnnouncementApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-07-05T09:41:09.909-05:00")
public class AnnouncementApiServiceFactory {
    private final static AnnouncementApiService service = new AnnouncementApiServiceImpl();

    public static AnnouncementApiService getAnnouncementApi() {
        return service;
    }
}
