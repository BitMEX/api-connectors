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
      "description" => "Instrument symbol. Send a series (e.g. XBT) to get data for the nearest contract in that series.",
      "dataType" => "string",
      "paramType" => "query",
      "allowMultiple" => false,
      "allowableValues" => "",
      },
    {
      "name" => "depth",
      "description" => "Orderbook depth.",
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


