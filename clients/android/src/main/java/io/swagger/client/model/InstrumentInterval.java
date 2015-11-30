package io.swagger.client.model;

import java.util.*;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class InstrumentInterval  {
  
  @SerializedName("intervals")
  private List<String> intervals = null;
  @SerializedName("symbols")
  private List<String> symbols = null;

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<String> getIntervals() {
    return intervals;
  }
  public void setIntervals(List<String> intervals) {
    this.intervals = intervals;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<String> getSymbols() {
    return symbols;
  }
  public void setSymbols(List<String> symbols) {
    this.symbols = symbols;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstrumentInterval {\n");
    
    sb.append("  intervals: ").append(intervals).append("\n");
    sb.append("  symbols: ").append(symbols).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
