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
import org.threeten.bp.OffsetDateTime;

import com.google.gson.annotations.SerializedName;


import java.util.Objects;

import io.swagger.annotations.*;



@ApiModel(description = "")
public class IndexComposite   {
  
  @SerializedName("timestamp")
  private OffsetDateTime timestamp = null;

  @SerializedName("symbol")
  private String symbol = null;

  @SerializedName("indexSymbol")
  private String indexSymbol = null;

  @SerializedName("reference")
  private String reference = null;

  @SerializedName("lastPrice")
  private Double lastPrice = null;

  @SerializedName("weight")
  private Double weight = null;

  @SerializedName("logged")
  private OffsetDateTime logged = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public OffsetDateTime getTimestamp() {
    return timestamp;
  }
  public void setTimestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getSymbol() {
    return symbol;
  }
  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getIndexSymbol() {
    return indexSymbol;
  }
  public void setIndexSymbol(String indexSymbol) {
    this.indexSymbol = indexSymbol;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getReference() {
    return reference;
  }
  public void setReference(String reference) {
    this.reference = reference;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Double getLastPrice() {
    return lastPrice;
  }
  public void setLastPrice(Double lastPrice) {
    this.lastPrice = lastPrice;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Double getWeight() {
    return weight;
  }
  public void setWeight(Double weight) {
    this.weight = weight;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getLogged() {
    return logged;
  }
  public void setLogged(OffsetDateTime logged) {
    this.logged = logged;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IndexComposite indexComposite = (IndexComposite) o;
    return Objects.equals(timestamp, indexComposite.timestamp) &&
        Objects.equals(symbol, indexComposite.symbol) &&
        Objects.equals(indexSymbol, indexComposite.indexSymbol) &&
        Objects.equals(reference, indexComposite.reference) &&
        Objects.equals(lastPrice, indexComposite.lastPrice) &&
        Objects.equals(weight, indexComposite.weight) &&
        Objects.equals(logged, indexComposite.logged);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timestamp, symbol, indexSymbol, reference, lastPrice, weight, logged);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class IndexComposite {\n");
    
    sb.append("    timestamp: ").append(StringUtil.toIndentedString(timestamp)).append("\n");
    sb.append("    symbol: ").append(StringUtil.toIndentedString(symbol)).append("\n");
    sb.append("    indexSymbol: ").append(StringUtil.toIndentedString(indexSymbol)).append("\n");
    sb.append("    reference: ").append(StringUtil.toIndentedString(reference)).append("\n");
    sb.append("    lastPrice: ").append(StringUtil.toIndentedString(lastPrice)).append("\n");
    sb.append("    weight: ").append(StringUtil.toIndentedString(weight)).append("\n");
    sb.append("    logged: ").append(StringUtil.toIndentedString(logged)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
