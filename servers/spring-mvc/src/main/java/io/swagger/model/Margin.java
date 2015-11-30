package io.swagger.model;

import java.math.BigDecimal;
import java.util.Date;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringMVCServerCodegen", date = "2015-11-30T13:36:04.774-06:00")
public class Margin  {
  
  private BigDecimal account = null;
  private String currency = null;
  private BigDecimal riskLimit = null;
  private String prevState = null;
  private String state = null;
  private String action = null;
  private BigDecimal amount = null;
  private BigDecimal pendingCredit = null;
  private BigDecimal pendingDebit = null;
  private BigDecimal prevRealisedPnl = null;
  private BigDecimal prevUnrealisedPnl = null;
  private BigDecimal grossComm = null;
  private BigDecimal grossOpenCost = null;
  private BigDecimal grossOpenPremium = null;
  private BigDecimal grossExecCost = null;
  private BigDecimal grossMarkValue = null;
  private BigDecimal riskValue = null;
  private BigDecimal taxableMargin = null;
  private BigDecimal initMargin = null;
  private BigDecimal maintMargin = null;
  private BigDecimal sessionMargin = null;
  private BigDecimal targetExcessMargin = null;
  private BigDecimal varMargin = null;
  private BigDecimal realisedPnl = null;
  private BigDecimal unrealisedPnl = null;
  private BigDecimal indicativeTax = null;
  private BigDecimal unrealisedProfit = null;
  private BigDecimal walletBalance = null;
  private BigDecimal marginBalance = null;
  private Double marginBalancePcnt = 0.0d;
  private Double marginLeverage = 0.0d;
  private Double marginUsedPcnt = 0.0d;
  private BigDecimal excessMargin = null;
  private Double excessMarginPcnt = 0.0d;
  private BigDecimal availableMargin = null;
  private BigDecimal withdrawableMargin = null;
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
  @JsonProperty("riskLimit")
  public BigDecimal getRiskLimit() {
    return riskLimit;
  }
  public void setRiskLimit(BigDecimal riskLimit) {
    this.riskLimit = riskLimit;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("prevState")
  public String getPrevState() {
    return prevState;
  }
  public void setPrevState(String prevState) {
    this.prevState = prevState;
  }

  
  /**
   **/
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
  @ApiModelProperty(value = "")
  @JsonProperty("action")
  public String getAction() {
    return action;
  }
  public void setAction(String action) {
    this.action = action;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("amount")
  public BigDecimal getAmount() {
    return amount;
  }
  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("pendingCredit")
  public BigDecimal getPendingCredit() {
    return pendingCredit;
  }
  public void setPendingCredit(BigDecimal pendingCredit) {
    this.pendingCredit = pendingCredit;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("pendingDebit")
  public BigDecimal getPendingDebit() {
    return pendingDebit;
  }
  public void setPendingDebit(BigDecimal pendingDebit) {
    this.pendingDebit = pendingDebit;
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
  @JsonProperty("grossComm")
  public BigDecimal getGrossComm() {
    return grossComm;
  }
  public void setGrossComm(BigDecimal grossComm) {
    this.grossComm = grossComm;
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
  @JsonProperty("grossMarkValue")
  public BigDecimal getGrossMarkValue() {
    return grossMarkValue;
  }
  public void setGrossMarkValue(BigDecimal grossMarkValue) {
    this.grossMarkValue = grossMarkValue;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("riskValue")
  public BigDecimal getRiskValue() {
    return riskValue;
  }
  public void setRiskValue(BigDecimal riskValue) {
    this.riskValue = riskValue;
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
  @JsonProperty("unrealisedProfit")
  public BigDecimal getUnrealisedProfit() {
    return unrealisedProfit;
  }
  public void setUnrealisedProfit(BigDecimal unrealisedProfit) {
    this.unrealisedProfit = unrealisedProfit;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("walletBalance")
  public BigDecimal getWalletBalance() {
    return walletBalance;
  }
  public void setWalletBalance(BigDecimal walletBalance) {
    this.walletBalance = walletBalance;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("marginBalance")
  public BigDecimal getMarginBalance() {
    return marginBalance;
  }
  public void setMarginBalance(BigDecimal marginBalance) {
    this.marginBalance = marginBalance;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("marginBalancePcnt")
  public Double getMarginBalancePcnt() {
    return marginBalancePcnt;
  }
  public void setMarginBalancePcnt(Double marginBalancePcnt) {
    this.marginBalancePcnt = marginBalancePcnt;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("marginLeverage")
  public Double getMarginLeverage() {
    return marginLeverage;
  }
  public void setMarginLeverage(Double marginLeverage) {
    this.marginLeverage = marginLeverage;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("marginUsedPcnt")
  public Double getMarginUsedPcnt() {
    return marginUsedPcnt;
  }
  public void setMarginUsedPcnt(Double marginUsedPcnt) {
    this.marginUsedPcnt = marginUsedPcnt;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("excessMargin")
  public BigDecimal getExcessMargin() {
    return excessMargin;
  }
  public void setExcessMargin(BigDecimal excessMargin) {
    this.excessMargin = excessMargin;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("excessMarginPcnt")
  public Double getExcessMarginPcnt() {
    return excessMarginPcnt;
  }
  public void setExcessMarginPcnt(Double excessMarginPcnt) {
    this.excessMarginPcnt = excessMarginPcnt;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("availableMargin")
  public BigDecimal getAvailableMargin() {
    return availableMargin;
  }
  public void setAvailableMargin(BigDecimal availableMargin) {
    this.availableMargin = availableMargin;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("withdrawableMargin")
  public BigDecimal getWithdrawableMargin() {
    return withdrawableMargin;
  }
  public void setWithdrawableMargin(BigDecimal withdrawableMargin) {
    this.withdrawableMargin = withdrawableMargin;
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
    Margin margin = (Margin) o;
    return Objects.equals(account, margin.account) &&
        Objects.equals(currency, margin.currency) &&
        Objects.equals(riskLimit, margin.riskLimit) &&
        Objects.equals(prevState, margin.prevState) &&
        Objects.equals(state, margin.state) &&
        Objects.equals(action, margin.action) &&
        Objects.equals(amount, margin.amount) &&
        Objects.equals(pendingCredit, margin.pendingCredit) &&
        Objects.equals(pendingDebit, margin.pendingDebit) &&
        Objects.equals(prevRealisedPnl, margin.prevRealisedPnl) &&
        Objects.equals(prevUnrealisedPnl, margin.prevUnrealisedPnl) &&
        Objects.equals(grossComm, margin.grossComm) &&
        Objects.equals(grossOpenCost, margin.grossOpenCost) &&
        Objects.equals(grossOpenPremium, margin.grossOpenPremium) &&
        Objects.equals(grossExecCost, margin.grossExecCost) &&
        Objects.equals(grossMarkValue, margin.grossMarkValue) &&
        Objects.equals(riskValue, margin.riskValue) &&
        Objects.equals(taxableMargin, margin.taxableMargin) &&
        Objects.equals(initMargin, margin.initMargin) &&
        Objects.equals(maintMargin, margin.maintMargin) &&
        Objects.equals(sessionMargin, margin.sessionMargin) &&
        Objects.equals(targetExcessMargin, margin.targetExcessMargin) &&
        Objects.equals(varMargin, margin.varMargin) &&
        Objects.equals(realisedPnl, margin.realisedPnl) &&
        Objects.equals(unrealisedPnl, margin.unrealisedPnl) &&
        Objects.equals(indicativeTax, margin.indicativeTax) &&
        Objects.equals(unrealisedProfit, margin.unrealisedProfit) &&
        Objects.equals(walletBalance, margin.walletBalance) &&
        Objects.equals(marginBalance, margin.marginBalance) &&
        Objects.equals(marginBalancePcnt, margin.marginBalancePcnt) &&
        Objects.equals(marginLeverage, margin.marginLeverage) &&
        Objects.equals(marginUsedPcnt, margin.marginUsedPcnt) &&
        Objects.equals(excessMargin, margin.excessMargin) &&
        Objects.equals(excessMarginPcnt, margin.excessMarginPcnt) &&
        Objects.equals(availableMargin, margin.availableMargin) &&
        Objects.equals(withdrawableMargin, margin.withdrawableMargin) &&
        Objects.equals(timestamp, margin.timestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(account, currency, riskLimit, prevState, state, action, amount, pendingCredit, pendingDebit, prevRealisedPnl, prevUnrealisedPnl, grossComm, grossOpenCost, grossOpenPremium, grossExecCost, grossMarkValue, riskValue, taxableMargin, initMargin, maintMargin, sessionMargin, targetExcessMargin, varMargin, realisedPnl, unrealisedPnl, indicativeTax, unrealisedProfit, walletBalance, marginBalance, marginBalancePcnt, marginLeverage, marginUsedPcnt, excessMargin, excessMarginPcnt, availableMargin, withdrawableMargin, timestamp);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Margin {\n");
    
    sb.append("  account: ").append(account).append("\n");
    sb.append("  currency: ").append(currency).append("\n");
    sb.append("  riskLimit: ").append(riskLimit).append("\n");
    sb.append("  prevState: ").append(prevState).append("\n");
    sb.append("  state: ").append(state).append("\n");
    sb.append("  action: ").append(action).append("\n");
    sb.append("  amount: ").append(amount).append("\n");
    sb.append("  pendingCredit: ").append(pendingCredit).append("\n");
    sb.append("  pendingDebit: ").append(pendingDebit).append("\n");
    sb.append("  prevRealisedPnl: ").append(prevRealisedPnl).append("\n");
    sb.append("  prevUnrealisedPnl: ").append(prevUnrealisedPnl).append("\n");
    sb.append("  grossComm: ").append(grossComm).append("\n");
    sb.append("  grossOpenCost: ").append(grossOpenCost).append("\n");
    sb.append("  grossOpenPremium: ").append(grossOpenPremium).append("\n");
    sb.append("  grossExecCost: ").append(grossExecCost).append("\n");
    sb.append("  grossMarkValue: ").append(grossMarkValue).append("\n");
    sb.append("  riskValue: ").append(riskValue).append("\n");
    sb.append("  taxableMargin: ").append(taxableMargin).append("\n");
    sb.append("  initMargin: ").append(initMargin).append("\n");
    sb.append("  maintMargin: ").append(maintMargin).append("\n");
    sb.append("  sessionMargin: ").append(sessionMargin).append("\n");
    sb.append("  targetExcessMargin: ").append(targetExcessMargin).append("\n");
    sb.append("  varMargin: ").append(varMargin).append("\n");
    sb.append("  realisedPnl: ").append(realisedPnl).append("\n");
    sb.append("  unrealisedPnl: ").append(unrealisedPnl).append("\n");
    sb.append("  indicativeTax: ").append(indicativeTax).append("\n");
    sb.append("  unrealisedProfit: ").append(unrealisedProfit).append("\n");
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
