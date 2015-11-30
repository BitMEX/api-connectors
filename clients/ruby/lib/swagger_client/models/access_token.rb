module SwaggerClient
  # 
  class AccessToken < BaseObject
    attr_accessor :id, :ttl, :created, :user_id
    # attribute mapping from ruby-style variable name to JSON key
    def self.attribute_map
      {
        
        # 
        :'id' => :'id',
        
        # time to live in seconds (2 weeks by default)
        :'ttl' => :'ttl',
        
        # 
        :'created' => :'created',
        
        # 
        :'user_id' => :'userId'
        
      }
    end

    # attribute type
    def self.swagger_types
      {
        :'id' => :'String',
        :'ttl' => :'Float',
        :'created' => :'Date',
        :'user_id' => :'Float'
        
      }
    end

    def initialize(attributes = {})
      return if !attributes.is_a?(Hash) || attributes.empty?

      # convert string to symbol for hash key
      attributes = attributes.inject({}){|memo,(k,v)| memo[k.to_sym] = v; memo}

      
      if attributes[:'id']
        self.id = attributes[:'id']
      end
      
      if attributes[:'ttl']
        self.ttl = attributes[:'ttl']
      end
      
      if attributes[:'created']
        self.created = attributes[:'created']
      end
      
      if attributes[:'userId']
        self.user_id = attributes[:'userId']
      end
      
    end

    def ==(o)
      return true if self.equal?(o)
      self.class == o.class &&
          id == o.id &&
          ttl == o.ttl &&
          created == o.created &&
          user_id == o.user_id
    end

    def eql?(o)
      self == o
    end

    def hash
      [id, ttl, created, user_id].hash
    end
  end
end
