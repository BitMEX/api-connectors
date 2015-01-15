class User
  attr_accessor :id, :firstname, :lastname, :status, :username, :email, :phone, :country_code, :created, :last_updated, :preferences, :role, :_t_f_a_enabled, :affiliate_i_d

  # :internal => :external
  def self.attribute_map
    {
      :id => :id,
      :firstname => :firstname,
      :lastname => :lastname,
      :status => :status,
      :username => :username,
      :email => :email,
      :phone => :phone,
      :country_code => :countryCode,
      :created => :created,
      :last_updated => :lastUpdated,
      :preferences => :preferences,
      :role => :role,
      :_t_f_a_enabled => :TFAEnabled,
      :affiliate_i_d => :affiliateID

    }
  end

  def initialize(attributes = {})
    return if attributes.empty?
    # Morph attribute keys into undescored rubyish style
    if self.class.attribute_map[:"id"]
      @id = attributes["id"]
    end
    if self.class.attribute_map[:"firstname"]
      @firstname = attributes["firstname"]
    end
    if self.class.attribute_map[:"lastname"]
      @lastname = attributes["lastname"]
    end
    if self.class.attribute_map[:"status"]
      @status = attributes["status"]
    end
    if self.class.attribute_map[:"username"]
      @username = attributes["username"]
    end
    if self.class.attribute_map[:"email"]
      @email = attributes["email"]
    end
    if self.class.attribute_map[:"phone"]
      @phone = attributes["phone"]
    end
    if self.class.attribute_map[:"country_code"]
      @country_code = attributes["countryCode"]
    end
    if self.class.attribute_map[:"created"]
      @created = attributes["created"]
    end
    if self.class.attribute_map[:"last_updated"]
      @last_updated = attributes["lastUpdated"]
    end
    if self.class.attribute_map[:"preferences"]
      @preferences = attributes["preferences"]
    end
    if self.class.attribute_map[:"role"]
      @role = attributes["role"]
    end
    if self.class.attribute_map[:"_t_f_a_enabled"]
      @_t_f_a_enabled = attributes["TFAEnabled"]
    end
    if self.class.attribute_map[:"affiliate_i_d"]
      @affiliate_i_d = attributes["affiliateID"]
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

