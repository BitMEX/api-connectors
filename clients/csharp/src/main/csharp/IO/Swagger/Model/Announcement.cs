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
    public class Announcement : IEquatable<Announcement>
    {
        
        /// <summary>
        /// Gets or Sets Id
        /// </summary>
        [DataMember(Name="id", EmitDefaultValue=false)]
        public double? Id { get; set; }
  
        
        /// <summary>
        /// Gets or Sets Link
        /// </summary>
        [DataMember(Name="link", EmitDefaultValue=false)]
        public string Link { get; set; }
  
        
        /// <summary>
        /// Gets or Sets Title
        /// </summary>
        [DataMember(Name="title", EmitDefaultValue=false)]
        public string Title { get; set; }
  
        
        /// <summary>
        /// Gets or Sets Content
        /// </summary>
        [DataMember(Name="content", EmitDefaultValue=false)]
        public string Content { get; set; }
  
        
        /// <summary>
        /// Gets or Sets Date
        /// </summary>
        [DataMember(Name="date", EmitDefaultValue=false)]
        public DateTime? Date { get; set; }
  
        
  
        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class Announcement {\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Link: ").Append(Link).Append("\n");
            sb.Append("  Title: ").Append(Title).Append("\n");
            sb.Append("  Content: ").Append(Content).Append("\n");
            sb.Append("  Date: ").Append(Date).Append("\n");
            
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
            return this.Equals(obj as Announcement);
        }

        /// <summary>
        /// Returns true if Announcement instances are equal
        /// </summary>
        /// <param name="obj">Instance of Announcement to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Announcement other)
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
                    this.Link == other.Link ||
                    this.Link != null &&
                    this.Link.Equals(other.Link)
                ) && 
                (
                    this.Title == other.Title ||
                    this.Title != null &&
                    this.Title.Equals(other.Title)
                ) && 
                (
                    this.Content == other.Content ||
                    this.Content != null &&
                    this.Content.Equals(other.Content)
                ) && 
                (
                    this.Date == other.Date ||
                    this.Date != null &&
                    this.Date.Equals(other.Date)
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
                
                if (this.Link != null)
                    hash = hash * 57 + this.Link.GetHashCode();
                
                if (this.Title != null)
                    hash = hash * 57 + this.Title.GetHashCode();
                
                if (this.Content != null)
                    hash = hash * 57 + this.Content.GetHashCode();
                
                if (this.Date != null)
                    hash = hash * 57 + this.Date.GetHashCode();
                
                return hash;
            }
        }

    }
}
