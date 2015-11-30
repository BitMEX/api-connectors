/// <reference path="api.d.ts" />

namespace API.Client {
    'use strict';

    export interface AccessToken {

        id: string;

        /**
         * time to live in seconds (2 weeks by default)
         */
        ttl?: number;

        created?: date;

        userId?: number;
    }

}
