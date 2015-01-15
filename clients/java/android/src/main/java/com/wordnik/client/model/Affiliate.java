package com.wordnik.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;
public class Affiliate {
  @JsonProperty("account")
  private Double account = null;
  @JsonProperty("currency")
  private String currency = null;
  @JsonProperty("prevPayout")
  private Double prevPayout = null;
  @JsonProperty("prevTurnover")
  private Double prevTurnover = null;
  @JsonProperty("prevComm")
  private Double prevComm = null;
  @JsonProperty("prevTimestamp")
  private Date prevTimestamp = null;
  @JsonProperty("execTurnover")
  private Double execTurnover = null;
  @JsonProperty("execComm")
  private Double execComm = null;
  @JsonProperty("totalReferrals")
  private Double totalReferrals = null;
  @JsonProperty("totalTurnover")
  private Double totalTurnover = null;
  @JsonProperty("totalComm")
  private Double totalComm = null;
  @JsonProperty("payoutPcnt")
  private Double payoutPcnt = null;
  @JsonProperty("pendingPayout")
  private Double pendingPayout = null;
  @JsonProperty("timestamp")
  private Date timestamp = null;
  public Double getAccount() {
    return account;
  }
  public void setAccount(Double account) {
    this.account = account;
  }

  public String getCurrency() {
    return currency;
  }
  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public Double getPrevPayout() {
    return prevPayout;
  }
  public void setPrevPayout(Double prevPayout) {
    this.prevPayout = prevPayout;
  }

  public Double getPrevTurnover() {
    return prevTurnover;
  }
  public void setPrevTurnover(Double prevTurnover) {
    this.prevTurnover = prevTurnover;
  }

  public Double getPrevComm() {
    return prevComm;
  }
  public void setPrevComm(Double prevComm) {
    this.prevComm = prevComm;
  }

  public Date getPrevTimestamp() {
    return prevTimestamp;
  }
  public void setPrevTimestamp(Date prevTimestamp) {
    this.prevTimestamp = prevTimestamp;
  }

  public Double getExecTurnover() {
    return execTurnover;
  }
  public void setExecTurnover(Double execTurnover) {
    this.execTurnover = execTurnover;
  }

  public Double getExecComm() {
    return execComm;
  }
  public void setExecComm(Double execComm) {
    this.execComm = execComm;
  }

  public Double getTotalReferrals() {
    return totalReferrals;
  }
  public void setTotalReferrals(Double totalReferrals) {
    this.totalReferrals = totalReferrals;
  }

  public Double getTotalTurnover() {
    return totalTurnover;
  }
  public void setTotalTurnover(Double totalTurnover) {
    this.totalTurnover = totalTurnover;
  }

  public Double getTotalComm() {
    return totalComm;
  }
  public void setTotalComm(Double totalComm) {
    this.totalComm = totalComm;
  }

  public Double getPayoutPcnt() {
    return payoutPcnt;
  }
  public void setPayoutPcnt(Double payoutPcnt) {
    this.payoutPcnt = payoutPcnt;
  }

  public Double getPendingPayout() {
    return pendingPayout;
  }
  public void setPendingPayout(Double pendingPayout) {
    this.pendingPayout = pendingPayout;
  }

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

