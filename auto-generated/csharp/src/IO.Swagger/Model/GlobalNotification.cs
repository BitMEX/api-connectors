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
    /// Account Notifications
    /// </summary>
    [DataContract]
    public partial class GlobalNotification :  IEquatable<GlobalNotification>, IValidatableObject
    {
        /// <summary>
        /// Defines Type
        /// </summary>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum TypeEnum
        {
            
            /// <summary>
            /// Enum Success for value: success
            /// </summary>
            [EnumMember(Value = "success")]
            Success = 1,
            
            /// <summary>
            /// Enum Error for value: error
            /// </summary>
            [EnumMember(Value = "error")]
            Error = 2,
            
            /// <summary>
            /// Enum Info for value: info
            /// </summary>
            [EnumMember(Value = "info")]
            Info = 3
        }

        /// <summary>
        /// Gets or Sets Type
        /// </summary>
        [DataMember(Name="type", EmitDefaultValue=false)]
        public TypeEnum? Type { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="GlobalNotification" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected GlobalNotification() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="GlobalNotification" /> class.
        /// </summary>
        /// <param name="id">id.</param>
        /// <param name="date">date (required).</param>
        /// <param name="title">title (required).</param>
        /// <param name="body">body (required).</param>
        /// <param name="ttl">ttl (required).</param>
        /// <param name="type">type.</param>
        /// <param name="closable">closable (default to true).</param>
        /// <param name="persist">persist (default to true).</param>
        /// <param name="waitForVisibility">waitForVisibility (default to true).</param>
        /// <param name="sound">sound.</param>
        public GlobalNotification(int? id = default(int?), DateTime? date = default(DateTime?), string title = default(string), string body = default(string), int? ttl = default(int?), TypeEnum? type = default(TypeEnum?), bool? closable = true, bool? persist = true, bool? waitForVisibility = true, string sound = default(string))
        {
            // to ensure "date" is required (not null)
            if (date == null)
            {
                throw new InvalidDataException("date is a required property for GlobalNotification and cannot be null");
            }
            else
            {
                this.Date = date;
            }
            // to ensure "title" is required (not null)
            if (title == null)
            {
                throw new InvalidDataException("title is a required property for GlobalNotification and cannot be null");
            }
            else
            {
                this.Title = title;
            }
            // to ensure "body" is required (not null)
            if (body == null)
            {
                throw new InvalidDataException("body is a required property for GlobalNotification and cannot be null");
            }
            else
            {
                this.Body = body;
            }
            // to ensure "ttl" is required (not null)
            if (ttl == null)
            {
                throw new InvalidDataException("ttl is a required property for GlobalNotification and cannot be null");
            }
            else
            {
                this.Ttl = ttl;
            }
            this.Id = id;
            this.Type = type;
            // use default value if no "closable" provided
            if (closable == null)
            {
                this.Closable = true;
            }
            else
            {
                this.Closable = closable;
            }
            // use default value if no "persist" provided
            if (persist == null)
            {
                this.Persist = true;
            }
            else
            {
                this.Persist = persist;
            }
            // use default value if no "waitForVisibility" provided
            if (waitForVisibility == null)
            {
                this.WaitForVisibility = true;
            }
            else
            {
                this.WaitForVisibility = waitForVisibility;
            }
            this.Sound = sound;
        }
        
        /// <summary>
        /// Gets or Sets Id
        /// </summary>
        [DataMember(Name="id", EmitDefaultValue=false)]
        public int? Id { get; set; }

        /// <summary>
        /// Gets or Sets Date
        /// </summary>
        [DataMember(Name="date", EmitDefaultValue=false)]
        public DateTime? Date { get; set; }

        /// <summary>
        /// Gets or Sets Title
        /// </summary>
        [DataMember(Name="title", EmitDefaultValue=false)]
        public string Title { get; set; }

        /// <summary>
        /// Gets or Sets Body
        /// </summary>
        [DataMember(Name="body", EmitDefaultValue=false)]
        public string Body { get; set; }

        /// <summary>
        /// Gets or Sets Ttl
        /// </summary>
        [DataMember(Name="ttl", EmitDefaultValue=false)]
        public int? Ttl { get; set; }


        /// <summary>
        /// Gets or Sets Closable
        /// </summary>
        [DataMember(Name="closable", EmitDefaultValue=false)]
        public bool? Closable { get; set; }

        /// <summary>
        /// Gets or Sets Persist
        /// </summary>
        [DataMember(Name="persist", EmitDefaultValue=false)]
        public bool? Persist { get; set; }

        /// <summary>
        /// Gets or Sets WaitForVisibility
        /// </summary>
        [DataMember(Name="waitForVisibility", EmitDefaultValue=false)]
        public bool? WaitForVisibility { get; set; }

        /// <summary>
        /// Gets or Sets Sound
        /// </summary>
        [DataMember(Name="sound", EmitDefaultValue=false)]
        public string Sound { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class GlobalNotification {\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Date: ").Append(Date).Append("\n");
            sb.Append("  Title: ").Append(Title).Append("\n");
            sb.Append("  Body: ").Append(Body).Append("\n");
            sb.Append("  Ttl: ").Append(Ttl).Append("\n");
            sb.Append("  Type: ").Append(Type).Append("\n");
            sb.Append("  Closable: ").Append(Closable).Append("\n");
            sb.Append("  Persist: ").Append(Persist).Append("\n");
            sb.Append("  WaitForVisibility: ").Append(WaitForVisibility).Append("\n");
            sb.Append("  Sound: ").Append(Sound).Append("\n");
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
            return this.Equals(input as GlobalNotification);
        }

        /// <summary>
        /// Returns true if GlobalNotification instances are equal
        /// </summary>
        /// <param name="input">Instance of GlobalNotification to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(GlobalNotification input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Id == input.Id ||
                    (this.Id != null &&
                    this.Id.Equals(input.Id))
                ) && 
                (
                    this.Date == input.Date ||
                    (this.Date != null &&
                    this.Date.Equals(input.Date))
                ) && 
                (
                    this.Title == input.Title ||
                    (this.Title != null &&
                    this.Title.Equals(input.Title))
                ) && 
                (
                    this.Body == input.Body ||
                    (this.Body != null &&
                    this.Body.Equals(input.Body))
                ) && 
                (
                    this.Ttl == input.Ttl ||
                    (this.Ttl != null &&
                    this.Ttl.Equals(input.Ttl))
                ) && 
                (
                    this.Type == input.Type ||
                    (this.Type != null &&
                    this.Type.Equals(input.Type))
                ) && 
                (
                    this.Closable == input.Closable ||
                    (this.Closable != null &&
                    this.Closable.Equals(input.Closable))
                ) && 
                (
                    this.Persist == input.Persist ||
                    (this.Persist != null &&
                    this.Persist.Equals(input.Persist))
                ) && 
                (
                    this.WaitForVisibility == input.WaitForVisibility ||
                    (this.WaitForVisibility != null &&
                    this.WaitForVisibility.Equals(input.WaitForVisibility))
                ) && 
                (
                    this.Sound == input.Sound ||
                    (this.Sound != null &&
                    this.Sound.Equals(input.Sound))
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
                if (this.Id != null)
                    hashCode = hashCode * 59 + this.Id.GetHashCode();
                if (this.Date != null)
                    hashCode = hashCode * 59 + this.Date.GetHashCode();
                if (this.Title != null)
                    hashCode = hashCode * 59 + this.Title.GetHashCode();
                if (this.Body != null)
                    hashCode = hashCode * 59 + this.Body.GetHashCode();
                if (this.Ttl != null)
                    hashCode = hashCode * 59 + this.Ttl.GetHashCode();
                if (this.Type != null)
                    hashCode = hashCode * 59 + this.Type.GetHashCode();
                if (this.Closable != null)
                    hashCode = hashCode * 59 + this.Closable.GetHashCode();
                if (this.Persist != null)
                    hashCode = hashCode * 59 + this.Persist.GetHashCode();
                if (this.WaitForVisibility != null)
                    hashCode = hashCode * 59 + this.WaitForVisibility.GetHashCode();
                if (this.Sound != null)
                    hashCode = hashCode * 59 + this.Sound.GetHashCode();
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
