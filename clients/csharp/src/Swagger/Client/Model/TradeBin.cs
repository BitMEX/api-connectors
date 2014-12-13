using System;
using System.Text;
using System.Collections;
using System.Collections.Generic;

namespace Swagger.Client.Model {
  public class TradeBin {
    public DateTime? timestamp { get; set; }

    public string symbol { get; set; }

    public double? open { get; set; }

    public double? high { get; set; }

    public double? low { get; set; }

    public double? close { get; set; }

    public double? trades { get; set; }

    public double? volume { get; set; }

    public double? vwap { get; set; }

    public double? lastSize { get; set; }

    public double? id { get; set; }

    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class TradeBin {\n");
      sb.Append("  timestamp: ").Append(timestamp).Append("\n");
      sb.Append("  symbol: ").Append(symbol).Append("\n");
      sb.Append("  open: ").Append(open).Append("\n");
      sb.Append("  high: ").Append(high).Append("\n");
      sb.Append("  low: ").Append(low).Append("\n");
      sb.Append("  close: ").Append(close).Append("\n");
      sb.Append("  trades: ").Append(trades).Append("\n");
      sb.Append("  volume: ").Append(volume).Append("\n");
      sb.Append("  vwap: ").Append(vwap).Append("\n");
      sb.Append("  lastSize: ").Append(lastSize).Append("\n");
      sb.Append("  id: ").Append(id).Append("\n");
      sb.Append("}\n");
      return sb.ToString();
    }
  }
  }
