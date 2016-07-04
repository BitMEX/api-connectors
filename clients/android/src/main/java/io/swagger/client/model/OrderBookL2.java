package io.swagger.client.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class OrderBookL2  {
  
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
    return (symbol == null ? orderBookL2.symbol == null : symbol.equals(orderBookL2.symbol)) &&
        (id == null ? orderBookL2.id == null : id.equals(orderBookL2.id)) &&
        (side == null ? orderBookL2.side == null : side.equals(orderBookL2.side)) &&
        (size == null ? orderBookL2.size == null : size.equals(orderBookL2.size)) &&
        (price == null ? orderBookL2.price == null : price.equals(orderBookL2.price));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (symbol == null ? 0: symbol.hashCode());
    result = 31 * result + (id == null ? 0: id.hashCode());
    result = 31 * result + (side == null ? 0: side.hashCode());
    result = 31 * result + (size == null ? 0: size.hashCode());
    result = 31 * result + (price == null ? 0: price.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderBookL2 {\n");
    
    sb.append("  symbol: ").append(symbol).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  side: ").append(side).append("\n");
    sb.append("  size: ").append(size).append("\n");
    sb.append("  price: ").append(price).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
