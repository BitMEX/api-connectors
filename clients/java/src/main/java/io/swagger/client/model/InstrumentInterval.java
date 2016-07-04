package io.swagger.client.model;

import io.swagger.client.StringUtil;
import java.util.*;


import java.util.Objects;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.*;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-04T18:25:18.235-05:00")
public class InstrumentInterval   {
  
  private List<String> intervals = new ArrayList<String>();
  private List<String> symbols = new ArrayList<String>();

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("intervals")
  public List<String> getIntervals() {
    return intervals;
  }
  public void setIntervals(List<String> intervals) {
    this.intervals = intervals;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("symbols")
  public List<String> getSymbols() {
    return symbols;
  }
  public void setSymbols(List<String> symbols) {
    this.symbols = symbols;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstrumentInterval instrumentInterval = (InstrumentInterval) o;
    return Objects.equals(intervals, instrumentInterval.intervals) &&
        Objects.equals(symbols, instrumentInterval.symbols);
  }

  @Override
  public int hashCode() {
    return Objects.hash(intervals, symbols);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstrumentInterval {\n");
    
    sb.append("    intervals: ").append(StringUtil.toIndentedString(intervals)).append("\n");
    sb.append("    symbols: ").append(StringUtil.toIndentedString(symbols)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
