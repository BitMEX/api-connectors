require 'json'


MyApp.add_route('GET', '/api/v1/orderBook', {
  "resourcePath" => "/OrderBook",
  "summary" => "Get current orderbook [deprecated, use /orderBook/L2].",
  "nickname" => "order_book/get", 
  "responseClass" => "array[OrderBook]", 
  "endpoint" => "/orderBook", 
  "notes" => "",
  "parameters" => [
    {
      "name" => "symbol",
      "description" => "Instrument symbol. Send a series (e.g. XBT) to get data for the nearest contract in that series.",
      "dataType" => "string",
      "paramType" => "query",
      
      "allowableValues" => "",
      
    },
    {
      "name" => "depth",
      "description" => "Orderbook depth.",
      "dataType" => "number",
      "paramType" => "query",
      
      "allowableValues" => "",
      "defaultValue" => "25"
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/v1/orderBook/L2', {
  "resourcePath" => "/OrderBook",
  "summary" => "Get current orderbook in vertical format.",
  "nickname" => "order_book/get_l2", 
  "responseClass" => "array[OrderBookL2]", 
  "endpoint" => "/orderBook/L2", 
  "notes" => "",
  "parameters" => [
    {
      "name" => "symbol",
      "description" => "Instrument symbol. Send a series (e.g. XBT) to get data for the nearest contract in that series.",
      "dataType" => "string",
      "paramType" => "query",
      
      "allowableValues" => "",
      
    },
    {
      "name" => "depth",
      "description" => "Orderbook depth per side. Send 0 for full depth.",
      "dataType" => "number",
      "paramType" => "query",
      
      "allowableValues" => "",
      "defaultValue" => "25"
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

