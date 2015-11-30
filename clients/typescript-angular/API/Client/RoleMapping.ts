/// <reference path="api.d.ts" />

namespace API.Client {
    'use strict';

    /**
     * Map principals to roles
     */
    export interface RoleMapping {

        id?: number;

        /**
         * The principal type, such as user, application, or role
         */
        principalType?: string;

        principalId?: string;

        roleId?: number;
    }

}
