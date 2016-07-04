module SwaggerClient
  # 
  class InlineResponse200 < BaseObject
    attr_accessor :success
    # attribute mapping from ruby-style variable name to JSON key
    def self.attribute_map
      {
        
        # 
        :'success' => :'success'
        
      }
    end

    # attribute type
    def self.swagger_types
      {
        :'success' => :'BOOLEAN'
        
      }
    end

    def initialize(attributes = {})
      return if !attributes.is_a?(Hash) || attributes.empty?

      # convert string to symbol for hash key
      attributes = attributes.inject({}){|memo,(k,v)| memo[k.to_sym] = v; memo}

      
      if attributes[:'success']
        self.success = attributes[:'success']
      end
      
    end

    def ==(o)
      return true if self.equal?(o)
      self.class == o.class &&
          success == o.success
    end

    def eql?(o)
      self == o
    end

    def hash
      [success].hash
    end
  end
end
