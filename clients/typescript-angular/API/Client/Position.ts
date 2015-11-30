/// <reference path="api.d.ts" />

namespace API.Client {
    'use strict';

    export interface Position {

        account: number;

        symbol: string;

        underlying?: string;

        quoteCurrency?: string;

        currency?: string;

        commission?: number;

        crossMargin?: boolean;

        rebalancedPnl?: number;

        prevRealisedPnl?: number;

        prevUnrealisedPnl?: number;

        prevClosePrice?: number;

        openingTimestamp?: date;

        openingQty?: number;

        openingCost?: number;

        openingComm?: number;

        openOrderBuyQty?: number;

        openOrderBuyCost?: number;

        openOrderBuyPremium?: number;

        openOrderSellQty?: number;

        openOrderSellCost?: number;

        openOrderSellPremium?: number;

        execBuyQty?: number;

        execBuyCost?: number;

        execSellQty?: number;

        execSellCost?: number;

        execQty?: number;

        execCost?: number;

        execComm?: number;

        currentTimestamp?: date;

        currentQty?: number;

        currentCost?: number;

        currentComm?: number;

        realisedCost?: number;

        unrealisedCost?: number;

        grossOpenCost?: number;

        grossOpenPremium?: number;

        grossExecCost?: number;

        isOpen?: boolean;

        markPrice?: number;

        markValue?: number;

        homeNotional?: number;

        foreignNotional?: number;

        posState?: string;

        posCost?: number;

        posCost2?: number;

        posCross?: number;

        posInit?: number;

        posComm?: number;

        posLoss?: number;

        posMargin?: number;

        posMaint?: number;

        posAllowance?: number;

        taxableMargin?: number;

        initMargin?: number;

        maintMargin?: number;

        sessionMargin?: number;

        targetExcessMargin?: number;

        varMargin?: number;

        realisedGrossPnl?: number;

        realisedTax?: number;

        realisedPnl?: number;

        unrealisedGrossPnl?: number;

        longBankrupt?: number;

        shortBankrupt?: number;

        taxBase?: number;

        indicativeTaxRate?: number;

        indicativeTax?: number;

        unrealisedTax?: number;

        unrealisedPnl?: number;

        unrealisedPnlPcnt?: number;

        unrealisedRoePcnt?: number;

        simpleQty?: number;

        simpleCost?: number;

        simpleValue?: number;

        simplePnl?: number;

        simplePnlPcnt?: number;

        avgCostPrice?: number;

        avgEntryPrice?: number;

        breakEvenPrice?: number;

        marginCallPrice?: number;

        liquidationPrice?: number;

        bankruptPrice?: number;

        timestamp?: date;
    }

}
