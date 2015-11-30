module SwaggerClient
  # 
  class Instrument < BaseObject
    attr_accessor :symbol, :root_symbol, :state, :typ, :listing, :front, :expiry, :relist_interval, :inverse_leg, :sell_leg, :buy_leg, :underlying, :quote_currency, :underlying_symbol, :reference, :reference_symbol, :tick_size, :multiplier, :settl_currency, :underlying_to_settle_multiplier, :quote_to_settle_multiplier, :is_quanto, :is_inverse, :init_margin, :maint_margin, :limit, :capped, :taxed, :maker_fee, :taker_fee, :insurance_fee, :hedger_maker_fee, :hedger_taker_fee, :hedger_insurance_fee, :opening_timestamp, :closing_timestamp, :session_interval, :prev_close_price, :limit_down_price, :limit_up_price, :bankrupt_limit_down_price, :bankrupt_limit_up_price, :prev_total_volume, :total_volume, :volume, :volume24h, :prev_total_turnover, :total_turnover, :turnover, :turnover24h, :prev_price24h, :vwap, :high_price, :low_price, :last_price, :last_price_protected, :last_tick_direction, :last_change_pcnt, :bid_price, :mid_price, :ask_price, :impact_bid_price, :impact_mid_price, :impact_ask_price, :has_liquidity, :open_interest, :open_value, :fair_method, :fair_basis_rate, :fair_basis, :fair_price, :mark_method, :mark_price, :indicative_tax_rate, :indicative_settle_price, :settled_price, :timestamp
    # attribute mapping from ruby-style variable name to JSON key
    def self.attribute_map
      {
        
        # 
        :'symbol' => :'symbol',
        
        # 
        :'root_symbol' => :'rootSymbol',
        
        # 
        :'state' => :'state',
        
        # 
        :'typ' => :'typ',
        
        # 
        :'listing' => :'listing',
        
        # 
        :'front' => :'front',
        
        # 
        :'expiry' => :'expiry',
        
        # 
        :'relist_interval' => :'relistInterval',
        
        # 
        :'inverse_leg' => :'inverseLeg',
        
        # 
        :'sell_leg' => :'sellLeg',
        
        # 
        :'buy_leg' => :'buyLeg',
        
        # 
        :'underlying' => :'underlying',
        
        # 
        :'quote_currency' => :'quoteCurrency',
        
        # 
        :'underlying_symbol' => :'underlyingSymbol',
        
        # 
        :'reference' => :'reference',
        
        # 
        :'reference_symbol' => :'referenceSymbol',
        
        # 
        :'tick_size' => :'tickSize',
        
        # 
        :'multiplier' => :'multiplier',
        
        # 
        :'settl_currency' => :'settlCurrency',
        
        # 
        :'underlying_to_settle_multiplier' => :'underlyingToSettleMultiplier',
        
        # 
        :'quote_to_settle_multiplier' => :'quoteToSettleMultiplier',
        
        # 
        :'is_quanto' => :'isQuanto',
        
        # 
        :'is_inverse' => :'isInverse',
        
        # 
        :'init_margin' => :'initMargin',
        
        # 
        :'maint_margin' => :'maintMargin',
        
        # 
        :'limit' => :'limit',
        
        # 
        :'capped' => :'capped',
        
        # 
        :'taxed' => :'taxed',
        
        # 
        :'maker_fee' => :'makerFee',
        
        # 
        :'taker_fee' => :'takerFee',
        
        # 
        :'insurance_fee' => :'insuranceFee',
        
        # 
        :'hedger_maker_fee' => :'hedgerMakerFee',
        
        # 
        :'hedger_taker_fee' => :'hedgerTakerFee',
        
        # 
        :'hedger_insurance_fee' => :'hedgerInsuranceFee',
        
        # 
        :'opening_timestamp' => :'openingTimestamp',
        
        # 
        :'closing_timestamp' => :'closingTimestamp',
        
        # 
        :'session_interval' => :'sessionInterval',
        
        # 
        :'prev_close_price' => :'prevClosePrice',
        
        # 
        :'limit_down_price' => :'limitDownPrice',
        
        # 
        :'limit_up_price' => :'limitUpPrice',
        
        # 
        :'bankrupt_limit_down_price' => :'bankruptLimitDownPrice',
        
        # 
        :'bankrupt_limit_up_price' => :'bankruptLimitUpPrice',
        
        # 
        :'prev_total_volume' => :'prevTotalVolume',
        
        # 
        :'total_volume' => :'totalVolume',
        
        # 
        :'volume' => :'volume',
        
        # 
        :'volume24h' => :'volume24h',
        
        # 
        :'prev_total_turnover' => :'prevTotalTurnover',
        
        # 
        :'total_turnover' => :'totalTurnover',
        
        # 
        :'turnover' => :'turnover',
        
        # 
        :'turnover24h' => :'turnover24h',
        
        # 
        :'prev_price24h' => :'prevPrice24h',
        
        # 
        :'vwap' => :'vwap',
        
        # 
        :'high_price' => :'highPrice',
        
        # 
        :'low_price' => :'lowPrice',
        
        # 
        :'last_price' => :'lastPrice',
        
        # 
        :'last_price_protected' => :'lastPriceProtected',
        
        # 
        :'last_tick_direction' => :'lastTickDirection',
        
        # 
        :'last_change_pcnt' => :'lastChangePcnt',
        
        # 
        :'bid_price' => :'bidPrice',
        
        # 
        :'mid_price' => :'midPrice',
        
        # 
        :'ask_price' => :'askPrice',
        
        # 
        :'impact_bid_price' => :'impactBidPrice',
        
        # 
        :'impact_mid_price' => :'impactMidPrice',
        
        # 
        :'impact_ask_price' => :'impactAskPrice',
        
        # 
        :'has_liquidity' => :'hasLiquidity',
        
        # 
        :'open_interest' => :'openInterest',
        
        # 
        :'open_value' => :'openValue',
        
        # 
        :'fair_method' => :'fairMethod',
        
        # 
        :'fair_basis_rate' => :'fairBasisRate',
        
        # 
        :'fair_basis' => :'fairBasis',
        
        # 
        :'fair_price' => :'fairPrice',
        
        # 
        :'mark_method' => :'markMethod',
        
        # 
        :'mark_price' => :'markPrice',
        
        # 
        :'indicative_tax_rate' => :'indicativeTaxRate',
        
        # 
        :'indicative_settle_price' => :'indicativeSettlePrice',
        
        # 
        :'settled_price' => :'settledPrice',
        
        # 
        :'timestamp' => :'timestamp'
        
      }
    end

    # attribute type
    def self.swagger_types
      {
        :'symbol' => :'String',
        :'root_symbol' => :'String',
        :'state' => :'String',
        :'typ' => :'String',
        :'listing' => :'Date',
        :'front' => :'Date',
        :'expiry' => :'Date',
        :'relist_interval' => :'Date',
        :'inverse_leg' => :'String',
        :'sell_leg' => :'String',
        :'buy_leg' => :'String',
        :'underlying' => :'String',
        :'quote_currency' => :'String',
        :'underlying_symbol' => :'String',
        :'reference' => :'String',
        :'reference_symbol' => :'String',
        :'tick_size' => :'Float',
        :'multiplier' => :'Float',
        :'settl_currency' => :'String',
        :'underlying_to_settle_multiplier' => :'Float',
        :'quote_to_settle_multiplier' => :'Float',
        :'is_quanto' => :'BOOLEAN',
        :'is_inverse' => :'BOOLEAN',
        :'init_margin' => :'Float',
        :'maint_margin' => :'Float',
        :'limit' => :'Float',
        :'capped' => :'BOOLEAN',
        :'taxed' => :'BOOLEAN',
        :'maker_fee' => :'Float',
        :'taker_fee' => :'Float',
        :'insurance_fee' => :'Float',
        :'hedger_maker_fee' => :'Float',
        :'hedger_taker_fee' => :'Float',
        :'hedger_insurance_fee' => :'Float',
        :'opening_timestamp' => :'Date',
        :'closing_timestamp' => :'Date',
        :'session_interval' => :'Date',
        :'prev_close_price' => :'Float',
        :'limit_down_price' => :'Float',
        :'limit_up_price' => :'Float',
        :'bankrupt_limit_down_price' => :'Float',
        :'bankrupt_limit_up_price' => :'Float',
        :'prev_total_volume' => :'Float',
        :'total_volume' => :'Float',
        :'volume' => :'Float',
        :'volume24h' => :'Float',
        :'prev_total_turnover' => :'Float',
        :'total_turnover' => :'Float',
        :'turnover' => :'Float',
        :'turnover24h' => :'Float',
        :'prev_price24h' => :'Float',
        :'vwap' => :'Float',
        :'high_price' => :'Float',
        :'low_price' => :'Float',
        :'last_price' => :'Float',
        :'last_price_protected' => :'Float',
        :'last_tick_direction' => :'String',
        :'last_change_pcnt' => :'Float',
        :'bid_price' => :'Float',
        :'mid_price' => :'Float',
        :'ask_price' => :'Float',
        :'impact_bid_price' => :'Float',
        :'impact_mid_price' => :'Float',
        :'impact_ask_price' => :'Float',
        :'has_liquidity' => :'BOOLEAN',
        :'open_interest' => :'Float',
        :'open_value' => :'Float',
        :'fair_method' => :'String',
        :'fair_basis_rate' => :'Float',
        :'fair_basis' => :'Float',
        :'fair_price' => :'Float',
        :'mark_method' => :'String',
        :'mark_price' => :'Float',
        :'indicative_tax_rate' => :'Float',
        :'indicative_settle_price' => :'Float',
        :'settled_price' => :'Float',
        :'timestamp' => :'Date'
        
      }
    end

    def initialize(attributes = {})
      return if !attributes.is_a?(Hash) || attributes.empty?

      # convert string to symbol for hash key
      attributes = attributes.inject({}){|memo,(k,v)| memo[k.to_sym] = v; memo}

      
      if attributes[:'symbol']
        self.symbol = attributes[:'symbol']
      end
      
      if attributes[:'rootSymbol']
        self.root_symbol = attributes[:'rootSymbol']
      end
      
      if attributes[:'state']
        self.state = attributes[:'state']
      end
      
      if attributes[:'typ']
        self.typ = attributes[:'typ']
      end
      
      if attributes[:'listing']
        self.listing = attributes[:'listing']
      end
      
      if attributes[:'front']
        self.front = attributes[:'front']
      end
      
      if attributes[:'expiry']
        self.expiry = attributes[:'expiry']
      end
      
      if attributes[:'relistInterval']
        self.relist_interval = attributes[:'relistInterval']
      end
      
      if attributes[:'inverseLeg']
        self.inverse_leg = attributes[:'inverseLeg']
      end
      
      if attributes[:'sellLeg']
        self.sell_leg = attributes[:'sellLeg']
      end
      
      if attributes[:'buyLeg']
        self.buy_leg = attributes[:'buyLeg']
      end
      
      if attributes[:'underlying']
        self.underlying = attributes[:'underlying']
      end
      
      if attributes[:'quoteCurrency']
        self.quote_currency = attributes[:'quoteCurrency']
      end
      
      if attributes[:'underlyingSymbol']
        self.underlying_symbol = attributes[:'underlyingSymbol']
      end
      
      if attributes[:'reference']
        self.reference = attributes[:'reference']
      end
      
      if attributes[:'referenceSymbol']
        self.reference_symbol = attributes[:'referenceSymbol']
      end
      
      if attributes[:'tickSize']
        self.tick_size = attributes[:'tickSize']
      end
      
      if attributes[:'multiplier']
        self.multiplier = attributes[:'multiplier']
      end
      
      if attributes[:'settlCurrency']
        self.settl_currency = attributes[:'settlCurrency']
      end
      
      if attributes[:'underlyingToSettleMultiplier']
        self.underlying_to_settle_multiplier = attributes[:'underlyingToSettleMultiplier']
      end
      
      if attributes[:'quoteToSettleMultiplier']
        self.quote_to_settle_multiplier = attributes[:'quoteToSettleMultiplier']
      end
      
      if attributes[:'isQuanto']
        self.is_quanto = attributes[:'isQuanto']
      end
      
      if attributes[:'isInverse']
        self.is_inverse = attributes[:'isInverse']
      end
      
      if attributes[:'initMargin']
        self.init_margin = attributes[:'initMargin']
      end
      
      if attributes[:'maintMargin']
        self.maint_margin = attributes[:'maintMargin']
      end
      
      if attributes[:'limit']
        self.limit = attributes[:'limit']
      end
      
      if attributes[:'capped']
        self.capped = attributes[:'capped']
      end
      
      if attributes[:'taxed']
        self.taxed = attributes[:'taxed']
      end
      
      if attributes[:'makerFee']
        self.maker_fee = attributes[:'makerFee']
      end
      
      if attributes[:'takerFee']
        self.taker_fee = attributes[:'takerFee']
      end
      
      if attributes[:'insuranceFee']
        self.insurance_fee = attributes[:'insuranceFee']
      end
      
      if attributes[:'hedgerMakerFee']
        self.hedger_maker_fee = attributes[:'hedgerMakerFee']
      end
      
      if attributes[:'hedgerTakerFee']
        self.hedger_taker_fee = attributes[:'hedgerTakerFee']
      end
      
      if attributes[:'hedgerInsuranceFee']
        self.hedger_insurance_fee = attributes[:'hedgerInsuranceFee']
      end
      
      if attributes[:'openingTimestamp']
        self.opening_timestamp = attributes[:'openingTimestamp']
      end
      
      if attributes[:'closingTimestamp']
        self.closing_timestamp = attributes[:'closingTimestamp']
      end
      
      if attributes[:'sessionInterval']
        self.session_interval = attributes[:'sessionInterval']
      end
      
      if attributes[:'prevClosePrice']
        self.prev_close_price = attributes[:'prevClosePrice']
      end
      
      if attributes[:'limitDownPrice']
        self.limit_down_price = attributes[:'limitDownPrice']
      end
      
      if attributes[:'limitUpPrice']
        self.limit_up_price = attributes[:'limitUpPrice']
      end
      
      if attributes[:'bankruptLimitDownPrice']
        self.bankrupt_limit_down_price = attributes[:'bankruptLimitDownPrice']
      end
      
      if attributes[:'bankruptLimitUpPrice']
        self.bankrupt_limit_up_price = attributes[:'bankruptLimitUpPrice']
      end
      
      if attributes[:'prevTotalVolume']
        self.prev_total_volume = attributes[:'prevTotalVolume']
      end
      
      if attributes[:'totalVolume']
        self.total_volume = attributes[:'totalVolume']
      end
      
      if attributes[:'volume']
        self.volume = attributes[:'volume']
      end
      
      if attributes[:'volume24h']
        self.volume24h = attributes[:'volume24h']
      end
      
      if attributes[:'prevTotalTurnover']
        self.prev_total_turnover = attributes[:'prevTotalTurnover']
      end
      
      if attributes[:'totalTurnover']
        self.total_turnover = attributes[:'totalTurnover']
      end
      
      if attributes[:'turnover']
        self.turnover = attributes[:'turnover']
      end
      
      if attributes[:'turnover24h']
        self.turnover24h = attributes[:'turnover24h']
      end
      
      if attributes[:'prevPrice24h']
        self.prev_price24h = attributes[:'prevPrice24h']
      end
      
      if attributes[:'vwap']
        self.vwap = attributes[:'vwap']
      end
      
      if attributes[:'highPrice']
        self.high_price = attributes[:'highPrice']
      end
      
      if attributes[:'lowPrice']
        self.low_price = attributes[:'lowPrice']
      end
      
      if attributes[:'lastPrice']
        self.last_price = attributes[:'lastPrice']
      end
      
      if attributes[:'lastPriceProtected']
        self.last_price_protected = attributes[:'lastPriceProtected']
      end
      
      if attributes[:'lastTickDirection']
        self.last_tick_direction = attributes[:'lastTickDirection']
      end
      
      if attributes[:'lastChangePcnt']
        self.last_change_pcnt = attributes[:'lastChangePcnt']
      end
      
      if attributes[:'bidPrice']
        self.bid_price = attributes[:'bidPrice']
      end
      
      if attributes[:'midPrice']
        self.mid_price = attributes[:'midPrice']
      end
      
      if attributes[:'askPrice']
        self.ask_price = attributes[:'askPrice']
      end
      
      if attributes[:'impactBidPrice']
        self.impact_bid_price = attributes[:'impactBidPrice']
      end
      
      if attributes[:'impactMidPrice']
        self.impact_mid_price = attributes[:'impactMidPrice']
      end
      
      if attributes[:'impactAskPrice']
        self.impact_ask_price = attributes[:'impactAskPrice']
      end
      
      if attributes[:'hasLiquidity']
        self.has_liquidity = attributes[:'hasLiquidity']
      end
      
      if attributes[:'openInterest']
        self.open_interest = attributes[:'openInterest']
      end
      
      if attributes[:'openValue']
        self.open_value = attributes[:'openValue']
      end
      
      if attributes[:'fairMethod']
        self.fair_method = attributes[:'fairMethod']
      end
      
      if attributes[:'fairBasisRate']
        self.fair_basis_rate = attributes[:'fairBasisRate']
      end
      
      if attributes[:'fairBasis']
        self.fair_basis = attributes[:'fairBasis']
      end
      
      if attributes[:'fairPrice']
        self.fair_price = attributes[:'fairPrice']
      end
      
      if attributes[:'markMethod']
        self.mark_method = attributes[:'markMethod']
      end
      
      if attributes[:'markPrice']
        self.mark_price = attributes[:'markPrice']
      end
      
      if attributes[:'indicativeTaxRate']
        self.indicative_tax_rate = attributes[:'indicativeTaxRate']
      end
      
      if attributes[:'indicativeSettlePrice']
        self.indicative_settle_price = attributes[:'indicativeSettlePrice']
      end
      
      if attributes[:'settledPrice']
        self.settled_price = attributes[:'settledPrice']
      end
      
      if attributes[:'timestamp']
        self.timestamp = attributes[:'timestamp']
      end
      
    end

    def ==(o)
      return true if self.equal?(o)
      self.class == o.class &&
          symbol == o.symbol &&
          root_symbol == o.root_symbol &&
          state == o.state &&
          typ == o.typ &&
          listing == o.listing &&
          front == o.front &&
          expiry == o.expiry &&
          relist_interval == o.relist_interval &&
          inverse_leg == o.inverse_leg &&
          sell_leg == o.sell_leg &&
          buy_leg == o.buy_leg &&
          underlying == o.underlying &&
          quote_currency == o.quote_currency &&
          underlying_symbol == o.underlying_symbol &&
          reference == o.reference &&
          reference_symbol == o.reference_symbol &&
          tick_size == o.tick_size &&
          multiplier == o.multiplier &&
          settl_currency == o.settl_currency &&
          underlying_to_settle_multiplier == o.underlying_to_settle_multiplier &&
          quote_to_settle_multiplier == o.quote_to_settle_multiplier &&
          is_quanto == o.is_quanto &&
          is_inverse == o.is_inverse &&
          init_margin == o.init_margin &&
          maint_margin == o.maint_margin &&
          limit == o.limit &&
          capped == o.capped &&
          taxed == o.taxed &&
          maker_fee == o.maker_fee &&
          taker_fee == o.taker_fee &&
          insurance_fee == o.insurance_fee &&
          hedger_maker_fee == o.hedger_maker_fee &&
          hedger_taker_fee == o.hedger_taker_fee &&
          hedger_insurance_fee == o.hedger_insurance_fee &&
          opening_timestamp == o.opening_timestamp &&
          closing_timestamp == o.closing_timestamp &&
          session_interval == o.session_interval &&
          prev_close_price == o.prev_close_price &&
          limit_down_price == o.limit_down_price &&
          limit_up_price == o.limit_up_price &&
          bankrupt_limit_down_price == o.bankrupt_limit_down_price &&
          bankrupt_limit_up_price == o.bankrupt_limit_up_price &&
          prev_total_volume == o.prev_total_volume &&
          total_volume == o.total_volume &&
          volume == o.volume &&
          volume24h == o.volume24h &&
          prev_total_turnover == o.prev_total_turnover &&
          total_turnover == o.total_turnover &&
          turnover == o.turnover &&
          turnover24h == o.turnover24h &&
          prev_price24h == o.prev_price24h &&
          vwap == o.vwap &&
          high_price == o.high_price &&
          low_price == o.low_price &&
          last_price == o.last_price &&
          last_price_protected == o.last_price_protected &&
          last_tick_direction == o.last_tick_direction &&
          last_change_pcnt == o.last_change_pcnt &&
          bid_price == o.bid_price &&
          mid_price == o.mid_price &&
          ask_price == o.ask_price &&
          impact_bid_price == o.impact_bid_price &&
          impact_mid_price == o.impact_mid_price &&
          impact_ask_price == o.impact_ask_price &&
          has_liquidity == o.has_liquidity &&
          open_interest == o.open_interest &&
          open_value == o.open_value &&
          fair_method == o.fair_method &&
          fair_basis_rate == o.fair_basis_rate &&
          fair_basis == o.fair_basis &&
          fair_price == o.fair_price &&
          mark_method == o.mark_method &&
          mark_price == o.mark_price &&
          indicative_tax_rate == o.indicative_tax_rate &&
          indicative_settle_price == o.indicative_settle_price &&
          settled_price == o.settled_price &&
          timestamp == o.timestamp
    end

    def eql?(o)
      self == o
    end

    def hash
      [symbol, root_symbol, state, typ, listing, front, expiry, relist_interval, inverse_leg, sell_leg, buy_leg, underlying, quote_currency, underlying_symbol, reference, reference_symbol, tick_size, multiplier, settl_currency, underlying_to_settle_multiplier, quote_to_settle_multiplier, is_quanto, is_inverse, init_margin, maint_margin, limit, capped, taxed, maker_fee, taker_fee, insurance_fee, hedger_maker_fee, hedger_taker_fee, hedger_insurance_fee, opening_timestamp, closing_timestamp, session_interval, prev_close_price, limit_down_price, limit_up_price, bankrupt_limit_down_price, bankrupt_limit_up_price, prev_total_volume, total_volume, volume, volume24h, prev_total_turnover, total_turnover, turnover, turnover24h, prev_price24h, vwap, high_price, low_price, last_price, last_price_protected, last_tick_direction, last_change_pcnt, bid_price, mid_price, ask_price, impact_bid_price, impact_mid_price, impact_ask_price, has_liquidity, open_interest, open_value, fair_method, fair_basis_rate, fair_basis, fair_price, mark_method, mark_price, indicative_tax_rate, indicative_settle_price, settled_price, timestamp].hash
    end
  end
end
