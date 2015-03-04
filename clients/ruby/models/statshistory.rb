class StatsHistory
  attr_accessor :date, :root_symbol, :currency, :volume, :turnover

  # :internal => :external
  def self.attribute_map
    {
      :date => :date,
      :root_symbol => :rootSymbol,
      :currency => :currency,
      :volume => :volume,
      :turnover => :turnover

    }
  end

  def initialize(attributes = {})
    return if attributes.empty?
    # Morph attribute keys into undescored rubyish style
    if self.class.attribute_map[:"date"]
      @date = attributes["date"]
    end
    if self.class.attribute_map[:"root_symbol"]
      @root_symbol = attributes["rootSymbol"]
    end
    if self.class.attribute_map[:"currency"]
      @currency = attributes["currency"]
    end
    if self.class.attribute_map[:"volume"]
      @volume = attributes["volume"]
    end
    if self.class.attribute_map[:"turnover"]
      @turnover = attributes["turnover"]
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

