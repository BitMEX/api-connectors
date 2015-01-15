using System;
using System.Text;
using System.Collections;
using System.Collections.Generic;

namespace Swagger.Client.Model {
  public class Affiliate {
    public double? account { get; set; }

    public string currency { get; set; }

    public double? prevPayout { get; set; }

    public double? prevTurnover { get; set; }

    public double? prevComm { get; set; }

    public DateTime? prevTimestamp { get; set; }

    public double? execTurnover { get; set; }

    public double? execComm { get; set; }

    public double? totalReferrals { get; set; }

    public double? totalTurnover { get; set; }

    public double? totalComm { get; set; }

    public double? payoutPcnt { get; set; }

    public double? pendingPayout { get; set; }

    public DateTime? timestamp { get; set; }

    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class Affiliate {\n");
      sb.Append("  account: ").Append(account).Append("\n");
      sb.Append("  currency: ").Append(currency).Append("\n");
      sb.Append("  prevPayout: ").Append(prevPayout).Append("\n");
      sb.Append("  prevTurnover: ").Append(prevTurnover).Append("\n");
      sb.Append("  prevComm: ").Append(prevComm).Append("\n");
      sb.Append("  prevTimestamp: ").Append(prevTimestamp).Append("\n");
      sb.Append("  execTurnover: ").Append(execTurnover).Append("\n");
      sb.Append("  execComm: ").Append(execComm).Append("\n");
      sb.Append("  totalReferrals: ").Append(totalReferrals).Append("\n");
      sb.Append("  totalTurnover: ").Append(totalTurnover).Append("\n");
      sb.Append("  totalComm: ").Append(totalComm).Append("\n");
      sb.Append("  payoutPcnt: ").Append(payoutPcnt).Append("\n");
      sb.Append("  pendingPayout: ").Append(pendingPayout).Append("\n");
      sb.Append("  timestamp: ").Append(timestamp).Append("\n");
      sb.Append("}\n");
      return sb.ToString();
    }
  }
  }
