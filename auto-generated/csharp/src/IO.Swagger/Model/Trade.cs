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
    /// Individual &amp; Bucketed Trades
    /// </summary>
    [DataContract]
    public partial class Trade :  IEquatable<Trade>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="Trade" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected Trade() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="Trade" /> class.
        /// </summary>
        /// <param name="timestamp">timestamp (required).</param>
        /// <param name="symbol">symbol (required).</param>
        /// <param name="side">side.</param>
        /// <param name="size">size.</param>
        /// <param name="price">price.</param>
        /// <param name="tickDirection">tickDirection.</param>
        /// <param name="trdMatchID">trdMatchID.</param>
        /// <param name="grossValue">grossValue.</param>
        /// <param name="homeNotional">homeNotional.</param>
        /// <param name="foreignNotional">foreignNotional.</param>
        /// <param name="trdType">trdType.</param>
        public Trade(DateTime? timestamp = default(DateTime?), string symbol = default(string), string side = default(string), long? size = default(long?), double? price = default(double?), string tickDirection = default(string), string trdMatchID = default(string), long? grossValue = default(long?), double? homeNotional = default(double?), double? foreignNotional = default(double?), string trdType = default(string))
        {
            // to ensure "timestamp" is required (not null)
            if (timestamp == null)
            {
                throw new InvalidDataException("timestamp is a required property for Trade and cannot be null");
            }
            else
            {
                this.Timestamp = timestamp;
            }
            // to ensure "symbol" is required (not null)
            if (symbol == null)
            {
                throw new InvalidDataException("symbol is a required property for Trade and cannot be null");
            }
            else
            {
                this.Symbol = symbol;
            }
            this.Side = side;
            this.Size = size;
            this.Price = price;
            this.TickDirection = tickDirection;
            this.TrdMatchID = trdMatchID;
            this.GrossValue = grossValue;
            this.HomeNotional = homeNotional;
            this.ForeignNotional = foreignNotional;
            this.TrdType = trdType;
        }
        
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
        public long? Size { get; set; }

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
        public long? GrossValue { get; set; }

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
        /// Gets or Sets TrdType
        /// </summary>
        [DataMember(Name="trdType", EmitDefaultValue=false)]
        public string TrdType { get; set; }

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
            sb.Append("  TrdType: ").Append(TrdType).Append("\n");
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
            return this.Equals(input as Trade);
        }

        /// <summary>
        /// Returns true if Trade instances are equal
        /// </summary>
        /// <param name="input">Instance of Trade to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Trade input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Timestamp == input.Timestamp ||
                    (this.Timestamp != null &&
                    this.Timestamp.Equals(input.Timestamp))
                ) && 
                (
                    this.Symbol == input.Symbol ||
                    (this.Symbol != null &&
                    this.Symbol.Equals(input.Symbol))
                ) && 
                (
                    this.Side == input.Side ||
                    (this.Side != null &&
                    this.Side.Equals(input.Side))
                ) && 
                (
                    this.Size == input.Size ||
                    (this.Size != null &&
                    this.Size.Equals(input.Size))
                ) && 
                (
                    this.Price == input.Price ||
                    (this.Price != null &&
                    this.Price.Equals(input.Price))
                ) && 
                (
                    this.TickDirection == input.TickDirection ||
                    (this.TickDirection != null &&
                    this.TickDirection.Equals(input.TickDirection))
                ) && 
                (
                    this.TrdMatchID == input.TrdMatchID ||
                    (this.TrdMatchID != null &&
                    this.TrdMatchID.Equals(input.TrdMatchID))
                ) && 
                (
                    this.GrossValue == input.GrossValue ||
                    (this.GrossValue != null &&
                    this.GrossValue.Equals(input.GrossValue))
                ) && 
                (
                    this.HomeNotional == input.HomeNotional ||
                    (this.HomeNotional != null &&
                    this.HomeNotional.Equals(input.HomeNotional))
                ) && 
                (
                    this.ForeignNotional == input.ForeignNotional ||
                    (this.ForeignNotional != null &&
                    this.ForeignNotional.Equals(input.ForeignNotional))
                ) && 
                (
                    this.TrdType == input.TrdType ||
                    (this.TrdType != null &&
                    this.TrdType.Equals(input.TrdType))
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
                if (this.Timestamp != null)
                    hashCode = hashCode * 59 + this.Timestamp.GetHashCode();
                if (this.Symbol != null)
                    hashCode = hashCode * 59 + this.Symbol.GetHashCode();
                if (this.Side != null)
                    hashCode = hashCode * 59 + this.Side.GetHashCode();
                if (this.Size != null)
                    hashCode = hashCode * 59 + this.Size.GetHashCode();
                if (this.Price != null)
                    hashCode = hashCode * 59 + this.Price.GetHashCode();
                if (this.TickDirection != null)
                    hashCode = hashCode * 59 + this.TickDirection.GetHashCode();
                if (this.TrdMatchID != null)
                    hashCode = hashCode * 59 + this.TrdMatchID.GetHashCode();
                if (this.GrossValue != null)
                    hashCode = hashCode * 59 + this.GrossValue.GetHashCode();
                if (this.HomeNotional != null)
                    hashCode = hashCode * 59 + this.HomeNotional.GetHashCode();
                if (this.ForeignNotional != null)
                    hashCode = hashCode * 59 + this.ForeignNotional.GetHashCode();
                if (this.TrdType != null)
                    hashCode = hashCode * 59 + this.TrdType.GetHashCode();
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
