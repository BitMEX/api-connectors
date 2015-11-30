module SwaggerClient
  # 
  class OrderBook < BaseObject
    attr_accessor :symbol, :level, :bid_size, :bid_price, :ask_price, :ask_size, :timestamp
    # attribute mapping from ruby-style variable name to JSON key
    def self.attribute_map
      {
        
        # 
        :'symbol' => :'symbol',
        
        # 
        :'level' => :'level',
        
        # 
        :'bid_size' => :'bidSize',
        
        # 
        :'bid_price' => :'bidPrice',
        
        # 
        :'ask_price' => :'askPrice',
        
        # 
        :'ask_size' => :'askSize',
        
        # 
        :'timestamp' => :'timestamp'
        
      }
    end

    # attribute type
    def self.swagger_types
      {
        :'symbol' => :'String',
        :'level' => :'Float',
        :'bid_size' => :'Float',
        :'bid_price' => :'Float',
        :'ask_price' => :'Float',
        :'ask_size' => :'Float',
        :'timestamp' => :'Date'
        
      }
    end

    def initialize(attributes = {})
      return if !attributes.is_a?(Hash) || attributes.empty?

      # convert string to symbol for hash key
      attributes = attributes.inject({}){|memo,(k,v)| memo[k.to_sym] = v; memo}

      
      if attributes[:'symbol']
        self.symbol = attributes[:'symbol']
      end
      
      if attributes[:'level']
        self.level = attributes[:'level']
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
      
      if attributes[:'timestamp']
        self.timestamp = attributes[:'timestamp']
      end
      
    end

    def ==(o)
      return true if self.equal?(o)
      self.class == o.class &&
          symbol == o.symbol &&
          level == o.level &&
          bid_size == o.bid_size &&
          bid_price == o.bid_price &&
          ask_price == o.ask_price &&
          ask_size == o.ask_size &&
          timestamp == o.timestamp
    end

    def eql?(o)
      self == o
    end

    def hash
      [symbol, level, bid_size, bid_price, ask_price, ask_size, timestamp].hash
    end
  end
end
