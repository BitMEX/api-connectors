package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import io.swagger.model.Chat;
import io.swagger.model.Error;
import java.math.BigDecimal;
import io.swagger.model.ConnectedUsers;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-07-05T09:41:09.909-05:00")
public abstract class ChatApiService {
    public abstract Response chatGet(BigDecimal count,BigDecimal start,Boolean reverse,SecurityContext securityContext) throws NotFoundException;
    public abstract Response chatGetConnected(SecurityContext securityContext) throws NotFoundException;
    public abstract Response chatNew(String message,SecurityContext securityContext) throws NotFoundException;
}
