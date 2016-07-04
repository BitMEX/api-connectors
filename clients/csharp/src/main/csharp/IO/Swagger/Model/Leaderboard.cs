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
    public class Leaderboard : IEquatable<Leaderboard>
    {
        
        /// <summary>
        /// Gets or Sets Name
        /// </summary>
        [DataMember(Name="name", EmitDefaultValue=false)]
        public string Name { get; set; }
  
        
        /// <summary>
        /// Gets or Sets IsRealName
        /// </summary>
        [DataMember(Name="isRealName", EmitDefaultValue=false)]
        public bool? IsRealName { get; set; }
  
        
        /// <summary>
        /// Gets or Sets IsMe
        /// </summary>
        [DataMember(Name="isMe", EmitDefaultValue=false)]
        public bool? IsMe { get; set; }
  
        
        /// <summary>
        /// Gets or Sets Profit
        /// </summary>
        [DataMember(Name="profit", EmitDefaultValue=false)]
        public double? Profit { get; set; }
  
        
  
        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class Leaderboard {\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  IsRealName: ").Append(IsRealName).Append("\n");
            sb.Append("  IsMe: ").Append(IsMe).Append("\n");
            sb.Append("  Profit: ").Append(Profit).Append("\n");
            
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
            return this.Equals(obj as Leaderboard);
        }

        /// <summary>
        /// Returns true if Leaderboard instances are equal
        /// </summary>
        /// <param name="obj">Instance of Leaderboard to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Leaderboard other)
        {
            // credit: http://stackoverflow.com/a/10454552/677735
            if (other == null)
                return false;

            return 
                (
                    this.Name == other.Name ||
                    this.Name != null &&
                    this.Name.Equals(other.Name)
                ) && 
                (
                    this.IsRealName == other.IsRealName ||
                    this.IsRealName != null &&
                    this.IsRealName.Equals(other.IsRealName)
                ) && 
                (
                    this.IsMe == other.IsMe ||
                    this.IsMe != null &&
                    this.IsMe.Equals(other.IsMe)
                ) && 
                (
                    this.Profit == other.Profit ||
                    this.Profit != null &&
                    this.Profit.Equals(other.Profit)
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
                
                if (this.Name != null)
                    hash = hash * 57 + this.Name.GetHashCode();
                
                if (this.IsRealName != null)
                    hash = hash * 57 + this.IsRealName.GetHashCode();
                
                if (this.IsMe != null)
                    hash = hash * 57 + this.IsMe.GetHashCode();
                
                if (this.Profit != null)
                    hash = hash * 57 + this.Profit.GetHashCode();
                
                return hash;
            }
        }

    }
}
