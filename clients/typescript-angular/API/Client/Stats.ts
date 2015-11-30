/// <reference path="api.d.ts" />

namespace API.Client {
    'use strict';

    export interface Stats {

        rootSymbol: string;

        currency?: string;

        volume24h?: number;

        turnover24h?: number;

        openInterest?: number;

        openValue?: number;
    }

}
