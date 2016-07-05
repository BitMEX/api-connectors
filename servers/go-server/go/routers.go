package 

import (
	"net/http"
	"fmt"
	"github.com/gorilla/mux"
)

type Route struct {
	Name        string
	Method      string
	Pattern     string
	HandlerFunc http.HandlerFunc
}

type Routes []Route

func NewRouter() *mux.Router {
	router := mux.NewRouter().StrictSlash(true)
	for _, route := range routes {
		var handler http.Handler
		handler = route.HandlerFunc
		handler = Logger(handler, route.Name)

		router.
			Methods(route.Method).
			Path(route.Pattern).
			Name(route.Name).
			Handler(handler)
	}

	return router
}

func Index(w http.ResponseWriter, r *http.Request) {
	fmt.Fprintf(w, "Hello World!")
}

var routes = Routes{
	Route{
		"Index",
		"GET",
		"/",
		Index,
	},

	Route{
		"AnnouncementGet",
		"GET",
		"/announcement",
		AnnouncementGet,
	},

	Route{
		"AnnouncementGetUrgent",
		"GET",
		"/announcement/urgent",
		AnnouncementGetUrgent,
	},

	Route{
		"ApiKeyDisable",
		"POST",
		"/apiKey/disable",
		ApiKeyDisable,
	},

	Route{
		"ApiKeyEnable",
		"POST",
		"/apiKey/enable",
		ApiKeyEnable,
	},

	Route{
		"ApiKeyGet",
		"GET",
		"/apiKey",
		ApiKeyGet,
	},

	Route{
		"ApiKeyNew",
		"POST",
		"/apiKey",
		ApiKeyNew,
	},

	Route{
		"ApiKeyRemove",
		"DELETE",
		"/apiKey",
		ApiKeyRemove,
	},

	Route{
		"ChatGet",
		"GET",
		"/chat",
		ChatGet,
	},

	Route{
		"ChatGetConnected",
		"GET",
		"/chat/connected",
		ChatGetConnected,
	},

	Route{
		"ChatNew",
		"POST",
		"/chat",
		ChatNew,
	},

	Route{
		"ExecutionGet",
		"GET",
		"/execution",
		ExecutionGet,
	},

	Route{
		"ExecutionGetTradeHistory",
		"GET",
		"/execution/tradeHistory",
		ExecutionGetTradeHistory,
	},

	Route{
		"FundingGet",
		"GET",
		"/funding",
		FundingGet,
	},

	Route{
		"InstrumentGet",
		"GET",
		"/instrument",
		InstrumentGet,
	},

	Route{
		"InstrumentGetActive",
		"GET",
		"/instrument/active",
		InstrumentGetActive,
	},

	Route{
		"InstrumentGetActiveAndIndices",
		"GET",
		"/instrument/activeAndIndices",
		InstrumentGetActiveAndIndices,
	},

	Route{
		"InstrumentGetActiveIntervals",
		"GET",
		"/instrument/activeIntervals",
		InstrumentGetActiveIntervals,
	},

	Route{
		"InstrumentGetIndices",
		"GET",
		"/instrument/indices",
		InstrumentGetIndices,
	},

	Route{
		"InsuranceGet",
		"GET",
		"/insurance",
		InsuranceGet,
	},

	Route{
		"LeaderboardGet",
		"GET",
		"/leaderboard",
		LeaderboardGet,
	},

	Route{
		"LiquidationGet",
		"GET",
		"/liquidation",
		LiquidationGet,
	},

	Route{
		"OrderAmend",
		"PUT",
		"/order",
		OrderAmend,
	},

	Route{
		"OrderAmendBulk",
		"PUT",
		"/order/bulk",
		OrderAmendBulk,
	},

	Route{
		"OrderCancel",
		"DELETE",
		"/order",
		OrderCancel,
	},

	Route{
		"OrderCancelAll",
		"DELETE",
		"/order/all",
		OrderCancelAll,
	},

	Route{
		"OrderCancelAllAfter",
		"POST",
		"/order/cancelAllAfter",
		OrderCancelAllAfter,
	},

	Route{
		"OrderClosePosition",
		"POST",
		"/order/closePosition",
		OrderClosePosition,
	},

	Route{
		"OrderGetOrders",
		"GET",
		"/order",
		OrderGetOrders,
	},

	Route{
		"OrderNew",
		"POST",
		"/order",
		OrderNew,
	},

	Route{
		"OrderNewBulk",
		"POST",
		"/order/bulk",
		OrderNewBulk,
	},

	Route{
		"OrderBookGet",
		"GET",
		"/orderBook",
		OrderBookGet,
	},

	Route{
		"OrderBookGetL2",
		"GET",
		"/orderBook/L2",
		OrderBookGetL2,
	},

	Route{
		"PositionGet",
		"GET",
		"/position",
		PositionGet,
	},

	Route{
		"PositionIsolateMargin",
		"POST",
		"/position/isolate",
		PositionIsolateMargin,
	},

	Route{
		"PositionTransferIsolatedMargin",
		"POST",
		"/position/transferMargin",
		PositionTransferIsolatedMargin,
	},

	Route{
		"PositionUpdateLeverage",
		"POST",
		"/position/leverage",
		PositionUpdateLeverage,
	},

	Route{
		"QuoteGet",
		"GET",
		"/quote",
		QuoteGet,
	},

	Route{
		"QuoteGetBucketed",
		"GET",
		"/quote/bucketed",
		QuoteGetBucketed,
	},

	Route{
		"SchemaGet",
		"GET",
		"/schema",
		SchemaGet,
	},

	Route{
		"SchemaWebsocketHelp",
		"GET",
		"/schema/websocketHelp",
		SchemaWebsocketHelp,
	},

	Route{
		"SettlementGet",
		"GET",
		"/settlement",
		SettlementGet,
	},

	Route{
		"StatsGet",
		"GET",
		"/stats",
		StatsGet,
	},

	Route{
		"StatsHistory",
		"GET",
		"/stats/history",
		StatsHistory,
	},

	Route{
		"TradeGet",
		"GET",
		"/trade",
		TradeGet,
	},

	Route{
		"TradeGetBucketed",
		"GET",
		"/trade/bucketed",
		TradeGetBucketed,
	},

	Route{
		"UserCancelWithdrawal",
		"POST",
		"/user/cancelWithdrawal",
		UserCancelWithdrawal,
	},

	Route{
		"UserCheckReferralCode",
		"GET",
		"/user/checkReferralCode",
		UserCheckReferralCode,
	},

	Route{
		"UserConfirmEmail",
		"POST",
		"/user/confirmEmail",
		UserConfirmEmail,
	},

	Route{
		"UserConfirmEnableTFA",
		"POST",
		"/user/confirmEnableTFA",
		UserConfirmEnableTFA,
	},

	Route{
		"UserConfirmPasswordReset",
		"POST",
		"/user/confirmPasswordReset",
		UserConfirmPasswordReset,
	},

	Route{
		"UserConfirmWithdrawal",
		"POST",
		"/user/confirmWithdrawal",
		UserConfirmWithdrawal,
	},

	Route{
		"UserDisableTFA",
		"POST",
		"/user/disableTFA",
		UserDisableTFA,
	},

	Route{
		"UserGet",
		"GET",
		"/user",
		UserGet,
	},

	Route{
		"UserGetAffiliateStatus",
		"GET",
		"/user/affiliateStatus",
		UserGetAffiliateStatus,
	},

	Route{
		"UserGetCommission",
		"GET",
		"/user/commission",
		UserGetCommission,
	},

	Route{
		"UserGetDepositAddress",
		"GET",
		"/user/depositAddress",
		UserGetDepositAddress,
	},

	Route{
		"UserGetMargin",
		"GET",
		"/user/margin",
		UserGetMargin,
	},

	Route{
		"UserGetWalletHistory",
		"GET",
		"/user/walletHistory",
		UserGetWalletHistory,
	},

	Route{
		"UserLogin",
		"POST",
		"/user/login",
		UserLogin,
	},

	Route{
		"UserLogout",
		"POST",
		"/user/logout",
		UserLogout,
	},

	Route{
		"UserLogoutAll",
		"POST",
		"/user/logoutAll",
		UserLogoutAll,
	},

	Route{
		"UserNew",
		"POST",
		"/user",
		UserNew,
	},

	Route{
		"UserRequestEnableTFA",
		"POST",
		"/user/requestEnableTFA",
		UserRequestEnableTFA,
	},

	Route{
		"UserRequestPasswordReset",
		"POST",
		"/user/requestPasswordReset",
		UserRequestPasswordReset,
	},

	Route{
		"UserRequestWithdrawal",
		"POST",
		"/user/requestWithdrawal",
		UserRequestWithdrawal,
	},

	Route{
		"UserSavePreferences",
		"POST",
		"/user/preferences",
		UserSavePreferences,
	},

	Route{
		"UserSendVerificationEmail",
		"POST",
		"/user/resendVerificationEmail",
		UserSendVerificationEmail,
	},

	Route{
		"UserUpdate",
		"PUT",
		"/user",
		UserUpdate,
	},

}