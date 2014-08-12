require 'json'

MyApp.add_route('get', '/', {
  "resourcePath" => "/orderBook",
  "summary" => "Get current orderbook.",
  "nickname" => "orderBook_getOrderBook", 
  "responseClass" => "Array[orderBook]", 
  "endpoint" => "/", 
  "notes" => "",
  "parameters" => [
    {
      "name" => "symbol",
      "description" => "",
      "dataType" => "symbol",
      "paramType" => "query",
      "allowMultiple" => false,
      "allowableValues" => "",
      },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


