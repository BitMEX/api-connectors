//
// StakingRecord.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


/** Get the current user staking amount in vertical format. */

public struct StakingRecord: Codable {

    public var account: Double
    public var amount: Double?
    public var currency: String?

    public init(account: Double, amount: Double?, currency: String?) {
        self.account = account
        self.amount = amount
        self.currency = currency
    }


}
