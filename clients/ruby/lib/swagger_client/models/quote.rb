module SwaggerClient
  # 
  class Quote < BaseObject
    attr_accessor :timestamp, :symbol, :bid_size, :bid_price, :ask_price, :ask_size, :id
    # attribute mapping from ruby-style variable name to JSON key
    def self.attribute_map
      {
        
        # 
        :'timestamp' => :'timestamp',
        
        # 
        :'symbol' => :'symbol',
        
        # 
        :'bid_size' => :'bidSize',
        
        # 
        :'bid_price' => :'bidPrice',
        
        # 
        :'ask_price' => :'askPrice',
        
        # 
        :'ask_size' => :'askSize',
        
        # 
        :'id' => :'id'
        
      }
    end

    # attribute type
    def self.swagger_types
      {
        :'timestamp' => :'Date',
        :'symbol' => :'String',
        :'bid_size' => :'Float',
        :'bid_price' => :'Float',
        :'ask_price' => :'Float',
        :'ask_size' => :'Float',
        :'id' => :'Float'
        
      }
    end

    def initialize(attributes = {})
      return if !attributes.is_a?(Hash) || attributes.empty?

      # convert string to symbol for hash key
      attributes = attributes.inject({}){|memo,(k,v)| memo[k.to_sym] = v; memo}

      
      if attributes[:'timestamp']
        self.timestamp = attributes[:'timestamp']
      end
      
      if attributes[:'symbol']
        self.symbol = attributes[:'symbol']
      end
      
      if attributes[:'bidSize']
        self.bid_size = attributes[:'bidSize']
      end
      
      if attributes[:'bidPrice']
        self.bid_price = attributes[:'bidPrice']
      end
      
      if attributes[:'askPrice']
        self.ask_price = attributes[:'askPrice']
      end
      
      if attributes[:'askSize']
        self.ask_size = attributes[:'askSize']
      end
      
      if attributes[:'id']
        self.id = attributes[:'id']
      end
      
    end

    def ==(o)
      return true if self.equal?(o)
      self.class == o.class &&
          timestamp == o.timestamp &&
          symbol == o.symbol &&
          bid_size == o.bid_size &&
          bid_price == o.bid_price &&
          ask_price == o.ask_price &&
          ask_size == o.ask_size &&
          id == o.id
    end

    def eql?(o)
      self == o
    end

    def hash
      [timestamp, symbol, bid_size, bid_price, ask_price, ask_size, id].hash
    end
  end
end
