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
    public class Margin : IEquatable<Margin>
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
        /// Gets or Sets RiskLimit
        /// </summary>
        [DataMember(Name="riskLimit", EmitDefaultValue=false)]
        public double? RiskLimit { get; set; }
  
        
        /// <summary>
        /// Gets or Sets PrevState
        /// </summary>
        [DataMember(Name="prevState", EmitDefaultValue=false)]
        public string PrevState { get; set; }
  
        
        /// <summary>
        /// Gets or Sets State
        /// </summary>
        [DataMember(Name="state", EmitDefaultValue=false)]
        public string State { get; set; }
  
        
        /// <summary>
        /// Gets or Sets Action
        /// </summary>
        [DataMember(Name="action", EmitDefaultValue=false)]
        public string Action { get; set; }
  
        
        /// <summary>
        /// Gets or Sets Amount
        /// </summary>
        [DataMember(Name="amount", EmitDefaultValue=false)]
        public double? Amount { get; set; }
  
        
        /// <summary>
        /// Gets or Sets PendingCredit
        /// </summary>
        [DataMember(Name="pendingCredit", EmitDefaultValue=false)]
        public double? PendingCredit { get; set; }
  
        
        /// <summary>
        /// Gets or Sets PendingDebit
        /// </summary>
        [DataMember(Name="pendingDebit", EmitDefaultValue=false)]
        public double? PendingDebit { get; set; }
  
        
        /// <summary>
        /// Gets or Sets ConfirmedDebit
        /// </summary>
        [DataMember(Name="confirmedDebit", EmitDefaultValue=false)]
        public double? ConfirmedDebit { get; set; }
  
        
        /// <summary>
        /// Gets or Sets PrevRealisedPnl
        /// </summary>
        [DataMember(Name="prevRealisedPnl", EmitDefaultValue=false)]
        public double? PrevRealisedPnl { get; set; }
  
        
        /// <summary>
        /// Gets or Sets PrevUnrealisedPnl
        /// </summary>
        [DataMember(Name="prevUnrealisedPnl", EmitDefaultValue=false)]
        public double? PrevUnrealisedPnl { get; set; }
  
        
        /// <summary>
        /// Gets or Sets GrossComm
        /// </summary>
        [DataMember(Name="grossComm", EmitDefaultValue=false)]
        public double? GrossComm { get; set; }
  
        
        /// <summary>
        /// Gets or Sets GrossOpenCost
        /// </summary>
        [DataMember(Name="grossOpenCost", EmitDefaultValue=false)]
        public double? GrossOpenCost { get; set; }
  
        
        /// <summary>
        /// Gets or Sets GrossOpenPremium
        /// </summary>
        [DataMember(Name="grossOpenPremium", EmitDefaultValue=false)]
        public double? GrossOpenPremium { get; set; }
  
        
        /// <summary>
        /// Gets or Sets GrossExecCost
        /// </summary>
        [DataMember(Name="grossExecCost", EmitDefaultValue=false)]
        public double? GrossExecCost { get; set; }
  
        
        /// <summary>
        /// Gets or Sets GrossMarkValue
        /// </summary>
        [DataMember(Name="grossMarkValue", EmitDefaultValue=false)]
        public double? GrossMarkValue { get; set; }
  
        
        /// <summary>
        /// Gets or Sets RiskValue
        /// </summary>
        [DataMember(Name="riskValue", EmitDefaultValue=false)]
        public double? RiskValue { get; set; }
  
        
        /// <summary>
        /// Gets or Sets TaxableMargin
        /// </summary>
        [DataMember(Name="taxableMargin", EmitDefaultValue=false)]
        public double? TaxableMargin { get; set; }
  
        
        /// <summary>
        /// Gets or Sets InitMargin
        /// </summary>
        [DataMember(Name="initMargin", EmitDefaultValue=false)]
        public double? InitMargin { get; set; }
  
        
        /// <summary>
        /// Gets or Sets MaintMargin
        /// </summary>
        [DataMember(Name="maintMargin", EmitDefaultValue=false)]
        public double? MaintMargin { get; set; }
  
        
        /// <summary>
        /// Gets or Sets SessionMargin
        /// </summary>
        [DataMember(Name="sessionMargin", EmitDefaultValue=false)]
        public double? SessionMargin { get; set; }
  
        
        /// <summary>
        /// Gets or Sets TargetExcessMargin
        /// </summary>
        [DataMember(Name="targetExcessMargin", EmitDefaultValue=false)]
        public double? TargetExcessMargin { get; set; }
  
        
        /// <summary>
        /// Gets or Sets VarMargin
        /// </summary>
        [DataMember(Name="varMargin", EmitDefaultValue=false)]
        public double? VarMargin { get; set; }
  
        
        /// <summary>
        /// Gets or Sets RealisedPnl
        /// </summary>
        [DataMember(Name="realisedPnl", EmitDefaultValue=false)]
        public double? RealisedPnl { get; set; }
  
        
        /// <summary>
        /// Gets or Sets UnrealisedPnl
        /// </summary>
        [DataMember(Name="unrealisedPnl", EmitDefaultValue=false)]
        public double? UnrealisedPnl { get; set; }
  
        
        /// <summary>
        /// Gets or Sets IndicativeTax
        /// </summary>
        [DataMember(Name="indicativeTax", EmitDefaultValue=false)]
        public double? IndicativeTax { get; set; }
  
        
        /// <summary>
        /// Gets or Sets UnrealisedProfit
        /// </summary>
        [DataMember(Name="unrealisedProfit", EmitDefaultValue=false)]
        public double? UnrealisedProfit { get; set; }
  
        
        /// <summary>
        /// Gets or Sets SyntheticMargin
        /// </summary>
        [DataMember(Name="syntheticMargin", EmitDefaultValue=false)]
        public double? SyntheticMargin { get; set; }
  
        
        /// <summary>
        /// Gets or Sets WalletBalance
        /// </summary>
        [DataMember(Name="walletBalance", EmitDefaultValue=false)]
        public double? WalletBalance { get; set; }
  
        
        /// <summary>
        /// Gets or Sets MarginBalance
        /// </summary>
        [DataMember(Name="marginBalance", EmitDefaultValue=false)]
        public double? MarginBalance { get; set; }
  
        
        /// <summary>
        /// Gets or Sets MarginBalancePcnt
        /// </summary>
        [DataMember(Name="marginBalancePcnt", EmitDefaultValue=false)]
        public double? MarginBalancePcnt { get; set; }
  
        
        /// <summary>
        /// Gets or Sets MarginLeverage
        /// </summary>
        [DataMember(Name="marginLeverage", EmitDefaultValue=false)]
        public double? MarginLeverage { get; set; }
  
        
        /// <summary>
        /// Gets or Sets MarginUsedPcnt
        /// </summary>
        [DataMember(Name="marginUsedPcnt", EmitDefaultValue=false)]
        public double? MarginUsedPcnt { get; set; }
  
        
        /// <summary>
        /// Gets or Sets ExcessMargin
        /// </summary>
        [DataMember(Name="excessMargin", EmitDefaultValue=false)]
        public double? ExcessMargin { get; set; }
  
        
        /// <summary>
        /// Gets or Sets ExcessMarginPcnt
        /// </summary>
        [DataMember(Name="excessMarginPcnt", EmitDefaultValue=false)]
        public double? ExcessMarginPcnt { get; set; }
  
        
        /// <summary>
        /// Gets or Sets AvailableMargin
        /// </summary>
        [DataMember(Name="availableMargin", EmitDefaultValue=false)]
        public double? AvailableMargin { get; set; }
  
        
        /// <summary>
        /// Gets or Sets WithdrawableMargin
        /// </summary>
        [DataMember(Name="withdrawableMargin", EmitDefaultValue=false)]
        public double? WithdrawableMargin { get; set; }
  
        
        /// <summary>
        /// Gets or Sets Timestamp
        /// </summary>
        [DataMember(Name="timestamp", EmitDefaultValue=false)]
        public DateTime? Timestamp { get; set; }
  
        
        /// <summary>
        /// Gets or Sets GrossLastValue
        /// </summary>
        [DataMember(Name="grossLastValue", EmitDefaultValue=false)]
        public double? GrossLastValue { get; set; }
  
        
        /// <summary>
        /// Gets or Sets Commission
        /// </summary>
        [DataMember(Name="commission", EmitDefaultValue=false)]
        public double? Commission { get; set; }
  
        
  
        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class Margin {\n");
            sb.Append("  Account: ").Append(Account).Append("\n");
            sb.Append("  Currency: ").Append(Currency).Append("\n");
            sb.Append("  RiskLimit: ").Append(RiskLimit).Append("\n");
            sb.Append("  PrevState: ").Append(PrevState).Append("\n");
            sb.Append("  State: ").Append(State).Append("\n");
            sb.Append("  Action: ").Append(Action).Append("\n");
            sb.Append("  Amount: ").Append(Amount).Append("\n");
            sb.Append("  PendingCredit: ").Append(PendingCredit).Append("\n");
            sb.Append("  PendingDebit: ").Append(PendingDebit).Append("\n");
            sb.Append("  ConfirmedDebit: ").Append(ConfirmedDebit).Append("\n");
            sb.Append("  PrevRealisedPnl: ").Append(PrevRealisedPnl).Append("\n");
            sb.Append("  PrevUnrealisedPnl: ").Append(PrevUnrealisedPnl).Append("\n");
            sb.Append("  GrossComm: ").Append(GrossComm).Append("\n");
            sb.Append("  GrossOpenCost: ").Append(GrossOpenCost).Append("\n");
            sb.Append("  GrossOpenPremium: ").Append(GrossOpenPremium).Append("\n");
            sb.Append("  GrossExecCost: ").Append(GrossExecCost).Append("\n");
            sb.Append("  GrossMarkValue: ").Append(GrossMarkValue).Append("\n");
            sb.Append("  RiskValue: ").Append(RiskValue).Append("\n");
            sb.Append("  TaxableMargin: ").Append(TaxableMargin).Append("\n");
            sb.Append("  InitMargin: ").Append(InitMargin).Append("\n");
            sb.Append("  MaintMargin: ").Append(MaintMargin).Append("\n");
            sb.Append("  SessionMargin: ").Append(SessionMargin).Append("\n");
            sb.Append("  TargetExcessMargin: ").Append(TargetExcessMargin).Append("\n");
            sb.Append("  VarMargin: ").Append(VarMargin).Append("\n");
            sb.Append("  RealisedPnl: ").Append(RealisedPnl).Append("\n");
            sb.Append("  UnrealisedPnl: ").Append(UnrealisedPnl).Append("\n");
            sb.Append("  IndicativeTax: ").Append(IndicativeTax).Append("\n");
            sb.Append("  UnrealisedProfit: ").Append(UnrealisedProfit).Append("\n");
            sb.Append("  SyntheticMargin: ").Append(SyntheticMargin).Append("\n");
            sb.Append("  WalletBalance: ").Append(WalletBalance).Append("\n");
            sb.Append("  MarginBalance: ").Append(MarginBalance).Append("\n");
            sb.Append("  MarginBalancePcnt: ").Append(MarginBalancePcnt).Append("\n");
            sb.Append("  MarginLeverage: ").Append(MarginLeverage).Append("\n");
            sb.Append("  MarginUsedPcnt: ").Append(MarginUsedPcnt).Append("\n");
            sb.Append("  ExcessMargin: ").Append(ExcessMargin).Append("\n");
            sb.Append("  ExcessMarginPcnt: ").Append(ExcessMarginPcnt).Append("\n");
            sb.Append("  AvailableMargin: ").Append(AvailableMargin).Append("\n");
            sb.Append("  WithdrawableMargin: ").Append(WithdrawableMargin).Append("\n");
            sb.Append("  Timestamp: ").Append(Timestamp).Append("\n");
            sb.Append("  GrossLastValue: ").Append(GrossLastValue).Append("\n");
            sb.Append("  Commission: ").Append(Commission).Append("\n");
            
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
            return this.Equals(obj as Margin);
        }

        /// <summary>
        /// Returns true if Margin instances are equal
        /// </summary>
        /// <param name="obj">Instance of Margin to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Margin other)
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
                    this.RiskLimit == other.RiskLimit ||
                    this.RiskLimit != null &&
                    this.RiskLimit.Equals(other.RiskLimit)
                ) && 
                (
                    this.PrevState == other.PrevState ||
                    this.PrevState != null &&
                    this.PrevState.Equals(other.PrevState)
                ) && 
                (
                    this.State == other.State ||
                    this.State != null &&
                    this.State.Equals(other.State)
                ) && 
                (
                    this.Action == other.Action ||
                    this.Action != null &&
                    this.Action.Equals(other.Action)
                ) && 
                (
                    this.Amount == other.Amount ||
                    this.Amount != null &&
                    this.Amount.Equals(other.Amount)
                ) && 
                (
                    this.PendingCredit == other.PendingCredit ||
                    this.PendingCredit != null &&
                    this.PendingCredit.Equals(other.PendingCredit)
                ) && 
                (
                    this.PendingDebit == other.PendingDebit ||
                    this.PendingDebit != null &&
                    this.PendingDebit.Equals(other.PendingDebit)
                ) && 
                (
                    this.ConfirmedDebit == other.ConfirmedDebit ||
                    this.ConfirmedDebit != null &&
                    this.ConfirmedDebit.Equals(other.ConfirmedDebit)
                ) && 
                (
                    this.PrevRealisedPnl == other.PrevRealisedPnl ||
                    this.PrevRealisedPnl != null &&
                    this.PrevRealisedPnl.Equals(other.PrevRealisedPnl)
                ) && 
                (
                    this.PrevUnrealisedPnl == other.PrevUnrealisedPnl ||
                    this.PrevUnrealisedPnl != null &&
                    this.PrevUnrealisedPnl.Equals(other.PrevUnrealisedPnl)
                ) && 
                (
                    this.GrossComm == other.GrossComm ||
                    this.GrossComm != null &&
                    this.GrossComm.Equals(other.GrossComm)
                ) && 
                (
                    this.GrossOpenCost == other.GrossOpenCost ||
                    this.GrossOpenCost != null &&
                    this.GrossOpenCost.Equals(other.GrossOpenCost)
                ) && 
                (
                    this.GrossOpenPremium == other.GrossOpenPremium ||
                    this.GrossOpenPremium != null &&
                    this.GrossOpenPremium.Equals(other.GrossOpenPremium)
                ) && 
                (
                    this.GrossExecCost == other.GrossExecCost ||
                    this.GrossExecCost != null &&
                    this.GrossExecCost.Equals(other.GrossExecCost)
                ) && 
                (
                    this.GrossMarkValue == other.GrossMarkValue ||
                    this.GrossMarkValue != null &&
                    this.GrossMarkValue.Equals(other.GrossMarkValue)
                ) && 
                (
                    this.RiskValue == other.RiskValue ||
                    this.RiskValue != null &&
                    this.RiskValue.Equals(other.RiskValue)
                ) && 
                (
                    this.TaxableMargin == other.TaxableMargin ||
                    this.TaxableMargin != null &&
                    this.TaxableMargin.Equals(other.TaxableMargin)
                ) && 
                (
                    this.InitMargin == other.InitMargin ||
                    this.InitMargin != null &&
                    this.InitMargin.Equals(other.InitMargin)
                ) && 
                (
                    this.MaintMargin == other.MaintMargin ||
                    this.MaintMargin != null &&
                    this.MaintMargin.Equals(other.MaintMargin)
                ) && 
                (
                    this.SessionMargin == other.SessionMargin ||
                    this.SessionMargin != null &&
                    this.SessionMargin.Equals(other.SessionMargin)
                ) && 
                (
                    this.TargetExcessMargin == other.TargetExcessMargin ||
                    this.TargetExcessMargin != null &&
                    this.TargetExcessMargin.Equals(other.TargetExcessMargin)
                ) && 
                (
                    this.VarMargin == other.VarMargin ||
                    this.VarMargin != null &&
                    this.VarMargin.Equals(other.VarMargin)
                ) && 
                (
                    this.RealisedPnl == other.RealisedPnl ||
                    this.RealisedPnl != null &&
                    this.RealisedPnl.Equals(other.RealisedPnl)
                ) && 
                (
                    this.UnrealisedPnl == other.UnrealisedPnl ||
                    this.UnrealisedPnl != null &&
                    this.UnrealisedPnl.Equals(other.UnrealisedPnl)
                ) && 
                (
                    this.IndicativeTax == other.IndicativeTax ||
                    this.IndicativeTax != null &&
                    this.IndicativeTax.Equals(other.IndicativeTax)
                ) && 
                (
                    this.UnrealisedProfit == other.UnrealisedProfit ||
                    this.UnrealisedProfit != null &&
                    this.UnrealisedProfit.Equals(other.UnrealisedProfit)
                ) && 
                (
                    this.SyntheticMargin == other.SyntheticMargin ||
                    this.SyntheticMargin != null &&
                    this.SyntheticMargin.Equals(other.SyntheticMargin)
                ) && 
                (
                    this.WalletBalance == other.WalletBalance ||
                    this.WalletBalance != null &&
                    this.WalletBalance.Equals(other.WalletBalance)
                ) && 
                (
                    this.MarginBalance == other.MarginBalance ||
                    this.MarginBalance != null &&
                    this.MarginBalance.Equals(other.MarginBalance)
                ) && 
                (
                    this.MarginBalancePcnt == other.MarginBalancePcnt ||
                    this.MarginBalancePcnt != null &&
                    this.MarginBalancePcnt.Equals(other.MarginBalancePcnt)
                ) && 
                (
                    this.MarginLeverage == other.MarginLeverage ||
                    this.MarginLeverage != null &&
                    this.MarginLeverage.Equals(other.MarginLeverage)
                ) && 
                (
                    this.MarginUsedPcnt == other.MarginUsedPcnt ||
                    this.MarginUsedPcnt != null &&
                    this.MarginUsedPcnt.Equals(other.MarginUsedPcnt)
                ) && 
                (
                    this.ExcessMargin == other.ExcessMargin ||
                    this.ExcessMargin != null &&
                    this.ExcessMargin.Equals(other.ExcessMargin)
                ) && 
                (
                    this.ExcessMarginPcnt == other.ExcessMarginPcnt ||
                    this.ExcessMarginPcnt != null &&
                    this.ExcessMarginPcnt.Equals(other.ExcessMarginPcnt)
                ) && 
                (
                    this.AvailableMargin == other.AvailableMargin ||
                    this.AvailableMargin != null &&
                    this.AvailableMargin.Equals(other.AvailableMargin)
                ) && 
                (
                    this.WithdrawableMargin == other.WithdrawableMargin ||
                    this.WithdrawableMargin != null &&
                    this.WithdrawableMargin.Equals(other.WithdrawableMargin)
                ) && 
                (
                    this.Timestamp == other.Timestamp ||
                    this.Timestamp != null &&
                    this.Timestamp.Equals(other.Timestamp)
                ) && 
                (
                    this.GrossLastValue == other.GrossLastValue ||
                    this.GrossLastValue != null &&
                    this.GrossLastValue.Equals(other.GrossLastValue)
                ) && 
                (
                    this.Commission == other.Commission ||
                    this.Commission != null &&
                    this.Commission.Equals(other.Commission)
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
                
                if (this.RiskLimit != null)
                    hash = hash * 57 + this.RiskLimit.GetHashCode();
                
                if (this.PrevState != null)
                    hash = hash * 57 + this.PrevState.GetHashCode();
                
                if (this.State != null)
                    hash = hash * 57 + this.State.GetHashCode();
                
                if (this.Action != null)
                    hash = hash * 57 + this.Action.GetHashCode();
                
                if (this.Amount != null)
                    hash = hash * 57 + this.Amount.GetHashCode();
                
                if (this.PendingCredit != null)
                    hash = hash * 57 + this.PendingCredit.GetHashCode();
                
                if (this.PendingDebit != null)
                    hash = hash * 57 + this.PendingDebit.GetHashCode();
                
                if (this.ConfirmedDebit != null)
                    hash = hash * 57 + this.ConfirmedDebit.GetHashCode();
                
                if (this.PrevRealisedPnl != null)
                    hash = hash * 57 + this.PrevRealisedPnl.GetHashCode();
                
                if (this.PrevUnrealisedPnl != null)
                    hash = hash * 57 + this.PrevUnrealisedPnl.GetHashCode();
                
                if (this.GrossComm != null)
                    hash = hash * 57 + this.GrossComm.GetHashCode();
                
                if (this.GrossOpenCost != null)
                    hash = hash * 57 + this.GrossOpenCost.GetHashCode();
                
                if (this.GrossOpenPremium != null)
                    hash = hash * 57 + this.GrossOpenPremium.GetHashCode();
                
                if (this.GrossExecCost != null)
                    hash = hash * 57 + this.GrossExecCost.GetHashCode();
                
                if (this.GrossMarkValue != null)
                    hash = hash * 57 + this.GrossMarkValue.GetHashCode();
                
                if (this.RiskValue != null)
                    hash = hash * 57 + this.RiskValue.GetHashCode();
                
                if (this.TaxableMargin != null)
                    hash = hash * 57 + this.TaxableMargin.GetHashCode();
                
                if (this.InitMargin != null)
                    hash = hash * 57 + this.InitMargin.GetHashCode();
                
                if (this.MaintMargin != null)
                    hash = hash * 57 + this.MaintMargin.GetHashCode();
                
                if (this.SessionMargin != null)
                    hash = hash * 57 + this.SessionMargin.GetHashCode();
                
                if (this.TargetExcessMargin != null)
                    hash = hash * 57 + this.TargetExcessMargin.GetHashCode();
                
                if (this.VarMargin != null)
                    hash = hash * 57 + this.VarMargin.GetHashCode();
                
                if (this.RealisedPnl != null)
                    hash = hash * 57 + this.RealisedPnl.GetHashCode();
                
                if (this.UnrealisedPnl != null)
                    hash = hash * 57 + this.UnrealisedPnl.GetHashCode();
                
                if (this.IndicativeTax != null)
                    hash = hash * 57 + this.IndicativeTax.GetHashCode();
                
                if (this.UnrealisedProfit != null)
                    hash = hash * 57 + this.UnrealisedProfit.GetHashCode();
                
                if (this.SyntheticMargin != null)
                    hash = hash * 57 + this.SyntheticMargin.GetHashCode();
                
                if (this.WalletBalance != null)
                    hash = hash * 57 + this.WalletBalance.GetHashCode();
                
                if (this.MarginBalance != null)
                    hash = hash * 57 + this.MarginBalance.GetHashCode();
                
                if (this.MarginBalancePcnt != null)
                    hash = hash * 57 + this.MarginBalancePcnt.GetHashCode();
                
                if (this.MarginLeverage != null)
                    hash = hash * 57 + this.MarginLeverage.GetHashCode();
                
                if (this.MarginUsedPcnt != null)
                    hash = hash * 57 + this.MarginUsedPcnt.GetHashCode();
                
                if (this.ExcessMargin != null)
                    hash = hash * 57 + this.ExcessMargin.GetHashCode();
                
                if (this.ExcessMarginPcnt != null)
                    hash = hash * 57 + this.ExcessMarginPcnt.GetHashCode();
                
                if (this.AvailableMargin != null)
                    hash = hash * 57 + this.AvailableMargin.GetHashCode();
                
                if (this.WithdrawableMargin != null)
                    hash = hash * 57 + this.WithdrawableMargin.GetHashCode();
                
                if (this.Timestamp != null)
                    hash = hash * 57 + this.Timestamp.GetHashCode();
                
                if (this.GrossLastValue != null)
                    hash = hash * 57 + this.GrossLastValue.GetHashCode();
                
                if (this.Commission != null)
                    hash = hash * 57 + this.Commission.GetHashCode();
                
                return hash;
            }
        }

    }
}
