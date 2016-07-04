/// <reference path="api.d.ts" />

namespace API.Client {
    'use strict';

    export interface Settlement {

        timestamp: date;

        symbol: string;

        settlementType?: string;

        settledPrice?: number;

        bankrupt?: number;

        taxBase?: number;

        taxRate?: number;
    }

}
