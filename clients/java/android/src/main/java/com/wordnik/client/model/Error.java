package com.wordnik.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Error {
  @JsonProperty("message")
  private String message = null;
  @JsonProperty("code")
  private Double code = null;
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }

  public Double getCode() {
    return code;
  }
  public void setCode(Double code) {
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

