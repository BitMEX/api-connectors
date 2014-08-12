require "uri"

class OrderBook_api
  basePath = "https://www.bitmex.com/api/v1"
  # apiInvoker = APIInvoker

  def self.escapeString(string)
    URI.encode(string.to_s)
  end

  def self.order_book_get_order_book (symbol,opts={})
    query_param_keys = [:symbol]

    # verify existence of params
    raise "symbol is required" if symbol.nil?
    # set default values and merge with input
    options = {
    :symbol => symbol}.merge(opts)

    #resource path
    path = "/orderBook".sub('{format}','json')

    
    # pull querystring keys from options
    queryopts = options.select do |key,value|
      query_param_keys.include? key
    end
    
    headers = nil
    post_body = nil
    response = Swagger::Request.new(:GET, path, {:params=>queryopts,:headers=>headers, :body=>post_body }).make.body
    response.map {|response|orderBook.new(response)}

  end

end

