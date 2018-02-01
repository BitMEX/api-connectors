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
import java.math.BigDecimal;
import org.threeten.bp.OffsetDateTime;

import com.google.gson.annotations.SerializedName;


import java.util.Objects;

import io.swagger.annotations.*;



/**
 * Historical Settlement Data
 **/
@ApiModel(description = "Historical Settlement Data")
public class Settlement   {
  
  @SerializedName("timestamp")
  private OffsetDateTime timestamp = null;

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
