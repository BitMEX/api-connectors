/// <reference path="api.d.ts" />

namespace API.Client {
    'use strict';

    export interface Trade {

        timestamp?: date;

        symbol?: string;

        side?: string;

        size?: number;

        price?: number;

        tickDirection?: string;

        trdMatchID?: string;

        grossValue?: number;

        homeNotional?: number;

        foreignNotional?: number;

        id?: number;
    }

}
