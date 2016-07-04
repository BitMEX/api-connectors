package io.swagger.client.model;

import java.math.BigDecimal;
import java.util.Date;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class Affiliate  {
  
  @SerializedName("account")
  private BigDecimal account = null;
  @SerializedName("currency")
  private String currency = null;
  @SerializedName("prevPayout")
  private BigDecimal prevPayout = null;
  @SerializedName("prevTurnover")
  private BigDecimal prevTurnover = null;
  @SerializedName("prevComm")
  private BigDecimal prevComm = null;
  @SerializedName("prevTimestamp")
  private Date prevTimestamp = null;
  @SerializedName("execTurnover")
  private BigDecimal execTurnover = null;
  @SerializedName("execComm")
  private BigDecimal execComm = null;
  @SerializedName("totalReferrals")
  private BigDecimal totalReferrals = null;
  @SerializedName("totalTurnover")
  private BigDecimal totalTurnover = null;
  @SerializedName("totalComm")
  private BigDecimal totalComm = null;
  @SerializedName("payoutPcnt")
  private Double payoutPcnt = null;
  @SerializedName("pendingPayout")
  private BigDecimal pendingPayout = null;
  @SerializedName("timestamp")
  private Date timestamp = null;

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
  public BigDecimal getPrevPayout() {
    return prevPayout;
  }
  public void setPrevPayout(BigDecimal prevPayout) {
    this.prevPayout = prevPayout;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getPrevTurnover() {
    return prevTurnover;
  }
  public void setPrevTurnover(BigDecimal prevTurnover) {
    this.prevTurnover = prevTurnover;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getPrevComm() {
    return prevComm;
  }
  public void setPrevComm(BigDecimal prevComm) {
    this.prevComm = prevComm;
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
  public BigDecimal getExecTurnover() {
    return execTurnover;
  }
  public void setExecTurnover(BigDecimal execTurnover) {
    this.execTurnover = execTurnover;
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
  public BigDecimal getTotalReferrals() {
    return totalReferrals;
  }
  public void setTotalReferrals(BigDecimal totalReferrals) {
    this.totalReferrals = totalReferrals;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getTotalTurnover() {
    return totalTurnover;
  }
  public void setTotalTurnover(BigDecimal totalTurnover) {
    this.totalTurnover = totalTurnover;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getTotalComm() {
    return totalComm;
  }
  public void setTotalComm(BigDecimal totalComm) {
    this.totalComm = totalComm;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Double getPayoutPcnt() {
    return payoutPcnt;
  }
  public void setPayoutPcnt(Double payoutPcnt) {
    this.payoutPcnt = payoutPcnt;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getPendingPayout() {
    return pendingPayout;
  }
  public void setPendingPayout(BigDecimal pendingPayout) {
    this.pendingPayout = pendingPayout;
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Affiliate affiliate = (Affiliate) o;
    return (account == null ? affiliate.account == null : account.equals(affiliate.account)) &&
        (currency == null ? affiliate.currency == null : currency.equals(affiliate.currency)) &&
        (prevPayout == null ? affiliate.prevPayout == null : prevPayout.equals(affiliate.prevPayout)) &&
        (prevTurnover == null ? affiliate.prevTurnover == null : prevTurnover.equals(affiliate.prevTurnover)) &&
        (prevComm == null ? affiliate.prevComm == null : prevComm.equals(affiliate.prevComm)) &&
        (prevTimestamp == null ? affiliate.prevTimestamp == null : prevTimestamp.equals(affiliate.prevTimestamp)) &&
        (execTurnover == null ? affiliate.execTurnover == null : execTurnover.equals(affiliate.execTurnover)) &&
        (execComm == null ? affiliate.execComm == null : execComm.equals(affiliate.execComm)) &&
        (totalReferrals == null ? affiliate.totalReferrals == null : totalReferrals.equals(affiliate.totalReferrals)) &&
        (totalTurnover == null ? affiliate.totalTurnover == null : totalTurnover.equals(affiliate.totalTurnover)) &&
        (totalComm == null ? affiliate.totalComm == null : totalComm.equals(affiliate.totalComm)) &&
        (payoutPcnt == null ? affiliate.payoutPcnt == null : payoutPcnt.equals(affiliate.payoutPcnt)) &&
        (pendingPayout == null ? affiliate.pendingPayout == null : pendingPayout.equals(affiliate.pendingPayout)) &&
        (timestamp == null ? affiliate.timestamp == null : timestamp.equals(affiliate.timestamp));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (account == null ? 0: account.hashCode());
    result = 31 * result + (currency == null ? 0: currency.hashCode());
    result = 31 * result + (prevPayout == null ? 0: prevPayout.hashCode());
    result = 31 * result + (prevTurnover == null ? 0: prevTurnover.hashCode());
    result = 31 * result + (prevComm == null ? 0: prevComm.hashCode());
    result = 31 * result + (prevTimestamp == null ? 0: prevTimestamp.hashCode());
    result = 31 * result + (execTurnover == null ? 0: execTurnover.hashCode());
    result = 31 * result + (execComm == null ? 0: execComm.hashCode());
    result = 31 * result + (totalReferrals == null ? 0: totalReferrals.hashCode());
    result = 31 * result + (totalTurnover == null ? 0: totalTurnover.hashCode());
    result = 31 * result + (totalComm == null ? 0: totalComm.hashCode());
    result = 31 * result + (payoutPcnt == null ? 0: payoutPcnt.hashCode());
    result = 31 * result + (pendingPayout == null ? 0: pendingPayout.hashCode());
    result = 31 * result + (timestamp == null ? 0: timestamp.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Affiliate {\n");
    
    sb.append("  account: ").append(account).append("\n");
    sb.append("  currency: ").append(currency).append("\n");
    sb.append("  prevPayout: ").append(prevPayout).append("\n");
    sb.append("  prevTurnover: ").append(prevTurnover).append("\n");
    sb.append("  prevComm: ").append(prevComm).append("\n");
    sb.append("  prevTimestamp: ").append(prevTimestamp).append("\n");
    sb.append("  execTurnover: ").append(execTurnover).append("\n");
    sb.append("  execComm: ").append(execComm).append("\n");
    sb.append("  totalReferrals: ").append(totalReferrals).append("\n");
    sb.append("  totalTurnover: ").append(totalTurnover).append("\n");
    sb.append("  totalComm: ").append(totalComm).append("\n");
    sb.append("  payoutPcnt: ").append(payoutPcnt).append("\n");
    sb.append("  pendingPayout: ").append(pendingPayout).append("\n");
    sb.append("  timestamp: ").append(timestamp).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
