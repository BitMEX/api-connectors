/// <reference path="api.d.ts" />

namespace API.Client {
    'use strict';

    export interface Announcement {

        id: number;

        link?: string;

        title?: string;

        content?: string;

        date?: date;
    }

}
