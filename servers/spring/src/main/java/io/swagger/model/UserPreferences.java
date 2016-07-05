package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-07-05T09:41:19.947-05:00")

public class UserPreferences   {
  
  private LocalDate announcementsLastSeen = null;
  private String colorTheme = null;
  private String currency = null;
  private Boolean debug = null;
  private List<String> disableEmails = new ArrayList<String>();
  private List<String> hideConfirmDialogs = new ArrayList<String>();
  private Boolean hideConnectionModal = null;
  private Boolean hideFromLeaderboard = false;
  private Boolean hideNameFromLeaderboard = true;
  private List<String> hideNotifications = new ArrayList<String>();
  private Boolean hidePhoneConfirm = null;
  private String locale = null;
  private List<String> msgsSeen = new ArrayList<String>();
  private BigDecimal orderBookBinning = null;
  private String orderBookType = null;
  private Boolean orderControlsPlusMinus = null;
  private List<String> sounds = new ArrayList<String>();
  private Boolean strictIPCheck = false;
  private Boolean strictTimeout = true;
  private String tickerGroup = null;
  private Boolean tickerPinned = null;
  private String tradeLayout = null;

  /**
   **/
  public UserPreferences announcementsLastSeen(LocalDate announcementsLastSeen) {
    this.announcementsLastSeen = announcementsLastSeen;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("announcementsLastSeen")
  public LocalDate getAnnouncementsLastSeen() {
    return announcementsLastSeen;
  }
  public void setAnnouncementsLastSeen(LocalDate announcementsLastSeen) {
    this.announcementsLastSeen = announcementsLastSeen;
  }

  /**
   **/
  public UserPreferences colorTheme(String colorTheme) {
    this.colorTheme = colorTheme;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("colorTheme")
  public String getColorTheme() {
    return colorTheme;
  }
  public void setColorTheme(String colorTheme) {
    this.colorTheme = colorTheme;
  }

  /**
   **/
  public UserPreferences currency(String currency) {
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
  public UserPreferences debug(Boolean debug) {
    this.debug = debug;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("debug")
  public Boolean getDebug() {
    return debug;
  }
  public void setDebug(Boolean debug) {
    this.debug = debug;
  }

  /**
   **/
  public UserPreferences disableEmails(List<String> disableEmails) {
    this.disableEmails = disableEmails;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("disableEmails")
  public List<String> getDisableEmails() {
    return disableEmails;
  }
  public void setDisableEmails(List<String> disableEmails) {
    this.disableEmails = disableEmails;
  }

  /**
   **/
  public UserPreferences hideConfirmDialogs(List<String> hideConfirmDialogs) {
    this.hideConfirmDialogs = hideConfirmDialogs;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("hideConfirmDialogs")
  public List<String> getHideConfirmDialogs() {
    return hideConfirmDialogs;
  }
  public void setHideConfirmDialogs(List<String> hideConfirmDialogs) {
    this.hideConfirmDialogs = hideConfirmDialogs;
  }

  /**
   **/
  public UserPreferences hideConnectionModal(Boolean hideConnectionModal) {
    this.hideConnectionModal = hideConnectionModal;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("hideConnectionModal")
  public Boolean getHideConnectionModal() {
    return hideConnectionModal;
  }
  public void setHideConnectionModal(Boolean hideConnectionModal) {
    this.hideConnectionModal = hideConnectionModal;
  }

  /**
   **/
  public UserPreferences hideFromLeaderboard(Boolean hideFromLeaderboard) {
    this.hideFromLeaderboard = hideFromLeaderboard;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("hideFromLeaderboard")
  public Boolean getHideFromLeaderboard() {
    return hideFromLeaderboard;
  }
  public void setHideFromLeaderboard(Boolean hideFromLeaderboard) {
    this.hideFromLeaderboard = hideFromLeaderboard;
  }

  /**
   **/
  public UserPreferences hideNameFromLeaderboard(Boolean hideNameFromLeaderboard) {
    this.hideNameFromLeaderboard = hideNameFromLeaderboard;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("hideNameFromLeaderboard")
  public Boolean getHideNameFromLeaderboard() {
    return hideNameFromLeaderboard;
  }
  public void setHideNameFromLeaderboard(Boolean hideNameFromLeaderboard) {
    this.hideNameFromLeaderboard = hideNameFromLeaderboard;
  }

  /**
   **/
  public UserPreferences hideNotifications(List<String> hideNotifications) {
    this.hideNotifications = hideNotifications;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("hideNotifications")
  public List<String> getHideNotifications() {
    return hideNotifications;
  }
  public void setHideNotifications(List<String> hideNotifications) {
    this.hideNotifications = hideNotifications;
  }

  /**
   **/
  public UserPreferences hidePhoneConfirm(Boolean hidePhoneConfirm) {
    this.hidePhoneConfirm = hidePhoneConfirm;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("hidePhoneConfirm")
  public Boolean getHidePhoneConfirm() {
    return hidePhoneConfirm;
  }
  public void setHidePhoneConfirm(Boolean hidePhoneConfirm) {
    this.hidePhoneConfirm = hidePhoneConfirm;
  }

  /**
   **/
  public UserPreferences locale(String locale) {
    this.locale = locale;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("locale")
  public String getLocale() {
    return locale;
  }
  public void setLocale(String locale) {
    this.locale = locale;
  }

  /**
   **/
  public UserPreferences msgsSeen(List<String> msgsSeen) {
    this.msgsSeen = msgsSeen;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("msgsSeen")
  public List<String> getMsgsSeen() {
    return msgsSeen;
  }
  public void setMsgsSeen(List<String> msgsSeen) {
    this.msgsSeen = msgsSeen;
  }

  /**
   **/
  public UserPreferences orderBookBinning(BigDecimal orderBookBinning) {
    this.orderBookBinning = orderBookBinning;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("orderBookBinning")
  public BigDecimal getOrderBookBinning() {
    return orderBookBinning;
  }
  public void setOrderBookBinning(BigDecimal orderBookBinning) {
    this.orderBookBinning = orderBookBinning;
  }

  /**
   **/
  public UserPreferences orderBookType(String orderBookType) {
    this.orderBookType = orderBookType;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("orderBookType")
  public String getOrderBookType() {
    return orderBookType;
  }
  public void setOrderBookType(String orderBookType) {
    this.orderBookType = orderBookType;
  }

  /**
   **/
  public UserPreferences orderControlsPlusMinus(Boolean orderControlsPlusMinus) {
    this.orderControlsPlusMinus = orderControlsPlusMinus;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("orderControlsPlusMinus")
  public Boolean getOrderControlsPlusMinus() {
    return orderControlsPlusMinus;
  }
  public void setOrderControlsPlusMinus(Boolean orderControlsPlusMinus) {
    this.orderControlsPlusMinus = orderControlsPlusMinus;
  }

  /**
   **/
  public UserPreferences sounds(List<String> sounds) {
    this.sounds = sounds;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("sounds")
  public List<String> getSounds() {
    return sounds;
  }
  public void setSounds(List<String> sounds) {
    this.sounds = sounds;
  }

  /**
   **/
  public UserPreferences strictIPCheck(Boolean strictIPCheck) {
    this.strictIPCheck = strictIPCheck;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("strictIPCheck")
  public Boolean getStrictIPCheck() {
    return strictIPCheck;
  }
  public void setStrictIPCheck(Boolean strictIPCheck) {
    this.strictIPCheck = strictIPCheck;
  }

  /**
   **/
  public UserPreferences strictTimeout(Boolean strictTimeout) {
    this.strictTimeout = strictTimeout;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("strictTimeout")
  public Boolean getStrictTimeout() {
    return strictTimeout;
  }
  public void setStrictTimeout(Boolean strictTimeout) {
    this.strictTimeout = strictTimeout;
  }

  /**
   **/
  public UserPreferences tickerGroup(String tickerGroup) {
    this.tickerGroup = tickerGroup;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("tickerGroup")
  public String getTickerGroup() {
    return tickerGroup;
  }
  public void setTickerGroup(String tickerGroup) {
    this.tickerGroup = tickerGroup;
  }

  /**
   **/
  public UserPreferences tickerPinned(Boolean tickerPinned) {
    this.tickerPinned = tickerPinned;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("tickerPinned")
  public Boolean getTickerPinned() {
    return tickerPinned;
  }
  public void setTickerPinned(Boolean tickerPinned) {
    this.tickerPinned = tickerPinned;
  }

  /**
   **/
  public UserPreferences tradeLayout(String tradeLayout) {
    this.tradeLayout = tradeLayout;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("tradeLayout")
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
    return Objects.equals(announcementsLastSeen, userPreferences.announcementsLastSeen) &&
        Objects.equals(colorTheme, userPreferences.colorTheme) &&
        Objects.equals(currency, userPreferences.currency) &&
        Objects.equals(debug, userPreferences.debug) &&
        Objects.equals(disableEmails, userPreferences.disableEmails) &&
        Objects.equals(hideConfirmDialogs, userPreferences.hideConfirmDialogs) &&
        Objects.equals(hideConnectionModal, userPreferences.hideConnectionModal) &&
        Objects.equals(hideFromLeaderboard, userPreferences.hideFromLeaderboard) &&
        Objects.equals(hideNameFromLeaderboard, userPreferences.hideNameFromLeaderboard) &&
        Objects.equals(hideNotifications, userPreferences.hideNotifications) &&
        Objects.equals(hidePhoneConfirm, userPreferences.hidePhoneConfirm) &&
        Objects.equals(locale, userPreferences.locale) &&
        Objects.equals(msgsSeen, userPreferences.msgsSeen) &&
        Objects.equals(orderBookBinning, userPreferences.orderBookBinning) &&
        Objects.equals(orderBookType, userPreferences.orderBookType) &&
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
    return Objects.hash(announcementsLastSeen, colorTheme, currency, debug, disableEmails, hideConfirmDialogs, hideConnectionModal, hideFromLeaderboard, hideNameFromLeaderboard, hideNotifications, hidePhoneConfirm, locale, msgsSeen, orderBookBinning, orderBookType, orderControlsPlusMinus, sounds, strictIPCheck, strictTimeout, tickerGroup, tickerPinned, tradeLayout);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserPreferences {\n");
    
    sb.append("    announcementsLastSeen: ").append(toIndentedString(announcementsLastSeen)).append("\n");
    sb.append("    colorTheme: ").append(toIndentedString(colorTheme)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    debug: ").append(toIndentedString(debug)).append("\n");
    sb.append("    disableEmails: ").append(toIndentedString(disableEmails)).append("\n");
    sb.append("    hideConfirmDialogs: ").append(toIndentedString(hideConfirmDialogs)).append("\n");
    sb.append("    hideConnectionModal: ").append(toIndentedString(hideConnectionModal)).append("\n");
    sb.append("    hideFromLeaderboard: ").append(toIndentedString(hideFromLeaderboard)).append("\n");
    sb.append("    hideNameFromLeaderboard: ").append(toIndentedString(hideNameFromLeaderboard)).append("\n");
    sb.append("    hideNotifications: ").append(toIndentedString(hideNotifications)).append("\n");
    sb.append("    hidePhoneConfirm: ").append(toIndentedString(hidePhoneConfirm)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    msgsSeen: ").append(toIndentedString(msgsSeen)).append("\n");
    sb.append("    orderBookBinning: ").append(toIndentedString(orderBookBinning)).append("\n");
    sb.append("    orderBookType: ").append(toIndentedString(orderBookType)).append("\n");
    sb.append("    orderControlsPlusMinus: ").append(toIndentedString(orderControlsPlusMinus)).append("\n");
    sb.append("    sounds: ").append(toIndentedString(sounds)).append("\n");
    sb.append("    strictIPCheck: ").append(toIndentedString(strictIPCheck)).append("\n");
    sb.append("    strictTimeout: ").append(toIndentedString(strictTimeout)).append("\n");
    sb.append("    tickerGroup: ").append(toIndentedString(tickerGroup)).append("\n");
    sb.append("    tickerPinned: ").append(toIndentedString(tickerPinned)).append("\n");
    sb.append("    tradeLayout: ").append(toIndentedString(tradeLayout)).append("\n");
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

