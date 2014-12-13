class AccessToken
  attr_accessor :id, :ttl, :created, :user_id

  # :internal => :external
  def self.attribute_map
    {
      :id => :id,
      :ttl => :ttl,
      :created => :created,
      :user_id => :userId

    }
  end

  def initialize(attributes = {})
    return if attributes.empty?
    # Morph attribute keys into undescored rubyish style
    if self.class.attribute_map[:"id"]
      @id = attributes["id"]
    end
    if self.class.attribute_map[:"ttl"]
      @ttl = attributes["ttl"]
    end
    if self.class.attribute_map[:"created"]
      @created = attributes["created"]
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

