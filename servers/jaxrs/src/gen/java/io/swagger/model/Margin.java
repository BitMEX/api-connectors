package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.Date;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-07-05T09:41:09.909-05:00")
public class Margin   {
  
  private BigDecimal account = null;
  private String currency = null;
  private BigDecimal riskLimit = null;
  private String prevState = null;
  private String state = null;
  private String action = null;
  private BigDecimal amount = null;
  private BigDecimal pendingCredit = null;
  private BigDecimal pendingDebit = null;
  private BigDecimal confirmedDebit = null;
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
  private BigDecimal syntheticMargin = null;
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
  private BigDecimal grossLastValue = null;
  private Double commission = 0.0d;

  /**
   **/
  public Margin account(BigDecimal account) {
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
  public Margin currency(String currency) {
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
  public Margin riskLimit(BigDecimal riskLimit) {
    this.riskLimit = riskLimit;
    return this;
  }

  
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
  public Margin prevState(String prevState) {
    this.prevState = prevState;
    return this;
  }

  
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
  public Margin state(String state) {
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
  public Margin action(String action) {
    this.action = action;
    return this;
  }

  
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
  public Margin amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

  
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
  public Margin pendingCredit(BigDecimal pendingCredit) {
    this.pendingCredit = pendingCredit;
    return this;
  }

  
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
  public Margin pendingDebit(BigDecimal pendingDebit) {
    this.pendingDebit = pendingDebit;
    return this;
  }

  
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
  public Margin confirmedDebit(BigDecimal confirmedDebit) {
    this.confirmedDebit = confirmedDebit;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("confirmedDebit")
  public BigDecimal getConfirmedDebit() {
    return confirmedDebit;
  }
  public void setConfirmedDebit(BigDecimal confirmedDebit) {
    this.confirmedDebit = confirmedDebit;
  }

  /**
   **/
  public Margin prevRealisedPnl(BigDecimal prevRealisedPnl) {
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
  public Margin prevUnrealisedPnl(BigDecimal prevUnrealisedPnl) {
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
  public Margin grossComm(BigDecimal grossComm) {
    this.grossComm = grossComm;
    return this;
  }

  
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
  public Margin grossOpenCost(BigDecimal grossOpenCost) {
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
  public Margin grossOpenPremium(BigDecimal grossOpenPremium) {
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
  public Margin grossExecCost(BigDecimal grossExecCost) {
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
  public Margin grossMarkValue(BigDecimal grossMarkValue) {
    this.grossMarkValue = grossMarkValue;
    return this;
  }

  
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
  public Margin riskValue(BigDecimal riskValue) {
    this.riskValue = riskValue;
    return this;
  }

  
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
  public Margin taxableMargin(BigDecimal taxableMargin) {
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
  public Margin initMargin(BigDecimal initMargin) {
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
  public Margin maintMargin(BigDecimal maintMargin) {
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
  public Margin sessionMargin(BigDecimal sessionMargin) {
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
  public Margin targetExcessMargin(BigDecimal targetExcessMargin) {
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
  public Margin varMargin(BigDecimal varMargin) {
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
  public Margin realisedPnl(BigDecimal realisedPnl) {
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
  public Margin unrealisedPnl(BigDecimal unrealisedPnl) {
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
  public Margin indicativeTax(BigDecimal indicativeTax) {
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
  public Margin unrealisedProfit(BigDecimal unrealisedProfit) {
    this.unrealisedProfit = unrealisedProfit;
    return this;
  }

  
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
  public Margin syntheticMargin(BigDecimal syntheticMargin) {
    this.syntheticMargin = syntheticMargin;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("syntheticMargin")
  public BigDecimal getSyntheticMargin() {
    return syntheticMargin;
  }
  public void setSyntheticMargin(BigDecimal syntheticMargin) {
    this.syntheticMargin = syntheticMargin;
  }

  /**
   **/
  public Margin walletBalance(BigDecimal walletBalance) {
    this.walletBalance = walletBalance;
    return this;
  }

  
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
  public Margin marginBalance(BigDecimal marginBalance) {
    this.marginBalance = marginBalance;
    return this;
  }

  
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
  public Margin marginBalancePcnt(Double marginBalancePcnt) {
    this.marginBalancePcnt = marginBalancePcnt;
    return this;
  }

  
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
  public Margin marginLeverage(Double marginLeverage) {
    this.marginLeverage = marginLeverage;
    return this;
  }

  
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
  public Margin marginUsedPcnt(Double marginUsedPcnt) {
    this.marginUsedPcnt = marginUsedPcnt;
    return this;
  }

  
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
  public Margin excessMargin(BigDecimal excessMargin) {
    this.excessMargin = excessMargin;
    return this;
  }

  
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
  public Margin excessMarginPcnt(Double excessMarginPcnt) {
    this.excessMarginPcnt = excessMarginPcnt;
    return this;
  }

  
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
  public Margin availableMargin(BigDecimal availableMargin) {
    this.availableMargin = availableMargin;
    return this;
  }

  
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
  public Margin withdrawableMargin(BigDecimal withdrawableMargin) {
    this.withdrawableMargin = withdrawableMargin;
    return this;
  }

  
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
  public Margin timestamp(Date timestamp) {
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
  public Margin grossLastValue(BigDecimal grossLastValue) {
    this.grossLastValue = grossLastValue;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("grossLastValue")
  public BigDecimal getGrossLastValue() {
    return grossLastValue;
  }
  public void setGrossLastValue(BigDecimal grossLastValue) {
    this.grossLastValue = grossLastValue;
  }

  /**
   **/
  public Margin commission(Double commission) {
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
        Objects.equals(confirmedDebit, margin.confirmedDebit) &&
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
        Objects.equals(syntheticMargin, margin.syntheticMargin) &&
        Objects.equals(walletBalance, margin.walletBalance) &&
        Objects.equals(marginBalance, margin.marginBalance) &&
        Objects.equals(marginBalancePcnt, margin.marginBalancePcnt) &&
        Objects.equals(marginLeverage, margin.marginLeverage) &&
        Objects.equals(marginUsedPcnt, margin.marginUsedPcnt) &&
        Objects.equals(excessMargin, margin.excessMargin) &&
        Objects.equals(excessMarginPcnt, margin.excessMarginPcnt) &&
        Objects.equals(availableMargin, margin.availableMargin) &&
        Objects.equals(withdrawableMargin, margin.withdrawableMargin) &&
        Objects.equals(timestamp, margin.timestamp) &&
        Objects.equals(grossLastValue, margin.grossLastValue) &&
        Objects.equals(commission, margin.commission);
  }

  @Override
  public int hashCode() {
    return Objects.hash(account, currency, riskLimit, prevState, state, action, amount, pendingCredit, pendingDebit, confirmedDebit, prevRealisedPnl, prevUnrealisedPnl, grossComm, grossOpenCost, grossOpenPremium, grossExecCost, grossMarkValue, riskValue, taxableMargin, initMargin, maintMargin, sessionMargin, targetExcessMargin, varMargin, realisedPnl, unrealisedPnl, indicativeTax, unrealisedProfit, syntheticMargin, walletBalance, marginBalance, marginBalancePcnt, marginLeverage, marginUsedPcnt, excessMargin, excessMarginPcnt, availableMargin, withdrawableMargin, timestamp, grossLastValue, commission);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Margin {\n");
    
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    riskLimit: ").append(toIndentedString(riskLimit)).append("\n");
    sb.append("    prevState: ").append(toIndentedString(prevState)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    pendingCredit: ").append(toIndentedString(pendingCredit)).append("\n");
    sb.append("    pendingDebit: ").append(toIndentedString(pendingDebit)).append("\n");
    sb.append("    confirmedDebit: ").append(toIndentedString(confirmedDebit)).append("\n");
    sb.append("    prevRealisedPnl: ").append(toIndentedString(prevRealisedPnl)).append("\n");
    sb.append("    prevUnrealisedPnl: ").append(toIndentedString(prevUnrealisedPnl)).append("\n");
    sb.append("    grossComm: ").append(toIndentedString(grossComm)).append("\n");
    sb.append("    grossOpenCost: ").append(toIndentedString(grossOpenCost)).append("\n");
    sb.append("    grossOpenPremium: ").append(toIndentedString(grossOpenPremium)).append("\n");
    sb.append("    grossExecCost: ").append(toIndentedString(grossExecCost)).append("\n");
    sb.append("    grossMarkValue: ").append(toIndentedString(grossMarkValue)).append("\n");
    sb.append("    riskValue: ").append(toIndentedString(riskValue)).append("\n");
    sb.append("    taxableMargin: ").append(toIndentedString(taxableMargin)).append("\n");
    sb.append("    initMargin: ").append(toIndentedString(initMargin)).append("\n");
    sb.append("    maintMargin: ").append(toIndentedString(maintMargin)).append("\n");
    sb.append("    sessionMargin: ").append(toIndentedString(sessionMargin)).append("\n");
    sb.append("    targetExcessMargin: ").append(toIndentedString(targetExcessMargin)).append("\n");
    sb.append("    varMargin: ").append(toIndentedString(varMargin)).append("\n");
    sb.append("    realisedPnl: ").append(toIndentedString(realisedPnl)).append("\n");
    sb.append("    unrealisedPnl: ").append(toIndentedString(unrealisedPnl)).append("\n");
    sb.append("    indicativeTax: ").append(toIndentedString(indicativeTax)).append("\n");
    sb.append("    unrealisedProfit: ").append(toIndentedString(unrealisedProfit)).append("\n");
    sb.append("    syntheticMargin: ").append(toIndentedString(syntheticMargin)).append("\n");
    sb.append("    walletBalance: ").append(toIndentedString(walletBalance)).append("\n");
    sb.append("    marginBalance: ").append(toIndentedString(marginBalance)).append("\n");
    sb.append("    marginBalancePcnt: ").append(toIndentedString(marginBalancePcnt)).append("\n");
    sb.append("    marginLeverage: ").append(toIndentedString(marginLeverage)).append("\n");
    sb.append("    marginUsedPcnt: ").append(toIndentedString(marginUsedPcnt)).append("\n");
    sb.append("    excessMargin: ").append(toIndentedString(excessMargin)).append("\n");
    sb.append("    excessMarginPcnt: ").append(toIndentedString(excessMarginPcnt)).append("\n");
    sb.append("    availableMargin: ").append(toIndentedString(availableMargin)).append("\n");
    sb.append("    withdrawableMargin: ").append(toIndentedString(withdrawableMargin)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    grossLastValue: ").append(toIndentedString(grossLastValue)).append("\n");
    sb.append("    commission: ").append(toIndentedString(commission)).append("\n");
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

