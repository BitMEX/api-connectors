package io.swagger.client.model;

import java.math.BigDecimal;
import java.util.Date;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class Margin  {
  
  @SerializedName("account")
  private BigDecimal account = null;
  @SerializedName("currency")
  private String currency = null;
  @SerializedName("riskLimit")
  private BigDecimal riskLimit = null;
  @SerializedName("prevState")
  private String prevState = null;
  @SerializedName("state")
  private String state = null;
  @SerializedName("action")
  private String action = null;
  @SerializedName("amount")
  private BigDecimal amount = null;
  @SerializedName("pendingCredit")
  private BigDecimal pendingCredit = null;
  @SerializedName("pendingDebit")
  private BigDecimal pendingDebit = null;
  @SerializedName("confirmedDebit")
  private BigDecimal confirmedDebit = null;
  @SerializedName("prevRealisedPnl")
  private BigDecimal prevRealisedPnl = null;
  @SerializedName("prevUnrealisedPnl")
  private BigDecimal prevUnrealisedPnl = null;
  @SerializedName("grossComm")
  private BigDecimal grossComm = null;
  @SerializedName("grossOpenCost")
  private BigDecimal grossOpenCost = null;
  @SerializedName("grossOpenPremium")
  private BigDecimal grossOpenPremium = null;
  @SerializedName("grossExecCost")
  private BigDecimal grossExecCost = null;
  @SerializedName("grossMarkValue")
  private BigDecimal grossMarkValue = null;
  @SerializedName("riskValue")
  private BigDecimal riskValue = null;
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
  @SerializedName("realisedPnl")
  private BigDecimal realisedPnl = null;
  @SerializedName("unrealisedPnl")
  private BigDecimal unrealisedPnl = null;
  @SerializedName("indicativeTax")
  private BigDecimal indicativeTax = null;
  @SerializedName("unrealisedProfit")
  private BigDecimal unrealisedProfit = null;
  @SerializedName("syntheticMargin")
  private BigDecimal syntheticMargin = null;
  @SerializedName("walletBalance")
  private BigDecimal walletBalance = null;
  @SerializedName("marginBalance")
  private BigDecimal marginBalance = null;
  @SerializedName("marginBalancePcnt")
  private Double marginBalancePcnt = 0.0;
  @SerializedName("marginLeverage")
  private Double marginLeverage = 0.0;
  @SerializedName("marginUsedPcnt")
  private Double marginUsedPcnt = 0.0;
  @SerializedName("excessMargin")
  private BigDecimal excessMargin = null;
  @SerializedName("excessMarginPcnt")
  private Double excessMarginPcnt = 0.0;
  @SerializedName("availableMargin")
  private BigDecimal availableMargin = null;
  @SerializedName("withdrawableMargin")
  private BigDecimal withdrawableMargin = null;
  @SerializedName("timestamp")
  private Date timestamp = null;
  @SerializedName("grossLastValue")
  private BigDecimal grossLastValue = null;
  @SerializedName("commission")
  private Double commission = 0.0;

  
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
  public String getCurrency() {
    return currency;
  }
  public void setCurrency(String currency) {
    this.currency = currency;
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
  public String getPrevState() {
    return prevState;
  }
  public void setPrevState(String prevState) {
    this.prevState = prevState;
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
  public String getAction() {
    return action;
  }
  public void setAction(String action) {
    this.action = action;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getAmount() {
    return amount;
  }
  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getPendingCredit() {
    return pendingCredit;
  }
  public void setPendingCredit(BigDecimal pendingCredit) {
    this.pendingCredit = pendingCredit;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getPendingDebit() {
    return pendingDebit;
  }
  public void setPendingDebit(BigDecimal pendingDebit) {
    this.pendingDebit = pendingDebit;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getConfirmedDebit() {
    return confirmedDebit;
  }
  public void setConfirmedDebit(BigDecimal confirmedDebit) {
    this.confirmedDebit = confirmedDebit;
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
  public BigDecimal getGrossComm() {
    return grossComm;
  }
  public void setGrossComm(BigDecimal grossComm) {
    this.grossComm = grossComm;
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
  public BigDecimal getGrossMarkValue() {
    return grossMarkValue;
  }
  public void setGrossMarkValue(BigDecimal grossMarkValue) {
    this.grossMarkValue = grossMarkValue;
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
  public BigDecimal getRealisedPnl() {
    return realisedPnl;
  }
  public void setRealisedPnl(BigDecimal realisedPnl) {
    this.realisedPnl = realisedPnl;
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
  public BigDecimal getIndicativeTax() {
    return indicativeTax;
  }
  public void setIndicativeTax(BigDecimal indicativeTax) {
    this.indicativeTax = indicativeTax;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getUnrealisedProfit() {
    return unrealisedProfit;
  }
  public void setUnrealisedProfit(BigDecimal unrealisedProfit) {
    this.unrealisedProfit = unrealisedProfit;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getSyntheticMargin() {
    return syntheticMargin;
  }
  public void setSyntheticMargin(BigDecimal syntheticMargin) {
    this.syntheticMargin = syntheticMargin;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getWalletBalance() {
    return walletBalance;
  }
  public void setWalletBalance(BigDecimal walletBalance) {
    this.walletBalance = walletBalance;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getMarginBalance() {
    return marginBalance;
  }
  public void setMarginBalance(BigDecimal marginBalance) {
    this.marginBalance = marginBalance;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Double getMarginBalancePcnt() {
    return marginBalancePcnt;
  }
  public void setMarginBalancePcnt(Double marginBalancePcnt) {
    this.marginBalancePcnt = marginBalancePcnt;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Double getMarginLeverage() {
    return marginLeverage;
  }
  public void setMarginLeverage(Double marginLeverage) {
    this.marginLeverage = marginLeverage;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Double getMarginUsedPcnt() {
    return marginUsedPcnt;
  }
  public void setMarginUsedPcnt(Double marginUsedPcnt) {
    this.marginUsedPcnt = marginUsedPcnt;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getExcessMargin() {
    return excessMargin;
  }
  public void setExcessMargin(BigDecimal excessMargin) {
    this.excessMargin = excessMargin;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Double getExcessMarginPcnt() {
    return excessMarginPcnt;
  }
  public void setExcessMarginPcnt(Double excessMarginPcnt) {
    this.excessMarginPcnt = excessMarginPcnt;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getAvailableMargin() {
    return availableMargin;
  }
  public void setAvailableMargin(BigDecimal availableMargin) {
    this.availableMargin = availableMargin;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getWithdrawableMargin() {
    return withdrawableMargin;
  }
  public void setWithdrawableMargin(BigDecimal withdrawableMargin) {
    this.withdrawableMargin = withdrawableMargin;
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
  public BigDecimal getGrossLastValue() {
    return grossLastValue;
  }
  public void setGrossLastValue(BigDecimal grossLastValue) {
    this.grossLastValue = grossLastValue;
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
    sb.append("  confirmedDebit: ").append(confirmedDebit).append("\n");
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
    sb.append("  syntheticMargin: ").append(syntheticMargin).append("\n");
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
    sb.append("  grossLastValue: ").append(grossLastValue).append("\n");
    sb.append("  commission: ").append(commission).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
