/// <reference path="api.d.ts" />

namespace API.Client {
    'use strict';

    export interface Leaderboard {

        name: string;

        isRealName?: boolean;

        isMe?: boolean;

        profit?: number;
    }

}
