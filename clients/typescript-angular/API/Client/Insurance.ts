/// <reference path="api.d.ts" />

namespace API.Client {
    'use strict';

    export interface Insurance {

        currency: string;

        timestamp: date;

        walletBalance?: number;
    }

}
