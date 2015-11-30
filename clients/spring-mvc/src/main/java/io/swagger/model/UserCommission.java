package io.swagger.model;


import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringMVCServerCodegen", date = "2015-11-30T13:35:50.750-06:00")
public class UserCommission  {
  
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
    
    sb.append("  makerFee: ").append(makerFee).append("\n");
    sb.append("  takerFee: ").append(takerFee).append("\n");
    sb.append("  insuranceFee: ").append(insuranceFee).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
