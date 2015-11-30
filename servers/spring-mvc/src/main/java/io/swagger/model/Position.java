package io.swagger.model;

import java.math.BigDecimal;
import java.util.Date;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringMVCServerCodegen", date = "2015-11-30T13:36:04.774-06:00")
public class Position  {
  
  private BigDecimal account = null;
  private String symbol = null;
  private String underlying = null;
  private String quoteCurrency = null;
  private String currency = null;
  private Double commission = null;
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

  
  /**
   **/
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
  @JsonProperty("currency")
  public String getCurrency() {
    return currency;
  }
  public void setCurrency(String currency) {
    this.currency = currency;
  }

  
  /**
   **/
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
  @JsonProperty("openingQty")
  public BigDecimal getOpeningQty() {
    return openingQty;
  }
  public void setOpeningQty(BigDecimal openingQty) {
    this.openingQty = openingQty;
  }

  
  /**
   **/
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
  @JsonProperty("markValue")
  public BigDecimal getMarkValue() {
    return markValue;
  }
  public void setMarkValue(BigDecimal markValue) {
    this.markValue = markValue;
  }

  
  /**
   **/
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
  @JsonProperty("indicativeTax")
  public BigDecimal getIndicativeTax() {
    return indicativeTax;
  }
  public void setIndicativeTax(BigDecimal indicativeTax) {
    this.indicativeTax = indicativeTax;
  }

  
  /**
   **/
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
    Position position = (Position) o;
    return Objects.equals(account, position.account) &&
        Objects.equals(symbol, position.symbol) &&
        Objects.equals(underlying, position.underlying) &&
        Objects.equals(quoteCurrency, position.quoteCurrency) &&
        Objects.equals(currency, position.currency) &&
        Objects.equals(commission, position.commission) &&
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
        Objects.equals(timestamp, position.timestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(account, symbol, underlying, quoteCurrency, currency, commission, crossMargin, rebalancedPnl, prevRealisedPnl, prevUnrealisedPnl, prevClosePrice, openingTimestamp, openingQty, openingCost, openingComm, openOrderBuyQty, openOrderBuyCost, openOrderBuyPremium, openOrderSellQty, openOrderSellCost, openOrderSellPremium, execBuyQty, execBuyCost, execSellQty, execSellCost, execQty, execCost, execComm, currentTimestamp, currentQty, currentCost, currentComm, realisedCost, unrealisedCost, grossOpenCost, grossOpenPremium, grossExecCost, isOpen, markPrice, markValue, homeNotional, foreignNotional, posState, posCost, posCost2, posCross, posInit, posComm, posLoss, posMargin, posMaint, posAllowance, taxableMargin, initMargin, maintMargin, sessionMargin, targetExcessMargin, varMargin, realisedGrossPnl, realisedTax, realisedPnl, unrealisedGrossPnl, longBankrupt, shortBankrupt, taxBase, indicativeTaxRate, indicativeTax, unrealisedTax, unrealisedPnl, unrealisedPnlPcnt, unrealisedRoePcnt, simpleQty, simpleCost, simpleValue, simplePnl, simplePnlPcnt, avgCostPrice, avgEntryPrice, breakEvenPrice, marginCallPrice, liquidationPrice, bankruptPrice, timestamp);
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
