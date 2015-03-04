require 'json'

MyApp.add_route('get', '/', {
  "resourcePath" => "/order",
  "summary" => "Get your orders.",
  "nickname" => "getOrders", 
  "responseClass" => "Array[Order]", 
  "endpoint" => "/", 
  "notes" => "To get open orders only, send {"open": true} in the filter param.",
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
      "name" => "filter",
      "description" => "Generic table filter. Send JSON key/value pairs, such as {&quot;key&quot;: &quot;value&quot;}.",
      "dataType" => "object",
      "paramType" => "query",
      "allowMultiple" => false,
      "allowableValues" => "",
      },
    {
      "name" => "columns",
      "description" => "Array of column names to fetch. If omitted, will return all columns. Note that this method will always return item keys, even when not specified, so you may receive more columns that you expect.",
      "dataType" => "Array[string]",
      "paramType" => "query",
      "allowMultiple" => false,
      "allowableValues" => "",
      },
    {
      "name" => "count",
      "description" => "Number of results to fetch.",
      "dataType" => "double",
      "paramType" => "query",
      "allowMultiple" => false,
      "allowableValues" => "",
      "defaultValue" => 100},
    {
      "name" => "start",
      "description" => "Starting point for results.",
      "dataType" => "double",
      "paramType" => "query",
      "allowMultiple" => false,
      "allowableValues" => "",
      },
    {
      "name" => "reverse",
      "description" => "If true, will sort results newest first.",
      "dataType" => "boolean",
      "paramType" => "query",
      "allowMultiple" => false,
      "allowableValues" => "",
      },
    {
      "name" => "startTime",
      "description" => "Starting date filter for results.",
      "dataType" => "Date",
      "paramType" => "query",
      "allowMultiple" => false,
      "allowableValues" => "",
      },
    {
      "name" => "endTime",
      "description" => "Ending date filter for results.",
      "dataType" => "Date",
      "paramType" => "query",
      "allowMultiple" => false,
      "allowableValues" => "",
      },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

MyApp.add_route('post', '/', {
  "resourcePath" => "/order",
  "summary" => "Create a new order.",
  "nickname" => "newOrder", 
  "responseClass" => "Order", 
  "endpoint" => "/", 
  "notes" => "If you want to keep track of order IDs yourself, set a unique clOrdID per order. This ID will come back as a property on the order and any related executions (including on the WebSocket), and can be used to get or cancel the order. Max length is 36 characters.

To generate a clOrdID, consider setting a prefix, and incrementing a counter or generating a UUID. Some UUIDs are longer than 36 characters, so use a url-safe base64 encoding. For example, the prefix 'bmex_mm_' and the UUID '7fbd6545-bb0c-11e4-a273-6003088a7c04' creates 'bmex_mm_f71lRbsMEeSic2ADCIp8BA'.

See the BitMEX <a href='https://github.com/BitMEX/market-maker/blob/22c75a2b6db63e20212813e9afdb845db1b09b2a/bitmex.py#L152'>Reference Market Maker</a> for an example of how to use and generate clOrdIDs.",
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

MyApp.add_route('delete', '/all', {
  "resourcePath" => "/order",
  "summary" => "Cancels all of your orders.",
  "nickname" => "cancelAll", 
  "responseClass" => "object", 
  "endpoint" => "/all", 
  "notes" => "",
  "parameters" => [
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


