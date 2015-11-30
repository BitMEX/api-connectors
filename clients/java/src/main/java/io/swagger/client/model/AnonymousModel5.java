package io.swagger.client.model;

import io.swagger.client.StringUtil;


import java.util.Objects;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.*;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-11-30T13:35:44.556-06:00")
public class AnonymousModel5   {
  
  private String scheme = null;
  private Object credential = null;

  
  /**
   * See the API docs for the list of supported values.
   **/
  @ApiModelProperty(value = "See the API docs for the list of supported values.")
  @JsonProperty("scheme")
  public String getScheme() {
    return scheme;
  }
  public void setScheme(String scheme) {
    this.scheme = scheme;
  }

  
  /**
   * Scheme-specific credentials
   **/
  @ApiModelProperty(value = "Scheme-specific credentials")
  @JsonProperty("credential")
  public Object getCredential() {
    return credential;
  }
  public void setCredential(Object credential) {
    this.credential = credential;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnonymousModel5 anonymousModel5 = (AnonymousModel5) o;
    return Objects.equals(scheme, anonymousModel5.scheme) &&
        Objects.equals(credential, anonymousModel5.credential);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scheme, credential);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnonymousModel5 {\n");
    
    sb.append("    scheme: ").append(StringUtil.toIndentedString(scheme)).append("\n");
    sb.append("    credential: ").append(StringUtil.toIndentedString(credential)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
