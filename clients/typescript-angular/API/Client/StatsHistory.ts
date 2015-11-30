/// <reference path="api.d.ts" />

namespace API.Client {
    'use strict';

    export interface StatsHistory {

        date: date;

        rootSymbol: string;

        currency?: string;

        volume?: number;

        turnover?: number;
    }

}
