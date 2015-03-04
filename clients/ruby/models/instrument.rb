class Instrument
  attr_accessor :symbol, :root_symbol, :state, :typ, :listing, :front, :expiry, :relist_interval, :inverse_leg, :sell_leg, :buy_leg, :underlying, :quote_currency, :underlying_symbol, :reference, :reference_symbol, :tick_size, :multiplier, :settl_currency, :underlying_to_settle_multiplier, :quote_to_settle_multiplier, :is_quanto, :is_inverse, :init_margin, :maint_margin, :limit, :maker_fee, :taker_fee, :insurance_fee, :hedger_maker_fee, :hedger_taker_fee, :hedger_insurance_fee, :opening_timestamp, :closing_timestamp, :session_interval, :prev_close_price, :limit_down_price, :limit_up_price, :prev_total_volume, :total_volume, :volume, :volume24h, :prev_total_turnover, :total_turnover, :turnover, :turnover24h, :vwap, :high_price, :low_price, :last_price, :last_tick_direction, :last_change_pcnt, :bid_price, :mid_price, :ask_price, :open_interest, :open_value, :settled_price, :timestamp

  # :internal => :external
  def self.attribute_map
    {
      :symbol => :symbol,
      :root_symbol => :rootSymbol,
      :state => :state,
      :typ => :typ,
      :listing => :listing,
      :front => :front,
      :expiry => :expiry,
      :relist_interval => :relistInterval,
      :inverse_leg => :inverseLeg,
      :sell_leg => :sellLeg,
      :buy_leg => :buyLeg,
      :underlying => :underlying,
      :quote_currency => :quoteCurrency,
      :underlying_symbol => :underlyingSymbol,
      :reference => :reference,
      :reference_symbol => :referenceSymbol,
      :tick_size => :tickSize,
      :multiplier => :multiplier,
      :settl_currency => :settlCurrency,
      :underlying_to_settle_multiplier => :underlyingToSettleMultiplier,
      :quote_to_settle_multiplier => :quoteToSettleMultiplier,
      :is_quanto => :isQuanto,
      :is_inverse => :isInverse,
      :init_margin => :initMargin,
      :maint_margin => :maintMargin,
      :limit => :limit,
      :maker_fee => :makerFee,
      :taker_fee => :takerFee,
      :insurance_fee => :insuranceFee,
      :hedger_maker_fee => :hedgerMakerFee,
      :hedger_taker_fee => :hedgerTakerFee,
      :hedger_insurance_fee => :hedgerInsuranceFee,
      :opening_timestamp => :openingTimestamp,
      :closing_timestamp => :closingTimestamp,
      :session_interval => :sessionInterval,
      :prev_close_price => :prevClosePrice,
      :limit_down_price => :limitDownPrice,
      :limit_up_price => :limitUpPrice,
      :prev_total_volume => :prevTotalVolume,
      :total_volume => :totalVolume,
      :volume => :volume,
      :volume24h => :volume24h,
      :prev_total_turnover => :prevTotalTurnover,
      :total_turnover => :totalTurnover,
      :turnover => :turnover,
      :turnover24h => :turnover24h,
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
      :open_value => :openValue,
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
    if self.class.attribute_map[:"root_symbol"]
      @root_symbol = attributes["rootSymbol"]
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
    if self.class.attribute_map[:"front"]
      @front = attributes["front"]
    end
    if self.class.attribute_map[:"expiry"]
      @expiry = attributes["expiry"]
    end
    if self.class.attribute_map[:"relist_interval"]
      @relist_interval = attributes["relistInterval"]
    end
    if self.class.attribute_map[:"inverse_leg"]
      @inverse_leg = attributes["inverseLeg"]
    end
    if self.class.attribute_map[:"sell_leg"]
      @sell_leg = attributes["sellLeg"]
    end
    if self.class.attribute_map[:"buy_leg"]
      @buy_leg = attributes["buyLeg"]
    end
    if self.class.attribute_map[:"underlying"]
      @underlying = attributes["underlying"]
    end
    if self.class.attribute_map[:"quote_currency"]
      @quote_currency = attributes["quoteCurrency"]
    end
    if self.class.attribute_map[:"underlying_symbol"]
      @underlying_symbol = attributes["underlyingSymbol"]
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
    if self.class.attribute_map[:"underlying_to_settle_multiplier"]
      @underlying_to_settle_multiplier = attributes["underlyingToSettleMultiplier"]
    end
    if self.class.attribute_map[:"quote_to_settle_multiplier"]
      @quote_to_settle_multiplier = attributes["quoteToSettleMultiplier"]
    end
    if self.class.attribute_map[:"is_quanto"]
      @is_quanto = attributes["isQuanto"]
    end
    if self.class.attribute_map[:"is_inverse"]
      @is_inverse = attributes["isInverse"]
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
    if self.class.attribute_map[:"maker_fee"]
      @maker_fee = attributes["makerFee"]
    end
    if self.class.attribute_map[:"taker_fee"]
      @taker_fee = attributes["takerFee"]
    end
    if self.class.attribute_map[:"insurance_fee"]
      @insurance_fee = attributes["insuranceFee"]
    end
    if self.class.attribute_map[:"hedger_maker_fee"]
      @hedger_maker_fee = attributes["hedgerMakerFee"]
    end
    if self.class.attribute_map[:"hedger_taker_fee"]
      @hedger_taker_fee = attributes["hedgerTakerFee"]
    end
    if self.class.attribute_map[:"hedger_insurance_fee"]
      @hedger_insurance_fee = attributes["hedgerInsuranceFee"]
    end
    if self.class.attribute_map[:"opening_timestamp"]
      @opening_timestamp = attributes["openingTimestamp"]
    end
    if self.class.attribute_map[:"closing_timestamp"]
      @closing_timestamp = attributes["closingTimestamp"]
    end
    if self.class.attribute_map[:"session_interval"]
      @session_interval = attributes["sessionInterval"]
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
    if self.class.attribute_map[:"prev_total_volume"]
      @prev_total_volume = attributes["prevTotalVolume"]
    end
    if self.class.attribute_map[:"total_volume"]
      @total_volume = attributes["totalVolume"]
    end
    if self.class.attribute_map[:"volume"]
      @volume = attributes["volume"]
    end
    if self.class.attribute_map[:"volume24h"]
      @volume24h = attributes["volume24h"]
    end
    if self.class.attribute_map[:"prev_total_turnover"]
      @prev_total_turnover = attributes["prevTotalTurnover"]
    end
    if self.class.attribute_map[:"total_turnover"]
      @total_turnover = attributes["totalTurnover"]
    end
    if self.class.attribute_map[:"turnover"]
      @turnover = attributes["turnover"]
    end
    if self.class.attribute_map[:"turnover24h"]
      @turnover24h = attributes["turnover24h"]
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
    if self.class.attribute_map[:"open_value"]
      @open_value = attributes["openValue"]
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

