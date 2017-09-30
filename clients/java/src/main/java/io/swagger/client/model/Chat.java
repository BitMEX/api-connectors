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
 * Trollbox Data
 **/
@ApiModel(description = "Trollbox Data")
public class Chat   {
  
  @SerializedName("id")
  private BigDecimal id = null;

  @SerializedName("date")
  private OffsetDateTime date = null;

  @SerializedName("user")
  private String user = null;

  @SerializedName("message")
  private String message = null;

  @SerializedName("html")
  private String html = null;

  @SerializedName("fromBot")
  private Boolean fromBot = false;

  @SerializedName("channelID")
  private Double channelID = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getId() {
    return id;
  }
  public void setId(BigDecimal id) {
    this.id = id;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public OffsetDateTime getDate() {
    return date;
  }
  public void setDate(OffsetDateTime date) {
    this.date = date;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getUser() {
    return user;
  }
  public void setUser(String user) {
    this.user = user;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getHtml() {
    return html;
  }
  public void setHtml(String html) {
    this.html = html;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean isFromBot() {
    return fromBot;
  }
  public void setFromBot(Boolean fromBot) {
    this.fromBot = fromBot;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Double getChannelID() {
    return channelID;
  }
  public void setChannelID(Double channelID) {
    this.channelID = channelID;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Chat chat = (Chat) o;
    return Objects.equals(id, chat.id) &&
        Objects.equals(date, chat.date) &&
        Objects.equals(user, chat.user) &&
        Objects.equals(message, chat.message) &&
        Objects.equals(html, chat.html) &&
        Objects.equals(fromBot, chat.fromBot) &&
        Objects.equals(channelID, chat.channelID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, date, user, message, html, fromBot, channelID);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Chat {\n");
    
    sb.append("    id: ").append(StringUtil.toIndentedString(id)).append("\n");
    sb.append("    date: ").append(StringUtil.toIndentedString(date)).append("\n");
    sb.append("    user: ").append(StringUtil.toIndentedString(user)).append("\n");
    sb.append("    message: ").append(StringUtil.toIndentedString(message)).append("\n");
    sb.append("    html: ").append(StringUtil.toIndentedString(html)).append("\n");
    sb.append("    fromBot: ").append(StringUtil.toIndentedString(fromBot)).append("\n");
    sb.append("    channelID: ").append(StringUtil.toIndentedString(channelID)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
