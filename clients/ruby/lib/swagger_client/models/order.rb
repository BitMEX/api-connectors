module SwaggerClient
  # 
  class Order < BaseObject
    attr_accessor :order_id, :cl_ord_id, :account, :symbol, :side, :simple_order_qty, :order_qty, :price, :min_qty, :stop_px, :currency, :settl_currency, :ord_type, :time_in_force, :ex_destination, :ord_status, :working_indicator, :ord_rej_reason, :simple_leaves_qty, :leaves_qty, :simple_cum_qty, :cum_qty, :avg_px, :multi_leg_reporting_type, :text, :transact_time, :timestamp
    # attribute mapping from ruby-style variable name to JSON key
    def self.attribute_map
      {
        
        # 
        :'order_id' => :'orderID',
        
        # 
        :'cl_ord_id' => :'clOrdID',
        
        # 
        :'account' => :'account',
        
        # 
        :'symbol' => :'symbol',
        
        # 
        :'side' => :'side',
        
        # 
        :'simple_order_qty' => :'simpleOrderQty',
        
        # 
        :'order_qty' => :'orderQty',
        
        # 
        :'price' => :'price',
        
        # 
        :'min_qty' => :'minQty',
        
        # 
        :'stop_px' => :'stopPx',
        
        # 
        :'currency' => :'currency',
        
        # 
        :'settl_currency' => :'settlCurrency',
        
        # 
        :'ord_type' => :'ordType',
        
        # 
        :'time_in_force' => :'timeInForce',
        
        # 
        :'ex_destination' => :'exDestination',
        
        # 
        :'ord_status' => :'ordStatus',
        
        # 
        :'working_indicator' => :'workingIndicator',
        
        # 
        :'ord_rej_reason' => :'ordRejReason',
        
        # 
        :'simple_leaves_qty' => :'simpleLeavesQty',
        
        # 
        :'leaves_qty' => :'leavesQty',
        
        # 
        :'simple_cum_qty' => :'simpleCumQty',
        
        # 
        :'cum_qty' => :'cumQty',
        
        # 
        :'avg_px' => :'avgPx',
        
        # 
        :'multi_leg_reporting_type' => :'multiLegReportingType',
        
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
        :'order_id' => :'String',
        :'cl_ord_id' => :'String',
        :'account' => :'Float',
        :'symbol' => :'String',
        :'side' => :'String',
        :'simple_order_qty' => :'Float',
        :'order_qty' => :'Float',
        :'price' => :'Float',
        :'min_qty' => :'Float',
        :'stop_px' => :'Float',
        :'currency' => :'String',
        :'settl_currency' => :'String',
        :'ord_type' => :'String',
        :'time_in_force' => :'String',
        :'ex_destination' => :'String',
        :'ord_status' => :'String',
        :'working_indicator' => :'BOOLEAN',
        :'ord_rej_reason' => :'String',
        :'simple_leaves_qty' => :'Float',
        :'leaves_qty' => :'Float',
        :'simple_cum_qty' => :'Float',
        :'cum_qty' => :'Float',
        :'avg_px' => :'Float',
        :'multi_leg_reporting_type' => :'String',
        :'text' => :'String',
        :'transact_time' => :'Date',
        :'timestamp' => :'Date'
        
      }
    end

    def initialize(attributes = {})
      return if !attributes.is_a?(Hash) || attributes.empty?

      # convert string to symbol for hash key
      attributes = attributes.inject({}){|memo,(k,v)| memo[k.to_sym] = v; memo}

      
      if attributes[:'orderID']
        self.order_id = attributes[:'orderID']
      end
      
      if attributes[:'clOrdID']
        self.cl_ord_id = attributes[:'clOrdID']
      end
      
      if attributes[:'account']
        self.account = attributes[:'account']
      end
      
      if attributes[:'symbol']
        self.symbol = attributes[:'symbol']
      end
      
      if attributes[:'side']
        self.side = attributes[:'side']
      end
      
      if attributes[:'simpleOrderQty']
        self.simple_order_qty = attributes[:'simpleOrderQty']
      end
      
      if attributes[:'orderQty']
        self.order_qty = attributes[:'orderQty']
      end
      
      if attributes[:'price']
        self.price = attributes[:'price']
      end
      
      if attributes[:'minQty']
        self.min_qty = attributes[:'minQty']
      end
      
      if attributes[:'stopPx']
        self.stop_px = attributes[:'stopPx']
      end
      
      if attributes[:'currency']
        self.currency = attributes[:'currency']
      end
      
      if attributes[:'settlCurrency']
        self.settl_currency = attributes[:'settlCurrency']
      end
      
      if attributes[:'ordType']
        self.ord_type = attributes[:'ordType']
      end
      
      if attributes[:'timeInForce']
        self.time_in_force = attributes[:'timeInForce']
      end
      
      if attributes[:'exDestination']
        self.ex_destination = attributes[:'exDestination']
      end
      
      if attributes[:'ordStatus']
        self.ord_status = attributes[:'ordStatus']
      end
      
      if attributes[:'workingIndicator']
        self.working_indicator = attributes[:'workingIndicator']
      end
      
      if attributes[:'ordRejReason']
        self.ord_rej_reason = attributes[:'ordRejReason']
      end
      
      if attributes[:'simpleLeavesQty']
        self.simple_leaves_qty = attributes[:'simpleLeavesQty']
      end
      
      if attributes[:'leavesQty']
        self.leaves_qty = attributes[:'leavesQty']
      end
      
      if attributes[:'simpleCumQty']
        self.simple_cum_qty = attributes[:'simpleCumQty']
      end
      
      if attributes[:'cumQty']
        self.cum_qty = attributes[:'cumQty']
      end
      
      if attributes[:'avgPx']
        self.avg_px = attributes[:'avgPx']
      end
      
      if attributes[:'multiLegReportingType']
        self.multi_leg_reporting_type = attributes[:'multiLegReportingType']
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
          order_id == o.order_id &&
          cl_ord_id == o.cl_ord_id &&
          account == o.account &&
          symbol == o.symbol &&
          side == o.side &&
          simple_order_qty == o.simple_order_qty &&
          order_qty == o.order_qty &&
          price == o.price &&
          min_qty == o.min_qty &&
          stop_px == o.stop_px &&
          currency == o.currency &&
          settl_currency == o.settl_currency &&
          ord_type == o.ord_type &&
          time_in_force == o.time_in_force &&
          ex_destination == o.ex_destination &&
          ord_status == o.ord_status &&
          working_indicator == o.working_indicator &&
          ord_rej_reason == o.ord_rej_reason &&
          simple_leaves_qty == o.simple_leaves_qty &&
          leaves_qty == o.leaves_qty &&
          simple_cum_qty == o.simple_cum_qty &&
          cum_qty == o.cum_qty &&
          avg_px == o.avg_px &&
          multi_leg_reporting_type == o.multi_leg_reporting_type &&
          text == o.text &&
          transact_time == o.transact_time &&
          timestamp == o.timestamp
    end

    def eql?(o)
      self == o
    end

    def hash
      [order_id, cl_ord_id, account, symbol, side, simple_order_qty, order_qty, price, min_qty, stop_px, currency, settl_currency, ord_type, time_in_force, ex_destination, ord_status, working_indicator, ord_rej_reason, simple_leaves_qty, leaves_qty, simple_cum_qty, cum_qty, avg_px, multi_leg_reporting_type, text, transact_time, timestamp].hash
    end
  end
end
