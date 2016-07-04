/// <reference path="api.d.ts" />

namespace API.Client {
    'use strict';

    export interface UserPreferences {

        announcementsLastSeen?: date;

        colorTheme?: string;

        currency?: string;

        debug?: boolean;

        disableEmails?: Array<string>;

        hideConfirmDialogs?: Array<string>;

        hideConnectionModal?: boolean;

        hideFromLeaderboard?: boolean;

        hideNameFromLeaderboard?: boolean;

        hideNotifications?: Array<string>;

        hidePhoneConfirm?: boolean;

        locale?: string;

        msgsSeen?: Array<string>;

        orderBookBinning?: number;

        orderBookType?: string;

        orderControlsPlusMinus?: boolean;

        sounds?: Array<string>;

        strictIPCheck?: boolean;

        strictTimeout?: boolean;

        tickerGroup?: string;

        tickerPinned?: boolean;

        tradeLayout?: string;
    }

}
