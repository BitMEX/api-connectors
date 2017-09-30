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
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;

import com.google.gson.annotations.SerializedName;


import java.util.Objects;

import io.swagger.annotations.*;



@ApiModel(description = "")
public class Wallet   {
  
  @SerializedName("account")
  private BigDecimal account = null;

  @SerializedName("currency")
  private String currency = null;

  @SerializedName("prevDeposited")
  private BigDecimal prevDeposited = null;

  @SerializedName("prevWithdrawn")
  private BigDecimal prevWithdrawn = null;

  @SerializedName("prevTransferIn")
  private BigDecimal prevTransferIn = null;

  @SerializedName("prevTransferOut")
  private BigDecimal prevTransferOut = null;

  @SerializedName("prevAmount")
  private BigDecimal prevAmount = null;

  @SerializedName("prevTimestamp")
  private OffsetDateTime prevTimestamp = null;

  @SerializedName("deltaDeposited")
  private BigDecimal deltaDeposited = null;

  @SerializedName("deltaWithdrawn")
  private BigDecimal deltaWithdrawn = null;

  @SerializedName("deltaTransferIn")
  private BigDecimal deltaTransferIn = null;

  @SerializedName("deltaTransferOut")
  private BigDecimal deltaTransferOut = null;

  @SerializedName("deltaAmount")
  private BigDecimal deltaAmount = null;

  @SerializedName("deposited")
  private BigDecimal deposited = null;

  @SerializedName("withdrawn")
  private BigDecimal withdrawn = null;

  @SerializedName("transferIn")
  private BigDecimal transferIn = null;

  @SerializedName("transferOut")
  private BigDecimal transferOut = null;

  @SerializedName("amount")
  private BigDecimal amount = null;

  @SerializedName("pendingCredit")
  private BigDecimal pendingCredit = null;

  @SerializedName("pendingDebit")
  private BigDecimal pendingDebit = null;

  @SerializedName("confirmedDebit")
  private BigDecimal confirmedDebit = null;

  @SerializedName("timestamp")
  private OffsetDateTime timestamp = null;

  @SerializedName("addr")
  private String addr = null;

  @SerializedName("script")
  private String script = null;

  @SerializedName("withdrawalLock")
  private List<String> withdrawalLock = new ArrayList<String>();

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
  public BigDecimal getPrevDeposited() {
    return prevDeposited;
  }
  public void setPrevDeposited(BigDecimal prevDeposited) {
    this.prevDeposited = prevDeposited;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getPrevWithdrawn() {
    return prevWithdrawn;
  }
  public void setPrevWithdrawn(BigDecimal prevWithdrawn) {
    this.prevWithdrawn = prevWithdrawn;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getPrevTransferIn() {
    return prevTransferIn;
  }
  public void setPrevTransferIn(BigDecimal prevTransferIn) {
    this.prevTransferIn = prevTransferIn;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getPrevTransferOut() {
    return prevTransferOut;
  }
  public void setPrevTransferOut(BigDecimal prevTransferOut) {
    this.prevTransferOut = prevTransferOut;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getPrevAmount() {
    return prevAmount;
  }
  public void setPrevAmount(BigDecimal prevAmount) {
    this.prevAmount = prevAmount;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getPrevTimestamp() {
    return prevTimestamp;
  }
  public void setPrevTimestamp(OffsetDateTime prevTimestamp) {
    this.prevTimestamp = prevTimestamp;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getDeltaDeposited() {
    return deltaDeposited;
  }
  public void setDeltaDeposited(BigDecimal deltaDeposited) {
    this.deltaDeposited = deltaDeposited;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getDeltaWithdrawn() {
    return deltaWithdrawn;
  }
  public void setDeltaWithdrawn(BigDecimal deltaWithdrawn) {
    this.deltaWithdrawn = deltaWithdrawn;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getDeltaTransferIn() {
    return deltaTransferIn;
  }
  public void setDeltaTransferIn(BigDecimal deltaTransferIn) {
    this.deltaTransferIn = deltaTransferIn;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getDeltaTransferOut() {
    return deltaTransferOut;
  }
  public void setDeltaTransferOut(BigDecimal deltaTransferOut) {
    this.deltaTransferOut = deltaTransferOut;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getDeltaAmount() {
    return deltaAmount;
  }
  public void setDeltaAmount(BigDecimal deltaAmount) {
    this.deltaAmount = deltaAmount;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getDeposited() {
    return deposited;
  }
  public void setDeposited(BigDecimal deposited) {
    this.deposited = deposited;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getWithdrawn() {
    return withdrawn;
  }
  public void setWithdrawn(BigDecimal withdrawn) {
    this.withdrawn = withdrawn;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getTransferIn() {
    return transferIn;
  }
  public void setTransferIn(BigDecimal transferIn) {
    this.transferIn = transferIn;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getTransferOut() {
    return transferOut;
  }
  public void setTransferOut(BigDecimal transferOut) {
    this.transferOut = transferOut;
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
  public OffsetDateTime getTimestamp() {
    return timestamp;
  }
  public void setTimestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getAddr() {
    return addr;
  }
  public void setAddr(String addr) {
    this.addr = addr;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getScript() {
    return script;
  }
  public void setScript(String script) {
    this.script = script;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<String> getWithdrawalLock() {
    return withdrawalLock;
  }
  public void setWithdrawalLock(List<String> withdrawalLock) {
    this.withdrawalLock = withdrawalLock;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Wallet wallet = (Wallet) o;
    return Objects.equals(account, wallet.account) &&
        Objects.equals(currency, wallet.currency) &&
        Objects.equals(prevDeposited, wallet.prevDeposited) &&
        Objects.equals(prevWithdrawn, wallet.prevWithdrawn) &&
        Objects.equals(prevTransferIn, wallet.prevTransferIn) &&
        Objects.equals(prevTransferOut, wallet.prevTransferOut) &&
        Objects.equals(prevAmount, wallet.prevAmount) &&
        Objects.equals(prevTimestamp, wallet.prevTimestamp) &&
        Objects.equals(deltaDeposited, wallet.deltaDeposited) &&
        Objects.equals(deltaWithdrawn, wallet.deltaWithdrawn) &&
        Objects.equals(deltaTransferIn, wallet.deltaTransferIn) &&
        Objects.equals(deltaTransferOut, wallet.deltaTransferOut) &&
        Objects.equals(deltaAmount, wallet.deltaAmount) &&
        Objects.equals(deposited, wallet.deposited) &&
        Objects.equals(withdrawn, wallet.withdrawn) &&
        Objects.equals(transferIn, wallet.transferIn) &&
        Objects.equals(transferOut, wallet.transferOut) &&
        Objects.equals(amount, wallet.amount) &&
        Objects.equals(pendingCredit, wallet.pendingCredit) &&
        Objects.equals(pendingDebit, wallet.pendingDebit) &&
        Objects.equals(confirmedDebit, wallet.confirmedDebit) &&
        Objects.equals(timestamp, wallet.timestamp) &&
        Objects.equals(addr, wallet.addr) &&
        Objects.equals(script, wallet.script) &&
        Objects.equals(withdrawalLock, wallet.withdrawalLock);
  }

  @Override
  public int hashCode() {
    return Objects.hash(account, currency, prevDeposited, prevWithdrawn, prevTransferIn, prevTransferOut, prevAmount, prevTimestamp, deltaDeposited, deltaWithdrawn, deltaTransferIn, deltaTransferOut, deltaAmount, deposited, withdrawn, transferIn, transferOut, amount, pendingCredit, pendingDebit, confirmedDebit, timestamp, addr, script, withdrawalLock);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Wallet {\n");
    
    sb.append("    account: ").append(StringUtil.toIndentedString(account)).append("\n");
    sb.append("    currency: ").append(StringUtil.toIndentedString(currency)).append("\n");
    sb.append("    prevDeposited: ").append(StringUtil.toIndentedString(prevDeposited)).append("\n");
    sb.append("    prevWithdrawn: ").append(StringUtil.toIndentedString(prevWithdrawn)).append("\n");
    sb.append("    prevTransferIn: ").append(StringUtil.toIndentedString(prevTransferIn)).append("\n");
    sb.append("    prevTransferOut: ").append(StringUtil.toIndentedString(prevTransferOut)).append("\n");
    sb.append("    prevAmount: ").append(StringUtil.toIndentedString(prevAmount)).append("\n");
    sb.append("    prevTimestamp: ").append(StringUtil.toIndentedString(prevTimestamp)).append("\n");
    sb.append("    deltaDeposited: ").append(StringUtil.toIndentedString(deltaDeposited)).append("\n");
    sb.append("    deltaWithdrawn: ").append(StringUtil.toIndentedString(deltaWithdrawn)).append("\n");
    sb.append("    deltaTransferIn: ").append(StringUtil.toIndentedString(deltaTransferIn)).append("\n");
    sb.append("    deltaTransferOut: ").append(StringUtil.toIndentedString(deltaTransferOut)).append("\n");
    sb.append("    deltaAmount: ").append(StringUtil.toIndentedString(deltaAmount)).append("\n");
    sb.append("    deposited: ").append(StringUtil.toIndentedString(deposited)).append("\n");
    sb.append("    withdrawn: ").append(StringUtil.toIndentedString(withdrawn)).append("\n");
    sb.append("    transferIn: ").append(StringUtil.toIndentedString(transferIn)).append("\n");
    sb.append("    transferOut: ").append(StringUtil.toIndentedString(transferOut)).append("\n");
    sb.append("    amount: ").append(StringUtil.toIndentedString(amount)).append("\n");
    sb.append("    pendingCredit: ").append(StringUtil.toIndentedString(pendingCredit)).append("\n");
    sb.append("    pendingDebit: ").append(StringUtil.toIndentedString(pendingDebit)).append("\n");
    sb.append("    confirmedDebit: ").append(StringUtil.toIndentedString(confirmedDebit)).append("\n");
    sb.append("    timestamp: ").append(StringUtil.toIndentedString(timestamp)).append("\n");
    sb.append("    addr: ").append(StringUtil.toIndentedString(addr)).append("\n");
    sb.append("    script: ").append(StringUtil.toIndentedString(script)).append("\n");
    sb.append("    withdrawalLock: ").append(StringUtil.toIndentedString(withdrawalLock)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
