/// <reference path="api.d.ts" />

namespace API.Client {
    'use strict';

    export interface Funding {

        timestamp: date;

        symbol: string;

        fundingInterval?: date;

        fundingRate?: number;

        fundingRateDaily?: number;
    }

}
