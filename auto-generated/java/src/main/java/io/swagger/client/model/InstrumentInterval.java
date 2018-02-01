package io.swagger.client.model;

import io.swagger.client.StringUtil;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;


import java.util.Objects;

import io.swagger.annotations.*;



@ApiModel(description = "")
public class InstrumentInterval   {
  
  @SerializedName("intervals")
  private List<String> intervals = new ArrayList<String>();

  @SerializedName("symbols")
  private List<String> symbols = new ArrayList<String>();

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
