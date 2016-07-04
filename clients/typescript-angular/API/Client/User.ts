/// <reference path="api.d.ts" />

namespace API.Client {
    'use strict';

    export interface User {

        id?: number;

        ownerId?: number;

        firstname?: string;

        lastname?: string;

        status?: string;

        username: string;

        email: string;

        phone?: string;

        countryCode?: number;

        created?: date;

        lastUpdated?: date;

        preferences?: UserPreferences;

        tFAEnabled?: string;

        affiliateID?: string;

        pgpPubKey?: string;

        country?: string;

        disabled?: boolean;
    }

}
