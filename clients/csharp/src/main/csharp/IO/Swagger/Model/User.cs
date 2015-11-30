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
    public class User : IEquatable<User>
    {
        
        /// <summary>
        /// Gets or Sets Id
        /// </summary>
        [DataMember(Name="id", EmitDefaultValue=false)]
        public double? Id { get; set; }
  
        
        /// <summary>
        /// Gets or Sets Firstname
        /// </summary>
        [DataMember(Name="firstname", EmitDefaultValue=false)]
        public string Firstname { get; set; }
  
        
        /// <summary>
        /// Gets or Sets Lastname
        /// </summary>
        [DataMember(Name="lastname", EmitDefaultValue=false)]
        public string Lastname { get; set; }
  
        
        /// <summary>
        /// Gets or Sets Status
        /// </summary>
        [DataMember(Name="status", EmitDefaultValue=false)]
        public string Status { get; set; }
  
        
        /// <summary>
        /// Gets or Sets Username
        /// </summary>
        [DataMember(Name="username", EmitDefaultValue=false)]
        public string Username { get; set; }
  
        
        /// <summary>
        /// Gets or Sets Email
        /// </summary>
        [DataMember(Name="email", EmitDefaultValue=false)]
        public string Email { get; set; }
  
        
        /// <summary>
        /// Gets or Sets Phone
        /// </summary>
        [DataMember(Name="phone", EmitDefaultValue=false)]
        public string Phone { get; set; }
  
        
        /// <summary>
        /// Gets or Sets CountryCode
        /// </summary>
        [DataMember(Name="countryCode", EmitDefaultValue=false)]
        public double? CountryCode { get; set; }
  
        
        /// <summary>
        /// Gets or Sets Created
        /// </summary>
        [DataMember(Name="created", EmitDefaultValue=false)]
        public DateTime? Created { get; set; }
  
        
        /// <summary>
        /// Gets or Sets LastUpdated
        /// </summary>
        [DataMember(Name="lastUpdated", EmitDefaultValue=false)]
        public DateTime? LastUpdated { get; set; }
  
        
        /// <summary>
        /// Gets or Sets Preferences
        /// </summary>
        [DataMember(Name="preferences", EmitDefaultValue=false)]
        public UserPreferences Preferences { get; set; }
  
        
        /// <summary>
        /// Gets or Sets Role
        /// </summary>
        [DataMember(Name="role", EmitDefaultValue=false)]
        public string Role { get; set; }
  
        
        /// <summary>
        /// Gets or Sets TFAEnabled
        /// </summary>
        [DataMember(Name="TFAEnabled", EmitDefaultValue=false)]
        public string TFAEnabled { get; set; }
  
        
        /// <summary>
        /// Gets or Sets AffiliateID
        /// </summary>
        [DataMember(Name="affiliateID", EmitDefaultValue=false)]
        public string AffiliateID { get; set; }
  
        
        /// <summary>
        /// Gets or Sets PgpPubKey
        /// </summary>
        [DataMember(Name="pgpPubKey", EmitDefaultValue=false)]
        public string PgpPubKey { get; set; }
  
        
        /// <summary>
        /// Gets or Sets Country
        /// </summary>
        [DataMember(Name="country", EmitDefaultValue=false)]
        public string Country { get; set; }
  
        
        /// <summary>
        /// Gets or Sets Disabled
        /// </summary>
        [DataMember(Name="disabled", EmitDefaultValue=false)]
        public bool? Disabled { get; set; }
  
        
  
        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class User {\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Firstname: ").Append(Firstname).Append("\n");
            sb.Append("  Lastname: ").Append(Lastname).Append("\n");
            sb.Append("  Status: ").Append(Status).Append("\n");
            sb.Append("  Username: ").Append(Username).Append("\n");
            sb.Append("  Email: ").Append(Email).Append("\n");
            sb.Append("  Phone: ").Append(Phone).Append("\n");
            sb.Append("  CountryCode: ").Append(CountryCode).Append("\n");
            sb.Append("  Created: ").Append(Created).Append("\n");
            sb.Append("  LastUpdated: ").Append(LastUpdated).Append("\n");
            sb.Append("  Preferences: ").Append(Preferences).Append("\n");
            sb.Append("  Role: ").Append(Role).Append("\n");
            sb.Append("  TFAEnabled: ").Append(TFAEnabled).Append("\n");
            sb.Append("  AffiliateID: ").Append(AffiliateID).Append("\n");
            sb.Append("  PgpPubKey: ").Append(PgpPubKey).Append("\n");
            sb.Append("  Country: ").Append(Country).Append("\n");
            sb.Append("  Disabled: ").Append(Disabled).Append("\n");
            
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
            return this.Equals(obj as User);
        }

        /// <summary>
        /// Returns true if User instances are equal
        /// </summary>
        /// <param name="obj">Instance of User to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(User other)
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
                    this.Firstname == other.Firstname ||
                    this.Firstname != null &&
                    this.Firstname.Equals(other.Firstname)
                ) && 
                (
                    this.Lastname == other.Lastname ||
                    this.Lastname != null &&
                    this.Lastname.Equals(other.Lastname)
                ) && 
                (
                    this.Status == other.Status ||
                    this.Status != null &&
                    this.Status.Equals(other.Status)
                ) && 
                (
                    this.Username == other.Username ||
                    this.Username != null &&
                    this.Username.Equals(other.Username)
                ) && 
                (
                    this.Email == other.Email ||
                    this.Email != null &&
                    this.Email.Equals(other.Email)
                ) && 
                (
                    this.Phone == other.Phone ||
                    this.Phone != null &&
                    this.Phone.Equals(other.Phone)
                ) && 
                (
                    this.CountryCode == other.CountryCode ||
                    this.CountryCode != null &&
                    this.CountryCode.Equals(other.CountryCode)
                ) && 
                (
                    this.Created == other.Created ||
                    this.Created != null &&
                    this.Created.Equals(other.Created)
                ) && 
                (
                    this.LastUpdated == other.LastUpdated ||
                    this.LastUpdated != null &&
                    this.LastUpdated.Equals(other.LastUpdated)
                ) && 
                (
                    this.Preferences == other.Preferences ||
                    this.Preferences != null &&
                    this.Preferences.Equals(other.Preferences)
                ) && 
                (
                    this.Role == other.Role ||
                    this.Role != null &&
                    this.Role.Equals(other.Role)
                ) && 
                (
                    this.TFAEnabled == other.TFAEnabled ||
                    this.TFAEnabled != null &&
                    this.TFAEnabled.Equals(other.TFAEnabled)
                ) && 
                (
                    this.AffiliateID == other.AffiliateID ||
                    this.AffiliateID != null &&
                    this.AffiliateID.Equals(other.AffiliateID)
                ) && 
                (
                    this.PgpPubKey == other.PgpPubKey ||
                    this.PgpPubKey != null &&
                    this.PgpPubKey.Equals(other.PgpPubKey)
                ) && 
                (
                    this.Country == other.Country ||
                    this.Country != null &&
                    this.Country.Equals(other.Country)
                ) && 
                (
                    this.Disabled == other.Disabled ||
                    this.Disabled != null &&
                    this.Disabled.Equals(other.Disabled)
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
                
                if (this.Firstname != null)
                    hash = hash * 57 + this.Firstname.GetHashCode();
                
                if (this.Lastname != null)
                    hash = hash * 57 + this.Lastname.GetHashCode();
                
                if (this.Status != null)
                    hash = hash * 57 + this.Status.GetHashCode();
                
                if (this.Username != null)
                    hash = hash * 57 + this.Username.GetHashCode();
                
                if (this.Email != null)
                    hash = hash * 57 + this.Email.GetHashCode();
                
                if (this.Phone != null)
                    hash = hash * 57 + this.Phone.GetHashCode();
                
                if (this.CountryCode != null)
                    hash = hash * 57 + this.CountryCode.GetHashCode();
                
                if (this.Created != null)
                    hash = hash * 57 + this.Created.GetHashCode();
                
                if (this.LastUpdated != null)
                    hash = hash * 57 + this.LastUpdated.GetHashCode();
                
                if (this.Preferences != null)
                    hash = hash * 57 + this.Preferences.GetHashCode();
                
                if (this.Role != null)
                    hash = hash * 57 + this.Role.GetHashCode();
                
                if (this.TFAEnabled != null)
                    hash = hash * 57 + this.TFAEnabled.GetHashCode();
                
                if (this.AffiliateID != null)
                    hash = hash * 57 + this.AffiliateID.GetHashCode();
                
                if (this.PgpPubKey != null)
                    hash = hash * 57 + this.PgpPubKey.GetHashCode();
                
                if (this.Country != null)
                    hash = hash * 57 + this.Country.GetHashCode();
                
                if (this.Disabled != null)
                    hash = hash * 57 + this.Disabled.GetHashCode();
                
                return hash;
            }
        }

    }
}
