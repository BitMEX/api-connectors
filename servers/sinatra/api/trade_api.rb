require 'json'


MyApp.add_route('GET', '/trade', {
  "resourcePath" => "/Trade",
  "summary" => "Get Trades.",
  "nickname" => "trade/get", 
  "responseClass" => "array[Trade]", 
  "endpoint" => "/trade", 
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


MyApp.add_route('GET', '/trade/bucketed', {
  "resourcePath" => "/Trade",
  "summary" => "Get previous trades in time buckets.",
  "nickname" => "trade/get_bucketed", 
  "responseClass" => "array[TradeBin]", 
  "endpoint" => "/trade/bucketed", 
  "notes" => "",
  "parameters" => [
    
    {
      "name" => "bin_size",
      "description" => "Time interval to bucket by. Available options: [&#39;1m&#39;, &#39;5m&#39;, &#39;1h&#39;, &#39;1d&#39;].",
      "dataType" => "string",
      "paramType" => "query",
      
      "allowableValues" => "",
      
    },
    
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


MyApp.add_route('GET', '/trade/byDate', {
  "resourcePath" => "/Trade",
  "summary" => "Get trades between two dates. [Deprecated, use GET /trades]",
  "nickname" => "trade/get_by_date", 
  "responseClass" => "array[Trade]", 
  "endpoint" => "/trade/byDate", 
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
      "name" => "start_time",
      "description" => "Start date.",
      "dataType" => "date",
      "paramType" => "query",
      
      "allowableValues" => "",
      
    },
    
    {
      "name" => "end_time",
      "description" => "End Date.",
      "dataType" => "date",
      "paramType" => "query",
      
      "allowableValues" => "",
      
    },
    
    
    
    
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/trade/recent', {
  "resourcePath" => "/Trade",
  "summary" => "Get recent trades. [Deprecated, use GET /trades]",
  "nickname" => "trade/get_recent", 
  "responseClass" => "array[Trade]", 
  "endpoint" => "/trade/recent", 
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
      "name" => "count",
      "description" => "Number of trades to fetch.",
      "dataType" => "number",
      "paramType" => "query",
      
      "allowableValues" => "",
      "defaultValue" => "100"
    },
    
    
    
    
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

