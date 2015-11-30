module SwaggerClient
  # 
  class Transaction < BaseObject
    attr_accessor :transact_id, :account, :currency, :transact_type, :amount, :fee, :transact_status, :address, :tx, :text, :transact_time, :timestamp
    # attribute mapping from ruby-style variable name to JSON key
    def self.attribute_map
      {
        
        # 
        :'transact_id' => :'transactID',
        
        # 
        :'account' => :'account',
        
        # 
        :'currency' => :'currency',
        
        # 
        :'transact_type' => :'transactType',
        
        # 
        :'amount' => :'amount',
        
        # 
        :'fee' => :'fee',
        
        # 
        :'transact_status' => :'transactStatus',
        
        # 
        :'address' => :'address',
        
        # 
        :'tx' => :'tx',
        
        # 
        :'text' => :'text',
        
        # 
        :'transact_time' => :'transactTime',
        
        # 
        :'timestamp' => :'timestamp'
        
      }
    end

    # attribute type
    def self.swagger_types
      {
        :'transact_id' => :'String',
        :'account' => :'Float',
        :'currency' => :'String',
        :'transact_type' => :'String',
        :'amount' => :'Float',
        :'fee' => :'Float',
        :'transact_status' => :'String',
        :'address' => :'String',
        :'tx' => :'String',
        :'text' => :'String',
        :'transact_time' => :'Date',
        :'timestamp' => :'Date'
        
      }
    end

    def initialize(attributes = {})
      return if !attributes.is_a?(Hash) || attributes.empty?

      # convert string to symbol for hash key
      attributes = attributes.inject({}){|memo,(k,v)| memo[k.to_sym] = v; memo}

      
      if attributes[:'transactID']
        self.transact_id = attributes[:'transactID']
      end
      
      if attributes[:'account']
        self.account = attributes[:'account']
      end
      
      if attributes[:'currency']
        self.currency = attributes[:'currency']
      end
      
      if attributes[:'transactType']
        self.transact_type = attributes[:'transactType']
      end
      
      if attributes[:'amount']
        self.amount = attributes[:'amount']
      end
      
      if attributes[:'fee']
        self.fee = attributes[:'fee']
      end
      
      if attributes[:'transactStatus']
        self.transact_status = attributes[:'transactStatus']
      end
      
      if attributes[:'address']
        self.address = attributes[:'address']
      end
      
      if attributes[:'tx']
        self.tx = attributes[:'tx']
      end
      
      if attributes[:'text']
        self.text = attributes[:'text']
      end
      
      if attributes[:'transactTime']
        self.transact_time = attributes[:'transactTime']
      end
      
      if attributes[:'timestamp']
        self.timestamp = attributes[:'timestamp']
      end
      
    end

    def ==(o)
      return true if self.equal?(o)
      self.class == o.class &&
          transact_id == o.transact_id &&
          account == o.account &&
          currency == o.currency &&
          transact_type == o.transact_type &&
          amount == o.amount &&
          fee == o.fee &&
          transact_status == o.transact_status &&
          address == o.address &&
          tx == o.tx &&
          text == o.text &&
          transact_time == o.transact_time &&
          timestamp == o.timestamp
    end

    def eql?(o)
      self == o
    end

    def hash
      [transact_id, account, currency, transact_type, amount, fee, transact_status, address, tx, text, transact_time, timestamp].hash
    end
  end
end
