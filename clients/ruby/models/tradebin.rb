class TradeBin
  attr_accessor :timestamp, :symbol, :open, :high, :low, :close, :trades, :volume, :vwap, :last_size, :id

  # :internal => :external
  def self.attribute_map
    {
      :timestamp => :timestamp,
      :symbol => :symbol,
      :open => :open,
      :high => :high,
      :low => :low,
      :close => :close,
      :trades => :trades,
      :volume => :volume,
      :vwap => :vwap,
      :last_size => :lastSize,
      :id => :id

    }
  end

  def initialize(attributes = {})
    return if attributes.empty?
    # Morph attribute keys into undescored rubyish style
    if self.class.attribute_map[:"timestamp"]
      @timestamp = attributes["timestamp"]
    end
    if self.class.attribute_map[:"symbol"]
      @symbol = attributes["symbol"]
    end
    if self.class.attribute_map[:"open"]
      @open = attributes["open"]
    end
    if self.class.attribute_map[:"high"]
      @high = attributes["high"]
    end
    if self.class.attribute_map[:"low"]
      @low = attributes["low"]
    end
    if self.class.attribute_map[:"close"]
      @close = attributes["close"]
    end
    if self.class.attribute_map[:"trades"]
      @trades = attributes["trades"]
    end
    if self.class.attribute_map[:"volume"]
      @volume = attributes["volume"]
    end
    if self.class.attribute_map[:"vwap"]
      @vwap = attributes["vwap"]
    end
    if self.class.attribute_map[:"last_size"]
      @last_size = attributes["lastSize"]
    end
    if self.class.attribute_map[:"id"]
      @id = attributes["id"]
    end
    

  end

  def to_body
    body = {}
    self.class.attribute_map.each_pair do |key, value|
      body[value] = self.send(key) unless self.send(key).nil?
    end
    body
  end
end

