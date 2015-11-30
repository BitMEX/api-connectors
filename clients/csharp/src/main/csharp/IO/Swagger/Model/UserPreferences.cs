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
    public class UserPreferences : IEquatable<UserPreferences>
    {
        
        /// <summary>
        /// Gets or Sets AnnouncementsLastSeen
        /// </summary>
        [DataMember(Name="announcementsLastSeen", EmitDefaultValue=false)]
        public DateTime? AnnouncementsLastSeen { get; set; }
  
        
        /// <summary>
        /// Gets or Sets ColorTheme
        /// </summary>
        [DataMember(Name="colorTheme", EmitDefaultValue=false)]
        public string ColorTheme { get; set; }
  
        
        /// <summary>
        /// Gets or Sets Currency
        /// </summary>
        [DataMember(Name="currency", EmitDefaultValue=false)]
        public string Currency { get; set; }
  
        
        /// <summary>
        /// Gets or Sets Debug
        /// </summary>
        [DataMember(Name="debug", EmitDefaultValue=false)]
        public bool? Debug { get; set; }
  
        
        /// <summary>
        /// Gets or Sets DisableEmails
        /// </summary>
        [DataMember(Name="disableEmails", EmitDefaultValue=false)]
        public List<string> DisableEmails { get; set; }
  
        
        /// <summary>
        /// Gets or Sets HideConfirmDialogs
        /// </summary>
        [DataMember(Name="hideConfirmDialogs", EmitDefaultValue=false)]
        public List<string> HideConfirmDialogs { get; set; }
  
        
        /// <summary>
        /// Gets or Sets HideNotifications
        /// </summary>
        [DataMember(Name="hideNotifications", EmitDefaultValue=false)]
        public List<string> HideNotifications { get; set; }
  
        
        /// <summary>
        /// Gets or Sets HidePhoneConfirm
        /// </summary>
        [DataMember(Name="hidePhoneConfirm", EmitDefaultValue=false)]
        public bool? HidePhoneConfirm { get; set; }
  
        
        /// <summary>
        /// Gets or Sets MsgsSeen
        /// </summary>
        [DataMember(Name="msgsSeen", EmitDefaultValue=false)]
        public List<string> MsgsSeen { get; set; }
  
        
        /// <summary>
        /// Gets or Sets OrderBookBinning
        /// </summary>
        [DataMember(Name="orderBookBinning", EmitDefaultValue=false)]
        public double? OrderBookBinning { get; set; }
  
        
        /// <summary>
        /// Gets or Sets OrderControlsPlusMinus
        /// </summary>
        [DataMember(Name="orderControlsPlusMinus", EmitDefaultValue=false)]
        public bool? OrderControlsPlusMinus { get; set; }
  
        
        /// <summary>
        /// Gets or Sets Sounds
        /// </summary>
        [DataMember(Name="sounds", EmitDefaultValue=false)]
        public List<string> Sounds { get; set; }
  
        
        /// <summary>
        /// Gets or Sets StrictIPCheck
        /// </summary>
        [DataMember(Name="strictIPCheck", EmitDefaultValue=false)]
        public bool? StrictIPCheck { get; set; }
  
        
        /// <summary>
        /// Gets or Sets TickerGroup
        /// </summary>
        [DataMember(Name="tickerGroup", EmitDefaultValue=false)]
        public string TickerGroup { get; set; }
  
        
        /// <summary>
        /// Gets or Sets TickerPinned
        /// </summary>
        [DataMember(Name="tickerPinned", EmitDefaultValue=false)]
        public bool? TickerPinned { get; set; }
  
        
        /// <summary>
        /// Gets or Sets TradeLayout
        /// </summary>
        [DataMember(Name="tradeLayout", EmitDefaultValue=false)]
        public string TradeLayout { get; set; }
  
        
  
        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class UserPreferences {\n");
            sb.Append("  AnnouncementsLastSeen: ").Append(AnnouncementsLastSeen).Append("\n");
            sb.Append("  ColorTheme: ").Append(ColorTheme).Append("\n");
            sb.Append("  Currency: ").Append(Currency).Append("\n");
            sb.Append("  Debug: ").Append(Debug).Append("\n");
            sb.Append("  DisableEmails: ").Append(DisableEmails).Append("\n");
            sb.Append("  HideConfirmDialogs: ").Append(HideConfirmDialogs).Append("\n");
            sb.Append("  HideNotifications: ").Append(HideNotifications).Append("\n");
            sb.Append("  HidePhoneConfirm: ").Append(HidePhoneConfirm).Append("\n");
            sb.Append("  MsgsSeen: ").Append(MsgsSeen).Append("\n");
            sb.Append("  OrderBookBinning: ").Append(OrderBookBinning).Append("\n");
            sb.Append("  OrderControlsPlusMinus: ").Append(OrderControlsPlusMinus).Append("\n");
            sb.Append("  Sounds: ").Append(Sounds).Append("\n");
            sb.Append("  StrictIPCheck: ").Append(StrictIPCheck).Append("\n");
            sb.Append("  TickerGroup: ").Append(TickerGroup).Append("\n");
            sb.Append("  TickerPinned: ").Append(TickerPinned).Append("\n");
            sb.Append("  TradeLayout: ").Append(TradeLayout).Append("\n");
            
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
            return this.Equals(obj as UserPreferences);
        }

        /// <summary>
        /// Returns true if UserPreferences instances are equal
        /// </summary>
        /// <param name="obj">Instance of UserPreferences to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(UserPreferences other)
        {
            // credit: http://stackoverflow.com/a/10454552/677735
            if (other == null)
                return false;

            return 
                (
                    this.AnnouncementsLastSeen == other.AnnouncementsLastSeen ||
                    this.AnnouncementsLastSeen != null &&
                    this.AnnouncementsLastSeen.Equals(other.AnnouncementsLastSeen)
                ) && 
                (
                    this.ColorTheme == other.ColorTheme ||
                    this.ColorTheme != null &&
                    this.ColorTheme.Equals(other.ColorTheme)
                ) && 
                (
                    this.Currency == other.Currency ||
                    this.Currency != null &&
                    this.Currency.Equals(other.Currency)
                ) && 
                (
                    this.Debug == other.Debug ||
                    this.Debug != null &&
                    this.Debug.Equals(other.Debug)
                ) && 
                (
                    this.DisableEmails == other.DisableEmails ||
                    this.DisableEmails != null &&
                    this.DisableEmails.SequenceEqual(other.DisableEmails)
                ) && 
                (
                    this.HideConfirmDialogs == other.HideConfirmDialogs ||
                    this.HideConfirmDialogs != null &&
                    this.HideConfirmDialogs.SequenceEqual(other.HideConfirmDialogs)
                ) && 
                (
                    this.HideNotifications == other.HideNotifications ||
                    this.HideNotifications != null &&
                    this.HideNotifications.SequenceEqual(other.HideNotifications)
                ) && 
                (
                    this.HidePhoneConfirm == other.HidePhoneConfirm ||
                    this.HidePhoneConfirm != null &&
                    this.HidePhoneConfirm.Equals(other.HidePhoneConfirm)
                ) && 
                (
                    this.MsgsSeen == other.MsgsSeen ||
                    this.MsgsSeen != null &&
                    this.MsgsSeen.SequenceEqual(other.MsgsSeen)
                ) && 
                (
                    this.OrderBookBinning == other.OrderBookBinning ||
                    this.OrderBookBinning != null &&
                    this.OrderBookBinning.Equals(other.OrderBookBinning)
                ) && 
                (
                    this.OrderControlsPlusMinus == other.OrderControlsPlusMinus ||
                    this.OrderControlsPlusMinus != null &&
                    this.OrderControlsPlusMinus.Equals(other.OrderControlsPlusMinus)
                ) && 
                (
                    this.Sounds == other.Sounds ||
                    this.Sounds != null &&
                    this.Sounds.SequenceEqual(other.Sounds)
                ) && 
                (
                    this.StrictIPCheck == other.StrictIPCheck ||
                    this.StrictIPCheck != null &&
                    this.StrictIPCheck.Equals(other.StrictIPCheck)
                ) && 
                (
                    this.TickerGroup == other.TickerGroup ||
                    this.TickerGroup != null &&
                    this.TickerGroup.Equals(other.TickerGroup)
                ) && 
                (
                    this.TickerPinned == other.TickerPinned ||
                    this.TickerPinned != null &&
                    this.TickerPinned.Equals(other.TickerPinned)
                ) && 
                (
                    this.TradeLayout == other.TradeLayout ||
                    this.TradeLayout != null &&
                    this.TradeLayout.Equals(other.TradeLayout)
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
                
                if (this.AnnouncementsLastSeen != null)
                    hash = hash * 57 + this.AnnouncementsLastSeen.GetHashCode();
                
                if (this.ColorTheme != null)
                    hash = hash * 57 + this.ColorTheme.GetHashCode();
                
                if (this.Currency != null)
                    hash = hash * 57 + this.Currency.GetHashCode();
                
                if (this.Debug != null)
                    hash = hash * 57 + this.Debug.GetHashCode();
                
                if (this.DisableEmails != null)
                    hash = hash * 57 + this.DisableEmails.GetHashCode();
                
                if (this.HideConfirmDialogs != null)
                    hash = hash * 57 + this.HideConfirmDialogs.GetHashCode();
                
                if (this.HideNotifications != null)
                    hash = hash * 57 + this.HideNotifications.GetHashCode();
                
                if (this.HidePhoneConfirm != null)
                    hash = hash * 57 + this.HidePhoneConfirm.GetHashCode();
                
                if (this.MsgsSeen != null)
                    hash = hash * 57 + this.MsgsSeen.GetHashCode();
                
                if (this.OrderBookBinning != null)
                    hash = hash * 57 + this.OrderBookBinning.GetHashCode();
                
                if (this.OrderControlsPlusMinus != null)
                    hash = hash * 57 + this.OrderControlsPlusMinus.GetHashCode();
                
                if (this.Sounds != null)
                    hash = hash * 57 + this.Sounds.GetHashCode();
                
                if (this.StrictIPCheck != null)
                    hash = hash * 57 + this.StrictIPCheck.GetHashCode();
                
                if (this.TickerGroup != null)
                    hash = hash * 57 + this.TickerGroup.GetHashCode();
                
                if (this.TickerPinned != null)
                    hash = hash * 57 + this.TickerPinned.GetHashCode();
                
                if (this.TradeLayout != null)
                    hash = hash * 57 + this.TradeLayout.GetHashCode();
                
                return hash;
            }
        }

    }
}
