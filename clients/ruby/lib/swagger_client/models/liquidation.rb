module SwaggerClient
  # 
  class Liquidation < BaseObject
    attr_accessor :order_id, :symbol, :side, :price, :leaves_qty
    # attribute mapping from ruby-style variable name to JSON key
    def self.attribute_map
      {
        
        # 
        :'order_id' => :'orderID',
        
        # 
        :'symbol' => :'symbol',
        
        # 
        :'side' => :'side',
        
        # 
        :'price' => :'price',
        
        # 
        :'leaves_qty' => :'leavesQty'
        
      }
    end

    # attribute type
    def self.swagger_types
      {
        :'order_id' => :'String',
        :'symbol' => :'String',
        :'side' => :'String',
        :'price' => :'Float',
        :'leaves_qty' => :'Float'
        
      }
    end

    def initialize(attributes = {})
      return if !attributes.is_a?(Hash) || attributes.empty?

      # convert string to symbol for hash key
      attributes = attributes.inject({}){|memo,(k,v)| memo[k.to_sym] = v; memo}

      
      if attributes[:'orderID']
        self.order_id = attributes[:'orderID']
      end
      
      if attributes[:'symbol']
        self.symbol = attributes[:'symbol']
      end
      
      if attributes[:'side']
        self.side = attributes[:'side']
      end
      
      if attributes[:'price']
        self.price = attributes[:'price']
      end
      
      if attributes[:'leavesQty']
        self.leaves_qty = attributes[:'leavesQty']
      end
      
    end

    def ==(o)
      return true if self.equal?(o)
      self.class == o.class &&
          order_id == o.order_id &&
          symbol == o.symbol &&
          side == o.side &&
          price == o.price &&
          leaves_qty == o.leaves_qty
    end

    def eql?(o)
      self == o
    end

    def hash
      [order_id, symbol, side, price, leaves_qty].hash
    end
  end
end
