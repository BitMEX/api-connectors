require 'json'


MyApp.add_route('GET', '/execution', {
  "resourcePath" => "/Execution",
  "summary" => "Get all raw executions for your account.",
  "nickname" => "execution/get", 
  "responseClass" => "array[Execution]", 
  "endpoint" => "/execution", 
  "notes" => "This returns all raw transactions, which includes order opening and cancelation, and order status changes. It can be quite noisy. More focused information is available at /execution/tradeHistory. You may also use the `filter` param to target your query. Specify an array as a filter value, such as {\"execType\": [\"Settlement\", \"Trade\"]} to filter on multiple values.",
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


MyApp.add_route('GET', '/execution/tradeHistory', {
  "resourcePath" => "/Execution",
  "summary" => "Get all balance-affecting executions. This includes each trade, insurance charge, and settlement.",
  "nickname" => "execution/get_trade_history", 
  "responseClass" => "array[Execution]", 
  "endpoint" => "/execution/tradeHistory", 
  "notes" => "",
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

