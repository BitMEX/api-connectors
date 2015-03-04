class Stats
  attr_accessor :root_symbol, :currency, :volume24h, :turnover24h, :open_interest, :open_value

  # :internal => :external
  def self.attribute_map
    {
      :root_symbol => :rootSymbol,
      :currency => :currency,
      :volume24h => :volume24h,
      :turnover24h => :turnover24h,
      :open_interest => :openInterest,
      :open_value => :openValue

    }
  end

  def initialize(attributes = {})
    return if attributes.empty?
    # Morph attribute keys into undescored rubyish style
    if self.class.attribute_map[:"root_symbol"]
      @root_symbol = attributes["rootSymbol"]
    end
    if self.class.attribute_map[:"currency"]
      @currency = attributes["currency"]
    end
    if self.class.attribute_map[:"volume24h"]
      @volume24h = attributes["volume24h"]
    end
    if self.class.attribute_map[:"turnover24h"]
      @turnover24h = attributes["turnover24h"]
    end
    if self.class.attribute_map[:"open_interest"]
      @open_interest = attributes["openInterest"]
    end
    if self.class.attribute_map[:"open_value"]
      @open_value = attributes["openValue"]
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

