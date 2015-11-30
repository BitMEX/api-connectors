package io.swagger.client.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class AnonymousModel5  {
  
  @SerializedName("scheme")
  private String scheme = null;
  @SerializedName("credential")
  private Object credential = null;

  
  /**
   * See the API docs for the list of supported values.
   **/
  @ApiModelProperty(value = "See the API docs for the list of supported values.")
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
  public Object getCredential() {
    return credential;
  }
  public void setCredential(Object credential) {
    this.credential = credential;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnonymousModel5 {\n");
    
    sb.append("  scheme: ").append(scheme).append("\n");
    sb.append("  credential: ").append(credential).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
