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
    public class Quote : IEquatable<Quote>
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
        /// Gets or Sets BidSize
        /// </summary>
        [DataMember(Name="bidSize", EmitDefaultValue=false)]
        public double? BidSize { get; set; }
  
        
        /// <summary>
        /// Gets or Sets BidPrice
        /// </summary>
        [DataMember(Name="bidPrice", EmitDefaultValue=false)]
        public double? BidPrice { get; set; }
  
        
        /// <summary>
        /// Gets or Sets AskPrice
        /// </summary>
        [DataMember(Name="askPrice", EmitDefaultValue=false)]
        public double? AskPrice { get; set; }
  
        
        /// <summary>
        /// Gets or Sets AskSize
        /// </summary>
        [DataMember(Name="askSize", EmitDefaultValue=false)]
        public double? AskSize { get; set; }
  
        
        /// <summary>
        /// Gets or Sets Id
        /// </summary>
        [DataMember(Name="id", EmitDefaultValue=false)]
        public double? Id { get; set; }
  
        
  
        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class Quote {\n");
            sb.Append("  Timestamp: ").Append(Timestamp).Append("\n");
            sb.Append("  Symbol: ").Append(Symbol).Append("\n");
            sb.Append("  BidSize: ").Append(BidSize).Append("\n");
            sb.Append("  BidPrice: ").Append(BidPrice).Append("\n");
            sb.Append("  AskPrice: ").Append(AskPrice).Append("\n");
            sb.Append("  AskSize: ").Append(AskSize).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            
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
            return this.Equals(obj as Quote);
        }

        /// <summary>
        /// Returns true if Quote instances are equal
        /// </summary>
        /// <param name="obj">Instance of Quote to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Quote other)
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
                    this.BidSize == other.BidSize ||
                    this.BidSize != null &&
                    this.BidSize.Equals(other.BidSize)
                ) && 
                (
                    this.BidPrice == other.BidPrice ||
                    this.BidPrice != null &&
                    this.BidPrice.Equals(other.BidPrice)
                ) && 
                (
                    this.AskPrice == other.AskPrice ||
                    this.AskPrice != null &&
                    this.AskPrice.Equals(other.AskPrice)
                ) && 
                (
                    this.AskSize == other.AskSize ||
                    this.AskSize != null &&
                    this.AskSize.Equals(other.AskSize)
                ) && 
                (
                    this.Id == other.Id ||
                    this.Id != null &&
                    this.Id.Equals(other.Id)
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
                
                if (this.BidSize != null)
                    hash = hash * 57 + this.BidSize.GetHashCode();
                
                if (this.BidPrice != null)
                    hash = hash * 57 + this.BidPrice.GetHashCode();
                
                if (this.AskPrice != null)
                    hash = hash * 57 + this.AskPrice.GetHashCode();
                
                if (this.AskSize != null)
                    hash = hash * 57 + this.AskSize.GetHashCode();
                
                if (this.Id != null)
                    hash = hash * 57 + this.Id.GetHashCode();
                
                return hash;
            }
        }

    }
}
