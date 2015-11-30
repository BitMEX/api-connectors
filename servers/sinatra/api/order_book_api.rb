require 'json'


MyApp.add_route('GET', '/orderBook', {
  "resourcePath" => "/OrderBook",
  "summary" => "Get current orderbook.",
  "nickname" => "order_book/get_order_book", 
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
      
    },
    
    
    
    
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

