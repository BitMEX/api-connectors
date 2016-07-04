package io.swagger.client.model;

import java.math.BigDecimal;
import java.util.Date;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class Settlement  {
  
  @SerializedName("timestamp")
  private Date timestamp = null;
  @SerializedName("symbol")
  private String symbol = null;
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
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Settlement settlement = (Settlement) o;
    return (timestamp == null ? settlement.timestamp == null : timestamp.equals(settlement.timestamp)) &&
        (symbol == null ? settlement.symbol == null : symbol.equals(settlement.symbol)) &&
        (settlementType == null ? settlement.settlementType == null : settlementType.equals(settlement.settlementType)) &&
        (settledPrice == null ? settlement.settledPrice == null : settledPrice.equals(settlement.settledPrice)) &&
        (bankrupt == null ? settlement.bankrupt == null : bankrupt.equals(settlement.bankrupt)) &&
        (taxBase == null ? settlement.taxBase == null : taxBase.equals(settlement.taxBase)) &&
        (taxRate == null ? settlement.taxRate == null : taxRate.equals(settlement.taxRate));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (timestamp == null ? 0: timestamp.hashCode());
    result = 31 * result + (symbol == null ? 0: symbol.hashCode());
    result = 31 * result + (settlementType == null ? 0: settlementType.hashCode());
    result = 31 * result + (settledPrice == null ? 0: settledPrice.hashCode());
    result = 31 * result + (bankrupt == null ? 0: bankrupt.hashCode());
    result = 31 * result + (taxBase == null ? 0: taxBase.hashCode());
    result = 31 * result + (taxRate == null ? 0: taxRate.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Settlement {\n");
    
    sb.append("  timestamp: ").append(timestamp).append("\n");
    sb.append("  symbol: ").append(symbol).append("\n");
    sb.append("  settlementType: ").append(settlementType).append("\n");
    sb.append("  settledPrice: ").append(settledPrice).append("\n");
    sb.append("  bankrupt: ").append(bankrupt).append("\n");
    sb.append("  taxBase: ").append(taxBase).append("\n");
    sb.append("  taxRate: ").append(taxRate).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
