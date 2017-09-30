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



/**
 * Tradeable Contracts, Indices, and History
 **/
@ApiModel(description = "Tradeable Contracts, Indices, and History")
public class Instrument   {
  
  @SerializedName("symbol")
  private String symbol = null;

  @SerializedName("rootSymbol")
  private String rootSymbol = null;

  @SerializedName("state")
  private String state = null;

  @SerializedName("typ")
  private String typ = null;

  @SerializedName("listing")
  private OffsetDateTime listing = null;

  @SerializedName("front")
  private OffsetDateTime front = null;

  @SerializedName("expiry")
  private OffsetDateTime expiry = null;

  @SerializedName("settle")
  private OffsetDateTime settle = null;

  @SerializedName("relistInterval")
  private OffsetDateTime relistInterval = null;

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
  private OffsetDateTime calcInterval = null;

  @SerializedName("publishInterval")
  private OffsetDateTime publishInterval = null;

  @SerializedName("publishTime")
  private OffsetDateTime publishTime = null;

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
  private OffsetDateTime fundingTimestamp = null;

  @SerializedName("fundingInterval")
  private OffsetDateTime fundingInterval = null;

  @SerializedName("fundingRate")
  private Double fundingRate = null;

  @SerializedName("indicativeFundingRate")
  private Double indicativeFundingRate = null;

  @SerializedName("rebalanceTimestamp")
  private OffsetDateTime rebalanceTimestamp = null;

  @SerializedName("rebalanceInterval")
  private OffsetDateTime rebalanceInterval = null;

  @SerializedName("openingTimestamp")
  private OffsetDateTime openingTimestamp = null;

  @SerializedName("closingTimestamp")
  private OffsetDateTime closingTimestamp = null;

  @SerializedName("sessionInterval")
  private OffsetDateTime sessionInterval = null;

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
  private OffsetDateTime timestamp = null;

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
  public OffsetDateTime getListing() {
    return listing;
  }
  public void setListing(OffsetDateTime listing) {
    this.listing = listing;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getFront() {
    return front;
  }
  public void setFront(OffsetDateTime front) {
    this.front = front;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getExpiry() {
    return expiry;
  }
  public void setExpiry(OffsetDateTime expiry) {
    this.expiry = expiry;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getSettle() {
    return settle;
  }
  public void setSettle(OffsetDateTime settle) {
    this.settle = settle;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getRelistInterval() {
    return relistInterval;
  }
  public void setRelistInterval(OffsetDateTime relistInterval) {
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
  public OffsetDateTime getCalcInterval() {
    return calcInterval;
  }
  public void setCalcInterval(OffsetDateTime calcInterval) {
    this.calcInterval = calcInterval;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getPublishInterval() {
    return publishInterval;
  }
  public void setPublishInterval(OffsetDateTime publishInterval) {
    this.publishInterval = publishInterval;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getPublishTime() {
    return publishTime;
  }
  public void setPublishTime(OffsetDateTime publishTime) {
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
  public Boolean isIsQuanto() {
    return isQuanto;
  }
  public void setIsQuanto(Boolean isQuanto) {
    this.isQuanto = isQuanto;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean isIsInverse() {
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
  public Boolean isCapped() {
    return capped;
  }
  public void setCapped(Boolean capped) {
    this.capped = capped;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean isTaxed() {
    return taxed;
  }
  public void setTaxed(Boolean taxed) {
    this.taxed = taxed;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean isDeleverage() {
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
  public OffsetDateTime getFundingTimestamp() {
    return fundingTimestamp;
  }
  public void setFundingTimestamp(OffsetDateTime fundingTimestamp) {
    this.fundingTimestamp = fundingTimestamp;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getFundingInterval() {
    return fundingInterval;
  }
  public void setFundingInterval(OffsetDateTime fundingInterval) {
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
  public OffsetDateTime getRebalanceTimestamp() {
    return rebalanceTimestamp;
  }
  public void setRebalanceTimestamp(OffsetDateTime rebalanceTimestamp) {
    this.rebalanceTimestamp = rebalanceTimestamp;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getRebalanceInterval() {
    return rebalanceInterval;
  }
  public void setRebalanceInterval(OffsetDateTime rebalanceInterval) {
    this.rebalanceInterval = rebalanceInterval;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getOpeningTimestamp() {
    return openingTimestamp;
  }
  public void setOpeningTimestamp(OffsetDateTime openingTimestamp) {
    this.openingTimestamp = openingTimestamp;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getClosingTimestamp() {
    return closingTimestamp;
  }
  public void setClosingTimestamp(OffsetDateTime closingTimestamp) {
    this.closingTimestamp = closingTimestamp;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getSessionInterval() {
    return sessionInterval;
  }
  public void setSessionInterval(OffsetDateTime sessionInterval) {
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
  public Boolean isHasLiquidity() {
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
  public OffsetDateTime getTimestamp() {
    return timestamp;
  }
  public void setTimestamp(OffsetDateTime timestamp) {
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
        Objects.equals(settle, instrument.settle) &&
        Objects.equals(relistInterval, instrument.relistInterval) &&
        Objects.equals(inverseLeg, instrument.inverseLeg) &&
        Objects.equals(sellLeg, instrument.sellLeg) &&
        Objects.equals(buyLeg, instrument.buyLeg) &&
        Objects.equals(positionCurrency, instrument.positionCurrency) &&
        Objects.equals(underlying, instrument.underlying) &&
        Objects.equals(quoteCurrency, instrument.quoteCurrency) &&
        Objects.equals(underlyingSymbol, instrument.underlyingSymbol) &&
        Objects.equals(reference, instrument.reference) &&
        Objects.equals(referenceSymbol, instrument.referenceSymbol) &&
        Objects.equals(calcInterval, instrument.calcInterval) &&
        Objects.equals(publishInterval, instrument.publishInterval) &&
        Objects.equals(publishTime, instrument.publishTime) &&
        Objects.equals(maxOrderQty, instrument.maxOrderQty) &&
        Objects.equals(maxPrice, instrument.maxPrice) &&
        Objects.equals(lotSize, instrument.lotSize) &&
        Objects.equals(tickSize, instrument.tickSize) &&
        Objects.equals(multiplier, instrument.multiplier) &&
        Objects.equals(settlCurrency, instrument.settlCurrency) &&
        Objects.equals(underlyingToPositionMultiplier, instrument.underlyingToPositionMultiplier) &&
        Objects.equals(underlyingToSettleMultiplier, instrument.underlyingToSettleMultiplier) &&
        Objects.equals(quoteToSettleMultiplier, instrument.quoteToSettleMultiplier) &&
        Objects.equals(isQuanto, instrument.isQuanto) &&
        Objects.equals(isInverse, instrument.isInverse) &&
        Objects.equals(initMargin, instrument.initMargin) &&
        Objects.equals(maintMargin, instrument.maintMargin) &&
        Objects.equals(riskLimit, instrument.riskLimit) &&
        Objects.equals(riskStep, instrument.riskStep) &&
        Objects.equals(limit, instrument.limit) &&
        Objects.equals(capped, instrument.capped) &&
        Objects.equals(taxed, instrument.taxed) &&
        Objects.equals(deleverage, instrument.deleverage) &&
        Objects.equals(makerFee, instrument.makerFee) &&
        Objects.equals(takerFee, instrument.takerFee) &&
        Objects.equals(settlementFee, instrument.settlementFee) &&
        Objects.equals(insuranceFee, instrument.insuranceFee) &&
        Objects.equals(fundingBaseSymbol, instrument.fundingBaseSymbol) &&
        Objects.equals(fundingQuoteSymbol, instrument.fundingQuoteSymbol) &&
        Objects.equals(fundingPremiumSymbol, instrument.fundingPremiumSymbol) &&
        Objects.equals(fundingTimestamp, instrument.fundingTimestamp) &&
        Objects.equals(fundingInterval, instrument.fundingInterval) &&
        Objects.equals(fundingRate, instrument.fundingRate) &&
        Objects.equals(indicativeFundingRate, instrument.indicativeFundingRate) &&
        Objects.equals(rebalanceTimestamp, instrument.rebalanceTimestamp) &&
        Objects.equals(rebalanceInterval, instrument.rebalanceInterval) &&
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
    return Objects.hash(symbol, rootSymbol, state, typ, listing, front, expiry, settle, relistInterval, inverseLeg, sellLeg, buyLeg, positionCurrency, underlying, quoteCurrency, underlyingSymbol, reference, referenceSymbol, calcInterval, publishInterval, publishTime, maxOrderQty, maxPrice, lotSize, tickSize, multiplier, settlCurrency, underlyingToPositionMultiplier, underlyingToSettleMultiplier, quoteToSettleMultiplier, isQuanto, isInverse, initMargin, maintMargin, riskLimit, riskStep, limit, capped, taxed, deleverage, makerFee, takerFee, settlementFee, insuranceFee, fundingBaseSymbol, fundingQuoteSymbol, fundingPremiumSymbol, fundingTimestamp, fundingInterval, fundingRate, indicativeFundingRate, rebalanceTimestamp, rebalanceInterval, openingTimestamp, closingTimestamp, sessionInterval, prevClosePrice, limitDownPrice, limitUpPrice, bankruptLimitDownPrice, bankruptLimitUpPrice, prevTotalVolume, totalVolume, volume, volume24h, prevTotalTurnover, totalTurnover, turnover, turnover24h, prevPrice24h, vwap, highPrice, lowPrice, lastPrice, lastPriceProtected, lastTickDirection, lastChangePcnt, bidPrice, midPrice, askPrice, impactBidPrice, impactMidPrice, impactAskPrice, hasLiquidity, openInterest, openValue, fairMethod, fairBasisRate, fairBasis, fairPrice, markMethod, markPrice, indicativeTaxRate, indicativeSettlePrice, settledPrice, timestamp);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Instrument {\n");
    
    sb.append("    symbol: ").append(StringUtil.toIndentedString(symbol)).append("\n");
    sb.append("    rootSymbol: ").append(StringUtil.toIndentedString(rootSymbol)).append("\n");
    sb.append("    state: ").append(StringUtil.toIndentedString(state)).append("\n");
    sb.append("    typ: ").append(StringUtil.toIndentedString(typ)).append("\n");
    sb.append("    listing: ").append(StringUtil.toIndentedString(listing)).append("\n");
    sb.append("    front: ").append(StringUtil.toIndentedString(front)).append("\n");
    sb.append("    expiry: ").append(StringUtil.toIndentedString(expiry)).append("\n");
    sb.append("    settle: ").append(StringUtil.toIndentedString(settle)).append("\n");
    sb.append("    relistInterval: ").append(StringUtil.toIndentedString(relistInterval)).append("\n");
    sb.append("    inverseLeg: ").append(StringUtil.toIndentedString(inverseLeg)).append("\n");
    sb.append("    sellLeg: ").append(StringUtil.toIndentedString(sellLeg)).append("\n");
    sb.append("    buyLeg: ").append(StringUtil.toIndentedString(buyLeg)).append("\n");
    sb.append("    positionCurrency: ").append(StringUtil.toIndentedString(positionCurrency)).append("\n");
    sb.append("    underlying: ").append(StringUtil.toIndentedString(underlying)).append("\n");
    sb.append("    quoteCurrency: ").append(StringUtil.toIndentedString(quoteCurrency)).append("\n");
    sb.append("    underlyingSymbol: ").append(StringUtil.toIndentedString(underlyingSymbol)).append("\n");
    sb.append("    reference: ").append(StringUtil.toIndentedString(reference)).append("\n");
    sb.append("    referenceSymbol: ").append(StringUtil.toIndentedString(referenceSymbol)).append("\n");
    sb.append("    calcInterval: ").append(StringUtil.toIndentedString(calcInterval)).append("\n");
    sb.append("    publishInterval: ").append(StringUtil.toIndentedString(publishInterval)).append("\n");
    sb.append("    publishTime: ").append(StringUtil.toIndentedString(publishTime)).append("\n");
    sb.append("    maxOrderQty: ").append(StringUtil.toIndentedString(maxOrderQty)).append("\n");
    sb.append("    maxPrice: ").append(StringUtil.toIndentedString(maxPrice)).append("\n");
    sb.append("    lotSize: ").append(StringUtil.toIndentedString(lotSize)).append("\n");
    sb.append("    tickSize: ").append(StringUtil.toIndentedString(tickSize)).append("\n");
    sb.append("    multiplier: ").append(StringUtil.toIndentedString(multiplier)).append("\n");
    sb.append("    settlCurrency: ").append(StringUtil.toIndentedString(settlCurrency)).append("\n");
    sb.append("    underlyingToPositionMultiplier: ").append(StringUtil.toIndentedString(underlyingToPositionMultiplier)).append("\n");
    sb.append("    underlyingToSettleMultiplier: ").append(StringUtil.toIndentedString(underlyingToSettleMultiplier)).append("\n");
    sb.append("    quoteToSettleMultiplier: ").append(StringUtil.toIndentedString(quoteToSettleMultiplier)).append("\n");
    sb.append("    isQuanto: ").append(StringUtil.toIndentedString(isQuanto)).append("\n");
    sb.append("    isInverse: ").append(StringUtil.toIndentedString(isInverse)).append("\n");
    sb.append("    initMargin: ").append(StringUtil.toIndentedString(initMargin)).append("\n");
    sb.append("    maintMargin: ").append(StringUtil.toIndentedString(maintMargin)).append("\n");
    sb.append("    riskLimit: ").append(StringUtil.toIndentedString(riskLimit)).append("\n");
    sb.append("    riskStep: ").append(StringUtil.toIndentedString(riskStep)).append("\n");
    sb.append("    limit: ").append(StringUtil.toIndentedString(limit)).append("\n");
    sb.append("    capped: ").append(StringUtil.toIndentedString(capped)).append("\n");
    sb.append("    taxed: ").append(StringUtil.toIndentedString(taxed)).append("\n");
    sb.append("    deleverage: ").append(StringUtil.toIndentedString(deleverage)).append("\n");
    sb.append("    makerFee: ").append(StringUtil.toIndentedString(makerFee)).append("\n");
    sb.append("    takerFee: ").append(StringUtil.toIndentedString(takerFee)).append("\n");
    sb.append("    settlementFee: ").append(StringUtil.toIndentedString(settlementFee)).append("\n");
    sb.append("    insuranceFee: ").append(StringUtil.toIndentedString(insuranceFee)).append("\n");
    sb.append("    fundingBaseSymbol: ").append(StringUtil.toIndentedString(fundingBaseSymbol)).append("\n");
    sb.append("    fundingQuoteSymbol: ").append(StringUtil.toIndentedString(fundingQuoteSymbol)).append("\n");
    sb.append("    fundingPremiumSymbol: ").append(StringUtil.toIndentedString(fundingPremiumSymbol)).append("\n");
    sb.append("    fundingTimestamp: ").append(StringUtil.toIndentedString(fundingTimestamp)).append("\n");
    sb.append("    fundingInterval: ").append(StringUtil.toIndentedString(fundingInterval)).append("\n");
    sb.append("    fundingRate: ").append(StringUtil.toIndentedString(fundingRate)).append("\n");
    sb.append("    indicativeFundingRate: ").append(StringUtil.toIndentedString(indicativeFundingRate)).append("\n");
    sb.append("    rebalanceTimestamp: ").append(StringUtil.toIndentedString(rebalanceTimestamp)).append("\n");
    sb.append("    rebalanceInterval: ").append(StringUtil.toIndentedString(rebalanceInterval)).append("\n");
    sb.append("    openingTimestamp: ").append(StringUtil.toIndentedString(openingTimestamp)).append("\n");
    sb.append("    closingTimestamp: ").append(StringUtil.toIndentedString(closingTimestamp)).append("\n");
    sb.append("    sessionInterval: ").append(StringUtil.toIndentedString(sessionInterval)).append("\n");
    sb.append("    prevClosePrice: ").append(StringUtil.toIndentedString(prevClosePrice)).append("\n");
    sb.append("    limitDownPrice: ").append(StringUtil.toIndentedString(limitDownPrice)).append("\n");
    sb.append("    limitUpPrice: ").append(StringUtil.toIndentedString(limitUpPrice)).append("\n");
    sb.append("    bankruptLimitDownPrice: ").append(StringUtil.toIndentedString(bankruptLimitDownPrice)).append("\n");
    sb.append("    bankruptLimitUpPrice: ").append(StringUtil.toIndentedString(bankruptLimitUpPrice)).append("\n");
    sb.append("    prevTotalVolume: ").append(StringUtil.toIndentedString(prevTotalVolume)).append("\n");
    sb.append("    totalVolume: ").append(StringUtil.toIndentedString(totalVolume)).append("\n");
    sb.append("    volume: ").append(StringUtil.toIndentedString(volume)).append("\n");
    sb.append("    volume24h: ").append(StringUtil.toIndentedString(volume24h)).append("\n");
    sb.append("    prevTotalTurnover: ").append(StringUtil.toIndentedString(prevTotalTurnover)).append("\n");
    sb.append("    totalTurnover: ").append(StringUtil.toIndentedString(totalTurnover)).append("\n");
    sb.append("    turnover: ").append(StringUtil.toIndentedString(turnover)).append("\n");
    sb.append("    turnover24h: ").append(StringUtil.toIndentedString(turnover24h)).append("\n");
    sb.append("    prevPrice24h: ").append(StringUtil.toIndentedString(prevPrice24h)).append("\n");
    sb.append("    vwap: ").append(StringUtil.toIndentedString(vwap)).append("\n");
    sb.append("    highPrice: ").append(StringUtil.toIndentedString(highPrice)).append("\n");
    sb.append("    lowPrice: ").append(StringUtil.toIndentedString(lowPrice)).append("\n");
    sb.append("    lastPrice: ").append(StringUtil.toIndentedString(lastPrice)).append("\n");
    sb.append("    lastPriceProtected: ").append(StringUtil.toIndentedString(lastPriceProtected)).append("\n");
    sb.append("    lastTickDirection: ").append(StringUtil.toIndentedString(lastTickDirection)).append("\n");
    sb.append("    lastChangePcnt: ").append(StringUtil.toIndentedString(lastChangePcnt)).append("\n");
    sb.append("    bidPrice: ").append(StringUtil.toIndentedString(bidPrice)).append("\n");
    sb.append("    midPrice: ").append(StringUtil.toIndentedString(midPrice)).append("\n");
    sb.append("    askPrice: ").append(StringUtil.toIndentedString(askPrice)).append("\n");
    sb.append("    impactBidPrice: ").append(StringUtil.toIndentedString(impactBidPrice)).append("\n");
    sb.append("    impactMidPrice: ").append(StringUtil.toIndentedString(impactMidPrice)).append("\n");
    sb.append("    impactAskPrice: ").append(StringUtil.toIndentedString(impactAskPrice)).append("\n");
    sb.append("    hasLiquidity: ").append(StringUtil.toIndentedString(hasLiquidity)).append("\n");
    sb.append("    openInterest: ").append(StringUtil.toIndentedString(openInterest)).append("\n");
    sb.append("    openValue: ").append(StringUtil.toIndentedString(openValue)).append("\n");
    sb.append("    fairMethod: ").append(StringUtil.toIndentedString(fairMethod)).append("\n");
    sb.append("    fairBasisRate: ").append(StringUtil.toIndentedString(fairBasisRate)).append("\n");
    sb.append("    fairBasis: ").append(StringUtil.toIndentedString(fairBasis)).append("\n");
    sb.append("    fairPrice: ").append(StringUtil.toIndentedString(fairPrice)).append("\n");
    sb.append("    markMethod: ").append(StringUtil.toIndentedString(markMethod)).append("\n");
    sb.append("    markPrice: ").append(StringUtil.toIndentedString(markPrice)).append("\n");
    sb.append("    indicativeTaxRate: ").append(StringUtil.toIndentedString(indicativeTaxRate)).append("\n");
    sb.append("    indicativeSettlePrice: ").append(StringUtil.toIndentedString(indicativeSettlePrice)).append("\n");
    sb.append("    settledPrice: ").append(StringUtil.toIndentedString(settledPrice)).append("\n");
    sb.append("    timestamp: ").append(StringUtil.toIndentedString(timestamp)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
