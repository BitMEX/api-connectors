module SwaggerClient
  # 
  class OrderBookL2 < BaseObject
    attr_accessor :symbol, :id, :side, :size, :price
    # attribute mapping from ruby-style variable name to JSON key
    def self.attribute_map
      {
        
        # 
        :'symbol' => :'symbol',
        
        # 
        :'id' => :'id',
        
        # 
        :'side' => :'side',
        
        # 
        :'size' => :'size',
        
        # 
        :'price' => :'price'
        
      }
    end

    # attribute type
    def self.swagger_types
      {
        :'symbol' => :'String',
        :'id' => :'Float',
        :'side' => :'String',
        :'size' => :'Float',
        :'price' => :'Float'
        
      }
    end

    def initialize(attributes = {})
      return if !attributes.is_a?(Hash) || attributes.empty?

      # convert string to symbol for hash key
      attributes = attributes.inject({}){|memo,(k,v)| memo[k.to_sym] = v; memo}

      
      if attributes[:'symbol']
        self.symbol = attributes[:'symbol']
      end
      
      if attributes[:'id']
        self.id = attributes[:'id']
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
      
    end

    def ==(o)
      return true if self.equal?(o)
      self.class == o.class &&
          symbol == o.symbol &&
          id == o.id &&
          side == o.side &&
          size == o.size &&
          price == o.price
    end

    def eql?(o)
      self == o
    end

    def hash
      [symbol, id, side, size, price].hash
    end
  end
end
