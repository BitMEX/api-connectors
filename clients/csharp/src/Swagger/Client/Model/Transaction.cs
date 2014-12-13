using System;
using System.Text;
using System.Collections;
using System.Collections.Generic;

namespace Swagger.Client.Model {
  public class Transaction {
    public string transactID { get; set; }

    public double? account { get; set; }

    public string currency { get; set; }

    public string transactType { get; set; }

    public double? amount { get; set; }

    public string transactStatus { get; set; }

    public string address { get; set; }

    public string tx { get; set; }

    public string text { get; set; }

    public DateTime? transactTime { get; set; }

    public DateTime? timestamp { get; set; }

    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class Transaction {\n");
      sb.Append("  transactID: ").Append(transactID).Append("\n");
      sb.Append("  account: ").Append(account).Append("\n");
      sb.Append("  currency: ").Append(currency).Append("\n");
      sb.Append("  transactType: ").Append(transactType).Append("\n");
      sb.Append("  amount: ").Append(amount).Append("\n");
      sb.Append("  transactStatus: ").Append(transactStatus).Append("\n");
      sb.Append("  address: ").Append(address).Append("\n");
      sb.Append("  tx: ").Append(tx).Append("\n");
      sb.Append("  text: ").Append(text).Append("\n");
      sb.Append("  transactTime: ").Append(transactTime).Append("\n");
      sb.Append("  timestamp: ").Append(timestamp).Append("\n");
      sb.Append("}\n");
      return sb.ToString();
    }
  }
  }
