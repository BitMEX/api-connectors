package io.swagger.client.model;

import java.math.BigDecimal;
import java.util.*;
import java.util.Date;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class ApiKey  {
  
  @SerializedName("id")
  private String id = null;
  @SerializedName("secret")
  private String secret = null;
  @SerializedName("name")
  private String name = null;
  @SerializedName("nonce")
  private BigDecimal nonce = null;
  @SerializedName("cidr")
  private String cidr = null;
  @SerializedName("permissions")
  private List<String> permissions = null;
  @SerializedName("enabled")
  private Boolean enabled = null;
  @SerializedName("userId")
  private BigDecimal userId = null;
  @SerializedName("created")
  private Date created = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getSecret() {
    return secret;
  }
  public void setSecret(String secret) {
    this.secret = secret;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public BigDecimal getNonce() {
    return nonce;
  }
  public void setNonce(BigDecimal nonce) {
    this.nonce = nonce;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getCidr() {
    return cidr;
  }
  public void setCidr(String cidr) {
    this.cidr = cidr;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<String> getPermissions() {
    return permissions;
  }
  public void setPermissions(List<String> permissions) {
    this.permissions = permissions;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getEnabled() {
    return enabled;
  }
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public BigDecimal getUserId() {
    return userId;
  }
  public void setUserId(BigDecimal userId) {
    this.userId = userId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Date getCreated() {
    return created;
  }
  public void setCreated(Date created) {
    this.created = created;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiKey apiKey = (ApiKey) o;
    return (id == null ? apiKey.id == null : id.equals(apiKey.id)) &&
        (secret == null ? apiKey.secret == null : secret.equals(apiKey.secret)) &&
        (name == null ? apiKey.name == null : name.equals(apiKey.name)) &&
        (nonce == null ? apiKey.nonce == null : nonce.equals(apiKey.nonce)) &&
        (cidr == null ? apiKey.cidr == null : cidr.equals(apiKey.cidr)) &&
        (permissions == null ? apiKey.permissions == null : permissions.equals(apiKey.permissions)) &&
        (enabled == null ? apiKey.enabled == null : enabled.equals(apiKey.enabled)) &&
        (userId == null ? apiKey.userId == null : userId.equals(apiKey.userId)) &&
        (created == null ? apiKey.created == null : created.equals(apiKey.created));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (id == null ? 0: id.hashCode());
    result = 31 * result + (secret == null ? 0: secret.hashCode());
    result = 31 * result + (name == null ? 0: name.hashCode());
    result = 31 * result + (nonce == null ? 0: nonce.hashCode());
    result = 31 * result + (cidr == null ? 0: cidr.hashCode());
    result = 31 * result + (permissions == null ? 0: permissions.hashCode());
    result = 31 * result + (enabled == null ? 0: enabled.hashCode());
    result = 31 * result + (userId == null ? 0: userId.hashCode());
    result = 31 * result + (created == null ? 0: created.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiKey {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  secret: ").append(secret).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  nonce: ").append(nonce).append("\n");
    sb.append("  cidr: ").append(cidr).append("\n");
    sb.append("  permissions: ").append(permissions).append("\n");
    sb.append("  enabled: ").append(enabled).append("\n");
    sb.append("  userId: ").append(userId).append("\n");
    sb.append("  created: ").append(created).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
