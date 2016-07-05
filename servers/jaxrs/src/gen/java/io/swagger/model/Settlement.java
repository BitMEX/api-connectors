package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.Date;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-07-05T09:41:09.909-05:00")
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
  public Settlement timestamp(Date timestamp) {
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
  public Settlement symbol(String symbol) {
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
  public Settlement settlementType(String settlementType) {
    this.settlementType = settlementType;
    return this;
  }

  
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
  public Settlement settledPrice(Double settledPrice) {
    this.settledPrice = settledPrice;
    return this;
  }

  
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
  public Settlement bankrupt(BigDecimal bankrupt) {
    this.bankrupt = bankrupt;
    return this;
  }

  
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
  public Settlement taxBase(BigDecimal taxBase) {
    this.taxBase = taxBase;
    return this;
  }

  
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
  public Settlement taxRate(Double taxRate) {
    this.taxRate = taxRate;
    return this;
  }

  
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
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Settlement {\n");
    
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    settlementType: ").append(toIndentedString(settlementType)).append("\n");
    sb.append("    settledPrice: ").append(toIndentedString(settledPrice)).append("\n");
    sb.append("    bankrupt: ").append(toIndentedString(bankrupt)).append("\n");
    sb.append("    taxBase: ").append(toIndentedString(taxBase)).append("\n");
    sb.append("    taxRate: ").append(toIndentedString(taxRate)).append("\n");
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

