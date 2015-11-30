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
  @SerializedName("underlying")
  private String underlying = null;
  @SerializedName("quoteCurrency")
  private String quoteCurrency = null;
  @SerializedName("currency")
  private String currency = null;
  @SerializedName("commission")
  private Double commission = null;
  @SerializedName("crossMargin")
  private Boolean crossMargin = null;
  @SerializedName("rebalancedPnl")
  private BigDecimal rebalancedPnl = null;
  @SerializedName("prevRealisedPnl")
  private BigDecimal prevRealisedPnl = null;
  @SerializedName("prevUnrealisedPnl")
  private BigDecimal prevUnrealisedPnl = null;
  @SerializedName("prevClosePrice")
  private Double prevClosePrice = null;
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
  private Double markPrice = null;
  @SerializedName("markValue")
  private BigDecimal markValue = null;
  @SerializedName("homeNotional")
  private Double homeNotional = null;
  @SerializedName("foreignNotional")
  private Double foreignNotional = null;
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
  private Double indicativeTaxRate = null;
  @SerializedName("indicativeTax")
  private BigDecimal indicativeTax = null;
  @SerializedName("unrealisedTax")
  private BigDecimal unrealisedTax = null;
  @SerializedName("unrealisedPnl")
  private BigDecimal unrealisedPnl = null;
  @SerializedName("unrealisedPnlPcnt")
  private Double unrealisedPnlPcnt = null;
  @SerializedName("unrealisedRoePcnt")
  private Double unrealisedRoePcnt = null;
  @SerializedName("simpleQty")
  private Double simpleQty = null;
  @SerializedName("simpleCost")
  private Double simpleCost = null;
  @SerializedName("simpleValue")
  private Double simpleValue = null;
  @SerializedName("simplePnl")
  private Double simplePnl = null;
  @SerializedName("simplePnlPcnt")
  private Double simplePnlPcnt = null;
  @SerializedName("avgCostPrice")
  private Double avgCostPrice = null;
  @SerializedName("avgEntryPrice")
  private Double avgEntryPrice = null;
  @SerializedName("breakEvenPrice")
  private Double breakEvenPrice = null;
  @SerializedName("marginCallPrice")
  private Double marginCallPrice = null;
  @SerializedName("liquidationPrice")
  private Double liquidationPrice = null;
  @SerializedName("bankruptPrice")
  private Double bankruptPrice = null;
  @SerializedName("timestamp")
  private Date timestamp = null;

  
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
  public String getCurrency() {
    return currency;
  }
  public void setCurrency(String currency) {
    this.currency = currency;
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
  public Boolean getCrossMargin() {
    return crossMargin;
  }
  public void setCrossMargin(Boolean crossMargin) {
    this.crossMargin = crossMargin;
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

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Position {\n");
    
    sb.append("  account: ").append(account).append("\n");
    sb.append("  symbol: ").append(symbol).append("\n");
    sb.append("  underlying: ").append(underlying).append("\n");
    sb.append("  quoteCurrency: ").append(quoteCurrency).append("\n");
    sb.append("  currency: ").append(currency).append("\n");
    sb.append("  commission: ").append(commission).append("\n");
    sb.append("  crossMargin: ").append(crossMargin).append("\n");
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
    sb.append("}\n");
    return sb.toString();
  }
}
