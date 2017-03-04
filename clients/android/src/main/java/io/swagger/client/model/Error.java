package io.swagger.client.model;

import io.swagger.client.model.ErrorError;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class Error  {
  
  @SerializedName("error")
  private ErrorError error = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public ErrorError getError() {
    return error;
  }
  public void setError(ErrorError error) {
    this.error = error;
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
    return (error == null ? error.error == null : error.equals(error.error));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (error == null ? 0: error.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Error {\n");
    
    sb.append("  error: ").append(error).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
