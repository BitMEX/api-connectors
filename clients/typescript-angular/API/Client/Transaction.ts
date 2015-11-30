/// <reference path="api.d.ts" />

namespace API.Client {
    'use strict';

    export interface Transaction {

        transactID: string;

        account?: number;

        currency?: string;

        transactType?: string;

        amount?: number;

        fee?: number;

        transactStatus?: string;

        address?: string;

        tx?: string;

        text?: string;

        transactTime?: date;

        timestamp?: date;
    }

}
