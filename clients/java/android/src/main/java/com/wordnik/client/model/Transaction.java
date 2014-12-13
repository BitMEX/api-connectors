package com.wordnik.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;
public class Transaction {
  @JsonProperty("transactID")
  private String transactID = null;
  @JsonProperty("account")
  private Double account = null;
  @JsonProperty("currency")
  private String currency = null;
  @JsonProperty("transactType")
  private String transactType = null;
  @JsonProperty("amount")
  private Double amount = null;
  @JsonProperty("transactStatus")
  private String transactStatus = null;
  @JsonProperty("address")
  private String address = null;
  @JsonProperty("tx")
  private String tx = null;
  @JsonProperty("text")
  private String text = null;
  @JsonProperty("transactTime")
  private Date transactTime = null;
  @JsonProperty("timestamp")
  private Date timestamp = null;
  public String getTransactID() {
    return transactID;
  }
  public void setTransactID(String transactID) {
    this.transactID = transactID;
  }

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

  public String getTransactType() {
    return transactType;
  }
  public void setTransactType(String transactType) {
    this.transactType = transactType;
  }

  public Double getAmount() {
    return amount;
  }
  public void setAmount(Double amount) {
    this.amount = amount;
  }

  public String getTransactStatus() {
    return transactStatus;
  }
  public void setTransactStatus(String transactStatus) {
    this.transactStatus = transactStatus;
  }

  public String getAddress() {
    return address;
  }
  public void setAddress(String address) {
    this.address = address;
  }

  public String getTx() {
    return tx;
  }
  public void setTx(String tx) {
    this.tx = tx;
  }

  public String getText() {
    return text;
  }
  public void setText(String text) {
    this.text = text;
  }

  public Date getTransactTime() {
    return transactTime;
  }
  public void setTransactTime(Date transactTime) {
    this.transactTime = transactTime;
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
    sb.append("class Transaction {\n");
    sb.append("  transactID: ").append(transactID).append("\n");
    sb.append("  account: ").append(account).append("\n");
    sb.append("  currency: ").append(currency).append("\n");
    sb.append("  transactType: ").append(transactType).append("\n");
    sb.append("  amount: ").append(amount).append("\n");
    sb.append("  transactStatus: ").append(transactStatus).append("\n");
    sb.append("  address: ").append(address).append("\n");
    sb.append("  tx: ").append(tx).append("\n");
    sb.append("  text: ").append(text).append("\n");
    sb.append("  transactTime: ").append(transactTime).append("\n");
    sb.append("  timestamp: ").append(timestamp).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

