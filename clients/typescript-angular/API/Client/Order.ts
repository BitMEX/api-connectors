/// <reference path="api.d.ts" />

namespace API.Client {
    'use strict';

    export interface Order {

        orderID: string;

        clOrdID?: string;

        account?: number;

        symbol?: string;

        side?: string;

        simpleOrderQty?: number;

        orderQty?: number;

        price?: number;

        minQty?: number;

        stopPx?: number;

        currency?: string;

        settlCurrency?: string;

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

        multiLegReportingType?: string;

        text?: string;

        transactTime?: date;

        timestamp?: date;
    }

}
