//
// Margin.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct Margin: Codable {

    public var account: Int64
    public var currency: String
    public var riskLimit: Int64?
    public var state: String?
    public var amount: Int64?
    public var prevRealisedPnl: Int64?
    public var grossComm: Int64?
    public var grossOpenCost: Int64?
    public var grossOpenPremium: Int64?
    public var grossExecCost: Int64?
    public var grossMarkValue: Int64?
    public var riskValue: Int64?
    public var initMargin: Int64?
    public var maintMargin: Int64?
    public var targetExcessMargin: Int64?
    public var realisedPnl: Int64?
    public var unrealisedPnl: Int64?
    public var walletBalance: Int64?
    public var marginBalance: Int64?
    public var marginLeverage: Double?
    public var marginUsedPcnt: Double?
    public var excessMargin: Int64?
    public var availableMargin: Int64?
    public var withdrawableMargin: Int64?
    public var makerFeeDiscount: Double?
    public var takerFeeDiscount: Double?
    public var timestamp: Date?

    public init(account: Int64, currency: String, riskLimit: Int64?, state: String?, amount: Int64?, prevRealisedPnl: Int64?, grossComm: Int64?, grossOpenCost: Int64?, grossOpenPremium: Int64?, grossExecCost: Int64?, grossMarkValue: Int64?, riskValue: Int64?, initMargin: Int64?, maintMargin: Int64?, targetExcessMargin: Int64?, realisedPnl: Int64?, unrealisedPnl: Int64?, walletBalance: Int64?, marginBalance: Int64?, marginLeverage: Double?, marginUsedPcnt: Double?, excessMargin: Int64?, availableMargin: Int64?, withdrawableMargin: Int64?, makerFeeDiscount: Double?, takerFeeDiscount: Double?, timestamp: Date?) {
        self.account = account
        self.currency = currency
        self.riskLimit = riskLimit
        self.state = state
        self.amount = amount
        self.prevRealisedPnl = prevRealisedPnl
        self.grossComm = grossComm
        self.grossOpenCost = grossOpenCost
        self.grossOpenPremium = grossOpenPremium
        self.grossExecCost = grossExecCost
        self.grossMarkValue = grossMarkValue
        self.riskValue = riskValue
        self.initMargin = initMargin
        self.maintMargin = maintMargin
        self.targetExcessMargin = targetExcessMargin
        self.realisedPnl = realisedPnl
        self.unrealisedPnl = unrealisedPnl
        self.walletBalance = walletBalance
        self.marginBalance = marginBalance
        self.marginLeverage = marginLeverage
        self.marginUsedPcnt = marginUsedPcnt
        self.excessMargin = excessMargin
        self.availableMargin = availableMargin
        self.withdrawableMargin = withdrawableMargin
        self.makerFeeDiscount = makerFeeDiscount
        self.takerFeeDiscount = takerFeeDiscount
        self.timestamp = timestamp
    }


}

