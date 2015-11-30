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
    public class Execution : IEquatable<Execution>
    {
        
        /// <summary>
        /// Gets or Sets ExecID
        /// </summary>
        [DataMember(Name="execID", EmitDefaultValue=false)]
        public string ExecID { get; set; }
  
        
        /// <summary>
        /// Gets or Sets OrderID
        /// </summary>
        [DataMember(Name="orderID", EmitDefaultValue=false)]
        public string OrderID { get; set; }
  
        
        /// <summary>
        /// Gets or Sets ClOrdID
        /// </summary>
        [DataMember(Name="clOrdID", EmitDefaultValue=false)]
        public string ClOrdID { get; set; }
  
        
        /// <summary>
        /// Gets or Sets Account
        /// </summary>
        [DataMember(Name="account", EmitDefaultValue=false)]
        public double? Account { get; set; }
  
        
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
        /// Gets or Sets LastQty
        /// </summary>
        [DataMember(Name="lastQty", EmitDefaultValue=false)]
        public double? LastQty { get; set; }
  
        
        /// <summary>
        /// Gets or Sets LastPx
        /// </summary>
        [DataMember(Name="lastPx", EmitDefaultValue=false)]
        public double? LastPx { get; set; }
  
        
        /// <summary>
        /// Gets or Sets UnderlyingLastPx
        /// </summary>
        [DataMember(Name="underlyingLastPx", EmitDefaultValue=false)]
        public double? UnderlyingLastPx { get; set; }
  
        
        /// <summary>
        /// Gets or Sets LastMkt
        /// </summary>
        [DataMember(Name="lastMkt", EmitDefaultValue=false)]
        public string LastMkt { get; set; }
  
        
        /// <summary>
        /// Gets or Sets LastLiquidityInd
        /// </summary>
        [DataMember(Name="lastLiquidityInd", EmitDefaultValue=false)]
        public string LastLiquidityInd { get; set; }
  
        
        /// <summary>
        /// Gets or Sets SimpleOrderQty
        /// </summary>
        [DataMember(Name="simpleOrderQty", EmitDefaultValue=false)]
        public double? SimpleOrderQty { get; set; }
  
        
        /// <summary>
        /// Gets or Sets OrderQty
        /// </summary>
        [DataMember(Name="orderQty", EmitDefaultValue=false)]
        public double? OrderQty { get; set; }
  
        
        /// <summary>
        /// Gets or Sets Price
        /// </summary>
        [DataMember(Name="price", EmitDefaultValue=false)]
        public double? Price { get; set; }
  
        
        /// <summary>
        /// Gets or Sets MinQty
        /// </summary>
        [DataMember(Name="minQty", EmitDefaultValue=false)]
        public double? MinQty { get; set; }
  
        
        /// <summary>
        /// Gets or Sets StopPx
        /// </summary>
        [DataMember(Name="stopPx", EmitDefaultValue=false)]
        public double? StopPx { get; set; }
  
        
        /// <summary>
        /// Gets or Sets Currency
        /// </summary>
        [DataMember(Name="currency", EmitDefaultValue=false)]
        public string Currency { get; set; }
  
        
        /// <summary>
        /// Gets or Sets SettlCurrency
        /// </summary>
        [DataMember(Name="settlCurrency", EmitDefaultValue=false)]
        public string SettlCurrency { get; set; }
  
        
        /// <summary>
        /// Gets or Sets ExecType
        /// </summary>
        [DataMember(Name="execType", EmitDefaultValue=false)]
        public string ExecType { get; set; }
  
        
        /// <summary>
        /// Gets or Sets OrdType
        /// </summary>
        [DataMember(Name="ordType", EmitDefaultValue=false)]
        public string OrdType { get; set; }
  
        
        /// <summary>
        /// Gets or Sets TimeInForce
        /// </summary>
        [DataMember(Name="timeInForce", EmitDefaultValue=false)]
        public string TimeInForce { get; set; }
  
        
        /// <summary>
        /// Gets or Sets ExDestination
        /// </summary>
        [DataMember(Name="exDestination", EmitDefaultValue=false)]
        public string ExDestination { get; set; }
  
        
        /// <summary>
        /// Gets or Sets OrdStatus
        /// </summary>
        [DataMember(Name="ordStatus", EmitDefaultValue=false)]
        public string OrdStatus { get; set; }
  
        
        /// <summary>
        /// Gets or Sets WorkingIndicator
        /// </summary>
        [DataMember(Name="workingIndicator", EmitDefaultValue=false)]
        public bool? WorkingIndicator { get; set; }
  
        
        /// <summary>
        /// Gets or Sets OrdRejReason
        /// </summary>
        [DataMember(Name="ordRejReason", EmitDefaultValue=false)]
        public string OrdRejReason { get; set; }
  
        
        /// <summary>
        /// Gets or Sets SimpleLeavesQty
        /// </summary>
        [DataMember(Name="simpleLeavesQty", EmitDefaultValue=false)]
        public double? SimpleLeavesQty { get; set; }
  
        
        /// <summary>
        /// Gets or Sets LeavesQty
        /// </summary>
        [DataMember(Name="leavesQty", EmitDefaultValue=false)]
        public double? LeavesQty { get; set; }
  
        
        /// <summary>
        /// Gets or Sets SimpleCumQty
        /// </summary>
        [DataMember(Name="simpleCumQty", EmitDefaultValue=false)]
        public double? SimpleCumQty { get; set; }
  
        
        /// <summary>
        /// Gets or Sets CumQty
        /// </summary>
        [DataMember(Name="cumQty", EmitDefaultValue=false)]
        public double? CumQty { get; set; }
  
        
        /// <summary>
        /// Gets or Sets AvgPx
        /// </summary>
        [DataMember(Name="avgPx", EmitDefaultValue=false)]
        public double? AvgPx { get; set; }
  
        
        /// <summary>
        /// Gets or Sets Commission
        /// </summary>
        [DataMember(Name="commission", EmitDefaultValue=false)]
        public double? Commission { get; set; }
  
        
        /// <summary>
        /// Gets or Sets CommType
        /// </summary>
        [DataMember(Name="commType", EmitDefaultValue=false)]
        public string CommType { get; set; }
  
        
        /// <summary>
        /// Gets or Sets TradePublishIndicator
        /// </summary>
        [DataMember(Name="tradePublishIndicator", EmitDefaultValue=false)]
        public string TradePublishIndicator { get; set; }
  
        
        /// <summary>
        /// Gets or Sets MultiLegReportingType
        /// </summary>
        [DataMember(Name="multiLegReportingType", EmitDefaultValue=false)]
        public string MultiLegReportingType { get; set; }
  
        
        /// <summary>
        /// Gets or Sets Text
        /// </summary>
        [DataMember(Name="text", EmitDefaultValue=false)]
        public string Text { get; set; }
  
        
        /// <summary>
        /// Gets or Sets TrdMatchID
        /// </summary>
        [DataMember(Name="trdMatchID", EmitDefaultValue=false)]
        public string TrdMatchID { get; set; }
  
        
        /// <summary>
        /// Gets or Sets ExecCost
        /// </summary>
        [DataMember(Name="execCost", EmitDefaultValue=false)]
        public double? ExecCost { get; set; }
  
        
        /// <summary>
        /// Gets or Sets ExecComm
        /// </summary>
        [DataMember(Name="execComm", EmitDefaultValue=false)]
        public double? ExecComm { get; set; }
  
        
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
            sb.Append("class Execution {\n");
            sb.Append("  ExecID: ").Append(ExecID).Append("\n");
            sb.Append("  OrderID: ").Append(OrderID).Append("\n");
            sb.Append("  ClOrdID: ").Append(ClOrdID).Append("\n");
            sb.Append("  Account: ").Append(Account).Append("\n");
            sb.Append("  Symbol: ").Append(Symbol).Append("\n");
            sb.Append("  Side: ").Append(Side).Append("\n");
            sb.Append("  LastQty: ").Append(LastQty).Append("\n");
            sb.Append("  LastPx: ").Append(LastPx).Append("\n");
            sb.Append("  UnderlyingLastPx: ").Append(UnderlyingLastPx).Append("\n");
            sb.Append("  LastMkt: ").Append(LastMkt).Append("\n");
            sb.Append("  LastLiquidityInd: ").Append(LastLiquidityInd).Append("\n");
            sb.Append("  SimpleOrderQty: ").Append(SimpleOrderQty).Append("\n");
            sb.Append("  OrderQty: ").Append(OrderQty).Append("\n");
            sb.Append("  Price: ").Append(Price).Append("\n");
            sb.Append("  MinQty: ").Append(MinQty).Append("\n");
            sb.Append("  StopPx: ").Append(StopPx).Append("\n");
            sb.Append("  Currency: ").Append(Currency).Append("\n");
            sb.Append("  SettlCurrency: ").Append(SettlCurrency).Append("\n");
            sb.Append("  ExecType: ").Append(ExecType).Append("\n");
            sb.Append("  OrdType: ").Append(OrdType).Append("\n");
            sb.Append("  TimeInForce: ").Append(TimeInForce).Append("\n");
            sb.Append("  ExDestination: ").Append(ExDestination).Append("\n");
            sb.Append("  OrdStatus: ").Append(OrdStatus).Append("\n");
            sb.Append("  WorkingIndicator: ").Append(WorkingIndicator).Append("\n");
            sb.Append("  OrdRejReason: ").Append(OrdRejReason).Append("\n");
            sb.Append("  SimpleLeavesQty: ").Append(SimpleLeavesQty).Append("\n");
            sb.Append("  LeavesQty: ").Append(LeavesQty).Append("\n");
            sb.Append("  SimpleCumQty: ").Append(SimpleCumQty).Append("\n");
            sb.Append("  CumQty: ").Append(CumQty).Append("\n");
            sb.Append("  AvgPx: ").Append(AvgPx).Append("\n");
            sb.Append("  Commission: ").Append(Commission).Append("\n");
            sb.Append("  CommType: ").Append(CommType).Append("\n");
            sb.Append("  TradePublishIndicator: ").Append(TradePublishIndicator).Append("\n");
            sb.Append("  MultiLegReportingType: ").Append(MultiLegReportingType).Append("\n");
            sb.Append("  Text: ").Append(Text).Append("\n");
            sb.Append("  TrdMatchID: ").Append(TrdMatchID).Append("\n");
            sb.Append("  ExecCost: ").Append(ExecCost).Append("\n");
            sb.Append("  ExecComm: ").Append(ExecComm).Append("\n");
            sb.Append("  HomeNotional: ").Append(HomeNotional).Append("\n");
            sb.Append("  ForeignNotional: ").Append(ForeignNotional).Append("\n");
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
            return this.Equals(obj as Execution);
        }

        /// <summary>
        /// Returns true if Execution instances are equal
        /// </summary>
        /// <param name="obj">Instance of Execution to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Execution other)
        {
            // credit: http://stackoverflow.com/a/10454552/677735
            if (other == null)
                return false;

            return 
                (
                    this.ExecID == other.ExecID ||
                    this.ExecID != null &&
                    this.ExecID.Equals(other.ExecID)
                ) && 
                (
                    this.OrderID == other.OrderID ||
                    this.OrderID != null &&
                    this.OrderID.Equals(other.OrderID)
                ) && 
                (
                    this.ClOrdID == other.ClOrdID ||
                    this.ClOrdID != null &&
                    this.ClOrdID.Equals(other.ClOrdID)
                ) && 
                (
                    this.Account == other.Account ||
                    this.Account != null &&
                    this.Account.Equals(other.Account)
                ) && 
                (
                    this.Symbol == other.Symbol ||
                    this.Symbol != null &&
                    this.Symbol.Equals(other.Symbol)
                ) && 
                (
                    this.Side == other.Side ||
                    this.Side != null &&
                    this.Side.Equals(other.Side)
                ) && 
                (
                    this.LastQty == other.LastQty ||
                    this.LastQty != null &&
                    this.LastQty.Equals(other.LastQty)
                ) && 
                (
                    this.LastPx == other.LastPx ||
                    this.LastPx != null &&
                    this.LastPx.Equals(other.LastPx)
                ) && 
                (
                    this.UnderlyingLastPx == other.UnderlyingLastPx ||
                    this.UnderlyingLastPx != null &&
                    this.UnderlyingLastPx.Equals(other.UnderlyingLastPx)
                ) && 
                (
                    this.LastMkt == other.LastMkt ||
                    this.LastMkt != null &&
                    this.LastMkt.Equals(other.LastMkt)
                ) && 
                (
                    this.LastLiquidityInd == other.LastLiquidityInd ||
                    this.LastLiquidityInd != null &&
                    this.LastLiquidityInd.Equals(other.LastLiquidityInd)
                ) && 
                (
                    this.SimpleOrderQty == other.SimpleOrderQty ||
                    this.SimpleOrderQty != null &&
                    this.SimpleOrderQty.Equals(other.SimpleOrderQty)
                ) && 
                (
                    this.OrderQty == other.OrderQty ||
                    this.OrderQty != null &&
                    this.OrderQty.Equals(other.OrderQty)
                ) && 
                (
                    this.Price == other.Price ||
                    this.Price != null &&
                    this.Price.Equals(other.Price)
                ) && 
                (
                    this.MinQty == other.MinQty ||
                    this.MinQty != null &&
                    this.MinQty.Equals(other.MinQty)
                ) && 
                (
                    this.StopPx == other.StopPx ||
                    this.StopPx != null &&
                    this.StopPx.Equals(other.StopPx)
                ) && 
                (
                    this.Currency == other.Currency ||
                    this.Currency != null &&
                    this.Currency.Equals(other.Currency)
                ) && 
                (
                    this.SettlCurrency == other.SettlCurrency ||
                    this.SettlCurrency != null &&
                    this.SettlCurrency.Equals(other.SettlCurrency)
                ) && 
                (
                    this.ExecType == other.ExecType ||
                    this.ExecType != null &&
                    this.ExecType.Equals(other.ExecType)
                ) && 
                (
                    this.OrdType == other.OrdType ||
                    this.OrdType != null &&
                    this.OrdType.Equals(other.OrdType)
                ) && 
                (
                    this.TimeInForce == other.TimeInForce ||
                    this.TimeInForce != null &&
                    this.TimeInForce.Equals(other.TimeInForce)
                ) && 
                (
                    this.ExDestination == other.ExDestination ||
                    this.ExDestination != null &&
                    this.ExDestination.Equals(other.ExDestination)
                ) && 
                (
                    this.OrdStatus == other.OrdStatus ||
                    this.OrdStatus != null &&
                    this.OrdStatus.Equals(other.OrdStatus)
                ) && 
                (
                    this.WorkingIndicator == other.WorkingIndicator ||
                    this.WorkingIndicator != null &&
                    this.WorkingIndicator.Equals(other.WorkingIndicator)
                ) && 
                (
                    this.OrdRejReason == other.OrdRejReason ||
                    this.OrdRejReason != null &&
                    this.OrdRejReason.Equals(other.OrdRejReason)
                ) && 
                (
                    this.SimpleLeavesQty == other.SimpleLeavesQty ||
                    this.SimpleLeavesQty != null &&
                    this.SimpleLeavesQty.Equals(other.SimpleLeavesQty)
                ) && 
                (
                    this.LeavesQty == other.LeavesQty ||
                    this.LeavesQty != null &&
                    this.LeavesQty.Equals(other.LeavesQty)
                ) && 
                (
                    this.SimpleCumQty == other.SimpleCumQty ||
                    this.SimpleCumQty != null &&
                    this.SimpleCumQty.Equals(other.SimpleCumQty)
                ) && 
                (
                    this.CumQty == other.CumQty ||
                    this.CumQty != null &&
                    this.CumQty.Equals(other.CumQty)
                ) && 
                (
                    this.AvgPx == other.AvgPx ||
                    this.AvgPx != null &&
                    this.AvgPx.Equals(other.AvgPx)
                ) && 
                (
                    this.Commission == other.Commission ||
                    this.Commission != null &&
                    this.Commission.Equals(other.Commission)
                ) && 
                (
                    this.CommType == other.CommType ||
                    this.CommType != null &&
                    this.CommType.Equals(other.CommType)
                ) && 
                (
                    this.TradePublishIndicator == other.TradePublishIndicator ||
                    this.TradePublishIndicator != null &&
                    this.TradePublishIndicator.Equals(other.TradePublishIndicator)
                ) && 
                (
                    this.MultiLegReportingType == other.MultiLegReportingType ||
                    this.MultiLegReportingType != null &&
                    this.MultiLegReportingType.Equals(other.MultiLegReportingType)
                ) && 
                (
                    this.Text == other.Text ||
                    this.Text != null &&
                    this.Text.Equals(other.Text)
                ) && 
                (
                    this.TrdMatchID == other.TrdMatchID ||
                    this.TrdMatchID != null &&
                    this.TrdMatchID.Equals(other.TrdMatchID)
                ) && 
                (
                    this.ExecCost == other.ExecCost ||
                    this.ExecCost != null &&
                    this.ExecCost.Equals(other.ExecCost)
                ) && 
                (
                    this.ExecComm == other.ExecComm ||
                    this.ExecComm != null &&
                    this.ExecComm.Equals(other.ExecComm)
                ) && 
                (
                    this.HomeNotional == other.HomeNotional ||
                    this.HomeNotional != null &&
                    this.HomeNotional.Equals(other.HomeNotional)
                ) && 
                (
                    this.ForeignNotional == other.ForeignNotional ||
                    this.ForeignNotional != null &&
                    this.ForeignNotional.Equals(other.ForeignNotional)
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
                
                if (this.ExecID != null)
                    hash = hash * 57 + this.ExecID.GetHashCode();
                
                if (this.OrderID != null)
                    hash = hash * 57 + this.OrderID.GetHashCode();
                
                if (this.ClOrdID != null)
                    hash = hash * 57 + this.ClOrdID.GetHashCode();
                
                if (this.Account != null)
                    hash = hash * 57 + this.Account.GetHashCode();
                
                if (this.Symbol != null)
                    hash = hash * 57 + this.Symbol.GetHashCode();
                
                if (this.Side != null)
                    hash = hash * 57 + this.Side.GetHashCode();
                
                if (this.LastQty != null)
                    hash = hash * 57 + this.LastQty.GetHashCode();
                
                if (this.LastPx != null)
                    hash = hash * 57 + this.LastPx.GetHashCode();
                
                if (this.UnderlyingLastPx != null)
                    hash = hash * 57 + this.UnderlyingLastPx.GetHashCode();
                
                if (this.LastMkt != null)
                    hash = hash * 57 + this.LastMkt.GetHashCode();
                
                if (this.LastLiquidityInd != null)
                    hash = hash * 57 + this.LastLiquidityInd.GetHashCode();
                
                if (this.SimpleOrderQty != null)
                    hash = hash * 57 + this.SimpleOrderQty.GetHashCode();
                
                if (this.OrderQty != null)
                    hash = hash * 57 + this.OrderQty.GetHashCode();
                
                if (this.Price != null)
                    hash = hash * 57 + this.Price.GetHashCode();
                
                if (this.MinQty != null)
                    hash = hash * 57 + this.MinQty.GetHashCode();
                
                if (this.StopPx != null)
                    hash = hash * 57 + this.StopPx.GetHashCode();
                
                if (this.Currency != null)
                    hash = hash * 57 + this.Currency.GetHashCode();
                
                if (this.SettlCurrency != null)
                    hash = hash * 57 + this.SettlCurrency.GetHashCode();
                
                if (this.ExecType != null)
                    hash = hash * 57 + this.ExecType.GetHashCode();
                
                if (this.OrdType != null)
                    hash = hash * 57 + this.OrdType.GetHashCode();
                
                if (this.TimeInForce != null)
                    hash = hash * 57 + this.TimeInForce.GetHashCode();
                
                if (this.ExDestination != null)
                    hash = hash * 57 + this.ExDestination.GetHashCode();
                
                if (this.OrdStatus != null)
                    hash = hash * 57 + this.OrdStatus.GetHashCode();
                
                if (this.WorkingIndicator != null)
                    hash = hash * 57 + this.WorkingIndicator.GetHashCode();
                
                if (this.OrdRejReason != null)
                    hash = hash * 57 + this.OrdRejReason.GetHashCode();
                
                if (this.SimpleLeavesQty != null)
                    hash = hash * 57 + this.SimpleLeavesQty.GetHashCode();
                
                if (this.LeavesQty != null)
                    hash = hash * 57 + this.LeavesQty.GetHashCode();
                
                if (this.SimpleCumQty != null)
                    hash = hash * 57 + this.SimpleCumQty.GetHashCode();
                
                if (this.CumQty != null)
                    hash = hash * 57 + this.CumQty.GetHashCode();
                
                if (this.AvgPx != null)
                    hash = hash * 57 + this.AvgPx.GetHashCode();
                
                if (this.Commission != null)
                    hash = hash * 57 + this.Commission.GetHashCode();
                
                if (this.CommType != null)
                    hash = hash * 57 + this.CommType.GetHashCode();
                
                if (this.TradePublishIndicator != null)
                    hash = hash * 57 + this.TradePublishIndicator.GetHashCode();
                
                if (this.MultiLegReportingType != null)
                    hash = hash * 57 + this.MultiLegReportingType.GetHashCode();
                
                if (this.Text != null)
                    hash = hash * 57 + this.Text.GetHashCode();
                
                if (this.TrdMatchID != null)
                    hash = hash * 57 + this.TrdMatchID.GetHashCode();
                
                if (this.ExecCost != null)
                    hash = hash * 57 + this.ExecCost.GetHashCode();
                
                if (this.ExecComm != null)
                    hash = hash * 57 + this.ExecComm.GetHashCode();
                
                if (this.HomeNotional != null)
                    hash = hash * 57 + this.HomeNotional.GetHashCode();
                
                if (this.ForeignNotional != null)
                    hash = hash * 57 + this.ForeignNotional.GetHashCode();
                
                if (this.TransactTime != null)
                    hash = hash * 57 + this.TransactTime.GetHashCode();
                
                if (this.Timestamp != null)
                    hash = hash * 57 + this.Timestamp.GetHashCode();
                
                return hash;
            }
        }

    }
}
