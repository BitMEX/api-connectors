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
import org.threeten.bp.OffsetDateTime;

import com.google.gson.annotations.SerializedName;


import java.util.Objects;

import io.swagger.annotations.*;



@ApiModel(description = "")
public class StatsHistory   {
  
  @SerializedName("date")
  private OffsetDateTime date = null;

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
  public OffsetDateTime getDate() {
    return date;
  }
  public void setDate(OffsetDateTime date) {
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
    return Objects.equals(date, statsHistory.date) &&
        Objects.equals(rootSymbol, statsHistory.rootSymbol) &&
        Objects.equals(currency, statsHistory.currency) &&
        Objects.equals(volume, statsHistory.volume) &&
        Objects.equals(turnover, statsHistory.turnover);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, rootSymbol, currency, volume, turnover);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatsHistory {\n");
    
    sb.append("    date: ").append(StringUtil.toIndentedString(date)).append("\n");
    sb.append("    rootSymbol: ").append(StringUtil.toIndentedString(rootSymbol)).append("\n");
    sb.append("    currency: ").append(StringUtil.toIndentedString(currency)).append("\n");
    sb.append("    volume: ").append(StringUtil.toIndentedString(volume)).append("\n");
    sb.append("    turnover: ").append(StringUtil.toIndentedString(turnover)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
