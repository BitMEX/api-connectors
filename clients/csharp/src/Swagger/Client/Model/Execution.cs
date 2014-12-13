using System;
using System.Text;
using System.Collections;
using System.Collections.Generic;

namespace Swagger.Client.Model {
  public class Execution {
    public string execID { get; set; }

    public string orderID { get; set; }

    public string clOrdID { get; set; }

    public double? account { get; set; }

    public string symbol { get; set; }

    public string side { get; set; }

    public double? lastQty { get; set; }

    public double? lastPx { get; set; }

    public string lastMkt { get; set; }

    public string lastLiquidityInd { get; set; }

    public double? orderQty { get; set; }

    public double? price { get; set; }

    public double? minQty { get; set; }

    public double? stopPx { get; set; }

    public string currency { get; set; }

    public string settlCurrency { get; set; }

    public string execType { get; set; }

    public string ordType { get; set; }

    public string timeInForce { get; set; }

    public string exDestination { get; set; }

    public string ordStatus { get; set; }

    public bool? workingIndicator { get; set; }

    public string ordRejReason { get; set; }

    public double? leavesQty { get; set; }

    public double? cumQty { get; set; }

    public double? avgPx { get; set; }

    public double? commission { get; set; }

    public string commType { get; set; }

    public string multiLegReportingType { get; set; }

    public string text { get; set; }

    public string trdMatchID { get; set; }

    public double? execCost { get; set; }

    public double? execComm { get; set; }

    public DateTime? transactTime { get; set; }

    public DateTime? timestamp { get; set; }

    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class Execution {\n");
      sb.Append("  execID: ").Append(execID).Append("\n");
      sb.Append("  orderID: ").Append(orderID).Append("\n");
      sb.Append("  clOrdID: ").Append(clOrdID).Append("\n");
      sb.Append("  account: ").Append(account).Append("\n");
      sb.Append("  symbol: ").Append(symbol).Append("\n");
      sb.Append("  side: ").Append(side).Append("\n");
      sb.Append("  lastQty: ").Append(lastQty).Append("\n");
      sb.Append("  lastPx: ").Append(lastPx).Append("\n");
      sb.Append("  lastMkt: ").Append(lastMkt).Append("\n");
      sb.Append("  lastLiquidityInd: ").Append(lastLiquidityInd).Append("\n");
      sb.Append("  orderQty: ").Append(orderQty).Append("\n");
      sb.Append("  price: ").Append(price).Append("\n");
      sb.Append("  minQty: ").Append(minQty).Append("\n");
      sb.Append("  stopPx: ").Append(stopPx).Append("\n");
      sb.Append("  currency: ").Append(currency).Append("\n");
      sb.Append("  settlCurrency: ").Append(settlCurrency).Append("\n");
      sb.Append("  execType: ").Append(execType).Append("\n");
      sb.Append("  ordType: ").Append(ordType).Append("\n");
      sb.Append("  timeInForce: ").Append(timeInForce).Append("\n");
      sb.Append("  exDestination: ").Append(exDestination).Append("\n");
      sb.Append("  ordStatus: ").Append(ordStatus).Append("\n");
      sb.Append("  workingIndicator: ").Append(workingIndicator).Append("\n");
      sb.Append("  ordRejReason: ").Append(ordRejReason).Append("\n");
      sb.Append("  leavesQty: ").Append(leavesQty).Append("\n");
      sb.Append("  cumQty: ").Append(cumQty).Append("\n");
      sb.Append("  avgPx: ").Append(avgPx).Append("\n");
      sb.Append("  commission: ").Append(commission).Append("\n");
      sb.Append("  commType: ").Append(commType).Append("\n");
      sb.Append("  multiLegReportingType: ").Append(multiLegReportingType).Append("\n");
      sb.Append("  text: ").Append(text).Append("\n");
      sb.Append("  trdMatchID: ").Append(trdMatchID).Append("\n");
      sb.Append("  execCost: ").Append(execCost).Append("\n");
      sb.Append("  execComm: ").Append(execComm).Append("\n");
      sb.Append("  transactTime: ").Append(transactTime).Append("\n");
      sb.Append("  timestamp: ").Append(timestamp).Append("\n");
      sb.Append("}\n");
      return sb.ToString();
    }
  }
  }
