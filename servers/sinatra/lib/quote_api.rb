require 'json'

MyApp.add_route('get', '/getBucketed', {
  "resourcePath" => "/quote",
  "summary" => "Get previous quotes bucketed by seconds.",
  "nickname" => "quote_getBucketed", 
  "responseClass" => "Array[quote]", 
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
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


