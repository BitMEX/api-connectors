package io.swagger.client.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class UserCommission  {
  
  @SerializedName("makerFee")
  private Double makerFee = null;
  @SerializedName("takerFee")
  private Double takerFee = null;
  @SerializedName("settlementFee")
  private Double settlementFee = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public Double getMakerFee() {
    return makerFee;
  }
  public void setMakerFee(Double makerFee) {
    this.makerFee = makerFee;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Double getTakerFee() {
    return takerFee;
  }
  public void setTakerFee(Double takerFee) {
    this.takerFee = takerFee;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Double getSettlementFee() {
    return settlementFee;
  }
  public void setSettlementFee(Double settlementFee) {
    this.settlementFee = settlementFee;
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
        (settlementFee == null ? userCommission.settlementFee == null : settlementFee.equals(userCommission.settlementFee));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (makerFee == null ? 0: makerFee.hashCode());
    result = 31 * result + (takerFee == null ? 0: takerFee.hashCode());
    result = 31 * result + (settlementFee == null ? 0: settlementFee.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserCommission {\n");
    
    sb.append("  makerFee: ").append(makerFee).append("\n");
    sb.append("  takerFee: ").append(takerFee).append("\n");
    sb.append("  settlementFee: ").append(settlementFee).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
