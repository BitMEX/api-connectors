module SwaggerClient
  # 
  class Position < BaseObject
    attr_accessor :account, :symbol, :underlying, :quote_currency, :currency, :commission, :cross_margin, :rebalanced_pnl, :prev_realised_pnl, :prev_unrealised_pnl, :prev_close_price, :opening_timestamp, :opening_qty, :opening_cost, :opening_comm, :open_order_buy_qty, :open_order_buy_cost, :open_order_buy_premium, :open_order_sell_qty, :open_order_sell_cost, :open_order_sell_premium, :exec_buy_qty, :exec_buy_cost, :exec_sell_qty, :exec_sell_cost, :exec_qty, :exec_cost, :exec_comm, :current_timestamp, :current_qty, :current_cost, :current_comm, :realised_cost, :unrealised_cost, :gross_open_cost, :gross_open_premium, :gross_exec_cost, :is_open, :mark_price, :mark_value, :home_notional, :foreign_notional, :pos_state, :pos_cost, :pos_cost2, :pos_cross, :pos_init, :pos_comm, :pos_loss, :pos_margin, :pos_maint, :pos_allowance, :taxable_margin, :init_margin, :maint_margin, :session_margin, :target_excess_margin, :var_margin, :realised_gross_pnl, :realised_tax, :realised_pnl, :unrealised_gross_pnl, :long_bankrupt, :short_bankrupt, :tax_base, :indicative_tax_rate, :indicative_tax, :unrealised_tax, :unrealised_pnl, :unrealised_pnl_pcnt, :unrealised_roe_pcnt, :simple_qty, :simple_cost, :simple_value, :simple_pnl, :simple_pnl_pcnt, :avg_cost_price, :avg_entry_price, :break_even_price, :margin_call_price, :liquidation_price, :bankrupt_price, :timestamp
    # attribute mapping from ruby-style variable name to JSON key
    def self.attribute_map
      {
        
        # 
        :'account' => :'account',
        
        # 
        :'symbol' => :'symbol',
        
        # 
        :'underlying' => :'underlying',
        
        # 
        :'quote_currency' => :'quoteCurrency',
        
        # 
        :'currency' => :'currency',
        
        # 
        :'commission' => :'commission',
        
        # 
        :'cross_margin' => :'crossMargin',
        
        # 
        :'rebalanced_pnl' => :'rebalancedPnl',
        
        # 
        :'prev_realised_pnl' => :'prevRealisedPnl',
        
        # 
        :'prev_unrealised_pnl' => :'prevUnrealisedPnl',
        
        # 
        :'prev_close_price' => :'prevClosePrice',
        
        # 
        :'opening_timestamp' => :'openingTimestamp',
        
        # 
        :'opening_qty' => :'openingQty',
        
        # 
        :'opening_cost' => :'openingCost',
        
        # 
        :'opening_comm' => :'openingComm',
        
        # 
        :'open_order_buy_qty' => :'openOrderBuyQty',
        
        # 
        :'open_order_buy_cost' => :'openOrderBuyCost',
        
        # 
        :'open_order_buy_premium' => :'openOrderBuyPremium',
        
        # 
        :'open_order_sell_qty' => :'openOrderSellQty',
        
        # 
        :'open_order_sell_cost' => :'openOrderSellCost',
        
        # 
        :'open_order_sell_premium' => :'openOrderSellPremium',
        
        # 
        :'exec_buy_qty' => :'execBuyQty',
        
        # 
        :'exec_buy_cost' => :'execBuyCost',
        
        # 
        :'exec_sell_qty' => :'execSellQty',
        
        # 
        :'exec_sell_cost' => :'execSellCost',
        
        # 
        :'exec_qty' => :'execQty',
        
        # 
        :'exec_cost' => :'execCost',
        
        # 
        :'exec_comm' => :'execComm',
        
        # 
        :'current_timestamp' => :'currentTimestamp',
        
        # 
        :'current_qty' => :'currentQty',
        
        # 
        :'current_cost' => :'currentCost',
        
        # 
        :'current_comm' => :'currentComm',
        
        # 
        :'realised_cost' => :'realisedCost',
        
        # 
        :'unrealised_cost' => :'unrealisedCost',
        
        # 
        :'gross_open_cost' => :'grossOpenCost',
        
        # 
        :'gross_open_premium' => :'grossOpenPremium',
        
        # 
        :'gross_exec_cost' => :'grossExecCost',
        
        # 
        :'is_open' => :'isOpen',
        
        # 
        :'mark_price' => :'markPrice',
        
        # 
        :'mark_value' => :'markValue',
        
        # 
        :'home_notional' => :'homeNotional',
        
        # 
        :'foreign_notional' => :'foreignNotional',
        
        # 
        :'pos_state' => :'posState',
        
        # 
        :'pos_cost' => :'posCost',
        
        # 
        :'pos_cost2' => :'posCost2',
        
        # 
        :'pos_cross' => :'posCross',
        
        # 
        :'pos_init' => :'posInit',
        
        # 
        :'pos_comm' => :'posComm',
        
        # 
        :'pos_loss' => :'posLoss',
        
        # 
        :'pos_margin' => :'posMargin',
        
        # 
        :'pos_maint' => :'posMaint',
        
        # 
        :'pos_allowance' => :'posAllowance',
        
        # 
        :'taxable_margin' => :'taxableMargin',
        
        # 
        :'init_margin' => :'initMargin',
        
        # 
        :'maint_margin' => :'maintMargin',
        
        # 
        :'session_margin' => :'sessionMargin',
        
        # 
        :'target_excess_margin' => :'targetExcessMargin',
        
        # 
        :'var_margin' => :'varMargin',
        
        # 
        :'realised_gross_pnl' => :'realisedGrossPnl',
        
        # 
        :'realised_tax' => :'realisedTax',
        
        # 
        :'realised_pnl' => :'realisedPnl',
        
        # 
        :'unrealised_gross_pnl' => :'unrealisedGrossPnl',
        
        # 
        :'long_bankrupt' => :'longBankrupt',
        
        # 
        :'short_bankrupt' => :'shortBankrupt',
        
        # 
        :'tax_base' => :'taxBase',
        
        # 
        :'indicative_tax_rate' => :'indicativeTaxRate',
        
        # 
        :'indicative_tax' => :'indicativeTax',
        
        # 
        :'unrealised_tax' => :'unrealisedTax',
        
        # 
        :'unrealised_pnl' => :'unrealisedPnl',
        
        # 
        :'unrealised_pnl_pcnt' => :'unrealisedPnlPcnt',
        
        # 
        :'unrealised_roe_pcnt' => :'unrealisedRoePcnt',
        
        # 
        :'simple_qty' => :'simpleQty',
        
        # 
        :'simple_cost' => :'simpleCost',
        
        # 
        :'simple_value' => :'simpleValue',
        
        # 
        :'simple_pnl' => :'simplePnl',
        
        # 
        :'simple_pnl_pcnt' => :'simplePnlPcnt',
        
        # 
        :'avg_cost_price' => :'avgCostPrice',
        
        # 
        :'avg_entry_price' => :'avgEntryPrice',
        
        # 
        :'break_even_price' => :'breakEvenPrice',
        
        # 
        :'margin_call_price' => :'marginCallPrice',
        
        # 
        :'liquidation_price' => :'liquidationPrice',
        
        # 
        :'bankrupt_price' => :'bankruptPrice',
        
        # 
        :'timestamp' => :'timestamp'
        
      }
    end

    # attribute type
    def self.swagger_types
      {
        :'account' => :'Float',
        :'symbol' => :'String',
        :'underlying' => :'String',
        :'quote_currency' => :'String',
        :'currency' => :'String',
        :'commission' => :'Float',
        :'cross_margin' => :'BOOLEAN',
        :'rebalanced_pnl' => :'Float',
        :'prev_realised_pnl' => :'Float',
        :'prev_unrealised_pnl' => :'Float',
        :'prev_close_price' => :'Float',
        :'opening_timestamp' => :'Date',
        :'opening_qty' => :'Float',
        :'opening_cost' => :'Float',
        :'opening_comm' => :'Float',
        :'open_order_buy_qty' => :'Float',
        :'open_order_buy_cost' => :'Float',
        :'open_order_buy_premium' => :'Float',
        :'open_order_sell_qty' => :'Float',
        :'open_order_sell_cost' => :'Float',
        :'open_order_sell_premium' => :'Float',
        :'exec_buy_qty' => :'Float',
        :'exec_buy_cost' => :'Float',
        :'exec_sell_qty' => :'Float',
        :'exec_sell_cost' => :'Float',
        :'exec_qty' => :'Float',
        :'exec_cost' => :'Float',
        :'exec_comm' => :'Float',
        :'current_timestamp' => :'Date',
        :'current_qty' => :'Float',
        :'current_cost' => :'Float',
        :'current_comm' => :'Float',
        :'realised_cost' => :'Float',
        :'unrealised_cost' => :'Float',
        :'gross_open_cost' => :'Float',
        :'gross_open_premium' => :'Float',
        :'gross_exec_cost' => :'Float',
        :'is_open' => :'BOOLEAN',
        :'mark_price' => :'Float',
        :'mark_value' => :'Float',
        :'home_notional' => :'Float',
        :'foreign_notional' => :'Float',
        :'pos_state' => :'String',
        :'pos_cost' => :'Float',
        :'pos_cost2' => :'Float',
        :'pos_cross' => :'Float',
        :'pos_init' => :'Float',
        :'pos_comm' => :'Float',
        :'pos_loss' => :'Float',
        :'pos_margin' => :'Float',
        :'pos_maint' => :'Float',
        :'pos_allowance' => :'Float',
        :'taxable_margin' => :'Float',
        :'init_margin' => :'Float',
        :'maint_margin' => :'Float',
        :'session_margin' => :'Float',
        :'target_excess_margin' => :'Float',
        :'var_margin' => :'Float',
        :'realised_gross_pnl' => :'Float',
        :'realised_tax' => :'Float',
        :'realised_pnl' => :'Float',
        :'unrealised_gross_pnl' => :'Float',
        :'long_bankrupt' => :'Float',
        :'short_bankrupt' => :'Float',
        :'tax_base' => :'Float',
        :'indicative_tax_rate' => :'Float',
        :'indicative_tax' => :'Float',
        :'unrealised_tax' => :'Float',
        :'unrealised_pnl' => :'Float',
        :'unrealised_pnl_pcnt' => :'Float',
        :'unrealised_roe_pcnt' => :'Float',
        :'simple_qty' => :'Float',
        :'simple_cost' => :'Float',
        :'simple_value' => :'Float',
        :'simple_pnl' => :'Float',
        :'simple_pnl_pcnt' => :'Float',
        :'avg_cost_price' => :'Float',
        :'avg_entry_price' => :'Float',
        :'break_even_price' => :'Float',
        :'margin_call_price' => :'Float',
        :'liquidation_price' => :'Float',
        :'bankrupt_price' => :'Float',
        :'timestamp' => :'Date'
        
      }
    end

    def initialize(attributes = {})
      return if !attributes.is_a?(Hash) || attributes.empty?

      # convert string to symbol for hash key
      attributes = attributes.inject({}){|memo,(k,v)| memo[k.to_sym] = v; memo}

      
      if attributes[:'account']
        self.account = attributes[:'account']
      end
      
      if attributes[:'symbol']
        self.symbol = attributes[:'symbol']
      end
      
      if attributes[:'underlying']
        self.underlying = attributes[:'underlying']
      end
      
      if attributes[:'quoteCurrency']
        self.quote_currency = attributes[:'quoteCurrency']
      end
      
      if attributes[:'currency']
        self.currency = attributes[:'currency']
      end
      
      if attributes[:'commission']
        self.commission = attributes[:'commission']
      end
      
      if attributes[:'crossMargin']
        self.cross_margin = attributes[:'crossMargin']
      end
      
      if attributes[:'rebalancedPnl']
        self.rebalanced_pnl = attributes[:'rebalancedPnl']
      end
      
      if attributes[:'prevRealisedPnl']
        self.prev_realised_pnl = attributes[:'prevRealisedPnl']
      end
      
      if attributes[:'prevUnrealisedPnl']
        self.prev_unrealised_pnl = attributes[:'prevUnrealisedPnl']
      end
      
      if attributes[:'prevClosePrice']
        self.prev_close_price = attributes[:'prevClosePrice']
      end
      
      if attributes[:'openingTimestamp']
        self.opening_timestamp = attributes[:'openingTimestamp']
      end
      
      if attributes[:'openingQty']
        self.opening_qty = attributes[:'openingQty']
      end
      
      if attributes[:'openingCost']
        self.opening_cost = attributes[:'openingCost']
      end
      
      if attributes[:'openingComm']
        self.opening_comm = attributes[:'openingComm']
      end
      
      if attributes[:'openOrderBuyQty']
        self.open_order_buy_qty = attributes[:'openOrderBuyQty']
      end
      
      if attributes[:'openOrderBuyCost']
        self.open_order_buy_cost = attributes[:'openOrderBuyCost']
      end
      
      if attributes[:'openOrderBuyPremium']
        self.open_order_buy_premium = attributes[:'openOrderBuyPremium']
      end
      
      if attributes[:'openOrderSellQty']
        self.open_order_sell_qty = attributes[:'openOrderSellQty']
      end
      
      if attributes[:'openOrderSellCost']
        self.open_order_sell_cost = attributes[:'openOrderSellCost']
      end
      
      if attributes[:'openOrderSellPremium']
        self.open_order_sell_premium = attributes[:'openOrderSellPremium']
      end
      
      if attributes[:'execBuyQty']
        self.exec_buy_qty = attributes[:'execBuyQty']
      end
      
      if attributes[:'execBuyCost']
        self.exec_buy_cost = attributes[:'execBuyCost']
      end
      
      if attributes[:'execSellQty']
        self.exec_sell_qty = attributes[:'execSellQty']
      end
      
      if attributes[:'execSellCost']
        self.exec_sell_cost = attributes[:'execSellCost']
      end
      
      if attributes[:'execQty']
        self.exec_qty = attributes[:'execQty']
      end
      
      if attributes[:'execCost']
        self.exec_cost = attributes[:'execCost']
      end
      
      if attributes[:'execComm']
        self.exec_comm = attributes[:'execComm']
      end
      
      if attributes[:'currentTimestamp']
        self.current_timestamp = attributes[:'currentTimestamp']
      end
      
      if attributes[:'currentQty']
        self.current_qty = attributes[:'currentQty']
      end
      
      if attributes[:'currentCost']
        self.current_cost = attributes[:'currentCost']
      end
      
      if attributes[:'currentComm']
        self.current_comm = attributes[:'currentComm']
      end
      
      if attributes[:'realisedCost']
        self.realised_cost = attributes[:'realisedCost']
      end
      
      if attributes[:'unrealisedCost']
        self.unrealised_cost = attributes[:'unrealisedCost']
      end
      
      if attributes[:'grossOpenCost']
        self.gross_open_cost = attributes[:'grossOpenCost']
      end
      
      if attributes[:'grossOpenPremium']
        self.gross_open_premium = attributes[:'grossOpenPremium']
      end
      
      if attributes[:'grossExecCost']
        self.gross_exec_cost = attributes[:'grossExecCost']
      end
      
      if attributes[:'isOpen']
        self.is_open = attributes[:'isOpen']
      end
      
      if attributes[:'markPrice']
        self.mark_price = attributes[:'markPrice']
      end
      
      if attributes[:'markValue']
        self.mark_value = attributes[:'markValue']
      end
      
      if attributes[:'homeNotional']
        self.home_notional = attributes[:'homeNotional']
      end
      
      if attributes[:'foreignNotional']
        self.foreign_notional = attributes[:'foreignNotional']
      end
      
      if attributes[:'posState']
        self.pos_state = attributes[:'posState']
      end
      
      if attributes[:'posCost']
        self.pos_cost = attributes[:'posCost']
      end
      
      if attributes[:'posCost2']
        self.pos_cost2 = attributes[:'posCost2']
      end
      
      if attributes[:'posCross']
        self.pos_cross = attributes[:'posCross']
      end
      
      if attributes[:'posInit']
        self.pos_init = attributes[:'posInit']
      end
      
      if attributes[:'posComm']
        self.pos_comm = attributes[:'posComm']
      end
      
      if attributes[:'posLoss']
        self.pos_loss = attributes[:'posLoss']
      end
      
      if attributes[:'posMargin']
        self.pos_margin = attributes[:'posMargin']
      end
      
      if attributes[:'posMaint']
        self.pos_maint = attributes[:'posMaint']
      end
      
      if attributes[:'posAllowance']
        self.pos_allowance = attributes[:'posAllowance']
      end
      
      if attributes[:'taxableMargin']
        self.taxable_margin = attributes[:'taxableMargin']
      end
      
      if attributes[:'initMargin']
        self.init_margin = attributes[:'initMargin']
      end
      
      if attributes[:'maintMargin']
        self.maint_margin = attributes[:'maintMargin']
      end
      
      if attributes[:'sessionMargin']
        self.session_margin = attributes[:'sessionMargin']
      end
      
      if attributes[:'targetExcessMargin']
        self.target_excess_margin = attributes[:'targetExcessMargin']
      end
      
      if attributes[:'varMargin']
        self.var_margin = attributes[:'varMargin']
      end
      
      if attributes[:'realisedGrossPnl']
        self.realised_gross_pnl = attributes[:'realisedGrossPnl']
      end
      
      if attributes[:'realisedTax']
        self.realised_tax = attributes[:'realisedTax']
      end
      
      if attributes[:'realisedPnl']
        self.realised_pnl = attributes[:'realisedPnl']
      end
      
      if attributes[:'unrealisedGrossPnl']
        self.unrealised_gross_pnl = attributes[:'unrealisedGrossPnl']
      end
      
      if attributes[:'longBankrupt']
        self.long_bankrupt = attributes[:'longBankrupt']
      end
      
      if attributes[:'shortBankrupt']
        self.short_bankrupt = attributes[:'shortBankrupt']
      end
      
      if attributes[:'taxBase']
        self.tax_base = attributes[:'taxBase']
      end
      
      if attributes[:'indicativeTaxRate']
        self.indicative_tax_rate = attributes[:'indicativeTaxRate']
      end
      
      if attributes[:'indicativeTax']
        self.indicative_tax = attributes[:'indicativeTax']
      end
      
      if attributes[:'unrealisedTax']
        self.unrealised_tax = attributes[:'unrealisedTax']
      end
      
      if attributes[:'unrealisedPnl']
        self.unrealised_pnl = attributes[:'unrealisedPnl']
      end
      
      if attributes[:'unrealisedPnlPcnt']
        self.unrealised_pnl_pcnt = attributes[:'unrealisedPnlPcnt']
      end
      
      if attributes[:'unrealisedRoePcnt']
        self.unrealised_roe_pcnt = attributes[:'unrealisedRoePcnt']
      end
      
      if attributes[:'simpleQty']
        self.simple_qty = attributes[:'simpleQty']
      end
      
      if attributes[:'simpleCost']
        self.simple_cost = attributes[:'simpleCost']
      end
      
      if attributes[:'simpleValue']
        self.simple_value = attributes[:'simpleValue']
      end
      
      if attributes[:'simplePnl']
        self.simple_pnl = attributes[:'simplePnl']
      end
      
      if attributes[:'simplePnlPcnt']
        self.simple_pnl_pcnt = attributes[:'simplePnlPcnt']
      end
      
      if attributes[:'avgCostPrice']
        self.avg_cost_price = attributes[:'avgCostPrice']
      end
      
      if attributes[:'avgEntryPrice']
        self.avg_entry_price = attributes[:'avgEntryPrice']
      end
      
      if attributes[:'breakEvenPrice']
        self.break_even_price = attributes[:'breakEvenPrice']
      end
      
      if attributes[:'marginCallPrice']
        self.margin_call_price = attributes[:'marginCallPrice']
      end
      
      if attributes[:'liquidationPrice']
        self.liquidation_price = attributes[:'liquidationPrice']
      end
      
      if attributes[:'bankruptPrice']
        self.bankrupt_price = attributes[:'bankruptPrice']
      end
      
      if attributes[:'timestamp']
        self.timestamp = attributes[:'timestamp']
      end
      
    end

    def ==(o)
      return true if self.equal?(o)
      self.class == o.class &&
          account == o.account &&
          symbol == o.symbol &&
          underlying == o.underlying &&
          quote_currency == o.quote_currency &&
          currency == o.currency &&
          commission == o.commission &&
          cross_margin == o.cross_margin &&
          rebalanced_pnl == o.rebalanced_pnl &&
          prev_realised_pnl == o.prev_realised_pnl &&
          prev_unrealised_pnl == o.prev_unrealised_pnl &&
          prev_close_price == o.prev_close_price &&
          opening_timestamp == o.opening_timestamp &&
          opening_qty == o.opening_qty &&
          opening_cost == o.opening_cost &&
          opening_comm == o.opening_comm &&
          open_order_buy_qty == o.open_order_buy_qty &&
          open_order_buy_cost == o.open_order_buy_cost &&
          open_order_buy_premium == o.open_order_buy_premium &&
          open_order_sell_qty == o.open_order_sell_qty &&
          open_order_sell_cost == o.open_order_sell_cost &&
          open_order_sell_premium == o.open_order_sell_premium &&
          exec_buy_qty == o.exec_buy_qty &&
          exec_buy_cost == o.exec_buy_cost &&
          exec_sell_qty == o.exec_sell_qty &&
          exec_sell_cost == o.exec_sell_cost &&
          exec_qty == o.exec_qty &&
          exec_cost == o.exec_cost &&
          exec_comm == o.exec_comm &&
          current_timestamp == o.current_timestamp &&
          current_qty == o.current_qty &&
          current_cost == o.current_cost &&
          current_comm == o.current_comm &&
          realised_cost == o.realised_cost &&
          unrealised_cost == o.unrealised_cost &&
          gross_open_cost == o.gross_open_cost &&
          gross_open_premium == o.gross_open_premium &&
          gross_exec_cost == o.gross_exec_cost &&
          is_open == o.is_open &&
          mark_price == o.mark_price &&
          mark_value == o.mark_value &&
          home_notional == o.home_notional &&
          foreign_notional == o.foreign_notional &&
          pos_state == o.pos_state &&
          pos_cost == o.pos_cost &&
          pos_cost2 == o.pos_cost2 &&
          pos_cross == o.pos_cross &&
          pos_init == o.pos_init &&
          pos_comm == o.pos_comm &&
          pos_loss == o.pos_loss &&
          pos_margin == o.pos_margin &&
          pos_maint == o.pos_maint &&
          pos_allowance == o.pos_allowance &&
          taxable_margin == o.taxable_margin &&
          init_margin == o.init_margin &&
          maint_margin == o.maint_margin &&
          session_margin == o.session_margin &&
          target_excess_margin == o.target_excess_margin &&
          var_margin == o.var_margin &&
          realised_gross_pnl == o.realised_gross_pnl &&
          realised_tax == o.realised_tax &&
          realised_pnl == o.realised_pnl &&
          unrealised_gross_pnl == o.unrealised_gross_pnl &&
          long_bankrupt == o.long_bankrupt &&
          short_bankrupt == o.short_bankrupt &&
          tax_base == o.tax_base &&
          indicative_tax_rate == o.indicative_tax_rate &&
          indicative_tax == o.indicative_tax &&
          unrealised_tax == o.unrealised_tax &&
          unrealised_pnl == o.unrealised_pnl &&
          unrealised_pnl_pcnt == o.unrealised_pnl_pcnt &&
          unrealised_roe_pcnt == o.unrealised_roe_pcnt &&
          simple_qty == o.simple_qty &&
          simple_cost == o.simple_cost &&
          simple_value == o.simple_value &&
          simple_pnl == o.simple_pnl &&
          simple_pnl_pcnt == o.simple_pnl_pcnt &&
          avg_cost_price == o.avg_cost_price &&
          avg_entry_price == o.avg_entry_price &&
          break_even_price == o.break_even_price &&
          margin_call_price == o.margin_call_price &&
          liquidation_price == o.liquidation_price &&
          bankrupt_price == o.bankrupt_price &&
          timestamp == o.timestamp
    end

    def eql?(o)
      self == o
    end

    def hash
      [account, symbol, underlying, quote_currency, currency, commission, cross_margin, rebalanced_pnl, prev_realised_pnl, prev_unrealised_pnl, prev_close_price, opening_timestamp, opening_qty, opening_cost, opening_comm, open_order_buy_qty, open_order_buy_cost, open_order_buy_premium, open_order_sell_qty, open_order_sell_cost, open_order_sell_premium, exec_buy_qty, exec_buy_cost, exec_sell_qty, exec_sell_cost, exec_qty, exec_cost, exec_comm, current_timestamp, current_qty, current_cost, current_comm, realised_cost, unrealised_cost, gross_open_cost, gross_open_premium, gross_exec_cost, is_open, mark_price, mark_value, home_notional, foreign_notional, pos_state, pos_cost, pos_cost2, pos_cross, pos_init, pos_comm, pos_loss, pos_margin, pos_maint, pos_allowance, taxable_margin, init_margin, maint_margin, session_margin, target_excess_margin, var_margin, realised_gross_pnl, realised_tax, realised_pnl, unrealised_gross_pnl, long_bankrupt, short_bankrupt, tax_base, indicative_tax_rate, indicative_tax, unrealised_tax, unrealised_pnl, unrealised_pnl_pcnt, unrealised_roe_pcnt, simple_qty, simple_cost, simple_value, simple_pnl, simple_pnl_pcnt, avg_cost_price, avg_entry_price, break_even_price, margin_call_price, liquidation_price, bankrupt_price, timestamp].hash
    end
  end
end
