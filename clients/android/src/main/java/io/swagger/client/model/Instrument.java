package io.swagger.client.model;

import java.util.Date;
import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class Instrument  {
  
  @SerializedName("symbol")
  private String symbol = null;
  @SerializedName("rootSymbol")
  private String rootSymbol = null;
  @SerializedName("state")
  private String state = null;
  @SerializedName("typ")
  private String typ = null;
  @SerializedName("listing")
  private Date listing = null;
  @SerializedName("front")
  private Date front = null;
  @SerializedName("expiry")
  private Date expiry = null;
  @SerializedName("relistInterval")
  private Date relistInterval = null;
  @SerializedName("inverseLeg")
  private String inverseLeg = null;
  @SerializedName("sellLeg")
  private String sellLeg = null;
  @SerializedName("buyLeg")
  private String buyLeg = null;
  @SerializedName("underlying")
  private String underlying = null;
  @SerializedName("quoteCurrency")
  private String quoteCurrency = null;
  @SerializedName("underlyingSymbol")
  private String underlyingSymbol = null;
  @SerializedName("reference")
  private String reference = null;
  @SerializedName("referenceSymbol")
  private String referenceSymbol = null;
  @SerializedName("tickSize")
  private Double tickSize = null;
  @SerializedName("multiplier")
  private BigDecimal multiplier = null;
  @SerializedName("settlCurrency")
  private String settlCurrency = null;
  @SerializedName("underlyingToSettleMultiplier")
  private BigDecimal underlyingToSettleMultiplier = null;
  @SerializedName("quoteToSettleMultiplier")
  private BigDecimal quoteToSettleMultiplier = null;
  @SerializedName("isQuanto")
  private Boolean isQuanto = null;
  @SerializedName("isInverse")
  private Boolean isInverse = null;
  @SerializedName("initMargin")
  private Double initMargin = null;
  @SerializedName("maintMargin")
  private Double maintMargin = null;
  @SerializedName("limit")
  private Double limit = null;
  @SerializedName("capped")
  private Boolean capped = null;
  @SerializedName("taxed")
  private Boolean taxed = null;
  @SerializedName("makerFee")
  private Double makerFee = null;
  @SerializedName("takerFee")
  private Double takerFee = null;
  @SerializedName("insuranceFee")
  private Double insuranceFee = null;
  @SerializedName("hedgerMakerFee")
  private Double hedgerMakerFee = null;
  @SerializedName("hedgerTakerFee")
  private Double hedgerTakerFee = null;
  @SerializedName("hedgerInsuranceFee")
  private Double hedgerInsuranceFee = null;
  @SerializedName("openingTimestamp")
  private Date openingTimestamp = null;
  @SerializedName("closingTimestamp")
  private Date closingTimestamp = null;
  @SerializedName("sessionInterval")
  private Date sessionInterval = null;
  @SerializedName("prevClosePrice")
  private Double prevClosePrice = null;
  @SerializedName("limitDownPrice")
  private Double limitDownPrice = null;
  @SerializedName("limitUpPrice")
  private Double limitUpPrice = null;
  @SerializedName("bankruptLimitDownPrice")
  private Double bankruptLimitDownPrice = null;
  @SerializedName("bankruptLimitUpPrice")
  private Double bankruptLimitUpPrice = null;
  @SerializedName("prevTotalVolume")
  private BigDecimal prevTotalVolume = null;
  @SerializedName("totalVolume")
  private BigDecimal totalVolume = null;
  @SerializedName("volume")
  private BigDecimal volume = null;
  @SerializedName("volume24h")
  private BigDecimal volume24h = null;
  @SerializedName("prevTotalTurnover")
  private BigDecimal prevTotalTurnover = null;
  @SerializedName("totalTurnover")
  private BigDecimal totalTurnover = null;
  @SerializedName("turnover")
  private BigDecimal turnover = null;
  @SerializedName("turnover24h")
  private BigDecimal turnover24h = null;
  @SerializedName("prevPrice24h")
  private Double prevPrice24h = null;
  @SerializedName("vwap")
  private Double vwap = null;
  @SerializedName("highPrice")
  private Double highPrice = null;
  @SerializedName("lowPrice")
  private Double lowPrice = null;
  @SerializedName("lastPrice")
  private Double lastPrice = null;
  @SerializedName("lastPriceProtected")
  private Double lastPriceProtected = null;
  @SerializedName("lastTickDirection")
  private String lastTickDirection = null;
  @SerializedName("lastChangePcnt")
  private Double lastChangePcnt = null;
  @SerializedName("bidPrice")
  private Double bidPrice = null;
  @SerializedName("midPrice")
  private Double midPrice = null;
  @SerializedName("askPrice")
  private Double askPrice = null;
  @SerializedName("impactBidPrice")
  private Double impactBidPrice = null;
  @SerializedName("impactMidPrice")
  private Double impactMidPrice = null;
  @SerializedName("impactAskPrice")
  private Double impactAskPrice = null;
  @SerializedName("hasLiquidity")
  private Boolean hasLiquidity = null;
  @SerializedName("openInterest")
  private BigDecimal openInterest = null;
  @SerializedName("openValue")
  private BigDecimal openValue = null;
  @SerializedName("fairMethod")
  private String fairMethod = null;
  @SerializedName("fairBasisRate")
  private Double fairBasisRate = null;
  @SerializedName("fairBasis")
  private Double fairBasis = null;
  @SerializedName("fairPrice")
  private Double fairPrice = null;
  @SerializedName("markMethod")
  private String markMethod = null;
  @SerializedName("markPrice")
  private Double markPrice = null;
  @SerializedName("indicativeTaxRate")
  private Double indicativeTaxRate = null;
  @SerializedName("indicativeSettlePrice")
  private Double indicativeSettlePrice = null;
  @SerializedName("settledPrice")
  private Double settledPrice = null;
  @SerializedName("timestamp")
  private Date timestamp = null;

  
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
  public String getRootSymbol() {
    return rootSymbol;
  }
  public void setRootSymbol(String rootSymbol) {
    this.rootSymbol = rootSymbol;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getState() {
    return state;
  }
  public void setState(String state) {
    this.state = state;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getTyp() {
    return typ;
  }
  public void setTyp(String typ) {
    this.typ = typ;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Date getListing() {
    return listing;
  }
  public void setListing(Date listing) {
    this.listing = listing;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Date getFront() {
    return front;
  }
  public void setFront(Date front) {
    this.front = front;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Date getExpiry() {
    return expiry;
  }
  public void setExpiry(Date expiry) {
    this.expiry = expiry;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Date getRelistInterval() {
    return relistInterval;
  }
  public void setRelistInterval(Date relistInterval) {
    this.relistInterval = relistInterval;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getInverseLeg() {
    return inverseLeg;
  }
  public void setInverseLeg(String inverseLeg) {
    this.inverseLeg = inverseLeg;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getSellLeg() {
    return sellLeg;
  }
  public void setSellLeg(String sellLeg) {
    this.sellLeg = sellLeg;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getBuyLeg() {
    return buyLeg;
  }
  public void setBuyLeg(String buyLeg) {
    this.buyLeg = buyLeg;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getUnderlying() {
    return underlying;
  }
  public void setUnderlying(String underlying) {
    this.underlying = underlying;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getQuoteCurrency() {
    return quoteCurrency;
  }
  public void setQuoteCurrency(String quoteCurrency) {
    this.quoteCurrency = quoteCurrency;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getUnderlyingSymbol() {
    return underlyingSymbol;
  }
  public void setUnderlyingSymbol(String underlyingSymbol) {
    this.underlyingSymbol = underlyingSymbol;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getReference() {
    return reference;
  }
  public void setReference(String reference) {
    this.reference = reference;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getReferenceSymbol() {
    return referenceSymbol;
  }
  public void setReferenceSymbol(String referenceSymbol) {
    this.referenceSymbol = referenceSymbol;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Double getTickSize() {
    return tickSize;
  }
  public void setTickSize(Double tickSize) {
    this.tickSize = tickSize;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getMultiplier() {
    return multiplier;
  }
  public void setMultiplier(BigDecimal multiplier) {
    this.multiplier = multiplier;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getSettlCurrency() {
    return settlCurrency;
  }
  public void setSettlCurrency(String settlCurrency) {
    this.settlCurrency = settlCurrency;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getUnderlyingToSettleMultiplier() {
    return underlyingToSettleMultiplier;
  }
  public void setUnderlyingToSettleMultiplier(BigDecimal underlyingToSettleMultiplier) {
    this.underlyingToSettleMultiplier = underlyingToSettleMultiplier;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getQuoteToSettleMultiplier() {
    return quoteToSettleMultiplier;
  }
  public void setQuoteToSettleMultiplier(BigDecimal quoteToSettleMultiplier) {
    this.quoteToSettleMultiplier = quoteToSettleMultiplier;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getIsQuanto() {
    return isQuanto;
  }
  public void setIsQuanto(Boolean isQuanto) {
    this.isQuanto = isQuanto;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getIsInverse() {
    return isInverse;
  }
  public void setIsInverse(Boolean isInverse) {
    this.isInverse = isInverse;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Double getInitMargin() {
    return initMargin;
  }
  public void setInitMargin(Double initMargin) {
    this.initMargin = initMargin;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Double getMaintMargin() {
    return maintMargin;
  }
  public void setMaintMargin(Double maintMargin) {
    this.maintMargin = maintMargin;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Double getLimit() {
    return limit;
  }
  public void setLimit(Double limit) {
    this.limit = limit;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getCapped() {
    return capped;
  }
  public void setCapped(Boolean capped) {
    this.capped = capped;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getTaxed() {
    return taxed;
  }
  public void setTaxed(Boolean taxed) {
    this.taxed = taxed;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Double getMakerFee() {
    return makerFee;
  }
  public void setMakerFee(Double makerFee) {
    this.makerFee = makerFee;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Double getTakerFee() {
    return takerFee;
  }
  public void setTakerFee(Double takerFee) {
    this.takerFee = takerFee;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Double getInsuranceFee() {
    return insuranceFee;
  }
  public void setInsuranceFee(Double insuranceFee) {
    this.insuranceFee = insuranceFee;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Double getHedgerMakerFee() {
    return hedgerMakerFee;
  }
  public void setHedgerMakerFee(Double hedgerMakerFee) {
    this.hedgerMakerFee = hedgerMakerFee;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Double getHedgerTakerFee() {
    return hedgerTakerFee;
  }
  public void setHedgerTakerFee(Double hedgerTakerFee) {
    this.hedgerTakerFee = hedgerTakerFee;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Double getHedgerInsuranceFee() {
    return hedgerInsuranceFee;
  }
  public void setHedgerInsuranceFee(Double hedgerInsuranceFee) {
    this.hedgerInsuranceFee = hedgerInsuranceFee;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Date getOpeningTimestamp() {
    return openingTimestamp;
  }
  public void setOpeningTimestamp(Date openingTimestamp) {
    this.openingTimestamp = openingTimestamp;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Date getClosingTimestamp() {
    return closingTimestamp;
  }
  public void setClosingTimestamp(Date closingTimestamp) {
    this.closingTimestamp = closingTimestamp;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Date getSessionInterval() {
    return sessionInterval;
  }
  public void setSessionInterval(Date sessionInterval) {
    this.sessionInterval = sessionInterval;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Double getPrevClosePrice() {
    return prevClosePrice;
  }
  public void setPrevClosePrice(Double prevClosePrice) {
    this.prevClosePrice = prevClosePrice;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Double getLimitDownPrice() {
    return limitDownPrice;
  }
  public void setLimitDownPrice(Double limitDownPrice) {
    this.limitDownPrice = limitDownPrice;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Double getLimitUpPrice() {
    return limitUpPrice;
  }
  public void setLimitUpPrice(Double limitUpPrice) {
    this.limitUpPrice = limitUpPrice;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Double getBankruptLimitDownPrice() {
    return bankruptLimitDownPrice;
  }
  public void setBankruptLimitDownPrice(Double bankruptLimitDownPrice) {
    this.bankruptLimitDownPrice = bankruptLimitDownPrice;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Double getBankruptLimitUpPrice() {
    return bankruptLimitUpPrice;
  }
  public void setBankruptLimitUpPrice(Double bankruptLimitUpPrice) {
    this.bankruptLimitUpPrice = bankruptLimitUpPrice;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getPrevTotalVolume() {
    return prevTotalVolume;
  }
  public void setPrevTotalVolume(BigDecimal prevTotalVolume) {
    this.prevTotalVolume = prevTotalVolume;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getTotalVolume() {
    return totalVolume;
  }
  public void setTotalVolume(BigDecimal totalVolume) {
    this.totalVolume = totalVolume;
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
  public BigDecimal getVolume24h() {
    return volume24h;
  }
  public void setVolume24h(BigDecimal volume24h) {
    this.volume24h = volume24h;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getPrevTotalTurnover() {
    return prevTotalTurnover;
  }
  public void setPrevTotalTurnover(BigDecimal prevTotalTurnover) {
    this.prevTotalTurnover = prevTotalTurnover;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getTotalTurnover() {
    return totalTurnover;
  }
  public void setTotalTurnover(BigDecimal totalTurnover) {
    this.totalTurnover = totalTurnover;
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

  
  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getTurnover24h() {
    return turnover24h;
  }
  public void setTurnover24h(BigDecimal turnover24h) {
    this.turnover24h = turnover24h;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Double getPrevPrice24h() {
    return prevPrice24h;
  }
  public void setPrevPrice24h(Double prevPrice24h) {
    this.prevPrice24h = prevPrice24h;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Double getVwap() {
    return vwap;
  }
  public void setVwap(Double vwap) {
    this.vwap = vwap;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Double getHighPrice() {
    return highPrice;
  }
  public void setHighPrice(Double highPrice) {
    this.highPrice = highPrice;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Double getLowPrice() {
    return lowPrice;
  }
  public void setLowPrice(Double lowPrice) {
    this.lowPrice = lowPrice;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Double getLastPrice() {
    return lastPrice;
  }
  public void setLastPrice(Double lastPrice) {
    this.lastPrice = lastPrice;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Double getLastPriceProtected() {
    return lastPriceProtected;
  }
  public void setLastPriceProtected(Double lastPriceProtected) {
    this.lastPriceProtected = lastPriceProtected;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getLastTickDirection() {
    return lastTickDirection;
  }
  public void setLastTickDirection(String lastTickDirection) {
    this.lastTickDirection = lastTickDirection;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Double getLastChangePcnt() {
    return lastChangePcnt;
  }
  public void setLastChangePcnt(Double lastChangePcnt) {
    this.lastChangePcnt = lastChangePcnt;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Double getBidPrice() {
    return bidPrice;
  }
  public void setBidPrice(Double bidPrice) {
    this.bidPrice = bidPrice;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Double getMidPrice() {
    return midPrice;
  }
  public void setMidPrice(Double midPrice) {
    this.midPrice = midPrice;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Double getAskPrice() {
    return askPrice;
  }
  public void setAskPrice(Double askPrice) {
    this.askPrice = askPrice;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Double getImpactBidPrice() {
    return impactBidPrice;
  }
  public void setImpactBidPrice(Double impactBidPrice) {
    this.impactBidPrice = impactBidPrice;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Double getImpactMidPrice() {
    return impactMidPrice;
  }
  public void setImpactMidPrice(Double impactMidPrice) {
    this.impactMidPrice = impactMidPrice;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Double getImpactAskPrice() {
    return impactAskPrice;
  }
  public void setImpactAskPrice(Double impactAskPrice) {
    this.impactAskPrice = impactAskPrice;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getHasLiquidity() {
    return hasLiquidity;
  }
  public void setHasLiquidity(Boolean hasLiquidity) {
    this.hasLiquidity = hasLiquidity;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getOpenInterest() {
    return openInterest;
  }
  public void setOpenInterest(BigDecimal openInterest) {
    this.openInterest = openInterest;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getOpenValue() {
    return openValue;
  }
  public void setOpenValue(BigDecimal openValue) {
    this.openValue = openValue;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getFairMethod() {
    return fairMethod;
  }
  public void setFairMethod(String fairMethod) {
    this.fairMethod = fairMethod;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Double getFairBasisRate() {
    return fairBasisRate;
  }
  public void setFairBasisRate(Double fairBasisRate) {
    this.fairBasisRate = fairBasisRate;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Double getFairBasis() {
    return fairBasis;
  }
  public void setFairBasis(Double fairBasis) {
    this.fairBasis = fairBasis;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Double getFairPrice() {
    return fairPrice;
  }
  public void setFairPrice(Double fairPrice) {
    this.fairPrice = fairPrice;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getMarkMethod() {
    return markMethod;
  }
  public void setMarkMethod(String markMethod) {
    this.markMethod = markMethod;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Double getMarkPrice() {
    return markPrice;
  }
  public void setMarkPrice(Double markPrice) {
    this.markPrice = markPrice;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Double getIndicativeTaxRate() {
    return indicativeTaxRate;
  }
  public void setIndicativeTaxRate(Double indicativeTaxRate) {
    this.indicativeTaxRate = indicativeTaxRate;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Double getIndicativeSettlePrice() {
    return indicativeSettlePrice;
  }
  public void setIndicativeSettlePrice(Double indicativeSettlePrice) {
    this.indicativeSettlePrice = indicativeSettlePrice;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Double getSettledPrice() {
    return settledPrice;
  }
  public void setSettledPrice(Double settledPrice) {
    this.settledPrice = settledPrice;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
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
    sb.append("  relistInterval: ").append(relistInterval).append("\n");
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
    sb.append("  capped: ").append(capped).append("\n");
    sb.append("  taxed: ").append(taxed).append("\n");
    sb.append("  makerFee: ").append(makerFee).append("\n");
    sb.append("  takerFee: ").append(takerFee).append("\n");
    sb.append("  insuranceFee: ").append(insuranceFee).append("\n");
    sb.append("  hedgerMakerFee: ").append(hedgerMakerFee).append("\n");
    sb.append("  hedgerTakerFee: ").append(hedgerTakerFee).append("\n");
    sb.append("  hedgerInsuranceFee: ").append(hedgerInsuranceFee).append("\n");
    sb.append("  openingTimestamp: ").append(openingTimestamp).append("\n");
    sb.append("  closingTimestamp: ").append(closingTimestamp).append("\n");
    sb.append("  sessionInterval: ").append(sessionInterval).append("\n");
    sb.append("  prevClosePrice: ").append(prevClosePrice).append("\n");
    sb.append("  limitDownPrice: ").append(limitDownPrice).append("\n");
    sb.append("  limitUpPrice: ").append(limitUpPrice).append("\n");
    sb.append("  bankruptLimitDownPrice: ").append(bankruptLimitDownPrice).append("\n");
    sb.append("  bankruptLimitUpPrice: ").append(bankruptLimitUpPrice).append("\n");
    sb.append("  prevTotalVolume: ").append(prevTotalVolume).append("\n");
    sb.append("  totalVolume: ").append(totalVolume).append("\n");
    sb.append("  volume: ").append(volume).append("\n");
    sb.append("  volume24h: ").append(volume24h).append("\n");
    sb.append("  prevTotalTurnover: ").append(prevTotalTurnover).append("\n");
    sb.append("  totalTurnover: ").append(totalTurnover).append("\n");
    sb.append("  turnover: ").append(turnover).append("\n");
    sb.append("  turnover24h: ").append(turnover24h).append("\n");
    sb.append("  prevPrice24h: ").append(prevPrice24h).append("\n");
    sb.append("  vwap: ").append(vwap).append("\n");
    sb.append("  highPrice: ").append(highPrice).append("\n");
    sb.append("  lowPrice: ").append(lowPrice).append("\n");
    sb.append("  lastPrice: ").append(lastPrice).append("\n");
    sb.append("  lastPriceProtected: ").append(lastPriceProtected).append("\n");
    sb.append("  lastTickDirection: ").append(lastTickDirection).append("\n");
    sb.append("  lastChangePcnt: ").append(lastChangePcnt).append("\n");
    sb.append("  bidPrice: ").append(bidPrice).append("\n");
    sb.append("  midPrice: ").append(midPrice).append("\n");
    sb.append("  askPrice: ").append(askPrice).append("\n");
    sb.append("  impactBidPrice: ").append(impactBidPrice).append("\n");
    sb.append("  impactMidPrice: ").append(impactMidPrice).append("\n");
    sb.append("  impactAskPrice: ").append(impactAskPrice).append("\n");
    sb.append("  hasLiquidity: ").append(hasLiquidity).append("\n");
    sb.append("  openInterest: ").append(openInterest).append("\n");
    sb.append("  openValue: ").append(openValue).append("\n");
    sb.append("  fairMethod: ").append(fairMethod).append("\n");
    sb.append("  fairBasisRate: ").append(fairBasisRate).append("\n");
    sb.append("  fairBasis: ").append(fairBasis).append("\n");
    sb.append("  fairPrice: ").append(fairPrice).append("\n");
    sb.append("  markMethod: ").append(markMethod).append("\n");
    sb.append("  markPrice: ").append(markPrice).append("\n");
    sb.append("  indicativeTaxRate: ").append(indicativeTaxRate).append("\n");
    sb.append("  indicativeSettlePrice: ").append(indicativeSettlePrice).append("\n");
    sb.append("  settledPrice: ").append(settledPrice).append("\n");
    sb.append("  timestamp: ").append(timestamp).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
