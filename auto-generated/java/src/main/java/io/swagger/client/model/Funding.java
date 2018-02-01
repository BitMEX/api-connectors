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
import org.threeten.bp.OffsetDateTime;

import com.google.gson.annotations.SerializedName;


import java.util.Objects;

import io.swagger.annotations.*;



/**
 * Swap Funding History
 **/
@ApiModel(description = "Swap Funding History")
public class Funding   {
  
  @SerializedName("timestamp")
  private OffsetDateTime timestamp = null;

  @SerializedName("symbol")
  private String symbol = null;

  @SerializedName("fundingInterval")
  private OffsetDateTime fundingInterval = null;

  @SerializedName("fundingRate")
  private Double fundingRate = null;

  @SerializedName("fundingRateDaily")
  private Double fundingRateDaily = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public OffsetDateTime getTimestamp() {
    return timestamp;
  }
  public void setTimestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getSymbol() {
    return symbol;
  }
  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getFundingInterval() {
    return fundingInterval;
  }
  public void setFundingInterval(OffsetDateTime fundingInterval) {
    this.fundingInterval = fundingInterval;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Double getFundingRate() {
    return fundingRate;
  }
  public void setFundingRate(Double fundingRate) {
    this.fundingRate = fundingRate;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Double getFundingRateDaily() {
    return fundingRateDaily;
  }
  public void setFundingRateDaily(Double fundingRateDaily) {
    this.fundingRateDaily = fundingRateDaily;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Funding funding = (Funding) o;
    return Objects.equals(timestamp, funding.timestamp) &&
        Objects.equals(symbol, funding.symbol) &&
        Objects.equals(fundingInterval, funding.fundingInterval) &&
        Objects.equals(fundingRate, funding.fundingRate) &&
        Objects.equals(fundingRateDaily, funding.fundingRateDaily);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timestamp, symbol, fundingInterval, fundingRate, fundingRateDaily);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Funding {\n");
    
    sb.append("    timestamp: ").append(StringUtil.toIndentedString(timestamp)).append("\n");
    sb.append("    symbol: ").append(StringUtil.toIndentedString(symbol)).append("\n");
    sb.append("    fundingInterval: ").append(StringUtil.toIndentedString(fundingInterval)).append("\n");
    sb.append("    fundingRate: ").append(StringUtil.toIndentedString(fundingRate)).append("\n");
    sb.append("    fundingRateDaily: ").append(StringUtil.toIndentedString(fundingRateDaily)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
