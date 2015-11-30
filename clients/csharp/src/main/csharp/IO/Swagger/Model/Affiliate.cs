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
    public class Affiliate : IEquatable<Affiliate>
    {
        
        /// <summary>
        /// Gets or Sets Account
        /// </summary>
        [DataMember(Name="account", EmitDefaultValue=false)]
        public double? Account { get; set; }
  
        
        /// <summary>
        /// Gets or Sets Currency
        /// </summary>
        [DataMember(Name="currency", EmitDefaultValue=false)]
        public string Currency { get; set; }
  
        
        /// <summary>
        /// Gets or Sets PrevPayout
        /// </summary>
        [DataMember(Name="prevPayout", EmitDefaultValue=false)]
        public double? PrevPayout { get; set; }
  
        
        /// <summary>
        /// Gets or Sets PrevTurnover
        /// </summary>
        [DataMember(Name="prevTurnover", EmitDefaultValue=false)]
        public double? PrevTurnover { get; set; }
  
        
        /// <summary>
        /// Gets or Sets PrevComm
        /// </summary>
        [DataMember(Name="prevComm", EmitDefaultValue=false)]
        public double? PrevComm { get; set; }
  
        
        /// <summary>
        /// Gets or Sets PrevTimestamp
        /// </summary>
        [DataMember(Name="prevTimestamp", EmitDefaultValue=false)]
        public DateTime? PrevTimestamp { get; set; }
  
        
        /// <summary>
        /// Gets or Sets ExecTurnover
        /// </summary>
        [DataMember(Name="execTurnover", EmitDefaultValue=false)]
        public double? ExecTurnover { get; set; }
  
        
        /// <summary>
        /// Gets or Sets ExecComm
        /// </summary>
        [DataMember(Name="execComm", EmitDefaultValue=false)]
        public double? ExecComm { get; set; }
  
        
        /// <summary>
        /// Gets or Sets TotalReferrals
        /// </summary>
        [DataMember(Name="totalReferrals", EmitDefaultValue=false)]
        public double? TotalReferrals { get; set; }
  
        
        /// <summary>
        /// Gets or Sets TotalTurnover
        /// </summary>
        [DataMember(Name="totalTurnover", EmitDefaultValue=false)]
        public double? TotalTurnover { get; set; }
  
        
        /// <summary>
        /// Gets or Sets TotalComm
        /// </summary>
        [DataMember(Name="totalComm", EmitDefaultValue=false)]
        public double? TotalComm { get; set; }
  
        
        /// <summary>
        /// Gets or Sets PayoutPcnt
        /// </summary>
        [DataMember(Name="payoutPcnt", EmitDefaultValue=false)]
        public double? PayoutPcnt { get; set; }
  
        
        /// <summary>
        /// Gets or Sets PendingPayout
        /// </summary>
        [DataMember(Name="pendingPayout", EmitDefaultValue=false)]
        public double? PendingPayout { get; set; }
  
        
        /// <summary>
        /// Gets or Sets Timestamp
        /// </summary>
        [DataMember(Name="timestamp", EmitDefaultValue=false)]
        public DateTime? Timestamp { get; set; }
  
        
  
        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class Affiliate {\n");
            sb.Append("  Account: ").Append(Account).Append("\n");
            sb.Append("  Currency: ").Append(Currency).Append("\n");
            sb.Append("  PrevPayout: ").Append(PrevPayout).Append("\n");
            sb.Append("  PrevTurnover: ").Append(PrevTurnover).Append("\n");
            sb.Append("  PrevComm: ").Append(PrevComm).Append("\n");
            sb.Append("  PrevTimestamp: ").Append(PrevTimestamp).Append("\n");
            sb.Append("  ExecTurnover: ").Append(ExecTurnover).Append("\n");
            sb.Append("  ExecComm: ").Append(ExecComm).Append("\n");
            sb.Append("  TotalReferrals: ").Append(TotalReferrals).Append("\n");
            sb.Append("  TotalTurnover: ").Append(TotalTurnover).Append("\n");
            sb.Append("  TotalComm: ").Append(TotalComm).Append("\n");
            sb.Append("  PayoutPcnt: ").Append(PayoutPcnt).Append("\n");
            sb.Append("  PendingPayout: ").Append(PendingPayout).Append("\n");
            sb.Append("  Timestamp: ").Append(Timestamp).Append("\n");
            
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
            return this.Equals(obj as Affiliate);
        }

        /// <summary>
        /// Returns true if Affiliate instances are equal
        /// </summary>
        /// <param name="obj">Instance of Affiliate to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Affiliate other)
        {
            // credit: http://stackoverflow.com/a/10454552/677735
            if (other == null)
                return false;

            return 
                (
                    this.Account == other.Account ||
                    this.Account != null &&
                    this.Account.Equals(other.Account)
                ) && 
                (
                    this.Currency == other.Currency ||
                    this.Currency != null &&
                    this.Currency.Equals(other.Currency)
                ) && 
                (
                    this.PrevPayout == other.PrevPayout ||
                    this.PrevPayout != null &&
                    this.PrevPayout.Equals(other.PrevPayout)
                ) && 
                (
                    this.PrevTurnover == other.PrevTurnover ||
                    this.PrevTurnover != null &&
                    this.PrevTurnover.Equals(other.PrevTurnover)
                ) && 
                (
                    this.PrevComm == other.PrevComm ||
                    this.PrevComm != null &&
                    this.PrevComm.Equals(other.PrevComm)
                ) && 
                (
                    this.PrevTimestamp == other.PrevTimestamp ||
                    this.PrevTimestamp != null &&
                    this.PrevTimestamp.Equals(other.PrevTimestamp)
                ) && 
                (
                    this.ExecTurnover == other.ExecTurnover ||
                    this.ExecTurnover != null &&
                    this.ExecTurnover.Equals(other.ExecTurnover)
                ) && 
                (
                    this.ExecComm == other.ExecComm ||
                    this.ExecComm != null &&
                    this.ExecComm.Equals(other.ExecComm)
                ) && 
                (
                    this.TotalReferrals == other.TotalReferrals ||
                    this.TotalReferrals != null &&
                    this.TotalReferrals.Equals(other.TotalReferrals)
                ) && 
                (
                    this.TotalTurnover == other.TotalTurnover ||
                    this.TotalTurnover != null &&
                    this.TotalTurnover.Equals(other.TotalTurnover)
                ) && 
                (
                    this.TotalComm == other.TotalComm ||
                    this.TotalComm != null &&
                    this.TotalComm.Equals(other.TotalComm)
                ) && 
                (
                    this.PayoutPcnt == other.PayoutPcnt ||
                    this.PayoutPcnt != null &&
                    this.PayoutPcnt.Equals(other.PayoutPcnt)
                ) && 
                (
                    this.PendingPayout == other.PendingPayout ||
                    this.PendingPayout != null &&
                    this.PendingPayout.Equals(other.PendingPayout)
                ) && 
                (
                    this.Timestamp == other.Timestamp ||
                    this.Timestamp != null &&
                    this.Timestamp.Equals(other.Timestamp)
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
                
                if (this.Account != null)
                    hash = hash * 57 + this.Account.GetHashCode();
                
                if (this.Currency != null)
                    hash = hash * 57 + this.Currency.GetHashCode();
                
                if (this.PrevPayout != null)
                    hash = hash * 57 + this.PrevPayout.GetHashCode();
                
                if (this.PrevTurnover != null)
                    hash = hash * 57 + this.PrevTurnover.GetHashCode();
                
                if (this.PrevComm != null)
                    hash = hash * 57 + this.PrevComm.GetHashCode();
                
                if (this.PrevTimestamp != null)
                    hash = hash * 57 + this.PrevTimestamp.GetHashCode();
                
                if (this.ExecTurnover != null)
                    hash = hash * 57 + this.ExecTurnover.GetHashCode();
                
                if (this.ExecComm != null)
                    hash = hash * 57 + this.ExecComm.GetHashCode();
                
                if (this.TotalReferrals != null)
                    hash = hash * 57 + this.TotalReferrals.GetHashCode();
                
                if (this.TotalTurnover != null)
                    hash = hash * 57 + this.TotalTurnover.GetHashCode();
                
                if (this.TotalComm != null)
                    hash = hash * 57 + this.TotalComm.GetHashCode();
                
                if (this.PayoutPcnt != null)
                    hash = hash * 57 + this.PayoutPcnt.GetHashCode();
                
                if (this.PendingPayout != null)
                    hash = hash * 57 + this.PendingPayout.GetHashCode();
                
                if (this.Timestamp != null)
                    hash = hash * 57 + this.Timestamp.GetHashCode();
                
                return hash;
            }
        }

    }
}
