module SwaggerClient
  # 
  class Affiliate < BaseObject
    attr_accessor :account, :currency, :prev_payout, :prev_turnover, :prev_comm, :prev_timestamp, :exec_turnover, :exec_comm, :total_referrals, :total_turnover, :total_comm, :payout_pcnt, :pending_payout, :timestamp
    # attribute mapping from ruby-style variable name to JSON key
    def self.attribute_map
      {
        
        # 
        :'account' => :'account',
        
        # 
        :'currency' => :'currency',
        
        # 
        :'prev_payout' => :'prevPayout',
        
        # 
        :'prev_turnover' => :'prevTurnover',
        
        # 
        :'prev_comm' => :'prevComm',
        
        # 
        :'prev_timestamp' => :'prevTimestamp',
        
        # 
        :'exec_turnover' => :'execTurnover',
        
        # 
        :'exec_comm' => :'execComm',
        
        # 
        :'total_referrals' => :'totalReferrals',
        
        # 
        :'total_turnover' => :'totalTurnover',
        
        # 
        :'total_comm' => :'totalComm',
        
        # 
        :'payout_pcnt' => :'payoutPcnt',
        
        # 
        :'pending_payout' => :'pendingPayout',
        
        # 
        :'timestamp' => :'timestamp'
        
      }
    end

    # attribute type
    def self.swagger_types
      {
        :'account' => :'Float',
        :'currency' => :'String',
        :'prev_payout' => :'Float',
        :'prev_turnover' => :'Float',
        :'prev_comm' => :'Float',
        :'prev_timestamp' => :'Date',
        :'exec_turnover' => :'Float',
        :'exec_comm' => :'Float',
        :'total_referrals' => :'Float',
        :'total_turnover' => :'Float',
        :'total_comm' => :'Float',
        :'payout_pcnt' => :'Float',
        :'pending_payout' => :'Float',
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
      
      if attributes[:'currency']
        self.currency = attributes[:'currency']
      end
      
      if attributes[:'prevPayout']
        self.prev_payout = attributes[:'prevPayout']
      end
      
      if attributes[:'prevTurnover']
        self.prev_turnover = attributes[:'prevTurnover']
      end
      
      if attributes[:'prevComm']
        self.prev_comm = attributes[:'prevComm']
      end
      
      if attributes[:'prevTimestamp']
        self.prev_timestamp = attributes[:'prevTimestamp']
      end
      
      if attributes[:'execTurnover']
        self.exec_turnover = attributes[:'execTurnover']
      end
      
      if attributes[:'execComm']
        self.exec_comm = attributes[:'execComm']
      end
      
      if attributes[:'totalReferrals']
        self.total_referrals = attributes[:'totalReferrals']
      end
      
      if attributes[:'totalTurnover']
        self.total_turnover = attributes[:'totalTurnover']
      end
      
      if attributes[:'totalComm']
        self.total_comm = attributes[:'totalComm']
      end
      
      if attributes[:'payoutPcnt']
        self.payout_pcnt = attributes[:'payoutPcnt']
      end
      
      if attributes[:'pendingPayout']
        self.pending_payout = attributes[:'pendingPayout']
      end
      
      if attributes[:'timestamp']
        self.timestamp = attributes[:'timestamp']
      end
      
    end

    def ==(o)
      return true if self.equal?(o)
      self.class == o.class &&
          account == o.account &&
          currency == o.currency &&
          prev_payout == o.prev_payout &&
          prev_turnover == o.prev_turnover &&
          prev_comm == o.prev_comm &&
          prev_timestamp == o.prev_timestamp &&
          exec_turnover == o.exec_turnover &&
          exec_comm == o.exec_comm &&
          total_referrals == o.total_referrals &&
          total_turnover == o.total_turnover &&
          total_comm == o.total_comm &&
          payout_pcnt == o.payout_pcnt &&
          pending_payout == o.pending_payout &&
          timestamp == o.timestamp
    end

    def eql?(o)
      self == o
    end

    def hash
      [account, currency, prev_payout, prev_turnover, prev_comm, prev_timestamp, exec_turnover, exec_comm, total_referrals, total_turnover, total_comm, payout_pcnt, pending_payout, timestamp].hash
    end
  end
end
