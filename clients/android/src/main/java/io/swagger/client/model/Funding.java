package io.swagger.client.model;

import java.util.Date;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class Funding  {
  
  @SerializedName("timestamp")
  private Date timestamp = null;
  @SerializedName("symbol")
  private String symbol = null;
  @SerializedName("fundingInterval")
  private Date fundingInterval = null;
  @SerializedName("fundingRate")
  private Double fundingRate = null;
  @SerializedName("fundingRateDaily")
  private Double fundingRateDaily = null;

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Date getTimestamp() {
    return timestamp;
  }
  public void setTimestamp(Date timestamp) {
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
  public Date getFundingInterval() {
    return fundingInterval;
  }
  public void setFundingInterval(Date fundingInterval) {
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
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Funding {\n");
    
    sb.append("  timestamp: ").append(timestamp).append("\n");
    sb.append("  symbol: ").append(symbol).append("\n");
    sb.append("  fundingInterval: ").append(fundingInterval).append("\n");
    sb.append("  fundingRate: ").append(fundingRate).append("\n");
    sb.append("  fundingRateDaily: ").append(fundingRateDaily).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
