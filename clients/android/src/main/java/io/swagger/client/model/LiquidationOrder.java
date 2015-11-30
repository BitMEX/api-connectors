package io.swagger.client.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class LiquidationOrder  {
  
  @SerializedName("symbol")
  private String symbol = null;
  @SerializedName("side")
  private String side = null;
  @SerializedName("qty")
  private BigDecimal qty = null;
  @SerializedName("price")
  private Double price = null;

  
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
  public BigDecimal getQty() {
    return qty;
  }
  public void setQty(BigDecimal qty) {
    this.qty = qty;
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
