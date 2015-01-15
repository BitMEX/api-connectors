class Affiliate
  attr_accessor :account, :currency, :prev_payout, :prev_turnover, :prev_comm, :prev_timestamp, :exec_turnover, :exec_comm, :total_referrals, :total_turnover, :total_comm, :payout_pcnt, :pending_payout, :timestamp

  # :internal => :external
  def self.attribute_map
    {
      :account => :account,
      :currency => :currency,
      :prev_payout => :prevPayout,
      :prev_turnover => :prevTurnover,
      :prev_comm => :prevComm,
      :prev_timestamp => :prevTimestamp,
      :exec_turnover => :execTurnover,
      :exec_comm => :execComm,
      :total_referrals => :totalReferrals,
      :total_turnover => :totalTurnover,
      :total_comm => :totalComm,
      :payout_pcnt => :payoutPcnt,
      :pending_payout => :pendingPayout,
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
    if self.class.attribute_map[:"prev_payout"]
      @prev_payout = attributes["prevPayout"]
    end
    if self.class.attribute_map[:"prev_turnover"]
      @prev_turnover = attributes["prevTurnover"]
    end
    if self.class.attribute_map[:"prev_comm"]
      @prev_comm = attributes["prevComm"]
    end
    if self.class.attribute_map[:"prev_timestamp"]
      @prev_timestamp = attributes["prevTimestamp"]
    end
    if self.class.attribute_map[:"exec_turnover"]
      @exec_turnover = attributes["execTurnover"]
    end
    if self.class.attribute_map[:"exec_comm"]
      @exec_comm = attributes["execComm"]
    end
    if self.class.attribute_map[:"total_referrals"]
      @total_referrals = attributes["totalReferrals"]
    end
    if self.class.attribute_map[:"total_turnover"]
      @total_turnover = attributes["totalTurnover"]
    end
    if self.class.attribute_map[:"total_comm"]
      @total_comm = attributes["totalComm"]
    end
    if self.class.attribute_map[:"payout_pcnt"]
      @payout_pcnt = attributes["payoutPcnt"]
    end
    if self.class.attribute_map[:"pending_payout"]
      @pending_payout = attributes["pendingPayout"]
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

