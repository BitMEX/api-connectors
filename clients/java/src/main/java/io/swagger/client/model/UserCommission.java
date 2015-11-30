package io.swagger.client.model;

import io.swagger.client.StringUtil;


import java.util.Objects;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.*;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-11-30T13:35:44.556-06:00")
public class UserCommission   {
  
  private String makerFee = null;
  private String takerFee = null;
  private String insuranceFee = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("makerFee")
  public String getMakerFee() {
    return makerFee;
  }
  public void setMakerFee(String makerFee) {
    this.makerFee = makerFee;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("takerFee")
  public String getTakerFee() {
    return takerFee;
  }
  public void setTakerFee(String takerFee) {
    this.takerFee = takerFee;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("insuranceFee")
  public String getInsuranceFee() {
    return insuranceFee;
  }
  public void setInsuranceFee(String insuranceFee) {
    this.insuranceFee = insuranceFee;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserCommission userCommission = (UserCommission) o;
    return Objects.equals(makerFee, userCommission.makerFee) &&
        Objects.equals(takerFee, userCommission.takerFee) &&
        Objects.equals(insuranceFee, userCommission.insuranceFee);
  }

  @Override
  public int hashCode() {
    return Objects.hash(makerFee, takerFee, insuranceFee);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserCommission {\n");
    
    sb.append("    makerFee: ").append(StringUtil.toIndentedString(makerFee)).append("\n");
    sb.append("    takerFee: ").append(StringUtil.toIndentedString(takerFee)).append("\n");
    sb.append("    insuranceFee: ").append(StringUtil.toIndentedString(insuranceFee)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
