package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import com.sun.jersey.multipart.FormDataParam;

import io.swagger.model.Instrument;
import io.swagger.model.Error;
import java.math.BigDecimal;
import java.util.Date;
import io.swagger.model.InstrumentInterval;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataParam;

import javax.ws.rs.core.Response;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-07-04T18:25:32.992-05:00")
public abstract class InstrumentApiService {
  
      public abstract Response instrumentGet(String symbol,String filter,String columns,BigDecimal count,BigDecimal start,Boolean reverse,Date startTime,Date endTime)
      throws NotFoundException;
  
      public abstract Response instrumentGetActive()
      throws NotFoundException;
  
      public abstract Response instrumentGetActiveAndIndices()
      throws NotFoundException;
  
      public abstract Response instrumentGetActiveIntervals()
      throws NotFoundException;
  
      public abstract Response instrumentGetIndices()
      throws NotFoundException;
  
}
