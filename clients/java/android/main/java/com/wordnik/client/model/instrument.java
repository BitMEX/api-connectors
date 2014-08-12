package com.wordnik.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;
public class Instrument {
  @JsonProperty("symbol")
  private String symbol = null;
  @JsonProperty("state")
  private String state = null;
  @JsonProperty("typ")
  private String typ = null;
  @JsonProperty("listing")
  private Date listing = null;
  @JsonProperty("expiry")
  private Date expiry = null;
  @JsonProperty("underlying")
  private String underlying = null;
  @JsonProperty("buyLeg")
  private String buyLeg = null;
  @JsonProperty("sellLeg")
  private String sellLeg = null;
  @JsonProperty("quoteCurrency")
  private String quoteCurrency = null;
  @JsonProperty("reference")
  private String reference = null;
  @JsonProperty("referenceSymbol")
  private String referenceSymbol = null;
  @JsonProperty("tickSize")
  private Double tickSize = null;
  @JsonProperty("multiplier")
  private Double multiplier = null;
  @JsonProperty("settlCurrency")
  private String settlCurrency = null;
  @JsonProperty("initMargin")
  private Double initMargin = null;
  @JsonProperty("maintMargin")
  private Double maintMargin = null;
  @JsonProperty("limit")
  private Double limit = null;
  @JsonProperty("openingTimestamp")
  private Date openingTimestamp = null;
  @JsonProperty("closingTimestamp")
  private Date closingTimestamp = null;
  @JsonProperty("prevClosePrice")
  private Double prevClosePrice = null;
  @JsonProperty("limitDownPrice")
  private Double limitDownPrice = null;
  @JsonProperty("limitUpPrice")
  private Double limitUpPrice = null;
  @JsonProperty("volume")
  private Double volume = null;
  @JsonProperty("vwap")
  private Double vwap = null;
  @JsonProperty("highPrice")
  private Double highPrice = null;
  @JsonProperty("lowPrice")
  private Double lowPrice = null;
  @JsonProperty("lastPrice")
  private Double lastPrice = null;
  @JsonProperty("lastTickDirection")
  private String lastTickDirection = null;
  @JsonProperty("lastChangePcnt")
  private Double lastChangePcnt = null;
  @JsonProperty("bidPrice")
  private Double bidPrice = null;
  @JsonProperty("midPrice")
  private Double midPrice = null;
  @JsonProperty("askPrice")
  private Double askPrice = null;
  @JsonProperty("openInterest")
  private Double openInterest = null;
  @JsonProperty("settledPrice")
  private Double settledPrice = null;
  @JsonProperty("timestamp")
  private Date timestamp = null;
  public String getSymbol() {
    return symbol;
  }
  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }

  public String getState() {
    return state;
  }
  public void setState(String state) {
    this.state = state;
  }

  public String getTyp() {
    return typ;
  }
  public void setTyp(String typ) {
    this.typ = typ;
  }

  public Date getListing() {
    return listing;
  }
  public void setListing(Date listing) {
    this.listing = listing;
  }

  public Date getExpiry() {
    return expiry;
  }
  public void setExpiry(Date expiry) {
    this.expiry = expiry;
  }

  public String getUnderlying() {
    return underlying;
  }
  public void setUnderlying(String underlying) {
    this.underlying = underlying;
  }

  public String getBuyLeg() {
    return buyLeg;
  }
  public void setBuyLeg(String buyLeg) {
    this.buyLeg = buyLeg;
  }

  public String getSellLeg() {
    return sellLeg;
  }
  public void setSellLeg(String sellLeg) {
    this.sellLeg = sellLeg;
  }

  public String getQuoteCurrency() {
    return quoteCurrency;
  }
  public void setQuoteCurrency(String quoteCurrency) {
    this.quoteCurrency = quoteCurrency;
  }

  public String getReference() {
    return reference;
  }
  public void setReference(String reference) {
    this.reference = reference;
  }

  public String getReferenceSymbol() {
    return referenceSymbol;
  }
  public void setReferenceSymbol(String referenceSymbol) {
    this.referenceSymbol = referenceSymbol;
  }

  public Double getTickSize() {
    return tickSize;
  }
  public void setTickSize(Double tickSize) {
    this.tickSize = tickSize;
  }

  public Double getMultiplier() {
    return multiplier;
  }
  public void setMultiplier(Double multiplier) {
    this.multiplier = multiplier;
  }

  public String getSettlCurrency() {
    return settlCurrency;
  }
  public void setSettlCurrency(String settlCurrency) {
    this.settlCurrency = settlCurrency;
  }

  public Double getInitMargin() {
    return initMargin;
  }
  public void setInitMargin(Double initMargin) {
    this.initMargin = initMargin;
  }

  public Double getMaintMargin() {
    return maintMargin;
  }
  public void setMaintMargin(Double maintMargin) {
    this.maintMargin = maintMargin;
  }

  public Double getLimit() {
    return limit;
  }
  public void setLimit(Double limit) {
    this.limit = limit;
  }

  public Date getOpeningTimestamp() {
    return openingTimestamp;
  }
  public void setOpeningTimestamp(Date openingTimestamp) {
    this.openingTimestamp = openingTimestamp;
  }

  public Date getClosingTimestamp() {
    return closingTimestamp;
  }
  public void setClosingTimestamp(Date closingTimestamp) {
    this.closingTimestamp = closingTimestamp;
  }

  public Double getPrevClosePrice() {
    return prevClosePrice;
  }
  public void setPrevClosePrice(Double prevClosePrice) {
    this.prevClosePrice = prevClosePrice;
  }

  public Double getLimitDownPrice() {
    return limitDownPrice;
  }
  public void setLimitDownPrice(Double limitDownPrice) {
    this.limitDownPrice = limitDownPrice;
  }

  public Double getLimitUpPrice() {
    return limitUpPrice;
  }
  public void setLimitUpPrice(Double limitUpPrice) {
    this.limitUpPrice = limitUpPrice;
  }

  public Double getVolume() {
    return volume;
  }
  public void setVolume(Double volume) {
    this.volume = volume;
  }

  public Double getVwap() {
    return vwap;
  }
  public void setVwap(Double vwap) {
    this.vwap = vwap;
  }

  public Double getHighPrice() {
    return highPrice;
  }
  public void setHighPrice(Double highPrice) {
    this.highPrice = highPrice;
  }

  public Double getLowPrice() {
    return lowPrice;
  }
  public void setLowPrice(Double lowPrice) {
    this.lowPrice = lowPrice;
  }

  public Double getLastPrice() {
    return lastPrice;
  }
  public void setLastPrice(Double lastPrice) {
    this.lastPrice = lastPrice;
  }

  public String getLastTickDirection() {
    return lastTickDirection;
  }
  public void setLastTickDirection(String lastTickDirection) {
    this.lastTickDirection = lastTickDirection;
  }

  public Double getLastChangePcnt() {
    return lastChangePcnt;
  }
  public void setLastChangePcnt(Double lastChangePcnt) {
    this.lastChangePcnt = lastChangePcnt;
  }

  public Double getBidPrice() {
    return bidPrice;
  }
  public void setBidPrice(Double bidPrice) {
    this.bidPrice = bidPrice;
  }

  public Double getMidPrice() {
    return midPrice;
  }
  public void setMidPrice(Double midPrice) {
    this.midPrice = midPrice;
  }

  public Double getAskPrice() {
    return askPrice;
  }
  public void setAskPrice(Double askPrice) {
    this.askPrice = askPrice;
  }

  public Double getOpenInterest() {
    return openInterest;
  }
  public void setOpenInterest(Double openInterest) {
    this.openInterest = openInterest;
  }

  public Double getSettledPrice() {
    return settledPrice;
  }
  public void setSettledPrice(Double settledPrice) {
    this.settledPrice = settledPrice;
  }

  public Date getTimestamp() {
    return timestamp;
  }
  public void setTimestamp(Date timestamp) {
    this.timestamp = timestamp;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Instrument {\n");
    sb.append("  symbol: ").append(symbol).append("\n");
    sb.append("  state: ").append(state).append("\n");
    sb.append("  typ: ").append(typ).append("\n");
    sb.append("  listing: ").append(listing).append("\n");
    sb.append("  expiry: ").append(expiry).append("\n");
    sb.append("  underlying: ").append(underlying).append("\n");
    sb.append("  buyLeg: ").append(buyLeg).append("\n");
    sb.append("  sellLeg: ").append(sellLeg).append("\n");
    sb.append("  quoteCurrency: ").append(quoteCurrency).append("\n");
    sb.append("  reference: ").append(reference).append("\n");
    sb.append("  referenceSymbol: ").append(referenceSymbol).append("\n");
    sb.append("  tickSize: ").append(tickSize).append("\n");
    sb.append("  multiplier: ").append(multiplier).append("\n");
    sb.append("  settlCurrency: ").append(settlCurrency).append("\n");
    sb.append("  initMargin: ").append(initMargin).append("\n");
    sb.append("  maintMargin: ").append(maintMargin).append("\n");
    sb.append("  limit: ").append(limit).append("\n");
    sb.append("  openingTimestamp: ").append(openingTimestamp).append("\n");
    sb.append("  closingTimestamp: ").append(closingTimestamp).append("\n");
    sb.append("  prevClosePrice: ").append(prevClosePrice).append("\n");
    sb.append("  limitDownPrice: ").append(limitDownPrice).append("\n");
    sb.append("  limitUpPrice: ").append(limitUpPrice).append("\n");
    sb.append("  volume: ").append(volume).append("\n");
    sb.append("  vwap: ").append(vwap).append("\n");
    sb.append("  highPrice: ").append(highPrice).append("\n");
    sb.append("  lowPrice: ").append(lowPrice).append("\n");
    sb.append("  lastPrice: ").append(lastPrice).append("\n");
    sb.append("  lastTickDirection: ").append(lastTickDirection).append("\n");
    sb.append("  lastChangePcnt: ").append(lastChangePcnt).append("\n");
    sb.append("  bidPrice: ").append(bidPrice).append("\n");
    sb.append("  midPrice: ").append(midPrice).append("\n");
    sb.append("  askPrice: ").append(askPrice).append("\n");
    sb.append("  openInterest: ").append(openInterest).append("\n");
    sb.append("  settledPrice: ").append(settledPrice).append("\n");
    sb.append("  timestamp: ").append(timestamp).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

