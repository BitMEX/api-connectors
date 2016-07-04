package io.swagger.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringMVCServerCodegen", date = "2016-07-04T18:25:39.823-05:00")
public class Liquidation  {
  
  private String orderID = null;
  private String symbol = null;
  private String side = null;
  private Double price = null;
  private BigDecimal leavesQty = null;

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("orderID")
  public String getOrderID() {
    return orderID;
  }
  public void setOrderID(String orderID) {
    this.orderID = orderID;
  }

  
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
  @JsonProperty("price")
  public Double getPrice() {
    return price;
  }
  public void setPrice(Double price) {
    this.price = price;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("leavesQty")
  public BigDecimal getLeavesQty() {
    return leavesQty;
  }
  public void setLeavesQty(BigDecimal leavesQty) {
    this.leavesQty = leavesQty;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Liquidation liquidation = (Liquidation) o;
    return Objects.equals(orderID, liquidation.orderID) &&
        Objects.equals(symbol, liquidation.symbol) &&
        Objects.equals(side, liquidation.side) &&
        Objects.equals(price, liquidation.price) &&
        Objects.equals(leavesQty, liquidation.leavesQty);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderID, symbol, side, price, leavesQty);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Liquidation {\n");
    
    sb.append("  orderID: ").append(orderID).append("\n");
    sb.append("  symbol: ").append(symbol).append("\n");
    sb.append("  side: ").append(side).append("\n");
    sb.append("  price: ").append(price).append("\n");
    sb.append("  leavesQty: ").append(leavesQty).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
