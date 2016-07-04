module SwaggerClient
  # 
  class Insurance < BaseObject
    attr_accessor :currency, :timestamp, :wallet_balance
    # attribute mapping from ruby-style variable name to JSON key
    def self.attribute_map
      {
        
        # 
        :'currency' => :'currency',
        
        # 
        :'timestamp' => :'timestamp',
        
        # 
        :'wallet_balance' => :'walletBalance'
        
      }
    end

    # attribute type
    def self.swagger_types
      {
        :'currency' => :'String',
        :'timestamp' => :'Date',
        :'wallet_balance' => :'Float'
        
      }
    end

    def initialize(attributes = {})
      return if !attributes.is_a?(Hash) || attributes.empty?

      # convert string to symbol for hash key
      attributes = attributes.inject({}){|memo,(k,v)| memo[k.to_sym] = v; memo}

      
      if attributes[:'currency']
        self.currency = attributes[:'currency']
      end
      
      if attributes[:'timestamp']
        self.timestamp = attributes[:'timestamp']
      end
      
      if attributes[:'walletBalance']
        self.wallet_balance = attributes[:'walletBalance']
      end
      
    end

    def ==(o)
      return true if self.equal?(o)
      self.class == o.class &&
          currency == o.currency &&
          timestamp == o.timestamp &&
          wallet_balance == o.wallet_balance
    end

    def eql?(o)
      self == o
    end

    def hash
      [currency, timestamp, wallet_balance].hash
    end
  end
end
