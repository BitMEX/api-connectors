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
public class Transaction   {
  
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
  private OffsetDateTime transactTime = null;

  @SerializedName("timestamp")
  private OffsetDateTime timestamp = null;

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
  public OffsetDateTime getTransactTime() {
    return transactTime;
  }
  public void setTransactTime(OffsetDateTime transactTime) {
    this.transactTime = transactTime;
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
    
    sb.append("    transactID: ").append(StringUtil.toIndentedString(transactID)).append("\n");
    sb.append("    account: ").append(StringUtil.toIndentedString(account)).append("\n");
    sb.append("    currency: ").append(StringUtil.toIndentedString(currency)).append("\n");
    sb.append("    transactType: ").append(StringUtil.toIndentedString(transactType)).append("\n");
    sb.append("    amount: ").append(StringUtil.toIndentedString(amount)).append("\n");
    sb.append("    fee: ").append(StringUtil.toIndentedString(fee)).append("\n");
    sb.append("    transactStatus: ").append(StringUtil.toIndentedString(transactStatus)).append("\n");
    sb.append("    address: ").append(StringUtil.toIndentedString(address)).append("\n");
    sb.append("    tx: ").append(StringUtil.toIndentedString(tx)).append("\n");
    sb.append("    text: ").append(StringUtil.toIndentedString(text)).append("\n");
    sb.append("    transactTime: ").append(StringUtil.toIndentedString(transactTime)).append("\n");
    sb.append("    timestamp: ").append(StringUtil.toIndentedString(timestamp)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
