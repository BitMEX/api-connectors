package com.wordnik.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;
public class StatsHistory {
  @JsonProperty("date")
  private Date date = null;
  @JsonProperty("rootSymbol")
  private String rootSymbol = null;
  @JsonProperty("currency")
  private String currency = null;
  @JsonProperty("volume")
  private Double volume = null;
  @JsonProperty("turnover")
  private Double turnover = null;
  public Date getDate() {
    return date;
  }
  public void setDate(Date date) {
    this.date = date;
  }

  public String getRootSymbol() {
    return rootSymbol;
  }
  public void setRootSymbol(String rootSymbol) {
    this.rootSymbol = rootSymbol;
  }

  public String getCurrency() {
    return currency;
  }
  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public Double getVolume() {
    return volume;
  }
  public void setVolume(Double volume) {
    this.volume = volume;
  }

  public Double getTurnover() {
    return turnover;
  }
  public void setTurnover(Double turnover) {
    this.turnover = turnover;
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

