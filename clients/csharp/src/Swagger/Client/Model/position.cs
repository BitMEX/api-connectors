using System;
using System.Text;
using System.Collections;
using System.Collections.Generic;

namespace Swagger.Client.Model {
  public class Position {
    public double? account { get; set; }

    public string symbol { get; set; }

    public string currency { get; set; }

    public double? commission { get; set; }

    public double? prevRealisedPnl { get; set; }

    public double? prevUnrealisedPnl { get; set; }

    public double? prevClosePrice { get; set; }

    public double? realisedCost { get; set; }

    public double? realisedPnl { get; set; }

    public DateTime? openingTimestamp { get; set; }

    public double? openingQty { get; set; }

    public double? openingCost { get; set; }

    public double? openingComm { get; set; }

    public double? openOrderBuyQty { get; set; }

    public double? openOrderBuyCost { get; set; }

    public double? openOrderSellQty { get; set; }

    public double? openOrderSellCost { get; set; }

    public double? execBuyQty { get; set; }

    public double? execBuyCost { get; set; }

    public double? execSellQty { get; set; }

    public double? execSellCost { get; set; }

    public double? execQty { get; set; }

    public double? execCost { get; set; }

    public double? execComm { get; set; }

    public DateTime? currentTimestamp { get; set; }

    public double? currentQty { get; set; }

    public double? currentCost { get; set; }

    public double? currentComm { get; set; }

    public double? unrealisedCost { get; set; }

    public double? grossOpenCost { get; set; }

    public double? grossExecCost { get; set; }

    public double? lastPrice { get; set; }

    public double? lastValue { get; set; }

    public string notionalCurrency1 { get; set; }

    public double? notionalValue1 { get; set; }

    public string notionalCurrency2 { get; set; }

    public double? notionalValue2 { get; set; }

    public double? initMargin { get; set; }

    public double? maintMargin { get; set; }

    public double? sessionMargin { get; set; }

    public double? targetExcessMargin { get; set; }

    public double? varMargin { get; set; }

    public double? unrealisedPnl { get; set; }

    public double? unrealisedPnlPcnt { get; set; }

    public double? avgEntryPrice { get; set; }

    public double? breakEvenPrice { get; set; }

    public double? marginCallPrice { get; set; }

    public double? liquidationPrice { get; set; }

    public double? bankruptPrice { get; set; }

    public DateTime? timestamp { get; set; }

    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class Position {\n");
      sb.Append("  account: ").Append(account).Append("\n");
      sb.Append("  symbol: ").Append(symbol).Append("\n");
      sb.Append("  currency: ").Append(currency).Append("\n");
      sb.Append("  commission: ").Append(commission).Append("\n");
      sb.Append("  prevRealisedPnl: ").Append(prevRealisedPnl).Append("\n");
      sb.Append("  prevUnrealisedPnl: ").Append(prevUnrealisedPnl).Append("\n");
      sb.Append("  prevClosePrice: ").Append(prevClosePrice).Append("\n");
      sb.Append("  realisedCost: ").Append(realisedCost).Append("\n");
      sb.Append("  realisedPnl: ").Append(realisedPnl).Append("\n");
      sb.Append("  openingTimestamp: ").Append(openingTimestamp).Append("\n");
      sb.Append("  openingQty: ").Append(openingQty).Append("\n");
      sb.Append("  openingCost: ").Append(openingCost).Append("\n");
      sb.Append("  openingComm: ").Append(openingComm).Append("\n");
      sb.Append("  openOrderBuyQty: ").Append(openOrderBuyQty).Append("\n");
      sb.Append("  openOrderBuyCost: ").Append(openOrderBuyCost).Append("\n");
      sb.Append("  openOrderSellQty: ").Append(openOrderSellQty).Append("\n");
      sb.Append("  openOrderSellCost: ").Append(openOrderSellCost).Append("\n");
      sb.Append("  execBuyQty: ").Append(execBuyQty).Append("\n");
      sb.Append("  execBuyCost: ").Append(execBuyCost).Append("\n");
      sb.Append("  execSellQty: ").Append(execSellQty).Append("\n");
      sb.Append("  execSellCost: ").Append(execSellCost).Append("\n");
      sb.Append("  execQty: ").Append(execQty).Append("\n");
      sb.Append("  execCost: ").Append(execCost).Append("\n");
      sb.Append("  execComm: ").Append(execComm).Append("\n");
      sb.Append("  currentTimestamp: ").Append(currentTimestamp).Append("\n");
      sb.Append("  currentQty: ").Append(currentQty).Append("\n");
      sb.Append("  currentCost: ").Append(currentCost).Append("\n");
      sb.Append("  currentComm: ").Append(currentComm).Append("\n");
      sb.Append("  unrealisedCost: ").Append(unrealisedCost).Append("\n");
      sb.Append("  grossOpenCost: ").Append(grossOpenCost).Append("\n");
      sb.Append("  grossExecCost: ").Append(grossExecCost).Append("\n");
      sb.Append("  lastPrice: ").Append(lastPrice).Append("\n");
      sb.Append("  lastValue: ").Append(lastValue).Append("\n");
      sb.Append("  notionalCurrency1: ").Append(notionalCurrency1).Append("\n");
      sb.Append("  notionalValue1: ").Append(notionalValue1).Append("\n");
      sb.Append("  notionalCurrency2: ").Append(notionalCurrency2).Append("\n");
      sb.Append("  notionalValue2: ").Append(notionalValue2).Append("\n");
      sb.Append("  initMargin: ").Append(initMargin).Append("\n");
      sb.Append("  maintMargin: ").Append(maintMargin).Append("\n");
      sb.Append("  sessionMargin: ").Append(sessionMargin).Append("\n");
      sb.Append("  targetExcessMargin: ").Append(targetExcessMargin).Append("\n");
      sb.Append("  varMargin: ").Append(varMargin).Append("\n");
      sb.Append("  unrealisedPnl: ").Append(unrealisedPnl).Append("\n");
      sb.Append("  unrealisedPnlPcnt: ").Append(unrealisedPnlPcnt).Append("\n");
      sb.Append("  avgEntryPrice: ").Append(avgEntryPrice).Append("\n");
      sb.Append("  breakEvenPrice: ").Append(breakEvenPrice).Append("\n");
      sb.Append("  marginCallPrice: ").Append(marginCallPrice).Append("\n");
      sb.Append("  liquidationPrice: ").Append(liquidationPrice).Append("\n");
      sb.Append("  bankruptPrice: ").Append(bankruptPrice).Append("\n");
      sb.Append("  timestamp: ").Append(timestamp).Append("\n");
      sb.Append("}\n");
      return sb.ToString();
    }
  }
  }
