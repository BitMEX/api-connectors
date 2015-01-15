package com.wordnik.client.model;

import java.util.Date;
public class Instrument {
  private String symbol = null;
  private String rootSymbol = null;
  private String state = null;
  private String typ = null;
  private Date listing = null;
  private Date front = null;
  private Date expiry = null;
  private String inverseLeg = null;
  private String sellLeg = null;
  private String buyLeg = null;
  private String underlying = null;
  private String quoteCurrency = null;
  private String underlyingSymbol = null;
  private String reference = null;
  private String referenceSymbol = null;
  private Double tickSize = null;
  private Double multiplier = null;
  private String settlCurrency = null;
  private Double underlyingToSettleMultiplier = null;
  private Double quoteToSettleMultiplier = null;
  private Boolean isQuanto = null;
  private Boolean isInverse = null;
  private Double initMargin = null;
  private Double maintMargin = null;
  private Double limit = null;
  private Double makerFee = null;
  private Double takerFee = null;
  private Double insuranceFee = null;
  private Date openingTimestamp = null;
  private Date closingTimestamp = null;
  private Double prevClosePrice = null;
  private Double limitDownPrice = null;
  private Double limitUpPrice = null;
  private Double prevTotalVolume = null;
  private Double totalVolume = null;
  private Double volume = null;
  private Double prevTotalTurnover = null;
  private Double totalTurnover = null;
  private Double turnover = null;
  private Double vwap = null;
  private Double highPrice = null;
  private Double lowPrice = null;
  private Double lastPrice = null;
  private String lastTickDirection = null;
  private Double lastChangePcnt = null;
  private Double bidPrice = null;
  private Double midPrice = null;
  private Double askPrice = null;
  private Double openInterest = null;
  private Double openValue = null;
  private Double settledPrice = null;
  private Date timestamp = null;
  public String getSymbol() {
    return symbol;
  }
  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }

  public String getRootSymbol() {
    return rootSymbol;
  }
  public void setRootSymbol(String rootSymbol) {
    this.rootSymbol = rootSymbol;
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

  public Date getFront() {
    return front;
  }
  public void setFront(Date front) {
    this.front = front;
  }

  public Date getExpiry() {
    return expiry;
  }
  public void setExpiry(Date expiry) {
    this.expiry = expiry;
  }

  public String getInverseLeg() {
    return inverseLeg;
  }
  public void setInverseLeg(String inverseLeg) {
    this.inverseLeg = inverseLeg;
  }

  public String getSellLeg() {
    return sellLeg;
  }
  public void setSellLeg(String sellLeg) {
    this.sellLeg = sellLeg;
  }

  public String getBuyLeg() {
    return buyLeg;
  }
  public void setBuyLeg(String buyLeg) {
    this.buyLeg = buyLeg;
  }

  public String getUnderlying() {
    return underlying;
  }
  public void setUnderlying(String underlying) {
    this.underlying = underlying;
  }

  public String getQuoteCurrency() {
    return quoteCurrency;
  }
  public void setQuoteCurrency(String quoteCurrency) {
    this.quoteCurrency = quoteCurrency;
  }

  public String getUnderlyingSymbol() {
    return underlyingSymbol;
  }
  public void setUnderlyingSymbol(String underlyingSymbol) {
    this.underlyingSymbol = underlyingSymbol;
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

  public Double getUnderlyingToSettleMultiplier() {
    return underlyingToSettleMultiplier;
  }
  public void setUnderlyingToSettleMultiplier(Double underlyingToSettleMultiplier) {
    this.underlyingToSettleMultiplier = underlyingToSettleMultiplier;
  }

  public Double getQuoteToSettleMultiplier() {
    return quoteToSettleMultiplier;
  }
  public void setQuoteToSettleMultiplier(Double quoteToSettleMultiplier) {
    this.quoteToSettleMultiplier = quoteToSettleMultiplier;
  }

  public Boolean getIsQuanto() {
    return isQuanto;
  }
  public void setIsQuanto(Boolean isQuanto) {
    this.isQuanto = isQuanto;
  }

  public Boolean getIsInverse() {
    return isInverse;
  }
  public void setIsInverse(Boolean isInverse) {
    this.isInverse = isInverse;
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

  public Double getMakerFee() {
    return makerFee;
  }
  public void setMakerFee(Double makerFee) {
    this.makerFee = makerFee;
  }

  public Double getTakerFee() {
    return takerFee;
  }
  public void setTakerFee(Double takerFee) {
    this.takerFee = takerFee;
  }

  public Double getInsuranceFee() {
    return insuranceFee;
  }
  public void setInsuranceFee(Double insuranceFee) {
    this.insuranceFee = insuranceFee;
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

  public Double getPrevTotalVolume() {
    return prevTotalVolume;
  }
  public void setPrevTotalVolume(Double prevTotalVolume) {
    this.prevTotalVolume = prevTotalVolume;
  }

  public Double getTotalVolume() {
    return totalVolume;
  }
  public void setTotalVolume(Double totalVolume) {
    this.totalVolume = totalVolume;
  }

  public Double getVolume() {
    return volume;
  }
  public void setVolume(Double volume) {
    this.volume = volume;
  }

  public Double getPrevTotalTurnover() {
    return prevTotalTurnover;
  }
  public void setPrevTotalTurnover(Double prevTotalTurnover) {
    this.prevTotalTurnover = prevTotalTurnover;
  }

  public Double getTotalTurnover() {
    return totalTurnover;
  }
  public void setTotalTurnover(Double totalTurnover) {
    this.totalTurnover = totalTurnover;
  }

  public Double getTurnover() {
    return turnover;
  }
  public void setTurnover(Double turnover) {
    this.turnover = turnover;
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

  public Double getOpenValue() {
    return openValue;
  }
  public void setOpenValue(Double openValue) {
    this.openValue = openValue;
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
    sb.append("  rootSymbol: ").append(rootSymbol).append("\n");
    sb.append("  state: ").append(state).append("\n");
    sb.append("  typ: ").append(typ).append("\n");
    sb.append("  listing: ").append(listing).append("\n");
    sb.append("  front: ").append(front).append("\n");
    sb.append("  expiry: ").append(expiry).append("\n");
    sb.append("  inverseLeg: ").append(inverseLeg).append("\n");
    sb.append("  sellLeg: ").append(sellLeg).append("\n");
    sb.append("  buyLeg: ").append(buyLeg).append("\n");
    sb.append("  underlying: ").append(underlying).append("\n");
    sb.append("  quoteCurrency: ").append(quoteCurrency).append("\n");
    sb.append("  underlyingSymbol: ").append(underlyingSymbol).append("\n");
    sb.append("  reference: ").append(reference).append("\n");
    sb.append("  referenceSymbol: ").append(referenceSymbol).append("\n");
    sb.append("  tickSize: ").append(tickSize).append("\n");
    sb.append("  multiplier: ").append(multiplier).append("\n");
    sb.append("  settlCurrency: ").append(settlCurrency).append("\n");
    sb.append("  underlyingToSettleMultiplier: ").append(underlyingToSettleMultiplier).append("\n");
    sb.append("  quoteToSettleMultiplier: ").append(quoteToSettleMultiplier).append("\n");
    sb.append("  isQuanto: ").append(isQuanto).append("\n");
    sb.append("  isInverse: ").append(isInverse).append("\n");
    sb.append("  initMargin: ").append(initMargin).append("\n");
    sb.append("  maintMargin: ").append(maintMargin).append("\n");
    sb.append("  limit: ").append(limit).append("\n");
    sb.append("  makerFee: ").append(makerFee).append("\n");
    sb.append("  takerFee: ").append(takerFee).append("\n");
    sb.append("  insuranceFee: ").append(insuranceFee).append("\n");
    sb.append("  openingTimestamp: ").append(openingTimestamp).append("\n");
    sb.append("  closingTimestamp: ").append(closingTimestamp).append("\n");
    sb.append("  prevClosePrice: ").append(prevClosePrice).append("\n");
    sb.append("  limitDownPrice: ").append(limitDownPrice).append("\n");
    sb.append("  limitUpPrice: ").append(limitUpPrice).append("\n");
    sb.append("  prevTotalVolume: ").append(prevTotalVolume).append("\n");
    sb.append("  totalVolume: ").append(totalVolume).append("\n");
    sb.append("  volume: ").append(volume).append("\n");
    sb.append("  prevTotalTurnover: ").append(prevTotalTurnover).append("\n");
    sb.append("  totalTurnover: ").append(totalTurnover).append("\n");
    sb.append("  turnover: ").append(turnover).append("\n");
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
    sb.append("  openValue: ").append(openValue).append("\n");
    sb.append("  settledPrice: ").append(settledPrice).append("\n");
    sb.append("  timestamp: ").append(timestamp).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

