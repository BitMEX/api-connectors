module SwaggerClient
  # 
  class Funding < BaseObject
    attr_accessor :timestamp, :symbol, :funding_interval, :funding_rate, :funding_rate_daily
    # attribute mapping from ruby-style variable name to JSON key
    def self.attribute_map
      {
        
        # 
        :'timestamp' => :'timestamp',
        
        # 
        :'symbol' => :'symbol',
        
        # 
        :'funding_interval' => :'fundingInterval',
        
        # 
        :'funding_rate' => :'fundingRate',
        
        # 
        :'funding_rate_daily' => :'fundingRateDaily'
        
      }
    end

    # attribute type
    def self.swagger_types
      {
        :'timestamp' => :'Date',
        :'symbol' => :'String',
        :'funding_interval' => :'Date',
        :'funding_rate' => :'Float',
        :'funding_rate_daily' => :'Float'
        
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
      
      if attributes[:'fundingInterval']
        self.funding_interval = attributes[:'fundingInterval']
      end
      
      if attributes[:'fundingRate']
        self.funding_rate = attributes[:'fundingRate']
      end
      
      if attributes[:'fundingRateDaily']
        self.funding_rate_daily = attributes[:'fundingRateDaily']
      end
      
    end

    def ==(o)
      return true if self.equal?(o)
      self.class == o.class &&
          timestamp == o.timestamp &&
          symbol == o.symbol &&
          funding_interval == o.funding_interval &&
          funding_rate == o.funding_rate &&
          funding_rate_daily == o.funding_rate_daily
    end

    def eql?(o)
      self == o
    end

    def hash
      [timestamp, symbol, funding_interval, funding_rate, funding_rate_daily].hash
    end
  end
end
