package com.wordnik.client.model;

public class Stats {
  private String rootSymbol = null;
  private String currency = null;
  private Double volume24h = null;
  private Double turnover24h = null;
  private Double openInterest = null;
  private Double openValue = null;
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

  public Double getVolume24h() {
    return volume24h;
  }
  public void setVolume24h(Double volume24h) {
    this.volume24h = volume24h;
  }

  public Double getTurnover24h() {
    return turnover24h;
  }
  public void setTurnover24h(Double turnover24h) {
    this.turnover24h = turnover24h;
  }

  public Double getOpenInterest() {
    return openInterest;
  }
  public void setOpenInterest(Double openInterest) {
    this.openInterest = openInterest;
  }

  public Double getOpenValue() {
    return openValue;
  }
  public void setOpenValue(Double openValue) {
    this.openValue = openValue;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Stats {\n");
    sb.append("  rootSymbol: ").append(rootSymbol).append("\n");
    sb.append("  currency: ").append(currency).append("\n");
    sb.append("  volume24h: ").append(volume24h).append("\n");
    sb.append("  turnover24h: ").append(turnover24h).append("\n");
    sb.append("  openInterest: ").append(openInterest).append("\n");
    sb.append("  openValue: ").append(openValue).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

