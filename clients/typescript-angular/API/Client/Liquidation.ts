/// <reference path="api.d.ts" />

namespace API.Client {
    'use strict';

    export interface Liquidation {

        orderID: string;

        symbol?: string;

        side?: string;

        price?: number;

        leavesQty?: number;
    }

}
