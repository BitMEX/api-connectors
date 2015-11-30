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
    public class AnonymousModel0 : IEquatable<AnonymousModel0>
    {
        
        /// <summary>
        /// Gets or Sets Apns
        /// </summary>
        [DataMember(Name="apns", EmitDefaultValue=false)]
        public X-any Apns { get; set; }
  
        
        /// <summary>
        /// Gets or Sets Gcm
        /// </summary>
        [DataMember(Name="gcm", EmitDefaultValue=false)]
        public X-any Gcm { get; set; }
  
        
  
        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class AnonymousModel0 {\n");
            sb.Append("  Apns: ").Append(Apns).Append("\n");
            sb.Append("  Gcm: ").Append(Gcm).Append("\n");
            
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
            return this.Equals(obj as AnonymousModel0);
        }

        /// <summary>
        /// Returns true if AnonymousModel0 instances are equal
        /// </summary>
        /// <param name="obj">Instance of AnonymousModel0 to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(AnonymousModel0 other)
        {
            // credit: http://stackoverflow.com/a/10454552/677735
            if (other == null)
                return false;

            return 
                (
                    this.Apns == other.Apns ||
                    this.Apns != null &&
                    this.Apns.Equals(other.Apns)
                ) && 
                (
                    this.Gcm == other.Gcm ||
                    this.Gcm != null &&
                    this.Gcm.Equals(other.Gcm)
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
                
                if (this.Apns != null)
                    hash = hash * 57 + this.Apns.GetHashCode();
                
                if (this.Gcm != null)
                    hash = hash * 57 + this.Gcm.GetHashCode();
                
                return hash;
            }
        }

    }
}
