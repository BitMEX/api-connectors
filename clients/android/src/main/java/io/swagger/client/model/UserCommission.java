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
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserCommission userCommission = (UserCommission) o;
    return (makerFee == null ? userCommission.makerFee == null : makerFee.equals(userCommission.makerFee)) &&
        (takerFee == null ? userCommission.takerFee == null : takerFee.equals(userCommission.takerFee)) &&
        (insuranceFee == null ? userCommission.insuranceFee == null : insuranceFee.equals(userCommission.insuranceFee));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (makerFee == null ? 0: makerFee.hashCode());
    result = 31 * result + (takerFee == null ? 0: takerFee.hashCode());
    result = 31 * result + (insuranceFee == null ? 0: insuranceFee.hashCode());
    return result;
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
