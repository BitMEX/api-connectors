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
public class Affiliate   {
  
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
  private OffsetDateTime prevTimestamp = null;

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
  private OffsetDateTime timestamp = null;

  @SerializedName("referrerAccount")
  private Double referrerAccount = null;

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
  public OffsetDateTime getPrevTimestamp() {
    return prevTimestamp;
  }
  public void setPrevTimestamp(OffsetDateTime prevTimestamp) {
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
  public OffsetDateTime getTimestamp() {
    return timestamp;
  }
  public void setTimestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Double getReferrerAccount() {
    return referrerAccount;
  }
  public void setReferrerAccount(Double referrerAccount) {
    this.referrerAccount = referrerAccount;
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
    return Objects.equals(account, affiliate.account) &&
        Objects.equals(currency, affiliate.currency) &&
        Objects.equals(prevPayout, affiliate.prevPayout) &&
        Objects.equals(prevTurnover, affiliate.prevTurnover) &&
        Objects.equals(prevComm, affiliate.prevComm) &&
        Objects.equals(prevTimestamp, affiliate.prevTimestamp) &&
        Objects.equals(execTurnover, affiliate.execTurnover) &&
        Objects.equals(execComm, affiliate.execComm) &&
        Objects.equals(totalReferrals, affiliate.totalReferrals) &&
        Objects.equals(totalTurnover, affiliate.totalTurnover) &&
        Objects.equals(totalComm, affiliate.totalComm) &&
        Objects.equals(payoutPcnt, affiliate.payoutPcnt) &&
        Objects.equals(pendingPayout, affiliate.pendingPayout) &&
        Objects.equals(timestamp, affiliate.timestamp) &&
        Objects.equals(referrerAccount, affiliate.referrerAccount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(account, currency, prevPayout, prevTurnover, prevComm, prevTimestamp, execTurnover, execComm, totalReferrals, totalTurnover, totalComm, payoutPcnt, pendingPayout, timestamp, referrerAccount);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Affiliate {\n");
    
    sb.append("    account: ").append(StringUtil.toIndentedString(account)).append("\n");
    sb.append("    currency: ").append(StringUtil.toIndentedString(currency)).append("\n");
    sb.append("    prevPayout: ").append(StringUtil.toIndentedString(prevPayout)).append("\n");
    sb.append("    prevTurnover: ").append(StringUtil.toIndentedString(prevTurnover)).append("\n");
    sb.append("    prevComm: ").append(StringUtil.toIndentedString(prevComm)).append("\n");
    sb.append("    prevTimestamp: ").append(StringUtil.toIndentedString(prevTimestamp)).append("\n");
    sb.append("    execTurnover: ").append(StringUtil.toIndentedString(execTurnover)).append("\n");
    sb.append("    execComm: ").append(StringUtil.toIndentedString(execComm)).append("\n");
    sb.append("    totalReferrals: ").append(StringUtil.toIndentedString(totalReferrals)).append("\n");
    sb.append("    totalTurnover: ").append(StringUtil.toIndentedString(totalTurnover)).append("\n");
    sb.append("    totalComm: ").append(StringUtil.toIndentedString(totalComm)).append("\n");
    sb.append("    payoutPcnt: ").append(StringUtil.toIndentedString(payoutPcnt)).append("\n");
    sb.append("    pendingPayout: ").append(StringUtil.toIndentedString(pendingPayout)).append("\n");
    sb.append("    timestamp: ").append(StringUtil.toIndentedString(timestamp)).append("\n");
    sb.append("    referrerAccount: ").append(StringUtil.toIndentedString(referrerAccount)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
