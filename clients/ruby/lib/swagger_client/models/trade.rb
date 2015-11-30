module SwaggerClient
  # 
  class Trade < BaseObject
    attr_accessor :timestamp, :symbol, :side, :size, :price, :tick_direction, :trd_match_id, :gross_value, :home_notional, :foreign_notional, :id
    # attribute mapping from ruby-style variable name to JSON key
    def self.attribute_map
      {
        
        # 
        :'timestamp' => :'timestamp',
        
        # 
        :'symbol' => :'symbol',
        
        # 
        :'side' => :'side',
        
        # 
        :'size' => :'size',
        
        # 
        :'price' => :'price',
        
        # 
        :'tick_direction' => :'tickDirection',
        
        # 
        :'trd_match_id' => :'trdMatchID',
        
        # 
        :'gross_value' => :'grossValue',
        
        # 
        :'home_notional' => :'homeNotional',
        
        # 
        :'foreign_notional' => :'foreignNotional',
        
        # 
        :'id' => :'id'
        
      }
    end

    # attribute type
    def self.swagger_types
      {
        :'timestamp' => :'Date',
        :'symbol' => :'String',
        :'side' => :'String',
        :'size' => :'Float',
        :'price' => :'Float',
        :'tick_direction' => :'String',
        :'trd_match_id' => :'String',
        :'gross_value' => :'Float',
        :'home_notional' => :'Float',
        :'foreign_notional' => :'Float',
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
      
      if attributes[:'side']
        self.side = attributes[:'side']
      end
      
      if attributes[:'size']
        self.size = attributes[:'size']
      end
      
      if attributes[:'price']
        self.price = attributes[:'price']
      end
      
      if attributes[:'tickDirection']
        self.tick_direction = attributes[:'tickDirection']
      end
      
      if attributes[:'trdMatchID']
        self.trd_match_id = attributes[:'trdMatchID']
      end
      
      if attributes[:'grossValue']
        self.gross_value = attributes[:'grossValue']
      end
      
      if attributes[:'homeNotional']
        self.home_notional = attributes[:'homeNotional']
      end
      
      if attributes[:'foreignNotional']
        self.foreign_notional = attributes[:'foreignNotional']
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
          side == o.side &&
          size == o.size &&
          price == o.price &&
          tick_direction == o.tick_direction &&
          trd_match_id == o.trd_match_id &&
          gross_value == o.gross_value &&
          home_notional == o.home_notional &&
          foreign_notional == o.foreign_notional &&
          id == o.id
    end

    def eql?(o)
      self == o
    end

    def hash
      [timestamp, symbol, side, size, price, tick_direction, trd_match_id, gross_value, home_notional, foreign_notional, id].hash
    end
  end
end
