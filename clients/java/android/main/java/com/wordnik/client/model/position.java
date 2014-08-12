package com.wordnik.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;
public class Position {
  @JsonProperty("account")
  private Double account = null;
  @JsonProperty("symbol")
  private String symbol = null;
  @JsonProperty("currency")
  private String currency = null;
  @JsonProperty("prevPnl")
  private Double prevPnl = null;
  @JsonProperty("prevClosePrice")
  private Double prevClosePrice = null;
  @JsonProperty("openingTimestamp")
  private Date openingTimestamp = null;
  @JsonProperty("openingBuyQty")
  private Double openingBuyQty = null;
  @JsonProperty("openingBuyCost")
  private Double openingBuyCost = null;
  @JsonProperty("openingSellQty")
  private Double openingSellQty = null;
  @JsonProperty("openingSellCost")
  private Double openingSellCost = null;
  @JsonProperty("openingQty")
  private Double openingQty = null;
  @JsonProperty("openingCost")
  private Double openingCost = null;
  @JsonProperty("openingComm")
  private Double openingComm = null;
  @JsonProperty("openOrderBuyQty")
  private Double openOrderBuyQty = null;
  @JsonProperty("openOrderBuyCost")
  private Double openOrderBuyCost = null;
  @JsonProperty("openOrderSellQty")
  private Double openOrderSellQty = null;
  @JsonProperty("openOrderSellCost")
  private Double openOrderSellCost = null;
  @JsonProperty("execBuyQty")
  private Double execBuyQty = null;
  @JsonProperty("execBuyCost")
  private Double execBuyCost = null;
  @JsonProperty("execSellQty")
  private Double execSellQty = null;
  @JsonProperty("execSellCost")
  private Double execSellCost = null;
  @JsonProperty("execQty")
  private Double execQty = null;
  @JsonProperty("execCost")
  private Double execCost = null;
  @JsonProperty("execComm")
  private Double execComm = null;
  @JsonProperty("currentTimestamp")
  private Date currentTimestamp = null;
  @JsonProperty("currentBuyQty")
  private Double currentBuyQty = null;
  @JsonProperty("currentBuyCost")
  private Double currentBuyCost = null;
  @JsonProperty("currentSellQty")
  private Double currentSellQty = null;
  @JsonProperty("currentSellCost")
  private Double currentSellCost = null;
  @JsonProperty("currentQty")
  private Double currentQty = null;
  @JsonProperty("currentCost")
  private Double currentCost = null;
  @JsonProperty("currentComm")
  private Double currentComm = null;
  @JsonProperty("grossOpenCost")
  private Double grossOpenCost = null;
  @JsonProperty("grossExecCost")
  private Double grossExecCost = null;
  @JsonProperty("lastPrice")
  private Double lastPrice = null;
  @JsonProperty("lastValue")
  private Double lastValue = null;
  @JsonProperty("initMargin")
  private Double initMargin = null;
  @JsonProperty("maintMargin")
  private Double maintMargin = null;
  @JsonProperty("sessionMargin")
  private Double sessionMargin = null;
  @JsonProperty("targetExcessMargin")
  private Double targetExcessMargin = null;
  @JsonProperty("varMargin")
  private Double varMargin = null;
  @JsonProperty("pnl")
  private Double pnl = null;
  @JsonProperty("pnlPcnt")
  private Double pnlPcnt = null;
  @JsonProperty("avgBuyPrice")
  private Double avgBuyPrice = null;
  @JsonProperty("avgSellPrice")
  private Double avgSellPrice = null;
  @JsonProperty("avgEntryPrice")
  private Double avgEntryPrice = null;
  @JsonProperty("breakEvenPrice")
  private Double breakEvenPrice = null;
  @JsonProperty("marginCallPrice")
  private Double marginCallPrice = null;
  @JsonProperty("liquidationPrice")
  private Double liquidationPrice = null;
  @JsonProperty("bankruptPrice")
  private Double bankruptPrice = null;
  @JsonProperty("timestamp")
  private Date timestamp = null;
  public Double getAccount() {
    return account;
  }
  public void setAccount(Double account) {
    this.account = account;
  }

  public String getSymbol() {
    return symbol;
  }
  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }

  public String getCurrency() {
    return currency;
  }
  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public Double getPrevPnl() {
    return prevPnl;
  }
  public void setPrevPnl(Double prevPnl) {
    this.prevPnl = prevPnl;
  }

  public Double getPrevClosePrice() {
    return prevClosePrice;
  }
  public void setPrevClosePrice(Double prevClosePrice) {
    this.prevClosePrice = prevClosePrice;
  }

  public Date getOpeningTimestamp() {
    return openingTimestamp;
  }
  public void setOpeningTimestamp(Date openingTimestamp) {
    this.openingTimestamp = openingTimestamp;
  }

  public Double getOpeningBuyQty() {
    return openingBuyQty;
  }
  public void setOpeningBuyQty(Double openingBuyQty) {
    this.openingBuyQty = openingBuyQty;
  }

  public Double getOpeningBuyCost() {
    return openingBuyCost;
  }
  public void setOpeningBuyCost(Double openingBuyCost) {
    this.openingBuyCost = openingBuyCost;
  }

  public Double getOpeningSellQty() {
    return openingSellQty;
  }
  public void setOpeningSellQty(Double openingSellQty) {
    this.openingSellQty = openingSellQty;
  }

  public Double getOpeningSellCost() {
    return openingSellCost;
  }
  public void setOpeningSellCost(Double openingSellCost) {
    this.openingSellCost = openingSellCost;
  }

  public Double getOpeningQty() {
    return openingQty;
  }
  public void setOpeningQty(Double openingQty) {
    this.openingQty = openingQty;
  }

  public Double getOpeningCost() {
    return openingCost;
  }
  public void setOpeningCost(Double openingCost) {
    this.openingCost = openingCost;
  }

  public Double getOpeningComm() {
    return openingComm;
  }
  public void setOpeningComm(Double openingComm) {
    this.openingComm = openingComm;
  }

  public Double getOpenOrderBuyQty() {
    return openOrderBuyQty;
  }
  public void setOpenOrderBuyQty(Double openOrderBuyQty) {
    this.openOrderBuyQty = openOrderBuyQty;
  }

  public Double getOpenOrderBuyCost() {
    return openOrderBuyCost;
  }
  public void setOpenOrderBuyCost(Double openOrderBuyCost) {
    this.openOrderBuyCost = openOrderBuyCost;
  }

  public Double getOpenOrderSellQty() {
    return openOrderSellQty;
  }
  public void setOpenOrderSellQty(Double openOrderSellQty) {
    this.openOrderSellQty = openOrderSellQty;
  }

  public Double getOpenOrderSellCost() {
    return openOrderSellCost;
  }
  public void setOpenOrderSellCost(Double openOrderSellCost) {
    this.openOrderSellCost = openOrderSellCost;
  }

  public Double getExecBuyQty() {
    return execBuyQty;
  }
  public void setExecBuyQty(Double execBuyQty) {
    this.execBuyQty = execBuyQty;
  }

  public Double getExecBuyCost() {
    return execBuyCost;
  }
  public void setExecBuyCost(Double execBuyCost) {
    this.execBuyCost = execBuyCost;
  }

  public Double getExecSellQty() {
    return execSellQty;
  }
  public void setExecSellQty(Double execSellQty) {
    this.execSellQty = execSellQty;
  }

  public Double getExecSellCost() {
    return execSellCost;
  }
  public void setExecSellCost(Double execSellCost) {
    this.execSellCost = execSellCost;
  }

  public Double getExecQty() {
    return execQty;
  }
  public void setExecQty(Double execQty) {
    this.execQty = execQty;
  }

  public Double getExecCost() {
    return execCost;
  }
  public void setExecCost(Double execCost) {
    this.execCost = execCost;
  }

  public Double getExecComm() {
    return execComm;
  }
  public void setExecComm(Double execComm) {
    this.execComm = execComm;
  }

  public Date getCurrentTimestamp() {
    return currentTimestamp;
  }
  public void setCurrentTimestamp(Date currentTimestamp) {
    this.currentTimestamp = currentTimestamp;
  }

  public Double getCurrentBuyQty() {
    return currentBuyQty;
  }
  public void setCurrentBuyQty(Double currentBuyQty) {
    this.currentBuyQty = currentBuyQty;
  }

  public Double getCurrentBuyCost() {
    return currentBuyCost;
  }
  public void setCurrentBuyCost(Double currentBuyCost) {
    this.currentBuyCost = currentBuyCost;
  }

  public Double getCurrentSellQty() {
    return currentSellQty;
  }
  public void setCurrentSellQty(Double currentSellQty) {
    this.currentSellQty = currentSellQty;
  }

  public Double getCurrentSellCost() {
    return currentSellCost;
  }
  public void setCurrentSellCost(Double currentSellCost) {
    this.currentSellCost = currentSellCost;
  }

  public Double getCurrentQty() {
    return currentQty;
  }
  public void setCurrentQty(Double currentQty) {
    this.currentQty = currentQty;
  }

  public Double getCurrentCost() {
    return currentCost;
  }
  public void setCurrentCost(Double currentCost) {
    this.currentCost = currentCost;
  }

  public Double getCurrentComm() {
    return currentComm;
  }
  public void setCurrentComm(Double currentComm) {
    this.currentComm = currentComm;
  }

  public Double getGrossOpenCost() {
    return grossOpenCost;
  }
  public void setGrossOpenCost(Double grossOpenCost) {
    this.grossOpenCost = grossOpenCost;
  }

  public Double getGrossExecCost() {
    return grossExecCost;
  }
  public void setGrossExecCost(Double grossExecCost) {
    this.grossExecCost = grossExecCost;
  }

  public Double getLastPrice() {
    return lastPrice;
  }
  public void setLastPrice(Double lastPrice) {
    this.lastPrice = lastPrice;
  }

  public Double getLastValue() {
    return lastValue;
  }
  public void setLastValue(Double lastValue) {
    this.lastValue = lastValue;
  }

  public Double getInitMargin() {
    return initMargin;
  }
  public void setInitMargin(Double initMargin) {
    this.initMargin = initMargin;
  }

  public Double getMaintMargin() {
    return maintMargin;
  }
  public void setMaintMargin(Double maintMargin) {
    this.maintMargin = maintMargin;
  }

  public Double getSessionMargin() {
    return sessionMargin;
  }
  public void setSessionMargin(Double sessionMargin) {
    this.sessionMargin = sessionMargin;
  }

  public Double getTargetExcessMargin() {
    return targetExcessMargin;
  }
  public void setTargetExcessMargin(Double targetExcessMargin) {
    this.targetExcessMargin = targetExcessMargin;
  }

  public Double getVarMargin() {
    return varMargin;
  }
  public void setVarMargin(Double varMargin) {
    this.varMargin = varMargin;
  }

  public Double getPnl() {
    return pnl;
  }
  public void setPnl(Double pnl) {
    this.pnl = pnl;
  }

  public Double getPnlPcnt() {
    return pnlPcnt;
  }
  public void setPnlPcnt(Double pnlPcnt) {
    this.pnlPcnt = pnlPcnt;
  }

  public Double getAvgBuyPrice() {
    return avgBuyPrice;
  }
  public void setAvgBuyPrice(Double avgBuyPrice) {
    this.avgBuyPrice = avgBuyPrice;
  }

  public Double getAvgSellPrice() {
    return avgSellPrice;
  }
  public void setAvgSellPrice(Double avgSellPrice) {
    this.avgSellPrice = avgSellPrice;
  }

  public Double getAvgEntryPrice() {
    return avgEntryPrice;
  }
  public void setAvgEntryPrice(Double avgEntryPrice) {
    this.avgEntryPrice = avgEntryPrice;
  }

  public Double getBreakEvenPrice() {
    return breakEvenPrice;
  }
  public void setBreakEvenPrice(Double breakEvenPrice) {
    this.breakEvenPrice = breakEvenPrice;
  }

  public Double getMarginCallPrice() {
    return marginCallPrice;
  }
  public void setMarginCallPrice(Double marginCallPrice) {
    this.marginCallPrice = marginCallPrice;
  }

  public Double getLiquidationPrice() {
    return liquidationPrice;
  }
  public void setLiquidationPrice(Double liquidationPrice) {
    this.liquidationPrice = liquidationPrice;
  }

  public Double getBankruptPrice() {
    return bankruptPrice;
  }
  public void setBankruptPrice(Double bankruptPrice) {
    this.bankruptPrice = bankruptPrice;
  }

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
    sb.append("  currency: ").append(currency).append("\n");
    sb.append("  prevPnl: ").append(prevPnl).append("\n");
    sb.append("  prevClosePrice: ").append(prevClosePrice).append("\n");
    sb.append("  openingTimestamp: ").append(openingTimestamp).append("\n");
    sb.append("  openingBuyQty: ").append(openingBuyQty).append("\n");
    sb.append("  openingBuyCost: ").append(openingBuyCost).append("\n");
    sb.append("  openingSellQty: ").append(openingSellQty).append("\n");
    sb.append("  openingSellCost: ").append(openingSellCost).append("\n");
    sb.append("  openingQty: ").append(openingQty).append("\n");
    sb.append("  openingCost: ").append(openingCost).append("\n");
    sb.append("  openingComm: ").append(openingComm).append("\n");
    sb.append("  openOrderBuyQty: ").append(openOrderBuyQty).append("\n");
    sb.append("  openOrderBuyCost: ").append(openOrderBuyCost).append("\n");
    sb.append("  openOrderSellQty: ").append(openOrderSellQty).append("\n");
    sb.append("  openOrderSellCost: ").append(openOrderSellCost).append("\n");
    sb.append("  execBuyQty: ").append(execBuyQty).append("\n");
    sb.append("  execBuyCost: ").append(execBuyCost).append("\n");
    sb.append("  execSellQty: ").append(execSellQty).append("\n");
    sb.append("  execSellCost: ").append(execSellCost).append("\n");
    sb.append("  execQty: ").append(execQty).append("\n");
    sb.append("  execCost: ").append(execCost).append("\n");
    sb.append("  execComm: ").append(execComm).append("\n");
    sb.append("  currentTimestamp: ").append(currentTimestamp).append("\n");
    sb.append("  currentBuyQty: ").append(currentBuyQty).append("\n");
    sb.append("  currentBuyCost: ").append(currentBuyCost).append("\n");
    sb.append("  currentSellQty: ").append(currentSellQty).append("\n");
    sb.append("  currentSellCost: ").append(currentSellCost).append("\n");
    sb.append("  currentQty: ").append(currentQty).append("\n");
    sb.append("  currentCost: ").append(currentCost).append("\n");
    sb.append("  currentComm: ").append(currentComm).append("\n");
    sb.append("  grossOpenCost: ").append(grossOpenCost).append("\n");
    sb.append("  grossExecCost: ").append(grossExecCost).append("\n");
    sb.append("  lastPrice: ").append(lastPrice).append("\n");
    sb.append("  lastValue: ").append(lastValue).append("\n");
    sb.append("  initMargin: ").append(initMargin).append("\n");
    sb.append("  maintMargin: ").append(maintMargin).append("\n");
    sb.append("  sessionMargin: ").append(sessionMargin).append("\n");
    sb.append("  targetExcessMargin: ").append(targetExcessMargin).append("\n");
    sb.append("  varMargin: ").append(varMargin).append("\n");
    sb.append("  pnl: ").append(pnl).append("\n");
    sb.append("  pnlPcnt: ").append(pnlPcnt).append("\n");
    sb.append("  avgBuyPrice: ").append(avgBuyPrice).append("\n");
    sb.append("  avgSellPrice: ").append(avgSellPrice).append("\n");
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

