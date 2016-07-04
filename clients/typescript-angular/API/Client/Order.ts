/// <reference path="api.d.ts" />

namespace API.Client {
    'use strict';

    export interface Order {

        orderID: string;

        clOrdID?: string;

        clOrdLinkID?: string;

        account?: number;

        symbol?: string;

        side?: string;

        simpleOrderQty?: number;

        orderQty?: number;

        price?: number;

        displayQty?: number;

        stopPx?: number;

        pegOffsetValue?: number;

        pegPriceType?: string;

        currency?: string;

        settlCurrency?: string;

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

        multiLegReportingType?: string;

        text?: string;

        transactTime?: date;

        timestamp?: date;
    }

}
