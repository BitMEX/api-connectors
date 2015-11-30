package io.swagger.client.model;

import java.util.Date;
import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class Settlement  {
  
  @SerializedName("symbol")
  private String symbol = null;
  @SerializedName("timestamp")
  private Date timestamp = null;
  @SerializedName("settlementType")
  private String settlementType = null;
  @SerializedName("settledPrice")
  private Double settledPrice = null;
  @SerializedName("bankrupt")
  private BigDecimal bankrupt = null;
  @SerializedName("taxBase")
  private BigDecimal taxBase = null;
  @SerializedName("taxRate")
  private Double taxRate = null;

  
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
  @ApiModelProperty(required = true, value = "")
  public Date getTimestamp() {
    return timestamp;
  }
  public void setTimestamp(Date timestamp) {
    this.timestamp = timestamp;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getSettlementType() {
    return settlementType;
  }
  public void setSettlementType(String settlementType) {
    this.settlementType = settlementType;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Double getSettledPrice() {
    return settledPrice;
  }
  public void setSettledPrice(Double settledPrice) {
    this.settledPrice = settledPrice;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getBankrupt() {
    return bankrupt;
  }
  public void setBankrupt(BigDecimal bankrupt) {
    this.bankrupt = bankrupt;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getTaxBase() {
    return taxBase;
  }
  public void setTaxBase(BigDecimal taxBase) {
    this.taxBase = taxBase;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Double getTaxRate() {
    return taxRate;
  }
  public void setTaxRate(Double taxRate) {
    this.taxRate = taxRate;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Settlement {\n");
    
    sb.append("  symbol: ").append(symbol).append("\n");
    sb.append("  timestamp: ").append(timestamp).append("\n");
    sb.append("  settlementType: ").append(settlementType).append("\n");
    sb.append("  settledPrice: ").append(settledPrice).append("\n");
    sb.append("  bankrupt: ").append(bankrupt).append("\n");
    sb.append("  taxBase: ").append(taxBase).append("\n");
    sb.append("  taxRate: ").append(taxRate).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
