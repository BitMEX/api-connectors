class Instrument
  attr_accessor :symbol, :state, :typ, :listing, :expiry, :underlying, :buy_leg, :sell_leg, :quote_currency, :reference, :reference_symbol, :tick_size, :multiplier, :settl_currency, :init_margin, :maint_margin, :limit, :opening_timestamp, :closing_timestamp, :prev_close_price, :limit_down_price, :limit_up_price, :volume, :vwap, :high_price, :low_price, :last_price, :last_tick_direction, :last_change_pcnt, :bid_price, :mid_price, :ask_price, :open_interest, :settled_price, :timestamp

  # :internal => :external
  def self.attribute_map
    {
      :symbol => :symbol,
      :state => :state,
      :typ => :typ,
      :listing => :listing,
      :expiry => :expiry,
      :underlying => :underlying,
      :buy_leg => :buyLeg,
      :sell_leg => :sellLeg,
      :quote_currency => :quoteCurrency,
      :reference => :reference,
      :reference_symbol => :referenceSymbol,
      :tick_size => :tickSize,
      :multiplier => :multiplier,
      :settl_currency => :settlCurrency,
      :init_margin => :initMargin,
      :maint_margin => :maintMargin,
      :limit => :limit,
      :opening_timestamp => :openingTimestamp,
      :closing_timestamp => :closingTimestamp,
      :prev_close_price => :prevClosePrice,
      :limit_down_price => :limitDownPrice,
      :limit_up_price => :limitUpPrice,
      :volume => :volume,
      :vwap => :vwap,
      :high_price => :highPrice,
      :low_price => :lowPrice,
      :last_price => :lastPrice,
      :last_tick_direction => :lastTickDirection,
      :last_change_pcnt => :lastChangePcnt,
      :bid_price => :bidPrice,
      :mid_price => :midPrice,
      :ask_price => :askPrice,
      :open_interest => :openInterest,
      :settled_price => :settledPrice,
      :timestamp => :timestamp

    }
  end

  def initialize(attributes = {})
    return if attributes.empty?
    # Morph attribute keys into undescored rubyish style
    if self.class.attribute_map[:"symbol"]
      @symbol = attributes["symbol"]
    end
    if self.class.attribute_map[:"state"]
      @state = attributes["state"]
    end
    if self.class.attribute_map[:"typ"]
      @typ = attributes["typ"]
    end
    if self.class.attribute_map[:"listing"]
      @listing = attributes["listing"]
    end
    if self.class.attribute_map[:"expiry"]
      @expiry = attributes["expiry"]
    end
    if self.class.attribute_map[:"underlying"]
      @underlying = attributes["underlying"]
    end
    if self.class.attribute_map[:"buy_leg"]
      @buy_leg = attributes["buyLeg"]
    end
    if self.class.attribute_map[:"sell_leg"]
      @sell_leg = attributes["sellLeg"]
    end
    if self.class.attribute_map[:"quote_currency"]
      @quote_currency = attributes["quoteCurrency"]
    end
    if self.class.attribute_map[:"reference"]
      @reference = attributes["reference"]
    end
    if self.class.attribute_map[:"reference_symbol"]
      @reference_symbol = attributes["referenceSymbol"]
    end
    if self.class.attribute_map[:"tick_size"]
      @tick_size = attributes["tickSize"]
    end
    if self.class.attribute_map[:"multiplier"]
      @multiplier = attributes["multiplier"]
    end
    if self.class.attribute_map[:"settl_currency"]
      @settl_currency = attributes["settlCurrency"]
    end
    if self.class.attribute_map[:"init_margin"]
      @init_margin = attributes["initMargin"]
    end
    if self.class.attribute_map[:"maint_margin"]
      @maint_margin = attributes["maintMargin"]
    end
    if self.class.attribute_map[:"limit"]
      @limit = attributes["limit"]
    end
    if self.class.attribute_map[:"opening_timestamp"]
      @opening_timestamp = attributes["openingTimestamp"]
    end
    if self.class.attribute_map[:"closing_timestamp"]
      @closing_timestamp = attributes["closingTimestamp"]
    end
    if self.class.attribute_map[:"prev_close_price"]
      @prev_close_price = attributes["prevClosePrice"]
    end
    if self.class.attribute_map[:"limit_down_price"]
      @limit_down_price = attributes["limitDownPrice"]
    end
    if self.class.attribute_map[:"limit_up_price"]
      @limit_up_price = attributes["limitUpPrice"]
    end
    if self.class.attribute_map[:"volume"]
      @volume = attributes["volume"]
    end
    if self.class.attribute_map[:"vwap"]
      @vwap = attributes["vwap"]
    end
    if self.class.attribute_map[:"high_price"]
      @high_price = attributes["highPrice"]
    end
    if self.class.attribute_map[:"low_price"]
      @low_price = attributes["lowPrice"]
    end
    if self.class.attribute_map[:"last_price"]
      @last_price = attributes["lastPrice"]
    end
    if self.class.attribute_map[:"last_tick_direction"]
      @last_tick_direction = attributes["lastTickDirection"]
    end
    if self.class.attribute_map[:"last_change_pcnt"]
      @last_change_pcnt = attributes["lastChangePcnt"]
    end
    if self.class.attribute_map[:"bid_price"]
      @bid_price = attributes["bidPrice"]
    end
    if self.class.attribute_map[:"mid_price"]
      @mid_price = attributes["midPrice"]
    end
    if self.class.attribute_map[:"ask_price"]
      @ask_price = attributes["askPrice"]
    end
    if self.class.attribute_map[:"open_interest"]
      @open_interest = attributes["openInterest"]
    end
    if self.class.attribute_map[:"settled_price"]
      @settled_price = attributes["settledPrice"]
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

