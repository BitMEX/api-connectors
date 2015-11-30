package io.swagger.client.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class Error  {
  
  @SerializedName("message")
  private String message = null;
  @SerializedName("code")
  private BigDecimal code = null;

  
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
  public BigDecimal getCode() {
    return code;
  }
  public void setCode(BigDecimal code) {
    this.code = code;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Error {\n");
    
    sb.append("  message: ").append(message).append("\n");
    sb.append("  code: ").append(code).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
