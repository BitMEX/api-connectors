//
// NetworksConfig.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct NetworksConfig: Codable {

    public var network: String
    public var name: String?
    public var currency: String?
    public var networkSymbol: String?
    public var transactionExplorer: String?
    public var tokenExplorer: String?
    public var depositConfirmations: Int?
    public var enabled: Bool?

    public init(network: String, name: String?, currency: String?, networkSymbol: String?, transactionExplorer: String?, tokenExplorer: String?, depositConfirmations: Int?, enabled: Bool?) {
        self.network = network
        self.name = name
        self.currency = currency
        self.networkSymbol = networkSymbol
        self.transactionExplorer = transactionExplorer
        self.tokenExplorer = tokenExplorer
        self.depositConfirmations = depositConfirmations
        self.enabled = enabled
    }


}

