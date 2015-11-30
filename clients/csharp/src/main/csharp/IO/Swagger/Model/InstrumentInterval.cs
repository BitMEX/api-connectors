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
    public class InstrumentInterval : IEquatable<InstrumentInterval>
    {
        
        /// <summary>
        /// Gets or Sets Intervals
        /// </summary>
        [DataMember(Name="intervals", EmitDefaultValue=false)]
        public List<string> Intervals { get; set; }
  
        
        /// <summary>
        /// Gets or Sets Symbols
        /// </summary>
        [DataMember(Name="symbols", EmitDefaultValue=false)]
        public List<string> Symbols { get; set; }
  
        
  
        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class InstrumentInterval {\n");
            sb.Append("  Intervals: ").Append(Intervals).Append("\n");
            sb.Append("  Symbols: ").Append(Symbols).Append("\n");
            
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
            return this.Equals(obj as InstrumentInterval);
        }

        /// <summary>
        /// Returns true if InstrumentInterval instances are equal
        /// </summary>
        /// <param name="obj">Instance of InstrumentInterval to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InstrumentInterval other)
        {
            // credit: http://stackoverflow.com/a/10454552/677735
            if (other == null)
                return false;

            return 
                (
                    this.Intervals == other.Intervals ||
                    this.Intervals != null &&
                    this.Intervals.SequenceEqual(other.Intervals)
                ) && 
                (
                    this.Symbols == other.Symbols ||
                    this.Symbols != null &&
                    this.Symbols.SequenceEqual(other.Symbols)
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
                
                if (this.Intervals != null)
                    hash = hash * 57 + this.Intervals.GetHashCode();
                
                if (this.Symbols != null)
                    hash = hash * 57 + this.Symbols.GetHashCode();
                
                return hash;
            }
        }

    }
}
