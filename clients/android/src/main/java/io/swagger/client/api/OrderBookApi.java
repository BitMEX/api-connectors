package io.swagger.client.api;

import io.swagger.client.ApiInvoker;
import io.swagger.client.ApiException;
import io.swagger.client.Pair;

import io.swagger.client.model.*;

import java.util.*;

import com.android.volley.Response;
import com.android.volley.VolleyError;

import io.swagger.client.model.OrderBook;
import io.swagger.client.model.Error;
import java.math.BigDecimal;
import io.swagger.client.model.OrderBookL2;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public class OrderBookApi {
  String basePath = "https://localhost/api/v1";
  ApiInvoker apiInvoker = ApiInvoker.getInstance();

  public void addHeader(String key, String value) {
    getInvoker().addDefaultHeader(key, value);
  }

  public ApiInvoker getInvoker() {
    return apiInvoker;
  }

  public void setBasePath(String basePath) {
    this.basePath = basePath;
  }

  public String getBasePath() {
    return basePath;
  }

  /**
  * Get current orderbook [deprecated, use /orderBook/L2].
  * 
   * @param symbol Instrument symbol. Send a series (e.g. XBT) to get data for the nearest contract in that series.
   * @param depth Orderbook depth.
   * @return List<OrderBook>
  */
  public List<OrderBook> orderBookGet (String symbol, BigDecimal depth) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
     Object postBody = null;
  
      // verify the required parameter 'symbol' is set
      if (symbol == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'symbol' when calling orderBookGet",
      new ApiException(400, "Missing the required parameter 'symbol' when calling orderBookGet"));
      }
  

  // create path and map variables
  String path = "/orderBook".replaceAll("\\{format\\}","json");

  // query params
  List<Pair> queryParams = new ArrayList<Pair>();
      // header params
      Map<String, String> headerParams = new HashMap<String, String>();
      // form params
      Map<String, String> formParams = new HashMap<String, String>();

          queryParams.addAll(ApiInvoker.parameterToPairs("", "symbol", symbol));
          queryParams.addAll(ApiInvoker.parameterToPairs("", "depth", depth));


      String[] contentTypes = {
  "application/json","application/x-www-form-urlencoded"
      };
      String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

      if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
  

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
      } else {
      // normal form params
        }

      String[] authNames = new String[] {  };

      try {
        String localVarResponse = apiInvoker.invokeAPI (basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames);
        if(localVarResponse != null){
           return (List<OrderBook>) ApiInvoker.deserialize(localVarResponse, "array", OrderBook.class);
        } else {
           return null;
        }
      } catch (ApiException ex) {
         throw ex;
      } catch (InterruptedException ex) {
         throw ex;
      } catch (ExecutionException ex) {
         if(ex.getCause() instanceof VolleyError) {
	    VolleyError volleyError = (VolleyError)ex.getCause();
	    if (volleyError.networkResponse != null) {
	       throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
	    }
         }
         throw ex;
      } catch (TimeoutException ex) {
         throw ex;
      }
  }

      /**
   * Get current orderbook [deprecated, use /orderBook/L2].
   * 
   * @param symbol Instrument symbol. Send a series (e.g. XBT) to get data for the nearest contract in that series.   * @param depth Orderbook depth.
  */
  public void orderBookGet (String symbol, BigDecimal depth, final Response.Listener<List<OrderBook>> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  
    // verify the required parameter 'symbol' is set
    if (symbol == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'symbol' when calling orderBookGet",
         new ApiException(400, "Missing the required parameter 'symbol' when calling orderBookGet"));
    }
    

    // create path and map variables
    String path = "/orderBook".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    queryParams.addAll(ApiInvoker.parameterToPairs("", "symbol", symbol));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "depth", depth));


    String[] contentTypes = {
      "application/json","application/x-www-form-urlencoded"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

      String[] authNames = new String[] {  };

    try {
      apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((List<OrderBook>) ApiInvoker.deserialize(localVarResponse,  "array", OrderBook.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * Get current orderbook in vertical format.
  * 
   * @param symbol Instrument symbol. Send a series (e.g. XBT) to get data for the nearest contract in that series.
   * @param depth Orderbook depth per side. Send 0 for full depth.
   * @return List<OrderBookL2>
  */
  public List<OrderBookL2> orderBookGetL2 (String symbol, BigDecimal depth) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
     Object postBody = null;
  
      // verify the required parameter 'symbol' is set
      if (symbol == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'symbol' when calling orderBookGetL2",
      new ApiException(400, "Missing the required parameter 'symbol' when calling orderBookGetL2"));
      }
  

  // create path and map variables
  String path = "/orderBook/L2".replaceAll("\\{format\\}","json");

  // query params
  List<Pair> queryParams = new ArrayList<Pair>();
      // header params
      Map<String, String> headerParams = new HashMap<String, String>();
      // form params
      Map<String, String> formParams = new HashMap<String, String>();

          queryParams.addAll(ApiInvoker.parameterToPairs("", "symbol", symbol));
          queryParams.addAll(ApiInvoker.parameterToPairs("", "depth", depth));


      String[] contentTypes = {
  "application/json","application/x-www-form-urlencoded"
      };
      String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

      if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
  

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
      } else {
      // normal form params
        }

      String[] authNames = new String[] {  };

      try {
        String localVarResponse = apiInvoker.invokeAPI (basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames);
        if(localVarResponse != null){
           return (List<OrderBookL2>) ApiInvoker.deserialize(localVarResponse, "array", OrderBookL2.class);
        } else {
           return null;
        }
      } catch (ApiException ex) {
         throw ex;
      } catch (InterruptedException ex) {
         throw ex;
      } catch (ExecutionException ex) {
         if(ex.getCause() instanceof VolleyError) {
	    VolleyError volleyError = (VolleyError)ex.getCause();
	    if (volleyError.networkResponse != null) {
	       throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
	    }
         }
         throw ex;
      } catch (TimeoutException ex) {
         throw ex;
      }
  }

      /**
   * Get current orderbook in vertical format.
   * 
   * @param symbol Instrument symbol. Send a series (e.g. XBT) to get data for the nearest contract in that series.   * @param depth Orderbook depth per side. Send 0 for full depth.
  */
  public void orderBookGetL2 (String symbol, BigDecimal depth, final Response.Listener<List<OrderBookL2>> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  
    // verify the required parameter 'symbol' is set
    if (symbol == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'symbol' when calling orderBookGetL2",
         new ApiException(400, "Missing the required parameter 'symbol' when calling orderBookGetL2"));
    }
    

    // create path and map variables
    String path = "/orderBook/L2".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    queryParams.addAll(ApiInvoker.parameterToPairs("", "symbol", symbol));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "depth", depth));


    String[] contentTypes = {
      "application/json","application/x-www-form-urlencoded"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

      String[] authNames = new String[] {  };

    try {
      apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((List<OrderBookL2>) ApiInvoker.deserialize(localVarResponse,  "array", OrderBookL2.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
}
