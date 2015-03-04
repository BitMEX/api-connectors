using System;
using System.Text;
using System.Collections;
using System.Collections.Generic;

namespace Swagger.Client.Model {
  public class Stats {
    public string rootSymbol { get; set; }

    public string currency { get; set; }

    public double? volume24h { get; set; }

    public double? turnover24h { get; set; }

    public double? openInterest { get; set; }

    public double? openValue { get; set; }

    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class Stats {\n");
      sb.Append("  rootSymbol: ").Append(rootSymbol).Append("\n");
      sb.Append("  currency: ").Append(currency).Append("\n");
      sb.Append("  volume24h: ").Append(volume24h).Append("\n");
      sb.Append("  turnover24h: ").Append(turnover24h).Append("\n");
      sb.Append("  openInterest: ").Append(openInterest).Append("\n");
      sb.Append("  openValue: ").Append(openValue).Append("\n");
      sb.Append("}\n");
      return sb.ToString();
    }
  }
  }
