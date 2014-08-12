class Leaderboard
  attr_accessor :username, :margin_balance

  # :internal => :external
  def self.attribute_map
    {
      :username => :username,
      :margin_balance => :marginBalance

    }
  end

  def initialize(attributes = {})
    return if attributes.empty?
    # Morph attribute keys into undescored rubyish style
    if self.class.attribute_map[:"username"]
      @username = attributes["username"]
    end
    if self.class.attribute_map[:"margin_balance"]
      @margin_balance = attributes["marginBalance"]
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

