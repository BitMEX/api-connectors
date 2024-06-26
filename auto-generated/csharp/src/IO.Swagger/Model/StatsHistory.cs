/* 
 * BitMEX API
 *
 * ## REST API for the BitMEX Trading Platform  _If you are building automated tools, please subscribe to the_ _[BitMEX API RSS Feed](https://blog.bitmex.com/api_announcement/feed/) for changes. The feed will be updated_ _regularly and is the most reliable way to get downtime and update announcements._  [View Changelog](/app/apiChangelog)  -  #### Getting Started  Base URI: [https://www.bitmex.com/api/v1](/api/v1)  ##### Fetching Data  All REST endpoints are documented below. You can try out any query right from this interface.  Most table queries accept `count`, `start`, and `reverse` params. Set `reverse=true` to get rows newest-first.  Additional documentation regarding filters, timestamps, and authentication is available in [the main API documentation](/app/restAPI).  _All_ table data is available via the [Websocket](/app/wsAPI). We highly recommend using the socket if you want to have the quickest possible data without being subject to ratelimits.  ##### Return Types  By default, all data is returned as JSON. Send `?_format=csv` to get CSV data or `?_format=xml` to get XML data.  ##### Trade Data Queries  _This is only a small subset of what is available, to get you started._  Fill in the parameters and click the `Try it out!` button to try any of these queries.  - [Pricing Data](#!/Quote/Quote_get)  - [Trade Data](#!/Trade/Trade_get)  - [OrderBook Data](#!/OrderBook/OrderBook_getL2)  - [Settlement Data](#!/Settlement/Settlement_get)  - [Exchange Statistics](#!/Stats/Stats_history)  Every function of the BitMEX.com platform is exposed here and documented. Many more functions are available.  ##### Swagger Specification  [⇩ Download Swagger JSON](swagger.json)  -  ## All API Endpoints  Click to expand a section. 
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
    /// StatsHistory
    /// </summary>
    [DataContract]
    public partial class StatsHistory :  IEquatable<StatsHistory>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="StatsHistory" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected StatsHistory() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="StatsHistory" /> class.
        /// </summary>
        /// <param name="date">date (required).</param>
        /// <param name="rootSymbol">rootSymbol (required).</param>
        /// <param name="currency">currency.</param>
        /// <param name="volume">volume.</param>
        /// <param name="turnover">turnover.</param>
        public StatsHistory(DateTime? date = default(DateTime?), string rootSymbol = default(string), string currency = default(string), long? volume = default(long?), long? turnover = default(long?))
        {
            // to ensure "date" is required (not null)
            if (date == null)
            {
                throw new InvalidDataException("date is a required property for StatsHistory and cannot be null");
            }
            else
            {
                this.Date = date;
            }
            // to ensure "rootSymbol" is required (not null)
            if (rootSymbol == null)
            {
                throw new InvalidDataException("rootSymbol is a required property for StatsHistory and cannot be null");
            }
            else
            {
                this.RootSymbol = rootSymbol;
            }
            this.Currency = currency;
            this.Volume = volume;
            this.Turnover = turnover;
        }
        
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
        public long? Volume { get; set; }

        /// <summary>
        /// Gets or Sets Turnover
        /// </summary>
        [DataMember(Name="turnover", EmitDefaultValue=false)]
        public long? Turnover { get; set; }

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
            return this.Equals(input as StatsHistory);
        }

        /// <summary>
        /// Returns true if StatsHistory instances are equal
        /// </summary>
        /// <param name="input">Instance of StatsHistory to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(StatsHistory input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Date == input.Date ||
                    (this.Date != null &&
                    this.Date.Equals(input.Date))
                ) && 
                (
                    this.RootSymbol == input.RootSymbol ||
                    (this.RootSymbol != null &&
                    this.RootSymbol.Equals(input.RootSymbol))
                ) && 
                (
                    this.Currency == input.Currency ||
                    (this.Currency != null &&
                    this.Currency.Equals(input.Currency))
                ) && 
                (
                    this.Volume == input.Volume ||
                    (this.Volume != null &&
                    this.Volume.Equals(input.Volume))
                ) && 
                (
                    this.Turnover == input.Turnover ||
                    (this.Turnover != null &&
                    this.Turnover.Equals(input.Turnover))
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
                if (this.Date != null)
                    hashCode = hashCode * 59 + this.Date.GetHashCode();
                if (this.RootSymbol != null)
                    hashCode = hashCode * 59 + this.RootSymbol.GetHashCode();
                if (this.Currency != null)
                    hashCode = hashCode * 59 + this.Currency.GetHashCode();
                if (this.Volume != null)
                    hashCode = hashCode * 59 + this.Volume.GetHashCode();
                if (this.Turnover != null)
                    hashCode = hashCode * 59 + this.Turnover.GetHashCode();
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
