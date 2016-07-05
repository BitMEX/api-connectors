package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.joda.time.LocalDate;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-07-05T09:41:19.947-05:00")

public class Instrument   {
  
  private String symbol = null;
  private String rootSymbol = null;
  private String state = null;
  private String typ = null;
  private LocalDate listing = null;
  private LocalDate front = null;
  private LocalDate expiry = null;
  private LocalDate settle = null;
  private LocalDate relistInterval = null;
  private String inverseLeg = null;
  private String sellLeg = null;
  private String buyLeg = null;
  private String positionCurrency = null;
  private String underlying = null;
  private String quoteCurrency = null;
  private String underlyingSymbol = null;
  private String reference = null;
  private String referenceSymbol = null;
  private LocalDate calcInterval = null;
  private LocalDate publishInterval = null;
  private LocalDate publishTime = null;
  private BigDecimal maxOrderQty = null;
  private Double maxPrice = null;
  private BigDecimal lotSize = null;
  private Double tickSize = null;
  private BigDecimal multiplier = null;
  private String settlCurrency = null;
  private BigDecimal underlyingToPositionMultiplier = null;
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
  private Double settlementFee = null;
  private Double insuranceFee = null;
  private String fundingBaseSymbol = null;
  private String fundingQuoteSymbol = null;
  private String fundingPremiumSymbol = null;
  private LocalDate fundingTimestamp = null;
  private LocalDate fundingInterval = null;
  private Double fundingRate = null;
  private Double indicativeFundingRate = null;
  private LocalDate rebalanceTimestamp = null;
  private LocalDate rebalanceInterval = null;
  private LocalDate openingTimestamp = null;
  private LocalDate closingTimestamp = null;
  private LocalDate sessionInterval = null;
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
  private LocalDate timestamp = null;

  /**
   **/
  public Instrument symbol(String symbol) {
    this.symbol = symbol;
    return this;
  }

  
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
  public Instrument rootSymbol(String rootSymbol) {
    this.rootSymbol = rootSymbol;
    return this;
  }

  
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
  public Instrument state(String state) {
    this.state = state;
    return this;
  }

  
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
  public Instrument typ(String typ) {
    this.typ = typ;
    return this;
  }

  
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
  public Instrument listing(LocalDate listing) {
    this.listing = listing;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("listing")
  public LocalDate getListing() {
    return listing;
  }
  public void setListing(LocalDate listing) {
    this.listing = listing;
  }

  /**
   **/
  public Instrument front(LocalDate front) {
    this.front = front;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("front")
  public LocalDate getFront() {
    return front;
  }
  public void setFront(LocalDate front) {
    this.front = front;
  }

  /**
   **/
  public Instrument expiry(LocalDate expiry) {
    this.expiry = expiry;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("expiry")
  public LocalDate getExpiry() {
    return expiry;
  }
  public void setExpiry(LocalDate expiry) {
    this.expiry = expiry;
  }

  /**
   **/
  public Instrument settle(LocalDate settle) {
    this.settle = settle;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("settle")
  public LocalDate getSettle() {
    return settle;
  }
  public void setSettle(LocalDate settle) {
    this.settle = settle;
  }

  /**
   **/
  public Instrument relistInterval(LocalDate relistInterval) {
    this.relistInterval = relistInterval;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("relistInterval")
  public LocalDate getRelistInterval() {
    return relistInterval;
  }
  public void setRelistInterval(LocalDate relistInterval) {
    this.relistInterval = relistInterval;
  }

  /**
   **/
  public Instrument inverseLeg(String inverseLeg) {
    this.inverseLeg = inverseLeg;
    return this;
  }

  
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
  public Instrument sellLeg(String sellLeg) {
    this.sellLeg = sellLeg;
    return this;
  }

  
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
  public Instrument buyLeg(String buyLeg) {
    this.buyLeg = buyLeg;
    return this;
  }

  
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
  public Instrument positionCurrency(String positionCurrency) {
    this.positionCurrency = positionCurrency;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("positionCurrency")
  public String getPositionCurrency() {
    return positionCurrency;
  }
  public void setPositionCurrency(String positionCurrency) {
    this.positionCurrency = positionCurrency;
  }

  /**
   **/
  public Instrument underlying(String underlying) {
    this.underlying = underlying;
    return this;
  }

  
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
  public Instrument quoteCurrency(String quoteCurrency) {
    this.quoteCurrency = quoteCurrency;
    return this;
  }

  
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
  public Instrument underlyingSymbol(String underlyingSymbol) {
    this.underlyingSymbol = underlyingSymbol;
    return this;
  }

  
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
  public Instrument reference(String reference) {
    this.reference = reference;
    return this;
  }

  
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
  public Instrument referenceSymbol(String referenceSymbol) {
    this.referenceSymbol = referenceSymbol;
    return this;
  }

  
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
  public Instrument calcInterval(LocalDate calcInterval) {
    this.calcInterval = calcInterval;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("calcInterval")
  public LocalDate getCalcInterval() {
    return calcInterval;
  }
  public void setCalcInterval(LocalDate calcInterval) {
    this.calcInterval = calcInterval;
  }

  /**
   **/
  public Instrument publishInterval(LocalDate publishInterval) {
    this.publishInterval = publishInterval;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("publishInterval")
  public LocalDate getPublishInterval() {
    return publishInterval;
  }
  public void setPublishInterval(LocalDate publishInterval) {
    this.publishInterval = publishInterval;
  }

  /**
   **/
  public Instrument publishTime(LocalDate publishTime) {
    this.publishTime = publishTime;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("publishTime")
  public LocalDate getPublishTime() {
    return publishTime;
  }
  public void setPublishTime(LocalDate publishTime) {
    this.publishTime = publishTime;
  }

  /**
   **/
  public Instrument maxOrderQty(BigDecimal maxOrderQty) {
    this.maxOrderQty = maxOrderQty;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("maxOrderQty")
  public BigDecimal getMaxOrderQty() {
    return maxOrderQty;
  }
  public void setMaxOrderQty(BigDecimal maxOrderQty) {
    this.maxOrderQty = maxOrderQty;
  }

  /**
   **/
  public Instrument maxPrice(Double maxPrice) {
    this.maxPrice = maxPrice;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("maxPrice")
  public Double getMaxPrice() {
    return maxPrice;
  }
  public void setMaxPrice(Double maxPrice) {
    this.maxPrice = maxPrice;
  }

  /**
   **/
  public Instrument lotSize(BigDecimal lotSize) {
    this.lotSize = lotSize;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("lotSize")
  public BigDecimal getLotSize() {
    return lotSize;
  }
  public void setLotSize(BigDecimal lotSize) {
    this.lotSize = lotSize;
  }

  /**
   **/
  public Instrument tickSize(Double tickSize) {
    this.tickSize = tickSize;
    return this;
  }

  
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
  public Instrument multiplier(BigDecimal multiplier) {
    this.multiplier = multiplier;
    return this;
  }

  
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
  public Instrument settlCurrency(String settlCurrency) {
    this.settlCurrency = settlCurrency;
    return this;
  }

  
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
  public Instrument underlyingToPositionMultiplier(BigDecimal underlyingToPositionMultiplier) {
    this.underlyingToPositionMultiplier = underlyingToPositionMultiplier;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("underlyingToPositionMultiplier")
  public BigDecimal getUnderlyingToPositionMultiplier() {
    return underlyingToPositionMultiplier;
  }
  public void setUnderlyingToPositionMultiplier(BigDecimal underlyingToPositionMultiplier) {
    this.underlyingToPositionMultiplier = underlyingToPositionMultiplier;
  }

  /**
   **/
  public Instrument underlyingToSettleMultiplier(BigDecimal underlyingToSettleMultiplier) {
    this.underlyingToSettleMultiplier = underlyingToSettleMultiplier;
    return this;
  }

  
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
  public Instrument quoteToSettleMultiplier(BigDecimal quoteToSettleMultiplier) {
    this.quoteToSettleMultiplier = quoteToSettleMultiplier;
    return this;
  }

  
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
  public Instrument isQuanto(Boolean isQuanto) {
    this.isQuanto = isQuanto;
    return this;
  }

  
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
  public Instrument isInverse(Boolean isInverse) {
    this.isInverse = isInverse;
    return this;
  }

  
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
  public Instrument initMargin(Double initMargin) {
    this.initMargin = initMargin;
    return this;
  }

  
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
  public Instrument maintMargin(Double maintMargin) {
    this.maintMargin = maintMargin;
    return this;
  }

  
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
  public Instrument limit(Double limit) {
    this.limit = limit;
    return this;
  }

  
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
  public Instrument capped(Boolean capped) {
    this.capped = capped;
    return this;
  }

  
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
  public Instrument taxed(Boolean taxed) {
    this.taxed = taxed;
    return this;
  }

  
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
  public Instrument makerFee(Double makerFee) {
    this.makerFee = makerFee;
    return this;
  }

  
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
  public Instrument takerFee(Double takerFee) {
    this.takerFee = takerFee;
    return this;
  }

  
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
  public Instrument settlementFee(Double settlementFee) {
    this.settlementFee = settlementFee;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("settlementFee")
  public Double getSettlementFee() {
    return settlementFee;
  }
  public void setSettlementFee(Double settlementFee) {
    this.settlementFee = settlementFee;
  }

  /**
   **/
  public Instrument insuranceFee(Double insuranceFee) {
    this.insuranceFee = insuranceFee;
    return this;
  }

  
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
  public Instrument fundingBaseSymbol(String fundingBaseSymbol) {
    this.fundingBaseSymbol = fundingBaseSymbol;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("fundingBaseSymbol")
  public String getFundingBaseSymbol() {
    return fundingBaseSymbol;
  }
  public void setFundingBaseSymbol(String fundingBaseSymbol) {
    this.fundingBaseSymbol = fundingBaseSymbol;
  }

  /**
   **/
  public Instrument fundingQuoteSymbol(String fundingQuoteSymbol) {
    this.fundingQuoteSymbol = fundingQuoteSymbol;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("fundingQuoteSymbol")
  public String getFundingQuoteSymbol() {
    return fundingQuoteSymbol;
  }
  public void setFundingQuoteSymbol(String fundingQuoteSymbol) {
    this.fundingQuoteSymbol = fundingQuoteSymbol;
  }

  /**
   **/
  public Instrument fundingPremiumSymbol(String fundingPremiumSymbol) {
    this.fundingPremiumSymbol = fundingPremiumSymbol;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("fundingPremiumSymbol")
  public String getFundingPremiumSymbol() {
    return fundingPremiumSymbol;
  }
  public void setFundingPremiumSymbol(String fundingPremiumSymbol) {
    this.fundingPremiumSymbol = fundingPremiumSymbol;
  }

  /**
   **/
  public Instrument fundingTimestamp(LocalDate fundingTimestamp) {
    this.fundingTimestamp = fundingTimestamp;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("fundingTimestamp")
  public LocalDate getFundingTimestamp() {
    return fundingTimestamp;
  }
  public void setFundingTimestamp(LocalDate fundingTimestamp) {
    this.fundingTimestamp = fundingTimestamp;
  }

  /**
   **/
  public Instrument fundingInterval(LocalDate fundingInterval) {
    this.fundingInterval = fundingInterval;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("fundingInterval")
  public LocalDate getFundingInterval() {
    return fundingInterval;
  }
  public void setFundingInterval(LocalDate fundingInterval) {
    this.fundingInterval = fundingInterval;
  }

  /**
   **/
  public Instrument fundingRate(Double fundingRate) {
    this.fundingRate = fundingRate;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("fundingRate")
  public Double getFundingRate() {
    return fundingRate;
  }
  public void setFundingRate(Double fundingRate) {
    this.fundingRate = fundingRate;
  }

  /**
   **/
  public Instrument indicativeFundingRate(Double indicativeFundingRate) {
    this.indicativeFundingRate = indicativeFundingRate;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("indicativeFundingRate")
  public Double getIndicativeFundingRate() {
    return indicativeFundingRate;
  }
  public void setIndicativeFundingRate(Double indicativeFundingRate) {
    this.indicativeFundingRate = indicativeFundingRate;
  }

  /**
   **/
  public Instrument rebalanceTimestamp(LocalDate rebalanceTimestamp) {
    this.rebalanceTimestamp = rebalanceTimestamp;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("rebalanceTimestamp")
  public LocalDate getRebalanceTimestamp() {
    return rebalanceTimestamp;
  }
  public void setRebalanceTimestamp(LocalDate rebalanceTimestamp) {
    this.rebalanceTimestamp = rebalanceTimestamp;
  }

  /**
   **/
  public Instrument rebalanceInterval(LocalDate rebalanceInterval) {
    this.rebalanceInterval = rebalanceInterval;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("rebalanceInterval")
  public LocalDate getRebalanceInterval() {
    return rebalanceInterval;
  }
  public void setRebalanceInterval(LocalDate rebalanceInterval) {
    this.rebalanceInterval = rebalanceInterval;
  }

  /**
   **/
  public Instrument openingTimestamp(LocalDate openingTimestamp) {
    this.openingTimestamp = openingTimestamp;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("openingTimestamp")
  public LocalDate getOpeningTimestamp() {
    return openingTimestamp;
  }
  public void setOpeningTimestamp(LocalDate openingTimestamp) {
    this.openingTimestamp = openingTimestamp;
  }

  /**
   **/
  public Instrument closingTimestamp(LocalDate closingTimestamp) {
    this.closingTimestamp = closingTimestamp;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("closingTimestamp")
  public LocalDate getClosingTimestamp() {
    return closingTimestamp;
  }
  public void setClosingTimestamp(LocalDate closingTimestamp) {
    this.closingTimestamp = closingTimestamp;
  }

  /**
   **/
  public Instrument sessionInterval(LocalDate sessionInterval) {
    this.sessionInterval = sessionInterval;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("sessionInterval")
  public LocalDate getSessionInterval() {
    return sessionInterval;
  }
  public void setSessionInterval(LocalDate sessionInterval) {
    this.sessionInterval = sessionInterval;
  }

  /**
   **/
  public Instrument prevClosePrice(Double prevClosePrice) {
    this.prevClosePrice = prevClosePrice;
    return this;
  }

  
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
  public Instrument limitDownPrice(Double limitDownPrice) {
    this.limitDownPrice = limitDownPrice;
    return this;
  }

  
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
  public Instrument limitUpPrice(Double limitUpPrice) {
    this.limitUpPrice = limitUpPrice;
    return this;
  }

  
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
  public Instrument bankruptLimitDownPrice(Double bankruptLimitDownPrice) {
    this.bankruptLimitDownPrice = bankruptLimitDownPrice;
    return this;
  }

  
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
  public Instrument bankruptLimitUpPrice(Double bankruptLimitUpPrice) {
    this.bankruptLimitUpPrice = bankruptLimitUpPrice;
    return this;
  }

  
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
  public Instrument prevTotalVolume(BigDecimal prevTotalVolume) {
    this.prevTotalVolume = prevTotalVolume;
    return this;
  }

  
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
  public Instrument totalVolume(BigDecimal totalVolume) {
    this.totalVolume = totalVolume;
    return this;
  }

  
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
  public Instrument volume(BigDecimal volume) {
    this.volume = volume;
    return this;
  }

  
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
  public Instrument volume24h(BigDecimal volume24h) {
    this.volume24h = volume24h;
    return this;
  }

  
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
  public Instrument prevTotalTurnover(BigDecimal prevTotalTurnover) {
    this.prevTotalTurnover = prevTotalTurnover;
    return this;
  }

  
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
  public Instrument totalTurnover(BigDecimal totalTurnover) {
    this.totalTurnover = totalTurnover;
    return this;
  }

  
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
  public Instrument turnover(BigDecimal turnover) {
    this.turnover = turnover;
    return this;
  }

  
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
  public Instrument turnover24h(BigDecimal turnover24h) {
    this.turnover24h = turnover24h;
    return this;
  }

  
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
  public Instrument prevPrice24h(Double prevPrice24h) {
    this.prevPrice24h = prevPrice24h;
    return this;
  }

  
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
  public Instrument vwap(Double vwap) {
    this.vwap = vwap;
    return this;
  }

  
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
  public Instrument highPrice(Double highPrice) {
    this.highPrice = highPrice;
    return this;
  }

  
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
  public Instrument lowPrice(Double lowPrice) {
    this.lowPrice = lowPrice;
    return this;
  }

  
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
  public Instrument lastPrice(Double lastPrice) {
    this.lastPrice = lastPrice;
    return this;
  }

  
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
  public Instrument lastPriceProtected(Double lastPriceProtected) {
    this.lastPriceProtected = lastPriceProtected;
    return this;
  }

  
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
  public Instrument lastTickDirection(String lastTickDirection) {
    this.lastTickDirection = lastTickDirection;
    return this;
  }

  
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
  public Instrument lastChangePcnt(Double lastChangePcnt) {
    this.lastChangePcnt = lastChangePcnt;
    return this;
  }

  
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
  public Instrument bidPrice(Double bidPrice) {
    this.bidPrice = bidPrice;
    return this;
  }

  
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
  public Instrument midPrice(Double midPrice) {
    this.midPrice = midPrice;
    return this;
  }

  
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
  public Instrument askPrice(Double askPrice) {
    this.askPrice = askPrice;
    return this;
  }

  
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
  public Instrument impactBidPrice(Double impactBidPrice) {
    this.impactBidPrice = impactBidPrice;
    return this;
  }

  
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
  public Instrument impactMidPrice(Double impactMidPrice) {
    this.impactMidPrice = impactMidPrice;
    return this;
  }

  
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
  public Instrument impactAskPrice(Double impactAskPrice) {
    this.impactAskPrice = impactAskPrice;
    return this;
  }

  
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
  public Instrument hasLiquidity(Boolean hasLiquidity) {
    this.hasLiquidity = hasLiquidity;
    return this;
  }

  
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
  public Instrument openInterest(BigDecimal openInterest) {
    this.openInterest = openInterest;
    return this;
  }

  
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
  public Instrument openValue(BigDecimal openValue) {
    this.openValue = openValue;
    return this;
  }

  
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
  public Instrument fairMethod(String fairMethod) {
    this.fairMethod = fairMethod;
    return this;
  }

  
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
  public Instrument fairBasisRate(Double fairBasisRate) {
    this.fairBasisRate = fairBasisRate;
    return this;
  }

  
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
  public Instrument fairBasis(Double fairBasis) {
    this.fairBasis = fairBasis;
    return this;
  }

  
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
  public Instrument fairPrice(Double fairPrice) {
    this.fairPrice = fairPrice;
    return this;
  }

  
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
  public Instrument markMethod(String markMethod) {
    this.markMethod = markMethod;
    return this;
  }

  
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
  public Instrument markPrice(Double markPrice) {
    this.markPrice = markPrice;
    return this;
  }

  
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
  public Instrument indicativeTaxRate(Double indicativeTaxRate) {
    this.indicativeTaxRate = indicativeTaxRate;
    return this;
  }

  
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
  public Instrument indicativeSettlePrice(Double indicativeSettlePrice) {
    this.indicativeSettlePrice = indicativeSettlePrice;
    return this;
  }

  
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
  public Instrument settledPrice(Double settledPrice) {
    this.settledPrice = settledPrice;
    return this;
  }

  
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
  public Instrument timestamp(LocalDate timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("timestamp")
  public LocalDate getTimestamp() {
    return timestamp;
  }
  public void setTimestamp(LocalDate timestamp) {
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
        Objects.equals(limit, instrument.limit) &&
        Objects.equals(capped, instrument.capped) &&
        Objects.equals(taxed, instrument.taxed) &&
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
    return Objects.hash(symbol, rootSymbol, state, typ, listing, front, expiry, settle, relistInterval, inverseLeg, sellLeg, buyLeg, positionCurrency, underlying, quoteCurrency, underlyingSymbol, reference, referenceSymbol, calcInterval, publishInterval, publishTime, maxOrderQty, maxPrice, lotSize, tickSize, multiplier, settlCurrency, underlyingToPositionMultiplier, underlyingToSettleMultiplier, quoteToSettleMultiplier, isQuanto, isInverse, initMargin, maintMargin, limit, capped, taxed, makerFee, takerFee, settlementFee, insuranceFee, fundingBaseSymbol, fundingQuoteSymbol, fundingPremiumSymbol, fundingTimestamp, fundingInterval, fundingRate, indicativeFundingRate, rebalanceTimestamp, rebalanceInterval, openingTimestamp, closingTimestamp, sessionInterval, prevClosePrice, limitDownPrice, limitUpPrice, bankruptLimitDownPrice, bankruptLimitUpPrice, prevTotalVolume, totalVolume, volume, volume24h, prevTotalTurnover, totalTurnover, turnover, turnover24h, prevPrice24h, vwap, highPrice, lowPrice, lastPrice, lastPriceProtected, lastTickDirection, lastChangePcnt, bidPrice, midPrice, askPrice, impactBidPrice, impactMidPrice, impactAskPrice, hasLiquidity, openInterest, openValue, fairMethod, fairBasisRate, fairBasis, fairPrice, markMethod, markPrice, indicativeTaxRate, indicativeSettlePrice, settledPrice, timestamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Instrument {\n");
    
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    rootSymbol: ").append(toIndentedString(rootSymbol)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    typ: ").append(toIndentedString(typ)).append("\n");
    sb.append("    listing: ").append(toIndentedString(listing)).append("\n");
    sb.append("    front: ").append(toIndentedString(front)).append("\n");
    sb.append("    expiry: ").append(toIndentedString(expiry)).append("\n");
    sb.append("    settle: ").append(toIndentedString(settle)).append("\n");
    sb.append("    relistInterval: ").append(toIndentedString(relistInterval)).append("\n");
    sb.append("    inverseLeg: ").append(toIndentedString(inverseLeg)).append("\n");
    sb.append("    sellLeg: ").append(toIndentedString(sellLeg)).append("\n");
    sb.append("    buyLeg: ").append(toIndentedString(buyLeg)).append("\n");
    sb.append("    positionCurrency: ").append(toIndentedString(positionCurrency)).append("\n");
    sb.append("    underlying: ").append(toIndentedString(underlying)).append("\n");
    sb.append("    quoteCurrency: ").append(toIndentedString(quoteCurrency)).append("\n");
    sb.append("    underlyingSymbol: ").append(toIndentedString(underlyingSymbol)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    referenceSymbol: ").append(toIndentedString(referenceSymbol)).append("\n");
    sb.append("    calcInterval: ").append(toIndentedString(calcInterval)).append("\n");
    sb.append("    publishInterval: ").append(toIndentedString(publishInterval)).append("\n");
    sb.append("    publishTime: ").append(toIndentedString(publishTime)).append("\n");
    sb.append("    maxOrderQty: ").append(toIndentedString(maxOrderQty)).append("\n");
    sb.append("    maxPrice: ").append(toIndentedString(maxPrice)).append("\n");
    sb.append("    lotSize: ").append(toIndentedString(lotSize)).append("\n");
    sb.append("    tickSize: ").append(toIndentedString(tickSize)).append("\n");
    sb.append("    multiplier: ").append(toIndentedString(multiplier)).append("\n");
    sb.append("    settlCurrency: ").append(toIndentedString(settlCurrency)).append("\n");
    sb.append("    underlyingToPositionMultiplier: ").append(toIndentedString(underlyingToPositionMultiplier)).append("\n");
    sb.append("    underlyingToSettleMultiplier: ").append(toIndentedString(underlyingToSettleMultiplier)).append("\n");
    sb.append("    quoteToSettleMultiplier: ").append(toIndentedString(quoteToSettleMultiplier)).append("\n");
    sb.append("    isQuanto: ").append(toIndentedString(isQuanto)).append("\n");
    sb.append("    isInverse: ").append(toIndentedString(isInverse)).append("\n");
    sb.append("    initMargin: ").append(toIndentedString(initMargin)).append("\n");
    sb.append("    maintMargin: ").append(toIndentedString(maintMargin)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    capped: ").append(toIndentedString(capped)).append("\n");
    sb.append("    taxed: ").append(toIndentedString(taxed)).append("\n");
    sb.append("    makerFee: ").append(toIndentedString(makerFee)).append("\n");
    sb.append("    takerFee: ").append(toIndentedString(takerFee)).append("\n");
    sb.append("    settlementFee: ").append(toIndentedString(settlementFee)).append("\n");
    sb.append("    insuranceFee: ").append(toIndentedString(insuranceFee)).append("\n");
    sb.append("    fundingBaseSymbol: ").append(toIndentedString(fundingBaseSymbol)).append("\n");
    sb.append("    fundingQuoteSymbol: ").append(toIndentedString(fundingQuoteSymbol)).append("\n");
    sb.append("    fundingPremiumSymbol: ").append(toIndentedString(fundingPremiumSymbol)).append("\n");
    sb.append("    fundingTimestamp: ").append(toIndentedString(fundingTimestamp)).append("\n");
    sb.append("    fundingInterval: ").append(toIndentedString(fundingInterval)).append("\n");
    sb.append("    fundingRate: ").append(toIndentedString(fundingRate)).append("\n");
    sb.append("    indicativeFundingRate: ").append(toIndentedString(indicativeFundingRate)).append("\n");
    sb.append("    rebalanceTimestamp: ").append(toIndentedString(rebalanceTimestamp)).append("\n");
    sb.append("    rebalanceInterval: ").append(toIndentedString(rebalanceInterval)).append("\n");
    sb.append("    openingTimestamp: ").append(toIndentedString(openingTimestamp)).append("\n");
    sb.append("    closingTimestamp: ").append(toIndentedString(closingTimestamp)).append("\n");
    sb.append("    sessionInterval: ").append(toIndentedString(sessionInterval)).append("\n");
    sb.append("    prevClosePrice: ").append(toIndentedString(prevClosePrice)).append("\n");
    sb.append("    limitDownPrice: ").append(toIndentedString(limitDownPrice)).append("\n");
    sb.append("    limitUpPrice: ").append(toIndentedString(limitUpPrice)).append("\n");
    sb.append("    bankruptLimitDownPrice: ").append(toIndentedString(bankruptLimitDownPrice)).append("\n");
    sb.append("    bankruptLimitUpPrice: ").append(toIndentedString(bankruptLimitUpPrice)).append("\n");
    sb.append("    prevTotalVolume: ").append(toIndentedString(prevTotalVolume)).append("\n");
    sb.append("    totalVolume: ").append(toIndentedString(totalVolume)).append("\n");
    sb.append("    volume: ").append(toIndentedString(volume)).append("\n");
    sb.append("    volume24h: ").append(toIndentedString(volume24h)).append("\n");
    sb.append("    prevTotalTurnover: ").append(toIndentedString(prevTotalTurnover)).append("\n");
    sb.append("    totalTurnover: ").append(toIndentedString(totalTurnover)).append("\n");
    sb.append("    turnover: ").append(toIndentedString(turnover)).append("\n");
    sb.append("    turnover24h: ").append(toIndentedString(turnover24h)).append("\n");
    sb.append("    prevPrice24h: ").append(toIndentedString(prevPrice24h)).append("\n");
    sb.append("    vwap: ").append(toIndentedString(vwap)).append("\n");
    sb.append("    highPrice: ").append(toIndentedString(highPrice)).append("\n");
    sb.append("    lowPrice: ").append(toIndentedString(lowPrice)).append("\n");
    sb.append("    lastPrice: ").append(toIndentedString(lastPrice)).append("\n");
    sb.append("    lastPriceProtected: ").append(toIndentedString(lastPriceProtected)).append("\n");
    sb.append("    lastTickDirection: ").append(toIndentedString(lastTickDirection)).append("\n");
    sb.append("    lastChangePcnt: ").append(toIndentedString(lastChangePcnt)).append("\n");
    sb.append("    bidPrice: ").append(toIndentedString(bidPrice)).append("\n");
    sb.append("    midPrice: ").append(toIndentedString(midPrice)).append("\n");
    sb.append("    askPrice: ").append(toIndentedString(askPrice)).append("\n");
    sb.append("    impactBidPrice: ").append(toIndentedString(impactBidPrice)).append("\n");
    sb.append("    impactMidPrice: ").append(toIndentedString(impactMidPrice)).append("\n");
    sb.append("    impactAskPrice: ").append(toIndentedString(impactAskPrice)).append("\n");
    sb.append("    hasLiquidity: ").append(toIndentedString(hasLiquidity)).append("\n");
    sb.append("    openInterest: ").append(toIndentedString(openInterest)).append("\n");
    sb.append("    openValue: ").append(toIndentedString(openValue)).append("\n");
    sb.append("    fairMethod: ").append(toIndentedString(fairMethod)).append("\n");
    sb.append("    fairBasisRate: ").append(toIndentedString(fairBasisRate)).append("\n");
    sb.append("    fairBasis: ").append(toIndentedString(fairBasis)).append("\n");
    sb.append("    fairPrice: ").append(toIndentedString(fairPrice)).append("\n");
    sb.append("    markMethod: ").append(toIndentedString(markMethod)).append("\n");
    sb.append("    markPrice: ").append(toIndentedString(markPrice)).append("\n");
    sb.append("    indicativeTaxRate: ").append(toIndentedString(indicativeTaxRate)).append("\n");
    sb.append("    indicativeSettlePrice: ").append(toIndentedString(indicativeSettlePrice)).append("\n");
    sb.append("    settledPrice: ").append(toIndentedString(settledPrice)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

