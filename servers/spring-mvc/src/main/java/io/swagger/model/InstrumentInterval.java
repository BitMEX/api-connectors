package io.swagger.model;

import java.util.*;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringMVCServerCodegen", date = "2015-11-30T13:36:04.774-06:00")
public class InstrumentInterval  {
  
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
    
    sb.append("  intervals: ").append(intervals).append("\n");
    sb.append("  symbols: ").append(symbols).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
