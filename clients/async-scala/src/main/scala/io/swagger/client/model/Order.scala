package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class Order (
  orderID: String,
clOrdID: Option[String],
clOrdLinkID: Option[String],
account: Option[Number],
symbol: Option[String],
side: Option[String],
simpleOrderQty: Option[Double],
orderQty: Option[Number],
price: Option[Double],
displayQty: Option[Number],
stopPx: Option[Double],
pegOffsetValue: Option[Double],
pegPriceType: Option[String],
currency: Option[String],
settlCurrency: Option[String],
ordType: Option[String],
timeInForce: Option[String],
execInst: Option[String],
contingencyType: Option[String],
exDestination: Option[String],
ordStatus: Option[String],
triggered: Option[String],
workingIndicator: Option[Boolean],
ordRejReason: Option[String],
simpleLeavesQty: Option[Double],
leavesQty: Option[Number],
simpleCumQty: Option[Double],
cumQty: Option[Number],
avgPx: Option[Double],
multiLegReportingType: Option[String],
text: Option[String],
transactTime: Option[DateTime],
timestamp: Option[DateTime]
)
