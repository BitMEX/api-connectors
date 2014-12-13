class Transaction
  attr_accessor :transact_i_d, :account, :currency, :transact_type, :amount, :transact_status, :address, :tx, :text, :transact_time, :timestamp

  # :internal => :external
  def self.attribute_map
    {
      :transact_i_d => :transactID,
      :account => :account,
      :currency => :currency,
      :transact_type => :transactType,
      :amount => :amount,
      :transact_status => :transactStatus,
      :address => :address,
      :tx => :tx,
      :text => :text,
      :transact_time => :transactTime,
      :timestamp => :timestamp

    }
  end

  def initialize(attributes = {})
    return if attributes.empty?
    # Morph attribute keys into undescored rubyish style
    if self.class.attribute_map[:"transact_i_d"]
      @transact_i_d = attributes["transactID"]
    end
    if self.class.attribute_map[:"account"]
      @account = attributes["account"]
    end
    if self.class.attribute_map[:"currency"]
      @currency = attributes["currency"]
    end
    if self.class.attribute_map[:"transact_type"]
      @transact_type = attributes["transactType"]
    end
    if self.class.attribute_map[:"amount"]
      @amount = attributes["amount"]
    end
    if self.class.attribute_map[:"transact_status"]
      @transact_status = attributes["transactStatus"]
    end
    if self.class.attribute_map[:"address"]
      @address = attributes["address"]
    end
    if self.class.attribute_map[:"tx"]
      @tx = attributes["tx"]
    end
    if self.class.attribute_map[:"text"]
      @text = attributes["text"]
    end
    if self.class.attribute_map[:"transact_time"]
      @transact_time = attributes["transactTime"]
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

