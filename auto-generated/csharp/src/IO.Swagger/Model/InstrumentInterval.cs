/* 
 * BitMEX API
 *
 * ## REST API for the BitMEX Trading Platform  _If you are building automated tools, please subscribe to the_ _[BitMEX API RSS Feed](https://blog.bitmex.com/api_announcement/feed/) for changes. The feed will be updated_ _regularly and is the most reliable way to get downtime and update announcements._  [View Changelog](/app/apiChangelog)  - --  #### Getting Started  Base URI: [https://www.bitmex.com/api/v1](/api/v1)  ##### Fetching Data  All REST endpoints are documented below. You can try out any query right from this interface.  Most table queries accept `count`, `start`, and `reverse` params. Set `reverse=true` to get rows newest-first.  Additional documentation regarding filters, timestamps, and authentication is available in [the main API documentation](/app/restAPI).  _All_ table data is available via the [Websocket](/app/wsAPI). We highly recommend using the socket if you want to have the quickest possible data without being subject to ratelimits.  ##### Return Types  By default, all data is returned as JSON. Send `?_format=csv` to get CSV data or `?_format=xml` to get XML data.  ##### Trade Data Queries  _This is only a small subset of what is available, to get you started._  Fill in the parameters and click the `Try it out!` button to try any of these queries.  - [Pricing Data](#!/Quote/Quote_get)  - [Trade Data](#!/Trade/Trade_get)  - [OrderBook Data](#!/OrderBook/OrderBook_getL2)  - [Settlement Data](#!/Settlement/Settlement_get)  - [Exchange Statistics](#!/Stats/Stats_history)  Every function of the BitMEX.com platform is exposed here and documented. Many more functions are available.  ##### Swagger Specification  [⇩ Download Swagger JSON](swagger.json)  - --  ## All API Endpoints  Click to expand a section. 
 *
 * OpenAPI spec version: 1.2.0
 * Contact: support@bitmex.com
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 */

using System;
using System.Linq;
using System.IO;
using System.Text;
using System.Text.RegularExpressions;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Runtime.Serialization;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using System.ComponentModel.DataAnnotations;
using SwaggerDateConverter = IO.Swagger.Client.SwaggerDateConverter;

namespace IO.Swagger.Model
{
    /// <summary>
    /// InstrumentInterval
    /// </summary>
    [DataContract]
    public partial class InstrumentInterval :  IEquatable<InstrumentInterval>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="InstrumentInterval" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected InstrumentInterval() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="InstrumentInterval" /> class.
        /// </summary>
        /// <param name="intervals">intervals (required).</param>
        /// <param name="symbols">symbols (required).</param>
        public InstrumentInterval(List<string> intervals = default(List<string>), List<string> symbols = default(List<string>))
        {
            // to ensure "intervals" is required (not null)
            if (intervals == null)
            {
                throw new InvalidDataException("intervals is a required property for InstrumentInterval and cannot be null");
            }
            else
            {
                this.Intervals = intervals;
            }
            // to ensure "symbols" is required (not null)
            if (symbols == null)
            {
                throw new InvalidDataException("symbols is a required property for InstrumentInterval and cannot be null");
            }
            else
            {
                this.Symbols = symbols;
            }
        }
        
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
        public virtual string ToJson()
        {
            return JsonConvert.SerializeObject(this, Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as InstrumentInterval);
        }

        /// <summary>
        /// Returns true if InstrumentInterval instances are equal
        /// </summary>
        /// <param name="input">Instance of InstrumentInterval to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InstrumentInterval input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Intervals == input.Intervals ||
                    this.Intervals != null &&
                    this.Intervals.SequenceEqual(input.Intervals)
                ) && 
                (
                    this.Symbols == input.Symbols ||
                    this.Symbols != null &&
                    this.Symbols.SequenceEqual(input.Symbols)
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                int hashCode = 41;
                if (this.Intervals != null)
                    hashCode = hashCode * 59 + this.Intervals.GetHashCode();
                if (this.Symbols != null)
                    hashCode = hashCode * 59 + this.Symbols.GetHashCode();
                return hashCode;
            }
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}
