package io.swagger.client.model;

import java.math.BigDecimal;
import java.util.Date;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class Chat  {
  
  @SerializedName("id")
  private BigDecimal id = null;
  @SerializedName("date")
  private Date date = null;
  @SerializedName("user")
  private String user = null;
  @SerializedName("message")
  private String message = null;
  @SerializedName("html")
  private String html = null;
  @SerializedName("fromBot")
  private Boolean fromBot = null;

  
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
  public Date getDate() {
    return date;
  }
  public void setDate(Date date) {
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
  public Boolean getFromBot() {
    return fromBot;
  }
  public void setFromBot(Boolean fromBot) {
    this.fromBot = fromBot;
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
