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
    public class Chat : IEquatable<Chat>
    {
        
        /// <summary>
        /// Gets or Sets Id
        /// </summary>
        [DataMember(Name="id", EmitDefaultValue=false)]
        public double? Id { get; set; }
  
        
        /// <summary>
        /// Gets or Sets Date
        /// </summary>
        [DataMember(Name="date", EmitDefaultValue=false)]
        public DateTime? Date { get; set; }
  
        
        /// <summary>
        /// Gets or Sets User
        /// </summary>
        [DataMember(Name="user", EmitDefaultValue=false)]
        public string User { get; set; }
  
        
        /// <summary>
        /// Gets or Sets Message
        /// </summary>
        [DataMember(Name="message", EmitDefaultValue=false)]
        public string Message { get; set; }
  
        
        /// <summary>
        /// Gets or Sets Html
        /// </summary>
        [DataMember(Name="html", EmitDefaultValue=false)]
        public string Html { get; set; }
  
        
        /// <summary>
        /// Gets or Sets FromBot
        /// </summary>
        [DataMember(Name="fromBot", EmitDefaultValue=false)]
        public bool? FromBot { get; set; }
  
        
  
        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class Chat {\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Date: ").Append(Date).Append("\n");
            sb.Append("  User: ").Append(User).Append("\n");
            sb.Append("  Message: ").Append(Message).Append("\n");
            sb.Append("  Html: ").Append(Html).Append("\n");
            sb.Append("  FromBot: ").Append(FromBot).Append("\n");
            
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
            return this.Equals(obj as Chat);
        }

        /// <summary>
        /// Returns true if Chat instances are equal
        /// </summary>
        /// <param name="obj">Instance of Chat to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Chat other)
        {
            // credit: http://stackoverflow.com/a/10454552/677735
            if (other == null)
                return false;

            return 
                (
                    this.Id == other.Id ||
                    this.Id != null &&
                    this.Id.Equals(other.Id)
                ) && 
                (
                    this.Date == other.Date ||
                    this.Date != null &&
                    this.Date.Equals(other.Date)
                ) && 
                (
                    this.User == other.User ||
                    this.User != null &&
                    this.User.Equals(other.User)
                ) && 
                (
                    this.Message == other.Message ||
                    this.Message != null &&
                    this.Message.Equals(other.Message)
                ) && 
                (
                    this.Html == other.Html ||
                    this.Html != null &&
                    this.Html.Equals(other.Html)
                ) && 
                (
                    this.FromBot == other.FromBot ||
                    this.FromBot != null &&
                    this.FromBot.Equals(other.FromBot)
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
                
                if (this.Id != null)
                    hash = hash * 57 + this.Id.GetHashCode();
                
                if (this.Date != null)
                    hash = hash * 57 + this.Date.GetHashCode();
                
                if (this.User != null)
                    hash = hash * 57 + this.User.GetHashCode();
                
                if (this.Message != null)
                    hash = hash * 57 + this.Message.GetHashCode();
                
                if (this.Html != null)
                    hash = hash * 57 + this.Html.GetHashCode();
                
                if (this.FromBot != null)
                    hash = hash * 57 + this.FromBot.GetHashCode();
                
                return hash;
            }
        }

    }
}
