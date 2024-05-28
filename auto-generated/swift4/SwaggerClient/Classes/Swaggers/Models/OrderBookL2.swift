//
// OrderBookL2.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct OrderBookL2: Codable {

    public var symbol: String
    public var _id: Int64
    public var side: String
    public var size: Int64?
    public var price: Double?
    public var timestamp: Date?

    public init(symbol: String, _id: Int64, side: String, size: Int64?, price: Double?, timestamp: Date?) {
        self.symbol = symbol
        self._id = _id
        self.side = side
        self.size = size
        self.price = price
        self.timestamp = timestamp
    }

    public enum CodingKeys: String, CodingKey { 
        case symbol
        case _id = "id"
        case side
        case size
        case price
        case timestamp
    }


}

