package io.swagger.client.model;

import java.math.BigDecimal;
import java.util.Date;

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
  @SerializedName("settle")
  private Date settle = null;
  @SerializedName("relistInterval")
  private Date relistInterval = null;
  @SerializedName("inverseLeg")
  private String inverseLeg = null;
  @SerializedName("sellLeg")
  private String sellLeg = null;
  @SerializedName("buyLeg")
  private String buyLeg = null;
  @SerializedName("positionCurrency")
  private String positionCurrency = null;
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
  @SerializedName("calcInterval")
  private Date calcInterval = null;
  @SerializedName("publishInterval")
  private Date publishInterval = null;
  @SerializedName("publishTime")
  private Date publishTime = null;
  @SerializedName("maxOrderQty")
  private BigDecimal maxOrderQty = null;
  @SerializedName("maxPrice")
  private Double maxPrice = null;
  @SerializedName("lotSize")
  private BigDecimal lotSize = null;
  @SerializedName("tickSize")
  private Double tickSize = null;
  @SerializedName("multiplier")
  private BigDecimal multiplier = null;
  @SerializedName("settlCurrency")
  private String settlCurrency = null;
  @SerializedName("underlyingToPositionMultiplier")
  private BigDecimal underlyingToPositionMultiplier = null;
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
  @SerializedName("riskLimit")
  private BigDecimal riskLimit = null;
  @SerializedName("riskStep")
  private BigDecimal riskStep = null;
  @SerializedName("limit")
  private Double limit = null;
  @SerializedName("capped")
  private Boolean capped = null;
  @SerializedName("taxed")
  private Boolean taxed = null;
  @SerializedName("deleverage")
  private Boolean deleverage = null;
  @SerializedName("makerFee")
  private Double makerFee = null;
  @SerializedName("takerFee")
  private Double takerFee = null;
  @SerializedName("settlementFee")
  private Double settlementFee = null;
  @SerializedName("insuranceFee")
  private Double insuranceFee = null;
  @SerializedName("fundingBaseSymbol")
  private String fundingBaseSymbol = null;
  @SerializedName("fundingQuoteSymbol")
  private String fundingQuoteSymbol = null;
  @SerializedName("fundingPremiumSymbol")
  private String fundingPremiumSymbol = null;
  @SerializedName("fundingTimestamp")
  private Date fundingTimestamp = null;
  @SerializedName("fundingInterval")
  private Date fundingInterval = null;
  @SerializedName("fundingRate")
  private Double fundingRate = null;
  @SerializedName("indicativeFundingRate")
  private Double indicativeFundingRate = null;
  @SerializedName("rebalanceTimestamp")
  private Date rebalanceTimestamp = null;
  @SerializedName("rebalanceInterval")
  private Date rebalanceInterval = null;
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
  public Date getSettle() {
    return settle;
  }
  public void setSettle(Date settle) {
    this.settle = settle;
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
  public String getPositionCurrency() {
    return positionCurrency;
  }
  public void setPositionCurrency(String positionCurrency) {
    this.positionCurrency = positionCurrency;
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
  public Date getCalcInterval() {
    return calcInterval;
  }
  public void setCalcInterval(Date calcInterval) {
    this.calcInterval = calcInterval;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Date getPublishInterval() {
    return publishInterval;
  }
  public void setPublishInterval(Date publishInterval) {
    this.publishInterval = publishInterval;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Date getPublishTime() {
    return publishTime;
  }
  public void setPublishTime(Date publishTime) {
    this.publishTime = publishTime;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getMaxOrderQty() {
    return maxOrderQty;
  }
  public void setMaxOrderQty(BigDecimal maxOrderQty) {
    this.maxOrderQty = maxOrderQty;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Double getMaxPrice() {
    return maxPrice;
  }
  public void setMaxPrice(Double maxPrice) {
    this.maxPrice = maxPrice;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getLotSize() {
    return lotSize;
  }
  public void setLotSize(BigDecimal lotSize) {
    this.lotSize = lotSize;
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
  public BigDecimal getUnderlyingToPositionMultiplier() {
    return underlyingToPositionMultiplier;
  }
  public void setUnderlyingToPositionMultiplier(BigDecimal underlyingToPositionMultiplier) {
    this.underlyingToPositionMultiplier = underlyingToPositionMultiplier;
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
  public BigDecimal getRiskLimit() {
    return riskLimit;
  }
  public void setRiskLimit(BigDecimal riskLimit) {
    this.riskLimit = riskLimit;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getRiskStep() {
    return riskStep;
  }
  public void setRiskStep(BigDecimal riskStep) {
    this.riskStep = riskStep;
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
  public Boolean getDeleverage() {
    return deleverage;
  }
  public void setDeleverage(Boolean deleverage) {
    this.deleverage = deleverage;
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
  public Double getSettlementFee() {
    return settlementFee;
  }
  public void setSettlementFee(Double settlementFee) {
    this.settlementFee = settlementFee;
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
  public String getFundingBaseSymbol() {
    return fundingBaseSymbol;
  }
  public void setFundingBaseSymbol(String fundingBaseSymbol) {
    this.fundingBaseSymbol = fundingBaseSymbol;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getFundingQuoteSymbol() {
    return fundingQuoteSymbol;
  }
  public void setFundingQuoteSymbol(String fundingQuoteSymbol) {
    this.fundingQuoteSymbol = fundingQuoteSymbol;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getFundingPremiumSymbol() {
    return fundingPremiumSymbol;
  }
  public void setFundingPremiumSymbol(String fundingPremiumSymbol) {
    this.fundingPremiumSymbol = fundingPremiumSymbol;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Date getFundingTimestamp() {
    return fundingTimestamp;
  }
  public void setFundingTimestamp(Date fundingTimestamp) {
    this.fundingTimestamp = fundingTimestamp;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Date getFundingInterval() {
    return fundingInterval;
  }
  public void setFundingInterval(Date fundingInterval) {
    this.fundingInterval = fundingInterval;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Double getFundingRate() {
    return fundingRate;
  }
  public void setFundingRate(Double fundingRate) {
    this.fundingRate = fundingRate;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Double getIndicativeFundingRate() {
    return indicativeFundingRate;
  }
  public void setIndicativeFundingRate(Double indicativeFundingRate) {
    this.indicativeFundingRate = indicativeFundingRate;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Date getRebalanceTimestamp() {
    return rebalanceTimestamp;
  }
  public void setRebalanceTimestamp(Date rebalanceTimestamp) {
    this.rebalanceTimestamp = rebalanceTimestamp;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Date getRebalanceInterval() {
    return rebalanceInterval;
  }
  public void setRebalanceInterval(Date rebalanceInterval) {
    this.rebalanceInterval = rebalanceInterval;
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
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Instrument instrument = (Instrument) o;
    return (symbol == null ? instrument.symbol == null : symbol.equals(instrument.symbol)) &&
        (rootSymbol == null ? instrument.rootSymbol == null : rootSymbol.equals(instrument.rootSymbol)) &&
        (state == null ? instrument.state == null : state.equals(instrument.state)) &&
        (typ == null ? instrument.typ == null : typ.equals(instrument.typ)) &&
        (listing == null ? instrument.listing == null : listing.equals(instrument.listing)) &&
        (front == null ? instrument.front == null : front.equals(instrument.front)) &&
        (expiry == null ? instrument.expiry == null : expiry.equals(instrument.expiry)) &&
        (settle == null ? instrument.settle == null : settle.equals(instrument.settle)) &&
        (relistInterval == null ? instrument.relistInterval == null : relistInterval.equals(instrument.relistInterval)) &&
        (inverseLeg == null ? instrument.inverseLeg == null : inverseLeg.equals(instrument.inverseLeg)) &&
        (sellLeg == null ? instrument.sellLeg == null : sellLeg.equals(instrument.sellLeg)) &&
        (buyLeg == null ? instrument.buyLeg == null : buyLeg.equals(instrument.buyLeg)) &&
        (positionCurrency == null ? instrument.positionCurrency == null : positionCurrency.equals(instrument.positionCurrency)) &&
        (underlying == null ? instrument.underlying == null : underlying.equals(instrument.underlying)) &&
        (quoteCurrency == null ? instrument.quoteCurrency == null : quoteCurrency.equals(instrument.quoteCurrency)) &&
        (underlyingSymbol == null ? instrument.underlyingSymbol == null : underlyingSymbol.equals(instrument.underlyingSymbol)) &&
        (reference == null ? instrument.reference == null : reference.equals(instrument.reference)) &&
        (referenceSymbol == null ? instrument.referenceSymbol == null : referenceSymbol.equals(instrument.referenceSymbol)) &&
        (calcInterval == null ? instrument.calcInterval == null : calcInterval.equals(instrument.calcInterval)) &&
        (publishInterval == null ? instrument.publishInterval == null : publishInterval.equals(instrument.publishInterval)) &&
        (publishTime == null ? instrument.publishTime == null : publishTime.equals(instrument.publishTime)) &&
        (maxOrderQty == null ? instrument.maxOrderQty == null : maxOrderQty.equals(instrument.maxOrderQty)) &&
        (maxPrice == null ? instrument.maxPrice == null : maxPrice.equals(instrument.maxPrice)) &&
        (lotSize == null ? instrument.lotSize == null : lotSize.equals(instrument.lotSize)) &&
        (tickSize == null ? instrument.tickSize == null : tickSize.equals(instrument.tickSize)) &&
        (multiplier == null ? instrument.multiplier == null : multiplier.equals(instrument.multiplier)) &&
        (settlCurrency == null ? instrument.settlCurrency == null : settlCurrency.equals(instrument.settlCurrency)) &&
        (underlyingToPositionMultiplier == null ? instrument.underlyingToPositionMultiplier == null : underlyingToPositionMultiplier.equals(instrument.underlyingToPositionMultiplier)) &&
        (underlyingToSettleMultiplier == null ? instrument.underlyingToSettleMultiplier == null : underlyingToSettleMultiplier.equals(instrument.underlyingToSettleMultiplier)) &&
        (quoteToSettleMultiplier == null ? instrument.quoteToSettleMultiplier == null : quoteToSettleMultiplier.equals(instrument.quoteToSettleMultiplier)) &&
        (isQuanto == null ? instrument.isQuanto == null : isQuanto.equals(instrument.isQuanto)) &&
        (isInverse == null ? instrument.isInverse == null : isInverse.equals(instrument.isInverse)) &&
        (initMargin == null ? instrument.initMargin == null : initMargin.equals(instrument.initMargin)) &&
        (maintMargin == null ? instrument.maintMargin == null : maintMargin.equals(instrument.maintMargin)) &&
        (riskLimit == null ? instrument.riskLimit == null : riskLimit.equals(instrument.riskLimit)) &&
        (riskStep == null ? instrument.riskStep == null : riskStep.equals(instrument.riskStep)) &&
        (limit == null ? instrument.limit == null : limit.equals(instrument.limit)) &&
        (capped == null ? instrument.capped == null : capped.equals(instrument.capped)) &&
        (taxed == null ? instrument.taxed == null : taxed.equals(instrument.taxed)) &&
        (deleverage == null ? instrument.deleverage == null : deleverage.equals(instrument.deleverage)) &&
        (makerFee == null ? instrument.makerFee == null : makerFee.equals(instrument.makerFee)) &&
        (takerFee == null ? instrument.takerFee == null : takerFee.equals(instrument.takerFee)) &&
        (settlementFee == null ? instrument.settlementFee == null : settlementFee.equals(instrument.settlementFee)) &&
        (insuranceFee == null ? instrument.insuranceFee == null : insuranceFee.equals(instrument.insuranceFee)) &&
        (fundingBaseSymbol == null ? instrument.fundingBaseSymbol == null : fundingBaseSymbol.equals(instrument.fundingBaseSymbol)) &&
        (fundingQuoteSymbol == null ? instrument.fundingQuoteSymbol == null : fundingQuoteSymbol.equals(instrument.fundingQuoteSymbol)) &&
        (fundingPremiumSymbol == null ? instrument.fundingPremiumSymbol == null : fundingPremiumSymbol.equals(instrument.fundingPremiumSymbol)) &&
        (fundingTimestamp == null ? instrument.fundingTimestamp == null : fundingTimestamp.equals(instrument.fundingTimestamp)) &&
        (fundingInterval == null ? instrument.fundingInterval == null : fundingInterval.equals(instrument.fundingInterval)) &&
        (fundingRate == null ? instrument.fundingRate == null : fundingRate.equals(instrument.fundingRate)) &&
        (indicativeFundingRate == null ? instrument.indicativeFundingRate == null : indicativeFundingRate.equals(instrument.indicativeFundingRate)) &&
        (rebalanceTimestamp == null ? instrument.rebalanceTimestamp == null : rebalanceTimestamp.equals(instrument.rebalanceTimestamp)) &&
        (rebalanceInterval == null ? instrument.rebalanceInterval == null : rebalanceInterval.equals(instrument.rebalanceInterval)) &&
        (openingTimestamp == null ? instrument.openingTimestamp == null : openingTimestamp.equals(instrument.openingTimestamp)) &&
        (closingTimestamp == null ? instrument.closingTimestamp == null : closingTimestamp.equals(instrument.closingTimestamp)) &&
        (sessionInterval == null ? instrument.sessionInterval == null : sessionInterval.equals(instrument.sessionInterval)) &&
        (prevClosePrice == null ? instrument.prevClosePrice == null : prevClosePrice.equals(instrument.prevClosePrice)) &&
        (limitDownPrice == null ? instrument.limitDownPrice == null : limitDownPrice.equals(instrument.limitDownPrice)) &&
        (limitUpPrice == null ? instrument.limitUpPrice == null : limitUpPrice.equals(instrument.limitUpPrice)) &&
        (bankruptLimitDownPrice == null ? instrument.bankruptLimitDownPrice == null : bankruptLimitDownPrice.equals(instrument.bankruptLimitDownPrice)) &&
        (bankruptLimitUpPrice == null ? instrument.bankruptLimitUpPrice == null : bankruptLimitUpPrice.equals(instrument.bankruptLimitUpPrice)) &&
        (prevTotalVolume == null ? instrument.prevTotalVolume == null : prevTotalVolume.equals(instrument.prevTotalVolume)) &&
        (totalVolume == null ? instrument.totalVolume == null : totalVolume.equals(instrument.totalVolume)) &&
        (volume == null ? instrument.volume == null : volume.equals(instrument.volume)) &&
        (volume24h == null ? instrument.volume24h == null : volume24h.equals(instrument.volume24h)) &&
        (prevTotalTurnover == null ? instrument.prevTotalTurnover == null : prevTotalTurnover.equals(instrument.prevTotalTurnover)) &&
        (totalTurnover == null ? instrument.totalTurnover == null : totalTurnover.equals(instrument.totalTurnover)) &&
        (turnover == null ? instrument.turnover == null : turnover.equals(instrument.turnover)) &&
        (turnover24h == null ? instrument.turnover24h == null : turnover24h.equals(instrument.turnover24h)) &&
        (prevPrice24h == null ? instrument.prevPrice24h == null : prevPrice24h.equals(instrument.prevPrice24h)) &&
        (vwap == null ? instrument.vwap == null : vwap.equals(instrument.vwap)) &&
        (highPrice == null ? instrument.highPrice == null : highPrice.equals(instrument.highPrice)) &&
        (lowPrice == null ? instrument.lowPrice == null : lowPrice.equals(instrument.lowPrice)) &&
        (lastPrice == null ? instrument.lastPrice == null : lastPrice.equals(instrument.lastPrice)) &&
        (lastPriceProtected == null ? instrument.lastPriceProtected == null : lastPriceProtected.equals(instrument.lastPriceProtected)) &&
        (lastTickDirection == null ? instrument.lastTickDirection == null : lastTickDirection.equals(instrument.lastTickDirection)) &&
        (lastChangePcnt == null ? instrument.lastChangePcnt == null : lastChangePcnt.equals(instrument.lastChangePcnt)) &&
        (bidPrice == null ? instrument.bidPrice == null : bidPrice.equals(instrument.bidPrice)) &&
        (midPrice == null ? instrument.midPrice == null : midPrice.equals(instrument.midPrice)) &&
        (askPrice == null ? instrument.askPrice == null : askPrice.equals(instrument.askPrice)) &&
        (impactBidPrice == null ? instrument.impactBidPrice == null : impactBidPrice.equals(instrument.impactBidPrice)) &&
        (impactMidPrice == null ? instrument.impactMidPrice == null : impactMidPrice.equals(instrument.impactMidPrice)) &&
        (impactAskPrice == null ? instrument.impactAskPrice == null : impactAskPrice.equals(instrument.impactAskPrice)) &&
        (hasLiquidity == null ? instrument.hasLiquidity == null : hasLiquidity.equals(instrument.hasLiquidity)) &&
        (openInterest == null ? instrument.openInterest == null : openInterest.equals(instrument.openInterest)) &&
        (openValue == null ? instrument.openValue == null : openValue.equals(instrument.openValue)) &&
        (fairMethod == null ? instrument.fairMethod == null : fairMethod.equals(instrument.fairMethod)) &&
        (fairBasisRate == null ? instrument.fairBasisRate == null : fairBasisRate.equals(instrument.fairBasisRate)) &&
        (fairBasis == null ? instrument.fairBasis == null : fairBasis.equals(instrument.fairBasis)) &&
        (fairPrice == null ? instrument.fairPrice == null : fairPrice.equals(instrument.fairPrice)) &&
        (markMethod == null ? instrument.markMethod == null : markMethod.equals(instrument.markMethod)) &&
        (markPrice == null ? instrument.markPrice == null : markPrice.equals(instrument.markPrice)) &&
        (indicativeTaxRate == null ? instrument.indicativeTaxRate == null : indicativeTaxRate.equals(instrument.indicativeTaxRate)) &&
        (indicativeSettlePrice == null ? instrument.indicativeSettlePrice == null : indicativeSettlePrice.equals(instrument.indicativeSettlePrice)) &&
        (settledPrice == null ? instrument.settledPrice == null : settledPrice.equals(instrument.settledPrice)) &&
        (timestamp == null ? instrument.timestamp == null : timestamp.equals(instrument.timestamp));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (symbol == null ? 0: symbol.hashCode());
    result = 31 * result + (rootSymbol == null ? 0: rootSymbol.hashCode());
    result = 31 * result + (state == null ? 0: state.hashCode());
    result = 31 * result + (typ == null ? 0: typ.hashCode());
    result = 31 * result + (listing == null ? 0: listing.hashCode());
    result = 31 * result + (front == null ? 0: front.hashCode());
    result = 31 * result + (expiry == null ? 0: expiry.hashCode());
    result = 31 * result + (settle == null ? 0: settle.hashCode());
    result = 31 * result + (relistInterval == null ? 0: relistInterval.hashCode());
    result = 31 * result + (inverseLeg == null ? 0: inverseLeg.hashCode());
    result = 31 * result + (sellLeg == null ? 0: sellLeg.hashCode());
    result = 31 * result + (buyLeg == null ? 0: buyLeg.hashCode());
    result = 31 * result + (positionCurrency == null ? 0: positionCurrency.hashCode());
    result = 31 * result + (underlying == null ? 0: underlying.hashCode());
    result = 31 * result + (quoteCurrency == null ? 0: quoteCurrency.hashCode());
    result = 31 * result + (underlyingSymbol == null ? 0: underlyingSymbol.hashCode());
    result = 31 * result + (reference == null ? 0: reference.hashCode());
    result = 31 * result + (referenceSymbol == null ? 0: referenceSymbol.hashCode());
    result = 31 * result + (calcInterval == null ? 0: calcInterval.hashCode());
    result = 31 * result + (publishInterval == null ? 0: publishInterval.hashCode());
    result = 31 * result + (publishTime == null ? 0: publishTime.hashCode());
    result = 31 * result + (maxOrderQty == null ? 0: maxOrderQty.hashCode());
    result = 31 * result + (maxPrice == null ? 0: maxPrice.hashCode());
    result = 31 * result + (lotSize == null ? 0: lotSize.hashCode());
    result = 31 * result + (tickSize == null ? 0: tickSize.hashCode());
    result = 31 * result + (multiplier == null ? 0: multiplier.hashCode());
    result = 31 * result + (settlCurrency == null ? 0: settlCurrency.hashCode());
    result = 31 * result + (underlyingToPositionMultiplier == null ? 0: underlyingToPositionMultiplier.hashCode());
    result = 31 * result + (underlyingToSettleMultiplier == null ? 0: underlyingToSettleMultiplier.hashCode());
    result = 31 * result + (quoteToSettleMultiplier == null ? 0: quoteToSettleMultiplier.hashCode());
    result = 31 * result + (isQuanto == null ? 0: isQuanto.hashCode());
    result = 31 * result + (isInverse == null ? 0: isInverse.hashCode());
    result = 31 * result + (initMargin == null ? 0: initMargin.hashCode());
    result = 31 * result + (maintMargin == null ? 0: maintMargin.hashCode());
    result = 31 * result + (riskLimit == null ? 0: riskLimit.hashCode());
    result = 31 * result + (riskStep == null ? 0: riskStep.hashCode());
    result = 31 * result + (limit == null ? 0: limit.hashCode());
    result = 31 * result + (capped == null ? 0: capped.hashCode());
    result = 31 * result + (taxed == null ? 0: taxed.hashCode());
    result = 31 * result + (deleverage == null ? 0: deleverage.hashCode());
    result = 31 * result + (makerFee == null ? 0: makerFee.hashCode());
    result = 31 * result + (takerFee == null ? 0: takerFee.hashCode());
    result = 31 * result + (settlementFee == null ? 0: settlementFee.hashCode());
    result = 31 * result + (insuranceFee == null ? 0: insuranceFee.hashCode());
    result = 31 * result + (fundingBaseSymbol == null ? 0: fundingBaseSymbol.hashCode());
    result = 31 * result + (fundingQuoteSymbol == null ? 0: fundingQuoteSymbol.hashCode());
    result = 31 * result + (fundingPremiumSymbol == null ? 0: fundingPremiumSymbol.hashCode());
    result = 31 * result + (fundingTimestamp == null ? 0: fundingTimestamp.hashCode());
    result = 31 * result + (fundingInterval == null ? 0: fundingInterval.hashCode());
    result = 31 * result + (fundingRate == null ? 0: fundingRate.hashCode());
    result = 31 * result + (indicativeFundingRate == null ? 0: indicativeFundingRate.hashCode());
    result = 31 * result + (rebalanceTimestamp == null ? 0: rebalanceTimestamp.hashCode());
    result = 31 * result + (rebalanceInterval == null ? 0: rebalanceInterval.hashCode());
    result = 31 * result + (openingTimestamp == null ? 0: openingTimestamp.hashCode());
    result = 31 * result + (closingTimestamp == null ? 0: closingTimestamp.hashCode());
    result = 31 * result + (sessionInterval == null ? 0: sessionInterval.hashCode());
    result = 31 * result + (prevClosePrice == null ? 0: prevClosePrice.hashCode());
    result = 31 * result + (limitDownPrice == null ? 0: limitDownPrice.hashCode());
    result = 31 * result + (limitUpPrice == null ? 0: limitUpPrice.hashCode());
    result = 31 * result + (bankruptLimitDownPrice == null ? 0: bankruptLimitDownPrice.hashCode());
    result = 31 * result + (bankruptLimitUpPrice == null ? 0: bankruptLimitUpPrice.hashCode());
    result = 31 * result + (prevTotalVolume == null ? 0: prevTotalVolume.hashCode());
    result = 31 * result + (totalVolume == null ? 0: totalVolume.hashCode());
    result = 31 * result + (volume == null ? 0: volume.hashCode());
    result = 31 * result + (volume24h == null ? 0: volume24h.hashCode());
    result = 31 * result + (prevTotalTurnover == null ? 0: prevTotalTurnover.hashCode());
    result = 31 * result + (totalTurnover == null ? 0: totalTurnover.hashCode());
    result = 31 * result + (turnover == null ? 0: turnover.hashCode());
    result = 31 * result + (turnover24h == null ? 0: turnover24h.hashCode());
    result = 31 * result + (prevPrice24h == null ? 0: prevPrice24h.hashCode());
    result = 31 * result + (vwap == null ? 0: vwap.hashCode());
    result = 31 * result + (highPrice == null ? 0: highPrice.hashCode());
    result = 31 * result + (lowPrice == null ? 0: lowPrice.hashCode());
    result = 31 * result + (lastPrice == null ? 0: lastPrice.hashCode());
    result = 31 * result + (lastPriceProtected == null ? 0: lastPriceProtected.hashCode());
    result = 31 * result + (lastTickDirection == null ? 0: lastTickDirection.hashCode());
    result = 31 * result + (lastChangePcnt == null ? 0: lastChangePcnt.hashCode());
    result = 31 * result + (bidPrice == null ? 0: bidPrice.hashCode());
    result = 31 * result + (midPrice == null ? 0: midPrice.hashCode());
    result = 31 * result + (askPrice == null ? 0: askPrice.hashCode());
    result = 31 * result + (impactBidPrice == null ? 0: impactBidPrice.hashCode());
    result = 31 * result + (impactMidPrice == null ? 0: impactMidPrice.hashCode());
    result = 31 * result + (impactAskPrice == null ? 0: impactAskPrice.hashCode());
    result = 31 * result + (hasLiquidity == null ? 0: hasLiquidity.hashCode());
    result = 31 * result + (openInterest == null ? 0: openInterest.hashCode());
    result = 31 * result + (openValue == null ? 0: openValue.hashCode());
    result = 31 * result + (fairMethod == null ? 0: fairMethod.hashCode());
    result = 31 * result + (fairBasisRate == null ? 0: fairBasisRate.hashCode());
    result = 31 * result + (fairBasis == null ? 0: fairBasis.hashCode());
    result = 31 * result + (fairPrice == null ? 0: fairPrice.hashCode());
    result = 31 * result + (markMethod == null ? 0: markMethod.hashCode());
    result = 31 * result + (markPrice == null ? 0: markPrice.hashCode());
    result = 31 * result + (indicativeTaxRate == null ? 0: indicativeTaxRate.hashCode());
    result = 31 * result + (indicativeSettlePrice == null ? 0: indicativeSettlePrice.hashCode());
    result = 31 * result + (settledPrice == null ? 0: settledPrice.hashCode());
    result = 31 * result + (timestamp == null ? 0: timestamp.hashCode());
    return result;
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
    sb.append("  settle: ").append(settle).append("\n");
    sb.append("  relistInterval: ").append(relistInterval).append("\n");
    sb.append("  inverseLeg: ").append(inverseLeg).append("\n");
    sb.append("  sellLeg: ").append(sellLeg).append("\n");
    sb.append("  buyLeg: ").append(buyLeg).append("\n");
    sb.append("  positionCurrency: ").append(positionCurrency).append("\n");
    sb.append("  underlying: ").append(underlying).append("\n");
    sb.append("  quoteCurrency: ").append(quoteCurrency).append("\n");
    sb.append("  underlyingSymbol: ").append(underlyingSymbol).append("\n");
    sb.append("  reference: ").append(reference).append("\n");
    sb.append("  referenceSymbol: ").append(referenceSymbol).append("\n");
    sb.append("  calcInterval: ").append(calcInterval).append("\n");
    sb.append("  publishInterval: ").append(publishInterval).append("\n");
    sb.append("  publishTime: ").append(publishTime).append("\n");
    sb.append("  maxOrderQty: ").append(maxOrderQty).append("\n");
    sb.append("  maxPrice: ").append(maxPrice).append("\n");
    sb.append("  lotSize: ").append(lotSize).append("\n");
    sb.append("  tickSize: ").append(tickSize).append("\n");
    sb.append("  multiplier: ").append(multiplier).append("\n");
    sb.append("  settlCurrency: ").append(settlCurrency).append("\n");
    sb.append("  underlyingToPositionMultiplier: ").append(underlyingToPositionMultiplier).append("\n");
    sb.append("  underlyingToSettleMultiplier: ").append(underlyingToSettleMultiplier).append("\n");
    sb.append("  quoteToSettleMultiplier: ").append(quoteToSettleMultiplier).append("\n");
    sb.append("  isQuanto: ").append(isQuanto).append("\n");
    sb.append("  isInverse: ").append(isInverse).append("\n");
    sb.append("  initMargin: ").append(initMargin).append("\n");
    sb.append("  maintMargin: ").append(maintMargin).append("\n");
    sb.append("  riskLimit: ").append(riskLimit).append("\n");
    sb.append("  riskStep: ").append(riskStep).append("\n");
    sb.append("  limit: ").append(limit).append("\n");
    sb.append("  capped: ").append(capped).append("\n");
    sb.append("  taxed: ").append(taxed).append("\n");
    sb.append("  deleverage: ").append(deleverage).append("\n");
    sb.append("  makerFee: ").append(makerFee).append("\n");
    sb.append("  takerFee: ").append(takerFee).append("\n");
    sb.append("  settlementFee: ").append(settlementFee).append("\n");
    sb.append("  insuranceFee: ").append(insuranceFee).append("\n");
    sb.append("  fundingBaseSymbol: ").append(fundingBaseSymbol).append("\n");
    sb.append("  fundingQuoteSymbol: ").append(fundingQuoteSymbol).append("\n");
    sb.append("  fundingPremiumSymbol: ").append(fundingPremiumSymbol).append("\n");
    sb.append("  fundingTimestamp: ").append(fundingTimestamp).append("\n");
    sb.append("  fundingInterval: ").append(fundingInterval).append("\n");
    sb.append("  fundingRate: ").append(fundingRate).append("\n");
    sb.append("  indicativeFundingRate: ").append(indicativeFundingRate).append("\n");
    sb.append("  rebalanceTimestamp: ").append(rebalanceTimestamp).append("\n");
    sb.append("  rebalanceInterval: ").append(rebalanceInterval).append("\n");
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
