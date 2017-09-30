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
 * Summary of Open and Closed Positions
 **/
@ApiModel(description = "Summary of Open and Closed Positions")
public class Position   {
  
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
  private Double commission = 0.0d;

  @SerializedName("initMarginReq")
  private Double initMarginReq = 0.0d;

  @SerializedName("maintMarginReq")
  private Double maintMarginReq = 0.0d;

  @SerializedName("riskLimit")
  private BigDecimal riskLimit = null;

  @SerializedName("leverage")
  private Double leverage = 0.0d;

  @SerializedName("crossMargin")
  private Boolean crossMargin = null;

  @SerializedName("deleveragePercentile")
  private Double deleveragePercentile = 0.0d;

  @SerializedName("rebalancedPnl")
  private BigDecimal rebalancedPnl = null;

  @SerializedName("prevRealisedPnl")
  private BigDecimal prevRealisedPnl = null;

  @SerializedName("prevUnrealisedPnl")
  private BigDecimal prevUnrealisedPnl = null;

  @SerializedName("prevClosePrice")
  private Double prevClosePrice = 0.0d;

  @SerializedName("openingTimestamp")
  private OffsetDateTime openingTimestamp = null;

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
  private OffsetDateTime currentTimestamp = null;

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
  private Double markPrice = 0.0d;

  @SerializedName("markValue")
  private BigDecimal markValue = null;

  @SerializedName("riskValue")
  private BigDecimal riskValue = null;

  @SerializedName("homeNotional")
  private Double homeNotional = 0.0d;

  @SerializedName("foreignNotional")
  private Double foreignNotional = 0.0d;

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
  private Double indicativeTaxRate = 0.0d;

  @SerializedName("indicativeTax")
  private BigDecimal indicativeTax = null;

  @SerializedName("unrealisedTax")
  private BigDecimal unrealisedTax = null;

  @SerializedName("unrealisedPnl")
  private BigDecimal unrealisedPnl = null;

  @SerializedName("unrealisedPnlPcnt")
  private Double unrealisedPnlPcnt = 0.0d;

  @SerializedName("unrealisedRoePcnt")
  private Double unrealisedRoePcnt = 0.0d;

  @SerializedName("simpleQty")
  private Double simpleQty = 0.0d;

  @SerializedName("simpleCost")
  private Double simpleCost = 0.0d;

  @SerializedName("simpleValue")
  private Double simpleValue = 0.0d;

  @SerializedName("simplePnl")
  private Double simplePnl = 0.0d;

  @SerializedName("simplePnlPcnt")
  private Double simplePnlPcnt = 0.0d;

  @SerializedName("avgCostPrice")
  private Double avgCostPrice = 0.0d;

  @SerializedName("avgEntryPrice")
  private Double avgEntryPrice = 0.0d;

  @SerializedName("breakEvenPrice")
  private Double breakEvenPrice = 0.0d;

  @SerializedName("marginCallPrice")
  private Double marginCallPrice = 0.0d;

  @SerializedName("liquidationPrice")
  private Double liquidationPrice = 0.0d;

  @SerializedName("bankruptPrice")
  private Double bankruptPrice = 0.0d;

  @SerializedName("timestamp")
  private OffsetDateTime timestamp = null;

  @SerializedName("lastPrice")
  private Double lastPrice = 0.0d;

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
  public Boolean isCrossMargin() {
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
  public OffsetDateTime getOpeningTimestamp() {
    return openingTimestamp;
  }
  public void setOpeningTimestamp(OffsetDateTime openingTimestamp) {
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
  public OffsetDateTime getCurrentTimestamp() {
    return currentTimestamp;
  }
  public void setCurrentTimestamp(OffsetDateTime currentTimestamp) {
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
  public Boolean isIsOpen() {
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
  public OffsetDateTime getTimestamp() {
    return timestamp;
  }
  public void setTimestamp(OffsetDateTime timestamp) {
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
    return Objects.equals(account, position.account) &&
        Objects.equals(symbol, position.symbol) &&
        Objects.equals(currency, position.currency) &&
        Objects.equals(underlying, position.underlying) &&
        Objects.equals(quoteCurrency, position.quoteCurrency) &&
        Objects.equals(commission, position.commission) &&
        Objects.equals(initMarginReq, position.initMarginReq) &&
        Objects.equals(maintMarginReq, position.maintMarginReq) &&
        Objects.equals(riskLimit, position.riskLimit) &&
        Objects.equals(leverage, position.leverage) &&
        Objects.equals(crossMargin, position.crossMargin) &&
        Objects.equals(deleveragePercentile, position.deleveragePercentile) &&
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
        Objects.equals(riskValue, position.riskValue) &&
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
    return Objects.hash(account, symbol, currency, underlying, quoteCurrency, commission, initMarginReq, maintMarginReq, riskLimit, leverage, crossMargin, deleveragePercentile, rebalancedPnl, prevRealisedPnl, prevUnrealisedPnl, prevClosePrice, openingTimestamp, openingQty, openingCost, openingComm, openOrderBuyQty, openOrderBuyCost, openOrderBuyPremium, openOrderSellQty, openOrderSellCost, openOrderSellPremium, execBuyQty, execBuyCost, execSellQty, execSellCost, execQty, execCost, execComm, currentTimestamp, currentQty, currentCost, currentComm, realisedCost, unrealisedCost, grossOpenCost, grossOpenPremium, grossExecCost, isOpen, markPrice, markValue, riskValue, homeNotional, foreignNotional, posState, posCost, posCost2, posCross, posInit, posComm, posLoss, posMargin, posMaint, posAllowance, taxableMargin, initMargin, maintMargin, sessionMargin, targetExcessMargin, varMargin, realisedGrossPnl, realisedTax, realisedPnl, unrealisedGrossPnl, longBankrupt, shortBankrupt, taxBase, indicativeTaxRate, indicativeTax, unrealisedTax, unrealisedPnl, unrealisedPnlPcnt, unrealisedRoePcnt, simpleQty, simpleCost, simpleValue, simplePnl, simplePnlPcnt, avgCostPrice, avgEntryPrice, breakEvenPrice, marginCallPrice, liquidationPrice, bankruptPrice, timestamp, lastPrice, lastValue);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Position {\n");
    
    sb.append("    account: ").append(StringUtil.toIndentedString(account)).append("\n");
    sb.append("    symbol: ").append(StringUtil.toIndentedString(symbol)).append("\n");
    sb.append("    currency: ").append(StringUtil.toIndentedString(currency)).append("\n");
    sb.append("    underlying: ").append(StringUtil.toIndentedString(underlying)).append("\n");
    sb.append("    quoteCurrency: ").append(StringUtil.toIndentedString(quoteCurrency)).append("\n");
    sb.append("    commission: ").append(StringUtil.toIndentedString(commission)).append("\n");
    sb.append("    initMarginReq: ").append(StringUtil.toIndentedString(initMarginReq)).append("\n");
    sb.append("    maintMarginReq: ").append(StringUtil.toIndentedString(maintMarginReq)).append("\n");
    sb.append("    riskLimit: ").append(StringUtil.toIndentedString(riskLimit)).append("\n");
    sb.append("    leverage: ").append(StringUtil.toIndentedString(leverage)).append("\n");
    sb.append("    crossMargin: ").append(StringUtil.toIndentedString(crossMargin)).append("\n");
    sb.append("    deleveragePercentile: ").append(StringUtil.toIndentedString(deleveragePercentile)).append("\n");
    sb.append("    rebalancedPnl: ").append(StringUtil.toIndentedString(rebalancedPnl)).append("\n");
    sb.append("    prevRealisedPnl: ").append(StringUtil.toIndentedString(prevRealisedPnl)).append("\n");
    sb.append("    prevUnrealisedPnl: ").append(StringUtil.toIndentedString(prevUnrealisedPnl)).append("\n");
    sb.append("    prevClosePrice: ").append(StringUtil.toIndentedString(prevClosePrice)).append("\n");
    sb.append("    openingTimestamp: ").append(StringUtil.toIndentedString(openingTimestamp)).append("\n");
    sb.append("    openingQty: ").append(StringUtil.toIndentedString(openingQty)).append("\n");
    sb.append("    openingCost: ").append(StringUtil.toIndentedString(openingCost)).append("\n");
    sb.append("    openingComm: ").append(StringUtil.toIndentedString(openingComm)).append("\n");
    sb.append("    openOrderBuyQty: ").append(StringUtil.toIndentedString(openOrderBuyQty)).append("\n");
    sb.append("    openOrderBuyCost: ").append(StringUtil.toIndentedString(openOrderBuyCost)).append("\n");
    sb.append("    openOrderBuyPremium: ").append(StringUtil.toIndentedString(openOrderBuyPremium)).append("\n");
    sb.append("    openOrderSellQty: ").append(StringUtil.toIndentedString(openOrderSellQty)).append("\n");
    sb.append("    openOrderSellCost: ").append(StringUtil.toIndentedString(openOrderSellCost)).append("\n");
    sb.append("    openOrderSellPremium: ").append(StringUtil.toIndentedString(openOrderSellPremium)).append("\n");
    sb.append("    execBuyQty: ").append(StringUtil.toIndentedString(execBuyQty)).append("\n");
    sb.append("    execBuyCost: ").append(StringUtil.toIndentedString(execBuyCost)).append("\n");
    sb.append("    execSellQty: ").append(StringUtil.toIndentedString(execSellQty)).append("\n");
    sb.append("    execSellCost: ").append(StringUtil.toIndentedString(execSellCost)).append("\n");
    sb.append("    execQty: ").append(StringUtil.toIndentedString(execQty)).append("\n");
    sb.append("    execCost: ").append(StringUtil.toIndentedString(execCost)).append("\n");
    sb.append("    execComm: ").append(StringUtil.toIndentedString(execComm)).append("\n");
    sb.append("    currentTimestamp: ").append(StringUtil.toIndentedString(currentTimestamp)).append("\n");
    sb.append("    currentQty: ").append(StringUtil.toIndentedString(currentQty)).append("\n");
    sb.append("    currentCost: ").append(StringUtil.toIndentedString(currentCost)).append("\n");
    sb.append("    currentComm: ").append(StringUtil.toIndentedString(currentComm)).append("\n");
    sb.append("    realisedCost: ").append(StringUtil.toIndentedString(realisedCost)).append("\n");
    sb.append("    unrealisedCost: ").append(StringUtil.toIndentedString(unrealisedCost)).append("\n");
    sb.append("    grossOpenCost: ").append(StringUtil.toIndentedString(grossOpenCost)).append("\n");
    sb.append("    grossOpenPremium: ").append(StringUtil.toIndentedString(grossOpenPremium)).append("\n");
    sb.append("    grossExecCost: ").append(StringUtil.toIndentedString(grossExecCost)).append("\n");
    sb.append("    isOpen: ").append(StringUtil.toIndentedString(isOpen)).append("\n");
    sb.append("    markPrice: ").append(StringUtil.toIndentedString(markPrice)).append("\n");
    sb.append("    markValue: ").append(StringUtil.toIndentedString(markValue)).append("\n");
    sb.append("    riskValue: ").append(StringUtil.toIndentedString(riskValue)).append("\n");
    sb.append("    homeNotional: ").append(StringUtil.toIndentedString(homeNotional)).append("\n");
    sb.append("    foreignNotional: ").append(StringUtil.toIndentedString(foreignNotional)).append("\n");
    sb.append("    posState: ").append(StringUtil.toIndentedString(posState)).append("\n");
    sb.append("    posCost: ").append(StringUtil.toIndentedString(posCost)).append("\n");
    sb.append("    posCost2: ").append(StringUtil.toIndentedString(posCost2)).append("\n");
    sb.append("    posCross: ").append(StringUtil.toIndentedString(posCross)).append("\n");
    sb.append("    posInit: ").append(StringUtil.toIndentedString(posInit)).append("\n");
    sb.append("    posComm: ").append(StringUtil.toIndentedString(posComm)).append("\n");
    sb.append("    posLoss: ").append(StringUtil.toIndentedString(posLoss)).append("\n");
    sb.append("    posMargin: ").append(StringUtil.toIndentedString(posMargin)).append("\n");
    sb.append("    posMaint: ").append(StringUtil.toIndentedString(posMaint)).append("\n");
    sb.append("    posAllowance: ").append(StringUtil.toIndentedString(posAllowance)).append("\n");
    sb.append("    taxableMargin: ").append(StringUtil.toIndentedString(taxableMargin)).append("\n");
    sb.append("    initMargin: ").append(StringUtil.toIndentedString(initMargin)).append("\n");
    sb.append("    maintMargin: ").append(StringUtil.toIndentedString(maintMargin)).append("\n");
    sb.append("    sessionMargin: ").append(StringUtil.toIndentedString(sessionMargin)).append("\n");
    sb.append("    targetExcessMargin: ").append(StringUtil.toIndentedString(targetExcessMargin)).append("\n");
    sb.append("    varMargin: ").append(StringUtil.toIndentedString(varMargin)).append("\n");
    sb.append("    realisedGrossPnl: ").append(StringUtil.toIndentedString(realisedGrossPnl)).append("\n");
    sb.append("    realisedTax: ").append(StringUtil.toIndentedString(realisedTax)).append("\n");
    sb.append("    realisedPnl: ").append(StringUtil.toIndentedString(realisedPnl)).append("\n");
    sb.append("    unrealisedGrossPnl: ").append(StringUtil.toIndentedString(unrealisedGrossPnl)).append("\n");
    sb.append("    longBankrupt: ").append(StringUtil.toIndentedString(longBankrupt)).append("\n");
    sb.append("    shortBankrupt: ").append(StringUtil.toIndentedString(shortBankrupt)).append("\n");
    sb.append("    taxBase: ").append(StringUtil.toIndentedString(taxBase)).append("\n");
    sb.append("    indicativeTaxRate: ").append(StringUtil.toIndentedString(indicativeTaxRate)).append("\n");
    sb.append("    indicativeTax: ").append(StringUtil.toIndentedString(indicativeTax)).append("\n");
    sb.append("    unrealisedTax: ").append(StringUtil.toIndentedString(unrealisedTax)).append("\n");
    sb.append("    unrealisedPnl: ").append(StringUtil.toIndentedString(unrealisedPnl)).append("\n");
    sb.append("    unrealisedPnlPcnt: ").append(StringUtil.toIndentedString(unrealisedPnlPcnt)).append("\n");
    sb.append("    unrealisedRoePcnt: ").append(StringUtil.toIndentedString(unrealisedRoePcnt)).append("\n");
    sb.append("    simpleQty: ").append(StringUtil.toIndentedString(simpleQty)).append("\n");
    sb.append("    simpleCost: ").append(StringUtil.toIndentedString(simpleCost)).append("\n");
    sb.append("    simpleValue: ").append(StringUtil.toIndentedString(simpleValue)).append("\n");
    sb.append("    simplePnl: ").append(StringUtil.toIndentedString(simplePnl)).append("\n");
    sb.append("    simplePnlPcnt: ").append(StringUtil.toIndentedString(simplePnlPcnt)).append("\n");
    sb.append("    avgCostPrice: ").append(StringUtil.toIndentedString(avgCostPrice)).append("\n");
    sb.append("    avgEntryPrice: ").append(StringUtil.toIndentedString(avgEntryPrice)).append("\n");
    sb.append("    breakEvenPrice: ").append(StringUtil.toIndentedString(breakEvenPrice)).append("\n");
    sb.append("    marginCallPrice: ").append(StringUtil.toIndentedString(marginCallPrice)).append("\n");
    sb.append("    liquidationPrice: ").append(StringUtil.toIndentedString(liquidationPrice)).append("\n");
    sb.append("    bankruptPrice: ").append(StringUtil.toIndentedString(bankruptPrice)).append("\n");
    sb.append("    timestamp: ").append(StringUtil.toIndentedString(timestamp)).append("\n");
    sb.append("    lastPrice: ").append(StringUtil.toIndentedString(lastPrice)).append("\n");
    sb.append("    lastValue: ").append(StringUtil.toIndentedString(lastValue)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
