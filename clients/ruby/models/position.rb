class Position
  attr_accessor :account, :symbol, :currency, :prev_pnl, :prev_close_price, :opening_timestamp, :opening_buy_qty, :opening_buy_cost, :opening_sell_qty, :opening_sell_cost, :opening_qty, :opening_cost, :opening_comm, :open_order_buy_qty, :open_order_buy_cost, :open_order_sell_qty, :open_order_sell_cost, :exec_buy_qty, :exec_buy_cost, :exec_sell_qty, :exec_sell_cost, :exec_qty, :exec_cost, :exec_comm, :current_timestamp, :current_buy_qty, :current_buy_cost, :current_sell_qty, :current_sell_cost, :current_qty, :current_cost, :current_comm, :gross_open_cost, :gross_exec_cost, :last_price, :last_value, :init_margin, :maint_margin, :session_margin, :target_excess_margin, :var_margin, :pnl, :pnl_pcnt, :avg_buy_price, :avg_sell_price, :avg_entry_price, :break_even_price, :margin_call_price, :liquidation_price, :bankrupt_price, :timestamp

  # :internal => :external
  def self.attribute_map
    {
      :account => :account,
      :symbol => :symbol,
      :currency => :currency,
      :prev_pnl => :prevPnl,
      :prev_close_price => :prevClosePrice,
      :opening_timestamp => :openingTimestamp,
      :opening_buy_qty => :openingBuyQty,
      :opening_buy_cost => :openingBuyCost,
      :opening_sell_qty => :openingSellQty,
      :opening_sell_cost => :openingSellCost,
      :opening_qty => :openingQty,
      :opening_cost => :openingCost,
      :opening_comm => :openingComm,
      :open_order_buy_qty => :openOrderBuyQty,
      :open_order_buy_cost => :openOrderBuyCost,
      :open_order_sell_qty => :openOrderSellQty,
      :open_order_sell_cost => :openOrderSellCost,
      :exec_buy_qty => :execBuyQty,
      :exec_buy_cost => :execBuyCost,
      :exec_sell_qty => :execSellQty,
      :exec_sell_cost => :execSellCost,
      :exec_qty => :execQty,
      :exec_cost => :execCost,
      :exec_comm => :execComm,
      :current_timestamp => :currentTimestamp,
      :current_buy_qty => :currentBuyQty,
      :current_buy_cost => :currentBuyCost,
      :current_sell_qty => :currentSellQty,
      :current_sell_cost => :currentSellCost,
      :current_qty => :currentQty,
      :current_cost => :currentCost,
      :current_comm => :currentComm,
      :gross_open_cost => :grossOpenCost,
      :gross_exec_cost => :grossExecCost,
      :last_price => :lastPrice,
      :last_value => :lastValue,
      :init_margin => :initMargin,
      :maint_margin => :maintMargin,
      :session_margin => :sessionMargin,
      :target_excess_margin => :targetExcessMargin,
      :var_margin => :varMargin,
      :pnl => :pnl,
      :pnl_pcnt => :pnlPcnt,
      :avg_buy_price => :avgBuyPrice,
      :avg_sell_price => :avgSellPrice,
      :avg_entry_price => :avgEntryPrice,
      :break_even_price => :breakEvenPrice,
      :margin_call_price => :marginCallPrice,
      :liquidation_price => :liquidationPrice,
      :bankrupt_price => :bankruptPrice,
      :timestamp => :timestamp

    }
  end

  def initialize(attributes = {})
    return if attributes.empty?
    # Morph attribute keys into undescored rubyish style
    if self.class.attribute_map[:"account"]
      @account = attributes["account"]
    end
    if self.class.attribute_map[:"symbol"]
      @symbol = attributes["symbol"]
    end
    if self.class.attribute_map[:"currency"]
      @currency = attributes["currency"]
    end
    if self.class.attribute_map[:"prev_pnl"]
      @prev_pnl = attributes["prevPnl"]
    end
    if self.class.attribute_map[:"prev_close_price"]
      @prev_close_price = attributes["prevClosePrice"]
    end
    if self.class.attribute_map[:"opening_timestamp"]
      @opening_timestamp = attributes["openingTimestamp"]
    end
    if self.class.attribute_map[:"opening_buy_qty"]
      @opening_buy_qty = attributes["openingBuyQty"]
    end
    if self.class.attribute_map[:"opening_buy_cost"]
      @opening_buy_cost = attributes["openingBuyCost"]
    end
    if self.class.attribute_map[:"opening_sell_qty"]
      @opening_sell_qty = attributes["openingSellQty"]
    end
    if self.class.attribute_map[:"opening_sell_cost"]
      @opening_sell_cost = attributes["openingSellCost"]
    end
    if self.class.attribute_map[:"opening_qty"]
      @opening_qty = attributes["openingQty"]
    end
    if self.class.attribute_map[:"opening_cost"]
      @opening_cost = attributes["openingCost"]
    end
    if self.class.attribute_map[:"opening_comm"]
      @opening_comm = attributes["openingComm"]
    end
    if self.class.attribute_map[:"open_order_buy_qty"]
      @open_order_buy_qty = attributes["openOrderBuyQty"]
    end
    if self.class.attribute_map[:"open_order_buy_cost"]
      @open_order_buy_cost = attributes["openOrderBuyCost"]
    end
    if self.class.attribute_map[:"open_order_sell_qty"]
      @open_order_sell_qty = attributes["openOrderSellQty"]
    end
    if self.class.attribute_map[:"open_order_sell_cost"]
      @open_order_sell_cost = attributes["openOrderSellCost"]
    end
    if self.class.attribute_map[:"exec_buy_qty"]
      @exec_buy_qty = attributes["execBuyQty"]
    end
    if self.class.attribute_map[:"exec_buy_cost"]
      @exec_buy_cost = attributes["execBuyCost"]
    end
    if self.class.attribute_map[:"exec_sell_qty"]
      @exec_sell_qty = attributes["execSellQty"]
    end
    if self.class.attribute_map[:"exec_sell_cost"]
      @exec_sell_cost = attributes["execSellCost"]
    end
    if self.class.attribute_map[:"exec_qty"]
      @exec_qty = attributes["execQty"]
    end
    if self.class.attribute_map[:"exec_cost"]
      @exec_cost = attributes["execCost"]
    end
    if self.class.attribute_map[:"exec_comm"]
      @exec_comm = attributes["execComm"]
    end
    if self.class.attribute_map[:"current_timestamp"]
      @current_timestamp = attributes["currentTimestamp"]
    end
    if self.class.attribute_map[:"current_buy_qty"]
      @current_buy_qty = attributes["currentBuyQty"]
    end
    if self.class.attribute_map[:"current_buy_cost"]
      @current_buy_cost = attributes["currentBuyCost"]
    end
    if self.class.attribute_map[:"current_sell_qty"]
      @current_sell_qty = attributes["currentSellQty"]
    end
    if self.class.attribute_map[:"current_sell_cost"]
      @current_sell_cost = attributes["currentSellCost"]
    end
    if self.class.attribute_map[:"current_qty"]
      @current_qty = attributes["currentQty"]
    end
    if self.class.attribute_map[:"current_cost"]
      @current_cost = attributes["currentCost"]
    end
    if self.class.attribute_map[:"current_comm"]
      @current_comm = attributes["currentComm"]
    end
    if self.class.attribute_map[:"gross_open_cost"]
      @gross_open_cost = attributes["grossOpenCost"]
    end
    if self.class.attribute_map[:"gross_exec_cost"]
      @gross_exec_cost = attributes["grossExecCost"]
    end
    if self.class.attribute_map[:"last_price"]
      @last_price = attributes["lastPrice"]
    end
    if self.class.attribute_map[:"last_value"]
      @last_value = attributes["lastValue"]
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
    if self.class.attribute_map[:"pnl"]
      @pnl = attributes["pnl"]
    end
    if self.class.attribute_map[:"pnl_pcnt"]
      @pnl_pcnt = attributes["pnlPcnt"]
    end
    if self.class.attribute_map[:"avg_buy_price"]
      @avg_buy_price = attributes["avgBuyPrice"]
    end
    if self.class.attribute_map[:"avg_sell_price"]
      @avg_sell_price = attributes["avgSellPrice"]
    end
    if self.class.attribute_map[:"avg_entry_price"]
      @avg_entry_price = attributes["avgEntryPrice"]
    end
    if self.class.attribute_map[:"break_even_price"]
      @break_even_price = attributes["breakEvenPrice"]
    end
    if self.class.attribute_map[:"margin_call_price"]
      @margin_call_price = attributes["marginCallPrice"]
    end
    if self.class.attribute_map[:"liquidation_price"]
      @liquidation_price = attributes["liquidationPrice"]
    end
    if self.class.attribute_map[:"bankrupt_price"]
      @bankrupt_price = attributes["bankruptPrice"]
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

