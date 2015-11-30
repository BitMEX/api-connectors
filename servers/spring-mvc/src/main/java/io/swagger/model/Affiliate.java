package io.swagger.model;

import java.math.BigDecimal;
import java.util.Date;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringMVCServerCodegen", date = "2015-11-30T13:36:04.774-06:00")
public class Affiliate  {
  
  private BigDecimal account = null;
  private String currency = null;
  private BigDecimal prevPayout = null;
  private BigDecimal prevTurnover = null;
  private BigDecimal prevComm = null;
  private Date prevTimestamp = null;
  private BigDecimal execTurnover = null;
  private BigDecimal execComm = null;
  private BigDecimal totalReferrals = null;
  private BigDecimal totalTurnover = null;
  private BigDecimal totalComm = null;
  private Double payoutPcnt = null;
  private BigDecimal pendingPayout = null;
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
  @JsonProperty("prevPayout")
  public BigDecimal getPrevPayout() {
    return prevPayout;
  }
  public void setPrevPayout(BigDecimal prevPayout) {
    this.prevPayout = prevPayout;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("prevTurnover")
  public BigDecimal getPrevTurnover() {
    return prevTurnover;
  }
  public void setPrevTurnover(BigDecimal prevTurnover) {
    this.prevTurnover = prevTurnover;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("prevComm")
  public BigDecimal getPrevComm() {
    return prevComm;
  }
  public void setPrevComm(BigDecimal prevComm) {
    this.prevComm = prevComm;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("prevTimestamp")
  public Date getPrevTimestamp() {
    return prevTimestamp;
  }
  public void setPrevTimestamp(Date prevTimestamp) {
    this.prevTimestamp = prevTimestamp;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("execTurnover")
  public BigDecimal getExecTurnover() {
    return execTurnover;
  }
  public void setExecTurnover(BigDecimal execTurnover) {
    this.execTurnover = execTurnover;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("execComm")
  public BigDecimal getExecComm() {
    return execComm;
  }
  public void setExecComm(BigDecimal execComm) {
    this.execComm = execComm;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("totalReferrals")
  public BigDecimal getTotalReferrals() {
    return totalReferrals;
  }
  public void setTotalReferrals(BigDecimal totalReferrals) {
    this.totalReferrals = totalReferrals;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("totalTurnover")
  public BigDecimal getTotalTurnover() {
    return totalTurnover;
  }
  public void setTotalTurnover(BigDecimal totalTurnover) {
    this.totalTurnover = totalTurnover;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("totalComm")
  public BigDecimal getTotalComm() {
    return totalComm;
  }
  public void setTotalComm(BigDecimal totalComm) {
    this.totalComm = totalComm;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("payoutPcnt")
  public Double getPayoutPcnt() {
    return payoutPcnt;
  }
  public void setPayoutPcnt(Double payoutPcnt) {
    this.payoutPcnt = payoutPcnt;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("pendingPayout")
  public BigDecimal getPendingPayout() {
    return pendingPayout;
  }
  public void setPendingPayout(BigDecimal pendingPayout) {
    this.pendingPayout = pendingPayout;
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
        Objects.equals(timestamp, affiliate.timestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(account, currency, prevPayout, prevTurnover, prevComm, prevTimestamp, execTurnover, execComm, totalReferrals, totalTurnover, totalComm, payoutPcnt, pendingPayout, timestamp);
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
