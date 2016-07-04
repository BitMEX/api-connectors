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
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Error error = (Error) o;
    return (message == null ? error.message == null : message.equals(error.message)) &&
        (code == null ? error.code == null : code.equals(error.code));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (message == null ? 0: message.hashCode());
    result = 31 * result + (code == null ? 0: code.hashCode());
    return result;
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
