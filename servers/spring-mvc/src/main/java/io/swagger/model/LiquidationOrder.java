package io.swagger.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringMVCServerCodegen", date = "2015-11-30T13:36:04.774-06:00")
public class LiquidationOrder  {
  
  private String symbol = null;
  private String side = null;
  private BigDecimal qty = null;
  private Double price = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
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
  @JsonProperty("side")
  public String getSide() {
    return side;
  }
  public void setSide(String side) {
    this.side = side;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("qty")
  public BigDecimal getQty() {
    return qty;
  }
  public void setQty(BigDecimal qty) {
    this.qty = qty;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("price")
  public Double getPrice() {
    return price;
  }
  public void setPrice(Double price) {
    this.price = price;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LiquidationOrder liquidationOrder = (LiquidationOrder) o;
    return Objects.equals(symbol, liquidationOrder.symbol) &&
        Objects.equals(side, liquidationOrder.side) &&
        Objects.equals(qty, liquidationOrder.qty) &&
        Objects.equals(price, liquidationOrder.price);
  }

  @Override
  public int hashCode() {
    return Objects.hash(symbol, side, qty, price);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class LiquidationOrder {\n");
    
    sb.append("  symbol: ").append(symbol).append("\n");
    sb.append("  side: ").append(side).append("\n");
    sb.append("  qty: ").append(qty).append("\n");
    sb.append("  price: ").append(price).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
