module SwaggerClient
  # 
  class TradeBin < BaseObject
    attr_accessor :timestamp, :symbol, :open, :high, :low, :close, :trades, :volume, :vwap, :last_size, :turnover, :home_notional, :foreign_notional, :id
    # attribute mapping from ruby-style variable name to JSON key
    def self.attribute_map
      {
        
        # 
        :'timestamp' => :'timestamp',
        
        # 
        :'symbol' => :'symbol',
        
        # 
        :'open' => :'open',
        
        # 
        :'high' => :'high',
        
        # 
        :'low' => :'low',
        
        # 
        :'close' => :'close',
        
        # 
        :'trades' => :'trades',
        
        # 
        :'volume' => :'volume',
        
        # 
        :'vwap' => :'vwap',
        
        # 
        :'last_size' => :'lastSize',
        
        # 
        :'turnover' => :'turnover',
        
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
        :'open' => :'Float',
        :'high' => :'Float',
        :'low' => :'Float',
        :'close' => :'Float',
        :'trades' => :'Float',
        :'volume' => :'Float',
        :'vwap' => :'Float',
        :'last_size' => :'Float',
        :'turnover' => :'Float',
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
      
      if attributes[:'open']
        self.open = attributes[:'open']
      end
      
      if attributes[:'high']
        self.high = attributes[:'high']
      end
      
      if attributes[:'low']
        self.low = attributes[:'low']
      end
      
      if attributes[:'close']
        self.close = attributes[:'close']
      end
      
      if attributes[:'trades']
        self.trades = attributes[:'trades']
      end
      
      if attributes[:'volume']
        self.volume = attributes[:'volume']
      end
      
      if attributes[:'vwap']
        self.vwap = attributes[:'vwap']
      end
      
      if attributes[:'lastSize']
        self.last_size = attributes[:'lastSize']
      end
      
      if attributes[:'turnover']
        self.turnover = attributes[:'turnover']
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
          open == o.open &&
          high == o.high &&
          low == o.low &&
          close == o.close &&
          trades == o.trades &&
          volume == o.volume &&
          vwap == o.vwap &&
          last_size == o.last_size &&
          turnover == o.turnover &&
          home_notional == o.home_notional &&
          foreign_notional == o.foreign_notional &&
          id == o.id
    end

    def eql?(o)
      self == o
    end

    def hash
      [timestamp, symbol, open, high, low, close, trades, volume, vwap, last_size, turnover, home_notional, foreign_notional, id].hash
    end
  end
end
