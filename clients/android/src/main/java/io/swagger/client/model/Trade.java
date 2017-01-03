package io.swagger.client.model;

import java.math.BigDecimal;
import java.util.Date;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class Trade  {
  
  @SerializedName("timestamp")
  private Date timestamp = null;
  @SerializedName("symbol")
  private String symbol = null;
  @SerializedName("side")
  private String side = null;
  @SerializedName("size")
  private BigDecimal size = null;
  @SerializedName("price")
  private Double price = null;
  @SerializedName("tickDirection")
  private String tickDirection = null;
  @SerializedName("trdMatchID")
  private String trdMatchID = null;
  @SerializedName("grossValue")
  private BigDecimal grossValue = null;
  @SerializedName("homeNotional")
  private Double homeNotional = null;
  @SerializedName("foreignNotional")
  private Double foreignNotional = null;

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

  /**
   **/
  @ApiModelProperty(value = "")
  public String getTickDirection() {
    return tickDirection;
  }
  public void setTickDirection(String tickDirection) {
    this.tickDirection = tickDirection;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getTrdMatchID() {
    return trdMatchID;
  }
  public void setTrdMatchID(String trdMatchID) {
    this.trdMatchID = trdMatchID;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getGrossValue() {
    return grossValue;
  }
  public void setGrossValue(BigDecimal grossValue) {
    this.grossValue = grossValue;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Double getHomeNotional() {
    return homeNotional;
  }
  public void setHomeNotional(Double homeNotional) {
    this.homeNotional = homeNotional;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Double getForeignNotional() {
    return foreignNotional;
  }
  public void setForeignNotional(Double foreignNotional) {
    this.foreignNotional = foreignNotional;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Trade trade = (Trade) o;
    return (timestamp == null ? trade.timestamp == null : timestamp.equals(trade.timestamp)) &&
        (symbol == null ? trade.symbol == null : symbol.equals(trade.symbol)) &&
        (side == null ? trade.side == null : side.equals(trade.side)) &&
        (size == null ? trade.size == null : size.equals(trade.size)) &&
        (price == null ? trade.price == null : price.equals(trade.price)) &&
        (tickDirection == null ? trade.tickDirection == null : tickDirection.equals(trade.tickDirection)) &&
        (trdMatchID == null ? trade.trdMatchID == null : trdMatchID.equals(trade.trdMatchID)) &&
        (grossValue == null ? trade.grossValue == null : grossValue.equals(trade.grossValue)) &&
        (homeNotional == null ? trade.homeNotional == null : homeNotional.equals(trade.homeNotional)) &&
        (foreignNotional == null ? trade.foreignNotional == null : foreignNotional.equals(trade.foreignNotional));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (timestamp == null ? 0: timestamp.hashCode());
    result = 31 * result + (symbol == null ? 0: symbol.hashCode());
    result = 31 * result + (side == null ? 0: side.hashCode());
    result = 31 * result + (size == null ? 0: size.hashCode());
    result = 31 * result + (price == null ? 0: price.hashCode());
    result = 31 * result + (tickDirection == null ? 0: tickDirection.hashCode());
    result = 31 * result + (trdMatchID == null ? 0: trdMatchID.hashCode());
    result = 31 * result + (grossValue == null ? 0: grossValue.hashCode());
    result = 31 * result + (homeNotional == null ? 0: homeNotional.hashCode());
    result = 31 * result + (foreignNotional == null ? 0: foreignNotional.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Trade {\n");
    
    sb.append("  timestamp: ").append(timestamp).append("\n");
    sb.append("  symbol: ").append(symbol).append("\n");
    sb.append("  side: ").append(side).append("\n");
    sb.append("  size: ").append(size).append("\n");
    sb.append("  price: ").append(price).append("\n");
    sb.append("  tickDirection: ").append(tickDirection).append("\n");
    sb.append("  trdMatchID: ").append(trdMatchID).append("\n");
    sb.append("  grossValue: ").append(grossValue).append("\n");
    sb.append("  homeNotional: ").append(homeNotional).append("\n");
    sb.append("  foreignNotional: ").append(foreignNotional).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
