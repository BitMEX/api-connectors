package io.swagger.client.model;

import java.math.BigDecimal;
import java.util.Date;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class Insurance  {
  
  @SerializedName("currency")
  private String currency = null;
  @SerializedName("timestamp")
  private Date timestamp = null;
  @SerializedName("walletBalance")
  private BigDecimal walletBalance = null;

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
  @ApiModelProperty(required = true, value = "")
  public Date getTimestamp() {
    return timestamp;
  }
  public void setTimestamp(Date timestamp) {
    this.timestamp = timestamp;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getWalletBalance() {
    return walletBalance;
  }
  public void setWalletBalance(BigDecimal walletBalance) {
    this.walletBalance = walletBalance;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Insurance insurance = (Insurance) o;
    return (currency == null ? insurance.currency == null : currency.equals(insurance.currency)) &&
        (timestamp == null ? insurance.timestamp == null : timestamp.equals(insurance.timestamp)) &&
        (walletBalance == null ? insurance.walletBalance == null : walletBalance.equals(insurance.walletBalance));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (currency == null ? 0: currency.hashCode());
    result = 31 * result + (timestamp == null ? 0: timestamp.hashCode());
    result = 31 * result + (walletBalance == null ? 0: walletBalance.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Insurance {\n");
    
    sb.append("  currency: ").append(currency).append("\n");
    sb.append("  timestamp: ").append(timestamp).append("\n");
    sb.append("  walletBalance: ").append(walletBalance).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
