package io.swagger.client.model;

import java.util.*;
import java.util.Date;
import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class UserPreferences  {
  
  @SerializedName("announcementsLastSeen")
  private Date announcementsLastSeen = null;
  @SerializedName("colorTheme")
  private String colorTheme = null;
  @SerializedName("currency")
  private String currency = null;
  @SerializedName("debug")
  private Boolean debug = null;
  @SerializedName("disableEmails")
  private List<String> disableEmails = null;
  @SerializedName("hideConfirmDialogs")
  private List<String> hideConfirmDialogs = null;
  @SerializedName("hideConnectionModal")
  private Boolean hideConnectionModal = null;
  @SerializedName("hideFromLeaderboard")
  private Boolean hideFromLeaderboard = null;
  @SerializedName("hideNameFromLeaderboard")
  private Boolean hideNameFromLeaderboard = null;
  @SerializedName("hideNotifications")
  private List<String> hideNotifications = null;
  @SerializedName("hidePhoneConfirm")
  private Boolean hidePhoneConfirm = null;
  @SerializedName("locale")
  private String locale = null;
  @SerializedName("msgsSeen")
  private List<String> msgsSeen = null;
  @SerializedName("orderBookBinning")
  private BigDecimal orderBookBinning = null;
  @SerializedName("orderBookType")
  private String orderBookType = null;
  @SerializedName("orderControlsPlusMinus")
  private Boolean orderControlsPlusMinus = null;
  @SerializedName("sounds")
  private List<String> sounds = null;
  @SerializedName("strictIPCheck")
  private Boolean strictIPCheck = null;
  @SerializedName("strictTimeout")
  private Boolean strictTimeout = null;
  @SerializedName("tickerGroup")
  private String tickerGroup = null;
  @SerializedName("tickerPinned")
  private Boolean tickerPinned = null;
  @SerializedName("tradeLayout")
  private String tradeLayout = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Date getAnnouncementsLastSeen() {
    return announcementsLastSeen;
  }
  public void setAnnouncementsLastSeen(Date announcementsLastSeen) {
    this.announcementsLastSeen = announcementsLastSeen;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getColorTheme() {
    return colorTheme;
  }
  public void setColorTheme(String colorTheme) {
    this.colorTheme = colorTheme;
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
  public Boolean getDebug() {
    return debug;
  }
  public void setDebug(Boolean debug) {
    this.debug = debug;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public List<String> getDisableEmails() {
    return disableEmails;
  }
  public void setDisableEmails(List<String> disableEmails) {
    this.disableEmails = disableEmails;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public List<String> getHideConfirmDialogs() {
    return hideConfirmDialogs;
  }
  public void setHideConfirmDialogs(List<String> hideConfirmDialogs) {
    this.hideConfirmDialogs = hideConfirmDialogs;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getHideConnectionModal() {
    return hideConnectionModal;
  }
  public void setHideConnectionModal(Boolean hideConnectionModal) {
    this.hideConnectionModal = hideConnectionModal;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getHideFromLeaderboard() {
    return hideFromLeaderboard;
  }
  public void setHideFromLeaderboard(Boolean hideFromLeaderboard) {
    this.hideFromLeaderboard = hideFromLeaderboard;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getHideNameFromLeaderboard() {
    return hideNameFromLeaderboard;
  }
  public void setHideNameFromLeaderboard(Boolean hideNameFromLeaderboard) {
    this.hideNameFromLeaderboard = hideNameFromLeaderboard;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public List<String> getHideNotifications() {
    return hideNotifications;
  }
  public void setHideNotifications(List<String> hideNotifications) {
    this.hideNotifications = hideNotifications;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getHidePhoneConfirm() {
    return hidePhoneConfirm;
  }
  public void setHidePhoneConfirm(Boolean hidePhoneConfirm) {
    this.hidePhoneConfirm = hidePhoneConfirm;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getLocale() {
    return locale;
  }
  public void setLocale(String locale) {
    this.locale = locale;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public List<String> getMsgsSeen() {
    return msgsSeen;
  }
  public void setMsgsSeen(List<String> msgsSeen) {
    this.msgsSeen = msgsSeen;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getOrderBookBinning() {
    return orderBookBinning;
  }
  public void setOrderBookBinning(BigDecimal orderBookBinning) {
    this.orderBookBinning = orderBookBinning;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getOrderBookType() {
    return orderBookType;
  }
  public void setOrderBookType(String orderBookType) {
    this.orderBookType = orderBookType;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getOrderControlsPlusMinus() {
    return orderControlsPlusMinus;
  }
  public void setOrderControlsPlusMinus(Boolean orderControlsPlusMinus) {
    this.orderControlsPlusMinus = orderControlsPlusMinus;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public List<String> getSounds() {
    return sounds;
  }
  public void setSounds(List<String> sounds) {
    this.sounds = sounds;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getStrictIPCheck() {
    return strictIPCheck;
  }
  public void setStrictIPCheck(Boolean strictIPCheck) {
    this.strictIPCheck = strictIPCheck;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getStrictTimeout() {
    return strictTimeout;
  }
  public void setStrictTimeout(Boolean strictTimeout) {
    this.strictTimeout = strictTimeout;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getTickerGroup() {
    return tickerGroup;
  }
  public void setTickerGroup(String tickerGroup) {
    this.tickerGroup = tickerGroup;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getTickerPinned() {
    return tickerPinned;
  }
  public void setTickerPinned(Boolean tickerPinned) {
    this.tickerPinned = tickerPinned;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getTradeLayout() {
    return tradeLayout;
  }
  public void setTradeLayout(String tradeLayout) {
    this.tradeLayout = tradeLayout;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserPreferences {\n");
    
    sb.append("  announcementsLastSeen: ").append(announcementsLastSeen).append("\n");
    sb.append("  colorTheme: ").append(colorTheme).append("\n");
    sb.append("  currency: ").append(currency).append("\n");
    sb.append("  debug: ").append(debug).append("\n");
    sb.append("  disableEmails: ").append(disableEmails).append("\n");
    sb.append("  hideConfirmDialogs: ").append(hideConfirmDialogs).append("\n");
    sb.append("  hideConnectionModal: ").append(hideConnectionModal).append("\n");
    sb.append("  hideFromLeaderboard: ").append(hideFromLeaderboard).append("\n");
    sb.append("  hideNameFromLeaderboard: ").append(hideNameFromLeaderboard).append("\n");
    sb.append("  hideNotifications: ").append(hideNotifications).append("\n");
    sb.append("  hidePhoneConfirm: ").append(hidePhoneConfirm).append("\n");
    sb.append("  locale: ").append(locale).append("\n");
    sb.append("  msgsSeen: ").append(msgsSeen).append("\n");
    sb.append("  orderBookBinning: ").append(orderBookBinning).append("\n");
    sb.append("  orderBookType: ").append(orderBookType).append("\n");
    sb.append("  orderControlsPlusMinus: ").append(orderControlsPlusMinus).append("\n");
    sb.append("  sounds: ").append(sounds).append("\n");
    sb.append("  strictIPCheck: ").append(strictIPCheck).append("\n");
    sb.append("  strictTimeout: ").append(strictTimeout).append("\n");
    sb.append("  tickerGroup: ").append(tickerGroup).append("\n");
    sb.append("  tickerPinned: ").append(tickerPinned).append("\n");
    sb.append("  tradeLayout: ").append(tradeLayout).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
