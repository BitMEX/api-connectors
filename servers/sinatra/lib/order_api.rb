require 'json'

MyApp.add_route('post', '/new', {
  "resourcePath" => "/order",
  "summary" => "Create a new order.",
  "nickname" => "order_newOrder", 
  "responseClass" => "order", 
  "endpoint" => "/new", 
  "notes" => "",
  "parameters" => [
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

MyApp.add_route('post', '/cancel', {
  "resourcePath" => "/order",
  "summary" => "Cancel an order.",
  "nickname" => "order_cancelOrder", 
  "responseClass" => "order", 
  "endpoint" => "/cancel", 
  "notes" => "",
  "parameters" => [
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

MyApp.add_route('get', '/myOrders', {
  "resourcePath" => "/order",
  "summary" => "Get your recent orders.",
  "nickname" => "order_myOrders", 
  "responseClass" => "Array[order]", 
  "endpoint" => "/myOrders", 
  "notes" => "",
  "parameters" => [
    {
      "name" => "filter",
      "description" => "Table filter. Filter e.g. by symbol.",
      "dataType" => "object",
      "paramType" => "query",
      "allowMultiple" => false,
      "allowableValues" => "",
      },
    {
      "name" => "columns",
      "description" => "Which columns to fetch.",
      "dataType" => "array[string]",
      "paramType" => "query",
      "allowMultiple" => false,
      "allowableValues" => "",
      },
    {
      "name" => "count",
      "description" => "Number of rows to fetch",
      "dataType" => "double",
      "paramType" => "query",
      "allowMultiple" => false,
      "allowableValues" => "",
      },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

MyApp.add_route('get', '/myOpenOrders', {
  "resourcePath" => "/order",
  "summary" => "Get your open orders.",
  "nickname" => "order_myOpenOrders", 
  "responseClass" => "Array[order]", 
  "endpoint" => "/myOpenOrders", 
  "notes" => "",
  "parameters" => [
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


