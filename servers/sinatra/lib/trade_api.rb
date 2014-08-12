require 'json'

MyApp.add_route('get', '/getBucketed', {
  "resourcePath" => "/trade",
  "summary" => "Get previous trades bucketed by seconds.",
  "nickname" => "trade_getBucketed", 
  "responseClass" => "Array[tradeBin]", 
  "endpoint" => "/getBucketed", 
  "notes" => "",
  "parameters" => [
    {
      "name" => "symbol",
      "description" => "Instrument name.",
      "dataType" => "string",
      "paramType" => "query",
      "allowMultiple" => false,
      "allowableValues" => "",
      },
    {
      "name" => "binSize",
      "description" => "Time interval to bucket by. Available options: ['30s', '5m', '1h', '1d'].",
      "dataType" => "string",
      "paramType" => "query",
      "allowMultiple" => false,
      "allowableValues" => "",
      "defaultValue" => "30s"},
    {
      "name" => "startTime",
      "description" => "Start date.",
      "dataType" => "Date",
      "paramType" => "query",
      "allowMultiple" => false,
      "allowableValues" => "",
      },
    {
      "name" => "endTime",
      "description" => "End Date.",
      "dataType" => "Date",
      "paramType" => "query",
      "allowMultiple" => false,
      "allowableValues" => "",
      },
    {
      "name" => "count",
      "description" => "Number of buckets to fetch",
      "dataType" => "double",
      "paramType" => "query",
      "allowMultiple" => false,
      "allowableValues" => "",
      },
    {
      "name" => "useMillisecondTime",
      "description" => "Return dates in milliseconds (GMT). Useful for charting.",
      "dataType" => "boolean",
      "paramType" => "query",
      "allowMultiple" => false,
      "allowableValues" => "",
      },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

MyApp.add_route('get', '/getByDate', {
  "resourcePath" => "/trade",
  "summary" => "Get trades within two dates.",
  "nickname" => "trade_getByDate", 
  "responseClass" => "Array[trade]", 
  "endpoint" => "/getByDate", 
  "notes" => "",
  "parameters" => [
    {
      "name" => "symbol",
      "description" => "Instrument name.",
      "dataType" => "string",
      "paramType" => "query",
      "allowMultiple" => false,
      "allowableValues" => "",
      },
    {
      "name" => "starttime",
      "description" => "Start date.",
      "dataType" => "Date",
      "paramType" => "query",
      "allowMultiple" => false,
      "allowableValues" => "",
      },
    {
      "name" => "endtime",
      "description" => "End Date.",
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

MyApp.add_route('get', '/getRecent', {
  "resourcePath" => "/trade",
  "summary" => "Get recent trades.",
  "nickname" => "trade_getRecent", 
  "responseClass" => "Array[any]", 
  "endpoint" => "/getRecent", 
  "notes" => "",
  "parameters" => [
    {
      "name" => "symbol",
      "description" => "Instrument name.",
      "dataType" => "string",
      "paramType" => "query",
      "allowMultiple" => false,
      "allowableValues" => "",
      },
    {
      "name" => "count",
      "description" => "Number of trades to fetch",
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


