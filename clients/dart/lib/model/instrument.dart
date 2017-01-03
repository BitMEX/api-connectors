part of api;


@Entity()
class Instrument {
  
  @Property(name: 'symbol')
  String symbol = null;
  

  @Property(name: 'rootSymbol')
  String rootSymbol = null;
  

  @Property(name: 'state')
  String state = null;
  

  @Property(name: 'typ')
  String typ = null;
  

  @Property(name: 'listing')
  DateTime listing = null;
  

  @Property(name: 'front')
  DateTime front = null;
  

  @Property(name: 'expiry')
  DateTime expiry = null;
  

  @Property(name: 'settle')
  DateTime settle = null;
  

  @Property(name: 'relistInterval')
  DateTime relistInterval = null;
  

  @Property(name: 'inverseLeg')
  String inverseLeg = null;
  

  @Property(name: 'sellLeg')
  String sellLeg = null;
  

  @Property(name: 'buyLeg')
  String buyLeg = null;
  

  @Property(name: 'positionCurrency')
  String positionCurrency = null;
  

  @Property(name: 'underlying')
  String underlying = null;
  

  @Property(name: 'quoteCurrency')
  String quoteCurrency = null;
  

  @Property(name: 'underlyingSymbol')
  String underlyingSymbol = null;
  

  @Property(name: 'reference')
  String reference = null;
  

  @Property(name: 'referenceSymbol')
  String referenceSymbol = null;
  

  @Property(name: 'calcInterval')
  DateTime calcInterval = null;
  

  @Property(name: 'publishInterval')
  DateTime publishInterval = null;
  

  @Property(name: 'publishTime')
  DateTime publishTime = null;
  

  @Property(name: 'maxOrderQty')
  Number maxOrderQty = null;
  

  @Property(name: 'maxPrice')
  double maxPrice = null;
  

  @Property(name: 'lotSize')
  Number lotSize = null;
  

  @Property(name: 'tickSize')
  double tickSize = null;
  

  @Property(name: 'multiplier')
  Number multiplier = null;
  

  @Property(name: 'settlCurrency')
  String settlCurrency = null;
  

  @Property(name: 'underlyingToPositionMultiplier')
  Number underlyingToPositionMultiplier = null;
  

  @Property(name: 'underlyingToSettleMultiplier')
  Number underlyingToSettleMultiplier = null;
  

  @Property(name: 'quoteToSettleMultiplier')
  Number quoteToSettleMultiplier = null;
  

  @Property(name: 'isQuanto')
  bool isQuanto = null;
  

  @Property(name: 'isInverse')
  bool isInverse = null;
  

  @Property(name: 'initMargin')
  double initMargin = null;
  

  @Property(name: 'maintMargin')
  double maintMargin = null;
  

  @Property(name: 'riskLimit')
  Number riskLimit = null;
  

  @Property(name: 'riskStep')
  Number riskStep = null;
  

  @Property(name: 'limit')
  double limit = null;
  

  @Property(name: 'capped')
  bool capped = null;
  

  @Property(name: 'taxed')
  bool taxed = null;
  

  @Property(name: 'deleverage')
  bool deleverage = null;
  

  @Property(name: 'makerFee')
  double makerFee = null;
  

  @Property(name: 'takerFee')
  double takerFee = null;
  

  @Property(name: 'settlementFee')
  double settlementFee = null;
  

  @Property(name: 'insuranceFee')
  double insuranceFee = null;
  

  @Property(name: 'fundingBaseSymbol')
  String fundingBaseSymbol = null;
  

  @Property(name: 'fundingQuoteSymbol')
  String fundingQuoteSymbol = null;
  

  @Property(name: 'fundingPremiumSymbol')
  String fundingPremiumSymbol = null;
  

  @Property(name: 'fundingTimestamp')
  DateTime fundingTimestamp = null;
  

  @Property(name: 'fundingInterval')
  DateTime fundingInterval = null;
  

  @Property(name: 'fundingRate')
  double fundingRate = null;
  

  @Property(name: 'indicativeFundingRate')
  double indicativeFundingRate = null;
  

  @Property(name: 'rebalanceTimestamp')
  DateTime rebalanceTimestamp = null;
  

  @Property(name: 'rebalanceInterval')
  DateTime rebalanceInterval = null;
  

  @Property(name: 'openingTimestamp')
  DateTime openingTimestamp = null;
  

  @Property(name: 'closingTimestamp')
  DateTime closingTimestamp = null;
  

  @Property(name: 'sessionInterval')
  DateTime sessionInterval = null;
  

  @Property(name: 'prevClosePrice')
  double prevClosePrice = null;
  

  @Property(name: 'limitDownPrice')
  double limitDownPrice = null;
  

  @Property(name: 'limitUpPrice')
  double limitUpPrice = null;
  

  @Property(name: 'bankruptLimitDownPrice')
  double bankruptLimitDownPrice = null;
  

  @Property(name: 'bankruptLimitUpPrice')
  double bankruptLimitUpPrice = null;
  

  @Property(name: 'prevTotalVolume')
  Number prevTotalVolume = null;
  

  @Property(name: 'totalVolume')
  Number totalVolume = null;
  

  @Property(name: 'volume')
  Number volume = null;
  

  @Property(name: 'volume24h')
  Number volume24h = null;
  

  @Property(name: 'prevTotalTurnover')
  Number prevTotalTurnover = null;
  

  @Property(name: 'totalTurnover')
  Number totalTurnover = null;
  

  @Property(name: 'turnover')
  Number turnover = null;
  

  @Property(name: 'turnover24h')
  Number turnover24h = null;
  

  @Property(name: 'prevPrice24h')
  double prevPrice24h = null;
  

  @Property(name: 'vwap')
  double vwap = null;
  

  @Property(name: 'highPrice')
  double highPrice = null;
  

  @Property(name: 'lowPrice')
  double lowPrice = null;
  

  @Property(name: 'lastPrice')
  double lastPrice = null;
  

  @Property(name: 'lastPriceProtected')
  double lastPriceProtected = null;
  

  @Property(name: 'lastTickDirection')
  String lastTickDirection = null;
  

  @Property(name: 'lastChangePcnt')
  double lastChangePcnt = null;
  

  @Property(name: 'bidPrice')
  double bidPrice = null;
  

  @Property(name: 'midPrice')
  double midPrice = null;
  

  @Property(name: 'askPrice')
  double askPrice = null;
  

  @Property(name: 'impactBidPrice')
  double impactBidPrice = null;
  

  @Property(name: 'impactMidPrice')
  double impactMidPrice = null;
  

  @Property(name: 'impactAskPrice')
  double impactAskPrice = null;
  

  @Property(name: 'hasLiquidity')
  bool hasLiquidity = null;
  

  @Property(name: 'openInterest')
  Number openInterest = null;
  

  @Property(name: 'openValue')
  Number openValue = null;
  

  @Property(name: 'fairMethod')
  String fairMethod = null;
  

  @Property(name: 'fairBasisRate')
  double fairBasisRate = null;
  

  @Property(name: 'fairBasis')
  double fairBasis = null;
  

  @Property(name: 'fairPrice')
  double fairPrice = null;
  

  @Property(name: 'markMethod')
  String markMethod = null;
  

  @Property(name: 'markPrice')
  double markPrice = null;
  

  @Property(name: 'indicativeTaxRate')
  double indicativeTaxRate = null;
  

  @Property(name: 'indicativeSettlePrice')
  double indicativeSettlePrice = null;
  

  @Property(name: 'settledPrice')
  double settledPrice = null;
  

  @Property(name: 'timestamp')
  DateTime timestamp = null;
  
  Instrument();

  @override
  String toString()  {
    return 'Instrument[symbol=$symbol, rootSymbol=$rootSymbol, state=$state, typ=$typ, listing=$listing, front=$front, expiry=$expiry, settle=$settle, relistInterval=$relistInterval, inverseLeg=$inverseLeg, sellLeg=$sellLeg, buyLeg=$buyLeg, positionCurrency=$positionCurrency, underlying=$underlying, quoteCurrency=$quoteCurrency, underlyingSymbol=$underlyingSymbol, reference=$reference, referenceSymbol=$referenceSymbol, calcInterval=$calcInterval, publishInterval=$publishInterval, publishTime=$publishTime, maxOrderQty=$maxOrderQty, maxPrice=$maxPrice, lotSize=$lotSize, tickSize=$tickSize, multiplier=$multiplier, settlCurrency=$settlCurrency, underlyingToPositionMultiplier=$underlyingToPositionMultiplier, underlyingToSettleMultiplier=$underlyingToSettleMultiplier, quoteToSettleMultiplier=$quoteToSettleMultiplier, isQuanto=$isQuanto, isInverse=$isInverse, initMargin=$initMargin, maintMargin=$maintMargin, riskLimit=$riskLimit, riskStep=$riskStep, limit=$limit, capped=$capped, taxed=$taxed, deleverage=$deleverage, makerFee=$makerFee, takerFee=$takerFee, settlementFee=$settlementFee, insuranceFee=$insuranceFee, fundingBaseSymbol=$fundingBaseSymbol, fundingQuoteSymbol=$fundingQuoteSymbol, fundingPremiumSymbol=$fundingPremiumSymbol, fundingTimestamp=$fundingTimestamp, fundingInterval=$fundingInterval, fundingRate=$fundingRate, indicativeFundingRate=$indicativeFundingRate, rebalanceTimestamp=$rebalanceTimestamp, rebalanceInterval=$rebalanceInterval, openingTimestamp=$openingTimestamp, closingTimestamp=$closingTimestamp, sessionInterval=$sessionInterval, prevClosePrice=$prevClosePrice, limitDownPrice=$limitDownPrice, limitUpPrice=$limitUpPrice, bankruptLimitDownPrice=$bankruptLimitDownPrice, bankruptLimitUpPrice=$bankruptLimitUpPrice, prevTotalVolume=$prevTotalVolume, totalVolume=$totalVolume, volume=$volume, volume24h=$volume24h, prevTotalTurnover=$prevTotalTurnover, totalTurnover=$totalTurnover, turnover=$turnover, turnover24h=$turnover24h, prevPrice24h=$prevPrice24h, vwap=$vwap, highPrice=$highPrice, lowPrice=$lowPrice, lastPrice=$lastPrice, lastPriceProtected=$lastPriceProtected, lastTickDirection=$lastTickDirection, lastChangePcnt=$lastChangePcnt, bidPrice=$bidPrice, midPrice=$midPrice, askPrice=$askPrice, impactBidPrice=$impactBidPrice, impactMidPrice=$impactMidPrice, impactAskPrice=$impactAskPrice, hasLiquidity=$hasLiquidity, openInterest=$openInterest, openValue=$openValue, fairMethod=$fairMethod, fairBasisRate=$fairBasisRate, fairBasis=$fairBasis, fairPrice=$fairPrice, markMethod=$markMethod, markPrice=$markPrice, indicativeTaxRate=$indicativeTaxRate, indicativeSettlePrice=$indicativeSettlePrice, settledPrice=$settledPrice, timestamp=$timestamp, ]';
  }

}

