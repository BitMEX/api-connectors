module SwaggerClient
  # 
  class RoleMapping < BaseObject
    attr_accessor :id, :principal_type, :principal_id, :role_id
    # attribute mapping from ruby-style variable name to JSON key
    def self.attribute_map
      {
        
        # 
        :'id' => :'id',
        
        # The principal type, such as user, application, or role
        :'principal_type' => :'principalType',
        
        # 
        :'principal_id' => :'principalId',
        
        # 
        :'role_id' => :'roleId'
        
      }
    end

    # attribute type
    def self.swagger_types
      {
        :'id' => :'Float',
        :'principal_type' => :'String',
        :'principal_id' => :'String',
        :'role_id' => :'Float'
        
      }
    end

    def initialize(attributes = {})
      return if !attributes.is_a?(Hash) || attributes.empty?

      # convert string to symbol for hash key
      attributes = attributes.inject({}){|memo,(k,v)| memo[k.to_sym] = v; memo}

      
      if attributes[:'id']
        self.id = attributes[:'id']
      end
      
      if attributes[:'principalType']
        self.principal_type = attributes[:'principalType']
      end
      
      if attributes[:'principalId']
        self.principal_id = attributes[:'principalId']
      end
      
      if attributes[:'roleId']
        self.role_id = attributes[:'roleId']
      end
      
    end

    def ==(o)
      return true if self.equal?(o)
      self.class == o.class &&
          id == o.id &&
          principal_type == o.principal_type &&
          principal_id == o.principal_id &&
          role_id == o.role_id
    end

    def eql?(o)
      self == o
    end

    def hash
      [id, principal_type, principal_id, role_id].hash
    end
  end
end
