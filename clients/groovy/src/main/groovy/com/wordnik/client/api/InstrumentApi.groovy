package com.wordnik.client.api;





import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import com.wordnik.client.common.ApiUtils
//-------------

import com.wordnik.client.model.Instrument
import java.util.*;

@Mixin(ApiUtils)
class InstrumentApi {
    String basePath = "https://www.bitmex.com/api/v1"
    String versionPath = "/api/v1"


  def instrument_find (Object filter,Closure onSuccess, Closure onFailure)  {
    // create path and map variables
    String resourcePath = "/instrument"


    // query params
    def queryParams = [:]
    def headerParams = [:]

    if(!"null".equals(String.valueOf(filter)))
      queryParams.put("filter", String.valueOf(filter))
    invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "List",
                    instrument.class )

  }
  }

