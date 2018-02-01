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

import com.google.gson.annotations.SerializedName;


import java.util.Objects;

import io.swagger.annotations.*;



@ApiModel(description = "")
public class ErrorError   {
  
  @SerializedName("message")
  private String message = null;

  @SerializedName("name")
  private String name = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorError errorError = (ErrorError) o;
    return Objects.equals(message, errorError.message) &&
        Objects.equals(name, errorError.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, name);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorError {\n");
    
    sb.append("    message: ").append(StringUtil.toIndentedString(message)).append("\n");
    sb.append("    name: ").append(StringUtil.toIndentedString(name)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
