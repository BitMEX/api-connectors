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



@ApiModel(description = "")
public class OrderBookL2   {
  
  @SerializedName("symbol")
  private String symbol = null;

  @SerializedName("id")
  private BigDecimal id = null;

  @SerializedName("side")
  private String side = null;

  @SerializedName("size")
  private BigDecimal size = null;

  @SerializedName("price")
  private Double price = null;

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
  public BigDecimal getId() {
    return id;
  }
  public void setId(BigDecimal id) {
    this.id = id;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getSide() {
    return side;
  }
  public void setSide(String side) {
    this.side = side;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getSize() {
    return size;
  }
  public void setSize(BigDecimal size) {
    this.size = size;
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderBookL2 orderBookL2 = (OrderBookL2) o;
    return Objects.equals(symbol, orderBookL2.symbol) &&
        Objects.equals(id, orderBookL2.id) &&
        Objects.equals(side, orderBookL2.side) &&
        Objects.equals(size, orderBookL2.size) &&
        Objects.equals(price, orderBookL2.price);
  }

  @Override
  public int hashCode() {
    return Objects.hash(symbol, id, side, size, price);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderBookL2 {\n");
    
    sb.append("    symbol: ").append(StringUtil.toIndentedString(symbol)).append("\n");
    sb.append("    id: ").append(StringUtil.toIndentedString(id)).append("\n");
    sb.append("    side: ").append(StringUtil.toIndentedString(side)).append("\n");
    sb.append("    size: ").append(StringUtil.toIndentedString(size)).append("\n");
    sb.append("    price: ").append(StringUtil.toIndentedString(price)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
