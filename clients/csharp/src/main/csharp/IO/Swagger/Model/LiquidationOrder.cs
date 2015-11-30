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
    public class LiquidationOrder : IEquatable<LiquidationOrder>
    {
        
        /// <summary>
        /// Gets or Sets Symbol
        /// </summary>
        [DataMember(Name="symbol", EmitDefaultValue=false)]
        public string Symbol { get; set; }
  
        
        /// <summary>
        /// Gets or Sets Side
        /// </summary>
        [DataMember(Name="side", EmitDefaultValue=false)]
        public string Side { get; set; }
  
        
        /// <summary>
        /// Gets or Sets Qty
        /// </summary>
        [DataMember(Name="qty", EmitDefaultValue=false)]
        public double? Qty { get; set; }
  
        
        /// <summary>
        /// Gets or Sets Price
        /// </summary>
        [DataMember(Name="price", EmitDefaultValue=false)]
        public double? Price { get; set; }
  
        
  
        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class LiquidationOrder {\n");
            sb.Append("  Symbol: ").Append(Symbol).Append("\n");
            sb.Append("  Side: ").Append(Side).Append("\n");
            sb.Append("  Qty: ").Append(Qty).Append("\n");
            sb.Append("  Price: ").Append(Price).Append("\n");
            
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
            return this.Equals(obj as LiquidationOrder);
        }

        /// <summary>
        /// Returns true if LiquidationOrder instances are equal
        /// </summary>
        /// <param name="obj">Instance of LiquidationOrder to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(LiquidationOrder other)
        {
            // credit: http://stackoverflow.com/a/10454552/677735
            if (other == null)
                return false;

            return 
                (
                    this.Symbol == other.Symbol ||
                    this.Symbol != null &&
                    this.Symbol.Equals(other.Symbol)
                ) && 
                (
                    this.Side == other.Side ||
                    this.Side != null &&
                    this.Side.Equals(other.Side)
                ) && 
                (
                    this.Qty == other.Qty ||
                    this.Qty != null &&
                    this.Qty.Equals(other.Qty)
                ) && 
                (
                    this.Price == other.Price ||
                    this.Price != null &&
                    this.Price.Equals(other.Price)
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
                
                if (this.Symbol != null)
                    hash = hash * 57 + this.Symbol.GetHashCode();
                
                if (this.Side != null)
                    hash = hash * 57 + this.Side.GetHashCode();
                
                if (this.Qty != null)
                    hash = hash * 57 + this.Qty.GetHashCode();
                
                if (this.Price != null)
                    hash = hash * 57 + this.Price.GetHashCode();
                
                return hash;
            }
        }

    }
}
