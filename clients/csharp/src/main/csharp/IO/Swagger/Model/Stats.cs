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
    public class Stats : IEquatable<Stats>
    {
        
        /// <summary>
        /// Gets or Sets RootSymbol
        /// </summary>
        [DataMember(Name="rootSymbol", EmitDefaultValue=false)]
        public string RootSymbol { get; set; }
  
        
        /// <summary>
        /// Gets or Sets Currency
        /// </summary>
        [DataMember(Name="currency", EmitDefaultValue=false)]
        public string Currency { get; set; }
  
        
        /// <summary>
        /// Gets or Sets Volume24h
        /// </summary>
        [DataMember(Name="volume24h", EmitDefaultValue=false)]
        public double? Volume24h { get; set; }
  
        
        /// <summary>
        /// Gets or Sets Turnover24h
        /// </summary>
        [DataMember(Name="turnover24h", EmitDefaultValue=false)]
        public double? Turnover24h { get; set; }
  
        
        /// <summary>
        /// Gets or Sets OpenInterest
        /// </summary>
        [DataMember(Name="openInterest", EmitDefaultValue=false)]
        public double? OpenInterest { get; set; }
  
        
        /// <summary>
        /// Gets or Sets OpenValue
        /// </summary>
        [DataMember(Name="openValue", EmitDefaultValue=false)]
        public double? OpenValue { get; set; }
  
        
  
        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class Stats {\n");
            sb.Append("  RootSymbol: ").Append(RootSymbol).Append("\n");
            sb.Append("  Currency: ").Append(Currency).Append("\n");
            sb.Append("  Volume24h: ").Append(Volume24h).Append("\n");
            sb.Append("  Turnover24h: ").Append(Turnover24h).Append("\n");
            sb.Append("  OpenInterest: ").Append(OpenInterest).Append("\n");
            sb.Append("  OpenValue: ").Append(OpenValue).Append("\n");
            
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
            return this.Equals(obj as Stats);
        }

        /// <summary>
        /// Returns true if Stats instances are equal
        /// </summary>
        /// <param name="obj">Instance of Stats to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Stats other)
        {
            // credit: http://stackoverflow.com/a/10454552/677735
            if (other == null)
                return false;

            return 
                (
                    this.RootSymbol == other.RootSymbol ||
                    this.RootSymbol != null &&
                    this.RootSymbol.Equals(other.RootSymbol)
                ) && 
                (
                    this.Currency == other.Currency ||
                    this.Currency != null &&
                    this.Currency.Equals(other.Currency)
                ) && 
                (
                    this.Volume24h == other.Volume24h ||
                    this.Volume24h != null &&
                    this.Volume24h.Equals(other.Volume24h)
                ) && 
                (
                    this.Turnover24h == other.Turnover24h ||
                    this.Turnover24h != null &&
                    this.Turnover24h.Equals(other.Turnover24h)
                ) && 
                (
                    this.OpenInterest == other.OpenInterest ||
                    this.OpenInterest != null &&
                    this.OpenInterest.Equals(other.OpenInterest)
                ) && 
                (
                    this.OpenValue == other.OpenValue ||
                    this.OpenValue != null &&
                    this.OpenValue.Equals(other.OpenValue)
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
                
                if (this.RootSymbol != null)
                    hash = hash * 57 + this.RootSymbol.GetHashCode();
                
                if (this.Currency != null)
                    hash = hash * 57 + this.Currency.GetHashCode();
                
                if (this.Volume24h != null)
                    hash = hash * 57 + this.Volume24h.GetHashCode();
                
                if (this.Turnover24h != null)
                    hash = hash * 57 + this.Turnover24h.GetHashCode();
                
                if (this.OpenInterest != null)
                    hash = hash * 57 + this.OpenInterest.GetHashCode();
                
                if (this.OpenValue != null)
                    hash = hash * 57 + this.OpenValue.GetHashCode();
                
                return hash;
            }
        }

    }
}
