/// <reference path="api.d.ts" />

namespace API.Client {
    'use strict';

    export interface ApiKey {

        id: string;

        secret: string;

        name: string;

        nonce: number;

        cidr?: string;

        permissions?: Array<string>;

        enabled?: boolean;

        userId: number;

        created?: date;
    }

}
