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
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Funding funding = (Funding) o;
    return (timestamp == null ? funding.timestamp == null : timestamp.equals(funding.timestamp)) &&
        (symbol == null ? funding.symbol == null : symbol.equals(funding.symbol)) &&
        (fundingInterval == null ? funding.fundingInterval == null : fundingInterval.equals(funding.fundingInterval)) &&
        (fundingRate == null ? funding.fundingRate == null : fundingRate.equals(funding.fundingRate)) &&
        (fundingRateDaily == null ? funding.fundingRateDaily == null : fundingRateDaily.equals(funding.fundingRateDaily));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (timestamp == null ? 0: timestamp.hashCode());
    result = 31 * result + (symbol == null ? 0: symbol.hashCode());
    result = 31 * result + (fundingInterval == null ? 0: fundingInterval.hashCode());
    result = 31 * result + (fundingRate == null ? 0: fundingRate.hashCode());
    result = 31 * result + (fundingRateDaily == null ? 0: fundingRateDaily.hashCode());
    return result;
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
