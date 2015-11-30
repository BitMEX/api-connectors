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
    /// Map principals to roles
    /// </summary>
    [DataContract]
    public class RoleMapping : IEquatable<RoleMapping>
    {
        
        /// <summary>
        /// Gets or Sets Id
        /// </summary>
        [DataMember(Name="id", EmitDefaultValue=false)]
        public double? Id { get; set; }
  
        
        /// <summary>
        /// The principal type, such as user, application, or role
        /// </summary>
        /// <value>The principal type, such as user, application, or role</value>
        [DataMember(Name="principalType", EmitDefaultValue=false)]
        public string PrincipalType { get; set; }
  
        
        /// <summary>
        /// Gets or Sets PrincipalId
        /// </summary>
        [DataMember(Name="principalId", EmitDefaultValue=false)]
        public string PrincipalId { get; set; }
  
        
        /// <summary>
        /// Gets or Sets RoleId
        /// </summary>
        [DataMember(Name="roleId", EmitDefaultValue=false)]
        public double? RoleId { get; set; }
  
        
  
        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class RoleMapping {\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  PrincipalType: ").Append(PrincipalType).Append("\n");
            sb.Append("  PrincipalId: ").Append(PrincipalId).Append("\n");
            sb.Append("  RoleId: ").Append(RoleId).Append("\n");
            
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
            return this.Equals(obj as RoleMapping);
        }

        /// <summary>
        /// Returns true if RoleMapping instances are equal
        /// </summary>
        /// <param name="obj">Instance of RoleMapping to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(RoleMapping other)
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
                    this.PrincipalType == other.PrincipalType ||
                    this.PrincipalType != null &&
                    this.PrincipalType.Equals(other.PrincipalType)
                ) && 
                (
                    this.PrincipalId == other.PrincipalId ||
                    this.PrincipalId != null &&
                    this.PrincipalId.Equals(other.PrincipalId)
                ) && 
                (
                    this.RoleId == other.RoleId ||
                    this.RoleId != null &&
                    this.RoleId.Equals(other.RoleId)
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
                
                if (this.PrincipalType != null)
                    hash = hash * 57 + this.PrincipalType.GetHashCode();
                
                if (this.PrincipalId != null)
                    hash = hash * 57 + this.PrincipalId.GetHashCode();
                
                if (this.RoleId != null)
                    hash = hash * 57 + this.RoleId.GetHashCode();
                
                return hash;
            }
        }

    }
}
