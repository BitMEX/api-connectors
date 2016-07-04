package io.swagger.model;

import java.math.BigDecimal;
import java.util.Date;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringMVCServerCodegen", date = "2016-07-04T18:25:39.823-05:00")
public class Transaction  {
  
  private String transactID = null;
  private BigDecimal account = null;
  private String currency = null;
  private String transactType = null;
  private BigDecimal amount = null;
  private BigDecimal fee = null;
  private String transactStatus = null;
  private String address = null;
  private String tx = null;
  private String text = null;
  private Date transactTime = null;
  private Date timestamp = null;

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("transactID")
  public String getTransactID() {
    return transactID;
  }
  public void setTransactID(String transactID) {
    this.transactID = transactID;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("account")
  public BigDecimal getAccount() {
    return account;
  }
  public void setAccount(BigDecimal account) {
    this.account = account;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
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
  @JsonProperty("transactType")
  public String getTransactType() {
    return transactType;
  }
  public void setTransactType(String transactType) {
    this.transactType = transactType;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("amount")
  public BigDecimal getAmount() {
    return amount;
  }
  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("fee")
  public BigDecimal getFee() {
    return fee;
  }
  public void setFee(BigDecimal fee) {
    this.fee = fee;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("transactStatus")
  public String getTransactStatus() {
    return transactStatus;
  }
  public void setTransactStatus(String transactStatus) {
    this.transactStatus = transactStatus;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("address")
  public String getAddress() {
    return address;
  }
  public void setAddress(String address) {
    this.address = address;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("tx")
  public String getTx() {
    return tx;
  }
  public void setTx(String tx) {
    this.tx = tx;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("text")
  public String getText() {
    return text;
  }
  public void setText(String text) {
    this.text = text;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("transactTime")
  public Date getTransactTime() {
    return transactTime;
  }
  public void setTransactTime(Date transactTime) {
    this.transactTime = transactTime;
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
    Transaction transaction = (Transaction) o;
    return Objects.equals(transactID, transaction.transactID) &&
        Objects.equals(account, transaction.account) &&
        Objects.equals(currency, transaction.currency) &&
        Objects.equals(transactType, transaction.transactType) &&
        Objects.equals(amount, transaction.amount) &&
        Objects.equals(fee, transaction.fee) &&
        Objects.equals(transactStatus, transaction.transactStatus) &&
        Objects.equals(address, transaction.address) &&
        Objects.equals(tx, transaction.tx) &&
        Objects.equals(text, transaction.text) &&
        Objects.equals(transactTime, transaction.transactTime) &&
        Objects.equals(timestamp, transaction.timestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactID, account, currency, transactType, amount, fee, transactStatus, address, tx, text, transactTime, timestamp);
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
    sb.append("  fee: ").append(fee).append("\n");
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
