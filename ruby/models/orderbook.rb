class OrderBook
  attr_accessor :symbol, :level, :bid_size, :bid_price, :ask_price, :ask_size, :timestamp

  # :internal => :external
  def self.attribute_map
    {
      :symbol => :symbol,
      :level => :level,
      :bid_size => :bidSize,
      :bid_price => :bidPrice,
      :ask_price => :askPrice,
      :ask_size => :askSize,
      :timestamp => :timestamp

    }
  end

  def initialize(attributes = {})
    return if attributes.empty?
    # Morph attribute keys into undescored rubyish style
    if self.class.attribute_map[:"symbol"]
      @symbol = attributes["symbol"]
    end
    if self.class.attribute_map[:"level"]
      @level = attributes["level"]
    end
    if self.class.attribute_map[:"bid_size"]
      @bid_size = attributes["bidSize"]
    end
    if self.class.attribute_map[:"bid_price"]
      @bid_price = attributes["bidPrice"]
    end
    if self.class.attribute_map[:"ask_price"]
      @ask_price = attributes["askPrice"]
    end
    if self.class.attribute_map[:"ask_size"]
      @ask_size = attributes["askSize"]
    end
    if self.class.attribute_map[:"timestamp"]
      @timestamp = attributes["timestamp"]
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

