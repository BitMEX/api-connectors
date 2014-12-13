class Chat
  attr_accessor :date, :user, :message, :html, :from_bot, :id

  # :internal => :external
  def self.attribute_map
    {
      :date => :date,
      :user => :user,
      :message => :message,
      :html => :html,
      :from_bot => :fromBot,
      :id => :id

    }
  end

  def initialize(attributes = {})
    return if attributes.empty?
    # Morph attribute keys into undescored rubyish style
    if self.class.attribute_map[:"date"]
      @date = attributes["date"]
    end
    if self.class.attribute_map[:"user"]
      @user = attributes["user"]
    end
    if self.class.attribute_map[:"message"]
      @message = attributes["message"]
    end
    if self.class.attribute_map[:"html"]
      @html = attributes["html"]
    end
    if self.class.attribute_map[:"from_bot"]
      @from_bot = attributes["fromBot"]
    end
    if self.class.attribute_map[:"id"]
      @id = attributes["id"]
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

