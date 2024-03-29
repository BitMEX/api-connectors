//
// Trade.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


/** Individual &amp; Bucketed Trades */

public struct Trade: Codable {

    public var timestamp: Date
    public var symbol: String
    public var side: String?
    public var size: Double?
    public var price: Double?
    public var tickDirection: String?
    public var trdMatchID: String?
    public var grossValue: Double?
    public var homeNotional: Double?
    public var foreignNotional: Double?
    public var trdType: String?

    public init(timestamp: Date, symbol: String, side: String?, size: Double?, price: Double?, tickDirection: String?, trdMatchID: String?, grossValue: Double?, homeNotional: Double?, foreignNotional: Double?, trdType: String?) {
        self.timestamp = timestamp
        self.symbol = symbol
        self.side = side
        self.size = size
        self.price = price
        self.tickDirection = tickDirection
        self.trdMatchID = trdMatchID
        self.grossValue = grossValue
        self.homeNotional = homeNotional
        self.foreignNotional = foreignNotional
        self.trdType = trdType
    }


}

