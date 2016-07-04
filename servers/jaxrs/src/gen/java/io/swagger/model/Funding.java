package io.swagger.model;

import java.util.Date;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-07-04T18:25:32.992-05:00")
public class Funding  {
  
  private Date timestamp = null;
  private String symbol = null;
  private Date fundingInterval = null;
  private Double fundingRate = null;
  private Double fundingRateDaily = null;

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("timestamp")
  public Date getTimestamp() {
    return timestamp;
  }
  public void setTimestamp(Date timestamp) {
    this.timestamp = timestamp;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("symbol")
  public String getSymbol() {
    return symbol;
  }
  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("fundingInterval")
  public Date getFundingInterval() {
    return fundingInterval;
  }
  public void setFundingInterval(Date fundingInterval) {
    this.fundingInterval = fundingInterval;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("fundingRate")
  public Double getFundingRate() {
    return fundingRate;
  }
  public void setFundingRate(Double fundingRate) {
    this.fundingRate = fundingRate;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("fundingRateDaily")
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
    
    sb.append("  timestamp: ").append(timestamp).append("\n");
    sb.append("  symbol: ").append(symbol).append("\n");
    sb.append("  fundingInterval: ").append(fundingInterval).append("\n");
    sb.append("  fundingRate: ").append(fundingRate).append("\n");
    sb.append("  fundingRateDaily: ").append(fundingRateDaily).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
