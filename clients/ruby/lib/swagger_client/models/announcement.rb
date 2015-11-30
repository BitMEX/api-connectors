module SwaggerClient
  # 
  class Announcement < BaseObject
    attr_accessor :id, :link, :title, :content, :date
    # attribute mapping from ruby-style variable name to JSON key
    def self.attribute_map
      {
        
        # 
        :'id' => :'id',
        
        # 
        :'link' => :'link',
        
        # 
        :'title' => :'title',
        
        # 
        :'content' => :'content',
        
        # 
        :'date' => :'date'
        
      }
    end

    # attribute type
    def self.swagger_types
      {
        :'id' => :'Float',
        :'link' => :'String',
        :'title' => :'String',
        :'content' => :'String',
        :'date' => :'Date'
        
      }
    end

    def initialize(attributes = {})
      return if !attributes.is_a?(Hash) || attributes.empty?

      # convert string to symbol for hash key
      attributes = attributes.inject({}){|memo,(k,v)| memo[k.to_sym] = v; memo}

      
      if attributes[:'id']
        self.id = attributes[:'id']
      end
      
      if attributes[:'link']
        self.link = attributes[:'link']
      end
      
      if attributes[:'title']
        self.title = attributes[:'title']
      end
      
      if attributes[:'content']
        self.content = attributes[:'content']
      end
      
      if attributes[:'date']
        self.date = attributes[:'date']
      end
      
    end

    def ==(o)
      return true if self.equal?(o)
      self.class == o.class &&
          id == o.id &&
          link == o.link &&
          title == o.title &&
          content == o.content &&
          date == o.date
    end

    def eql?(o)
      self == o
    end

    def hash
      [id, link, title, content, date].hash
    end
  end
end
