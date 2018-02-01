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
 * Account Notifications
 **/
@ApiModel(description = "Account Notifications")
public class Notification   {
  
  @SerializedName("id")
  private BigDecimal id = null;

  @SerializedName("date")
  private OffsetDateTime date = null;

  @SerializedName("title")
  private String title = null;

  @SerializedName("body")
  private String body = null;

  @SerializedName("ttl")
  private BigDecimal ttl = null;


public enum TypeEnum {
  @SerializedName("&quot;success&quot;")
  SUCCESS("&quot;success&quot;"),

  @SerializedName("&quot;error&quot;")
  ERROR("&quot;error&quot;"),

  @SerializedName("&quot;info&quot;")
  INFO("&quot;info&quot;");

  private String value;

  TypeEnum(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return value;
  }
}

  @SerializedName("type")
  private TypeEnum type = null;

  @SerializedName("closable")
  private Boolean closable = true;

  @SerializedName("persist")
  private Boolean persist = true;

  @SerializedName("waitForVisibility")
  private Boolean waitForVisibility = true;

  @SerializedName("sound")
  private String sound = null;

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
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getBody() {
    return body;
  }
  public void setBody(String body) {
    this.body = body;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public BigDecimal getTtl() {
    return ttl;
  }
  public void setTtl(BigDecimal ttl) {
    this.ttl = ttl;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean isClosable() {
    return closable;
  }
  public void setClosable(Boolean closable) {
    this.closable = closable;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean isPersist() {
    return persist;
  }
  public void setPersist(Boolean persist) {
    this.persist = persist;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean isWaitForVisibility() {
    return waitForVisibility;
  }
  public void setWaitForVisibility(Boolean waitForVisibility) {
    this.waitForVisibility = waitForVisibility;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getSound() {
    return sound;
  }
  public void setSound(String sound) {
    this.sound = sound;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Notification notification = (Notification) o;
    return Objects.equals(id, notification.id) &&
        Objects.equals(date, notification.date) &&
        Objects.equals(title, notification.title) &&
        Objects.equals(body, notification.body) &&
        Objects.equals(ttl, notification.ttl) &&
        Objects.equals(type, notification.type) &&
        Objects.equals(closable, notification.closable) &&
        Objects.equals(persist, notification.persist) &&
        Objects.equals(waitForVisibility, notification.waitForVisibility) &&
        Objects.equals(sound, notification.sound);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, date, title, body, ttl, type, closable, persist, waitForVisibility, sound);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Notification {\n");
    
    sb.append("    id: ").append(StringUtil.toIndentedString(id)).append("\n");
    sb.append("    date: ").append(StringUtil.toIndentedString(date)).append("\n");
    sb.append("    title: ").append(StringUtil.toIndentedString(title)).append("\n");
    sb.append("    body: ").append(StringUtil.toIndentedString(body)).append("\n");
    sb.append("    ttl: ").append(StringUtil.toIndentedString(ttl)).append("\n");
    sb.append("    type: ").append(StringUtil.toIndentedString(type)).append("\n");
    sb.append("    closable: ").append(StringUtil.toIndentedString(closable)).append("\n");
    sb.append("    persist: ").append(StringUtil.toIndentedString(persist)).append("\n");
    sb.append("    waitForVisibility: ").append(StringUtil.toIndentedString(waitForVisibility)).append("\n");
    sb.append("    sound: ").append(StringUtil.toIndentedString(sound)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
