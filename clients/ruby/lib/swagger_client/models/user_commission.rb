module SwaggerClient
  # 
  class UserCommission < BaseObject
    attr_accessor :maker_fee, :taker_fee, :insurance_fee
    # attribute mapping from ruby-style variable name to JSON key
    def self.attribute_map
      {
        
        # 
        :'maker_fee' => :'makerFee',
        
        # 
        :'taker_fee' => :'takerFee',
        
        # 
        :'insurance_fee' => :'insuranceFee'
        
      }
    end

    # attribute type
    def self.swagger_types
      {
        :'maker_fee' => :'String',
        :'taker_fee' => :'String',
        :'insurance_fee' => :'String'
        
      }
    end

    def initialize(attributes = {})
      return if !attributes.is_a?(Hash) || attributes.empty?

      # convert string to symbol for hash key
      attributes = attributes.inject({}){|memo,(k,v)| memo[k.to_sym] = v; memo}

      
      if attributes[:'makerFee']
        self.maker_fee = attributes[:'makerFee']
      end
      
      if attributes[:'takerFee']
        self.taker_fee = attributes[:'takerFee']
      end
      
      if attributes[:'insuranceFee']
        self.insurance_fee = attributes[:'insuranceFee']
      end
      
    end

    def ==(o)
      return true if self.equal?(o)
      self.class == o.class &&
          maker_fee == o.maker_fee &&
          taker_fee == o.taker_fee &&
          insurance_fee == o.insurance_fee
    end

    def eql?(o)
      self == o
    end

    def hash
      [maker_fee, taker_fee, insurance_fee].hash
    end
  end
end
