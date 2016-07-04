package io.swagger.client.model;

import java.math.BigDecimal;
import java.util.Date;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class Transaction  {
  
  @SerializedName("transactID")
  private String transactID = null;
  @SerializedName("account")
  private BigDecimal account = null;
  @SerializedName("currency")
  private String currency = null;
  @SerializedName("transactType")
  private String transactType = null;
  @SerializedName("amount")
  private BigDecimal amount = null;
  @SerializedName("fee")
  private BigDecimal fee = null;
  @SerializedName("transactStatus")
  private String transactStatus = null;
  @SerializedName("address")
  private String address = null;
  @SerializedName("tx")
  private String tx = null;
  @SerializedName("text")
  private String text = null;
  @SerializedName("transactTime")
  private Date transactTime = null;
  @SerializedName("timestamp")
  private Date timestamp = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getTransactID() {
    return transactID;
  }
  public void setTransactID(String transactID) {
    this.transactID = transactID;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getAccount() {
    return account;
  }
  public void setAccount(BigDecimal account) {
    this.account = account;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getCurrency() {
    return currency;
  }
  public void setCurrency(String currency) {
    this.currency = currency;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getTransactType() {
    return transactType;
  }
  public void setTransactType(String transactType) {
    this.transactType = transactType;
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
  public BigDecimal getFee() {
    return fee;
  }
  public void setFee(BigDecimal fee) {
    this.fee = fee;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getTransactStatus() {
    return transactStatus;
  }
  public void setTransactStatus(String transactStatus) {
    this.transactStatus = transactStatus;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getAddress() {
    return address;
  }
  public void setAddress(String address) {
    this.address = address;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getTx() {
    return tx;
  }
  public void setTx(String tx) {
    this.tx = tx;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getText() {
    return text;
  }
  public void setText(String text) {
    this.text = text;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Date getTransactTime() {
    return transactTime;
  }
  public void setTransactTime(Date transactTime) {
    this.transactTime = transactTime;
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
    Transaction transaction = (Transaction) o;
    return (transactID == null ? transaction.transactID == null : transactID.equals(transaction.transactID)) &&
        (account == null ? transaction.account == null : account.equals(transaction.account)) &&
        (currency == null ? transaction.currency == null : currency.equals(transaction.currency)) &&
        (transactType == null ? transaction.transactType == null : transactType.equals(transaction.transactType)) &&
        (amount == null ? transaction.amount == null : amount.equals(transaction.amount)) &&
        (fee == null ? transaction.fee == null : fee.equals(transaction.fee)) &&
        (transactStatus == null ? transaction.transactStatus == null : transactStatus.equals(transaction.transactStatus)) &&
        (address == null ? transaction.address == null : address.equals(transaction.address)) &&
        (tx == null ? transaction.tx == null : tx.equals(transaction.tx)) &&
        (text == null ? transaction.text == null : text.equals(transaction.text)) &&
        (transactTime == null ? transaction.transactTime == null : transactTime.equals(transaction.transactTime)) &&
        (timestamp == null ? transaction.timestamp == null : timestamp.equals(transaction.timestamp));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (transactID == null ? 0: transactID.hashCode());
    result = 31 * result + (account == null ? 0: account.hashCode());
    result = 31 * result + (currency == null ? 0: currency.hashCode());
    result = 31 * result + (transactType == null ? 0: transactType.hashCode());
    result = 31 * result + (amount == null ? 0: amount.hashCode());
    result = 31 * result + (fee == null ? 0: fee.hashCode());
    result = 31 * result + (transactStatus == null ? 0: transactStatus.hashCode());
    result = 31 * result + (address == null ? 0: address.hashCode());
    result = 31 * result + (tx == null ? 0: tx.hashCode());
    result = 31 * result + (text == null ? 0: text.hashCode());
    result = 31 * result + (transactTime == null ? 0: transactTime.hashCode());
    result = 31 * result + (timestamp == null ? 0: timestamp.hashCode());
    return result;
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
