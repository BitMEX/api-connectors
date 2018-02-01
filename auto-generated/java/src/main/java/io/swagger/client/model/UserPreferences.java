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
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;

import com.google.gson.annotations.SerializedName;


import java.util.Objects;

import io.swagger.annotations.*;



@ApiModel(description = "")
public class UserPreferences   {
  
  @SerializedName("alertOnLiquidations")
  private Boolean alertOnLiquidations = null;

  @SerializedName("animationsEnabled")
  private Boolean animationsEnabled = null;

  @SerializedName("announcementsLastSeen")
  private OffsetDateTime announcementsLastSeen = null;

  @SerializedName("chatChannelID")
  private Double chatChannelID = null;

  @SerializedName("colorTheme")
  private String colorTheme = null;

  @SerializedName("currency")
  private String currency = null;

  @SerializedName("debug")
  private Boolean debug = null;

  @SerializedName("disableEmails")
  private List<String> disableEmails = new ArrayList<String>();

  @SerializedName("hideConfirmDialogs")
  private List<String> hideConfirmDialogs = new ArrayList<String>();

  @SerializedName("hideConnectionModal")
  private Boolean hideConnectionModal = null;

  @SerializedName("hideFromLeaderboard")
  private Boolean hideFromLeaderboard = false;

  @SerializedName("hideNameFromLeaderboard")
  private Boolean hideNameFromLeaderboard = true;

  @SerializedName("hideNotifications")
  private List<String> hideNotifications = new ArrayList<String>();

  @SerializedName("locale")
  private String locale = "en-US";

  @SerializedName("msgsSeen")
  private List<String> msgsSeen = new ArrayList<String>();

  @SerializedName("orderBookBinning")
  private Object orderBookBinning = null;

  @SerializedName("orderBookType")
  private String orderBookType = null;

  @SerializedName("orderClearImmediate")
  private Boolean orderClearImmediate = false;

  @SerializedName("orderControlsPlusMinus")
  private Boolean orderControlsPlusMinus = null;

  @SerializedName("sounds")
  private List<String> sounds = new ArrayList<String>();

  @SerializedName("strictIPCheck")
  private Boolean strictIPCheck = false;

  @SerializedName("strictTimeout")
  private Boolean strictTimeout = true;

  @SerializedName("tickerGroup")
  private String tickerGroup = null;

  @SerializedName("tickerPinned")
  private Boolean tickerPinned = null;

  @SerializedName("tradeLayout")
  private String tradeLayout = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean isAlertOnLiquidations() {
    return alertOnLiquidations;
  }
  public void setAlertOnLiquidations(Boolean alertOnLiquidations) {
    this.alertOnLiquidations = alertOnLiquidations;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean isAnimationsEnabled() {
    return animationsEnabled;
  }
  public void setAnimationsEnabled(Boolean animationsEnabled) {
    this.animationsEnabled = animationsEnabled;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getAnnouncementsLastSeen() {
    return announcementsLastSeen;
  }
  public void setAnnouncementsLastSeen(OffsetDateTime announcementsLastSeen) {
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
  public Boolean isDebug() {
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
  public Boolean isHideConnectionModal() {
    return hideConnectionModal;
  }
  public void setHideConnectionModal(Boolean hideConnectionModal) {
    this.hideConnectionModal = hideConnectionModal;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean isHideFromLeaderboard() {
    return hideFromLeaderboard;
  }
  public void setHideFromLeaderboard(Boolean hideFromLeaderboard) {
    this.hideFromLeaderboard = hideFromLeaderboard;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean isHideNameFromLeaderboard() {
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
  public Object getOrderBookBinning() {
    return orderBookBinning;
  }
  public void setOrderBookBinning(Object orderBookBinning) {
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
  public Boolean isOrderClearImmediate() {
    return orderClearImmediate;
  }
  public void setOrderClearImmediate(Boolean orderClearImmediate) {
    this.orderClearImmediate = orderClearImmediate;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean isOrderControlsPlusMinus() {
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
  public Boolean isStrictIPCheck() {
    return strictIPCheck;
  }
  public void setStrictIPCheck(Boolean strictIPCheck) {
    this.strictIPCheck = strictIPCheck;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean isStrictTimeout() {
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
  public Boolean isTickerPinned() {
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
    return Objects.equals(alertOnLiquidations, userPreferences.alertOnLiquidations) &&
        Objects.equals(animationsEnabled, userPreferences.animationsEnabled) &&
        Objects.equals(announcementsLastSeen, userPreferences.announcementsLastSeen) &&
        Objects.equals(chatChannelID, userPreferences.chatChannelID) &&
        Objects.equals(colorTheme, userPreferences.colorTheme) &&
        Objects.equals(currency, userPreferences.currency) &&
        Objects.equals(debug, userPreferences.debug) &&
        Objects.equals(disableEmails, userPreferences.disableEmails) &&
        Objects.equals(hideConfirmDialogs, userPreferences.hideConfirmDialogs) &&
        Objects.equals(hideConnectionModal, userPreferences.hideConnectionModal) &&
        Objects.equals(hideFromLeaderboard, userPreferences.hideFromLeaderboard) &&
        Objects.equals(hideNameFromLeaderboard, userPreferences.hideNameFromLeaderboard) &&
        Objects.equals(hideNotifications, userPreferences.hideNotifications) &&
        Objects.equals(locale, userPreferences.locale) &&
        Objects.equals(msgsSeen, userPreferences.msgsSeen) &&
        Objects.equals(orderBookBinning, userPreferences.orderBookBinning) &&
        Objects.equals(orderBookType, userPreferences.orderBookType) &&
        Objects.equals(orderClearImmediate, userPreferences.orderClearImmediate) &&
        Objects.equals(orderControlsPlusMinus, userPreferences.orderControlsPlusMinus) &&
        Objects.equals(sounds, userPreferences.sounds) &&
        Objects.equals(strictIPCheck, userPreferences.strictIPCheck) &&
        Objects.equals(strictTimeout, userPreferences.strictTimeout) &&
        Objects.equals(tickerGroup, userPreferences.tickerGroup) &&
        Objects.equals(tickerPinned, userPreferences.tickerPinned) &&
        Objects.equals(tradeLayout, userPreferences.tradeLayout);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alertOnLiquidations, animationsEnabled, announcementsLastSeen, chatChannelID, colorTheme, currency, debug, disableEmails, hideConfirmDialogs, hideConnectionModal, hideFromLeaderboard, hideNameFromLeaderboard, hideNotifications, locale, msgsSeen, orderBookBinning, orderBookType, orderClearImmediate, orderControlsPlusMinus, sounds, strictIPCheck, strictTimeout, tickerGroup, tickerPinned, tradeLayout);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserPreferences {\n");
    
    sb.append("    alertOnLiquidations: ").append(StringUtil.toIndentedString(alertOnLiquidations)).append("\n");
    sb.append("    animationsEnabled: ").append(StringUtil.toIndentedString(animationsEnabled)).append("\n");
    sb.append("    announcementsLastSeen: ").append(StringUtil.toIndentedString(announcementsLastSeen)).append("\n");
    sb.append("    chatChannelID: ").append(StringUtil.toIndentedString(chatChannelID)).append("\n");
    sb.append("    colorTheme: ").append(StringUtil.toIndentedString(colorTheme)).append("\n");
    sb.append("    currency: ").append(StringUtil.toIndentedString(currency)).append("\n");
    sb.append("    debug: ").append(StringUtil.toIndentedString(debug)).append("\n");
    sb.append("    disableEmails: ").append(StringUtil.toIndentedString(disableEmails)).append("\n");
    sb.append("    hideConfirmDialogs: ").append(StringUtil.toIndentedString(hideConfirmDialogs)).append("\n");
    sb.append("    hideConnectionModal: ").append(StringUtil.toIndentedString(hideConnectionModal)).append("\n");
    sb.append("    hideFromLeaderboard: ").append(StringUtil.toIndentedString(hideFromLeaderboard)).append("\n");
    sb.append("    hideNameFromLeaderboard: ").append(StringUtil.toIndentedString(hideNameFromLeaderboard)).append("\n");
    sb.append("    hideNotifications: ").append(StringUtil.toIndentedString(hideNotifications)).append("\n");
    sb.append("    locale: ").append(StringUtil.toIndentedString(locale)).append("\n");
    sb.append("    msgsSeen: ").append(StringUtil.toIndentedString(msgsSeen)).append("\n");
    sb.append("    orderBookBinning: ").append(StringUtil.toIndentedString(orderBookBinning)).append("\n");
    sb.append("    orderBookType: ").append(StringUtil.toIndentedString(orderBookType)).append("\n");
    sb.append("    orderClearImmediate: ").append(StringUtil.toIndentedString(orderClearImmediate)).append("\n");
    sb.append("    orderControlsPlusMinus: ").append(StringUtil.toIndentedString(orderControlsPlusMinus)).append("\n");
    sb.append("    sounds: ").append(StringUtil.toIndentedString(sounds)).append("\n");
    sb.append("    strictIPCheck: ").append(StringUtil.toIndentedString(strictIPCheck)).append("\n");
    sb.append("    strictTimeout: ").append(StringUtil.toIndentedString(strictTimeout)).append("\n");
    sb.append("    tickerGroup: ").append(StringUtil.toIndentedString(tickerGroup)).append("\n");
    sb.append("    tickerPinned: ").append(StringUtil.toIndentedString(tickerPinned)).append("\n");
    sb.append("    tradeLayout: ").append(StringUtil.toIndentedString(tradeLayout)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
