/// <reference path="api.d.ts" />

namespace API.Client {
    'use strict';

    export interface LiquidationOrder {

        symbol?: string;

        side?: string;

        qty?: number;

        price?: number;
    }

}
