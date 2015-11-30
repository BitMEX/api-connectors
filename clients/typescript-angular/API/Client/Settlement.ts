/// <reference path="api.d.ts" />

namespace API.Client {
    'use strict';

    export interface Settlement {

        symbol: string;

        timestamp: date;

        settlementType?: string;

        settledPrice?: number;

        bankrupt?: number;

        taxBase?: number;

        taxRate?: number;
    }

}
