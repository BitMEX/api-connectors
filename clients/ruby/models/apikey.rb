class ApiKey
  attr_accessor :id, :secret, :name, :nonce, :cidr, :constriants, :enabled, :user_id

  # :internal => :external
  def self.attribute_map
    {
      :id => :id,
      :secret => :secret,
      :name => :name,
      :nonce => :nonce,
      :cidr => :cidr,
      :constriants => :constriants,
      :enabled => :enabled,
      :user_id => :userId

    }
  end

  def initialize(attributes = {})
    return if attributes.empty?
    # Morph attribute keys into undescored rubyish style
    if self.class.attribute_map[:"id"]
      @id = attributes["id"]
    end
    if self.class.attribute_map[:"secret"]
      @secret = attributes["secret"]
    end
    if self.class.attribute_map[:"name"]
      @name = attributes["name"]
    end
    if self.class.attribute_map[:"nonce"]
      @nonce = attributes["nonce"]
    end
    if self.class.attribute_map[:"cidr"]
      @cidr = attributes["cidr"]
    end
    if self.class.attribute_map[:"constriants"]
      @constriants = attributes["constriants"]
    end
    if self.class.attribute_map[:"enabled"]
      @enabled = attributes["enabled"]
    end
    if self.class.attribute_map[:"user_id"]
      @user_id = attributes["userId"]
    end
    

  end

  def to_body
    body = {}
    self.class.attribute_map.each_pair do |key, value|
      body[value] = self.send(key) unless self.send(key).nil?
    end
    body
  end
end

