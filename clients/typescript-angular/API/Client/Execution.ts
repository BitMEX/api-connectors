/// <reference path="api.d.ts" />

namespace API.Client {
    'use strict';

    export interface Execution {

        execID: string;

        orderID?: string;

        clOrdID?: string;

        clOrdLinkID?: string;

        account?: number;

        symbol?: string;

        side?: string;

        lastQty?: number;

        lastPx?: number;

        underlyingLastPx?: number;

        lastMkt?: string;

        lastLiquidityInd?: string;

        simpleOrderQty?: number;

        orderQty?: number;

        price?: number;

        displayQty?: number;

        stopPx?: number;

        pegOffsetValue?: number;

        pegPriceType?: string;

        currency?: string;

        settlCurrency?: string;

        execType?: string;

        ordType?: string;

        timeInForce?: string;

        execInst?: string;

        contingencyType?: string;

        exDestination?: string;

        ordStatus?: string;

        triggered?: string;

        workingIndicator?: boolean;

        ordRejReason?: string;

        simpleLeavesQty?: number;

        leavesQty?: number;

        simpleCumQty?: number;

        cumQty?: number;

        avgPx?: number;

        commission?: number;

        tradePublishIndicator?: string;

        multiLegReportingType?: string;

        text?: string;

        trdMatchID?: string;

        execCost?: number;

        execComm?: number;

        homeNotional?: number;

        foreignNotional?: number;

        transactTime?: date;

        timestamp?: date;
    }

}
