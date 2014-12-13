require 'json'

MyApp.add_route('get', '/', {
  "resourcePath" => "/orderBook",
  "summary" => "Get current orderbook.",
  "nickname" => "getOrderBook", 
  "responseClass" => "Array[OrderBook]", 
  "endpoint" => "/", 
  "notes" => "",
  "parameters" => [
    {
      "name" => "symbol",
      "description" => "",
      "dataType" => "string",
      "paramType" => "query",
      "allowMultiple" => false,
      "allowableValues" => "",
      },
    {
      "name" => "depth",
      "description" => "",
      "dataType" => "double",
      "paramType" => "query",
      "allowMultiple" => false,
      "allowableValues" => "",
      "defaultValue" => 25},
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


