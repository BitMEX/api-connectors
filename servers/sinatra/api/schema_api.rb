require 'json'


MyApp.add_route('GET', '/schema', {
  "resourcePath" => "/Schema",
  "summary" => "Get model schemata for data objects returned by this API.",
  "nickname" => "schema/find", 
  "responseClass" => "inline_response_200", 
  "endpoint" => "/schema", 
  "notes" => "",
  "parameters" => [
    
    {
      "name" => "model",
      "description" => "Optional model filter. If omitted, will return all models.",
      "dataType" => "string",
      "paramType" => "query",
      
      "allowableValues" => "",
      
    },
    
    
    
    
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/schema/websocketHelp', {
  "resourcePath" => "/Schema",
  "summary" => "Returns help text & subject list for websocket usage.",
  "nickname" => "schema/websocket_help", 
  "responseClass" => "inline_response_200", 
  "endpoint" => "/schema/websocketHelp", 
  "notes" => "",
  "parameters" => [
    
    
    
    
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

