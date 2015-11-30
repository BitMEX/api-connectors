module SwaggerClient
  # 
  class StatsHistory < BaseObject
    attr_accessor :date, :root_symbol, :currency, :volume, :turnover
    # attribute mapping from ruby-style variable name to JSON key
    def self.attribute_map
      {
        
        # 
        :'date' => :'date',
        
        # 
        :'root_symbol' => :'rootSymbol',
        
        # 
        :'currency' => :'currency',
        
        # 
        :'volume' => :'volume',
        
        # 
        :'turnover' => :'turnover'
        
      }
    end

    # attribute type
    def self.swagger_types
      {
        :'date' => :'Date',
        :'root_symbol' => :'String',
        :'currency' => :'String',
        :'volume' => :'Float',
        :'turnover' => :'Float'
        
      }
    end

    def initialize(attributes = {})
      return if !attributes.is_a?(Hash) || attributes.empty?

      # convert string to symbol for hash key
      attributes = attributes.inject({}){|memo,(k,v)| memo[k.to_sym] = v; memo}

      
      if attributes[:'date']
        self.date = attributes[:'date']
      end
      
      if attributes[:'rootSymbol']
        self.root_symbol = attributes[:'rootSymbol']
      end
      
      if attributes[:'currency']
        self.currency = attributes[:'currency']
      end
      
      if attributes[:'volume']
        self.volume = attributes[:'volume']
      end
      
      if attributes[:'turnover']
        self.turnover = attributes[:'turnover']
      end
      
    end

    def ==(o)
      return true if self.equal?(o)
      self.class == o.class &&
          date == o.date &&
          root_symbol == o.root_symbol &&
          currency == o.currency &&
          volume == o.volume &&
          turnover == o.turnover
    end

    def eql?(o)
      self == o
    end

    def hash
      [date, root_symbol, currency, volume, turnover].hash
    end
  end
end
