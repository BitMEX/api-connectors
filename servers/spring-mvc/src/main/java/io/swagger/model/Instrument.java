package io.swagger.model;

import java.util.Date;
import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringMVCServerCodegen", date = "2015-11-30T13:36:04.774-06:00")
public class Instrument  {
  
  private String symbol = null;
  private String rootSymbol = null;
  private String state = null;
  private String typ = null;
  private Date listing = null;
  private Date front = null;
  private Date expiry = null;
  private Date relistInterval = null;
  private String inverseLeg = null;
  private String sellLeg = null;
  private String buyLeg = null;
  private String underlying = null;
  private String quoteCurrency = null;
  private String underlyingSymbol = null;
  private String reference = null;
  private String referenceSymbol = null;
  private Double tickSize = null;
  private BigDecimal multiplier = null;
  private String settlCurrency = null;
  private BigDecimal underlyingToSettleMultiplier = null;
  private BigDecimal quoteToSettleMultiplier = null;
  private Boolean isQuanto = null;
  private Boolean isInverse = null;
  private Double initMargin = null;
  private Double maintMargin = null;
  private Double limit = null;
  private Boolean capped = null;
  private Boolean taxed = null;
  private Double makerFee = null;
  private Double takerFee = null;
  private Double insuranceFee = null;
  private Double hedgerMakerFee = null;
  private Double hedgerTakerFee = null;
  private Double hedgerInsuranceFee = null;
  private Date openingTimestamp = null;
  private Date closingTimestamp = null;
  private Date sessionInterval = null;
  private Double prevClosePrice = null;
  private Double limitDownPrice = null;
  private Double limitUpPrice = null;
  private Double bankruptLimitDownPrice = null;
  private Double bankruptLimitUpPrice = null;
  private BigDecimal prevTotalVolume = null;
  private BigDecimal totalVolume = null;
  private BigDecimal volume = null;
  private BigDecimal volume24h = null;
  private BigDecimal prevTotalTurnover = null;
  private BigDecimal totalTurnover = null;
  private BigDecimal turnover = null;
  private BigDecimal turnover24h = null;
  private Double prevPrice24h = null;
  private Double vwap = null;
  private Double highPrice = null;
  private Double lowPrice = null;
  private Double lastPrice = null;
  private Double lastPriceProtected = null;
  private String lastTickDirection = null;
  private Double lastChangePcnt = null;
  private Double bidPrice = null;
  private Double midPrice = null;
  private Double askPrice = null;
  private Double impactBidPrice = null;
  private Double impactMidPrice = null;
  private Double impactAskPrice = null;
  private Boolean hasLiquidity = null;
  private BigDecimal openInterest = null;
  private BigDecimal openValue = null;
  private String fairMethod = null;
  private Double fairBasisRate = null;
  private Double fairBasis = null;
  private Double fairPrice = null;
  private String markMethod = null;
  private Double markPrice = null;
  private Double indicativeTaxRate = null;
  private Double indicativeSettlePrice = null;
  private Double settledPrice = null;
  private Date timestamp = null;

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
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
  @JsonProperty("rootSymbol")
  public String getRootSymbol() {
    return rootSymbol;
  }
  public void setRootSymbol(String rootSymbol) {
    this.rootSymbol = rootSymbol;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("state")
  public String getState() {
    return state;
  }
  public void setState(String state) {
    this.state = state;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("typ")
  public String getTyp() {
    return typ;
  }
  public void setTyp(String typ) {
    this.typ = typ;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("listing")
  public Date getListing() {
    return listing;
  }
  public void setListing(Date listing) {
    this.listing = listing;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("front")
  public Date getFront() {
    return front;
  }
  public void setFront(Date front) {
    this.front = front;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("expiry")
  public Date getExpiry() {
    return expiry;
  }
  public void setExpiry(Date expiry) {
    this.expiry = expiry;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("relistInterval")
  public Date getRelistInterval() {
    return relistInterval;
  }
  public void setRelistInterval(Date relistInterval) {
    this.relistInterval = relistInterval;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("inverseLeg")
  public String getInverseLeg() {
    return inverseLeg;
  }
  public void setInverseLeg(String inverseLeg) {
    this.inverseLeg = inverseLeg;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("sellLeg")
  public String getSellLeg() {
    return sellLeg;
  }
  public void setSellLeg(String sellLeg) {
    this.sellLeg = sellLeg;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("buyLeg")
  public String getBuyLeg() {
    return buyLeg;
  }
  public void setBuyLeg(String buyLeg) {
    this.buyLeg = buyLeg;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("underlying")
  public String getUnderlying() {
    return underlying;
  }
  public void setUnderlying(String underlying) {
    this.underlying = underlying;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("quoteCurrency")
  public String getQuoteCurrency() {
    return quoteCurrency;
  }
  public void setQuoteCurrency(String quoteCurrency) {
    this.quoteCurrency = quoteCurrency;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("underlyingSymbol")
  public String getUnderlyingSymbol() {
    return underlyingSymbol;
  }
  public void setUnderlyingSymbol(String underlyingSymbol) {
    this.underlyingSymbol = underlyingSymbol;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("reference")
  public String getReference() {
    return reference;
  }
  public void setReference(String reference) {
    this.reference = reference;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("referenceSymbol")
  public String getReferenceSymbol() {
    return referenceSymbol;
  }
  public void setReferenceSymbol(String referenceSymbol) {
    this.referenceSymbol = referenceSymbol;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("tickSize")
  public Double getTickSize() {
    return tickSize;
  }
  public void setTickSize(Double tickSize) {
    this.tickSize = tickSize;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("multiplier")
  public BigDecimal getMultiplier() {
    return multiplier;
  }
  public void setMultiplier(BigDecimal multiplier) {
    this.multiplier = multiplier;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("settlCurrency")
  public String getSettlCurrency() {
    return settlCurrency;
  }
  public void setSettlCurrency(String settlCurrency) {
    this.settlCurrency = settlCurrency;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("underlyingToSettleMultiplier")
  public BigDecimal getUnderlyingToSettleMultiplier() {
    return underlyingToSettleMultiplier;
  }
  public void setUnderlyingToSettleMultiplier(BigDecimal underlyingToSettleMultiplier) {
    this.underlyingToSettleMultiplier = underlyingToSettleMultiplier;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("quoteToSettleMultiplier")
  public BigDecimal getQuoteToSettleMultiplier() {
    return quoteToSettleMultiplier;
  }
  public void setQuoteToSettleMultiplier(BigDecimal quoteToSettleMultiplier) {
    this.quoteToSettleMultiplier = quoteToSettleMultiplier;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("isQuanto")
  public Boolean getIsQuanto() {
    return isQuanto;
  }
  public void setIsQuanto(Boolean isQuanto) {
    this.isQuanto = isQuanto;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("isInverse")
  public Boolean getIsInverse() {
    return isInverse;
  }
  public void setIsInverse(Boolean isInverse) {
    this.isInverse = isInverse;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("initMargin")
  public Double getInitMargin() {
    return initMargin;
  }
  public void setInitMargin(Double initMargin) {
    this.initMargin = initMargin;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("maintMargin")
  public Double getMaintMargin() {
    return maintMargin;
  }
  public void setMaintMargin(Double maintMargin) {
    this.maintMargin = maintMargin;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("limit")
  public Double getLimit() {
    return limit;
  }
  public void setLimit(Double limit) {
    this.limit = limit;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("capped")
  public Boolean getCapped() {
    return capped;
  }
  public void setCapped(Boolean capped) {
    this.capped = capped;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("taxed")
  public Boolean getTaxed() {
    return taxed;
  }
  public void setTaxed(Boolean taxed) {
    this.taxed = taxed;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("makerFee")
  public Double getMakerFee() {
    return makerFee;
  }
  public void setMakerFee(Double makerFee) {
    this.makerFee = makerFee;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("takerFee")
  public Double getTakerFee() {
    return takerFee;
  }
  public void setTakerFee(Double takerFee) {
    this.takerFee = takerFee;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("insuranceFee")
  public Double getInsuranceFee() {
    return insuranceFee;
  }
  public void setInsuranceFee(Double insuranceFee) {
    this.insuranceFee = insuranceFee;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("hedgerMakerFee")
  public Double getHedgerMakerFee() {
    return hedgerMakerFee;
  }
  public void setHedgerMakerFee(Double hedgerMakerFee) {
    this.hedgerMakerFee = hedgerMakerFee;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("hedgerTakerFee")
  public Double getHedgerTakerFee() {
    return hedgerTakerFee;
  }
  public void setHedgerTakerFee(Double hedgerTakerFee) {
    this.hedgerTakerFee = hedgerTakerFee;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("hedgerInsuranceFee")
  public Double getHedgerInsuranceFee() {
    return hedgerInsuranceFee;
  }
  public void setHedgerInsuranceFee(Double hedgerInsuranceFee) {
    this.hedgerInsuranceFee = hedgerInsuranceFee;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("openingTimestamp")
  public Date getOpeningTimestamp() {
    return openingTimestamp;
  }
  public void setOpeningTimestamp(Date openingTimestamp) {
    this.openingTimestamp = openingTimestamp;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("closingTimestamp")
  public Date getClosingTimestamp() {
    return closingTimestamp;
  }
  public void setClosingTimestamp(Date closingTimestamp) {
    this.closingTimestamp = closingTimestamp;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("sessionInterval")
  public Date getSessionInterval() {
    return sessionInterval;
  }
  public void setSessionInterval(Date sessionInterval) {
    this.sessionInterval = sessionInterval;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("prevClosePrice")
  public Double getPrevClosePrice() {
    return prevClosePrice;
  }
  public void setPrevClosePrice(Double prevClosePrice) {
    this.prevClosePrice = prevClosePrice;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("limitDownPrice")
  public Double getLimitDownPrice() {
    return limitDownPrice;
  }
  public void setLimitDownPrice(Double limitDownPrice) {
    this.limitDownPrice = limitDownPrice;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("limitUpPrice")
  public Double getLimitUpPrice() {
    return limitUpPrice;
  }
  public void setLimitUpPrice(Double limitUpPrice) {
    this.limitUpPrice = limitUpPrice;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("bankruptLimitDownPrice")
  public Double getBankruptLimitDownPrice() {
    return bankruptLimitDownPrice;
  }
  public void setBankruptLimitDownPrice(Double bankruptLimitDownPrice) {
    this.bankruptLimitDownPrice = bankruptLimitDownPrice;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("bankruptLimitUpPrice")
  public Double getBankruptLimitUpPrice() {
    return bankruptLimitUpPrice;
  }
  public void setBankruptLimitUpPrice(Double bankruptLimitUpPrice) {
    this.bankruptLimitUpPrice = bankruptLimitUpPrice;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("prevTotalVolume")
  public BigDecimal getPrevTotalVolume() {
    return prevTotalVolume;
  }
  public void setPrevTotalVolume(BigDecimal prevTotalVolume) {
    this.prevTotalVolume = prevTotalVolume;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("totalVolume")
  public BigDecimal getTotalVolume() {
    return totalVolume;
  }
  public void setTotalVolume(BigDecimal totalVolume) {
    this.totalVolume = totalVolume;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("volume")
  public BigDecimal getVolume() {
    return volume;
  }
  public void setVolume(BigDecimal volume) {
    this.volume = volume;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("volume24h")
  public BigDecimal getVolume24h() {
    return volume24h;
  }
  public void setVolume24h(BigDecimal volume24h) {
    this.volume24h = volume24h;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("prevTotalTurnover")
  public BigDecimal getPrevTotalTurnover() {
    return prevTotalTurnover;
  }
  public void setPrevTotalTurnover(BigDecimal prevTotalTurnover) {
    this.prevTotalTurnover = prevTotalTurnover;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("totalTurnover")
  public BigDecimal getTotalTurnover() {
    return totalTurnover;
  }
  public void setTotalTurnover(BigDecimal totalTurnover) {
    this.totalTurnover = totalTurnover;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("turnover")
  public BigDecimal getTurnover() {
    return turnover;
  }
  public void setTurnover(BigDecimal turnover) {
    this.turnover = turnover;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("turnover24h")
  public BigDecimal getTurnover24h() {
    return turnover24h;
  }
  public void setTurnover24h(BigDecimal turnover24h) {
    this.turnover24h = turnover24h;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("prevPrice24h")
  public Double getPrevPrice24h() {
    return prevPrice24h;
  }
  public void setPrevPrice24h(Double prevPrice24h) {
    this.prevPrice24h = prevPrice24h;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("vwap")
  public Double getVwap() {
    return vwap;
  }
  public void setVwap(Double vwap) {
    this.vwap = vwap;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("highPrice")
  public Double getHighPrice() {
    return highPrice;
  }
  public void setHighPrice(Double highPrice) {
    this.highPrice = highPrice;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("lowPrice")
  public Double getLowPrice() {
    return lowPrice;
  }
  public void setLowPrice(Double lowPrice) {
    this.lowPrice = lowPrice;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("lastPrice")
  public Double getLastPrice() {
    return lastPrice;
  }
  public void setLastPrice(Double lastPrice) {
    this.lastPrice = lastPrice;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("lastPriceProtected")
  public Double getLastPriceProtected() {
    return lastPriceProtected;
  }
  public void setLastPriceProtected(Double lastPriceProtected) {
    this.lastPriceProtected = lastPriceProtected;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("lastTickDirection")
  public String getLastTickDirection() {
    return lastTickDirection;
  }
  public void setLastTickDirection(String lastTickDirection) {
    this.lastTickDirection = lastTickDirection;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("lastChangePcnt")
  public Double getLastChangePcnt() {
    return lastChangePcnt;
  }
  public void setLastChangePcnt(Double lastChangePcnt) {
    this.lastChangePcnt = lastChangePcnt;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("bidPrice")
  public Double getBidPrice() {
    return bidPrice;
  }
  public void setBidPrice(Double bidPrice) {
    this.bidPrice = bidPrice;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("midPrice")
  public Double getMidPrice() {
    return midPrice;
  }
  public void setMidPrice(Double midPrice) {
    this.midPrice = midPrice;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("askPrice")
  public Double getAskPrice() {
    return askPrice;
  }
  public void setAskPrice(Double askPrice) {
    this.askPrice = askPrice;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("impactBidPrice")
  public Double getImpactBidPrice() {
    return impactBidPrice;
  }
  public void setImpactBidPrice(Double impactBidPrice) {
    this.impactBidPrice = impactBidPrice;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("impactMidPrice")
  public Double getImpactMidPrice() {
    return impactMidPrice;
  }
  public void setImpactMidPrice(Double impactMidPrice) {
    this.impactMidPrice = impactMidPrice;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("impactAskPrice")
  public Double getImpactAskPrice() {
    return impactAskPrice;
  }
  public void setImpactAskPrice(Double impactAskPrice) {
    this.impactAskPrice = impactAskPrice;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("hasLiquidity")
  public Boolean getHasLiquidity() {
    return hasLiquidity;
  }
  public void setHasLiquidity(Boolean hasLiquidity) {
    this.hasLiquidity = hasLiquidity;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("openInterest")
  public BigDecimal getOpenInterest() {
    return openInterest;
  }
  public void setOpenInterest(BigDecimal openInterest) {
    this.openInterest = openInterest;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("openValue")
  public BigDecimal getOpenValue() {
    return openValue;
  }
  public void setOpenValue(BigDecimal openValue) {
    this.openValue = openValue;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("fairMethod")
  public String getFairMethod() {
    return fairMethod;
  }
  public void setFairMethod(String fairMethod) {
    this.fairMethod = fairMethod;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("fairBasisRate")
  public Double getFairBasisRate() {
    return fairBasisRate;
  }
  public void setFairBasisRate(Double fairBasisRate) {
    this.fairBasisRate = fairBasisRate;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("fairBasis")
  public Double getFairBasis() {
    return fairBasis;
  }
  public void setFairBasis(Double fairBasis) {
    this.fairBasis = fairBasis;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("fairPrice")
  public Double getFairPrice() {
    return fairPrice;
  }
  public void setFairPrice(Double fairPrice) {
    this.fairPrice = fairPrice;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("markMethod")
  public String getMarkMethod() {
    return markMethod;
  }
  public void setMarkMethod(String markMethod) {
    this.markMethod = markMethod;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("markPrice")
  public Double getMarkPrice() {
    return markPrice;
  }
  public void setMarkPrice(Double markPrice) {
    this.markPrice = markPrice;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("indicativeTaxRate")
  public Double getIndicativeTaxRate() {
    return indicativeTaxRate;
  }
  public void setIndicativeTaxRate(Double indicativeTaxRate) {
    this.indicativeTaxRate = indicativeTaxRate;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("indicativeSettlePrice")
  public Double getIndicativeSettlePrice() {
    return indicativeSettlePrice;
  }
  public void setIndicativeSettlePrice(Double indicativeSettlePrice) {
    this.indicativeSettlePrice = indicativeSettlePrice;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("settledPrice")
  public Double getSettledPrice() {
    return settledPrice;
  }
  public void setSettledPrice(Double settledPrice) {
    this.settledPrice = settledPrice;
  }

  
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

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Instrument instrument = (Instrument) o;
    return Objects.equals(symbol, instrument.symbol) &&
        Objects.equals(rootSymbol, instrument.rootSymbol) &&
        Objects.equals(state, instrument.state) &&
        Objects.equals(typ, instrument.typ) &&
        Objects.equals(listing, instrument.listing) &&
        Objects.equals(front, instrument.front) &&
        Objects.equals(expiry, instrument.expiry) &&
        Objects.equals(relistInterval, instrument.relistInterval) &&
        Objects.equals(inverseLeg, instrument.inverseLeg) &&
        Objects.equals(sellLeg, instrument.sellLeg) &&
        Objects.equals(buyLeg, instrument.buyLeg) &&
        Objects.equals(underlying, instrument.underlying) &&
        Objects.equals(quoteCurrency, instrument.quoteCurrency) &&
        Objects.equals(underlyingSymbol, instrument.underlyingSymbol) &&
        Objects.equals(reference, instrument.reference) &&
        Objects.equals(referenceSymbol, instrument.referenceSymbol) &&
        Objects.equals(tickSize, instrument.tickSize) &&
        Objects.equals(multiplier, instrument.multiplier) &&
        Objects.equals(settlCurrency, instrument.settlCurrency) &&
        Objects.equals(underlyingToSettleMultiplier, instrument.underlyingToSettleMultiplier) &&
        Objects.equals(quoteToSettleMultiplier, instrument.quoteToSettleMultiplier) &&
        Objects.equals(isQuanto, instrument.isQuanto) &&
        Objects.equals(isInverse, instrument.isInverse) &&
        Objects.equals(initMargin, instrument.initMargin) &&
        Objects.equals(maintMargin, instrument.maintMargin) &&
        Objects.equals(limit, instrument.limit) &&
        Objects.equals(capped, instrument.capped) &&
        Objects.equals(taxed, instrument.taxed) &&
        Objects.equals(makerFee, instrument.makerFee) &&
        Objects.equals(takerFee, instrument.takerFee) &&
        Objects.equals(insuranceFee, instrument.insuranceFee) &&
        Objects.equals(hedgerMakerFee, instrument.hedgerMakerFee) &&
        Objects.equals(hedgerTakerFee, instrument.hedgerTakerFee) &&
        Objects.equals(hedgerInsuranceFee, instrument.hedgerInsuranceFee) &&
        Objects.equals(openingTimestamp, instrument.openingTimestamp) &&
        Objects.equals(closingTimestamp, instrument.closingTimestamp) &&
        Objects.equals(sessionInterval, instrument.sessionInterval) &&
        Objects.equals(prevClosePrice, instrument.prevClosePrice) &&
        Objects.equals(limitDownPrice, instrument.limitDownPrice) &&
        Objects.equals(limitUpPrice, instrument.limitUpPrice) &&
        Objects.equals(bankruptLimitDownPrice, instrument.bankruptLimitDownPrice) &&
        Objects.equals(bankruptLimitUpPrice, instrument.bankruptLimitUpPrice) &&
        Objects.equals(prevTotalVolume, instrument.prevTotalVolume) &&
        Objects.equals(totalVolume, instrument.totalVolume) &&
        Objects.equals(volume, instrument.volume) &&
        Objects.equals(volume24h, instrument.volume24h) &&
        Objects.equals(prevTotalTurnover, instrument.prevTotalTurnover) &&
        Objects.equals(totalTurnover, instrument.totalTurnover) &&
        Objects.equals(turnover, instrument.turnover) &&
        Objects.equals(turnover24h, instrument.turnover24h) &&
        Objects.equals(prevPrice24h, instrument.prevPrice24h) &&
        Objects.equals(vwap, instrument.vwap) &&
        Objects.equals(highPrice, instrument.highPrice) &&
        Objects.equals(lowPrice, instrument.lowPrice) &&
        Objects.equals(lastPrice, instrument.lastPrice) &&
        Objects.equals(lastPriceProtected, instrument.lastPriceProtected) &&
        Objects.equals(lastTickDirection, instrument.lastTickDirection) &&
        Objects.equals(lastChangePcnt, instrument.lastChangePcnt) &&
        Objects.equals(bidPrice, instrument.bidPrice) &&
        Objects.equals(midPrice, instrument.midPrice) &&
        Objects.equals(askPrice, instrument.askPrice) &&
        Objects.equals(impactBidPrice, instrument.impactBidPrice) &&
        Objects.equals(impactMidPrice, instrument.impactMidPrice) &&
        Objects.equals(impactAskPrice, instrument.impactAskPrice) &&
        Objects.equals(hasLiquidity, instrument.hasLiquidity) &&
        Objects.equals(openInterest, instrument.openInterest) &&
        Objects.equals(openValue, instrument.openValue) &&
        Objects.equals(fairMethod, instrument.fairMethod) &&
        Objects.equals(fairBasisRate, instrument.fairBasisRate) &&
        Objects.equals(fairBasis, instrument.fairBasis) &&
        Objects.equals(fairPrice, instrument.fairPrice) &&
        Objects.equals(markMethod, instrument.markMethod) &&
        Objects.equals(markPrice, instrument.markPrice) &&
        Objects.equals(indicativeTaxRate, instrument.indicativeTaxRate) &&
        Objects.equals(indicativeSettlePrice, instrument.indicativeSettlePrice) &&
        Objects.equals(settledPrice, instrument.settledPrice) &&
        Objects.equals(timestamp, instrument.timestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(symbol, rootSymbol, state, typ, listing, front, expiry, relistInterval, inverseLeg, sellLeg, buyLeg, underlying, quoteCurrency, underlyingSymbol, reference, referenceSymbol, tickSize, multiplier, settlCurrency, underlyingToSettleMultiplier, quoteToSettleMultiplier, isQuanto, isInverse, initMargin, maintMargin, limit, capped, taxed, makerFee, takerFee, insuranceFee, hedgerMakerFee, hedgerTakerFee, hedgerInsuranceFee, openingTimestamp, closingTimestamp, sessionInterval, prevClosePrice, limitDownPrice, limitUpPrice, bankruptLimitDownPrice, bankruptLimitUpPrice, prevTotalVolume, totalVolume, volume, volume24h, prevTotalTurnover, totalTurnover, turnover, turnover24h, prevPrice24h, vwap, highPrice, lowPrice, lastPrice, lastPriceProtected, lastTickDirection, lastChangePcnt, bidPrice, midPrice, askPrice, impactBidPrice, impactMidPrice, impactAskPrice, hasLiquidity, openInterest, openValue, fairMethod, fairBasisRate, fairBasis, fairPrice, markMethod, markPrice, indicativeTaxRate, indicativeSettlePrice, settledPrice, timestamp);
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
