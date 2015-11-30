package io.swagger.model;

import io.swagger.model.XAny;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringMVCServerCodegen", date = "2015-11-30T13:36:04.774-06:00")
public class AnonymousModel0  {
  
  private XAny apns = null;
  private XAny gcm = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("apns")
  public XAny getApns() {
    return apns;
  }
  public void setApns(XAny apns) {
    this.apns = apns;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("gcm")
  public XAny getGcm() {
    return gcm;
  }
  public void setGcm(XAny gcm) {
    this.gcm = gcm;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnonymousModel0 anonymousModel0 = (AnonymousModel0) o;
    return Objects.equals(apns, anonymousModel0.apns) &&
        Objects.equals(gcm, anonymousModel0.gcm);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apns, gcm);
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
