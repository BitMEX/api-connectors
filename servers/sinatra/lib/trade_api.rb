require 'json'

MyApp.add_route('get', '/bucketed', {
  "resourcePath" => "/trade",
  "summary" => "Get previous trades bucketed by seconds.",
  "nickname" => "getBucketed", 
  "responseClass" => "Array[TradeBin]", 
  "endpoint" => "/bucketed", 
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
      "description" => "Time interval to bucket by. Available options: ['30s', '1m', '5m', '1h', '1d'].",
      "dataType" => "string",
      "paramType" => "query",
      "allowMultiple" => false,
      "allowableValues" => "",
      "defaultValue" => "1m"},
    {
      "name" => "startTime",
      "description" => "Start date. Expects ISO formatted date strings.",
      "dataType" => "Date",
      "paramType" => "query",
      "allowMultiple" => false,
      "allowableValues" => "",
      },
    {
      "name" => "endTime",
      "description" => "End Date. Expects ISO formatted date strings.",
      "dataType" => "Date",
      "paramType" => "query",
      "allowMultiple" => false,
      "allowableValues" => "",
      },
    {
      "name" => "count",
      "description" => "Number of buckets to fetch.",
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

MyApp.add_route('get', '/byDate', {
  "resourcePath" => "/trade",
  "summary" => "Get trades between two dates.",
  "nickname" => "getByDate", 
  "responseClass" => "Array[Trade]", 
  "endpoint" => "/byDate", 
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
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

MyApp.add_route('get', '/recent', {
  "resourcePath" => "/trade",
  "summary" => "Get recent trades.",
  "nickname" => "getRecent", 
  "responseClass" => "Array[Trade]", 
  "endpoint" => "/recent", 
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
      "defaultValue" => 100},
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


