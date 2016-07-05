package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.joda.time.LocalDate;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-07-05T09:41:19.947-05:00")

public class Transaction   {
  
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
  private LocalDate transactTime = null;
  private LocalDate timestamp = null;

  /**
   **/
  public Transaction transactID(String transactID) {
    this.transactID = transactID;
    return this;
  }

  
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
  public Transaction account(BigDecimal account) {
    this.account = account;
    return this;
  }

  
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
  public Transaction currency(String currency) {
    this.currency = currency;
    return this;
  }

  
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
  public Transaction transactType(String transactType) {
    this.transactType = transactType;
    return this;
  }

  
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
  public Transaction amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

  
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
  public Transaction fee(BigDecimal fee) {
    this.fee = fee;
    return this;
  }

  
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
  public Transaction transactStatus(String transactStatus) {
    this.transactStatus = transactStatus;
    return this;
  }

  
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
  public Transaction address(String address) {
    this.address = address;
    return this;
  }

  
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
  public Transaction tx(String tx) {
    this.tx = tx;
    return this;
  }

  
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
  public Transaction text(String text) {
    this.text = text;
    return this;
  }

  
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
  public Transaction transactTime(LocalDate transactTime) {
    this.transactTime = transactTime;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("transactTime")
  public LocalDate getTransactTime() {
    return transactTime;
  }
  public void setTransactTime(LocalDate transactTime) {
    this.transactTime = transactTime;
  }

  /**
   **/
  public Transaction timestamp(LocalDate timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("timestamp")
  public LocalDate getTimestamp() {
    return timestamp;
  }
  public void setTimestamp(LocalDate timestamp) {
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
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Transaction {\n");
    
    sb.append("    transactID: ").append(toIndentedString(transactID)).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    transactType: ").append(toIndentedString(transactType)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    fee: ").append(toIndentedString(fee)).append("\n");
    sb.append("    transactStatus: ").append(toIndentedString(transactStatus)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    tx: ").append(toIndentedString(tx)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    transactTime: ").append(toIndentedString(transactTime)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

