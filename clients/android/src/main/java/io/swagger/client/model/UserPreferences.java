package io.swagger.client.model;

import io.swagger.client.model.XAny;
import java.util.*;
import java.util.Date;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class UserPreferences  {
  
  @SerializedName("animationsEnabled")
  private Boolean animationsEnabled = null;
  @SerializedName("announcementsLastSeen")
  private Date announcementsLastSeen = null;
  @SerializedName("chatChannelID")
  private Double chatChannelID = null;
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
  @SerializedName("locale")
  private String locale = null;
  @SerializedName("msgsSeen")
  private List<String> msgsSeen = null;
  @SerializedName("orderBookBinning")
  private XAny orderBookBinning = null;
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
  public Boolean getAnimationsEnabled() {
    return animationsEnabled;
  }
  public void setAnimationsEnabled(Boolean animationsEnabled) {
    this.animationsEnabled = animationsEnabled;
  }

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
  public Double getChatChannelID() {
    return chatChannelID;
  }
  public void setChatChannelID(Double chatChannelID) {
    this.chatChannelID = chatChannelID;
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
  public XAny getOrderBookBinning() {
    return orderBookBinning;
  }
  public void setOrderBookBinning(XAny orderBookBinning) {
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
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserPreferences userPreferences = (UserPreferences) o;
    return (animationsEnabled == null ? userPreferences.animationsEnabled == null : animationsEnabled.equals(userPreferences.animationsEnabled)) &&
        (announcementsLastSeen == null ? userPreferences.announcementsLastSeen == null : announcementsLastSeen.equals(userPreferences.announcementsLastSeen)) &&
        (chatChannelID == null ? userPreferences.chatChannelID == null : chatChannelID.equals(userPreferences.chatChannelID)) &&
        (colorTheme == null ? userPreferences.colorTheme == null : colorTheme.equals(userPreferences.colorTheme)) &&
        (currency == null ? userPreferences.currency == null : currency.equals(userPreferences.currency)) &&
        (debug == null ? userPreferences.debug == null : debug.equals(userPreferences.debug)) &&
        (disableEmails == null ? userPreferences.disableEmails == null : disableEmails.equals(userPreferences.disableEmails)) &&
        (hideConfirmDialogs == null ? userPreferences.hideConfirmDialogs == null : hideConfirmDialogs.equals(userPreferences.hideConfirmDialogs)) &&
        (hideConnectionModal == null ? userPreferences.hideConnectionModal == null : hideConnectionModal.equals(userPreferences.hideConnectionModal)) &&
        (hideFromLeaderboard == null ? userPreferences.hideFromLeaderboard == null : hideFromLeaderboard.equals(userPreferences.hideFromLeaderboard)) &&
        (hideNameFromLeaderboard == null ? userPreferences.hideNameFromLeaderboard == null : hideNameFromLeaderboard.equals(userPreferences.hideNameFromLeaderboard)) &&
        (hideNotifications == null ? userPreferences.hideNotifications == null : hideNotifications.equals(userPreferences.hideNotifications)) &&
        (locale == null ? userPreferences.locale == null : locale.equals(userPreferences.locale)) &&
        (msgsSeen == null ? userPreferences.msgsSeen == null : msgsSeen.equals(userPreferences.msgsSeen)) &&
        (orderBookBinning == null ? userPreferences.orderBookBinning == null : orderBookBinning.equals(userPreferences.orderBookBinning)) &&
        (orderBookType == null ? userPreferences.orderBookType == null : orderBookType.equals(userPreferences.orderBookType)) &&
        (orderControlsPlusMinus == null ? userPreferences.orderControlsPlusMinus == null : orderControlsPlusMinus.equals(userPreferences.orderControlsPlusMinus)) &&
        (sounds == null ? userPreferences.sounds == null : sounds.equals(userPreferences.sounds)) &&
        (strictIPCheck == null ? userPreferences.strictIPCheck == null : strictIPCheck.equals(userPreferences.strictIPCheck)) &&
        (strictTimeout == null ? userPreferences.strictTimeout == null : strictTimeout.equals(userPreferences.strictTimeout)) &&
        (tickerGroup == null ? userPreferences.tickerGroup == null : tickerGroup.equals(userPreferences.tickerGroup)) &&
        (tickerPinned == null ? userPreferences.tickerPinned == null : tickerPinned.equals(userPreferences.tickerPinned)) &&
        (tradeLayout == null ? userPreferences.tradeLayout == null : tradeLayout.equals(userPreferences.tradeLayout));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (animationsEnabled == null ? 0: animationsEnabled.hashCode());
    result = 31 * result + (announcementsLastSeen == null ? 0: announcementsLastSeen.hashCode());
    result = 31 * result + (chatChannelID == null ? 0: chatChannelID.hashCode());
    result = 31 * result + (colorTheme == null ? 0: colorTheme.hashCode());
    result = 31 * result + (currency == null ? 0: currency.hashCode());
    result = 31 * result + (debug == null ? 0: debug.hashCode());
    result = 31 * result + (disableEmails == null ? 0: disableEmails.hashCode());
    result = 31 * result + (hideConfirmDialogs == null ? 0: hideConfirmDialogs.hashCode());
    result = 31 * result + (hideConnectionModal == null ? 0: hideConnectionModal.hashCode());
    result = 31 * result + (hideFromLeaderboard == null ? 0: hideFromLeaderboard.hashCode());
    result = 31 * result + (hideNameFromLeaderboard == null ? 0: hideNameFromLeaderboard.hashCode());
    result = 31 * result + (hideNotifications == null ? 0: hideNotifications.hashCode());
    result = 31 * result + (locale == null ? 0: locale.hashCode());
    result = 31 * result + (msgsSeen == null ? 0: msgsSeen.hashCode());
    result = 31 * result + (orderBookBinning == null ? 0: orderBookBinning.hashCode());
    result = 31 * result + (orderBookType == null ? 0: orderBookType.hashCode());
    result = 31 * result + (orderControlsPlusMinus == null ? 0: orderControlsPlusMinus.hashCode());
    result = 31 * result + (sounds == null ? 0: sounds.hashCode());
    result = 31 * result + (strictIPCheck == null ? 0: strictIPCheck.hashCode());
    result = 31 * result + (strictTimeout == null ? 0: strictTimeout.hashCode());
    result = 31 * result + (tickerGroup == null ? 0: tickerGroup.hashCode());
    result = 31 * result + (tickerPinned == null ? 0: tickerPinned.hashCode());
    result = 31 * result + (tradeLayout == null ? 0: tradeLayout.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserPreferences {\n");
    
    sb.append("  animationsEnabled: ").append(animationsEnabled).append("\n");
    sb.append("  announcementsLastSeen: ").append(announcementsLastSeen).append("\n");
    sb.append("  chatChannelID: ").append(chatChannelID).append("\n");
    sb.append("  colorTheme: ").append(colorTheme).append("\n");
    sb.append("  currency: ").append(currency).append("\n");
    sb.append("  debug: ").append(debug).append("\n");
    sb.append("  disableEmails: ").append(disableEmails).append("\n");
    sb.append("  hideConfirmDialogs: ").append(hideConfirmDialogs).append("\n");
    sb.append("  hideConnectionModal: ").append(hideConnectionModal).append("\n");
    sb.append("  hideFromLeaderboard: ").append(hideFromLeaderboard).append("\n");
    sb.append("  hideNameFromLeaderboard: ").append(hideNameFromLeaderboard).append("\n");
    sb.append("  hideNotifications: ").append(hideNotifications).append("\n");
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
