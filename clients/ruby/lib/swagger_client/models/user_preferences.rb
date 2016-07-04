module SwaggerClient
  # 
  class UserPreferences < BaseObject
    attr_accessor :announcements_last_seen, :color_theme, :currency, :debug, :disable_emails, :hide_confirm_dialogs, :hide_connection_modal, :hide_from_leaderboard, :hide_name_from_leaderboard, :hide_notifications, :hide_phone_confirm, :locale, :msgs_seen, :order_book_binning, :order_book_type, :order_controls_plus_minus, :sounds, :strict_ip_check, :strict_timeout, :ticker_group, :ticker_pinned, :trade_layout
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
        :'hide_connection_modal' => :'hideConnectionModal',
        
        # 
        :'hide_from_leaderboard' => :'hideFromLeaderboard',
        
        # 
        :'hide_name_from_leaderboard' => :'hideNameFromLeaderboard',
        
        # 
        :'hide_notifications' => :'hideNotifications',
        
        # 
        :'hide_phone_confirm' => :'hidePhoneConfirm',
        
        # 
        :'locale' => :'locale',
        
        # 
        :'msgs_seen' => :'msgsSeen',
        
        # 
        :'order_book_binning' => :'orderBookBinning',
        
        # 
        :'order_book_type' => :'orderBookType',
        
        # 
        :'order_controls_plus_minus' => :'orderControlsPlusMinus',
        
        # 
        :'sounds' => :'sounds',
        
        # 
        :'strict_ip_check' => :'strictIPCheck',
        
        # 
        :'strict_timeout' => :'strictTimeout',
        
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
        :'hide_connection_modal' => :'BOOLEAN',
        :'hide_from_leaderboard' => :'BOOLEAN',
        :'hide_name_from_leaderboard' => :'BOOLEAN',
        :'hide_notifications' => :'Array<String>',
        :'hide_phone_confirm' => :'BOOLEAN',
        :'locale' => :'String',
        :'msgs_seen' => :'Array<String>',
        :'order_book_binning' => :'Float',
        :'order_book_type' => :'String',
        :'order_controls_plus_minus' => :'BOOLEAN',
        :'sounds' => :'Array<String>',
        :'strict_ip_check' => :'BOOLEAN',
        :'strict_timeout' => :'BOOLEAN',
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
      
      if attributes[:'hideConnectionModal']
        self.hide_connection_modal = attributes[:'hideConnectionModal']
      end
      
      if attributes[:'hideFromLeaderboard']
        self.hide_from_leaderboard = attributes[:'hideFromLeaderboard']
      end
      
      if attributes[:'hideNameFromLeaderboard']
        self.hide_name_from_leaderboard = attributes[:'hideNameFromLeaderboard']
      end
      
      if attributes[:'hideNotifications']
        if (value = attributes[:'hideNotifications']).is_a?(Array)
          self.hide_notifications = value
        end
      end
      
      if attributes[:'hidePhoneConfirm']
        self.hide_phone_confirm = attributes[:'hidePhoneConfirm']
      end
      
      if attributes[:'locale']
        self.locale = attributes[:'locale']
      end
      
      if attributes[:'msgsSeen']
        if (value = attributes[:'msgsSeen']).is_a?(Array)
          self.msgs_seen = value
        end
      end
      
      if attributes[:'orderBookBinning']
        self.order_book_binning = attributes[:'orderBookBinning']
      end
      
      if attributes[:'orderBookType']
        self.order_book_type = attributes[:'orderBookType']
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
      
      if attributes[:'strictTimeout']
        self.strict_timeout = attributes[:'strictTimeout']
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
          hide_connection_modal == o.hide_connection_modal &&
          hide_from_leaderboard == o.hide_from_leaderboard &&
          hide_name_from_leaderboard == o.hide_name_from_leaderboard &&
          hide_notifications == o.hide_notifications &&
          hide_phone_confirm == o.hide_phone_confirm &&
          locale == o.locale &&
          msgs_seen == o.msgs_seen &&
          order_book_binning == o.order_book_binning &&
          order_book_type == o.order_book_type &&
          order_controls_plus_minus == o.order_controls_plus_minus &&
          sounds == o.sounds &&
          strict_ip_check == o.strict_ip_check &&
          strict_timeout == o.strict_timeout &&
          ticker_group == o.ticker_group &&
          ticker_pinned == o.ticker_pinned &&
          trade_layout == o.trade_layout
    end

    def eql?(o)
      self == o
    end

    def hash
      [announcements_last_seen, color_theme, currency, debug, disable_emails, hide_confirm_dialogs, hide_connection_modal, hide_from_leaderboard, hide_name_from_leaderboard, hide_notifications, hide_phone_confirm, locale, msgs_seen, order_book_binning, order_book_type, order_controls_plus_minus, sounds, strict_ip_check, strict_timeout, ticker_group, ticker_pinned, trade_layout].hash
    end
  end
end
