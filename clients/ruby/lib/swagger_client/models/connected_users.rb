module SwaggerClient
  # 
  class ConnectedUsers < BaseObject
    attr_accessor :users, :bots
    # attribute mapping from ruby-style variable name to JSON key
    def self.attribute_map
      {
        
        # 
        :'users' => :'users',
        
        # 
        :'bots' => :'bots'
        
      }
    end

    # attribute type
    def self.swagger_types
      {
        :'users' => :'Float',
        :'bots' => :'Float'
        
      }
    end

    def initialize(attributes = {})
      return if !attributes.is_a?(Hash) || attributes.empty?

      # convert string to symbol for hash key
      attributes = attributes.inject({}){|memo,(k,v)| memo[k.to_sym] = v; memo}

      
      if attributes[:'users']
        self.users = attributes[:'users']
      end
      
      if attributes[:'bots']
        self.bots = attributes[:'bots']
      end
      
    end

    def ==(o)
      return true if self.equal?(o)
      self.class == o.class &&
          users == o.users &&
          bots == o.bots
    end

    def eql?(o)
      self == o
    end

    def hash
      [users, bots].hash
    end
  end
end
