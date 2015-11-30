package io.swagger.client.model;

import io.swagger.client.model.X-any;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class AnonymousModel0  {
  
  @SerializedName("apns")
  private X-any apns = null;
  @SerializedName("gcm")
  private X-any gcm = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  public X-any getApns() {
    return apns;
  }
  public void setApns(X-any apns) {
    this.apns = apns;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public X-any getGcm() {
    return gcm;
  }
  public void setGcm(X-any gcm) {
    this.gcm = gcm;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnonymousModel0 {\n");
    
    sb.append("  apns: ").append(apns).append("\n");
    sb.append("  gcm: ").append(gcm).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
