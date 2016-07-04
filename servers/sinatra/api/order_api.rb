require 'json'


MyApp.add_route('GET', '/order', {
  "resourcePath" => "/Order",
  "summary" => "Get your orders.",
  "nickname" => "order/get_orders", 
  "responseClass" => "array[Order]", 
  "endpoint" => "/order", 
  "notes" => "To get open orders only, send {\"open\": true} in the filter param.\n\nSee <a href=\"http://www.onixs.biz/fix-dictionary/5.0.SP2/msgType_D_68.html\">the FIX Spec</a> for explanations of these fields.",
  "parameters" => [
    
    {
      "name" => "symbol",
      "description" => "Instrument symbol. Send a bare series (e.g. XBU) to get data for the nearest expiring contract in that series.\n\nYou can also send a timeframe, e.g. `XBU:monthly`. Timeframes are `daily`, `weekly`, `monthly`, `quarterly`, and `biquarterly`.",
      "dataType" => "string",
      "paramType" => "query",
      
      "allowableValues" => "",
      
    },
    
    {
      "name" => "filter",
      "description" => "Generic table filter. Send JSON key/value pairs, such as `{\&quot;key\&quot;: \&quot;value\&quot;}`. You can key on individual fields, and do more advanced querying on timestamps. See the [Timestamp Docs](https://www.bitmex.com/app/restAPI#timestamp-filters) for more details.",
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


MyApp.add_route('PUT', '/order', {
  "resourcePath" => "/Order",
  "summary" => "Amend the quantity or price of an open order.",
  "nickname" => "order/amend", 
  "responseClass" => "Order", 
  "endpoint" => "/order", 
  "notes" => "<p>Send an <code>orderID</code> or <code>clOrdID</code> to identify the order you wish to amend.</p>\n<p>Both order quantity and price can be amended. Only one <code>qty</code> field can be used to amend.</p>\n<p>Use the <code>leavesQty</code> field to specify how much of the order you wish to remain open. This can be useful\nif you want to adjust your position&#39;s delta by a certain amount, regardless of how much of the order has\nalready filled.</p>\n<p>Use the <code>simpleOrderQty</code> and <code>simpleLeavesQty</code> fields to specify order size in Bitcoin, rather than contracts.\nThese fields will round up to the nearest contract.</p>\n<p>Like order placement, amending can be done in bulk. Simply send a request to <code>PUT /api/v1/order/bulk</code> with\na JSON body of the shape: <code>{&quot;orders&quot;: [{...}, {...}]}</code>, each object containing the fields used in this endpoint.</p>",
  "parameters" => [
    
    
    
    
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/order', {
  "resourcePath" => "/Order",
  "summary" => "Create a new order.",
  "nickname" => "order/new", 
  "responseClass" => "Order", 
  "endpoint" => "/order", 
  "notes" => "This endpoint is used for placing orders. Valid order types are Market, Limit, Stop, StopLimit, MarketIfTouched, LimitIfTouched, MarketWithLeftOverAsLimit, and Pegged.\n\nIf no order type is provided, BitMEX will assume 'Limit'.\nBe very careful with 'Market' and 'Stop' orders as you may be filled at an unfavourable price.\n\nYou can submit bulk orders by POSTing an array of orders to `/api/v1/order/bulk`. Send a JSON payload\nwith the shape: `{\"orders\": [{...}, {...}]}`, with each inner object containing the same fields that would be\nsent to this endpoint.\n\nA note on API tools: if you want to keep track of order IDs yourself, set a unique clOrdID per order.\nThis clOrdID will come back as a property on the order and any related executions (including on the WebSocket),\nand can be used to get or cancel the order. Max length is 36 characters.\n\nTo generate a clOrdID, consider setting a prefix, and incrementing a counter or generating a UUID.\nSome UUIDs are longer than 36 characters, so use a url-safe base64 encoding. For example, the prefix `'bmex_mm_'`\nand the UUID `'7fbd6545-bb0c-11e4-a273-6003088a7c04'` creates `'bmex_mm_f71lRbsMEeSic2ADCIp8BA'`.\n\nSee the [BitMEX Reference Market Maker](https://github.com/BitMEX/market-maker/blob/22c75a2b6db63e20212813e9afdb845db1b09b2a/bitmex.py#L152)\nfor an example of how to use and generate clOrdIDs.",
  "parameters" => [
    
    
    
    
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('DELETE', '/order', {
  "resourcePath" => "/Order",
  "summary" => "Cancel order(s). Send multiple order IDs to cancel in bulk.",
  "nickname" => "order/cancel", 
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
  "responseClass" => "inline_response_200_1", 
  "endpoint" => "/order/all", 
  "notes" => "",
  "parameters" => [
    
    
    
    
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('PUT', '/order/bulk', {
  "resourcePath" => "/Order",
  "summary" => "Amend multiple orders.",
  "nickname" => "order/amend_bulk", 
  "responseClass" => "array[Order]", 
  "endpoint" => "/order/bulk", 
  "notes" => "Similar to POST /amend, but with multiple orders. `application/json` only. Ratelimited at 50%.",
  "parameters" => [
    
    
    
    
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/order/bulk', {
  "resourcePath" => "/Order",
  "summary" => "Create multiple new orders.",
  "nickname" => "order/new_bulk", 
  "responseClass" => "array[Order]", 
  "endpoint" => "/order/bulk", 
  "notes" => "This endpoint is used for placing bulk orders. Valid order types are Market, Limit, Stop, StopLimit, MarketIfTouched, LimitIfTouched, MarketWithLeftOverAsLimit, and Pegged.\n\nEach individual order object in the array should have the same properties as an individual POST /order call.\n\nThis endpoint is much faster for getting many orders into the book at once. Because it reduces load on BitMEX\nsystems, this endpoint is ratelimited at `ceil(0.5 * orders)`. Submitting 10 orders via a bulk order call\nwill only count as 5 requests.\n\nFor now, only `application/json` is supported on this endpoint.",
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
  "responseClass" => "inline_response_200_1", 
  "endpoint" => "/order/cancelAllAfter", 
  "notes" => "Useful as a dead-man's switch to ensure your orders are canceled in case of an outage.\nIf called repeatedly, the existing offset will be canceled and a new one will be inserted in its place.\n\nExample usage: call this route at 15s intervals with an offset of 60000 (60s).\nIf this route is not called within 60 seconds, all your orders will be automatically canceled.\n\nThis is also available via [WebSocket](https://www.bitmex.com/app/wsAPI#dead-man-s-switch-auto-cancel-).",
  "parameters" => [
    
    
    
    
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/order/closePosition', {
  "resourcePath" => "/Order",
  "summary" => "Close a position. [Deprecated, use POST /order with execInst: 'Close']",
  "nickname" => "order/close_position", 
  "responseClass" => "Order", 
  "endpoint" => "/order/closePosition", 
  "notes" => "If no `price` is specified, a market order will be submitted to close the whole of your position. + This will also close all other open orders in this symbol.",
  "parameters" => [
    
    
    
    
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

