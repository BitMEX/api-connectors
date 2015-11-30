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
    public class UserCommission : IEquatable<UserCommission>
    {
        
        /// <summary>
        /// Gets or Sets MakerFee
        /// </summary>
        [DataMember(Name="makerFee", EmitDefaultValue=false)]
        public string MakerFee { get; set; }
  
        
        /// <summary>
        /// Gets or Sets TakerFee
        /// </summary>
        [DataMember(Name="takerFee", EmitDefaultValue=false)]
        public string TakerFee { get; set; }
  
        
        /// <summary>
        /// Gets or Sets InsuranceFee
        /// </summary>
        [DataMember(Name="insuranceFee", EmitDefaultValue=false)]
        public string InsuranceFee { get; set; }
  
        
  
        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class UserCommission {\n");
            sb.Append("  MakerFee: ").Append(MakerFee).Append("\n");
            sb.Append("  TakerFee: ").Append(TakerFee).Append("\n");
            sb.Append("  InsuranceFee: ").Append(InsuranceFee).Append("\n");
            
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
            return this.Equals(obj as UserCommission);
        }

        /// <summary>
        /// Returns true if UserCommission instances are equal
        /// </summary>
        /// <param name="obj">Instance of UserCommission to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(UserCommission other)
        {
            // credit: http://stackoverflow.com/a/10454552/677735
            if (other == null)
                return false;

            return 
                (
                    this.MakerFee == other.MakerFee ||
                    this.MakerFee != null &&
                    this.MakerFee.Equals(other.MakerFee)
                ) && 
                (
                    this.TakerFee == other.TakerFee ||
                    this.TakerFee != null &&
                    this.TakerFee.Equals(other.TakerFee)
                ) && 
                (
                    this.InsuranceFee == other.InsuranceFee ||
                    this.InsuranceFee != null &&
                    this.InsuranceFee.Equals(other.InsuranceFee)
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
                
                if (this.MakerFee != null)
                    hash = hash * 57 + this.MakerFee.GetHashCode();
                
                if (this.TakerFee != null)
                    hash = hash * 57 + this.TakerFee.GetHashCode();
                
                if (this.InsuranceFee != null)
                    hash = hash * 57 + this.InsuranceFee.GetHashCode();
                
                return hash;
            }
        }

    }
}
