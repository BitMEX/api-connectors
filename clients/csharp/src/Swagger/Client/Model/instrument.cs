using System;
using System.Text;
using System.Collections;
using System.Collections.Generic;

namespace Swagger.Client.Model {
  public class Instrument {
    public string symbol { get; set; }

    public string state { get; set; }

    public string typ { get; set; }

    public DateTime? listing { get; set; }

    public DateTime? expiry { get; set; }

    public string underlying { get; set; }

    public string buyLeg { get; set; }

    public string sellLeg { get; set; }

    public string quoteCurrency { get; set; }

    public string reference { get; set; }

    public string referenceSymbol { get; set; }

    public double? tickSize { get; set; }

    public double? multiplier { get; set; }

    public string settlCurrency { get; set; }

    public double? initMargin { get; set; }

    public double? maintMargin { get; set; }

    public double? limit { get; set; }

    public DateTime? openingTimestamp { get; set; }

    public DateTime? closingTimestamp { get; set; }

    public double? prevClosePrice { get; set; }

    public double? limitDownPrice { get; set; }

    public double? limitUpPrice { get; set; }

    public double? volume { get; set; }

    public double? vwap { get; set; }

    public double? highPrice { get; set; }

    public double? lowPrice { get; set; }

    public double? lastPrice { get; set; }

    public string lastTickDirection { get; set; }

    public double? lastChangePcnt { get; set; }

    public double? bidPrice { get; set; }

    public double? midPrice { get; set; }

    public double? askPrice { get; set; }

    public double? openInterest { get; set; }

    public double? settledPrice { get; set; }

    public DateTime? timestamp { get; set; }

    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class Instrument {\n");
      sb.Append("  symbol: ").Append(symbol).Append("\n");
      sb.Append("  state: ").Append(state).Append("\n");
      sb.Append("  typ: ").Append(typ).Append("\n");
      sb.Append("  listing: ").Append(listing).Append("\n");
      sb.Append("  expiry: ").Append(expiry).Append("\n");
      sb.Append("  underlying: ").Append(underlying).Append("\n");
      sb.Append("  buyLeg: ").Append(buyLeg).Append("\n");
      sb.Append("  sellLeg: ").Append(sellLeg).Append("\n");
      sb.Append("  quoteCurrency: ").Append(quoteCurrency).Append("\n");
      sb.Append("  reference: ").Append(reference).Append("\n");
      sb.Append("  referenceSymbol: ").Append(referenceSymbol).Append("\n");
      sb.Append("  tickSize: ").Append(tickSize).Append("\n");
      sb.Append("  multiplier: ").Append(multiplier).Append("\n");
      sb.Append("  settlCurrency: ").Append(settlCurrency).Append("\n");
      sb.Append("  initMargin: ").Append(initMargin).Append("\n");
      sb.Append("  maintMargin: ").Append(maintMargin).Append("\n");
      sb.Append("  limit: ").Append(limit).Append("\n");
      sb.Append("  openingTimestamp: ").Append(openingTimestamp).Append("\n");
      sb.Append("  closingTimestamp: ").Append(closingTimestamp).Append("\n");
      sb.Append("  prevClosePrice: ").Append(prevClosePrice).Append("\n");
      sb.Append("  limitDownPrice: ").Append(limitDownPrice).Append("\n");
      sb.Append("  limitUpPrice: ").Append(limitUpPrice).Append("\n");
      sb.Append("  volume: ").Append(volume).Append("\n");
      sb.Append("  vwap: ").Append(vwap).Append("\n");
      sb.Append("  highPrice: ").Append(highPrice).Append("\n");
      sb.Append("  lowPrice: ").Append(lowPrice).Append("\n");
      sb.Append("  lastPrice: ").Append(lastPrice).Append("\n");
      sb.Append("  lastTickDirection: ").Append(lastTickDirection).Append("\n");
      sb.Append("  lastChangePcnt: ").Append(lastChangePcnt).Append("\n");
      sb.Append("  bidPrice: ").Append(bidPrice).Append("\n");
      sb.Append("  midPrice: ").Append(midPrice).Append("\n");
      sb.Append("  askPrice: ").Append(askPrice).Append("\n");
      sb.Append("  openInterest: ").Append(openInterest).Append("\n");
      sb.Append("  settledPrice: ").Append(settledPrice).Append("\n");
      sb.Append("  timestamp: ").Append(timestamp).Append("\n");
      sb.Append("}\n");
      return sb.ToString();
    }
  }
  }
