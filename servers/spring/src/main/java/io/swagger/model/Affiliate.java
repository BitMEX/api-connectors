package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.joda.time.LocalDate;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-07-05T09:41:19.947-05:00")

public class Affiliate   {
  
  private BigDecimal account = null;
  private String currency = null;
  private BigDecimal prevPayout = null;
  private BigDecimal prevTurnover = null;
  private BigDecimal prevComm = null;
  private LocalDate prevTimestamp = null;
  private BigDecimal execTurnover = null;
  private BigDecimal execComm = null;
  private BigDecimal totalReferrals = null;
  private BigDecimal totalTurnover = null;
  private BigDecimal totalComm = null;
  private Double payoutPcnt = null;
  private BigDecimal pendingPayout = null;
  private LocalDate timestamp = null;

  /**
   **/
  public Affiliate account(BigDecimal account) {
    this.account = account;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("account")
  public BigDecimal getAccount() {
    return account;
  }
  public void setAccount(BigDecimal account) {
    this.account = account;
  }

  /**
   **/
  public Affiliate currency(String currency) {
    this.currency = currency;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("currency")
  public String getCurrency() {
    return currency;
  }
  public void setCurrency(String currency) {
    this.currency = currency;
  }

  /**
   **/
  public Affiliate prevPayout(BigDecimal prevPayout) {
    this.prevPayout = prevPayout;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("prevPayout")
  public BigDecimal getPrevPayout() {
    return prevPayout;
  }
  public void setPrevPayout(BigDecimal prevPayout) {
    this.prevPayout = prevPayout;
  }

  /**
   **/
  public Affiliate prevTurnover(BigDecimal prevTurnover) {
    this.prevTurnover = prevTurnover;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("prevTurnover")
  public BigDecimal getPrevTurnover() {
    return prevTurnover;
  }
  public void setPrevTurnover(BigDecimal prevTurnover) {
    this.prevTurnover = prevTurnover;
  }

  /**
   **/
  public Affiliate prevComm(BigDecimal prevComm) {
    this.prevComm = prevComm;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("prevComm")
  public BigDecimal getPrevComm() {
    return prevComm;
  }
  public void setPrevComm(BigDecimal prevComm) {
    this.prevComm = prevComm;
  }

  /**
   **/
  public Affiliate prevTimestamp(LocalDate prevTimestamp) {
    this.prevTimestamp = prevTimestamp;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("prevTimestamp")
  public LocalDate getPrevTimestamp() {
    return prevTimestamp;
  }
  public void setPrevTimestamp(LocalDate prevTimestamp) {
    this.prevTimestamp = prevTimestamp;
  }

  /**
   **/
  public Affiliate execTurnover(BigDecimal execTurnover) {
    this.execTurnover = execTurnover;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("execTurnover")
  public BigDecimal getExecTurnover() {
    return execTurnover;
  }
  public void setExecTurnover(BigDecimal execTurnover) {
    this.execTurnover = execTurnover;
  }

  /**
   **/
  public Affiliate execComm(BigDecimal execComm) {
    this.execComm = execComm;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("execComm")
  public BigDecimal getExecComm() {
    return execComm;
  }
  public void setExecComm(BigDecimal execComm) {
    this.execComm = execComm;
  }

  /**
   **/
  public Affiliate totalReferrals(BigDecimal totalReferrals) {
    this.totalReferrals = totalReferrals;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("totalReferrals")
  public BigDecimal getTotalReferrals() {
    return totalReferrals;
  }
  public void setTotalReferrals(BigDecimal totalReferrals) {
    this.totalReferrals = totalReferrals;
  }

  /**
   **/
  public Affiliate totalTurnover(BigDecimal totalTurnover) {
    this.totalTurnover = totalTurnover;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("totalTurnover")
  public BigDecimal getTotalTurnover() {
    return totalTurnover;
  }
  public void setTotalTurnover(BigDecimal totalTurnover) {
    this.totalTurnover = totalTurnover;
  }

  /**
   **/
  public Affiliate totalComm(BigDecimal totalComm) {
    this.totalComm = totalComm;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("totalComm")
  public BigDecimal getTotalComm() {
    return totalComm;
  }
  public void setTotalComm(BigDecimal totalComm) {
    this.totalComm = totalComm;
  }

  /**
   **/
  public Affiliate payoutPcnt(Double payoutPcnt) {
    this.payoutPcnt = payoutPcnt;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("payoutPcnt")
  public Double getPayoutPcnt() {
    return payoutPcnt;
  }
  public void setPayoutPcnt(Double payoutPcnt) {
    this.payoutPcnt = payoutPcnt;
  }

  /**
   **/
  public Affiliate pendingPayout(BigDecimal pendingPayout) {
    this.pendingPayout = pendingPayout;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("pendingPayout")
  public BigDecimal getPendingPayout() {
    return pendingPayout;
  }
  public void setPendingPayout(BigDecimal pendingPayout) {
    this.pendingPayout = pendingPayout;
  }

  /**
   **/
  public Affiliate timestamp(LocalDate timestamp) {
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
    Affiliate affiliate = (Affiliate) o;
    return Objects.equals(account, affiliate.account) &&
        Objects.equals(currency, affiliate.currency) &&
        Objects.equals(prevPayout, affiliate.prevPayout) &&
        Objects.equals(prevTurnover, affiliate.prevTurnover) &&
        Objects.equals(prevComm, affiliate.prevComm) &&
        Objects.equals(prevTimestamp, affiliate.prevTimestamp) &&
        Objects.equals(execTurnover, affiliate.execTurnover) &&
        Objects.equals(execComm, affiliate.execComm) &&
        Objects.equals(totalReferrals, affiliate.totalReferrals) &&
        Objects.equals(totalTurnover, affiliate.totalTurnover) &&
        Objects.equals(totalComm, affiliate.totalComm) &&
        Objects.equals(payoutPcnt, affiliate.payoutPcnt) &&
        Objects.equals(pendingPayout, affiliate.pendingPayout) &&
        Objects.equals(timestamp, affiliate.timestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(account, currency, prevPayout, prevTurnover, prevComm, prevTimestamp, execTurnover, execComm, totalReferrals, totalTurnover, totalComm, payoutPcnt, pendingPayout, timestamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Affiliate {\n");
    
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    prevPayout: ").append(toIndentedString(prevPayout)).append("\n");
    sb.append("    prevTurnover: ").append(toIndentedString(prevTurnover)).append("\n");
    sb.append("    prevComm: ").append(toIndentedString(prevComm)).append("\n");
    sb.append("    prevTimestamp: ").append(toIndentedString(prevTimestamp)).append("\n");
    sb.append("    execTurnover: ").append(toIndentedString(execTurnover)).append("\n");
    sb.append("    execComm: ").append(toIndentedString(execComm)).append("\n");
    sb.append("    totalReferrals: ").append(toIndentedString(totalReferrals)).append("\n");
    sb.append("    totalTurnover: ").append(toIndentedString(totalTurnover)).append("\n");
    sb.append("    totalComm: ").append(toIndentedString(totalComm)).append("\n");
    sb.append("    payoutPcnt: ").append(toIndentedString(payoutPcnt)).append("\n");
    sb.append("    pendingPayout: ").append(toIndentedString(pendingPayout)).append("\n");
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

