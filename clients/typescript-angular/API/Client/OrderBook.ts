/// <reference path="api.d.ts" />

namespace API.Client {
    'use strict';

    export interface OrderBook {

        symbol: string;

        level: number;

        bidSize?: number;

        bidPrice?: number;

        askPrice?: number;

        askSize?: number;

        timestamp?: date;
    }

}
