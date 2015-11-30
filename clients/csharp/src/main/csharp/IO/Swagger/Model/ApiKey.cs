using System;
using System.Linq;
using System.IO;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Runtime.Serialization;
using Newtonsoft.Json;

namespace IO.Swagger.Model
{

    /// <summary>
    /// 
    /// </summary>
    [DataContract]
    public class ApiKey : IEquatable<ApiKey>
    {
        
        /// <summary>
        /// Gets or Sets Id
        /// </summary>
        [DataMember(Name="id", EmitDefaultValue=false)]
        public string Id { get; set; }
  
        
        /// <summary>
        /// Gets or Sets Secret
        /// </summary>
        [DataMember(Name="secret", EmitDefaultValue=false)]
        public string Secret { get; set; }
  
        
        /// <summary>
        /// Gets or Sets Name
        /// </summary>
        [DataMember(Name="name", EmitDefaultValue=false)]
        public string Name { get; set; }
  
        
        /// <summary>
        /// Gets or Sets Nonce
        /// </summary>
        [DataMember(Name="nonce", EmitDefaultValue=false)]
        public double? Nonce { get; set; }
  
        
        /// <summary>
        /// Gets or Sets Cidr
        /// </summary>
        [DataMember(Name="cidr", EmitDefaultValue=false)]
        public string Cidr { get; set; }
  
        
        /// <summary>
        /// Gets or Sets Permissions
        /// </summary>
        [DataMember(Name="permissions", EmitDefaultValue=false)]
        public List<string> Permissions { get; set; }
  
        
        /// <summary>
        /// Gets or Sets Enabled
        /// </summary>
        [DataMember(Name="enabled", EmitDefaultValue=false)]
        public bool? Enabled { get; set; }
  
        
        /// <summary>
        /// Gets or Sets UserId
        /// </summary>
        [DataMember(Name="userId", EmitDefaultValue=false)]
        public double? UserId { get; set; }
  
        
        /// <summary>
        /// Gets or Sets Created
        /// </summary>
        [DataMember(Name="created", EmitDefaultValue=false)]
        public DateTime? Created { get; set; }
  
        
  
        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ApiKey {\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Secret: ").Append(Secret).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Nonce: ").Append(Nonce).Append("\n");
            sb.Append("  Cidr: ").Append(Cidr).Append("\n");
            sb.Append("  Permissions: ").Append(Permissions).Append("\n");
            sb.Append("  Enabled: ").Append(Enabled).Append("\n");
            sb.Append("  UserId: ").Append(UserId).Append("\n");
            sb.Append("  Created: ").Append(Created).Append("\n");
            
            sb.Append("}\n");
            return sb.ToString();
        }
  
        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public string ToJson()
        {
            return JsonConvert.SerializeObject(this, Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="obj">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object obj)
        {
            // credit: http://stackoverflow.com/a/10454552/677735
            return this.Equals(obj as ApiKey);
        }

        /// <summary>
        /// Returns true if ApiKey instances are equal
        /// </summary>
        /// <param name="obj">Instance of ApiKey to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ApiKey other)
        {
            // credit: http://stackoverflow.com/a/10454552/677735
            if (other == null)
                return false;

            return 
                (
                    this.Id == other.Id ||
                    this.Id != null &&
                    this.Id.Equals(other.Id)
                ) && 
                (
                    this.Secret == other.Secret ||
                    this.Secret != null &&
                    this.Secret.Equals(other.Secret)
                ) && 
                (
                    this.Name == other.Name ||
                    this.Name != null &&
                    this.Name.Equals(other.Name)
                ) && 
                (
                    this.Nonce == other.Nonce ||
                    this.Nonce != null &&
                    this.Nonce.Equals(other.Nonce)
                ) && 
                (
                    this.Cidr == other.Cidr ||
                    this.Cidr != null &&
                    this.Cidr.Equals(other.Cidr)
                ) && 
                (
                    this.Permissions == other.Permissions ||
                    this.Permissions != null &&
                    this.Permissions.SequenceEqual(other.Permissions)
                ) && 
                (
                    this.Enabled == other.Enabled ||
                    this.Enabled != null &&
                    this.Enabled.Equals(other.Enabled)
                ) && 
                (
                    this.UserId == other.UserId ||
                    this.UserId != null &&
                    this.UserId.Equals(other.UserId)
                ) && 
                (
                    this.Created == other.Created ||
                    this.Created != null &&
                    this.Created.Equals(other.Created)
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            // credit: http://stackoverflow.com/a/263416/677735
            unchecked // Overflow is fine, just wrap
            {
                int hash = 41;
                // Suitable nullity checks etc, of course :)
                
                if (this.Id != null)
                    hash = hash * 57 + this.Id.GetHashCode();
                
                if (this.Secret != null)
                    hash = hash * 57 + this.Secret.GetHashCode();
                
                if (this.Name != null)
                    hash = hash * 57 + this.Name.GetHashCode();
                
                if (this.Nonce != null)
                    hash = hash * 57 + this.Nonce.GetHashCode();
                
                if (this.Cidr != null)
                    hash = hash * 57 + this.Cidr.GetHashCode();
                
                if (this.Permissions != null)
                    hash = hash * 57 + this.Permissions.GetHashCode();
                
                if (this.Enabled != null)
                    hash = hash * 57 + this.Enabled.GetHashCode();
                
                if (this.UserId != null)
                    hash = hash * 57 + this.UserId.GetHashCode();
                
                if (this.Created != null)
                    hash = hash * 57 + this.Created.GetHashCode();
                
                return hash;
            }
        }

    }
}
