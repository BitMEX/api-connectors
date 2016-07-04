package io.swagger.client.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class Liquidation  {
  
  @SerializedName("orderID")
  private String orderID = null;
  @SerializedName("symbol")
  private String symbol = null;
  @SerializedName("side")
  private String side = null;
  @SerializedName("price")
  private Double price = null;
  @SerializedName("leavesQty")
  private BigDecimal leavesQty = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getOrderID() {
    return orderID;
  }
  public void setOrderID(String orderID) {
    this.orderID = orderID;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getSymbol() {
    return symbol;
  }
  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getSide() {
    return side;
  }
  public void setSide(String side) {
    this.side = side;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Double getPrice() {
    return price;
  }
  public void setPrice(Double price) {
    this.price = price;
  }

  /**
   **/
  @ApiModelProperty(value = "")
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
    return (orderID == null ? liquidation.orderID == null : orderID.equals(liquidation.orderID)) &&
        (symbol == null ? liquidation.symbol == null : symbol.equals(liquidation.symbol)) &&
        (side == null ? liquidation.side == null : side.equals(liquidation.side)) &&
        (price == null ? liquidation.price == null : price.equals(liquidation.price)) &&
        (leavesQty == null ? liquidation.leavesQty == null : leavesQty.equals(liquidation.leavesQty));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (orderID == null ? 0: orderID.hashCode());
    result = 31 * result + (symbol == null ? 0: symbol.hashCode());
    result = 31 * result + (side == null ? 0: side.hashCode());
    result = 31 * result + (price == null ? 0: price.hashCode());
    result = 31 * result + (leavesQty == null ? 0: leavesQty.hashCode());
    return result;
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
