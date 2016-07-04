package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class Margin (
  account: Number,
currency: String,
riskLimit: Option[Number],
prevState: Option[String],
state: Option[String],
action: Option[String],
amount: Option[Number],
pendingCredit: Option[Number],
pendingDebit: Option[Number],
confirmedDebit: Option[Number],
prevRealisedPnl: Option[Number],
prevUnrealisedPnl: Option[Number],
grossComm: Option[Number],
grossOpenCost: Option[Number],
grossOpenPremium: Option[Number],
grossExecCost: Option[Number],
grossMarkValue: Option[Number],
riskValue: Option[Number],
taxableMargin: Option[Number],
initMargin: Option[Number],
maintMargin: Option[Number],
sessionMargin: Option[Number],
targetExcessMargin: Option[Number],
varMargin: Option[Number],
realisedPnl: Option[Number],
unrealisedPnl: Option[Number],
indicativeTax: Option[Number],
unrealisedProfit: Option[Number],
syntheticMargin: Option[Number],
walletBalance: Option[Number],
marginBalance: Option[Number],
marginBalancePcnt: Option[Double],
marginLeverage: Option[Double],
marginUsedPcnt: Option[Double],
excessMargin: Option[Number],
excessMarginPcnt: Option[Double],
availableMargin: Option[Number],
withdrawableMargin: Option[Number],
timestamp: Option[Date],
grossLastValue: Option[Number],
commission: Option[Double]
)
