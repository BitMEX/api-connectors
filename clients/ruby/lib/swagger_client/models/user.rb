module SwaggerClient
  # 
  class User < BaseObject
    attr_accessor :id, :firstname, :lastname, :status, :username, :email, :phone, :country_code, :created, :last_updated, :preferences, :role, :tfa_enabled, :affiliate_id, :pgp_pub_key, :country, :disabled
    # attribute mapping from ruby-style variable name to JSON key
    def self.attribute_map
      {
        
        # 
        :'id' => :'id',
        
        # 
        :'firstname' => :'firstname',
        
        # 
        :'lastname' => :'lastname',
        
        # 
        :'status' => :'status',
        
        # 
        :'username' => :'username',
        
        # 
        :'email' => :'email',
        
        # 
        :'phone' => :'phone',
        
        # 
        :'country_code' => :'countryCode',
        
        # 
        :'created' => :'created',
        
        # 
        :'last_updated' => :'lastUpdated',
        
        # 
        :'preferences' => :'preferences',
        
        # 
        :'role' => :'role',
        
        # 
        :'tfa_enabled' => :'TFAEnabled',
        
        # 
        :'affiliate_id' => :'affiliateID',
        
        # 
        :'pgp_pub_key' => :'pgpPubKey',
        
        # 
        :'country' => :'country',
        
        # 
        :'disabled' => :'disabled'
        
      }
    end

    # attribute type
    def self.swagger_types
      {
        :'id' => :'Float',
        :'firstname' => :'String',
        :'lastname' => :'String',
        :'status' => :'String',
        :'username' => :'String',
        :'email' => :'String',
        :'phone' => :'String',
        :'country_code' => :'Float',
        :'created' => :'Date',
        :'last_updated' => :'Date',
        :'preferences' => :'UserPreferences',
        :'role' => :'String',
        :'tfa_enabled' => :'String',
        :'affiliate_id' => :'String',
        :'pgp_pub_key' => :'String',
        :'country' => :'String',
        :'disabled' => :'BOOLEAN'
        
      }
    end

    def initialize(attributes = {})
      return if !attributes.is_a?(Hash) || attributes.empty?

      # convert string to symbol for hash key
      attributes = attributes.inject({}){|memo,(k,v)| memo[k.to_sym] = v; memo}

      
      if attributes[:'id']
        self.id = attributes[:'id']
      end
      
      if attributes[:'firstname']
        self.firstname = attributes[:'firstname']
      end
      
      if attributes[:'lastname']
        self.lastname = attributes[:'lastname']
      end
      
      if attributes[:'status']
        self.status = attributes[:'status']
      end
      
      if attributes[:'username']
        self.username = attributes[:'username']
      end
      
      if attributes[:'email']
        self.email = attributes[:'email']
      end
      
      if attributes[:'phone']
        self.phone = attributes[:'phone']
      end
      
      if attributes[:'countryCode']
        self.country_code = attributes[:'countryCode']
      end
      
      if attributes[:'created']
        self.created = attributes[:'created']
      end
      
      if attributes[:'lastUpdated']
        self.last_updated = attributes[:'lastUpdated']
      end
      
      if attributes[:'preferences']
        self.preferences = attributes[:'preferences']
      end
      
      if attributes[:'role']
        self.role = attributes[:'role']
      end
      
      if attributes[:'TFAEnabled']
        self.tfa_enabled = attributes[:'TFAEnabled']
      end
      
      if attributes[:'affiliateID']
        self.affiliate_id = attributes[:'affiliateID']
      end
      
      if attributes[:'pgpPubKey']
        self.pgp_pub_key = attributes[:'pgpPubKey']
      end
      
      if attributes[:'country']
        self.country = attributes[:'country']
      end
      
      if attributes[:'disabled']
        self.disabled = attributes[:'disabled']
      end
      
    end

    def ==(o)
      return true if self.equal?(o)
      self.class == o.class &&
          id == o.id &&
          firstname == o.firstname &&
          lastname == o.lastname &&
          status == o.status &&
          username == o.username &&
          email == o.email &&
          phone == o.phone &&
          country_code == o.country_code &&
          created == o.created &&
          last_updated == o.last_updated &&
          preferences == o.preferences &&
          role == o.role &&
          tfa_enabled == o.tfa_enabled &&
          affiliate_id == o.affiliate_id &&
          pgp_pub_key == o.pgp_pub_key &&
          country == o.country &&
          disabled == o.disabled
    end

    def eql?(o)
      self == o
    end

    def hash
      [id, firstname, lastname, status, username, email, phone, country_code, created, last_updated, preferences, role, tfa_enabled, affiliate_id, pgp_pub_key, country, disabled].hash
    end
  end
end
