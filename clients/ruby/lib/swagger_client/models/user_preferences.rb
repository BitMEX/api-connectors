module SwaggerClient
  # 
  class UserPreferences < BaseObject
    attr_accessor :announcements_last_seen, :color_theme, :currency, :debug, :disable_emails, :hide_confirm_dialogs, :hide_notifications, :hide_phone_confirm, :msgs_seen, :order_book_binning, :order_controls_plus_minus, :sounds, :strict_ip_check, :ticker_group, :ticker_pinned, :trade_layout
    # attribute mapping from ruby-style variable name to JSON key
    def self.attribute_map
      {
        
        # 
        :'announcements_last_seen' => :'announcementsLastSeen',
        
        # 
        :'color_theme' => :'colorTheme',
        
        # 
        :'currency' => :'currency',
        
        # 
        :'debug' => :'debug',
        
        # 
        :'disable_emails' => :'disableEmails',
        
        # 
        :'hide_confirm_dialogs' => :'hideConfirmDialogs',
        
        # 
        :'hide_notifications' => :'hideNotifications',
        
        # 
        :'hide_phone_confirm' => :'hidePhoneConfirm',
        
        # 
        :'msgs_seen' => :'msgsSeen',
        
        # 
        :'order_book_binning' => :'orderBookBinning',
        
        # 
        :'order_controls_plus_minus' => :'orderControlsPlusMinus',
        
        # 
        :'sounds' => :'sounds',
        
        # 
        :'strict_ip_check' => :'strictIPCheck',
        
        # 
        :'ticker_group' => :'tickerGroup',
        
        # 
        :'ticker_pinned' => :'tickerPinned',
        
        # 
        :'trade_layout' => :'tradeLayout'
        
      }
    end

    # attribute type
    def self.swagger_types
      {
        :'announcements_last_seen' => :'Date',
        :'color_theme' => :'String',
        :'currency' => :'String',
        :'debug' => :'BOOLEAN',
        :'disable_emails' => :'Array<String>',
        :'hide_confirm_dialogs' => :'Array<String>',
        :'hide_notifications' => :'Array<String>',
        :'hide_phone_confirm' => :'BOOLEAN',
        :'msgs_seen' => :'Array<String>',
        :'order_book_binning' => :'Float',
        :'order_controls_plus_minus' => :'BOOLEAN',
        :'sounds' => :'Array<String>',
        :'strict_ip_check' => :'BOOLEAN',
        :'ticker_group' => :'String',
        :'ticker_pinned' => :'BOOLEAN',
        :'trade_layout' => :'String'
        
      }
    end

    def initialize(attributes = {})
      return if !attributes.is_a?(Hash) || attributes.empty?

      # convert string to symbol for hash key
      attributes = attributes.inject({}){|memo,(k,v)| memo[k.to_sym] = v; memo}

      
      if attributes[:'announcementsLastSeen']
        self.announcements_last_seen = attributes[:'announcementsLastSeen']
      end
      
      if attributes[:'colorTheme']
        self.color_theme = attributes[:'colorTheme']
      end
      
      if attributes[:'currency']
        self.currency = attributes[:'currency']
      end
      
      if attributes[:'debug']
        self.debug = attributes[:'debug']
      end
      
      if attributes[:'disableEmails']
        if (value = attributes[:'disableEmails']).is_a?(Array)
          self.disable_emails = value
        end
      end
      
      if attributes[:'hideConfirmDialogs']
        if (value = attributes[:'hideConfirmDialogs']).is_a?(Array)
          self.hide_confirm_dialogs = value
        end
      end
      
      if attributes[:'hideNotifications']
        if (value = attributes[:'hideNotifications']).is_a?(Array)
          self.hide_notifications = value
        end
      end
      
      if attributes[:'hidePhoneConfirm']
        self.hide_phone_confirm = attributes[:'hidePhoneConfirm']
      end
      
      if attributes[:'msgsSeen']
        if (value = attributes[:'msgsSeen']).is_a?(Array)
          self.msgs_seen = value
        end
      end
      
      if attributes[:'orderBookBinning']
        self.order_book_binning = attributes[:'orderBookBinning']
      end
      
      if attributes[:'orderControlsPlusMinus']
        self.order_controls_plus_minus = attributes[:'orderControlsPlusMinus']
      end
      
      if attributes[:'sounds']
        if (value = attributes[:'sounds']).is_a?(Array)
          self.sounds = value
        end
      end
      
      if attributes[:'strictIPCheck']
        self.strict_ip_check = attributes[:'strictIPCheck']
      end
      
      if attributes[:'tickerGroup']
        self.ticker_group = attributes[:'tickerGroup']
      end
      
      if attributes[:'tickerPinned']
        self.ticker_pinned = attributes[:'tickerPinned']
      end
      
      if attributes[:'tradeLayout']
        self.trade_layout = attributes[:'tradeLayout']
      end
      
    end

    def ==(o)
      return true if self.equal?(o)
      self.class == o.class &&
          announcements_last_seen == o.announcements_last_seen &&
          color_theme == o.color_theme &&
          currency == o.currency &&
          debug == o.debug &&
          disable_emails == o.disable_emails &&
          hide_confirm_dialogs == o.hide_confirm_dialogs &&
          hide_notifications == o.hide_notifications &&
          hide_phone_confirm == o.hide_phone_confirm &&
          msgs_seen == o.msgs_seen &&
          order_book_binning == o.order_book_binning &&
          order_controls_plus_minus == o.order_controls_plus_minus &&
          sounds == o.sounds &&
          strict_ip_check == o.strict_ip_check &&
          ticker_group == o.ticker_group &&
          ticker_pinned == o.ticker_pinned &&
          trade_layout == o.trade_layout
    end

    def eql?(o)
      self == o
    end

    def hash
      [announcements_last_seen, color_theme, currency, debug, disable_emails, hide_confirm_dialogs, hide_notifications, hide_phone_confirm, msgs_seen, order_book_binning, order_controls_plus_minus, sounds, strict_ip_check, ticker_group, ticker_pinned, trade_layout].hash
    end
  end
end
