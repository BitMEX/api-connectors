using System;
using System.Text;
using System.Collections;
using System.Collections.Generic;

namespace Swagger.Client.Model {
  public class StatsHistory {
    public DateTime? date { get; set; }

    public string rootSymbol { get; set; }

    public string currency { get; set; }

    public double? volume { get; set; }

    public double? turnover { get; set; }

    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class StatsHistory {\n");
      sb.Append("  date: ").Append(date).Append("\n");
      sb.Append("  rootSymbol: ").Append(rootSymbol).Append("\n");
      sb.Append("  currency: ").Append(currency).Append("\n");
      sb.Append("  volume: ").Append(volume).Append("\n");
      sb.Append("  turnover: ").Append(turnover).Append("\n");
      sb.Append("}\n");
      return sb.ToString();
    }
  }
  }
