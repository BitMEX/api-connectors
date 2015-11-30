package io.swagger.client.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class UserCommission  {
  
  @SerializedName("makerFee")
  private String makerFee = null;
  @SerializedName("takerFee")
  private String takerFee = null;
  @SerializedName("insuranceFee")
  private String insuranceFee = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getMakerFee() {
    return makerFee;
  }
  public void setMakerFee(String makerFee) {
    this.makerFee = makerFee;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getTakerFee() {
    return takerFee;
  }
  public void setTakerFee(String takerFee) {
    this.takerFee = takerFee;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getInsuranceFee() {
    return insuranceFee;
  }
  public void setInsuranceFee(String insuranceFee) {
    this.insuranceFee = insuranceFee;
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
