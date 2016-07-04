package io.swagger.client.model;

import java.math.BigDecimal;
import java.util.Date;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class StatsHistory  {
  
  @SerializedName("date")
  private Date date = null;
  @SerializedName("rootSymbol")
  private String rootSymbol = null;
  @SerializedName("currency")
  private String currency = null;
  @SerializedName("volume")
  private BigDecimal volume = null;
  @SerializedName("turnover")
  private BigDecimal turnover = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Date getDate() {
    return date;
  }
  public void setDate(Date date) {
    this.date = date;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getRootSymbol() {
    return rootSymbol;
  }
  public void setRootSymbol(String rootSymbol) {
    this.rootSymbol = rootSymbol;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getCurrency() {
    return currency;
  }
  public void setCurrency(String currency) {
    this.currency = currency;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getVolume() {
    return volume;
  }
  public void setVolume(BigDecimal volume) {
    this.volume = volume;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getTurnover() {
    return turnover;
  }
  public void setTurnover(BigDecimal turnover) {
    this.turnover = turnover;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatsHistory statsHistory = (StatsHistory) o;
    return (date == null ? statsHistory.date == null : date.equals(statsHistory.date)) &&
        (rootSymbol == null ? statsHistory.rootSymbol == null : rootSymbol.equals(statsHistory.rootSymbol)) &&
        (currency == null ? statsHistory.currency == null : currency.equals(statsHistory.currency)) &&
        (volume == null ? statsHistory.volume == null : volume.equals(statsHistory.volume)) &&
        (turnover == null ? statsHistory.turnover == null : turnover.equals(statsHistory.turnover));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (date == null ? 0: date.hashCode());
    result = 31 * result + (rootSymbol == null ? 0: rootSymbol.hashCode());
    result = 31 * result + (currency == null ? 0: currency.hashCode());
    result = 31 * result + (volume == null ? 0: volume.hashCode());
    result = 31 * result + (turnover == null ? 0: turnover.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatsHistory {\n");
    
    sb.append("  date: ").append(date).append("\n");
    sb.append("  rootSymbol: ").append(rootSymbol).append("\n");
    sb.append("  currency: ").append(currency).append("\n");
    sb.append("  volume: ").append(volume).append("\n");
    sb.append("  turnover: ").append(turnover).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
