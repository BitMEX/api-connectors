module SwaggerClient
  # 
  class InstrumentInterval < BaseObject
    attr_accessor :intervals, :symbols
    # attribute mapping from ruby-style variable name to JSON key
    def self.attribute_map
      {
        
        # 
        :'intervals' => :'intervals',
        
        # 
        :'symbols' => :'symbols'
        
      }
    end

    # attribute type
    def self.swagger_types
      {
        :'intervals' => :'Array<String>',
        :'symbols' => :'Array<String>'
        
      }
    end

    def initialize(attributes = {})
      return if !attributes.is_a?(Hash) || attributes.empty?

      # convert string to symbol for hash key
      attributes = attributes.inject({}){|memo,(k,v)| memo[k.to_sym] = v; memo}

      
      if attributes[:'intervals']
        if (value = attributes[:'intervals']).is_a?(Array)
          self.intervals = value
        end
      end
      
      if attributes[:'symbols']
        if (value = attributes[:'symbols']).is_a?(Array)
          self.symbols = value
        end
      end
      
    end

    def ==(o)
      return true if self.equal?(o)
      self.class == o.class &&
          intervals == o.intervals &&
          symbols == o.symbols
    end

    def eql?(o)
      self == o
    end

    def hash
      [intervals, symbols].hash
    end
  end
end
