require 'json'

MyApp.add_route('get', '/', {
  "resourcePath" => "/schema",
  "summary" => "Get model schemata for data objects returned by this API.",
  "nickname" => "schema_find", 
  "responseClass" => "object", 
  "endpoint" => "/", 
  "notes" => "",
  "parameters" => [
    {
      "name" => "model",
      "description" => "Optional model filter. If omitted, will return all models.",
      "dataType" => "string",
      "paramType" => "query",
      "allowMultiple" => false,
      "allowableValues" => "",
      },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


