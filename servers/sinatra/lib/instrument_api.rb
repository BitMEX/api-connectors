require 'json'

MyApp.add_route('get', '/', {
  "resourcePath" => "/instrument",
  "summary" => "Get all listed instruments.",
  "nickname" => "instrument_find", 
  "responseClass" => "Array[instrument]", 
  "endpoint" => "/", 
  "notes" => "",
  "parameters" => [
    {
      "name" => "filter",
      "description" => "Filter defining fields, where, orderBy, offset, and limit",
      "dataType" => "object",
      "paramType" => "query",
      "allowMultiple" => false,
      "allowableValues" => "",
      },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


