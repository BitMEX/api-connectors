/// <reference path="api.d.ts" />

namespace API.Client {
    'use strict';

    export interface Affiliate {

        account: number;

        currency: string;

        prevPayout?: number;

        prevTurnover?: number;

        prevComm?: number;

        prevTimestamp?: date;

        execTurnover?: number;

        execComm?: number;

        totalReferrals?: number;

        totalTurnover?: number;

        totalComm?: number;

        payoutPcnt?: number;

        pendingPayout?: number;

        timestamp?: date;
    }

}
