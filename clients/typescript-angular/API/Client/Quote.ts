/// <reference path="api.d.ts" />

namespace API.Client {
    'use strict';

    export interface Quote {

        timestamp?: date;

        symbol?: string;

        bidSize?: number;

        bidPrice?: number;

        askPrice?: number;

        askSize?: number;

        id?: number;
    }

}
