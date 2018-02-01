package io.swagger.client.model;

import io.swagger.client.StringUtil;

import com.google.gson.annotations.SerializedName;


import java.util.Objects;

import io.swagger.annotations.*;



@ApiModel(description = "")
public class XAny   {
  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    XAny xAny = (XAny) o;
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash();
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class XAny {\n");
    
    sb.append("}");
    return sb.toString();
  }
}
