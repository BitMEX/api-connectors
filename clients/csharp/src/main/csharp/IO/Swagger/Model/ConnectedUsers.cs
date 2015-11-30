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
    public class ConnectedUsers : IEquatable<ConnectedUsers>
    {
        
        /// <summary>
        /// Gets or Sets Users
        /// </summary>
        [DataMember(Name="users", EmitDefaultValue=false)]
        public double? Users { get; set; }
  
        
        /// <summary>
        /// Gets or Sets Bots
        /// </summary>
        [DataMember(Name="bots", EmitDefaultValue=false)]
        public double? Bots { get; set; }
  
        
  
        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ConnectedUsers {\n");
            sb.Append("  Users: ").Append(Users).Append("\n");
            sb.Append("  Bots: ").Append(Bots).Append("\n");
            
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
            return this.Equals(obj as ConnectedUsers);
        }

        /// <summary>
        /// Returns true if ConnectedUsers instances are equal
        /// </summary>
        /// <param name="obj">Instance of ConnectedUsers to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ConnectedUsers other)
        {
            // credit: http://stackoverflow.com/a/10454552/677735
            if (other == null)
                return false;

            return 
                (
                    this.Users == other.Users ||
                    this.Users != null &&
                    this.Users.Equals(other.Users)
                ) && 
                (
                    this.Bots == other.Bots ||
                    this.Bots != null &&
                    this.Bots.Equals(other.Bots)
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
                
                if (this.Users != null)
                    hash = hash * 57 + this.Users.GetHashCode();
                
                if (this.Bots != null)
                    hash = hash * 57 + this.Bots.GetHashCode();
                
                return hash;
            }
        }

    }
}
