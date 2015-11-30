package io.swagger.client.model;

import io.swagger.client.StringUtil;
import java.math.BigDecimal;


import java.util.Objects;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.*;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-11-30T13:35:44.556-06:00")
public class Error   {
  
  private String message = null;
  private BigDecimal code = null;

  
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
  @JsonProperty("code")
  public BigDecimal getCode() {
    return code;
  }
  public void setCode(BigDecimal code) {
    this.code = code;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Error error = (Error) o;
    return Objects.equals(message, error.message) &&
        Objects.equals(code, error.code);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, code);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Error {\n");
    
    sb.append("    message: ").append(StringUtil.toIndentedString(message)).append("\n");
    sb.append("    code: ").append(StringUtil.toIndentedString(code)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
