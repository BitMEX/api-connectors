package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.Date;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-07-05T09:41:09.909-05:00")
public class Trade   {
  
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
  public Trade timestamp(Date timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  
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
  public Trade symbol(String symbol) {
    this.symbol = symbol;
    return this;
  }

  
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
  public Trade side(String side) {
    this.side = side;
    return this;
  }

  
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
  public Trade size(BigDecimal size) {
    this.size = size;
    return this;
  }

  
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
  public Trade price(Double price) {
    this.price = price;
    return this;
  }

  
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
  public Trade tickDirection(String tickDirection) {
    this.tickDirection = tickDirection;
    return this;
  }

  
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
  public Trade trdMatchID(String trdMatchID) {
    this.trdMatchID = trdMatchID;
    return this;
  }

  
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
  public Trade grossValue(BigDecimal grossValue) {
    this.grossValue = grossValue;
    return this;
  }

  
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
  public Trade homeNotional(Double homeNotional) {
    this.homeNotional = homeNotional;
    return this;
  }

  
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
  public Trade foreignNotional(Double foreignNotional) {
    this.foreignNotional = foreignNotional;
    return this;
  }

  
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
  public Trade id(Double id) {
    this.id = id;
    return this;
  }

  
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
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Trade {\n");
    
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    side: ").append(toIndentedString(side)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    tickDirection: ").append(toIndentedString(tickDirection)).append("\n");
    sb.append("    trdMatchID: ").append(toIndentedString(trdMatchID)).append("\n");
    sb.append("    grossValue: ").append(toIndentedString(grossValue)).append("\n");
    sb.append("    homeNotional: ").append(toIndentedString(homeNotional)).append("\n");
    sb.append("    foreignNotional: ").append(toIndentedString(foreignNotional)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

