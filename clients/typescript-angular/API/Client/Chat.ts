/// <reference path="api.d.ts" />

namespace API.Client {
    'use strict';

    export interface Chat {

        id?: number;

        date: date;

        user: string;

        message: string;

        html: string;

        fromBot?: boolean;
    }

}
