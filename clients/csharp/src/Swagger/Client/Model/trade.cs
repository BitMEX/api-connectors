using System;
using System.Text;
using System.Collections;
using System.Collections.Generic;

namespace Swagger.Client.Model {
  public class Trade {
    public DateTime? timestamp { get; set; }

    public string symbol { get; set; }

    public string side { get; set; }

    public double? size { get; set; }

    public double? price { get; set; }

    public string tickDirection { get; set; }

    public string trdMatchID { get; set; }

    public double? grossValue { get; set; }

    public double? homeNotional { get; set; }

    public double? foreignNotional { get; set; }

    public double? id { get; set; }

    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class Trade {\n");
      sb.Append("  timestamp: ").Append(timestamp).Append("\n");
      sb.Append("  symbol: ").Append(symbol).Append("\n");
      sb.Append("  side: ").Append(side).Append("\n");
      sb.Append("  size: ").Append(size).Append("\n");
      sb.Append("  price: ").Append(price).Append("\n");
      sb.Append("  tickDirection: ").Append(tickDirection).Append("\n");
      sb.Append("  trdMatchID: ").Append(trdMatchID).Append("\n");
      sb.Append("  grossValue: ").Append(grossValue).Append("\n");
      sb.Append("  homeNotional: ").Append(homeNotional).Append("\n");
      sb.Append("  foreignNotional: ").Append(foreignNotional).Append("\n");
      sb.Append("  id: ").Append(id).Append("\n");
      sb.Append("}\n");
      return sb.ToString();
    }
  }
  }
