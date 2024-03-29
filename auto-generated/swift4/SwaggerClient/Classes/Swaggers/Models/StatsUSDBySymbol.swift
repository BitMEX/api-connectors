//
// StatsUSDBySymbol.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct StatsUSDBySymbol: Codable {

    public var symbol: String
    public var currency: String?
    public var turnover24h: Double?
    public var turnover30d: Double?
    public var turnover365d: Double?
    public var turnover: Double?

    public init(symbol: String, currency: String?, turnover24h: Double?, turnover30d: Double?, turnover365d: Double?, turnover: Double?) {
        self.symbol = symbol
        self.currency = currency
        self.turnover24h = turnover24h
        self.turnover30d = turnover30d
        self.turnover365d = turnover365d
        self.turnover = turnover
    }


}

