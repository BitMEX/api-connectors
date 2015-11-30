package io.swagger.model;

import java.util.Date;
import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringMVCServerCodegen", date = "2015-11-30T13:36:04.774-06:00")
public class Trade  {
  
  private Date timestamp = null;
  private String symbol = null;
  private String side = null;
  private BigDecimal size = null;
  private Double price = null;
  private String tickDirection = null;
  private String trdMatchID = null;
  private BigDecimal grossValue = null;
  private Double homeNotional = null;
  private Double foreignNotional = null;
  private Double id = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("timestamp")
  public Date getTimestamp() {
    return timestamp;
  }
  public void setTimestamp(Date timestamp) {
    this.timestamp = timestamp;
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
  @JsonProperty("size")
  public BigDecimal getSize() {
    return size;
  }
  public void setSize(BigDecimal size) {
    this.size = size;
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
  @JsonProperty("tickDirection")
  public String getTickDirection() {
    return tickDirection;
  }
  public void setTickDirection(String tickDirection) {
    this.tickDirection = tickDirection;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("trdMatchID")
  public String getTrdMatchID() {
    return trdMatchID;
  }
  public void setTrdMatchID(String trdMatchID) {
    this.trdMatchID = trdMatchID;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("grossValue")
  public BigDecimal getGrossValue() {
    return grossValue;
  }
  public void setGrossValue(BigDecimal grossValue) {
    this.grossValue = grossValue;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("homeNotional")
  public Double getHomeNotional() {
    return homeNotional;
  }
  public void setHomeNotional(Double homeNotional) {
    this.homeNotional = homeNotional;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("foreignNotional")
  public Double getForeignNotional() {
    return foreignNotional;
  }
  public void setForeignNotional(Double foreignNotional) {
    this.foreignNotional = foreignNotional;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("id")
  public Double getId() {
    return id;
  }
  public void setId(Double id) {
    this.id = id;
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
    return Objects.equals(timestamp, trade.timestamp) &&
        Objects.equals(symbol, trade.symbol) &&
        Objects.equals(side, trade.side) &&
        Objects.equals(size, trade.size) &&
        Objects.equals(price, trade.price) &&
        Objects.equals(tickDirection, trade.tickDirection) &&
        Objects.equals(trdMatchID, trade.trdMatchID) &&
        Objects.equals(grossValue, trade.grossValue) &&
        Objects.equals(homeNotional, trade.homeNotional) &&
        Objects.equals(foreignNotional, trade.foreignNotional) &&
        Objects.equals(id, trade.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timestamp, symbol, side, size, price, tickDirection, trdMatchID, grossValue, homeNotional, foreignNotional, id);
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
    sb.append("  id: ").append(id).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
