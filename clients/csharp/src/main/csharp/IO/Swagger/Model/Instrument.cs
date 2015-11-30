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
    public class Instrument : IEquatable<Instrument>
    {
        
        /// <summary>
        /// Gets or Sets Symbol
        /// </summary>
        [DataMember(Name="symbol", EmitDefaultValue=false)]
        public string Symbol { get; set; }
  
        
        /// <summary>
        /// Gets or Sets RootSymbol
        /// </summary>
        [DataMember(Name="rootSymbol", EmitDefaultValue=false)]
        public string RootSymbol { get; set; }
  
        
        /// <summary>
        /// Gets or Sets State
        /// </summary>
        [DataMember(Name="state", EmitDefaultValue=false)]
        public string State { get; set; }
  
        
        /// <summary>
        /// Gets or Sets Typ
        /// </summary>
        [DataMember(Name="typ", EmitDefaultValue=false)]
        public string Typ { get; set; }
  
        
        /// <summary>
        /// Gets or Sets Listing
        /// </summary>
        [DataMember(Name="listing", EmitDefaultValue=false)]
        public DateTime? Listing { get; set; }
  
        
        /// <summary>
        /// Gets or Sets Front
        /// </summary>
        [DataMember(Name="front", EmitDefaultValue=false)]
        public DateTime? Front { get; set; }
  
        
        /// <summary>
        /// Gets or Sets Expiry
        /// </summary>
        [DataMember(Name="expiry", EmitDefaultValue=false)]
        public DateTime? Expiry { get; set; }
  
        
        /// <summary>
        /// Gets or Sets RelistInterval
        /// </summary>
        [DataMember(Name="relistInterval", EmitDefaultValue=false)]
        public DateTime? RelistInterval { get; set; }
  
        
        /// <summary>
        /// Gets or Sets InverseLeg
        /// </summary>
        [DataMember(Name="inverseLeg", EmitDefaultValue=false)]
        public string InverseLeg { get; set; }
  
        
        /// <summary>
        /// Gets or Sets SellLeg
        /// </summary>
        [DataMember(Name="sellLeg", EmitDefaultValue=false)]
        public string SellLeg { get; set; }
  
        
        /// <summary>
        /// Gets or Sets BuyLeg
        /// </summary>
        [DataMember(Name="buyLeg", EmitDefaultValue=false)]
        public string BuyLeg { get; set; }
  
        
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
        /// Gets or Sets UnderlyingSymbol
        /// </summary>
        [DataMember(Name="underlyingSymbol", EmitDefaultValue=false)]
        public string UnderlyingSymbol { get; set; }
  
        
        /// <summary>
        /// Gets or Sets Reference
        /// </summary>
        [DataMember(Name="reference", EmitDefaultValue=false)]
        public string Reference { get; set; }
  
        
        /// <summary>
        /// Gets or Sets ReferenceSymbol
        /// </summary>
        [DataMember(Name="referenceSymbol", EmitDefaultValue=false)]
        public string ReferenceSymbol { get; set; }
  
        
        /// <summary>
        /// Gets or Sets TickSize
        /// </summary>
        [DataMember(Name="tickSize", EmitDefaultValue=false)]
        public double? TickSize { get; set; }
  
        
        /// <summary>
        /// Gets or Sets Multiplier
        /// </summary>
        [DataMember(Name="multiplier", EmitDefaultValue=false)]
        public double? Multiplier { get; set; }
  
        
        /// <summary>
        /// Gets or Sets SettlCurrency
        /// </summary>
        [DataMember(Name="settlCurrency", EmitDefaultValue=false)]
        public string SettlCurrency { get; set; }
  
        
        /// <summary>
        /// Gets or Sets UnderlyingToSettleMultiplier
        /// </summary>
        [DataMember(Name="underlyingToSettleMultiplier", EmitDefaultValue=false)]
        public double? UnderlyingToSettleMultiplier { get; set; }
  
        
        /// <summary>
        /// Gets or Sets QuoteToSettleMultiplier
        /// </summary>
        [DataMember(Name="quoteToSettleMultiplier", EmitDefaultValue=false)]
        public double? QuoteToSettleMultiplier { get; set; }
  
        
        /// <summary>
        /// Gets or Sets IsQuanto
        /// </summary>
        [DataMember(Name="isQuanto", EmitDefaultValue=false)]
        public bool? IsQuanto { get; set; }
  
        
        /// <summary>
        /// Gets or Sets IsInverse
        /// </summary>
        [DataMember(Name="isInverse", EmitDefaultValue=false)]
        public bool? IsInverse { get; set; }
  
        
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
        /// Gets or Sets Limit
        /// </summary>
        [DataMember(Name="limit", EmitDefaultValue=false)]
        public double? Limit { get; set; }
  
        
        /// <summary>
        /// Gets or Sets Capped
        /// </summary>
        [DataMember(Name="capped", EmitDefaultValue=false)]
        public bool? Capped { get; set; }
  
        
        /// <summary>
        /// Gets or Sets Taxed
        /// </summary>
        [DataMember(Name="taxed", EmitDefaultValue=false)]
        public bool? Taxed { get; set; }
  
        
        /// <summary>
        /// Gets or Sets MakerFee
        /// </summary>
        [DataMember(Name="makerFee", EmitDefaultValue=false)]
        public double? MakerFee { get; set; }
  
        
        /// <summary>
        /// Gets or Sets TakerFee
        /// </summary>
        [DataMember(Name="takerFee", EmitDefaultValue=false)]
        public double? TakerFee { get; set; }
  
        
        /// <summary>
        /// Gets or Sets InsuranceFee
        /// </summary>
        [DataMember(Name="insuranceFee", EmitDefaultValue=false)]
        public double? InsuranceFee { get; set; }
  
        
        /// <summary>
        /// Gets or Sets HedgerMakerFee
        /// </summary>
        [DataMember(Name="hedgerMakerFee", EmitDefaultValue=false)]
        public double? HedgerMakerFee { get; set; }
  
        
        /// <summary>
        /// Gets or Sets HedgerTakerFee
        /// </summary>
        [DataMember(Name="hedgerTakerFee", EmitDefaultValue=false)]
        public double? HedgerTakerFee { get; set; }
  
        
        /// <summary>
        /// Gets or Sets HedgerInsuranceFee
        /// </summary>
        [DataMember(Name="hedgerInsuranceFee", EmitDefaultValue=false)]
        public double? HedgerInsuranceFee { get; set; }
  
        
        /// <summary>
        /// Gets or Sets OpeningTimestamp
        /// </summary>
        [DataMember(Name="openingTimestamp", EmitDefaultValue=false)]
        public DateTime? OpeningTimestamp { get; set; }
  
        
        /// <summary>
        /// Gets or Sets ClosingTimestamp
        /// </summary>
        [DataMember(Name="closingTimestamp", EmitDefaultValue=false)]
        public DateTime? ClosingTimestamp { get; set; }
  
        
        /// <summary>
        /// Gets or Sets SessionInterval
        /// </summary>
        [DataMember(Name="sessionInterval", EmitDefaultValue=false)]
        public DateTime? SessionInterval { get; set; }
  
        
        /// <summary>
        /// Gets or Sets PrevClosePrice
        /// </summary>
        [DataMember(Name="prevClosePrice", EmitDefaultValue=false)]
        public double? PrevClosePrice { get; set; }
  
        
        /// <summary>
        /// Gets or Sets LimitDownPrice
        /// </summary>
        [DataMember(Name="limitDownPrice", EmitDefaultValue=false)]
        public double? LimitDownPrice { get; set; }
  
        
        /// <summary>
        /// Gets or Sets LimitUpPrice
        /// </summary>
        [DataMember(Name="limitUpPrice", EmitDefaultValue=false)]
        public double? LimitUpPrice { get; set; }
  
        
        /// <summary>
        /// Gets or Sets BankruptLimitDownPrice
        /// </summary>
        [DataMember(Name="bankruptLimitDownPrice", EmitDefaultValue=false)]
        public double? BankruptLimitDownPrice { get; set; }
  
        
        /// <summary>
        /// Gets or Sets BankruptLimitUpPrice
        /// </summary>
        [DataMember(Name="bankruptLimitUpPrice", EmitDefaultValue=false)]
        public double? BankruptLimitUpPrice { get; set; }
  
        
        /// <summary>
        /// Gets or Sets PrevTotalVolume
        /// </summary>
        [DataMember(Name="prevTotalVolume", EmitDefaultValue=false)]
        public double? PrevTotalVolume { get; set; }
  
        
        /// <summary>
        /// Gets or Sets TotalVolume
        /// </summary>
        [DataMember(Name="totalVolume", EmitDefaultValue=false)]
        public double? TotalVolume { get; set; }
  
        
        /// <summary>
        /// Gets or Sets Volume
        /// </summary>
        [DataMember(Name="volume", EmitDefaultValue=false)]
        public double? Volume { get; set; }
  
        
        /// <summary>
        /// Gets or Sets Volume24h
        /// </summary>
        [DataMember(Name="volume24h", EmitDefaultValue=false)]
        public double? Volume24h { get; set; }
  
        
        /// <summary>
        /// Gets or Sets PrevTotalTurnover
        /// </summary>
        [DataMember(Name="prevTotalTurnover", EmitDefaultValue=false)]
        public double? PrevTotalTurnover { get; set; }
  
        
        /// <summary>
        /// Gets or Sets TotalTurnover
        /// </summary>
        [DataMember(Name="totalTurnover", EmitDefaultValue=false)]
        public double? TotalTurnover { get; set; }
  
        
        /// <summary>
        /// Gets or Sets Turnover
        /// </summary>
        [DataMember(Name="turnover", EmitDefaultValue=false)]
        public double? Turnover { get; set; }
  
        
        /// <summary>
        /// Gets or Sets Turnover24h
        /// </summary>
        [DataMember(Name="turnover24h", EmitDefaultValue=false)]
        public double? Turnover24h { get; set; }
  
        
        /// <summary>
        /// Gets or Sets PrevPrice24h
        /// </summary>
        [DataMember(Name="prevPrice24h", EmitDefaultValue=false)]
        public double? PrevPrice24h { get; set; }
  
        
        /// <summary>
        /// Gets or Sets Vwap
        /// </summary>
        [DataMember(Name="vwap", EmitDefaultValue=false)]
        public double? Vwap { get; set; }
  
        
        /// <summary>
        /// Gets or Sets HighPrice
        /// </summary>
        [DataMember(Name="highPrice", EmitDefaultValue=false)]
        public double? HighPrice { get; set; }
  
        
        /// <summary>
        /// Gets or Sets LowPrice
        /// </summary>
        [DataMember(Name="lowPrice", EmitDefaultValue=false)]
        public double? LowPrice { get; set; }
  
        
        /// <summary>
        /// Gets or Sets LastPrice
        /// </summary>
        [DataMember(Name="lastPrice", EmitDefaultValue=false)]
        public double? LastPrice { get; set; }
  
        
        /// <summary>
        /// Gets or Sets LastPriceProtected
        /// </summary>
        [DataMember(Name="lastPriceProtected", EmitDefaultValue=false)]
        public double? LastPriceProtected { get; set; }
  
        
        /// <summary>
        /// Gets or Sets LastTickDirection
        /// </summary>
        [DataMember(Name="lastTickDirection", EmitDefaultValue=false)]
        public string LastTickDirection { get; set; }
  
        
        /// <summary>
        /// Gets or Sets LastChangePcnt
        /// </summary>
        [DataMember(Name="lastChangePcnt", EmitDefaultValue=false)]
        public double? LastChangePcnt { get; set; }
  
        
        /// <summary>
        /// Gets or Sets BidPrice
        /// </summary>
        [DataMember(Name="bidPrice", EmitDefaultValue=false)]
        public double? BidPrice { get; set; }
  
        
        /// <summary>
        /// Gets or Sets MidPrice
        /// </summary>
        [DataMember(Name="midPrice", EmitDefaultValue=false)]
        public double? MidPrice { get; set; }
  
        
        /// <summary>
        /// Gets or Sets AskPrice
        /// </summary>
        [DataMember(Name="askPrice", EmitDefaultValue=false)]
        public double? AskPrice { get; set; }
  
        
        /// <summary>
        /// Gets or Sets ImpactBidPrice
        /// </summary>
        [DataMember(Name="impactBidPrice", EmitDefaultValue=false)]
        public double? ImpactBidPrice { get; set; }
  
        
        /// <summary>
        /// Gets or Sets ImpactMidPrice
        /// </summary>
        [DataMember(Name="impactMidPrice", EmitDefaultValue=false)]
        public double? ImpactMidPrice { get; set; }
  
        
        /// <summary>
        /// Gets or Sets ImpactAskPrice
        /// </summary>
        [DataMember(Name="impactAskPrice", EmitDefaultValue=false)]
        public double? ImpactAskPrice { get; set; }
  
        
        /// <summary>
        /// Gets or Sets HasLiquidity
        /// </summary>
        [DataMember(Name="hasLiquidity", EmitDefaultValue=false)]
        public bool? HasLiquidity { get; set; }
  
        
        /// <summary>
        /// Gets or Sets OpenInterest
        /// </summary>
        [DataMember(Name="openInterest", EmitDefaultValue=false)]
        public double? OpenInterest { get; set; }
  
        
        /// <summary>
        /// Gets or Sets OpenValue
        /// </summary>
        [DataMember(Name="openValue", EmitDefaultValue=false)]
        public double? OpenValue { get; set; }
  
        
        /// <summary>
        /// Gets or Sets FairMethod
        /// </summary>
        [DataMember(Name="fairMethod", EmitDefaultValue=false)]
        public string FairMethod { get; set; }
  
        
        /// <summary>
        /// Gets or Sets FairBasisRate
        /// </summary>
        [DataMember(Name="fairBasisRate", EmitDefaultValue=false)]
        public double? FairBasisRate { get; set; }
  
        
        /// <summary>
        /// Gets or Sets FairBasis
        /// </summary>
        [DataMember(Name="fairBasis", EmitDefaultValue=false)]
        public double? FairBasis { get; set; }
  
        
        /// <summary>
        /// Gets or Sets FairPrice
        /// </summary>
        [DataMember(Name="fairPrice", EmitDefaultValue=false)]
        public double? FairPrice { get; set; }
  
        
        /// <summary>
        /// Gets or Sets MarkMethod
        /// </summary>
        [DataMember(Name="markMethod", EmitDefaultValue=false)]
        public string MarkMethod { get; set; }
  
        
        /// <summary>
        /// Gets or Sets MarkPrice
        /// </summary>
        [DataMember(Name="markPrice", EmitDefaultValue=false)]
        public double? MarkPrice { get; set; }
  
        
        /// <summary>
        /// Gets or Sets IndicativeTaxRate
        /// </summary>
        [DataMember(Name="indicativeTaxRate", EmitDefaultValue=false)]
        public double? IndicativeTaxRate { get; set; }
  
        
        /// <summary>
        /// Gets or Sets IndicativeSettlePrice
        /// </summary>
        [DataMember(Name="indicativeSettlePrice", EmitDefaultValue=false)]
        public double? IndicativeSettlePrice { get; set; }
  
        
        /// <summary>
        /// Gets or Sets SettledPrice
        /// </summary>
        [DataMember(Name="settledPrice", EmitDefaultValue=false)]
        public double? SettledPrice { get; set; }
  
        
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
            sb.Append("class Instrument {\n");
            sb.Append("  Symbol: ").Append(Symbol).Append("\n");
            sb.Append("  RootSymbol: ").Append(RootSymbol).Append("\n");
            sb.Append("  State: ").Append(State).Append("\n");
            sb.Append("  Typ: ").Append(Typ).Append("\n");
            sb.Append("  Listing: ").Append(Listing).Append("\n");
            sb.Append("  Front: ").Append(Front).Append("\n");
            sb.Append("  Expiry: ").Append(Expiry).Append("\n");
            sb.Append("  RelistInterval: ").Append(RelistInterval).Append("\n");
            sb.Append("  InverseLeg: ").Append(InverseLeg).Append("\n");
            sb.Append("  SellLeg: ").Append(SellLeg).Append("\n");
            sb.Append("  BuyLeg: ").Append(BuyLeg).Append("\n");
            sb.Append("  Underlying: ").Append(Underlying).Append("\n");
            sb.Append("  QuoteCurrency: ").Append(QuoteCurrency).Append("\n");
            sb.Append("  UnderlyingSymbol: ").Append(UnderlyingSymbol).Append("\n");
            sb.Append("  Reference: ").Append(Reference).Append("\n");
            sb.Append("  ReferenceSymbol: ").Append(ReferenceSymbol).Append("\n");
            sb.Append("  TickSize: ").Append(TickSize).Append("\n");
            sb.Append("  Multiplier: ").Append(Multiplier).Append("\n");
            sb.Append("  SettlCurrency: ").Append(SettlCurrency).Append("\n");
            sb.Append("  UnderlyingToSettleMultiplier: ").Append(UnderlyingToSettleMultiplier).Append("\n");
            sb.Append("  QuoteToSettleMultiplier: ").Append(QuoteToSettleMultiplier).Append("\n");
            sb.Append("  IsQuanto: ").Append(IsQuanto).Append("\n");
            sb.Append("  IsInverse: ").Append(IsInverse).Append("\n");
            sb.Append("  InitMargin: ").Append(InitMargin).Append("\n");
            sb.Append("  MaintMargin: ").Append(MaintMargin).Append("\n");
            sb.Append("  Limit: ").Append(Limit).Append("\n");
            sb.Append("  Capped: ").Append(Capped).Append("\n");
            sb.Append("  Taxed: ").Append(Taxed).Append("\n");
            sb.Append("  MakerFee: ").Append(MakerFee).Append("\n");
            sb.Append("  TakerFee: ").Append(TakerFee).Append("\n");
            sb.Append("  InsuranceFee: ").Append(InsuranceFee).Append("\n");
            sb.Append("  HedgerMakerFee: ").Append(HedgerMakerFee).Append("\n");
            sb.Append("  HedgerTakerFee: ").Append(HedgerTakerFee).Append("\n");
            sb.Append("  HedgerInsuranceFee: ").Append(HedgerInsuranceFee).Append("\n");
            sb.Append("  OpeningTimestamp: ").Append(OpeningTimestamp).Append("\n");
            sb.Append("  ClosingTimestamp: ").Append(ClosingTimestamp).Append("\n");
            sb.Append("  SessionInterval: ").Append(SessionInterval).Append("\n");
            sb.Append("  PrevClosePrice: ").Append(PrevClosePrice).Append("\n");
            sb.Append("  LimitDownPrice: ").Append(LimitDownPrice).Append("\n");
            sb.Append("  LimitUpPrice: ").Append(LimitUpPrice).Append("\n");
            sb.Append("  BankruptLimitDownPrice: ").Append(BankruptLimitDownPrice).Append("\n");
            sb.Append("  BankruptLimitUpPrice: ").Append(BankruptLimitUpPrice).Append("\n");
            sb.Append("  PrevTotalVolume: ").Append(PrevTotalVolume).Append("\n");
            sb.Append("  TotalVolume: ").Append(TotalVolume).Append("\n");
            sb.Append("  Volume: ").Append(Volume).Append("\n");
            sb.Append("  Volume24h: ").Append(Volume24h).Append("\n");
            sb.Append("  PrevTotalTurnover: ").Append(PrevTotalTurnover).Append("\n");
            sb.Append("  TotalTurnover: ").Append(TotalTurnover).Append("\n");
            sb.Append("  Turnover: ").Append(Turnover).Append("\n");
            sb.Append("  Turnover24h: ").Append(Turnover24h).Append("\n");
            sb.Append("  PrevPrice24h: ").Append(PrevPrice24h).Append("\n");
            sb.Append("  Vwap: ").Append(Vwap).Append("\n");
            sb.Append("  HighPrice: ").Append(HighPrice).Append("\n");
            sb.Append("  LowPrice: ").Append(LowPrice).Append("\n");
            sb.Append("  LastPrice: ").Append(LastPrice).Append("\n");
            sb.Append("  LastPriceProtected: ").Append(LastPriceProtected).Append("\n");
            sb.Append("  LastTickDirection: ").Append(LastTickDirection).Append("\n");
            sb.Append("  LastChangePcnt: ").Append(LastChangePcnt).Append("\n");
            sb.Append("  BidPrice: ").Append(BidPrice).Append("\n");
            sb.Append("  MidPrice: ").Append(MidPrice).Append("\n");
            sb.Append("  AskPrice: ").Append(AskPrice).Append("\n");
            sb.Append("  ImpactBidPrice: ").Append(ImpactBidPrice).Append("\n");
            sb.Append("  ImpactMidPrice: ").Append(ImpactMidPrice).Append("\n");
            sb.Append("  ImpactAskPrice: ").Append(ImpactAskPrice).Append("\n");
            sb.Append("  HasLiquidity: ").Append(HasLiquidity).Append("\n");
            sb.Append("  OpenInterest: ").Append(OpenInterest).Append("\n");
            sb.Append("  OpenValue: ").Append(OpenValue).Append("\n");
            sb.Append("  FairMethod: ").Append(FairMethod).Append("\n");
            sb.Append("  FairBasisRate: ").Append(FairBasisRate).Append("\n");
            sb.Append("  FairBasis: ").Append(FairBasis).Append("\n");
            sb.Append("  FairPrice: ").Append(FairPrice).Append("\n");
            sb.Append("  MarkMethod: ").Append(MarkMethod).Append("\n");
            sb.Append("  MarkPrice: ").Append(MarkPrice).Append("\n");
            sb.Append("  IndicativeTaxRate: ").Append(IndicativeTaxRate).Append("\n");
            sb.Append("  IndicativeSettlePrice: ").Append(IndicativeSettlePrice).Append("\n");
            sb.Append("  SettledPrice: ").Append(SettledPrice).Append("\n");
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
            return this.Equals(obj as Instrument);
        }

        /// <summary>
        /// Returns true if Instrument instances are equal
        /// </summary>
        /// <param name="obj">Instance of Instrument to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Instrument other)
        {
            // credit: http://stackoverflow.com/a/10454552/677735
            if (other == null)
                return false;

            return 
                (
                    this.Symbol == other.Symbol ||
                    this.Symbol != null &&
                    this.Symbol.Equals(other.Symbol)
                ) && 
                (
                    this.RootSymbol == other.RootSymbol ||
                    this.RootSymbol != null &&
                    this.RootSymbol.Equals(other.RootSymbol)
                ) && 
                (
                    this.State == other.State ||
                    this.State != null &&
                    this.State.Equals(other.State)
                ) && 
                (
                    this.Typ == other.Typ ||
                    this.Typ != null &&
                    this.Typ.Equals(other.Typ)
                ) && 
                (
                    this.Listing == other.Listing ||
                    this.Listing != null &&
                    this.Listing.Equals(other.Listing)
                ) && 
                (
                    this.Front == other.Front ||
                    this.Front != null &&
                    this.Front.Equals(other.Front)
                ) && 
                (
                    this.Expiry == other.Expiry ||
                    this.Expiry != null &&
                    this.Expiry.Equals(other.Expiry)
                ) && 
                (
                    this.RelistInterval == other.RelistInterval ||
                    this.RelistInterval != null &&
                    this.RelistInterval.Equals(other.RelistInterval)
                ) && 
                (
                    this.InverseLeg == other.InverseLeg ||
                    this.InverseLeg != null &&
                    this.InverseLeg.Equals(other.InverseLeg)
                ) && 
                (
                    this.SellLeg == other.SellLeg ||
                    this.SellLeg != null &&
                    this.SellLeg.Equals(other.SellLeg)
                ) && 
                (
                    this.BuyLeg == other.BuyLeg ||
                    this.BuyLeg != null &&
                    this.BuyLeg.Equals(other.BuyLeg)
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
                    this.UnderlyingSymbol == other.UnderlyingSymbol ||
                    this.UnderlyingSymbol != null &&
                    this.UnderlyingSymbol.Equals(other.UnderlyingSymbol)
                ) && 
                (
                    this.Reference == other.Reference ||
                    this.Reference != null &&
                    this.Reference.Equals(other.Reference)
                ) && 
                (
                    this.ReferenceSymbol == other.ReferenceSymbol ||
                    this.ReferenceSymbol != null &&
                    this.ReferenceSymbol.Equals(other.ReferenceSymbol)
                ) && 
                (
                    this.TickSize == other.TickSize ||
                    this.TickSize != null &&
                    this.TickSize.Equals(other.TickSize)
                ) && 
                (
                    this.Multiplier == other.Multiplier ||
                    this.Multiplier != null &&
                    this.Multiplier.Equals(other.Multiplier)
                ) && 
                (
                    this.SettlCurrency == other.SettlCurrency ||
                    this.SettlCurrency != null &&
                    this.SettlCurrency.Equals(other.SettlCurrency)
                ) && 
                (
                    this.UnderlyingToSettleMultiplier == other.UnderlyingToSettleMultiplier ||
                    this.UnderlyingToSettleMultiplier != null &&
                    this.UnderlyingToSettleMultiplier.Equals(other.UnderlyingToSettleMultiplier)
                ) && 
                (
                    this.QuoteToSettleMultiplier == other.QuoteToSettleMultiplier ||
                    this.QuoteToSettleMultiplier != null &&
                    this.QuoteToSettleMultiplier.Equals(other.QuoteToSettleMultiplier)
                ) && 
                (
                    this.IsQuanto == other.IsQuanto ||
                    this.IsQuanto != null &&
                    this.IsQuanto.Equals(other.IsQuanto)
                ) && 
                (
                    this.IsInverse == other.IsInverse ||
                    this.IsInverse != null &&
                    this.IsInverse.Equals(other.IsInverse)
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
                    this.Limit == other.Limit ||
                    this.Limit != null &&
                    this.Limit.Equals(other.Limit)
                ) && 
                (
                    this.Capped == other.Capped ||
                    this.Capped != null &&
                    this.Capped.Equals(other.Capped)
                ) && 
                (
                    this.Taxed == other.Taxed ||
                    this.Taxed != null &&
                    this.Taxed.Equals(other.Taxed)
                ) && 
                (
                    this.MakerFee == other.MakerFee ||
                    this.MakerFee != null &&
                    this.MakerFee.Equals(other.MakerFee)
                ) && 
                (
                    this.TakerFee == other.TakerFee ||
                    this.TakerFee != null &&
                    this.TakerFee.Equals(other.TakerFee)
                ) && 
                (
                    this.InsuranceFee == other.InsuranceFee ||
                    this.InsuranceFee != null &&
                    this.InsuranceFee.Equals(other.InsuranceFee)
                ) && 
                (
                    this.HedgerMakerFee == other.HedgerMakerFee ||
                    this.HedgerMakerFee != null &&
                    this.HedgerMakerFee.Equals(other.HedgerMakerFee)
                ) && 
                (
                    this.HedgerTakerFee == other.HedgerTakerFee ||
                    this.HedgerTakerFee != null &&
                    this.HedgerTakerFee.Equals(other.HedgerTakerFee)
                ) && 
                (
                    this.HedgerInsuranceFee == other.HedgerInsuranceFee ||
                    this.HedgerInsuranceFee != null &&
                    this.HedgerInsuranceFee.Equals(other.HedgerInsuranceFee)
                ) && 
                (
                    this.OpeningTimestamp == other.OpeningTimestamp ||
                    this.OpeningTimestamp != null &&
                    this.OpeningTimestamp.Equals(other.OpeningTimestamp)
                ) && 
                (
                    this.ClosingTimestamp == other.ClosingTimestamp ||
                    this.ClosingTimestamp != null &&
                    this.ClosingTimestamp.Equals(other.ClosingTimestamp)
                ) && 
                (
                    this.SessionInterval == other.SessionInterval ||
                    this.SessionInterval != null &&
                    this.SessionInterval.Equals(other.SessionInterval)
                ) && 
                (
                    this.PrevClosePrice == other.PrevClosePrice ||
                    this.PrevClosePrice != null &&
                    this.PrevClosePrice.Equals(other.PrevClosePrice)
                ) && 
                (
                    this.LimitDownPrice == other.LimitDownPrice ||
                    this.LimitDownPrice != null &&
                    this.LimitDownPrice.Equals(other.LimitDownPrice)
                ) && 
                (
                    this.LimitUpPrice == other.LimitUpPrice ||
                    this.LimitUpPrice != null &&
                    this.LimitUpPrice.Equals(other.LimitUpPrice)
                ) && 
                (
                    this.BankruptLimitDownPrice == other.BankruptLimitDownPrice ||
                    this.BankruptLimitDownPrice != null &&
                    this.BankruptLimitDownPrice.Equals(other.BankruptLimitDownPrice)
                ) && 
                (
                    this.BankruptLimitUpPrice == other.BankruptLimitUpPrice ||
                    this.BankruptLimitUpPrice != null &&
                    this.BankruptLimitUpPrice.Equals(other.BankruptLimitUpPrice)
                ) && 
                (
                    this.PrevTotalVolume == other.PrevTotalVolume ||
                    this.PrevTotalVolume != null &&
                    this.PrevTotalVolume.Equals(other.PrevTotalVolume)
                ) && 
                (
                    this.TotalVolume == other.TotalVolume ||
                    this.TotalVolume != null &&
                    this.TotalVolume.Equals(other.TotalVolume)
                ) && 
                (
                    this.Volume == other.Volume ||
                    this.Volume != null &&
                    this.Volume.Equals(other.Volume)
                ) && 
                (
                    this.Volume24h == other.Volume24h ||
                    this.Volume24h != null &&
                    this.Volume24h.Equals(other.Volume24h)
                ) && 
                (
                    this.PrevTotalTurnover == other.PrevTotalTurnover ||
                    this.PrevTotalTurnover != null &&
                    this.PrevTotalTurnover.Equals(other.PrevTotalTurnover)
                ) && 
                (
                    this.TotalTurnover == other.TotalTurnover ||
                    this.TotalTurnover != null &&
                    this.TotalTurnover.Equals(other.TotalTurnover)
                ) && 
                (
                    this.Turnover == other.Turnover ||
                    this.Turnover != null &&
                    this.Turnover.Equals(other.Turnover)
                ) && 
                (
                    this.Turnover24h == other.Turnover24h ||
                    this.Turnover24h != null &&
                    this.Turnover24h.Equals(other.Turnover24h)
                ) && 
                (
                    this.PrevPrice24h == other.PrevPrice24h ||
                    this.PrevPrice24h != null &&
                    this.PrevPrice24h.Equals(other.PrevPrice24h)
                ) && 
                (
                    this.Vwap == other.Vwap ||
                    this.Vwap != null &&
                    this.Vwap.Equals(other.Vwap)
                ) && 
                (
                    this.HighPrice == other.HighPrice ||
                    this.HighPrice != null &&
                    this.HighPrice.Equals(other.HighPrice)
                ) && 
                (
                    this.LowPrice == other.LowPrice ||
                    this.LowPrice != null &&
                    this.LowPrice.Equals(other.LowPrice)
                ) && 
                (
                    this.LastPrice == other.LastPrice ||
                    this.LastPrice != null &&
                    this.LastPrice.Equals(other.LastPrice)
                ) && 
                (
                    this.LastPriceProtected == other.LastPriceProtected ||
                    this.LastPriceProtected != null &&
                    this.LastPriceProtected.Equals(other.LastPriceProtected)
                ) && 
                (
                    this.LastTickDirection == other.LastTickDirection ||
                    this.LastTickDirection != null &&
                    this.LastTickDirection.Equals(other.LastTickDirection)
                ) && 
                (
                    this.LastChangePcnt == other.LastChangePcnt ||
                    this.LastChangePcnt != null &&
                    this.LastChangePcnt.Equals(other.LastChangePcnt)
                ) && 
                (
                    this.BidPrice == other.BidPrice ||
                    this.BidPrice != null &&
                    this.BidPrice.Equals(other.BidPrice)
                ) && 
                (
                    this.MidPrice == other.MidPrice ||
                    this.MidPrice != null &&
                    this.MidPrice.Equals(other.MidPrice)
                ) && 
                (
                    this.AskPrice == other.AskPrice ||
                    this.AskPrice != null &&
                    this.AskPrice.Equals(other.AskPrice)
                ) && 
                (
                    this.ImpactBidPrice == other.ImpactBidPrice ||
                    this.ImpactBidPrice != null &&
                    this.ImpactBidPrice.Equals(other.ImpactBidPrice)
                ) && 
                (
                    this.ImpactMidPrice == other.ImpactMidPrice ||
                    this.ImpactMidPrice != null &&
                    this.ImpactMidPrice.Equals(other.ImpactMidPrice)
                ) && 
                (
                    this.ImpactAskPrice == other.ImpactAskPrice ||
                    this.ImpactAskPrice != null &&
                    this.ImpactAskPrice.Equals(other.ImpactAskPrice)
                ) && 
                (
                    this.HasLiquidity == other.HasLiquidity ||
                    this.HasLiquidity != null &&
                    this.HasLiquidity.Equals(other.HasLiquidity)
                ) && 
                (
                    this.OpenInterest == other.OpenInterest ||
                    this.OpenInterest != null &&
                    this.OpenInterest.Equals(other.OpenInterest)
                ) && 
                (
                    this.OpenValue == other.OpenValue ||
                    this.OpenValue != null &&
                    this.OpenValue.Equals(other.OpenValue)
                ) && 
                (
                    this.FairMethod == other.FairMethod ||
                    this.FairMethod != null &&
                    this.FairMethod.Equals(other.FairMethod)
                ) && 
                (
                    this.FairBasisRate == other.FairBasisRate ||
                    this.FairBasisRate != null &&
                    this.FairBasisRate.Equals(other.FairBasisRate)
                ) && 
                (
                    this.FairBasis == other.FairBasis ||
                    this.FairBasis != null &&
                    this.FairBasis.Equals(other.FairBasis)
                ) && 
                (
                    this.FairPrice == other.FairPrice ||
                    this.FairPrice != null &&
                    this.FairPrice.Equals(other.FairPrice)
                ) && 
                (
                    this.MarkMethod == other.MarkMethod ||
                    this.MarkMethod != null &&
                    this.MarkMethod.Equals(other.MarkMethod)
                ) && 
                (
                    this.MarkPrice == other.MarkPrice ||
                    this.MarkPrice != null &&
                    this.MarkPrice.Equals(other.MarkPrice)
                ) && 
                (
                    this.IndicativeTaxRate == other.IndicativeTaxRate ||
                    this.IndicativeTaxRate != null &&
                    this.IndicativeTaxRate.Equals(other.IndicativeTaxRate)
                ) && 
                (
                    this.IndicativeSettlePrice == other.IndicativeSettlePrice ||
                    this.IndicativeSettlePrice != null &&
                    this.IndicativeSettlePrice.Equals(other.IndicativeSettlePrice)
                ) && 
                (
                    this.SettledPrice == other.SettledPrice ||
                    this.SettledPrice != null &&
                    this.SettledPrice.Equals(other.SettledPrice)
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
                
                if (this.Symbol != null)
                    hash = hash * 57 + this.Symbol.GetHashCode();
                
                if (this.RootSymbol != null)
                    hash = hash * 57 + this.RootSymbol.GetHashCode();
                
                if (this.State != null)
                    hash = hash * 57 + this.State.GetHashCode();
                
                if (this.Typ != null)
                    hash = hash * 57 + this.Typ.GetHashCode();
                
                if (this.Listing != null)
                    hash = hash * 57 + this.Listing.GetHashCode();
                
                if (this.Front != null)
                    hash = hash * 57 + this.Front.GetHashCode();
                
                if (this.Expiry != null)
                    hash = hash * 57 + this.Expiry.GetHashCode();
                
                if (this.RelistInterval != null)
                    hash = hash * 57 + this.RelistInterval.GetHashCode();
                
                if (this.InverseLeg != null)
                    hash = hash * 57 + this.InverseLeg.GetHashCode();
                
                if (this.SellLeg != null)
                    hash = hash * 57 + this.SellLeg.GetHashCode();
                
                if (this.BuyLeg != null)
                    hash = hash * 57 + this.BuyLeg.GetHashCode();
                
                if (this.Underlying != null)
                    hash = hash * 57 + this.Underlying.GetHashCode();
                
                if (this.QuoteCurrency != null)
                    hash = hash * 57 + this.QuoteCurrency.GetHashCode();
                
                if (this.UnderlyingSymbol != null)
                    hash = hash * 57 + this.UnderlyingSymbol.GetHashCode();
                
                if (this.Reference != null)
                    hash = hash * 57 + this.Reference.GetHashCode();
                
                if (this.ReferenceSymbol != null)
                    hash = hash * 57 + this.ReferenceSymbol.GetHashCode();
                
                if (this.TickSize != null)
                    hash = hash * 57 + this.TickSize.GetHashCode();
                
                if (this.Multiplier != null)
                    hash = hash * 57 + this.Multiplier.GetHashCode();
                
                if (this.SettlCurrency != null)
                    hash = hash * 57 + this.SettlCurrency.GetHashCode();
                
                if (this.UnderlyingToSettleMultiplier != null)
                    hash = hash * 57 + this.UnderlyingToSettleMultiplier.GetHashCode();
                
                if (this.QuoteToSettleMultiplier != null)
                    hash = hash * 57 + this.QuoteToSettleMultiplier.GetHashCode();
                
                if (this.IsQuanto != null)
                    hash = hash * 57 + this.IsQuanto.GetHashCode();
                
                if (this.IsInverse != null)
                    hash = hash * 57 + this.IsInverse.GetHashCode();
                
                if (this.InitMargin != null)
                    hash = hash * 57 + this.InitMargin.GetHashCode();
                
                if (this.MaintMargin != null)
                    hash = hash * 57 + this.MaintMargin.GetHashCode();
                
                if (this.Limit != null)
                    hash = hash * 57 + this.Limit.GetHashCode();
                
                if (this.Capped != null)
                    hash = hash * 57 + this.Capped.GetHashCode();
                
                if (this.Taxed != null)
                    hash = hash * 57 + this.Taxed.GetHashCode();
                
                if (this.MakerFee != null)
                    hash = hash * 57 + this.MakerFee.GetHashCode();
                
                if (this.TakerFee != null)
                    hash = hash * 57 + this.TakerFee.GetHashCode();
                
                if (this.InsuranceFee != null)
                    hash = hash * 57 + this.InsuranceFee.GetHashCode();
                
                if (this.HedgerMakerFee != null)
                    hash = hash * 57 + this.HedgerMakerFee.GetHashCode();
                
                if (this.HedgerTakerFee != null)
                    hash = hash * 57 + this.HedgerTakerFee.GetHashCode();
                
                if (this.HedgerInsuranceFee != null)
                    hash = hash * 57 + this.HedgerInsuranceFee.GetHashCode();
                
                if (this.OpeningTimestamp != null)
                    hash = hash * 57 + this.OpeningTimestamp.GetHashCode();
                
                if (this.ClosingTimestamp != null)
                    hash = hash * 57 + this.ClosingTimestamp.GetHashCode();
                
                if (this.SessionInterval != null)
                    hash = hash * 57 + this.SessionInterval.GetHashCode();
                
                if (this.PrevClosePrice != null)
                    hash = hash * 57 + this.PrevClosePrice.GetHashCode();
                
                if (this.LimitDownPrice != null)
                    hash = hash * 57 + this.LimitDownPrice.GetHashCode();
                
                if (this.LimitUpPrice != null)
                    hash = hash * 57 + this.LimitUpPrice.GetHashCode();
                
                if (this.BankruptLimitDownPrice != null)
                    hash = hash * 57 + this.BankruptLimitDownPrice.GetHashCode();
                
                if (this.BankruptLimitUpPrice != null)
                    hash = hash * 57 + this.BankruptLimitUpPrice.GetHashCode();
                
                if (this.PrevTotalVolume != null)
                    hash = hash * 57 + this.PrevTotalVolume.GetHashCode();
                
                if (this.TotalVolume != null)
                    hash = hash * 57 + this.TotalVolume.GetHashCode();
                
                if (this.Volume != null)
                    hash = hash * 57 + this.Volume.GetHashCode();
                
                if (this.Volume24h != null)
                    hash = hash * 57 + this.Volume24h.GetHashCode();
                
                if (this.PrevTotalTurnover != null)
                    hash = hash * 57 + this.PrevTotalTurnover.GetHashCode();
                
                if (this.TotalTurnover != null)
                    hash = hash * 57 + this.TotalTurnover.GetHashCode();
                
                if (this.Turnover != null)
                    hash = hash * 57 + this.Turnover.GetHashCode();
                
                if (this.Turnover24h != null)
                    hash = hash * 57 + this.Turnover24h.GetHashCode();
                
                if (this.PrevPrice24h != null)
                    hash = hash * 57 + this.PrevPrice24h.GetHashCode();
                
                if (this.Vwap != null)
                    hash = hash * 57 + this.Vwap.GetHashCode();
                
                if (this.HighPrice != null)
                    hash = hash * 57 + this.HighPrice.GetHashCode();
                
                if (this.LowPrice != null)
                    hash = hash * 57 + this.LowPrice.GetHashCode();
                
                if (this.LastPrice != null)
                    hash = hash * 57 + this.LastPrice.GetHashCode();
                
                if (this.LastPriceProtected != null)
                    hash = hash * 57 + this.LastPriceProtected.GetHashCode();
                
                if (this.LastTickDirection != null)
                    hash = hash * 57 + this.LastTickDirection.GetHashCode();
                
                if (this.LastChangePcnt != null)
                    hash = hash * 57 + this.LastChangePcnt.GetHashCode();
                
                if (this.BidPrice != null)
                    hash = hash * 57 + this.BidPrice.GetHashCode();
                
                if (this.MidPrice != null)
                    hash = hash * 57 + this.MidPrice.GetHashCode();
                
                if (this.AskPrice != null)
                    hash = hash * 57 + this.AskPrice.GetHashCode();
                
                if (this.ImpactBidPrice != null)
                    hash = hash * 57 + this.ImpactBidPrice.GetHashCode();
                
                if (this.ImpactMidPrice != null)
                    hash = hash * 57 + this.ImpactMidPrice.GetHashCode();
                
                if (this.ImpactAskPrice != null)
                    hash = hash * 57 + this.ImpactAskPrice.GetHashCode();
                
                if (this.HasLiquidity != null)
                    hash = hash * 57 + this.HasLiquidity.GetHashCode();
                
                if (this.OpenInterest != null)
                    hash = hash * 57 + this.OpenInterest.GetHashCode();
                
                if (this.OpenValue != null)
                    hash = hash * 57 + this.OpenValue.GetHashCode();
                
                if (this.FairMethod != null)
                    hash = hash * 57 + this.FairMethod.GetHashCode();
                
                if (this.FairBasisRate != null)
                    hash = hash * 57 + this.FairBasisRate.GetHashCode();
                
                if (this.FairBasis != null)
                    hash = hash * 57 + this.FairBasis.GetHashCode();
                
                if (this.FairPrice != null)
                    hash = hash * 57 + this.FairPrice.GetHashCode();
                
                if (this.MarkMethod != null)
                    hash = hash * 57 + this.MarkMethod.GetHashCode();
                
                if (this.MarkPrice != null)
                    hash = hash * 57 + this.MarkPrice.GetHashCode();
                
                if (this.IndicativeTaxRate != null)
                    hash = hash * 57 + this.IndicativeTaxRate.GetHashCode();
                
                if (this.IndicativeSettlePrice != null)
                    hash = hash * 57 + this.IndicativeSettlePrice.GetHashCode();
                
                if (this.SettledPrice != null)
                    hash = hash * 57 + this.SettledPrice.GetHashCode();
                
                if (this.Timestamp != null)
                    hash = hash * 57 + this.Timestamp.GetHashCode();
                
                return hash;
            }
        }

    }
}
