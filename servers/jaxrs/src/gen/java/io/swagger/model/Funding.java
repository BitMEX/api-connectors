package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-07-05T09:41:09.909-05:00")
public class Funding   {
  
  private Date timestamp = null;
  private String symbol = null;
  private Date fundingInterval = null;
  private Double fundingRate = null;
  private Double fundingRateDaily = null;

  /**
   **/
  public Funding timestamp(Date timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  
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
  public Funding symbol(String symbol) {
    this.symbol = symbol;
    return this;
  }

  
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
  public Funding fundingInterval(Date fundingInterval) {
    this.fundingInterval = fundingInterval;
    return this;
  }

  
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
  public Funding fundingRate(Double fundingRate) {
    this.fundingRate = fundingRate;
    return this;
  }

  
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
  public Funding fundingRateDaily(Double fundingRateDaily) {
    this.fundingRateDaily = fundingRateDaily;
    return this;
  }

  
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
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Funding {\n");
    
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    fundingInterval: ").append(toIndentedString(fundingInterval)).append("\n");
    sb.append("    fundingRate: ").append(toIndentedString(fundingRate)).append("\n");
    sb.append("    fundingRateDaily: ").append(toIndentedString(fundingRateDaily)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

