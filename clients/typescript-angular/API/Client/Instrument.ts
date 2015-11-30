/// <reference path="api.d.ts" />

namespace API.Client {
    'use strict';

    export interface Instrument {

        symbol: string;

        rootSymbol?: string;

        state?: string;

        typ?: string;

        listing?: date;

        front?: date;

        expiry?: date;

        relistInterval?: date;

        inverseLeg?: string;

        sellLeg?: string;

        buyLeg?: string;

        underlying?: string;

        quoteCurrency?: string;

        underlyingSymbol?: string;

        reference?: string;

        referenceSymbol?: string;

        tickSize?: number;

        multiplier?: number;

        settlCurrency?: string;

        underlyingToSettleMultiplier?: number;

        quoteToSettleMultiplier?: number;

        isQuanto?: boolean;

        isInverse?: boolean;

        initMargin?: number;

        maintMargin?: number;

        limit?: number;

        capped?: boolean;

        taxed?: boolean;

        makerFee?: number;

        takerFee?: number;

        insuranceFee?: number;

        hedgerMakerFee?: number;

        hedgerTakerFee?: number;

        hedgerInsuranceFee?: number;

        openingTimestamp?: date;

        closingTimestamp?: date;

        sessionInterval?: date;

        prevClosePrice?: number;

        limitDownPrice?: number;

        limitUpPrice?: number;

        bankruptLimitDownPrice?: number;

        bankruptLimitUpPrice?: number;

        prevTotalVolume?: number;

        totalVolume?: number;

        volume?: number;

        volume24h?: number;

        prevTotalTurnover?: number;

        totalTurnover?: number;

        turnover?: number;

        turnover24h?: number;

        prevPrice24h?: number;

        vwap?: number;

        highPrice?: number;

        lowPrice?: number;

        lastPrice?: number;

        lastPriceProtected?: number;

        lastTickDirection?: string;

        lastChangePcnt?: number;

        bidPrice?: number;

        midPrice?: number;

        askPrice?: number;

        impactBidPrice?: number;

        impactMidPrice?: number;

        impactAskPrice?: number;

        hasLiquidity?: boolean;

        openInterest?: number;

        openValue?: number;

        fairMethod?: string;

        fairBasisRate?: number;

        fairBasis?: number;

        fairPrice?: number;

        markMethod?: string;

        markPrice?: number;

        indicativeTaxRate?: number;

        indicativeSettlePrice?: number;

        settledPrice?: number;

        timestamp?: date;
    }

}
