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
    public class Funding : IEquatable<Funding>
    {
        
        /// <summary>
        /// Gets or Sets Timestamp
        /// </summary>
        [DataMember(Name="timestamp", EmitDefaultValue=false)]
        public DateTime? Timestamp { get; set; }
  
        
        /// <summary>
        /// Gets or Sets Symbol
        /// </summary>
        [DataMember(Name="symbol", EmitDefaultValue=false)]
        public string Symbol { get; set; }
  
        
        /// <summary>
        /// Gets or Sets FundingInterval
        /// </summary>
        [DataMember(Name="fundingInterval", EmitDefaultValue=false)]
        public DateTime? FundingInterval { get; set; }
  
        
        /// <summary>
        /// Gets or Sets FundingRate
        /// </summary>
        [DataMember(Name="fundingRate", EmitDefaultValue=false)]
        public double? FundingRate { get; set; }
  
        
        /// <summary>
        /// Gets or Sets FundingRateDaily
        /// </summary>
        [DataMember(Name="fundingRateDaily", EmitDefaultValue=false)]
        public double? FundingRateDaily { get; set; }
  
        
  
        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class Funding {\n");
            sb.Append("  Timestamp: ").Append(Timestamp).Append("\n");
            sb.Append("  Symbol: ").Append(Symbol).Append("\n");
            sb.Append("  FundingInterval: ").Append(FundingInterval).Append("\n");
            sb.Append("  FundingRate: ").Append(FundingRate).Append("\n");
            sb.Append("  FundingRateDaily: ").Append(FundingRateDaily).Append("\n");
            
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
            return this.Equals(obj as Funding);
        }

        /// <summary>
        /// Returns true if Funding instances are equal
        /// </summary>
        /// <param name="obj">Instance of Funding to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Funding other)
        {
            // credit: http://stackoverflow.com/a/10454552/677735
            if (other == null)
                return false;

            return 
                (
                    this.Timestamp == other.Timestamp ||
                    this.Timestamp != null &&
                    this.Timestamp.Equals(other.Timestamp)
                ) && 
                (
                    this.Symbol == other.Symbol ||
                    this.Symbol != null &&
                    this.Symbol.Equals(other.Symbol)
                ) && 
                (
                    this.FundingInterval == other.FundingInterval ||
                    this.FundingInterval != null &&
                    this.FundingInterval.Equals(other.FundingInterval)
                ) && 
                (
                    this.FundingRate == other.FundingRate ||
                    this.FundingRate != null &&
                    this.FundingRate.Equals(other.FundingRate)
                ) && 
                (
                    this.FundingRateDaily == other.FundingRateDaily ||
                    this.FundingRateDaily != null &&
                    this.FundingRateDaily.Equals(other.FundingRateDaily)
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
                
                if (this.Timestamp != null)
                    hash = hash * 57 + this.Timestamp.GetHashCode();
                
                if (this.Symbol != null)
                    hash = hash * 57 + this.Symbol.GetHashCode();
                
                if (this.FundingInterval != null)
                    hash = hash * 57 + this.FundingInterval.GetHashCode();
                
                if (this.FundingRate != null)
                    hash = hash * 57 + this.FundingRate.GetHashCode();
                
                if (this.FundingRateDaily != null)
                    hash = hash * 57 + this.FundingRateDaily.GetHashCode();
                
                return hash;
            }
        }

    }
}
