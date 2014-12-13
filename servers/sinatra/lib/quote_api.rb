require 'json'

MyApp.add_route('get', '/bucketed', {
  "resourcePath" => "/quote",
  "summary" => "Get previous quotes bucketed by seconds.",
  "nickname" => "getBucketed", 
  "responseClass" => "Array[Quote]", 
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
      "description" => "Time interval to bucket by. Available options: ['1m', '5m', '1h', '1d'].",
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
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


