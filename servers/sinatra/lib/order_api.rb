require 'json'

MyApp.add_route('post', '/new', {
  "resourcePath" => "/order",
  "summary" => "Create a new order. [Deprecated]",
  "nickname" => "newOrder", 
  "responseClass" => "Order", 
  "endpoint" => "/new", 
  "notes" => "",
  "parameters" => [
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

MyApp.add_route('post', '/', {
  "resourcePath" => "/order",
  "summary" => "Create a new order.",
  "nickname" => "newOrder_order_api_0", 
  "responseClass" => "Order", 
  "endpoint" => "/", 
  "notes" => "If you want to keep track of order IDs yourself, set a unique clOrdID per order. This ID will come back as a property on the order and any related executions executions (including on the WebSocket), and can be used to cancel the order.",
  "parameters" => [
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

MyApp.add_route('delete', '/', {
  "resourcePath" => "/order",
  "summary" => "Cancel order(s). Send multiple order IDs to cancel in bulk.",
  "nickname" => "cancelOrder", 
  "responseClass" => "Array[Order]", 
  "endpoint" => "/", 
  "notes" => "Either an orderID or a clOrdID must be provided.",
  "parameters" => [
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

MyApp.add_route('get', '/', {
  "resourcePath" => "/order",
  "summary" => "Get your orders.",
  "nickname" => "getOrders", 
  "responseClass" => "Array[Order]", 
  "endpoint" => "/", 
  "notes" => "",
  "parameters" => [
    {
      "name" => "filter",
      "description" => "Filter. For example, send {&quot;symbol&quot;: &quot;XBTF15&quot;, &quot;open&quot;: true}.",
      "dataType" => "object",
      "paramType" => "query",
      "allowMultiple" => false,
      "allowableValues" => "",
      },
    {
      "name" => "columns",
      "description" => "Which columns to fetch. For example, send [&quot;columnName&quot;].",
      "dataType" => "Array[any]",
      "paramType" => "query",
      "allowMultiple" => false,
      "allowableValues" => "",
      },
    {
      "name" => "count",
      "description" => "Number of rows to fetch.",
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

MyApp.add_route('post', '/cancel', {
  "resourcePath" => "/order",
  "summary" => "Cancel order(s). Send multiple order IDs to cancel in bulk. [Deprecated]",
  "nickname" => "cancelOrder_order_api_0", 
  "responseClass" => "Array[Order]", 
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
  "summary" => "Get your orders. [Deprecated, use GET /order]",
  "nickname" => "getOrders_order_api_0", 
  "responseClass" => "Array[Order]", 
  "endpoint" => "/myOrders", 
  "notes" => "",
  "parameters" => [
    {
      "name" => "filter",
      "description" => "Filter. For example, send {&quot;symbol&quot;: &quot;XBTF15&quot;, &quot;open&quot;: true}.",
      "dataType" => "object",
      "paramType" => "query",
      "allowMultiple" => false,
      "allowableValues" => "",
      },
    {
      "name" => "columns",
      "description" => "Which columns to fetch. For example, send [&quot;columnName&quot;].",
      "dataType" => "Array[any]",
      "paramType" => "query",
      "allowMultiple" => false,
      "allowableValues" => "",
      },
    {
      "name" => "count",
      "description" => "Number of rows to fetch.",
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
  "nickname" => "getOrders_order_api_1", 
  "responseClass" => "Array[Order]", 
  "endpoint" => "/myOpenOrders", 
  "notes" => "",
  "parameters" => [
    {
      "name" => "filter",
      "description" => "Filter. For example, send {&quot;symbol&quot;: &quot;XBTF15&quot;, &quot;open&quot;: true}.",
      "dataType" => "object",
      "paramType" => "query",
      "allowMultiple" => false,
      "allowableValues" => "",
      },
    {
      "name" => "columns",
      "description" => "Which columns to fetch. For example, send [&quot;columnName&quot;].",
      "dataType" => "Array[any]",
      "paramType" => "query",
      "allowMultiple" => false,
      "allowableValues" => "",
      },
    {
      "name" => "count",
      "description" => "Number of rows to fetch.",
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

MyApp.add_route('post', '/cancelAllAfter', {
  "resourcePath" => "/order",
  "summary" => "Automatically cancel all your orders after a specified timeout.",
  "nickname" => "cancelAllAfter", 
  "responseClass" => "object", 
  "endpoint" => "/cancelAllAfter", 
  "notes" => "Useful as a dead-man's switch to ensure your orders are canceled in case of an outage. If called repeatedly, the existing offset will be canceled and a new one will be inserted in its place. <br><br>Example usage: call this route at 15s intervals with an offset of 60000 (60s). If this route is not called within 60 seconds, all your orders will be automatically canceled.<br><br>This is also available via <a href="https://www.bitmex.com/app/wsAPI#dead-man-s-switch-auto-cancel-">WebSocket</a>.",
  "parameters" => [
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


