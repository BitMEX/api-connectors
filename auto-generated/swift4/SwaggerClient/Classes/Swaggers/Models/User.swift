//
// User.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


/** Account Operations */

public struct User: Codable {

    public var _id: Double?
    public var ownerId: Double?
    public var firstname: String?
    public var lastname: String?
    public var username: String
    public var email: String?
    public var phone: String?
    public var created: Date?
    public var lastUpdated: Date?
    public var preferences: UserPreferences?
    public var tFAEnabled: String?
    public var affiliateID: String?
    public var pgpPubKey: String?
    public var pgpPubKeyCreated: Date?
    public var country: String?
    public var geoipCountry: String?
    public var geoipRegion: String?
    public var typ: String?

    public init(_id: Double?, ownerId: Double?, firstname: String?, lastname: String?, username: String, email: String?, phone: String?, created: Date?, lastUpdated: Date?, preferences: UserPreferences?, tFAEnabled: String?, affiliateID: String?, pgpPubKey: String?, pgpPubKeyCreated: Date?, country: String?, geoipCountry: String?, geoipRegion: String?, typ: String?) {
        self._id = _id
        self.ownerId = ownerId
        self.firstname = firstname
        self.lastname = lastname
        self.username = username
        self.email = email
        self.phone = phone
        self.created = created
        self.lastUpdated = lastUpdated
        self.preferences = preferences
        self.tFAEnabled = tFAEnabled
        self.affiliateID = affiliateID
        self.pgpPubKey = pgpPubKey
        self.pgpPubKeyCreated = pgpPubKeyCreated
        self.country = country
        self.geoipCountry = geoipCountry
        self.geoipRegion = geoipRegion
        self.typ = typ
    }

    public enum CodingKeys: String, CodingKey { 
        case _id = "id"
        case ownerId
        case firstname
        case lastname
        case username
        case email
        case phone
        case created
        case lastUpdated
        case preferences
        case tFAEnabled = "TFAEnabled"
        case affiliateID
        case pgpPubKey
        case pgpPubKeyCreated
        case country
        case geoipCountry
        case geoipRegion
        case typ
    }


}

