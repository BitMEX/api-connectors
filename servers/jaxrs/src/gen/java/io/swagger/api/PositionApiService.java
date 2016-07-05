package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import io.swagger.model.Position;
import io.swagger.model.Error;
import java.math.BigDecimal;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-07-05T09:41:09.909-05:00")
public abstract class PositionApiService {
    public abstract Response positionGet(String filter,String columns,BigDecimal count,SecurityContext securityContext) throws NotFoundException;
    public abstract Response positionIsolateMargin(String symbol,Boolean enabled,SecurityContext securityContext) throws NotFoundException;
    public abstract Response positionTransferIsolatedMargin(String symbol,BigDecimal amount,SecurityContext securityContext) throws NotFoundException;
    public abstract Response positionUpdateLeverage(String symbol,Double leverage,SecurityContext securityContext) throws NotFoundException;
}
