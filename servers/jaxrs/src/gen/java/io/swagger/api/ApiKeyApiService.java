package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import io.swagger.model.ApiKey;
import io.swagger.model.Error;
import io.swagger.model.InlineResponse200;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-07-05T09:41:09.909-05:00")
public abstract class ApiKeyApiService {
    public abstract Response apiKeyDisable(String apiKeyID,SecurityContext securityContext) throws NotFoundException;
    public abstract Response apiKeyEnable(String apiKeyID,SecurityContext securityContext) throws NotFoundException;
    public abstract Response apiKeyGet(Boolean reverse,SecurityContext securityContext) throws NotFoundException;
    public abstract Response apiKeyNew(String name,String cidr,String permissions,Boolean enabled,String token,SecurityContext securityContext) throws NotFoundException;
    public abstract Response apiKeyRemove(String apiKeyID,SecurityContext securityContext) throws NotFoundException;
}
