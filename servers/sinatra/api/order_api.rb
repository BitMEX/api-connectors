require 'json'


MyApp.add_route('GET', '/order', {
  "resourcePath" => "/Order",
  "summary" => "Get your orders.",
  "nickname" => "order/get_orders", 
  "responseClass" => "array[Order]", 
  "endpoint" => "/order", 
  "notes" => "To get open orders only, send {\"open\": true} in the filter param.",
  "parameters" => [
    
    {
      "name" => "symbol",
      "description" => "Instrument symbol. Send a bare series (e.g. XBU) to get data for the nearest expiring contract in that series.\n\nYou can also send a timeframe, e.g. &#39;XBU:monthly&#39;. Timeframes are &#39;daily&#39;, &#39;weekly&#39;, &#39;monthly&#39;, &#39;quarterly&#39;, and &#39;biquarterly&#39;.",
      "dataType" => "string",
      "paramType" => "query",
      
      "allowableValues" => "",
      
    },
    
    {
      "name" => "filter",
      "description" => "Generic table filter. Send JSON key/value pairs, such as {\&quot;key\&quot;: \&quot;value\&quot;}. You can key on individual fields, and do more advanced querying on timestamps. See &lt;a href=\&quot;http://localhost:2001/app/restAPI#timestamp-filters\&quot;&gt;http://localhost:2001/app/restAPI#timestamp-filters&lt;/a&gt; for more details.",
      "dataType" => "string",
      "paramType" => "query",
      
      "allowableValues" => "",
      
    },
    
    {
      "name" => "columns",
      "description" => "Array of column names to fetch. If omitted, will return all columns.\n\nNote that this method will always return item keys, even when not specified, so you may receive more columns that you expect.",
      "dataType" => "string",
      "paramType" => "query",
      
      "allowableValues" => "",
      
    },
    
    {
      "name" => "count",
      "description" => "Number of results to fetch.",
      "dataType" => "number",
      "paramType" => "query",
      
      "allowableValues" => "",
      "defaultValue" => "100"
    },
    
    {
      "name" => "start",
      "description" => "Starting point for results.",
      "dataType" => "number",
      "paramType" => "query",
      
      "allowableValues" => "",
      "defaultValue" => "0"
    },
    
    {
      "name" => "reverse",
      "description" => "If true, will sort results newest first.",
      "dataType" => "boolean",
      "paramType" => "query",
      
      "allowableValues" => "",
      "defaultValue" => "false"
    },
    
    {
      "name" => "start_time",
      "description" => "Starting date filter for results.",
      "dataType" => "date",
      "paramType" => "query",
      
      "allowableValues" => "",
      
    },
    
    {
      "name" => "end_time",
      "description" => "Ending date filter for results.",
      "dataType" => "date",
      "paramType" => "query",
      
      "allowableValues" => "",
      
    },
    
    
    
    
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/order', {
  "resourcePath" => "/Order",
  "summary" => "Create a new order.",
  "nickname" => "order/new_order", 
  "responseClass" => "Order", 
  "endpoint" => "/order", 
  "notes" => "This endpoint is used for placing orders. Valid order types are 'Limit' and 'StopLimit'. If none is provided, BitMEX will assume a Limit Order.\n\nA note on API tools: if you want to keep track of order IDs yourself, set a unique clOrdID per order. This ID will come back as a property on the order and any related executions (including on the WebSocket), and can be used to get or cancel the order. Max length is 36 characters.\n\nTo generate a clOrdID, consider setting a prefix, and incrementing a counter or generating a UUID. Some UUIDs are longer than 36 characters, so use a url-safe base64 encoding. For example, the prefix 'bmex_mm_' and the UUID '7fbd6545-bb0c-11e4-a273-6003088a7c04' creates 'bmex_mm_f71lRbsMEeSic2ADCIp8BA'.\n\nSee the BitMEX <a href='https://github.com/BitMEX/market-maker/blob/22c75a2b6db63e20212813e9afdb845db1b09b2a/bitmex.py#L152'>Reference Market Maker</a> for an example of how to use and generate clOrdIDs.",
  "parameters" => [
    
    
    
    
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('DELETE', '/order', {
  "resourcePath" => "/Order",
  "summary" => "Cancel order(s). Send multiple order IDs to cancel in bulk.",
  "nickname" => "order/cancel_order", 
  "responseClass" => "array[Order]", 
  "endpoint" => "/order", 
  "notes" => "Either an orderID or a clOrdID must be provided.",
  "parameters" => [
    
    
    
    
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('DELETE', '/order/all', {
  "resourcePath" => "/Order",
  "summary" => "Cancels all of your orders.",
  "nickname" => "order/cancel_all", 
  "responseClass" => "inline_response_200", 
  "endpoint" => "/order/all", 
  "notes" => "",
  "parameters" => [
    
    
    
    
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/order/cancelAllAfter', {
  "resourcePath" => "/Order",
  "summary" => "Automatically cancel all your orders after a specified timeout.",
  "nickname" => "order/cancel_all_after", 
  "responseClass" => "inline_response_200", 
  "endpoint" => "/order/cancelAllAfter", 
  "notes" => "Useful as a dead-man's switch to ensure your orders are canceled in case of an outage. If called repeatedly, the existing offset will be canceled and a new one will be inserted in its place. <br><br>Example usage: call this route at 15s intervals with an offset of 60000 (60s). If this route is not called within 60 seconds, all your orders will be automatically canceled.<br><br>This is also available via <a href=\"https://www.bitmex.com/app/wsAPI#dead-man-s-switch-auto-cancel-\">WebSocket</a>.",
  "parameters" => [
    
    
    
    
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/order/closePosition', {
  "resourcePath" => "/Order",
  "summary" => "Close a position with a market order.",
  "nickname" => "order/close_position", 
  "responseClass" => "Order", 
  "endpoint" => "/order/closePosition", 
  "notes" => "If no price is specified, a market order will be submitted to close the entirety of your position. Be careful with market orders as you may not be filled at a favorable price.",
  "parameters" => [
    
    
    
    
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/order/liquidations', {
  "resourcePath" => "/Order",
  "summary" => "Get open liquidation orders.",
  "nickname" => "order/get_close_out_orders", 
  "responseClass" => "array[LiquidationOrder]", 
  "endpoint" => "/order/liquidations", 
  "notes" => "",
  "parameters" => [
    
    {
      "name" => "filter",
      "description" => "Filter. For example, send {\&quot;symbol\&quot;: \&quot;XBT24H\&quot;}.",
      "dataType" => "string",
      "paramType" => "query",
      
      "allowableValues" => "",
      
    },
    
    
    
    
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

