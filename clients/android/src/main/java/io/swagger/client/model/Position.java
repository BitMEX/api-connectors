package io.swagger.client.model;

import java.math.BigDecimal;
import java.util.Date;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class Position  {
  
  @SerializedName("account")
  private BigDecimal account = null;
  @SerializedName("symbol")
  private String symbol = null;
  @SerializedName("currency")
  private String currency = null;
  @SerializedName("underlying")
  private String underlying = null;
  @SerializedName("quoteCurrency")
  private String quoteCurrency = null;
  @SerializedName("commission")
  private Double commission = 0.0;
  @SerializedName("initMarginReq")
  private Double initMarginReq = 0.0;
  @SerializedName("maintMarginReq")
  private Double maintMarginReq = 0.0;
  @SerializedName("riskLimit")
  private BigDecimal riskLimit = null;
  @SerializedName("leverage")
  private Double leverage = 0.0;
  @SerializedName("crossMargin")
  private Boolean crossMargin = null;
  @SerializedName("deleveragePercentile")
  private Double deleveragePercentile = 0.0;
  @SerializedName("rebalancedPnl")
  private BigDecimal rebalancedPnl = null;
  @SerializedName("prevRealisedPnl")
  private BigDecimal prevRealisedPnl = null;
  @SerializedName("prevUnrealisedPnl")
  private BigDecimal prevUnrealisedPnl = null;
  @SerializedName("prevClosePrice")
  private Double prevClosePrice = 0.0;
  @SerializedName("openingTimestamp")
  private Date openingTimestamp = null;
  @SerializedName("openingQty")
  private BigDecimal openingQty = null;
  @SerializedName("openingCost")
  private BigDecimal openingCost = null;
  @SerializedName("openingComm")
  private BigDecimal openingComm = null;
  @SerializedName("openOrderBuyQty")
  private BigDecimal openOrderBuyQty = null;
  @SerializedName("openOrderBuyCost")
  private BigDecimal openOrderBuyCost = null;
  @SerializedName("openOrderBuyPremium")
  private BigDecimal openOrderBuyPremium = null;
  @SerializedName("openOrderSellQty")
  private BigDecimal openOrderSellQty = null;
  @SerializedName("openOrderSellCost")
  private BigDecimal openOrderSellCost = null;
  @SerializedName("openOrderSellPremium")
  private BigDecimal openOrderSellPremium = null;
  @SerializedName("execBuyQty")
  private BigDecimal execBuyQty = null;
  @SerializedName("execBuyCost")
  private BigDecimal execBuyCost = null;
  @SerializedName("execSellQty")
  private BigDecimal execSellQty = null;
  @SerializedName("execSellCost")
  private BigDecimal execSellCost = null;
  @SerializedName("execQty")
  private BigDecimal execQty = null;
  @SerializedName("execCost")
  private BigDecimal execCost = null;
  @SerializedName("execComm")
  private BigDecimal execComm = null;
  @SerializedName("currentTimestamp")
  private Date currentTimestamp = null;
  @SerializedName("currentQty")
  private BigDecimal currentQty = null;
  @SerializedName("currentCost")
  private BigDecimal currentCost = null;
  @SerializedName("currentComm")
  private BigDecimal currentComm = null;
  @SerializedName("realisedCost")
  private BigDecimal realisedCost = null;
  @SerializedName("unrealisedCost")
  private BigDecimal unrealisedCost = null;
  @SerializedName("grossOpenCost")
  private BigDecimal grossOpenCost = null;
  @SerializedName("grossOpenPremium")
  private BigDecimal grossOpenPremium = null;
  @SerializedName("grossExecCost")
  private BigDecimal grossExecCost = null;
  @SerializedName("isOpen")
  private Boolean isOpen = null;
  @SerializedName("markPrice")
  private Double markPrice = 0.0;
  @SerializedName("markValue")
  private BigDecimal markValue = null;
  @SerializedName("riskValue")
  private BigDecimal riskValue = null;
  @SerializedName("homeNotional")
  private Double homeNotional = 0.0;
  @SerializedName("foreignNotional")
  private Double foreignNotional = 0.0;
  @SerializedName("posState")
  private String posState = null;
  @SerializedName("posCost")
  private BigDecimal posCost = null;
  @SerializedName("posCost2")
  private BigDecimal posCost2 = null;
  @SerializedName("posCross")
  private BigDecimal posCross = null;
  @SerializedName("posInit")
  private BigDecimal posInit = null;
  @SerializedName("posComm")
  private BigDecimal posComm = null;
  @SerializedName("posLoss")
  private BigDecimal posLoss = null;
  @SerializedName("posMargin")
  private BigDecimal posMargin = null;
  @SerializedName("posMaint")
  private BigDecimal posMaint = null;
  @SerializedName("posAllowance")
  private BigDecimal posAllowance = null;
  @SerializedName("taxableMargin")
  private BigDecimal taxableMargin = null;
  @SerializedName("initMargin")
  private BigDecimal initMargin = null;
  @SerializedName("maintMargin")
  private BigDecimal maintMargin = null;
  @SerializedName("sessionMargin")
  private BigDecimal sessionMargin = null;
  @SerializedName("targetExcessMargin")
  private BigDecimal targetExcessMargin = null;
  @SerializedName("varMargin")
  private BigDecimal varMargin = null;
  @SerializedName("realisedGrossPnl")
  private BigDecimal realisedGrossPnl = null;
  @SerializedName("realisedTax")
  private BigDecimal realisedTax = null;
  @SerializedName("realisedPnl")
  private BigDecimal realisedPnl = null;
  @SerializedName("unrealisedGrossPnl")
  private BigDecimal unrealisedGrossPnl = null;
  @SerializedName("longBankrupt")
  private BigDecimal longBankrupt = null;
  @SerializedName("shortBankrupt")
  private BigDecimal shortBankrupt = null;
  @SerializedName("taxBase")
  private BigDecimal taxBase = null;
  @SerializedName("indicativeTaxRate")
  private Double indicativeTaxRate = 0.0;
  @SerializedName("indicativeTax")
  private BigDecimal indicativeTax = null;
  @SerializedName("unrealisedTax")
  private BigDecimal unrealisedTax = null;
  @SerializedName("unrealisedPnl")
  private BigDecimal unrealisedPnl = null;
  @SerializedName("unrealisedPnlPcnt")
  private Double unrealisedPnlPcnt = 0.0;
  @SerializedName("unrealisedRoePcnt")
  private Double unrealisedRoePcnt = 0.0;
  @SerializedName("simpleQty")
  private Double simpleQty = 0.0;
  @SerializedName("simpleCost")
  private Double simpleCost = 0.0;
  @SerializedName("simpleValue")
  private Double simpleValue = 0.0;
  @SerializedName("simplePnl")
  private Double simplePnl = 0.0;
  @SerializedName("simplePnlPcnt")
  private Double simplePnlPcnt = 0.0;
  @SerializedName("avgCostPrice")
  private Double avgCostPrice = 0.0;
  @SerializedName("avgEntryPrice")
  private Double avgEntryPrice = 0.0;
  @SerializedName("breakEvenPrice")
  private Double breakEvenPrice = 0.0;
  @SerializedName("marginCallPrice")
  private Double marginCallPrice = 0.0;
  @SerializedName("liquidationPrice")
  private Double liquidationPrice = 0.0;
  @SerializedName("bankruptPrice")
  private Double bankruptPrice = 0.0;
  @SerializedName("timestamp")
  private Date timestamp = null;
  @SerializedName("lastPrice")
  private Double lastPrice = 0.0;
  @SerializedName("lastValue")
  private BigDecimal lastValue = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public BigDecimal getAccount() {
    return account;
  }
  public void setAccount(BigDecimal account) {
    this.account = account;
  }

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
  @ApiModelProperty(required = true, value = "")
  public String getCurrency() {
    return currency;
  }
  public void setCurrency(String currency) {
    this.currency = currency;
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
  public Double getCommission() {
    return commission;
  }
  public void setCommission(Double commission) {
    this.commission = commission;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Double getInitMarginReq() {
    return initMarginReq;
  }
  public void setInitMarginReq(Double initMarginReq) {
    this.initMarginReq = initMarginReq;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Double getMaintMarginReq() {
    return maintMarginReq;
  }
  public void setMaintMarginReq(Double maintMarginReq) {
    this.maintMarginReq = maintMarginReq;
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
  public Double getLeverage() {
    return leverage;
  }
  public void setLeverage(Double leverage) {
    this.leverage = leverage;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getCrossMargin() {
    return crossMargin;
  }
  public void setCrossMargin(Boolean crossMargin) {
    this.crossMargin = crossMargin;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Double getDeleveragePercentile() {
    return deleveragePercentile;
  }
  public void setDeleveragePercentile(Double deleveragePercentile) {
    this.deleveragePercentile = deleveragePercentile;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getRebalancedPnl() {
    return rebalancedPnl;
  }
  public void setRebalancedPnl(BigDecimal rebalancedPnl) {
    this.rebalancedPnl = rebalancedPnl;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getPrevRealisedPnl() {
    return prevRealisedPnl;
  }
  public void setPrevRealisedPnl(BigDecimal prevRealisedPnl) {
    this.prevRealisedPnl = prevRealisedPnl;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getPrevUnrealisedPnl() {
    return prevUnrealisedPnl;
  }
  public void setPrevUnrealisedPnl(BigDecimal prevUnrealisedPnl) {
    this.prevUnrealisedPnl = prevUnrealisedPnl;
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
  public Date getOpeningTimestamp() {
    return openingTimestamp;
  }
  public void setOpeningTimestamp(Date openingTimestamp) {
    this.openingTimestamp = openingTimestamp;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getOpeningQty() {
    return openingQty;
  }
  public void setOpeningQty(BigDecimal openingQty) {
    this.openingQty = openingQty;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getOpeningCost() {
    return openingCost;
  }
  public void setOpeningCost(BigDecimal openingCost) {
    this.openingCost = openingCost;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getOpeningComm() {
    return openingComm;
  }
  public void setOpeningComm(BigDecimal openingComm) {
    this.openingComm = openingComm;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getOpenOrderBuyQty() {
    return openOrderBuyQty;
  }
  public void setOpenOrderBuyQty(BigDecimal openOrderBuyQty) {
    this.openOrderBuyQty = openOrderBuyQty;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getOpenOrderBuyCost() {
    return openOrderBuyCost;
  }
  public void setOpenOrderBuyCost(BigDecimal openOrderBuyCost) {
    this.openOrderBuyCost = openOrderBuyCost;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getOpenOrderBuyPremium() {
    return openOrderBuyPremium;
  }
  public void setOpenOrderBuyPremium(BigDecimal openOrderBuyPremium) {
    this.openOrderBuyPremium = openOrderBuyPremium;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getOpenOrderSellQty() {
    return openOrderSellQty;
  }
  public void setOpenOrderSellQty(BigDecimal openOrderSellQty) {
    this.openOrderSellQty = openOrderSellQty;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getOpenOrderSellCost() {
    return openOrderSellCost;
  }
  public void setOpenOrderSellCost(BigDecimal openOrderSellCost) {
    this.openOrderSellCost = openOrderSellCost;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getOpenOrderSellPremium() {
    return openOrderSellPremium;
  }
  public void setOpenOrderSellPremium(BigDecimal openOrderSellPremium) {
    this.openOrderSellPremium = openOrderSellPremium;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getExecBuyQty() {
    return execBuyQty;
  }
  public void setExecBuyQty(BigDecimal execBuyQty) {
    this.execBuyQty = execBuyQty;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getExecBuyCost() {
    return execBuyCost;
  }
  public void setExecBuyCost(BigDecimal execBuyCost) {
    this.execBuyCost = execBuyCost;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getExecSellQty() {
    return execSellQty;
  }
  public void setExecSellQty(BigDecimal execSellQty) {
    this.execSellQty = execSellQty;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getExecSellCost() {
    return execSellCost;
  }
  public void setExecSellCost(BigDecimal execSellCost) {
    this.execSellCost = execSellCost;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getExecQty() {
    return execQty;
  }
  public void setExecQty(BigDecimal execQty) {
    this.execQty = execQty;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getExecCost() {
    return execCost;
  }
  public void setExecCost(BigDecimal execCost) {
    this.execCost = execCost;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getExecComm() {
    return execComm;
  }
  public void setExecComm(BigDecimal execComm) {
    this.execComm = execComm;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Date getCurrentTimestamp() {
    return currentTimestamp;
  }
  public void setCurrentTimestamp(Date currentTimestamp) {
    this.currentTimestamp = currentTimestamp;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getCurrentQty() {
    return currentQty;
  }
  public void setCurrentQty(BigDecimal currentQty) {
    this.currentQty = currentQty;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getCurrentCost() {
    return currentCost;
  }
  public void setCurrentCost(BigDecimal currentCost) {
    this.currentCost = currentCost;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getCurrentComm() {
    return currentComm;
  }
  public void setCurrentComm(BigDecimal currentComm) {
    this.currentComm = currentComm;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getRealisedCost() {
    return realisedCost;
  }
  public void setRealisedCost(BigDecimal realisedCost) {
    this.realisedCost = realisedCost;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getUnrealisedCost() {
    return unrealisedCost;
  }
  public void setUnrealisedCost(BigDecimal unrealisedCost) {
    this.unrealisedCost = unrealisedCost;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getGrossOpenCost() {
    return grossOpenCost;
  }
  public void setGrossOpenCost(BigDecimal grossOpenCost) {
    this.grossOpenCost = grossOpenCost;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getGrossOpenPremium() {
    return grossOpenPremium;
  }
  public void setGrossOpenPremium(BigDecimal grossOpenPremium) {
    this.grossOpenPremium = grossOpenPremium;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getGrossExecCost() {
    return grossExecCost;
  }
  public void setGrossExecCost(BigDecimal grossExecCost) {
    this.grossExecCost = grossExecCost;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getIsOpen() {
    return isOpen;
  }
  public void setIsOpen(Boolean isOpen) {
    this.isOpen = isOpen;
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
  public BigDecimal getMarkValue() {
    return markValue;
  }
  public void setMarkValue(BigDecimal markValue) {
    this.markValue = markValue;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getRiskValue() {
    return riskValue;
  }
  public void setRiskValue(BigDecimal riskValue) {
    this.riskValue = riskValue;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Double getHomeNotional() {
    return homeNotional;
  }
  public void setHomeNotional(Double homeNotional) {
    this.homeNotional = homeNotional;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Double getForeignNotional() {
    return foreignNotional;
  }
  public void setForeignNotional(Double foreignNotional) {
    this.foreignNotional = foreignNotional;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getPosState() {
    return posState;
  }
  public void setPosState(String posState) {
    this.posState = posState;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getPosCost() {
    return posCost;
  }
  public void setPosCost(BigDecimal posCost) {
    this.posCost = posCost;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getPosCost2() {
    return posCost2;
  }
  public void setPosCost2(BigDecimal posCost2) {
    this.posCost2 = posCost2;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getPosCross() {
    return posCross;
  }
  public void setPosCross(BigDecimal posCross) {
    this.posCross = posCross;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getPosInit() {
    return posInit;
  }
  public void setPosInit(BigDecimal posInit) {
    this.posInit = posInit;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getPosComm() {
    return posComm;
  }
  public void setPosComm(BigDecimal posComm) {
    this.posComm = posComm;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getPosLoss() {
    return posLoss;
  }
  public void setPosLoss(BigDecimal posLoss) {
    this.posLoss = posLoss;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getPosMargin() {
    return posMargin;
  }
  public void setPosMargin(BigDecimal posMargin) {
    this.posMargin = posMargin;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getPosMaint() {
    return posMaint;
  }
  public void setPosMaint(BigDecimal posMaint) {
    this.posMaint = posMaint;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getPosAllowance() {
    return posAllowance;
  }
  public void setPosAllowance(BigDecimal posAllowance) {
    this.posAllowance = posAllowance;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getTaxableMargin() {
    return taxableMargin;
  }
  public void setTaxableMargin(BigDecimal taxableMargin) {
    this.taxableMargin = taxableMargin;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getInitMargin() {
    return initMargin;
  }
  public void setInitMargin(BigDecimal initMargin) {
    this.initMargin = initMargin;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getMaintMargin() {
    return maintMargin;
  }
  public void setMaintMargin(BigDecimal maintMargin) {
    this.maintMargin = maintMargin;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getSessionMargin() {
    return sessionMargin;
  }
  public void setSessionMargin(BigDecimal sessionMargin) {
    this.sessionMargin = sessionMargin;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getTargetExcessMargin() {
    return targetExcessMargin;
  }
  public void setTargetExcessMargin(BigDecimal targetExcessMargin) {
    this.targetExcessMargin = targetExcessMargin;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getVarMargin() {
    return varMargin;
  }
  public void setVarMargin(BigDecimal varMargin) {
    this.varMargin = varMargin;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getRealisedGrossPnl() {
    return realisedGrossPnl;
  }
  public void setRealisedGrossPnl(BigDecimal realisedGrossPnl) {
    this.realisedGrossPnl = realisedGrossPnl;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getRealisedTax() {
    return realisedTax;
  }
  public void setRealisedTax(BigDecimal realisedTax) {
    this.realisedTax = realisedTax;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getRealisedPnl() {
    return realisedPnl;
  }
  public void setRealisedPnl(BigDecimal realisedPnl) {
    this.realisedPnl = realisedPnl;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getUnrealisedGrossPnl() {
    return unrealisedGrossPnl;
  }
  public void setUnrealisedGrossPnl(BigDecimal unrealisedGrossPnl) {
    this.unrealisedGrossPnl = unrealisedGrossPnl;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getLongBankrupt() {
    return longBankrupt;
  }
  public void setLongBankrupt(BigDecimal longBankrupt) {
    this.longBankrupt = longBankrupt;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getShortBankrupt() {
    return shortBankrupt;
  }
  public void setShortBankrupt(BigDecimal shortBankrupt) {
    this.shortBankrupt = shortBankrupt;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getTaxBase() {
    return taxBase;
  }
  public void setTaxBase(BigDecimal taxBase) {
    this.taxBase = taxBase;
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
  public BigDecimal getIndicativeTax() {
    return indicativeTax;
  }
  public void setIndicativeTax(BigDecimal indicativeTax) {
    this.indicativeTax = indicativeTax;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getUnrealisedTax() {
    return unrealisedTax;
  }
  public void setUnrealisedTax(BigDecimal unrealisedTax) {
    this.unrealisedTax = unrealisedTax;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getUnrealisedPnl() {
    return unrealisedPnl;
  }
  public void setUnrealisedPnl(BigDecimal unrealisedPnl) {
    this.unrealisedPnl = unrealisedPnl;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Double getUnrealisedPnlPcnt() {
    return unrealisedPnlPcnt;
  }
  public void setUnrealisedPnlPcnt(Double unrealisedPnlPcnt) {
    this.unrealisedPnlPcnt = unrealisedPnlPcnt;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Double getUnrealisedRoePcnt() {
    return unrealisedRoePcnt;
  }
  public void setUnrealisedRoePcnt(Double unrealisedRoePcnt) {
    this.unrealisedRoePcnt = unrealisedRoePcnt;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Double getSimpleQty() {
    return simpleQty;
  }
  public void setSimpleQty(Double simpleQty) {
    this.simpleQty = simpleQty;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Double getSimpleCost() {
    return simpleCost;
  }
  public void setSimpleCost(Double simpleCost) {
    this.simpleCost = simpleCost;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Double getSimpleValue() {
    return simpleValue;
  }
  public void setSimpleValue(Double simpleValue) {
    this.simpleValue = simpleValue;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Double getSimplePnl() {
    return simplePnl;
  }
  public void setSimplePnl(Double simplePnl) {
    this.simplePnl = simplePnl;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Double getSimplePnlPcnt() {
    return simplePnlPcnt;
  }
  public void setSimplePnlPcnt(Double simplePnlPcnt) {
    this.simplePnlPcnt = simplePnlPcnt;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Double getAvgCostPrice() {
    return avgCostPrice;
  }
  public void setAvgCostPrice(Double avgCostPrice) {
    this.avgCostPrice = avgCostPrice;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Double getAvgEntryPrice() {
    return avgEntryPrice;
  }
  public void setAvgEntryPrice(Double avgEntryPrice) {
    this.avgEntryPrice = avgEntryPrice;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Double getBreakEvenPrice() {
    return breakEvenPrice;
  }
  public void setBreakEvenPrice(Double breakEvenPrice) {
    this.breakEvenPrice = breakEvenPrice;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Double getMarginCallPrice() {
    return marginCallPrice;
  }
  public void setMarginCallPrice(Double marginCallPrice) {
    this.marginCallPrice = marginCallPrice;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Double getLiquidationPrice() {
    return liquidationPrice;
  }
  public void setLiquidationPrice(Double liquidationPrice) {
    this.liquidationPrice = liquidationPrice;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Double getBankruptPrice() {
    return bankruptPrice;
  }
  public void setBankruptPrice(Double bankruptPrice) {
    this.bankruptPrice = bankruptPrice;
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
    return (account == null ? position.account == null : account.equals(position.account)) &&
        (symbol == null ? position.symbol == null : symbol.equals(position.symbol)) &&
        (currency == null ? position.currency == null : currency.equals(position.currency)) &&
        (underlying == null ? position.underlying == null : underlying.equals(position.underlying)) &&
        (quoteCurrency == null ? position.quoteCurrency == null : quoteCurrency.equals(position.quoteCurrency)) &&
        (commission == null ? position.commission == null : commission.equals(position.commission)) &&
        (initMarginReq == null ? position.initMarginReq == null : initMarginReq.equals(position.initMarginReq)) &&
        (maintMarginReq == null ? position.maintMarginReq == null : maintMarginReq.equals(position.maintMarginReq)) &&
        (riskLimit == null ? position.riskLimit == null : riskLimit.equals(position.riskLimit)) &&
        (leverage == null ? position.leverage == null : leverage.equals(position.leverage)) &&
        (crossMargin == null ? position.crossMargin == null : crossMargin.equals(position.crossMargin)) &&
        (deleveragePercentile == null ? position.deleveragePercentile == null : deleveragePercentile.equals(position.deleveragePercentile)) &&
        (rebalancedPnl == null ? position.rebalancedPnl == null : rebalancedPnl.equals(position.rebalancedPnl)) &&
        (prevRealisedPnl == null ? position.prevRealisedPnl == null : prevRealisedPnl.equals(position.prevRealisedPnl)) &&
        (prevUnrealisedPnl == null ? position.prevUnrealisedPnl == null : prevUnrealisedPnl.equals(position.prevUnrealisedPnl)) &&
        (prevClosePrice == null ? position.prevClosePrice == null : prevClosePrice.equals(position.prevClosePrice)) &&
        (openingTimestamp == null ? position.openingTimestamp == null : openingTimestamp.equals(position.openingTimestamp)) &&
        (openingQty == null ? position.openingQty == null : openingQty.equals(position.openingQty)) &&
        (openingCost == null ? position.openingCost == null : openingCost.equals(position.openingCost)) &&
        (openingComm == null ? position.openingComm == null : openingComm.equals(position.openingComm)) &&
        (openOrderBuyQty == null ? position.openOrderBuyQty == null : openOrderBuyQty.equals(position.openOrderBuyQty)) &&
        (openOrderBuyCost == null ? position.openOrderBuyCost == null : openOrderBuyCost.equals(position.openOrderBuyCost)) &&
        (openOrderBuyPremium == null ? position.openOrderBuyPremium == null : openOrderBuyPremium.equals(position.openOrderBuyPremium)) &&
        (openOrderSellQty == null ? position.openOrderSellQty == null : openOrderSellQty.equals(position.openOrderSellQty)) &&
        (openOrderSellCost == null ? position.openOrderSellCost == null : openOrderSellCost.equals(position.openOrderSellCost)) &&
        (openOrderSellPremium == null ? position.openOrderSellPremium == null : openOrderSellPremium.equals(position.openOrderSellPremium)) &&
        (execBuyQty == null ? position.execBuyQty == null : execBuyQty.equals(position.execBuyQty)) &&
        (execBuyCost == null ? position.execBuyCost == null : execBuyCost.equals(position.execBuyCost)) &&
        (execSellQty == null ? position.execSellQty == null : execSellQty.equals(position.execSellQty)) &&
        (execSellCost == null ? position.execSellCost == null : execSellCost.equals(position.execSellCost)) &&
        (execQty == null ? position.execQty == null : execQty.equals(position.execQty)) &&
        (execCost == null ? position.execCost == null : execCost.equals(position.execCost)) &&
        (execComm == null ? position.execComm == null : execComm.equals(position.execComm)) &&
        (currentTimestamp == null ? position.currentTimestamp == null : currentTimestamp.equals(position.currentTimestamp)) &&
        (currentQty == null ? position.currentQty == null : currentQty.equals(position.currentQty)) &&
        (currentCost == null ? position.currentCost == null : currentCost.equals(position.currentCost)) &&
        (currentComm == null ? position.currentComm == null : currentComm.equals(position.currentComm)) &&
        (realisedCost == null ? position.realisedCost == null : realisedCost.equals(position.realisedCost)) &&
        (unrealisedCost == null ? position.unrealisedCost == null : unrealisedCost.equals(position.unrealisedCost)) &&
        (grossOpenCost == null ? position.grossOpenCost == null : grossOpenCost.equals(position.grossOpenCost)) &&
        (grossOpenPremium == null ? position.grossOpenPremium == null : grossOpenPremium.equals(position.grossOpenPremium)) &&
        (grossExecCost == null ? position.grossExecCost == null : grossExecCost.equals(position.grossExecCost)) &&
        (isOpen == null ? position.isOpen == null : isOpen.equals(position.isOpen)) &&
        (markPrice == null ? position.markPrice == null : markPrice.equals(position.markPrice)) &&
        (markValue == null ? position.markValue == null : markValue.equals(position.markValue)) &&
        (riskValue == null ? position.riskValue == null : riskValue.equals(position.riskValue)) &&
        (homeNotional == null ? position.homeNotional == null : homeNotional.equals(position.homeNotional)) &&
        (foreignNotional == null ? position.foreignNotional == null : foreignNotional.equals(position.foreignNotional)) &&
        (posState == null ? position.posState == null : posState.equals(position.posState)) &&
        (posCost == null ? position.posCost == null : posCost.equals(position.posCost)) &&
        (posCost2 == null ? position.posCost2 == null : posCost2.equals(position.posCost2)) &&
        (posCross == null ? position.posCross == null : posCross.equals(position.posCross)) &&
        (posInit == null ? position.posInit == null : posInit.equals(position.posInit)) &&
        (posComm == null ? position.posComm == null : posComm.equals(position.posComm)) &&
        (posLoss == null ? position.posLoss == null : posLoss.equals(position.posLoss)) &&
        (posMargin == null ? position.posMargin == null : posMargin.equals(position.posMargin)) &&
        (posMaint == null ? position.posMaint == null : posMaint.equals(position.posMaint)) &&
        (posAllowance == null ? position.posAllowance == null : posAllowance.equals(position.posAllowance)) &&
        (taxableMargin == null ? position.taxableMargin == null : taxableMargin.equals(position.taxableMargin)) &&
        (initMargin == null ? position.initMargin == null : initMargin.equals(position.initMargin)) &&
        (maintMargin == null ? position.maintMargin == null : maintMargin.equals(position.maintMargin)) &&
        (sessionMargin == null ? position.sessionMargin == null : sessionMargin.equals(position.sessionMargin)) &&
        (targetExcessMargin == null ? position.targetExcessMargin == null : targetExcessMargin.equals(position.targetExcessMargin)) &&
        (varMargin == null ? position.varMargin == null : varMargin.equals(position.varMargin)) &&
        (realisedGrossPnl == null ? position.realisedGrossPnl == null : realisedGrossPnl.equals(position.realisedGrossPnl)) &&
        (realisedTax == null ? position.realisedTax == null : realisedTax.equals(position.realisedTax)) &&
        (realisedPnl == null ? position.realisedPnl == null : realisedPnl.equals(position.realisedPnl)) &&
        (unrealisedGrossPnl == null ? position.unrealisedGrossPnl == null : unrealisedGrossPnl.equals(position.unrealisedGrossPnl)) &&
        (longBankrupt == null ? position.longBankrupt == null : longBankrupt.equals(position.longBankrupt)) &&
        (shortBankrupt == null ? position.shortBankrupt == null : shortBankrupt.equals(position.shortBankrupt)) &&
        (taxBase == null ? position.taxBase == null : taxBase.equals(position.taxBase)) &&
        (indicativeTaxRate == null ? position.indicativeTaxRate == null : indicativeTaxRate.equals(position.indicativeTaxRate)) &&
        (indicativeTax == null ? position.indicativeTax == null : indicativeTax.equals(position.indicativeTax)) &&
        (unrealisedTax == null ? position.unrealisedTax == null : unrealisedTax.equals(position.unrealisedTax)) &&
        (unrealisedPnl == null ? position.unrealisedPnl == null : unrealisedPnl.equals(position.unrealisedPnl)) &&
        (unrealisedPnlPcnt == null ? position.unrealisedPnlPcnt == null : unrealisedPnlPcnt.equals(position.unrealisedPnlPcnt)) &&
        (unrealisedRoePcnt == null ? position.unrealisedRoePcnt == null : unrealisedRoePcnt.equals(position.unrealisedRoePcnt)) &&
        (simpleQty == null ? position.simpleQty == null : simpleQty.equals(position.simpleQty)) &&
        (simpleCost == null ? position.simpleCost == null : simpleCost.equals(position.simpleCost)) &&
        (simpleValue == null ? position.simpleValue == null : simpleValue.equals(position.simpleValue)) &&
        (simplePnl == null ? position.simplePnl == null : simplePnl.equals(position.simplePnl)) &&
        (simplePnlPcnt == null ? position.simplePnlPcnt == null : simplePnlPcnt.equals(position.simplePnlPcnt)) &&
        (avgCostPrice == null ? position.avgCostPrice == null : avgCostPrice.equals(position.avgCostPrice)) &&
        (avgEntryPrice == null ? position.avgEntryPrice == null : avgEntryPrice.equals(position.avgEntryPrice)) &&
        (breakEvenPrice == null ? position.breakEvenPrice == null : breakEvenPrice.equals(position.breakEvenPrice)) &&
        (marginCallPrice == null ? position.marginCallPrice == null : marginCallPrice.equals(position.marginCallPrice)) &&
        (liquidationPrice == null ? position.liquidationPrice == null : liquidationPrice.equals(position.liquidationPrice)) &&
        (bankruptPrice == null ? position.bankruptPrice == null : bankruptPrice.equals(position.bankruptPrice)) &&
        (timestamp == null ? position.timestamp == null : timestamp.equals(position.timestamp)) &&
        (lastPrice == null ? position.lastPrice == null : lastPrice.equals(position.lastPrice)) &&
        (lastValue == null ? position.lastValue == null : lastValue.equals(position.lastValue));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (account == null ? 0: account.hashCode());
    result = 31 * result + (symbol == null ? 0: symbol.hashCode());
    result = 31 * result + (currency == null ? 0: currency.hashCode());
    result = 31 * result + (underlying == null ? 0: underlying.hashCode());
    result = 31 * result + (quoteCurrency == null ? 0: quoteCurrency.hashCode());
    result = 31 * result + (commission == null ? 0: commission.hashCode());
    result = 31 * result + (initMarginReq == null ? 0: initMarginReq.hashCode());
    result = 31 * result + (maintMarginReq == null ? 0: maintMarginReq.hashCode());
    result = 31 * result + (riskLimit == null ? 0: riskLimit.hashCode());
    result = 31 * result + (leverage == null ? 0: leverage.hashCode());
    result = 31 * result + (crossMargin == null ? 0: crossMargin.hashCode());
    result = 31 * result + (deleveragePercentile == null ? 0: deleveragePercentile.hashCode());
    result = 31 * result + (rebalancedPnl == null ? 0: rebalancedPnl.hashCode());
    result = 31 * result + (prevRealisedPnl == null ? 0: prevRealisedPnl.hashCode());
    result = 31 * result + (prevUnrealisedPnl == null ? 0: prevUnrealisedPnl.hashCode());
    result = 31 * result + (prevClosePrice == null ? 0: prevClosePrice.hashCode());
    result = 31 * result + (openingTimestamp == null ? 0: openingTimestamp.hashCode());
    result = 31 * result + (openingQty == null ? 0: openingQty.hashCode());
    result = 31 * result + (openingCost == null ? 0: openingCost.hashCode());
    result = 31 * result + (openingComm == null ? 0: openingComm.hashCode());
    result = 31 * result + (openOrderBuyQty == null ? 0: openOrderBuyQty.hashCode());
    result = 31 * result + (openOrderBuyCost == null ? 0: openOrderBuyCost.hashCode());
    result = 31 * result + (openOrderBuyPremium == null ? 0: openOrderBuyPremium.hashCode());
    result = 31 * result + (openOrderSellQty == null ? 0: openOrderSellQty.hashCode());
    result = 31 * result + (openOrderSellCost == null ? 0: openOrderSellCost.hashCode());
    result = 31 * result + (openOrderSellPremium == null ? 0: openOrderSellPremium.hashCode());
    result = 31 * result + (execBuyQty == null ? 0: execBuyQty.hashCode());
    result = 31 * result + (execBuyCost == null ? 0: execBuyCost.hashCode());
    result = 31 * result + (execSellQty == null ? 0: execSellQty.hashCode());
    result = 31 * result + (execSellCost == null ? 0: execSellCost.hashCode());
    result = 31 * result + (execQty == null ? 0: execQty.hashCode());
    result = 31 * result + (execCost == null ? 0: execCost.hashCode());
    result = 31 * result + (execComm == null ? 0: execComm.hashCode());
    result = 31 * result + (currentTimestamp == null ? 0: currentTimestamp.hashCode());
    result = 31 * result + (currentQty == null ? 0: currentQty.hashCode());
    result = 31 * result + (currentCost == null ? 0: currentCost.hashCode());
    result = 31 * result + (currentComm == null ? 0: currentComm.hashCode());
    result = 31 * result + (realisedCost == null ? 0: realisedCost.hashCode());
    result = 31 * result + (unrealisedCost == null ? 0: unrealisedCost.hashCode());
    result = 31 * result + (grossOpenCost == null ? 0: grossOpenCost.hashCode());
    result = 31 * result + (grossOpenPremium == null ? 0: grossOpenPremium.hashCode());
    result = 31 * result + (grossExecCost == null ? 0: grossExecCost.hashCode());
    result = 31 * result + (isOpen == null ? 0: isOpen.hashCode());
    result = 31 * result + (markPrice == null ? 0: markPrice.hashCode());
    result = 31 * result + (markValue == null ? 0: markValue.hashCode());
    result = 31 * result + (riskValue == null ? 0: riskValue.hashCode());
    result = 31 * result + (homeNotional == null ? 0: homeNotional.hashCode());
    result = 31 * result + (foreignNotional == null ? 0: foreignNotional.hashCode());
    result = 31 * result + (posState == null ? 0: posState.hashCode());
    result = 31 * result + (posCost == null ? 0: posCost.hashCode());
    result = 31 * result + (posCost2 == null ? 0: posCost2.hashCode());
    result = 31 * result + (posCross == null ? 0: posCross.hashCode());
    result = 31 * result + (posInit == null ? 0: posInit.hashCode());
    result = 31 * result + (posComm == null ? 0: posComm.hashCode());
    result = 31 * result + (posLoss == null ? 0: posLoss.hashCode());
    result = 31 * result + (posMargin == null ? 0: posMargin.hashCode());
    result = 31 * result + (posMaint == null ? 0: posMaint.hashCode());
    result = 31 * result + (posAllowance == null ? 0: posAllowance.hashCode());
    result = 31 * result + (taxableMargin == null ? 0: taxableMargin.hashCode());
    result = 31 * result + (initMargin == null ? 0: initMargin.hashCode());
    result = 31 * result + (maintMargin == null ? 0: maintMargin.hashCode());
    result = 31 * result + (sessionMargin == null ? 0: sessionMargin.hashCode());
    result = 31 * result + (targetExcessMargin == null ? 0: targetExcessMargin.hashCode());
    result = 31 * result + (varMargin == null ? 0: varMargin.hashCode());
    result = 31 * result + (realisedGrossPnl == null ? 0: realisedGrossPnl.hashCode());
    result = 31 * result + (realisedTax == null ? 0: realisedTax.hashCode());
    result = 31 * result + (realisedPnl == null ? 0: realisedPnl.hashCode());
    result = 31 * result + (unrealisedGrossPnl == null ? 0: unrealisedGrossPnl.hashCode());
    result = 31 * result + (longBankrupt == null ? 0: longBankrupt.hashCode());
    result = 31 * result + (shortBankrupt == null ? 0: shortBankrupt.hashCode());
    result = 31 * result + (taxBase == null ? 0: taxBase.hashCode());
    result = 31 * result + (indicativeTaxRate == null ? 0: indicativeTaxRate.hashCode());
    result = 31 * result + (indicativeTax == null ? 0: indicativeTax.hashCode());
    result = 31 * result + (unrealisedTax == null ? 0: unrealisedTax.hashCode());
    result = 31 * result + (unrealisedPnl == null ? 0: unrealisedPnl.hashCode());
    result = 31 * result + (unrealisedPnlPcnt == null ? 0: unrealisedPnlPcnt.hashCode());
    result = 31 * result + (unrealisedRoePcnt == null ? 0: unrealisedRoePcnt.hashCode());
    result = 31 * result + (simpleQty == null ? 0: simpleQty.hashCode());
    result = 31 * result + (simpleCost == null ? 0: simpleCost.hashCode());
    result = 31 * result + (simpleValue == null ? 0: simpleValue.hashCode());
    result = 31 * result + (simplePnl == null ? 0: simplePnl.hashCode());
    result = 31 * result + (simplePnlPcnt == null ? 0: simplePnlPcnt.hashCode());
    result = 31 * result + (avgCostPrice == null ? 0: avgCostPrice.hashCode());
    result = 31 * result + (avgEntryPrice == null ? 0: avgEntryPrice.hashCode());
    result = 31 * result + (breakEvenPrice == null ? 0: breakEvenPrice.hashCode());
    result = 31 * result + (marginCallPrice == null ? 0: marginCallPrice.hashCode());
    result = 31 * result + (liquidationPrice == null ? 0: liquidationPrice.hashCode());
    result = 31 * result + (bankruptPrice == null ? 0: bankruptPrice.hashCode());
    result = 31 * result + (timestamp == null ? 0: timestamp.hashCode());
    result = 31 * result + (lastPrice == null ? 0: lastPrice.hashCode());
    result = 31 * result + (lastValue == null ? 0: lastValue.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Position {\n");
    
    sb.append("  account: ").append(account).append("\n");
    sb.append("  symbol: ").append(symbol).append("\n");
    sb.append("  currency: ").append(currency).append("\n");
    sb.append("  underlying: ").append(underlying).append("\n");
    sb.append("  quoteCurrency: ").append(quoteCurrency).append("\n");
    sb.append("  commission: ").append(commission).append("\n");
    sb.append("  initMarginReq: ").append(initMarginReq).append("\n");
    sb.append("  maintMarginReq: ").append(maintMarginReq).append("\n");
    sb.append("  riskLimit: ").append(riskLimit).append("\n");
    sb.append("  leverage: ").append(leverage).append("\n");
    sb.append("  crossMargin: ").append(crossMargin).append("\n");
    sb.append("  deleveragePercentile: ").append(deleveragePercentile).append("\n");
    sb.append("  rebalancedPnl: ").append(rebalancedPnl).append("\n");
    sb.append("  prevRealisedPnl: ").append(prevRealisedPnl).append("\n");
    sb.append("  prevUnrealisedPnl: ").append(prevUnrealisedPnl).append("\n");
    sb.append("  prevClosePrice: ").append(prevClosePrice).append("\n");
    sb.append("  openingTimestamp: ").append(openingTimestamp).append("\n");
    sb.append("  openingQty: ").append(openingQty).append("\n");
    sb.append("  openingCost: ").append(openingCost).append("\n");
    sb.append("  openingComm: ").append(openingComm).append("\n");
    sb.append("  openOrderBuyQty: ").append(openOrderBuyQty).append("\n");
    sb.append("  openOrderBuyCost: ").append(openOrderBuyCost).append("\n");
    sb.append("  openOrderBuyPremium: ").append(openOrderBuyPremium).append("\n");
    sb.append("  openOrderSellQty: ").append(openOrderSellQty).append("\n");
    sb.append("  openOrderSellCost: ").append(openOrderSellCost).append("\n");
    sb.append("  openOrderSellPremium: ").append(openOrderSellPremium).append("\n");
    sb.append("  execBuyQty: ").append(execBuyQty).append("\n");
    sb.append("  execBuyCost: ").append(execBuyCost).append("\n");
    sb.append("  execSellQty: ").append(execSellQty).append("\n");
    sb.append("  execSellCost: ").append(execSellCost).append("\n");
    sb.append("  execQty: ").append(execQty).append("\n");
    sb.append("  execCost: ").append(execCost).append("\n");
    sb.append("  execComm: ").append(execComm).append("\n");
    sb.append("  currentTimestamp: ").append(currentTimestamp).append("\n");
    sb.append("  currentQty: ").append(currentQty).append("\n");
    sb.append("  currentCost: ").append(currentCost).append("\n");
    sb.append("  currentComm: ").append(currentComm).append("\n");
    sb.append("  realisedCost: ").append(realisedCost).append("\n");
    sb.append("  unrealisedCost: ").append(unrealisedCost).append("\n");
    sb.append("  grossOpenCost: ").append(grossOpenCost).append("\n");
    sb.append("  grossOpenPremium: ").append(grossOpenPremium).append("\n");
    sb.append("  grossExecCost: ").append(grossExecCost).append("\n");
    sb.append("  isOpen: ").append(isOpen).append("\n");
    sb.append("  markPrice: ").append(markPrice).append("\n");
    sb.append("  markValue: ").append(markValue).append("\n");
    sb.append("  riskValue: ").append(riskValue).append("\n");
    sb.append("  homeNotional: ").append(homeNotional).append("\n");
    sb.append("  foreignNotional: ").append(foreignNotional).append("\n");
    sb.append("  posState: ").append(posState).append("\n");
    sb.append("  posCost: ").append(posCost).append("\n");
    sb.append("  posCost2: ").append(posCost2).append("\n");
    sb.append("  posCross: ").append(posCross).append("\n");
    sb.append("  posInit: ").append(posInit).append("\n");
    sb.append("  posComm: ").append(posComm).append("\n");
    sb.append("  posLoss: ").append(posLoss).append("\n");
    sb.append("  posMargin: ").append(posMargin).append("\n");
    sb.append("  posMaint: ").append(posMaint).append("\n");
    sb.append("  posAllowance: ").append(posAllowance).append("\n");
    sb.append("  taxableMargin: ").append(taxableMargin).append("\n");
    sb.append("  initMargin: ").append(initMargin).append("\n");
    sb.append("  maintMargin: ").append(maintMargin).append("\n");
    sb.append("  sessionMargin: ").append(sessionMargin).append("\n");
    sb.append("  targetExcessMargin: ").append(targetExcessMargin).append("\n");
    sb.append("  varMargin: ").append(varMargin).append("\n");
    sb.append("  realisedGrossPnl: ").append(realisedGrossPnl).append("\n");
    sb.append("  realisedTax: ").append(realisedTax).append("\n");
    sb.append("  realisedPnl: ").append(realisedPnl).append("\n");
    sb.append("  unrealisedGrossPnl: ").append(unrealisedGrossPnl).append("\n");
    sb.append("  longBankrupt: ").append(longBankrupt).append("\n");
    sb.append("  shortBankrupt: ").append(shortBankrupt).append("\n");
    sb.append("  taxBase: ").append(taxBase).append("\n");
    sb.append("  indicativeTaxRate: ").append(indicativeTaxRate).append("\n");
    sb.append("  indicativeTax: ").append(indicativeTax).append("\n");
    sb.append("  unrealisedTax: ").append(unrealisedTax).append("\n");
    sb.append("  unrealisedPnl: ").append(unrealisedPnl).append("\n");
    sb.append("  unrealisedPnlPcnt: ").append(unrealisedPnlPcnt).append("\n");
    sb.append("  unrealisedRoePcnt: ").append(unrealisedRoePcnt).append("\n");
    sb.append("  simpleQty: ").append(simpleQty).append("\n");
    sb.append("  simpleCost: ").append(simpleCost).append("\n");
    sb.append("  simpleValue: ").append(simpleValue).append("\n");
    sb.append("  simplePnl: ").append(simplePnl).append("\n");
    sb.append("  simplePnlPcnt: ").append(simplePnlPcnt).append("\n");
    sb.append("  avgCostPrice: ").append(avgCostPrice).append("\n");
    sb.append("  avgEntryPrice: ").append(avgEntryPrice).append("\n");
    sb.append("  breakEvenPrice: ").append(breakEvenPrice).append("\n");
    sb.append("  marginCallPrice: ").append(marginCallPrice).append("\n");
    sb.append("  liquidationPrice: ").append(liquidationPrice).append("\n");
    sb.append("  bankruptPrice: ").append(bankruptPrice).append("\n");
    sb.append("  timestamp: ").append(timestamp).append("\n");
    sb.append("  lastPrice: ").append(lastPrice).append("\n");
    sb.append("  lastValue: ").append(lastValue).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
