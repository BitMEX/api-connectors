package io.swagger.client.model;

import io.swagger.client.StringUtil;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

import com.google.gson.annotations.SerializedName;


import java.util.Objects;

import io.swagger.annotations.*;



@ApiModel(description = "")
public class UserCommission   {
  
  @SerializedName("makerFee")
  private Double makerFee = null;

  @SerializedName("takerFee")
  private Double takerFee = null;

  @SerializedName("settlementFee")
  private Double settlementFee = null;

  @SerializedName("maxFee")
  private Double maxFee = null;

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

  /**
   **/
  @ApiModelProperty(value = "")
  public Double getMaxFee() {
    return maxFee;
  }
  public void setMaxFee(Double maxFee) {
    this.maxFee = maxFee;
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
        Objects.equals(settlementFee, userCommission.settlementFee) &&
        Objects.equals(maxFee, userCommission.maxFee);
  }

  @Override
  public int hashCode() {
    return Objects.hash(makerFee, takerFee, settlementFee, maxFee);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserCommission {\n");
    
    sb.append("    makerFee: ").append(StringUtil.toIndentedString(makerFee)).append("\n");
    sb.append("    takerFee: ").append(StringUtil.toIndentedString(takerFee)).append("\n");
    sb.append("    settlementFee: ").append(StringUtil.toIndentedString(settlementFee)).append("\n");
    sb.append("    maxFee: ").append(StringUtil.toIndentedString(maxFee)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
