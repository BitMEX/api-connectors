module SwaggerClient
  # 
  class AnonymousModel5 < BaseObject
    attr_accessor :scheme, :credential
    # attribute mapping from ruby-style variable name to JSON key
    def self.attribute_map
      {
        
        # See the API docs for the list of supported values.
        :'scheme' => :'scheme',
        
        # Scheme-specific credentials
        :'credential' => :'credential'
        
      }
    end

    # attribute type
    def self.swagger_types
      {
        :'scheme' => :'String',
        :'credential' => :'Object'
        
      }
    end

    def initialize(attributes = {})
      return if !attributes.is_a?(Hash) || attributes.empty?

      # convert string to symbol for hash key
      attributes = attributes.inject({}){|memo,(k,v)| memo[k.to_sym] = v; memo}

      
      if attributes[:'scheme']
        self.scheme = attributes[:'scheme']
      end
      
      if attributes[:'credential']
        self.credential = attributes[:'credential']
      end
      
    end

    def ==(o)
      return true if self.equal?(o)
      self.class == o.class &&
          scheme == o.scheme &&
          credential == o.credential
    end

    def eql?(o)
      self == o
    end

    def hash
      [scheme, credential].hash
    end
  end
end
