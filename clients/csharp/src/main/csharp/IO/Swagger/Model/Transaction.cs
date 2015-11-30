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
    public class Transaction : IEquatable<Transaction>
    {
        
        /// <summary>
        /// Gets or Sets TransactID
        /// </summary>
        [DataMember(Name="transactID", EmitDefaultValue=false)]
        public string TransactID { get; set; }
  
        
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
        /// Gets or Sets TransactType
        /// </summary>
        [DataMember(Name="transactType", EmitDefaultValue=false)]
        public string TransactType { get; set; }
  
        
        /// <summary>
        /// Gets or Sets Amount
        /// </summary>
        [DataMember(Name="amount", EmitDefaultValue=false)]
        public double? Amount { get; set; }
  
        
        /// <summary>
        /// Gets or Sets Fee
        /// </summary>
        [DataMember(Name="fee", EmitDefaultValue=false)]
        public double? Fee { get; set; }
  
        
        /// <summary>
        /// Gets or Sets TransactStatus
        /// </summary>
        [DataMember(Name="transactStatus", EmitDefaultValue=false)]
        public string TransactStatus { get; set; }
  
        
        /// <summary>
        /// Gets or Sets Address
        /// </summary>
        [DataMember(Name="address", EmitDefaultValue=false)]
        public string Address { get; set; }
  
        
        /// <summary>
        /// Gets or Sets Tx
        /// </summary>
        [DataMember(Name="tx", EmitDefaultValue=false)]
        public string Tx { get; set; }
  
        
        /// <summary>
        /// Gets or Sets Text
        /// </summary>
        [DataMember(Name="text", EmitDefaultValue=false)]
        public string Text { get; set; }
  
        
        /// <summary>
        /// Gets or Sets TransactTime
        /// </summary>
        [DataMember(Name="transactTime", EmitDefaultValue=false)]
        public DateTime? TransactTime { get; set; }
  
        
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
            sb.Append("class Transaction {\n");
            sb.Append("  TransactID: ").Append(TransactID).Append("\n");
            sb.Append("  Account: ").Append(Account).Append("\n");
            sb.Append("  Currency: ").Append(Currency).Append("\n");
            sb.Append("  TransactType: ").Append(TransactType).Append("\n");
            sb.Append("  Amount: ").Append(Amount).Append("\n");
            sb.Append("  Fee: ").Append(Fee).Append("\n");
            sb.Append("  TransactStatus: ").Append(TransactStatus).Append("\n");
            sb.Append("  Address: ").Append(Address).Append("\n");
            sb.Append("  Tx: ").Append(Tx).Append("\n");
            sb.Append("  Text: ").Append(Text).Append("\n");
            sb.Append("  TransactTime: ").Append(TransactTime).Append("\n");
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
            return this.Equals(obj as Transaction);
        }

        /// <summary>
        /// Returns true if Transaction instances are equal
        /// </summary>
        /// <param name="obj">Instance of Transaction to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Transaction other)
        {
            // credit: http://stackoverflow.com/a/10454552/677735
            if (other == null)
                return false;

            return 
                (
                    this.TransactID == other.TransactID ||
                    this.TransactID != null &&
                    this.TransactID.Equals(other.TransactID)
                ) && 
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
                    this.TransactType == other.TransactType ||
                    this.TransactType != null &&
                    this.TransactType.Equals(other.TransactType)
                ) && 
                (
                    this.Amount == other.Amount ||
                    this.Amount != null &&
                    this.Amount.Equals(other.Amount)
                ) && 
                (
                    this.Fee == other.Fee ||
                    this.Fee != null &&
                    this.Fee.Equals(other.Fee)
                ) && 
                (
                    this.TransactStatus == other.TransactStatus ||
                    this.TransactStatus != null &&
                    this.TransactStatus.Equals(other.TransactStatus)
                ) && 
                (
                    this.Address == other.Address ||
                    this.Address != null &&
                    this.Address.Equals(other.Address)
                ) && 
                (
                    this.Tx == other.Tx ||
                    this.Tx != null &&
                    this.Tx.Equals(other.Tx)
                ) && 
                (
                    this.Text == other.Text ||
                    this.Text != null &&
                    this.Text.Equals(other.Text)
                ) && 
                (
                    this.TransactTime == other.TransactTime ||
                    this.TransactTime != null &&
                    this.TransactTime.Equals(other.TransactTime)
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
                
                if (this.TransactID != null)
                    hash = hash * 57 + this.TransactID.GetHashCode();
                
                if (this.Account != null)
                    hash = hash * 57 + this.Account.GetHashCode();
                
                if (this.Currency != null)
                    hash = hash * 57 + this.Currency.GetHashCode();
                
                if (this.TransactType != null)
                    hash = hash * 57 + this.TransactType.GetHashCode();
                
                if (this.Amount != null)
                    hash = hash * 57 + this.Amount.GetHashCode();
                
                if (this.Fee != null)
                    hash = hash * 57 + this.Fee.GetHashCode();
                
                if (this.TransactStatus != null)
                    hash = hash * 57 + this.TransactStatus.GetHashCode();
                
                if (this.Address != null)
                    hash = hash * 57 + this.Address.GetHashCode();
                
                if (this.Tx != null)
                    hash = hash * 57 + this.Tx.GetHashCode();
                
                if (this.Text != null)
                    hash = hash * 57 + this.Text.GetHashCode();
                
                if (this.TransactTime != null)
                    hash = hash * 57 + this.TransactTime.GetHashCode();
                
                if (this.Timestamp != null)
                    hash = hash * 57 + this.Timestamp.GetHashCode();
                
                return hash;
            }
        }

    }
}
