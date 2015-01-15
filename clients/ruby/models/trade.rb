class Trade
  attr_accessor :timestamp, :symbol, :side, :size, :price, :tick_direction, :trd_match_i_d, :gross_value, :home_notional, :foreign_notional, :id

  # :internal => :external
  def self.attribute_map
    {
      :timestamp => :timestamp,
      :symbol => :symbol,
      :side => :side,
      :size => :size,
      :price => :price,
      :tick_direction => :tickDirection,
      :trd_match_i_d => :trdMatchID,
      :gross_value => :grossValue,
      :home_notional => :homeNotional,
      :foreign_notional => :foreignNotional,
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
    if self.class.attribute_map[:"side"]
      @side = attributes["side"]
    end
    if self.class.attribute_map[:"size"]
      @size = attributes["size"]
    end
    if self.class.attribute_map[:"price"]
      @price = attributes["price"]
    end
    if self.class.attribute_map[:"tick_direction"]
      @tick_direction = attributes["tickDirection"]
    end
    if self.class.attribute_map[:"trd_match_i_d"]
      @trd_match_i_d = attributes["trdMatchID"]
    end
    if self.class.attribute_map[:"gross_value"]
      @gross_value = attributes["grossValue"]
    end
    if self.class.attribute_map[:"home_notional"]
      @home_notional = attributes["homeNotional"]
    end
    if self.class.attribute_map[:"foreign_notional"]
      @foreign_notional = attributes["foreignNotional"]
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

