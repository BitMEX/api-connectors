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
    public class Trade : IEquatable<Trade>
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
        /// Gets or Sets Side
        /// </summary>
        [DataMember(Name="side", EmitDefaultValue=false)]
        public string Side { get; set; }
  
        
        /// <summary>
        /// Gets or Sets Size
        /// </summary>
        [DataMember(Name="size", EmitDefaultValue=false)]
        public double? Size { get; set; }
  
        
        /// <summary>
        /// Gets or Sets Price
        /// </summary>
        [DataMember(Name="price", EmitDefaultValue=false)]
        public double? Price { get; set; }
  
        
        /// <summary>
        /// Gets or Sets TickDirection
        /// </summary>
        [DataMember(Name="tickDirection", EmitDefaultValue=false)]
        public string TickDirection { get; set; }
  
        
        /// <summary>
        /// Gets or Sets TrdMatchID
        /// </summary>
        [DataMember(Name="trdMatchID", EmitDefaultValue=false)]
        public string TrdMatchID { get; set; }
  
        
        /// <summary>
        /// Gets or Sets GrossValue
        /// </summary>
        [DataMember(Name="grossValue", EmitDefaultValue=false)]
        public double? GrossValue { get; set; }
  
        
        /// <summary>
        /// Gets or Sets HomeNotional
        /// </summary>
        [DataMember(Name="homeNotional", EmitDefaultValue=false)]
        public double? HomeNotional { get; set; }
  
        
        /// <summary>
        /// Gets or Sets ForeignNotional
        /// </summary>
        [DataMember(Name="foreignNotional", EmitDefaultValue=false)]
        public double? ForeignNotional { get; set; }
  
        
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
            sb.Append("class Trade {\n");
            sb.Append("  Timestamp: ").Append(Timestamp).Append("\n");
            sb.Append("  Symbol: ").Append(Symbol).Append("\n");
            sb.Append("  Side: ").Append(Side).Append("\n");
            sb.Append("  Size: ").Append(Size).Append("\n");
            sb.Append("  Price: ").Append(Price).Append("\n");
            sb.Append("  TickDirection: ").Append(TickDirection).Append("\n");
            sb.Append("  TrdMatchID: ").Append(TrdMatchID).Append("\n");
            sb.Append("  GrossValue: ").Append(GrossValue).Append("\n");
            sb.Append("  HomeNotional: ").Append(HomeNotional).Append("\n");
            sb.Append("  ForeignNotional: ").Append(ForeignNotional).Append("\n");
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
            return this.Equals(obj as Trade);
        }

        /// <summary>
        /// Returns true if Trade instances are equal
        /// </summary>
        /// <param name="obj">Instance of Trade to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Trade other)
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
                    this.Side == other.Side ||
                    this.Side != null &&
                    this.Side.Equals(other.Side)
                ) && 
                (
                    this.Size == other.Size ||
                    this.Size != null &&
                    this.Size.Equals(other.Size)
                ) && 
                (
                    this.Price == other.Price ||
                    this.Price != null &&
                    this.Price.Equals(other.Price)
                ) && 
                (
                    this.TickDirection == other.TickDirection ||
                    this.TickDirection != null &&
                    this.TickDirection.Equals(other.TickDirection)
                ) && 
                (
                    this.TrdMatchID == other.TrdMatchID ||
                    this.TrdMatchID != null &&
                    this.TrdMatchID.Equals(other.TrdMatchID)
                ) && 
                (
                    this.GrossValue == other.GrossValue ||
                    this.GrossValue != null &&
                    this.GrossValue.Equals(other.GrossValue)
                ) && 
                (
                    this.HomeNotional == other.HomeNotional ||
                    this.HomeNotional != null &&
                    this.HomeNotional.Equals(other.HomeNotional)
                ) && 
                (
                    this.ForeignNotional == other.ForeignNotional ||
                    this.ForeignNotional != null &&
                    this.ForeignNotional.Equals(other.ForeignNotional)
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
                
                if (this.Side != null)
                    hash = hash * 57 + this.Side.GetHashCode();
                
                if (this.Size != null)
                    hash = hash * 57 + this.Size.GetHashCode();
                
                if (this.Price != null)
                    hash = hash * 57 + this.Price.GetHashCode();
                
                if (this.TickDirection != null)
                    hash = hash * 57 + this.TickDirection.GetHashCode();
                
                if (this.TrdMatchID != null)
                    hash = hash * 57 + this.TrdMatchID.GetHashCode();
                
                if (this.GrossValue != null)
                    hash = hash * 57 + this.GrossValue.GetHashCode();
                
                if (this.HomeNotional != null)
                    hash = hash * 57 + this.HomeNotional.GetHashCode();
                
                if (this.ForeignNotional != null)
                    hash = hash * 57 + this.ForeignNotional.GetHashCode();
                
                if (this.Id != null)
                    hash = hash * 57 + this.Id.GetHashCode();
                
                return hash;
            }
        }

    }
}
