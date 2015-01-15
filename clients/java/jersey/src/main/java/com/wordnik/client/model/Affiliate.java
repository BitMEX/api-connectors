package com.wordnik.client.model;

import java.util.Date;
public class Affiliate {
  private Double account = null;
  private String currency = null;
  private Double prevPayout = null;
  private Double prevTurnover = null;
  private Double prevComm = null;
  private Date prevTimestamp = null;
  private Double execTurnover = null;
  private Double execComm = null;
  private Double totalReferrals = null;
  private Double totalTurnover = null;
  private Double totalComm = null;
  private Double payoutPcnt = null;
  private Double pendingPayout = null;
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

