package io.swagger.client.model;

import io.swagger.client.StringUtil;
import java.util.Date;
import java.math.BigDecimal;


import java.util.Objects;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.*;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-04T18:25:18.235-05:00")
public class Settlement   {
  
  private Date timestamp = null;
  private String symbol = null;
  private String settlementType = null;
  private Double settledPrice = null;
  private BigDecimal bankrupt = null;
  private BigDecimal taxBase = null;
  private Double taxRate = null;

  
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
  @JsonProperty("settlementType")
  public String getSettlementType() {
    return settlementType;
  }
  public void setSettlementType(String settlementType) {
    this.settlementType = settlementType;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("settledPrice")
  public Double getSettledPrice() {
    return settledPrice;
  }
  public void setSettledPrice(Double settledPrice) {
    this.settledPrice = settledPrice;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("bankrupt")
  public BigDecimal getBankrupt() {
    return bankrupt;
  }
  public void setBankrupt(BigDecimal bankrupt) {
    this.bankrupt = bankrupt;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("taxBase")
  public BigDecimal getTaxBase() {
    return taxBase;
  }
  public void setTaxBase(BigDecimal taxBase) {
    this.taxBase = taxBase;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("taxRate")
  public Double getTaxRate() {
    return taxRate;
  }
  public void setTaxRate(Double taxRate) {
    this.taxRate = taxRate;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Settlement settlement = (Settlement) o;
    return Objects.equals(timestamp, settlement.timestamp) &&
        Objects.equals(symbol, settlement.symbol) &&
        Objects.equals(settlementType, settlement.settlementType) &&
        Objects.equals(settledPrice, settlement.settledPrice) &&
        Objects.equals(bankrupt, settlement.bankrupt) &&
        Objects.equals(taxBase, settlement.taxBase) &&
        Objects.equals(taxRate, settlement.taxRate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timestamp, symbol, settlementType, settledPrice, bankrupt, taxBase, taxRate);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Settlement {\n");
    
    sb.append("    timestamp: ").append(StringUtil.toIndentedString(timestamp)).append("\n");
    sb.append("    symbol: ").append(StringUtil.toIndentedString(symbol)).append("\n");
    sb.append("    settlementType: ").append(StringUtil.toIndentedString(settlementType)).append("\n");
    sb.append("    settledPrice: ").append(StringUtil.toIndentedString(settledPrice)).append("\n");
    sb.append("    bankrupt: ").append(StringUtil.toIndentedString(bankrupt)).append("\n");
    sb.append("    taxBase: ").append(StringUtil.toIndentedString(taxBase)).append("\n");
    sb.append("    taxRate: ").append(StringUtil.toIndentedString(taxRate)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
