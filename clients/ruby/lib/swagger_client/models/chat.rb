module SwaggerClient
  # 
  class Chat < BaseObject
    attr_accessor :id, :date, :user, :message, :html, :from_bot
    # attribute mapping from ruby-style variable name to JSON key
    def self.attribute_map
      {
        
        # 
        :'id' => :'id',
        
        # 
        :'date' => :'date',
        
        # 
        :'user' => :'user',
        
        # 
        :'message' => :'message',
        
        # 
        :'html' => :'html',
        
        # 
        :'from_bot' => :'fromBot'
        
      }
    end

    # attribute type
    def self.swagger_types
      {
        :'id' => :'Float',
        :'date' => :'Date',
        :'user' => :'String',
        :'message' => :'String',
        :'html' => :'String',
        :'from_bot' => :'BOOLEAN'
        
      }
    end

    def initialize(attributes = {})
      return if !attributes.is_a?(Hash) || attributes.empty?

      # convert string to symbol for hash key
      attributes = attributes.inject({}){|memo,(k,v)| memo[k.to_sym] = v; memo}

      
      if attributes[:'id']
        self.id = attributes[:'id']
      end
      
      if attributes[:'date']
        self.date = attributes[:'date']
      end
      
      if attributes[:'user']
        self.user = attributes[:'user']
      end
      
      if attributes[:'message']
        self.message = attributes[:'message']
      end
      
      if attributes[:'html']
        self.html = attributes[:'html']
      end
      
      if attributes[:'fromBot']
        self.from_bot = attributes[:'fromBot']
      end
      
    end

    def ==(o)
      return true if self.equal?(o)
      self.class == o.class &&
          id == o.id &&
          date == o.date &&
          user == o.user &&
          message == o.message &&
          html == o.html &&
          from_bot == o.from_bot
    end

    def eql?(o)
      self == o
    end

    def hash
      [id, date, user, message, html, from_bot].hash
    end
  end
end
