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
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstrumentInterval instrumentInterval = (InstrumentInterval) o;
    return (intervals == null ? instrumentInterval.intervals == null : intervals.equals(instrumentInterval.intervals)) &&
        (symbols == null ? instrumentInterval.symbols == null : symbols.equals(instrumentInterval.symbols));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (intervals == null ? 0: intervals.hashCode());
    result = 31 * result + (symbols == null ? 0: symbols.hashCode());
    return result;
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
