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



/**
 * Insurance Fund Data
 **/
@ApiModel(description = "Insurance Fund Data")
public class Insurance   {
  
  @SerializedName("currency")
  private String currency = null;

  @SerializedName("timestamp")
  private OffsetDateTime timestamp = null;

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
  public OffsetDateTime getTimestamp() {
    return timestamp;
  }
  public void setTimestamp(OffsetDateTime timestamp) {
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
    return Objects.equals(currency, insurance.currency) &&
        Objects.equals(timestamp, insurance.timestamp) &&
        Objects.equals(walletBalance, insurance.walletBalance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currency, timestamp, walletBalance);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Insurance {\n");
    
    sb.append("    currency: ").append(StringUtil.toIndentedString(currency)).append("\n");
    sb.append("    timestamp: ").append(StringUtil.toIndentedString(timestamp)).append("\n");
    sb.append("    walletBalance: ").append(StringUtil.toIndentedString(walletBalance)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
