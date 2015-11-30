/// <reference path="api.d.ts" />

namespace API.Client {
    'use strict';

    export interface TradeBin {

        timestamp?: date;

        symbol?: string;

        open?: number;

        high?: number;

        low?: number;

        close?: number;

        trades?: number;

        volume?: number;

        vwap?: number;

        lastSize?: number;

        turnover?: number;

        homeNotional?: number;

        foreignNotional?: number;

        id?: number;
    }

}
