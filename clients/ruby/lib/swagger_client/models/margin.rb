module SwaggerClient
  # 
  class Margin < BaseObject
    attr_accessor :account, :currency, :risk_limit, :prev_state, :state, :action, :amount, :pending_credit, :pending_debit, :confirmed_debit, :prev_realised_pnl, :prev_unrealised_pnl, :gross_comm, :gross_open_cost, :gross_open_premium, :gross_exec_cost, :gross_mark_value, :risk_value, :taxable_margin, :init_margin, :maint_margin, :session_margin, :target_excess_margin, :var_margin, :realised_pnl, :unrealised_pnl, :indicative_tax, :unrealised_profit, :synthetic_margin, :wallet_balance, :margin_balance, :margin_balance_pcnt, :margin_leverage, :margin_used_pcnt, :excess_margin, :excess_margin_pcnt, :available_margin, :withdrawable_margin, :timestamp, :gross_last_value, :commission
    # attribute mapping from ruby-style variable name to JSON key
    def self.attribute_map
      {
        
        # 
        :'account' => :'account',
        
        # 
        :'currency' => :'currency',
        
        # 
        :'risk_limit' => :'riskLimit',
        
        # 
        :'prev_state' => :'prevState',
        
        # 
        :'state' => :'state',
        
        # 
        :'action' => :'action',
        
        # 
        :'amount' => :'amount',
        
        # 
        :'pending_credit' => :'pendingCredit',
        
        # 
        :'pending_debit' => :'pendingDebit',
        
        # 
        :'confirmed_debit' => :'confirmedDebit',
        
        # 
        :'prev_realised_pnl' => :'prevRealisedPnl',
        
        # 
        :'prev_unrealised_pnl' => :'prevUnrealisedPnl',
        
        # 
        :'gross_comm' => :'grossComm',
        
        # 
        :'gross_open_cost' => :'grossOpenCost',
        
        # 
        :'gross_open_premium' => :'grossOpenPremium',
        
        # 
        :'gross_exec_cost' => :'grossExecCost',
        
        # 
        :'gross_mark_value' => :'grossMarkValue',
        
        # 
        :'risk_value' => :'riskValue',
        
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
        :'realised_pnl' => :'realisedPnl',
        
        # 
        :'unrealised_pnl' => :'unrealisedPnl',
        
        # 
        :'indicative_tax' => :'indicativeTax',
        
        # 
        :'unrealised_profit' => :'unrealisedProfit',
        
        # 
        :'synthetic_margin' => :'syntheticMargin',
        
        # 
        :'wallet_balance' => :'walletBalance',
        
        # 
        :'margin_balance' => :'marginBalance',
        
        # 
        :'margin_balance_pcnt' => :'marginBalancePcnt',
        
        # 
        :'margin_leverage' => :'marginLeverage',
        
        # 
        :'margin_used_pcnt' => :'marginUsedPcnt',
        
        # 
        :'excess_margin' => :'excessMargin',
        
        # 
        :'excess_margin_pcnt' => :'excessMarginPcnt',
        
        # 
        :'available_margin' => :'availableMargin',
        
        # 
        :'withdrawable_margin' => :'withdrawableMargin',
        
        # 
        :'timestamp' => :'timestamp',
        
        # 
        :'gross_last_value' => :'grossLastValue',
        
        # 
        :'commission' => :'commission'
        
      }
    end

    # attribute type
    def self.swagger_types
      {
        :'account' => :'Float',
        :'currency' => :'String',
        :'risk_limit' => :'Float',
        :'prev_state' => :'String',
        :'state' => :'String',
        :'action' => :'String',
        :'amount' => :'Float',
        :'pending_credit' => :'Float',
        :'pending_debit' => :'Float',
        :'confirmed_debit' => :'Float',
        :'prev_realised_pnl' => :'Float',
        :'prev_unrealised_pnl' => :'Float',
        :'gross_comm' => :'Float',
        :'gross_open_cost' => :'Float',
        :'gross_open_premium' => :'Float',
        :'gross_exec_cost' => :'Float',
        :'gross_mark_value' => :'Float',
        :'risk_value' => :'Float',
        :'taxable_margin' => :'Float',
        :'init_margin' => :'Float',
        :'maint_margin' => :'Float',
        :'session_margin' => :'Float',
        :'target_excess_margin' => :'Float',
        :'var_margin' => :'Float',
        :'realised_pnl' => :'Float',
        :'unrealised_pnl' => :'Float',
        :'indicative_tax' => :'Float',
        :'unrealised_profit' => :'Float',
        :'synthetic_margin' => :'Float',
        :'wallet_balance' => :'Float',
        :'margin_balance' => :'Float',
        :'margin_balance_pcnt' => :'Float',
        :'margin_leverage' => :'Float',
        :'margin_used_pcnt' => :'Float',
        :'excess_margin' => :'Float',
        :'excess_margin_pcnt' => :'Float',
        :'available_margin' => :'Float',
        :'withdrawable_margin' => :'Float',
        :'timestamp' => :'Date',
        :'gross_last_value' => :'Float',
        :'commission' => :'Float'
        
      }
    end

    def initialize(attributes = {})
      return if !attributes.is_a?(Hash) || attributes.empty?

      # convert string to symbol for hash key
      attributes = attributes.inject({}){|memo,(k,v)| memo[k.to_sym] = v; memo}

      
      if attributes[:'account']
        self.account = attributes[:'account']
      end
      
      if attributes[:'currency']
        self.currency = attributes[:'currency']
      end
      
      if attributes[:'riskLimit']
        self.risk_limit = attributes[:'riskLimit']
      end
      
      if attributes[:'prevState']
        self.prev_state = attributes[:'prevState']
      end
      
      if attributes[:'state']
        self.state = attributes[:'state']
      end
      
      if attributes[:'action']
        self.action = attributes[:'action']
      end
      
      if attributes[:'amount']
        self.amount = attributes[:'amount']
      end
      
      if attributes[:'pendingCredit']
        self.pending_credit = attributes[:'pendingCredit']
      end
      
      if attributes[:'pendingDebit']
        self.pending_debit = attributes[:'pendingDebit']
      end
      
      if attributes[:'confirmedDebit']
        self.confirmed_debit = attributes[:'confirmedDebit']
      end
      
      if attributes[:'prevRealisedPnl']
        self.prev_realised_pnl = attributes[:'prevRealisedPnl']
      end
      
      if attributes[:'prevUnrealisedPnl']
        self.prev_unrealised_pnl = attributes[:'prevUnrealisedPnl']
      end
      
      if attributes[:'grossComm']
        self.gross_comm = attributes[:'grossComm']
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
      
      if attributes[:'grossMarkValue']
        self.gross_mark_value = attributes[:'grossMarkValue']
      end
      
      if attributes[:'riskValue']
        self.risk_value = attributes[:'riskValue']
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
      
      if attributes[:'realisedPnl']
        self.realised_pnl = attributes[:'realisedPnl']
      end
      
      if attributes[:'unrealisedPnl']
        self.unrealised_pnl = attributes[:'unrealisedPnl']
      end
      
      if attributes[:'indicativeTax']
        self.indicative_tax = attributes[:'indicativeTax']
      end
      
      if attributes[:'unrealisedProfit']
        self.unrealised_profit = attributes[:'unrealisedProfit']
      end
      
      if attributes[:'syntheticMargin']
        self.synthetic_margin = attributes[:'syntheticMargin']
      end
      
      if attributes[:'walletBalance']
        self.wallet_balance = attributes[:'walletBalance']
      end
      
      if attributes[:'marginBalance']
        self.margin_balance = attributes[:'marginBalance']
      end
      
      if attributes[:'marginBalancePcnt']
        self.margin_balance_pcnt = attributes[:'marginBalancePcnt']
      end
      
      if attributes[:'marginLeverage']
        self.margin_leverage = attributes[:'marginLeverage']
      end
      
      if attributes[:'marginUsedPcnt']
        self.margin_used_pcnt = attributes[:'marginUsedPcnt']
      end
      
      if attributes[:'excessMargin']
        self.excess_margin = attributes[:'excessMargin']
      end
      
      if attributes[:'excessMarginPcnt']
        self.excess_margin_pcnt = attributes[:'excessMarginPcnt']
      end
      
      if attributes[:'availableMargin']
        self.available_margin = attributes[:'availableMargin']
      end
      
      if attributes[:'withdrawableMargin']
        self.withdrawable_margin = attributes[:'withdrawableMargin']
      end
      
      if attributes[:'timestamp']
        self.timestamp = attributes[:'timestamp']
      end
      
      if attributes[:'grossLastValue']
        self.gross_last_value = attributes[:'grossLastValue']
      end
      
      if attributes[:'commission']
        self.commission = attributes[:'commission']
      end
      
    end

    def ==(o)
      return true if self.equal?(o)
      self.class == o.class &&
          account == o.account &&
          currency == o.currency &&
          risk_limit == o.risk_limit &&
          prev_state == o.prev_state &&
          state == o.state &&
          action == o.action &&
          amount == o.amount &&
          pending_credit == o.pending_credit &&
          pending_debit == o.pending_debit &&
          confirmed_debit == o.confirmed_debit &&
          prev_realised_pnl == o.prev_realised_pnl &&
          prev_unrealised_pnl == o.prev_unrealised_pnl &&
          gross_comm == o.gross_comm &&
          gross_open_cost == o.gross_open_cost &&
          gross_open_premium == o.gross_open_premium &&
          gross_exec_cost == o.gross_exec_cost &&
          gross_mark_value == o.gross_mark_value &&
          risk_value == o.risk_value &&
          taxable_margin == o.taxable_margin &&
          init_margin == o.init_margin &&
          maint_margin == o.maint_margin &&
          session_margin == o.session_margin &&
          target_excess_margin == o.target_excess_margin &&
          var_margin == o.var_margin &&
          realised_pnl == o.realised_pnl &&
          unrealised_pnl == o.unrealised_pnl &&
          indicative_tax == o.indicative_tax &&
          unrealised_profit == o.unrealised_profit &&
          synthetic_margin == o.synthetic_margin &&
          wallet_balance == o.wallet_balance &&
          margin_balance == o.margin_balance &&
          margin_balance_pcnt == o.margin_balance_pcnt &&
          margin_leverage == o.margin_leverage &&
          margin_used_pcnt == o.margin_used_pcnt &&
          excess_margin == o.excess_margin &&
          excess_margin_pcnt == o.excess_margin_pcnt &&
          available_margin == o.available_margin &&
          withdrawable_margin == o.withdrawable_margin &&
          timestamp == o.timestamp &&
          gross_last_value == o.gross_last_value &&
          commission == o.commission
    end

    def eql?(o)
      self == o
    end

    def hash
      [account, currency, risk_limit, prev_state, state, action, amount, pending_credit, pending_debit, confirmed_debit, prev_realised_pnl, prev_unrealised_pnl, gross_comm, gross_open_cost, gross_open_premium, gross_exec_cost, gross_mark_value, risk_value, taxable_margin, init_margin, maint_margin, session_margin, target_excess_margin, var_margin, realised_pnl, unrealised_pnl, indicative_tax, unrealised_profit, synthetic_margin, wallet_balance, margin_balance, margin_balance_pcnt, margin_leverage, margin_used_pcnt, excess_margin, excess_margin_pcnt, available_margin, withdrawable_margin, timestamp, gross_last_value, commission].hash
    end
  end
end
