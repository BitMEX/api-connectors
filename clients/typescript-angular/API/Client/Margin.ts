/// <reference path="api.d.ts" />

namespace API.Client {
    'use strict';

    export interface Margin {

        account: number;

        currency: string;

        riskLimit?: number;

        prevState?: string;

        state?: string;

        action?: string;

        amount?: number;

        pendingCredit?: number;

        pendingDebit?: number;

        prevRealisedPnl?: number;

        prevUnrealisedPnl?: number;

        grossComm?: number;

        grossOpenCost?: number;

        grossOpenPremium?: number;

        grossExecCost?: number;

        grossMarkValue?: number;

        riskValue?: number;

        taxableMargin?: number;

        initMargin?: number;

        maintMargin?: number;

        sessionMargin?: number;

        targetExcessMargin?: number;

        varMargin?: number;

        realisedPnl?: number;

        unrealisedPnl?: number;

        indicativeTax?: number;

        unrealisedProfit?: number;

        walletBalance?: number;

        marginBalance?: number;

        marginBalancePcnt?: number;

        marginLeverage?: number;

        marginUsedPcnt?: number;

        excessMargin?: number;

        excessMarginPcnt?: number;

        availableMargin?: number;

        withdrawableMargin?: number;

        timestamp?: date;
    }

}
