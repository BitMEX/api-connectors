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
 * Public Announcements
 **/
@ApiModel(description = "Public Announcements")
public class Announcement   {
  
  @SerializedName("id")
  private BigDecimal id = null;

  @SerializedName("link")
  private String link = null;

  @SerializedName("title")
  private String title = null;

  @SerializedName("content")
  private String content = null;

  @SerializedName("date")
  private OffsetDateTime date = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public BigDecimal getId() {
    return id;
  }
  public void setId(BigDecimal id) {
    this.id = id;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getLink() {
    return link;
  }
  public void setLink(String link) {
    this.link = link;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getContent() {
    return content;
  }
  public void setContent(String content) {
    this.content = content;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getDate() {
    return date;
  }
  public void setDate(OffsetDateTime date) {
    this.date = date;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Announcement announcement = (Announcement) o;
    return Objects.equals(id, announcement.id) &&
        Objects.equals(link, announcement.link) &&
        Objects.equals(title, announcement.title) &&
        Objects.equals(content, announcement.content) &&
        Objects.equals(date, announcement.date);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, link, title, content, date);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Announcement {\n");
    
    sb.append("    id: ").append(StringUtil.toIndentedString(id)).append("\n");
    sb.append("    link: ").append(StringUtil.toIndentedString(link)).append("\n");
    sb.append("    title: ").append(StringUtil.toIndentedString(title)).append("\n");
    sb.append("    content: ").append(StringUtil.toIndentedString(content)).append("\n");
    sb.append("    date: ").append(StringUtil.toIndentedString(date)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
