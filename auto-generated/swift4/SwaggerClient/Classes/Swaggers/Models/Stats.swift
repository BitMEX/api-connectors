//
// Stats.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


/** Exchange Statistics */

public struct Stats: Codable {

    public var rootSymbol: String
    public var currency: String?
    public var volume24h: Int64?
    public var turnover24h: Int64?
    public var openInterest: Int64?
    public var openValue: Int64?

    public init(rootSymbol: String, currency: String?, volume24h: Int64?, turnover24h: Int64?, openInterest: Int64?, openValue: Int64?) {
        self.rootSymbol = rootSymbol
        self.currency = currency
        self.volume24h = volume24h
        self.turnover24h = turnover24h
        self.openInterest = openInterest
        self.openValue = openValue
    }


}

