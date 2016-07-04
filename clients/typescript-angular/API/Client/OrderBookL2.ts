/// <reference path="api.d.ts" />

namespace API.Client {
    'use strict';

    export interface OrderBookL2 {

        symbol: string;

        id: number;

        side: string;

        size?: number;

        price?: number;
    }

}
