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
    public class StatsHistory : IEquatable<StatsHistory>
    {
        
        /// <summary>
        /// Gets or Sets Date
        /// </summary>
        [DataMember(Name="date", EmitDefaultValue=false)]
        public DateTime? Date { get; set; }
  
        
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
        /// Gets or Sets Volume
        /// </summary>
        [DataMember(Name="volume", EmitDefaultValue=false)]
        public double? Volume { get; set; }
  
        
        /// <summary>
        /// Gets or Sets Turnover
        /// </summary>
        [DataMember(Name="turnover", EmitDefaultValue=false)]
        public double? Turnover { get; set; }
  
        
  
        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class StatsHistory {\n");
            sb.Append("  Date: ").Append(Date).Append("\n");
            sb.Append("  RootSymbol: ").Append(RootSymbol).Append("\n");
            sb.Append("  Currency: ").Append(Currency).Append("\n");
            sb.Append("  Volume: ").Append(Volume).Append("\n");
            sb.Append("  Turnover: ").Append(Turnover).Append("\n");
            
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
            return this.Equals(obj as StatsHistory);
        }

        /// <summary>
        /// Returns true if StatsHistory instances are equal
        /// </summary>
        /// <param name="obj">Instance of StatsHistory to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(StatsHistory other)
        {
            // credit: http://stackoverflow.com/a/10454552/677735
            if (other == null)
                return false;

            return 
                (
                    this.Date == other.Date ||
                    this.Date != null &&
                    this.Date.Equals(other.Date)
                ) && 
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
                    this.Volume == other.Volume ||
                    this.Volume != null &&
                    this.Volume.Equals(other.Volume)
                ) && 
                (
                    this.Turnover == other.Turnover ||
                    this.Turnover != null &&
                    this.Turnover.Equals(other.Turnover)
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
                
                if (this.Date != null)
                    hash = hash * 57 + this.Date.GetHashCode();
                
                if (this.RootSymbol != null)
                    hash = hash * 57 + this.RootSymbol.GetHashCode();
                
                if (this.Currency != null)
                    hash = hash * 57 + this.Currency.GetHashCode();
                
                if (this.Volume != null)
                    hash = hash * 57 + this.Volume.GetHashCode();
                
                if (this.Turnover != null)
                    hash = hash * 57 + this.Turnover.GetHashCode();
                
                return hash;
            }
        }

    }
}
