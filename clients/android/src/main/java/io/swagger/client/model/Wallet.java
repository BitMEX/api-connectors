package io.swagger.client.model;

import java.math.BigDecimal;
import java.util.Date;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class Wallet  {
  
  @SerializedName("account")
  private BigDecimal account = null;
  @SerializedName("currency")
  private String currency = null;
  @SerializedName("prevDeposited")
  private BigDecimal prevDeposited = null;
  @SerializedName("prevWithdrawn")
  private BigDecimal prevWithdrawn = null;
  @SerializedName("prevAmount")
  private BigDecimal prevAmount = null;
  @SerializedName("prevTimestamp")
  private Date prevTimestamp = null;
  @SerializedName("deltaDeposited")
  private BigDecimal deltaDeposited = null;
  @SerializedName("deltaWithdrawn")
  private BigDecimal deltaWithdrawn = null;
  @SerializedName("deltaAmount")
  private BigDecimal deltaAmount = null;
  @SerializedName("deposited")
  private BigDecimal deposited = null;
  @SerializedName("withdrawn")
  private BigDecimal withdrawn = null;
  @SerializedName("amount")
  private BigDecimal amount = null;
  @SerializedName("pendingCredit")
  private BigDecimal pendingCredit = null;
  @SerializedName("pendingDebit")
  private BigDecimal pendingDebit = null;
  @SerializedName("confirmedDebit")
  private BigDecimal confirmedDebit = null;
  @SerializedName("timestamp")
  private Date timestamp = null;
  @SerializedName("addr")
  private String addr = null;

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
  public BigDecimal getPrevAmount() {
    return prevAmount;
  }
  public void setPrevAmount(BigDecimal prevAmount) {
    this.prevAmount = prevAmount;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Date getPrevTimestamp() {
    return prevTimestamp;
  }
  public void setPrevTimestamp(Date prevTimestamp) {
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
  public Date getTimestamp() {
    return timestamp;
  }
  public void setTimestamp(Date timestamp) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Wallet wallet = (Wallet) o;
    return (account == null ? wallet.account == null : account.equals(wallet.account)) &&
        (currency == null ? wallet.currency == null : currency.equals(wallet.currency)) &&
        (prevDeposited == null ? wallet.prevDeposited == null : prevDeposited.equals(wallet.prevDeposited)) &&
        (prevWithdrawn == null ? wallet.prevWithdrawn == null : prevWithdrawn.equals(wallet.prevWithdrawn)) &&
        (prevAmount == null ? wallet.prevAmount == null : prevAmount.equals(wallet.prevAmount)) &&
        (prevTimestamp == null ? wallet.prevTimestamp == null : prevTimestamp.equals(wallet.prevTimestamp)) &&
        (deltaDeposited == null ? wallet.deltaDeposited == null : deltaDeposited.equals(wallet.deltaDeposited)) &&
        (deltaWithdrawn == null ? wallet.deltaWithdrawn == null : deltaWithdrawn.equals(wallet.deltaWithdrawn)) &&
        (deltaAmount == null ? wallet.deltaAmount == null : deltaAmount.equals(wallet.deltaAmount)) &&
        (deposited == null ? wallet.deposited == null : deposited.equals(wallet.deposited)) &&
        (withdrawn == null ? wallet.withdrawn == null : withdrawn.equals(wallet.withdrawn)) &&
        (amount == null ? wallet.amount == null : amount.equals(wallet.amount)) &&
        (pendingCredit == null ? wallet.pendingCredit == null : pendingCredit.equals(wallet.pendingCredit)) &&
        (pendingDebit == null ? wallet.pendingDebit == null : pendingDebit.equals(wallet.pendingDebit)) &&
        (confirmedDebit == null ? wallet.confirmedDebit == null : confirmedDebit.equals(wallet.confirmedDebit)) &&
        (timestamp == null ? wallet.timestamp == null : timestamp.equals(wallet.timestamp)) &&
        (addr == null ? wallet.addr == null : addr.equals(wallet.addr));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (account == null ? 0: account.hashCode());
    result = 31 * result + (currency == null ? 0: currency.hashCode());
    result = 31 * result + (prevDeposited == null ? 0: prevDeposited.hashCode());
    result = 31 * result + (prevWithdrawn == null ? 0: prevWithdrawn.hashCode());
    result = 31 * result + (prevAmount == null ? 0: prevAmount.hashCode());
    result = 31 * result + (prevTimestamp == null ? 0: prevTimestamp.hashCode());
    result = 31 * result + (deltaDeposited == null ? 0: deltaDeposited.hashCode());
    result = 31 * result + (deltaWithdrawn == null ? 0: deltaWithdrawn.hashCode());
    result = 31 * result + (deltaAmount == null ? 0: deltaAmount.hashCode());
    result = 31 * result + (deposited == null ? 0: deposited.hashCode());
    result = 31 * result + (withdrawn == null ? 0: withdrawn.hashCode());
    result = 31 * result + (amount == null ? 0: amount.hashCode());
    result = 31 * result + (pendingCredit == null ? 0: pendingCredit.hashCode());
    result = 31 * result + (pendingDebit == null ? 0: pendingDebit.hashCode());
    result = 31 * result + (confirmedDebit == null ? 0: confirmedDebit.hashCode());
    result = 31 * result + (timestamp == null ? 0: timestamp.hashCode());
    result = 31 * result + (addr == null ? 0: addr.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Wallet {\n");
    
    sb.append("  account: ").append(account).append("\n");
    sb.append("  currency: ").append(currency).append("\n");
    sb.append("  prevDeposited: ").append(prevDeposited).append("\n");
    sb.append("  prevWithdrawn: ").append(prevWithdrawn).append("\n");
    sb.append("  prevAmount: ").append(prevAmount).append("\n");
    sb.append("  prevTimestamp: ").append(prevTimestamp).append("\n");
    sb.append("  deltaDeposited: ").append(deltaDeposited).append("\n");
    sb.append("  deltaWithdrawn: ").append(deltaWithdrawn).append("\n");
    sb.append("  deltaAmount: ").append(deltaAmount).append("\n");
    sb.append("  deposited: ").append(deposited).append("\n");
    sb.append("  withdrawn: ").append(withdrawn).append("\n");
    sb.append("  amount: ").append(amount).append("\n");
    sb.append("  pendingCredit: ").append(pendingCredit).append("\n");
    sb.append("  pendingDebit: ").append(pendingDebit).append("\n");
    sb.append("  confirmedDebit: ").append(confirmedDebit).append("\n");
    sb.append("  timestamp: ").append(timestamp).append("\n");
    sb.append("  addr: ").append(addr).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
