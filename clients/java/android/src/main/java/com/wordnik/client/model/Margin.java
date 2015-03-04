package com.wordnik.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;
public class Margin {
  @JsonProperty("account")
  private Double account = null;
  @JsonProperty("currency")
  private String currency = null;
  @JsonProperty("commission")
  private Double commission = null;
  @JsonProperty("riskLimit")
  private Double riskLimit = null;
  @JsonProperty("state")
  private String state = null;
  @JsonProperty("action")
  private String action = null;
  @JsonProperty("amount")
  private Double amount = null;
  @JsonProperty("pendingCredit")
  private Double pendingCredit = null;
  @JsonProperty("pendingDebit")
  private Double pendingDebit = null;
  @JsonProperty("prevRealisedPnl")
  private Double prevRealisedPnl = null;
  @JsonProperty("prevUnrealisedPnl")
  private Double prevUnrealisedPnl = null;
  @JsonProperty("grossComm")
  private Double grossComm = null;
  @JsonProperty("grossOpenCost")
  private Double grossOpenCost = null;
  @JsonProperty("grossExecCost")
  private Double grossExecCost = null;
  @JsonProperty("grossLastValue")
  private Double grossLastValue = null;
  @JsonProperty("riskValue")
  private Double riskValue = null;
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
  @JsonProperty("realisedPnl")
  private Double realisedPnl = null;
  @JsonProperty("unrealisedPnl")
  private Double unrealisedPnl = null;
  @JsonProperty("walletBalance")
  private Double walletBalance = null;
  @JsonProperty("marginBalance")
  private Double marginBalance = null;
  @JsonProperty("marginBalancePcnt")
  private Double marginBalancePcnt = null;
  @JsonProperty("marginLeverage")
  private Double marginLeverage = null;
  @JsonProperty("marginUsedPcnt")
  private Double marginUsedPcnt = null;
  @JsonProperty("excessMargin")
  private Double excessMargin = null;
  @JsonProperty("excessMarginPcnt")
  private Double excessMarginPcnt = null;
  @JsonProperty("availableMargin")
  private Double availableMargin = null;
  @JsonProperty("withdrawableMargin")
  private Double withdrawableMargin = null;
  @JsonProperty("timestamp")
  private Date timestamp = null;
  public Double getAccount() {
    return account;
  }
  public void setAccount(Double account) {
    this.account = account;
  }

  public String getCurrency() {
    return currency;
  }
  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public Double getCommission() {
    return commission;
  }
  public void setCommission(Double commission) {
    this.commission = commission;
  }

  public Double getRiskLimit() {
    return riskLimit;
  }
  public void setRiskLimit(Double riskLimit) {
    this.riskLimit = riskLimit;
  }

  public String getState() {
    return state;
  }
  public void setState(String state) {
    this.state = state;
  }

  public String getAction() {
    return action;
  }
  public void setAction(String action) {
    this.action = action;
  }

  public Double getAmount() {
    return amount;
  }
  public void setAmount(Double amount) {
    this.amount = amount;
  }

  public Double getPendingCredit() {
    return pendingCredit;
  }
  public void setPendingCredit(Double pendingCredit) {
    this.pendingCredit = pendingCredit;
  }

  public Double getPendingDebit() {
    return pendingDebit;
  }
  public void setPendingDebit(Double pendingDebit) {
    this.pendingDebit = pendingDebit;
  }

  public Double getPrevRealisedPnl() {
    return prevRealisedPnl;
  }
  public void setPrevRealisedPnl(Double prevRealisedPnl) {
    this.prevRealisedPnl = prevRealisedPnl;
  }

  public Double getPrevUnrealisedPnl() {
    return prevUnrealisedPnl;
  }
  public void setPrevUnrealisedPnl(Double prevUnrealisedPnl) {
    this.prevUnrealisedPnl = prevUnrealisedPnl;
  }

  public Double getGrossComm() {
    return grossComm;
  }
  public void setGrossComm(Double grossComm) {
    this.grossComm = grossComm;
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

  public Double getGrossLastValue() {
    return grossLastValue;
  }
  public void setGrossLastValue(Double grossLastValue) {
    this.grossLastValue = grossLastValue;
  }

  public Double getRiskValue() {
    return riskValue;
  }
  public void setRiskValue(Double riskValue) {
    this.riskValue = riskValue;
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

  public Double getRealisedPnl() {
    return realisedPnl;
  }
  public void setRealisedPnl(Double realisedPnl) {
    this.realisedPnl = realisedPnl;
  }

  public Double getUnrealisedPnl() {
    return unrealisedPnl;
  }
  public void setUnrealisedPnl(Double unrealisedPnl) {
    this.unrealisedPnl = unrealisedPnl;
  }

  public Double getWalletBalance() {
    return walletBalance;
  }
  public void setWalletBalance(Double walletBalance) {
    this.walletBalance = walletBalance;
  }

  public Double getMarginBalance() {
    return marginBalance;
  }
  public void setMarginBalance(Double marginBalance) {
    this.marginBalance = marginBalance;
  }

  public Double getMarginBalancePcnt() {
    return marginBalancePcnt;
  }
  public void setMarginBalancePcnt(Double marginBalancePcnt) {
    this.marginBalancePcnt = marginBalancePcnt;
  }

  public Double getMarginLeverage() {
    return marginLeverage;
  }
  public void setMarginLeverage(Double marginLeverage) {
    this.marginLeverage = marginLeverage;
  }

  public Double getMarginUsedPcnt() {
    return marginUsedPcnt;
  }
  public void setMarginUsedPcnt(Double marginUsedPcnt) {
    this.marginUsedPcnt = marginUsedPcnt;
  }

  public Double getExcessMargin() {
    return excessMargin;
  }
  public void setExcessMargin(Double excessMargin) {
    this.excessMargin = excessMargin;
  }

  public Double getExcessMarginPcnt() {
    return excessMarginPcnt;
  }
  public void setExcessMarginPcnt(Double excessMarginPcnt) {
    this.excessMarginPcnt = excessMarginPcnt;
  }

  public Double getAvailableMargin() {
    return availableMargin;
  }
  public void setAvailableMargin(Double availableMargin) {
    this.availableMargin = availableMargin;
  }

  public Double getWithdrawableMargin() {
    return withdrawableMargin;
  }
  public void setWithdrawableMargin(Double withdrawableMargin) {
    this.withdrawableMargin = withdrawableMargin;
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
    sb.append("class Margin {\n");
    sb.append("  account: ").append(account).append("\n");
    sb.append("  currency: ").append(currency).append("\n");
    sb.append("  commission: ").append(commission).append("\n");
    sb.append("  riskLimit: ").append(riskLimit).append("\n");
    sb.append("  state: ").append(state).append("\n");
    sb.append("  action: ").append(action).append("\n");
    sb.append("  amount: ").append(amount).append("\n");
    sb.append("  pendingCredit: ").append(pendingCredit).append("\n");
    sb.append("  pendingDebit: ").append(pendingDebit).append("\n");
    sb.append("  prevRealisedPnl: ").append(prevRealisedPnl).append("\n");
    sb.append("  prevUnrealisedPnl: ").append(prevUnrealisedPnl).append("\n");
    sb.append("  grossComm: ").append(grossComm).append("\n");
    sb.append("  grossOpenCost: ").append(grossOpenCost).append("\n");
    sb.append("  grossExecCost: ").append(grossExecCost).append("\n");
    sb.append("  grossLastValue: ").append(grossLastValue).append("\n");
    sb.append("  riskValue: ").append(riskValue).append("\n");
    sb.append("  initMargin: ").append(initMargin).append("\n");
    sb.append("  maintMargin: ").append(maintMargin).append("\n");
    sb.append("  sessionMargin: ").append(sessionMargin).append("\n");
    sb.append("  targetExcessMargin: ").append(targetExcessMargin).append("\n");
    sb.append("  varMargin: ").append(varMargin).append("\n");
    sb.append("  realisedPnl: ").append(realisedPnl).append("\n");
    sb.append("  unrealisedPnl: ").append(unrealisedPnl).append("\n");
    sb.append("  walletBalance: ").append(walletBalance).append("\n");
    sb.append("  marginBalance: ").append(marginBalance).append("\n");
    sb.append("  marginBalancePcnt: ").append(marginBalancePcnt).append("\n");
    sb.append("  marginLeverage: ").append(marginLeverage).append("\n");
    sb.append("  marginUsedPcnt: ").append(marginUsedPcnt).append("\n");
    sb.append("  excessMargin: ").append(excessMargin).append("\n");
    sb.append("  excessMarginPcnt: ").append(excessMarginPcnt).append("\n");
    sb.append("  availableMargin: ").append(availableMargin).append("\n");
    sb.append("  withdrawableMargin: ").append(withdrawableMargin).append("\n");
    sb.append("  timestamp: ").append(timestamp).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

