class Margin
  attr_accessor :account, :currency, :commission, :risk_limit, :state, :action, :amount, :pending_credit, :pending_debit, :prev_realised_pnl, :prev_unrealised_pnl, :gross_comm, :gross_open_cost, :gross_exec_cost, :gross_last_value, :risk_value, :init_margin, :maint_margin, :session_margin, :target_excess_margin, :var_margin, :realised_pnl, :unrealised_pnl, :wallet_balance, :margin_balance, :margin_balance_pcnt, :margin_leverage, :margin_used_pcnt, :excess_margin, :excess_margin_pcnt, :available_margin, :withdrawable_margin, :timestamp

  # :internal => :external
  def self.attribute_map
    {
      :account => :account,
      :currency => :currency,
      :commission => :commission,
      :risk_limit => :riskLimit,
      :state => :state,
      :action => :action,
      :amount => :amount,
      :pending_credit => :pendingCredit,
      :pending_debit => :pendingDebit,
      :prev_realised_pnl => :prevRealisedPnl,
      :prev_unrealised_pnl => :prevUnrealisedPnl,
      :gross_comm => :grossComm,
      :gross_open_cost => :grossOpenCost,
      :gross_exec_cost => :grossExecCost,
      :gross_last_value => :grossLastValue,
      :risk_value => :riskValue,
      :init_margin => :initMargin,
      :maint_margin => :maintMargin,
      :session_margin => :sessionMargin,
      :target_excess_margin => :targetExcessMargin,
      :var_margin => :varMargin,
      :realised_pnl => :realisedPnl,
      :unrealised_pnl => :unrealisedPnl,
      :wallet_balance => :walletBalance,
      :margin_balance => :marginBalance,
      :margin_balance_pcnt => :marginBalancePcnt,
      :margin_leverage => :marginLeverage,
      :margin_used_pcnt => :marginUsedPcnt,
      :excess_margin => :excessMargin,
      :excess_margin_pcnt => :excessMarginPcnt,
      :available_margin => :availableMargin,
      :withdrawable_margin => :withdrawableMargin,
      :timestamp => :timestamp

    }
  end

  def initialize(attributes = {})
    return if attributes.empty?
    # Morph attribute keys into undescored rubyish style
    if self.class.attribute_map[:"account"]
      @account = attributes["account"]
    end
    if self.class.attribute_map[:"currency"]
      @currency = attributes["currency"]
    end
    if self.class.attribute_map[:"commission"]
      @commission = attributes["commission"]
    end
    if self.class.attribute_map[:"risk_limit"]
      @risk_limit = attributes["riskLimit"]
    end
    if self.class.attribute_map[:"state"]
      @state = attributes["state"]
    end
    if self.class.attribute_map[:"action"]
      @action = attributes["action"]
    end
    if self.class.attribute_map[:"amount"]
      @amount = attributes["amount"]
    end
    if self.class.attribute_map[:"pending_credit"]
      @pending_credit = attributes["pendingCredit"]
    end
    if self.class.attribute_map[:"pending_debit"]
      @pending_debit = attributes["pendingDebit"]
    end
    if self.class.attribute_map[:"prev_realised_pnl"]
      @prev_realised_pnl = attributes["prevRealisedPnl"]
    end
    if self.class.attribute_map[:"prev_unrealised_pnl"]
      @prev_unrealised_pnl = attributes["prevUnrealisedPnl"]
    end
    if self.class.attribute_map[:"gross_comm"]
      @gross_comm = attributes["grossComm"]
    end
    if self.class.attribute_map[:"gross_open_cost"]
      @gross_open_cost = attributes["grossOpenCost"]
    end
    if self.class.attribute_map[:"gross_exec_cost"]
      @gross_exec_cost = attributes["grossExecCost"]
    end
    if self.class.attribute_map[:"gross_last_value"]
      @gross_last_value = attributes["grossLastValue"]
    end
    if self.class.attribute_map[:"risk_value"]
      @risk_value = attributes["riskValue"]
    end
    if self.class.attribute_map[:"init_margin"]
      @init_margin = attributes["initMargin"]
    end
    if self.class.attribute_map[:"maint_margin"]
      @maint_margin = attributes["maintMargin"]
    end
    if self.class.attribute_map[:"session_margin"]
      @session_margin = attributes["sessionMargin"]
    end
    if self.class.attribute_map[:"target_excess_margin"]
      @target_excess_margin = attributes["targetExcessMargin"]
    end
    if self.class.attribute_map[:"var_margin"]
      @var_margin = attributes["varMargin"]
    end
    if self.class.attribute_map[:"realised_pnl"]
      @realised_pnl = attributes["realisedPnl"]
    end
    if self.class.attribute_map[:"unrealised_pnl"]
      @unrealised_pnl = attributes["unrealisedPnl"]
    end
    if self.class.attribute_map[:"wallet_balance"]
      @wallet_balance = attributes["walletBalance"]
    end
    if self.class.attribute_map[:"margin_balance"]
      @margin_balance = attributes["marginBalance"]
    end
    if self.class.attribute_map[:"margin_balance_pcnt"]
      @margin_balance_pcnt = attributes["marginBalancePcnt"]
    end
    if self.class.attribute_map[:"margin_leverage"]
      @margin_leverage = attributes["marginLeverage"]
    end
    if self.class.attribute_map[:"margin_used_pcnt"]
      @margin_used_pcnt = attributes["marginUsedPcnt"]
    end
    if self.class.attribute_map[:"excess_margin"]
      @excess_margin = attributes["excessMargin"]
    end
    if self.class.attribute_map[:"excess_margin_pcnt"]
      @excess_margin_pcnt = attributes["excessMarginPcnt"]
    end
    if self.class.attribute_map[:"available_margin"]
      @available_margin = attributes["availableMargin"]
    end
    if self.class.attribute_map[:"withdrawable_margin"]
      @withdrawable_margin = attributes["withdrawableMargin"]
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

