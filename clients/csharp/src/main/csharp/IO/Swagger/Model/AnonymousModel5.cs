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
    public class AnonymousModel5 : IEquatable<AnonymousModel5>
    {
        
        /// <summary>
        /// See the API docs for the list of supported values.
        /// </summary>
        /// <value>See the API docs for the list of supported values.</value>
        [DataMember(Name="scheme", EmitDefaultValue=false)]
        public string Scheme { get; set; }
  
        
        /// <summary>
        /// Scheme-specific credentials
        /// </summary>
        /// <value>Scheme-specific credentials</value>
        [DataMember(Name="credential", EmitDefaultValue=false)]
        public Object Credential { get; set; }
  
        
  
        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class AnonymousModel5 {\n");
            sb.Append("  Scheme: ").Append(Scheme).Append("\n");
            sb.Append("  Credential: ").Append(Credential).Append("\n");
            
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
            return this.Equals(obj as AnonymousModel5);
        }

        /// <summary>
        /// Returns true if AnonymousModel5 instances are equal
        /// </summary>
        /// <param name="obj">Instance of AnonymousModel5 to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(AnonymousModel5 other)
        {
            // credit: http://stackoverflow.com/a/10454552/677735
            if (other == null)
                return false;

            return 
                (
                    this.Scheme == other.Scheme ||
                    this.Scheme != null &&
                    this.Scheme.Equals(other.Scheme)
                ) && 
                (
                    this.Credential == other.Credential ||
                    this.Credential != null &&
                    this.Credential.Equals(other.Credential)
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
                
                if (this.Scheme != null)
                    hash = hash * 57 + this.Scheme.GetHashCode();
                
                if (this.Credential != null)
                    hash = hash * 57 + this.Credential.GetHashCode();
                
                return hash;
            }
        }

    }
}
