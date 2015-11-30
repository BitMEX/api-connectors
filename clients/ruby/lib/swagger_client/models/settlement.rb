module SwaggerClient
  # 
  class Settlement < BaseObject
    attr_accessor :symbol, :timestamp, :settlement_type, :settled_price, :bankrupt, :tax_base, :tax_rate
    # attribute mapping from ruby-style variable name to JSON key
    def self.attribute_map
      {
        
        # 
        :'symbol' => :'symbol',
        
        # 
        :'timestamp' => :'timestamp',
        
        # 
        :'settlement_type' => :'settlementType',
        
        # 
        :'settled_price' => :'settledPrice',
        
        # 
        :'bankrupt' => :'bankrupt',
        
        # 
        :'tax_base' => :'taxBase',
        
        # 
        :'tax_rate' => :'taxRate'
        
      }
    end

    # attribute type
    def self.swagger_types
      {
        :'symbol' => :'String',
        :'timestamp' => :'Date',
        :'settlement_type' => :'String',
        :'settled_price' => :'Float',
        :'bankrupt' => :'Float',
        :'tax_base' => :'Float',
        :'tax_rate' => :'Float'
        
      }
    end

    def initialize(attributes = {})
      return if !attributes.is_a?(Hash) || attributes.empty?

      # convert string to symbol for hash key
      attributes = attributes.inject({}){|memo,(k,v)| memo[k.to_sym] = v; memo}

      
      if attributes[:'symbol']
        self.symbol = attributes[:'symbol']
      end
      
      if attributes[:'timestamp']
        self.timestamp = attributes[:'timestamp']
      end
      
      if attributes[:'settlementType']
        self.settlement_type = attributes[:'settlementType']
      end
      
      if attributes[:'settledPrice']
        self.settled_price = attributes[:'settledPrice']
      end
      
      if attributes[:'bankrupt']
        self.bankrupt = attributes[:'bankrupt']
      end
      
      if attributes[:'taxBase']
        self.tax_base = attributes[:'taxBase']
      end
      
      if attributes[:'taxRate']
        self.tax_rate = attributes[:'taxRate']
      end
      
    end

    def ==(o)
      return true if self.equal?(o)
      self.class == o.class &&
          symbol == o.symbol &&
          timestamp == o.timestamp &&
          settlement_type == o.settlement_type &&
          settled_price == o.settled_price &&
          bankrupt == o.bankrupt &&
          tax_base == o.tax_base &&
          tax_rate == o.tax_rate
    end

    def eql?(o)
      self == o
    end

    def hash
      [symbol, timestamp, settlement_type, settled_price, bankrupt, tax_base, tax_rate].hash
    end
  end
end
