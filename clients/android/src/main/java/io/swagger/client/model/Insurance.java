package io.swagger.client.model;

import java.util.Date;
import java.math.BigDecimal;

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
