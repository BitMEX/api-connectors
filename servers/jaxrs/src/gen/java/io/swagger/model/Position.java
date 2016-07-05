package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.Date;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-07-05T09:41:09.909-05:00")
public class Position   {
  
  private BigDecimal account = null;
  private String symbol = null;
  private String currency = null;
  private String underlying = null;
  private String quoteCurrency = null;
  private Double commission = null;
  private Double leverage = null;
  private Boolean crossMargin = null;
  private BigDecimal rebalancedPnl = null;
  private BigDecimal prevRealisedPnl = null;
  private BigDecimal prevUnrealisedPnl = null;
  private Double prevClosePrice = null;
  private Date openingTimestamp = null;
  private BigDecimal openingQty = null;
  private BigDecimal openingCost = null;
  private BigDecimal openingComm = null;
  private BigDecimal openOrderBuyQty = null;
  private BigDecimal openOrderBuyCost = null;
  private BigDecimal openOrderBuyPremium = null;
  private BigDecimal openOrderSellQty = null;
  private BigDecimal openOrderSellCost = null;
  private BigDecimal openOrderSellPremium = null;
  private BigDecimal execBuyQty = null;
  private BigDecimal execBuyCost = null;
  private BigDecimal execSellQty = null;
  private BigDecimal execSellCost = null;
  private BigDecimal execQty = null;
  private BigDecimal execCost = null;
  private BigDecimal execComm = null;
  private Date currentTimestamp = null;
  private BigDecimal currentQty = null;
  private BigDecimal currentCost = null;
  private BigDecimal currentComm = null;
  private BigDecimal realisedCost = null;
  private BigDecimal unrealisedCost = null;
  private BigDecimal grossOpenCost = null;
  private BigDecimal grossOpenPremium = null;
  private BigDecimal grossExecCost = null;
  private Boolean isOpen = null;
  private Double markPrice = null;
  private BigDecimal markValue = null;
  private Double homeNotional = null;
  private Double foreignNotional = null;
  private String posState = null;
  private BigDecimal posCost = null;
  private BigDecimal posCost2 = null;
  private BigDecimal posCross = null;
  private BigDecimal posInit = null;
  private BigDecimal posComm = null;
  private BigDecimal posLoss = null;
  private BigDecimal posMargin = null;
  private BigDecimal posMaint = null;
  private BigDecimal posAllowance = null;
  private BigDecimal taxableMargin = null;
  private BigDecimal initMargin = null;
  private BigDecimal maintMargin = null;
  private BigDecimal sessionMargin = null;
  private BigDecimal targetExcessMargin = null;
  private BigDecimal varMargin = null;
  private BigDecimal realisedGrossPnl = null;
  private BigDecimal realisedTax = null;
  private BigDecimal realisedPnl = null;
  private BigDecimal unrealisedGrossPnl = null;
  private BigDecimal longBankrupt = null;
  private BigDecimal shortBankrupt = null;
  private BigDecimal taxBase = null;
  private Double indicativeTaxRate = null;
  private BigDecimal indicativeTax = null;
  private BigDecimal unrealisedTax = null;
  private BigDecimal unrealisedPnl = null;
  private Double unrealisedPnlPcnt = null;
  private Double unrealisedRoePcnt = null;
  private Double simpleQty = null;
  private Double simpleCost = null;
  private Double simpleValue = null;
  private Double simplePnl = null;
  private Double simplePnlPcnt = null;
  private Double avgCostPrice = null;
  private Double avgEntryPrice = null;
  private Double breakEvenPrice = null;
  private Double marginCallPrice = null;
  private Double liquidationPrice = null;
  private Double bankruptPrice = null;
  private Date timestamp = null;
  private Double lastPrice = null;
  private BigDecimal lastValue = null;

  /**
   **/
  public Position account(BigDecimal account) {
    this.account = account;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("account")
  public BigDecimal getAccount() {
    return account;
  }
  public void setAccount(BigDecimal account) {
    this.account = account;
  }

  /**
   **/
  public Position symbol(String symbol) {
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
  public Position currency(String currency) {
    this.currency = currency;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("currency")
  public String getCurrency() {
    return currency;
  }
  public void setCurrency(String currency) {
    this.currency = currency;
  }

  /**
   **/
  public Position underlying(String underlying) {
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
  public Position quoteCurrency(String quoteCurrency) {
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
  public Position commission(Double commission) {
    this.commission = commission;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("commission")
  public Double getCommission() {
    return commission;
  }
  public void setCommission(Double commission) {
    this.commission = commission;
  }

  /**
   **/
  public Position leverage(Double leverage) {
    this.leverage = leverage;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("leverage")
  public Double getLeverage() {
    return leverage;
  }
  public void setLeverage(Double leverage) {
    this.leverage = leverage;
  }

  /**
   **/
  public Position crossMargin(Boolean crossMargin) {
    this.crossMargin = crossMargin;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("crossMargin")
  public Boolean getCrossMargin() {
    return crossMargin;
  }
  public void setCrossMargin(Boolean crossMargin) {
    this.crossMargin = crossMargin;
  }

  /**
   **/
  public Position rebalancedPnl(BigDecimal rebalancedPnl) {
    this.rebalancedPnl = rebalancedPnl;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("rebalancedPnl")
  public BigDecimal getRebalancedPnl() {
    return rebalancedPnl;
  }
  public void setRebalancedPnl(BigDecimal rebalancedPnl) {
    this.rebalancedPnl = rebalancedPnl;
  }

  /**
   **/
  public Position prevRealisedPnl(BigDecimal prevRealisedPnl) {
    this.prevRealisedPnl = prevRealisedPnl;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("prevRealisedPnl")
  public BigDecimal getPrevRealisedPnl() {
    return prevRealisedPnl;
  }
  public void setPrevRealisedPnl(BigDecimal prevRealisedPnl) {
    this.prevRealisedPnl = prevRealisedPnl;
  }

  /**
   **/
  public Position prevUnrealisedPnl(BigDecimal prevUnrealisedPnl) {
    this.prevUnrealisedPnl = prevUnrealisedPnl;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("prevUnrealisedPnl")
  public BigDecimal getPrevUnrealisedPnl() {
    return prevUnrealisedPnl;
  }
  public void setPrevUnrealisedPnl(BigDecimal prevUnrealisedPnl) {
    this.prevUnrealisedPnl = prevUnrealisedPnl;
  }

  /**
   **/
  public Position prevClosePrice(Double prevClosePrice) {
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
  public Position openingTimestamp(Date openingTimestamp) {
    this.openingTimestamp = openingTimestamp;
    return this;
  }

  
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
  public Position openingQty(BigDecimal openingQty) {
    this.openingQty = openingQty;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("openingQty")
  public BigDecimal getOpeningQty() {
    return openingQty;
  }
  public void setOpeningQty(BigDecimal openingQty) {
    this.openingQty = openingQty;
  }

  /**
   **/
  public Position openingCost(BigDecimal openingCost) {
    this.openingCost = openingCost;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("openingCost")
  public BigDecimal getOpeningCost() {
    return openingCost;
  }
  public void setOpeningCost(BigDecimal openingCost) {
    this.openingCost = openingCost;
  }

  /**
   **/
  public Position openingComm(BigDecimal openingComm) {
    this.openingComm = openingComm;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("openingComm")
  public BigDecimal getOpeningComm() {
    return openingComm;
  }
  public void setOpeningComm(BigDecimal openingComm) {
    this.openingComm = openingComm;
  }

  /**
   **/
  public Position openOrderBuyQty(BigDecimal openOrderBuyQty) {
    this.openOrderBuyQty = openOrderBuyQty;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("openOrderBuyQty")
  public BigDecimal getOpenOrderBuyQty() {
    return openOrderBuyQty;
  }
  public void setOpenOrderBuyQty(BigDecimal openOrderBuyQty) {
    this.openOrderBuyQty = openOrderBuyQty;
  }

  /**
   **/
  public Position openOrderBuyCost(BigDecimal openOrderBuyCost) {
    this.openOrderBuyCost = openOrderBuyCost;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("openOrderBuyCost")
  public BigDecimal getOpenOrderBuyCost() {
    return openOrderBuyCost;
  }
  public void setOpenOrderBuyCost(BigDecimal openOrderBuyCost) {
    this.openOrderBuyCost = openOrderBuyCost;
  }

  /**
   **/
  public Position openOrderBuyPremium(BigDecimal openOrderBuyPremium) {
    this.openOrderBuyPremium = openOrderBuyPremium;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("openOrderBuyPremium")
  public BigDecimal getOpenOrderBuyPremium() {
    return openOrderBuyPremium;
  }
  public void setOpenOrderBuyPremium(BigDecimal openOrderBuyPremium) {
    this.openOrderBuyPremium = openOrderBuyPremium;
  }

  /**
   **/
  public Position openOrderSellQty(BigDecimal openOrderSellQty) {
    this.openOrderSellQty = openOrderSellQty;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("openOrderSellQty")
  public BigDecimal getOpenOrderSellQty() {
    return openOrderSellQty;
  }
  public void setOpenOrderSellQty(BigDecimal openOrderSellQty) {
    this.openOrderSellQty = openOrderSellQty;
  }

  /**
   **/
  public Position openOrderSellCost(BigDecimal openOrderSellCost) {
    this.openOrderSellCost = openOrderSellCost;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("openOrderSellCost")
  public BigDecimal getOpenOrderSellCost() {
    return openOrderSellCost;
  }
  public void setOpenOrderSellCost(BigDecimal openOrderSellCost) {
    this.openOrderSellCost = openOrderSellCost;
  }

  /**
   **/
  public Position openOrderSellPremium(BigDecimal openOrderSellPremium) {
    this.openOrderSellPremium = openOrderSellPremium;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("openOrderSellPremium")
  public BigDecimal getOpenOrderSellPremium() {
    return openOrderSellPremium;
  }
  public void setOpenOrderSellPremium(BigDecimal openOrderSellPremium) {
    this.openOrderSellPremium = openOrderSellPremium;
  }

  /**
   **/
  public Position execBuyQty(BigDecimal execBuyQty) {
    this.execBuyQty = execBuyQty;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("execBuyQty")
  public BigDecimal getExecBuyQty() {
    return execBuyQty;
  }
  public void setExecBuyQty(BigDecimal execBuyQty) {
    this.execBuyQty = execBuyQty;
  }

  /**
   **/
  public Position execBuyCost(BigDecimal execBuyCost) {
    this.execBuyCost = execBuyCost;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("execBuyCost")
  public BigDecimal getExecBuyCost() {
    return execBuyCost;
  }
  public void setExecBuyCost(BigDecimal execBuyCost) {
    this.execBuyCost = execBuyCost;
  }

  /**
   **/
  public Position execSellQty(BigDecimal execSellQty) {
    this.execSellQty = execSellQty;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("execSellQty")
  public BigDecimal getExecSellQty() {
    return execSellQty;
  }
  public void setExecSellQty(BigDecimal execSellQty) {
    this.execSellQty = execSellQty;
  }

  /**
   **/
  public Position execSellCost(BigDecimal execSellCost) {
    this.execSellCost = execSellCost;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("execSellCost")
  public BigDecimal getExecSellCost() {
    return execSellCost;
  }
  public void setExecSellCost(BigDecimal execSellCost) {
    this.execSellCost = execSellCost;
  }

  /**
   **/
  public Position execQty(BigDecimal execQty) {
    this.execQty = execQty;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("execQty")
  public BigDecimal getExecQty() {
    return execQty;
  }
  public void setExecQty(BigDecimal execQty) {
    this.execQty = execQty;
  }

  /**
   **/
  public Position execCost(BigDecimal execCost) {
    this.execCost = execCost;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("execCost")
  public BigDecimal getExecCost() {
    return execCost;
  }
  public void setExecCost(BigDecimal execCost) {
    this.execCost = execCost;
  }

  /**
   **/
  public Position execComm(BigDecimal execComm) {
    this.execComm = execComm;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("execComm")
  public BigDecimal getExecComm() {
    return execComm;
  }
  public void setExecComm(BigDecimal execComm) {
    this.execComm = execComm;
  }

  /**
   **/
  public Position currentTimestamp(Date currentTimestamp) {
    this.currentTimestamp = currentTimestamp;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("currentTimestamp")
  public Date getCurrentTimestamp() {
    return currentTimestamp;
  }
  public void setCurrentTimestamp(Date currentTimestamp) {
    this.currentTimestamp = currentTimestamp;
  }

  /**
   **/
  public Position currentQty(BigDecimal currentQty) {
    this.currentQty = currentQty;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("currentQty")
  public BigDecimal getCurrentQty() {
    return currentQty;
  }
  public void setCurrentQty(BigDecimal currentQty) {
    this.currentQty = currentQty;
  }

  /**
   **/
  public Position currentCost(BigDecimal currentCost) {
    this.currentCost = currentCost;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("currentCost")
  public BigDecimal getCurrentCost() {
    return currentCost;
  }
  public void setCurrentCost(BigDecimal currentCost) {
    this.currentCost = currentCost;
  }

  /**
   **/
  public Position currentComm(BigDecimal currentComm) {
    this.currentComm = currentComm;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("currentComm")
  public BigDecimal getCurrentComm() {
    return currentComm;
  }
  public void setCurrentComm(BigDecimal currentComm) {
    this.currentComm = currentComm;
  }

  /**
   **/
  public Position realisedCost(BigDecimal realisedCost) {
    this.realisedCost = realisedCost;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("realisedCost")
  public BigDecimal getRealisedCost() {
    return realisedCost;
  }
  public void setRealisedCost(BigDecimal realisedCost) {
    this.realisedCost = realisedCost;
  }

  /**
   **/
  public Position unrealisedCost(BigDecimal unrealisedCost) {
    this.unrealisedCost = unrealisedCost;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("unrealisedCost")
  public BigDecimal getUnrealisedCost() {
    return unrealisedCost;
  }
  public void setUnrealisedCost(BigDecimal unrealisedCost) {
    this.unrealisedCost = unrealisedCost;
  }

  /**
   **/
  public Position grossOpenCost(BigDecimal grossOpenCost) {
    this.grossOpenCost = grossOpenCost;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("grossOpenCost")
  public BigDecimal getGrossOpenCost() {
    return grossOpenCost;
  }
  public void setGrossOpenCost(BigDecimal grossOpenCost) {
    this.grossOpenCost = grossOpenCost;
  }

  /**
   **/
  public Position grossOpenPremium(BigDecimal grossOpenPremium) {
    this.grossOpenPremium = grossOpenPremium;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("grossOpenPremium")
  public BigDecimal getGrossOpenPremium() {
    return grossOpenPremium;
  }
  public void setGrossOpenPremium(BigDecimal grossOpenPremium) {
    this.grossOpenPremium = grossOpenPremium;
  }

  /**
   **/
  public Position grossExecCost(BigDecimal grossExecCost) {
    this.grossExecCost = grossExecCost;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("grossExecCost")
  public BigDecimal getGrossExecCost() {
    return grossExecCost;
  }
  public void setGrossExecCost(BigDecimal grossExecCost) {
    this.grossExecCost = grossExecCost;
  }

  /**
   **/
  public Position isOpen(Boolean isOpen) {
    this.isOpen = isOpen;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("isOpen")
  public Boolean getIsOpen() {
    return isOpen;
  }
  public void setIsOpen(Boolean isOpen) {
    this.isOpen = isOpen;
  }

  /**
   **/
  public Position markPrice(Double markPrice) {
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
  public Position markValue(BigDecimal markValue) {
    this.markValue = markValue;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("markValue")
  public BigDecimal getMarkValue() {
    return markValue;
  }
  public void setMarkValue(BigDecimal markValue) {
    this.markValue = markValue;
  }

  /**
   **/
  public Position homeNotional(Double homeNotional) {
    this.homeNotional = homeNotional;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("homeNotional")
  public Double getHomeNotional() {
    return homeNotional;
  }
  public void setHomeNotional(Double homeNotional) {
    this.homeNotional = homeNotional;
  }

  /**
   **/
  public Position foreignNotional(Double foreignNotional) {
    this.foreignNotional = foreignNotional;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("foreignNotional")
  public Double getForeignNotional() {
    return foreignNotional;
  }
  public void setForeignNotional(Double foreignNotional) {
    this.foreignNotional = foreignNotional;
  }

  /**
   **/
  public Position posState(String posState) {
    this.posState = posState;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("posState")
  public String getPosState() {
    return posState;
  }
  public void setPosState(String posState) {
    this.posState = posState;
  }

  /**
   **/
  public Position posCost(BigDecimal posCost) {
    this.posCost = posCost;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("posCost")
  public BigDecimal getPosCost() {
    return posCost;
  }
  public void setPosCost(BigDecimal posCost) {
    this.posCost = posCost;
  }

  /**
   **/
  public Position posCost2(BigDecimal posCost2) {
    this.posCost2 = posCost2;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("posCost2")
  public BigDecimal getPosCost2() {
    return posCost2;
  }
  public void setPosCost2(BigDecimal posCost2) {
    this.posCost2 = posCost2;
  }

  /**
   **/
  public Position posCross(BigDecimal posCross) {
    this.posCross = posCross;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("posCross")
  public BigDecimal getPosCross() {
    return posCross;
  }
  public void setPosCross(BigDecimal posCross) {
    this.posCross = posCross;
  }

  /**
   **/
  public Position posInit(BigDecimal posInit) {
    this.posInit = posInit;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("posInit")
  public BigDecimal getPosInit() {
    return posInit;
  }
  public void setPosInit(BigDecimal posInit) {
    this.posInit = posInit;
  }

  /**
   **/
  public Position posComm(BigDecimal posComm) {
    this.posComm = posComm;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("posComm")
  public BigDecimal getPosComm() {
    return posComm;
  }
  public void setPosComm(BigDecimal posComm) {
    this.posComm = posComm;
  }

  /**
   **/
  public Position posLoss(BigDecimal posLoss) {
    this.posLoss = posLoss;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("posLoss")
  public BigDecimal getPosLoss() {
    return posLoss;
  }
  public void setPosLoss(BigDecimal posLoss) {
    this.posLoss = posLoss;
  }

  /**
   **/
  public Position posMargin(BigDecimal posMargin) {
    this.posMargin = posMargin;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("posMargin")
  public BigDecimal getPosMargin() {
    return posMargin;
  }
  public void setPosMargin(BigDecimal posMargin) {
    this.posMargin = posMargin;
  }

  /**
   **/
  public Position posMaint(BigDecimal posMaint) {
    this.posMaint = posMaint;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("posMaint")
  public BigDecimal getPosMaint() {
    return posMaint;
  }
  public void setPosMaint(BigDecimal posMaint) {
    this.posMaint = posMaint;
  }

  /**
   **/
  public Position posAllowance(BigDecimal posAllowance) {
    this.posAllowance = posAllowance;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("posAllowance")
  public BigDecimal getPosAllowance() {
    return posAllowance;
  }
  public void setPosAllowance(BigDecimal posAllowance) {
    this.posAllowance = posAllowance;
  }

  /**
   **/
  public Position taxableMargin(BigDecimal taxableMargin) {
    this.taxableMargin = taxableMargin;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("taxableMargin")
  public BigDecimal getTaxableMargin() {
    return taxableMargin;
  }
  public void setTaxableMargin(BigDecimal taxableMargin) {
    this.taxableMargin = taxableMargin;
  }

  /**
   **/
  public Position initMargin(BigDecimal initMargin) {
    this.initMargin = initMargin;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("initMargin")
  public BigDecimal getInitMargin() {
    return initMargin;
  }
  public void setInitMargin(BigDecimal initMargin) {
    this.initMargin = initMargin;
  }

  /**
   **/
  public Position maintMargin(BigDecimal maintMargin) {
    this.maintMargin = maintMargin;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("maintMargin")
  public BigDecimal getMaintMargin() {
    return maintMargin;
  }
  public void setMaintMargin(BigDecimal maintMargin) {
    this.maintMargin = maintMargin;
  }

  /**
   **/
  public Position sessionMargin(BigDecimal sessionMargin) {
    this.sessionMargin = sessionMargin;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("sessionMargin")
  public BigDecimal getSessionMargin() {
    return sessionMargin;
  }
  public void setSessionMargin(BigDecimal sessionMargin) {
    this.sessionMargin = sessionMargin;
  }

  /**
   **/
  public Position targetExcessMargin(BigDecimal targetExcessMargin) {
    this.targetExcessMargin = targetExcessMargin;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("targetExcessMargin")
  public BigDecimal getTargetExcessMargin() {
    return targetExcessMargin;
  }
  public void setTargetExcessMargin(BigDecimal targetExcessMargin) {
    this.targetExcessMargin = targetExcessMargin;
  }

  /**
   **/
  public Position varMargin(BigDecimal varMargin) {
    this.varMargin = varMargin;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("varMargin")
  public BigDecimal getVarMargin() {
    return varMargin;
  }
  public void setVarMargin(BigDecimal varMargin) {
    this.varMargin = varMargin;
  }

  /**
   **/
  public Position realisedGrossPnl(BigDecimal realisedGrossPnl) {
    this.realisedGrossPnl = realisedGrossPnl;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("realisedGrossPnl")
  public BigDecimal getRealisedGrossPnl() {
    return realisedGrossPnl;
  }
  public void setRealisedGrossPnl(BigDecimal realisedGrossPnl) {
    this.realisedGrossPnl = realisedGrossPnl;
  }

  /**
   **/
  public Position realisedTax(BigDecimal realisedTax) {
    this.realisedTax = realisedTax;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("realisedTax")
  public BigDecimal getRealisedTax() {
    return realisedTax;
  }
  public void setRealisedTax(BigDecimal realisedTax) {
    this.realisedTax = realisedTax;
  }

  /**
   **/
  public Position realisedPnl(BigDecimal realisedPnl) {
    this.realisedPnl = realisedPnl;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("realisedPnl")
  public BigDecimal getRealisedPnl() {
    return realisedPnl;
  }
  public void setRealisedPnl(BigDecimal realisedPnl) {
    this.realisedPnl = realisedPnl;
  }

  /**
   **/
  public Position unrealisedGrossPnl(BigDecimal unrealisedGrossPnl) {
    this.unrealisedGrossPnl = unrealisedGrossPnl;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("unrealisedGrossPnl")
  public BigDecimal getUnrealisedGrossPnl() {
    return unrealisedGrossPnl;
  }
  public void setUnrealisedGrossPnl(BigDecimal unrealisedGrossPnl) {
    this.unrealisedGrossPnl = unrealisedGrossPnl;
  }

  /**
   **/
  public Position longBankrupt(BigDecimal longBankrupt) {
    this.longBankrupt = longBankrupt;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("longBankrupt")
  public BigDecimal getLongBankrupt() {
    return longBankrupt;
  }
  public void setLongBankrupt(BigDecimal longBankrupt) {
    this.longBankrupt = longBankrupt;
  }

  /**
   **/
  public Position shortBankrupt(BigDecimal shortBankrupt) {
    this.shortBankrupt = shortBankrupt;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("shortBankrupt")
  public BigDecimal getShortBankrupt() {
    return shortBankrupt;
  }
  public void setShortBankrupt(BigDecimal shortBankrupt) {
    this.shortBankrupt = shortBankrupt;
  }

  /**
   **/
  public Position taxBase(BigDecimal taxBase) {
    this.taxBase = taxBase;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("taxBase")
  public BigDecimal getTaxBase() {
    return taxBase;
  }
  public void setTaxBase(BigDecimal taxBase) {
    this.taxBase = taxBase;
  }

  /**
   **/
  public Position indicativeTaxRate(Double indicativeTaxRate) {
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
  public Position indicativeTax(BigDecimal indicativeTax) {
    this.indicativeTax = indicativeTax;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("indicativeTax")
  public BigDecimal getIndicativeTax() {
    return indicativeTax;
  }
  public void setIndicativeTax(BigDecimal indicativeTax) {
    this.indicativeTax = indicativeTax;
  }

  /**
   **/
  public Position unrealisedTax(BigDecimal unrealisedTax) {
    this.unrealisedTax = unrealisedTax;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("unrealisedTax")
  public BigDecimal getUnrealisedTax() {
    return unrealisedTax;
  }
  public void setUnrealisedTax(BigDecimal unrealisedTax) {
    this.unrealisedTax = unrealisedTax;
  }

  /**
   **/
  public Position unrealisedPnl(BigDecimal unrealisedPnl) {
    this.unrealisedPnl = unrealisedPnl;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("unrealisedPnl")
  public BigDecimal getUnrealisedPnl() {
    return unrealisedPnl;
  }
  public void setUnrealisedPnl(BigDecimal unrealisedPnl) {
    this.unrealisedPnl = unrealisedPnl;
  }

  /**
   **/
  public Position unrealisedPnlPcnt(Double unrealisedPnlPcnt) {
    this.unrealisedPnlPcnt = unrealisedPnlPcnt;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("unrealisedPnlPcnt")
  public Double getUnrealisedPnlPcnt() {
    return unrealisedPnlPcnt;
  }
  public void setUnrealisedPnlPcnt(Double unrealisedPnlPcnt) {
    this.unrealisedPnlPcnt = unrealisedPnlPcnt;
  }

  /**
   **/
  public Position unrealisedRoePcnt(Double unrealisedRoePcnt) {
    this.unrealisedRoePcnt = unrealisedRoePcnt;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("unrealisedRoePcnt")
  public Double getUnrealisedRoePcnt() {
    return unrealisedRoePcnt;
  }
  public void setUnrealisedRoePcnt(Double unrealisedRoePcnt) {
    this.unrealisedRoePcnt = unrealisedRoePcnt;
  }

  /**
   **/
  public Position simpleQty(Double simpleQty) {
    this.simpleQty = simpleQty;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("simpleQty")
  public Double getSimpleQty() {
    return simpleQty;
  }
  public void setSimpleQty(Double simpleQty) {
    this.simpleQty = simpleQty;
  }

  /**
   **/
  public Position simpleCost(Double simpleCost) {
    this.simpleCost = simpleCost;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("simpleCost")
  public Double getSimpleCost() {
    return simpleCost;
  }
  public void setSimpleCost(Double simpleCost) {
    this.simpleCost = simpleCost;
  }

  /**
   **/
  public Position simpleValue(Double simpleValue) {
    this.simpleValue = simpleValue;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("simpleValue")
  public Double getSimpleValue() {
    return simpleValue;
  }
  public void setSimpleValue(Double simpleValue) {
    this.simpleValue = simpleValue;
  }

  /**
   **/
  public Position simplePnl(Double simplePnl) {
    this.simplePnl = simplePnl;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("simplePnl")
  public Double getSimplePnl() {
    return simplePnl;
  }
  public void setSimplePnl(Double simplePnl) {
    this.simplePnl = simplePnl;
  }

  /**
   **/
  public Position simplePnlPcnt(Double simplePnlPcnt) {
    this.simplePnlPcnt = simplePnlPcnt;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("simplePnlPcnt")
  public Double getSimplePnlPcnt() {
    return simplePnlPcnt;
  }
  public void setSimplePnlPcnt(Double simplePnlPcnt) {
    this.simplePnlPcnt = simplePnlPcnt;
  }

  /**
   **/
  public Position avgCostPrice(Double avgCostPrice) {
    this.avgCostPrice = avgCostPrice;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("avgCostPrice")
  public Double getAvgCostPrice() {
    return avgCostPrice;
  }
  public void setAvgCostPrice(Double avgCostPrice) {
    this.avgCostPrice = avgCostPrice;
  }

  /**
   **/
  public Position avgEntryPrice(Double avgEntryPrice) {
    this.avgEntryPrice = avgEntryPrice;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("avgEntryPrice")
  public Double getAvgEntryPrice() {
    return avgEntryPrice;
  }
  public void setAvgEntryPrice(Double avgEntryPrice) {
    this.avgEntryPrice = avgEntryPrice;
  }

  /**
   **/
  public Position breakEvenPrice(Double breakEvenPrice) {
    this.breakEvenPrice = breakEvenPrice;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("breakEvenPrice")
  public Double getBreakEvenPrice() {
    return breakEvenPrice;
  }
  public void setBreakEvenPrice(Double breakEvenPrice) {
    this.breakEvenPrice = breakEvenPrice;
  }

  /**
   **/
  public Position marginCallPrice(Double marginCallPrice) {
    this.marginCallPrice = marginCallPrice;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("marginCallPrice")
  public Double getMarginCallPrice() {
    return marginCallPrice;
  }
  public void setMarginCallPrice(Double marginCallPrice) {
    this.marginCallPrice = marginCallPrice;
  }

  /**
   **/
  public Position liquidationPrice(Double liquidationPrice) {
    this.liquidationPrice = liquidationPrice;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("liquidationPrice")
  public Double getLiquidationPrice() {
    return liquidationPrice;
  }
  public void setLiquidationPrice(Double liquidationPrice) {
    this.liquidationPrice = liquidationPrice;
  }

  /**
   **/
  public Position bankruptPrice(Double bankruptPrice) {
    this.bankruptPrice = bankruptPrice;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("bankruptPrice")
  public Double getBankruptPrice() {
    return bankruptPrice;
  }
  public void setBankruptPrice(Double bankruptPrice) {
    this.bankruptPrice = bankruptPrice;
  }

  /**
   **/
  public Position timestamp(Date timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("timestamp")
  public Date getTimestamp() {
    return timestamp;
  }
  public void setTimestamp(Date timestamp) {
    this.timestamp = timestamp;
  }

  /**
   **/
  public Position lastPrice(Double lastPrice) {
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
  public Position lastValue(BigDecimal lastValue) {
    this.lastValue = lastValue;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("lastValue")
  public BigDecimal getLastValue() {
    return lastValue;
  }
  public void setLastValue(BigDecimal lastValue) {
    this.lastValue = lastValue;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Position position = (Position) o;
    return Objects.equals(account, position.account) &&
        Objects.equals(symbol, position.symbol) &&
        Objects.equals(currency, position.currency) &&
        Objects.equals(underlying, position.underlying) &&
        Objects.equals(quoteCurrency, position.quoteCurrency) &&
        Objects.equals(commission, position.commission) &&
        Objects.equals(leverage, position.leverage) &&
        Objects.equals(crossMargin, position.crossMargin) &&
        Objects.equals(rebalancedPnl, position.rebalancedPnl) &&
        Objects.equals(prevRealisedPnl, position.prevRealisedPnl) &&
        Objects.equals(prevUnrealisedPnl, position.prevUnrealisedPnl) &&
        Objects.equals(prevClosePrice, position.prevClosePrice) &&
        Objects.equals(openingTimestamp, position.openingTimestamp) &&
        Objects.equals(openingQty, position.openingQty) &&
        Objects.equals(openingCost, position.openingCost) &&
        Objects.equals(openingComm, position.openingComm) &&
        Objects.equals(openOrderBuyQty, position.openOrderBuyQty) &&
        Objects.equals(openOrderBuyCost, position.openOrderBuyCost) &&
        Objects.equals(openOrderBuyPremium, position.openOrderBuyPremium) &&
        Objects.equals(openOrderSellQty, position.openOrderSellQty) &&
        Objects.equals(openOrderSellCost, position.openOrderSellCost) &&
        Objects.equals(openOrderSellPremium, position.openOrderSellPremium) &&
        Objects.equals(execBuyQty, position.execBuyQty) &&
        Objects.equals(execBuyCost, position.execBuyCost) &&
        Objects.equals(execSellQty, position.execSellQty) &&
        Objects.equals(execSellCost, position.execSellCost) &&
        Objects.equals(execQty, position.execQty) &&
        Objects.equals(execCost, position.execCost) &&
        Objects.equals(execComm, position.execComm) &&
        Objects.equals(currentTimestamp, position.currentTimestamp) &&
        Objects.equals(currentQty, position.currentQty) &&
        Objects.equals(currentCost, position.currentCost) &&
        Objects.equals(currentComm, position.currentComm) &&
        Objects.equals(realisedCost, position.realisedCost) &&
        Objects.equals(unrealisedCost, position.unrealisedCost) &&
        Objects.equals(grossOpenCost, position.grossOpenCost) &&
        Objects.equals(grossOpenPremium, position.grossOpenPremium) &&
        Objects.equals(grossExecCost, position.grossExecCost) &&
        Objects.equals(isOpen, position.isOpen) &&
        Objects.equals(markPrice, position.markPrice) &&
        Objects.equals(markValue, position.markValue) &&
        Objects.equals(homeNotional, position.homeNotional) &&
        Objects.equals(foreignNotional, position.foreignNotional) &&
        Objects.equals(posState, position.posState) &&
        Objects.equals(posCost, position.posCost) &&
        Objects.equals(posCost2, position.posCost2) &&
        Objects.equals(posCross, position.posCross) &&
        Objects.equals(posInit, position.posInit) &&
        Objects.equals(posComm, position.posComm) &&
        Objects.equals(posLoss, position.posLoss) &&
        Objects.equals(posMargin, position.posMargin) &&
        Objects.equals(posMaint, position.posMaint) &&
        Objects.equals(posAllowance, position.posAllowance) &&
        Objects.equals(taxableMargin, position.taxableMargin) &&
        Objects.equals(initMargin, position.initMargin) &&
        Objects.equals(maintMargin, position.maintMargin) &&
        Objects.equals(sessionMargin, position.sessionMargin) &&
        Objects.equals(targetExcessMargin, position.targetExcessMargin) &&
        Objects.equals(varMargin, position.varMargin) &&
        Objects.equals(realisedGrossPnl, position.realisedGrossPnl) &&
        Objects.equals(realisedTax, position.realisedTax) &&
        Objects.equals(realisedPnl, position.realisedPnl) &&
        Objects.equals(unrealisedGrossPnl, position.unrealisedGrossPnl) &&
        Objects.equals(longBankrupt, position.longBankrupt) &&
        Objects.equals(shortBankrupt, position.shortBankrupt) &&
        Objects.equals(taxBase, position.taxBase) &&
        Objects.equals(indicativeTaxRate, position.indicativeTaxRate) &&
        Objects.equals(indicativeTax, position.indicativeTax) &&
        Objects.equals(unrealisedTax, position.unrealisedTax) &&
        Objects.equals(unrealisedPnl, position.unrealisedPnl) &&
        Objects.equals(unrealisedPnlPcnt, position.unrealisedPnlPcnt) &&
        Objects.equals(unrealisedRoePcnt, position.unrealisedRoePcnt) &&
        Objects.equals(simpleQty, position.simpleQty) &&
        Objects.equals(simpleCost, position.simpleCost) &&
        Objects.equals(simpleValue, position.simpleValue) &&
        Objects.equals(simplePnl, position.simplePnl) &&
        Objects.equals(simplePnlPcnt, position.simplePnlPcnt) &&
        Objects.equals(avgCostPrice, position.avgCostPrice) &&
        Objects.equals(avgEntryPrice, position.avgEntryPrice) &&
        Objects.equals(breakEvenPrice, position.breakEvenPrice) &&
        Objects.equals(marginCallPrice, position.marginCallPrice) &&
        Objects.equals(liquidationPrice, position.liquidationPrice) &&
        Objects.equals(bankruptPrice, position.bankruptPrice) &&
        Objects.equals(timestamp, position.timestamp) &&
        Objects.equals(lastPrice, position.lastPrice) &&
        Objects.equals(lastValue, position.lastValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(account, symbol, currency, underlying, quoteCurrency, commission, leverage, crossMargin, rebalancedPnl, prevRealisedPnl, prevUnrealisedPnl, prevClosePrice, openingTimestamp, openingQty, openingCost, openingComm, openOrderBuyQty, openOrderBuyCost, openOrderBuyPremium, openOrderSellQty, openOrderSellCost, openOrderSellPremium, execBuyQty, execBuyCost, execSellQty, execSellCost, execQty, execCost, execComm, currentTimestamp, currentQty, currentCost, currentComm, realisedCost, unrealisedCost, grossOpenCost, grossOpenPremium, grossExecCost, isOpen, markPrice, markValue, homeNotional, foreignNotional, posState, posCost, posCost2, posCross, posInit, posComm, posLoss, posMargin, posMaint, posAllowance, taxableMargin, initMargin, maintMargin, sessionMargin, targetExcessMargin, varMargin, realisedGrossPnl, realisedTax, realisedPnl, unrealisedGrossPnl, longBankrupt, shortBankrupt, taxBase, indicativeTaxRate, indicativeTax, unrealisedTax, unrealisedPnl, unrealisedPnlPcnt, unrealisedRoePcnt, simpleQty, simpleCost, simpleValue, simplePnl, simplePnlPcnt, avgCostPrice, avgEntryPrice, breakEvenPrice, marginCallPrice, liquidationPrice, bankruptPrice, timestamp, lastPrice, lastValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Position {\n");
    
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    underlying: ").append(toIndentedString(underlying)).append("\n");
    sb.append("    quoteCurrency: ").append(toIndentedString(quoteCurrency)).append("\n");
    sb.append("    commission: ").append(toIndentedString(commission)).append("\n");
    sb.append("    leverage: ").append(toIndentedString(leverage)).append("\n");
    sb.append("    crossMargin: ").append(toIndentedString(crossMargin)).append("\n");
    sb.append("    rebalancedPnl: ").append(toIndentedString(rebalancedPnl)).append("\n");
    sb.append("    prevRealisedPnl: ").append(toIndentedString(prevRealisedPnl)).append("\n");
    sb.append("    prevUnrealisedPnl: ").append(toIndentedString(prevUnrealisedPnl)).append("\n");
    sb.append("    prevClosePrice: ").append(toIndentedString(prevClosePrice)).append("\n");
    sb.append("    openingTimestamp: ").append(toIndentedString(openingTimestamp)).append("\n");
    sb.append("    openingQty: ").append(toIndentedString(openingQty)).append("\n");
    sb.append("    openingCost: ").append(toIndentedString(openingCost)).append("\n");
    sb.append("    openingComm: ").append(toIndentedString(openingComm)).append("\n");
    sb.append("    openOrderBuyQty: ").append(toIndentedString(openOrderBuyQty)).append("\n");
    sb.append("    openOrderBuyCost: ").append(toIndentedString(openOrderBuyCost)).append("\n");
    sb.append("    openOrderBuyPremium: ").append(toIndentedString(openOrderBuyPremium)).append("\n");
    sb.append("    openOrderSellQty: ").append(toIndentedString(openOrderSellQty)).append("\n");
    sb.append("    openOrderSellCost: ").append(toIndentedString(openOrderSellCost)).append("\n");
    sb.append("    openOrderSellPremium: ").append(toIndentedString(openOrderSellPremium)).append("\n");
    sb.append("    execBuyQty: ").append(toIndentedString(execBuyQty)).append("\n");
    sb.append("    execBuyCost: ").append(toIndentedString(execBuyCost)).append("\n");
    sb.append("    execSellQty: ").append(toIndentedString(execSellQty)).append("\n");
    sb.append("    execSellCost: ").append(toIndentedString(execSellCost)).append("\n");
    sb.append("    execQty: ").append(toIndentedString(execQty)).append("\n");
    sb.append("    execCost: ").append(toIndentedString(execCost)).append("\n");
    sb.append("    execComm: ").append(toIndentedString(execComm)).append("\n");
    sb.append("    currentTimestamp: ").append(toIndentedString(currentTimestamp)).append("\n");
    sb.append("    currentQty: ").append(toIndentedString(currentQty)).append("\n");
    sb.append("    currentCost: ").append(toIndentedString(currentCost)).append("\n");
    sb.append("    currentComm: ").append(toIndentedString(currentComm)).append("\n");
    sb.append("    realisedCost: ").append(toIndentedString(realisedCost)).append("\n");
    sb.append("    unrealisedCost: ").append(toIndentedString(unrealisedCost)).append("\n");
    sb.append("    grossOpenCost: ").append(toIndentedString(grossOpenCost)).append("\n");
    sb.append("    grossOpenPremium: ").append(toIndentedString(grossOpenPremium)).append("\n");
    sb.append("    grossExecCost: ").append(toIndentedString(grossExecCost)).append("\n");
    sb.append("    isOpen: ").append(toIndentedString(isOpen)).append("\n");
    sb.append("    markPrice: ").append(toIndentedString(markPrice)).append("\n");
    sb.append("    markValue: ").append(toIndentedString(markValue)).append("\n");
    sb.append("    homeNotional: ").append(toIndentedString(homeNotional)).append("\n");
    sb.append("    foreignNotional: ").append(toIndentedString(foreignNotional)).append("\n");
    sb.append("    posState: ").append(toIndentedString(posState)).append("\n");
    sb.append("    posCost: ").append(toIndentedString(posCost)).append("\n");
    sb.append("    posCost2: ").append(toIndentedString(posCost2)).append("\n");
    sb.append("    posCross: ").append(toIndentedString(posCross)).append("\n");
    sb.append("    posInit: ").append(toIndentedString(posInit)).append("\n");
    sb.append("    posComm: ").append(toIndentedString(posComm)).append("\n");
    sb.append("    posLoss: ").append(toIndentedString(posLoss)).append("\n");
    sb.append("    posMargin: ").append(toIndentedString(posMargin)).append("\n");
    sb.append("    posMaint: ").append(toIndentedString(posMaint)).append("\n");
    sb.append("    posAllowance: ").append(toIndentedString(posAllowance)).append("\n");
    sb.append("    taxableMargin: ").append(toIndentedString(taxableMargin)).append("\n");
    sb.append("    initMargin: ").append(toIndentedString(initMargin)).append("\n");
    sb.append("    maintMargin: ").append(toIndentedString(maintMargin)).append("\n");
    sb.append("    sessionMargin: ").append(toIndentedString(sessionMargin)).append("\n");
    sb.append("    targetExcessMargin: ").append(toIndentedString(targetExcessMargin)).append("\n");
    sb.append("    varMargin: ").append(toIndentedString(varMargin)).append("\n");
    sb.append("    realisedGrossPnl: ").append(toIndentedString(realisedGrossPnl)).append("\n");
    sb.append("    realisedTax: ").append(toIndentedString(realisedTax)).append("\n");
    sb.append("    realisedPnl: ").append(toIndentedString(realisedPnl)).append("\n");
    sb.append("    unrealisedGrossPnl: ").append(toIndentedString(unrealisedGrossPnl)).append("\n");
    sb.append("    longBankrupt: ").append(toIndentedString(longBankrupt)).append("\n");
    sb.append("    shortBankrupt: ").append(toIndentedString(shortBankrupt)).append("\n");
    sb.append("    taxBase: ").append(toIndentedString(taxBase)).append("\n");
    sb.append("    indicativeTaxRate: ").append(toIndentedString(indicativeTaxRate)).append("\n");
    sb.append("    indicativeTax: ").append(toIndentedString(indicativeTax)).append("\n");
    sb.append("    unrealisedTax: ").append(toIndentedString(unrealisedTax)).append("\n");
    sb.append("    unrealisedPnl: ").append(toIndentedString(unrealisedPnl)).append("\n");
    sb.append("    unrealisedPnlPcnt: ").append(toIndentedString(unrealisedPnlPcnt)).append("\n");
    sb.append("    unrealisedRoePcnt: ").append(toIndentedString(unrealisedRoePcnt)).append("\n");
    sb.append("    simpleQty: ").append(toIndentedString(simpleQty)).append("\n");
    sb.append("    simpleCost: ").append(toIndentedString(simpleCost)).append("\n");
    sb.append("    simpleValue: ").append(toIndentedString(simpleValue)).append("\n");
    sb.append("    simplePnl: ").append(toIndentedString(simplePnl)).append("\n");
    sb.append("    simplePnlPcnt: ").append(toIndentedString(simplePnlPcnt)).append("\n");
    sb.append("    avgCostPrice: ").append(toIndentedString(avgCostPrice)).append("\n");
    sb.append("    avgEntryPrice: ").append(toIndentedString(avgEntryPrice)).append("\n");
    sb.append("    breakEvenPrice: ").append(toIndentedString(breakEvenPrice)).append("\n");
    sb.append("    marginCallPrice: ").append(toIndentedString(marginCallPrice)).append("\n");
    sb.append("    liquidationPrice: ").append(toIndentedString(liquidationPrice)).append("\n");
    sb.append("    bankruptPrice: ").append(toIndentedString(bankruptPrice)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    lastPrice: ").append(toIndentedString(lastPrice)).append("\n");
    sb.append("    lastValue: ").append(toIndentedString(lastValue)).append("\n");
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

