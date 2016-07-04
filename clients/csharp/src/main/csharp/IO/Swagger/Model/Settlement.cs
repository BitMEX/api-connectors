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
    public class Settlement : IEquatable<Settlement>
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
        /// Gets or Sets SettlementType
        /// </summary>
        [DataMember(Name="settlementType", EmitDefaultValue=false)]
        public string SettlementType { get; set; }
  
        
        /// <summary>
        /// Gets or Sets SettledPrice
        /// </summary>
        [DataMember(Name="settledPrice", EmitDefaultValue=false)]
        public double? SettledPrice { get; set; }
  
        
        /// <summary>
        /// Gets or Sets Bankrupt
        /// </summary>
        [DataMember(Name="bankrupt", EmitDefaultValue=false)]
        public double? Bankrupt { get; set; }
  
        
        /// <summary>
        /// Gets or Sets TaxBase
        /// </summary>
        [DataMember(Name="taxBase", EmitDefaultValue=false)]
        public double? TaxBase { get; set; }
  
        
        /// <summary>
        /// Gets or Sets TaxRate
        /// </summary>
        [DataMember(Name="taxRate", EmitDefaultValue=false)]
        public double? TaxRate { get; set; }
  
        
  
        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class Settlement {\n");
            sb.Append("  Timestamp: ").Append(Timestamp).Append("\n");
            sb.Append("  Symbol: ").Append(Symbol).Append("\n");
            sb.Append("  SettlementType: ").Append(SettlementType).Append("\n");
            sb.Append("  SettledPrice: ").Append(SettledPrice).Append("\n");
            sb.Append("  Bankrupt: ").Append(Bankrupt).Append("\n");
            sb.Append("  TaxBase: ").Append(TaxBase).Append("\n");
            sb.Append("  TaxRate: ").Append(TaxRate).Append("\n");
            
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
            return this.Equals(obj as Settlement);
        }

        /// <summary>
        /// Returns true if Settlement instances are equal
        /// </summary>
        /// <param name="obj">Instance of Settlement to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Settlement other)
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
                    this.SettlementType == other.SettlementType ||
                    this.SettlementType != null &&
                    this.SettlementType.Equals(other.SettlementType)
                ) && 
                (
                    this.SettledPrice == other.SettledPrice ||
                    this.SettledPrice != null &&
                    this.SettledPrice.Equals(other.SettledPrice)
                ) && 
                (
                    this.Bankrupt == other.Bankrupt ||
                    this.Bankrupt != null &&
                    this.Bankrupt.Equals(other.Bankrupt)
                ) && 
                (
                    this.TaxBase == other.TaxBase ||
                    this.TaxBase != null &&
                    this.TaxBase.Equals(other.TaxBase)
                ) && 
                (
                    this.TaxRate == other.TaxRate ||
                    this.TaxRate != null &&
                    this.TaxRate.Equals(other.TaxRate)
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
                
                if (this.SettlementType != null)
                    hash = hash * 57 + this.SettlementType.GetHashCode();
                
                if (this.SettledPrice != null)
                    hash = hash * 57 + this.SettledPrice.GetHashCode();
                
                if (this.Bankrupt != null)
                    hash = hash * 57 + this.Bankrupt.GetHashCode();
                
                if (this.TaxBase != null)
                    hash = hash * 57 + this.TaxBase.GetHashCode();
                
                if (this.TaxRate != null)
                    hash = hash * 57 + this.TaxRate.GetHashCode();
                
                return hash;
            }
        }

    }
}
