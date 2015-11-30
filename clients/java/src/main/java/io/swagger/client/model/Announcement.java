package io.swagger.client.model;

import io.swagger.client.StringUtil;
import java.math.BigDecimal;
import java.util.Date;


import java.util.Objects;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.*;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-11-30T13:35:44.556-06:00")
public class Announcement   {
  
  private BigDecimal id = null;
  private String link = null;
  private String title = null;
  private String content = null;
  private Date date = null;

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("id")
  public BigDecimal getId() {
    return id;
  }
  public void setId(BigDecimal id) {
    this.id = id;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("link")
  public String getLink() {
    return link;
  }
  public void setLink(String link) {
    this.link = link;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("content")
  public String getContent() {
    return content;
  }
  public void setContent(String content) {
    this.content = content;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("date")
  public Date getDate() {
    return date;
  }
  public void setDate(Date date) {
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
