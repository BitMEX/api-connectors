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

import com.google.gson.annotations.SerializedName;


import java.util.Objects;

import io.swagger.annotations.*;



/**
 * Active Liquidations
 **/
@ApiModel(description = "Active Liquidations")
public class Liquidation   {
  
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
    
    sb.append("    orderID: ").append(StringUtil.toIndentedString(orderID)).append("\n");
    sb.append("    symbol: ").append(StringUtil.toIndentedString(symbol)).append("\n");
    sb.append("    side: ").append(StringUtil.toIndentedString(side)).append("\n");
    sb.append("    price: ").append(StringUtil.toIndentedString(price)).append("\n");
    sb.append("    leavesQty: ").append(StringUtil.toIndentedString(leavesQty)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
