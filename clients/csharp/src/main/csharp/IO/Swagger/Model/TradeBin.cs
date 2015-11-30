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
    public class TradeBin : IEquatable<TradeBin>
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
        /// Gets or Sets Open
        /// </summary>
        [DataMember(Name="open", EmitDefaultValue=false)]
        public double? Open { get; set; }
  
        
        /// <summary>
        /// Gets or Sets High
        /// </summary>
        [DataMember(Name="high", EmitDefaultValue=false)]
        public double? High { get; set; }
  
        
        /// <summary>
        /// Gets or Sets Low
        /// </summary>
        [DataMember(Name="low", EmitDefaultValue=false)]
        public double? Low { get; set; }
  
        
        /// <summary>
        /// Gets or Sets Close
        /// </summary>
        [DataMember(Name="close", EmitDefaultValue=false)]
        public double? Close { get; set; }
  
        
        /// <summary>
        /// Gets or Sets Trades
        /// </summary>
        [DataMember(Name="trades", EmitDefaultValue=false)]
        public double? Trades { get; set; }
  
        
        /// <summary>
        /// Gets or Sets Volume
        /// </summary>
        [DataMember(Name="volume", EmitDefaultValue=false)]
        public double? Volume { get; set; }
  
        
        /// <summary>
        /// Gets or Sets Vwap
        /// </summary>
        [DataMember(Name="vwap", EmitDefaultValue=false)]
        public double? Vwap { get; set; }
  
        
        /// <summary>
        /// Gets or Sets LastSize
        /// </summary>
        [DataMember(Name="lastSize", EmitDefaultValue=false)]
        public double? LastSize { get; set; }
  
        
        /// <summary>
        /// Gets or Sets Turnover
        /// </summary>
        [DataMember(Name="turnover", EmitDefaultValue=false)]
        public double? Turnover { get; set; }
  
        
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
            sb.Append("class TradeBin {\n");
            sb.Append("  Timestamp: ").Append(Timestamp).Append("\n");
            sb.Append("  Symbol: ").Append(Symbol).Append("\n");
            sb.Append("  Open: ").Append(Open).Append("\n");
            sb.Append("  High: ").Append(High).Append("\n");
            sb.Append("  Low: ").Append(Low).Append("\n");
            sb.Append("  Close: ").Append(Close).Append("\n");
            sb.Append("  Trades: ").Append(Trades).Append("\n");
            sb.Append("  Volume: ").Append(Volume).Append("\n");
            sb.Append("  Vwap: ").Append(Vwap).Append("\n");
            sb.Append("  LastSize: ").Append(LastSize).Append("\n");
            sb.Append("  Turnover: ").Append(Turnover).Append("\n");
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
            return this.Equals(obj as TradeBin);
        }

        /// <summary>
        /// Returns true if TradeBin instances are equal
        /// </summary>
        /// <param name="obj">Instance of TradeBin to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(TradeBin other)
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
                    this.Open == other.Open ||
                    this.Open != null &&
                    this.Open.Equals(other.Open)
                ) && 
                (
                    this.High == other.High ||
                    this.High != null &&
                    this.High.Equals(other.High)
                ) && 
                (
                    this.Low == other.Low ||
                    this.Low != null &&
                    this.Low.Equals(other.Low)
                ) && 
                (
                    this.Close == other.Close ||
                    this.Close != null &&
                    this.Close.Equals(other.Close)
                ) && 
                (
                    this.Trades == other.Trades ||
                    this.Trades != null &&
                    this.Trades.Equals(other.Trades)
                ) && 
                (
                    this.Volume == other.Volume ||
                    this.Volume != null &&
                    this.Volume.Equals(other.Volume)
                ) && 
                (
                    this.Vwap == other.Vwap ||
                    this.Vwap != null &&
                    this.Vwap.Equals(other.Vwap)
                ) && 
                (
                    this.LastSize == other.LastSize ||
                    this.LastSize != null &&
                    this.LastSize.Equals(other.LastSize)
                ) && 
                (
                    this.Turnover == other.Turnover ||
                    this.Turnover != null &&
                    this.Turnover.Equals(other.Turnover)
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
                
                if (this.Open != null)
                    hash = hash * 57 + this.Open.GetHashCode();
                
                if (this.High != null)
                    hash = hash * 57 + this.High.GetHashCode();
                
                if (this.Low != null)
                    hash = hash * 57 + this.Low.GetHashCode();
                
                if (this.Close != null)
                    hash = hash * 57 + this.Close.GetHashCode();
                
                if (this.Trades != null)
                    hash = hash * 57 + this.Trades.GetHashCode();
                
                if (this.Volume != null)
                    hash = hash * 57 + this.Volume.GetHashCode();
                
                if (this.Vwap != null)
                    hash = hash * 57 + this.Vwap.GetHashCode();
                
                if (this.LastSize != null)
                    hash = hash * 57 + this.LastSize.GetHashCode();
                
                if (this.Turnover != null)
                    hash = hash * 57 + this.Turnover.GetHashCode();
                
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
