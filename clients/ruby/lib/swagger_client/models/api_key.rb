module SwaggerClient
  # 
  class ApiKey < BaseObject
    attr_accessor :id, :secret, :name, :nonce, :cidr, :permissions, :enabled, :user_id, :created
    # attribute mapping from ruby-style variable name to JSON key
    def self.attribute_map
      {
        
        # 
        :'id' => :'id',
        
        # 
        :'secret' => :'secret',
        
        # 
        :'name' => :'name',
        
        # 
        :'nonce' => :'nonce',
        
        # 
        :'cidr' => :'cidr',
        
        # 
        :'permissions' => :'permissions',
        
        # 
        :'enabled' => :'enabled',
        
        # 
        :'user_id' => :'userId',
        
        # 
        :'created' => :'created'
        
      }
    end

    # attribute type
    def self.swagger_types
      {
        :'id' => :'String',
        :'secret' => :'String',
        :'name' => :'String',
        :'nonce' => :'Float',
        :'cidr' => :'String',
        :'permissions' => :'Array<String>',
        :'enabled' => :'BOOLEAN',
        :'user_id' => :'Float',
        :'created' => :'Date'
        
      }
    end

    def initialize(attributes = {})
      return if !attributes.is_a?(Hash) || attributes.empty?

      # convert string to symbol for hash key
      attributes = attributes.inject({}){|memo,(k,v)| memo[k.to_sym] = v; memo}

      
      if attributes[:'id']
        self.id = attributes[:'id']
      end
      
      if attributes[:'secret']
        self.secret = attributes[:'secret']
      end
      
      if attributes[:'name']
        self.name = attributes[:'name']
      end
      
      if attributes[:'nonce']
        self.nonce = attributes[:'nonce']
      end
      
      if attributes[:'cidr']
        self.cidr = attributes[:'cidr']
      end
      
      if attributes[:'permissions']
        if (value = attributes[:'permissions']).is_a?(Array)
          self.permissions = value
        end
      end
      
      if attributes[:'enabled']
        self.enabled = attributes[:'enabled']
      end
      
      if attributes[:'userId']
        self.user_id = attributes[:'userId']
      end
      
      if attributes[:'created']
        self.created = attributes[:'created']
      end
      
    end

    def ==(o)
      return true if self.equal?(o)
      self.class == o.class &&
          id == o.id &&
          secret == o.secret &&
          name == o.name &&
          nonce == o.nonce &&
          cidr == o.cidr &&
          permissions == o.permissions &&
          enabled == o.enabled &&
          user_id == o.user_id &&
          created == o.created
    end

    def eql?(o)
      self == o
    end

    def hash
      [id, secret, name, nonce, cidr, permissions, enabled, user_id, created].hash
    end
  end
end
