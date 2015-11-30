package io.swagger.model;

import java.math.BigDecimal;
import java.util.Date;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringMVCServerCodegen", date = "2015-11-30T13:35:50.750-06:00")
public class Chat  {
  
  private BigDecimal id = null;
  private Date date = null;
  private String user = null;
  private String message = null;
  private String html = null;
  private Boolean fromBot = false;

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("id")
  public BigDecimal getId() {
    return id;
  }
  public void setId(BigDecimal id) {
    this.id = id;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("date")
  public Date getDate() {
    return date;
  }
  public void setDate(Date date) {
    this.date = date;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("user")
  public String getUser() {
    return user;
  }
  public void setUser(String user) {
    this.user = user;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("html")
  public String getHtml() {
    return html;
  }
  public void setHtml(String html) {
    this.html = html;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("fromBot")
  public Boolean getFromBot() {
    return fromBot;
  }
  public void setFromBot(Boolean fromBot) {
    this.fromBot = fromBot;
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
        Objects.equals(fromBot, chat.fromBot);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, date, user, message, html, fromBot);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Chat {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  date: ").append(date).append("\n");
    sb.append("  user: ").append(user).append("\n");
    sb.append("  message: ").append(message).append("\n");
    sb.append("  html: ").append(html).append("\n");
    sb.append("  fromBot: ").append(fromBot).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
