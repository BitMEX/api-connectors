package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-07-05T09:41:09.909-05:00")
public class UserCommission   {
  
  private String makerFee = null;
  private String takerFee = null;
  private String insuranceFee = null;

  /**
   **/
  public UserCommission makerFee(String makerFee) {
    this.makerFee = makerFee;
    return this;
  }

  
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
  public UserCommission takerFee(String takerFee) {
    this.takerFee = takerFee;
    return this;
  }

  
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
  public UserCommission insuranceFee(String insuranceFee) {
    this.insuranceFee = insuranceFee;
    return this;
  }

  
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
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserCommission {\n");
    
    sb.append("    makerFee: ").append(toIndentedString(makerFee)).append("\n");
    sb.append("    takerFee: ").append(toIndentedString(takerFee)).append("\n");
    sb.append("    insuranceFee: ").append(toIndentedString(insuranceFee)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

