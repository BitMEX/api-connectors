require 'json'

MyApp.add_route('get', '/bucketed', {
  "resourcePath" => "/quote",
  "summary" => "Get previous quotes in time buckets.",
  "nickname" => "getBucketed", 
  "responseClass" => "Array[Quote]", 
  "endpoint" => "/bucketed", 
  "notes" => "",
  "parameters" => [
    {
      "name" => "binSize",
      "description" => "Time interval to bucket by. Available options: ['30s', '1m', '5m', '1h', '1d'].",
      "dataType" => "string",
      "paramType" => "query",
      "allowMultiple" => false,
      "allowableValues" => "",
      "defaultValue" => "1m"},
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


