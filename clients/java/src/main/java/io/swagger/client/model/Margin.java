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



@ApiModel(description = "")
public class Margin   {
  
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
  private Double marginBalancePcnt = 0.0d;

  @SerializedName("marginLeverage")
  private Double marginLeverage = 0.0d;

  @SerializedName("marginUsedPcnt")
  private Double marginUsedPcnt = 0.0d;

  @SerializedName("excessMargin")
  private BigDecimal excessMargin = null;

  @SerializedName("excessMarginPcnt")
  private Double excessMarginPcnt = 0.0d;

  @SerializedName("availableMargin")
  private BigDecimal availableMargin = null;

  @SerializedName("withdrawableMargin")
  private BigDecimal withdrawableMargin = null;

  @SerializedName("timestamp")
  private OffsetDateTime timestamp = null;

  @SerializedName("grossLastValue")
  private BigDecimal grossLastValue = null;

  @SerializedName("commission")
  private Double commission = 0.0d;

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
  public OffsetDateTime getTimestamp() {
    return timestamp;
  }
  public void setTimestamp(OffsetDateTime timestamp) {
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
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Margin {\n");
    
    sb.append("    account: ").append(StringUtil.toIndentedString(account)).append("\n");
    sb.append("    currency: ").append(StringUtil.toIndentedString(currency)).append("\n");
    sb.append("    riskLimit: ").append(StringUtil.toIndentedString(riskLimit)).append("\n");
    sb.append("    prevState: ").append(StringUtil.toIndentedString(prevState)).append("\n");
    sb.append("    state: ").append(StringUtil.toIndentedString(state)).append("\n");
    sb.append("    action: ").append(StringUtil.toIndentedString(action)).append("\n");
    sb.append("    amount: ").append(StringUtil.toIndentedString(amount)).append("\n");
    sb.append("    pendingCredit: ").append(StringUtil.toIndentedString(pendingCredit)).append("\n");
    sb.append("    pendingDebit: ").append(StringUtil.toIndentedString(pendingDebit)).append("\n");
    sb.append("    confirmedDebit: ").append(StringUtil.toIndentedString(confirmedDebit)).append("\n");
    sb.append("    prevRealisedPnl: ").append(StringUtil.toIndentedString(prevRealisedPnl)).append("\n");
    sb.append("    prevUnrealisedPnl: ").append(StringUtil.toIndentedString(prevUnrealisedPnl)).append("\n");
    sb.append("    grossComm: ").append(StringUtil.toIndentedString(grossComm)).append("\n");
    sb.append("    grossOpenCost: ").append(StringUtil.toIndentedString(grossOpenCost)).append("\n");
    sb.append("    grossOpenPremium: ").append(StringUtil.toIndentedString(grossOpenPremium)).append("\n");
    sb.append("    grossExecCost: ").append(StringUtil.toIndentedString(grossExecCost)).append("\n");
    sb.append("    grossMarkValue: ").append(StringUtil.toIndentedString(grossMarkValue)).append("\n");
    sb.append("    riskValue: ").append(StringUtil.toIndentedString(riskValue)).append("\n");
    sb.append("    taxableMargin: ").append(StringUtil.toIndentedString(taxableMargin)).append("\n");
    sb.append("    initMargin: ").append(StringUtil.toIndentedString(initMargin)).append("\n");
    sb.append("    maintMargin: ").append(StringUtil.toIndentedString(maintMargin)).append("\n");
    sb.append("    sessionMargin: ").append(StringUtil.toIndentedString(sessionMargin)).append("\n");
    sb.append("    targetExcessMargin: ").append(StringUtil.toIndentedString(targetExcessMargin)).append("\n");
    sb.append("    varMargin: ").append(StringUtil.toIndentedString(varMargin)).append("\n");
    sb.append("    realisedPnl: ").append(StringUtil.toIndentedString(realisedPnl)).append("\n");
    sb.append("    unrealisedPnl: ").append(StringUtil.toIndentedString(unrealisedPnl)).append("\n");
    sb.append("    indicativeTax: ").append(StringUtil.toIndentedString(indicativeTax)).append("\n");
    sb.append("    unrealisedProfit: ").append(StringUtil.toIndentedString(unrealisedProfit)).append("\n");
    sb.append("    syntheticMargin: ").append(StringUtil.toIndentedString(syntheticMargin)).append("\n");
    sb.append("    walletBalance: ").append(StringUtil.toIndentedString(walletBalance)).append("\n");
    sb.append("    marginBalance: ").append(StringUtil.toIndentedString(marginBalance)).append("\n");
    sb.append("    marginBalancePcnt: ").append(StringUtil.toIndentedString(marginBalancePcnt)).append("\n");
    sb.append("    marginLeverage: ").append(StringUtil.toIndentedString(marginLeverage)).append("\n");
    sb.append("    marginUsedPcnt: ").append(StringUtil.toIndentedString(marginUsedPcnt)).append("\n");
    sb.append("    excessMargin: ").append(StringUtil.toIndentedString(excessMargin)).append("\n");
    sb.append("    excessMarginPcnt: ").append(StringUtil.toIndentedString(excessMarginPcnt)).append("\n");
    sb.append("    availableMargin: ").append(StringUtil.toIndentedString(availableMargin)).append("\n");
    sb.append("    withdrawableMargin: ").append(StringUtil.toIndentedString(withdrawableMargin)).append("\n");
    sb.append("    timestamp: ").append(StringUtil.toIndentedString(timestamp)).append("\n");
    sb.append("    grossLastValue: ").append(StringUtil.toIndentedString(grossLastValue)).append("\n");
    sb.append("    commission: ").append(StringUtil.toIndentedString(commission)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
