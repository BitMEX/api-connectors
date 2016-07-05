package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import io.swagger.model.Stats;
import io.swagger.model.Error;
import io.swagger.model.StatsHistory;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-07-05T09:41:09.909-05:00")
public abstract class StatsApiService {
    public abstract Response statsGet(SecurityContext securityContext) throws NotFoundException;
    public abstract Response statsHistory(SecurityContext securityContext) throws NotFoundException;
}
