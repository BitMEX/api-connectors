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
    public class Position : IEquatable<Position>
    {
        
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
        /// Gets or Sets Underlying
        /// </summary>
        [DataMember(Name="underlying", EmitDefaultValue=false)]
        public string Underlying { get; set; }
  
        
        /// <summary>
        /// Gets or Sets QuoteCurrency
        /// </summary>
        [DataMember(Name="quoteCurrency", EmitDefaultValue=false)]
        public string QuoteCurrency { get; set; }
  
        
        /// <summary>
        /// Gets or Sets Currency
        /// </summary>
        [DataMember(Name="currency", EmitDefaultValue=false)]
        public string Currency { get; set; }
  
        
        /// <summary>
        /// Gets or Sets Commission
        /// </summary>
        [DataMember(Name="commission", EmitDefaultValue=false)]
        public double? Commission { get; set; }
  
        
        /// <summary>
        /// Gets or Sets CrossMargin
        /// </summary>
        [DataMember(Name="crossMargin", EmitDefaultValue=false)]
        public bool? CrossMargin { get; set; }
  
        
        /// <summary>
        /// Gets or Sets RebalancedPnl
        /// </summary>
        [DataMember(Name="rebalancedPnl", EmitDefaultValue=false)]
        public double? RebalancedPnl { get; set; }
  
        
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
        /// Gets or Sets PrevClosePrice
        /// </summary>
        [DataMember(Name="prevClosePrice", EmitDefaultValue=false)]
        public double? PrevClosePrice { get; set; }
  
        
        /// <summary>
        /// Gets or Sets OpeningTimestamp
        /// </summary>
        [DataMember(Name="openingTimestamp", EmitDefaultValue=false)]
        public DateTime? OpeningTimestamp { get; set; }
  
        
        /// <summary>
        /// Gets or Sets OpeningQty
        /// </summary>
        [DataMember(Name="openingQty", EmitDefaultValue=false)]
        public double? OpeningQty { get; set; }
  
        
        /// <summary>
        /// Gets or Sets OpeningCost
        /// </summary>
        [DataMember(Name="openingCost", EmitDefaultValue=false)]
        public double? OpeningCost { get; set; }
  
        
        /// <summary>
        /// Gets or Sets OpeningComm
        /// </summary>
        [DataMember(Name="openingComm", EmitDefaultValue=false)]
        public double? OpeningComm { get; set; }
  
        
        /// <summary>
        /// Gets or Sets OpenOrderBuyQty
        /// </summary>
        [DataMember(Name="openOrderBuyQty", EmitDefaultValue=false)]
        public double? OpenOrderBuyQty { get; set; }
  
        
        /// <summary>
        /// Gets or Sets OpenOrderBuyCost
        /// </summary>
        [DataMember(Name="openOrderBuyCost", EmitDefaultValue=false)]
        public double? OpenOrderBuyCost { get; set; }
  
        
        /// <summary>
        /// Gets or Sets OpenOrderBuyPremium
        /// </summary>
        [DataMember(Name="openOrderBuyPremium", EmitDefaultValue=false)]
        public double? OpenOrderBuyPremium { get; set; }
  
        
        /// <summary>
        /// Gets or Sets OpenOrderSellQty
        /// </summary>
        [DataMember(Name="openOrderSellQty", EmitDefaultValue=false)]
        public double? OpenOrderSellQty { get; set; }
  
        
        /// <summary>
        /// Gets or Sets OpenOrderSellCost
        /// </summary>
        [DataMember(Name="openOrderSellCost", EmitDefaultValue=false)]
        public double? OpenOrderSellCost { get; set; }
  
        
        /// <summary>
        /// Gets or Sets OpenOrderSellPremium
        /// </summary>
        [DataMember(Name="openOrderSellPremium", EmitDefaultValue=false)]
        public double? OpenOrderSellPremium { get; set; }
  
        
        /// <summary>
        /// Gets or Sets ExecBuyQty
        /// </summary>
        [DataMember(Name="execBuyQty", EmitDefaultValue=false)]
        public double? ExecBuyQty { get; set; }
  
        
        /// <summary>
        /// Gets or Sets ExecBuyCost
        /// </summary>
        [DataMember(Name="execBuyCost", EmitDefaultValue=false)]
        public double? ExecBuyCost { get; set; }
  
        
        /// <summary>
        /// Gets or Sets ExecSellQty
        /// </summary>
        [DataMember(Name="execSellQty", EmitDefaultValue=false)]
        public double? ExecSellQty { get; set; }
  
        
        /// <summary>
        /// Gets or Sets ExecSellCost
        /// </summary>
        [DataMember(Name="execSellCost", EmitDefaultValue=false)]
        public double? ExecSellCost { get; set; }
  
        
        /// <summary>
        /// Gets or Sets ExecQty
        /// </summary>
        [DataMember(Name="execQty", EmitDefaultValue=false)]
        public double? ExecQty { get; set; }
  
        
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
        /// Gets or Sets CurrentTimestamp
        /// </summary>
        [DataMember(Name="currentTimestamp", EmitDefaultValue=false)]
        public DateTime? CurrentTimestamp { get; set; }
  
        
        /// <summary>
        /// Gets or Sets CurrentQty
        /// </summary>
        [DataMember(Name="currentQty", EmitDefaultValue=false)]
        public double? CurrentQty { get; set; }
  
        
        /// <summary>
        /// Gets or Sets CurrentCost
        /// </summary>
        [DataMember(Name="currentCost", EmitDefaultValue=false)]
        public double? CurrentCost { get; set; }
  
        
        /// <summary>
        /// Gets or Sets CurrentComm
        /// </summary>
        [DataMember(Name="currentComm", EmitDefaultValue=false)]
        public double? CurrentComm { get; set; }
  
        
        /// <summary>
        /// Gets or Sets RealisedCost
        /// </summary>
        [DataMember(Name="realisedCost", EmitDefaultValue=false)]
        public double? RealisedCost { get; set; }
  
        
        /// <summary>
        /// Gets or Sets UnrealisedCost
        /// </summary>
        [DataMember(Name="unrealisedCost", EmitDefaultValue=false)]
        public double? UnrealisedCost { get; set; }
  
        
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
        /// Gets or Sets IsOpen
        /// </summary>
        [DataMember(Name="isOpen", EmitDefaultValue=false)]
        public bool? IsOpen { get; set; }
  
        
        /// <summary>
        /// Gets or Sets MarkPrice
        /// </summary>
        [DataMember(Name="markPrice", EmitDefaultValue=false)]
        public double? MarkPrice { get; set; }
  
        
        /// <summary>
        /// Gets or Sets MarkValue
        /// </summary>
        [DataMember(Name="markValue", EmitDefaultValue=false)]
        public double? MarkValue { get; set; }
  
        
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
        /// Gets or Sets PosState
        /// </summary>
        [DataMember(Name="posState", EmitDefaultValue=false)]
        public string PosState { get; set; }
  
        
        /// <summary>
        /// Gets or Sets PosCost
        /// </summary>
        [DataMember(Name="posCost", EmitDefaultValue=false)]
        public double? PosCost { get; set; }
  
        
        /// <summary>
        /// Gets or Sets PosCost2
        /// </summary>
        [DataMember(Name="posCost2", EmitDefaultValue=false)]
        public double? PosCost2 { get; set; }
  
        
        /// <summary>
        /// Gets or Sets PosCross
        /// </summary>
        [DataMember(Name="posCross", EmitDefaultValue=false)]
        public double? PosCross { get; set; }
  
        
        /// <summary>
        /// Gets or Sets PosInit
        /// </summary>
        [DataMember(Name="posInit", EmitDefaultValue=false)]
        public double? PosInit { get; set; }
  
        
        /// <summary>
        /// Gets or Sets PosComm
        /// </summary>
        [DataMember(Name="posComm", EmitDefaultValue=false)]
        public double? PosComm { get; set; }
  
        
        /// <summary>
        /// Gets or Sets PosLoss
        /// </summary>
        [DataMember(Name="posLoss", EmitDefaultValue=false)]
        public double? PosLoss { get; set; }
  
        
        /// <summary>
        /// Gets or Sets PosMargin
        /// </summary>
        [DataMember(Name="posMargin", EmitDefaultValue=false)]
        public double? PosMargin { get; set; }
  
        
        /// <summary>
        /// Gets or Sets PosMaint
        /// </summary>
        [DataMember(Name="posMaint", EmitDefaultValue=false)]
        public double? PosMaint { get; set; }
  
        
        /// <summary>
        /// Gets or Sets PosAllowance
        /// </summary>
        [DataMember(Name="posAllowance", EmitDefaultValue=false)]
        public double? PosAllowance { get; set; }
  
        
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
        /// Gets or Sets RealisedGrossPnl
        /// </summary>
        [DataMember(Name="realisedGrossPnl", EmitDefaultValue=false)]
        public double? RealisedGrossPnl { get; set; }
  
        
        /// <summary>
        /// Gets or Sets RealisedTax
        /// </summary>
        [DataMember(Name="realisedTax", EmitDefaultValue=false)]
        public double? RealisedTax { get; set; }
  
        
        /// <summary>
        /// Gets or Sets RealisedPnl
        /// </summary>
        [DataMember(Name="realisedPnl", EmitDefaultValue=false)]
        public double? RealisedPnl { get; set; }
  
        
        /// <summary>
        /// Gets or Sets UnrealisedGrossPnl
        /// </summary>
        [DataMember(Name="unrealisedGrossPnl", EmitDefaultValue=false)]
        public double? UnrealisedGrossPnl { get; set; }
  
        
        /// <summary>
        /// Gets or Sets LongBankrupt
        /// </summary>
        [DataMember(Name="longBankrupt", EmitDefaultValue=false)]
        public double? LongBankrupt { get; set; }
  
        
        /// <summary>
        /// Gets or Sets ShortBankrupt
        /// </summary>
        [DataMember(Name="shortBankrupt", EmitDefaultValue=false)]
        public double? ShortBankrupt { get; set; }
  
        
        /// <summary>
        /// Gets or Sets TaxBase
        /// </summary>
        [DataMember(Name="taxBase", EmitDefaultValue=false)]
        public double? TaxBase { get; set; }
  
        
        /// <summary>
        /// Gets or Sets IndicativeTaxRate
        /// </summary>
        [DataMember(Name="indicativeTaxRate", EmitDefaultValue=false)]
        public double? IndicativeTaxRate { get; set; }
  
        
        /// <summary>
        /// Gets or Sets IndicativeTax
        /// </summary>
        [DataMember(Name="indicativeTax", EmitDefaultValue=false)]
        public double? IndicativeTax { get; set; }
  
        
        /// <summary>
        /// Gets or Sets UnrealisedTax
        /// </summary>
        [DataMember(Name="unrealisedTax", EmitDefaultValue=false)]
        public double? UnrealisedTax { get; set; }
  
        
        /// <summary>
        /// Gets or Sets UnrealisedPnl
        /// </summary>
        [DataMember(Name="unrealisedPnl", EmitDefaultValue=false)]
        public double? UnrealisedPnl { get; set; }
  
        
        /// <summary>
        /// Gets or Sets UnrealisedPnlPcnt
        /// </summary>
        [DataMember(Name="unrealisedPnlPcnt", EmitDefaultValue=false)]
        public double? UnrealisedPnlPcnt { get; set; }
  
        
        /// <summary>
        /// Gets or Sets UnrealisedRoePcnt
        /// </summary>
        [DataMember(Name="unrealisedRoePcnt", EmitDefaultValue=false)]
        public double? UnrealisedRoePcnt { get; set; }
  
        
        /// <summary>
        /// Gets or Sets SimpleQty
        /// </summary>
        [DataMember(Name="simpleQty", EmitDefaultValue=false)]
        public double? SimpleQty { get; set; }
  
        
        /// <summary>
        /// Gets or Sets SimpleCost
        /// </summary>
        [DataMember(Name="simpleCost", EmitDefaultValue=false)]
        public double? SimpleCost { get; set; }
  
        
        /// <summary>
        /// Gets or Sets SimpleValue
        /// </summary>
        [DataMember(Name="simpleValue", EmitDefaultValue=false)]
        public double? SimpleValue { get; set; }
  
        
        /// <summary>
        /// Gets or Sets SimplePnl
        /// </summary>
        [DataMember(Name="simplePnl", EmitDefaultValue=false)]
        public double? SimplePnl { get; set; }
  
        
        /// <summary>
        /// Gets or Sets SimplePnlPcnt
        /// </summary>
        [DataMember(Name="simplePnlPcnt", EmitDefaultValue=false)]
        public double? SimplePnlPcnt { get; set; }
  
        
        /// <summary>
        /// Gets or Sets AvgCostPrice
        /// </summary>
        [DataMember(Name="avgCostPrice", EmitDefaultValue=false)]
        public double? AvgCostPrice { get; set; }
  
        
        /// <summary>
        /// Gets or Sets AvgEntryPrice
        /// </summary>
        [DataMember(Name="avgEntryPrice", EmitDefaultValue=false)]
        public double? AvgEntryPrice { get; set; }
  
        
        /// <summary>
        /// Gets or Sets BreakEvenPrice
        /// </summary>
        [DataMember(Name="breakEvenPrice", EmitDefaultValue=false)]
        public double? BreakEvenPrice { get; set; }
  
        
        /// <summary>
        /// Gets or Sets MarginCallPrice
        /// </summary>
        [DataMember(Name="marginCallPrice", EmitDefaultValue=false)]
        public double? MarginCallPrice { get; set; }
  
        
        /// <summary>
        /// Gets or Sets LiquidationPrice
        /// </summary>
        [DataMember(Name="liquidationPrice", EmitDefaultValue=false)]
        public double? LiquidationPrice { get; set; }
  
        
        /// <summary>
        /// Gets or Sets BankruptPrice
        /// </summary>
        [DataMember(Name="bankruptPrice", EmitDefaultValue=false)]
        public double? BankruptPrice { get; set; }
  
        
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
            sb.Append("class Position {\n");
            sb.Append("  Account: ").Append(Account).Append("\n");
            sb.Append("  Symbol: ").Append(Symbol).Append("\n");
            sb.Append("  Underlying: ").Append(Underlying).Append("\n");
            sb.Append("  QuoteCurrency: ").Append(QuoteCurrency).Append("\n");
            sb.Append("  Currency: ").Append(Currency).Append("\n");
            sb.Append("  Commission: ").Append(Commission).Append("\n");
            sb.Append("  CrossMargin: ").Append(CrossMargin).Append("\n");
            sb.Append("  RebalancedPnl: ").Append(RebalancedPnl).Append("\n");
            sb.Append("  PrevRealisedPnl: ").Append(PrevRealisedPnl).Append("\n");
            sb.Append("  PrevUnrealisedPnl: ").Append(PrevUnrealisedPnl).Append("\n");
            sb.Append("  PrevClosePrice: ").Append(PrevClosePrice).Append("\n");
            sb.Append("  OpeningTimestamp: ").Append(OpeningTimestamp).Append("\n");
            sb.Append("  OpeningQty: ").Append(OpeningQty).Append("\n");
            sb.Append("  OpeningCost: ").Append(OpeningCost).Append("\n");
            sb.Append("  OpeningComm: ").Append(OpeningComm).Append("\n");
            sb.Append("  OpenOrderBuyQty: ").Append(OpenOrderBuyQty).Append("\n");
            sb.Append("  OpenOrderBuyCost: ").Append(OpenOrderBuyCost).Append("\n");
            sb.Append("  OpenOrderBuyPremium: ").Append(OpenOrderBuyPremium).Append("\n");
            sb.Append("  OpenOrderSellQty: ").Append(OpenOrderSellQty).Append("\n");
            sb.Append("  OpenOrderSellCost: ").Append(OpenOrderSellCost).Append("\n");
            sb.Append("  OpenOrderSellPremium: ").Append(OpenOrderSellPremium).Append("\n");
            sb.Append("  ExecBuyQty: ").Append(ExecBuyQty).Append("\n");
            sb.Append("  ExecBuyCost: ").Append(ExecBuyCost).Append("\n");
            sb.Append("  ExecSellQty: ").Append(ExecSellQty).Append("\n");
            sb.Append("  ExecSellCost: ").Append(ExecSellCost).Append("\n");
            sb.Append("  ExecQty: ").Append(ExecQty).Append("\n");
            sb.Append("  ExecCost: ").Append(ExecCost).Append("\n");
            sb.Append("  ExecComm: ").Append(ExecComm).Append("\n");
            sb.Append("  CurrentTimestamp: ").Append(CurrentTimestamp).Append("\n");
            sb.Append("  CurrentQty: ").Append(CurrentQty).Append("\n");
            sb.Append("  CurrentCost: ").Append(CurrentCost).Append("\n");
            sb.Append("  CurrentComm: ").Append(CurrentComm).Append("\n");
            sb.Append("  RealisedCost: ").Append(RealisedCost).Append("\n");
            sb.Append("  UnrealisedCost: ").Append(UnrealisedCost).Append("\n");
            sb.Append("  GrossOpenCost: ").Append(GrossOpenCost).Append("\n");
            sb.Append("  GrossOpenPremium: ").Append(GrossOpenPremium).Append("\n");
            sb.Append("  GrossExecCost: ").Append(GrossExecCost).Append("\n");
            sb.Append("  IsOpen: ").Append(IsOpen).Append("\n");
            sb.Append("  MarkPrice: ").Append(MarkPrice).Append("\n");
            sb.Append("  MarkValue: ").Append(MarkValue).Append("\n");
            sb.Append("  HomeNotional: ").Append(HomeNotional).Append("\n");
            sb.Append("  ForeignNotional: ").Append(ForeignNotional).Append("\n");
            sb.Append("  PosState: ").Append(PosState).Append("\n");
            sb.Append("  PosCost: ").Append(PosCost).Append("\n");
            sb.Append("  PosCost2: ").Append(PosCost2).Append("\n");
            sb.Append("  PosCross: ").Append(PosCross).Append("\n");
            sb.Append("  PosInit: ").Append(PosInit).Append("\n");
            sb.Append("  PosComm: ").Append(PosComm).Append("\n");
            sb.Append("  PosLoss: ").Append(PosLoss).Append("\n");
            sb.Append("  PosMargin: ").Append(PosMargin).Append("\n");
            sb.Append("  PosMaint: ").Append(PosMaint).Append("\n");
            sb.Append("  PosAllowance: ").Append(PosAllowance).Append("\n");
            sb.Append("  TaxableMargin: ").Append(TaxableMargin).Append("\n");
            sb.Append("  InitMargin: ").Append(InitMargin).Append("\n");
            sb.Append("  MaintMargin: ").Append(MaintMargin).Append("\n");
            sb.Append("  SessionMargin: ").Append(SessionMargin).Append("\n");
            sb.Append("  TargetExcessMargin: ").Append(TargetExcessMargin).Append("\n");
            sb.Append("  VarMargin: ").Append(VarMargin).Append("\n");
            sb.Append("  RealisedGrossPnl: ").Append(RealisedGrossPnl).Append("\n");
            sb.Append("  RealisedTax: ").Append(RealisedTax).Append("\n");
            sb.Append("  RealisedPnl: ").Append(RealisedPnl).Append("\n");
            sb.Append("  UnrealisedGrossPnl: ").Append(UnrealisedGrossPnl).Append("\n");
            sb.Append("  LongBankrupt: ").Append(LongBankrupt).Append("\n");
            sb.Append("  ShortBankrupt: ").Append(ShortBankrupt).Append("\n");
            sb.Append("  TaxBase: ").Append(TaxBase).Append("\n");
            sb.Append("  IndicativeTaxRate: ").Append(IndicativeTaxRate).Append("\n");
            sb.Append("  IndicativeTax: ").Append(IndicativeTax).Append("\n");
            sb.Append("  UnrealisedTax: ").Append(UnrealisedTax).Append("\n");
            sb.Append("  UnrealisedPnl: ").Append(UnrealisedPnl).Append("\n");
            sb.Append("  UnrealisedPnlPcnt: ").Append(UnrealisedPnlPcnt).Append("\n");
            sb.Append("  UnrealisedRoePcnt: ").Append(UnrealisedRoePcnt).Append("\n");
            sb.Append("  SimpleQty: ").Append(SimpleQty).Append("\n");
            sb.Append("  SimpleCost: ").Append(SimpleCost).Append("\n");
            sb.Append("  SimpleValue: ").Append(SimpleValue).Append("\n");
            sb.Append("  SimplePnl: ").Append(SimplePnl).Append("\n");
            sb.Append("  SimplePnlPcnt: ").Append(SimplePnlPcnt).Append("\n");
            sb.Append("  AvgCostPrice: ").Append(AvgCostPrice).Append("\n");
            sb.Append("  AvgEntryPrice: ").Append(AvgEntryPrice).Append("\n");
            sb.Append("  BreakEvenPrice: ").Append(BreakEvenPrice).Append("\n");
            sb.Append("  MarginCallPrice: ").Append(MarginCallPrice).Append("\n");
            sb.Append("  LiquidationPrice: ").Append(LiquidationPrice).Append("\n");
            sb.Append("  BankruptPrice: ").Append(BankruptPrice).Append("\n");
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
            return this.Equals(obj as Position);
        }

        /// <summary>
        /// Returns true if Position instances are equal
        /// </summary>
        /// <param name="obj">Instance of Position to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Position other)
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
                    this.Symbol == other.Symbol ||
                    this.Symbol != null &&
                    this.Symbol.Equals(other.Symbol)
                ) && 
                (
                    this.Underlying == other.Underlying ||
                    this.Underlying != null &&
                    this.Underlying.Equals(other.Underlying)
                ) && 
                (
                    this.QuoteCurrency == other.QuoteCurrency ||
                    this.QuoteCurrency != null &&
                    this.QuoteCurrency.Equals(other.QuoteCurrency)
                ) && 
                (
                    this.Currency == other.Currency ||
                    this.Currency != null &&
                    this.Currency.Equals(other.Currency)
                ) && 
                (
                    this.Commission == other.Commission ||
                    this.Commission != null &&
                    this.Commission.Equals(other.Commission)
                ) && 
                (
                    this.CrossMargin == other.CrossMargin ||
                    this.CrossMargin != null &&
                    this.CrossMargin.Equals(other.CrossMargin)
                ) && 
                (
                    this.RebalancedPnl == other.RebalancedPnl ||
                    this.RebalancedPnl != null &&
                    this.RebalancedPnl.Equals(other.RebalancedPnl)
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
                    this.PrevClosePrice == other.PrevClosePrice ||
                    this.PrevClosePrice != null &&
                    this.PrevClosePrice.Equals(other.PrevClosePrice)
                ) && 
                (
                    this.OpeningTimestamp == other.OpeningTimestamp ||
                    this.OpeningTimestamp != null &&
                    this.OpeningTimestamp.Equals(other.OpeningTimestamp)
                ) && 
                (
                    this.OpeningQty == other.OpeningQty ||
                    this.OpeningQty != null &&
                    this.OpeningQty.Equals(other.OpeningQty)
                ) && 
                (
                    this.OpeningCost == other.OpeningCost ||
                    this.OpeningCost != null &&
                    this.OpeningCost.Equals(other.OpeningCost)
                ) && 
                (
                    this.OpeningComm == other.OpeningComm ||
                    this.OpeningComm != null &&
                    this.OpeningComm.Equals(other.OpeningComm)
                ) && 
                (
                    this.OpenOrderBuyQty == other.OpenOrderBuyQty ||
                    this.OpenOrderBuyQty != null &&
                    this.OpenOrderBuyQty.Equals(other.OpenOrderBuyQty)
                ) && 
                (
                    this.OpenOrderBuyCost == other.OpenOrderBuyCost ||
                    this.OpenOrderBuyCost != null &&
                    this.OpenOrderBuyCost.Equals(other.OpenOrderBuyCost)
                ) && 
                (
                    this.OpenOrderBuyPremium == other.OpenOrderBuyPremium ||
                    this.OpenOrderBuyPremium != null &&
                    this.OpenOrderBuyPremium.Equals(other.OpenOrderBuyPremium)
                ) && 
                (
                    this.OpenOrderSellQty == other.OpenOrderSellQty ||
                    this.OpenOrderSellQty != null &&
                    this.OpenOrderSellQty.Equals(other.OpenOrderSellQty)
                ) && 
                (
                    this.OpenOrderSellCost == other.OpenOrderSellCost ||
                    this.OpenOrderSellCost != null &&
                    this.OpenOrderSellCost.Equals(other.OpenOrderSellCost)
                ) && 
                (
                    this.OpenOrderSellPremium == other.OpenOrderSellPremium ||
                    this.OpenOrderSellPremium != null &&
                    this.OpenOrderSellPremium.Equals(other.OpenOrderSellPremium)
                ) && 
                (
                    this.ExecBuyQty == other.ExecBuyQty ||
                    this.ExecBuyQty != null &&
                    this.ExecBuyQty.Equals(other.ExecBuyQty)
                ) && 
                (
                    this.ExecBuyCost == other.ExecBuyCost ||
                    this.ExecBuyCost != null &&
                    this.ExecBuyCost.Equals(other.ExecBuyCost)
                ) && 
                (
                    this.ExecSellQty == other.ExecSellQty ||
                    this.ExecSellQty != null &&
                    this.ExecSellQty.Equals(other.ExecSellQty)
                ) && 
                (
                    this.ExecSellCost == other.ExecSellCost ||
                    this.ExecSellCost != null &&
                    this.ExecSellCost.Equals(other.ExecSellCost)
                ) && 
                (
                    this.ExecQty == other.ExecQty ||
                    this.ExecQty != null &&
                    this.ExecQty.Equals(other.ExecQty)
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
                    this.CurrentTimestamp == other.CurrentTimestamp ||
                    this.CurrentTimestamp != null &&
                    this.CurrentTimestamp.Equals(other.CurrentTimestamp)
                ) && 
                (
                    this.CurrentQty == other.CurrentQty ||
                    this.CurrentQty != null &&
                    this.CurrentQty.Equals(other.CurrentQty)
                ) && 
                (
                    this.CurrentCost == other.CurrentCost ||
                    this.CurrentCost != null &&
                    this.CurrentCost.Equals(other.CurrentCost)
                ) && 
                (
                    this.CurrentComm == other.CurrentComm ||
                    this.CurrentComm != null &&
                    this.CurrentComm.Equals(other.CurrentComm)
                ) && 
                (
                    this.RealisedCost == other.RealisedCost ||
                    this.RealisedCost != null &&
                    this.RealisedCost.Equals(other.RealisedCost)
                ) && 
                (
                    this.UnrealisedCost == other.UnrealisedCost ||
                    this.UnrealisedCost != null &&
                    this.UnrealisedCost.Equals(other.UnrealisedCost)
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
                    this.IsOpen == other.IsOpen ||
                    this.IsOpen != null &&
                    this.IsOpen.Equals(other.IsOpen)
                ) && 
                (
                    this.MarkPrice == other.MarkPrice ||
                    this.MarkPrice != null &&
                    this.MarkPrice.Equals(other.MarkPrice)
                ) && 
                (
                    this.MarkValue == other.MarkValue ||
                    this.MarkValue != null &&
                    this.MarkValue.Equals(other.MarkValue)
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
                    this.PosState == other.PosState ||
                    this.PosState != null &&
                    this.PosState.Equals(other.PosState)
                ) && 
                (
                    this.PosCost == other.PosCost ||
                    this.PosCost != null &&
                    this.PosCost.Equals(other.PosCost)
                ) && 
                (
                    this.PosCost2 == other.PosCost2 ||
                    this.PosCost2 != null &&
                    this.PosCost2.Equals(other.PosCost2)
                ) && 
                (
                    this.PosCross == other.PosCross ||
                    this.PosCross != null &&
                    this.PosCross.Equals(other.PosCross)
                ) && 
                (
                    this.PosInit == other.PosInit ||
                    this.PosInit != null &&
                    this.PosInit.Equals(other.PosInit)
                ) && 
                (
                    this.PosComm == other.PosComm ||
                    this.PosComm != null &&
                    this.PosComm.Equals(other.PosComm)
                ) && 
                (
                    this.PosLoss == other.PosLoss ||
                    this.PosLoss != null &&
                    this.PosLoss.Equals(other.PosLoss)
                ) && 
                (
                    this.PosMargin == other.PosMargin ||
                    this.PosMargin != null &&
                    this.PosMargin.Equals(other.PosMargin)
                ) && 
                (
                    this.PosMaint == other.PosMaint ||
                    this.PosMaint != null &&
                    this.PosMaint.Equals(other.PosMaint)
                ) && 
                (
                    this.PosAllowance == other.PosAllowance ||
                    this.PosAllowance != null &&
                    this.PosAllowance.Equals(other.PosAllowance)
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
                    this.RealisedGrossPnl == other.RealisedGrossPnl ||
                    this.RealisedGrossPnl != null &&
                    this.RealisedGrossPnl.Equals(other.RealisedGrossPnl)
                ) && 
                (
                    this.RealisedTax == other.RealisedTax ||
                    this.RealisedTax != null &&
                    this.RealisedTax.Equals(other.RealisedTax)
                ) && 
                (
                    this.RealisedPnl == other.RealisedPnl ||
                    this.RealisedPnl != null &&
                    this.RealisedPnl.Equals(other.RealisedPnl)
                ) && 
                (
                    this.UnrealisedGrossPnl == other.UnrealisedGrossPnl ||
                    this.UnrealisedGrossPnl != null &&
                    this.UnrealisedGrossPnl.Equals(other.UnrealisedGrossPnl)
                ) && 
                (
                    this.LongBankrupt == other.LongBankrupt ||
                    this.LongBankrupt != null &&
                    this.LongBankrupt.Equals(other.LongBankrupt)
                ) && 
                (
                    this.ShortBankrupt == other.ShortBankrupt ||
                    this.ShortBankrupt != null &&
                    this.ShortBankrupt.Equals(other.ShortBankrupt)
                ) && 
                (
                    this.TaxBase == other.TaxBase ||
                    this.TaxBase != null &&
                    this.TaxBase.Equals(other.TaxBase)
                ) && 
                (
                    this.IndicativeTaxRate == other.IndicativeTaxRate ||
                    this.IndicativeTaxRate != null &&
                    this.IndicativeTaxRate.Equals(other.IndicativeTaxRate)
                ) && 
                (
                    this.IndicativeTax == other.IndicativeTax ||
                    this.IndicativeTax != null &&
                    this.IndicativeTax.Equals(other.IndicativeTax)
                ) && 
                (
                    this.UnrealisedTax == other.UnrealisedTax ||
                    this.UnrealisedTax != null &&
                    this.UnrealisedTax.Equals(other.UnrealisedTax)
                ) && 
                (
                    this.UnrealisedPnl == other.UnrealisedPnl ||
                    this.UnrealisedPnl != null &&
                    this.UnrealisedPnl.Equals(other.UnrealisedPnl)
                ) && 
                (
                    this.UnrealisedPnlPcnt == other.UnrealisedPnlPcnt ||
                    this.UnrealisedPnlPcnt != null &&
                    this.UnrealisedPnlPcnt.Equals(other.UnrealisedPnlPcnt)
                ) && 
                (
                    this.UnrealisedRoePcnt == other.UnrealisedRoePcnt ||
                    this.UnrealisedRoePcnt != null &&
                    this.UnrealisedRoePcnt.Equals(other.UnrealisedRoePcnt)
                ) && 
                (
                    this.SimpleQty == other.SimpleQty ||
                    this.SimpleQty != null &&
                    this.SimpleQty.Equals(other.SimpleQty)
                ) && 
                (
                    this.SimpleCost == other.SimpleCost ||
                    this.SimpleCost != null &&
                    this.SimpleCost.Equals(other.SimpleCost)
                ) && 
                (
                    this.SimpleValue == other.SimpleValue ||
                    this.SimpleValue != null &&
                    this.SimpleValue.Equals(other.SimpleValue)
                ) && 
                (
                    this.SimplePnl == other.SimplePnl ||
                    this.SimplePnl != null &&
                    this.SimplePnl.Equals(other.SimplePnl)
                ) && 
                (
                    this.SimplePnlPcnt == other.SimplePnlPcnt ||
                    this.SimplePnlPcnt != null &&
                    this.SimplePnlPcnt.Equals(other.SimplePnlPcnt)
                ) && 
                (
                    this.AvgCostPrice == other.AvgCostPrice ||
                    this.AvgCostPrice != null &&
                    this.AvgCostPrice.Equals(other.AvgCostPrice)
                ) && 
                (
                    this.AvgEntryPrice == other.AvgEntryPrice ||
                    this.AvgEntryPrice != null &&
                    this.AvgEntryPrice.Equals(other.AvgEntryPrice)
                ) && 
                (
                    this.BreakEvenPrice == other.BreakEvenPrice ||
                    this.BreakEvenPrice != null &&
                    this.BreakEvenPrice.Equals(other.BreakEvenPrice)
                ) && 
                (
                    this.MarginCallPrice == other.MarginCallPrice ||
                    this.MarginCallPrice != null &&
                    this.MarginCallPrice.Equals(other.MarginCallPrice)
                ) && 
                (
                    this.LiquidationPrice == other.LiquidationPrice ||
                    this.LiquidationPrice != null &&
                    this.LiquidationPrice.Equals(other.LiquidationPrice)
                ) && 
                (
                    this.BankruptPrice == other.BankruptPrice ||
                    this.BankruptPrice != null &&
                    this.BankruptPrice.Equals(other.BankruptPrice)
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
                
                if (this.Symbol != null)
                    hash = hash * 57 + this.Symbol.GetHashCode();
                
                if (this.Underlying != null)
                    hash = hash * 57 + this.Underlying.GetHashCode();
                
                if (this.QuoteCurrency != null)
                    hash = hash * 57 + this.QuoteCurrency.GetHashCode();
                
                if (this.Currency != null)
                    hash = hash * 57 + this.Currency.GetHashCode();
                
                if (this.Commission != null)
                    hash = hash * 57 + this.Commission.GetHashCode();
                
                if (this.CrossMargin != null)
                    hash = hash * 57 + this.CrossMargin.GetHashCode();
                
                if (this.RebalancedPnl != null)
                    hash = hash * 57 + this.RebalancedPnl.GetHashCode();
                
                if (this.PrevRealisedPnl != null)
                    hash = hash * 57 + this.PrevRealisedPnl.GetHashCode();
                
                if (this.PrevUnrealisedPnl != null)
                    hash = hash * 57 + this.PrevUnrealisedPnl.GetHashCode();
                
                if (this.PrevClosePrice != null)
                    hash = hash * 57 + this.PrevClosePrice.GetHashCode();
                
                if (this.OpeningTimestamp != null)
                    hash = hash * 57 + this.OpeningTimestamp.GetHashCode();
                
                if (this.OpeningQty != null)
                    hash = hash * 57 + this.OpeningQty.GetHashCode();
                
                if (this.OpeningCost != null)
                    hash = hash * 57 + this.OpeningCost.GetHashCode();
                
                if (this.OpeningComm != null)
                    hash = hash * 57 + this.OpeningComm.GetHashCode();
                
                if (this.OpenOrderBuyQty != null)
                    hash = hash * 57 + this.OpenOrderBuyQty.GetHashCode();
                
                if (this.OpenOrderBuyCost != null)
                    hash = hash * 57 + this.OpenOrderBuyCost.GetHashCode();
                
                if (this.OpenOrderBuyPremium != null)
                    hash = hash * 57 + this.OpenOrderBuyPremium.GetHashCode();
                
                if (this.OpenOrderSellQty != null)
                    hash = hash * 57 + this.OpenOrderSellQty.GetHashCode();
                
                if (this.OpenOrderSellCost != null)
                    hash = hash * 57 + this.OpenOrderSellCost.GetHashCode();
                
                if (this.OpenOrderSellPremium != null)
                    hash = hash * 57 + this.OpenOrderSellPremium.GetHashCode();
                
                if (this.ExecBuyQty != null)
                    hash = hash * 57 + this.ExecBuyQty.GetHashCode();
                
                if (this.ExecBuyCost != null)
                    hash = hash * 57 + this.ExecBuyCost.GetHashCode();
                
                if (this.ExecSellQty != null)
                    hash = hash * 57 + this.ExecSellQty.GetHashCode();
                
                if (this.ExecSellCost != null)
                    hash = hash * 57 + this.ExecSellCost.GetHashCode();
                
                if (this.ExecQty != null)
                    hash = hash * 57 + this.ExecQty.GetHashCode();
                
                if (this.ExecCost != null)
                    hash = hash * 57 + this.ExecCost.GetHashCode();
                
                if (this.ExecComm != null)
                    hash = hash * 57 + this.ExecComm.GetHashCode();
                
                if (this.CurrentTimestamp != null)
                    hash = hash * 57 + this.CurrentTimestamp.GetHashCode();
                
                if (this.CurrentQty != null)
                    hash = hash * 57 + this.CurrentQty.GetHashCode();
                
                if (this.CurrentCost != null)
                    hash = hash * 57 + this.CurrentCost.GetHashCode();
                
                if (this.CurrentComm != null)
                    hash = hash * 57 + this.CurrentComm.GetHashCode();
                
                if (this.RealisedCost != null)
                    hash = hash * 57 + this.RealisedCost.GetHashCode();
                
                if (this.UnrealisedCost != null)
                    hash = hash * 57 + this.UnrealisedCost.GetHashCode();
                
                if (this.GrossOpenCost != null)
                    hash = hash * 57 + this.GrossOpenCost.GetHashCode();
                
                if (this.GrossOpenPremium != null)
                    hash = hash * 57 + this.GrossOpenPremium.GetHashCode();
                
                if (this.GrossExecCost != null)
                    hash = hash * 57 + this.GrossExecCost.GetHashCode();
                
                if (this.IsOpen != null)
                    hash = hash * 57 + this.IsOpen.GetHashCode();
                
                if (this.MarkPrice != null)
                    hash = hash * 57 + this.MarkPrice.GetHashCode();
                
                if (this.MarkValue != null)
                    hash = hash * 57 + this.MarkValue.GetHashCode();
                
                if (this.HomeNotional != null)
                    hash = hash * 57 + this.HomeNotional.GetHashCode();
                
                if (this.ForeignNotional != null)
                    hash = hash * 57 + this.ForeignNotional.GetHashCode();
                
                if (this.PosState != null)
                    hash = hash * 57 + this.PosState.GetHashCode();
                
                if (this.PosCost != null)
                    hash = hash * 57 + this.PosCost.GetHashCode();
                
                if (this.PosCost2 != null)
                    hash = hash * 57 + this.PosCost2.GetHashCode();
                
                if (this.PosCross != null)
                    hash = hash * 57 + this.PosCross.GetHashCode();
                
                if (this.PosInit != null)
                    hash = hash * 57 + this.PosInit.GetHashCode();
                
                if (this.PosComm != null)
                    hash = hash * 57 + this.PosComm.GetHashCode();
                
                if (this.PosLoss != null)
                    hash = hash * 57 + this.PosLoss.GetHashCode();
                
                if (this.PosMargin != null)
                    hash = hash * 57 + this.PosMargin.GetHashCode();
                
                if (this.PosMaint != null)
                    hash = hash * 57 + this.PosMaint.GetHashCode();
                
                if (this.PosAllowance != null)
                    hash = hash * 57 + this.PosAllowance.GetHashCode();
                
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
                
                if (this.RealisedGrossPnl != null)
                    hash = hash * 57 + this.RealisedGrossPnl.GetHashCode();
                
                if (this.RealisedTax != null)
                    hash = hash * 57 + this.RealisedTax.GetHashCode();
                
                if (this.RealisedPnl != null)
                    hash = hash * 57 + this.RealisedPnl.GetHashCode();
                
                if (this.UnrealisedGrossPnl != null)
                    hash = hash * 57 + this.UnrealisedGrossPnl.GetHashCode();
                
                if (this.LongBankrupt != null)
                    hash = hash * 57 + this.LongBankrupt.GetHashCode();
                
                if (this.ShortBankrupt != null)
                    hash = hash * 57 + this.ShortBankrupt.GetHashCode();
                
                if (this.TaxBase != null)
                    hash = hash * 57 + this.TaxBase.GetHashCode();
                
                if (this.IndicativeTaxRate != null)
                    hash = hash * 57 + this.IndicativeTaxRate.GetHashCode();
                
                if (this.IndicativeTax != null)
                    hash = hash * 57 + this.IndicativeTax.GetHashCode();
                
                if (this.UnrealisedTax != null)
                    hash = hash * 57 + this.UnrealisedTax.GetHashCode();
                
                if (this.UnrealisedPnl != null)
                    hash = hash * 57 + this.UnrealisedPnl.GetHashCode();
                
                if (this.UnrealisedPnlPcnt != null)
                    hash = hash * 57 + this.UnrealisedPnlPcnt.GetHashCode();
                
                if (this.UnrealisedRoePcnt != null)
                    hash = hash * 57 + this.UnrealisedRoePcnt.GetHashCode();
                
                if (this.SimpleQty != null)
                    hash = hash * 57 + this.SimpleQty.GetHashCode();
                
                if (this.SimpleCost != null)
                    hash = hash * 57 + this.SimpleCost.GetHashCode();
                
                if (this.SimpleValue != null)
                    hash = hash * 57 + this.SimpleValue.GetHashCode();
                
                if (this.SimplePnl != null)
                    hash = hash * 57 + this.SimplePnl.GetHashCode();
                
                if (this.SimplePnlPcnt != null)
                    hash = hash * 57 + this.SimplePnlPcnt.GetHashCode();
                
                if (this.AvgCostPrice != null)
                    hash = hash * 57 + this.AvgCostPrice.GetHashCode();
                
                if (this.AvgEntryPrice != null)
                    hash = hash * 57 + this.AvgEntryPrice.GetHashCode();
                
                if (this.BreakEvenPrice != null)
                    hash = hash * 57 + this.BreakEvenPrice.GetHashCode();
                
                if (this.MarginCallPrice != null)
                    hash = hash * 57 + this.MarginCallPrice.GetHashCode();
                
                if (this.LiquidationPrice != null)
                    hash = hash * 57 + this.LiquidationPrice.GetHashCode();
                
                if (this.BankruptPrice != null)
                    hash = hash * 57 + this.BankruptPrice.GetHashCode();
                
                if (this.Timestamp != null)
                    hash = hash * 57 + this.Timestamp.GetHashCode();
                
                return hash;
            }
        }

    }
}
