using System;
using System.Text;
using System.Collections;
using System.Collections.Generic;

namespace Swagger.Client.Model {
  public class Margin {
    public double? account { get; set; }

    public string currency { get; set; }

    public double? commission { get; set; }

    public double? riskLimit { get; set; }

    public string state { get; set; }

    public string action { get; set; }

    public double? amount { get; set; }

    public double? pendingCredit { get; set; }

    public double? pendingDebit { get; set; }

    public double? prevRealisedPnl { get; set; }

    public double? prevUnrealisedPnl { get; set; }

    public double? grossComm { get; set; }

    public double? grossOpenCost { get; set; }

    public double? grossExecCost { get; set; }

    public double? grossLastValue { get; set; }

    public double? riskValue { get; set; }

    public double? initMargin { get; set; }

    public double? maintMargin { get; set; }

    public double? sessionMargin { get; set; }

    public double? targetExcessMargin { get; set; }

    public double? varMargin { get; set; }

    public double? realisedPnl { get; set; }

    public double? unrealisedPnl { get; set; }

    public double? walletBalance { get; set; }

    public double? marginBalance { get; set; }

    public double? marginBalancePcnt { get; set; }

    public double? marginLeverage { get; set; }

    public double? marginUsedPcnt { get; set; }

    public double? excessMargin { get; set; }

    public double? excessMarginPcnt { get; set; }

    public double? availableMargin { get; set; }

    public double? withdrawableMargin { get; set; }

    public DateTime? timestamp { get; set; }

    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class Margin {\n");
      sb.Append("  account: ").Append(account).Append("\n");
      sb.Append("  currency: ").Append(currency).Append("\n");
      sb.Append("  commission: ").Append(commission).Append("\n");
      sb.Append("  riskLimit: ").Append(riskLimit).Append("\n");
      sb.Append("  state: ").Append(state).Append("\n");
      sb.Append("  action: ").Append(action).Append("\n");
      sb.Append("  amount: ").Append(amount).Append("\n");
      sb.Append("  pendingCredit: ").Append(pendingCredit).Append("\n");
      sb.Append("  pendingDebit: ").Append(pendingDebit).Append("\n");
      sb.Append("  prevRealisedPnl: ").Append(prevRealisedPnl).Append("\n");
      sb.Append("  prevUnrealisedPnl: ").Append(prevUnrealisedPnl).Append("\n");
      sb.Append("  grossComm: ").Append(grossComm).Append("\n");
      sb.Append("  grossOpenCost: ").Append(grossOpenCost).Append("\n");
      sb.Append("  grossExecCost: ").Append(grossExecCost).Append("\n");
      sb.Append("  grossLastValue: ").Append(grossLastValue).Append("\n");
      sb.Append("  riskValue: ").Append(riskValue).Append("\n");
      sb.Append("  initMargin: ").Append(initMargin).Append("\n");
      sb.Append("  maintMargin: ").Append(maintMargin).Append("\n");
      sb.Append("  sessionMargin: ").Append(sessionMargin).Append("\n");
      sb.Append("  targetExcessMargin: ").Append(targetExcessMargin).Append("\n");
      sb.Append("  varMargin: ").Append(varMargin).Append("\n");
      sb.Append("  realisedPnl: ").Append(realisedPnl).Append("\n");
      sb.Append("  unrealisedPnl: ").Append(unrealisedPnl).Append("\n");
      sb.Append("  walletBalance: ").Append(walletBalance).Append("\n");
      sb.Append("  marginBalance: ").Append(marginBalance).Append("\n");
      sb.Append("  marginBalancePcnt: ").Append(marginBalancePcnt).Append("\n");
      sb.Append("  marginLeverage: ").Append(marginLeverage).Append("\n");
      sb.Append("  marginUsedPcnt: ").Append(marginUsedPcnt).Append("\n");
      sb.Append("  excessMargin: ").Append(excessMargin).Append("\n");
      sb.Append("  excessMarginPcnt: ").Append(excessMarginPcnt).Append("\n");
      sb.Append("  availableMargin: ").Append(availableMargin).Append("\n");
      sb.Append("  withdrawableMargin: ").Append(withdrawableMargin).Append("\n");
      sb.Append("  timestamp: ").Append(timestamp).Append("\n");
      sb.Append("}\n");
      return sb.ToString();
    }
  }
  }
