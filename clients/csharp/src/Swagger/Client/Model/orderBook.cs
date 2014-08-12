using System;
using System.Text;
using System.Collections;
using System.Collections.Generic;

namespace Swagger.Client.Model {
  public class OrderBook {
    public string symbol { get; set; }

    public double? level { get; set; }

    public double? bidSize { get; set; }

    public double? bidPrice { get; set; }

    public double? askPrice { get; set; }

    public double? askSize { get; set; }

    public DateTime? timestamp { get; set; }

    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class OrderBook {\n");
      sb.Append("  symbol: ").Append(symbol).Append("\n");
      sb.Append("  level: ").Append(level).Append("\n");
      sb.Append("  bidSize: ").Append(bidSize).Append("\n");
      sb.Append("  bidPrice: ").Append(bidPrice).Append("\n");
      sb.Append("  askPrice: ").Append(askPrice).Append("\n");
      sb.Append("  askSize: ").Append(askSize).Append("\n");
      sb.Append("  timestamp: ").Append(timestamp).Append("\n");
      sb.Append("}\n");
      return sb.ToString();
    }
  }
  }
