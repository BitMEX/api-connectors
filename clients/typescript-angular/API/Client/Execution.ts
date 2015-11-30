/// <reference path="api.d.ts" />

namespace API.Client {
    'use strict';

    export interface Execution {

        execID: string;

        orderID?: string;

        clOrdID?: string;

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

        minQty?: number;

        stopPx?: number;

        currency?: string;

        settlCurrency?: string;

        execType?: string;

        ordType?: string;

        timeInForce?: string;

        exDestination?: string;

        ordStatus?: string;

        workingIndicator?: boolean;

        ordRejReason?: string;

        simpleLeavesQty?: number;

        leavesQty?: number;

        simpleCumQty?: number;

        cumQty?: number;

        avgPx?: number;

        commission?: number;

        commType?: string;

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
