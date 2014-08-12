class User
  attr_accessor :firstname, :lastname, :username, :email, :email_verified, :phone, :phone_verified, :status, :created, :last_updated, :preferences, :is_employee, :id

  # :internal => :external
  def self.attribute_map
    {
      :firstname => :firstname,
      :lastname => :lastname,
      :username => :username,
      :email => :email,
      :email_verified => :emailVerified,
      :phone => :phone,
      :phone_verified => :phoneVerified,
      :status => :status,
      :created => :created,
      :last_updated => :lastUpdated,
      :preferences => :preferences,
      :is_employee => :isEmployee,
      :id => :id

    }
  end

  def initialize(attributes = {})
    return if attributes.empty?
    # Morph attribute keys into undescored rubyish style
    if self.class.attribute_map[:"firstname"]
      @firstname = attributes["firstname"]
    end
    if self.class.attribute_map[:"lastname"]
      @lastname = attributes["lastname"]
    end
    if self.class.attribute_map[:"username"]
      @username = attributes["username"]
    end
    if self.class.attribute_map[:"email"]
      @email = attributes["email"]
    end
    if self.class.attribute_map[:"email_verified"]
      @email_verified = attributes["emailVerified"]
    end
    if self.class.attribute_map[:"phone"]
      @phone = attributes["phone"]
    end
    if self.class.attribute_map[:"phone_verified"]
      @phone_verified = attributes["phoneVerified"]
    end
    if self.class.attribute_map[:"status"]
      @status = attributes["status"]
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
    if self.class.attribute_map[:"is_employee"]
      @is_employee = attributes["isEmployee"]
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

