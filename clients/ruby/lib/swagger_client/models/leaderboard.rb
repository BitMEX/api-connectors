module SwaggerClient
  # 
  class Leaderboard < BaseObject
    attr_accessor :name, :is_real_name, :is_me, :profit
    # attribute mapping from ruby-style variable name to JSON key
    def self.attribute_map
      {
        
        # 
        :'name' => :'name',
        
        # 
        :'is_real_name' => :'isRealName',
        
        # 
        :'is_me' => :'isMe',
        
        # 
        :'profit' => :'profit'
        
      }
    end

    # attribute type
    def self.swagger_types
      {
        :'name' => :'String',
        :'is_real_name' => :'BOOLEAN',
        :'is_me' => :'BOOLEAN',
        :'profit' => :'Float'
        
      }
    end

    def initialize(attributes = {})
      return if !attributes.is_a?(Hash) || attributes.empty?

      # convert string to symbol for hash key
      attributes = attributes.inject({}){|memo,(k,v)| memo[k.to_sym] = v; memo}

      
      if attributes[:'name']
        self.name = attributes[:'name']
      end
      
      if attributes[:'isRealName']
        self.is_real_name = attributes[:'isRealName']
      end
      
      if attributes[:'isMe']
        self.is_me = attributes[:'isMe']
      end
      
      if attributes[:'profit']
        self.profit = attributes[:'profit']
      end
      
    end

    def ==(o)
      return true if self.equal?(o)
      self.class == o.class &&
          name == o.name &&
          is_real_name == o.is_real_name &&
          is_me == o.is_me &&
          profit == o.profit
    end

    def eql?(o)
      self == o
    end

    def hash
      [name, is_real_name, is_me, profit].hash
    end
  end
end
