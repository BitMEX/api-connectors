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
