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

        hideNotifications?: Array<string>;

        hidePhoneConfirm?: boolean;

        msgsSeen?: Array<string>;

        orderBookBinning?: number;

        orderControlsPlusMinus?: boolean;

        sounds?: Array<string>;

        strictIPCheck?: boolean;

        tickerGroup?: string;

        tickerPinned?: boolean;

        tradeLayout?: string;
    }

}
